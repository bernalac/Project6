import java.util.List;
import java.util.ArrayList;

public class Main {
   public static void main(String[] argv) throws Exception {
         DAOAula obj = new DAOAulaImplDB();
         List<Aula> l =  obj.findAll();
         for(Aula a : l) {
           if(a.getMaterias().size() > 0)
             System.out.println(a.getName() + " // " + a.getTutor()  + " // " + a.getMaterias().get(0) + " //// " + a.getMaterias().get(4));
           else {
             System.out.println(a.getName() + " // " + a.getTutor()  + " // " + "materias no asignadas");
           }
         }
   }
} 
