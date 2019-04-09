package com.test.cucumberreport.stepdefinition;

import java.util.Random;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStep {
	
	@Given("^que tenha um usuario e senha$")
	public void que_tenha_um_usuario_e_senha() throws Throwable {
	   sort("Falha ao tenetar opter um usuario ou senha");
	}

	@When("^realizar o login com o <usuario> e <senha>$")
	public void realizar_o_login_com_o_usuario_e_senha(DataTable arg1) throws Throwable {
		sort("Falha ao relaizar o login");
	}

	@Then("^sera realizado o acesso a pagina inicial do sistema xpto$")
	public void sera_realizado_o_acesso_a_pagina_inicial_do_sistema_xpto() throws Throwable {
		sort("Falha ao acessar a pagina principal.");
	}
	
	public void sort(String msg) {
		if(new Random().nextInt(30) >= 25){
			throw new RuntimeException(msg);
		}
	}
}
