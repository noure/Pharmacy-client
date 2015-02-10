<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="layout/taglib.jsp"%>
<jsp:include page="layout/header.jsp">
	<jsp:param value="pharmacies" name="page" />
	<jsp:param value="localisation" name="title" />
</jsp:include>

</head>
<body>
	<h3> ${id }</h3>

	<div class="map_canvas"></div>


	<f:form commandName="pharmacyForm">
		<f:input name="geocomplete" path="geocomplete" onclick="complet()" />



		<fieldset>

			<h3>Address-Details</h3>


			<label for="lat">Latitude :</label>
			<f:input id="mylat" name="lat" path="latitude" />


			<label for="lng">Longitude :</label>
			<f:input id="mylng" name="lng" path="longitude" />


			<label for="location">Location : </label>
			<f:input id="location" name="location" path="location" />


			<label for="location_type">Location Type</label>
			<f:input name="location_type" path="location_type" />



			<label for="formatted_address">Formatted Address</label>

			<f:input name="formatted_address" path="formatted_address" />

			<label for="administrative_area_level_1">State</label>

			<f:input name="administrative_area_level_1"
				path="administrative_area_level_1" />
			<!-- <br> <input id="find" type="submit" value="Find"
				 /> -->
		</fieldset>
	</f:form>





	<script
		src="http://maps.googleapis.com/maps/api/js?sensor=false&amp;libraries=places"></script>
	<script
		src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>

	<script src="/jquery.geocomplete.js"></script>


	<script>
		$(function() {
			$("#geocomplete").geocomplete({
				map : ".map_canvas",
				details : "form",
				types : [ "geocode", "establishment" ],
			});

			$("#find").click(function() {
				$("#geocomplete").trigger("geocode");
			});
		});
	</script>




	<center><jsp:include page="layout/footer.jsp" /></center>