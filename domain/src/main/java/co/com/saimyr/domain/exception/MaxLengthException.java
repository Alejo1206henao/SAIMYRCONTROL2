package co.com.saimyr.domain.exception;

public class MaxLengthException extends BaseException {
    public MaxLengthException(String technicalMessage, String humanMessage) {
        super(technicalMessage, humanMessage);
    }
}
