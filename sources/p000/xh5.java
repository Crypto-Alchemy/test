package p000;

import java.util.Locale;

/* renamed from: xh5 */
/* compiled from: RotationOptions */
public class xh5 {

    /* renamed from: c */
    public static final xh5 f19838c = new xh5(-1, false);

    /* renamed from: d */
    public static final xh5 f19839d = new xh5(-2, false);

    /* renamed from: e */
    public static final xh5 f19840e = new xh5(-1, true);

    /* renamed from: a */
    public final int f19841a;

    /* renamed from: b */
    public final boolean f19842b;

    public xh5(int i, boolean z) {
        this.f19841a = i;
        this.f19842b = z;
    }

    /* renamed from: a */
    public static xh5 m30104a() {
        return f19838c;
    }

    /* renamed from: b */
    public static xh5 m30105b() {
        return f19840e;
    }

    /* renamed from: c */
    public boolean mo27739c() {
        return this.f19842b;
    }

    /* renamed from: d */
    public int mo27740d() {
        if (!mo27743f()) {
            return this.f19841a;
        }
        throw new IllegalStateException("Rotation is set to use EXIF");
    }

    /* renamed from: e */
    public boolean mo27741e() {
        if (this.f19841a != -2) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xh5)) {
            return false;
        }
        xh5 xh5 = (xh5) obj;
        if (this.f19841a == xh5.f19841a && this.f19842b == xh5.f19842b) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo27743f() {
        if (this.f19841a == -1) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ll2.m21524c(Integer.valueOf(this.f19841a), Boolean.valueOf(this.f19842b));
    }

    public String toString() {
        return String.format((Locale) null, "%d defer:%b", new Object[]{Integer.valueOf(this.f19841a), Boolean.valueOf(this.f19842b)});
    }
}
