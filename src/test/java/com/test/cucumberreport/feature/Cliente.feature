@CadastroCliente
Feature: Funcionalidade do Cadastro de Cliente

  @Consultar
  Scenario: Consultar um cliente cadastrado
    Given que eu tenha o cliente
    When realizar a consulta no banco de dados
    Then sera apresentado a mensagem
      | mensagem |
      |          |

  @Incluir
  Scenario: Incluir um cliente cadastrado
    Given que eu tenha o cliente
    When realizar a Inclusao no banco de dados
    Then sera apresentado a mensagem
      | mensagem |
      |          |

  @Atualizar
  Scenario: Atualizar um cliente cadastrado
    Given que eu tenha o cliente
    When realizar a atualizacao no banco de dados
    Then sera apresentado a mensagem
      | mensagem |
      |          |

  @Excluir
  Scenario: Excluir um cliente cadastrado
    Given que eu tenha o cliente
    When realizar a exclusao no banco de dados
    Then sera apresentado a mensagem
      | mensagem |
      |          |
