@Login
Feature: Inicio de sesion
  Yo como usuario
  Necesito autenticarme en Simon Inder
  Para realizar los tramites del inder

  @inicio_sesion_exitoso
  Scenario: Iniciar sesion exitoso
    Given el usuario se encuentra en la pagina principal del inder
    When  el ingresa los datos de autenticacion
    Then el iniciara sesion exitosamente
