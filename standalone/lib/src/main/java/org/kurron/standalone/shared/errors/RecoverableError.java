package org.kurron.standalone.shared.errors;

/**
 * Root of all errors that the caller may be able to recover from.
 */
public class RecoverableError extends Exception {
    public RecoverableError() {
    }

    public RecoverableError( final String message ) {
        super(message);
    }

    public RecoverableError( final String message, final Throwable cause ) {
        super(message, cause);
    }

    public RecoverableError( final Throwable cause ) {
        super(cause);
    }

    public RecoverableError( final String message, final Throwable cause, final boolean enableSuppression, final boolean writableStackTrace ) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
