<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>API TEST</h1>
<h2>REGISTER</h2>
<form method="post" action="/api2/test/register">
<label>제목</label>
<input type="text" name="title" id="t1" >
<label>내용</label>
<input type="text" name="content" id="c1">
<label>글쓴이</label>
<input type="text" name="writer" id="w1">
<button type="submit">등록</button> 
</form>
<h2>READ</h2>
<input type="text" name="bno" id=b1>
<button id="f2">선택</button>
<h2>LIST</h2>
<button id="listAll">클릭</button>
<h2>update</h2>
<form id="upform" method="PUT">
<label>게시물 번호</label>
<input type="text" name="bno" id="bnoPatch">
<label>제목</label>
<input type="text" name="title" id="titlePatch">
<label>내용</label>
<input type="text" name="content" id="contentPatch">
<button id="ok">수정</button>
</form>

</body>
<script
  src="https://code.jquery.com/jquery-2.2.4.js"
  integrity="sha256-iT6Q9iMJYuQiMWNd9lDyBUStIq/8PuOW33aOqmvFpqI="
  crossorigin="anonymous"></script>
<script>
$(document).ready(function(){
	$("#listAll").on("click",function(e){
		self.location="/api2/test/list"
	});
	$("#f2").on("click",function(e){
		e.preventDefault();
		var b1 = $("#b1").val();
		$.ajax({
			url:"/api2/test/list/"+b1,
			type:"get",
			data:{
				bno:b1
			}
		}).done(function(data){
			self.location="/api2/test/list/"+b1;
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
		var $this=$(this);
		console.log($this);
	/* 	$("#upform").attr("action","/api2/test/custom/"+bno); */
		$("#upform").submit();
		
	 });
});
</script>
</html>