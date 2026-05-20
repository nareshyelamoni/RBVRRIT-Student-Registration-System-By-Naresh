<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Failed</title>

<style>
    body {
        font-family: 'Segoe UI', sans-serif;
        background: linear-gradient(135deg, #ff4e50, #f9d423);
        height: 100vh;
        margin: 0;
        display: flex;
        justify-content: center;
        align-items: center;
    }

    .card {
        background: white;
        padding: 40px;
        border-radius: 15px;
        text-align: center;
        box-shadow: 0 10px 25px rgba(0,0,0,0.2);
        width: 350px;
        animation: shake 0.5s ease-in-out;
    }

    .cross {
        font-size: 60px;
        color: #dc3545;
        margin-bottom: 10px;
    }

    h1 {
        margin: 10px 0;
        color: #333;
    }

    p {
        color: #666;
        font-size: 14px;
    }

    .btn {
        margin-top: 20px;
        display: inline-block;
        padding: 10px 20px;
        background: #dc3545;
        color: white;
        text-decoration: none;
        border-radius: 5px;
        transition: 0.3s;
    }

    .btn:hover {
        background: #c82333;
    }

    @keyframes shake {
        0% { transform: translateX(0); }
        25% { transform: translateX(-8px); }
        50% { transform: translateX(8px); }
        75% { transform: translateX(-8px); }
        100% { transform: translateX(0); }
    }
</style>

</head>

<body>

<div class="card">
    <div class="cross">✖</div>

    <h1>Registration Failed</h1>

    <p>Something went wrong while saving your data.<br>
       Please try again later.</p>

    <a href="index.html" class="btn">Try Again</a>
</div>

</body>
</html>