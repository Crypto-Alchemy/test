package com.google.zxing;

public abstract class ReaderException extends Exception {
    public static final StackTraceElement[] NO_TRACE = new StackTraceElement[0];
    public static boolean isStackTrace;

    static {
        boolean z;
        if (System.getProperty("surefire.test.class.path") != null) {
            z = true;
        } else {
            z = false;
        }
        isStackTrace = z;
    }

    public ReaderException() {
    }

    public static void setStackTrace(boolean z) {
        isStackTrace = z;
    }

    public final synchronized Throwable fillInStackTrace() {
        return null;
    }

    public ReaderException(Throwable th) {
        super(th);
    }
}
