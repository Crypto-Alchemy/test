package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B%\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\f"}, mo44877d2 = {"Lva0;", "Llm0;", "", "c", "()Z", "Lns0;", "continuation", "", "cause", "handled", "<init>", "(Lns0;Ljava/lang/Throwable;Z)V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: va0 */
/* compiled from: CompletionState.kt */
public final class va0 extends lm0 {

    /* renamed from: c */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f45248c = AtomicIntegerFieldUpdater.newUpdater(va0.class, "_resumed");
    private volatile /* synthetic */ int _resumed;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public va0(p000.ns0<?> r3, java.lang.Throwable r4, boolean r5) {
        /*
            r2 = this;
            if (r4 != 0) goto L_0x001d
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Continuation "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = " was cancelled normally"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
        L_0x001d:
            r2.<init>(r4, r5)
            r3 = 0
            r2._resumed = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.va0.<init>(ns0, java.lang.Throwable, boolean):void");
    }

    /* renamed from: c */
    public final boolean mo66463c() {
        return f45248c.compareAndSet(this, 0, 1);
    }
}
