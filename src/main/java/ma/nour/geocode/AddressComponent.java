package ma.nour.geocode;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Arrays;

import lombok.Data;

/**
 * @author Labihi Nour
 */
@JsonAutoDetect
@Data
public class AddressComponent implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@JsonProperty("long_name")
	private String longName;
	@JsonProperty("short_name")
	private String shortName;

	@JsonProperty("types")
	private AddressType[] types;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((longName == null) ? 0 : longName.hashCode());
		result = prime * result
				+ ((shortName == null) ? 0 : shortName.hashCode());
		result = prime * result + Arrays.hashCode(types);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		AddressComponent other = (AddressComponent) obj;
		if (longName == null) {
			if (other.longName != null) {
				return false;
			}
		} else if (!longName.equals(other.longName)) {
			return false;
		}
		if (shortName == null) {
			if (other.shortName != null) {
				return false;
			}
		} else if (!shortName.equals(other.shortName)) {
			return false;
		}
		if (!Arrays.equals(types, other.types)) {
			return false;
		}
		return true;
	}

}
