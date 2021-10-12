# language: es
Característica: Reservar Escenario Deportivo
  Yo como usuario
  Necesito realizar una reserva de escenario
  Para divertirme

  @reserva_santiago
  Escenario: Reserva exitosa Santiago
    Dado que el usuario inicia la sesion
      | tipo_documento | Tarjeta de Identidad |
      | user           | 1000207300           |
      | password       | nacional             |
    Cuando el ingresa los datos de la reserva 18-octubre 2021 dia Lunes
    Entonces el podra ver un mensaje de ¡Felicitaciones!

  @reserva_andres
  Escenario: Reserva exitosa Andres
    Dado que el usuario inicia la sesion
      | tipo_documento | Cédula de Ciudadanía |
      | user           | 1020459879           |
      | password       | 1020459879           |
    Cuando el ingresa los datos de la reserva 25-octubre 2021 dia Lunes
    Entonces el podra ver un mensaje de ¡Felicitaciones!