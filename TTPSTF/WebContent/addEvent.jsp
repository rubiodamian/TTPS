<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Crear nuevo evento</title>
</head>
<body>

	<h1>Agregar nuevo evento</h1>
	<h3>-------------------------------------</h3>
	<s:fielderror />

	<s:form action="addEvent">
		<s:textfield name="title" label="Titulo" />
		<s:textfield name="description" label="Descripcion" />
		<s:textfield name="day" label="Dia" />
		<s:textfield name="hour" label="Hora" />
		<s:textfield name="place" label="Lugar" />
		<s:select name="category" list="{'Musica','Arte','Plastica'}"
			headerKey="" headerValue="Seleccionar" label="Categoría" />
		<s:submit value="Agregar"/>			
	</s:form>

</body>
</html>