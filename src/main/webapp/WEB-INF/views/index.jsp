<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib prefix="form" uri ="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<title>Some some</title>
</head>
<body>
        <table>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Price</th>
            </tr>
            <c:forEach items="${productDtoListAtr}" var="b">
                <tr>
                    <td>${b.id}</td>
                    <td>${b.name}</td>
                    <td>${b.price}</td>
                </tr>
            </c:forEach>
        </table>

<button input type="submit" value="Submit" method="POST" action="/saveProduct"  >Create</button>
<button type="button" >Read</button>
<button type="button" >Update</button>
<button type="button" >Delete</button>

</body>
</html>