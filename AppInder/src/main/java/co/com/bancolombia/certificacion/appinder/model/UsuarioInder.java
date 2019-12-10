package co.com.bancolombia.certificacion.appinder.model;

public class UsuarioInder {

  private String tipoPersona;
  private String tipoDocumento;
  private String numeroIdentificacion;
  private String nombre;
  private String apellido;
  private String sexo;
  private String fechaNacimiento;
  private String clave;
  private String municipio;
  private String estrato;
  private String correo;

  private UsuarioInder() {
  }

  public String getTipoPersona() {
    return tipoPersona;
  }

  public String getTipoDocumento() {
    return tipoDocumento;
  }

  public String getNumeroIdentificacion() {
    return numeroIdentificacion;
  }

  public String getNombre() {
    return nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public String getSexo() {
    return sexo;
  }

  public String getFechaNacimiento() {
    return fechaNacimiento;
  }

  public String getClave() {
    return clave;
  }

  public String getEstrato() {
    return estrato;
  }

  public String getCorreo() {
    return correo;
  }

  public String getMunicipio() {
    return municipio;
  }

}
