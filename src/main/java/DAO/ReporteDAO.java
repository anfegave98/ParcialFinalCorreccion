package DAO;

import Util.DbUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Model.Reporte;
import java.net.URISyntaxException;

public class ReporteDAO {

    private Connection connection;

    public ReporteDAO() throws SQLException, URISyntaxException {
        connection = DbUtil.getConnection();
    }

//    public boolean addColmena(Colmena colmena) throws SQLException, URISyntaxException {
//       boolean result = false;
//        Connection connection = DbUtil.getConnection();
//        String query = "INSERT INTO colmena (idcolmena, ubicacion, fabrica, idcolmenamadre) VALUES (?, ?, ?, ?);";
//        PreparedStatement preparedStmt = null;
//        try {
//            preparedStmt = connection.prepareStatement(query);
//            preparedStmt.setInt(1, colmena.getIdcolmena());
//            preparedStmt.setString(2, colmena.getUbicacion());
//            preparedStmt.setString(3, colmena.getFabrica());
//            preparedStmt.setInt(4, colmena.getIdcolmenamadre());
//      
//            result = preparedStmt.execute();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return result;
//    }
    public ArrayList<Reporte> getAllReporte() throws SQLException, URISyntaxException {
        ArrayList<Reporte> reporte = null;
        boolean result = false;
        String query = "select  colmena.idcolmena,colmena.ubicacion,colmena.fabrica,colmena.idcolmenamadre,\n"
                + "sum(registrorecoleccion.kilos) as KilosTotales from registrorecoleccion,colmena,trabajador  where \n"
                + "registrorecoleccion.idcolmena= colmena.idcolmena and registrorecoleccion.idtrabajador = trabajador.idtrabajador\n"
                + "and trabajador.idtrabajador != 123456  group by colmena.idcolmena \n"
                + "having sum(registrorecoleccion.kilos)>2 order by sum(registrorecoleccion.kilos) asc limit 10";
        Connection connection = DbUtil.getConnection();
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);
            int idcolmena = 0;
            String ubicacion = null;
            String fabrica=null;
            int idcolmenamadre = 0;
            int kilostotales = 0;

            while (rs.next()) {
                if (reporte == null) {
                    reporte = new ArrayList<Reporte>();
                }
                Reporte registro = new Reporte(idcolmena, ubicacion, fabrica, idcolmenamadre, kilostotales);
                idcolmena = rs.getInt("idcolmena");
                registro.setIdcolmena(idcolmena);

                ubicacion = rs.getString("ubicacion");
                registro.setUbicacion(ubicacion);

                fabrica = rs.getString("fabrica");
                registro.setFabrica(fabrica);

                idcolmenamadre = rs.getInt("idcolmenamadre");
                registro.setIdcolmenamadre(idcolmenamadre);

                 kilostotales = rs.getInt("kilostotales");
                registro.setKilostotales(kilostotales);
                
                reporte.add(registro);

            }
            if (reporte != null) {
                for (int i = 0; i < reporte.size(); i++) {
                    System.out.println(reporte.get(i).getIdcolmena() + " " + reporte.get(i).getUbicacion() + " " + reporte.get(i).getFabrica()+" "+ reporte.get(i).getIdcolmenamadre()+" "+reporte.get(i).getKilostotales());
                }
            }
            st.close();

        } catch (SQLException e) {
            System.out.println("Problemas al obtener la lista de Reportes");
            e.printStackTrace();
        }

        return reporte;

    }

}
