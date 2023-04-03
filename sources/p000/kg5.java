package p000;

import kotlin.Metadata;
import kotlin.Result;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0015\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, mo44877d2 = {"Lkg5;", "T", "Lj33;", "", "cause", "Lr37;", "A", "Lna0;", "k", "Lna0;", "continuation", "<init>", "(Lna0;)V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: kg5 */
/* compiled from: JobSupport.kt */
public final class kg5<T> extends j33 {

    /* renamed from: k */
    public final na0<T> f38899k;

    public kg5(na0<? super T> na0) {
        this.f38899k = na0;
    }

    /* renamed from: A */
    public void mo51481A(Throwable th) {
        Object i0 = mo52613B().mo55512i0();
        if (i0 instanceof lm0) {
            na0<T> na0 = this.f38899k;
            Result.C6167a aVar = Result.Companion;
            na0.resumeWith(Result.m75635constructorimpl(hg5.m45198a(((lm0) i0).f40642a)));
            return;
        }
        na0<T> na02 = this.f38899k;
        Result.C6167a aVar2 = Result.Companion;
        na02.resumeWith(Result.m75635constructorimpl(k33.m59674h(i0)));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo51481A((Throwable) obj);
        return r37.f33317a;
    }
}
