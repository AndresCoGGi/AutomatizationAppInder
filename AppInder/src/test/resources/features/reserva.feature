# language: es
Característica: Reservar Escenario Deportivo
  Yo como usuario
  Necesito realizar una reserva de escenario
  Para divertirme

  @reserva_exitosa
  Escenario: Reserva exitosa
    Dado que el usuario inicia la sesion
      | tipo_documento | Tarjeta de Identidad |
      | user           | 1000207300           |
      | password       | nacional             |
    Cuando el ingresa los datos de la reserva 23-diciembre 2019 dia Lunes
    Entonces el podra ver un mensaje de ¡Felicitaciones!