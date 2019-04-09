package com.test.cucumberreport.dao;

import java.util.Random;

import com.test.cucumberreport.model.Cliente;

public class ClienteDAO {
	private Random random;
	
	public ClienteDAO() {
		random = new Random();
	}
	
	public void consultar(Cliente cliente){
		if(random.nextInt(30) >= 25){
			throw new RuntimeException("Falha ao Consultar o Cliente");
		}
	}

	public void incluir(Cliente cliente){
		if(random.nextInt(30) >= 25){
			throw new RuntimeException("Falha ao incluir o Cliente");
		}
			
	}
	
	public void atualizar(Cliente cliente){
		if(random.nextInt(30) >= 25){
			throw new RuntimeException("Falha ao atualizar o Cliente");
		}
	}
	
	public void excluir(Cliente cliente){
		if(random.nextInt(30) >= 25){
			throw new RuntimeException("Falha ao excluir o Cliente");
		}
	}
}
