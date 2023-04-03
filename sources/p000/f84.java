package p000;

import java.util.Map;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ7\u0010\f\u001a\u00020\n2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000J7\u0010\r\u001a\u00020\n2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\u0006\u0010\u0011\u001a\u00020\u000fJ\u0006\u0010\u0012\u001a\u00020\u000fJ\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\bH\u0016R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, mo44877d2 = {"Lf84;", "", "", "Lmr4;", "Lnr4;", "changes", "Lme3;", "parentCoordinates", "Lox2;", "internalPointerEvent", "", "isInBounds", "a", "f", "e", "Lr37;", "d", "c", "h", "b", "Lv04;", "Ly74;", "Lv04;", "g", "()Lv04;", "children", "<init>", "()V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: f84 */
/* compiled from: HitPathTracker.kt */
public class f84 {

    /* renamed from: a */
    public final v04<y74> f11562a = new v04<>(new y74[16], 0);

    /* renamed from: a */
    public boolean mo19720a(Map<mr4, nr4> map, me3 me3, ox2 ox2, boolean z) {
        vx2.m53591g(map, "changes");
        vx2.m53591g(me3, "parentCoordinates");
        vx2.m53591g(ox2, "internalPointerEvent");
        v04<y74> v04 = this.f11562a;
        int n = v04.mo26963n();
        if (n <= 0) {
            return false;
        }
        Object[] m = v04.mo26962m();
        vx2.m53589e(m, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
        int i = 0;
        boolean z2 = false;
        do {
            if (((y74) m[i]).mo19720a(map, me3, ox2, z) || z2) {
                z2 = true;
            } else {
                z2 = false;
            }
            i++;
        } while (i < n);
        return z2;
    }

    /* renamed from: b */
    public void mo19721b(ox2 ox2) {
        vx2.m53591g(ox2, "internalPointerEvent");
        int n = this.f11562a.mo26963n();
        while (true) {
            n--;
            if (-1 >= n) {
                return;
            }
            if (((y74) this.f11562a.mo26962m()[n]).mo27979j().mo26965q()) {
                this.f11562a.mo26971x(n);
            }
        }
    }

    /* renamed from: c */
    public final void mo19722c() {
        this.f11562a.mo26958i();
    }

    /* renamed from: d */
    public void mo19723d() {
        v04<y74> v04 = this.f11562a;
        int n = v04.mo26963n();
        if (n > 0) {
            int i = 0;
            Object[] m = v04.mo26962m();
            vx2.m53589e(m, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                ((y74) m[i]).mo19723d();
                i++;
            } while (i < n);
        }
    }

    /* renamed from: e */
    public boolean mo19724e(ox2 ox2) {
        vx2.m53591g(ox2, "internalPointerEvent");
        v04<y74> v04 = this.f11562a;
        int n = v04.mo26963n();
        boolean z = false;
        if (n > 0) {
            Object[] m = v04.mo26962m();
            vx2.m53589e(m, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int i = 0;
            boolean z2 = false;
            do {
                if (((y74) m[i]).mo19724e(ox2) || z2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                i++;
            } while (i < n);
            z = z2;
        }
        mo19721b(ox2);
        return z;
    }

    /* renamed from: f */
    public boolean mo19725f(Map<mr4, nr4> map, me3 me3, ox2 ox2, boolean z) {
        vx2.m53591g(map, "changes");
        vx2.m53591g(me3, "parentCoordinates");
        vx2.m53591g(ox2, "internalPointerEvent");
        v04<y74> v04 = this.f11562a;
        int n = v04.mo26963n();
        if (n <= 0) {
            return false;
        }
        Object[] m = v04.mo26962m();
        vx2.m53589e(m, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
        int i = 0;
        boolean z2 = false;
        do {
            if (((y74) m[i]).mo19725f(map, me3, ox2, z) || z2) {
                z2 = true;
            } else {
                z2 = false;
            }
            i++;
        } while (i < n);
        return z2;
    }

    /* renamed from: g */
    public final v04<y74> mo19726g() {
        return this.f11562a;
    }

    /* renamed from: h */
    public final void mo19727h() {
        int i = 0;
        while (i < this.f11562a.mo26963n()) {
            y74 y74 = (y74) this.f11562a.mo26962m()[i];
            if (!wr4.m29691b(y74.mo27980k())) {
                this.f11562a.mo26971x(i);
                y74.mo19723d();
            } else {
                i++;
                y74.mo19727h();
            }
        }
    }
}
