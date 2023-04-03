package p000;

import com.google.android.gms.internal.vision.zzht;
import com.google.android.gms.internal.vision.zzii;
import com.google.android.gms.internal.vision.zzml;
import com.google.android.gms.internal.vision.zzmo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000.n09;

/* renamed from: i09 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public final class i09<T extends n09<T>> {

    /* renamed from: d */
    public static final i09 f29779d = new i09(true);

    /* renamed from: a */
    public final o79<T, Object> f29780a;

    /* renamed from: b */
    public boolean f29781b;

    /* renamed from: c */
    public boolean f29782c;

    public i09() {
        this.f29780a = o79.m49187d(16);
    }

    /* renamed from: a */
    public static int m45426a(zzml zzml, int i, Object obj) {
        int g0 = zzii.m34404g0(i);
        if (zzml == zzml.GROUP) {
            t19.m52050g((k59) obj);
            g0 <<= 1;
        }
        return g0 + m45427b(zzml, obj);
    }

    /* renamed from: b */
    public static int m45427b(zzml zzml, Object obj) {
        switch (f09.f28712b[zzml.ordinal()]) {
            case 1:
                return zzii.m34422z(((Double) obj).doubleValue());
            case 2:
                return zzii.m34375A(((Float) obj).floatValue());
            case 3:
                return zzii.m34401d0(((Long) obj).longValue());
            case 4:
                return zzii.m34406i0(((Long) obj).longValue());
            case 5:
                return zzii.m34407k0(((Integer) obj).intValue());
            case 6:
                return zzii.m34414r0(((Long) obj).longValue());
            case 7:
                return zzii.m34419w0(((Integer) obj).intValue());
            case 8:
                return zzii.m34391L(((Boolean) obj).booleanValue());
            case 9:
                return zzii.m34395V((k59) obj);
            case 10:
                if (obj instanceof r29) {
                    return zzii.m34400d((r29) obj);
                }
                return zzii.m34390K((k59) obj);
            case 11:
                if (obj instanceof zzht) {
                    return zzii.m34388I((zzht) obj);
                }
                return zzii.m34389J((String) obj);
            case 12:
                if (obj instanceof zzht) {
                    return zzii.m34388I((zzht) obj);
                }
                return zzii.m34392M((byte[]) obj);
            case 13:
                return zzii.m34411o0(((Integer) obj).intValue());
            case 14:
                return zzii.m34423z0(((Integer) obj).intValue());
            case 15:
                return zzii.m34418v0(((Long) obj).longValue());
            case 16:
                return zzii.m34415s0(((Integer) obj).intValue());
            case 17:
                return zzii.m34410n0(((Long) obj).longValue());
            case 18:
                if (obj instanceof q19) {
                    return zzii.m34378B0(((q19) obj).zza());
                }
                return zzii.m34378B0(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: c */
    public static Object m45428c(Object obj) {
        if (obj instanceof c69) {
            return ((c69) obj).zza();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* renamed from: e */
    public static <T extends n09<T>> i09<T> m45429e() {
        return f29779d;
    }

    /* renamed from: h */
    public static <T extends n09<T>> boolean m45430h(Map.Entry<T, Object> entry) {
        n09 n09 = (n09) entry.getKey();
        if (n09.zzc() == zzmo.MESSAGE) {
            if (n09.mo31194b()) {
                for (k59 a : (List) entry.getValue()) {
                    if (!a.mo31169a()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof k59) {
                    if (!((k59) value).mo31169a()) {
                        return false;
                    }
                } else if (value instanceof r29) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    /* renamed from: l */
    public static int m45431l(Map.Entry<T, Object> entry) {
        n09 n09 = (n09) entry.getKey();
        Object value = entry.getValue();
        if (n09.zzc() != zzmo.MESSAGE || n09.mo31194b() || n09.mo31195c()) {
            return m45432m(n09, value);
        }
        if (value instanceof r29) {
            return zzii.m34383E(((n09) entry.getKey()).zza(), (r29) value);
        }
        return zzii.m34385F(((n09) entry.getKey()).zza(), (k59) value);
    }

    /* renamed from: m */
    public static int m45432m(n09<?> n09, Object obj) {
        zzml zzb = n09.zzb();
        int zza = n09.zza();
        if (!n09.mo31194b()) {
            return m45426a(zzb, zza, obj);
        }
        int i = 0;
        if (n09.mo31195c()) {
            for (Object b : (List) obj) {
                i += m45427b(zzb, b);
            }
            return zzii.m34404g0(zza) + i + zzii.m34382D0(i);
        }
        for (Object a : (List) obj) {
            i += m45426a(zzb, zza, a);
        }
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0029, code lost:
        if ((r6 instanceof p000.q19) == false) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        if ((r6 instanceof byte[]) == false) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0047, code lost:
        if (r0 == false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0049, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0077, code lost:
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new java.lang.Object[]{java.lang.Integer.valueOf(r5.zza()), r5.zzb().zza(), r6.getClass().getName()}));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0018, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0020, code lost:
        if ((r6 instanceof p000.r29) == false) goto L_0x0018;
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m45433p(T r5, java.lang.Object r6) {
        /*
            com.google.android.gms.internal.vision.zzml r0 = r5.zzb()
            p000.t19.m52047d(r6)
            int[] r1 = p000.f09.f28711a
            com.google.android.gms.internal.vision.zzmo r0 = r0.zza()
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            r2 = 0
            switch(r0) {
                case 1: goto L_0x0045;
                case 2: goto L_0x0042;
                case 3: goto L_0x003f;
                case 4: goto L_0x003c;
                case 5: goto L_0x0039;
                case 6: goto L_0x0036;
                case 7: goto L_0x002c;
                case 8: goto L_0x0023;
                case 9: goto L_0x001a;
                default: goto L_0x0018;
            }
        L_0x0018:
            r0 = r2
            goto L_0x0047
        L_0x001a:
            boolean r0 = r6 instanceof p000.k59
            if (r0 != 0) goto L_0x0034
            boolean r0 = r6 instanceof p000.r29
            if (r0 == 0) goto L_0x0018
            goto L_0x0034
        L_0x0023:
            boolean r0 = r6 instanceof java.lang.Integer
            if (r0 != 0) goto L_0x0034
            boolean r0 = r6 instanceof p000.q19
            if (r0 == 0) goto L_0x0018
            goto L_0x0034
        L_0x002c:
            boolean r0 = r6 instanceof com.google.android.gms.internal.vision.zzht
            if (r0 != 0) goto L_0x0034
            boolean r0 = r6 instanceof byte[]
            if (r0 == 0) goto L_0x0018
        L_0x0034:
            r0 = r1
            goto L_0x0047
        L_0x0036:
            boolean r0 = r6 instanceof java.lang.String
            goto L_0x0047
        L_0x0039:
            boolean r0 = r6 instanceof java.lang.Boolean
            goto L_0x0047
        L_0x003c:
            boolean r0 = r6 instanceof java.lang.Double
            goto L_0x0047
        L_0x003f:
            boolean r0 = r6 instanceof java.lang.Float
            goto L_0x0047
        L_0x0042:
            boolean r0 = r6 instanceof java.lang.Long
            goto L_0x0047
        L_0x0045:
            boolean r0 = r6 instanceof java.lang.Integer
        L_0x0047:
            if (r0 == 0) goto L_0x004a
            return
        L_0x004a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            int r4 = r5.zza()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r2] = r4
            com.google.android.gms.internal.vision.zzml r5 = r5.zzb()
            com.google.android.gms.internal.vision.zzmo r5 = r5.zza()
            r3[r1] = r5
            r5 = 2
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getName()
            r3[r5] = r6
            java.lang.String r5 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r5 = java.lang.String.format(r5, r3)
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.i09.m45433p(n09, java.lang.Object):void");
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        i09 i09 = new i09();
        for (int i = 0; i < this.f29780a.mo46334j(); i++) {
            Map.Entry<T, Object> h = this.f29780a.mo46331h(i);
            i09.mo43439g((n09) h.getKey(), h.getValue());
        }
        for (Map.Entry next : this.f29780a.mo46336m()) {
            i09.mo43439g((n09) next.getKey(), next.getValue());
        }
        i09.f29782c = this.f29782c;
        return i09;
    }

    /* renamed from: d */
    public final Object mo43436d(T t) {
        Object obj = this.f29780a.get(t);
        if (!(obj instanceof r29)) {
            return obj;
        }
        r29 r29 = (r29) obj;
        return r29.m50933e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i09)) {
            return false;
        }
        return this.f29780a.equals(((i09) obj).f29780a);
    }

    /* renamed from: f */
    public final void mo43438f(i09<T> i09) {
        for (int i = 0; i < i09.f29780a.mo46334j(); i++) {
            mo43442j(i09.f29780a.mo46331h(i));
        }
        for (Map.Entry<T, Object> j : i09.f29780a.mo46336m()) {
            mo43442j(j);
        }
    }

    /* renamed from: g */
    public final void mo43439g(T t, Object obj) {
        if (!t.mo31194b()) {
            m45433p(t, obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                m45433p(t, obj2);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof r29) {
            this.f29782c = true;
        }
        this.f29780a.put(t, obj);
    }

    public final int hashCode() {
        return this.f29780a.hashCode();
    }

    /* renamed from: i */
    public final void mo43441i() {
        if (!this.f29781b) {
            this.f29780a.mo45694e();
            this.f29781b = true;
        }
    }

    /* renamed from: j */
    public final void mo43442j(Map.Entry<T, Object> entry) {
        Object obj;
        n09 n09 = (n09) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof r29) {
            r29 r29 = (r29) value;
            value = r29.m50933e();
        }
        if (n09.mo31194b()) {
            Object d = mo43436d(n09);
            if (d == null) {
                d = new ArrayList();
            }
            for (Object c : (List) value) {
                ((List) d).add(m45428c(c));
            }
            this.f29780a.put(n09, d);
        } else if (n09.zzc() == zzmo.MESSAGE) {
            Object d2 = mo43436d(n09);
            if (d2 == null) {
                this.f29780a.put(n09, m45428c(value));
                return;
            }
            if (d2 instanceof c69) {
                obj = n09.mo31193Y0((c69) d2, (c69) value);
            } else {
                obj = n09.mo31192E0(((k59) d2).mo31170d(), (k59) value).mo31184e();
            }
            this.f29780a.put(n09, obj);
        } else {
            this.f29780a.put(n09, m45428c(value));
        }
    }

    /* renamed from: k */
    public final void mo43443k(T t, Object obj) {
        List list;
        if (t.mo31194b()) {
            m45433p(t, obj);
            Object d = mo43436d(t);
            if (d == null) {
                list = new ArrayList();
                this.f29780a.put(t, list);
            } else {
                list = (List) d;
            }
            list.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: n */
    public final boolean mo43444n() {
        return this.f29781b;
    }

    /* renamed from: o */
    public final Iterator<Map.Entry<T, Object>> mo43445o() {
        if (this.f29782c) {
            return new u29(this.f29780a.entrySet().iterator());
        }
        return this.f29780a.entrySet().iterator();
    }

    /* renamed from: q */
    public final Iterator<Map.Entry<T, Object>> mo43446q() {
        if (this.f29782c) {
            return new u29(this.f29780a.mo46337p().iterator());
        }
        return this.f29780a.mo46337p().iterator();
    }

    /* renamed from: r */
    public final boolean mo43447r() {
        for (int i = 0; i < this.f29780a.mo46334j(); i++) {
            if (!m45430h(this.f29780a.mo46331h(i))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> h : this.f29780a.mo46336m()) {
            if (!m45430h(h)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: s */
    public final int mo43448s() {
        int i = 0;
        for (int i2 = 0; i2 < this.f29780a.mo46334j(); i2++) {
            i += m45431l(this.f29780a.mo46331h(i2));
        }
        for (Map.Entry<T, Object> l : this.f29780a.mo46336m()) {
            i += m45431l(l);
        }
        return i;
    }

    public i09(boolean z) {
        this(o79.m49187d(0));
        mo43441i();
    }

    public i09(o79<T, Object> o79) {
        this.f29780a = o79;
        mo43441i();
    }
}
