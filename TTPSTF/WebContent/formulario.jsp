<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Venta de entradas</title>
</head>
<body>

	<h1>Complete los campos</h1>
	
	<form action="" method="post">
		<label>Apellido:</label><input type="text" name="ape" id="ape"/></br>
		<label>Nombres:</label><input type="text" name="nom" id="nom"/></br>
		<label>Tarjeta de credito:</label>
		<select name="tarjeta">
			<option value="1">Visa</option>
			<option value="2">Master Card</option>
			<option value="3">American Express</option>
		</select></br>
		<label>Numero de tarjeta:</label><input type="text" name="nro" id="nro"/></br>
		<label>Codigo de seguridad:</label><input type="text" name="cod" id="cod"/></br>
		<label>Show:</label>
		<select name="show">
			<option value="1"><%out.print(this.getServletContext().getAttribute("show1"));%></option>
			<option value="2"><%out.print(this.getServletContext().getAttribute("show2"));%></option>
			<option value="3"><%out.print(this.getServletContext().getAttribute("show3"));%></option>
		</select></br>
		<label>Cantidad de entradas:</label><input type="text" name="cant" id="cant"/></br>
		<input type="submit" value="Continuar"/>
	</form>

</body>
</html>