<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<head>
<title>헌혈의 집 관리 시스템 로그인</title>
</head>
<link rel="stylesheet" href="resources/css/login/login.css" />
<div class="loginpage">
	<div class="logindiv">
		<h1 class="loginh1">로그인</h1>

		<div class="login_blank"></div>

		<form action="/login" method="post">
		<div class="login_pw_form">
			<div class="image_placeholder">
				<img src="resources/images/person-icon.png"> 
				<input type ="text" name="userCode" class="login_pw" placeholder="아이디">
			</div>

			<div class="blank"></div>

			<div class="image_placeholder">
				<img src="resources/images/key-icon.png"> 
				<input type="password" name="password" class="login_pw" placeholder="비밀번호">
			</div>
		</div>
		<div class="blank"></div>

		<div class="blank"></div>
		<input type="submit" class="pinkButton" value="로그인">
		</form>
	</div>
</div>