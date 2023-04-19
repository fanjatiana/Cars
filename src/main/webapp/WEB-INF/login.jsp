<%--
  Created by IntelliJ IDEA.
  User: fandja
  Date: 19/04/2023
  Time: 17:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
  <title>Login</title>
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
      <div class="collapse navbar-collapse" id="navbarSupportedContent d-flex">
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
  <h1 class="text-center mb-4 mt-4">Login Page</h1>
</header>

<main>
  <div class="container-fluid d-flex align-items-center justify-content-center row">
    <div class="row" >
      <form method="post" action="${pageContext.request.contextPath}/login" class="col-12 d-flex flex-column align-items-center">
        <div class="mb-3 col-6">
          <label for="userRole" class="col-sm-2 col-form-label me-3"></label>
          <div class="col-sm-10">
            <input type="text" class="form-control" id="userRole" name="userRole" required>
          </div>
        </div>
        <div class="mb-3 col-6">
          <label for="inputPassword" class="col-sm-2 col-form-label me-3"></label>
          <div class="col-sm-10">
            <input type="password" class="form-control" id="inputPassword" name="password" required>
          </div>
        </div>
        <div  class="mb-3 col-6">
          <p>${isError}</p>
        </div>
        <div  class="mb-3 col-6 d-flex justify-content-center">
          <button type="submit" class="btn btn-primary col-4">Login</button>
        </div>
      </form>
    </div>
  </div>
</main>
<footer></footer>
</body>
</html>
