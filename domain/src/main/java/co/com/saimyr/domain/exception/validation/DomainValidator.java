package co.com.saimyr.domain.exception.validation;

import co.com.saimyr.domain.exception.InvalidValueException;
import co.com.saimyr.domain.exception.MandatoryValueException;
import co.com.saimyr.domain.exception.MaxLengthException;
import co.com.saimyr.domain.exception.MinLengthException;
import co.com.saimyr.domain.exception.NoDataException;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class  DomainValidator {
    public static final String LETTERS_ONLY_PATTERN = "^[a-zA-ZáéíóúÁÉÍÓÚñÑ?¿ ]+$";
    public static final String NUMBERS_ONLY_PATTERN = "[0-9]+";
    public static final String NUMBERS_DECIMAL_PATTERN = "^[+-]?([0-9]+\\.?[0-9]*|\\.[0-9]+)$";
    public static final String LETTERS_AND_NUMBERS_PATTERN = "^[\\w\\sáéíóúÁÉÍÓÚñÑ]+$";
    public static final String EMAIL_PATTERN = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";

    public static final String FIELD_MANDATORY = "El campo %s es obligatorio.";
    public static final String DEFAULT_MESSAGE = "Ocurrió un error procesando la solicitud. Por favor contacta al administrador del sistema.";

    private DomainValidator() {}

    public static void validateMandatory(Object value, String technicalMessage, String humanMessage) {
        if (value == null || (value instanceof String && ((String) value).trim().isEmpty())) {
            throw new MandatoryValueException(technicalMessage, humanMessage);
        }
    }

    public static void validateMandatory(Object value, String technicalMessage) {
        if (value == null || (value instanceof String && ((String) value).trim().isEmpty())) {
            throw new MandatoryValueException(technicalMessage, DEFAULT_MESSAGE);
        }
    }

    public static void validateEquals(Object value, Object expectedValue, String technicalMessage, String humanMessage) {
        if (!expectedValue.equals(value)) {
            throw new InvalidValueException(technicalMessage, humanMessage);
        }
    }

    public static void validateDifferent(Object value, Object unexpectedValue, String technicalMessage, String humanMessage) {
        if (unexpectedValue.equals(value)) {
            throw new InvalidValueException(technicalMessage, humanMessage);
        }
    }

    public static void validateLessThan(Double valueToBeLower, Double valueToBeHigher, String technicalMessage, String humanMessage) {
        if (valueToBeLower != null && valueToBeHigher != null && valueToBeLower >= valueToBeHigher) {
            throw new InvalidValueException(technicalMessage, humanMessage);
        }
    }

    public static void validateGreaterThan(Double valueToBeHigher, Double valueToBeLower, String technicalMessage, String humanMessage) {
        if (valueToBeLower != null && valueToBeHigher != null && valueToBeHigher <= valueToBeLower) {
            throw new InvalidValueException(technicalMessage, humanMessage);
        }
    }

    public static void validateNumber(String value, String technicalMessage, String humanMessage) {
        try {
            if (value != null) Double.parseDouble(value);
        } catch (NumberFormatException exception) {
            throw new InvalidValueException(technicalMessage, humanMessage);
        }
    }

    public static void validatePositive(Double value, String technicalMessage, String humanMessage) {
        if (value != null && value <= 0) {
            throw new InvalidValueException(technicalMessage, humanMessage);
        }
    }

    public static void validateMinLength(String value, int minLength, String technicalMessage, String humanMessage) {
        if (value != null && value.length() < minLength) {
            throw new MinLengthException(technicalMessage, humanMessage);
        }
    }

    public static void validateMaxLength(String value, int maxLength, String technicalMessage, String humanMessage) {
        if (value != null && value.length() > maxLength) {
            throw new MaxLengthException(technicalMessage, humanMessage);
        }
    }

    public static void validateMinMaxLength(String value, int minLength, int maxLength, String technicalMessage, String humanMessage) {
        validateMinLength(value, minLength, technicalMessage, humanMessage);
        validateMaxLength(value, maxLength, technicalMessage, humanMessage);
    }

    public static void validateBefore(LocalDate dateToBeBefore, LocalDate dateToBeAfter, String technicalMessage, String humanMessage) {
        if (dateToBeBefore != null && dateToBeAfter != null && dateToBeBefore.isAfter(dateToBeAfter)) {
            throw new InvalidValueException(technicalMessage, humanMessage);
        }
    }

    public static void validateBefore(LocalDateTime dateToBeBefore, LocalDateTime dateToBeAfter, String technicalMessage, String humanMessage) {
        if (dateToBeBefore != null && dateToBeAfter != null && dateToBeBefore.isAfter(dateToBeAfter)) {
            throw new InvalidValueException(technicalMessage, humanMessage);
        }
    }

    public static void validateAfter(LocalDate dateToBeAfter, LocalDate dateToBeBefore, String technicalMessage, String humanMessage) {
        if (dateToBeAfter != null && dateToBeBefore != null && dateToBeAfter.isBefore(dateToBeBefore)) {
            throw new InvalidValueException(technicalMessage, humanMessage);
        }
    }

    public static void validateAfter(LocalDateTime dateToBeAfter, LocalDateTime dateToBeBefore, String technicalMessage, String humanMessage) {
        if (dateToBeAfter != null && dateToBeBefore != null && dateToBeAfter.isBefore(dateToBeBefore)) {
            throw new InvalidValueException(technicalMessage, humanMessage);
        }
    }

    public static void validateRegex(String value, String regex, String technicalMessage, String humanMessage) {
        if (value != null && !value.matches(regex)) {
            throw new InvalidValueException(technicalMessage, humanMessage);
        }
    }

    public static <T> void validateNonEmpty(List<T> list, String technicalMessage, String humanMessage) {
        if (list == null || list.isEmpty()) {
            throw new NoDataException(technicalMessage, humanMessage);
        }
    }

    public static <T> void validateContains(T value, List<T> list, String technicalMessage, String humanMessage) {
        if (list != null && !list.contains(value)) {
            throw new InvalidValueException(technicalMessage, humanMessage);
        }
    }

    public static String formattedMessage(String baseMessage, Object... values) {
        return String.format(baseMessage, values);
    }

    public static String mandatoryMessage(String field) {
        return formattedMessage(FIELD_MANDATORY, field);
    }
}
