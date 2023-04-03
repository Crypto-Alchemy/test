package p000;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.clearcut.zzcb;
import java.lang.reflect.Field;
import java.util.Arrays;

/* renamed from: bm8 */
public final class bm8 {

    /* renamed from: A */
    public int f21365A;

    /* renamed from: B */
    public int f21366B;

    /* renamed from: C */
    public Field f21367C;

    /* renamed from: D */
    public Object f21368D;

    /* renamed from: E */
    public Object f21369E;

    /* renamed from: F */
    public Object f21370F;

    /* renamed from: a */
    public final em8 f21371a;

    /* renamed from: b */
    public final Object[] f21372b;

    /* renamed from: c */
    public Class<?> f21373c;

    /* renamed from: d */
    public final int f21374d;

    /* renamed from: e */
    public final int f21375e;

    /* renamed from: f */
    public final int f21376f;

    /* renamed from: g */
    public final int f21377g;

    /* renamed from: h */
    public final int f21378h;

    /* renamed from: i */
    public final int f21379i;

    /* renamed from: j */
    public final int f21380j;

    /* renamed from: k */
    public final int f21381k;

    /* renamed from: l */
    public final int f21382l;

    /* renamed from: m */
    public final int f21383m;

    /* renamed from: n */
    public final int[] f21384n;

    /* renamed from: o */
    public int f21385o;

    /* renamed from: p */
    public int f21386p;

    /* renamed from: q */
    public int f21387q = Integer.MAX_VALUE;

    /* renamed from: r */
    public int f21388r = Integer.MIN_VALUE;

    /* renamed from: s */
    public int f21389s = 0;

    /* renamed from: t */
    public int f21390t = 0;

    /* renamed from: u */
    public int f21391u = 0;

    /* renamed from: v */
    public int f21392v = 0;

    /* renamed from: w */
    public int f21393w = 0;

    /* renamed from: x */
    public int f21394x;

    /* renamed from: y */
    public int f21395y;

    /* renamed from: z */
    public int f21396z;

    public bm8(Class<?> cls, String str, Object[] objArr) {
        this.f21373c = cls;
        em8 em8 = new em8(str);
        this.f21371a = em8;
        this.f21372b = objArr;
        this.f21374d = em8.mo42329b();
        int b = em8.mo42329b();
        this.f21375e = b;
        int[] iArr = null;
        if (b == 0) {
            this.f21376f = 0;
            this.f21377g = 0;
            this.f21378h = 0;
            this.f21379i = 0;
            this.f21380j = 0;
            this.f21382l = 0;
            this.f21381k = 0;
            this.f21383m = 0;
            this.f21384n = null;
            return;
        }
        int b2 = em8.mo42329b();
        this.f21376f = b2;
        int b3 = em8.mo42329b();
        this.f21377g = b3;
        this.f21378h = em8.mo42329b();
        this.f21379i = em8.mo42329b();
        this.f21382l = em8.mo42329b();
        this.f21381k = em8.mo42329b();
        this.f21380j = em8.mo42329b();
        this.f21383m = em8.mo42329b();
        int b4 = em8.mo42329b();
        this.f21384n = b4 != 0 ? new int[b4] : iArr;
        this.f21385o = (b2 << 1) + b3;
    }

    /* renamed from: c */
    public static Field m32607c(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + name.length() + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new RuntimeException(sb.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c6, code lost:
        if (mo29640i() != false) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0152, code lost:
        if (r1 != false) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0159, code lost:
        if (mo29640i() != false) goto L_0x00c8;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo29636a() {
        /*
            r6 = this;
            em8 r0 = r6.f21371a
            boolean r0 = r0.mo42328a()
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            em8 r0 = r6.f21371a
            int r0 = r0.mo42329b()
            r6.f21394x = r0
            em8 r0 = r6.f21371a
            int r0 = r0.mo42329b()
            r6.f21395y = r0
            r0 = r0 & 255(0xff, float:3.57E-43)
            r6.f21396z = r0
            int r2 = r6.f21394x
            int r3 = r6.f21387q
            if (r2 >= r3) goto L_0x0026
            r6.f21387q = r2
        L_0x0026:
            int r3 = r6.f21388r
            if (r2 <= r3) goto L_0x002c
            r6.f21388r = r2
        L_0x002c:
            com.google.android.gms.internal.clearcut.zzcb r2 = com.google.android.gms.internal.clearcut.zzcb.MAP
            int r3 = r2.mo30857id()
            r4 = 1
            if (r0 != r3) goto L_0x003b
            int r0 = r6.f21389s
            int r0 = r0 + r4
            r6.f21389s = r0
            goto L_0x0054
        L_0x003b:
            int r0 = r6.f21396z
            com.google.android.gms.internal.clearcut.zzcb r3 = com.google.android.gms.internal.clearcut.zzcb.DOUBLE_LIST
            int r3 = r3.mo30857id()
            if (r0 < r3) goto L_0x0054
            int r0 = r6.f21396z
            com.google.android.gms.internal.clearcut.zzcb r3 = com.google.android.gms.internal.clearcut.zzcb.GROUP_LIST
            int r3 = r3.mo30857id()
            if (r0 > r3) goto L_0x0054
            int r0 = r6.f21390t
            int r0 = r0 + r4
            r6.f21390t = r0
        L_0x0054:
            int r0 = r6.f21393w
            int r0 = r0 + r4
            r6.f21393w = r0
            int r3 = r6.f21387q
            int r5 = r6.f21394x
            boolean r0 = p000.nm8.m48888s(r3, r5, r0)
            if (r0 == 0) goto L_0x006c
            int r0 = r6.f21394x
            int r0 = r0 + r4
            r6.f21392v = r0
            int r3 = r6.f21387q
            int r0 = r0 - r3
            goto L_0x006f
        L_0x006c:
            int r0 = r6.f21391u
            int r0 = r0 + r4
        L_0x006f:
            r6.f21391u = r0
            int r0 = r6.f21395y
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0079
            r0 = r4
            goto L_0x007a
        L_0x0079:
            r0 = r1
        L_0x007a:
            if (r0 == 0) goto L_0x0088
            int[] r0 = r6.f21384n
            int r3 = r6.f21386p
            int r5 = r3 + 1
            r6.f21386p = r5
            int r5 = r6.f21394x
            r0[r3] = r5
        L_0x0088:
            r0 = 0
            r6.f21368D = r0
            r6.f21369E = r0
            r6.f21370F = r0
            boolean r0 = r6.mo29641k()
            if (r0 == 0) goto L_0x00d8
            em8 r0 = r6.f21371a
            int r0 = r0.mo42329b()
            r6.f21365A = r0
            int r0 = r6.f21396z
            com.google.android.gms.internal.clearcut.zzcb r1 = com.google.android.gms.internal.clearcut.zzcb.MESSAGE
            int r1 = r1.mo30857id()
            int r1 = r1 + 51
            if (r0 == r1) goto L_0x00d0
            int r0 = r6.f21396z
            com.google.android.gms.internal.clearcut.zzcb r1 = com.google.android.gms.internal.clearcut.zzcb.GROUP
            int r1 = r1.mo30857id()
            int r1 = r1 + 51
            if (r0 != r1) goto L_0x00b6
            goto L_0x00d0
        L_0x00b6:
            int r0 = r6.f21396z
            com.google.android.gms.internal.clearcut.zzcb r1 = com.google.android.gms.internal.clearcut.zzcb.ENUM
            int r1 = r1.mo30857id()
            int r1 = r1 + 51
            if (r0 != r1) goto L_0x0165
            boolean r0 = r6.mo29640i()
            if (r0 == 0) goto L_0x0165
        L_0x00c8:
            java.lang.Object r0 = r6.mo29637f()
            r6.f21369E = r0
            goto L_0x0165
        L_0x00d0:
            java.lang.Object r0 = r6.mo29637f()
        L_0x00d4:
            r6.f21368D = r0
            goto L_0x0165
        L_0x00d8:
            java.lang.Class<?> r0 = r6.f21373c
            java.lang.Object r3 = r6.mo29637f()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.reflect.Field r0 = m32607c(r0, r3)
            r6.f21367C = r0
            boolean r0 = r6.mo29645o()
            if (r0 == 0) goto L_0x00f4
            em8 r0 = r6.f21371a
            int r0 = r0.mo42329b()
            r6.f21366B = r0
        L_0x00f4:
            int r0 = r6.f21396z
            com.google.android.gms.internal.clearcut.zzcb r3 = com.google.android.gms.internal.clearcut.zzcb.MESSAGE
            int r3 = r3.mo30857id()
            if (r0 == r3) goto L_0x015d
            int r0 = r6.f21396z
            com.google.android.gms.internal.clearcut.zzcb r3 = com.google.android.gms.internal.clearcut.zzcb.GROUP
            int r3 = r3.mo30857id()
            if (r0 != r3) goto L_0x0109
            goto L_0x015d
        L_0x0109:
            int r0 = r6.f21396z
            com.google.android.gms.internal.clearcut.zzcb r3 = com.google.android.gms.internal.clearcut.zzcb.MESSAGE_LIST
            int r3 = r3.mo30857id()
            if (r0 == r3) goto L_0x00d0
            int r0 = r6.f21396z
            com.google.android.gms.internal.clearcut.zzcb r3 = com.google.android.gms.internal.clearcut.zzcb.GROUP_LIST
            int r3 = r3.mo30857id()
            if (r0 != r3) goto L_0x011e
            goto L_0x00d0
        L_0x011e:
            int r0 = r6.f21396z
            com.google.android.gms.internal.clearcut.zzcb r3 = com.google.android.gms.internal.clearcut.zzcb.ENUM
            int r3 = r3.mo30857id()
            if (r0 == r3) goto L_0x0155
            int r0 = r6.f21396z
            com.google.android.gms.internal.clearcut.zzcb r3 = com.google.android.gms.internal.clearcut.zzcb.ENUM_LIST
            int r3 = r3.mo30857id()
            if (r0 == r3) goto L_0x0155
            int r0 = r6.f21396z
            com.google.android.gms.internal.clearcut.zzcb r3 = com.google.android.gms.internal.clearcut.zzcb.ENUM_LIST_PACKED
            int r3 = r3.mo30857id()
            if (r0 != r3) goto L_0x013d
            goto L_0x0155
        L_0x013d:
            int r0 = r6.f21396z
            int r2 = r2.mo30857id()
            if (r0 != r2) goto L_0x0165
            java.lang.Object r0 = r6.mo29637f()
            r6.f21370F = r0
            int r0 = r6.f21395y
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0152
            r1 = r4
        L_0x0152:
            if (r1 == 0) goto L_0x0165
            goto L_0x015b
        L_0x0155:
            boolean r0 = r6.mo29640i()
            if (r0 == 0) goto L_0x0165
        L_0x015b:
            goto L_0x00c8
        L_0x015d:
            java.lang.reflect.Field r0 = r6.f21367C
            java.lang.Class r0 = r0.getType()
            goto L_0x00d4
        L_0x0165:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.bm8.mo29636a():boolean");
    }

    /* renamed from: f */
    public final Object mo29637f() {
        Object[] objArr = this.f21372b;
        int i = this.f21385o;
        this.f21385o = i + 1;
        return objArr[i];
    }

    /* renamed from: g */
    public final int mo29638g() {
        return this.f21394x;
    }

    /* renamed from: h */
    public final int mo29639h() {
        return this.f21396z;
    }

    /* renamed from: i */
    public final boolean mo29640i() {
        return (this.f21374d & 1) == 1;
    }

    /* renamed from: k */
    public final boolean mo29641k() {
        return this.f21396z > zzcb.MAP.mo30857id();
    }

    /* renamed from: l */
    public final Field mo29642l() {
        int i = this.f21365A << 1;
        Object obj = this.f21372b[i];
        if (obj instanceof Field) {
            return (Field) obj;
        }
        Field c = m32607c(this.f21373c, (String) obj);
        this.f21372b[i] = c;
        return c;
    }

    /* renamed from: m */
    public final Field mo29643m() {
        int i = (this.f21365A << 1) + 1;
        Object obj = this.f21372b[i];
        if (obj instanceof Field) {
            return (Field) obj;
        }
        Field c = m32607c(this.f21373c, (String) obj);
        this.f21372b[i] = c;
        return c;
    }

    /* renamed from: n */
    public final Field mo29644n() {
        return this.f21367C;
    }

    /* renamed from: o */
    public final boolean mo29645o() {
        return mo29640i() && this.f21396z <= zzcb.GROUP.mo30857id();
    }

    /* renamed from: p */
    public final Field mo29646p() {
        int i = (this.f21376f << 1) + (this.f21366B / 32);
        Object obj = this.f21372b[i];
        if (obj instanceof Field) {
            return (Field) obj;
        }
        Field c = m32607c(this.f21373c, (String) obj);
        this.f21372b[i] = c;
        return c;
    }

    /* renamed from: q */
    public final int mo29647q() {
        return this.f21366B % 32;
    }

    /* renamed from: r */
    public final boolean mo29648r() {
        return (this.f21395y & 256) != 0;
    }

    /* renamed from: s */
    public final boolean mo29649s() {
        return (this.f21395y & RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0;
    }

    /* renamed from: t */
    public final Object mo29650t() {
        return this.f21368D;
    }

    /* renamed from: u */
    public final Object mo29651u() {
        return this.f21369E;
    }

    /* renamed from: v */
    public final Object mo29652v() {
        return this.f21370F;
    }
}
