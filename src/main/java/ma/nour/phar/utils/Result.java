
package ma.nour.phar.utils;

import lombok.Data;
import ma.nour.geocode.AddressComponent;
import ma.nour.geocode.AddressType;
import ma.nour.geocode.Geometry;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 * @author noureddine
 *
 */
@JsonAutoDetect()
@Data
public class Result {

    @JsonProperty("address_components")
    private AddressComponent[] addressComponents;
    
    @JsonProperty("formatted_address")
    private String formattedAddress;

    @JsonProperty("geometry")
    private Geometry geometry;

    @JsonProperty("types")
    private AddressType[] types;

    @JsonProperty("partial_match")
    private String partialMatch;

   

}
