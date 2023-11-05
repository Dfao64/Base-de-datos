<%-- 
    Document   : Principal
    Created on : 4/10/2023, 11:47:54 a. m.
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
        <title>Login</title>
    </head>
    <body>
        
        <form action="Controlador">
        <div class="container mt-4 col-lg-4">
            <div class="card col-sm-10">
                <div class="card-body text-center">
                        <div class="form-group text-center">
                            <h3>Bienvenido, por favor inicie sesión</h3>
                        </div>
                        <div class="form-group">
                            <label>Usuario</label>
                            <input type="text" name="usuario" placeholder="Usuario" class="form-control">
                            <label>Contraseña</label>
                            <input type="text" name="pass" placeholder="******" class="form-control">
                            <input type="submit" name="accion" value="Ingresar" class="form-control btn btn-primary btn-block"><br><br>
                            <a href="add.jsp" class="form-control btn btn-primary btn-block">Registrar usuario</a><br><br>
                            <a href="Controlador?accion=listar" class="form-control btn btn-primary btn-block">Ver usuarios registrados</a>
                        </div>
                </div>
            </div>
        </div>
</form>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js" integrity="sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+" crossorigin="anonymous"></script>
    </body>
</html>
