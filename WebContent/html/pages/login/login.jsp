<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<c:set var="varUrl" value="${pageContext.request.contextPath }"></c:set>

<style>
	.login-panel{
		margin-top:150px;
	}
</style>

<div class="container">
	<div class="row">
		
		<div class="col-md-4 col-md-offset-4">
			<div class="login-panel panel panel-default">
				<div class="panel-heading">
					<h3 class="panel-title">Please Sign In</h3>
				</div>
				<div class="panel-body">
					<form action="${varUrl }/auth/checkLogin" method="post" role="form">
						<s:if test="hasActionErrors()">
						   <div class="errors">
						      <s:actionerror/>
						   </div>
						</s:if>
					
						<fieldset>
							<div class="form-group">
								<input class="form-control" placeholder="Account" name="account.username" type="text" autofocus>
							</div>
							<div class="form-group">
								<input class="form-control" placeholder="Password" name="account.password" type="password" value="">
							</div>
							<div class="checkbox">
								<label> <input name="remember" type="checkbox" value="Remember Me">Remember Me
								</label>
							</div>
							<!-- Change this to a button or input when using this as a form -->
							<input type="submit" value="Login" class="btn btn-lg btn-success btn-block" />
						</fieldset>
					</form>
				</div>
			</div>
		</div>
	</div>
</div>