<%-- 
    Document   : Principal
    Created on : 4/10/2023, 11:47:54 a. m.
    Author     : ASUS
--%>

<%@page import="java.util.Iterator"%>
<%@page import="modelo.Persona"%>
<%@page import="java.util.List"%>
<%@page import="modelo.PersonaDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
        <title>Usuarios registrados</title>
    </head>
    <body>
        <div class="container mt-4 col-lg-4">
            <div class="card col-sm-10">
                <div class="card-body text-center">
                        <div class="form-group text-center">
                        </div>
                        <div class="form-group">
                            <h1>Usuarios</h1>
                            <a href="Controlador?accion=add" class="form-control btn btn-primary btn-block">Registrar usuario nuevo</a>
                            <table border="1">
                                <thead>
                                    <tr>
                                        <th>ID</th>
                                        <th>Usuario</th>
                                        <th>Contraseña</th>
                                        <th>Acciones</th>
                                    </tr>
                                </thead>
                                <%
                                    PersonaDAO dao = new PersonaDAO();
                                    List<Persona>list=dao.listar();
                                    Iterator<Persona>iter=list.iterator();
                                    Persona per = null;
                                    while(iter.hasNext()){
                                        per = iter.next();
                                        
                                    
                                %>
                                <tbody>
                                    <tr>
                                        <td><%= per.getId()%></td>
                                        <td><%= per.getUsu()%></td>
                                        <td><%= per.getContra()%></td>
                                        <td>
                                            <a href="Controlador?accion=editar&id=<%= per.getId()%>">Editar</a>
                                            <a href="Controlador?accion=eliminar&id=<%= per.getId()%>">Eliminar</a>
                                        </td>
                                    </tr>
                                    <%}%>
                                </tbody>
                            </table>

                        </div>
                </div>
            </div>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js" integrity="sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+" crossorigin="anonymous"></script>
    </body>
</html>
