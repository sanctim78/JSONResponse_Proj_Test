<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/views/home.jsp</title>
<link rel="stylesheet" href="${pageContext.request.contextPath }/resources/css/bootstrap.css" />
</head>
<body>
<h3>인덱스 페이지 입니다.</h3>
<ul> 
	<li><a href="json01.do">json 응답1</a></li>
	<li><a href="json02.do">json 응답2</a></li>
	<li><a href="json03.do">json 응답3</a></li>
	<li><a href="json04.do">json 응답4</a></li>
	<li><a href="json05.do">json 응답5</a></li>
	<li><a href="json06.do">json 응답6</a></li>
	<li><a href="json07.do">json 응답7</a></li>
	<li><a href="json08.do">json 응답8</a></li>
	<li><a href="xml01.do">xml 응답1</a></li>
	<li><a href="xml02.do">xml 응답2</a></li>
	<li><a href="xml03.do">xml 응답3</a></li>
	<li><a href="xml04.do">xml 응답4</a></li>
	<li><a href="users/signup_form.do">회원가입폼예제</a></li>
	<li><a href="download.do?num=1000">파일 다운로드(abstract view 테스트)</a></li>
	
</ul>
<h3>친구목록입니다.</h3>

<ul class="friendList" id="friendList">
	
</ul>
<button class="getBtn" id="getBtn">목록받아오기</button>

<h4>공지사항</h4>
<ul>
	<c:forEach var="tmp" items="${noticeList }">
		<li>${tmp }</li>
	</c:forEach>
</ul>

<script src="${pageContext.request.contextPath }/resources/js/jquery-3.3.1.min.js">	</script>
<script>
	$("#getBtn").on("click",function(){
		/* var inputId=$("#id").val(); */
		
		$.ajax({
			url:"friendlist.do",
			method:"get",
			/* data:{inputId:inputId}, */
			success:function(responseData){
				console.log(responseData);
				$("friendListl li").remove(); //모든요소를 일단 지우고
				//반복문 돌면서 li 요소에 하나씩 데이터를 추가해 준다.
				for(var i=0; i<responseData.length; i++){
					var tmp=responseData[i];
				 	/* $("#friendList").append("<li>" + responseData + "</li>"); */
				 	$("<li/>").text(tmp).appendTo("#friendList");
				}
			/* console.log(responseData); */
			
			}
		});
		//return false;
	});
</script>
</body>
</html>





