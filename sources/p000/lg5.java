package p000;

import kotlin.Metadata;
import kotlin.Result;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, mo44877d2 = {"Llg5;", "Lj33;", "", "cause", "Lr37;", "A", "Lns0;", "k", "Lns0;", "continuation", "<init>", "(Lns0;)V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: lg5 */
/* compiled from: JobSupport.kt */
public final class lg5 extends j33 {

    /* renamed from: k */
    public final ns0<r37> f40614k;

    public lg5(ns0<? super r37> ns0) {
        this.f40614k = ns0;
    }

    /* renamed from: A */
    public void mo51481A(Throwable th) {
        ns0<r37> ns0 = this.f40614k;
        Result.C6167a aVar = Result.Companion;
        ns0.resumeWith(Result.m75635constructorimpl(r37.f33317a));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo51481A((Throwable) obj);
        return r37.f33317a;
    }
}
