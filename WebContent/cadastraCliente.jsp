<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro de Cliente</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<div style="width: 30%; padding: 10px; margin-left: 35%; margin-top: 10%">
<form action="<c:url value = "cadastraCliente"/>" method="post">
    
  <h3><strong>Cadastro de Cliente</strong></h3>
  <hr>
  <div class="form-group">
    <label for="exampleInputEmail1">Nome:</label>
    <input type="text" class="form-control" aria-describedby="emailHelp" placeholder="Nome" name="nome">
  </div>
  <div class="form-group">
    <label for="exampleInputEmail1">Documento:</label>
    <input type="text" class="form-control" aria-describedby="emailHelp" placeholder="Documento" name="documento">
  </div>
  <button type="submit" class="btn btn-primary">Salvar</button>
</form>
</div>
</body>
</html>
