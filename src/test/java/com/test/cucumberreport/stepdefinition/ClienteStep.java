package com.test.cucumberreport.stepdefinition;

import org.junit.runner.RunWith;

import com.test.cucumberreport.dao.ClienteDAO;
import com.test.cucumberreport.model.Cliente;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

public class ClienteStep {
	private Cliente cliente;
	private ClienteDAO clienteDAO;
	private String msg;

	public ClienteStep() {
		msg = new String();
	}

	@Given("^que eu tenha o cliente$")
	public void que_eu_tenha_o_cliente() throws Throwable {
		cliente = new Cliente();
		cliente.setId(1L);
		cliente.setNome("Teste");
	}

	@When("^realizar a consulta no banco de dados$")
	public void realizar_a_consulta_no_banco_de_dados() throws Throwable {
		clienteDAO = new ClienteDAO();
		clienteDAO.consultar(cliente);
		msg = "";
	}

	@When("^realizar a Inclusao no banco de dados$")
	public void realizar_a_Inclusao_no_banco_de_dados() throws Throwable {
		clienteDAO = new ClienteDAO();
		clienteDAO.incluir(cliente);
		msg = "";
	}

	@When("^realizar a atualizacao no banco de dados$")
	public void realizar_a_atualizacao_no_banco_de_dados() throws Throwable {
		clienteDAO = new ClienteDAO();
		clienteDAO.atualizar(cliente);
		msg = "";
	}

	@When("^realizar a exclusao no banco de dados$")
	public void realizar_a_exclusao_no_banco_de_dados() throws Throwable {
		clienteDAO = new ClienteDAO();
		clienteDAO.excluir(cliente);
		msg = "";
	}

	@Then("^sera apresentado a mensagem$")
	public void sera_apresentado_a_mensagem(DataTable arg1) throws Throwable {

	}

}
