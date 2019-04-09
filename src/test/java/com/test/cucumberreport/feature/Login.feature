@Login 
Feature: Login no sistema xpto 

@RealizarLogin 
Scenario: Validar Login com usuario x no sistema xpto 
	Given que tenha um usuario e senha 
	When realizar o login com o <usuario> e <senha> 
		|usuario|senha|
		|x	|y|
	Then sera realizado o acesso a pagina inicial do sistema xpto