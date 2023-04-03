package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, mo44877d2 = {"Lq91;", "Lpm5;", "Lr37;", "close", "", "toString", "<init>", "()V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: q91 */
/* compiled from: Dispatcher.kt */
public final class q91 extends pm5 {

    /* renamed from: y */
    public static final q91 f44157y = new q91();

    public q91() {
        super(km6.f38923b, km6.f38924c, km6.f38925d, "DefaultDispatcher");
    }

    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    public String toString() {
        return "Dispatchers.Default";
    }
}
