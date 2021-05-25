<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib prefix="form" uri ="http://www.springframework.org/tags/form"%>

<html>
    <head>
    </head>
    <body>
        <h3>Welcome, Enter The Product Details</h3>

        <form:form method="POST" action="/save" modelAttribute="dto">
            <table>
                <tr>
                    <td><form:label path="name">Title</form:label></td>
                    <td><form:input path="name"/></td>
                </tr>
                <tr>
                    <td><form:label path="price">Price</form:label></td>
                    <td><form:input path="price"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Submit"/></td>
                </tr>
            </table>
        </form:form>

    </body>
</html>




