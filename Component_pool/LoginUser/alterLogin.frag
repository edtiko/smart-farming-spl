Fragment user-AlterLoginResource { 
   Action: replace
   Priority: medium
   FragmentationPoints: user
   PointBracketsLan: html
   Destinations: login
   SourceCode: [ALTERCODE-FRAG]<form method="get" action="http://localhost:8080/">
	<div>
	<input type="text" placeholder="usuario"  />
	</div>
	<br />
	<div>
	<input type="password" placeholder="contrase&nacute;a"/>
	</div>
	<br />
	<div>
	<button type="submit">Ingresar</button>
	</div>
	</form>
	<br />[/ALTERCODE-FRAG]
}