<%@ include file="header.jsp" %>

      <div class="planta">
        <div class="container">
          <h1 class="display-3">Planta</h1>
        </div>
      </div>

      <div class="container">
      
        <div class="row">
            <h2>Plantas </h2><br /><br />
            <p><img src="<c:url value='planta/img/planta.png' />" /></p>
           <b>Tipo Planta:</b> ${planta.getTipoPlanta()}<br />
           <b>Nombre Planta:</b> ${planta.getNombrePlanta()}<br />
           <b>Clasificacion :</b> ${planta.getClasificacion()}<br />
            
        </div>
        
       </div>


<%@ include file="footer.jsp" %>
