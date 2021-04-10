# language: es
Característica: Registro en Simon Inder
  Yo como usuario del inder
  Necesito realizar el registro
  Para realizar reservas de canchas

  @Registro_exitoso
  Escenario: : Registro exitoso
    Dado que el usuario se encuentra en el formulario de registro
    Cuando el ingresa los datos personales
      | tipoPersona     | tipoDocumento | numeroIdentificacion | nombre | apellido | sexo      | fechaNacimiento | clave    | municipio | estrato | correo               |
      | Persona Natural | Pasaporte     | 29370322             | Juan   | Tapias   | Masculino | 10061995        | 202090an | Medellín  | 3       | andres13@hotmail.com |
    Entonces el podra registrar exitosamente