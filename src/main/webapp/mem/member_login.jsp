<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SHOP: LOGIN</title>
</head>
<body>
	<%	Object login_obj=session.getAttribute("login");
		Object id=session.getAttribute("id");
		if(login_obj!=null && !((boolean)login_obj)){
			session.removeAttribute("login");// 세션 객체 삭제
			//session.invalidate();//세션을 만료해서 모두 삭제 
	%>
	<script>
		alert("아이디와 패스워드를 확인하세요!");
	</script>
	<%}	
		
	Object login_msg=session.getAttribute("login_msg");
	if(login_msg!=null){
		session.removeAttribute("login_msg");
	%>
	<script>alert("<%=login_msg%>")</script>
	<%}%>
	
	<header>
		<%@include file="/header_nav.jsp"%>		
	</header>
	<main>
		<div class="login_container">
			<div class="login_wrap">
				<form action="<%=request.getContextPath()%>/login.do" method="POST">
					<div class="input_row">
						<input type="text" name="id" placeholder="아이디">
					</div>
					<div class="input_row">
						<input type="password" name="pw" placeholder="비밀번호">
					</div>
					<div class="login_btn_wrap">
						<button type="submit" class="login_btn">
							<span>로그인</span>
						</button>
					</div>
				</form>
			</div>
			<div class="find_wrap">
				<a href="#">아이디 찾기</a>
				<a href="#">비밀번호 찾기</a>
				<a href="./insert.do">회원가입</a>
			</div>
		</div>
	</main>
	<footer>
		
	</footer>
</body>
</html>