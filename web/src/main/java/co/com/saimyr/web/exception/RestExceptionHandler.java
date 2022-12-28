package co.com.saimyr.web.exception;

import co.com.saimyr.domain.exception.BaseException;
import co.com.saimyr.domain.exception.DuplicateException;
import co.com.saimyr.domain.exception.EntityNotFoundException;
import co.com.saimyr.domain.exception.InvalidValueException;
import co.com.saimyr.domain.exception.MaxLengthException;
import co.com.saimyr.domain.exception.MinLengthException;
import co.com.saimyr.domain.exception.NoDataException;
import co.com.saimyr.domain.exception.MandatoryValueException;
import co.com.saimyr.domain.exception.validation.DomainValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.concurrent.ConcurrentHashMap;

@RestControllerAdvice
public class RestExceptionHandler {
    private static final Logger LOGGER = LoggerFactory.getLogger(RestExceptionHandler.class);
    private static final ConcurrentHashMap<String, HttpStatus> STATES = new ConcurrentHashMap<>();

    public RestExceptionHandler() {
        STATES.put(DuplicateException.class.getSimpleName(), HttpStatus.CONFLICT);
        STATES.put(InvalidValueException.class.getSimpleName(), HttpStatus.UNPROCESSABLE_ENTITY);
        STATES.put(MaxLengthException.class.getSimpleName(), HttpStatus.UNPROCESSABLE_ENTITY);
        STATES.put(MinLengthException.class.getSimpleName(), HttpStatus.UNPROCESSABLE_ENTITY);
        STATES.put(NoDataException.class.getSimpleName(), HttpStatus.NOT_FOUND);
        STATES.put(EntityNotFoundException.class.getSimpleName(), HttpStatus.NOT_FOUND);
        STATES.put(MandatoryValueException.class.getSimpleName(), HttpStatus.UNPROCESSABLE_ENTITY);
    }

    @ExceptionHandler(BaseException.class)
    public ResponseEntity<Error> exceptionResolver(BaseException e) {
        HttpStatus status = STATES.get(e.getClass().getSimpleName());
        Error err = new Error(e.getClass().getSimpleName(), e.getTechnicalMessage(), e.getHumanMessage());

        return ResponseEntity.status(status).body(err);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Error> exceptionResolver(Exception e) {
        Error err = new Error(e.getClass().getSimpleName(), e.getMessage(), DomainValidator.DEFAULT_MESSAGE);
        LOGGER.error(e.getClass().getSimpleName(), e);

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(err);
    }
}
