package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\t¨\u0006\r"}, mo44877d2 = {"Lci1;", "Lga0;", "", "cause", "Lr37;", "a", "", "toString", "Lzh1;", "Lzh1;", "handle", "<init>", "(Lzh1;)V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: ci1 */
/* compiled from: CancellableContinuation.kt */
public final class ci1 extends ga0 {

    /* renamed from: a */
    public final zh1 f37148a;

    public ci1(zh1 zh1) {
        this.f37148a = zh1;
    }

    /* renamed from: a */
    public void mo50904a(Throwable th) {
        this.f37148a.dispose();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo50904a((Throwable) obj);
        return r37.f33317a;
    }

    public String toString() {
        return "DisposeOnCancel[" + this.f37148a + ']';
    }
}
