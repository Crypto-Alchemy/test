package p000;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, mo44877d2 = {"Lgs0;", "Lhu0;", "", "toString", "Lkotlin/coroutines/CoroutineContext;", "a", "Lkotlin/coroutines/CoroutineContext;", "A", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "context", "<init>", "(Lkotlin/coroutines/CoroutineContext;)V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: gs0 */
/* compiled from: Scopes.kt */
public final class gs0 implements hu0 {

    /* renamed from: a */
    public final CoroutineContext f38062a;

    public gs0(CoroutineContext coroutineContext) {
        this.f38062a = coroutineContext;
    }

    /* renamed from: A */
    public CoroutineContext mo6303A() {
        return this.f38062a;
    }

    public String toString() {
        return "CoroutineScope(coroutineContext=" + mo6303A() + ')';
    }
}
