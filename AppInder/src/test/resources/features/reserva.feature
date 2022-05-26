# language: es
Característica: Reservar Escenario Deportivo
  Yo como usuario
  Necesito realizar una reserva de escenario
  Para divertirme

  @reserva_elkin
  Escenario: Reserva exitosa Elkin
    Dado que el usuario inicia la sesion
      | tipo_documento | Cédula de Ciudadanía |
      | user           | 98572088           |
      | password       | 98572088          |
    Cuando el ingresa los datos de la reserva 13-junio 2022 dia Lunes
    Entonces el podra ver un mensaje de ¡Felicitaciones!

  @reserva_andres
  Escenario: Reserva exitosa Andres
    Dado que el usuario inicia la sesion
      | tipo_documento | Cédula de Ciudadanía |
      | user           | 1020459879           |
      | password       | 1020459879           |
    Cuando el ingresa los datos de la reserva 6-junio 2022 dia Lunes
    Entonces el podra ver un mensaje de ¡Felicitaciones!