<%-- 
    Document   : Entidad
    Created on : 16/10/2017, 04:01:13 PM
    Author     : User
--%>

<%@page import="Model.Esquema"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
  <title>Esquema</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
    <body background="fondo.jpg">
       
        <h1>Reporte Colmenas</h1>
        <div class="container">
        <div class="row">  
            <div class="col-sm-12">
                <table class="table table-hover table-condensed table-bordered">
                    <tr>
                        <td>Id Colmena</td>
                        <td>Ubicacion</td>
                        <td>Fabrica</td>
                        <td>Id Colmena Madre</td>
                        <td>Kilos Totales</td>
                    </tr>
                    
                    <% 
                        
                        if (request.getAttribute("listaReporte") != null) {
                        ArrayList<Reporte> list = (ArrayList<Reporte>) request.getAttribute("listaReporte");
                        if(list!= null)
                            for (Reporte a : list) {


                        %>

                         <tr>
                            <td><%=a.getIdcolmena()%></td>
                            <td><%=a.getUbicacion()%></td>
                            <td><%=a.getFabrica()%></td>
                            <td><%=a.getIdcolmenamadre()%></td>
                            <td><%=a.getKilostotales()%></td>
                        </tr>

                        <% } 
                        }
                        %>
                </table>
            </div>
        </div>
            </div>
    </body>
</html>