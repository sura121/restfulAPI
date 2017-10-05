<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page session="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>API TEST</h1>
<h2>REGISTER</h2>
<form method="post" action="/test/register">
<label>제목</label>
<input type="text" name="title" id="t1" >
<label>내용</label>
<input type="text" name="content" id="c1">
<label>글쓴이</label>
<input type="text" name="writer" id="w1">
<button type="submit">등록</button> 
</form>
<h2>READ</h2>
<input type="text"bno" id=b1>
<button id="f2">선택</button>
<h2>LIST</h2>
<button id="listAll">클릭</button>
<h2>update</h2>
<form:form id="upform" method="put" >
<label>게시물 번호</label>
<input type="text" name="bno" id="bnoPatch">
<label>제목</label>
<input type="text" name="title" id="titlePatch">
<label>내용</label>
<input type="text" name="content" id="contentPatch">
<button id="ok">수정</button>
</form:form>
<h2>DELETE</h2>
<form:form id="deform" method="delete">
<label>게시 번호</label>
<input name="bno" type="text" id="dbno"/>	
<p class="submit"><input type="submit" value="delete pet" id="deletebutton"></p>
</form:form>
<h2>회원가입</h2>
<form:form action="/test/join" method="post">
<label>이름</label>
<input name="name" type="text">
<label>아이디</label>
<input name="id" type="text">
<label>패스워드</label>
<input name="password" type="text">
<button type="submit">가입</button>
</form:form>

</body>
<script
  src="https://code.jquery.com/jquery-2.2.4.js"
  integrity="sha256-iT6Q9iMJYuQiMWNd9lDyBUStIq/8PuOW33aOqmvFpqI="
  crossorigin="anonymous"></script>
<script>
$(document).ready(function(){
	$("#listAll").on("click",function(e){
		self.location="/test/list"
	});
	$("#f2").on("click",function(e){
		e.preventDefault();
		var b1 = $("#b1").val();
		$.ajax({
			url:"/test/list/"+b1,
			type:"get",
			data:{
				bno:b1
			}
		}).done(function(data){
			self.location="/test/list/"+b1;
		});
	}); 
	
/* 	$("#ok").on("click",function(e){
		e.preventDefault();
		var bno = $("#bnoPatch").val();
		var title = $("#titlePatch").val();
		var content = $("#contentPatch").val();
		console.log(title);
		
		$.ajax({
			url:"/api2/test/custom/"+bno,
			type:"put",
			dataType:"text",
			headers : {
				"Content-Type" : "application/json",
				"X-HTTP-Method-Override" : "PUT"
			},
			data:JSON.stringify({
				title:title,
				bno:bno,
				content:content
			})
		}).done(function(data){
			console.log(data);
		});
	});
	 */
	 $("#ok").on("click",function(e){
		 e.preventDefault();
		var bno = $("#bnoPatch").val();
	 	$("#upform").attr("action","/test/custom/"+bno); 
		$("#upform").submit();
		
	 }); 
	 
	 $("#deletebutton").on("click",function(e){
		e.preventDefault();
		var bno = $("#dbno").val();
		$("#deform").attr("action","/test/delete/"+bno);
		$("#deform").submit();
	 });
});
</script>
</html>