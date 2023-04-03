package androidx.media3.datasource;

import androidx.media3.common.PlaybackException;
import java.io.IOException;

public final class HttpDataSource$CleartextNotPermittedException extends HttpDataSource$HttpDataSourceException {
    public HttpDataSource$CleartextNotPermittedException(IOException iOException, d21 d21) {
        super("Cleartext HTTP traffic not permitted. See https://exoplayer.dev/issues/cleartext-not-permitted", iOException, d21, PlaybackException.ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED, 1);
    }
}
