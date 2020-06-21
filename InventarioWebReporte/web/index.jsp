<%-- 
    Document   : index
    Created on : 06-11-2020, 09:24:04 AM
    Author     : Adonis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CONTROL DE INVENTARIO</title>
        <!--Imcluimos la vista parcial la cual contiene las URL de las librerias correstondiemtes 
        a estilos y js-->
        <%@include file ="WEB-INF/Vistas-Parciales/css-js.jspf" %>
    </head>
    <body>
       
        <!--Agregamos la vista de parcial del encabezado-->
        <%@include file = "WEB-INF/Vistas-Parciales/encabezado.jspf" %>
         
        <h3>¡Bienvenid@!</h3><!-- Todo en contenido de la aplicación -->
    
         <!--Vista parcial de la parte inferior de nuestra aplicación-->
         <%@include file="WEB-INF/Vistas-Parciales/pie.jspf"%>
    </body>
</html>
