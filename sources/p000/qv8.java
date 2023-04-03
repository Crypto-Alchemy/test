package p000;

import java.io.IOException;

/* renamed from: qv8 */
public final class qv8 extends lr8<qv8> implements Cloneable {

    /* renamed from: k */
    public static volatile qv8[] f33278k;

    /* renamed from: e */
    public String f33279e = "";

    /* renamed from: g */
    public String f33280g = "";

    public qv8() {
        this.f31388d = null;
        this.f20992a = -1;
    }

    /* renamed from: i */
    public static qv8[] m50889i() {
        if (f33278k == null) {
            synchronized (xr8.f35683c) {
                if (f33278k == null) {
                    f33278k = new qv8[0];
                }
            }
        }
        return f33278k;
    }

    /* renamed from: a */
    public final void mo29047a(gr8 gr8) throws IOException {
        String str = this.f33279e;
        if (str != null && !str.equals("")) {
            gr8.mo42957b(1, this.f33279e);
        }
        String str2 = this.f33280g;
        if (str2 != null && !str2.equals("")) {
            gr8.mo42957b(2, this.f33280g);
        }
        super.mo29047a(gr8);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qv8)) {
            return false;
        }
        qv8 qv8 = (qv8) obj;
        String str = this.f33279e;
        if (str == null) {
            if (qv8.f33279e != null) {
                return false;
            }
        } else if (!str.equals(qv8.f33279e)) {
            return false;
        }
        String str2 = this.f33280g;
        if (str2 == null) {
            if (qv8.f33280g != null) {
                return false;
            }
        } else if (!str2.equals(qv8.f33280g)) {
            return false;
        }
        qr8 qr8 = this.f31388d;
        if (qr8 != null && !qr8.mo47262a()) {
            return this.f31388d.equals(qv8.f31388d);
        }
        qr8 qr82 = qv8.f31388d;
        return qr82 == null || qr82.mo47262a();
    }

    /* renamed from: f */
    public final int mo29050f() {
        int f = super.mo29050f();
        String str = this.f33279e;
        if (str != null && !str.equals("")) {
            f += gr8.m44863g(1, this.f33279e);
        }
        String str2 = this.f33280g;
        return (str2 == null || str2.equals("")) ? f : f + gr8.m44863g(2, this.f33280g);
    }

    /* renamed from: g */
    public final /* synthetic */ as8 mo29051g() throws CloneNotSupportedException {
        return (qv8) clone();
    }

    /* renamed from: h */
    public final /* synthetic */ lr8 mo45497h() throws CloneNotSupportedException {
        return (qv8) clone();
    }

    public final int hashCode() {
        int hashCode = (qv8.class.getName().hashCode() + 527) * 31;
        String str = this.f33279e;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f33280g;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        qr8 qr8 = this.f31388d;
        if (qr8 != null && !qr8.mo47262a()) {
            i = this.f31388d.hashCode();
        }
        return hashCode3 + i;
    }

    /* renamed from: j */
    public final qv8 clone() {
        try {
            return (qv8) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}
