<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@include file="../layout/header.jsp" %>

	<div class="container text-center">
		<h2>야구장 등록</h2>
		</hr>
		<form action="/stadium" method="POST">
			<div class="form-group">
		    	<input type="text" class="form-control" placeholder="야구장 이름" name="name">
	  		</div>
			<button type="submit" class="btn btn-primary">등록</button>
		</form>
	</div>
	
<%@include file="../layout/footer.jsp" %>