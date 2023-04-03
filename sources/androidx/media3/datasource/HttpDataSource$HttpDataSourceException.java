package androidx.media3.datasource;

import androidx.media3.common.PlaybackException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

public class HttpDataSource$HttpDataSourceException extends DataSourceException {
    public static final int TYPE_CLOSE = 3;
    public static final int TYPE_OPEN = 1;
    public static final int TYPE_READ = 2;
    public final d21 dataSpec;
    public final int type;

    @Deprecated
    public HttpDataSource$HttpDataSourceException(d21 d21, int i) {
        this(d21, (int) PlaybackException.ERROR_CODE_IO_UNSPECIFIED, i);
    }

    /* renamed from: a */
    public static int m5948a(int i, int i2) {
        return (i == 2000 && i2 == 1) ? PlaybackException.ERROR_CODE_IO_NETWORK_CONNECTION_FAILED : i;
    }

    public static HttpDataSource$HttpDataSourceException createForIOException(IOException iOException, d21 d21, int i) {
        int i2;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i2 = PlaybackException.ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT;
        } else if (iOException instanceof InterruptedIOException) {
            i2 = PlaybackException.ERROR_CODE_FAILED_RUNTIME_CHECK;
        } else if (message == null || !C5876gr.m44841e(message).matches("cleartext.*not permitted.*")) {
            i2 = PlaybackException.ERROR_CODE_IO_NETWORK_CONNECTION_FAILED;
        } else {
            i2 = 2007;
        }
        if (i2 == 2007) {
            return new HttpDataSource$CleartextNotPermittedException(iOException, d21);
        }
        return new HttpDataSource$HttpDataSourceException(iOException, d21, i2, i);
    }

    public HttpDataSource$HttpDataSourceException(d21 d21, int i, int i2) {
        super(m5948a(i, i2));
        this.dataSpec = d21;
        this.type = i2;
    }

    @Deprecated
    public HttpDataSource$HttpDataSourceException(String str, d21 d21, int i) {
        this(str, d21, (int) PlaybackException.ERROR_CODE_IO_UNSPECIFIED, i);
    }

    public HttpDataSource$HttpDataSourceException(String str, d21 d21, int i, int i2) {
        super(str, m5948a(i, i2));
        this.dataSpec = d21;
        this.type = i2;
    }

    @Deprecated
    public HttpDataSource$HttpDataSourceException(IOException iOException, d21 d21, int i) {
        this(iOException, d21, (int) PlaybackException.ERROR_CODE_IO_UNSPECIFIED, i);
    }

    public HttpDataSource$HttpDataSourceException(IOException iOException, d21 d21, int i, int i2) {
        super((Throwable) iOException, m5948a(i, i2));
        this.dataSpec = d21;
        this.type = i2;
    }

    @Deprecated
    public HttpDataSource$HttpDataSourceException(String str, IOException iOException, d21 d21, int i) {
        this(str, iOException, d21, PlaybackException.ERROR_CODE_IO_UNSPECIFIED, i);
    }

    public HttpDataSource$HttpDataSourceException(String str, IOException iOException, d21 d21, int i, int i2) {
        super(str, iOException, m5948a(i, i2));
        this.dataSpec = d21;
        this.type = i2;
    }
}
