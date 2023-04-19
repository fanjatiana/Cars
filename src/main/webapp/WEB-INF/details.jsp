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
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
    <title>Details</title>
</head>
<body>
<header></header>
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
<footer></footer>

</body>
</html>


<!-- <form method="post" action="/details">
<input type="hidden" name="buttonId" value="">
<button type="submit" class="btn btn-success"  id=>Details</button>
</form>-->