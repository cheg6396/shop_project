<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
	<h3>정보 입력</h3>
	<form action="<%=request.getContextPath()%>/insert.do" method="post">
		<p>
			<label>
				아이디 <input type="text" name="id">
			</label>
		</p>
		<p>
			<label>
				비밀번호 <input type="password" name="pw">
			</label>
		</p>
		<p>
			<label>
				비밀번호 확인 <input type="password" name="pwCheck">
			</label>
		</p>
		<p>
			<label>
				이름 <input type="text" name="name">
			</label>
		</p>
		<p>
			<label>
				생년월일 <input type="text" name="birth">
			</label>
		</p>
		<p>
			<label>
				이메일 <input type="text" name="email">
			</label>
		</p>
		<p>
			<label>
				휴대폰 <input type="text" name="phoneNum">
			</label>		
		<h3>이용 약관</h1>
		<div class="checkBox">
			<label>
				<input type="checkbox">
				약관 전체 동의
			</label>
		</div>
		<div>
			<label>
				<input type="checkbox">
				이용약관
			</label>
			<label>
				<input type="checkbox">
				개인정보 수집 및 이용 안내
			</label>
			<label>
				<input type="checkbox">
				개인정보 제 3자 제공 동의
			</label>
		</div>
		<button type="submit">제출하기</button>
	</form>
</body>
</html>