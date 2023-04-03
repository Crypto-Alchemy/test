package org.java_websocket.exceptions;

import androidx.media3.common.PlaybackException;

public class InvalidFrameException extends InvalidDataException {
    private static final long serialVersionUID = -9016496369828887591L;

    public InvalidFrameException() {
        super(PlaybackException.ERROR_CODE_BEHIND_LIVE_WINDOW);
    }

    public InvalidFrameException(String str) {
        super((int) PlaybackException.ERROR_CODE_BEHIND_LIVE_WINDOW, str);
    }

    public InvalidFrameException(Throwable th) {
        super((int) PlaybackException.ERROR_CODE_BEHIND_LIVE_WINDOW, th);
    }

    public InvalidFrameException(String str, Throwable th) {
        super(PlaybackException.ERROR_CODE_BEHIND_LIVE_WINDOW, str, th);
    }
}
