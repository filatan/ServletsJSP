<%@ page session="true" import="Servlet.CDdb" import="Servlet.CD"
	import="java.util.List" import="java.util.LinkedList"%>

<html>
<head>
<title>Music Without Borders</title>
</head>
<body bgcolor="#33CCFF">
	<font face="Times New Roman,Times" size="+3"> Music Without
		Borders </font>
	<hr>
	<p>
	<center>



		<form name="shoppingForm" action="/TiendaCDs/ShoppingServlet"
			method="POST">
			<b>CD:</b> <select name=CD>
				<%
					CDdb base = new CDdb();

					List<CD> lista;
					lista = base.getList();
					for (int i = 0; i < lista.size(); i++) {
						CD disco = new CD();
						disco = lista.get(i);
				%>
				<option>
					<%=disco.getAlbum()%> |
					<%=disco.getArtist()%> |
					<%=disco.getCountry()%> |<%=disco.getPrice()%>
				</option>
				<%
					}
				%>
			</select> <b>Quantity: </b><input type="text" name="qty" SIZE="3" value=1>
			<input type="hidden" name="action" value="ADD"> <input
				type="submit" name="Submit" value="Add to Cart">
		</form>
	</center>
	<p>
		<jsp:include page="Cart.jsp" flush="true" />
</body>
</html>