package com.market.demo.config;

import com.market.demo.config.Controller.ControllerUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.exception.JDBCConnectionException;
import org.omg.CORBA.portable.UnknownException;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.DataAccessResourceFailureException;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.orm.jpa.JpaSystemException;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import javax.persistence.EntityNotFoundException;
import javax.persistence.PersistenceException;
import java.time.DateTimeException;

@ControllerAdvice
public class ExceptionHandlingController {

    /**
     * The Logger.
     */
    private Logger logger = LogManager.getLogger(getClass());

    private Logger syslog = LogManager.getRootLogger();

    /**
     * Catch missing servlet request parameter exception response entity.
     *
     * @param msrpe
     *            the msrpe
     * @return the response entity
     */
    @ExceptionHandler(value = MissingServletRequestParameterException.class)
    public ResponseEntity<Object> catchMissingServletRequestParameterException(
            MissingServletRequestParameterException msrpe) {
        String message = "Params missing";
        logger.warn(message, msrpe);
        return ControllerUtils.createErrorResponseEntity(HttpStatus.BAD_REQUEST, message);
    }

    /**
     * Catch illegal argument exception response entity.
     *
     * @param iae
     *            the iae
     * @return the response entity
     */
    @ExceptionHandler(value = IllegalArgumentException.class)
    public ResponseEntity<Object> catchIllegalArgumentException(IllegalArgumentException iae) {
        logger.warn(iae.getMessage(), iae);
        return ControllerUtils.createErrorResponseEntity(HttpStatus.BAD_REQUEST, iae.getMessage());
    }

    /**
     * Catch persistence exception response entity.
     *
     * @param pe
     *            the pe
     * @return the response entity
     */
    @ExceptionHandler(value = EntityNotFoundException.class)
    public ResponseEntity<Object> catchPersistenceException(PersistenceException pe) {
        logger.warn(pe.getMessage(), pe);
        return ControllerUtils.createErrorResponseEntity(HttpStatus.NOT_FOUND, pe.getMessage());
    }

    /**
     * Catch http message not readable exception response entity.
     *
     * @param hmnre
     *            the hmnre
     * @return the response entity
     */
    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<Object> catchHttpMessageNotReadableException(HttpMessageNotReadableException hmnre) {
        String errorMsg = cutMessageFromDefaultMessage(hmnre.getMessage());
        errorMsg = !StringUtils.isEmpty(errorMsg) ? errorMsg : "Bad Request";
        logger.warn(errorMsg, hmnre);
        return ControllerUtils.createErrorResponseEntity(HttpStatus.BAD_REQUEST, errorMsg);
    }

    /**
     * Catch jdbc connection exception response entity.
     *
     * @param exception
     *            the exception
     * @return the response entity
     */
    @ExceptionHandler(JDBCConnectionException.class)
    public ResponseEntity<Object> catchJDBCConnectionException(JDBCConnectionException exception) {
        String message = "Database Exception";
        logger.error(message, exception);
        return ControllerUtils.createErrorResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR, message);
    }

    /**
     * Catch method argument type mismatch exception response entity.
     *
     * @param matme
     *            the matme
     * @return the response entity
     */
    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public ResponseEntity<Object> catchMethodArgumentTypeMismatchException(MethodArgumentTypeMismatchException matme) {
        String message =  matme.getParameter() == null ? "Param null"
                : "Param type mismatch";
        logger.warn(message, matme);
        return ControllerUtils.createErrorResponseEntity(HttpStatus.BAD_REQUEST, message);
    }

    /**
     * Catch duplicate key exception response entity.
     *
     * @param dke
     *            the dke
     * @return the response entity
     */
    @ExceptionHandler(DuplicateKeyException.class)
    public ResponseEntity<Object> catchDuplicateKeyException(DuplicateKeyException dke) {
        logger.warn(dke.getMessage(), dke);
        return ControllerUtils.createErrorResponseEntity(HttpStatus.BAD_REQUEST, dke.getMessage());

    }

    /**
     * Catch date time exception response entity.
     *
     * @param dte
     *            the dte
     * @return the response entity
     */
    @ExceptionHandler(DateTimeException.class)
    public ResponseEntity<Object> catchDateTimeException(DateTimeException dte) {
        logger.warn(dte.getMessage(), dte);
        return ControllerUtils.createErrorResponseEntity(HttpStatus.BAD_REQUEST, dte.getMessage());
    }

    /**
     * Catch null pointer exception response entity.
     *
     * @param npe
     *            the npe
     * @return the response entity
     */
    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity<Object> catchNullPointerException(NullPointerException npe) {
        String message = npe.getMessage();
        message = !StringUtils.isEmpty(message) ? message : "NullPointerException";
        logger.error(message, npe);
        return ControllerUtils.createErrorResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR, message);
    }

    /**
     * Catch number format exception response entity.
     *
     * @param nfe
     *            the nfe
     * @return the response entity
     */
    @ExceptionHandler(NumberFormatException.class)
    public ResponseEntity<Object> catchNumberFormatException(NumberFormatException nfe) {
        logger.warn(nfe.getMessage(), nfe);
        return ControllerUtils.createErrorResponseEntity(HttpStatus.BAD_REQUEST, nfe.getMessage());
    }

    /**
     * Catch method argument not valid exception response entity.
     *
     * @param manve
     *            the manve
     * @return the response entity
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Object> catchMethodArgumentNotValidException(MethodArgumentNotValidException manve) {
        String mess = cutMessageFromDefaultMessage(manve.getMessage());
        logger.warn(mess, manve);
        return ControllerUtils.createErrorResponseEntity(HttpStatus.BAD_REQUEST, mess);
    }

    /**
     * Catch unknown exception response entity.
     *
     * @param ue
     *            the ue
     * @return the response entity
     */
    @ExceptionHandler(UnknownException.class)
    public ResponseEntity<Object> catchUnknownException(UnknownException ue) {
        logger.error(ue.getMessage(), ue);
        return ControllerUtils.createErrorResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR, ue.getMessage());
    }

    /**
     * Catch db connection exception response entity.
     *
     * @param ue
     *            the ue
     * @return the response entity
     */
    @ExceptionHandler({ JpaSystemException.class, DataAccessResourceFailureException.class,
            HibernateException.class, DataAccessException.class })
    public ResponseEntity<Object> catchDBConnectionException(RuntimeException ue) {
        String message = "Connection db ";
        logger.error(message, ue);
        return ControllerUtils.createErrorResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR, message);
    }

    private String cutMessageFromDefaultMessage(String defaultMessage) {
        if (defaultMessage.contains("*")) {
            int begin = defaultMessage.indexOf("*");
            int end = defaultMessage.indexOf("#");
            return defaultMessage.substring(begin + 1, end);
        }
        return null;
    }
}
