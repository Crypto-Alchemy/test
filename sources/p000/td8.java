package p000;

import com.google.android.gms.internal.clearcut.zzbb;
import com.google.android.gms.internal.clearcut.zzbn;
import com.google.android.gms.internal.clearcut.zzfl;
import com.google.android.gms.internal.clearcut.zzfq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000.af8;

/* renamed from: td8 */
public final class td8<FieldDescriptorType extends af8<FieldDescriptorType>> {

    /* renamed from: d */
    public static final td8 f34238d = new td8(true);

    /* renamed from: a */
    public final qm8<FieldDescriptorType, Object> f34239a = qm8.m50646f(16);

    /* renamed from: b */
    public boolean f34240b;

    /* renamed from: c */
    public boolean f34241c = false;

    public td8() {
    }

    public td8(boolean z) {
        mo48093t();
    }

    /* renamed from: f */
    public static int m52241f(zzfl zzfl, int i, Object obj) {
        int B0 = zzbn.m33948B0(i);
        if (zzfl == zzfl.GROUP) {
            vf8.m53383i((tj8) obj);
            B0 <<= 1;
        }
        return B0 + m52244n(zzfl, obj);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        if ((r3 instanceof p000.yf8) == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
        if ((r3 instanceof byte[]) == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if ((r3 instanceof p000.pg8) == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        r0 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0046 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0047  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m52242h(com.google.android.gms.internal.clearcut.zzfl r2, java.lang.Object r3) {
        /*
            p000.vf8.m53375a(r3)
            int[] r0 = p000.wd8.f35306a
            com.google.android.gms.internal.clearcut.zzfq r2 = r2.zzek()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L_0x0041;
                case 2: goto L_0x003e;
                case 3: goto L_0x003b;
                case 4: goto L_0x0038;
                case 5: goto L_0x0035;
                case 6: goto L_0x0032;
                case 7: goto L_0x0029;
                case 8: goto L_0x0020;
                case 9: goto L_0x0015;
                default: goto L_0x0014;
            }
        L_0x0014:
            goto L_0x0044
        L_0x0015:
            boolean r2 = r3 instanceof p000.tj8
            if (r2 != 0) goto L_0x0043
            boolean r2 = r3 instanceof p000.pg8
            if (r2 == 0) goto L_0x001e
            goto L_0x0043
        L_0x001e:
            r0 = r1
            goto L_0x0043
        L_0x0020:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L_0x0043
            boolean r2 = r3 instanceof p000.yf8
            if (r2 == 0) goto L_0x001e
            goto L_0x0043
        L_0x0029:
            boolean r2 = r3 instanceof com.google.android.gms.internal.clearcut.zzbb
            if (r2 != 0) goto L_0x0043
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L_0x001e
            goto L_0x0043
        L_0x0032:
            boolean r0 = r3 instanceof java.lang.String
            goto L_0x0043
        L_0x0035:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L_0x0043
        L_0x0038:
            boolean r0 = r3 instanceof java.lang.Double
            goto L_0x0043
        L_0x003b:
            boolean r0 = r3 instanceof java.lang.Float
            goto L_0x0043
        L_0x003e:
            boolean r0 = r3 instanceof java.lang.Long
            goto L_0x0043
        L_0x0041:
            boolean r0 = r3 instanceof java.lang.Integer
        L_0x0043:
            r1 = r0
        L_0x0044:
            if (r1 == 0) goto L_0x0047
            return
        L_0x0047:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.td8.m52242h(com.google.android.gms.internal.clearcut.zzfl, java.lang.Object):void");
    }

    /* renamed from: k */
    public static <T extends af8<T>> td8<T> m52243k() {
        return f34238d;
    }

    /* renamed from: n */
    public static int m52244n(zzfl zzfl, Object obj) {
        switch (wd8.f35307b[zzfl.ordinal()]) {
            case 1:
                return zzbn.m33992w(((Double) obj).doubleValue());
            case 2:
                return zzbn.m33994x(((Float) obj).floatValue());
            case 3:
                return zzbn.m33975e0(((Long) obj).longValue());
            case 4:
                return zzbn.m33978h0(((Long) obj).longValue());
            case 5:
                return zzbn.m33950C0(((Integer) obj).intValue());
            case 6:
                return zzbn.m33984p0(((Long) obj).longValue());
            case 7:
                return zzbn.m33956F0(((Integer) obj).intValue());
            case 8:
                return zzbn.m33955F(((Boolean) obj).booleanValue());
            case 9:
                return zzbn.m33970Z((tj8) obj);
            case 10:
                return obj instanceof pg8 ? zzbn.m33974e((pg8) obj) : zzbn.m33965R((tj8) obj);
            case 11:
                return obj instanceof zzbb ? zzbn.m33951D((zzbb) obj) : zzbn.m33985q0((String) obj);
            case 12:
                return obj instanceof zzbb ? zzbn.m33951D((zzbb) obj) : zzbn.m33971a0((byte[]) obj);
            case 13:
                return zzbn.m33952D0(((Integer) obj).intValue());
            case 14:
                return zzbn.m33957G0(((Integer) obj).intValue());
            case 15:
                return zzbn.m33987s0(((Long) obj).longValue());
            case 16:
                return zzbn.m33954E0(((Integer) obj).intValue());
            case 17:
                return zzbn.m33981l0(((Long) obj).longValue());
            case 18:
                return obj instanceof yf8 ? zzbn.m33958H0(((yf8) obj).zzc()) : zzbn.m33958H0(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: o */
    public static int m52245o(af8<?> af8, Object obj) {
        zzfl A = af8.mo28957A();
        int zzc = af8.zzc();
        if (!af8.mo28959b0()) {
            return m52241f(A, zzc, obj);
        }
        int i = 0;
        List<Object> list = (List) obj;
        if (af8.mo28960q()) {
            for (Object n : list) {
                i += m52244n(A, n);
            }
            return zzbn.m33948B0(zzc) + i + zzbn.m33960J0(i);
        }
        for (Object f : list) {
            i += m52241f(A, zzc, f);
        }
        return i;
    }

    /* renamed from: p */
    public static boolean m52246p(Map.Entry<FieldDescriptorType, Object> entry) {
        af8 af8 = (af8) entry.getKey();
        if (af8.mo28962s() == zzfq.MESSAGE) {
            boolean b0 = af8.mo28959b0();
            Object value = entry.getValue();
            if (b0) {
                for (tj8 isInitialized : (List) value) {
                    if (!isInitialized.isInitialized()) {
                        return false;
                    }
                }
            } else if (value instanceof tj8) {
                if (!((tj8) value).isInitialized()) {
                    return false;
                }
            } else if (value instanceof pg8) {
                return true;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        }
        return true;
    }

    /* renamed from: r */
    public static int m52247r(Map.Entry<FieldDescriptorType, Object> entry) {
        af8 af8 = (af8) entry.getKey();
        Object value = entry.getValue();
        if (af8.mo28962s() != zzfq.MESSAGE || af8.mo28959b0() || af8.mo28960q()) {
            return m52245o(af8, value);
        }
        boolean z = value instanceof pg8;
        int zzc = ((af8) entry.getKey()).zzc();
        return z ? zzbn.m33947B(zzc, (pg8) value) : zzbn.m33969Y(zzc, (tj8) value);
    }

    /* renamed from: s */
    public static Object m52248s(Object obj) {
        if (obj instanceof kk8) {
            return ((kk8) obj).mo44819y0();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* renamed from: a */
    public final Iterator<Map.Entry<FieldDescriptorType, Object>> mo48079a() {
        return this.f34241c ? new vg8(this.f34239a.mo47145n().iterator()) : this.f34239a.mo47145n().iterator();
    }

    /* renamed from: b */
    public final boolean mo48080b() {
        return this.f34239a.isEmpty();
    }

    /* renamed from: c */
    public final boolean mo48081c() {
        return this.f34240b;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        td8 td8 = new td8();
        for (int i = 0; i < this.f34239a.mo47143l(); i++) {
            Map.Entry<FieldDescriptorType, Object> g = this.f34239a.mo47139g(i);
            td8.mo48089j((af8) g.getKey(), g.getValue());
        }
        for (Map.Entry next : this.f34239a.mo47144m()) {
            td8.mo48089j((af8) next.getKey(), next.getValue());
        }
        td8.f34241c = this.f34241c;
        return td8;
    }

    /* renamed from: d */
    public final boolean mo48083d() {
        for (int i = 0; i < this.f34239a.mo47143l(); i++) {
            if (!m52246p(this.f34239a.mo47139g(i))) {
                return false;
            }
        }
        for (Map.Entry<FieldDescriptorType, Object> p : this.f34239a.mo47144m()) {
            if (!m52246p(p)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public final Iterator<Map.Entry<FieldDescriptorType, Object>> mo48084e() {
        return this.f34241c ? new vg8(this.f34239a.entrySet().iterator()) : this.f34239a.entrySet().iterator();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof td8)) {
            return false;
        }
        return this.f34239a.equals(((td8) obj).f34239a);
    }

    /* renamed from: g */
    public final Object mo48086g(FieldDescriptorType fielddescriptortype) {
        Object obj = this.f34239a.get(fielddescriptortype);
        return obj instanceof pg8 ? pg8.m49949e() : obj;
    }

    public final int hashCode() {
        return this.f34239a.hashCode();
    }

    /* renamed from: i */
    public final void mo48088i(td8<FieldDescriptorType> td8) {
        for (int i = 0; i < td8.f34239a.mo47143l(); i++) {
            mo48092q(td8.f34239a.mo47139g(i));
        }
        for (Map.Entry<FieldDescriptorType, Object> q : td8.f34239a.mo47144m()) {
            mo48092q(q);
        }
    }

    /* renamed from: j */
    public final void mo48089j(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.mo28959b0()) {
            m52242h(fielddescriptortype.mo28957A(), obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                m52242h(fielddescriptortype.mo28957A(), obj2);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof pg8) {
            this.f34241c = true;
        }
        this.f34239a.put(fielddescriptortype, obj);
    }

    /* renamed from: l */
    public final int mo48090l() {
        int i = 0;
        for (int i2 = 0; i2 < this.f34239a.mo47143l(); i2++) {
            Map.Entry<FieldDescriptorType, Object> g = this.f34239a.mo47139g(i2);
            i += m52245o((af8) g.getKey(), g.getValue());
        }
        for (Map.Entry next : this.f34239a.mo47144m()) {
            i += m52245o((af8) next.getKey(), next.getValue());
        }
        return i;
    }

    /* renamed from: m */
    public final int mo48091m() {
        int i = 0;
        for (int i2 = 0; i2 < this.f34239a.mo47143l(); i2++) {
            i += m52247r(this.f34239a.mo47139g(i2));
        }
        for (Map.Entry<FieldDescriptorType, Object> r : this.f34239a.mo47144m()) {
            i += m52247r(r);
        }
        return i;
    }

    /* renamed from: q */
    public final void mo48092q(Map.Entry<FieldDescriptorType, Object> entry) {
        af8 af8 = (af8) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof pg8) {
            value = pg8.m49949e();
        }
        if (af8.mo28959b0()) {
            Object g = mo48086g(af8);
            if (g == null) {
                g = new ArrayList();
            }
            for (Object s : (List) value) {
                ((List) g).add(m52248s(s));
            }
            this.f34239a.put(af8, g);
        } else if (af8.mo28962s() == zzfq.MESSAGE) {
            Object g2 = mo48086g(af8);
            if (g2 == null) {
                this.f34239a.put(af8, m52248s(value));
            } else {
                this.f34239a.put(af8, g2 instanceof kk8 ? af8.mo28961q1((kk8) g2, (kk8) value) : af8.mo28958W(((tj8) g2).mo30771j(), (tj8) value).mo30781k());
            }
        } else {
            this.f34239a.put(af8, m52248s(value));
        }
    }

    /* renamed from: t */
    public final void mo48093t() {
        if (!this.f34240b) {
            this.f34239a.mo47149r();
            this.f34240b = true;
        }
    }
}
