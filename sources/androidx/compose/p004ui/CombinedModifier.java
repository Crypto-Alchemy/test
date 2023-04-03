package androidx.compose.p004ui;

import kotlin.Metadata;
import p000.sw3;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0001\u0012\u0006\u0010\u001b\u001a\u00020\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ7\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\f\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\tH\u0016J\u0013\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016R\u001a\u0010\u0018\u001a\u00020\u00018\u0000X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001b\u001a\u00020\u00018\u0000X\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017¨\u0006\u001e"}, mo44877d2 = {"Landroidx/compose/ui/CombinedModifier;", "Lsw3;", "R", "initial", "Lkotlin/Function2;", "Lsw3$b;", "operation", "n", "(Ljava/lang/Object;Lfd2;)Ljava/lang/Object;", "Lkotlin/Function1;", "", "predicate", "l", "", "other", "equals", "", "hashCode", "", "toString", "a", "Lsw3;", "r", "()Lsw3;", "outer", "d", "q", "inner", "<init>", "(Lsw3;Lsw3;)V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.CombinedModifier */
/* compiled from: Modifier.kt */
public final class CombinedModifier implements sw3 {

    /* renamed from: a */
    public final sw3 f1612a;

    /* renamed from: d */
    public final sw3 f1613d;

    public CombinedModifier(sw3 sw3, sw3 sw32) {
        vx2.m53591g(sw3, "outer");
        vx2.m53591g(sw32, "inner");
        this.f1612a = sw3;
        this.f1613d = sw32;
    }

    public boolean equals(Object obj) {
        if (obj instanceof CombinedModifier) {
            CombinedModifier combinedModifier = (CombinedModifier) obj;
            if (!vx2.m53586b(this.f1612a, combinedModifier.f1612a) || !vx2.m53586b(this.f1613d, combinedModifier.f1613d)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f1612a.hashCode() + (this.f1613d.hashCode() * 31);
    }

    /* renamed from: k */
    public /* synthetic */ sw3 mo3193k(sw3 sw3) {
        return rw3.m26445a(this, sw3);
    }

    /* renamed from: l */
    public boolean mo3194l(rc2<? super sw3.C3309b, Boolean> rc2) {
        vx2.m53591g(rc2, "predicate");
        if (!this.f1612a.mo3194l(rc2) || !this.f1613d.mo3194l(rc2)) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    public <R> R mo3195n(R r, fd2<? super R, ? super sw3.C3309b, ? extends R> fd2) {
        vx2.m53591g(fd2, "operation");
        return this.f1613d.mo3195n(this.f1612a.mo3195n(r, fd2), fd2);
    }

    /* renamed from: q */
    public final sw3 mo3196q() {
        return this.f1613d;
    }

    /* renamed from: r */
    public final sw3 mo3197r() {
        return this.f1612a;
    }

    public String toString() {
        return '[' + ((String) mo3195n("", CombinedModifier$toString$1.INSTANCE)) + ']';
    }
}
