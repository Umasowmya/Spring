<!DOCTYPE html>
<html>
<head>
    <title>Student-Confirmation page</title>
</head>

<body>

<h1>Student-Confirmation form</h1>
<p>
Student details<br>
            Name :  ${student.firstName}  ${student.lastName}  <br>
            Place:  ${student.country}<br>
            Programming Language : ${student.favoriteLanguage} <br>
            Operating Systems :
           <ul>
           	<c:forEach var="temp" items="${student.operatingSystems}">

           		<li> ${temp} </li>

           	</c:forEach>
           </ul>
</p>

</body>

</html>

