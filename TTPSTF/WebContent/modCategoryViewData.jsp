<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Modificar categoria</title>
</head>
<body>

<h1>Modificar una categor&iacute;a</h1>
<h3>-------------------------------------</h3>
<s:form action="modCategoryData" method="post">
	<s:textfield name="nombre" label="Nombre de la categoria" value="%{cat.nombre}"/></br>	
	<s:hidden name="idCategoria" value="%{cat.id}"/>
	<s:submit value="Modificar"/>
</s:form>

</body>
</html>