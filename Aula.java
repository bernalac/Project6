import java.util.List;
import java.util.ArrayList;
public class Aula {
    private String name;
    private String grupo;
    private int tutor;
    private List<String> materias;
    public Aula() {
    }
    public Aula(String name,String grupo,int tutor,List<String> materias){
        this.name = name;
        this.grupo = grupo;
        this.tutor = tutor;
        this.materias = materias;
    }
    public void setGrupo(String g) {
         grupo = g;
    }
    public String getGrupo() {
         return grupo;
    }
    public void setName(String n) {
         name = n;
    }
    public String getName() {
         return name;
    }
    public void setTutor(int t) {
         tutor = t;
    }
    public int getTutor() {
         return tutor;
    }
    public void setMaterias(List<String> m) {
         materias = m;
    }
    public List<String> getMaterias() {
         return materias;
    }
}
