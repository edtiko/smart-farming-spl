<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <script type="text/javascript">
    </script>
</head>

<body style="text-align:center">
  <jsp:include page="index.jsp" />
    <br />
    <h1>Crear M&oacute;dulo</h2>
        <br />
        <form>
         <table align="center">
            <tr>
               <td><label>C&oacute;digo</label></td>
               <td><input type="text" /></td>
            </tr>
            <tr>
                <td><label>Nombre</label></td>
                <td><input type="text" /></td>
            </tr>
            <tr>
                <td><label>Tipo de cultivo o planta</label></td>
                <td><input type="text" /></td>
            </tr>
            <tr>
                <td><label>Numero de plantas</label></td>
                <td><input type="number" /></td>
            </tr>
             <tr>
              <td><button type="submit">Guardar</button></td>
             </tr>
            </table>
        </form>
</body>

</html>