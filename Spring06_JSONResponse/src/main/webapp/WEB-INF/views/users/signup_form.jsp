<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="${pageContext.request.contextPath }/resources/css/bootstrap.css" />
</head>
<body>
<div class="container">
	<h3>회원 가입 폼입니다.</h3>
	<form action="signup.do" method="post">
		<label for="id">아이디</label>
		<input type="text" name="id" id="id"/>
		<button id="checkBtn">중복확인</button>
		<span id="checkResult"></span>
		<br />
		<button type="submit">가입</button>
	</form>
</div>
<script src="${pageContext.request.contextPath }/resources/js/jquery-3.3.1.min.js"></script>
<script>
	$("#checkBtn").on("click",function(){
		var inputId=$("#id").val();
		
		$.ajax({
			url:"checkid.do",
			method:"get",
			data:{inputId:inputId},
			success:function(responseData){
				/* console.log(responseData); */
				if(responseData.canUse){
					$("#checkResult").text("사용가능");
				}else{
					$("#checkResult").text("사용불가");
				}
			}
		});
		return false;
	});
</script>
</body>
</html>