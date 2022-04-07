<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head></head>
<body>
    <form:form action="processForm" modelAttribute="student">

        First Name : <form:input path="firstName" />
        <br><br>
        Last Name : <form:input path="lastName" />
        <br><br>
        Country: <form:select path="country">
                <form:options items="${student.countryOptions}"/>
            </form:select>

        <br><br>

        Favourite Language:<br>
                <form:radiobutton path="favoriteLanguage" value="Java"/> Java <br>
                <form:radiobutton path="favoriteLanguage" value="C#"/> C# <br>
                <form:radiobutton path="favoriteLanguage" value="Python"/> Python <br>
                <form:radiobutton path="favoriteLanguage" value="PHP"/> PHP <br>

        Operating System  :<br>
		Linux <form:checkbox path="operatingSystems" value="Linux" />
		Mac OS <form:checkbox path="operatingSystems" value="Mac OS" />
		MS Windows <form:checkbox path="operatingSystems" value="MS Window" />

         <br><br>

        <input type="submit" value="submit" />

    </form:form>


</body>

</html>

