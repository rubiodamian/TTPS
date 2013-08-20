<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Agregar categoria</title>
</head>
<body>

<h1>Agregar una nueva categor&iacute;a</h1>
<h3>-------------------------------------</h3>

<s:form action="addCategory" method="post">
	<s:textfield name="nombre" label="Nombre de la categoria"/>
	<s:submit value="Agregar"/>
</s:form>

</body>
</html>