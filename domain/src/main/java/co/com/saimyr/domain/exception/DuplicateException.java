package co.com.saimyr.domain.exception;

public class DuplicateException extends BaseException {
    public DuplicateException(String technicalMessage, String humanMessage) {
        super(technicalMessage, humanMessage);
    }
}
