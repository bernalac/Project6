import java.util.List;

public interface DAOTutor {
  
   public Tutor findOne(int id) throws Exception;
   public List<Tutor> findAll();

}
