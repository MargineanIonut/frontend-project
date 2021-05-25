<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib prefix="form" uri ="http://www.springframework.org/tags/form"%>

<html>
    <head>
    </head>
    <body>
        <h3>Welcome, Enter The Product Id to delete</h3>

        <form:form method="DELETE" action="/delete" modelAttribute="dto">
            <table>
                 <tr>
                    <td><form:label path="id">Id</form:label></td>
                    <td><form:input path="id"/></td>
                 </tr>
                    <td><input type="submit" value="Submit"/></td>
                </tr>
            </table>
        </form:form>

    </body>
</html>




