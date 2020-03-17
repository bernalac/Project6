import java.util.Scanner;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.util.List;
import java.util.ArrayList;

public class DAOAulaImplDB implements DAOAula {
    private int i = 0;
    private int len = 0;
    private Connection conn = null;
    private List<Aula> lista = new ArrayList<Aula>();
    private String table;
//Añado mi base de datos aulasdb
    private String url = "jdbc:mysql://localhost/aulasdb";
    private String passwd;
    public DAOAulaImplDB() {
            table="aulas";
            connect(url);
    }
//contraseña y usuario
//parte de prepared statement cambio de nombre string sql
//mi tabla se llamaba aulas y estaba puesto aula
//Y tutor daba fallo debido a que era id_tutor y no tutor
    private void connect(String url){
       try {
	 System.out.println("Contraseña: ");
	 Scanner sc = new Scanner(System.in);
	 passwd = sc.nextLine();
         conn = DriverManager.getConnection(url, "javier", passwd);
	 i = 0;
	 this.lista = todos();
	 this.len = lista.size();
       } catch (SQLException e) {
         System.out.println(e.getMessage());
       }
    }
    private void closeConnect(){
            if(conn == null)
               return;
            try {
               conn.close();
            } catch (SQLException ex) {
            }
    }

    public List<Aula> findAll() throws Exception {
         this.lista = todos();
         this.len = lista.size();
         this.i = 0;
         return this.lista;
    }
    public Aula get() throws Exception {
      if(i < len) {
        Aula au = new Aula();
        au = lista.get(i);
        i++;
        return au;
      }
      i=0;
      return null;
    }
    public List<Aula> todos() {
       List<Aula> result = new ArrayList<Aula>();
       String sql = "select * from aulas";
       try {
         PreparedStatement statement = conn.prepareStatement(sql);
         ResultSet resultSet = statement.executeQuery();
         while (resultSet.next()) {
          Aula unAu = new Aula();
          unAu.setName(resultSet.getString("name"));
          unAu.setGrupo(resultSet.getString("grupo"));
          unAu.setTutor(resultSet.getInt("id_tutor"));
          String materias = resultSet.getString("materias");
          if(resultSet.wasNull()) {
             materias = null;
          }
          List<String> lmat = new ArrayList<String>();
          if (materias != null) {
            for(String st : materias.split(",")) {
                 lmat.add(st);
            }
          }
          unAu.setMaterias(lmat);
          result.add(unAu);
         }
       }
       catch (SQLException ex) {
         ex.printStackTrace();
       }
       finally {
         //closeConnect();
       }
       return result;
    }
}

