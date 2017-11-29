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

    
}
