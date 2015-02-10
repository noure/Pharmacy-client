
package ma.nour.geocode;

import lombok.Data;


/**
 * 
 * @author noureddine
 *
 */

@Data
public class BoundingBox {
    private GeoCoordinate southwest;

    private GeoCoordinate northeast;


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((northeast == null) ? 0 : northeast.hashCode());
        result = prime * result
                + ((southwest == null) ? 0 : southwest.hashCode());
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
        BoundingBox other = (BoundingBox) obj;
        if (northeast == null) {
            if (other.northeast != null) {
                return false;
            }
        } else if (!northeast.equals(other.northeast)) {
            return false;
        }
        if (southwest == null) {
            if (other.southwest != null) {
                return false;
            }
        } else if (!southwest.equals(other.southwest)) {
            return false;
        }
        return true;
    }


}
