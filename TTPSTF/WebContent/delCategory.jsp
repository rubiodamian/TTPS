<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Eliminar categorias</title>
</head>
<body>

<h1>Eliminar categorias</h1>
<h3>-------------------------------------</h3>

<s:form action="delCategory" method="post">
		<s:select name="catId" label="Categorias actuales"  list="categorias" />
		<s:submit value="Eliminar"/> 
</s:form>

</body>
</html>