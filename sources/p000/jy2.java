package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00040\bj\u0002`\t¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R&\u0010\u000b\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00040\bj\u0002`\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\n¨\u0006\u000e"}, mo44877d2 = {"Ljy2;", "Lga0;", "", "cause", "Lr37;", "a", "", "toString", "Lkotlin/Function1;", "Lkotlinx/coroutines/CompletionHandler;", "Lrc2;", "handler", "<init>", "(Lrc2;)V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: jy2 */
/* compiled from: CancellableContinuationImpl.kt */
public final class jy2 extends ga0 {

    /* renamed from: a */
    public final rc2<Throwable, r37> f38813a;

    public jy2(rc2<? super Throwable, r37> rc2) {
        this.f38813a = rc2;
    }

    /* renamed from: a */
    public void mo50904a(Throwable th) {
        this.f38813a.invoke(th);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo50904a((Throwable) obj);
        return r37.f33317a;
    }

    public String toString() {
        return "InvokeOnCancel[" + b31.m55722a(this.f38813a) + '@' + b31.m55723b(this) + ']';
    }
}
