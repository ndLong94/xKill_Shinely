package com.market.demo.config.Controller;

import com.market.demo.dto.ErrorDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by GiangHHT1 on 8/2/2016.
 *
 * @author GiangHHT1
 */
public class ControllerUtils {
    private static final String RESULT = "result";
    private static final String ERROR = "error";
    private static final String ERROR_DELIMITER = " | ";
    private static final String ERROR_DELIMITER_REGEX = "\\s[|]\\s";
    /**
     * Create success response entity result response entity.
     *
     * @param successResult
     *            the success result
     * @param httpStatus
     *            the http status
     * @return the response entity
     */
    public static ResponseEntity<Object> createSuccessResponseEntityResult(Object successResult,
            HttpStatus httpStatus) {
        Map<String, Object> response = new LinkedHashMap<>();
        response.put(RESULT, successResult);
        return new ResponseEntity<>(response, httpStatus);
    }

    /**
     * Create error response entity response entity.
     *
     * @param httpStatus
     *            the http status
     * @param message
     *            the message
     * @return the response entity
     */
    public static ResponseEntity<Object> createErrorResponseEntity(HttpStatus httpStatus, String message) {
        Map<String, Object> response = new LinkedHashMap<>();

        ErrorDTO errorDTO = new ErrorDTO();
        if (message.contains(ERROR_DELIMITER)) {
            String[] tmp = message.split(ERROR_DELIMITER_REGEX);
            errorDTO.setCode(tmp[0]);
            errorDTO.setMessage(tmp[1]);
        } else {
            errorDTO.setCode(httpStatus.toString());
            errorDTO.setMessage(message);
        }
        response.put(ERROR, errorDTO);

        return new ResponseEntity<>(response, httpStatus);
    }

    /**
     * Create success response entity response entity.
     *
     * @param successResult
     *            the success result
     * @param httpStatus
     *            the http status
     * @return the response entity
     */
    public static ResponseEntity<Object> createSuccessResponseEntity(Object successResult, HttpStatus httpStatus) {
        return new ResponseEntity<>(successResult, httpStatus);
    }

    private ControllerUtils() {
        throw new IllegalAccessError("Utility class");
    }
}