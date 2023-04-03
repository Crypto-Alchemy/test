package androidx.media3.exoplayer.dash;

import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.media3.common.C0792h;
import androidx.media3.common.C0836t;
import androidx.media3.exoplayer.dash.C0884a;
import androidx.media3.exoplayer.dash.C0892d;
import androidx.media3.exoplayer.drm.C0909b;
import androidx.media3.exoplayer.drm.C0912c;
import androidx.media3.exoplayer.source.C0971h;
import androidx.media3.exoplayer.source.C0977j;
import androidx.media3.exoplayer.source.C1002q;
import androidx.media3.exoplayer.upstream.C1019b;
import com.google.common.primitives.Ints;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p000.ue0;

/* renamed from: androidx.media3.exoplayer.dash.b */
/* compiled from: DashMediaPeriod */
public final class C0886b implements C0971h, C1002q.C1003a<ue0<C0884a>>, ue0.C3405b<C0884a> {

    /* renamed from: b1 */
    public static final Pattern f4853b1 = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");

    /* renamed from: v0 */
    public static final Pattern f4854v0 = Pattern.compile("CC([1-4])=(.+)");

    /* renamed from: A */
    public final ws6 f4855A;

    /* renamed from: B */
    public final C0887a[] f4856B;

    /* renamed from: C */
    public final tn0 f4857C;

    /* renamed from: H */
    public final C0892d f4858H;

    /* renamed from: I */
    public final IdentityHashMap<ue0<C0884a>, C0892d.C0895c> f4859I = new IdentityHashMap<>();

    /* renamed from: L */
    public final C0977j.C0978a f4860L;

    /* renamed from: M */
    public final C0909b.C0910a f4861M;

    /* renamed from: P */
    public final br4 f4862P;

    /* renamed from: Q */
    public C0971h.C0972a f4863Q;

    /* renamed from: U */
    public ue0<C0884a>[] f4864U = m6367D(0);

    /* renamed from: X */
    public cu1[] f4865X = new cu1[0];

    /* renamed from: Y */
    public C1002q f4866Y;

    /* renamed from: Z */
    public d11 f4867Z;

    /* renamed from: a */
    public final int f4868a;

    /* renamed from: d */
    public final C0884a.C0885a f4869d;

    /* renamed from: e */
    public final ov6 f4870e;

    /* renamed from: e0 */
    public int f4871e0;

    /* renamed from: g */
    public final C0912c f4872g;

    /* renamed from: k */
    public final C1019b f4873k;

    /* renamed from: k0 */
    public List<ju1> f4874k0;

    /* renamed from: r */
    public final C3178qz f4875r;

    /* renamed from: s */
    public final long f4876s;

    /* renamed from: x */
    public final cj3 f4877x;

    /* renamed from: y */
    public final C2891nf f4878y;

    /* renamed from: androidx.media3.exoplayer.dash.b$a */
    /* compiled from: DashMediaPeriod */
    public static final class C0887a {

        /* renamed from: a */
        public final int[] f4879a;

        /* renamed from: b */
        public final int f4880b;

        /* renamed from: c */
        public final int f4881c;

        /* renamed from: d */
        public final int f4882d;

        /* renamed from: e */
        public final int f4883e;

        /* renamed from: f */
        public final int f4884f;

        /* renamed from: g */
        public final int f4885g;

        public C0887a(int i, int i2, int[] iArr, int i3, int i4, int i5, int i6) {
            this.f4880b = i;
            this.f4879a = iArr;
            this.f4881c = i2;
            this.f4883e = i3;
            this.f4884f = i4;
            this.f4885g = i5;
            this.f4882d = i6;
        }

        /* renamed from: a */
        public static C0887a m6401a(int[] iArr, int i) {
            return new C0887a(3, 1, iArr, i, -1, -1, -1);
        }

        /* renamed from: b */
        public static C0887a m6402b(int[] iArr, int i) {
            return new C0887a(5, 1, iArr, i, -1, -1, -1);
        }

        /* renamed from: c */
        public static C0887a m6403c(int i) {
            return new C0887a(5, 2, new int[0], -1, -1, -1, i);
        }

        /* renamed from: d */
        public static C0887a m6404d(int i, int[] iArr, int i2, int i3, int i4) {
            return new C0887a(i, 0, iArr, i2, i3, i4, -1);
        }
    }

    public C0886b(int i, d11 d11, C3178qz qzVar, int i2, C0884a.C0885a aVar, ov6 ov6, C0912c cVar, C0909b.C0910a aVar2, C1019b bVar, C0977j.C0978a aVar3, long j, cj3 cj3, C2891nf nfVar, tn0 tn0, C0892d.C0894b bVar2, br4 br4) {
        C2891nf nfVar2 = nfVar;
        tn0 tn02 = tn0;
        this.f4868a = i;
        this.f4867Z = d11;
        this.f4875r = qzVar;
        this.f4871e0 = i2;
        this.f4869d = aVar;
        this.f4870e = ov6;
        this.f4872g = cVar;
        this.f4861M = aVar2;
        this.f4873k = bVar;
        this.f4860L = aVar3;
        this.f4876s = j;
        this.f4877x = cj3;
        this.f4878y = nfVar2;
        this.f4857C = tn02;
        this.f4862P = br4;
        this.f4858H = new C0892d(d11, bVar2, nfVar2);
        this.f4866Y = tn02.mo20411a(this.f4864U);
        jn4 d = d11.mo18392d(i2);
        List<ju1> list = d.f13725d;
        this.f4874k0 = list;
        Pair<ws6, C0887a[]> s = m6371s(cVar, d.f13724c, list);
        this.f4855A = (ws6) s.first;
        this.f4856B = (C0887a[]) s.second;
    }

    /* renamed from: B */
    public static boolean m6365B(List<C2751lb> list, int[] iArr) {
        for (int i : iArr) {
            List<xd5> list2 = list.get(i).f14465c;
            for (int i2 = 0; i2 < list2.size(); i2++) {
                if (!list2.get(i2).f19813e.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: C */
    public static int m6366C(int i, List<C2751lb> list, int[][] iArr, boolean[] zArr, C0792h[][] hVarArr) {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (m6365B(list, iArr[i3])) {
                zArr[i3] = true;
                i2++;
            }
            C0792h[] x = m6375x(list, iArr[i3]);
            hVarArr[i3] = x;
            if (x.length != 0) {
                i2++;
            }
        }
        return i2;
    }

    /* renamed from: D */
    public static ue0<C0884a>[] m6367D(int i) {
        return new ue0[i];
    }

    /* renamed from: F */
    public static C0792h[] m6368F(sc1 sc1, Pattern pattern, C0792h hVar) {
        String str = sc1.f17609b;
        if (str == null) {
            return new C0792h[]{hVar};
        }
        String[] L0 = w67.m29317L0(str, ";");
        C0792h[] hVarArr = new C0792h[L0.length];
        for (int i = 0; i < L0.length; i++) {
            Matcher matcher = pattern.matcher(L0[i]);
            if (!matcher.matches()) {
                return new C0792h[]{hVar};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            hVarArr[i] = hVar.mo6636b().mo6658S(hVar.f4186a + ":" + parseInt).mo6645F(parseInt).mo6661V(matcher.group(2)).mo6644E();
        }
        return hVarArr;
    }

    /* renamed from: k */
    public static void m6369k(List<ju1> list, C0836t[] tVarArr, C0887a[] aVarArr, int i) {
        int i2 = 0;
        while (i2 < list.size()) {
            ju1 ju1 = list.get(i2);
            tVarArr[i] = new C0836t(ju1.mo22087a() + ":" + i2, new C0792h.C0794b().mo6658S(ju1.mo22087a()).mo6670e0("application/x-emsg").mo6644E());
            aVarArr[i] = C0887a.m6403c(i2);
            i2++;
            i++;
        }
    }

    /* renamed from: n */
    public static int m6370n(C0912c cVar, List<C2751lb> list, int[][] iArr, int i, boolean[] zArr, C0792h[][] hVarArr, C0836t[] tVarArr, C0887a[] aVarArr) {
        String str;
        int i2;
        int i3;
        List<C2751lb> list2 = list;
        int i4 = i;
        int i5 = 0;
        int i6 = 0;
        while (i5 < i4) {
            int[] iArr2 = iArr[i5];
            ArrayList arrayList = new ArrayList();
            for (int i7 : iArr2) {
                arrayList.addAll(list2.get(i7).f14465c);
            }
            int size = arrayList.size();
            C0792h[] hVarArr2 = new C0792h[size];
            for (int i8 = 0; i8 < size; i8++) {
                C0792h hVar = ((xd5) arrayList.get(i8)).f19810b;
                hVarArr2[i8] = hVar.mo6637c(cVar.mo7361d(hVar));
            }
            C0912c cVar2 = cVar;
            C2751lb lbVar = list2.get(iArr2[0]);
            int i9 = lbVar.f14463a;
            if (i9 != -1) {
                str = Integer.toString(i9);
            } else {
                str = "unset:" + i5;
            }
            int i10 = i6 + 1;
            if (zArr[i5]) {
                i2 = i10 + 1;
            } else {
                i2 = i10;
                i10 = -1;
            }
            if (hVarArr[i5].length != 0) {
                i3 = i2 + 1;
            } else {
                i3 = i2;
                i2 = -1;
            }
            tVarArr[i6] = new C0836t(str, hVarArr2);
            aVarArr[i6] = C0887a.m6404d(lbVar.f14464b, iArr2, i6, i10, i2);
            if (i10 != -1) {
                String str2 = str + ":emsg";
                tVarArr[i10] = new C0836t(str2, new C0792h.C0794b().mo6658S(str2).mo6670e0("application/x-emsg").mo6644E());
                aVarArr[i10] = C0887a.m6402b(iArr2, i6);
            }
            if (i2 != -1) {
                tVarArr[i2] = new C0836t(str + ":cc", hVarArr[i5]);
                aVarArr[i2] = C0887a.m6401a(iArr2, i6);
            }
            i5++;
            i6 = i3;
        }
        return i6;
    }

    /* renamed from: s */
    public static Pair<ws6, C0887a[]> m6371s(C0912c cVar, List<C2751lb> list, List<ju1> list2) {
        int[][] y = m6376y(list);
        int length = y.length;
        boolean[] zArr = new boolean[length];
        C0792h[][] hVarArr = new C0792h[length][];
        int C = m6366C(length, list, y, zArr, hVarArr) + length + list2.size();
        C0836t[] tVarArr = new C0836t[C];
        C0887a[] aVarArr = new C0887a[C];
        m6369k(list2, tVarArr, aVarArr, m6370n(cVar, list, y, length, zArr, hVarArr, tVarArr, aVarArr));
        return Pair.create(new ws6(tVarArr), aVarArr);
    }

    /* renamed from: u */
    public static sc1 m6372u(List<sc1> list) {
        return m6373v(list, "urn:mpeg:dash:adaptation-set-switching:2016");
    }

    /* renamed from: v */
    public static sc1 m6373v(List<sc1> list, String str) {
        for (int i = 0; i < list.size(); i++) {
            sc1 sc1 = list.get(i);
            if (str.equals(sc1.f17608a)) {
                return sc1;
            }
        }
        return null;
    }

    /* renamed from: w */
    public static sc1 m6374w(List<sc1> list) {
        return m6373v(list, "http://dashif.org/guidelines/trickmode");
    }

    /* renamed from: x */
    public static C0792h[] m6375x(List<C2751lb> list, int[] iArr) {
        for (int i : iArr) {
            C2751lb lbVar = list.get(i);
            List<sc1> list2 = list.get(i).f14466d;
            int i2 = 0;
            while (i2 < list2.size()) {
                sc1 sc1 = list2.get(i2);
                if ("urn:scte:dash:cc:cea-608:2015".equals(sc1.f17608a)) {
                    return m6368F(sc1, f4854v0, new C0792h.C0794b().mo6670e0("application/cea-608").mo6658S(lbVar.f14463a + ":cea608").mo6644E());
                } else if ("urn:scte:dash:cc:cea-708:2015".equals(sc1.f17608a)) {
                    return m6368F(sc1, f4853b1, new C0792h.C0794b().mo6670e0("application/cea-708").mo6658S(lbVar.f14463a + ":cea708").mo6644E());
                } else {
                    i2++;
                }
            }
        }
        return new C0792h[0];
    }

    /* renamed from: y */
    public static int[][] m6376y(List<C2751lb> list) {
        int i;
        sc1 u;
        int size = list.size();
        SparseIntArray sparseIntArray = new SparseIntArray(size);
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i2 = 0; i2 < size; i2++) {
            sparseIntArray.put(list.get(i2).f14463a, i2);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i2));
            arrayList.add(arrayList2);
            sparseArray.put(i2, arrayList2);
        }
        for (int i3 = 0; i3 < size; i3++) {
            C2751lb lbVar = list.get(i3);
            sc1 w = m6374w(lbVar.f14467e);
            if (w == null) {
                w = m6374w(lbVar.f14468f);
            }
            if (w == null || (i = sparseIntArray.get(Integer.parseInt(w.f17609b), -1)) == -1) {
                i = i3;
            }
            if (i == i3 && (u = m6372u(lbVar.f14468f)) != null) {
                for (String parseInt : w67.m29317L0(u.f17609b, ",")) {
                    int i4 = sparseIntArray.get(Integer.parseInt(parseInt), -1);
                    if (i4 != -1) {
                        i = Math.min(i, i4);
                    }
                }
            }
            if (i != i3) {
                List list2 = (List) sparseArray.get(i3);
                List list3 = (List) sparseArray.get(i);
                list3.addAll(list2);
                sparseArray.put(i3, list3);
                arrayList.remove(list2);
            }
        }
        int size2 = arrayList.size();
        int[][] iArr = new int[size2][];
        for (int i5 = 0; i5 < size2; i5++) {
            int[] k = Ints.m37052k((Collection) arrayList.get(i5));
            iArr[i5] = k;
            Arrays.sort(k);
        }
        return iArr;
    }

    /* renamed from: A */
    public final int[] mo7234A(dx1[] dx1Arr) {
        int[] iArr = new int[dx1Arr.length];
        for (int i = 0; i < dx1Arr.length; i++) {
            dx1 dx1 = dx1Arr[i];
            if (dx1 != null) {
                iArr[i] = this.f4855A.mo27596c(dx1.mo7678n());
            } else {
                iArr[i] = -1;
            }
        }
        return iArr;
    }

    /* renamed from: E */
    public void mo7246g(ue0<C0884a> ue0) {
        this.f4863Q.mo7246g(this);
    }

    /* renamed from: G */
    public void mo7236G() {
        this.f4858H.mo7297o();
        for (ue0<C0884a> P : this.f4864U) {
            P.mo26751P(this);
        }
        this.f4863Q = null;
    }

    /* renamed from: H */
    public final void mo7237H(dx1[] dx1Arr, boolean[] zArr, yk5[] yk5Arr) {
        for (int i = 0; i < dx1Arr.length; i++) {
            if (dx1Arr[i] == null || !zArr[i]) {
                ue0 ue0 = yk5Arr[i];
                if (ue0 instanceof ue0) {
                    ue0.mo26751P(this);
                } else if (ue0 instanceof ue0.C3404a) {
                    ((ue0.C3404a) ue0).mo26758c();
                }
                yk5Arr[i] = null;
            }
        }
    }

    /* renamed from: I */
    public final void mo7238I(dx1[] dx1Arr, yk5[] yk5Arr, int[] iArr) {
        boolean z;
        for (int i = 0; i < dx1Arr.length; i++) {
            yk5 yk5 = yk5Arr[i];
            if ((yk5 instanceof xo1) || (yk5 instanceof ue0.C3404a)) {
                int z2 = mo7257z(i, iArr);
                if (z2 == -1) {
                    z = yk5Arr[i] instanceof xo1;
                } else {
                    ue0.C3404a aVar = yk5Arr[i];
                    if (!(aVar instanceof ue0.C3404a) || aVar.f18462a != yk5Arr[z2]) {
                        z = false;
                    } else {
                        z = true;
                    }
                }
                if (!z) {
                    ue0.C3404a aVar2 = yk5Arr[i];
                    if (aVar2 instanceof ue0.C3404a) {
                        aVar2.mo26758c();
                    }
                    yk5Arr[i] = null;
                }
            }
        }
    }

    /* renamed from: J */
    public final void mo7239J(dx1[] dx1Arr, yk5[] yk5Arr, boolean[] zArr, long j, int[] iArr) {
        for (int i = 0; i < dx1Arr.length; i++) {
            dx1 dx1 = dx1Arr[i];
            if (dx1 != null) {
                ue0 ue0 = yk5Arr[i];
                if (ue0 == null) {
                    zArr[i] = true;
                    C0887a aVar = this.f4856B[iArr[i]];
                    int i2 = aVar.f4881c;
                    if (i2 == 0) {
                        yk5Arr[i] = mo7253p(aVar, dx1, j);
                    } else if (i2 == 2) {
                        yk5Arr[i] = new cu1(this.f4874k0.get(aVar.f4882d), dx1.mo7678n().mo6918c(0), this.f4867Z.f10422d);
                    }
                } else if (ue0 instanceof ue0) {
                    ((C0884a) ue0.mo26740E()).mo7232i(dx1);
                }
            }
        }
        for (int i3 = 0; i3 < dx1Arr.length; i3++) {
            if (yk5Arr[i3] == null && dx1Arr[i3] != null) {
                C0887a aVar2 = this.f4856B[iArr[i3]];
                if (aVar2.f4881c == 1) {
                    int z = mo7257z(i3, iArr);
                    if (z == -1) {
                        yk5Arr[i3] = new xo1();
                    } else {
                        yk5Arr[i3] = yk5Arr[z].mo26754S(j, aVar2.f4880b);
                    }
                }
            }
        }
    }

    /* renamed from: K */
    public void mo7240K(d11 d11, int i) {
        this.f4867Z = d11;
        this.f4871e0 = i;
        this.f4858H.mo7299q(d11);
        ue0<C0884a>[] ue0Arr = this.f4864U;
        if (ue0Arr != null) {
            for (ue0<C0884a> E : ue0Arr) {
                E.mo26740E().mo7231f(d11, i);
            }
            this.f4863Q.mo7246g(this);
        }
        this.f4874k0 = d11.mo18392d(i).f13725d;
        for (cu1 cu1 : this.f4865X) {
            Iterator<ju1> it = this.f4874k0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ju1 next = it.next();
                if (next.mo22087a().equals(cu1.mo18284a())) {
                    boolean z = true;
                    int e = d11.mo18393e() - 1;
                    if (!d11.f10422d || i != e) {
                        z = false;
                    }
                    cu1.mo18286d(next, z);
                }
            }
        }
    }

    /* renamed from: a */
    public long mo7241a() {
        return this.f4866Y.mo7241a();
    }

    /* renamed from: b */
    public synchronized void mo7242b(ue0<C0884a> ue0) {
        C0892d.C0895c remove = this.f4859I.remove(ue0);
        if (remove != null) {
            remove.mo7313n();
        }
    }

    /* renamed from: c */
    public long mo7243c(long j, ys5 ys5) {
        for (ue0<C0884a> ue0 : this.f4864U) {
            if (ue0.f18452a == 2) {
                return ue0.mo26755c(j, ys5);
            }
        }
        return j;
    }

    /* renamed from: d */
    public boolean mo7244d() {
        return this.f4866Y.mo7244d();
    }

    /* renamed from: e */
    public boolean mo7245e(long j) {
        return this.f4866Y.mo7245e(j);
    }

    /* renamed from: h */
    public long mo7247h() {
        return this.f4866Y.mo7247h();
    }

    /* renamed from: i */
    public void mo7248i(long j) {
        this.f4866Y.mo7248i(j);
    }

    /* renamed from: j */
    public long mo7249j(dx1[] dx1Arr, boolean[] zArr, yk5[] yk5Arr, boolean[] zArr2, long j) {
        int[] A = mo7234A(dx1Arr);
        mo7237H(dx1Arr, zArr, yk5Arr);
        mo7238I(dx1Arr, yk5Arr, A);
        mo7239J(dx1Arr, yk5Arr, zArr2, j, A);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (ue0 ue0 : yk5Arr) {
            if (ue0 instanceof ue0) {
                arrayList.add(ue0);
            } else if (ue0 instanceof cu1) {
                arrayList2.add((cu1) ue0);
            }
        }
        ue0<C0884a>[] D = m6367D(arrayList.size());
        this.f4864U = D;
        arrayList.toArray(D);
        cu1[] cu1Arr = new cu1[arrayList2.size()];
        this.f4865X = cu1Arr;
        arrayList2.toArray(cu1Arr);
        this.f4866Y = this.f4857C.mo20411a(this.f4864U);
        return j;
    }

    /* renamed from: l */
    public long mo7250l(long j) {
        for (ue0<C0884a> R : this.f4864U) {
            R.mo26753R(j);
        }
        for (cu1 c : this.f4865X) {
            c.mo18285c(j);
        }
        return j;
    }

    /* renamed from: m */
    public long mo7251m() {
        return CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
    }

    /* renamed from: o */
    public void mo7252o() throws IOException {
        this.f4877x.mo7226b();
    }

    /* renamed from: p */
    public final ue0<C0884a> mo7253p(C0887a aVar, dx1 dx1, long j) {
        boolean z;
        int i;
        C0836t tVar;
        boolean z2;
        C0836t tVar2;
        int i2;
        C0887a aVar2 = aVar;
        int i3 = aVar2.f4884f;
        if (i3 != -1) {
            z = true;
        } else {
            z = false;
        }
        C0892d.C0895c cVar = null;
        if (z) {
            tVar = this.f4855A.mo27595b(i3);
            i = 1;
        } else {
            i = 0;
            tVar = null;
        }
        int i4 = aVar2.f4885g;
        if (i4 != -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            tVar2 = this.f4855A.mo27595b(i4);
            i += tVar2.f4469a;
        } else {
            tVar2 = null;
        }
        C0792h[] hVarArr = new C0792h[i];
        int[] iArr = new int[i];
        if (z) {
            hVarArr[0] = tVar.mo6918c(0);
            iArr[0] = 5;
            i2 = 1;
        } else {
            i2 = 0;
        }
        ArrayList arrayList = new ArrayList();
        if (z2) {
            for (int i5 = 0; i5 < tVar2.f4469a; i5++) {
                C0792h c = tVar2.mo6918c(i5);
                hVarArr[i2] = c;
                iArr[i2] = 3;
                arrayList.add(c);
                i2++;
            }
        }
        if (this.f4867Z.f10422d && z) {
            cVar = this.f4858H.mo7293k();
        }
        C0892d.C0895c cVar2 = cVar;
        C0892d.C0895c cVar3 = cVar2;
        ue0 ue0 = new ue0(aVar2.f4880b, iArr, hVarArr, this.f4869d.mo7233a(this.f4877x, this.f4867Z, this.f4875r, this.f4871e0, aVar2.f4879a, dx1, aVar2.f4880b, this.f4876s, z, arrayList, cVar2, this.f4870e, this.f4862P), this, this.f4878y, j, this.f4872g, this.f4861M, this.f4873k, this.f4860L);
        synchronized (this) {
            this.f4859I.put(ue0, cVar3);
        }
        return ue0;
    }

    /* renamed from: q */
    public void mo7254q(C0971h.C0972a aVar, long j) {
        this.f4863Q = aVar;
        aVar.mo7587f(this);
    }

    /* renamed from: r */
    public ws6 mo7255r() {
        return this.f4855A;
    }

    /* renamed from: t */
    public void mo7256t(long j, boolean z) {
        for (ue0<C0884a> t : this.f4864U) {
            t.mo26756t(j, z);
        }
    }

    /* renamed from: z */
    public final int mo7257z(int i, int[] iArr) {
        int i2 = iArr[i];
        if (i2 == -1) {
            return -1;
        }
        int i3 = this.f4856B[i2].f4883e;
        for (int i4 = 0; i4 < iArr.length; i4++) {
            int i5 = iArr[i4];
            if (i5 == i3 && this.f4856B[i5].f4881c == 0) {
                return i4;
            }
        }
        return -1;
    }
}
