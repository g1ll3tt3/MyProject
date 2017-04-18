<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="varUrl" value="${pageContext.request.contextPath }"></c:set>

<!-- Navigation -->
<nav id="mainNav"
	class="navbar navbar-default navbar-fixed-top navbar-custom">
	<div class="container">
		<!-- Brand and toggle get grouped for better mobile display -->
		<div class="navbar-header page-scroll">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target="#bs-example-navbar-collapse-1">
				<span class="sr-only">Toggle navigation</span> Menu <i
					class="fa fa-bars"></i>
			</button>
			<a class="navbar-brand" href="${varUrl }/index">Thang Le</a>
		</div>

		<!-- Collect the nav links, forms, and other content for toggling -->
		<div class="collapse navbar-collapse"
			id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav navbar-right">
				<li class="hidden"><a href="#page-top"></a></li>
				<li class="page-scroll"><a href="#portfolio">Portfolio</a></li>
				<li class="page-scroll"><a href="${varUrl }/about">About</a></li>
				<li class="page-scroll"><a href="#contact">Contact</a></li>
				<li class="page-scroll"><a href="#" id="login-popup">Login</a>
				</li>
			</ul>
		</div>
		<!-- /.navbar-collapse -->
	</div>
	<!-- /.container-fluid -->
</nav>

<!-- Header -->
<header>
	<div class="container" id="maincontent" tabindex="-1">
		<div class="row">
			<div class="col-lg-12">
				<img class="img-responsive" src="${varUrl }/img/profile.png" alt="">

				<div class="intro-text">
					<h1 class="name">Le The Thang</h1>
					<hr class="star-light">
					<span class="skills">Web Developer - Graphic Artist - User
						Experience Designer</span>
				</div>
			</div>
		</div>
	</div>
</header>
