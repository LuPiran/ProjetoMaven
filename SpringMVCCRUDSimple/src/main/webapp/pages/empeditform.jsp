<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>Edit Employee</h1>
<form:form method="POST" action="/SpringMVCCRUDSimple/editsave">
	<table>
		<tr>
			<td></td>
			<td><form:hidden path="id" /></td>
		</tr>
		<tr>
			<td>Nome :</td>
			<td><form:input path="nome" /></td>
		</tr>
		<tr>
			<td>Descricao :</td>
			<td><form:input path="descricao" /></td>
		</tr>
		<tr>
			<td>Categoria :</td>
			<td><form:input path="categoria" /></td>
		</tr>
		<tr>
			<td>Preco :</td>
			<td><form:input path="preco" /></td>
		</tr>
		<tr>
			<td></td>
			<td><input type="submit" value="Edit Save" /></td>
		</tr>
	</table>
</form:form>