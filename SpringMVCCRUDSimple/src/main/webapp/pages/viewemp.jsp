
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>Employees List</h1>
<table>
	<tr>
		<th>Id</th>
		<th>Name</th>
		<th>Descricao</th>
		<th>Categoria</th>
		<th>Preco</th>
		<th>Edit</th>
		<th>Delete</th>
	</tr>
	<c:forEach var="emp" items="${list}">
		<tr>
			<td>${filme.id}</td>
			<td>${filme.nome}</td>
			<td>${filme.descricao}</td>
			<td>${filme.categoria}</td>
			<td>${filme.preco}</td>
			<td><a href="editemp/${filme.id}">Edit</a></td>
			<td><a href="deleteemp/${filme.id}">Delete</a></td>
		</tr>
	</c:forEach>
</table>
<br />
<a href="empform">Add New Employee</a>