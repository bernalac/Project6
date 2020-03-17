public class Tutor {
    private int idTutor;
    private Persona datos;
    public Tutor() { }
    public Tutor(int id, Persona p){
        this.idTutor = id;
        this.datos = p;
    }
    public void setIdTutor(int idTutor) {
         this.idTutor = idTutor;
    }
    public int getIdTutor() {
         return idTutor;
    }
    public void setDatos(Persona datos) {
         this.datos = datos;
    }
    /*
     *   Persona p = new Persona("Alejandro","Sanchez");
     *   Tutor t = new Tutor(10,p);
     *   List<Tutor> l = new ArrayList<Tutor>();
     *   l.add(t);
     *   ....
     *   ...
     *   for(Tutor t : l) {
     *      System.out.println(t.getDatos().getNombre();
     *   }
     *
     */
    public Persona getDatos() {
         return datos;
    }
}
