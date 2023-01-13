package nextstep.exception;

public class DuplicateReservationException extends RoomEscapeException {
    public DuplicateReservationException() {
        super();
    }

    public DuplicateReservationException(String message) {
        super(message);
    }

    public DuplicateReservationException(String message, Throwable cause) {
        super(message, cause);
    }

    public DuplicateReservationException(Throwable cause) {
        super(cause);
    }
}