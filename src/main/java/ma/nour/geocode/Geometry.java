package ma.nour.geocode;

import lombok.Data;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 * @author noureddine
 *
 */

@JsonAutoDetect
@Data
public class Geometry {

	public enum Type {

		ROOFTOP, RANGE_INTERPOLATED, GEOMETRIC_CENTER, APPROXIMATE
	}

	@JsonProperty("location")
	private GeoCoordinate location;
	@JsonProperty("location_type")
	private Type locationType;
	@JsonProperty("viewport")
	private BoundingBox viewport;
	@JsonProperty("bounds")
	private BoundingBox bounds;

}
