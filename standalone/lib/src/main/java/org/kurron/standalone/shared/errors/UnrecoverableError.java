package org.kurron.standalone.shared.errors;

/**
 * Root of all errors that the caller has no hope of recovering from.
 */
public class UnrecoverableError extends RuntimeException {
    public UnrecoverableError() {
    }

    public UnrecoverableError( final String message ) {
        super(message);
    }

    public UnrecoverableError( final String message, final Throwable cause ) {
        super(message, cause);
    }

    public UnrecoverableError( final Throwable cause ) {
        super(cause);
    }

    public UnrecoverableError( final String message, final Throwable cause, final boolean enableSuppression, final boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
