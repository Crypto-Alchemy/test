package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\b\u0010\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0011\u0010\f\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0004¨\u0006\u000f"}, mo44877d2 = {"Llm0;", "", "", "b", "()Z", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/lang/Throwable;", "cause", "handled", "<init>", "(Ljava/lang/Throwable;Z)V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: lm0 */
/* compiled from: CompletionState.kt */
public class lm0 {

    /* renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f40641b = AtomicIntegerFieldUpdater.newUpdater(lm0.class, "_handled");
    private volatile /* synthetic */ int _handled;

    /* renamed from: a */
    public final Throwable f40642a;

    public lm0(Throwable th, boolean z) {
        this.f40642a = th;
        this._handled = z ? 1 : 0;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [int, boolean] */
    /* renamed from: a */
    public final boolean mo55923a() {
        return this._handled;
    }

    /* renamed from: b */
    public final boolean mo55924b() {
        return f40641b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return b31.m55722a(this) + '[' + this.f40642a + ']';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lm0(Throwable th, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(th, (i & 2) != 0 ? false : z);
    }
}
