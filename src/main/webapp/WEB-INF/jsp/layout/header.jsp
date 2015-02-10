<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="taglib.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" charset="utf8"
	src="http://cdn.datatables.net/1.10.4/js/jquery.dataTables.min.js"></script>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">


<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap-theme.min.css">


<!-- DataTables CSS -->
<link rel="stylesheet" type="text/css"
	href="http://cdn.datatables.net/1.10.4/css/jquery.dataTables.css">

<!-- jQuery -->
<script type="text/javascript" charset="utf8"
	src="http://code.jquery.com/jquery-1.10.2.min.js"></script>

<!-- DataTables -->
<script type="text/javascript" charset="utf8"
	src="http://cdn.datatables.net/1.10.4/js/jquery.dataTables.js"></script>
	
<link rel="stylesheet" type="text/css" href="/styles.css" />
<style type="text/css" media="screen">
.map_canvas {
	float: left;
}

form {
	width: 300px;
	float: left;
}

fieldset {
	width: 320px;
	margin-top: 20px
}

fieldset label {
	display: block;
	margin: 0.5em 0 0em;
}

fieldset input {
	width: 95%;
}
</style>

<title>${param.title}</title>
</head>
<body>

	<div class="navbar navbar-inverse navbar-fixed-top">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-collapse">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
			 	</button>
				<a class="navbar-brand" href="<c:url value='/index' />">Pharmacies</a>
			</div>
			<div class="collapse navbar-collapse">
				<ul class="nav navbar-nav">
					<li class=${param.page == 'home' ? 'active' : ''}><a
						href="<c:url value='/index' />">Home</a></li>
					<li class=${param.page == 'pharmacies' ? 'active' : ''}><a
						href="<c:url value='/client/pharmacies' />">Tout les
							Pharmacies</a></li>
					<li class=${param.page == 'garde' ? 'active' : ''}><a
						href="<c:url value='/client/pharmaciesgarde' />">Pharmacies
							Gardes</a></li>
				</ul>
			</div>
		</div>
	</div>

	<div class="container">

		<br />
		<br />