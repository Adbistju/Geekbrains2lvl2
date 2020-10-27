public class ErrorsProgramException extends RuntimeException {
    public ErrorsProgramException() {
        super();
    }

    public ErrorsProgramException(String message) {
        super(message);
    }

    public ErrorsProgramException(String message, Throwable cause) {
        super(message, cause);
    }
}