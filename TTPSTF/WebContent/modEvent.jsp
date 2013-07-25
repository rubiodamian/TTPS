<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="s" uri="/struts-tags" %>
 
 <%@ page import="java.util.ArrayList" %>
 <%@ page import="java.util.Iterator" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Eventos actuales</title>
</head>
<body>

<h1>Seleccione un evento para modificar:</h1>


<%-- <s:if test="%{eventos!=null}"> --%>
<s:form action="modEvent">
		<s:select label="Eventos actuales" name="eventos" list="eventos" />
		<s:submit value="Modificar"/> 
	</s:form>
	
<%-- </s:if> --%>
<%-- <s:if test="%{!eventos==null}"> --%>
<!-- 	<h3>No hay eventos para modificar disponibles.</h3> -->
<%-- </s:if> --%>
				
</body>
</html>






