package okhttp3.internal.http1;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Headers;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, mo44877d2 = {"Lokhttp3/internal/http1/HeadersReader;", "", "", "readLine", "Lokhttp3/Headers;", "readHeaders", "Lw40;", "source", "Lw40;", "getSource", "()Lw40;", "", "headerLimit", "J", "<init>", "(Lw40;)V", "Companion", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* compiled from: HeadersReader.kt */
public final class HeadersReader {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final int HEADER_LIMIT = 262144;
    private long headerLimit = 262144;
    private final w40 source;

    @Metadata(mo44876d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo44877d2 = {"Lokhttp3/internal/http1/HeadersReader$Companion;", "", "()V", "HEADER_LIMIT", "", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0}, mo44881xi = 48)
    /* compiled from: HeadersReader.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public HeadersReader(w40 w40) {
        vx2.m53591g(w40, "source");
        this.source = w40;
    }

    public final w40 getSource() {
        return this.source;
    }

    public final Headers readHeaders() {
        boolean z;
        Headers.Builder builder = new Headers.Builder();
        while (true) {
            String readLine = readLine();
            if (readLine.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return builder.build();
            }
            builder.addLenient$okhttp(readLine);
        }
    }

    public final String readLine() {
        String V = this.source.mo56041V(this.headerLimit);
        this.headerLimit -= (long) V.length();
        return V;
    }
}
