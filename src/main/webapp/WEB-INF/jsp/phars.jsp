<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="layout/taglib.jsp"%>
<jsp:include page="layout/header.jsp">
	<jsp:param value="pharmacies" name="page" />
	<jsp:param value="tout les pharmacies" name="title" />
</jsp:include>
<script type="text/javascript">
	$(document).ready(function() {
		//alert("test");
		$('#pharTable').DataTable({
			"sPaginationType" : "full_numbers",
		});
	});
</script>
<title>pharmacies agadir</title>
</head>
<body>
	<h1>pharmacies agadir</h1>


	<br>
	<br>

	<table id="pharTable" border="1" style="width: 100%"
		class="table table-bordered table-hover table-striped">
		<thead>
			<tr>
				<th>Pharmacie Name</th>
				<th>Pharmacie adresse</th>
				<th>Pharmacie tél</th>
				<th>See it google maps</th>

			</tr>
		</thead>
		<tbody>
			<c:forEach var="phar" items="${phares}">
				<tr>
					<td>${phar.name}</td>
					<td>${phar.adress}</td>
					<td>${phar.tele}</td>
					<td><a href="<spring:url value="/client/find/${phar.id}"/>">Show
							it</a></td>
				</tr>
			</c:forEach>

		</tbody>
	</table>



<center><jsp:include page="layout/footer.jsp" /></center>
