<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: fandja
  Date: 19/04/2023
  Time: 19:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
    <nav class="navbar navbar-expand-lg bg-body-tertiary">
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
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown"
                           aria-expanded="false">
                            Administration
                        </a>
                        <ul class="dropdown-menu">
                            <li><a class="dropdown-item" href="form-add-car">add car</a></li>
                            <li><a class="dropdown-item" href="form-add-category">add category</a></li>
                        </ul>
                    </li>

                    <li class="nav-item">
                        <a class="nav-link" href="${pageContext.request.contextPath}/adminSession/logout">Logout</a>
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
    <div class="container-fluid d-flex flex-wrap justify-content-around mt-4 ">
        <form action="${pageContext.request.contextPath}/adminSession/form-add-car" method="post">
            <div class="mb-3">
                <label for="name" class="form-label"></label>
                <input type="text" class="form-control" id="name" name="name" required placeholder="Zoe">
            </div>
            <div class="mb-3">
                <select class="form-select" aria-label="Default select example" name="type">
                    <option value="Electrique" selected>Electrique</option>
                    <option value="Hybride">Hybride</option>
                </select>
            </div>
            <div class="mb-3">
                <Label for="uploadImage" class="contrôle-label">
                    <Input id="uploadImage" name="imageUrl" type="file" classe multiple="file-chargement" required>
                </Label>
            </div>
            <div class="input-group">
                <label for="description" class="form-label"></label>
                <textarea class="form-control" aria-label="With textarea" name="description" maxlength="200"
                          id="description"></textarea>
            </div>
            <div class="mb-3">
                <label for="price" class="form-label"></label>
                <input type="number" class="form-control" id="price" name="price" required placeholder="70000">
            </div>
            <button type="submit" class="btn btn-primary">Add car</button>
        </form>
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
