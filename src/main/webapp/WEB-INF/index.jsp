<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
    <title>JSP - Hello World</title>
</head>
<body>
<header>

    <h1>Bienvenue</h1>
</header>

<main>
    <div class="container-fluid d-flex flex-wrap justify-content-around mt-4">
        <c:forEach var="car" items="${cars}">
            <div class="card" style="width: 18rem;">
                <img src=${car.imageUrl} class="card-img-top" alt="...">
                <div class="card-body">
                    <h5 class="card-title">${car.name}</h5>
                    <p class="card-text">${car.type}</p>
                    <form method="post" action="index">
                        <input type="hidden" name="buttonId" value="${car.id}">
                        <button type="submit" class="btn btn-success"  id="${car.id}">Details</button>
                    </form>
                </div>
            </div>
        </c:forEach>
    </div>
</main>

<footer></footer>

</body>
</html>