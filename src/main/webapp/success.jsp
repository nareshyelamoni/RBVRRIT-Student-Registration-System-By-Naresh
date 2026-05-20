<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Success</title>

<style>
    body {
        font-family: 'Segoe UI', sans-serif;
        background: linear-gradient(135deg, #667eea, #764ba2);
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
        animation: fadeIn 0.8s ease-in-out;
    }

    .check {
        font-size: 60px;
        color: #28a745;
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
        background: #667eea;
        color: white;
        text-decoration: none;
        border-radius: 5px;
        transition: 0.3s;
    }

    .btn:hover {
        background: #5a67d8;
    }

    @keyframes fadeIn {
        from {
            opacity: 0;
            transform: translateY(-20px);
        }
        to {
            opacity: 1;
            transform: translateY(0);
        }
    }
</style>

</head>

<body>

<div class="card">
    <div class="check">✔</div>

    <h1>Registration Successful</h1>

    <p>Your data has been saved successfully in RBVRRIT system.</p>

    <a href="index.html" class="btn">Go Back</a>
</div>

</body>
</html>