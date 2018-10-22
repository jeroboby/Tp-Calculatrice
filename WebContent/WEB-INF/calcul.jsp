<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calculatrice</title>
</head>
<body>
<p>
<c:if test="${ !empty operation.operande1 && !empty operation.operande2 }">
		Resultat de l'operation : ${ operation.operande1 } ${ operation.operateur } ${ operation.operande2 } = ${ operation.resultat }
</c:if>
</p>
	<form method="post">
		<input name="operande1" id="operande1" type="number" size="3">
		<select name="operateur">
			<option value="+">+</option>
			<option value="-">-</option>
			<option value="x">x</option>
			<option value="/">%</option>
		</select> <input name="operande2" id="operande2" type="number" size="3">
		<input type="submit" value="Envoyer">
	</form>
</body>
</html>