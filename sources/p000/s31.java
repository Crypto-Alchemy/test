package p000;

import java.util.Arrays;
import p000.C2891nf;

/* renamed from: s31 */
/* compiled from: DefaultAllocator */
public final class s31 implements C2891nf {

    /* renamed from: a */
    public final boolean f17441a;

    /* renamed from: b */
    public final int f17442b;

    /* renamed from: c */
    public final byte[] f17443c;

    /* renamed from: d */
    public int f17444d;

    /* renamed from: e */
    public int f17445e;

    /* renamed from: f */
    public int f17446f;

    /* renamed from: g */
    public C2825mf[] f17447g;

    public s31(boolean z, int i) {
        this(z, i, 0);
    }

    /* renamed from: a */
    public synchronized void mo23660a(C2891nf.C2892a aVar) {
        while (aVar != null) {
            C2825mf[] mfVarArr = this.f17447g;
            int i = this.f17446f;
            this.f17446f = i + 1;
            mfVarArr[i] = aVar.mo7746a();
            this.f17445e--;
            aVar = aVar.next();
        }
        notifyAll();
    }

    /* renamed from: b */
    public synchronized C2825mf mo23661b() {
        C2825mf mfVar;
        this.f17445e++;
        int i = this.f17446f;
        if (i > 0) {
            C2825mf[] mfVarArr = this.f17447g;
            int i2 = i - 1;
            this.f17446f = i2;
            mfVar = (C2825mf) C2725kr.m20985e(mfVarArr[i2]);
            this.f17447g[this.f17446f] = null;
        } else {
            mfVar = new C2825mf(new byte[this.f17442b], 0);
            int i3 = this.f17445e;
            C2825mf[] mfVarArr2 = this.f17447g;
            if (i3 > mfVarArr2.length) {
                this.f17447g = (C2825mf[]) Arrays.copyOf(mfVarArr2, mfVarArr2.length * 2);
            }
        }
        return mfVar;
    }

    /* renamed from: c */
    public synchronized void mo23662c(C2825mf mfVar) {
        C2825mf[] mfVarArr = this.f17447g;
        int i = this.f17446f;
        this.f17446f = i + 1;
        mfVarArr[i] = mfVar;
        this.f17445e--;
        notifyAll();
    }

    /* renamed from: d */
    public synchronized void mo23663d() {
        int i = 0;
        int max = Math.max(0, w67.m29364l(this.f17444d, this.f17442b) - this.f17445e);
        int i2 = this.f17446f;
        if (max < i2) {
            if (this.f17443c != null) {
                int i3 = i2 - 1;
                while (i <= i3) {
                    C2825mf mfVar = (C2825mf) C2725kr.m20985e(this.f17447g[i]);
                    if (mfVar.f14960a == this.f17443c) {
                        i++;
                    } else {
                        C2825mf mfVar2 = (C2825mf) C2725kr.m20985e(this.f17447g[i3]);
                        if (mfVar2.f14960a != this.f17443c) {
                            i3--;
                        } else {
                            C2825mf[] mfVarArr = this.f17447g;
                            mfVarArr[i] = mfVar2;
                            mfVarArr[i3] = mfVar;
                            i3--;
                            i++;
                        }
                    }
                }
                max = Math.max(max, i);
                if (max >= this.f17446f) {
                    return;
                }
            }
            Arrays.fill(this.f17447g, max, this.f17446f, (Object) null);
            this.f17446f = max;
        }
    }

    /* renamed from: e */
    public int mo23664e() {
        return this.f17442b;
    }

    /* renamed from: f */
    public synchronized int mo25622f() {
        return this.f17445e * this.f17442b;
    }

    /* renamed from: g */
    public synchronized void mo25623g() {
        if (this.f17441a) {
            mo25624h(0);
        }
    }

    /* renamed from: h */
    public synchronized void mo25624h(int i) {
        boolean z;
        if (i < this.f17444d) {
            z = true;
        } else {
            z = false;
        }
        this.f17444d = i;
        if (z) {
            mo23663d();
        }
    }

    public s31(boolean z, int i, int i2) {
        boolean z2 = true;
        C2725kr.m20981a(i > 0);
        C2725kr.m20981a(i2 < 0 ? false : z2);
        this.f17441a = z;
        this.f17442b = i;
        this.f17446f = i2;
        this.f17447g = new C2825mf[(i2 + 100)];
        if (i2 > 0) {
            this.f17443c = new byte[(i2 * i)];
            for (int i3 = 0; i3 < i2; i3++) {
                this.f17447g[i3] = new C2825mf(this.f17443c, i3 * i);
            }
            return;
        }
        this.f17443c = null;
    }
}
