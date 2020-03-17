public class Persona {
  private String nombre;
  private String apellido;

  public Persona() {
    nombre = null;
    apellido = null;
  }
  public Persona(String s, String t) {
    nombre = s;
    apellido = t;
  }
  public void setNombre(String s) {
    nombre=s;
  }
  public void setApellido(String s) {
    apellido=s;
  }
  public String getApellido() {
    return apellido;
  }
  public String getNombre() {
    return nombre;
  }
  @Override
  public boolean equals(Object obj) {
       if (this == obj) {
         Persona o1 = (Persona) obj;
         return true;
       }
       if (obj == null || getClass() != obj.getClass()) {
         return false;
       }
       Persona o = (Persona)obj;
       if((this.nombre).equals(o.getNombre()) && (this.apellido).equals(o.getApellido())) {
         return true;
       }
       return false;
  }

  public String toString() {
    String  temp = "";
    temp = "Nombre: " + this.nombre + "\n";
    temp = temp + "Apellido: " + this.apellido + "\n";
    return temp;
  }
  @Override
  public int hashCode() {
    final int PRIME = 31;
    int result = 1;
    result = PRIME * result + (((nombre == null) || (apellido == null)) ? 0 : nombre.hashCode() + apellido.hashCode());
    return result;
  }
}
