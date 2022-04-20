<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>

<head>
	<title>Save Customer</title>

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/css/style.css">

	<link type="text/css"
		  rel="stylesheet"
		  href="/css/add-customer-style.css">
</head>

<body>

	<div id="wrapper">
		<div id="header">
			<h2>CRM - Customer Relationship Manager</h2>
		</div>
	</div>

	<div id="container">
		<h3>Update Customer</h3>

		<form:form action="saveCustomer" modelAttribute="customer" method="POST">
        <form:hidden path="id" />
			<table>
				<tbody>
					<tr>
						<td><label>First name:</label></td>
						<td><form:input  path="firstName" value="${customer.firstName}" /></td>
					</tr>

					<tr>
						<td><label>Last name:</label></td>
						<td><form:input path="lastName" value="${customer.lastName}"/></td>
					</tr>

					<tr>
						<td><label>Email:</label></td>
						<td><form:input path="email" value="${customer.email}"/></td>
					</tr>

					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Update" class="save" /></td>
					</tr>


				</tbody>
			</table>


		</form:form>

		<div style="clear; both;"></div>

		<p>
			<a href="${pageContext.request.contextPath}/customer/list">Back to List</a>
		</p>

	</div>

</body>

</html>









