<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registrarse</title>
</head>
<body>

<h1>Registrarse - Nueva cuenta</h1>
<h3>-------------------------------------</h3>
<s:fielderror/>

<s:form action="">
	<s:textfield name="user" label="Usuario"/>
	<s:password name="password" label="Contraseña"/>
	<s:textfield name="name" label="Nombre"/>
	<s:textfield name="surname" label="Apellidos"/>
	<s:textfield name="email" label="E-mail"/>
	<s:radio name="gender" label="Sexo" list="{'Masculino', 'Femenino'}"/>
	<s:date name="date"/> 
	<s:textfield name="ocupation" label="Ocupacion"/>
	<s:select name="race" list="{'Lic. en Sistemas','Lic. en Informatica','Analista Programador Universitario'}"
			 headerKey="" headerValue="Seleccionar" label="Carrera que cursa"/>
	<s:submit value="Registrarme"/>	
</s:form>


</body>
</html>