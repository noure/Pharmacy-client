package ma.nour.phar.utils;

import lombok.Data;

/**
 * 
 * @author noureddine
 *
 */
@Data
public class PharmacyForm {

	String geocomplete;
	
	float latitude;
	
	float longitude;
	
	String location;
	
	String location_type;
	
	String formatted_address;
	
	//String country;
	
	//String country_short;
	
	String administrative_area_level_1;

}
