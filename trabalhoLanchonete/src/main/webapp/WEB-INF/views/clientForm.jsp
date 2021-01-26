<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Agenda</title>
</head>
<body>
<form method=post action=salvarContato>
Id:<input type=text name=id><br>
Nome:<input type=text name=nome><br>
Email:<input type=text name=email><br>
<input type=submit value=Adicionar>
</form>
<c:if test="${not empty param.nome}">
<h2>O contato ${param.nome} foi adicionado com sucesso!</h2>
</c:if>
<a href="todosContatos">Exibir todos os contatos</a>
</body>
</html>