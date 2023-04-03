package p000;

import android.util.Pair;
import androidx.media3.common.C0831s;
import androidx.media3.common.C0836t;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.source.C0973i;
import java.util.Arrays;

/* renamed from: xn3 */
/* compiled from: MappingTrackSelector */
public abstract class xn3 extends ft6 {

    /* renamed from: c */
    public C3633a f19921c;

    /* renamed from: xn3$a */
    /* compiled from: MappingTrackSelector */
    public static final class C3633a {

        /* renamed from: a */
        public final int f19922a;

        /* renamed from: b */
        public final String[] f19923b;

        /* renamed from: c */
        public final int[] f19924c;

        /* renamed from: d */
        public final ws6[] f19925d;

        /* renamed from: e */
        public final int[] f19926e;

        /* renamed from: f */
        public final int[][][] f19927f;

        /* renamed from: g */
        public final ws6 f19928g;

        public C3633a(String[] strArr, int[] iArr, ws6[] ws6Arr, int[] iArr2, int[][][] iArr3, ws6 ws6) {
            this.f19923b = strArr;
            this.f19924c = iArr;
            this.f19925d = ws6Arr;
            this.f19927f = iArr3;
            this.f19926e = iArr2;
            this.f19928g = ws6;
            this.f19922a = iArr.length;
        }

        /* renamed from: a */
        public int mo27833a(int i, int i2, boolean z) {
            int i3 = this.f19925d[i].mo27595b(i2).f4469a;
            int[] iArr = new int[i3];
            int i4 = 0;
            for (int i5 = 0; i5 < i3; i5++) {
                int g = mo27839g(i, i2, i5);
                if (g == 4 || (z && g == 3)) {
                    iArr[i4] = i5;
                    i4++;
                }
            }
            return mo27834b(i, i2, Arrays.copyOf(iArr, i4));
        }

        /* renamed from: b */
        public int mo27834b(int i, int i2, int[] iArr) {
            int i3 = 0;
            int i4 = 16;
            String str = null;
            boolean z = false;
            int i5 = 0;
            while (i3 < iArr.length) {
                String str2 = this.f19925d[i].mo27595b(i2).mo6918c(iArr[i3]).f4175C;
                int i6 = i5 + 1;
                if (i5 == 0) {
                    str = str2;
                } else {
                    z |= !w67.m29346c(str, str2);
                }
                i4 = Math.min(i4, nd5.m23116d(this.f19927f[i][i2][i3]));
                i3++;
                i5 = i6;
            }
            if (z) {
                return Math.min(i4, this.f19926e[i]);
            }
            return i4;
        }

        /* renamed from: c */
        public int mo27835c(int i, int i2, int i3) {
            return this.f19927f[i][i2][i3];
        }

        /* renamed from: d */
        public int mo27836d() {
            return this.f19922a;
        }

        /* renamed from: e */
        public int mo27837e(int i) {
            return this.f19924c[i];
        }

        /* renamed from: f */
        public ws6 mo27838f(int i) {
            return this.f19925d[i];
        }

        /* renamed from: g */
        public int mo27839g(int i, int i2, int i3) {
            return nd5.m23118f(mo27835c(i, i2, i3));
        }

        /* renamed from: h */
        public ws6 mo27840h() {
            return this.f19928g;
        }
    }

    /* renamed from: k */
    public static int m30232k(od5[] od5Arr, C0836t tVar, int[] iArr, boolean z) throws ExoPlaybackException {
        boolean z2;
        int length = od5Arr.length;
        boolean z3 = true;
        int i = 0;
        for (int i2 = 0; i2 < od5Arr.length; i2++) {
            od5 od5 = od5Arr[i2];
            int i3 = 0;
            for (int i4 = 0; i4 < tVar.f4469a; i4++) {
                i3 = Math.max(i3, nd5.m23118f(od5.mo7438a(tVar.mo6918c(i4))));
            }
            if (iArr[i2] == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (i3 > i || (i3 == i && z && !z3 && z2)) {
                length = i2;
                z3 = z2;
                i = i3;
            }
        }
        return length;
    }

    /* renamed from: l */
    public static int[] m30233l(od5 od5, C0836t tVar) throws ExoPlaybackException {
        int[] iArr = new int[tVar.f4469a];
        for (int i = 0; i < tVar.f4469a; i++) {
            iArr[i] = od5.mo7438a(tVar.mo6918c(i));
        }
        return iArr;
    }

    /* renamed from: m */
    public static int[] m30234m(od5[] od5Arr) throws ExoPlaybackException {
        int length = od5Arr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = od5Arr[i].mo7467t();
        }
        return iArr;
    }

    /* renamed from: f */
    public final void mo20184f(Object obj) {
        this.f19921c = (C3633a) obj;
    }

    /* renamed from: h */
    public final gt6 mo20186h(od5[] od5Arr, ws6 ws6, C0973i.C0975b bVar, C0831s sVar) throws ExoPlaybackException {
        boolean z;
        int[] iArr;
        od5[] od5Arr2 = od5Arr;
        ws6 ws62 = ws6;
        int[] iArr2 = new int[(od5Arr2.length + 1)];
        int length = od5Arr2.length + 1;
        C0836t[][] tVarArr = new C0836t[length][];
        int[][][] iArr3 = new int[(od5Arr2.length + 1)][][];
        for (int i = 0; i < length; i++) {
            int i2 = ws62.f19234a;
            tVarArr[i] = new C0836t[i2];
            iArr3[i] = new int[i2][];
        }
        int[] m = m30234m(od5Arr);
        for (int i3 = 0; i3 < ws62.f19234a; i3++) {
            C0836t b = ws62.mo27595b(i3);
            if (b.f4471e == 5) {
                z = true;
            } else {
                z = false;
            }
            int k = m30232k(od5Arr, b, iArr2, z);
            if (k == od5Arr2.length) {
                iArr = new int[b.f4469a];
            } else {
                iArr = m30233l(od5Arr2[k], b);
            }
            int i4 = iArr2[k];
            tVarArr[k][i4] = b;
            iArr3[k][i4] = iArr;
            iArr2[k] = i4 + 1;
        }
        ws6[] ws6Arr = new ws6[od5Arr2.length];
        String[] strArr = new String[od5Arr2.length];
        int[] iArr4 = new int[od5Arr2.length];
        for (int i5 = 0; i5 < od5Arr2.length; i5++) {
            int i6 = iArr2[i5];
            ws6Arr[i5] = new ws6((C0836t[]) w67.m29299C0(tVarArr[i5], i6));
            iArr3[i5] = (int[][]) w67.m29299C0(iArr3[i5], i6);
            strArr[i5] = od5Arr2[i5].getName();
            iArr4[i5] = od5Arr2[i5].mo21684f();
        }
        C3633a aVar = new C3633a(strArr, iArr4, ws6Arr, m, iArr3, new ws6((C0836t[]) w67.m29299C0(tVarArr[od5Arr2.length], iArr2[od5Arr2.length])));
        Pair<pd5[], dx1[]> n = mo23580n(aVar, iArr3, m, bVar, sVar);
        return new gt6((pd5[]) n.first, (dx1[]) n.second, et6.m16339a(aVar, (bt6[]) n.second), aVar);
    }

    /* renamed from: n */
    public abstract Pair<pd5[], dx1[]> mo23580n(C3633a aVar, int[][][] iArr, int[] iArr2, C0973i.C0975b bVar, C0831s sVar) throws ExoPlaybackException;
}
