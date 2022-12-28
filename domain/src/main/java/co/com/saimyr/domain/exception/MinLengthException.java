package co.com.saimyr.domain.exception;

public class MinLengthException extends BaseException {
    public MinLengthException(String technicalMessage, String humanMessage) {
        super(technicalMessage, humanMessage);
    }
}
