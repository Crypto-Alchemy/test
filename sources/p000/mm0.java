package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00018\u0006X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f8\u0006X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, mo44877d2 = {"Lmm0;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/Object;", "result", "Lkotlin/Function1;", "", "Lr37;", "b", "Lrc2;", "onCancellation", "<init>", "(Ljava/lang/Object;Lrc2;)V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: mm0 */
/* compiled from: CompletionState.kt */
public final class mm0 {

    /* renamed from: a */
    public final Object f40938a;

    /* renamed from: b */
    public final rc2<Throwable, r37> f40939b;

    public mm0(Object obj, rc2<? super Throwable, r37> rc2) {
        this.f40938a = obj;
        this.f40939b = rc2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mm0)) {
            return false;
        }
        mm0 mm0 = (mm0) obj;
        return vx2.m53586b(this.f40938a, mm0.f40938a) && vx2.m53586b(this.f40939b, mm0.f40939b);
    }

    public int hashCode() {
        Object obj = this.f40938a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f40939b.hashCode();
    }

    public String toString() {
        return "CompletedWithCancellation(result=" + this.f40938a + ", onCancellation=" + this.f40939b + ')';
    }
}
