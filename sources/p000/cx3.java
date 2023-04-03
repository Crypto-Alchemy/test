package p000;

import kotlin.Metadata;
import p000.sw3;
import p000.sw3.C3310c;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u00020\u0004J\u000f\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u000b\u001a\u00020\nH\u0016J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\f8\u0000X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, mo44877d2 = {"Lcx3;", "Lsw3$c;", "N", "Lsw3$b;", "Ltv2;", "q", "()Lsw3$c;", "node", "r", "(Lsw3$c;)Lsw3$c;", "", "hashCode", "", "other", "", "equals", "d", "Ljava/lang/Object;", "getParams$ui_release", "()Ljava/lang/Object;", "params", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: cx3 */
/* compiled from: ModifierNodeElement.kt */
public abstract class cx3<N extends sw3.C3310c> extends tv2 implements sw3.C3309b {

    /* renamed from: d */
    public final Object f10398d;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof cx3) && C2375gb.m17963a(this, obj)) {
            return vx2.m53586b(this.f10398d, ((cx3) obj).f10398d);
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.f10398d;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    /* renamed from: k */
    public /* synthetic */ sw3 mo3193k(sw3 sw3) {
        return rw3.m26445a(this, sw3);
    }

    /* renamed from: l */
    public /* synthetic */ boolean mo3194l(rc2 rc2) {
        return tw3.m27950a(this, rc2);
    }

    /* renamed from: n */
    public /* synthetic */ Object mo3195n(Object obj, fd2 fd2) {
        return tw3.m27951b(this, obj, fd2);
    }

    /* renamed from: q */
    public abstract N mo18367q();

    /* renamed from: r */
    public abstract N mo18368r(N n);
}
