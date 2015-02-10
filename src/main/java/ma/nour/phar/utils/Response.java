
package ma.nour.phar.utils;

import lombok.Data;

/**
 * @author LABIHI Nour
 */
@Data
public class Response {

    public static enum Status {

        OK,
        ZERO_RESULTS,
        OVER_QUERY_LIMIT,
        REQUEST_DENIED,
        INVALID_REQUEST
    }

    private Status status;
    private Result[] results;

   
}
