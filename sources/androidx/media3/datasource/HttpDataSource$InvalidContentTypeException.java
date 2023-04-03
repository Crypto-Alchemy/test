package androidx.media3.datasource;

import androidx.media3.common.PlaybackException;

public final class HttpDataSource$InvalidContentTypeException extends HttpDataSource$HttpDataSourceException {
    public final String contentType;

    public HttpDataSource$InvalidContentTypeException(String str, d21 d21) {
        super("Invalid content type: " + str, d21, (int) PlaybackException.ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE, 1);
        this.contentType = str;
    }
}
