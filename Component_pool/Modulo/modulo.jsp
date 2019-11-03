<%@ include file="header.jsp" %>

      <div class="moudlo">
        <div class="container">
          <h1 class="display-3">Modulo</h1>
        </div>
      </div>

      <div class="container">
      
        <div class="row">
            <h2>Modulos</h2><br /><br />
            <p><img src="<c:url value='modulo/img/modulo.png' />" /></p>
           <b>TipoPlanta:</b> ${modulo.getTipoPlanta()}<br />
           <b>FechaSimbra:</b> ${modulo.getFechaSiembra()}<br />
           <b>Total Plantas:</b> ${modulo.getTotalPlantas()}<br />
            
        </div>
        
       </div>


<%@ include file="footer.jsp" %>
