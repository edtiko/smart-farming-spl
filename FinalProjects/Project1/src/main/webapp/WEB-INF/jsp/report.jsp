<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.20/css/jquery.dataTables.min.css">
    <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/buttons/1.6.0/css/buttons.dataTables.min.css">
    <script type="text/javascript" language="javascript" src="https://code.jquery.com/jquery-3.3.1.js"></script>
    <script type="text/javascript" language="javascript" src="https://cdn.datatables.net/1.10.20/js/jquery.dataTables.min.js"></script>
    <script type="text/javascript" language="javascript" src="https://cdn.datatables.net/buttons/1.6.0/js/dataTables.buttons.min.js"></script>
    <script type="text/javascript" language="javascript" src="https://cdn.datatables.net/buttons/1.6.0/js/buttons.flash.min.js"></script>
    <script type="text/javascript" language="javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jszip/3.1.3/jszip.min.js"></script>
    <script type="text/javascript" language="javascript" src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.53/pdfmake.min.js"></script>
    <script type="text/javascript" language="javascript" src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.53/vfs_fonts.js"></script>
    <script type="text/javascript" language="javascript" src="https://cdn.datatables.net/buttons/1.6.0/js/buttons.html5.min.js"></script>
    <script type="text/javascript" language="javascript" src="https://cdn.datatables.net/buttons/1.6.0/js/buttons.print.min.js"></script>
    <script type="text/javascript">
    $(document).ready(function() {
        $('#example').DataTable( {
            dom: 'Bfrtip',
            buttons: [
                'copy'
/*B-export*/

/*Code injected by: PDFExport-AlterReport*/
,'pdf'
/*Code injected by: PDFExport-AlterReport*/


/*Code injected by: ExcelExport-AlterReport*/
,'excel'
/*Code injected by: ExcelExport-AlterReport*/


/*Code injected by: CSVExport-AlterReport*/
,'csv'
/*Code injected by: CSVExport-AlterReport*/

/*E-export*/
				, 'print'
            ]
        } );
    } );
    </script>
</head>
<body>
  <jsp:include page="index.jsp" />
    <br />
    <table id="example" class="display nowrap" style="width:100%">
        <thead>
            <tr>
                <th>M&oacutedulo</th>
                <th>Planta</th>
                <th>Regi&oacuten</th>
                <th>Humedad ideal</th>
                <th>Fecha de siembra</th>
                <th>Costo</th>
                <th>Ph de la soluci&oacuten</th>
                <th>Tiempo de producci&oacuten</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${reportList}" var="data">
                <tr>
                    <td>${data.modulo}</td>
                    <td>${data.planta}</td>
                    <td>${data.region}</td>
                    <td>${data.humedad}</td>
                    <td>${data.fechaSiembra}</td>
                    <td>${data.costo}</td>
                    <td>${data.ph}</td>
                    <td>${data.timePdn}</td>
                </tr>
            </c:forEach>
        </tbody>
        <tfoot>
            <tr>
                <th>M&oacute;dulo</th>
                <th>Planta</th>
                <th>Regi&oacuten</th>
                <th>Humedad ideal</th>
                <th>Fecha de siembra</th>
                <th>Costo</th>
                <th>Ph de la soluci&oacuten</th>
                <th>Tiempo de producci&oacuten</th>
            </tr>
        </tfoot>
    </table>
</body>
</html>