package org.java_websocket.exceptions;

public class IncompleteException extends Throwable {
    private static final long serialVersionUID = 7330519489840500997L;
    private int preferredSize;

    public IncompleteException(int i) {
        this.preferredSize = i;
    }

    public int getPreferredSize() {
        return this.preferredSize;
    }
}
