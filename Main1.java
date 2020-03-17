import java.util.List;
import java.util.ArrayList;

public class Main1 {
   public static void main(String[] argv) throws Exception {
         DAOAula obj = new DAOAulaImplFich();
         List<Aula> l =  obj.findAll();
         DAOTutor obj1 = new DAOImplTutor();  // es tu implementacion
         for(Aula a : l) {
           if(a.getMaterias().size() > 0) {
             Tutor t = new Tutor();
             t = obj1.findOne(Integer.valueOf(a.getTutor()));
             System.out.println(a.getName() + " // " + t.getIdTutor() + "[" + t.getDatos().getApellido() + "] " + " // " + a.getMaterias().get(0));
           }
           else {
             System.out.println(a.getName() + " // " + a.getTutor()  + " // " + "materias no asignadas");
           }
         }
   }
} 
