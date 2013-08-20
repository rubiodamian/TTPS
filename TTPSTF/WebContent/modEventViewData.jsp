<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Modificar el evento</title>
</head>
<body>

<h1>Modificación del evento</h1>
<h3>-------------------------------------</h3>


<form action="modEventData" method="post">
	<s:textfield name="title" label="Titulo" value="%{event.title}"/></br>
	<s:textfield name="description" label="Descripcion" value="%{event.description}"/></br>
	<s:textfield name="day" label="Dia" value="%{event.day}" /></br>
	<s:textfield name="hour" label="Hora" value="%{event.hour}"/></br>
	<s:textfield name="place" label="Lugar" value="%{event.place}"/></br>
	<s:select name="categoria" list="categorias"
			headerKey="" headerValue="%{event.category.nombre}" label="Categoría" /></br>
	<s:hidden name="idEvent" value="%{event.id}"/>		
	<s:submit value="Modificar"/>		
</form>


</body>
</html>