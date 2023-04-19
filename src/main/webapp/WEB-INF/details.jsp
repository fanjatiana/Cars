<%--
  Created by IntelliJ IDEA.
  User: fandja
  Date: 19/04/2023
  Time: 12:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
    <title>Details</title>
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
              Dropdown
            </a>
            <ul class="dropdown-menu">
              <li><a class="dropdown-item" href="#">Action</a></li>
              <li><a class="dropdown-item" href="#">Another action</a></li>
              <li>
                <hr class="dropdown-divider">
              </li>
              <li><a class="dropdown-item" href="#">Something else here</a></li>
            </ul>
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
  <div class="container-fluid d-flex flex-wrap justify-content-around mt-4">
      <div class="card" style="width: 18rem;">
        <img src=${imageUrl} class="card-img-top" alt="...">
        <div class="card-body">
          <h5 class="card-title">${name}</h5>
          <p class="card-text">${description}</p>
          <p class="card-text">${price}</p>
          <p class="card-text">${type}</p>
          <a href="details" class="btn btn-primary">Details</a>
        </div>
      </div>
  </div>
</main>
<footer>
  <div class="container-fluid d-flex justify-content-between row">
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


<!-- <form method="post" action="/details">
<input type="hidden" name="buttonId" value="">
<button type="submit" class="btn btn-success"  id=>Details</button>
</form>-->