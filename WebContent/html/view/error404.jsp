<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="vi">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta name="viewport" content="width=device-width,initial-scale=1" />
	
	<style type="text/css">
		html, body {
			width: 100%;
			height: 100%;
			margin: 0;
			padding: 0;
			background-color: #000;
		}
		
		.bg-img {
			position: absolute;
			width: 100%;
			height: 100%;
			background: url(img/nothing_to_see_here_naked_gun.gif) no-repeat center
				center fixed;
			background-size: cover;
			background-color: #000;
			opacity: .5;
			filter: alpha(opacity = 50);
		}
		
		.content {
			font-family: 'Avenir-Next', Avenir, Helvetica, sans-serif;
			color: #fff;
			background-color: none;
			z-index: 2;
			position: absolute;
			top: 50%;
			-webkit-transform: translateY(-50%);
			-ms-transform: translateY(-50%);
			transform: translateY(-50%);
		}
		
		.container {
			width: 970px;
			padding-right: 15px;
			padding-left: 15px;
			margin-right: auto;
			margin-left: auto;
		}
		
		h1 {
			font-size: 160px;
			margin-bottom: 0;
			margin-top: 0;
		}
		
		h2 {
			margin-top: 0;
			max-width: 700px;
			font-size: 30px;
			width: 90%;
		}
		
		p {
			text-align: left;
			padding-bottom: 32px;
		}
		
		a {
			text-decoration: none;
			color: white;
		}
		
		a:hover {
			color: red;
			text-decoration: none;
		}
		
		.btn {
			display: inline-block;
			border: 1px solid #aaa;
			border-radius: 40px;
			padding: 15px 30px;
			margin-right: 15px;
			margin-bottom: 10px;
		}
		
		.btn:hover {
			color: #e2e2e2;
			background: rgba(255, 255, 255, 0.1);
		}
		
		@media only screen and (max-width: 480px) {
			.btn {
				background-color: white;
				color: #444444;
				width: 100%;
			}
			h1 {
				font-size: 120px;
			}
		}
		/*Thats all. I hope you enjoyed it.
		Thanks :)*/
		/***************************************************************/
		/*************** Footer Bar Style ******************************/
		/***************************************************************/
		/*.footer-bar
		{
		    display: block;
		    width: 100%;
		    height: 45px;
		    line-height: 45px;
		    background: #111;
		    border-top: 1px solid #E62600;
		    position: fixed;
		    bottom: 0;
		    left: 0;
		}
		.footer-bar .article-wrapper{
		    font-family: arial, sans-serif;
		    font-size: 14px;
		    color: #888;
		    float: left;
		    margin-left: 10%;
		}
		.footer-bar .article-link a, .footer-bar .article-link a:visited{
		    text-decoration: none;
		    color: #fff;
		}
		.site-link a, .site-link a:visited{
		    color: #888;
		    font-size: 14px;
		    font-family: arial, sans-serif;
		    float: right;
		    margin-right: 10%;
		    text-decoration: none;
		}
		.site-link a:hover{
		    color: #E62600;
		}*/
	</style>
</head>
<body>
	<div class="container">
		<div class="row content">
			
			<div class="col-lg-12">
				<h1>404</h1>
				<h2>Oops, the page you're looking for does not exist.</h2>
				<p>
					You may want to head back to the homepage. <br>If you think
					something is broken, report a problem.</br>
				</p>
				<span class='btn'><a href="index">RETURN HOME</a></span>
				<span class='btn'>REPORT PROBLEM</span>
				

			</div>
		</div>
	</div>
	<div class='bg-img'></div>
</body>
</html>