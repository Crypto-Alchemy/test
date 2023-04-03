package p000;

import android.util.Pair;
import androidx.media3.common.C0831s;

/* renamed from: x5 */
/* compiled from: AbstractConcatenatedTimeline */
public abstract class C3568x5 extends C0831s {

    /* renamed from: e */
    public final int f19314e;

    /* renamed from: g */
    public final x06 f19315g;

    /* renamed from: k */
    public final boolean f19316k;

    public C3568x5(boolean z, x06 x06) {
        this.f19316k = z;
        this.f19315g = x06;
        this.f19314e = x06.getLength();
    }

    /* renamed from: B */
    public static Object m29876B(Object obj) {
        return ((Pair) obj).second;
    }

    /* renamed from: C */
    public static Object m29877C(Object obj) {
        return ((Pair) obj).first;
    }

    /* renamed from: E */
    public static Object m29878E(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    /* renamed from: A */
    public abstract int mo18902A(int i);

    /* renamed from: D */
    public abstract Object mo18903D(int i);

    /* renamed from: F */
    public abstract int mo18904F(int i);

    /* renamed from: G */
    public abstract int mo18905G(int i);

    /* renamed from: H */
    public final int mo27671H(int i, boolean z) {
        if (z) {
            return this.f19315g.mo27642c(i);
        }
        if (i < this.f19314e - 1) {
            return i + 1;
        }
        return -1;
    }

    /* renamed from: I */
    public final int mo27672I(int i, boolean z) {
        if (z) {
            return this.f19315g.mo27641b(i);
        }
        if (i > 0) {
            return i - 1;
        }
        return -1;
    }

    /* renamed from: J */
    public abstract C0831s mo18906J(int i);

    /* renamed from: e */
    public int mo6865e(boolean z) {
        if (this.f19314e == 0) {
            return -1;
        }
        int i = 0;
        if (this.f19316k) {
            z = false;
        }
        if (z) {
            i = this.f19315g.mo27645f();
        }
        while (mo18906J(i).mo6883u()) {
            i = mo27671H(i, z);
            if (i == -1) {
                return -1;
            }
        }
        return mo18905G(i) + mo18906J(i).mo6865e(z);
    }

    /* renamed from: f */
    public final int mo6867f(Object obj) {
        int f;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Object C = m29877C(obj);
        Object B = m29876B(obj);
        int y = mo18908y(C);
        if (y == -1 || (f = mo18906J(y).mo6867f(B)) == -1) {
            return -1;
        }
        return mo18904F(y) + f;
    }

    /* renamed from: g */
    public int mo6868g(boolean z) {
        int i;
        int i2 = this.f19314e;
        if (i2 == 0) {
            return -1;
        }
        if (this.f19316k) {
            z = false;
        }
        if (z) {
            i = this.f19315g.mo27643d();
        } else {
            i = i2 - 1;
        }
        while (mo18906J(i).mo6883u()) {
            i = mo27672I(i, z);
            if (i == -1) {
                return -1;
            }
        }
        return mo18905G(i) + mo18906J(i).mo6868g(z);
    }

    /* renamed from: i */
    public int mo6871i(int i, int i2, boolean z) {
        int i3 = 0;
        if (this.f19316k) {
            if (i2 == 1) {
                i2 = 2;
            }
            z = false;
        }
        int A = mo18902A(i);
        int G = mo18905G(A);
        C0831s J = mo18906J(A);
        int i4 = i - G;
        if (i2 != 2) {
            i3 = i2;
        }
        int i5 = J.mo6871i(i4, i3, z);
        if (i5 != -1) {
            return G + i5;
        }
        int H = mo27671H(A, z);
        while (H != -1 && mo18906J(H).mo6883u()) {
            H = mo27671H(H, z);
        }
        if (H != -1) {
            return mo18905G(H) + mo18906J(H).mo6865e(z);
        }
        if (i2 == 2) {
            return mo6865e(z);
        }
        return -1;
    }

    /* renamed from: k */
    public final C0831s.C0833b mo6873k(int i, C0831s.C0833b bVar, boolean z) {
        int z2 = mo18909z(i);
        int G = mo18905G(z2);
        mo18906J(z2).mo6873k(i - mo18904F(z2), bVar, z);
        bVar.f4438e += G;
        if (z) {
            bVar.f4437d = m29878E(mo18903D(z2), C2725kr.m20985e(bVar.f4437d));
        }
        return bVar;
    }

    /* renamed from: l */
    public final C0831s.C0833b mo6874l(Object obj, C0831s.C0833b bVar) {
        Object C = m29877C(obj);
        Object B = m29876B(obj);
        int y = mo18908y(C);
        int G = mo18905G(y);
        mo18906J(y).mo6874l(B, bVar);
        bVar.f4438e += G;
        bVar.f4437d = obj;
        return bVar;
    }

    /* renamed from: p */
    public int mo6878p(int i, int i2, boolean z) {
        int i3 = 0;
        if (this.f19316k) {
            if (i2 == 1) {
                i2 = 2;
            }
            z = false;
        }
        int A = mo18902A(i);
        int G = mo18905G(A);
        C0831s J = mo18906J(A);
        int i4 = i - G;
        if (i2 != 2) {
            i3 = i2;
        }
        int p = J.mo6878p(i4, i3, z);
        if (p != -1) {
            return G + p;
        }
        int I = mo27672I(A, z);
        while (I != -1 && mo18906J(I).mo6883u()) {
            I = mo27672I(I, z);
        }
        if (I != -1) {
            return mo18905G(I) + mo18906J(I).mo6868g(z);
        }
        if (i2 == 2) {
            return mo6868g(z);
        }
        return -1;
    }

    /* renamed from: q */
    public final Object mo6879q(int i) {
        int z = mo18909z(i);
        return m29878E(mo18903D(z), mo18906J(z).mo6879q(i - mo18904F(z)));
    }

    /* renamed from: s */
    public final C0831s.C0835d mo6881s(int i, C0831s.C0835d dVar, long j) {
        int A = mo18902A(i);
        int G = mo18905G(A);
        int F = mo18904F(A);
        mo18906J(A).mo6881s(i - G, dVar, j);
        Object D = mo18903D(A);
        if (!C0831s.C0835d.f4447Q.equals(dVar.f4459a)) {
            D = m29878E(D, dVar.f4459a);
        }
        dVar.f4459a = D;
        dVar.f4456L += F;
        dVar.f4457M += F;
        return dVar;
    }

    /* renamed from: y */
    public abstract int mo18908y(Object obj);

    /* renamed from: z */
    public abstract int mo18909z(int i);
}
