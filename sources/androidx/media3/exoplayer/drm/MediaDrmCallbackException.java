package androidx.media3.exoplayer.drm;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public final class MediaDrmCallbackException extends IOException {
    public final long bytesLoaded;
    public final d21 dataSpec;
    public final Map<String, List<String>> responseHeaders;
    public final Uri uriAfterRedirects;

    public MediaDrmCallbackException(d21 d21, Uri uri, Map<String, List<String>> map, long j, Throwable th) {
        super(th);
        this.dataSpec = d21;
        this.uriAfterRedirects = uri;
        this.responseHeaders = map;
        this.bytesLoaded = j;
    }
}
