package androidx.media3.datasource;

import androidx.media3.common.PlaybackException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public final class HttpDataSource$InvalidResponseCodeException extends HttpDataSource$HttpDataSourceException {
    public final Map<String, List<String>> headerFields;
    public final byte[] responseBody;
    public final int responseCode;
    public final String responseMessage;

    @Deprecated
    public HttpDataSource$InvalidResponseCodeException(int i, Map<String, List<String>> map, d21 d21) {
        this(i, (String) null, (IOException) null, map, d21, w67.f19026f);
    }

    @Deprecated
    public HttpDataSource$InvalidResponseCodeException(int i, String str, Map<String, List<String>> map, d21 d21) {
        this(i, str, (IOException) null, map, d21, w67.f19026f);
    }

    public HttpDataSource$InvalidResponseCodeException(int i, String str, IOException iOException, Map<String, List<String>> map, d21 d21, byte[] bArr) {
        super("Response code: " + i, iOException, d21, PlaybackException.ERROR_CODE_IO_BAD_HTTP_STATUS, 1);
        this.responseCode = i;
        this.responseMessage = str;
        this.headerFields = map;
        this.responseBody = bArr;
    }
}
