package p000;

import android.os.SystemClock;
import androidx.media3.common.C0792h;
import androidx.media3.common.C0836t;
import java.util.Arrays;
import java.util.List;

/* renamed from: nz */
/* compiled from: BaseTrackSelection */
public abstract class C2932nz implements dx1 {

    /* renamed from: a */
    public final C0836t f15737a;

    /* renamed from: b */
    public final int f15738b;

    /* renamed from: c */
    public final int[] f15739c;

    /* renamed from: d */
    public final int f15740d;

    /* renamed from: e */
    public final C0792h[] f15741e;

    /* renamed from: f */
    public final long[] f15742f;

    /* renamed from: g */
    public int f15743g;

    public C2932nz(C0836t tVar, int[] iArr, int i) {
        boolean z;
        int i2 = 0;
        if (iArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        C2725kr.m20987g(z);
        this.f15740d = i;
        this.f15737a = (C0836t) C2725kr.m20985e(tVar);
        int length = iArr.length;
        this.f15738b = length;
        this.f15741e = new C0792h[length];
        for (int i3 = 0; i3 < iArr.length; i3++) {
            this.f15741e[i3] = tVar.mo6918c(iArr[i3]);
        }
        Arrays.sort(this.f15741e, new C2858mz());
        this.f15739c = new int[this.f15738b];
        while (true) {
            int i4 = this.f15738b;
            if (i2 < i4) {
                this.f15739c[i2] = tVar.mo6919d(this.f15741e[i2]);
                i2++;
            } else {
                this.f15742f = new long[i4];
                return;
            }
        }
    }

    /* renamed from: v */
    public static /* synthetic */ int m23528v(C0792h hVar, C0792h hVar2) {
        return hVar2.f4203x - hVar.f4203x;
    }

    /* renamed from: a */
    public final int mo7662a(C0792h hVar) {
        for (int i = 0; i < this.f15738b; i++) {
            if (this.f15741e[i] == hVar) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public final C0792h mo7663b(int i) {
        return this.f15741e[i];
    }

    /* renamed from: c */
    public void mo7664c() {
    }

    /* renamed from: e */
    public /* synthetic */ boolean mo7666e(long j, pe0 pe0, List list) {
        return cx1.m14593d(this, j, pe0, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2932nz nzVar = (C2932nz) obj;
        if (this.f15737a != nzVar.f15737a || !Arrays.equals(this.f15739c, nzVar.f15739c)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public boolean mo7668f(int i, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean g = mo7669g(i, elapsedRealtime);
        for (int i2 = 0; i2 < this.f15738b && !g; i2++) {
            if (i2 == i || mo7669g(i2, elapsedRealtime)) {
                g = false;
            } else {
                g = true;
            }
        }
        if (!g) {
            return false;
        }
        long[] jArr = this.f15742f;
        jArr[i] = Math.max(jArr[i], w67.m29344b(elapsedRealtime, j, Long.MAX_VALUE));
        return true;
    }

    /* renamed from: g */
    public boolean mo7669g(int i, long j) {
        if (this.f15742f[i] > j) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final int mo7670h(int i) {
        return this.f15739c[i];
    }

    public int hashCode() {
        if (this.f15743g == 0) {
            this.f15743g = (System.identityHashCode(this.f15737a) * 31) + Arrays.hashCode(this.f15739c);
        }
        return this.f15743g;
    }

    /* renamed from: i */
    public void mo7672i(float f) {
    }

    /* renamed from: k */
    public /* synthetic */ void mo7674k() {
        cx1.m14590a(this);
    }

    /* renamed from: l */
    public final int mo7675l(int i) {
        for (int i2 = 0; i2 < this.f15738b; i2++) {
            if (this.f15739c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    public final int length() {
        return this.f15739c.length;
    }

    /* renamed from: n */
    public final C0836t mo7678n() {
        return this.f15737a;
    }

    /* renamed from: o */
    public /* synthetic */ void mo7679o(boolean z) {
        cx1.m14591b(this, z);
    }

    /* renamed from: p */
    public void mo7680p() {
    }

    /* renamed from: q */
    public int mo7681q(long j, List<? extends qq3> list) {
        return list.size();
    }

    /* renamed from: r */
    public final C0792h mo7682r() {
        return this.f15741e[mo7665d()];
    }

    /* renamed from: t */
    public /* synthetic */ void mo7684t() {
        cx1.m14592c(this);
    }
}
