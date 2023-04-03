package p000;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* renamed from: x07 */
/* compiled from: TypeMappingMode.kt */
public final class x07 {

    /* renamed from: k */
    public static final C9578a f45808k = new C9578a((DefaultConstructorMarker) null);

    /* renamed from: l */
    public static final x07 f45809l;

    /* renamed from: m */
    public static final x07 f45810m;

    /* renamed from: n */
    public static final x07 f45811n = new x07(false, true, false, false, false, (x07) null, false, (x07) null, (x07) null, false, 1021, (DefaultConstructorMarker) null);

    /* renamed from: o */
    public static final x07 f45812o;

    /* renamed from: p */
    public static final x07 f45813p;

    /* renamed from: q */
    public static final x07 f45814q;

    /* renamed from: r */
    public static final x07 f45815r;

    /* renamed from: s */
    public static final x07 f45816s;

    /* renamed from: t */
    public static final x07 f45817t;

    /* renamed from: a */
    public final boolean f45818a;

    /* renamed from: b */
    public final boolean f45819b;

    /* renamed from: c */
    public final boolean f45820c;

    /* renamed from: d */
    public final boolean f45821d;

    /* renamed from: e */
    public final boolean f45822e;

    /* renamed from: f */
    public final x07 f45823f;

    /* renamed from: g */
    public final boolean f45824g;

    /* renamed from: h */
    public final x07 f45825h;

    /* renamed from: i */
    public final x07 f45826i;

    /* renamed from: j */
    public final boolean f45827j;

    /* renamed from: x07$a */
    /* compiled from: TypeMappingMode.kt */
    public static final class C9578a {
        public C9578a() {
        }

        public /* synthetic */ C9578a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: x07$b */
    /* compiled from: TypeMappingMode.kt */
    public /* synthetic */ class C9579b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f45828a;

        static {
            int[] iArr = new int[Variance.values().length];
            iArr[Variance.IN_VARIANCE.ordinal()] = 1;
            iArr[Variance.INVARIANT.ordinal()] = 2;
            f45828a = iArr;
        }
    }

    static {
        x07 x07 = new x07(false, false, false, false, false, (x07) null, false, (x07) null, (x07) null, false, 1023, (DefaultConstructorMarker) null);
        f45809l = x07;
        x07 x072 = new x07(false, false, false, false, false, (x07) null, false, (x07) null, (x07) null, true, 511, (DefaultConstructorMarker) null);
        f45810m = x072;
        x07 x073 = x07;
        f45812o = new x07(false, false, false, false, false, x073, false, (x07) null, (x07) null, false, 988, (DefaultConstructorMarker) null);
        f45813p = new x07(false, false, false, false, false, x072, false, (x07) null, (x07) null, true, 476, (DefaultConstructorMarker) null);
        f45814q = new x07(false, true, false, false, false, x073, false, (x07) null, (x07) null, false, 988, (DefaultConstructorMarker) null);
        f45815r = new x07(false, false, false, true, false, x073, false, (x07) null, (x07) null, false, 983, (DefaultConstructorMarker) null);
        f45816s = new x07(false, false, false, true, false, x073, false, (x07) null, (x07) null, false, 919, (DefaultConstructorMarker) null);
        f45817t = new x07(false, false, true, false, false, x073, false, (x07) null, (x07) null, false, 984, (DefaultConstructorMarker) null);
    }

    public x07(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, x07 x07, boolean z6, x07 x072, x07 x073, boolean z7) {
        this.f45818a = z;
        this.f45819b = z2;
        this.f45820c = z3;
        this.f45821d = z4;
        this.f45822e = z5;
        this.f45823f = x07;
        this.f45824g = z6;
        this.f45825h = x072;
        this.f45826i = x073;
        this.f45827j = z7;
    }

    /* renamed from: a */
    public final boolean mo66806a() {
        return this.f45824g;
    }

    /* renamed from: b */
    public final boolean mo66807b() {
        return this.f45827j;
    }

    /* renamed from: c */
    public final boolean mo66808c() {
        return this.f45819b;
    }

    /* renamed from: d */
    public final boolean mo66809d() {
        return this.f45818a;
    }

    /* renamed from: e */
    public final boolean mo66810e() {
        return this.f45820c;
    }

    /* renamed from: f */
    public final x07 mo66811f(Variance variance, boolean z) {
        vx2.m53591g(variance, "effectiveVariance");
        if (!z || !this.f45820c) {
            int i = C9579b.f45828a[variance.ordinal()];
            if (i == 1) {
                x07 x07 = this.f45825h;
                if (x07 != null) {
                    return x07;
                }
            } else if (i != 2) {
                x07 x072 = this.f45823f;
                if (x072 != null) {
                    return x072;
                }
            } else {
                x07 x073 = this.f45826i;
                if (x073 != null) {
                    return x073;
                }
            }
        }
        return this;
    }

    /* renamed from: g */
    public final x07 mo66812g() {
        return new x07(this.f45818a, true, this.f45820c, this.f45821d, this.f45822e, this.f45823f, this.f45824g, this.f45825h, this.f45826i, false, RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN, (DefaultConstructorMarker) null);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ x07(boolean r12, boolean r13, boolean r14, boolean r15, boolean r16, p000.x07 r17, boolean r18, p000.x07 r19, p000.x07 r20, boolean r21, int r22, kotlin.jvm.internal.DefaultConstructorMarker r23) {
        /*
            r11 = this;
            r0 = r22
            r1 = r0 & 1
            r2 = 1
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r12
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r13
        L_0x0011:
            r4 = r0 & 4
            r5 = 0
            if (r4 == 0) goto L_0x0018
            r4 = r5
            goto L_0x0019
        L_0x0018:
            r4 = r14
        L_0x0019:
            r6 = r0 & 8
            if (r6 == 0) goto L_0x001f
            r6 = r5
            goto L_0x0020
        L_0x001f:
            r6 = r15
        L_0x0020:
            r7 = r0 & 16
            if (r7 == 0) goto L_0x0026
            r7 = r5
            goto L_0x0028
        L_0x0026:
            r7 = r16
        L_0x0028:
            r8 = r0 & 32
            if (r8 == 0) goto L_0x002e
            r8 = 0
            goto L_0x0030
        L_0x002e:
            r8 = r17
        L_0x0030:
            r9 = r0 & 64
            if (r9 == 0) goto L_0x0035
            goto L_0x0037
        L_0x0035:
            r2 = r18
        L_0x0037:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x003d
            r9 = r8
            goto L_0x003f
        L_0x003d:
            r9 = r19
        L_0x003f:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0045
            r10 = r8
            goto L_0x0047
        L_0x0045:
            r10 = r20
        L_0x0047:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x004c
            goto L_0x004e
        L_0x004c:
            r5 = r21
        L_0x004e:
            r12 = r11
            r13 = r1
            r14 = r3
            r15 = r4
            r16 = r6
            r17 = r7
            r18 = r8
            r19 = r2
            r20 = r9
            r21 = r10
            r22 = r5
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.x07.<init>(boolean, boolean, boolean, boolean, boolean, x07, boolean, x07, x07, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
