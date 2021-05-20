<%@ taglib prefix="example" uri="http://ionut.jstldomain"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib prefix="bbb" uri="http://ionut.product"%>


<html>
    <head>
        <style>
            .book{
                border: 1px solid red;
            }
        </style>
    </head>
    <body>
        <strong>Hello World</strong>
         <div>
            ${book}
         </div>

         <example:TheNameOfTheTag  message="Stop going crazy" />

            <c:forEach items="${book}" var="b">
               <bbb:productTagName productDto="${b}" />
            </c:forEach>

        <div class="book">
         <div class="book">
            <h1>Title:</h1>
            ${bok.name}
         </div>

          <div>
            <h1>Price:</h1>
            ${bok.price }

          </div>

        </div>
    </body>
</html>

