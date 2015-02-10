<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="layout/taglib.jsp"%>
<jsp:include page="layout/header.jsp">
	<jsp:param value="garde" name="page" />
	<jsp:param value="tout les pharmacies de garde" name="title" />
</jsp:include>
<h1>pharmacies agadir de garde</h1>


<table border="1" style="width: 100%" id="pharTable"
	class="table table-bordered table-hover table-striped">
	<thead>
		<tr>
			<th>Pharmacie Name</th>
			<th>Pharmacie adresse</th>
			<th>Pharmacie tél</th>
			<th>See it on google maps</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="phar" items="${pharesgarde}">
			<tr>
				<td>${phar.name}</td>
				<td>${phar.adress}</td>
				<td>${phar.tele}</td>
				<td><a href="<spring:url value="/client/find/${phar.id}"/>">
						Show it</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>

<script type="text/javascript">
	$(document).ready(function() {
		//alert("test");
		$('#pharTable').DataTable({
			"sPaginationType" : "full_numbers",
		});
	});
</script>

<center><jsp:include page="layout/footer.jsp" /></center>
