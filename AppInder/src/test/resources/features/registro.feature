# language: es
Característica: Registro en Simon Inder
  Yo como usuario del inder
  Necesito realizar el registro
  Para realizar reservas de canchas

  @Registro_exitoso
  Escenario: : Registro exitoso
    Dado que el usuario se encuentra en el formulario de registro
    Cuando el ingresa los datos personales
      | tipoPersona     | tipoDocumento        | numeroIdentificacion | nombre | apellido | sexo      | fechaNacimiento | clave      | municipio | estrato | correo                  |
      | Persona Natural | Cédula de Ciudadanía | 1036339913           | Daniel | Correa   | Masculino | 02061999        | 1036339913 | Medellin  | 3       | danicorregi15@gmail.com |
    Entonces el podra registrar exitosamente