@echo off
setlocal enabledelayedexpansion
pushd "%temp%"
makecab /D RptFileName=~.rpt /D InfFileName=~.inf /f nul >nul
for /f "tokens=3-7" %a in ('find /i "makecab"^<~.rpt') do (
set "current-date=%e-%b-%c"
set "current-time=%d"
)
del ~.*
popd

set inicio=%current-date%_%current-time%
set data=%current-date%

set "Dir=C:\Program Files\PostgreSQL\15\data\railwise\backup"
set "Winrar=C:\Program Files\WinRAR.exe"
set "ErrorLog=%Dir%\error.log"
set "PGUser=backup_user"
set "PGPassword=_railwise_backup"
set "PGPort=5432"

net stop postgresql

cd C:\Program Files\PostgreSQL\15\data\base
mkdir railwise_bkp_%data%

cd C:\Program Files\PostgreSQL\15\data\base\43568
winrar a -afzip backup_%data%.zip * -ep

move ./backup_%data%.zip ../railwise_bkp_%data%/backup_%data%.zip

net start postgresql


for /f "usebackq tokens=*" %%i in ("%Dir%\DBs.backup") do (
    set "Databases=!Databases! %%i"
)

if not exist "%Dir%\DBs.backup" (
    echo ERROR: Database configuration file not found: 'DBs.backup'
    exit /b 1
)

cd /d %Dir%
for %%d in (%Databases%) do (
    echo >>> Dumping database %%d
    "C:\Program Files\PostgreSQL\15\bin\pg_dump.exe" -p %PGPort% -U %PGUser% -F c -b -f ".\db%Database.bkp" %%d 2>> %ErrorLog%
    if !errorlevel! neq 0 (
        echo ERROR generating dump for database %%d
        exit /b 1
    )

    echo >>> Compressing dump for database %%d
    %Winrar% a -m5 -r "db%date:~2,2%%date:~4,2%%date:~6,2%%time:~0,2%%time:~3,2%%time:~6,2%.rar" ".\db%Database.bkp" 2>> %ErrorLog%
    if !errorlevel! neq 0 (
        echo ERROR compressing dump for database %%d
        exit /b 1
    )
)

:: Remove backup files and keep compressed files
del /q *.bkp

:: Clean old files, keeping the last 5 days
forfiles /p %Dir% /m *.tgz /d -5 /c "cmd /c del @path"

@echo off
pushd "%temp%"
makecab /D RptFileName=~.rpt /D InfFileName=~.inf /f nul >nul
for /f "tokens=3-7" %a in ('find /i "makecab"^<~.rpt') do (
set "current-date=%e-%b-%c"
set "current-time=%d"
)
del ~.*
popd

echo Rotina iniciou em: %inicio%
echo Rotina terminou em: %current-date%_%current-time%