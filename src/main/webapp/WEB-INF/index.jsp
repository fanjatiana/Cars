<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe"
            crossorigin="anonymous"></script>
    <title>JSP - Hello World</title>
</head>
<body>
<header>
    <nav class="navbar navbar-expand-lg bg-body-tertiary mb-5">
        <div class="container-fluid">
            <a class="navbar-brand" href="index">
                <img src="img/logocar_60.png" class="card-img-top" alt="logo">
            </a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                    data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                    aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                    <li class="nav-item">
                        <a class="nav-link active" aria-current="page" href="index">Home</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="category-list">Category List</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="login">Login</a>
                    </li>
                </ul>
                <form class="d-flex" role="search">
                    <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                    <button class="btn btn-outline-success" type="submit">Search</button>
                </form>
            </div>
        </div>
    </nav>
    <h1></h1>
</header>

<main>
    <div class="container-fluid d-flex flex-wrap justify-content-around mt-4 mb-5">
        <c:forEach var="car" items="${cars}">
            <div class="card mt-4" style="width: 18rem;">
                <img src=${car.imageUrl} class="card-img-top" alt="...">
                <div class="card-body">
                    <h5 class="card-title">${car.name}</h5>
                    <p class="card-text">${car.type}</p>
                    <form method="post" action="${pageContext.request.contextPath}/Home">
                        <button type="submit" class="btn btn-success" name="btnDetails" value="${car.id}">Details
                        </button>
                    </form>
                </div>
            </div>
        </c:forEach>
    </div>
</main>

<footer>
    <div class="container-fluid d-flex justify-content-between row footer fixed-bottom">
        <div class="col-4">
            <h6>Get in Touch</h6>
            <p>Phone +33 00 00 00 00</p>
            <p>Email: CarEE@example.fr</p>
            <p>Fax: +33 00 00 00 00 00 </p>
        </div>
        <div class="col-4">
            <img src="<c:url value='/img/logocar_60.png'/>" class="card-img-top" alt="logo">
            <p>CarEE is an awesome website with management is easy</p>
        </div>
        <div class="col-4">
            <h6>Location</h6>
            <p>CarEE inc.</p>
            <p>France</p>
            <p>02620</p>
        </div>
    </div>
</footer>

</body>
</html>