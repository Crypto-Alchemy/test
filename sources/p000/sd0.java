package p000;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001a\u0010\u0004\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0001\"\u0014\u0010\u0006\u001a\u00020\u00058\u0000XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo44877d2 = {"Lz75;", "", "cause", "Lr37;", "a", "", "DEFAULT_CLOSE_MESSAGE", "Ljava/lang/String;", "kotlinx-coroutines-core"}, mo44878k = 5, mo44879mv = {1, 6, 0}, mo44882xs = "kotlinx/coroutines/channels/ChannelsKt")
/* renamed from: sd0 */
/* compiled from: Channels.common.kt */
public final /* synthetic */ class sd0 {
    /* renamed from: a */
    public static final void m71903a(z75<?> z75, Throwable th) {
        CancellationException cancellationException = null;
        if (th != null) {
            if (th instanceof CancellationException) {
                cancellationException = (CancellationException) th;
            }
            if (cancellationException == null) {
                cancellationException = pu1.m71118a("Channel was consumed, consumer had failed", th);
            }
        }
        z75.mo52179c(cancellationException);
    }
}
