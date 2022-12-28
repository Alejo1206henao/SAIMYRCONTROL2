package co.com.saimyr.domain.exception;

public class EntityNotFoundException extends BaseException {
        private static final String ERROR_MESSAGE = "La entidad %d no existe en SAIMYR.";

        public EntityNotFoundException(long entityId) {
            super(String.format(ERROR_MESSAGE, entityId), String.format(ERROR_MESSAGE, entityId));
        }
}
