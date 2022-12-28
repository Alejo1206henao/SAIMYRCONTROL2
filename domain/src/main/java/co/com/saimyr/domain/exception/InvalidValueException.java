package co.com.saimyr.domain.exception;

public class InvalidValueException extends BaseException {
    public InvalidValueException(String technicalMessage, String humanMessage) {
        super(technicalMessage, humanMessage);
    }
}
