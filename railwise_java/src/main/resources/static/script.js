
function exibirRelatorios() {
	const secaoRelatorios = document.getElementById('relatorios');
	const secaoApresentacao = document.getElementById('apresentacao');
	const btnExibir = document.getElementById('btExibir');

	secaoApresentacao.hidden = !secaoApresentacao.hidden;
	secaoRelatorios.hidden = !secaoRelatorios.hidden;
	btnExibir.textContent = secaoApresentacao.hidden ? "Apresentação" : "Relatórios";
}

function limparDadosRelatorio() {
	$("#tabelaresultados > tbody > tr").remove();
}

function relatorio1() {
	$.ajax({
		method: "GET",
		url: "relatorio/1",
		success:
			function(response) {
				$("#tabelaresultados > tbody > tr").remove();
				for (var i = 0; i < response.length; i++) {
					$('#tabelaresultados > tbody').append('<tr id="' + response[i].id + '">' +
						'<td>' + response[i].id + '</td>' +
						'<td>' + response[i].modelo + '</td>' +
						'<td>' + response[i].capacidade_CARGA + ' KG</td>' +
						'<td>' + response[i].ano_FABRICACAO + '</td></tr>'
					)
				}
			}
	}).fail(function(xhr, status, errorThrown) {
		alert("Erro ao buscar relatório 1: " + xhr.responseText);
	});
}

function relatorio2() {
	$.ajax({
		method: "GET",
		url: "relatorio/2",
		success:
			function(response) {
				$("#tabelaresultados > tbody > tr").remove();
				for (var i = 0; i < response.length; i++) {

					const saida = new Date(response[i].saida);
					const chegada = new Date(response[i].chegada);

					$('#tabelaresultados > tbody').append('<tr>' +
						'<td>' + response[i].origem + '</td>' +
						'<td>' + response[i].destino + '</td>' +
						'<td>' + `${saida.getDate().toString().padStart(2, '0')}/${saida.getUTCMonth().toString().padStart(2, '0')}/${saida.getFullYear()} ${saida.getHours().toString().padStart(2, '0')}:${saida.getMinutes().toString().padStart(2, '0')}` + '</td>' +
						'<td>' + `${chegada.getDate().toString().padStart(2, '0')}/${chegada.getUTCMonth().toString().padStart(2, '0')}/${chegada.getFullYear()} ${chegada.getHours().toString().padStart(2, '0')}:${chegada.getMinutes().toString().padStart(2, '0')}` + '</td></tr>'
					)
				}
			}
	}).fail(function(xhr, status, errorThrown) {
		alert("Erro ao buscar relatório 2: " + xhr.responseText);
	});
}

function relatorio3() {
	$.ajax({
		method: "GET",
		url: "relatorio/3",
		success:
			function(response) {
				$("#tabelaresultados > tbody > tr").remove();
				for (var i = 0; i < response.length; i++) {
					$('#tabelaresultados > tbody').append('<tr>' +
						'<td>' + response[i].quantidade_CARGAS + '</td>' +
						'<td>' + response[i].destino + '</td></tr>'
					)
				}
			}
	}).fail(function(xhr, status, errorThrown) {
		alert("Erro ao buscar relatório 2: " + xhr.responseText);
	});
}

function relatorio4() {
	$.ajax({
		method: "GET",
		url: "relatorio/4",
		success:
			function(response) {
				$("#tabelaresultados > tbody > tr").remove();
				for (var i = 0; i < response.length; i++) {
					$('#tabelaresultados > tbody').append('<tr>' +
						'<td>' + response[i].viagem + '</td>' +
						'<td>' + response[i].carga_TOTAL + ' KG</td>' +
						'<td>R$ ' + response[i].valor_TOTAL + '</td>' +
						'<td>' + response[i].data_VIAGEM + '</td></tr>'
					)
				}
			}
	}).fail(function(xhr, status, errorThrown) {
		alert("Erro ao buscar relatório 2: " + xhr.responseText);
	});
}
