# language: es
Característica: Reservar Escenario Deportivo
  Yo como usuario
  Necesito realizar una reserva de escenario
  Para divertirme

  @reserva_exitosa
  Escenario: Reserva exitosa
    Dado que el usuario inicia la sesion
      | user     | 29370322 |
      | password | 202090an |
    Cuando el ingresa los datos de la reserva 12-diciembre 2019 dia Jueves
    Entonces el podra ver un mensaje de Felicitaciones