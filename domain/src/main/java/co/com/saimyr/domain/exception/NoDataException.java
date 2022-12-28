package co.com.saimyr.domain.exception;

public class NoDataException extends BaseException {
    public NoDataException(String technicalMessage, String humanMessage) {
        super(technicalMessage, humanMessage);
    }
}
