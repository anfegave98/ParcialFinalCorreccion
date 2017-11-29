package DAO;

import Util.DbUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import Model.Colmena;
import java.net.URISyntaxException;

public class ColmenaDAO {

    private Connection connection;

    public ColmenaDAO() throws SQLException, URISyntaxException {
        connection = DbUtil.getConnection();
    }

    public boolean addColumna(Colmena colmena) throws SQLException, URISyntaxException {
       boolean result = false;
        Connection connection = DbUtil.getConnection();
        String query = "INSERT INTO colmena (idcolmena, ubicacion, fabrica, idcolmenamadre) VALUES (?, ?, ?, ?);";
        PreparedStatement preparedStmt = null;
        try {
            preparedStmt = connection.prepareStatement(query);
            preparedStmt.setInt(1, colmena.getIdcolmena());
            preparedStmt.setString(2, colmena.getUbicacion());
            preparedStmt.setString(3, colmena.getFabrica());
            preparedStmt.setInt(4, colmena.getIdcolmenamadre());
      
            result = preparedStmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
     public List<Colmena> getAllColumna() throws SQLException, URISyntaxException {
      List<Colmena> colmena = null;
      boolean result = false;
        String query = "SELECT * FROM columna";
        Connection connection = DbUtil.getConnection();
        try {    
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);
           int idcolmena=0;
            String ubicacion=null;
            String fabrica = null;
            int id_tabla = 0;

            while (rs.next()) {
                if (colmena == null) {
                    colmena = new ArrayList<Columna>();
                }
                Columna registro = new Columna(nombre,data_type,id_tabla);
                id = rs.getInt("id_columna");
                registro.setId_columna(id);

                nombre = rs.getString("nombre_columna");
                registro.setNombre_columna(nombre);
                
                data_type=rs.getString("data_type");
                registro.setData_type(data_type);
                
                id_tabla = rs.getInt("id_tabla");
                registro.setId_tabla(id_tabla);


                colmena.add(registro);

            }
             if(colmena!=null)
            for (int i = 0; i < colmena.size(); i++) {
                System.out.println(colmena.get(i).getId_columna()+ " " + colmena.get(i).getNombre_columna()+" "+colmena.get(i).getData_type());
            }
            st.close();

        } catch (SQLException e) {
            System.out.println("Problemas al obtener la lista de Columnas");
            e.printStackTrace();
        }

        return colmena;
    
    }


    
}
