<!-- View class for Login form-->

<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title>Struts2 CZ3002-Assignment Login</title>
		<!--===============================================================================================-->
		<link rel="stylesheet" type="text/css" href="util.css">
		<link rel="stylesheet" type="text/css" href="main.css">
		<!--===============================================================================================-->
	</head>
<body>
	<div class="limiter">
		<div class="container-login100">
			<div class="wrap-login100 p-t-50 p-b-90">
				<s:form action="login" method="POST" class="login100-form validate-form flex-sb flex-w">
					<span class="login100-form-title p-b-51"> Login </span>
					<s:textfield name="username" label="Username" class="input100" placeholder="Username" />
					<s:password name="password" label="Password" class="input100" placeholder="Password" />

					<div class="container-login100-form-btn m-t-17">
						<s:submit value="Login" class="login100-form-btn" />
					</div>
				</s:form>
				<br><br>
				<div><b>Username: cz3002 and password: cz3002</b></div>
				<br><br>
				<font color="red" size="3"><b><s:actionerror /></b></font>
			</div>
		</div>
	</div>
</body>

</html>