<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/novaEmpresa" var="linkServletNovaEmpresa"/>
<!DOCTYPE>
<html lang="pt-br">
<head>
<title>Formulário nova empresa</title>
<meta charset="UTF-8">
</head>

<body>
	

	<p>Teste de Servlet</p>
	<form action="${linkServletNovaEmpresa}" method="post">
		Nome: <input type="text" name="nome"> <input type="submit"
			value="Enviar">

	</form>
</body>
</html>