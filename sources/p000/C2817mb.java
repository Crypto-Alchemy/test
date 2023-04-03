package p000;

import androidx.media3.common.C0792h;
import androidx.media3.common.C0831s;
import androidx.media3.common.C0836t;
import androidx.media3.exoplayer.source.C0973i;
import com.github.mikephil.charting.utils.Utils;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.MultimapBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p000.dx1;

/* renamed from: mb */
/* compiled from: AdaptiveTrackSelection */
public class C2817mb extends C2932nz {

    /* renamed from: h */
    public final C2332fx f14892h;

    /* renamed from: i */
    public final long f14893i;

    /* renamed from: j */
    public final long f14894j;

    /* renamed from: k */
    public final long f14895k;

    /* renamed from: l */
    public final int f14896l;

    /* renamed from: m */
    public final int f14897m;

    /* renamed from: n */
    public final float f14898n;

    /* renamed from: o */
    public final float f14899o;

    /* renamed from: p */
    public final ImmutableList<C2818a> f14900p;

    /* renamed from: q */
    public final dh0 f14901q;

    /* renamed from: r */
    public float f14902r;

    /* renamed from: s */
    public int f14903s;

    /* renamed from: t */
    public int f14904t;

    /* renamed from: u */
    public long f14905u;

    /* renamed from: v */
    public qq3 f14906v;

    /* renamed from: mb$a */
    /* compiled from: AdaptiveTrackSelection */
    public static final class C2818a {

        /* renamed from: a */
        public final long f14907a;

        /* renamed from: b */
        public final long f14908b;

        public C2818a(long j, long j2) {
            this.f14907a = j;
            this.f14908b = j2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2818a)) {
                return false;
            }
            C2818a aVar = (C2818a) obj;
            if (this.f14907a == aVar.f14907a && this.f14908b == aVar.f14908b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((int) this.f14907a) * 31) + ((int) this.f14908b);
        }
    }

    /* renamed from: mb$b */
    /* compiled from: AdaptiveTrackSelection */
    public static class C2819b implements dx1.C2208b {

        /* renamed from: a */
        public final int f14909a;

        /* renamed from: b */
        public final int f14910b;

        /* renamed from: c */
        public final int f14911c;

        /* renamed from: d */
        public final int f14912d;

        /* renamed from: e */
        public final int f14913e;

        /* renamed from: f */
        public final float f14914f;

        /* renamed from: g */
        public final float f14915g;

        /* renamed from: h */
        public final dh0 f14916h;

        public C2819b() {
            this(10000, 25000, 25000, 0.7f);
        }

        /* renamed from: a */
        public final dx1[] mo18998a(dx1.C2207a[] aVarArr, C2332fx fxVar, C0973i.C0975b bVar, C0831s sVar) {
            dx1 dx1;
            ImmutableList w = C2817mb.m22113A(aVarArr);
            dx1[] dx1Arr = new dx1[aVarArr.length];
            for (int i = 0; i < aVarArr.length; i++) {
                dx1.C2207a aVar = aVarArr[i];
                if (aVar != null) {
                    int[] iArr = aVar.f10970b;
                    if (iArr.length != 0) {
                        if (iArr.length == 1) {
                            dx1 = new o32(aVar.f10969a, iArr[0], aVar.f10971c);
                        } else {
                            dx1 = mo23115b(aVar.f10969a, iArr, aVar.f10971c, fxVar, (ImmutableList) w.get(i));
                        }
                        dx1Arr[i] = dx1;
                    }
                }
            }
            return dx1Arr;
        }

        /* renamed from: b */
        public C2817mb mo23115b(C0836t tVar, int[] iArr, int i, C2332fx fxVar, ImmutableList<C2818a> immutableList) {
            return new C2817mb(tVar, iArr, i, fxVar, (long) this.f14909a, (long) this.f14910b, (long) this.f14911c, this.f14912d, this.f14913e, this.f14914f, this.f14915g, immutableList, this.f14916h);
        }

        public C2819b(int i, int i2, int i3, float f) {
            this(i, i2, i3, 1279, 719, f, 0.75f, dh0.f10712a);
        }

        public C2819b(int i, int i2, int i3, int i4, int i5, float f, float f2, dh0 dh0) {
            this.f14909a = i;
            this.f14910b = i2;
            this.f14911c = i3;
            this.f14912d = i4;
            this.f14913e = i5;
            this.f14914f = f;
            this.f14915g = f2;
            this.f14916h = dh0;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2817mb(C0836t tVar, int[] iArr, int i, C2332fx fxVar, long j, long j2, long j3, int i2, int i3, float f, float f2, List<C2818a> list, dh0 dh0) {
        super(tVar, iArr, i);
        C2332fx fxVar2;
        long j4;
        if (j3 < j) {
            gk3.m18132i("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            fxVar2 = fxVar;
            j4 = j;
        } else {
            fxVar2 = fxVar;
            j4 = j3;
        }
        this.f14892h = fxVar2;
        this.f14893i = j * 1000;
        this.f14894j = j2 * 1000;
        this.f14895k = j4 * 1000;
        this.f14896l = i2;
        this.f14897m = i3;
        this.f14898n = f;
        this.f14899o = f2;
        this.f14900p = ImmutableList.copyOf(list);
        this.f14901q = dh0;
        this.f14902r = 1.0f;
        this.f14904t = 0;
        this.f14905u = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
    }

    /* renamed from: A */
    public static ImmutableList<ImmutableList<C2818a>> m22113A(dx1.C2207a[] aVarArr) {
        ImmutableList immutableList;
        long j;
        ArrayList arrayList = new ArrayList();
        for (dx1.C2207a aVar : aVarArr) {
            if (aVar == null || aVar.f10970b.length <= 1) {
                arrayList.add((Object) null);
            } else {
                ImmutableList.C4534a builder = ImmutableList.builder();
                builder.mo34667a(new C2818a(0, 0));
                arrayList.add(builder);
            }
        }
        long[][] F = m22114F(aVarArr);
        int[] iArr = new int[F.length];
        long[] jArr = new long[F.length];
        for (int i = 0; i < F.length; i++) {
            long[] jArr2 = F[i];
            if (jArr2.length == 0) {
                j = 0;
            } else {
                j = jArr2[0];
            }
            jArr[i] = j;
        }
        m22117x(arrayList, jArr);
        ImmutableList<Integer> G = m22115G(F);
        for (int i2 = 0; i2 < G.size(); i2++) {
            int intValue = G.get(i2).intValue();
            int i3 = iArr[intValue] + 1;
            iArr[intValue] = i3;
            jArr[intValue] = F[intValue][i3];
            m22117x(arrayList, jArr);
        }
        for (int i4 = 0; i4 < aVarArr.length; i4++) {
            if (arrayList.get(i4) != null) {
                jArr[i4] = jArr[i4] * 2;
            }
        }
        m22117x(arrayList, jArr);
        ImmutableList.C4534a builder2 = ImmutableList.builder();
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            ImmutableList.C4534a aVar2 = (ImmutableList.C4534a) arrayList.get(i5);
            if (aVar2 == null) {
                immutableList = ImmutableList.m36627of();
            } else {
                immutableList = aVar2.mo34692l();
            }
            builder2.mo34667a(immutableList);
        }
        return builder2.mo34692l();
    }

    /* renamed from: F */
    public static long[][] m22114F(dx1.C2207a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length][];
        for (int i = 0; i < aVarArr.length; i++) {
            dx1.C2207a aVar = aVarArr[i];
            if (aVar == null) {
                jArr[i] = new long[0];
            } else {
                jArr[i] = new long[aVar.f10970b.length];
                int i2 = 0;
                while (true) {
                    int[] iArr = aVar.f10970b;
                    if (i2 >= iArr.length) {
                        break;
                    }
                    jArr[i][i2] = (long) aVar.f10969a.mo6918c(iArr[i2]).f4203x;
                    i2++;
                }
                Arrays.sort(jArr[i]);
            }
        }
        return jArr;
    }

    /* renamed from: G */
    public static ImmutableList<Integer> m22115G(long[][] jArr) {
        double d;
        long[][] jArr2 = jArr;
        zh3<K, V> e = MultimapBuilder.m36948c().mo35057a().mo35056e();
        for (int i = 0; i < jArr2.length; i++) {
            long[] jArr3 = jArr2[i];
            if (jArr3.length > 1) {
                int length = jArr3.length;
                double[] dArr = new double[length];
                int i2 = 0;
                while (true) {
                    long[] jArr4 = jArr2[i];
                    int length2 = jArr4.length;
                    double d2 = Utils.DOUBLE_EPSILON;
                    if (i2 >= length2) {
                        break;
                    }
                    long j = jArr4[i2];
                    if (j != -1) {
                        d2 = Math.log((double) j);
                    }
                    dArr[i2] = d2;
                    i2++;
                }
                int i3 = length - 1;
                double d3 = dArr[i3] - dArr[0];
                int i4 = 0;
                while (i4 < i3) {
                    double d4 = dArr[i4];
                    i4++;
                    double d5 = (d4 + dArr[i4]) * 0.5d;
                    if (d3 == Utils.DOUBLE_EPSILON) {
                        d = 1.0d;
                    } else {
                        d = (d5 - dArr[0]) / d3;
                    }
                    e.put(Double.valueOf(d), Integer.valueOf(i));
                }
            }
        }
        return ImmutableList.copyOf(e.values());
    }

    /* renamed from: x */
    public static void m22117x(List<ImmutableList.C4534a<C2818a>> list, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < list.size(); i++) {
            ImmutableList.C4534a aVar = list.get(i);
            if (aVar != null) {
                aVar.mo34667a(new C2818a(j, jArr[i]));
            }
        }
    }

    /* renamed from: B */
    public final long mo23104B(long j) {
        long H = mo23108H(j);
        if (this.f14900p.isEmpty()) {
            return H;
        }
        int i = 1;
        while (i < this.f14900p.size() - 1 && this.f14900p.get(i).f14907a < H) {
            i++;
        }
        C2818a aVar = this.f14900p.get(i - 1);
        C2818a aVar2 = this.f14900p.get(i);
        long j2 = aVar.f14907a;
        long j3 = aVar.f14908b;
        return j3 + ((long) ((((float) (H - j2)) / ((float) (aVar2.f14907a - j2))) * ((float) (aVar2.f14908b - j3))));
    }

    /* renamed from: C */
    public final long mo23105C(List<? extends qq3> list) {
        if (list.isEmpty()) {
            return CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        }
        qq3 qq3 = (qq3) qz2.m50913d(list);
        long j = qq3.f16398g;
        if (j == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
            return CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        }
        long j2 = qq3.f16399h;
        if (j2 != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
            return j2 - j;
        }
        return CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
    }

    /* renamed from: D */
    public long mo23106D() {
        return this.f14895k;
    }

    /* renamed from: E */
    public final long mo23107E(rq3[] rq3Arr, List<? extends qq3> list) {
        int i = this.f14903s;
        if (i >= rq3Arr.length || !rq3Arr[i].next()) {
            for (rq3 rq3 : rq3Arr) {
                if (rq3.next()) {
                    return rq3.mo7287b() - rq3.mo7286a();
                }
            }
            return mo23105C(list);
        }
        rq3 rq32 = rq3Arr[this.f14903s];
        return rq32.mo7287b() - rq32.mo7286a();
    }

    /* renamed from: H */
    public final long mo23108H(long j) {
        long e = (long) (((float) this.f14892h.mo20257e()) * this.f14898n);
        long a = this.f14892h.mo20255a();
        if (a == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED || j == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
            return (long) (((float) e) / this.f14902r);
        }
        float f = (float) j;
        return (long) ((((float) e) * Math.max((f / this.f14902r) - ((float) a), Utils.FLOAT_EPSILON)) / f);
    }

    /* renamed from: I */
    public final long mo23109I(long j, long j2) {
        if (j == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
            return this.f14893i;
        }
        if (j2 != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
            j -= j2;
        }
        return Math.min((long) (((float) j) * this.f14899o), this.f14893i);
    }

    /* renamed from: J */
    public boolean mo23110J(long j, List<? extends qq3> list) {
        long j2 = this.f14905u;
        if (j2 == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED || j - j2 >= 1000 || (!list.isEmpty() && !((qq3) qz2.m50913d(list)).equals(this.f14906v))) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public void mo7664c() {
        this.f14906v = null;
    }

    /* renamed from: d */
    public int mo7665d() {
        return this.f14903s;
    }

    /* renamed from: i */
    public void mo7672i(float f) {
        this.f14902r = f;
    }

    /* renamed from: j */
    public Object mo7673j() {
        return null;
    }

    /* renamed from: m */
    public void mo7677m(long j, long j2, long j3, List<? extends qq3> list, rq3[] rq3Arr) {
        int i;
        long b = this.f14901q.mo18770b();
        long E = mo23107E(rq3Arr, list);
        int i2 = this.f14904t;
        if (i2 == 0) {
            this.f14904t = 1;
            this.f14903s = mo23112z(b, E);
            return;
        }
        int i3 = this.f14903s;
        if (list.isEmpty()) {
            i = -1;
        } else {
            i = mo7662a(((qq3) qz2.m50913d(list)).f16395d);
        }
        if (i != -1) {
            i2 = ((qq3) qz2.m50913d(list)).f16396e;
            i3 = i;
        }
        int z = mo23112z(b, E);
        if (!mo7669g(i3, b)) {
            C0792h b2 = mo7663b(i3);
            C0792h b3 = mo7663b(z);
            long I = mo23109I(j3, E);
            int i4 = b3.f4203x;
            int i5 = b2.f4203x;
            if ((i4 > i5 && j2 < I) || (i4 < i5 && j2 >= this.f14894j)) {
                z = i3;
            }
        }
        if (z != i3) {
            i2 = 3;
        }
        this.f14904t = i2;
        this.f14903s = z;
    }

    /* renamed from: p */
    public void mo7680p() {
        this.f14905u = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        this.f14906v = null;
    }

    /* renamed from: q */
    public int mo7681q(long j, List<? extends qq3> list) {
        qq3 qq3;
        int i;
        int i2;
        long b = this.f14901q.mo18770b();
        if (!mo23110J(b, list)) {
            return list.size();
        }
        this.f14905u = b;
        if (list.isEmpty()) {
            qq3 = null;
        } else {
            qq3 = (qq3) qz2.m50913d(list);
        }
        this.f14906v = qq3;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long b0 = w67.m29345b0(((qq3) list.get(size - 1)).f16398g - j, this.f14902r);
        long D = mo23106D();
        if (b0 < D) {
            return size;
        }
        C0792h b2 = mo7663b(mo23112z(b, mo23105C(list)));
        for (int i3 = 0; i3 < size; i3++) {
            qq3 qq32 = (qq3) list.get(i3);
            C0792h hVar = qq32.f16395d;
            if (w67.m29345b0(qq32.f16398g - j, this.f14902r) >= D && hVar.f4203x < b2.f4203x && (i = hVar.f4181Q) != -1 && i <= this.f14897m && (i2 = hVar.f4180P) != -1 && i2 <= this.f14896l && i < b2.f4181Q) {
                return i3;
            }
        }
        return size;
    }

    /* renamed from: s */
    public int mo7683s() {
        return this.f14904t;
    }

    /* renamed from: y */
    public boolean mo23111y(C0792h hVar, int i, long j) {
        return ((long) i) <= j;
    }

    /* renamed from: z */
    public final int mo23112z(long j, long j2) {
        long B = mo23104B(j2);
        int i = 0;
        for (int i2 = 0; i2 < this.f15738b; i2++) {
            if (j == Long.MIN_VALUE || !mo7669g(i2, j)) {
                C0792h b = mo7663b(i2);
                if (mo23111y(b, b.f4203x, B)) {
                    return i2;
                }
                i = i2;
            }
        }
        return i;
    }
}
