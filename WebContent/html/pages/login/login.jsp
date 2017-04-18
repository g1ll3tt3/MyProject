<div id="login-frame">
	<form action="auth/loginProcess" method="post" role="form">
		<span id="close" onclick="close"
			class="glyphicon glyphicon-remove-circle pull-right"></span>

		<div class="form-group">
			<label for="account.username">Username</label> <input type="text"
				class="form-control" name="username" id="username"
				placeholder="Enter username">
		</div>
		<div class="form-group">
			<label for="account.password">Password</label> <input type="password"
				name="password" class="form-control" id="password"
				placeholder="Enter Password">
		</div>

		<button type="submit" class="btn btn-danger">Submit</button>

	</form>
</div>