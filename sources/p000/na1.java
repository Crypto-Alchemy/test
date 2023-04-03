package p000;

import android.content.Context;
import android.graphics.Point;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.media3.common.C0778b;
import androidx.media3.common.C0785d;
import androidx.media3.common.C0792h;
import androidx.media3.common.C0831s;
import androidx.media3.common.C0836t;
import androidx.media3.common.C0837u;
import androidx.media3.common.C0840v;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.source.C0973i;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Ordering;
import com.google.common.primitives.Ints;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.p023ws.WebSocketProtocol;
import p000.C2817mb;
import p000.dx1;
import p000.xn3;

/* renamed from: na1 */
/* compiled from: DefaultTrackSelector */
public class na1 extends xn3 {

    /* renamed from: k */
    public static final Ordering<Integer> f15411k = Ordering.from(new ka1());

    /* renamed from: l */
    public static final Ordering<Integer> f15412l = Ordering.from(new la1());

    /* renamed from: d */
    public final Object f15413d;

    /* renamed from: e */
    public final Context f15414e;

    /* renamed from: f */
    public final dx1.C2208b f15415f;

    /* renamed from: g */
    public final boolean f15416g;

    /* renamed from: h */
    public C2881d f15417h;

    /* renamed from: i */
    public C2884f f15418i;

    /* renamed from: j */
    public C0778b f15419j;

    /* renamed from: na1$b */
    /* compiled from: DefaultTrackSelector */
    public static final class C2879b extends C2887h<C2879b> implements Comparable<C2879b> {

        /* renamed from: A */
        public final int f15420A;

        /* renamed from: B */
        public final int f15421B;

        /* renamed from: C */
        public final int f15422C;

        /* renamed from: H */
        public final boolean f15423H;

        /* renamed from: I */
        public final int f15424I;

        /* renamed from: L */
        public final int f15425L;

        /* renamed from: M */
        public final boolean f15426M;

        /* renamed from: P */
        public final int f15427P;

        /* renamed from: Q */
        public final int f15428Q;

        /* renamed from: U */
        public final int f15429U;

        /* renamed from: X */
        public final int f15430X;

        /* renamed from: Y */
        public final boolean f15431Y;

        /* renamed from: Z */
        public final boolean f15432Z;

        /* renamed from: k */
        public final int f15433k;

        /* renamed from: r */
        public final boolean f15434r;

        /* renamed from: s */
        public final String f15435s = na1.m22915T(this.f15495g.f4189e);

        /* renamed from: x */
        public final C2881d f15436x;

        /* renamed from: y */
        public final boolean f15437y;

        public C2879b(int i, C0836t tVar, int i2, C2881d dVar, int i3, boolean z, ku4<C0792h> ku4) {
            super(i, tVar, i2);
            int i4;
            int i5;
            boolean z2;
            boolean z3;
            boolean z4;
            int i6;
            boolean z5;
            this.f15436x = dVar;
            boolean z6 = false;
            this.f15437y = na1.m22908L(i3, false);
            int i7 = 0;
            while (true) {
                i4 = Integer.MAX_VALUE;
                if (i7 >= dVar.f4497I.size()) {
                    i5 = 0;
                    i7 = Integer.MAX_VALUE;
                    break;
                }
                i5 = na1.m22902D(this.f15495g, dVar.f4497I.get(i7), false);
                if (i5 > 0) {
                    break;
                }
                i7++;
            }
            this.f15421B = i7;
            this.f15420A = i5;
            this.f15422C = na1.m22905H(this.f15495g.f4193k, dVar.f4498L);
            C0792h hVar = this.f15495g;
            int i8 = hVar.f4193k;
            if (i8 == 0 || (i8 & 1) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f15423H = z2;
            if ((hVar.f4192g & 1) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.f15426M = z3;
            int i9 = hVar.f4202v0;
            this.f15427P = i9;
            this.f15428Q = hVar.f4187b1;
            int i10 = hVar.f4203x;
            this.f15429U = i10;
            if ((i10 == -1 || i10 <= dVar.f4500P) && ((i9 == -1 || i9 <= dVar.f4499M) && ku4.apply(hVar))) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.f15434r = z4;
            String[] e0 = w67.m29351e0();
            int i11 = 0;
            while (true) {
                if (i11 >= e0.length) {
                    i6 = 0;
                    i11 = Integer.MAX_VALUE;
                    break;
                }
                i6 = na1.m22902D(this.f15495g, e0[i11], false);
                if (i6 > 0) {
                    break;
                }
                i11++;
            }
            this.f15424I = i11;
            this.f15425L = i6;
            int i12 = 0;
            while (true) {
                if (i12 < dVar.f4501Q.size()) {
                    String str = this.f15495g.f4175C;
                    if (str != null && str.equals(dVar.f4501Q.get(i12))) {
                        i4 = i12;
                        break;
                    }
                    i12++;
                } else {
                    break;
                }
            }
            this.f15430X = i4;
            if (nd5.m23117e(i3) == 128) {
                z5 = true;
            } else {
                z5 = false;
            }
            this.f15431Y = z5;
            this.f15432Z = nd5.m23119g(i3) == 64 ? true : z6;
            this.f15433k = mo23585h(i3, z);
        }

        /* renamed from: e */
        public static int m22945e(List<C2879b> list, List<C2879b> list2) {
            return ((C2879b) Collections.max(list)).compareTo((C2879b) Collections.max(list2));
        }

        /* renamed from: g */
        public static ImmutableList<C2879b> m22946g(int i, C0836t tVar, C2881d dVar, int[] iArr, boolean z, ku4<C0792h> ku4) {
            ImmutableList.C4534a builder = ImmutableList.builder();
            C0836t tVar2 = tVar;
            for (int i2 = 0; i2 < tVar2.f4469a; i2++) {
                builder.mo34667a(new C2879b(i, tVar, i2, dVar, iArr[i2], z, ku4));
            }
            return builder.mo34692l();
        }

        /* renamed from: a */
        public int mo23581a() {
            return this.f15433k;
        }

        /* renamed from: f */
        public int compareTo(C2879b bVar) {
            Ordering ordering;
            Ordering ordering2;
            if (!this.f15434r || !this.f15437y) {
                ordering = na1.f15411k.reverse();
            } else {
                ordering = na1.f15411k;
            }
            wl0 f = wl0.m53949j().mo49224g(this.f15437y, bVar.f15437y).mo49223f(Integer.valueOf(this.f15421B), Integer.valueOf(bVar.f15421B), Ordering.natural().reverse()).mo49221d(this.f15420A, bVar.f15420A).mo49221d(this.f15422C, bVar.f15422C).mo49224g(this.f15426M, bVar.f15426M).mo49224g(this.f15423H, bVar.f15423H).mo49223f(Integer.valueOf(this.f15424I), Integer.valueOf(bVar.f15424I), Ordering.natural().reverse()).mo49221d(this.f15425L, bVar.f15425L).mo49224g(this.f15434r, bVar.f15434r).mo49223f(Integer.valueOf(this.f15430X), Integer.valueOf(bVar.f15430X), Ordering.natural().reverse());
            Integer valueOf = Integer.valueOf(this.f15429U);
            Integer valueOf2 = Integer.valueOf(bVar.f15429U);
            if (this.f15436x.f4510e0) {
                ordering2 = na1.f15411k.reverse();
            } else {
                ordering2 = na1.f15412l;
            }
            wl0 f2 = f.mo49223f(valueOf, valueOf2, ordering2).mo49224g(this.f15431Y, bVar.f15431Y).mo49224g(this.f15432Z, bVar.f15432Z).mo49223f(Integer.valueOf(this.f15427P), Integer.valueOf(bVar.f15427P), ordering).mo49223f(Integer.valueOf(this.f15428Q), Integer.valueOf(bVar.f15428Q), ordering);
            Integer valueOf3 = Integer.valueOf(this.f15429U);
            Integer valueOf4 = Integer.valueOf(bVar.f15429U);
            if (!w67.m29346c(this.f15435s, bVar.f15435s)) {
                ordering = na1.f15412l;
            }
            return f2.mo49223f(valueOf3, valueOf4, ordering).mo49226i();
        }

        /* renamed from: h */
        public final int mo23585h(int i, boolean z) {
            if (!na1.m22908L(i, this.f15436x.f15443A1)) {
                return 0;
            }
            if (!this.f15434r && !this.f15436x.f15452u1) {
                return 0;
            }
            if (na1.m22908L(i, false) && this.f15434r && this.f15495g.f4203x != -1) {
                C2881d dVar = this.f15436x;
                if (dVar.f4513k0 || dVar.f4510e0 || (!dVar.f15445C1 && z)) {
                    return 1;
                }
                return 2;
            }
            return 1;
        }

        /* renamed from: i */
        public boolean mo23583d(C2879b bVar) {
            int i;
            String str;
            int i2;
            C2881d dVar = this.f15436x;
            if ((dVar.f15455x1 || ((i2 = this.f15495g.f4202v0) != -1 && i2 == bVar.f15495g.f4202v0)) && (dVar.f15453v1 || ((str = this.f15495g.f4175C) != null && TextUtils.equals(str, bVar.f15495g.f4175C)))) {
                C2881d dVar2 = this.f15436x;
                if ((dVar2.f15454w1 || ((i = this.f15495g.f4187b1) != -1 && i == bVar.f15495g.f4187b1)) && (dVar2.f15456y1 || (this.f15431Y == bVar.f15431Y && this.f15432Z == bVar.f15432Z))) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: na1$c */
    /* compiled from: DefaultTrackSelector */
    public static final class C2880c implements Comparable<C2880c> {

        /* renamed from: a */
        public final boolean f15438a;

        /* renamed from: d */
        public final boolean f15439d;

        public C2880c(C0792h hVar, int i) {
            this.f15438a = (hVar.f4192g & 1) == 0 ? false : true;
            this.f15439d = na1.m22908L(i, false);
        }

        /* renamed from: a */
        public int compareTo(C2880c cVar) {
            return wl0.m53949j().mo49224g(this.f15439d, cVar.f15439d).mo49224g(this.f15438a, cVar.f15438a).mo49226i();
        }
    }

    /* renamed from: na1$d */
    /* compiled from: DefaultTrackSelector */
    public static final class C2881d extends C0840v {

        /* renamed from: F1 */
        public static final C2881d f15440F1;
        @Deprecated

        /* renamed from: G1 */
        public static final C2881d f15441G1;

        /* renamed from: H1 */
        public static final C0785d.C0786a<C2881d> f15442H1 = new oa1();

        /* renamed from: A1 */
        public final boolean f15443A1;

        /* renamed from: B1 */
        public final boolean f15444B1;

        /* renamed from: C1 */
        public final boolean f15445C1;

        /* renamed from: D1 */
        public final SparseArray<Map<ws6, C2883e>> f15446D1;

        /* renamed from: E1 */
        public final SparseBooleanArray f15447E1;

        /* renamed from: q1 */
        public final boolean f15448q1;

        /* renamed from: r1 */
        public final boolean f15449r1;

        /* renamed from: s1 */
        public final boolean f15450s1;

        /* renamed from: t1 */
        public final boolean f15451t1;

        /* renamed from: u1 */
        public final boolean f15452u1;

        /* renamed from: v1 */
        public final boolean f15453v1;

        /* renamed from: w1 */
        public final boolean f15454w1;

        /* renamed from: x1 */
        public final boolean f15455x1;

        /* renamed from: y1 */
        public final boolean f15456y1;

        /* renamed from: z1 */
        public final boolean f15457z1;

        static {
            C2881d b0 = new C2882a().mo6936A();
            f15440F1 = b0;
            f15441G1 = b0;
        }

        /* renamed from: B */
        public static C2881d m22953B(Context context) {
            return new C2882a(context).mo6936A();
        }

        /* renamed from: C */
        public static int[] m22954C(SparseBooleanArray sparseBooleanArray) {
            int[] iArr = new int[sparseBooleanArray.size()];
            for (int i = 0; i < sparseBooleanArray.size(); i++) {
                iArr[i] = sparseBooleanArray.keyAt(i);
            }
            return iArr;
        }

        /* renamed from: H */
        public static void m22956H(Bundle bundle, SparseArray<Map<ws6, C2883e>> sparseArray) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray2 = new SparseArray();
            for (int i = 0; i < sparseArray.size(); i++) {
                int keyAt = sparseArray.keyAt(i);
                for (Map.Entry entry : sparseArray.valueAt(i).entrySet()) {
                    C2883e eVar = (C2883e) entry.getValue();
                    if (eVar != null) {
                        sparseArray2.put(arrayList2.size(), eVar);
                    }
                    arrayList2.add((ws6) entry.getKey());
                    arrayList.add(Integer.valueOf(keyAt));
                }
                bundle.putIntArray(C0840v.m5879c(1010), Ints.m37052k(arrayList));
                bundle.putParcelableArrayList(C0840v.m5879c(1011), b60.m11131d(arrayList2));
                bundle.putSparseParcelableArray(C0840v.m5879c(1012), b60.m11132e(sparseArray2));
            }
        }

        /* renamed from: x */
        public static boolean m22977x(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: y */
        public static boolean m22978y(SparseArray<Map<ws6, C2883e>> sparseArray, SparseArray<Map<ws6, C2883e>> sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i));
                if (indexOfKey < 0 || !m22979z(sparseArray.valueAt(i), sparseArray2.valueAt(indexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        /* JADX WARNING: Removed duplicated region for block: B:6:0x001a  */
        /* renamed from: z */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static boolean m22979z(java.util.Map<p000.ws6, p000.na1.C2883e> r4, java.util.Map<p000.ws6, p000.na1.C2883e> r5) {
            /*
                int r0 = r4.size()
                int r1 = r5.size()
                r2 = 0
                if (r1 == r0) goto L_0x000c
                return r2
            L_0x000c:
                java.util.Set r4 = r4.entrySet()
                java.util.Iterator r4 = r4.iterator()
            L_0x0014:
                boolean r0 = r4.hasNext()
                if (r0 == 0) goto L_0x003b
                java.lang.Object r0 = r4.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                java.lang.Object r1 = r0.getKey()
                ws6 r1 = (p000.ws6) r1
                boolean r3 = r5.containsKey(r1)
                if (r3 == 0) goto L_0x003a
                java.lang.Object r0 = r0.getValue()
                java.lang.Object r1 = r5.get(r1)
                boolean r0 = p000.w67.m29346c(r0, r1)
                if (r0 != 0) goto L_0x0014
            L_0x003a:
                return r2
            L_0x003b:
                r4 = 1
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.na1.C2881d.m22979z(java.util.Map, java.util.Map):boolean");
        }

        /* renamed from: A */
        public C2882a mo6933a() {
            return new C2882a();
        }

        /* renamed from: D */
        public boolean mo23590D(int i) {
            return this.f15447E1.get(i);
        }

        @Deprecated
        /* renamed from: E */
        public C2883e mo23591E(int i, ws6 ws6) {
            Map map = this.f15446D1.get(i);
            if (map != null) {
                return (C2883e) map.get(ws6);
            }
            return null;
        }

        @Deprecated
        /* renamed from: F */
        public boolean mo23592F(int i, ws6 ws6) {
            Map map = this.f15446D1.get(i);
            if (map == null || !map.containsKey(ws6)) {
                return false;
            }
            return true;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C2881d.class != obj.getClass()) {
                return false;
            }
            C2881d dVar = (C2881d) obj;
            if (super.equals(dVar) && this.f15448q1 == dVar.f15448q1 && this.f15449r1 == dVar.f15449r1 && this.f15450s1 == dVar.f15450s1 && this.f15451t1 == dVar.f15451t1 && this.f15452u1 == dVar.f15452u1 && this.f15453v1 == dVar.f15453v1 && this.f15454w1 == dVar.f15454w1 && this.f15455x1 == dVar.f15455x1 && this.f15456y1 == dVar.f15456y1 && this.f15457z1 == dVar.f15457z1 && this.f15443A1 == dVar.f15443A1 && this.f15444B1 == dVar.f15444B1 && this.f15445C1 == dVar.f15445C1 && m22977x(this.f15447E1, dVar.f15447E1) && m22978y(this.f15446D1, dVar.f15446D1)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return ((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.f15448q1 ? 1 : 0)) * 31) + (this.f15449r1 ? 1 : 0)) * 31) + (this.f15450s1 ? 1 : 0)) * 31) + (this.f15451t1 ? 1 : 0)) * 31) + (this.f15452u1 ? 1 : 0)) * 31) + (this.f15453v1 ? 1 : 0)) * 31) + (this.f15454w1 ? 1 : 0)) * 31) + (this.f15455x1 ? 1 : 0)) * 31) + (this.f15456y1 ? 1 : 0)) * 31) + (this.f15457z1 ? 1 : 0)) * 31) + (this.f15443A1 ? 1 : 0)) * 31) + (this.f15444B1 ? 1 : 0)) * 31) + (this.f15445C1 ? 1 : 0);
        }

        public Bundle toBundle() {
            Bundle bundle = super.toBundle();
            bundle.putBoolean(C0840v.m5879c(1000), this.f15448q1);
            bundle.putBoolean(C0840v.m5879c(1001), this.f15449r1);
            bundle.putBoolean(C0840v.m5879c(PlaybackException.ERROR_CODE_BEHIND_LIVE_WINDOW), this.f15450s1);
            bundle.putBoolean(C0840v.m5879c(1014), this.f15451t1);
            bundle.putBoolean(C0840v.m5879c(PlaybackException.ERROR_CODE_TIMEOUT), this.f15452u1);
            bundle.putBoolean(C0840v.m5879c(PlaybackException.ERROR_CODE_FAILED_RUNTIME_CHECK), this.f15453v1);
            bundle.putBoolean(C0840v.m5879c(WebSocketProtocol.CLOSE_NO_STATUS_CODE), this.f15454w1);
            bundle.putBoolean(C0840v.m5879c(1006), this.f15455x1);
            bundle.putBoolean(C0840v.m5879c(1015), this.f15456y1);
            bundle.putBoolean(C0840v.m5879c(1016), this.f15457z1);
            bundle.putBoolean(C0840v.m5879c(1007), this.f15443A1);
            bundle.putBoolean(C0840v.m5879c(1008), this.f15444B1);
            bundle.putBoolean(C0840v.m5879c(1009), this.f15445C1);
            m22956H(bundle, this.f15446D1);
            bundle.putIntArray(C0840v.m5879c(1013), m22954C(this.f15447E1));
            return bundle;
        }

        /* renamed from: na1$d$a */
        /* compiled from: DefaultTrackSelector */
        public static final class C2882a extends C0840v.C0841a {

            /* renamed from: A */
            public boolean f15458A;

            /* renamed from: B */
            public boolean f15459B;

            /* renamed from: C */
            public boolean f15460C;

            /* renamed from: D */
            public boolean f15461D;

            /* renamed from: E */
            public boolean f15462E;

            /* renamed from: F */
            public boolean f15463F;

            /* renamed from: G */
            public boolean f15464G;

            /* renamed from: H */
            public boolean f15465H;

            /* renamed from: I */
            public boolean f15466I;

            /* renamed from: J */
            public boolean f15467J;

            /* renamed from: K */
            public boolean f15468K;

            /* renamed from: L */
            public boolean f15469L;

            /* renamed from: M */
            public boolean f15470M;

            /* renamed from: N */
            public final SparseArray<Map<ws6, C2883e>> f15471N;

            /* renamed from: O */
            public final SparseBooleanArray f15472O;

            /* renamed from: d0 */
            public static SparseArray<Map<ws6, C2883e>> m23000d0(SparseArray<Map<ws6, C2883e>> sparseArray) {
                SparseArray<Map<ws6, C2883e>> sparseArray2 = new SparseArray<>();
                for (int i = 0; i < sparseArray.size(); i++) {
                    sparseArray2.put(sparseArray.keyAt(i), new HashMap(sparseArray.valueAt(i)));
                }
                return sparseArray2;
            }

            /* renamed from: A0 */
            public C2882a mo6945K(int i, int i2, boolean z) {
                super.mo6945K(i, i2, z);
                return this;
            }

            /* renamed from: B0 */
            public C2882a mo6946L(Context context, boolean z) {
                super.mo6946L(context, z);
                return this;
            }

            /* renamed from: b0 */
            public C2881d mo6936A() {
                return new C2881d(this);
            }

            /* renamed from: c0 */
            public C2882a mo6937B(int i) {
                super.mo6937B(i);
                return this;
            }

            /* renamed from: e0 */
            public final void mo23597e0() {
                this.f15458A = true;
                this.f15459B = false;
                this.f15460C = true;
                this.f15461D = false;
                this.f15462E = true;
                this.f15463F = false;
                this.f15464G = false;
                this.f15465H = false;
                this.f15466I = false;
                this.f15467J = true;
                this.f15468K = true;
                this.f15469L = false;
                this.f15470M = true;
            }

            /* renamed from: f0 */
            public final SparseBooleanArray mo23598f0(int[] iArr) {
                if (iArr == null) {
                    return new SparseBooleanArray();
                }
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray(iArr.length);
                for (int append : iArr) {
                    sparseBooleanArray.append(append, true);
                }
                return sparseBooleanArray;
            }

            /* renamed from: g0 */
            public C2882a mo23599g0(C0840v vVar) {
                super.mo6939E(vVar);
                return this;
            }

            /* renamed from: h0 */
            public C2882a mo23600h0(boolean z) {
                this.f15465H = z;
                return this;
            }

            /* renamed from: i0 */
            public C2882a mo23601i0(boolean z) {
                this.f15466I = z;
                return this;
            }

            /* renamed from: j0 */
            public C2882a mo23602j0(boolean z) {
                this.f15463F = z;
                return this;
            }

            /* renamed from: k0 */
            public C2882a mo23603k0(boolean z) {
                this.f15464G = z;
                return this;
            }

            /* renamed from: l0 */
            public C2882a mo23604l0(boolean z) {
                this.f15470M = z;
                return this;
            }

            /* renamed from: m0 */
            public C2882a mo23605m0(boolean z) {
                this.f15461D = z;
                return this;
            }

            /* renamed from: n0 */
            public C2882a mo23606n0(boolean z) {
                this.f15459B = z;
                return this;
            }

            /* renamed from: o0 */
            public C2882a mo23607o0(boolean z) {
                this.f15460C = z;
                return this;
            }

            /* renamed from: p0 */
            public C2882a mo23608p0(boolean z) {
                this.f15467J = z;
                return this;
            }

            /* renamed from: q0 */
            public C2882a mo23609q0(boolean z) {
                this.f15462E = z;
                return this;
            }

            /* renamed from: r0 */
            public C2882a mo23610r0(boolean z) {
                this.f15468K = z;
                return this;
            }

            /* renamed from: s0 */
            public C2882a mo23611s0(boolean z) {
                this.f15458A = z;
                return this;
            }

            /* renamed from: t0 */
            public C2882a mo6940F(int i) {
                super.mo6940F(i);
                return this;
            }

            /* renamed from: u0 */
            public C2882a mo6941G(C0837u uVar) {
                super.mo6941G(uVar);
                return this;
            }

            /* renamed from: v0 */
            public C2882a mo6942H(Context context) {
                super.mo6942H(context);
                return this;
            }

            @Deprecated
            /* renamed from: w0 */
            public C2882a mo23615w0(int i, ws6 ws6, C2883e eVar) {
                Map map = this.f15471N.get(i);
                if (map == null) {
                    map = new HashMap();
                    this.f15471N.put(i, map);
                }
                if (map.containsKey(ws6) && w67.m29346c(map.get(ws6), eVar)) {
                    return this;
                }
                map.put(ws6, eVar);
                return this;
            }

            /* renamed from: x0 */
            public final void mo23616x0(Bundle bundle) {
                ImmutableList<ws6> immutableList;
                SparseArray<C2883e> sparseArray;
                int[] intArray = bundle.getIntArray(C0840v.m5879c(1010));
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(C0840v.m5879c(1011));
                if (parcelableArrayList == null) {
                    immutableList = ImmutableList.m36627of();
                } else {
                    immutableList = b60.m11129b(ws6.f19233k, parcelableArrayList);
                }
                SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(C0840v.m5879c(1012));
                if (sparseParcelableArray == null) {
                    sparseArray = new SparseArray<>();
                } else {
                    sparseArray = b60.m11130c(C2883e.f15473k, sparseParcelableArray);
                }
                if (intArray != null && intArray.length == immutableList.size()) {
                    for (int i = 0; i < intArray.length; i++) {
                        mo23615w0(intArray[i], immutableList.get(i), sparseArray.get(i));
                    }
                }
            }

            /* renamed from: y0 */
            public C2882a mo6944J(int i, boolean z) {
                super.mo6944J(i, z);
                return this;
            }

            /* renamed from: z0 */
            public C2882a mo23618z0(boolean z) {
                this.f15469L = z;
                return this;
            }

            @Deprecated
            public C2882a() {
                this.f15471N = new SparseArray<>();
                this.f15472O = new SparseBooleanArray();
                mo23597e0();
            }

            public C2882a(Context context) {
                super(context);
                this.f15471N = new SparseArray<>();
                this.f15472O = new SparseBooleanArray();
                mo23597e0();
            }

            public C2882a(C2881d dVar) {
                super((C0840v) dVar);
                this.f15458A = dVar.f15448q1;
                this.f15459B = dVar.f15449r1;
                this.f15460C = dVar.f15450s1;
                this.f15461D = dVar.f15451t1;
                this.f15462E = dVar.f15452u1;
                this.f15463F = dVar.f15453v1;
                this.f15464G = dVar.f15454w1;
                this.f15465H = dVar.f15455x1;
                this.f15466I = dVar.f15456y1;
                this.f15467J = dVar.f15457z1;
                this.f15468K = dVar.f15443A1;
                this.f15469L = dVar.f15444B1;
                this.f15470M = dVar.f15445C1;
                this.f15471N = m23000d0(dVar.f15446D1);
                this.f15472O = dVar.f15447E1.clone();
            }

            public C2882a(Bundle bundle) {
                super(bundle);
                mo23597e0();
                C2881d dVar = C2881d.f15440F1;
                mo23611s0(bundle.getBoolean(C0840v.m5879c(1000), dVar.f15448q1));
                mo23606n0(bundle.getBoolean(C0840v.m5879c(1001), dVar.f15449r1));
                mo23607o0(bundle.getBoolean(C0840v.m5879c(PlaybackException.ERROR_CODE_BEHIND_LIVE_WINDOW), dVar.f15450s1));
                mo23605m0(bundle.getBoolean(C0840v.m5879c(1014), dVar.f15451t1));
                mo23609q0(bundle.getBoolean(C0840v.m5879c(PlaybackException.ERROR_CODE_TIMEOUT), dVar.f15452u1));
                mo23602j0(bundle.getBoolean(C0840v.m5879c(PlaybackException.ERROR_CODE_FAILED_RUNTIME_CHECK), dVar.f15453v1));
                mo23603k0(bundle.getBoolean(C0840v.m5879c(WebSocketProtocol.CLOSE_NO_STATUS_CODE), dVar.f15454w1));
                mo23600h0(bundle.getBoolean(C0840v.m5879c(1006), dVar.f15455x1));
                mo23601i0(bundle.getBoolean(C0840v.m5879c(1015), dVar.f15456y1));
                mo23608p0(bundle.getBoolean(C0840v.m5879c(1016), dVar.f15457z1));
                mo23610r0(bundle.getBoolean(C0840v.m5879c(1007), dVar.f15443A1));
                mo23618z0(bundle.getBoolean(C0840v.m5879c(1008), dVar.f15444B1));
                mo23604l0(bundle.getBoolean(C0840v.m5879c(1009), dVar.f15445C1));
                this.f15471N = new SparseArray<>();
                mo23616x0(bundle);
                this.f15472O = mo23598f0(bundle.getIntArray(C0840v.m5879c(1013)));
            }
        }

        public C2881d(C2882a aVar) {
            super(aVar);
            this.f15448q1 = aVar.f15458A;
            this.f15449r1 = aVar.f15459B;
            this.f15450s1 = aVar.f15460C;
            this.f15451t1 = aVar.f15461D;
            this.f15452u1 = aVar.f15462E;
            this.f15453v1 = aVar.f15463F;
            this.f15454w1 = aVar.f15464G;
            this.f15455x1 = aVar.f15465H;
            this.f15456y1 = aVar.f15466I;
            this.f15457z1 = aVar.f15467J;
            this.f15443A1 = aVar.f15468K;
            this.f15444B1 = aVar.f15469L;
            this.f15445C1 = aVar.f15470M;
            this.f15446D1 = aVar.f15471N;
            this.f15447E1 = aVar.f15472O;
        }
    }

    /* renamed from: na1$e */
    /* compiled from: DefaultTrackSelector */
    public static final class C2883e implements C0785d {

        /* renamed from: k */
        public static final C0785d.C0786a<C2883e> f15473k = new pa1();

        /* renamed from: a */
        public final int f15474a;

        /* renamed from: d */
        public final int[] f15475d;

        /* renamed from: e */
        public final int f15476e;

        /* renamed from: g */
        public final int f15477g;

        public C2883e(int i, int[] iArr, int i2) {
            this.f15474a = i;
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f15475d = copyOf;
            this.f15476e = iArr.length;
            this.f15477g = i2;
            Arrays.sort(copyOf);
        }

        /* renamed from: b */
        public static String m23036b(int i) {
            return Integer.toString(i, 36);
        }

        /* renamed from: c */
        public static /* synthetic */ C2883e m23037c(Bundle bundle) {
            boolean z = false;
            int i = bundle.getInt(m23036b(0), -1);
            int[] intArray = bundle.getIntArray(m23036b(1));
            int i2 = bundle.getInt(m23036b(2), -1);
            if (i >= 0 && i2 >= 0) {
                z = true;
            }
            C2725kr.m20981a(z);
            C2725kr.m20985e(intArray);
            return new C2883e(i, intArray, i2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C2883e.class != obj.getClass()) {
                return false;
            }
            C2883e eVar = (C2883e) obj;
            if (this.f15474a == eVar.f15474a && Arrays.equals(this.f15475d, eVar.f15475d) && this.f15477g == eVar.f15477g) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((this.f15474a * 31) + Arrays.hashCode(this.f15475d)) * 31) + this.f15477g;
        }

        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putInt(m23036b(0), this.f15474a);
            bundle.putIntArray(m23036b(1), this.f15475d);
            bundle.putInt(m23036b(2), this.f15477g);
            return bundle;
        }
    }

    /* renamed from: na1$f */
    /* compiled from: DefaultTrackSelector */
    public static class C2884f {

        /* renamed from: a */
        public final Spatializer f15478a;

        /* renamed from: b */
        public final boolean f15479b;

        /* renamed from: c */
        public Handler f15480c;

        /* renamed from: d */
        public Spatializer.OnSpatializerStateChangedListener f15481d;

        /* renamed from: na1$f$a */
        /* compiled from: DefaultTrackSelector */
        public class C2885a implements Spatializer.OnSpatializerStateChangedListener {

            /* renamed from: a */
            public final /* synthetic */ na1 f15482a;

            public C2885a(C2884f fVar, na1 na1) {
                this.f15482a = na1;
            }

            public void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
                this.f15482a.mo23572S();
            }

            public void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
                this.f15482a.mo23572S();
            }
        }

        public C2884f(Spatializer spatializer) {
            boolean z;
            this.f15478a = spatializer;
            if (spatializer.getImmersiveAudioLevel() != 0) {
                z = true;
            } else {
                z = false;
            }
            this.f15479b = z;
        }

        /* renamed from: g */
        public static C2884f m23038g(Context context) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager == null) {
                return null;
            }
            return new C2884f(audioManager.getSpatializer());
        }

        /* renamed from: a */
        public boolean mo23621a(C0778b bVar, C0792h hVar) {
            int i;
            if (!"audio/eac3-joc".equals(hVar.f4175C) || hVar.f4202v0 != 16) {
                i = hVar.f4202v0;
            } else {
                i = 12;
            }
            AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(w67.m29302E(i));
            int i2 = hVar.f4187b1;
            if (i2 != -1) {
                channelMask.setSampleRate(i2);
            }
            return this.f15478a.canBeSpatialized(bVar.mo6586b().f4150a, channelMask.build());
        }

        /* renamed from: b */
        public void mo23622b(na1 na1, Looper looper) {
            if (this.f15481d == null && this.f15480c == null) {
                this.f15481d = new C2885a(this, na1);
                Handler handler = new Handler(looper);
                this.f15480c = handler;
                Spatializer spatializer = this.f15478a;
                Objects.requireNonNull(handler);
                spatializer.addOnSpatializerStateChangedListener(new q61(handler), this.f15481d);
            }
        }

        /* renamed from: c */
        public boolean mo23623c() {
            return this.f15478a.isAvailable();
        }

        /* renamed from: d */
        public boolean mo23624d() {
            return this.f15478a.isEnabled();
        }

        /* renamed from: e */
        public boolean mo23625e() {
            return this.f15479b;
        }

        /* renamed from: f */
        public void mo23626f() {
            Spatializer.OnSpatializerStateChangedListener onSpatializerStateChangedListener = this.f15481d;
            if (onSpatializerStateChangedListener != null && this.f15480c != null) {
                this.f15478a.removeOnSpatializerStateChangedListener(onSpatializerStateChangedListener);
                ((Handler) w67.m29360j(this.f15480c)).removeCallbacksAndMessages((Object) null);
                this.f15480c = null;
                this.f15481d = null;
            }
        }
    }

    /* renamed from: na1$g */
    /* compiled from: DefaultTrackSelector */
    public static final class C2886g extends C2887h<C2886g> implements Comparable<C2886g> {

        /* renamed from: A */
        public final int f15483A;

        /* renamed from: B */
        public final int f15484B;

        /* renamed from: C */
        public final int f15485C;

        /* renamed from: H */
        public final boolean f15486H;

        /* renamed from: k */
        public final int f15487k;

        /* renamed from: r */
        public final boolean f15488r;

        /* renamed from: s */
        public final boolean f15489s;

        /* renamed from: x */
        public final boolean f15490x;

        /* renamed from: y */
        public final int f15491y;

        public C2886g(int i, C0836t tVar, int i2, C2881d dVar, int i3, String str) {
            super(i, tVar, i2);
            boolean z;
            boolean z2;
            ImmutableList<String> immutableList;
            int i4;
            boolean z3;
            boolean z4;
            boolean z5;
            int i5 = 0;
            this.f15488r = na1.m22908L(i3, false);
            int i6 = this.f15495g.f4192g & (~dVar.f4504Y);
            if ((i6 & 1) != 0) {
                z = true;
            } else {
                z = false;
            }
            this.f15489s = z;
            if ((i6 & 2) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f15490x = z2;
            int i7 = Integer.MAX_VALUE;
            if (dVar.f4502U.isEmpty()) {
                immutableList = ImmutableList.m36628of("");
            } else {
                immutableList = dVar.f4502U;
            }
            int i8 = 0;
            while (true) {
                if (i8 >= immutableList.size()) {
                    i4 = 0;
                    break;
                }
                i4 = na1.m22902D(this.f15495g, immutableList.get(i8), dVar.f4505Z);
                if (i4 > 0) {
                    i7 = i8;
                    break;
                }
                i8++;
            }
            this.f15491y = i7;
            this.f15483A = i4;
            int v = na1.m22905H(this.f15495g.f4193k, dVar.f4503X);
            this.f15484B = v;
            if ((this.f15495g.f4193k & 1088) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.f15486H = z3;
            if (na1.m22915T(str) == null) {
                z4 = true;
            } else {
                z4 = false;
            }
            int D = na1.m22902D(this.f15495g, str, z4);
            this.f15485C = D;
            if (i4 > 0 || ((dVar.f4502U.isEmpty() && v > 0) || this.f15489s || (this.f15490x && D > 0))) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (na1.m22908L(i3, dVar.f15443A1) && z5) {
                i5 = 1;
            }
            this.f15487k = i5;
        }

        /* renamed from: e */
        public static int m23045e(List<C2886g> list, List<C2886g> list2) {
            return list.get(0).compareTo(list2.get(0));
        }

        /* renamed from: g */
        public static ImmutableList<C2886g> m23046g(int i, C0836t tVar, C2881d dVar, int[] iArr, String str) {
            ImmutableList.C4534a builder = ImmutableList.builder();
            for (int i2 = 0; i2 < tVar.f4469a; i2++) {
                builder.mo34667a(new C2886g(i, tVar, i2, dVar, iArr[i2], str));
            }
            return builder.mo34692l();
        }

        /* renamed from: a */
        public int mo23581a() {
            return this.f15487k;
        }

        /* renamed from: f */
        public int compareTo(C2886g gVar) {
            Ordering ordering;
            wl0 g = wl0.m53949j().mo49224g(this.f15488r, gVar.f15488r).mo49223f(Integer.valueOf(this.f15491y), Integer.valueOf(gVar.f15491y), Ordering.natural().reverse()).mo49221d(this.f15483A, gVar.f15483A).mo49221d(this.f15484B, gVar.f15484B).mo49224g(this.f15489s, gVar.f15489s);
            Boolean valueOf = Boolean.valueOf(this.f15490x);
            Boolean valueOf2 = Boolean.valueOf(gVar.f15490x);
            if (this.f15483A == 0) {
                ordering = Ordering.natural();
            } else {
                ordering = Ordering.natural().reverse();
            }
            wl0 d = g.mo49223f(valueOf, valueOf2, ordering).mo49221d(this.f15485C, gVar.f15485C);
            if (this.f15484B == 0) {
                d = d.mo49225h(this.f15486H, gVar.f15486H);
            }
            return d.mo49226i();
        }

        /* renamed from: h */
        public boolean mo23583d(C2886g gVar) {
            return false;
        }
    }

    /* renamed from: na1$h */
    /* compiled from: DefaultTrackSelector */
    public static abstract class C2887h<T extends C2887h<T>> {

        /* renamed from: a */
        public final int f15492a;

        /* renamed from: d */
        public final C0836t f15493d;

        /* renamed from: e */
        public final int f15494e;

        /* renamed from: g */
        public final C0792h f15495g;

        /* renamed from: na1$h$a */
        /* compiled from: DefaultTrackSelector */
        public interface C2888a<T extends C2887h<T>> {
            /* renamed from: a */
            List<T> mo19220a(int i, C0836t tVar, int[] iArr);
        }

        public C2887h(int i, C0836t tVar, int i2) {
            this.f15492a = i;
            this.f15493d = tVar;
            this.f15494e = i2;
            this.f15495g = tVar.mo6918c(i2);
        }

        /* renamed from: a */
        public abstract int mo23581a();

        /* renamed from: d */
        public abstract boolean mo23583d(T t);
    }

    /* renamed from: na1$i */
    /* compiled from: DefaultTrackSelector */
    public static final class C2889i extends C2887h<C2889i> {

        /* renamed from: A */
        public final int f15496A;

        /* renamed from: B */
        public final int f15497B;

        /* renamed from: C */
        public final int f15498C;

        /* renamed from: H */
        public final boolean f15499H;

        /* renamed from: I */
        public final boolean f15500I;

        /* renamed from: L */
        public final int f15501L;

        /* renamed from: M */
        public final boolean f15502M;

        /* renamed from: P */
        public final boolean f15503P;

        /* renamed from: Q */
        public final int f15504Q;

        /* renamed from: k */
        public final boolean f15505k;

        /* renamed from: r */
        public final C2881d f15506r;

        /* renamed from: s */
        public final boolean f15507s;

        /* renamed from: x */
        public final boolean f15508x;

        /* renamed from: y */
        public final int f15509y;

        /* JADX WARNING: Removed duplicated region for block: B:54:0x00a4  */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x00a6  */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x00b5  */
        /* JADX WARNING: Removed duplicated region for block: B:67:0x00d6  */
        /* JADX WARNING: Removed duplicated region for block: B:68:0x00d8  */
        /* JADX WARNING: Removed duplicated region for block: B:71:0x00e4  */
        /* JADX WARNING: Removed duplicated region for block: B:74:0x00cc A[EDGE_INSN: B:74:0x00cc->B:65:0x00cc ?: BREAK  , SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C2889i(int r5, androidx.media3.common.C0836t r6, int r7, p000.na1.C2881d r8, int r9, int r10, boolean r11) {
            /*
                r4 = this;
                r4.<init>(r5, r6, r7)
                r4.f15506r = r8
                boolean r5 = r8.f15450s1
                if (r5 == 0) goto L_0x000c
                r5 = 24
                goto L_0x000e
            L_0x000c:
                r5 = 16
            L_0x000e:
                boolean r6 = r8.f15449r1
                r7 = 1
                r0 = 0
                if (r6 == 0) goto L_0x001a
                r6 = r10 & r5
                if (r6 == 0) goto L_0x001a
                r6 = r7
                goto L_0x001b
            L_0x001a:
                r6 = r0
            L_0x001b:
                r4.f15500I = r6
                r6 = -1082130432(0xffffffffbf800000, float:-1.0)
                r10 = -1
                if (r11 == 0) goto L_0x004b
                androidx.media3.common.h r1 = r4.f15495g
                int r2 = r1.f4180P
                if (r2 == r10) goto L_0x002c
                int r3 = r8.f4506a
                if (r2 > r3) goto L_0x004b
            L_0x002c:
                int r2 = r1.f4181Q
                if (r2 == r10) goto L_0x0034
                int r3 = r8.f4508d
                if (r2 > r3) goto L_0x004b
            L_0x0034:
                float r2 = r1.f4182U
                int r3 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
                if (r3 == 0) goto L_0x0041
                int r3 = r8.f4509e
                float r3 = (float) r3
                int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                if (r2 > 0) goto L_0x004b
            L_0x0041:
                int r1 = r1.f4203x
                if (r1 == r10) goto L_0x0049
                int r2 = r8.f4511g
                if (r1 > r2) goto L_0x004b
            L_0x0049:
                r1 = r7
                goto L_0x004c
            L_0x004b:
                r1 = r0
            L_0x004c:
                r4.f15505k = r1
                if (r11 == 0) goto L_0x0079
                androidx.media3.common.h r11 = r4.f15495g
                int r1 = r11.f4180P
                if (r1 == r10) goto L_0x005a
                int r2 = r8.f4512k
                if (r1 < r2) goto L_0x0079
            L_0x005a:
                int r1 = r11.f4181Q
                if (r1 == r10) goto L_0x0062
                int r2 = r8.f4514r
                if (r1 < r2) goto L_0x0079
            L_0x0062:
                float r1 = r11.f4182U
                int r6 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
                if (r6 == 0) goto L_0x006f
                int r6 = r8.f4515s
                float r6 = (float) r6
                int r6 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
                if (r6 < 0) goto L_0x0079
            L_0x006f:
                int r6 = r11.f4203x
                if (r6 == r10) goto L_0x0077
                int r10 = r8.f4517x
                if (r6 < r10) goto L_0x0079
            L_0x0077:
                r6 = r7
                goto L_0x007a
            L_0x0079:
                r6 = r0
            L_0x007a:
                r4.f15507s = r6
                boolean r6 = p000.na1.m22908L(r9, r0)
                r4.f15508x = r6
                androidx.media3.common.h r6 = r4.f15495g
                int r10 = r6.f4203x
                r4.f15509y = r10
                int r6 = r6.mo6639f()
                r4.f15496A = r6
                androidx.media3.common.h r6 = r4.f15495g
                int r6 = r6.f4193k
                int r10 = r8.f4496H
                int r6 = p000.na1.m22905H(r6, r10)
                r4.f15498C = r6
                androidx.media3.common.h r6 = r4.f15495g
                int r6 = r6.f4193k
                if (r6 == 0) goto L_0x00a6
                r6 = r6 & r7
                if (r6 == 0) goto L_0x00a4
                goto L_0x00a6
            L_0x00a4:
                r6 = r0
                goto L_0x00a7
            L_0x00a6:
                r6 = r7
            L_0x00a7:
                r4.f15499H = r6
                r6 = 2147483647(0x7fffffff, float:NaN)
                r10 = r0
            L_0x00ad:
                com.google.common.collect.ImmutableList<java.lang.String> r11 = r8.f4495C
                int r11 = r11.size()
                if (r10 >= r11) goto L_0x00cc
                androidx.media3.common.h r11 = r4.f15495g
                java.lang.String r11 = r11.f4175C
                if (r11 == 0) goto L_0x00c9
                com.google.common.collect.ImmutableList<java.lang.String> r1 = r8.f4495C
                java.lang.Object r1 = r1.get(r10)
                boolean r11 = r11.equals(r1)
                if (r11 == 0) goto L_0x00c9
                r6 = r10
                goto L_0x00cc
            L_0x00c9:
                int r10 = r10 + 1
                goto L_0x00ad
            L_0x00cc:
                r4.f15497B = r6
                int r6 = p000.nd5.m23117e(r9)
                r8 = 128(0x80, float:1.794E-43)
                if (r6 != r8) goto L_0x00d8
                r6 = r7
                goto L_0x00d9
            L_0x00d8:
                r6 = r0
            L_0x00d9:
                r4.f15502M = r6
                int r6 = p000.nd5.m23119g(r9)
                r8 = 64
                if (r6 != r8) goto L_0x00e4
                goto L_0x00e5
            L_0x00e4:
                r7 = r0
            L_0x00e5:
                r4.f15503P = r7
                androidx.media3.common.h r6 = r4.f15495g
                java.lang.String r6 = r6.f4175C
                int r6 = p000.na1.m22906I(r6)
                r4.f15504Q = r6
                int r5 = r4.mo23632m(r9, r5)
                r4.f15501L = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.na1.C2889i.<init>(int, androidx.media3.common.t, int, na1$d, int, int, boolean):void");
        }

        /* renamed from: g */
        public static int m23056g(C2889i iVar, C2889i iVar2) {
            wl0 g = wl0.m53949j().mo49224g(iVar.f15508x, iVar2.f15508x).mo49221d(iVar.f15498C, iVar2.f15498C).mo49224g(iVar.f15499H, iVar2.f15499H).mo49224g(iVar.f15505k, iVar2.f15505k).mo49224g(iVar.f15507s, iVar2.f15507s).mo49223f(Integer.valueOf(iVar.f15497B), Integer.valueOf(iVar2.f15497B), Ordering.natural().reverse()).mo49224g(iVar.f15502M, iVar2.f15502M).mo49224g(iVar.f15503P, iVar2.f15503P);
            if (iVar.f15502M && iVar.f15503P) {
                g = g.mo49221d(iVar.f15504Q, iVar2.f15504Q);
            }
            return g.mo49226i();
        }

        /* renamed from: h */
        public static int m23057h(C2889i iVar, C2889i iVar2) {
            Ordering ordering;
            Ordering ordering2;
            if (!iVar.f15505k || !iVar.f15508x) {
                ordering = na1.f15411k.reverse();
            } else {
                ordering = na1.f15411k;
            }
            wl0 j = wl0.m53949j();
            Integer valueOf = Integer.valueOf(iVar.f15509y);
            Integer valueOf2 = Integer.valueOf(iVar2.f15509y);
            if (iVar.f15506r.f4510e0) {
                ordering2 = na1.f15411k.reverse();
            } else {
                ordering2 = na1.f15412l;
            }
            return j.mo49223f(valueOf, valueOf2, ordering2).mo49223f(Integer.valueOf(iVar.f15496A), Integer.valueOf(iVar2.f15496A), ordering).mo49223f(Integer.valueOf(iVar.f15509y), Integer.valueOf(iVar2.f15509y), ordering).mo49226i();
        }

        /* renamed from: i */
        public static int m23058i(List<C2889i> list, List<C2889i> list2) {
            return wl0.m53949j().mo49223f((C2889i) Collections.max(list, new qa1()), (C2889i) Collections.max(list2, new qa1()), new qa1()).mo49221d(list.size(), list2.size()).mo49223f((C2889i) Collections.max(list, new ra1()), (C2889i) Collections.max(list2, new ra1()), new ra1()).mo49226i();
        }

        /* renamed from: l */
        public static ImmutableList<C2889i> m23059l(int i, C0836t tVar, C2881d dVar, int[] iArr, int i2) {
            boolean z;
            C0836t tVar2 = tVar;
            C2881d dVar2 = dVar;
            int u = na1.m22903E(tVar2, dVar2.f4518y, dVar2.f4493A, dVar2.f4494B);
            ImmutableList.C4534a builder = ImmutableList.builder();
            for (int i3 = 0; i3 < tVar2.f4469a; i3++) {
                int f = tVar2.mo6918c(i3).mo6639f();
                if (u == Integer.MAX_VALUE || (f != -1 && f <= u)) {
                    z = true;
                } else {
                    z = false;
                }
                builder.mo34667a(new C2889i(i, tVar, i3, dVar, iArr[i3], i2, z));
            }
            return builder.mo34692l();
        }

        /* renamed from: a */
        public int mo23581a() {
            return this.f15501L;
        }

        /* renamed from: m */
        public final int mo23632m(int i, int i2) {
            if ((this.f15495g.f4193k & Http2.INITIAL_MAX_FRAME_SIZE) != 0 || !na1.m22908L(i, this.f15506r.f15443A1)) {
                return 0;
            }
            if (!this.f15505k && !this.f15506r.f15448q1) {
                return 0;
            }
            if (na1.m22908L(i, false) && this.f15507s && this.f15505k && this.f15495g.f4203x != -1) {
                C2881d dVar = this.f15506r;
                if (dVar.f4513k0 || dVar.f4510e0 || (i & i2) == 0) {
                    return 1;
                }
                return 2;
            }
            return 1;
        }

        /* renamed from: o */
        public boolean mo23583d(C2889i iVar) {
            if ((this.f15500I || w67.m29346c(this.f15495g.f4175C, iVar.f15495g.f4175C)) && (this.f15506r.f15451t1 || (this.f15502M == iVar.f15502M && this.f15503P == iVar.f15503P))) {
                return true;
            }
            return false;
        }
    }

    public na1(Context context) {
        this(context, new C2817mb.C2819b());
    }

    /* renamed from: A */
    public static void m22899A(xn3.C3633a aVar, C2881d dVar, dx1.C2207a[] aVarArr) {
        dx1.C2207a aVar2;
        int d = aVar.mo27836d();
        for (int i = 0; i < d; i++) {
            ws6 f = aVar.mo27838f(i);
            if (dVar.mo23592F(i, f)) {
                C2883e E = dVar.mo23591E(i, f);
                if (E == null || E.f15475d.length == 0) {
                    aVar2 = null;
                } else {
                    aVar2 = new dx1.C2207a(f.mo27595b(E.f15474a), E.f15475d, E.f15477g);
                }
                aVarArr[i] = aVar2;
            }
        }
    }

    /* renamed from: B */
    public static void m22900B(xn3.C3633a aVar, C0840v vVar, dx1.C2207a[] aVarArr) {
        dx1.C2207a aVar2;
        int d = aVar.mo27836d();
        HashMap hashMap = new HashMap();
        for (int i = 0; i < d; i++) {
            m22901C(aVar.mo27838f(i), vVar, hashMap);
        }
        m22901C(aVar.mo27840h(), vVar, hashMap);
        for (int i2 = 0; i2 < d; i2++) {
            C0837u uVar = (C0837u) hashMap.get(Integer.valueOf(aVar.mo27837e(i2)));
            if (uVar != null) {
                if (uVar.f4476d.isEmpty() || aVar.mo27838f(i2).mo27596c(uVar.f4475a) == -1) {
                    aVar2 = null;
                } else {
                    aVar2 = new dx1.C2207a(uVar.f4475a, Ints.m37052k(uVar.f4476d));
                }
                aVarArr[i2] = aVar2;
            }
        }
    }

    /* renamed from: C */
    public static void m22901C(ws6 ws6, C0840v vVar, Map<Integer, C0837u> map) {
        C0837u uVar;
        for (int i = 0; i < ws6.f19234a; i++) {
            C0837u uVar2 = vVar.f4516v0.get(ws6.mo27595b(i));
            if (uVar2 != null && ((uVar = map.get(Integer.valueOf(uVar2.mo6923b()))) == null || (uVar.f4476d.isEmpty() && !uVar2.f4476d.isEmpty()))) {
                map.put(Integer.valueOf(uVar2.mo6923b()), uVar2);
            }
        }
    }

    /* renamed from: D */
    public static int m22902D(C0792h hVar, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(hVar.f4189e)) {
            return 4;
        }
        String T = m22915T(str);
        String T2 = m22915T(hVar.f4189e);
        if (T2 == null || T == null) {
            if (!z || T2 != null) {
                return 0;
            }
            return 1;
        } else if (T2.startsWith(T) || T.startsWith(T2)) {
            return 3;
        } else {
            if (w67.m29319M0(T2, "-")[0].equals(w67.m29319M0(T, "-")[0])) {
                return 2;
            }
            return 0;
        }
    }

    /* renamed from: E */
    public static int m22903E(C0836t tVar, int i, int i2, boolean z) {
        int i3;
        int i4 = Integer.MAX_VALUE;
        if (!(i == Integer.MAX_VALUE || i2 == Integer.MAX_VALUE)) {
            for (int i5 = 0; i5 < tVar.f4469a; i5++) {
                C0792h c = tVar.mo6918c(i5);
                int i6 = c.f4180P;
                if (i6 > 0 && (i3 = c.f4181Q) > 0) {
                    Point F = m22904F(z, i, i2, i6, i3);
                    int i7 = c.f4180P;
                    int i8 = c.f4181Q;
                    int i9 = i7 * i8;
                    if (i7 >= ((int) (((float) F.x) * 0.98f)) && i8 >= ((int) (((float) F.y) * 0.98f)) && i9 < i4) {
                        i4 = i9;
                    }
                }
            }
        }
        return i4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000d, code lost:
        if (r1 != r3) goto L_0x0013;
     */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Point m22904F(boolean r3, int r4, int r5, int r6, int r7) {
        /*
            if (r3 == 0) goto L_0x0010
            r3 = 1
            r0 = 0
            if (r6 <= r7) goto L_0x0008
            r1 = r3
            goto L_0x0009
        L_0x0008:
            r1 = r0
        L_0x0009:
            if (r4 <= r5) goto L_0x000c
            goto L_0x000d
        L_0x000c:
            r3 = r0
        L_0x000d:
            if (r1 == r3) goto L_0x0010
            goto L_0x0013
        L_0x0010:
            r2 = r5
            r5 = r4
            r4 = r2
        L_0x0013:
            int r3 = r6 * r4
            int r0 = r7 * r5
            if (r3 < r0) goto L_0x0023
            android.graphics.Point r3 = new android.graphics.Point
            int r4 = p000.w67.m29364l(r0, r6)
            r3.<init>(r5, r4)
            return r3
        L_0x0023:
            android.graphics.Point r5 = new android.graphics.Point
            int r3 = p000.w67.m29364l(r3, r7)
            r5.<init>(r3, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.na1.m22904F(boolean, int, int, int, int):android.graphics.Point");
    }

    /* renamed from: H */
    public static int m22905H(int i, int i2) {
        if (i == 0 || i != i2) {
            return Integer.bitCount(i & i2);
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: I */
    public static int m22906I(String str) {
        if (str == null) {
            return 0;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1662735862:
                if (str.equals("video/av01")) {
                    c = 0;
                    break;
                }
                break;
            case -1662541442:
                if (str.equals("video/hevc")) {
                    c = 1;
                    break;
                }
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c = 2;
                    break;
                }
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 4;
            case 1:
                return 3;
            case 2:
                return 1;
            case 3:
                return 2;
            default:
                return 0;
        }
    }

    /* renamed from: K */
    public static boolean m22907K(C0792h hVar) {
        String str = hVar.f4175C;
        if (str == null) {
            return false;
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c = 0;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c = 1;
                    break;
                }
                break;
            case 187078297:
                if (str.equals("audio/ac4")) {
                    c = 2;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: L */
    public static boolean m22908L(int i, boolean z) {
        int f = nd5.m23118f(i);
        if (f == 4 || (z && f == 3)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public /* synthetic */ List m22909M(C2881d dVar, boolean z, int i, C0836t tVar, int[] iArr) {
        return C2879b.m22946g(i, tVar, dVar, iArr, z, new ma1(this));
    }

    /* renamed from: P */
    public static /* synthetic */ int m22912P(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            if (num2.intValue() == -1) {
                return 0;
            }
            return -1;
        } else if (num2.intValue() == -1) {
            return 1;
        } else {
            return num.intValue() - num2.intValue();
        }
    }

    /* renamed from: Q */
    public static /* synthetic */ int m22913Q(Integer num, Integer num2) {
        return 0;
    }

    /* renamed from: R */
    public static void m22914R(xn3.C3633a aVar, int[][][] iArr, pd5[] pd5Arr, dx1[] dx1Arr) {
        boolean z;
        boolean z2 = false;
        int i = 0;
        int i2 = -1;
        int i3 = -1;
        while (true) {
            if (i >= aVar.mo27836d()) {
                z = true;
                break;
            }
            int e = aVar.mo27837e(i);
            dx1 dx1 = dx1Arr[i];
            if ((e == 1 || e == 2) && dx1 != null && m22916U(iArr[i], aVar.mo27838f(i), dx1)) {
                if (e == 1) {
                    if (i3 != -1) {
                        break;
                    }
                    i3 = i;
                } else if (i2 != -1) {
                    break;
                } else {
                    i2 = i;
                }
            }
            i++;
        }
        z = false;
        if (!(i3 == -1 || i2 == -1)) {
            z2 = true;
        }
        if (z && z2) {
            pd5 pd5 = new pd5(true);
            pd5Arr[i3] = pd5;
            pd5Arr[i2] = pd5;
        }
    }

    /* renamed from: T */
    public static String m22915T(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* renamed from: U */
    public static boolean m22916U(int[][] iArr, ws6 ws6, dx1 dx1) {
        if (dx1 == null) {
            return false;
        }
        int c = ws6.mo27596c(dx1.mo7678n());
        for (int i = 0; i < dx1.length(); i++) {
            if (nd5.m23120h(iArr[c][dx1.mo7670h(i)]) != 32) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: G */
    public C2881d mo20180b() {
        C2881d dVar;
        synchronized (this.f15413d) {
            dVar = this.f15417h;
        }
        return dVar;
    }

    /* renamed from: J */
    public final boolean mo23571J(C0792h hVar) {
        boolean z;
        C2884f fVar;
        C2884f fVar2;
        synchronized (this.f15413d) {
            if (this.f15417h.f15457z1 && !this.f15416g && hVar.f4202v0 > 2 && (!m22907K(hVar) || (w67.f19021a >= 32 && (fVar2 = this.f15418i) != null && fVar2.mo23625e()))) {
                if (w67.f19021a < 32 || (fVar = this.f15418i) == null || !fVar.mo23625e() || !this.f15418i.mo23623c() || !this.f15418i.mo23624d() || !this.f15418i.mo23621a(this.f15419j, hVar)) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: S */
    public final void mo23572S() {
        boolean z;
        C2884f fVar;
        synchronized (this.f15413d) {
            if (!this.f15417h.f15457z1 || this.f15416g || w67.f19021a < 32 || (fVar = this.f15418i) == null || !fVar.mo23625e()) {
                z = false;
            } else {
                z = true;
            }
        }
        if (z) {
            mo20182d();
        }
    }

    /* renamed from: V */
    public dx1.C2207a[] mo23573V(xn3.C3633a aVar, int[][][] iArr, int[] iArr2, C2881d dVar) throws ExoPlaybackException {
        String str;
        int d = aVar.mo27836d();
        dx1.C2207a[] aVarArr = new dx1.C2207a[d];
        Pair<dx1.C2207a, Integer> a0 = mo23578a0(aVar, iArr, iArr2, dVar);
        if (a0 != null) {
            aVarArr[((Integer) a0.second).intValue()] = (dx1.C2207a) a0.first;
        }
        Pair<dx1.C2207a, Integer> W = mo23574W(aVar, iArr, iArr2, dVar);
        if (W != null) {
            aVarArr[((Integer) W.second).intValue()] = (dx1.C2207a) W.first;
        }
        if (W == null) {
            str = null;
        } else {
            Object obj = W.first;
            str = ((dx1.C2207a) obj).f10969a.mo6918c(((dx1.C2207a) obj).f10970b[0]).f4189e;
        }
        Pair<dx1.C2207a, Integer> Y = mo23576Y(aVar, iArr, dVar, str);
        if (Y != null) {
            aVarArr[((Integer) Y.second).intValue()] = (dx1.C2207a) Y.first;
        }
        for (int i = 0; i < d; i++) {
            int e = aVar.mo27837e(i);
            if (!(e == 2 || e == 1 || e == 3)) {
                aVarArr[i] = mo23575X(e, aVar.mo27838f(i), iArr[i], dVar);
            }
        }
        return aVarArr;
    }

    /* renamed from: W */
    public Pair<dx1.C2207a, Integer> mo23574W(xn3.C3633a aVar, int[][][] iArr, int[] iArr2, C2881d dVar) throws ExoPlaybackException {
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < aVar.mo27836d()) {
                if (2 == aVar.mo27837e(i) && aVar.mo27838f(i).f19234a > 0) {
                    z = true;
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        return mo23577Z(1, aVar, iArr, new ea1(this, dVar, z), new fa1());
    }

    /* renamed from: X */
    public dx1.C2207a mo23575X(int i, ws6 ws6, int[][] iArr, C2881d dVar) throws ExoPlaybackException {
        C0836t tVar = null;
        C2880c cVar = null;
        int i2 = 0;
        for (int i3 = 0; i3 < ws6.f19234a; i3++) {
            C0836t b = ws6.mo27595b(i3);
            int[] iArr2 = iArr[i3];
            for (int i4 = 0; i4 < b.f4469a; i4++) {
                if (m22908L(iArr2[i4], dVar.f15443A1)) {
                    C2880c cVar2 = new C2880c(b.mo6918c(i4), iArr2[i4]);
                    if (cVar == null || cVar2.compareTo(cVar) > 0) {
                        tVar = b;
                        i2 = i4;
                        cVar = cVar2;
                    }
                }
            }
        }
        if (tVar == null) {
            return null;
        }
        return new dx1.C2207a(tVar, i2);
    }

    /* renamed from: Y */
    public Pair<dx1.C2207a, Integer> mo23576Y(xn3.C3633a aVar, int[][][] iArr, C2881d dVar, String str) throws ExoPlaybackException {
        return mo23577Z(3, aVar, iArr, new ia1(dVar, str), new ja1());
    }

    /* renamed from: Z */
    public final <T extends C2887h<T>> Pair<dx1.C2207a, Integer> mo23577Z(int i, xn3.C3633a aVar, int[][][] iArr, C2887h.C2888a<T> aVar2, Comparator<List<T>> comparator) {
        int i2;
        Object obj;
        xn3.C3633a aVar3 = aVar;
        ArrayList arrayList = new ArrayList();
        int d = aVar.mo27836d();
        int i3 = 0;
        while (i3 < d) {
            if (i == aVar3.mo27837e(i3)) {
                ws6 f = aVar3.mo27838f(i3);
                int i4 = 0;
                while (i4 < f.f19234a) {
                    C0836t b = f.mo27595b(i4);
                    List<T> a = aVar2.mo19220a(i3, b, iArr[i3][i4]);
                    boolean[] zArr = new boolean[b.f4469a];
                    int i5 = 0;
                    while (i5 < b.f4469a) {
                        C2887h hVar = (C2887h) a.get(i5);
                        int a2 = hVar.mo23581a();
                        if (zArr[i5] || a2 == 0) {
                            i2 = d;
                        } else {
                            if (a2 == 1) {
                                obj = ImmutableList.m36628of(hVar);
                                i2 = d;
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(hVar);
                                int i6 = i5 + 1;
                                while (i6 < b.f4469a) {
                                    C2887h hVar2 = (C2887h) a.get(i6);
                                    int i7 = d;
                                    if (hVar2.mo23581a() == 2 && hVar.mo23583d(hVar2)) {
                                        arrayList2.add(hVar2);
                                        zArr[i6] = true;
                                    }
                                    i6++;
                                    xn3.C3633a aVar4 = aVar;
                                    d = i7;
                                }
                                i2 = d;
                                obj = arrayList2;
                            }
                            arrayList.add(obj);
                        }
                        i5++;
                        xn3.C3633a aVar5 = aVar;
                        d = i2;
                    }
                    int i8 = d;
                    i4++;
                    xn3.C3633a aVar6 = aVar;
                }
            }
            C2887h.C2888a<T> aVar7 = aVar2;
            i3++;
            aVar3 = aVar;
            d = d;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i9 = 0; i9 < list.size(); i9++) {
            iArr2[i9] = ((C2887h) list.get(i9)).f15494e;
        }
        C2887h hVar3 = (C2887h) list.get(0);
        return Pair.create(new dx1.C2207a(hVar3.f15493d, iArr2), Integer.valueOf(hVar3.f15492a));
    }

    /* renamed from: a0 */
    public Pair<dx1.C2207a, Integer> mo23578a0(xn3.C3633a aVar, int[][][] iArr, int[] iArr2, C2881d dVar) throws ExoPlaybackException {
        return mo23577Z(2, aVar, iArr, new ga1(dVar, iArr2), new ha1());
    }

    /* renamed from: b0 */
    public final void mo23579b0(C2881d dVar) {
        boolean z;
        C2725kr.m20985e(dVar);
        synchronized (this.f15413d) {
            if (!this.f15417h.equals(dVar)) {
                z = true;
            } else {
                z = false;
            }
            this.f15417h = dVar;
        }
        if (z) {
            if (dVar.f15457z1 && this.f15414e == null) {
                gk3.m18132i("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
            }
            mo20182d();
        }
    }

    /* renamed from: e */
    public boolean mo20183e() {
        return true;
    }

    /* renamed from: g */
    public void mo20185g() {
        C2884f fVar;
        synchronized (this.f15413d) {
            if (w67.f19021a >= 32 && (fVar = this.f15418i) != null) {
                fVar.mo23626f();
            }
        }
        super.mo20185g();
    }

    /* renamed from: i */
    public void mo20187i(C0778b bVar) {
        boolean z;
        synchronized (this.f15413d) {
            if (!this.f15419j.equals(bVar)) {
                z = true;
            } else {
                z = false;
            }
            this.f15419j = bVar;
        }
        if (z) {
            mo23572S();
        }
    }

    /* renamed from: j */
    public void mo20188j(C0840v vVar) {
        if (vVar instanceof C2881d) {
            mo23579b0((C2881d) vVar);
        }
        mo23579b0(new C2881d.C2882a().mo23599g0(vVar).mo6936A());
    }

    /* renamed from: n */
    public final Pair<pd5[], dx1[]> mo23580n(xn3.C3633a aVar, int[][][] iArr, int[] iArr2, C0973i.C0975b bVar, C0831s sVar) throws ExoPlaybackException {
        C2881d dVar;
        boolean z;
        pd5 pd5;
        C2884f fVar;
        synchronized (this.f15413d) {
            dVar = this.f15417h;
            if (dVar.f15457z1 && w67.f19021a >= 32 && (fVar = this.f15418i) != null) {
                fVar.mo23622b(this, (Looper) C2725kr.m20989i(Looper.myLooper()));
            }
        }
        int d = aVar.mo27836d();
        dx1.C2207a[] V = mo23573V(aVar, iArr, iArr2, dVar);
        m22900B(aVar, dVar, V);
        m22899A(aVar, dVar, V);
        for (int i = 0; i < d; i++) {
            int e = aVar.mo27837e(i);
            if (dVar.mo23590D(i) || dVar.f4507b1.contains(Integer.valueOf(e))) {
                V[i] = null;
            }
        }
        dx1[] a = this.f15415f.mo18998a(V, mo20179a(), bVar, sVar);
        pd5[] pd5Arr = new pd5[d];
        for (int i2 = 0; i2 < d; i2++) {
            int e2 = aVar.mo27837e(i2);
            boolean z2 = true;
            if (dVar.mo23590D(i2) || dVar.f4507b1.contains(Integer.valueOf(e2))) {
                z = true;
            } else {
                z = false;
            }
            if (z || (aVar.mo27837e(i2) != -2 && a[i2] == null)) {
                z2 = false;
            }
            if (z2) {
                pd5 = pd5.f16390b;
            } else {
                pd5 = null;
            }
            pd5Arr[i2] = pd5;
        }
        if (dVar.f15444B1) {
            m22914R(aVar, iArr, pd5Arr, a);
        }
        return Pair.create(pd5Arr, a);
    }

    public na1(Context context, dx1.C2208b bVar) {
        this(context, (C0840v) C2881d.m22953B(context), bVar);
    }

    public na1(Context context, C0840v vVar, dx1.C2208b bVar) {
        this(vVar, bVar, context);
    }

    public na1(C0840v vVar, dx1.C2208b bVar, Context context) {
        this.f15413d = new Object();
        this.f15414e = context != null ? context.getApplicationContext() : null;
        this.f15415f = bVar;
        if (vVar instanceof C2881d) {
            this.f15417h = (C2881d) vVar;
        } else {
            this.f15417h = (context == null ? C2881d.f15440F1 : C2881d.m22953B(context)).mo6933a().mo23599g0(vVar).mo6936A();
        }
        this.f15419j = C0778b.f4142s;
        boolean z = context != null && w67.m29381t0(context);
        this.f15416g = z;
        if (!z && context != null && w67.f19021a >= 32) {
            this.f15418i = C2884f.m23038g(context);
        }
        if (this.f15417h.f15457z1 && context == null) {
            gk3.m18132i("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }
}
