package p000;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b \u0010!J\u001a\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004JQ\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00018\u0006X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\"\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b8\u0006X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\r\u001a\u0004\u0018\u00010\u00018\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001f\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001e¨\u0006\""}, mo44877d2 = {"Ljm0;", "", "Lna0;", "cont", "", "cause", "Lr37;", "d", "result", "Lga0;", "cancelHandler", "Lkotlin/Function1;", "onCancellation", "idempotentResume", "cancelCause", "a", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/Object;", "b", "Lga0;", "c", "Lrc2;", "e", "Ljava/lang/Throwable;", "()Z", "cancelled", "<init>", "(Ljava/lang/Object;Lga0;Lrc2;Ljava/lang/Object;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: jm0 */
/* compiled from: CancellableContinuationImpl.kt */
public final class jm0 {

    /* renamed from: a */
    public final Object f38744a;

    /* renamed from: b */
    public final ga0 f38745b;

    /* renamed from: c */
    public final rc2<Throwable, r37> f38746c;

    /* renamed from: d */
    public final Object f38747d;

    /* renamed from: e */
    public final Throwable f38748e;

    public jm0(Object obj, ga0 ga0, rc2<? super Throwable, r37> rc2, Object obj2, Throwable th) {
        this.f38744a = obj;
        this.f38745b = ga0;
        this.f38746c = rc2;
        this.f38747d = obj2;
        this.f38748e = th;
    }

    /* renamed from: b */
    public static /* synthetic */ jm0 m59468b(jm0 jm0, Object obj, ga0 ga0, rc2<Throwable, r37> rc2, Object obj2, Throwable th, int i, Object obj3) {
        if ((i & 1) != 0) {
            obj = jm0.f38744a;
        }
        if ((i & 2) != 0) {
            ga0 = jm0.f38745b;
        }
        ga0 ga02 = ga0;
        if ((i & 4) != 0) {
            rc2 = jm0.f38746c;
        }
        rc2<Throwable, r37> rc22 = rc2;
        if ((i & 8) != 0) {
            obj2 = jm0.f38747d;
        }
        Object obj4 = obj2;
        if ((i & 16) != 0) {
            th = jm0.f38748e;
        }
        return jm0.mo52745a(obj, ga02, rc22, obj4, th);
    }

    /* renamed from: a */
    public final jm0 mo52745a(Object obj, ga0 ga0, rc2<? super Throwable, r37> rc2, Object obj2, Throwable th) {
        return new jm0(obj, ga0, rc2, obj2, th);
    }

    /* renamed from: c */
    public final boolean mo52746c() {
        if (this.f38748e != null) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final void mo52747d(na0<?> na0, Throwable th) {
        ga0 ga0 = this.f38745b;
        if (ga0 != null) {
            na0.mo56414j(ga0, th);
        }
        rc2<Throwable, r37> rc2 = this.f38746c;
        if (rc2 != null) {
            na0.mo56416l(rc2, th);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jm0)) {
            return false;
        }
        jm0 jm0 = (jm0) obj;
        return vx2.m53586b(this.f38744a, jm0.f38744a) && vx2.m53586b(this.f38745b, jm0.f38745b) && vx2.m53586b(this.f38746c, jm0.f38746c) && vx2.m53586b(this.f38747d, jm0.f38747d) && vx2.m53586b(this.f38748e, jm0.f38748e);
    }

    public int hashCode() {
        Object obj = this.f38744a;
        int i = 0;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        ga0 ga0 = this.f38745b;
        int hashCode2 = (hashCode + (ga0 == null ? 0 : ga0.hashCode())) * 31;
        rc2<Throwable, r37> rc2 = this.f38746c;
        int hashCode3 = (hashCode2 + (rc2 == null ? 0 : rc2.hashCode())) * 31;
        Object obj2 = this.f38747d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f38748e;
        if (th != null) {
            i = th.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.f38744a + ", cancelHandler=" + this.f38745b + ", onCancellation=" + this.f38746c + ", idempotentResume=" + this.f38747d + ", cancelCause=" + this.f38748e + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jm0(Object obj, ga0 ga0, rc2 rc2, Object obj2, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i & 2) != 0 ? null : ga0, (i & 4) != 0 ? null : rc2, (i & 8) != 0 ? null : obj2, (i & 16) != 0 ? null : th);
    }
}
