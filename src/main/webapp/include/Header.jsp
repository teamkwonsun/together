<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
  <link href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.js"></script>
</head>
<body>

<nav class="navbar navbar-expand-md bg-dark navbar-dark">
  <a class="navbar-brand" href="/together/index.jsp">GreenBooks</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="collapsibleNavbar">
    <ul class="navbar-nav"> 
       <li class="nav-item">
        <a class="nav-link" href="#">로그인</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">로그아웃</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#"> 회원가입 </a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="http://localhost:8090/together/items?cmd=itemslist"> 상품 </a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#"> 숙소 </a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#"> 일기 </a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#"> 커뮤니티 </a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">게시글 작성</a>
      </li>  
    </ul>
  </div>
</nav>
<br>

<div class="container">

