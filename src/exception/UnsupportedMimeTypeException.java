package exception;

/**
 * Raised when an unsupported mime type encountered.
 */
public class UnsupportedMimeTypeException extends Exception {
    public UnsupportedMimeTypeException() {
        super();
    }

    public UnsupportedMimeTypeException(String msg) {
        super(msg);
    }
}
