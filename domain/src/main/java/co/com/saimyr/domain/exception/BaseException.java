package co.com.saimyr.domain.exception;

import lombok.Getter;

@Getter
public abstract class BaseException extends RuntimeException {
    private final String technicalMessage;
    private final String humanMessage;

    protected BaseException(String technicalMessage, String humanMessage) {
        super(technicalMessage);
        this.technicalMessage = technicalMessage;
        this.humanMessage = humanMessage;
    }
}
