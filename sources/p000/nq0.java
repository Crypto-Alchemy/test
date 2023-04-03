package p000;

import android.os.Build;
import androidx.work.NetworkType;

/* renamed from: nq0 */
/* compiled from: Constraints */
public final class nq0 {

    /* renamed from: i */
    public static final nq0 f15632i = new C2917a().mo23777a();

    /* renamed from: a */
    public NetworkType f15633a = NetworkType.NOT_REQUIRED;

    /* renamed from: b */
    public boolean f15634b;

    /* renamed from: c */
    public boolean f15635c;

    /* renamed from: d */
    public boolean f15636d;

    /* renamed from: e */
    public boolean f15637e;

    /* renamed from: f */
    public long f15638f = -1;

    /* renamed from: g */
    public long f15639g = -1;

    /* renamed from: h */
    public vr0 f15640h = new vr0();

    /* renamed from: nq0$a */
    /* compiled from: Constraints */
    public static final class C2917a {

        /* renamed from: a */
        public boolean f15641a = false;

        /* renamed from: b */
        public boolean f15642b = false;

        /* renamed from: c */
        public NetworkType f15643c = NetworkType.NOT_REQUIRED;

        /* renamed from: d */
        public boolean f15644d = false;

        /* renamed from: e */
        public boolean f15645e = false;

        /* renamed from: f */
        public long f15646f = -1;

        /* renamed from: g */
        public long f15647g = -1;

        /* renamed from: h */
        public vr0 f15648h = new vr0();

        /* renamed from: a */
        public nq0 mo23777a() {
            return new nq0(this);
        }

        /* renamed from: b */
        public C2917a mo23778b(NetworkType networkType) {
            this.f15643c = networkType;
            return this;
        }
    }

    public nq0() {
    }

    /* renamed from: a */
    public vr0 mo23758a() {
        return this.f15640h;
    }

    /* renamed from: b */
    public NetworkType mo23759b() {
        return this.f15633a;
    }

    /* renamed from: c */
    public long mo23760c() {
        return this.f15638f;
    }

    /* renamed from: d */
    public long mo23761d() {
        return this.f15639g;
    }

    /* renamed from: e */
    public boolean mo23762e() {
        if (this.f15640h.mo27306c() > 0) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || nq0.class != obj.getClass()) {
            return false;
        }
        nq0 nq0 = (nq0) obj;
        if (this.f15634b == nq0.f15634b && this.f15635c == nq0.f15635c && this.f15636d == nq0.f15636d && this.f15637e == nq0.f15637e && this.f15638f == nq0.f15638f && this.f15639g == nq0.f15639g && this.f15633a == nq0.f15633a) {
            return this.f15640h.equals(nq0.f15640h);
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo23764f() {
        return this.f15636d;
    }

    /* renamed from: g */
    public boolean mo23765g() {
        return this.f15634b;
    }

    /* renamed from: h */
    public boolean mo23766h() {
        return this.f15635c;
    }

    public int hashCode() {
        long j = this.f15638f;
        long j2 = this.f15639g;
        return (((((((((((((this.f15633a.hashCode() * 31) + (this.f15634b ? 1 : 0)) * 31) + (this.f15635c ? 1 : 0)) * 31) + (this.f15636d ? 1 : 0)) * 31) + (this.f15637e ? 1 : 0)) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f15640h.hashCode();
    }

    /* renamed from: i */
    public boolean mo23768i() {
        return this.f15637e;
    }

    /* renamed from: j */
    public void mo23769j(vr0 vr0) {
        this.f15640h = vr0;
    }

    /* renamed from: k */
    public void mo23770k(NetworkType networkType) {
        this.f15633a = networkType;
    }

    /* renamed from: l */
    public void mo23771l(boolean z) {
        this.f15636d = z;
    }

    /* renamed from: m */
    public void mo23772m(boolean z) {
        this.f15634b = z;
    }

    /* renamed from: n */
    public void mo23773n(boolean z) {
        this.f15635c = z;
    }

    /* renamed from: o */
    public void mo23774o(boolean z) {
        this.f15637e = z;
    }

    /* renamed from: p */
    public void mo23775p(long j) {
        this.f15638f = j;
    }

    /* renamed from: q */
    public void mo23776q(long j) {
        this.f15639g = j;
    }

    public nq0(C2917a aVar) {
        this.f15634b = aVar.f15641a;
        int i = Build.VERSION.SDK_INT;
        this.f15635c = aVar.f15642b;
        this.f15633a = aVar.f15643c;
        this.f15636d = aVar.f15644d;
        this.f15637e = aVar.f15645e;
        if (i >= 24) {
            this.f15640h = aVar.f15648h;
            this.f15638f = aVar.f15646f;
            this.f15639g = aVar.f15647g;
        }
    }

    public nq0(nq0 nq0) {
        this.f15634b = nq0.f15634b;
        this.f15635c = nq0.f15635c;
        this.f15633a = nq0.f15633a;
        this.f15636d = nq0.f15636d;
        this.f15637e = nq0.f15637e;
        this.f15640h = nq0.f15640h;
    }
}
