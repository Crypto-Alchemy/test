package org.java_websocket.exceptions;

import androidx.media3.common.PlaybackException;

public class InvalidHandshakeException extends InvalidDataException {
    private static final long serialVersionUID = -1426533877490484964L;

    public InvalidHandshakeException() {
        super(PlaybackException.ERROR_CODE_BEHIND_LIVE_WINDOW);
    }

    public InvalidHandshakeException(String str, Throwable th) {
        super(PlaybackException.ERROR_CODE_BEHIND_LIVE_WINDOW, str, th);
    }

    public InvalidHandshakeException(String str) {
        super((int) PlaybackException.ERROR_CODE_BEHIND_LIVE_WINDOW, str);
    }

    public InvalidHandshakeException(Throwable th) {
        super((int) PlaybackException.ERROR_CODE_BEHIND_LIVE_WINDOW, th);
    }
}
