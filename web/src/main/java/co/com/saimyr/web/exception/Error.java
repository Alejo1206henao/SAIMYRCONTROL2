package co.com.saimyr.web.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Error {
    private String exceptionName;
    private String technicalMessage;
    private String humanMessage;
}
