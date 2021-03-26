<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>

<html lang="en">
<head>
<meta charset="UTF-8">
<title>Blog</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
</head>
<body>
	<nav class="navbar navbar-expand-md bg-dark navbar-dark ">
	
	  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
	    <span class="navbar-toggler-icon"></span>
	  </button>
	  
	  <div class="collapse navbar-collapse" id="collapsibleNavbar" style="justify-content: center;">
	    <ul class="navbar-nav">
	      <li class="nav-item">
	        <a class="nav-link" href="/stadium/saveForm">야구장등록</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="/team/saveForm">팀 등록</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="/player/saveForm">선수 등록</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="/stadium">야구장 관리</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="/team">팀 관리</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="/player">선수 관리</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="/player/position">포지션별 선수</a>
	      </li>
	    </ul>
	  </div>
	</nav>
	<br />