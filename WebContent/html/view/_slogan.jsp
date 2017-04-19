<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="varUrl" value="${pageContext.request.contextPath }"></c:set>

<!-- Header -->
<header>
	<div class="container" id="maincontent" tabindex="-1">
		<div class="row">
			<div class="col-lg-12">
				<img class="img-responsive" src="${varUrl }/img/profile.png" alt="">

				<div class="intro-text">
					<h1 class="name">Le The Thang</h1>
					<hr class="star-light">
					<span class="skills">Web Developer - Graphic Artist - User Experience Designer</span>
				</div>
			</div>
		</div>
	</div>
</header>