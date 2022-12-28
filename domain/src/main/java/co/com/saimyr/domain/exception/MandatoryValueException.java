package co.com.saimyr.domain.exception;

public class MandatoryValueException extends BaseException {
    public MandatoryValueException(String technicalMessage, String humanMessage) {
        super(technicalMessage, humanMessage);
    }
}
