<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<html>
<head>
    <title>Login Servlet</title>
</head>

<style>

    body{

        font-family:Arial, Helvetica, sans-serif;
        background-image: linear-gradient(to right, #5c1dba 45%, rgb(168, 46, 175));

    }

    div {
        background-color: rgba(31, 27, 27, 0.69);
        position: absolute;
        width: 25%;
        top: 50%;
        left: 50%;
        transform: translate(-50%, -50%);
        border-radius: 15px;
        box-shadow: 5px 5px 5px rgba(70, 36, 104, 40%);
        color: white;
        text-align: center;
        min-height: 300px;
        min-width: 220px;
        max-width: 270px;
    }

    input {

        padding: 3.0%;
        border: none;
        outline: none;
        font-size: 15px;
        border-radius: 5px;

    }

    button {

        padding: 3.5%;
        background-color: #1dbaba;
        border: none;
        width:  45%;
        border-radius: 5px;
        color: white;
        font-size: 15px;

    }

    button:hover{

        background-color:#6cc;
        cursor:pointer;

    }

    form label {
        display: block;
        margin-bottom: 8px;
    }

</style>

<body>

<!-- Navbar -->
<jsp:include page="menubar.jsp" />

<div>
    <h1>Login</h1>
    <form action="login" method="post">
        <label for="email">Email</label>
        <input type="email" id="email" name="email" placeholder="Entre com seu Email" required />
        <br /><br />
        <label for="password">Password</label>
        <input type="password" id="password" name="password" placeholder="Entre com sua senha " required />
        <br /><br />
        <button type="submit">Login</button>
    </form>
</div>


</body>
</html>
