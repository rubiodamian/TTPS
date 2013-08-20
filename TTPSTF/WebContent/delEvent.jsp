<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Eventos actuales</title>
</head>
<body>

<h1>Eliminar eventos</h1>
<h3>-------------------------------------</h3>


<!-- CORREGIR LOS IF PARA QUE CUANDO NO HAYA EVENTOS MUESTRE UN CARTEL QUE NO HAY EVENTOS -->

<s:form action="/events/delEvent" method="post">
		<s:select name="evts" label="Eventos actuales"  list="eventos" />
		<s:submit value="Eliminar"/> 
</s:form>
</body>
</html>