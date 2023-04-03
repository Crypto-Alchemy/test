package okhttp3.internal.connection;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0014¨\u0006\u0004"}, mo44877d2 = {"okhttp3/internal/connection/RealCall$timeout$1", "Lzr;", "Lr37;", "timedOut", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* compiled from: RealCall.kt */
public final class RealCall$timeout$1 extends C9710zr {
    public final /* synthetic */ RealCall this$0;

    public RealCall$timeout$1(RealCall realCall) {
        this.this$0 = realCall;
    }

    public void timedOut() {
        this.this$0.cancel();
    }
}
