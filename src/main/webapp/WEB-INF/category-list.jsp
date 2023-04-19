<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: fandja
  Date: 19/04/2023
  Time: 16:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet"
      integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
<html>
<head>
    <title>Title</title>
</head>
<body>
<header></header>
<main>
  <div>
      <c:forEach var="c" items="${category}">
          <div class="card" style="width: 18rem;">
              <div class="card-body">
                  <h5 class="card-title">${c}</h5>
              </div>
          </div>
      </c:forEach>
  </div>
</main>
<footer></footer>

</body>
</html>
