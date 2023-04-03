package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.C4707d;
import com.google.crypto.tink.shaded.protobuf.C4758t;
import com.google.crypto.tink.shaded.protobuf.C4779z;
import com.google.crypto.tink.shaded.protobuf.Writer;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.sqlcipher.database.SQLiteDatabase;
import sun.misc.Unsafe;

/* renamed from: com.google.crypto.tink.shaded.protobuf.e0 */
/* compiled from: MessageSchema */
public final class C4714e0<T> implements C4731j0<T> {

    /* renamed from: r */
    public static final int[] f25153r = new int[0];

    /* renamed from: s */
    public static final Unsafe f25154s = q47.m50235H();

    /* renamed from: a */
    public final int[] f25155a;

    /* renamed from: b */
    public final Object[] f25156b;

    /* renamed from: c */
    public final int f25157c;

    /* renamed from: d */
    public final int f25158d;

    /* renamed from: e */
    public final C4705c0 f25159e;

    /* renamed from: f */
    public final boolean f25160f;

    /* renamed from: g */
    public final boolean f25161g;

    /* renamed from: h */
    public final boolean f25162h;

    /* renamed from: i */
    public final boolean f25163i;

    /* renamed from: j */
    public final int[] f25164j;

    /* renamed from: k */
    public final int f25165k;

    /* renamed from: l */
    public final int f25166l;

    /* renamed from: m */
    public final h64 f25167m;

    /* renamed from: n */
    public final C4774x f25168n;

    /* renamed from: o */
    public final C4747m0<?, ?> f25169o;

    /* renamed from: p */
    public final C4746m<?> f25170p;

    /* renamed from: q */
    public final C4701a0 f25171q;

    public C4714e0(int[] iArr, Object[] objArr, int i, int i2, C4705c0 c0Var, boolean z, boolean z2, int[] iArr2, int i3, int i4, h64 h64, C4774x xVar, C4747m0<?, ?> m0Var, C4746m<?> mVar, C4701a0 a0Var) {
        boolean z3;
        this.f25155a = iArr;
        this.f25156b = objArr;
        this.f25157c = i;
        this.f25158d = i2;
        this.f25161g = c0Var instanceof GeneratedMessageLite;
        this.f25162h = z;
        if (mVar == null || !mVar.mo35963e(c0Var)) {
            z3 = false;
        } else {
            z3 = true;
        }
        this.f25160f = z3;
        this.f25163i = z2;
        this.f25164j = iArr2;
        this.f25165k = i3;
        this.f25166l = i4;
        this.f25167m = h64;
        this.f25168n = xVar;
        this.f25169o = m0Var;
        this.f25170p = mVar;
        this.f25159e = c0Var;
        this.f25171q = a0Var;
    }

    /* renamed from: A */
    public static boolean m37650A(int i) {
        return (i & 536870912) != 0;
    }

    /* renamed from: D */
    public static boolean m37651D(Object obj, int i, C4731j0 j0Var) {
        return j0Var.mo35722f(q47.m50234G(obj, m37658U(i)));
    }

    /* renamed from: I */
    public static boolean m37652I(int i) {
        return (i & SQLiteDatabase.CREATE_IF_NECESSARY) != 0;
    }

    /* renamed from: J */
    public static List<?> m37653J(Object obj, long j) {
        return (List) q47.m50234G(obj, j);
    }

    /* renamed from: K */
    public static <T> long m37654K(T t, long j) {
        return q47.m50232E(t, j);
    }

    /* renamed from: Q */
    public static <T> C4714e0<T> m37655Q(Class<T> cls, nu3 nu3, h64 h64, C4774x xVar, C4747m0<?, ?> m0Var, C4746m<?> mVar, C4701a0 a0Var) {
        if (nu3 instanceof g75) {
            return m37657S((g75) nu3, h64, xVar, m0Var, mVar, a0Var);
        }
        return m37656R((dc6) nu3, h64, xVar, m0Var, mVar, a0Var);
    }

    /* renamed from: R */
    public static <T> C4714e0<T> m37656R(dc6 dc6, h64 h64, C4774x xVar, C4747m0<?, ?> m0Var, C4746m<?> mVar, C4701a0 a0Var) {
        boolean z;
        if (dc6.mo41895c() == ProtoSyntax.PROTO3) {
            z = true;
        } else {
            z = false;
        }
        C4751o[] e = dc6.mo41897e();
        if (e.length == 0) {
            int length = e.length;
            int[] iArr = new int[(length * 3)];
            Object[] objArr = new Object[(length * 2)];
            if (e.length <= 0) {
                int[] d = dc6.mo41896d();
                if (d == null) {
                    d = f25153r;
                }
                if (e.length <= 0) {
                    int[] iArr2 = f25153r;
                    int[] iArr3 = f25153r;
                    int[] iArr4 = new int[(d.length + iArr2.length + iArr3.length)];
                    System.arraycopy(d, 0, iArr4, 0, d.length);
                    System.arraycopy(iArr2, 0, iArr4, d.length, iArr2.length);
                    System.arraycopy(iArr3, 0, iArr4, d.length + iArr2.length, iArr3.length);
                    return new C4714e0(iArr, objArr, 0, 0, dc6.mo41894b(), z, true, iArr4, d.length, d.length + iArr2.length, h64, xVar, m0Var, mVar, a0Var);
                }
                C4751o oVar = e[0];
                throw null;
            }
            C4751o oVar2 = e[0];
            throw null;
        }
        C4751o oVar3 = e[0];
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:119:0x024e  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0251  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0269  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x026c  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x031a  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x031d  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0324  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x036d  */
    /* renamed from: S */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> com.google.crypto.tink.shaded.protobuf.C4714e0<T> m37657S(p000.g75 r34, p000.h64 r35, com.google.crypto.tink.shaded.protobuf.C4774x r36, com.google.crypto.tink.shaded.protobuf.C4747m0<?, ?> r37, com.google.crypto.tink.shaded.protobuf.C4746m<?> r38, com.google.crypto.tink.shaded.protobuf.C4701a0 r39) {
        /*
            com.google.crypto.tink.shaded.protobuf.ProtoSyntax r0 = r34.mo41895c()
            com.google.crypto.tink.shaded.protobuf.ProtoSyntax r1 = com.google.crypto.tink.shaded.protobuf.ProtoSyntax.PROTO3
            r2 = 0
            if (r0 != r1) goto L_0x000b
            r10 = 1
            goto L_0x000c
        L_0x000b:
            r10 = r2
        L_0x000c:
            java.lang.String r0 = r34.mo42840e()
            int r1 = r0.length()
            char r4 = r0.charAt(r2)
            r5 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r5) goto L_0x0028
            r4 = 1
        L_0x001e:
            int r6 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0029
            r4 = r6
            goto L_0x001e
        L_0x0028:
            r6 = 1
        L_0x0029:
            int r4 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0048
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x0035:
            int r9 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0045
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r8
            r6 = r6 | r4
            int r8 = r8 + 13
            r4 = r9
            goto L_0x0035
        L_0x0045:
            int r4 = r4 << r8
            r6 = r6 | r4
            r4 = r9
        L_0x0048:
            if (r6 != 0) goto L_0x0058
            int[] r6 = f25153r
            r8 = r2
            r9 = r8
            r11 = r9
            r12 = r11
            r14 = r12
            r16 = r14
            r13 = r6
            r6 = r16
            goto L_0x0162
        L_0x0058:
            int r6 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0077
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x0064:
            int r9 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0074
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            int r6 = r6 << r8
            r4 = r4 | r6
            int r8 = r8 + 13
            r6 = r9
            goto L_0x0064
        L_0x0074:
            int r6 = r6 << r8
            r4 = r4 | r6
            r6 = r9
        L_0x0077:
            int r8 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0096
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0083:
            int r11 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x0093
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r9
            r6 = r6 | r8
            int r9 = r9 + 13
            r8 = r11
            goto L_0x0083
        L_0x0093:
            int r8 = r8 << r9
            r6 = r6 | r8
            r8 = r11
        L_0x0096:
            int r9 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x00b5
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r11 = 13
        L_0x00a2:
            int r12 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00b2
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r11
            r8 = r8 | r9
            int r11 = r11 + 13
            r9 = r12
            goto L_0x00a2
        L_0x00b2:
            int r9 = r9 << r11
            r8 = r8 | r9
            r9 = r12
        L_0x00b5:
            int r11 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00d4
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00c1:
            int r13 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x00d1
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r12
            r9 = r9 | r11
            int r12 = r12 + 13
            r11 = r13
            goto L_0x00c1
        L_0x00d1:
            int r11 = r11 << r12
            r9 = r9 | r11
            r11 = r13
        L_0x00d4:
            int r12 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x00f3
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00e0:
            int r14 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x00f0
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r11 = r11 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00e0
        L_0x00f0:
            int r12 = r12 << r13
            r11 = r11 | r12
            r12 = r14
        L_0x00f3:
            int r13 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x0112
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00ff:
            int r15 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x010f
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00ff
        L_0x010f:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x0112:
            int r14 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x0133
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x011e:
            int r16 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r5) goto L_0x012f
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x011e
        L_0x012f:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x0133:
            int r15 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r5) goto L_0x0156
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x013f:
            int r17 = r15 + 1
            char r15 = r0.charAt(r15)
            if (r15 < r5) goto L_0x0151
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x013f
        L_0x0151:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x0156:
            int r16 = r14 + r12
            int r13 = r16 + r13
            int[] r13 = new int[r13]
            int r16 = r4 * 2
            int r16 = r16 + r6
            r6 = r4
            r4 = r15
        L_0x0162:
            sun.misc.Unsafe r15 = f25154s
            java.lang.Object[] r17 = r34.mo42839d()
            com.google.crypto.tink.shaded.protobuf.c0 r18 = r34.mo41894b()
            java.lang.Class r2 = r18.getClass()
            int r7 = r11 * 3
            int[] r7 = new int[r7]
            int r11 = r11 * 2
            java.lang.Object[] r11 = new java.lang.Object[r11]
            int r20 = r14 + r12
            r22 = r14
            r23 = r20
            r12 = 0
            r21 = 0
        L_0x0181:
            if (r4 >= r1) goto L_0x03bd
            int r24 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x01a9
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r3 = r24
            r24 = 13
        L_0x0191:
            int r26 = r3 + 1
            char r3 = r0.charAt(r3)
            if (r3 < r5) goto L_0x01a3
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r24
            r4 = r4 | r3
            int r24 = r24 + 13
            r3 = r26
            goto L_0x0191
        L_0x01a3:
            int r3 = r3 << r24
            r4 = r4 | r3
            r3 = r26
            goto L_0x01ab
        L_0x01a9:
            r3 = r24
        L_0x01ab:
            int r24 = r3 + 1
            char r3 = r0.charAt(r3)
            if (r3 < r5) goto L_0x01d8
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r5 = r24
            r24 = 13
        L_0x01b9:
            int r27 = r5 + 1
            char r5 = r0.charAt(r5)
            r28 = r1
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r1) goto L_0x01d2
            r1 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r1 = r1 << r24
            r3 = r3 | r1
            int r24 = r24 + 13
            r5 = r27
            r1 = r28
            goto L_0x01b9
        L_0x01d2:
            int r1 = r5 << r24
            r3 = r3 | r1
            r1 = r27
            goto L_0x01dc
        L_0x01d8:
            r28 = r1
            r1 = r24
        L_0x01dc:
            r5 = r3 & 255(0xff, float:3.57E-43)
            r24 = r14
            r14 = r3 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L_0x01e9
            int r14 = r12 + 1
            r13[r12] = r21
            r12 = r14
        L_0x01e9:
            r14 = 51
            r30 = r12
            if (r5 < r14) goto L_0x0286
            int r14 = r1 + 1
            char r1 = r0.charAt(r1)
            r12 = 55296(0xd800, float:7.7486E-41)
            if (r1 < r12) goto L_0x0218
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            r32 = 13
        L_0x01fe:
            int r33 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r12) goto L_0x0213
            r12 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r32
            r1 = r1 | r12
            int r32 = r32 + 13
            r14 = r33
            r12 = 55296(0xd800, float:7.7486E-41)
            goto L_0x01fe
        L_0x0213:
            int r12 = r14 << r32
            r1 = r1 | r12
            r14 = r33
        L_0x0218:
            int r12 = r5 + -51
            r32 = r14
            r14 = 9
            if (r12 == r14) goto L_0x0238
            r14 = 17
            if (r12 != r14) goto L_0x0225
            goto L_0x0238
        L_0x0225:
            r14 = 12
            if (r12 != r14) goto L_0x0246
            if (r10 != 0) goto L_0x0246
            int r12 = r21 / 3
            int r12 = r12 * 2
            r14 = 1
            int r12 = r12 + r14
            int r14 = r16 + 1
            r16 = r17[r16]
            r11[r12] = r16
            goto L_0x0244
        L_0x0238:
            int r12 = r21 / 3
            int r12 = r12 * 2
            r14 = 1
            int r12 = r12 + r14
            int r14 = r16 + 1
            r16 = r17[r16]
            r11[r12] = r16
        L_0x0244:
            r16 = r14
        L_0x0246:
            int r1 = r1 * 2
            r12 = r17[r1]
            boolean r14 = r12 instanceof java.lang.reflect.Field
            if (r14 == 0) goto L_0x0251
            java.lang.reflect.Field r12 = (java.lang.reflect.Field) r12
            goto L_0x0259
        L_0x0251:
            java.lang.String r12 = (java.lang.String) r12
            java.lang.reflect.Field r12 = m37665m0(r2, r12)
            r17[r1] = r12
        L_0x0259:
            r14 = r8
            r33 = r9
            long r8 = r15.objectFieldOffset(r12)
            int r8 = (int) r8
            int r1 = r1 + 1
            r9 = r17[r1]
            boolean r12 = r9 instanceof java.lang.reflect.Field
            if (r12 == 0) goto L_0x026c
            java.lang.reflect.Field r9 = (java.lang.reflect.Field) r9
            goto L_0x0274
        L_0x026c:
            java.lang.String r9 = (java.lang.String) r9
            java.lang.reflect.Field r9 = m37665m0(r2, r9)
            r17[r1] = r9
        L_0x0274:
            r1 = r8
            long r8 = r15.objectFieldOffset(r9)
            int r8 = (int) r8
            r31 = r0
            r9 = r8
            r0 = r10
            r29 = r32
            r25 = 1
            r8 = r1
            r1 = 0
            goto L_0x0386
        L_0x0286:
            r14 = r8
            r33 = r9
            int r8 = r16 + 1
            r9 = r17[r16]
            java.lang.String r9 = (java.lang.String) r9
            java.lang.reflect.Field r9 = m37665m0(r2, r9)
            r12 = 9
            if (r5 == r12) goto L_0x02fe
            r12 = 17
            if (r5 != r12) goto L_0x029c
            goto L_0x02fe
        L_0x029c:
            r12 = 27
            if (r5 == r12) goto L_0x02ed
            r12 = 49
            if (r5 != r12) goto L_0x02a5
            goto L_0x02ed
        L_0x02a5:
            r12 = 12
            if (r5 == r12) goto L_0x02dc
            r12 = 30
            if (r5 == r12) goto L_0x02dc
            r12 = 44
            if (r5 != r12) goto L_0x02b2
            goto L_0x02dc
        L_0x02b2:
            r12 = 50
            if (r5 != r12) goto L_0x02d2
            int r12 = r22 + 1
            r13[r22] = r21
            int r22 = r21 / 3
            int r22 = r22 * 2
            int r27 = r8 + 1
            r8 = r17[r8]
            r11[r22] = r8
            r8 = r3 & 2048(0x800, float:2.87E-42)
            if (r8 == 0) goto L_0x02d5
            int r22 = r22 + 1
            int r8 = r27 + 1
            r27 = r17[r27]
            r11[r22] = r27
            r22 = r12
        L_0x02d2:
            r25 = 1
            goto L_0x030c
        L_0x02d5:
            r22 = r12
            r12 = r27
            r25 = 1
            goto L_0x030d
        L_0x02dc:
            if (r10 != 0) goto L_0x02d2
            int r12 = r21 / 3
            int r12 = r12 * 2
            r25 = 1
            int r12 = r12 + 1
            int r27 = r8 + 1
            r8 = r17[r8]
            r11[r12] = r8
            goto L_0x02fb
        L_0x02ed:
            r25 = 1
            int r12 = r21 / 3
            int r12 = r12 * 2
            int r12 = r12 + 1
            int r27 = r8 + 1
            r8 = r17[r8]
            r11[r12] = r8
        L_0x02fb:
            r12 = r27
            goto L_0x030d
        L_0x02fe:
            r25 = 1
            int r12 = r21 / 3
            int r12 = r12 * 2
            int r12 = r12 + 1
            java.lang.Class r27 = r9.getType()
            r11[r12] = r27
        L_0x030c:
            r12 = r8
        L_0x030d:
            long r8 = r15.objectFieldOffset(r9)
            int r8 = (int) r8
            r9 = r3 & 4096(0x1000, float:5.74E-42)
            r27 = r12
            r12 = 4096(0x1000, float:5.74E-42)
            if (r9 != r12) goto L_0x031d
            r9 = r25
            goto L_0x031e
        L_0x031d:
            r9 = 0
        L_0x031e:
            if (r9 == 0) goto L_0x036d
            r9 = 17
            if (r5 > r9) goto L_0x036d
            int r9 = r1 + 1
            char r1 = r0.charAt(r1)
            r12 = 55296(0xd800, float:7.7486E-41)
            if (r1 < r12) goto L_0x0349
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            r26 = 13
        L_0x0333:
            int r29 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r12) goto L_0x0345
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r26
            r1 = r1 | r9
            int r26 = r26 + 13
            r9 = r29
            goto L_0x0333
        L_0x0345:
            int r9 = r9 << r26
            r1 = r1 | r9
            goto L_0x034b
        L_0x0349:
            r29 = r9
        L_0x034b:
            int r9 = r6 * 2
            int r26 = r1 / 32
            int r9 = r9 + r26
            r12 = r17[r9]
            r31 = r0
            boolean r0 = r12 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x035c
            java.lang.reflect.Field r12 = (java.lang.reflect.Field) r12
            goto L_0x0364
        L_0x035c:
            java.lang.String r12 = (java.lang.String) r12
            java.lang.reflect.Field r12 = m37665m0(r2, r12)
            r17[r9] = r12
        L_0x0364:
            r0 = r10
            long r9 = r15.objectFieldOffset(r12)
            int r9 = (int) r9
            int r1 = r1 % 32
            goto L_0x0376
        L_0x036d:
            r31 = r0
            r0 = r10
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r29 = r1
            r1 = 0
        L_0x0376:
            r10 = 18
            if (r5 < r10) goto L_0x0384
            r10 = 49
            if (r5 > r10) goto L_0x0384
            int r10 = r23 + 1
            r13[r23] = r8
            r23 = r10
        L_0x0384:
            r16 = r27
        L_0x0386:
            int r10 = r21 + 1
            r7[r21] = r4
            int r4 = r10 + 1
            r12 = r3 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L_0x0393
            r12 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0394
        L_0x0393:
            r12 = 0
        L_0x0394:
            r3 = r3 & 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L_0x039b
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x039c
        L_0x039b:
            r3 = 0
        L_0x039c:
            r3 = r3 | r12
            int r5 = r5 << 20
            r3 = r3 | r5
            r3 = r3 | r8
            r7[r10] = r3
            int r21 = r4 + 1
            int r1 = r1 << 20
            r1 = r1 | r9
            r7[r4] = r1
            r10 = r0
            r8 = r14
            r14 = r24
            r1 = r28
            r4 = r29
            r12 = r30
            r0 = r31
            r9 = r33
            r5 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0181
        L_0x03bd:
            r33 = r9
            r0 = r10
            r24 = r14
            r14 = r8
            com.google.crypto.tink.shaded.protobuf.e0 r1 = new com.google.crypto.tink.shaded.protobuf.e0
            com.google.crypto.tink.shaded.protobuf.c0 r9 = r34.mo41894b()
            r2 = 0
            r4 = r1
            r5 = r7
            r6 = r11
            r7 = r14
            r8 = r33
            r11 = r2
            r12 = r13
            r13 = r24
            r14 = r20
            r15 = r35
            r16 = r36
            r17 = r37
            r18 = r38
            r19 = r39
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C4714e0.m37657S(g75, h64, com.google.crypto.tink.shaded.protobuf.x, com.google.crypto.tink.shaded.protobuf.m0, com.google.crypto.tink.shaded.protobuf.m, com.google.crypto.tink.shaded.protobuf.a0):com.google.crypto.tink.shaded.protobuf.e0");
    }

    /* renamed from: U */
    public static long m37658U(int i) {
        return (long) (i & 1048575);
    }

    /* renamed from: V */
    public static <T> boolean m37659V(T t, long j) {
        return ((Boolean) q47.m50234G(t, j)).booleanValue();
    }

    /* renamed from: W */
    public static <T> double m37660W(T t, long j) {
        return ((Double) q47.m50234G(t, j)).doubleValue();
    }

    /* renamed from: X */
    public static <T> float m37661X(T t, long j) {
        return ((Float) q47.m50234G(t, j)).floatValue();
    }

    /* renamed from: Y */
    public static <T> int m37662Y(T t, long j) {
        return ((Integer) q47.m50234G(t, j)).intValue();
    }

    /* renamed from: Z */
    public static <T> long m37663Z(T t, long j) {
        return ((Long) q47.m50234G(t, j)).longValue();
    }

    /* renamed from: l */
    public static <T> boolean m37664l(T t, long j) {
        return q47.m50272t(t, j);
    }

    /* renamed from: m0 */
    public static Field m37665m0(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    /* renamed from: n */
    public static <T> double m37666n(T t, long j) {
        return q47.m50228A(t, j);
    }

    /* renamed from: q0 */
    public static int m37667q0(int i) {
        return (i & 267386880) >>> 20;
    }

    /* renamed from: r */
    public static <T> float m37668r(T t, long j) {
        return q47.m50229B(t, j);
    }

    /* renamed from: v */
    public static C4750n0 m37669v(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        C4750n0 n0Var = generatedMessageLite.unknownFields;
        if (n0Var != C4750n0.m38246c()) {
            return n0Var;
        }
        C4750n0 j = C4750n0.m38250j();
        generatedMessageLite.unknownFields = j;
        return j;
    }

    /* renamed from: z */
    public static <T> int m37670z(T t, long j) {
        return q47.m50230C(t, j);
    }

    /* renamed from: B */
    public final boolean mo35700B(T t, int i) {
        int h0 = mo35727h0(i);
        long j = (long) (1048575 & h0);
        if (j == 1048575) {
            int r0 = mo35742r0(i);
            long U = m37658U(r0);
            switch (m37667q0(r0)) {
                case 0:
                    if (Double.doubleToRawLongBits(q47.m50228A(t, U)) != 0) {
                        return true;
                    }
                    return false;
                case 1:
                    if (Float.floatToRawIntBits(q47.m50229B(t, U)) != 0) {
                        return true;
                    }
                    return false;
                case 2:
                    if (q47.m50232E(t, U) != 0) {
                        return true;
                    }
                    return false;
                case 3:
                    if (q47.m50232E(t, U) != 0) {
                        return true;
                    }
                    return false;
                case 4:
                    if (q47.m50230C(t, U) != 0) {
                        return true;
                    }
                    return false;
                case 5:
                    if (q47.m50232E(t, U) != 0) {
                        return true;
                    }
                    return false;
                case 6:
                    if (q47.m50230C(t, U) != 0) {
                        return true;
                    }
                    return false;
                case 7:
                    return q47.m50272t(t, U);
                case 8:
                    Object G = q47.m50234G(t, U);
                    if (G instanceof String) {
                        return !((String) G).isEmpty();
                    }
                    if (G instanceof ByteString) {
                        return !ByteString.EMPTY.equals(G);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (q47.m50234G(t, U) != null) {
                        return true;
                    }
                    return false;
                case 10:
                    return !ByteString.EMPTY.equals(q47.m50234G(t, U));
                case 11:
                    if (q47.m50230C(t, U) != 0) {
                        return true;
                    }
                    return false;
                case 12:
                    if (q47.m50230C(t, U) != 0) {
                        return true;
                    }
                    return false;
                case 13:
                    if (q47.m50230C(t, U) != 0) {
                        return true;
                    }
                    return false;
                case 14:
                    if (q47.m50232E(t, U) != 0) {
                        return true;
                    }
                    return false;
                case 15:
                    if (q47.m50230C(t, U) != 0) {
                        return true;
                    }
                    return false;
                case 16:
                    if (q47.m50232E(t, U) != 0) {
                        return true;
                    }
                    return false;
                case 17:
                    if (q47.m50234G(t, U) != null) {
                        return true;
                    }
                    return false;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            if ((q47.m50230C(t, j) & (1 << (h0 >>> 20))) != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: C */
    public final boolean mo35701C(T t, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return mo35700B(t, i);
        }
        if ((i3 & i4) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: E */
    public final <N> boolean mo35702E(Object obj, int i, int i2) {
        List list = (List) q47.m50234G(obj, m37658U(i));
        if (list.isEmpty()) {
            return true;
        }
        C4731j0 u = mo35747u(i2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (!u.mo35722f(list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: F */
    public final boolean mo35703F(T t, int i, int i2) {
        if (this.f25171q.mo35612e(q47.m50234G(t, m37658U(i))).isEmpty()) {
            return true;
        }
        this.f25171q.mo35609b(mo35745t(i2));
        throw null;
    }

    /* renamed from: G */
    public final boolean mo35704G(T t, T t2, int i) {
        long h0 = (long) (mo35727h0(i) & 1048575);
        if (q47.m50230C(t, h0) == q47.m50230C(t2, h0)) {
            return true;
        }
        return false;
    }

    /* renamed from: H */
    public final boolean mo35705H(T t, int i, int i2) {
        if (q47.m50230C(t, (long) (mo35727h0(i2) & 1048575)) == i) {
            return true;
        }
        return false;
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: L */
    public final <UT, UB, ET extends com.google.crypto.tink.shaded.protobuf.C4752p.C4754b<ET>> void mo35706L(com.google.crypto.tink.shaded.protobuf.C4747m0<UT, UB> r17, com.google.crypto.tink.shaded.protobuf.C4746m<ET> r18, T r19, com.google.crypto.tink.shaded.protobuf.C4729i0 r20, com.google.crypto.tink.shaded.protobuf.C4734l r21) throws java.io.IOException {
        /*
            r16 = this;
            r8 = r16
            r9 = r17
            r10 = r19
            r0 = r20
            r11 = r21
            r12 = 0
            r13 = r12
            r14 = r13
        L_0x000d:
            int r1 = r20.mo35634A()     // Catch:{ all -> 0x0612 }
            int r3 = r8.mo35723f0(r1)     // Catch:{ all -> 0x0612 }
            if (r3 >= 0) goto L_0x008e
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r2) goto L_0x0033
            int r0 = r8.f25165k
        L_0x001e:
            int r1 = r8.f25166l
            if (r0 >= r1) goto L_0x002d
            int[] r1 = r8.f25164j
            r1 = r1[r0]
            java.lang.Object r13 = r8.mo35739p(r10, r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x001e
        L_0x002d:
            if (r13 == 0) goto L_0x0032
            r9.mo28863o(r10, r13)
        L_0x0032:
            return
        L_0x0033:
            boolean r2 = r8.f25160f     // Catch:{ all -> 0x0612 }
            if (r2 != 0) goto L_0x003b
            r15 = r18
            r3 = r12
            goto L_0x0044
        L_0x003b:
            com.google.crypto.tink.shaded.protobuf.c0 r2 = r8.f25159e     // Catch:{ all -> 0x0612 }
            r15 = r18
            java.lang.Object r1 = r15.mo35960b(r11, r2, r1)     // Catch:{ all -> 0x0612 }
            r3 = r1
        L_0x0044:
            if (r3 == 0) goto L_0x005c
            if (r14 != 0) goto L_0x004d
            com.google.crypto.tink.shaded.protobuf.p r1 = r18.mo35962d(r19)     // Catch:{ all -> 0x0612 }
            r14 = r1
        L_0x004d:
            r1 = r18
            r2 = r20
            r4 = r21
            r5 = r14
            r6 = r13
            r7 = r17
            java.lang.Object r13 = r1.mo35965g(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0612 }
            goto L_0x000d
        L_0x005c:
            boolean r1 = r9.mo28865q(r0)     // Catch:{ all -> 0x0612 }
            if (r1 == 0) goto L_0x0069
            boolean r1 = r20.mo35637D()     // Catch:{ all -> 0x0612 }
            if (r1 == 0) goto L_0x0077
            goto L_0x000d
        L_0x0069:
            if (r13 != 0) goto L_0x0070
            java.lang.Object r1 = r9.mo28856f(r10)     // Catch:{ all -> 0x0612 }
            r13 = r1
        L_0x0070:
            boolean r1 = r9.mo35970m(r13, r0)     // Catch:{ all -> 0x0612 }
            if (r1 == 0) goto L_0x0077
            goto L_0x000d
        L_0x0077:
            int r0 = r8.f25165k
        L_0x0079:
            int r1 = r8.f25166l
            if (r0 >= r1) goto L_0x0088
            int[] r1 = r8.f25164j
            r1 = r1[r0]
            java.lang.Object r13 = r8.mo35739p(r10, r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x0079
        L_0x0088:
            if (r13 == 0) goto L_0x008d
            r9.mo28863o(r10, r13)
        L_0x008d:
            return
        L_0x008e:
            r15 = r18
            int r4 = r8.mo35742r0(r3)     // Catch:{ all -> 0x0612 }
            int r2 = m37667q0(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            switch(r2) {
                case 0: goto L_0x059d;
                case 1: goto L_0x058d;
                case 2: goto L_0x057d;
                case 3: goto L_0x056d;
                case 4: goto L_0x055d;
                case 5: goto L_0x054d;
                case 6: goto L_0x053d;
                case 7: goto L_0x052d;
                case 8: goto L_0x0525;
                case 9: goto L_0x04ee;
                case 10: goto L_0x04de;
                case 11: goto L_0x04ce;
                case 12: goto L_0x04ab;
                case 13: goto L_0x049b;
                case 14: goto L_0x048b;
                case 15: goto L_0x047b;
                case 16: goto L_0x046b;
                case 17: goto L_0x0434;
                case 18: goto L_0x0425;
                case 19: goto L_0x0416;
                case 20: goto L_0x0407;
                case 21: goto L_0x03f8;
                case 22: goto L_0x03e9;
                case 23: goto L_0x03da;
                case 24: goto L_0x03cb;
                case 25: goto L_0x03bc;
                case 26: goto L_0x03b7;
                case 27: goto L_0x03a5;
                case 28: goto L_0x0396;
                case 29: goto L_0x0387;
                case 30: goto L_0x0370;
                case 31: goto L_0x0361;
                case 32: goto L_0x0352;
                case 33: goto L_0x0343;
                case 34: goto L_0x0334;
                case 35: goto L_0x0325;
                case 36: goto L_0x0316;
                case 37: goto L_0x0307;
                case 38: goto L_0x02f8;
                case 39: goto L_0x02e9;
                case 40: goto L_0x02da;
                case 41: goto L_0x02cb;
                case 42: goto L_0x02bc;
                case 43: goto L_0x02ad;
                case 44: goto L_0x0296;
                case 45: goto L_0x0287;
                case 46: goto L_0x0278;
                case 47: goto L_0x0269;
                case 48: goto L_0x025a;
                case 49: goto L_0x0244;
                case 50: goto L_0x0233;
                case 51: goto L_0x021f;
                case 52: goto L_0x020b;
                case 53: goto L_0x01f7;
                case 54: goto L_0x01e3;
                case 55: goto L_0x01cf;
                case 56: goto L_0x01bb;
                case 57: goto L_0x01a7;
                case 58: goto L_0x0193;
                case 59: goto L_0x018b;
                case 60: goto L_0x0152;
                case 61: goto L_0x0142;
                case 62: goto L_0x012e;
                case 63: goto L_0x0107;
                case 64: goto L_0x00f3;
                case 65: goto L_0x00df;
                case 66: goto L_0x00cb;
                case 67: goto L_0x00b7;
                case 68: goto L_0x00a3;
                default: goto L_0x009b;
            }     // Catch:{ InvalidWireTypeException -> 0x05cb }
        L_0x009b:
            if (r13 != 0) goto L_0x05ae
            java.lang.Object r1 = r17.mo28862n()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x05ad
        L_0x00a3:
            long r4 = m37658U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.crypto.tink.shaded.protobuf.j0 r2 = r8.mo35747u(r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r2 = r0.mo35643J(r2, r11)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            p000.q47.m50250W(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo35738o0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x00b7:
            long r4 = m37658U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r6 = r20.mo35698y()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            p000.q47.m50250W(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo35738o0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x00cb:
            long r4 = m37658U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            int r2 = r20.mo35681l()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            p000.q47.m50250W(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo35738o0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x00df:
            long r4 = m37658U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r6 = r20.mo35669f()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            p000.q47.m50250W(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo35738o0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x00f3:
            long r4 = m37658U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            int r2 = r20.mo35638E()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            p000.q47.m50250W(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo35738o0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0107:
            int r2 = r20.mo35679k()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.crypto.tink.shaded.protobuf.t$e r5 = r8.mo35743s(r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            if (r5 == 0) goto L_0x011e
            boolean r5 = r5.isInRange(r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            if (r5 == 0) goto L_0x0118
            goto L_0x011e
        L_0x0118:
            java.lang.Object r13 = com.google.crypto.tink.shaded.protobuf.C4733k0.m38128L(r1, r2, r13, r9)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x011e:
            long r4 = m37658U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            p000.q47.m50250W(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo35738o0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x012e:
            long r4 = m37658U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            int r2 = r20.mo35673h()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            p000.q47.m50250W(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo35738o0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0142:
            long r4 = m37658U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = r20.mo35686o()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            p000.q47.m50250W(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo35738o0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0152:
            boolean r2 = r8.mo35705H(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            if (r2 == 0) goto L_0x0174
            long r5 = m37658U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r2 = p000.q47.m50234G(r10, r5)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.crypto.tink.shaded.protobuf.j0 r5 = r8.mo35747u(r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r5 = r0.mo35647N(r5, r11)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r2 = com.google.crypto.tink.shaded.protobuf.C4758t.m38327h(r2, r5)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r4 = m37658U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            p000.q47.m50250W(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x0186
        L_0x0174:
            long r4 = m37658U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.crypto.tink.shaded.protobuf.j0 r2 = r8.mo35747u(r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r2 = r0.mo35647N(r2, r11)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            p000.q47.m50250W(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo35736n0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
        L_0x0186:
            r8.mo35738o0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x018b:
            r8.mo35733k0(r10, r4, r0)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo35738o0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0193:
            long r4 = m37658U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            boolean r2 = r20.mo35667e()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            p000.q47.m50250W(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo35738o0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x01a7:
            long r4 = m37658U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            int r2 = r20.mo35694u()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            p000.q47.m50250W(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo35738o0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x01bb:
            long r4 = m37658U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r6 = r20.mo35661b()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            p000.q47.m50250W(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo35738o0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x01cf:
            long r4 = m37658U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            int r2 = r20.mo35687p()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            p000.q47.m50250W(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo35738o0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x01e3:
            long r4 = m37658U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r6 = r20.mo35692s()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            p000.q47.m50250W(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo35738o0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x01f7:
            long r4 = m37658U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r6 = r20.mo35641H()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            p000.q47.m50250W(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo35738o0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x020b:
            long r4 = m37658U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            float r2 = r20.readFloat()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Float r2 = java.lang.Float.valueOf(r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            p000.q47.m50250W(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo35738o0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x021f:
            long r4 = m37658U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            double r6 = r20.readDouble()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Double r2 = java.lang.Double.valueOf(r6)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            p000.q47.m50250W(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo35738o0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0233:
            java.lang.Object r4 = r8.mo35745t(r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r1 = r16
            r2 = r19
            r5 = r21
            r6 = r20
            r1.mo35707M(r2, r3, r4, r5, r6)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0244:
            long r4 = m37658U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.crypto.tink.shaded.protobuf.j0 r6 = r8.mo35747u(r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r1 = r16
            r2 = r19
            r3 = r4
            r5 = r20
            r7 = r21
            r1.mo35729i0(r2, r3, r5, r6, r7)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x025a:
            com.google.crypto.tink.shaded.protobuf.x r1 = r8.f25168n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m37658U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo36073e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo35665d(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0269:
            com.google.crypto.tink.shaded.protobuf.x r1 = r8.f25168n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m37658U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo36073e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo35689r(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0278:
            com.google.crypto.tink.shaded.protobuf.x r1 = r8.f25168n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m37658U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo36073e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo35695v(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0287:
            com.google.crypto.tink.shaded.protobuf.x r1 = r8.f25168n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m37658U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo36073e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo35663c(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0296:
            com.google.crypto.tink.shaded.protobuf.x r2 = r8.f25168n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r4 = m37658U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r2 = r2.mo36073e(r10, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo35677j(r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.crypto.tink.shaded.protobuf.t$e r3 = r8.mo35743s(r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r13 = com.google.crypto.tink.shaded.protobuf.C4733k0.m38117A(r1, r2, r3, r13, r9)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x02ad:
            com.google.crypto.tink.shaded.protobuf.x r1 = r8.f25168n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m37658U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo36073e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo35693t(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x02bc:
            com.google.crypto.tink.shaded.protobuf.x r1 = r8.f25168n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m37658U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo36073e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo35683m(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x02cb:
            com.google.crypto.tink.shaded.protobuf.x r1 = r8.f25168n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m37658U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo36073e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo35697x(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x02da:
            com.google.crypto.tink.shaded.protobuf.x r1 = r8.f25168n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m37658U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo36073e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo35688q(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x02e9:
            com.google.crypto.tink.shaded.protobuf.x r1 = r8.f25168n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m37658U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo36073e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo35696w(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x02f8:
            com.google.crypto.tink.shaded.protobuf.x r1 = r8.f25168n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m37658U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo36073e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo35671g(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0307:
            com.google.crypto.tink.shaded.protobuf.x r1 = r8.f25168n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m37658U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo36073e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo35675i(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0316:
            com.google.crypto.tink.shaded.protobuf.x r1 = r8.f25168n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m37658U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo36073e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo35636C(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0325:
            com.google.crypto.tink.shaded.protobuf.x r1 = r8.f25168n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m37658U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo36073e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo35640G(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0334:
            com.google.crypto.tink.shaded.protobuf.x r1 = r8.f25168n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m37658U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo36073e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo35665d(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0343:
            com.google.crypto.tink.shaded.protobuf.x r1 = r8.f25168n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m37658U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo36073e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo35689r(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0352:
            com.google.crypto.tink.shaded.protobuf.x r1 = r8.f25168n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m37658U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo36073e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo35695v(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0361:
            com.google.crypto.tink.shaded.protobuf.x r1 = r8.f25168n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m37658U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo36073e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo35663c(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0370:
            com.google.crypto.tink.shaded.protobuf.x r2 = r8.f25168n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r4 = m37658U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r2 = r2.mo36073e(r10, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo35677j(r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.crypto.tink.shaded.protobuf.t$e r3 = r8.mo35743s(r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r13 = com.google.crypto.tink.shaded.protobuf.C4733k0.m38117A(r1, r2, r3, r13, r9)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0387:
            com.google.crypto.tink.shaded.protobuf.x r1 = r8.f25168n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m37658U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo36073e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo35693t(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0396:
            com.google.crypto.tink.shaded.protobuf.x r1 = r8.f25168n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m37658U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo36073e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo35639F(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x03a5:
            com.google.crypto.tink.shaded.protobuf.j0 r5 = r8.mo35747u(r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r1 = r16
            r2 = r19
            r3 = r4
            r4 = r20
            r6 = r21
            r1.mo35731j0(r2, r3, r4, r5, r6)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x03b7:
            r8.mo35734l0(r10, r4, r0)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x03bc:
            com.google.crypto.tink.shaded.protobuf.x r1 = r8.f25168n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m37658U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo36073e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo35683m(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x03cb:
            com.google.crypto.tink.shaded.protobuf.x r1 = r8.f25168n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m37658U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo36073e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo35697x(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x03da:
            com.google.crypto.tink.shaded.protobuf.x r1 = r8.f25168n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m37658U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo36073e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo35688q(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x03e9:
            com.google.crypto.tink.shaded.protobuf.x r1 = r8.f25168n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m37658U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo36073e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo35696w(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x03f8:
            com.google.crypto.tink.shaded.protobuf.x r1 = r8.f25168n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m37658U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo36073e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo35671g(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0407:
            com.google.crypto.tink.shaded.protobuf.x r1 = r8.f25168n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m37658U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo36073e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo35675i(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0416:
            com.google.crypto.tink.shaded.protobuf.x r1 = r8.f25168n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m37658U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo36073e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo35636C(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0425:
            com.google.crypto.tink.shaded.protobuf.x r1 = r8.f25168n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m37658U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo36073e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo35640G(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0434:
            boolean r1 = r8.mo35700B(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            if (r1 == 0) goto L_0x0457
            long r1 = m37658U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r1 = p000.q47.m50234G(r10, r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.crypto.tink.shaded.protobuf.j0 r2 = r8.mo35747u(r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r2 = r0.mo35643J(r2, r11)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r1 = com.google.crypto.tink.shaded.protobuf.C4758t.m38327h(r1, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m37658U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            p000.q47.m50250W(r10, r2, r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0457:
            long r1 = m37658U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.crypto.tink.shaded.protobuf.j0 r4 = r8.mo35747u(r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r4 = r0.mo35643J(r4, r11)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            p000.q47.m50250W(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo35736n0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x046b:
            long r1 = m37658U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r4 = r20.mo35698y()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            p000.q47.m50249V(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo35736n0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x047b:
            long r1 = m37658U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            int r4 = r20.mo35681l()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            p000.q47.m50248U(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo35736n0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x048b:
            long r1 = m37658U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r4 = r20.mo35669f()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            p000.q47.m50249V(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo35736n0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x049b:
            long r1 = m37658U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            int r4 = r20.mo35638E()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            p000.q47.m50248U(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo35736n0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x04ab:
            int r2 = r20.mo35679k()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.crypto.tink.shaded.protobuf.t$e r5 = r8.mo35743s(r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            if (r5 == 0) goto L_0x04c2
            boolean r5 = r5.isInRange(r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            if (r5 == 0) goto L_0x04bc
            goto L_0x04c2
        L_0x04bc:
            java.lang.Object r13 = com.google.crypto.tink.shaded.protobuf.C4733k0.m38128L(r1, r2, r13, r9)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x04c2:
            long r4 = m37658U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            p000.q47.m50248U(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo35736n0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x04ce:
            long r1 = m37658U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            int r4 = r20.mo35673h()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            p000.q47.m50248U(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo35736n0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x04de:
            long r1 = m37658U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.crypto.tink.shaded.protobuf.ByteString r4 = r20.mo35686o()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            p000.q47.m50250W(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo35736n0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x04ee:
            boolean r1 = r8.mo35700B(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            if (r1 == 0) goto L_0x0511
            long r1 = m37658U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r1 = p000.q47.m50234G(r10, r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.crypto.tink.shaded.protobuf.j0 r2 = r8.mo35747u(r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r2 = r0.mo35647N(r2, r11)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r1 = com.google.crypto.tink.shaded.protobuf.C4758t.m38327h(r1, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m37658U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            p000.q47.m50250W(r10, r2, r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0511:
            long r1 = m37658U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.crypto.tink.shaded.protobuf.j0 r4 = r8.mo35747u(r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r4 = r0.mo35647N(r4, r11)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            p000.q47.m50250W(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo35736n0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0525:
            r8.mo35733k0(r10, r4, r0)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo35736n0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x052d:
            long r1 = m37658U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            boolean r4 = r20.mo35667e()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            p000.q47.m50240M(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo35736n0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x053d:
            long r1 = m37658U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            int r4 = r20.mo35694u()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            p000.q47.m50248U(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo35736n0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x054d:
            long r1 = m37658U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r4 = r20.mo35661b()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            p000.q47.m50249V(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo35736n0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x055d:
            long r1 = m37658U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            int r4 = r20.mo35687p()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            p000.q47.m50248U(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo35736n0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x056d:
            long r1 = m37658U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r4 = r20.mo35692s()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            p000.q47.m50249V(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo35736n0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x057d:
            long r1 = m37658U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r4 = r20.mo35641H()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            p000.q47.m50249V(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo35736n0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x058d:
            long r1 = m37658U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            float r4 = r20.readFloat()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            p000.q47.m50247T(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo35736n0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x059d:
            long r1 = m37658U(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            double r4 = r20.readDouble()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            p000.q47.m50246S(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.mo35736n0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x05ad:
            r13 = r1
        L_0x05ae:
            boolean r1 = r9.mo35970m(r13, r0)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            if (r1 != 0) goto L_0x000d
            int r0 = r8.f25165k
        L_0x05b6:
            int r1 = r8.f25166l
            if (r0 >= r1) goto L_0x05c5
            int[] r1 = r8.f25164j
            r1 = r1[r0]
            java.lang.Object r13 = r8.mo35739p(r10, r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x05b6
        L_0x05c5:
            if (r13 == 0) goto L_0x05ca
            r9.mo28863o(r10, r13)
        L_0x05ca:
            return
        L_0x05cb:
            boolean r1 = r9.mo28865q(r0)     // Catch:{ all -> 0x0612 }
            if (r1 == 0) goto L_0x05ee
            boolean r1 = r20.mo35637D()     // Catch:{ all -> 0x0612 }
            if (r1 != 0) goto L_0x000d
            int r0 = r8.f25165k
        L_0x05d9:
            int r1 = r8.f25166l
            if (r0 >= r1) goto L_0x05e8
            int[] r1 = r8.f25164j
            r1 = r1[r0]
            java.lang.Object r13 = r8.mo35739p(r10, r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x05d9
        L_0x05e8:
            if (r13 == 0) goto L_0x05ed
            r9.mo28863o(r10, r13)
        L_0x05ed:
            return
        L_0x05ee:
            if (r13 != 0) goto L_0x05f5
            java.lang.Object r1 = r9.mo28856f(r10)     // Catch:{ all -> 0x0612 }
            r13 = r1
        L_0x05f5:
            boolean r1 = r9.mo35970m(r13, r0)     // Catch:{ all -> 0x0612 }
            if (r1 != 0) goto L_0x000d
            int r0 = r8.f25165k
        L_0x05fd:
            int r1 = r8.f25166l
            if (r0 >= r1) goto L_0x060c
            int[] r1 = r8.f25164j
            r1 = r1[r0]
            java.lang.Object r13 = r8.mo35739p(r10, r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x05fd
        L_0x060c:
            if (r13 == 0) goto L_0x0611
            r9.mo28863o(r10, r13)
        L_0x0611:
            return
        L_0x0612:
            r0 = move-exception
            int r1 = r8.f25165k
        L_0x0615:
            int r2 = r8.f25166l
            if (r1 >= r2) goto L_0x0624
            int[] r2 = r8.f25164j
            r2 = r2[r1]
            java.lang.Object r13 = r8.mo35739p(r10, r2, r13, r9)
            int r1 = r1 + 1
            goto L_0x0615
        L_0x0624:
            if (r13 == 0) goto L_0x0629
            r9.mo28863o(r10, r13)
        L_0x0629:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C4714e0.mo35706L(com.google.crypto.tink.shaded.protobuf.m0, com.google.crypto.tink.shaded.protobuf.m, java.lang.Object, com.google.crypto.tink.shaded.protobuf.i0, com.google.crypto.tink.shaded.protobuf.l):void");
    }

    /* renamed from: M */
    public final <K, V> void mo35707M(Object obj, int i, Object obj2, C4734l lVar, C4729i0 i0Var) throws IOException {
        long U = m37658U(mo35742r0(i));
        Object G = q47.m50234G(obj, U);
        if (G == null) {
            G = this.f25171q.mo35611d(obj2);
            q47.m50250W(obj, U, G);
        } else if (this.f25171q.mo35615h(G)) {
            Object d = this.f25171q.mo35611d(obj2);
            this.f25171q.mo35608a(d, G);
            q47.m50250W(obj, U, d);
            G = d;
        }
        Map<?, ?> c = this.f25171q.mo35610c(G);
        this.f25171q.mo35609b(obj2);
        i0Var.mo35645L(c, (C4779z.C4780a) null, lVar);
    }

    /* renamed from: N */
    public final void mo35708N(T t, T t2, int i) {
        long U = m37658U(mo35742r0(i));
        if (mo35700B(t2, i)) {
            Object G = q47.m50234G(t, U);
            Object G2 = q47.m50234G(t2, U);
            if (G != null && G2 != null) {
                q47.m50250W(t, U, C4758t.m38327h(G, G2));
                mo35736n0(t, i);
            } else if (G2 != null) {
                q47.m50250W(t, U, G2);
                mo35736n0(t, i);
            }
        }
    }

    /* renamed from: O */
    public final void mo35709O(T t, T t2, int i) {
        int r0 = mo35742r0(i);
        int T = mo35711T(i);
        long U = m37658U(r0);
        if (mo35705H(t2, T, i)) {
            Object obj = null;
            if (mo35705H(t, T, i)) {
                obj = q47.m50234G(t, U);
            }
            Object G = q47.m50234G(t2, U);
            if (obj != null && G != null) {
                q47.m50250W(t, U, C4758t.m38327h(obj, G));
                mo35738o0(t, T, i);
            } else if (G != null) {
                q47.m50250W(t, U, G);
                mo35738o0(t, T, i);
            }
        }
    }

    /* renamed from: P */
    public final void mo35710P(T t, T t2, int i) {
        int r0 = mo35742r0(i);
        long U = m37658U(r0);
        int T = mo35711T(i);
        switch (m37667q0(r0)) {
            case 0:
                if (mo35700B(t2, i)) {
                    q47.m50246S(t, U, q47.m50228A(t2, U));
                    mo35736n0(t, i);
                    return;
                }
                return;
            case 1:
                if (mo35700B(t2, i)) {
                    q47.m50247T(t, U, q47.m50229B(t2, U));
                    mo35736n0(t, i);
                    return;
                }
                return;
            case 2:
                if (mo35700B(t2, i)) {
                    q47.m50249V(t, U, q47.m50232E(t2, U));
                    mo35736n0(t, i);
                    return;
                }
                return;
            case 3:
                if (mo35700B(t2, i)) {
                    q47.m50249V(t, U, q47.m50232E(t2, U));
                    mo35736n0(t, i);
                    return;
                }
                return;
            case 4:
                if (mo35700B(t2, i)) {
                    q47.m50248U(t, U, q47.m50230C(t2, U));
                    mo35736n0(t, i);
                    return;
                }
                return;
            case 5:
                if (mo35700B(t2, i)) {
                    q47.m50249V(t, U, q47.m50232E(t2, U));
                    mo35736n0(t, i);
                    return;
                }
                return;
            case 6:
                if (mo35700B(t2, i)) {
                    q47.m50248U(t, U, q47.m50230C(t2, U));
                    mo35736n0(t, i);
                    return;
                }
                return;
            case 7:
                if (mo35700B(t2, i)) {
                    q47.m50240M(t, U, q47.m50272t(t2, U));
                    mo35736n0(t, i);
                    return;
                }
                return;
            case 8:
                if (mo35700B(t2, i)) {
                    q47.m50250W(t, U, q47.m50234G(t2, U));
                    mo35736n0(t, i);
                    return;
                }
                return;
            case 9:
                mo35708N(t, t2, i);
                return;
            case 10:
                if (mo35700B(t2, i)) {
                    q47.m50250W(t, U, q47.m50234G(t2, U));
                    mo35736n0(t, i);
                    return;
                }
                return;
            case 11:
                if (mo35700B(t2, i)) {
                    q47.m50248U(t, U, q47.m50230C(t2, U));
                    mo35736n0(t, i);
                    return;
                }
                return;
            case 12:
                if (mo35700B(t2, i)) {
                    q47.m50248U(t, U, q47.m50230C(t2, U));
                    mo35736n0(t, i);
                    return;
                }
                return;
            case 13:
                if (mo35700B(t2, i)) {
                    q47.m50248U(t, U, q47.m50230C(t2, U));
                    mo35736n0(t, i);
                    return;
                }
                return;
            case 14:
                if (mo35700B(t2, i)) {
                    q47.m50249V(t, U, q47.m50232E(t2, U));
                    mo35736n0(t, i);
                    return;
                }
                return;
            case 15:
                if (mo35700B(t2, i)) {
                    q47.m50248U(t, U, q47.m50230C(t2, U));
                    mo35736n0(t, i);
                    return;
                }
                return;
            case 16:
                if (mo35700B(t2, i)) {
                    q47.m50249V(t, U, q47.m50232E(t2, U));
                    mo35736n0(t, i);
                    return;
                }
                return;
            case 17:
                mo35708N(t, t2, i);
                return;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.f25168n.mo36072d(t, t2, U);
                return;
            case 50:
                C4733k0.m38122F(this.f25171q, t, t2, U);
                return;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (mo35705H(t2, T, i)) {
                    q47.m50250W(t, U, q47.m50234G(t2, U));
                    mo35738o0(t, T, i);
                    return;
                }
                return;
            case 60:
                mo35709O(t, t2, i);
                return;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (mo35705H(t2, T, i)) {
                    q47.m50250W(t, U, q47.m50234G(t2, U));
                    mo35738o0(t, T, i);
                    return;
                }
                return;
            case 68:
                mo35709O(t, t2, i);
                return;
            default:
                return;
        }
    }

    /* renamed from: T */
    public final int mo35711T(int i) {
        return this.f25155a[i];
    }

    /* renamed from: a */
    public void mo35712a(T t, T t2) {
        t2.getClass();
        for (int i = 0; i < this.f25155a.length; i += 3) {
            mo35710P(t, t2, i);
        }
        C4733k0.m38123G(this.f25169o, t, t2);
        if (this.f25160f) {
            C4733k0.m38121E(this.f25170p, t, t2);
        }
    }

    /* renamed from: a0 */
    public final <K, V> int mo35713a0(T t, byte[] bArr, int i, int i2, int i3, long j, C4707d.C4709b bVar) throws IOException {
        T t2 = t;
        long j2 = j;
        Unsafe unsafe = f25154s;
        int i4 = i3;
        Object t3 = mo35745t(i3);
        Object object = unsafe.getObject(t, j2);
        if (this.f25171q.mo35615h(object)) {
            Object d = this.f25171q.mo35611d(t3);
            this.f25171q.mo35608a(d, object);
            unsafe.putObject(t, j2, d);
            object = d;
        }
        this.f25171q.mo35609b(t3);
        return mo35735m(bArr, i, i2, (C4779z.C4780a) null, this.f25171q.mo35610c(object), bVar);
    }

    /* renamed from: b */
    public T mo35714b() {
        return this.f25167m.mo35867a(this.f25159e);
    }

    /* renamed from: b0 */
    public final int mo35715b0(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, C4707d.C4709b bVar) throws IOException {
        boolean z;
        Object obj;
        Object obj2;
        T t2 = t;
        byte[] bArr2 = bArr;
        int i9 = i;
        int i10 = i3;
        int i11 = i4;
        int i12 = i5;
        long j2 = j;
        int i13 = i8;
        C4707d.C4709b bVar2 = bVar;
        Unsafe unsafe = f25154s;
        long j3 = (long) (this.f25155a[i13 + 2] & 1048575);
        switch (i7) {
            case 51:
                if (i12 == 1) {
                    unsafe.putObject(t2, j2, Double.valueOf(C4707d.m37557d(bArr, i)));
                    int i14 = i9 + 8;
                    unsafe.putInt(t2, j3, i11);
                    return i14;
                }
                break;
            case 52:
                if (i12 == 5) {
                    unsafe.putObject(t2, j2, Float.valueOf(C4707d.m37565l(bArr, i)));
                    int i15 = i9 + 4;
                    unsafe.putInt(t2, j3, i11);
                    return i15;
                }
                break;
            case 53:
            case 54:
                if (i12 == 0) {
                    int L = C4707d.m37551L(bArr2, i9, bVar2);
                    unsafe.putObject(t2, j2, Long.valueOf(bVar2.f25143b));
                    unsafe.putInt(t2, j3, i11);
                    return L;
                }
                break;
            case 55:
            case 62:
                if (i12 == 0) {
                    int I = C4707d.m37548I(bArr2, i9, bVar2);
                    unsafe.putObject(t2, j2, Integer.valueOf(bVar2.f25142a));
                    unsafe.putInt(t2, j3, i11);
                    return I;
                }
                break;
            case 56:
            case 65:
                if (i12 == 1) {
                    unsafe.putObject(t2, j2, Long.valueOf(C4707d.m37563j(bArr, i)));
                    int i16 = i9 + 8;
                    unsafe.putInt(t2, j3, i11);
                    return i16;
                }
                break;
            case 57:
            case 64:
                if (i12 == 5) {
                    unsafe.putObject(t2, j2, Integer.valueOf(C4707d.m37561h(bArr, i)));
                    int i17 = i9 + 4;
                    unsafe.putInt(t2, j3, i11);
                    return i17;
                }
                break;
            case 58:
                if (i12 == 0) {
                    int L2 = C4707d.m37551L(bArr2, i9, bVar2);
                    if (bVar2.f25143b != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    unsafe.putObject(t2, j2, Boolean.valueOf(z));
                    unsafe.putInt(t2, j3, i11);
                    return L2;
                }
                break;
            case 59:
                if (i12 == 2) {
                    int I2 = C4707d.m37548I(bArr2, i9, bVar2);
                    int i18 = bVar2.f25142a;
                    if (i18 == 0) {
                        unsafe.putObject(t2, j2, "");
                    } else if ((i6 & 536870912) == 0 || Utf8.m37407t(bArr2, I2, I2 + i18)) {
                        unsafe.putObject(t2, j2, new String(bArr2, I2, i18, C4758t.f25292b));
                        I2 += i18;
                    } else {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    unsafe.putInt(t2, j3, i11);
                    return I2;
                }
                break;
            case 60:
                if (i12 == 2) {
                    int p = C4707d.m37569p(mo35747u(i13), bArr2, i9, i2, bVar2);
                    if (unsafe.getInt(t2, j3) == i11) {
                        obj = unsafe.getObject(t2, j2);
                    } else {
                        obj = null;
                    }
                    if (obj == null) {
                        unsafe.putObject(t2, j2, bVar2.f25144c);
                    } else {
                        unsafe.putObject(t2, j2, C4758t.m38327h(obj, bVar2.f25144c));
                    }
                    unsafe.putInt(t2, j3, i11);
                    return p;
                }
                break;
            case 61:
                if (i12 == 2) {
                    int b = C4707d.m37555b(bArr2, i9, bVar2);
                    unsafe.putObject(t2, j2, bVar2.f25144c);
                    unsafe.putInt(t2, j3, i11);
                    return b;
                }
                break;
            case 63:
                if (i12 == 0) {
                    int I3 = C4707d.m37548I(bArr2, i9, bVar2);
                    int i19 = bVar2.f25142a;
                    C4758t.C4763e s = mo35743s(i13);
                    if (s == null || s.isInRange(i19)) {
                        unsafe.putObject(t2, j2, Integer.valueOf(i19));
                        unsafe.putInt(t2, j3, i11);
                    } else {
                        m37669v(t).mo35979m(i10, Long.valueOf((long) i19));
                    }
                    return I3;
                }
                break;
            case 66:
                if (i12 == 0) {
                    int I4 = C4707d.m37548I(bArr2, i9, bVar2);
                    unsafe.putObject(t2, j2, Integer.valueOf(C4717g.m37754b(bVar2.f25142a)));
                    unsafe.putInt(t2, j3, i11);
                    return I4;
                }
                break;
            case 67:
                if (i12 == 0) {
                    int L3 = C4707d.m37551L(bArr2, i9, bVar2);
                    unsafe.putObject(t2, j2, Long.valueOf(C4717g.m37755c(bVar2.f25143b)));
                    unsafe.putInt(t2, j3, i11);
                    return L3;
                }
                break;
            case 68:
                if (i12 == 3) {
                    int n = C4707d.m37567n(mo35747u(i13), bArr, i, i2, (i10 & -8) | 4, bVar);
                    if (unsafe.getInt(t2, j3) == i11) {
                        obj2 = unsafe.getObject(t2, j2);
                    } else {
                        obj2 = null;
                    }
                    if (obj2 == null) {
                        unsafe.putObject(t2, j2, bVar2.f25144c);
                    } else {
                        unsafe.putObject(t2, j2, C4758t.m38327h(obj2, bVar2.f25144c));
                    }
                    unsafe.putInt(t2, j3, i11);
                    return n;
                }
                break;
        }
        return i9;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01c1, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0225, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0226, code lost:
        r1 = r1 + 3;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo35716c(T r9) {
        /*
            r8 = this;
            int[] r0 = r8.f25155a
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            if (r1 >= r0) goto L_0x022a
            int r3 = r8.mo35742r0(r1)
            int r4 = r8.mo35711T(r1)
            long r5 = m37658U(r3)
            int r3 = m37667q0(r3)
            r7 = 37
            switch(r3) {
                case 0: goto L_0x0217;
                case 1: goto L_0x020c;
                case 2: goto L_0x0201;
                case 3: goto L_0x01f6;
                case 4: goto L_0x01ef;
                case 5: goto L_0x01e4;
                case 6: goto L_0x01dd;
                case 7: goto L_0x01d2;
                case 8: goto L_0x01c5;
                case 9: goto L_0x01b7;
                case 10: goto L_0x01ab;
                case 11: goto L_0x01a3;
                case 12: goto L_0x019b;
                case 13: goto L_0x0193;
                case 14: goto L_0x0187;
                case 15: goto L_0x017f;
                case 16: goto L_0x0173;
                case 17: goto L_0x0168;
                case 18: goto L_0x015c;
                case 19: goto L_0x015c;
                case 20: goto L_0x015c;
                case 21: goto L_0x015c;
                case 22: goto L_0x015c;
                case 23: goto L_0x015c;
                case 24: goto L_0x015c;
                case 25: goto L_0x015c;
                case 26: goto L_0x015c;
                case 27: goto L_0x015c;
                case 28: goto L_0x015c;
                case 29: goto L_0x015c;
                case 30: goto L_0x015c;
                case 31: goto L_0x015c;
                case 32: goto L_0x015c;
                case 33: goto L_0x015c;
                case 34: goto L_0x015c;
                case 35: goto L_0x015c;
                case 36: goto L_0x015c;
                case 37: goto L_0x015c;
                case 38: goto L_0x015c;
                case 39: goto L_0x015c;
                case 40: goto L_0x015c;
                case 41: goto L_0x015c;
                case 42: goto L_0x015c;
                case 43: goto L_0x015c;
                case 44: goto L_0x015c;
                case 45: goto L_0x015c;
                case 46: goto L_0x015c;
                case 47: goto L_0x015c;
                case 48: goto L_0x015c;
                case 49: goto L_0x015c;
                case 50: goto L_0x0150;
                case 51: goto L_0x013a;
                case 52: goto L_0x0128;
                case 53: goto L_0x0116;
                case 54: goto L_0x0104;
                case 55: goto L_0x00f6;
                case 56: goto L_0x00e4;
                case 57: goto L_0x00d6;
                case 58: goto L_0x00c4;
                case 59: goto L_0x00b0;
                case 60: goto L_0x009e;
                case 61: goto L_0x008c;
                case 62: goto L_0x007e;
                case 63: goto L_0x0070;
                case 64: goto L_0x0062;
                case 65: goto L_0x0050;
                case 66: goto L_0x0042;
                case 67: goto L_0x0030;
                case 68: goto L_0x001e;
                default: goto L_0x001c;
            }
        L_0x001c:
            goto L_0x0226
        L_0x001e:
            boolean r3 = r8.mo35705H(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            java.lang.Object r3 = p000.q47.m50234G(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x0030:
            boolean r3 = r8.mo35705H(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = m37663Z(r9, r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.C4758t.m38325f(r3)
            goto L_0x0225
        L_0x0042:
            boolean r3 = r8.mo35705H(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = m37662Y(r9, r5)
            goto L_0x0225
        L_0x0050:
            boolean r3 = r8.mo35705H(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = m37663Z(r9, r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.C4758t.m38325f(r3)
            goto L_0x0225
        L_0x0062:
            boolean r3 = r8.mo35705H(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = m37662Y(r9, r5)
            goto L_0x0225
        L_0x0070:
            boolean r3 = r8.mo35705H(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = m37662Y(r9, r5)
            goto L_0x0225
        L_0x007e:
            boolean r3 = r8.mo35705H(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = m37662Y(r9, r5)
            goto L_0x0225
        L_0x008c:
            boolean r3 = r8.mo35705H(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            java.lang.Object r3 = p000.q47.m50234G(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x009e:
            boolean r3 = r8.mo35705H(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            java.lang.Object r3 = p000.q47.m50234G(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x00b0:
            boolean r3 = r8.mo35705H(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            java.lang.Object r3 = p000.q47.m50234G(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x00c4:
            boolean r3 = r8.mo35705H(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            boolean r3 = m37659V(r9, r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.C4758t.m38322c(r3)
            goto L_0x0225
        L_0x00d6:
            boolean r3 = r8.mo35705H(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = m37662Y(r9, r5)
            goto L_0x0225
        L_0x00e4:
            boolean r3 = r8.mo35705H(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = m37663Z(r9, r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.C4758t.m38325f(r3)
            goto L_0x0225
        L_0x00f6:
            boolean r3 = r8.mo35705H(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = m37662Y(r9, r5)
            goto L_0x0225
        L_0x0104:
            boolean r3 = r8.mo35705H(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = m37663Z(r9, r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.C4758t.m38325f(r3)
            goto L_0x0225
        L_0x0116:
            boolean r3 = r8.mo35705H(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = m37663Z(r9, r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.C4758t.m38325f(r3)
            goto L_0x0225
        L_0x0128:
            boolean r3 = r8.mo35705H(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            float r3 = m37661X(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0225
        L_0x013a:
            boolean r3 = r8.mo35705H(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            double r3 = m37660W(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.crypto.tink.shaded.protobuf.C4758t.m38325f(r3)
            goto L_0x0225
        L_0x0150:
            int r2 = r2 * 53
            java.lang.Object r3 = p000.q47.m50234G(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x015c:
            int r2 = r2 * 53
            java.lang.Object r3 = p000.q47.m50234G(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x0168:
            java.lang.Object r3 = p000.q47.m50234G(r9, r5)
            if (r3 == 0) goto L_0x01c1
            int r7 = r3.hashCode()
            goto L_0x01c1
        L_0x0173:
            int r2 = r2 * 53
            long r3 = p000.q47.m50232E(r9, r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.C4758t.m38325f(r3)
            goto L_0x0225
        L_0x017f:
            int r2 = r2 * 53
            int r3 = p000.q47.m50230C(r9, r5)
            goto L_0x0225
        L_0x0187:
            int r2 = r2 * 53
            long r3 = p000.q47.m50232E(r9, r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.C4758t.m38325f(r3)
            goto L_0x0225
        L_0x0193:
            int r2 = r2 * 53
            int r3 = p000.q47.m50230C(r9, r5)
            goto L_0x0225
        L_0x019b:
            int r2 = r2 * 53
            int r3 = p000.q47.m50230C(r9, r5)
            goto L_0x0225
        L_0x01a3:
            int r2 = r2 * 53
            int r3 = p000.q47.m50230C(r9, r5)
            goto L_0x0225
        L_0x01ab:
            int r2 = r2 * 53
            java.lang.Object r3 = p000.q47.m50234G(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x01b7:
            java.lang.Object r3 = p000.q47.m50234G(r9, r5)
            if (r3 == 0) goto L_0x01c1
            int r7 = r3.hashCode()
        L_0x01c1:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0226
        L_0x01c5:
            int r2 = r2 * 53
            java.lang.Object r3 = p000.q47.m50234G(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x01d2:
            int r2 = r2 * 53
            boolean r3 = p000.q47.m50272t(r9, r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.C4758t.m38322c(r3)
            goto L_0x0225
        L_0x01dd:
            int r2 = r2 * 53
            int r3 = p000.q47.m50230C(r9, r5)
            goto L_0x0225
        L_0x01e4:
            int r2 = r2 * 53
            long r3 = p000.q47.m50232E(r9, r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.C4758t.m38325f(r3)
            goto L_0x0225
        L_0x01ef:
            int r2 = r2 * 53
            int r3 = p000.q47.m50230C(r9, r5)
            goto L_0x0225
        L_0x01f6:
            int r2 = r2 * 53
            long r3 = p000.q47.m50232E(r9, r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.C4758t.m38325f(r3)
            goto L_0x0225
        L_0x0201:
            int r2 = r2 * 53
            long r3 = p000.q47.m50232E(r9, r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.C4758t.m38325f(r3)
            goto L_0x0225
        L_0x020c:
            int r2 = r2 * 53
            float r3 = p000.q47.m50229B(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0225
        L_0x0217:
            int r2 = r2 * 53
            double r3 = p000.q47.m50228A(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.crypto.tink.shaded.protobuf.C4758t.m38325f(r3)
        L_0x0225:
            int r2 = r2 + r3
        L_0x0226:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x022a:
            int r2 = r2 * 53
            com.google.crypto.tink.shaded.protobuf.m0<?, ?> r0 = r8.f25169o
            java.lang.Object r0 = r0.mo28857g(r9)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r8.f25160f
            if (r0 == 0) goto L_0x0248
            int r2 = r2 * 53
            com.google.crypto.tink.shaded.protobuf.m<?> r0 = r8.f25170p
            com.google.crypto.tink.shaded.protobuf.p r9 = r0.mo35961c(r9)
            int r9 = r9.hashCode()
            int r2 = r2 + r9
        L_0x0248:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C4714e0.mo35716c(java.lang.Object):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v34, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v35, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v39, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v40, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x03b6, code lost:
        if (r0 != r15) goto L_0x03b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x03f6, code lost:
        if (r0 != r15) goto L_0x03b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0416, code lost:
        if (r0 != r15) goto L_0x03b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0419, code lost:
        r8 = r35;
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0245, code lost:
        r1 = r6 | r21;
        r14 = r4;
        r13 = r5;
        r2 = r8;
        r3 = r11;
        r6 = r24;
        r11 = r35;
        r5 = r1;
        r1 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x02c4, code lost:
        r2 = r8;
        r3 = r11;
        r14 = r13;
        r1 = r17;
        r6 = r24;
        r13 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0309, code lost:
        r5 = r6 | r21;
        r13 = r34;
        r14 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x030e, code lost:
        r2 = r8;
        r3 = r11;
        r1 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0314, code lost:
        r2 = r3;
        r23 = r6;
        r21 = r8;
        r27 = r10;
        r9 = r11;
        r8 = r35;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo35717c0(T r31, byte[] r32, int r33, int r34, int r35, com.google.crypto.tink.shaded.protobuf.C4707d.C4709b r36) throws java.io.IOException {
        /*
            r30 = this;
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r9 = r36
            sun.misc.Unsafe r10 = f25154s
            r16 = 0
            r0 = r33
            r2 = r16
            r3 = r2
            r5 = r3
            r1 = -1
            r6 = 1048575(0xfffff, float:1.469367E-39)
        L_0x001a:
            if (r0 >= r13) goto L_0x0474
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002b
            int r0 = com.google.crypto.tink.shaded.protobuf.C4707d.m37547H(r0, r12, r3, r9)
            int r3 = r9.f25142a
            r4 = r3
            r3 = r0
            goto L_0x002c
        L_0x002b:
            r4 = r0
        L_0x002c:
            int r0 = r4 >>> 3
            r7 = r4 & 7
            r8 = 3
            if (r0 <= r1) goto L_0x0039
            int r2 = r2 / r8
            int r1 = r15.mo35725g0(r0, r2)
            goto L_0x003d
        L_0x0039:
            int r1 = r15.mo35723f0(r0)
        L_0x003d:
            r2 = r1
            r1 = -1
            if (r2 != r1) goto L_0x0052
            r17 = r0
            r18 = r1
            r2 = r3
            r9 = r4
            r23 = r5
            r24 = r6
            r27 = r10
            r8 = r11
            r21 = r16
            goto L_0x041d
        L_0x0052:
            int[] r1 = r15.f25155a
            int r19 = r2 + 1
            r1 = r1[r19]
            int r8 = m37667q0(r1)
            long r11 = m37658U(r1)
            r19 = r4
            r4 = 17
            r20 = r1
            if (r8 > r4) goto L_0x0320
            int[] r4 = r15.f25155a
            int r21 = r2 + 2
            r4 = r4[r21]
            int r21 = r4 >>> 20
            r1 = 1
            int r21 = r1 << r21
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r13
            r17 = r2
            if (r4 == r6) goto L_0x0089
            if (r6 == r13) goto L_0x0081
            long r1 = (long) r6
            r10.putInt(r14, r1, r5)
        L_0x0081:
            long r1 = (long) r4
            int r5 = r10.getInt(r14, r1)
            r24 = r4
            goto L_0x008b
        L_0x0089:
            r24 = r6
        L_0x008b:
            r6 = r5
            r1 = 5
            switch(r8) {
                case 0: goto L_0x02ec;
                case 1: goto L_0x02cf;
                case 2: goto L_0x029c;
                case 3: goto L_0x029c;
                case 4: goto L_0x027e;
                case 5: goto L_0x0254;
                case 6: goto L_0x0227;
                case 7: goto L_0x01fe;
                case 8: goto L_0x01d3;
                case 9: goto L_0x0196;
                case 10: goto L_0x017c;
                case 11: goto L_0x027e;
                case 12: goto L_0x0144;
                case 13: goto L_0x0227;
                case 14: goto L_0x0254;
                case 15: goto L_0x0122;
                case 16: goto L_0x00f2;
                case 17: goto L_0x009f;
                default: goto L_0x0090;
            }
        L_0x0090:
            r12 = r32
            r4 = r14
            r8 = r17
            r11 = r19
            r18 = -1
            r17 = r0
        L_0x009b:
            r19 = r13
            goto L_0x0314
        L_0x009f:
            r2 = 3
            if (r7 != r2) goto L_0x00e6
            int r1 = r0 << 3
            r4 = r1 | 4
            r2 = r17
            com.google.crypto.tink.shaded.protobuf.j0 r1 = r15.mo35747u(r2)
            r17 = r0
            r0 = r1
            r18 = -1
            r1 = r32
            r8 = r2
            r2 = r3
            r3 = r34
            r7 = r19
            r5 = r36
            int r0 = com.google.crypto.tink.shaded.protobuf.C4707d.m37567n(r0, r1, r2, r3, r4, r5)
            r1 = r6 & r21
            if (r1 != 0) goto L_0x00c9
            java.lang.Object r1 = r9.f25144c
            r10.putObject(r14, r11, r1)
            goto L_0x00d6
        L_0x00c9:
            java.lang.Object r1 = r10.getObject(r14, r11)
            java.lang.Object r2 = r9.f25144c
            java.lang.Object r1 = com.google.crypto.tink.shaded.protobuf.C4758t.m38327h(r1, r2)
            r10.putObject(r14, r11, r1)
        L_0x00d6:
            r5 = r6 | r21
            r12 = r32
            r13 = r34
            r11 = r35
            r3 = r7
            r2 = r8
            r1 = r17
            r6 = r24
            goto L_0x001a
        L_0x00e6:
            r8 = r17
            r18 = -1
            r17 = r0
            r12 = r32
            r4 = r14
            r11 = r19
            goto L_0x009b
        L_0x00f2:
            r8 = r17
            r4 = r19
            r18 = -1
            r17 = r0
            if (r7 != 0) goto L_0x011b
            r1 = r11
            r12 = r32
            int r7 = com.google.crypto.tink.shaded.protobuf.C4707d.m37551L(r12, r3, r9)
            long r13 = r9.f25143b
            long r13 = com.google.crypto.tink.shaded.protobuf.C4717g.m37755c(r13)
            r0 = r10
            r2 = r1
            r1 = r31
            r11 = r4
            r4 = r13
            r0.putLong(r1, r2, r4)
            r5 = r6 | r21
            r14 = r31
            r13 = r34
            r0 = r7
            goto L_0x030e
        L_0x011b:
            r12 = r32
            r11 = r4
            r4 = r31
            goto L_0x009b
        L_0x0122:
            r13 = r11
            r8 = r17
            r11 = r19
            r18 = -1
            r12 = r32
            r17 = r0
            if (r7 != 0) goto L_0x0140
            int r0 = com.google.crypto.tink.shaded.protobuf.C4707d.m37548I(r12, r3, r9)
            int r1 = r9.f25142a
            int r1 = com.google.crypto.tink.shaded.protobuf.C4717g.m37754b(r1)
            r4 = r31
            r10.putInt(r4, r13, r1)
            goto L_0x0309
        L_0x0140:
            r4 = r31
            goto L_0x01ce
        L_0x0144:
            r4 = r14
            r8 = r17
            r18 = -1
            r17 = r0
            r13 = r11
            r11 = r19
            r12 = r32
            if (r7 != 0) goto L_0x01ce
            int r0 = com.google.crypto.tink.shaded.protobuf.C4707d.m37548I(r12, r3, r9)
            int r1 = r9.f25142a
            com.google.crypto.tink.shaded.protobuf.t$e r2 = r15.mo35743s(r8)
            if (r2 == 0) goto L_0x0177
            boolean r2 = r2.isInRange(r1)
            if (r2 == 0) goto L_0x0165
            goto L_0x0177
        L_0x0165:
            com.google.crypto.tink.shaded.protobuf.n0 r2 = m37669v(r31)
            long r13 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r13)
            r2.mo35979m(r11, r1)
            r13 = r34
            r14 = r4
            r5 = r6
            goto L_0x030e
        L_0x0177:
            r10.putInt(r4, r13, r1)
            goto L_0x0309
        L_0x017c:
            r4 = r14
            r8 = r17
            r18 = -1
            r17 = r0
            r13 = r11
            r11 = r19
            r0 = 2
            r12 = r32
            if (r7 != r0) goto L_0x01ce
            int r0 = com.google.crypto.tink.shaded.protobuf.C4707d.m37555b(r12, r3, r9)
            java.lang.Object r1 = r9.f25144c
            r10.putObject(r4, r13, r1)
            goto L_0x0309
        L_0x0196:
            r4 = r14
            r8 = r17
            r18 = -1
            r17 = r0
            r13 = r11
            r11 = r19
            r0 = 2
            r12 = r32
            if (r7 != r0) goto L_0x01cc
            com.google.crypto.tink.shaded.protobuf.j0 r0 = r15.mo35747u(r8)
            r5 = r34
            r19 = 1048575(0xfffff, float:1.469367E-39)
            int r0 = com.google.crypto.tink.shaded.protobuf.C4707d.m37569p(r0, r12, r3, r5, r9)
            r1 = r6 & r21
            if (r1 != 0) goto L_0x01bd
            java.lang.Object r1 = r9.f25144c
            r10.putObject(r4, r13, r1)
            goto L_0x0245
        L_0x01bd:
            java.lang.Object r1 = r10.getObject(r4, r13)
            java.lang.Object r2 = r9.f25144c
            java.lang.Object r1 = com.google.crypto.tink.shaded.protobuf.C4758t.m38327h(r1, r2)
            r10.putObject(r4, r13, r1)
            goto L_0x0245
        L_0x01cc:
            r5 = r34
        L_0x01ce:
            r19 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x0314
        L_0x01d3:
            r5 = r34
            r4 = r14
            r8 = r17
            r18 = -1
            r17 = r0
            r0 = 2
            r28 = r11
            r12 = r32
            r11 = r19
            r19 = r13
            r13 = r28
            if (r7 != r0) goto L_0x0314
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r20 & r0
            if (r0 != 0) goto L_0x01f4
            int r0 = com.google.crypto.tink.shaded.protobuf.C4707d.m37542C(r12, r3, r9)
            goto L_0x01f8
        L_0x01f4:
            int r0 = com.google.crypto.tink.shaded.protobuf.C4707d.m37545F(r12, r3, r9)
        L_0x01f8:
            java.lang.Object r1 = r9.f25144c
            r10.putObject(r4, r13, r1)
            goto L_0x0245
        L_0x01fe:
            r5 = r34
            r4 = r14
            r8 = r17
            r18 = -1
            r17 = r0
            r28 = r11
            r12 = r32
            r11 = r19
            r19 = r13
            r13 = r28
            if (r7 != 0) goto L_0x0314
            int r0 = com.google.crypto.tink.shaded.protobuf.C4707d.m37551L(r12, r3, r9)
            long r1 = r9.f25143b
            r25 = 0
            int r1 = (r1 > r25 ? 1 : (r1 == r25 ? 0 : -1))
            if (r1 == 0) goto L_0x0221
            r1 = 1
            goto L_0x0223
        L_0x0221:
            r1 = r16
        L_0x0223:
            p000.q47.m50240M(r4, r13, r1)
            goto L_0x0245
        L_0x0227:
            r5 = r34
            r4 = r14
            r8 = r17
            r18 = -1
            r17 = r0
            r28 = r11
            r12 = r32
            r11 = r19
            r19 = r13
            r13 = r28
            if (r7 != r1) goto L_0x0314
            int r0 = com.google.crypto.tink.shaded.protobuf.C4707d.m37561h(r12, r3)
            r10.putInt(r4, r13, r0)
            int r0 = r3 + 4
        L_0x0245:
            r1 = r6 | r21
            r14 = r4
            r13 = r5
            r2 = r8
            r3 = r11
            r6 = r24
            r11 = r35
            r5 = r1
            r1 = r17
            goto L_0x001a
        L_0x0254:
            r5 = r34
            r4 = r14
            r8 = r17
            r18 = -1
            r17 = r0
            r0 = 1
            r28 = r11
            r12 = r32
            r11 = r19
            r19 = r13
            r13 = r28
            if (r7 != r0) goto L_0x0314
            long r22 = com.google.crypto.tink.shaded.protobuf.C4707d.m37563j(r12, r3)
            r0 = r10
            r1 = r31
            r7 = r3
            r2 = r13
            r13 = r4
            r4 = r22
            r0.putLong(r1, r2, r4)
            int r0 = r7 + 8
            r5 = r6 | r21
            goto L_0x02c4
        L_0x027e:
            r4 = r14
            r8 = r17
            r18 = -1
            r17 = r0
            r28 = r11
            r12 = r32
            r11 = r19
            r19 = r13
            r13 = r28
            if (r7 != 0) goto L_0x0314
            int r0 = com.google.crypto.tink.shaded.protobuf.C4707d.m37548I(r12, r3, r9)
            int r1 = r9.f25142a
            r10.putInt(r4, r13, r1)
            goto L_0x0309
        L_0x029c:
            r4 = r14
            r8 = r17
            r18 = -1
            r17 = r0
            r28 = r11
            r12 = r32
            r11 = r19
            r19 = r13
            r13 = r28
            if (r7 != 0) goto L_0x0314
            int r7 = com.google.crypto.tink.shaded.protobuf.C4707d.m37551L(r12, r3, r9)
            long r2 = r9.f25143b
            r0 = r10
            r1 = r31
            r22 = r2
            r2 = r13
            r13 = r4
            r4 = r22
            r0.putLong(r1, r2, r4)
            r5 = r6 | r21
            r0 = r7
        L_0x02c4:
            r2 = r8
            r3 = r11
            r14 = r13
            r1 = r17
            r6 = r24
            r13 = r34
            goto L_0x0376
        L_0x02cf:
            r4 = r14
            r8 = r17
            r18 = -1
            r17 = r0
            r28 = r11
            r12 = r32
            r11 = r19
            r19 = r13
            r13 = r28
            if (r7 != r1) goto L_0x0314
            float r0 = com.google.crypto.tink.shaded.protobuf.C4707d.m37565l(r12, r3)
            p000.q47.m50247T(r4, r13, r0)
            int r0 = r3 + 4
            goto L_0x0309
        L_0x02ec:
            r4 = r14
            r8 = r17
            r18 = -1
            r17 = r0
            r0 = 1
            r28 = r11
            r12 = r32
            r11 = r19
            r19 = r13
            r13 = r28
            if (r7 != r0) goto L_0x0314
            double r0 = com.google.crypto.tink.shaded.protobuf.C4707d.m37557d(r12, r3)
            p000.q47.m50246S(r4, r13, r0)
            int r0 = r3 + 8
        L_0x0309:
            r5 = r6 | r21
            r13 = r34
            r14 = r4
        L_0x030e:
            r2 = r8
            r3 = r11
            r1 = r17
            goto L_0x0374
        L_0x0314:
            r2 = r3
            r23 = r6
            r21 = r8
            r27 = r10
            r9 = r11
            r8 = r35
            goto L_0x041d
        L_0x0320:
            r17 = r0
            r4 = r14
            r18 = -1
            r13 = r11
            r11 = r19
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r32
            r0 = 27
            if (r8 != r0) goto L_0x0387
            r0 = 2
            if (r7 != r0) goto L_0x037a
            java.lang.Object r0 = r10.getObject(r4, r13)
            com.google.crypto.tink.shaded.protobuf.t$i r0 = (com.google.crypto.tink.shaded.protobuf.C4758t.C4767i) r0
            boolean r1 = r0.mo35633v()
            if (r1 != 0) goto L_0x0352
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0349
            r1 = 10
            goto L_0x034b
        L_0x0349:
            int r1 = r1 * 2
        L_0x034b:
            com.google.crypto.tink.shaded.protobuf.t$i r0 = r0.mo35757a(r1)
            r10.putObject(r4, r13, r0)
        L_0x0352:
            r7 = r0
            com.google.crypto.tink.shaded.protobuf.j0 r0 = r15.mo35747u(r2)
            r1 = r11
            r21 = r2
            r2 = r32
            r4 = r34
            r23 = r5
            r5 = r7
            r24 = r6
            r6 = r36
            int r0 = com.google.crypto.tink.shaded.protobuf.C4707d.m37570q(r0, r1, r2, r3, r4, r5, r6)
            r14 = r31
            r13 = r34
            r3 = r11
            r1 = r17
            r2 = r21
            r5 = r23
        L_0x0374:
            r6 = r24
        L_0x0376:
            r11 = r35
            goto L_0x001a
        L_0x037a:
            r21 = r2
            r23 = r5
            r24 = r6
            r15 = r3
            r27 = r10
            r19 = r11
            goto L_0x03f9
        L_0x0387:
            r21 = r2
            r23 = r5
            r24 = r6
            r0 = 49
            if (r8 > r0) goto L_0x03d2
            r1 = r20
            long r5 = (long) r1
            r0 = r30
            r1 = r31
            r2 = r32
            r4 = r3
            r15 = r4
            r4 = r34
            r25 = r5
            r5 = r11
            r6 = r17
            r33 = r8
            r8 = r21
            r27 = r10
            r9 = r25
            r19 = r11
            r11 = r33
            r12 = r13
            r14 = r36
            int r0 = r0.mo35721e0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x0419
        L_0x03b8:
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r9 = r36
            r1 = r17
            r3 = r19
            r2 = r21
            r5 = r23
            r6 = r24
            r10 = r27
            goto L_0x001a
        L_0x03d2:
            r15 = r3
            r33 = r8
            r27 = r10
            r19 = r11
            r1 = r20
            r0 = 50
            r9 = r33
            if (r9 != r0) goto L_0x03ff
            r0 = 2
            if (r7 != r0) goto L_0x03f9
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r21
            r6 = r13
            r8 = r36
            int r0 = r0.mo35713a0(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r15) goto L_0x0419
            goto L_0x03b8
        L_0x03f9:
            r8 = r35
            r2 = r15
        L_0x03fc:
            r9 = r19
            goto L_0x041d
        L_0x03ff:
            r0 = r30
            r8 = r1
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r19
            r6 = r17
            r10 = r13
            r12 = r21
            r13 = r36
            int r0 = r0.mo35715b0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x0419
            goto L_0x03b8
        L_0x0419:
            r8 = r35
            r2 = r0
            goto L_0x03fc
        L_0x041d:
            if (r9 != r8) goto L_0x042d
            if (r8 == 0) goto L_0x042d
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r10 = r30
            r0 = r2
            r3 = r9
            r5 = r23
            r6 = r24
            goto L_0x047f
        L_0x042d:
            r10 = r30
            boolean r0 = r10.f25160f
            r11 = r36
            if (r0 == 0) goto L_0x044f
            com.google.crypto.tink.shaded.protobuf.l r0 = r11.f25145d
            com.google.crypto.tink.shaded.protobuf.l r1 = com.google.crypto.tink.shaded.protobuf.C4734l.m38174b()
            if (r0 == r1) goto L_0x044f
            com.google.crypto.tink.shaded.protobuf.c0 r5 = r10.f25159e
            com.google.crypto.tink.shaded.protobuf.m0<?, ?> r6 = r10.f25169o
            r0 = r9
            r1 = r32
            r3 = r34
            r4 = r31
            r7 = r36
            int r0 = com.google.crypto.tink.shaded.protobuf.C4707d.m37560g(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L_0x045e
        L_0x044f:
            com.google.crypto.tink.shaded.protobuf.n0 r4 = m37669v(r31)
            r0 = r9
            r1 = r32
            r3 = r34
            r5 = r36
            int r0 = com.google.crypto.tink.shaded.protobuf.C4707d.m37546G(r0, r1, r2, r3, r4, r5)
        L_0x045e:
            r14 = r31
            r12 = r32
            r13 = r34
            r3 = r9
            r15 = r10
            r9 = r11
            r1 = r17
            r2 = r21
            r5 = r23
            r6 = r24
            r10 = r27
            r11 = r8
            goto L_0x001a
        L_0x0474:
            r23 = r5
            r24 = r6
            r27 = r10
            r8 = r11
            r10 = r15
            r1 = 1048575(0xfffff, float:1.469367E-39)
        L_0x047f:
            if (r6 == r1) goto L_0x048a
            long r1 = (long) r6
            r4 = r31
            r6 = r27
            r6.putInt(r4, r1, r5)
            goto L_0x048c
        L_0x048a:
            r4 = r31
        L_0x048c:
            r1 = 0
            int r2 = r10.f25165k
        L_0x048f:
            int r5 = r10.f25166l
            if (r2 >= r5) goto L_0x04a2
            int[] r5 = r10.f25164j
            r5 = r5[r2]
            com.google.crypto.tink.shaded.protobuf.m0<?, ?> r6 = r10.f25169o
            java.lang.Object r1 = r10.mo35739p(r4, r5, r1, r6)
            com.google.crypto.tink.shaded.protobuf.n0 r1 = (com.google.crypto.tink.shaded.protobuf.C4750n0) r1
            int r2 = r2 + 1
            goto L_0x048f
        L_0x04a2:
            if (r1 == 0) goto L_0x04a9
            com.google.crypto.tink.shaded.protobuf.m0<?, ?> r2 = r10.f25169o
            r2.mo28863o(r4, r1)
        L_0x04a9:
            if (r8 != 0) goto L_0x04b5
            r1 = r34
            if (r0 != r1) goto L_0x04b0
            goto L_0x04bb
        L_0x04b0:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.parseFailure()
            throw r0
        L_0x04b5:
            r1 = r34
            if (r0 > r1) goto L_0x04bc
            if (r3 != r8) goto L_0x04bc
        L_0x04bb:
            return r0
        L_0x04bc:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.parseFailure()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C4714e0.mo35717c0(java.lang.Object, byte[], int, int, int, com.google.crypto.tink.shaded.protobuf.d$b):int");
    }

    /* renamed from: d */
    public boolean mo35718d(T t, T t2) {
        int length = this.f25155a.length;
        for (int i = 0; i < length; i += 3) {
            if (!mo35737o(t, t2, i)) {
                return false;
            }
        }
        if (!this.f25169o.mo28857g(t).equals(this.f25169o.mo28857g(t2))) {
            return false;
        }
        if (this.f25160f) {
            return this.f25170p.mo35961c(t).equals(this.f25170p.mo35961c(t2));
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v5, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x028e, code lost:
        if (r0 != r15) goto L_0x0290;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02d7, code lost:
        if (r0 != r15) goto L_0x0290;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02fa, code lost:
        if (r0 != r15) goto L_0x0290;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x02fd, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0176, code lost:
        r6 = r6 | r21;
        r9 = r10;
        r1 = r19;
        r10 = -1;
        r29 = r13;
        r13 = r2;
        r2 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01c5, code lost:
        r6 = r6 | r21;
        r9 = r10;
        r2 = r13;
        r0 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01f0, code lost:
        r6 = r6 | r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01f3, code lost:
        r2 = r4;
        r28 = r10;
        r20 = r13;
        r18 = -1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo35719d0(T r31, byte[] r32, int r33, int r34, com.google.crypto.tink.shaded.protobuf.C4707d.C4709b r35) throws java.io.IOException {
        /*
            r30 = this;
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            sun.misc.Unsafe r9 = f25154s
            r10 = -1
            r16 = 0
            r0 = r33
            r1 = r10
            r2 = r16
            r6 = r2
            r7 = 1048575(0xfffff, float:1.469367E-39)
        L_0x0018:
            if (r0 >= r13) goto L_0x0323
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002a
            int r0 = com.google.crypto.tink.shaded.protobuf.C4707d.m37547H(r0, r12, r3, r11)
            int r3 = r11.f25142a
            r4 = r0
            r17 = r3
            goto L_0x002d
        L_0x002a:
            r17 = r0
            r4 = r3
        L_0x002d:
            int r5 = r17 >>> 3
            r3 = r17 & 7
            if (r5 <= r1) goto L_0x003a
            int r2 = r2 / 3
            int r0 = r15.mo35725g0(r5, r2)
            goto L_0x003e
        L_0x003a:
            int r0 = r15.mo35723f0(r5)
        L_0x003e:
            r2 = r0
            if (r2 != r10) goto L_0x004c
            r2 = r4
            r19 = r5
            r28 = r9
            r18 = r10
            r20 = r16
            goto L_0x02ff
        L_0x004c:
            int[] r0 = r15.f25155a
            int r1 = r2 + 1
            r1 = r0[r1]
            int r0 = m37667q0(r1)
            r18 = r9
            long r8 = m37658U(r1)
            r10 = 17
            r33 = r5
            if (r0 > r10) goto L_0x01fc
            int[] r10 = r15.f25155a
            int r21 = r2 + 2
            r10 = r10[r21]
            int r21 = r10 >>> 20
            r5 = 1
            int r21 = r5 << r21
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r10 = r10 & r13
            r23 = r1
            r19 = r2
            if (r10 == r7) goto L_0x0090
            if (r7 == r13) goto L_0x0080
            long r1 = (long) r7
            r7 = r18
            r7.putInt(r14, r1, r6)
            goto L_0x0082
        L_0x0080:
            r7 = r18
        L_0x0082:
            if (r10 == r13) goto L_0x008a
            long r1 = (long) r10
            int r1 = r7.getInt(r14, r1)
            r6 = r1
        L_0x008a:
            r29 = r10
            r10 = r7
            r7 = r29
            goto L_0x0092
        L_0x0090:
            r10 = r18
        L_0x0092:
            r1 = 5
            switch(r0) {
                case 0: goto L_0x01df;
                case 1: goto L_0x01cd;
                case 2: goto L_0x01b0;
                case 3: goto L_0x01b0;
                case 4: goto L_0x019e;
                case 5: goto L_0x0183;
                case 6: goto L_0x0163;
                case 7: goto L_0x0146;
                case 8: goto L_0x0126;
                case 9: goto L_0x00f4;
                case 10: goto L_0x00e2;
                case 11: goto L_0x019e;
                case 12: goto L_0x00d1;
                case 13: goto L_0x0163;
                case 14: goto L_0x0183;
                case 15: goto L_0x00bc;
                case 16: goto L_0x009e;
                default: goto L_0x0096;
            }
        L_0x0096:
            r18 = r13
            r13 = r19
            r19 = r33
            goto L_0x01f3
        L_0x009e:
            if (r3 != 0) goto L_0x00b7
            int r17 = com.google.crypto.tink.shaded.protobuf.C4707d.m37551L(r12, r4, r11)
            long r0 = r11.f25143b
            long r4 = com.google.crypto.tink.shaded.protobuf.C4717g.m37755c(r0)
            r0 = r10
            r1 = r31
            r13 = r19
            r2 = r8
            r19 = r33
            r0.putLong(r1, r2, r4)
            goto L_0x01c5
        L_0x00b7:
            r13 = r19
            r19 = r33
            goto L_0x0121
        L_0x00bc:
            r13 = r19
            r19 = r33
            if (r3 != 0) goto L_0x0121
            int r0 = com.google.crypto.tink.shaded.protobuf.C4707d.m37548I(r12, r4, r11)
            int r1 = r11.f25142a
            int r1 = com.google.crypto.tink.shaded.protobuf.C4717g.m37754b(r1)
            r10.putInt(r14, r8, r1)
            goto L_0x01f0
        L_0x00d1:
            r13 = r19
            r19 = r33
            if (r3 != 0) goto L_0x0121
            int r0 = com.google.crypto.tink.shaded.protobuf.C4707d.m37548I(r12, r4, r11)
            int r1 = r11.f25142a
            r10.putInt(r14, r8, r1)
            goto L_0x01f0
        L_0x00e2:
            r13 = r19
            r0 = 2
            r19 = r33
            if (r3 != r0) goto L_0x0121
            int r0 = com.google.crypto.tink.shaded.protobuf.C4707d.m37555b(r12, r4, r11)
            java.lang.Object r1 = r11.f25144c
            r10.putObject(r14, r8, r1)
            goto L_0x01f0
        L_0x00f4:
            r13 = r19
            r0 = 2
            r19 = r33
            if (r3 != r0) goto L_0x011f
            com.google.crypto.tink.shaded.protobuf.j0 r0 = r15.mo35747u(r13)
            r2 = r34
            r18 = 1048575(0xfffff, float:1.469367E-39)
            int r0 = com.google.crypto.tink.shaded.protobuf.C4707d.m37569p(r0, r12, r4, r2, r11)
            java.lang.Object r1 = r10.getObject(r14, r8)
            if (r1 != 0) goto L_0x0115
            java.lang.Object r1 = r11.f25144c
            r10.putObject(r14, r8, r1)
            goto L_0x0176
        L_0x0115:
            java.lang.Object r3 = r11.f25144c
            java.lang.Object r1 = com.google.crypto.tink.shaded.protobuf.C4758t.m38327h(r1, r3)
            r10.putObject(r14, r8, r1)
            goto L_0x0176
        L_0x011f:
            r2 = r34
        L_0x0121:
            r18 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x01f3
        L_0x0126:
            r2 = r34
            r18 = r13
            r13 = r19
            r0 = 2
            r19 = r33
            if (r3 != r0) goto L_0x01f3
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r23 & r0
            if (r0 != 0) goto L_0x013c
            int r0 = com.google.crypto.tink.shaded.protobuf.C4707d.m37542C(r12, r4, r11)
            goto L_0x0140
        L_0x013c:
            int r0 = com.google.crypto.tink.shaded.protobuf.C4707d.m37545F(r12, r4, r11)
        L_0x0140:
            java.lang.Object r1 = r11.f25144c
            r10.putObject(r14, r8, r1)
            goto L_0x0176
        L_0x0146:
            r2 = r34
            r18 = r13
            r13 = r19
            r19 = r33
            if (r3 != 0) goto L_0x01f3
            int r0 = com.google.crypto.tink.shaded.protobuf.C4707d.m37551L(r12, r4, r11)
            long r3 = r11.f25143b
            r22 = 0
            int r1 = (r3 > r22 ? 1 : (r3 == r22 ? 0 : -1))
            if (r1 == 0) goto L_0x015d
            goto L_0x015f
        L_0x015d:
            r5 = r16
        L_0x015f:
            p000.q47.m50240M(r14, r8, r5)
            goto L_0x0176
        L_0x0163:
            r2 = r34
            r18 = r13
            r13 = r19
            r19 = r33
            if (r3 != r1) goto L_0x01f3
            int r0 = com.google.crypto.tink.shaded.protobuf.C4707d.m37561h(r12, r4)
            r10.putInt(r14, r8, r0)
            int r0 = r4 + 4
        L_0x0176:
            r6 = r6 | r21
            r9 = r10
            r1 = r19
            r10 = -1
            r29 = r13
            r13 = r2
            r2 = r29
            goto L_0x0018
        L_0x0183:
            r2 = r34
            r18 = r13
            r13 = r19
            r19 = r33
            if (r3 != r5) goto L_0x01f3
            long r22 = com.google.crypto.tink.shaded.protobuf.C4707d.m37563j(r12, r4)
            r0 = r10
            r1 = r31
            r2 = r8
            r8 = r4
            r4 = r22
            r0.putLong(r1, r2, r4)
            int r0 = r8 + 8
            goto L_0x01f0
        L_0x019e:
            r18 = r13
            r13 = r19
            r19 = r33
            if (r3 != 0) goto L_0x01f3
            int r0 = com.google.crypto.tink.shaded.protobuf.C4707d.m37548I(r12, r4, r11)
            int r1 = r11.f25142a
            r10.putInt(r14, r8, r1)
            goto L_0x01f0
        L_0x01b0:
            r18 = r13
            r13 = r19
            r19 = r33
            if (r3 != 0) goto L_0x01f3
            int r17 = com.google.crypto.tink.shaded.protobuf.C4707d.m37551L(r12, r4, r11)
            long r4 = r11.f25143b
            r0 = r10
            r1 = r31
            r2 = r8
            r0.putLong(r1, r2, r4)
        L_0x01c5:
            r6 = r6 | r21
            r9 = r10
            r2 = r13
            r0 = r17
            goto L_0x0241
        L_0x01cd:
            r18 = r13
            r13 = r19
            r19 = r33
            if (r3 != r1) goto L_0x01f3
            float r0 = com.google.crypto.tink.shaded.protobuf.C4707d.m37565l(r12, r4)
            p000.q47.m50247T(r14, r8, r0)
            int r0 = r4 + 4
            goto L_0x01f0
        L_0x01df:
            r18 = r13
            r13 = r19
            r19 = r33
            if (r3 != r5) goto L_0x01f3
            double r0 = com.google.crypto.tink.shaded.protobuf.C4707d.m37557d(r12, r4)
            p000.q47.m50246S(r14, r8, r0)
            int r0 = r4 + 8
        L_0x01f0:
            r6 = r6 | r21
            goto L_0x023f
        L_0x01f3:
            r2 = r4
            r28 = r10
            r20 = r13
            r18 = -1
            goto L_0x02ff
        L_0x01fc:
            r19 = r33
            r23 = r1
            r13 = r2
            r10 = r18
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r1 = 27
            if (r0 != r1) goto L_0x0255
            r1 = 2
            if (r3 != r1) goto L_0x0248
            java.lang.Object r0 = r10.getObject(r14, r8)
            com.google.crypto.tink.shaded.protobuf.t$i r0 = (com.google.crypto.tink.shaded.protobuf.C4758t.C4767i) r0
            boolean r1 = r0.mo35633v()
            if (r1 != 0) goto L_0x022b
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0222
            r1 = 10
            goto L_0x0224
        L_0x0222:
            int r1 = r1 * 2
        L_0x0224:
            com.google.crypto.tink.shaded.protobuf.t$i r0 = r0.mo35757a(r1)
            r10.putObject(r14, r8, r0)
        L_0x022b:
            r5 = r0
            com.google.crypto.tink.shaded.protobuf.j0 r0 = r15.mo35747u(r13)
            r1 = r17
            r2 = r32
            r3 = r4
            r4 = r34
            r8 = r6
            r6 = r35
            int r0 = com.google.crypto.tink.shaded.protobuf.C4707d.m37570q(r0, r1, r2, r3, r4, r5, r6)
            r6 = r8
        L_0x023f:
            r9 = r10
            r2 = r13
        L_0x0241:
            r1 = r19
            r10 = -1
            r13 = r34
            goto L_0x0018
        L_0x0248:
            r15 = r4
            r24 = r6
            r25 = r7
            r28 = r10
            r20 = r13
            r18 = -1
            goto L_0x02da
        L_0x0255:
            r1 = 49
            if (r0 > r1) goto L_0x02a6
            r1 = r23
            long r1 = (long) r1
            r5 = r0
            r0 = r30
            r21 = r1
            r1 = r31
            r2 = r32
            r33 = r3
            r3 = r4
            r15 = r4
            r4 = r34
            r23 = r5
            r5 = r17
            r24 = r6
            r6 = r19
            r25 = r7
            r7 = r33
            r26 = r8
            r9 = r18
            r8 = r13
            r28 = r10
            r18 = -1
            r9 = r21
            r11 = r23
            r20 = r13
            r12 = r26
            r14 = r35
            int r0 = r0.mo35721e0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x02fd
        L_0x0290:
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r10 = r18
            r1 = r19
            r2 = r20
            r6 = r24
            r7 = r25
            goto L_0x031f
        L_0x02a6:
            r33 = r3
            r15 = r4
            r24 = r6
            r25 = r7
            r26 = r8
            r28 = r10
            r20 = r13
            r1 = r23
            r18 = -1
            r23 = r0
            r0 = 50
            r9 = r23
            if (r9 != r0) goto L_0x02e0
            r7 = r33
            r0 = 2
            if (r7 != r0) goto L_0x02da
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r20
            r6 = r26
            r8 = r35
            int r0 = r0.mo35713a0(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r15) goto L_0x02fd
            goto L_0x0290
        L_0x02da:
            r2 = r15
        L_0x02db:
            r6 = r24
            r7 = r25
            goto L_0x02ff
        L_0x02e0:
            r7 = r33
            r0 = r30
            r8 = r1
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r17
            r6 = r19
            r10 = r26
            r12 = r20
            r13 = r35
            int r0 = r0.mo35715b0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x02fd
            goto L_0x0290
        L_0x02fd:
            r2 = r0
            goto L_0x02db
        L_0x02ff:
            com.google.crypto.tink.shaded.protobuf.n0 r4 = m37669v(r31)
            r0 = r17
            r1 = r32
            r3 = r34
            r5 = r35
            int r0 = com.google.crypto.tink.shaded.protobuf.C4707d.m37546G(r0, r1, r2, r3, r4, r5)
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r10 = r18
            r1 = r19
            r2 = r20
        L_0x031f:
            r9 = r28
            goto L_0x0018
        L_0x0323:
            r24 = r6
            r28 = r9
            r1 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 == r1) goto L_0x0336
            long r1 = (long) r7
            r3 = r31
            r6 = r24
            r4 = r28
            r4.putInt(r3, r1, r6)
        L_0x0336:
            r1 = r34
            if (r0 != r1) goto L_0x033b
            return r0
        L_0x033b:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.parseFailure()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C4714e0.mo35719d0(java.lang.Object, byte[], int, int, com.google.crypto.tink.shaded.protobuf.d$b):int");
    }

    /* renamed from: e */
    public void mo35720e(T t) {
        int i;
        int i2 = this.f25165k;
        while (true) {
            i = this.f25166l;
            if (i2 >= i) {
                break;
            }
            long U = m37658U(mo35742r0(this.f25164j[i2]));
            Object G = q47.m50234G(t, U);
            if (G != null) {
                q47.m50250W(t, U, this.f25171q.mo35613f(G));
            }
            i2++;
        }
        int length = this.f25164j.length;
        while (i < length) {
            this.f25168n.mo36071c(t, (long) this.f25164j[i]);
            i++;
        }
        this.f25169o.mo28860j(t);
        if (this.f25160f) {
            this.f25170p.mo35964f(t);
        }
    }

    /* renamed from: e0 */
    public final int mo35721e0(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, C4707d.C4709b bVar) throws IOException {
        int i8;
        int i9;
        T t2 = t;
        byte[] bArr2 = bArr;
        int i10 = i;
        int i11 = i5;
        int i12 = i6;
        long j3 = j2;
        C4707d.C4709b bVar2 = bVar;
        Unsafe unsafe = f25154s;
        C4758t.C4767i iVar = (C4758t.C4767i) unsafe.getObject(t, j3);
        if (!iVar.mo35633v()) {
            int size = iVar.size();
            if (size == 0) {
                i9 = 10;
            } else {
                i9 = size * 2;
            }
            iVar = iVar.mo35757a(i9);
            unsafe.putObject(t, j3, iVar);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i11 == 2) {
                    return C4707d.m37572s(bArr, i10, iVar, bVar2);
                }
                if (i11 == 1) {
                    return C4707d.m37558e(i3, bArr, i, i2, iVar, bVar);
                }
                break;
            case 19:
            case 36:
                if (i11 == 2) {
                    return C4707d.m37575v(bArr, i10, iVar, bVar2);
                }
                if (i11 == 5) {
                    return C4707d.m37566m(i3, bArr, i, i2, iVar, bVar);
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i11 == 2) {
                    return C4707d.m37579z(bArr, i10, iVar, bVar2);
                }
                if (i11 == 0) {
                    return C4707d.m37552M(i3, bArr, i, i2, iVar, bVar);
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i11 == 2) {
                    return C4707d.m37578y(bArr, i10, iVar, bVar2);
                }
                if (i11 == 0) {
                    return C4707d.m37549J(i3, bArr, i, i2, iVar, bVar);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i11 == 2) {
                    return C4707d.m37574u(bArr, i10, iVar, bVar2);
                }
                if (i11 == 1) {
                    return C4707d.m37564k(i3, bArr, i, i2, iVar, bVar);
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i11 == 2) {
                    return C4707d.m37573t(bArr, i10, iVar, bVar2);
                }
                if (i11 == 5) {
                    return C4707d.m37562i(i3, bArr, i, i2, iVar, bVar);
                }
                break;
            case 25:
            case 42:
                if (i11 == 2) {
                    return C4707d.m37571r(bArr, i10, iVar, bVar2);
                }
                if (i11 == 0) {
                    return C4707d.m37554a(i3, bArr, i, i2, iVar, bVar);
                }
                break;
            case 26:
                if (i11 == 2) {
                    if ((j & 536870912) == 0) {
                        return C4707d.m37543D(i3, bArr, i, i2, iVar, bVar);
                    }
                    return C4707d.m37544E(i3, bArr, i, i2, iVar, bVar);
                }
                break;
            case 27:
                if (i11 == 2) {
                    return C4707d.m37570q(mo35747u(i12), i3, bArr, i, i2, iVar, bVar);
                }
                break;
            case 28:
                if (i11 == 2) {
                    return C4707d.m37556c(i3, bArr, i, i2, iVar, bVar);
                }
                break;
            case 30:
            case 44:
                if (i11 == 2) {
                    i8 = C4707d.m37578y(bArr, i10, iVar, bVar2);
                } else if (i11 == 0) {
                    i8 = C4707d.m37549J(i3, bArr, i, i2, iVar, bVar);
                }
                GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) t2;
                C4750n0 n0Var = generatedMessageLite.unknownFields;
                if (n0Var == C4750n0.m38246c()) {
                    n0Var = null;
                }
                C4750n0 n0Var2 = (C4750n0) C4733k0.m38117A(i4, iVar, mo35743s(i12), n0Var, this.f25169o);
                if (n0Var2 != null) {
                    generatedMessageLite.unknownFields = n0Var2;
                }
                return i8;
            case 33:
            case 47:
                if (i11 == 2) {
                    return C4707d.m37576w(bArr, i10, iVar, bVar2);
                }
                if (i11 == 0) {
                    return C4707d.m37540A(i3, bArr, i, i2, iVar, bVar);
                }
                break;
            case 34:
            case 48:
                if (i11 == 2) {
                    return C4707d.m37577x(bArr, i10, iVar, bVar2);
                }
                if (i11 == 0) {
                    return C4707d.m37541B(i3, bArr, i, i2, iVar, bVar);
                }
                break;
            case 49:
                if (i11 == 3) {
                    return C4707d.m37568o(mo35747u(i12), i3, bArr, i, i2, iVar, bVar);
                }
                break;
        }
        return i10;
    }

    /* renamed from: f */
    public final boolean mo35722f(T t) {
        int i;
        int i2;
        T t2 = t;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.f25165k) {
            int i6 = this.f25164j[i5];
            int T = mo35711T(i6);
            int r0 = mo35742r0(i6);
            int i7 = this.f25155a[i6 + 2];
            int i8 = i7 & 1048575;
            int i9 = 1 << (i7 >>> 20);
            if (i8 != i3) {
                if (i8 != 1048575) {
                    i4 = f25154s.getInt(t2, (long) i8);
                }
                i = i4;
                i2 = i8;
            } else {
                i2 = i3;
                i = i4;
            }
            if (m37652I(r0) && !mo35701C(t, i6, i2, i, i9)) {
                return false;
            }
            int q0 = m37667q0(r0);
            if (q0 != 9 && q0 != 17) {
                if (q0 != 27) {
                    if (q0 == 60 || q0 == 68) {
                        if (mo35705H(t2, T, i6) && !m37651D(t2, r0, mo35747u(i6))) {
                            return false;
                        }
                    } else if (q0 != 49) {
                        if (q0 == 50 && !mo35703F(t2, r0, i6)) {
                            return false;
                        }
                    }
                }
                if (!mo35702E(t2, r0, i6)) {
                    return false;
                }
            } else if (mo35701C(t, i6, i2, i, i9) && !m37651D(t2, r0, mo35747u(i6))) {
                return false;
            }
            i5++;
            i3 = i2;
            i4 = i;
        }
        if (!this.f25160f || this.f25170p.mo35961c(t2).mo35994o()) {
            return true;
        }
        return false;
    }

    /* renamed from: f0 */
    public final int mo35723f0(int i) {
        if (i < this.f25157c || i > this.f25158d) {
            return -1;
        }
        return mo35740p0(i, 0);
    }

    /* renamed from: g */
    public int mo35724g(T t) {
        if (this.f25162h) {
            return mo35752x(t);
        }
        return mo35750w(t);
    }

    /* renamed from: g0 */
    public final int mo35725g0(int i, int i2) {
        if (i < this.f25157c || i > this.f25158d) {
            return -1;
        }
        return mo35740p0(i, i2);
    }

    /* renamed from: h */
    public void mo35726h(T t, byte[] bArr, int i, int i2, C4707d.C4709b bVar) throws IOException {
        if (this.f25162h) {
            mo35719d0(t, bArr, i, i2, bVar);
        } else {
            mo35717c0(t, bArr, i, i2, 0, bVar);
        }
    }

    /* renamed from: h0 */
    public final int mo35727h0(int i) {
        return this.f25155a[i + 2];
    }

    /* renamed from: i */
    public void mo35728i(T t, C4729i0 i0Var, C4734l lVar) throws IOException {
        lVar.getClass();
        mo35706L(this.f25169o, this.f25170p, t, i0Var, lVar);
    }

    /* renamed from: i0 */
    public final <E> void mo35729i0(Object obj, long j, C4729i0 i0Var, C4731j0<E> j0Var, C4734l lVar) throws IOException {
        i0Var.mo35649P(this.f25168n.mo36073e(obj, j), j0Var, lVar);
    }

    /* renamed from: j */
    public void mo35730j(T t, Writer writer) throws IOException {
        if (writer.mo35594t() == Writer.FieldOrder.DESCENDING) {
            mo35748u0(t, writer);
        } else if (this.f25162h) {
            mo35746t0(t, writer);
        } else {
            mo35744s0(t, writer);
        }
    }

    /* renamed from: j0 */
    public final <E> void mo35731j0(Object obj, int i, C4729i0 i0Var, C4731j0<E> j0Var, C4734l lVar) throws IOException {
        i0Var.mo35646M(this.f25168n.mo36073e(obj, m37658U(i)), j0Var, lVar);
    }

    /* renamed from: k */
    public final boolean mo35732k(T t, T t2, int i) {
        if (mo35700B(t, i) == mo35700B(t2, i)) {
            return true;
        }
        return false;
    }

    /* renamed from: k0 */
    public final void mo35733k0(Object obj, int i, C4729i0 i0Var) throws IOException {
        if (m37650A(i)) {
            q47.m50250W(obj, m37658U(i), i0Var.mo35642I());
        } else if (this.f25161g) {
            q47.m50250W(obj, m37658U(i), i0Var.mo35699z());
        } else {
            q47.m50250W(obj, m37658U(i), i0Var.mo35686o());
        }
    }

    /* renamed from: l0 */
    public final void mo35734l0(Object obj, int i, C4729i0 i0Var) throws IOException {
        if (m37650A(i)) {
            i0Var.mo35685n(this.f25168n.mo36073e(obj, m37658U(i)));
        } else {
            i0Var.mo35635B(this.f25168n.mo36073e(obj, m37658U(i)));
        }
    }

    /* renamed from: m */
    public final <K, V> int mo35735m(byte[] bArr, int i, int i2, C4779z.C4780a<K, V> aVar, Map<K, V> map, C4707d.C4709b bVar) throws IOException {
        int I = C4707d.m37548I(bArr, i, bVar);
        int i3 = bVar.f25142a;
        if (i3 < 0 || i3 > i2 - I) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        throw null;
    }

    /* renamed from: n0 */
    public final void mo35736n0(T t, int i) {
        int h0 = mo35727h0(i);
        long j = (long) (1048575 & h0);
        if (j != 1048575) {
            q47.m50248U(t, j, (1 << (h0 >>> 20)) | q47.m50230C(t, j));
        }
    }

    /* renamed from: o */
    public final boolean mo35737o(T t, T t2, int i) {
        int r0 = mo35742r0(i);
        long U = m37658U(r0);
        switch (m37667q0(r0)) {
            case 0:
                if (!mo35732k(t, t2, i) || Double.doubleToLongBits(q47.m50228A(t, U)) != Double.doubleToLongBits(q47.m50228A(t2, U))) {
                    return false;
                }
                return true;
            case 1:
                if (!mo35732k(t, t2, i) || Float.floatToIntBits(q47.m50229B(t, U)) != Float.floatToIntBits(q47.m50229B(t2, U))) {
                    return false;
                }
                return true;
            case 2:
                if (!mo35732k(t, t2, i) || q47.m50232E(t, U) != q47.m50232E(t2, U)) {
                    return false;
                }
                return true;
            case 3:
                if (!mo35732k(t, t2, i) || q47.m50232E(t, U) != q47.m50232E(t2, U)) {
                    return false;
                }
                return true;
            case 4:
                if (!mo35732k(t, t2, i) || q47.m50230C(t, U) != q47.m50230C(t2, U)) {
                    return false;
                }
                return true;
            case 5:
                if (!mo35732k(t, t2, i) || q47.m50232E(t, U) != q47.m50232E(t2, U)) {
                    return false;
                }
                return true;
            case 6:
                if (!mo35732k(t, t2, i) || q47.m50230C(t, U) != q47.m50230C(t2, U)) {
                    return false;
                }
                return true;
            case 7:
                if (!mo35732k(t, t2, i) || q47.m50272t(t, U) != q47.m50272t(t2, U)) {
                    return false;
                }
                return true;
            case 8:
                if (!mo35732k(t, t2, i) || !C4733k0.m38127K(q47.m50234G(t, U), q47.m50234G(t2, U))) {
                    return false;
                }
                return true;
            case 9:
                if (!mo35732k(t, t2, i) || !C4733k0.m38127K(q47.m50234G(t, U), q47.m50234G(t2, U))) {
                    return false;
                }
                return true;
            case 10:
                if (!mo35732k(t, t2, i) || !C4733k0.m38127K(q47.m50234G(t, U), q47.m50234G(t2, U))) {
                    return false;
                }
                return true;
            case 11:
                if (!mo35732k(t, t2, i) || q47.m50230C(t, U) != q47.m50230C(t2, U)) {
                    return false;
                }
                return true;
            case 12:
                if (!mo35732k(t, t2, i) || q47.m50230C(t, U) != q47.m50230C(t2, U)) {
                    return false;
                }
                return true;
            case 13:
                if (!mo35732k(t, t2, i) || q47.m50230C(t, U) != q47.m50230C(t2, U)) {
                    return false;
                }
                return true;
            case 14:
                if (!mo35732k(t, t2, i) || q47.m50232E(t, U) != q47.m50232E(t2, U)) {
                    return false;
                }
                return true;
            case 15:
                if (!mo35732k(t, t2, i) || q47.m50230C(t, U) != q47.m50230C(t2, U)) {
                    return false;
                }
                return true;
            case 16:
                if (!mo35732k(t, t2, i) || q47.m50232E(t, U) != q47.m50232E(t2, U)) {
                    return false;
                }
                return true;
            case 17:
                if (!mo35732k(t, t2, i) || !C4733k0.m38127K(q47.m50234G(t, U), q47.m50234G(t2, U))) {
                    return false;
                }
                return true;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                return C4733k0.m38127K(q47.m50234G(t, U), q47.m50234G(t2, U));
            case 50:
                return C4733k0.m38127K(q47.m50234G(t, U), q47.m50234G(t2, U));
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                if (!mo35704G(t, t2, i) || !C4733k0.m38127K(q47.m50234G(t, U), q47.m50234G(t2, U))) {
                    return false;
                }
                return true;
            default:
                return true;
        }
    }

    /* renamed from: o0 */
    public final void mo35738o0(T t, int i, int i2) {
        q47.m50248U(t, (long) (mo35727h0(i2) & 1048575), i);
    }

    /* renamed from: p */
    public final <UT, UB> UB mo35739p(Object obj, int i, UB ub, C4747m0<UT, UB> m0Var) {
        C4758t.C4763e s;
        int T = mo35711T(i);
        Object G = q47.m50234G(obj, m37658U(mo35742r0(i)));
        if (G == null || (s = mo35743s(i)) == null) {
            return ub;
        }
        return mo35741q(i, T, this.f25171q.mo35610c(G), s, ub, m0Var);
    }

    /* renamed from: p0 */
    public final int mo35740p0(int i, int i2) {
        int length = (this.f25155a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int T = mo35711T(i4);
            if (i == T) {
                return i4;
            }
            if (i < T) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* renamed from: q */
    public final <K, V, UT, UB> UB mo35741q(int i, int i2, Map<K, V> map, C4758t.C4763e eVar, UB ub, C4747m0<UT, UB> m0Var) {
        this.f25171q.mo35609b(mo35745t(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            if (!eVar.isInRange(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = m0Var.mo28862n();
                }
                ByteString.C4674g newCodedBuilder = ByteString.newCodedBuilder(C4779z.m38380b((C4779z.C4780a) null, next.getKey(), next.getValue()));
                try {
                    C4779z.m38381d(newCodedBuilder.mo35375b(), (C4779z.C4780a) null, next.getKey(), next.getValue());
                    m0Var.mo28854d(ub, i2, newCodedBuilder.mo35374a());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    /* renamed from: r0 */
    public final int mo35742r0(int i) {
        return this.f25155a[i + 1];
    }

    /* renamed from: s */
    public final C4758t.C4763e mo35743s(int i) {
        return (C4758t.C4763e) this.f25156b[((i / 3) * 2) + 1];
    }

    /* JADX WARNING: Removed duplicated region for block: B:168:0x048f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0030  */
    /* renamed from: s0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo35744s0(T r18, com.google.crypto.tink.shaded.protobuf.Writer r19) throws java.io.IOException {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r0.f25160f
            if (r3 == 0) goto L_0x0021
            com.google.crypto.tink.shaded.protobuf.m<?> r3 = r0.f25170p
            com.google.crypto.tink.shaded.protobuf.p r3 = r3.mo35961c(r1)
            boolean r5 = r3.mo35992m()
            if (r5 != 0) goto L_0x0021
            java.util.Iterator r3 = r3.mo35995r()
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0023
        L_0x0021:
            r3 = 0
            r5 = 0
        L_0x0023:
            int[] r6 = r0.f25155a
            int r6 = r6.length
            sun.misc.Unsafe r7 = f25154s
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r11 = r8
            r10 = 0
            r12 = 0
        L_0x002e:
            if (r10 >= r6) goto L_0x048d
            int r13 = r0.mo35742r0(r10)
            int r14 = r0.mo35711T(r10)
            int r15 = m37667q0(r13)
            r4 = 17
            if (r15 > r4) goto L_0x0056
            int[] r4 = r0.f25155a
            int r16 = r10 + 2
            r4 = r4[r16]
            r9 = r4 & r8
            if (r9 == r11) goto L_0x0050
            long r11 = (long) r9
            int r12 = r7.getInt(r1, r11)
            r11 = r9
        L_0x0050:
            int r4 = r4 >>> 20
            r9 = 1
            int r4 = r9 << r4
            goto L_0x0057
        L_0x0056:
            r4 = 0
        L_0x0057:
            if (r5 == 0) goto L_0x0075
            com.google.crypto.tink.shaded.protobuf.m<?> r9 = r0.f25170p
            int r9 = r9.mo35959a(r5)
            if (r9 > r14) goto L_0x0075
            com.google.crypto.tink.shaded.protobuf.m<?> r9 = r0.f25170p
            r9.mo35968j(r2, r5)
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0073
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0057
        L_0x0073:
            r5 = 0
            goto L_0x0057
        L_0x0075:
            long r8 = m37658U(r13)
            switch(r15) {
                case 0: goto L_0x047b;
                case 1: goto L_0x046f;
                case 2: goto L_0x0463;
                case 3: goto L_0x0457;
                case 4: goto L_0x044b;
                case 5: goto L_0x043f;
                case 6: goto L_0x0433;
                case 7: goto L_0x0427;
                case 8: goto L_0x041b;
                case 9: goto L_0x040a;
                case 10: goto L_0x03fb;
                case 11: goto L_0x03ee;
                case 12: goto L_0x03e1;
                case 13: goto L_0x03d4;
                case 14: goto L_0x03c7;
                case 15: goto L_0x03ba;
                case 16: goto L_0x03ad;
                case 17: goto L_0x039c;
                case 18: goto L_0x038c;
                case 19: goto L_0x037c;
                case 20: goto L_0x036c;
                case 21: goto L_0x035c;
                case 22: goto L_0x034c;
                case 23: goto L_0x033c;
                case 24: goto L_0x032c;
                case 25: goto L_0x031c;
                case 26: goto L_0x030d;
                case 27: goto L_0x02fa;
                case 28: goto L_0x02eb;
                case 29: goto L_0x02db;
                case 30: goto L_0x02cb;
                case 31: goto L_0x02bb;
                case 32: goto L_0x02ab;
                case 33: goto L_0x029b;
                case 34: goto L_0x028b;
                case 35: goto L_0x027b;
                case 36: goto L_0x026b;
                case 37: goto L_0x025b;
                case 38: goto L_0x024b;
                case 39: goto L_0x023b;
                case 40: goto L_0x022b;
                case 41: goto L_0x021b;
                case 42: goto L_0x020b;
                case 43: goto L_0x01fb;
                case 44: goto L_0x01eb;
                case 45: goto L_0x01db;
                case 46: goto L_0x01cb;
                case 47: goto L_0x01bb;
                case 48: goto L_0x01ab;
                case 49: goto L_0x0198;
                case 50: goto L_0x018f;
                case 51: goto L_0x0180;
                case 52: goto L_0x0171;
                case 53: goto L_0x0162;
                case 54: goto L_0x0153;
                case 55: goto L_0x0144;
                case 56: goto L_0x0135;
                case 57: goto L_0x0126;
                case 58: goto L_0x0117;
                case 59: goto L_0x0108;
                case 60: goto L_0x00f5;
                case 61: goto L_0x00e5;
                case 62: goto L_0x00d7;
                case 63: goto L_0x00c9;
                case 64: goto L_0x00bb;
                case 65: goto L_0x00ad;
                case 66: goto L_0x009f;
                case 67: goto L_0x0091;
                case 68: goto L_0x007f;
                default: goto L_0x007c;
            }
        L_0x007c:
            r13 = 0
            goto L_0x0486
        L_0x007f:
            boolean r4 = r0.mo35705H(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.crypto.tink.shaded.protobuf.j0 r8 = r0.mo35747u(r10)
            r2.mo35570K(r14, r4, r8)
            goto L_0x007c
        L_0x0091:
            boolean r4 = r0.mo35705H(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            long r8 = m37663Z(r1, r8)
            r2.mo35587m(r14, r8)
            goto L_0x007c
        L_0x009f:
            boolean r4 = r0.mo35705H(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            int r4 = m37662Y(r1, r8)
            r2.mo35567H(r14, r4)
            goto L_0x007c
        L_0x00ad:
            boolean r4 = r0.mo35705H(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            long r8 = m37663Z(r1, r8)
            r2.mo35583i(r14, r8)
            goto L_0x007c
        L_0x00bb:
            boolean r4 = r0.mo35705H(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            int r4 = m37662Y(r1, r8)
            r2.mo35597w(r14, r4)
            goto L_0x007c
        L_0x00c9:
            boolean r4 = r0.mo35705H(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            int r4 = m37662Y(r1, r8)
            r2.mo35564E(r14, r4)
            goto L_0x007c
        L_0x00d7:
            boolean r4 = r0.mo35705H(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            int r4 = m37662Y(r1, r8)
            r2.mo35589o(r14, r4)
            goto L_0x007c
        L_0x00e5:
            boolean r4 = r0.mo35705H(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.crypto.tink.shaded.protobuf.ByteString r4 = (com.google.crypto.tink.shaded.protobuf.ByteString) r4
            r2.mo35572M(r14, r4)
            goto L_0x007c
        L_0x00f5:
            boolean r4 = r0.mo35705H(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.crypto.tink.shaded.protobuf.j0 r8 = r0.mo35747u(r10)
            r2.mo35573N(r14, r4, r8)
            goto L_0x007c
        L_0x0108:
            boolean r4 = r0.mo35705H(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            java.lang.Object r4 = r7.getObject(r1, r8)
            r0.mo35751w0(r14, r4, r2)
            goto L_0x007c
        L_0x0117:
            boolean r4 = r0.mo35705H(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            boolean r4 = m37659V(r1, r8)
            r2.mo35596v(r14, r4)
            goto L_0x007c
        L_0x0126:
            boolean r4 = r0.mo35705H(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            int r4 = m37662Y(r1, r8)
            r2.mo35577c(r14, r4)
            goto L_0x007c
        L_0x0135:
            boolean r4 = r0.mo35705H(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            long r8 = m37663Z(r1, r8)
            r2.mo35593s(r14, r8)
            goto L_0x007c
        L_0x0144:
            boolean r4 = r0.mo35705H(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            int r4 = m37662Y(r1, r8)
            r2.mo35582h(r14, r4)
            goto L_0x007c
        L_0x0153:
            boolean r4 = r0.mo35705H(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            long r8 = m37663Z(r1, r8)
            r2.mo35580f(r14, r8)
            goto L_0x007c
        L_0x0162:
            boolean r4 = r0.mo35705H(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            long r8 = m37663Z(r1, r8)
            r2.mo35595u(r14, r8)
            goto L_0x007c
        L_0x0171:
            boolean r4 = r0.mo35705H(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            float r4 = m37661X(r1, r8)
            r2.mo35561B(r14, r4)
            goto L_0x007c
        L_0x0180:
            boolean r4 = r0.mo35705H(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            double r8 = m37660W(r1, r8)
            r2.mo35590p(r14, r8)
            goto L_0x007c
        L_0x018f:
            java.lang.Object r4 = r7.getObject(r1, r8)
            r0.mo35749v0(r2, r14, r4, r10)
            goto L_0x007c
        L_0x0198:
            int r4 = r0.mo35711T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.j0 r9 = r0.mo35747u(r10)
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38137U(r4, r8, r2, r9)
            goto L_0x007c
        L_0x01ab:
            int r4 = r0.mo35711T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            r13 = 1
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38146b0(r4, r8, r2, r13)
            goto L_0x007c
        L_0x01bb:
            r13 = 1
            int r4 = r0.mo35711T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38144a0(r4, r8, r2, r13)
            goto L_0x007c
        L_0x01cb:
            r13 = 1
            int r4 = r0.mo35711T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38142Z(r4, r8, r2, r13)
            goto L_0x007c
        L_0x01db:
            r13 = 1
            int r4 = r0.mo35711T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38141Y(r4, r8, r2, r13)
            goto L_0x007c
        L_0x01eb:
            r13 = 1
            int r4 = r0.mo35711T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38133Q(r4, r8, r2, r13)
            goto L_0x007c
        L_0x01fb:
            r13 = 1
            int r4 = r0.mo35711T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38150d0(r4, r8, r2, r13)
            goto L_0x007c
        L_0x020b:
            r13 = 1
            int r4 = r0.mo35711T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38130N(r4, r8, r2, r13)
            goto L_0x007c
        L_0x021b:
            r13 = 1
            int r4 = r0.mo35711T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38134R(r4, r8, r2, r13)
            goto L_0x007c
        L_0x022b:
            r13 = 1
            int r4 = r0.mo35711T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38135S(r4, r8, r2, r13)
            goto L_0x007c
        L_0x023b:
            r13 = 1
            int r4 = r0.mo35711T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38138V(r4, r8, r2, r13)
            goto L_0x007c
        L_0x024b:
            r13 = 1
            int r4 = r0.mo35711T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38152e0(r4, r8, r2, r13)
            goto L_0x007c
        L_0x025b:
            r13 = 1
            int r4 = r0.mo35711T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38139W(r4, r8, r2, r13)
            goto L_0x007c
        L_0x026b:
            r13 = 1
            int r4 = r0.mo35711T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38136T(r4, r8, r2, r13)
            goto L_0x007c
        L_0x027b:
            r13 = 1
            int r4 = r0.mo35711T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38132P(r4, r8, r2, r13)
            goto L_0x007c
        L_0x028b:
            int r4 = r0.mo35711T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            r13 = 0
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38146b0(r4, r8, r2, r13)
            goto L_0x0486
        L_0x029b:
            r13 = 0
            int r4 = r0.mo35711T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38144a0(r4, r8, r2, r13)
            goto L_0x0486
        L_0x02ab:
            r13 = 0
            int r4 = r0.mo35711T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38142Z(r4, r8, r2, r13)
            goto L_0x0486
        L_0x02bb:
            r13 = 0
            int r4 = r0.mo35711T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38141Y(r4, r8, r2, r13)
            goto L_0x0486
        L_0x02cb:
            r13 = 0
            int r4 = r0.mo35711T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38133Q(r4, r8, r2, r13)
            goto L_0x0486
        L_0x02db:
            r13 = 0
            int r4 = r0.mo35711T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38150d0(r4, r8, r2, r13)
            goto L_0x0486
        L_0x02eb:
            int r4 = r0.mo35711T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38131O(r4, r8, r2)
            goto L_0x007c
        L_0x02fa:
            int r4 = r0.mo35711T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.j0 r9 = r0.mo35747u(r10)
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38140X(r4, r8, r2, r9)
            goto L_0x007c
        L_0x030d:
            int r4 = r0.mo35711T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38148c0(r4, r8, r2)
            goto L_0x007c
        L_0x031c:
            int r4 = r0.mo35711T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            r13 = 0
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38130N(r4, r8, r2, r13)
            goto L_0x0486
        L_0x032c:
            r13 = 0
            int r4 = r0.mo35711T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38134R(r4, r8, r2, r13)
            goto L_0x0486
        L_0x033c:
            r13 = 0
            int r4 = r0.mo35711T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38135S(r4, r8, r2, r13)
            goto L_0x0486
        L_0x034c:
            r13 = 0
            int r4 = r0.mo35711T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38138V(r4, r8, r2, r13)
            goto L_0x0486
        L_0x035c:
            r13 = 0
            int r4 = r0.mo35711T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38152e0(r4, r8, r2, r13)
            goto L_0x0486
        L_0x036c:
            r13 = 0
            int r4 = r0.mo35711T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38139W(r4, r8, r2, r13)
            goto L_0x0486
        L_0x037c:
            r13 = 0
            int r4 = r0.mo35711T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38136T(r4, r8, r2, r13)
            goto L_0x0486
        L_0x038c:
            r13 = 0
            int r4 = r0.mo35711T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38132P(r4, r8, r2, r13)
            goto L_0x0486
        L_0x039c:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.crypto.tink.shaded.protobuf.j0 r8 = r0.mo35747u(r10)
            r2.mo35570K(r14, r4, r8)
            goto L_0x0486
        L_0x03ad:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            long r8 = r7.getLong(r1, r8)
            r2.mo35587m(r14, r8)
            goto L_0x0486
        L_0x03ba:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            int r4 = r7.getInt(r1, r8)
            r2.mo35567H(r14, r4)
            goto L_0x0486
        L_0x03c7:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            long r8 = r7.getLong(r1, r8)
            r2.mo35583i(r14, r8)
            goto L_0x0486
        L_0x03d4:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            int r4 = r7.getInt(r1, r8)
            r2.mo35597w(r14, r4)
            goto L_0x0486
        L_0x03e1:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            int r4 = r7.getInt(r1, r8)
            r2.mo35564E(r14, r4)
            goto L_0x0486
        L_0x03ee:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            int r4 = r7.getInt(r1, r8)
            r2.mo35589o(r14, r4)
            goto L_0x0486
        L_0x03fb:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.crypto.tink.shaded.protobuf.ByteString r4 = (com.google.crypto.tink.shaded.protobuf.ByteString) r4
            r2.mo35572M(r14, r4)
            goto L_0x0486
        L_0x040a:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.crypto.tink.shaded.protobuf.j0 r8 = r0.mo35747u(r10)
            r2.mo35573N(r14, r4, r8)
            goto L_0x0486
        L_0x041b:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            java.lang.Object r4 = r7.getObject(r1, r8)
            r0.mo35751w0(r14, r4, r2)
            goto L_0x0486
        L_0x0427:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            boolean r4 = m37664l(r1, r8)
            r2.mo35596v(r14, r4)
            goto L_0x0486
        L_0x0433:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            int r4 = r7.getInt(r1, r8)
            r2.mo35577c(r14, r4)
            goto L_0x0486
        L_0x043f:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            long r8 = r7.getLong(r1, r8)
            r2.mo35593s(r14, r8)
            goto L_0x0486
        L_0x044b:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            int r4 = r7.getInt(r1, r8)
            r2.mo35582h(r14, r4)
            goto L_0x0486
        L_0x0457:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            long r8 = r7.getLong(r1, r8)
            r2.mo35580f(r14, r8)
            goto L_0x0486
        L_0x0463:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            long r8 = r7.getLong(r1, r8)
            r2.mo35595u(r14, r8)
            goto L_0x0486
        L_0x046f:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            float r4 = m37668r(r1, r8)
            r2.mo35561B(r14, r4)
            goto L_0x0486
        L_0x047b:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            double r8 = m37666n(r1, r8)
            r2.mo35590p(r14, r8)
        L_0x0486:
            int r10 = r10 + 3
            r8 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x002e
        L_0x048d:
            if (r5 == 0) goto L_0x04a4
            com.google.crypto.tink.shaded.protobuf.m<?> r4 = r0.f25170p
            r4.mo35968j(r2, r5)
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x04a2
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            r5 = r4
            goto L_0x048d
        L_0x04a2:
            r5 = 0
            goto L_0x048d
        L_0x04a4:
            com.google.crypto.tink.shaded.protobuf.m0<?, ?> r3 = r0.f25169o
            r0.mo35753x0(r3, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C4714e0.mo35744s0(java.lang.Object, com.google.crypto.tink.shaded.protobuf.Writer):void");
    }

    /* renamed from: t */
    public final Object mo35745t(int i) {
        return this.f25156b[(i / 3) * 2];
    }

    /* JADX WARNING: Removed duplicated region for block: B:161:0x0588  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: t0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo35746t0(T r13, com.google.crypto.tink.shaded.protobuf.Writer r14) throws java.io.IOException {
        /*
            r12 = this;
            boolean r0 = r12.f25160f
            r1 = 0
            if (r0 == 0) goto L_0x001c
            com.google.crypto.tink.shaded.protobuf.m<?> r0 = r12.f25170p
            com.google.crypto.tink.shaded.protobuf.p r0 = r0.mo35961c(r13)
            boolean r2 = r0.mo35992m()
            if (r2 != 0) goto L_0x001c
            java.util.Iterator r0 = r0.mo35995r()
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x001e
        L_0x001c:
            r0 = r1
            r2 = r0
        L_0x001e:
            int[] r3 = r12.f25155a
            int r3 = r3.length
            r4 = 0
            r5 = r4
        L_0x0023:
            if (r5 >= r3) goto L_0x0586
            int r6 = r12.mo35742r0(r5)
            int r7 = r12.mo35711T(r5)
        L_0x002d:
            if (r2 == 0) goto L_0x004b
            com.google.crypto.tink.shaded.protobuf.m<?> r8 = r12.f25170p
            int r8 = r8.mo35959a(r2)
            if (r8 > r7) goto L_0x004b
            com.google.crypto.tink.shaded.protobuf.m<?> r8 = r12.f25170p
            r8.mo35968j(r14, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0049
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x002d
        L_0x0049:
            r2 = r1
            goto L_0x002d
        L_0x004b:
            int r8 = m37667q0(r6)
            r9 = 1
            switch(r8) {
                case 0: goto L_0x0571;
                case 1: goto L_0x055f;
                case 2: goto L_0x054d;
                case 3: goto L_0x053b;
                case 4: goto L_0x0529;
                case 5: goto L_0x0517;
                case 6: goto L_0x0505;
                case 7: goto L_0x04f2;
                case 8: goto L_0x04df;
                case 9: goto L_0x04c8;
                case 10: goto L_0x04b3;
                case 11: goto L_0x04a0;
                case 12: goto L_0x048d;
                case 13: goto L_0x047a;
                case 14: goto L_0x0467;
                case 15: goto L_0x0454;
                case 16: goto L_0x0441;
                case 17: goto L_0x042a;
                case 18: goto L_0x0417;
                case 19: goto L_0x0404;
                case 20: goto L_0x03f1;
                case 21: goto L_0x03de;
                case 22: goto L_0x03cb;
                case 23: goto L_0x03b8;
                case 24: goto L_0x03a5;
                case 25: goto L_0x0392;
                case 26: goto L_0x037f;
                case 27: goto L_0x0368;
                case 28: goto L_0x0355;
                case 29: goto L_0x0342;
                case 30: goto L_0x032f;
                case 31: goto L_0x031c;
                case 32: goto L_0x0309;
                case 33: goto L_0x02f6;
                case 34: goto L_0x02e3;
                case 35: goto L_0x02d0;
                case 36: goto L_0x02bd;
                case 37: goto L_0x02aa;
                case 38: goto L_0x0297;
                case 39: goto L_0x0284;
                case 40: goto L_0x0271;
                case 41: goto L_0x025e;
                case 42: goto L_0x024b;
                case 43: goto L_0x0238;
                case 44: goto L_0x0225;
                case 45: goto L_0x0212;
                case 46: goto L_0x01ff;
                case 47: goto L_0x01ec;
                case 48: goto L_0x01d9;
                case 49: goto L_0x01c2;
                case 50: goto L_0x01b5;
                case 51: goto L_0x01a2;
                case 52: goto L_0x018f;
                case 53: goto L_0x017c;
                case 54: goto L_0x0169;
                case 55: goto L_0x0156;
                case 56: goto L_0x0143;
                case 57: goto L_0x0130;
                case 58: goto L_0x011d;
                case 59: goto L_0x010a;
                case 60: goto L_0x00f3;
                case 61: goto L_0x00de;
                case 62: goto L_0x00cb;
                case 63: goto L_0x00b8;
                case 64: goto L_0x00a5;
                case 65: goto L_0x0092;
                case 66: goto L_0x007f;
                case 67: goto L_0x006c;
                case 68: goto L_0x0055;
                default: goto L_0x0053;
            }
        L_0x0053:
            goto L_0x0582
        L_0x0055:
            boolean r8 = r12.mo35705H(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m37658U(r6)
            java.lang.Object r6 = p000.q47.m50234G(r13, r8)
            com.google.crypto.tink.shaded.protobuf.j0 r8 = r12.mo35747u(r5)
            r14.mo35570K(r7, r6, r8)
            goto L_0x0582
        L_0x006c:
            boolean r8 = r12.mo35705H(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m37658U(r6)
            long r8 = m37663Z(r13, r8)
            r14.mo35587m(r7, r8)
            goto L_0x0582
        L_0x007f:
            boolean r8 = r12.mo35705H(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m37658U(r6)
            int r6 = m37662Y(r13, r8)
            r14.mo35567H(r7, r6)
            goto L_0x0582
        L_0x0092:
            boolean r8 = r12.mo35705H(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m37658U(r6)
            long r8 = m37663Z(r13, r8)
            r14.mo35583i(r7, r8)
            goto L_0x0582
        L_0x00a5:
            boolean r8 = r12.mo35705H(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m37658U(r6)
            int r6 = m37662Y(r13, r8)
            r14.mo35597w(r7, r6)
            goto L_0x0582
        L_0x00b8:
            boolean r8 = r12.mo35705H(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m37658U(r6)
            int r6 = m37662Y(r13, r8)
            r14.mo35564E(r7, r6)
            goto L_0x0582
        L_0x00cb:
            boolean r8 = r12.mo35705H(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m37658U(r6)
            int r6 = m37662Y(r13, r8)
            r14.mo35589o(r7, r6)
            goto L_0x0582
        L_0x00de:
            boolean r8 = r12.mo35705H(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m37658U(r6)
            java.lang.Object r6 = p000.q47.m50234G(r13, r8)
            com.google.crypto.tink.shaded.protobuf.ByteString r6 = (com.google.crypto.tink.shaded.protobuf.ByteString) r6
            r14.mo35572M(r7, r6)
            goto L_0x0582
        L_0x00f3:
            boolean r8 = r12.mo35705H(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m37658U(r6)
            java.lang.Object r6 = p000.q47.m50234G(r13, r8)
            com.google.crypto.tink.shaded.protobuf.j0 r8 = r12.mo35747u(r5)
            r14.mo35573N(r7, r6, r8)
            goto L_0x0582
        L_0x010a:
            boolean r8 = r12.mo35705H(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m37658U(r6)
            java.lang.Object r6 = p000.q47.m50234G(r13, r8)
            r12.mo35751w0(r7, r6, r14)
            goto L_0x0582
        L_0x011d:
            boolean r8 = r12.mo35705H(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m37658U(r6)
            boolean r6 = m37659V(r13, r8)
            r14.mo35596v(r7, r6)
            goto L_0x0582
        L_0x0130:
            boolean r8 = r12.mo35705H(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m37658U(r6)
            int r6 = m37662Y(r13, r8)
            r14.mo35577c(r7, r6)
            goto L_0x0582
        L_0x0143:
            boolean r8 = r12.mo35705H(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m37658U(r6)
            long r8 = m37663Z(r13, r8)
            r14.mo35593s(r7, r8)
            goto L_0x0582
        L_0x0156:
            boolean r8 = r12.mo35705H(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m37658U(r6)
            int r6 = m37662Y(r13, r8)
            r14.mo35582h(r7, r6)
            goto L_0x0582
        L_0x0169:
            boolean r8 = r12.mo35705H(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m37658U(r6)
            long r8 = m37663Z(r13, r8)
            r14.mo35580f(r7, r8)
            goto L_0x0582
        L_0x017c:
            boolean r8 = r12.mo35705H(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m37658U(r6)
            long r8 = m37663Z(r13, r8)
            r14.mo35595u(r7, r8)
            goto L_0x0582
        L_0x018f:
            boolean r8 = r12.mo35705H(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m37658U(r6)
            float r6 = m37661X(r13, r8)
            r14.mo35561B(r7, r6)
            goto L_0x0582
        L_0x01a2:
            boolean r8 = r12.mo35705H(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m37658U(r6)
            double r8 = m37660W(r13, r8)
            r14.mo35590p(r7, r8)
            goto L_0x0582
        L_0x01b5:
            long r8 = m37658U(r6)
            java.lang.Object r6 = p000.q47.m50234G(r13, r8)
            r12.mo35749v0(r14, r7, r6, r5)
            goto L_0x0582
        L_0x01c2:
            int r7 = r12.mo35711T(r5)
            long r8 = m37658U(r6)
            java.lang.Object r6 = p000.q47.m50234G(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.j0 r8 = r12.mo35747u(r5)
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38137U(r7, r6, r14, r8)
            goto L_0x0582
        L_0x01d9:
            int r7 = r12.mo35711T(r5)
            long r10 = m37658U(r6)
            java.lang.Object r6 = p000.q47.m50234G(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38146b0(r7, r6, r14, r9)
            goto L_0x0582
        L_0x01ec:
            int r7 = r12.mo35711T(r5)
            long r10 = m37658U(r6)
            java.lang.Object r6 = p000.q47.m50234G(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38144a0(r7, r6, r14, r9)
            goto L_0x0582
        L_0x01ff:
            int r7 = r12.mo35711T(r5)
            long r10 = m37658U(r6)
            java.lang.Object r6 = p000.q47.m50234G(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38142Z(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0212:
            int r7 = r12.mo35711T(r5)
            long r10 = m37658U(r6)
            java.lang.Object r6 = p000.q47.m50234G(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38141Y(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0225:
            int r7 = r12.mo35711T(r5)
            long r10 = m37658U(r6)
            java.lang.Object r6 = p000.q47.m50234G(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38133Q(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0238:
            int r7 = r12.mo35711T(r5)
            long r10 = m37658U(r6)
            java.lang.Object r6 = p000.q47.m50234G(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38150d0(r7, r6, r14, r9)
            goto L_0x0582
        L_0x024b:
            int r7 = r12.mo35711T(r5)
            long r10 = m37658U(r6)
            java.lang.Object r6 = p000.q47.m50234G(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38130N(r7, r6, r14, r9)
            goto L_0x0582
        L_0x025e:
            int r7 = r12.mo35711T(r5)
            long r10 = m37658U(r6)
            java.lang.Object r6 = p000.q47.m50234G(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38134R(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0271:
            int r7 = r12.mo35711T(r5)
            long r10 = m37658U(r6)
            java.lang.Object r6 = p000.q47.m50234G(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38135S(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0284:
            int r7 = r12.mo35711T(r5)
            long r10 = m37658U(r6)
            java.lang.Object r6 = p000.q47.m50234G(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38138V(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0297:
            int r7 = r12.mo35711T(r5)
            long r10 = m37658U(r6)
            java.lang.Object r6 = p000.q47.m50234G(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38152e0(r7, r6, r14, r9)
            goto L_0x0582
        L_0x02aa:
            int r7 = r12.mo35711T(r5)
            long r10 = m37658U(r6)
            java.lang.Object r6 = p000.q47.m50234G(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38139W(r7, r6, r14, r9)
            goto L_0x0582
        L_0x02bd:
            int r7 = r12.mo35711T(r5)
            long r10 = m37658U(r6)
            java.lang.Object r6 = p000.q47.m50234G(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38136T(r7, r6, r14, r9)
            goto L_0x0582
        L_0x02d0:
            int r7 = r12.mo35711T(r5)
            long r10 = m37658U(r6)
            java.lang.Object r6 = p000.q47.m50234G(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38132P(r7, r6, r14, r9)
            goto L_0x0582
        L_0x02e3:
            int r7 = r12.mo35711T(r5)
            long r8 = m37658U(r6)
            java.lang.Object r6 = p000.q47.m50234G(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38146b0(r7, r6, r14, r4)
            goto L_0x0582
        L_0x02f6:
            int r7 = r12.mo35711T(r5)
            long r8 = m37658U(r6)
            java.lang.Object r6 = p000.q47.m50234G(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38144a0(r7, r6, r14, r4)
            goto L_0x0582
        L_0x0309:
            int r7 = r12.mo35711T(r5)
            long r8 = m37658U(r6)
            java.lang.Object r6 = p000.q47.m50234G(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38142Z(r7, r6, r14, r4)
            goto L_0x0582
        L_0x031c:
            int r7 = r12.mo35711T(r5)
            long r8 = m37658U(r6)
            java.lang.Object r6 = p000.q47.m50234G(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38141Y(r7, r6, r14, r4)
            goto L_0x0582
        L_0x032f:
            int r7 = r12.mo35711T(r5)
            long r8 = m37658U(r6)
            java.lang.Object r6 = p000.q47.m50234G(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38133Q(r7, r6, r14, r4)
            goto L_0x0582
        L_0x0342:
            int r7 = r12.mo35711T(r5)
            long r8 = m37658U(r6)
            java.lang.Object r6 = p000.q47.m50234G(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38150d0(r7, r6, r14, r4)
            goto L_0x0582
        L_0x0355:
            int r7 = r12.mo35711T(r5)
            long r8 = m37658U(r6)
            java.lang.Object r6 = p000.q47.m50234G(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38131O(r7, r6, r14)
            goto L_0x0582
        L_0x0368:
            int r7 = r12.mo35711T(r5)
            long r8 = m37658U(r6)
            java.lang.Object r6 = p000.q47.m50234G(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.j0 r8 = r12.mo35747u(r5)
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38140X(r7, r6, r14, r8)
            goto L_0x0582
        L_0x037f:
            int r7 = r12.mo35711T(r5)
            long r8 = m37658U(r6)
            java.lang.Object r6 = p000.q47.m50234G(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38148c0(r7, r6, r14)
            goto L_0x0582
        L_0x0392:
            int r7 = r12.mo35711T(r5)
            long r8 = m37658U(r6)
            java.lang.Object r6 = p000.q47.m50234G(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38130N(r7, r6, r14, r4)
            goto L_0x0582
        L_0x03a5:
            int r7 = r12.mo35711T(r5)
            long r8 = m37658U(r6)
            java.lang.Object r6 = p000.q47.m50234G(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38134R(r7, r6, r14, r4)
            goto L_0x0582
        L_0x03b8:
            int r7 = r12.mo35711T(r5)
            long r8 = m37658U(r6)
            java.lang.Object r6 = p000.q47.m50234G(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38135S(r7, r6, r14, r4)
            goto L_0x0582
        L_0x03cb:
            int r7 = r12.mo35711T(r5)
            long r8 = m37658U(r6)
            java.lang.Object r6 = p000.q47.m50234G(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38138V(r7, r6, r14, r4)
            goto L_0x0582
        L_0x03de:
            int r7 = r12.mo35711T(r5)
            long r8 = m37658U(r6)
            java.lang.Object r6 = p000.q47.m50234G(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38152e0(r7, r6, r14, r4)
            goto L_0x0582
        L_0x03f1:
            int r7 = r12.mo35711T(r5)
            long r8 = m37658U(r6)
            java.lang.Object r6 = p000.q47.m50234G(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38139W(r7, r6, r14, r4)
            goto L_0x0582
        L_0x0404:
            int r7 = r12.mo35711T(r5)
            long r8 = m37658U(r6)
            java.lang.Object r6 = p000.q47.m50234G(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38136T(r7, r6, r14, r4)
            goto L_0x0582
        L_0x0417:
            int r7 = r12.mo35711T(r5)
            long r8 = m37658U(r6)
            java.lang.Object r6 = p000.q47.m50234G(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38132P(r7, r6, r14, r4)
            goto L_0x0582
        L_0x042a:
            boolean r8 = r12.mo35700B(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m37658U(r6)
            java.lang.Object r6 = p000.q47.m50234G(r13, r8)
            com.google.crypto.tink.shaded.protobuf.j0 r8 = r12.mo35747u(r5)
            r14.mo35570K(r7, r6, r8)
            goto L_0x0582
        L_0x0441:
            boolean r8 = r12.mo35700B(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m37658U(r6)
            long r8 = m37654K(r13, r8)
            r14.mo35587m(r7, r8)
            goto L_0x0582
        L_0x0454:
            boolean r8 = r12.mo35700B(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m37658U(r6)
            int r6 = m37670z(r13, r8)
            r14.mo35567H(r7, r6)
            goto L_0x0582
        L_0x0467:
            boolean r8 = r12.mo35700B(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m37658U(r6)
            long r8 = m37654K(r13, r8)
            r14.mo35583i(r7, r8)
            goto L_0x0582
        L_0x047a:
            boolean r8 = r12.mo35700B(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m37658U(r6)
            int r6 = m37670z(r13, r8)
            r14.mo35597w(r7, r6)
            goto L_0x0582
        L_0x048d:
            boolean r8 = r12.mo35700B(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m37658U(r6)
            int r6 = m37670z(r13, r8)
            r14.mo35564E(r7, r6)
            goto L_0x0582
        L_0x04a0:
            boolean r8 = r12.mo35700B(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m37658U(r6)
            int r6 = m37670z(r13, r8)
            r14.mo35589o(r7, r6)
            goto L_0x0582
        L_0x04b3:
            boolean r8 = r12.mo35700B(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m37658U(r6)
            java.lang.Object r6 = p000.q47.m50234G(r13, r8)
            com.google.crypto.tink.shaded.protobuf.ByteString r6 = (com.google.crypto.tink.shaded.protobuf.ByteString) r6
            r14.mo35572M(r7, r6)
            goto L_0x0582
        L_0x04c8:
            boolean r8 = r12.mo35700B(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m37658U(r6)
            java.lang.Object r6 = p000.q47.m50234G(r13, r8)
            com.google.crypto.tink.shaded.protobuf.j0 r8 = r12.mo35747u(r5)
            r14.mo35573N(r7, r6, r8)
            goto L_0x0582
        L_0x04df:
            boolean r8 = r12.mo35700B(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m37658U(r6)
            java.lang.Object r6 = p000.q47.m50234G(r13, r8)
            r12.mo35751w0(r7, r6, r14)
            goto L_0x0582
        L_0x04f2:
            boolean r8 = r12.mo35700B(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m37658U(r6)
            boolean r6 = m37664l(r13, r8)
            r14.mo35596v(r7, r6)
            goto L_0x0582
        L_0x0505:
            boolean r8 = r12.mo35700B(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m37658U(r6)
            int r6 = m37670z(r13, r8)
            r14.mo35577c(r7, r6)
            goto L_0x0582
        L_0x0517:
            boolean r8 = r12.mo35700B(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m37658U(r6)
            long r8 = m37654K(r13, r8)
            r14.mo35593s(r7, r8)
            goto L_0x0582
        L_0x0529:
            boolean r8 = r12.mo35700B(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m37658U(r6)
            int r6 = m37670z(r13, r8)
            r14.mo35582h(r7, r6)
            goto L_0x0582
        L_0x053b:
            boolean r8 = r12.mo35700B(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m37658U(r6)
            long r8 = m37654K(r13, r8)
            r14.mo35580f(r7, r8)
            goto L_0x0582
        L_0x054d:
            boolean r8 = r12.mo35700B(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m37658U(r6)
            long r8 = m37654K(r13, r8)
            r14.mo35595u(r7, r8)
            goto L_0x0582
        L_0x055f:
            boolean r8 = r12.mo35700B(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m37658U(r6)
            float r6 = m37668r(r13, r8)
            r14.mo35561B(r7, r6)
            goto L_0x0582
        L_0x0571:
            boolean r8 = r12.mo35700B(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m37658U(r6)
            double r8 = m37666n(r13, r8)
            r14.mo35590p(r7, r8)
        L_0x0582:
            int r5 = r5 + 3
            goto L_0x0023
        L_0x0586:
            if (r2 == 0) goto L_0x059c
            com.google.crypto.tink.shaded.protobuf.m<?> r3 = r12.f25170p
            r3.mo35968j(r14, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x059a
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0586
        L_0x059a:
            r2 = r1
            goto L_0x0586
        L_0x059c:
            com.google.crypto.tink.shaded.protobuf.m0<?, ?> r0 = r12.f25169o
            r12.mo35753x0(r0, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C4714e0.mo35746t0(java.lang.Object, com.google.crypto.tink.shaded.protobuf.Writer):void");
    }

    /* renamed from: u */
    public final C4731j0 mo35747u(int i) {
        int i2 = (i / 3) * 2;
        C4731j0 j0Var = (C4731j0) this.f25156b[i2];
        if (j0Var != null) {
            return j0Var;
        }
        C4731j0 d = ey4.m44106a().mo42452d((Class) this.f25156b[i2 + 1]);
        this.f25156b[i2] = d;
        return d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:161:0x058e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* renamed from: u0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo35748u0(T r11, com.google.crypto.tink.shaded.protobuf.Writer r12) throws java.io.IOException {
        /*
            r10 = this;
            com.google.crypto.tink.shaded.protobuf.m0<?, ?> r0 = r10.f25169o
            r10.mo35753x0(r0, r11, r12)
            boolean r0 = r10.f25160f
            r1 = 0
            if (r0 == 0) goto L_0x0021
            com.google.crypto.tink.shaded.protobuf.m<?> r0 = r10.f25170p
            com.google.crypto.tink.shaded.protobuf.p r0 = r0.mo35961c(r11)
            boolean r2 = r0.mo35992m()
            if (r2 != 0) goto L_0x0021
            java.util.Iterator r0 = r0.mo35986g()
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0023
        L_0x0021:
            r0 = r1
            r2 = r0
        L_0x0023:
            int[] r3 = r10.f25155a
            int r3 = r3.length
            int r3 = r3 + -3
        L_0x0028:
            if (r3 < 0) goto L_0x058c
            int r4 = r10.mo35742r0(r3)
            int r5 = r10.mo35711T(r3)
        L_0x0032:
            if (r2 == 0) goto L_0x0050
            com.google.crypto.tink.shaded.protobuf.m<?> r6 = r10.f25170p
            int r6 = r6.mo35959a(r2)
            if (r6 <= r5) goto L_0x0050
            com.google.crypto.tink.shaded.protobuf.m<?> r6 = r10.f25170p
            r6.mo35968j(r12, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x004e
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0032
        L_0x004e:
            r2 = r1
            goto L_0x0032
        L_0x0050:
            int r6 = m37667q0(r4)
            r7 = 1
            r8 = 0
            switch(r6) {
                case 0: goto L_0x0577;
                case 1: goto L_0x0565;
                case 2: goto L_0x0553;
                case 3: goto L_0x0541;
                case 4: goto L_0x052f;
                case 5: goto L_0x051d;
                case 6: goto L_0x050b;
                case 7: goto L_0x04f8;
                case 8: goto L_0x04e5;
                case 9: goto L_0x04ce;
                case 10: goto L_0x04b9;
                case 11: goto L_0x04a6;
                case 12: goto L_0x0493;
                case 13: goto L_0x0480;
                case 14: goto L_0x046d;
                case 15: goto L_0x045a;
                case 16: goto L_0x0447;
                case 17: goto L_0x0430;
                case 18: goto L_0x041d;
                case 19: goto L_0x040a;
                case 20: goto L_0x03f7;
                case 21: goto L_0x03e4;
                case 22: goto L_0x03d1;
                case 23: goto L_0x03be;
                case 24: goto L_0x03ab;
                case 25: goto L_0x0398;
                case 26: goto L_0x0385;
                case 27: goto L_0x036e;
                case 28: goto L_0x035b;
                case 29: goto L_0x0348;
                case 30: goto L_0x0335;
                case 31: goto L_0x0322;
                case 32: goto L_0x030f;
                case 33: goto L_0x02fc;
                case 34: goto L_0x02e9;
                case 35: goto L_0x02d6;
                case 36: goto L_0x02c3;
                case 37: goto L_0x02b0;
                case 38: goto L_0x029d;
                case 39: goto L_0x028a;
                case 40: goto L_0x0277;
                case 41: goto L_0x0264;
                case 42: goto L_0x0251;
                case 43: goto L_0x023e;
                case 44: goto L_0x022b;
                case 45: goto L_0x0218;
                case 46: goto L_0x0205;
                case 47: goto L_0x01f2;
                case 48: goto L_0x01df;
                case 49: goto L_0x01c8;
                case 50: goto L_0x01bb;
                case 51: goto L_0x01a8;
                case 52: goto L_0x0195;
                case 53: goto L_0x0182;
                case 54: goto L_0x016f;
                case 55: goto L_0x015c;
                case 56: goto L_0x0149;
                case 57: goto L_0x0136;
                case 58: goto L_0x0123;
                case 59: goto L_0x0110;
                case 60: goto L_0x00f9;
                case 61: goto L_0x00e4;
                case 62: goto L_0x00d1;
                case 63: goto L_0x00be;
                case 64: goto L_0x00ab;
                case 65: goto L_0x0098;
                case 66: goto L_0x0085;
                case 67: goto L_0x0072;
                case 68: goto L_0x005b;
                default: goto L_0x0059;
            }
        L_0x0059:
            goto L_0x0588
        L_0x005b:
            boolean r6 = r10.mo35705H(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m37658U(r4)
            java.lang.Object r4 = p000.q47.m50234G(r11, r6)
            com.google.crypto.tink.shaded.protobuf.j0 r6 = r10.mo35747u(r3)
            r12.mo35570K(r5, r4, r6)
            goto L_0x0588
        L_0x0072:
            boolean r6 = r10.mo35705H(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m37658U(r4)
            long r6 = m37663Z(r11, r6)
            r12.mo35587m(r5, r6)
            goto L_0x0588
        L_0x0085:
            boolean r6 = r10.mo35705H(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m37658U(r4)
            int r4 = m37662Y(r11, r6)
            r12.mo35567H(r5, r4)
            goto L_0x0588
        L_0x0098:
            boolean r6 = r10.mo35705H(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m37658U(r4)
            long r6 = m37663Z(r11, r6)
            r12.mo35583i(r5, r6)
            goto L_0x0588
        L_0x00ab:
            boolean r6 = r10.mo35705H(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m37658U(r4)
            int r4 = m37662Y(r11, r6)
            r12.mo35597w(r5, r4)
            goto L_0x0588
        L_0x00be:
            boolean r6 = r10.mo35705H(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m37658U(r4)
            int r4 = m37662Y(r11, r6)
            r12.mo35564E(r5, r4)
            goto L_0x0588
        L_0x00d1:
            boolean r6 = r10.mo35705H(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m37658U(r4)
            int r4 = m37662Y(r11, r6)
            r12.mo35589o(r5, r4)
            goto L_0x0588
        L_0x00e4:
            boolean r6 = r10.mo35705H(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m37658U(r4)
            java.lang.Object r4 = p000.q47.m50234G(r11, r6)
            com.google.crypto.tink.shaded.protobuf.ByteString r4 = (com.google.crypto.tink.shaded.protobuf.ByteString) r4
            r12.mo35572M(r5, r4)
            goto L_0x0588
        L_0x00f9:
            boolean r6 = r10.mo35705H(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m37658U(r4)
            java.lang.Object r4 = p000.q47.m50234G(r11, r6)
            com.google.crypto.tink.shaded.protobuf.j0 r6 = r10.mo35747u(r3)
            r12.mo35573N(r5, r4, r6)
            goto L_0x0588
        L_0x0110:
            boolean r6 = r10.mo35705H(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m37658U(r4)
            java.lang.Object r4 = p000.q47.m50234G(r11, r6)
            r10.mo35751w0(r5, r4, r12)
            goto L_0x0588
        L_0x0123:
            boolean r6 = r10.mo35705H(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m37658U(r4)
            boolean r4 = m37659V(r11, r6)
            r12.mo35596v(r5, r4)
            goto L_0x0588
        L_0x0136:
            boolean r6 = r10.mo35705H(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m37658U(r4)
            int r4 = m37662Y(r11, r6)
            r12.mo35577c(r5, r4)
            goto L_0x0588
        L_0x0149:
            boolean r6 = r10.mo35705H(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m37658U(r4)
            long r6 = m37663Z(r11, r6)
            r12.mo35593s(r5, r6)
            goto L_0x0588
        L_0x015c:
            boolean r6 = r10.mo35705H(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m37658U(r4)
            int r4 = m37662Y(r11, r6)
            r12.mo35582h(r5, r4)
            goto L_0x0588
        L_0x016f:
            boolean r6 = r10.mo35705H(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m37658U(r4)
            long r6 = m37663Z(r11, r6)
            r12.mo35580f(r5, r6)
            goto L_0x0588
        L_0x0182:
            boolean r6 = r10.mo35705H(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m37658U(r4)
            long r6 = m37663Z(r11, r6)
            r12.mo35595u(r5, r6)
            goto L_0x0588
        L_0x0195:
            boolean r6 = r10.mo35705H(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m37658U(r4)
            float r4 = m37661X(r11, r6)
            r12.mo35561B(r5, r4)
            goto L_0x0588
        L_0x01a8:
            boolean r6 = r10.mo35705H(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m37658U(r4)
            double r6 = m37660W(r11, r6)
            r12.mo35590p(r5, r6)
            goto L_0x0588
        L_0x01bb:
            long r6 = m37658U(r4)
            java.lang.Object r4 = p000.q47.m50234G(r11, r6)
            r10.mo35749v0(r12, r5, r4, r3)
            goto L_0x0588
        L_0x01c8:
            int r5 = r10.mo35711T(r3)
            long r6 = m37658U(r4)
            java.lang.Object r4 = p000.q47.m50234G(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.j0 r6 = r10.mo35747u(r3)
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38137U(r5, r4, r12, r6)
            goto L_0x0588
        L_0x01df:
            int r5 = r10.mo35711T(r3)
            long r8 = m37658U(r4)
            java.lang.Object r4 = p000.q47.m50234G(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38146b0(r5, r4, r12, r7)
            goto L_0x0588
        L_0x01f2:
            int r5 = r10.mo35711T(r3)
            long r8 = m37658U(r4)
            java.lang.Object r4 = p000.q47.m50234G(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38144a0(r5, r4, r12, r7)
            goto L_0x0588
        L_0x0205:
            int r5 = r10.mo35711T(r3)
            long r8 = m37658U(r4)
            java.lang.Object r4 = p000.q47.m50234G(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38142Z(r5, r4, r12, r7)
            goto L_0x0588
        L_0x0218:
            int r5 = r10.mo35711T(r3)
            long r8 = m37658U(r4)
            java.lang.Object r4 = p000.q47.m50234G(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38141Y(r5, r4, r12, r7)
            goto L_0x0588
        L_0x022b:
            int r5 = r10.mo35711T(r3)
            long r8 = m37658U(r4)
            java.lang.Object r4 = p000.q47.m50234G(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38133Q(r5, r4, r12, r7)
            goto L_0x0588
        L_0x023e:
            int r5 = r10.mo35711T(r3)
            long r8 = m37658U(r4)
            java.lang.Object r4 = p000.q47.m50234G(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38150d0(r5, r4, r12, r7)
            goto L_0x0588
        L_0x0251:
            int r5 = r10.mo35711T(r3)
            long r8 = m37658U(r4)
            java.lang.Object r4 = p000.q47.m50234G(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38130N(r5, r4, r12, r7)
            goto L_0x0588
        L_0x0264:
            int r5 = r10.mo35711T(r3)
            long r8 = m37658U(r4)
            java.lang.Object r4 = p000.q47.m50234G(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38134R(r5, r4, r12, r7)
            goto L_0x0588
        L_0x0277:
            int r5 = r10.mo35711T(r3)
            long r8 = m37658U(r4)
            java.lang.Object r4 = p000.q47.m50234G(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38135S(r5, r4, r12, r7)
            goto L_0x0588
        L_0x028a:
            int r5 = r10.mo35711T(r3)
            long r8 = m37658U(r4)
            java.lang.Object r4 = p000.q47.m50234G(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38138V(r5, r4, r12, r7)
            goto L_0x0588
        L_0x029d:
            int r5 = r10.mo35711T(r3)
            long r8 = m37658U(r4)
            java.lang.Object r4 = p000.q47.m50234G(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38152e0(r5, r4, r12, r7)
            goto L_0x0588
        L_0x02b0:
            int r5 = r10.mo35711T(r3)
            long r8 = m37658U(r4)
            java.lang.Object r4 = p000.q47.m50234G(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38139W(r5, r4, r12, r7)
            goto L_0x0588
        L_0x02c3:
            int r5 = r10.mo35711T(r3)
            long r8 = m37658U(r4)
            java.lang.Object r4 = p000.q47.m50234G(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38136T(r5, r4, r12, r7)
            goto L_0x0588
        L_0x02d6:
            int r5 = r10.mo35711T(r3)
            long r8 = m37658U(r4)
            java.lang.Object r4 = p000.q47.m50234G(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38132P(r5, r4, r12, r7)
            goto L_0x0588
        L_0x02e9:
            int r5 = r10.mo35711T(r3)
            long r6 = m37658U(r4)
            java.lang.Object r4 = p000.q47.m50234G(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38146b0(r5, r4, r12, r8)
            goto L_0x0588
        L_0x02fc:
            int r5 = r10.mo35711T(r3)
            long r6 = m37658U(r4)
            java.lang.Object r4 = p000.q47.m50234G(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38144a0(r5, r4, r12, r8)
            goto L_0x0588
        L_0x030f:
            int r5 = r10.mo35711T(r3)
            long r6 = m37658U(r4)
            java.lang.Object r4 = p000.q47.m50234G(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38142Z(r5, r4, r12, r8)
            goto L_0x0588
        L_0x0322:
            int r5 = r10.mo35711T(r3)
            long r6 = m37658U(r4)
            java.lang.Object r4 = p000.q47.m50234G(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38141Y(r5, r4, r12, r8)
            goto L_0x0588
        L_0x0335:
            int r5 = r10.mo35711T(r3)
            long r6 = m37658U(r4)
            java.lang.Object r4 = p000.q47.m50234G(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38133Q(r5, r4, r12, r8)
            goto L_0x0588
        L_0x0348:
            int r5 = r10.mo35711T(r3)
            long r6 = m37658U(r4)
            java.lang.Object r4 = p000.q47.m50234G(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38150d0(r5, r4, r12, r8)
            goto L_0x0588
        L_0x035b:
            int r5 = r10.mo35711T(r3)
            long r6 = m37658U(r4)
            java.lang.Object r4 = p000.q47.m50234G(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38131O(r5, r4, r12)
            goto L_0x0588
        L_0x036e:
            int r5 = r10.mo35711T(r3)
            long r6 = m37658U(r4)
            java.lang.Object r4 = p000.q47.m50234G(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.j0 r6 = r10.mo35747u(r3)
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38140X(r5, r4, r12, r6)
            goto L_0x0588
        L_0x0385:
            int r5 = r10.mo35711T(r3)
            long r6 = m37658U(r4)
            java.lang.Object r4 = p000.q47.m50234G(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38148c0(r5, r4, r12)
            goto L_0x0588
        L_0x0398:
            int r5 = r10.mo35711T(r3)
            long r6 = m37658U(r4)
            java.lang.Object r4 = p000.q47.m50234G(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38130N(r5, r4, r12, r8)
            goto L_0x0588
        L_0x03ab:
            int r5 = r10.mo35711T(r3)
            long r6 = m37658U(r4)
            java.lang.Object r4 = p000.q47.m50234G(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38134R(r5, r4, r12, r8)
            goto L_0x0588
        L_0x03be:
            int r5 = r10.mo35711T(r3)
            long r6 = m37658U(r4)
            java.lang.Object r4 = p000.q47.m50234G(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38135S(r5, r4, r12, r8)
            goto L_0x0588
        L_0x03d1:
            int r5 = r10.mo35711T(r3)
            long r6 = m37658U(r4)
            java.lang.Object r4 = p000.q47.m50234G(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38138V(r5, r4, r12, r8)
            goto L_0x0588
        L_0x03e4:
            int r5 = r10.mo35711T(r3)
            long r6 = m37658U(r4)
            java.lang.Object r4 = p000.q47.m50234G(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38152e0(r5, r4, r12, r8)
            goto L_0x0588
        L_0x03f7:
            int r5 = r10.mo35711T(r3)
            long r6 = m37658U(r4)
            java.lang.Object r4 = p000.q47.m50234G(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38139W(r5, r4, r12, r8)
            goto L_0x0588
        L_0x040a:
            int r5 = r10.mo35711T(r3)
            long r6 = m37658U(r4)
            java.lang.Object r4 = p000.q47.m50234G(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38136T(r5, r4, r12, r8)
            goto L_0x0588
        L_0x041d:
            int r5 = r10.mo35711T(r3)
            long r6 = m37658U(r4)
            java.lang.Object r4 = p000.q47.m50234G(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.crypto.tink.shaded.protobuf.C4733k0.m38132P(r5, r4, r12, r8)
            goto L_0x0588
        L_0x0430:
            boolean r6 = r10.mo35700B(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m37658U(r4)
            java.lang.Object r4 = p000.q47.m50234G(r11, r6)
            com.google.crypto.tink.shaded.protobuf.j0 r6 = r10.mo35747u(r3)
            r12.mo35570K(r5, r4, r6)
            goto L_0x0588
        L_0x0447:
            boolean r6 = r10.mo35700B(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m37658U(r4)
            long r6 = m37654K(r11, r6)
            r12.mo35587m(r5, r6)
            goto L_0x0588
        L_0x045a:
            boolean r6 = r10.mo35700B(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m37658U(r4)
            int r4 = m37670z(r11, r6)
            r12.mo35567H(r5, r4)
            goto L_0x0588
        L_0x046d:
            boolean r6 = r10.mo35700B(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m37658U(r4)
            long r6 = m37654K(r11, r6)
            r12.mo35583i(r5, r6)
            goto L_0x0588
        L_0x0480:
            boolean r6 = r10.mo35700B(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m37658U(r4)
            int r4 = m37670z(r11, r6)
            r12.mo35597w(r5, r4)
            goto L_0x0588
        L_0x0493:
            boolean r6 = r10.mo35700B(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m37658U(r4)
            int r4 = m37670z(r11, r6)
            r12.mo35564E(r5, r4)
            goto L_0x0588
        L_0x04a6:
            boolean r6 = r10.mo35700B(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m37658U(r4)
            int r4 = m37670z(r11, r6)
            r12.mo35589o(r5, r4)
            goto L_0x0588
        L_0x04b9:
            boolean r6 = r10.mo35700B(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m37658U(r4)
            java.lang.Object r4 = p000.q47.m50234G(r11, r6)
            com.google.crypto.tink.shaded.protobuf.ByteString r4 = (com.google.crypto.tink.shaded.protobuf.ByteString) r4
            r12.mo35572M(r5, r4)
            goto L_0x0588
        L_0x04ce:
            boolean r6 = r10.mo35700B(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m37658U(r4)
            java.lang.Object r4 = p000.q47.m50234G(r11, r6)
            com.google.crypto.tink.shaded.protobuf.j0 r6 = r10.mo35747u(r3)
            r12.mo35573N(r5, r4, r6)
            goto L_0x0588
        L_0x04e5:
            boolean r6 = r10.mo35700B(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m37658U(r4)
            java.lang.Object r4 = p000.q47.m50234G(r11, r6)
            r10.mo35751w0(r5, r4, r12)
            goto L_0x0588
        L_0x04f8:
            boolean r6 = r10.mo35700B(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m37658U(r4)
            boolean r4 = m37664l(r11, r6)
            r12.mo35596v(r5, r4)
            goto L_0x0588
        L_0x050b:
            boolean r6 = r10.mo35700B(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m37658U(r4)
            int r4 = m37670z(r11, r6)
            r12.mo35577c(r5, r4)
            goto L_0x0588
        L_0x051d:
            boolean r6 = r10.mo35700B(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m37658U(r4)
            long r6 = m37654K(r11, r6)
            r12.mo35593s(r5, r6)
            goto L_0x0588
        L_0x052f:
            boolean r6 = r10.mo35700B(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m37658U(r4)
            int r4 = m37670z(r11, r6)
            r12.mo35582h(r5, r4)
            goto L_0x0588
        L_0x0541:
            boolean r6 = r10.mo35700B(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m37658U(r4)
            long r6 = m37654K(r11, r6)
            r12.mo35580f(r5, r6)
            goto L_0x0588
        L_0x0553:
            boolean r6 = r10.mo35700B(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m37658U(r4)
            long r6 = m37654K(r11, r6)
            r12.mo35595u(r5, r6)
            goto L_0x0588
        L_0x0565:
            boolean r6 = r10.mo35700B(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m37658U(r4)
            float r4 = m37668r(r11, r6)
            r12.mo35561B(r5, r4)
            goto L_0x0588
        L_0x0577:
            boolean r6 = r10.mo35700B(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m37658U(r4)
            double r6 = m37666n(r11, r6)
            r12.mo35590p(r5, r6)
        L_0x0588:
            int r3 = r3 + -3
            goto L_0x0028
        L_0x058c:
            if (r2 == 0) goto L_0x05a3
            com.google.crypto.tink.shaded.protobuf.m<?> r11 = r10.f25170p
            r11.mo35968j(r12, r2)
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L_0x05a1
            java.lang.Object r11 = r0.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            r2 = r11
            goto L_0x058c
        L_0x05a1:
            r2 = r1
            goto L_0x058c
        L_0x05a3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C4714e0.mo35748u0(java.lang.Object, com.google.crypto.tink.shaded.protobuf.Writer):void");
    }

    /* renamed from: v0 */
    public final <K, V> void mo35749v0(Writer writer, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            this.f25171q.mo35609b(mo35745t(i2));
            writer.mo35569J(i, (C4779z.C4780a) null, this.f25171q.mo35612e(obj));
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0344, code lost:
        r4 = (r4 + r9) + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0410, code lost:
        r6 = r6 + r3;
        r11 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0462, code lost:
        r6 = r6 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0519, code lost:
        r5 = r5 + 3;
        r3 = 1048575;
     */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo35750w(T r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            sun.misc.Unsafe r2 = f25154s
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r3
            r5 = 0
            r6 = 0
            r8 = 0
        L_0x000d:
            int[] r9 = r0.f25155a
            int r9 = r9.length
            if (r5 >= r9) goto L_0x0520
            int r9 = r0.mo35742r0(r5)
            int r10 = r0.mo35711T(r5)
            int r11 = m37667q0(r9)
            r12 = 17
            r13 = 1
            if (r11 > r12) goto L_0x0038
            int[] r12 = r0.f25155a
            int r14 = r5 + 2
            r12 = r12[r14]
            r14 = r12 & r3
            int r15 = r12 >>> 20
            int r15 = r13 << r15
            if (r14 == r7) goto L_0x0056
            long r7 = (long) r14
            int r8 = r2.getInt(r1, r7)
            r7 = r14
            goto L_0x0056
        L_0x0038:
            boolean r12 = r0.f25163i
            if (r12 == 0) goto L_0x0054
            com.google.crypto.tink.shaded.protobuf.FieldType r12 = com.google.crypto.tink.shaded.protobuf.FieldType.DOUBLE_LIST_PACKED
            int r12 = r12.mo35432id()
            if (r11 < r12) goto L_0x0054
            com.google.crypto.tink.shaded.protobuf.FieldType r12 = com.google.crypto.tink.shaded.protobuf.FieldType.SINT64_LIST_PACKED
            int r12 = r12.mo35432id()
            if (r11 > r12) goto L_0x0054
            int[] r12 = r0.f25155a
            int r14 = r5 + 2
            r12 = r12[r14]
            r12 = r12 & r3
            goto L_0x0055
        L_0x0054:
            r12 = 0
        L_0x0055:
            r15 = 0
        L_0x0056:
            long r13 = m37658U(r9)
            r9 = 0
            r3 = 0
            switch(r11) {
                case 0: goto L_0x050d;
                case 1: goto L_0x0503;
                case 2: goto L_0x04f5;
                case 3: goto L_0x04e7;
                case 4: goto L_0x04d9;
                case 5: goto L_0x04cf;
                case 6: goto L_0x04c5;
                case 7: goto L_0x04ba;
                case 8: goto L_0x049e;
                case 9: goto L_0x048d;
                case 10: goto L_0x047e;
                case 11: goto L_0x0471;
                case 12: goto L_0x0464;
                case 13: goto L_0x0459;
                case 14: goto L_0x0450;
                case 15: goto L_0x0443;
                case 16: goto L_0x0436;
                case 17: goto L_0x0423;
                case 18: goto L_0x0414;
                case 19: goto L_0x0405;
                case 20: goto L_0x03f9;
                case 21: goto L_0x03ed;
                case 22: goto L_0x03e1;
                case 23: goto L_0x03d5;
                case 24: goto L_0x03c9;
                case 25: goto L_0x03bd;
                case 26: goto L_0x03b2;
                case 27: goto L_0x03a2;
                case 28: goto L_0x0396;
                case 29: goto L_0x0389;
                case 30: goto L_0x037c;
                case 31: goto L_0x036f;
                case 32: goto L_0x0362;
                case 33: goto L_0x0355;
                case 34: goto L_0x0348;
                case 35: goto L_0x0328;
                case 36: goto L_0x030b;
                case 37: goto L_0x02ee;
                case 38: goto L_0x02d1;
                case 39: goto L_0x02b3;
                case 40: goto L_0x0295;
                case 41: goto L_0x0277;
                case 42: goto L_0x0259;
                case 43: goto L_0x023b;
                case 44: goto L_0x021d;
                case 45: goto L_0x01ff;
                case 46: goto L_0x01e1;
                case 47: goto L_0x01c3;
                case 48: goto L_0x01a5;
                case 49: goto L_0x0195;
                case 50: goto L_0x0185;
                case 51: goto L_0x0177;
                case 52: goto L_0x016b;
                case 53: goto L_0x015b;
                case 54: goto L_0x014b;
                case 55: goto L_0x013b;
                case 56: goto L_0x012f;
                case 57: goto L_0x0122;
                case 58: goto L_0x0115;
                case 59: goto L_0x00f7;
                case 60: goto L_0x00e3;
                case 61: goto L_0x00d1;
                case 62: goto L_0x00c1;
                case 63: goto L_0x00b1;
                case 64: goto L_0x00a4;
                case 65: goto L_0x0098;
                case 66: goto L_0x0088;
                case 67: goto L_0x0078;
                case 68: goto L_0x0062;
                default: goto L_0x0060;
            }
        L_0x0060:
            goto L_0x0420
        L_0x0062:
            boolean r3 = r0.mo35705H(r1, r10, r5)
            if (r3 == 0) goto L_0x0420
            java.lang.Object r3 = r2.getObject(r1, r13)
            com.google.crypto.tink.shaded.protobuf.c0 r3 = (com.google.crypto.tink.shaded.protobuf.C4705c0) r3
            com.google.crypto.tink.shaded.protobuf.j0 r4 = r0.mo35747u(r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37237t(r10, r3, r4)
            goto L_0x041f
        L_0x0078:
            boolean r3 = r0.mo35705H(r1, r10, r5)
            if (r3 == 0) goto L_0x0420
            long r3 = m37663Z(r1, r13)
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37208R(r10, r3)
            goto L_0x041f
        L_0x0088:
            boolean r3 = r0.mo35705H(r1, r10, r5)
            if (r3 == 0) goto L_0x0420
            int r3 = m37662Y(r1, r13)
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37206P(r10, r3)
            goto L_0x041f
        L_0x0098:
            boolean r9 = r0.mo35705H(r1, r10, r5)
            if (r9 == 0) goto L_0x0420
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37204N(r10, r3)
            goto L_0x041f
        L_0x00a4:
            boolean r3 = r0.mo35705H(r1, r10, r5)
            if (r3 == 0) goto L_0x0420
            r3 = 0
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37202L(r10, r3)
            goto L_0x0462
        L_0x00b1:
            boolean r3 = r0.mo35705H(r1, r10, r5)
            if (r3 == 0) goto L_0x0420
            int r3 = m37662Y(r1, r13)
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37229l(r10, r3)
            goto L_0x041f
        L_0x00c1:
            boolean r3 = r0.mo35705H(r1, r10, r5)
            if (r3 == 0) goto L_0x0420
            int r3 = m37662Y(r1, r13)
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37213W(r10, r3)
            goto L_0x041f
        L_0x00d1:
            boolean r3 = r0.mo35705H(r1, r10, r5)
            if (r3 == 0) goto L_0x0420
            java.lang.Object r3 = r2.getObject(r1, r13)
            com.google.crypto.tink.shaded.protobuf.ByteString r3 = (com.google.crypto.tink.shaded.protobuf.ByteString) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37225h(r10, r3)
            goto L_0x041f
        L_0x00e3:
            boolean r3 = r0.mo35705H(r1, r10, r5)
            if (r3 == 0) goto L_0x0420
            java.lang.Object r3 = r2.getObject(r1, r13)
            com.google.crypto.tink.shaded.protobuf.j0 r4 = r0.mo35747u(r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.C4733k0.m38162o(r10, r3, r4)
            goto L_0x041f
        L_0x00f7:
            boolean r3 = r0.mo35705H(r1, r10, r5)
            if (r3 == 0) goto L_0x0420
            java.lang.Object r3 = r2.getObject(r1, r13)
            boolean r4 = r3 instanceof com.google.crypto.tink.shaded.protobuf.ByteString
            if (r4 == 0) goto L_0x010d
            com.google.crypto.tink.shaded.protobuf.ByteString r3 = (com.google.crypto.tink.shaded.protobuf.ByteString) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37225h(r10, r3)
            goto L_0x041f
        L_0x010d:
            java.lang.String r3 = (java.lang.String) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37210T(r10, r3)
            goto L_0x041f
        L_0x0115:
            boolean r3 = r0.mo35705H(r1, r10, r5)
            if (r3 == 0) goto L_0x0420
            r3 = 1
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37220e(r10, r3)
            goto L_0x041f
        L_0x0122:
            boolean r3 = r0.mo35705H(r1, r10, r5)
            if (r3 == 0) goto L_0x0420
            r3 = 0
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37231n(r10, r3)
            goto L_0x0462
        L_0x012f:
            boolean r9 = r0.mo35705H(r1, r10, r5)
            if (r9 == 0) goto L_0x0420
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37233p(r10, r3)
            goto L_0x041f
        L_0x013b:
            boolean r3 = r0.mo35705H(r1, r10, r5)
            if (r3 == 0) goto L_0x0420
            int r3 = m37662Y(r1, r13)
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37240w(r10, r3)
            goto L_0x041f
        L_0x014b:
            boolean r3 = r0.mo35705H(r1, r10, r5)
            if (r3 == 0) goto L_0x0420
            long r3 = m37663Z(r1, r13)
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37215Y(r10, r3)
            goto L_0x041f
        L_0x015b:
            boolean r3 = r0.mo35705H(r1, r10, r5)
            if (r3 == 0) goto L_0x0420
            long r3 = m37663Z(r1, r13)
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37242y(r10, r3)
            goto L_0x041f
        L_0x016b:
            boolean r3 = r0.mo35705H(r1, r10, r5)
            if (r3 == 0) goto L_0x0420
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37235r(r10, r9)
            goto L_0x041f
        L_0x0177:
            boolean r3 = r0.mo35705H(r1, r10, r5)
            if (r3 == 0) goto L_0x0420
            r3 = 0
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37227j(r10, r3)
            goto L_0x041f
        L_0x0185:
            com.google.crypto.tink.shaded.protobuf.a0 r3 = r0.f25171q
            java.lang.Object r4 = r2.getObject(r1, r13)
            java.lang.Object r9 = r0.mo35745t(r5)
            int r3 = r3.mo35614g(r10, r4, r9)
            goto L_0x041f
        L_0x0195:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            com.google.crypto.tink.shaded.protobuf.j0 r4 = r0.mo35747u(r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.C4733k0.m38157j(r10, r3, r4)
            goto L_0x041f
        L_0x01a5:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.C4733k0.m38167t(r3)
            if (r3 <= 0) goto L_0x0420
            boolean r4 = r0.f25163i
            if (r4 == 0) goto L_0x01b9
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x01b9:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37212V(r10)
            int r9 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37214X(r3)
            goto L_0x0344
        L_0x01c3:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.C4733k0.m38165r(r3)
            if (r3 <= 0) goto L_0x0420
            boolean r4 = r0.f25163i
            if (r4 == 0) goto L_0x01d7
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x01d7:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37212V(r10)
            int r9 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37214X(r3)
            goto L_0x0344
        L_0x01e1:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.C4733k0.m38156i(r3)
            if (r3 <= 0) goto L_0x0420
            boolean r4 = r0.f25163i
            if (r4 == 0) goto L_0x01f5
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x01f5:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37212V(r10)
            int r9 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37214X(r3)
            goto L_0x0344
        L_0x01ff:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.C4733k0.m38154g(r3)
            if (r3 <= 0) goto L_0x0420
            boolean r4 = r0.f25163i
            if (r4 == 0) goto L_0x0213
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x0213:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37212V(r10)
            int r9 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37214X(r3)
            goto L_0x0344
        L_0x021d:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.C4733k0.m38151e(r3)
            if (r3 <= 0) goto L_0x0420
            boolean r4 = r0.f25163i
            if (r4 == 0) goto L_0x0231
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x0231:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37212V(r10)
            int r9 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37214X(r3)
            goto L_0x0344
        L_0x023b:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.C4733k0.m38170w(r3)
            if (r3 <= 0) goto L_0x0420
            boolean r4 = r0.f25163i
            if (r4 == 0) goto L_0x024f
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x024f:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37212V(r10)
            int r9 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37214X(r3)
            goto L_0x0344
        L_0x0259:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.C4733k0.m38145b(r3)
            if (r3 <= 0) goto L_0x0420
            boolean r4 = r0.f25163i
            if (r4 == 0) goto L_0x026d
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x026d:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37212V(r10)
            int r9 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37214X(r3)
            goto L_0x0344
        L_0x0277:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.C4733k0.m38154g(r3)
            if (r3 <= 0) goto L_0x0420
            boolean r4 = r0.f25163i
            if (r4 == 0) goto L_0x028b
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x028b:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37212V(r10)
            int r9 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37214X(r3)
            goto L_0x0344
        L_0x0295:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.C4733k0.m38156i(r3)
            if (r3 <= 0) goto L_0x0420
            boolean r4 = r0.f25163i
            if (r4 == 0) goto L_0x02a9
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x02a9:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37212V(r10)
            int r9 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37214X(r3)
            goto L_0x0344
        L_0x02b3:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.C4733k0.m38159l(r3)
            if (r3 <= 0) goto L_0x0420
            boolean r4 = r0.f25163i
            if (r4 == 0) goto L_0x02c7
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x02c7:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37212V(r10)
            int r9 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37214X(r3)
            goto L_0x0344
        L_0x02d1:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.C4733k0.m38172y(r3)
            if (r3 <= 0) goto L_0x0420
            boolean r4 = r0.f25163i
            if (r4 == 0) goto L_0x02e5
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x02e5:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37212V(r10)
            int r9 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37214X(r3)
            goto L_0x0344
        L_0x02ee:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.C4733k0.m38161n(r3)
            if (r3 <= 0) goto L_0x0420
            boolean r4 = r0.f25163i
            if (r4 == 0) goto L_0x0302
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x0302:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37212V(r10)
            int r9 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37214X(r3)
            goto L_0x0344
        L_0x030b:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.C4733k0.m38154g(r3)
            if (r3 <= 0) goto L_0x0420
            boolean r4 = r0.f25163i
            if (r4 == 0) goto L_0x031f
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x031f:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37212V(r10)
            int r9 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37214X(r3)
            goto L_0x0344
        L_0x0328:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.C4733k0.m38156i(r3)
            if (r3 <= 0) goto L_0x0420
            boolean r4 = r0.f25163i
            if (r4 == 0) goto L_0x033c
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x033c:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37212V(r10)
            int r9 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37214X(r3)
        L_0x0344:
            int r4 = r4 + r9
            int r4 = r4 + r3
            goto L_0x0462
        L_0x0348:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            r4 = 0
            int r3 = com.google.crypto.tink.shaded.protobuf.C4733k0.m38166s(r10, r3, r4)
            goto L_0x0410
        L_0x0355:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.C4733k0.m38164q(r10, r3, r4)
            goto L_0x0410
        L_0x0362:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.C4733k0.m38155h(r10, r3, r4)
            goto L_0x0410
        L_0x036f:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.C4733k0.m38153f(r10, r3, r4)
            goto L_0x0410
        L_0x037c:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.C4733k0.m38149d(r10, r3, r4)
            goto L_0x0410
        L_0x0389:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.C4733k0.m38169v(r10, r3, r4)
            goto L_0x041f
        L_0x0396:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.C4733k0.m38147c(r10, r3)
            goto L_0x041f
        L_0x03a2:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            com.google.crypto.tink.shaded.protobuf.j0 r4 = r0.mo35747u(r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.C4733k0.m38163p(r10, r3, r4)
            goto L_0x041f
        L_0x03b2:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.C4733k0.m38168u(r10, r3)
            goto L_0x041f
        L_0x03bd:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            r4 = 0
            int r3 = com.google.crypto.tink.shaded.protobuf.C4733k0.m38143a(r10, r3, r4)
            goto L_0x0410
        L_0x03c9:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.C4733k0.m38153f(r10, r3, r4)
            goto L_0x0410
        L_0x03d5:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.C4733k0.m38155h(r10, r3, r4)
            goto L_0x0410
        L_0x03e1:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.C4733k0.m38158k(r10, r3, r4)
            goto L_0x0410
        L_0x03ed:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.C4733k0.m38171x(r10, r3, r4)
            goto L_0x0410
        L_0x03f9:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.C4733k0.m38160m(r10, r3, r4)
            goto L_0x0410
        L_0x0405:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.C4733k0.m38153f(r10, r3, r4)
        L_0x0410:
            int r6 = r6 + r3
            r11 = r4
            goto L_0x0519
        L_0x0414:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.C4733k0.m38155h(r10, r3, r4)
        L_0x041f:
            int r6 = r6 + r3
        L_0x0420:
            r11 = 0
            goto L_0x0519
        L_0x0423:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0420
            java.lang.Object r3 = r2.getObject(r1, r13)
            com.google.crypto.tink.shaded.protobuf.c0 r3 = (com.google.crypto.tink.shaded.protobuf.C4705c0) r3
            com.google.crypto.tink.shaded.protobuf.j0 r4 = r0.mo35747u(r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37237t(r10, r3, r4)
            goto L_0x041f
        L_0x0436:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0420
            long r3 = r2.getLong(r1, r13)
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37208R(r10, r3)
            goto L_0x041f
        L_0x0443:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0420
            int r3 = r2.getInt(r1, r13)
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37206P(r10, r3)
            goto L_0x041f
        L_0x0450:
            r9 = r8 & r15
            if (r9 == 0) goto L_0x0420
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37204N(r10, r3)
            goto L_0x041f
        L_0x0459:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0420
            r3 = 0
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37202L(r10, r3)
        L_0x0462:
            int r6 = r6 + r4
            goto L_0x0420
        L_0x0464:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0420
            int r3 = r2.getInt(r1, r13)
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37229l(r10, r3)
            goto L_0x041f
        L_0x0471:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0420
            int r3 = r2.getInt(r1, r13)
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37213W(r10, r3)
            goto L_0x041f
        L_0x047e:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0420
            java.lang.Object r3 = r2.getObject(r1, r13)
            com.google.crypto.tink.shaded.protobuf.ByteString r3 = (com.google.crypto.tink.shaded.protobuf.ByteString) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37225h(r10, r3)
            goto L_0x041f
        L_0x048d:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0420
            java.lang.Object r3 = r2.getObject(r1, r13)
            com.google.crypto.tink.shaded.protobuf.j0 r4 = r0.mo35747u(r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.C4733k0.m38162o(r10, r3, r4)
            goto L_0x041f
        L_0x049e:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0420
            java.lang.Object r3 = r2.getObject(r1, r13)
            boolean r4 = r3 instanceof com.google.crypto.tink.shaded.protobuf.ByteString
            if (r4 == 0) goto L_0x04b2
            com.google.crypto.tink.shaded.protobuf.ByteString r3 = (com.google.crypto.tink.shaded.protobuf.ByteString) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37225h(r10, r3)
            goto L_0x041f
        L_0x04b2:
            java.lang.String r3 = (java.lang.String) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37210T(r10, r3)
            goto L_0x041f
        L_0x04ba:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0420
            r3 = 1
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37220e(r10, r3)
            goto L_0x041f
        L_0x04c5:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0420
            r11 = 0
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37231n(r10, r11)
            goto L_0x0518
        L_0x04cf:
            r11 = 0
            r9 = r8 & r15
            if (r9 == 0) goto L_0x0519
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37233p(r10, r3)
            goto L_0x0518
        L_0x04d9:
            r11 = 0
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0519
            int r3 = r2.getInt(r1, r13)
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37240w(r10, r3)
            goto L_0x0518
        L_0x04e7:
            r11 = 0
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0519
            long r3 = r2.getLong(r1, r13)
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37215Y(r10, r3)
            goto L_0x0518
        L_0x04f5:
            r11 = 0
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0519
            long r3 = r2.getLong(r1, r13)
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37242y(r10, r3)
            goto L_0x0518
        L_0x0503:
            r11 = 0
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0519
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37235r(r10, r9)
            goto L_0x0518
        L_0x050d:
            r11 = 0
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0519
            r3 = 0
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37227j(r10, r3)
        L_0x0518:
            int r6 = r6 + r3
        L_0x0519:
            int r5 = r5 + 3
            r3 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x000d
        L_0x0520:
            com.google.crypto.tink.shaded.protobuf.m0<?, ?> r2 = r0.f25169o
            int r2 = r0.mo35754y(r2, r1)
            int r6 = r6 + r2
            boolean r2 = r0.f25160f
            if (r2 == 0) goto L_0x0536
            com.google.crypto.tink.shaded.protobuf.m<?> r2 = r0.f25170p
            com.google.crypto.tink.shaded.protobuf.p r1 = r2.mo35961c(r1)
            int r1 = r1.mo35991l()
            int r6 = r6 + r1
        L_0x0536:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C4714e0.mo35750w(java.lang.Object):int");
    }

    /* renamed from: w0 */
    public final void mo35751w0(int i, Object obj, Writer writer) throws IOException {
        if (obj instanceof String) {
            writer.mo35579e(i, (String) obj);
        } else {
            writer.mo35572M(i, (ByteString) obj);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo35752x(T r16) {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            sun.misc.Unsafe r2 = f25154s
            r3 = 0
            r4 = r3
            r5 = r4
        L_0x0008:
            int[] r6 = r0.f25155a
            int r6 = r6.length
            if (r4 >= r6) goto L_0x04e3
            int r6 = r15.mo35742r0(r4)
            int r7 = m37667q0(r6)
            int r8 = r15.mo35711T(r4)
            long r9 = m37658U(r6)
            com.google.crypto.tink.shaded.protobuf.FieldType r6 = com.google.crypto.tink.shaded.protobuf.FieldType.DOUBLE_LIST_PACKED
            int r6 = r6.mo35432id()
            if (r7 < r6) goto L_0x0038
            com.google.crypto.tink.shaded.protobuf.FieldType r6 = com.google.crypto.tink.shaded.protobuf.FieldType.SINT64_LIST_PACKED
            int r6 = r6.mo35432id()
            if (r7 > r6) goto L_0x0038
            int[] r6 = r0.f25155a
            int r11 = r4 + 2
            r6 = r6[r11]
            r11 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r6 & r11
            goto L_0x0039
        L_0x0038:
            r6 = r3
        L_0x0039:
            r11 = 1
            r12 = 0
            r13 = 0
            switch(r7) {
                case 0: goto L_0x04d1;
                case 1: goto L_0x04c5;
                case 2: goto L_0x04b5;
                case 3: goto L_0x04a5;
                case 4: goto L_0x0495;
                case 5: goto L_0x0489;
                case 6: goto L_0x047d;
                case 7: goto L_0x0471;
                case 8: goto L_0x0453;
                case 9: goto L_0x043f;
                case 10: goto L_0x042e;
                case 11: goto L_0x041f;
                case 12: goto L_0x0410;
                case 13: goto L_0x0405;
                case 14: goto L_0x03fa;
                case 15: goto L_0x03eb;
                case 16: goto L_0x03dc;
                case 17: goto L_0x03c7;
                case 18: goto L_0x03bc;
                case 19: goto L_0x03b3;
                case 20: goto L_0x03aa;
                case 21: goto L_0x03a1;
                case 22: goto L_0x0398;
                case 23: goto L_0x038f;
                case 24: goto L_0x0386;
                case 25: goto L_0x037d;
                case 26: goto L_0x0374;
                case 27: goto L_0x0367;
                case 28: goto L_0x035e;
                case 29: goto L_0x0355;
                case 30: goto L_0x034b;
                case 31: goto L_0x0341;
                case 32: goto L_0x0337;
                case 33: goto L_0x032d;
                case 34: goto L_0x0323;
                case 35: goto L_0x0303;
                case 36: goto L_0x02e6;
                case 37: goto L_0x02c9;
                case 38: goto L_0x02ac;
                case 39: goto L_0x028e;
                case 40: goto L_0x0270;
                case 41: goto L_0x0252;
                case 42: goto L_0x0234;
                case 43: goto L_0x0216;
                case 44: goto L_0x01f8;
                case 45: goto L_0x01da;
                case 46: goto L_0x01bc;
                case 47: goto L_0x019e;
                case 48: goto L_0x0180;
                case 49: goto L_0x0172;
                case 50: goto L_0x0162;
                case 51: goto L_0x0154;
                case 52: goto L_0x0148;
                case 53: goto L_0x0138;
                case 54: goto L_0x0128;
                case 55: goto L_0x0118;
                case 56: goto L_0x010c;
                case 57: goto L_0x0100;
                case 58: goto L_0x00f4;
                case 59: goto L_0x00d6;
                case 60: goto L_0x00c2;
                case 61: goto L_0x00b0;
                case 62: goto L_0x00a0;
                case 63: goto L_0x0090;
                case 64: goto L_0x0084;
                case 65: goto L_0x0078;
                case 66: goto L_0x0068;
                case 67: goto L_0x0058;
                case 68: goto L_0x0042;
                default: goto L_0x0040;
            }
        L_0x0040:
            goto L_0x04df
        L_0x0042:
            boolean r6 = r15.mo35705H(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = p000.q47.m50234G(r1, r9)
            com.google.crypto.tink.shaded.protobuf.c0 r6 = (com.google.crypto.tink.shaded.protobuf.C4705c0) r6
            com.google.crypto.tink.shaded.protobuf.j0 r7 = r15.mo35747u(r4)
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37237t(r8, r6, r7)
            goto L_0x03c4
        L_0x0058:
            boolean r6 = r15.mo35705H(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            long r6 = m37663Z(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37208R(r8, r6)
            goto L_0x03c4
        L_0x0068:
            boolean r6 = r15.mo35705H(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = m37662Y(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37206P(r8, r6)
            goto L_0x03c4
        L_0x0078:
            boolean r6 = r15.mo35705H(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37204N(r8, r13)
            goto L_0x03c4
        L_0x0084:
            boolean r6 = r15.mo35705H(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37202L(r8, r3)
            goto L_0x03c4
        L_0x0090:
            boolean r6 = r15.mo35705H(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = m37662Y(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37229l(r8, r6)
            goto L_0x03c4
        L_0x00a0:
            boolean r6 = r15.mo35705H(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = m37662Y(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37213W(r8, r6)
            goto L_0x03c4
        L_0x00b0:
            boolean r6 = r15.mo35705H(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = p000.q47.m50234G(r1, r9)
            com.google.crypto.tink.shaded.protobuf.ByteString r6 = (com.google.crypto.tink.shaded.protobuf.ByteString) r6
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37225h(r8, r6)
            goto L_0x03c4
        L_0x00c2:
            boolean r6 = r15.mo35705H(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = p000.q47.m50234G(r1, r9)
            com.google.crypto.tink.shaded.protobuf.j0 r7 = r15.mo35747u(r4)
            int r6 = com.google.crypto.tink.shaded.protobuf.C4733k0.m38162o(r8, r6, r7)
            goto L_0x03c4
        L_0x00d6:
            boolean r6 = r15.mo35705H(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = p000.q47.m50234G(r1, r9)
            boolean r7 = r6 instanceof com.google.crypto.tink.shaded.protobuf.ByteString
            if (r7 == 0) goto L_0x00ec
            com.google.crypto.tink.shaded.protobuf.ByteString r6 = (com.google.crypto.tink.shaded.protobuf.ByteString) r6
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37225h(r8, r6)
            goto L_0x03c4
        L_0x00ec:
            java.lang.String r6 = (java.lang.String) r6
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37210T(r8, r6)
            goto L_0x03c4
        L_0x00f4:
            boolean r6 = r15.mo35705H(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37220e(r8, r11)
            goto L_0x03c4
        L_0x0100:
            boolean r6 = r15.mo35705H(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37231n(r8, r3)
            goto L_0x03c4
        L_0x010c:
            boolean r6 = r15.mo35705H(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37233p(r8, r13)
            goto L_0x03c4
        L_0x0118:
            boolean r6 = r15.mo35705H(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = m37662Y(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37240w(r8, r6)
            goto L_0x03c4
        L_0x0128:
            boolean r6 = r15.mo35705H(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            long r6 = m37663Z(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37215Y(r8, r6)
            goto L_0x03c4
        L_0x0138:
            boolean r6 = r15.mo35705H(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            long r6 = m37663Z(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37242y(r8, r6)
            goto L_0x03c4
        L_0x0148:
            boolean r6 = r15.mo35705H(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37235r(r8, r12)
            goto L_0x03c4
        L_0x0154:
            boolean r6 = r15.mo35705H(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            r6 = 0
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37227j(r8, r6)
            goto L_0x03c4
        L_0x0162:
            com.google.crypto.tink.shaded.protobuf.a0 r6 = r0.f25171q
            java.lang.Object r7 = p000.q47.m50234G(r1, r9)
            java.lang.Object r9 = r15.mo35745t(r4)
            int r6 = r6.mo35614g(r8, r7, r9)
            goto L_0x03c4
        L_0x0172:
            java.util.List r6 = m37653J(r1, r9)
            com.google.crypto.tink.shaded.protobuf.j0 r7 = r15.mo35747u(r4)
            int r6 = com.google.crypto.tink.shaded.protobuf.C4733k0.m38157j(r8, r6, r7)
            goto L_0x03c4
        L_0x0180:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.C4733k0.m38167t(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f25163i
            if (r9 == 0) goto L_0x0194
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x0194:
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37212V(r8)
            int r8 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37214X(r7)
            goto L_0x031f
        L_0x019e:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.C4733k0.m38165r(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f25163i
            if (r9 == 0) goto L_0x01b2
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x01b2:
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37212V(r8)
            int r8 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37214X(r7)
            goto L_0x031f
        L_0x01bc:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.C4733k0.m38156i(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f25163i
            if (r9 == 0) goto L_0x01d0
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x01d0:
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37212V(r8)
            int r8 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37214X(r7)
            goto L_0x031f
        L_0x01da:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.C4733k0.m38154g(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f25163i
            if (r9 == 0) goto L_0x01ee
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x01ee:
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37212V(r8)
            int r8 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37214X(r7)
            goto L_0x031f
        L_0x01f8:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.C4733k0.m38151e(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f25163i
            if (r9 == 0) goto L_0x020c
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x020c:
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37212V(r8)
            int r8 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37214X(r7)
            goto L_0x031f
        L_0x0216:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.C4733k0.m38170w(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f25163i
            if (r9 == 0) goto L_0x022a
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x022a:
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37212V(r8)
            int r8 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37214X(r7)
            goto L_0x031f
        L_0x0234:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.C4733k0.m38145b(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f25163i
            if (r9 == 0) goto L_0x0248
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x0248:
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37212V(r8)
            int r8 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37214X(r7)
            goto L_0x031f
        L_0x0252:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.C4733k0.m38154g(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f25163i
            if (r9 == 0) goto L_0x0266
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x0266:
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37212V(r8)
            int r8 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37214X(r7)
            goto L_0x031f
        L_0x0270:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.C4733k0.m38156i(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f25163i
            if (r9 == 0) goto L_0x0284
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x0284:
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37212V(r8)
            int r8 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37214X(r7)
            goto L_0x031f
        L_0x028e:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.C4733k0.m38159l(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f25163i
            if (r9 == 0) goto L_0x02a2
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x02a2:
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37212V(r8)
            int r8 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37214X(r7)
            goto L_0x031f
        L_0x02ac:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.C4733k0.m38172y(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f25163i
            if (r9 == 0) goto L_0x02c0
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x02c0:
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37212V(r8)
            int r8 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37214X(r7)
            goto L_0x031f
        L_0x02c9:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.C4733k0.m38161n(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f25163i
            if (r9 == 0) goto L_0x02dd
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x02dd:
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37212V(r8)
            int r8 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37214X(r7)
            goto L_0x031f
        L_0x02e6:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.C4733k0.m38154g(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f25163i
            if (r9 == 0) goto L_0x02fa
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x02fa:
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37212V(r8)
            int r8 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37214X(r7)
            goto L_0x031f
        L_0x0303:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.C4733k0.m38156i(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f25163i
            if (r9 == 0) goto L_0x0317
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x0317:
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37212V(r8)
            int r8 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37214X(r7)
        L_0x031f:
            int r6 = r6 + r8
            int r6 = r6 + r7
            goto L_0x03c4
        L_0x0323:
            java.util.List r6 = m37653J(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.C4733k0.m38166s(r8, r6, r3)
            goto L_0x03c4
        L_0x032d:
            java.util.List r6 = m37653J(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.C4733k0.m38164q(r8, r6, r3)
            goto L_0x03c4
        L_0x0337:
            java.util.List r6 = m37653J(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.C4733k0.m38155h(r8, r6, r3)
            goto L_0x03c4
        L_0x0341:
            java.util.List r6 = m37653J(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.C4733k0.m38153f(r8, r6, r3)
            goto L_0x03c4
        L_0x034b:
            java.util.List r6 = m37653J(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.C4733k0.m38149d(r8, r6, r3)
            goto L_0x03c4
        L_0x0355:
            java.util.List r6 = m37653J(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.C4733k0.m38169v(r8, r6, r3)
            goto L_0x03c4
        L_0x035e:
            java.util.List r6 = m37653J(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.C4733k0.m38147c(r8, r6)
            goto L_0x03c4
        L_0x0367:
            java.util.List r6 = m37653J(r1, r9)
            com.google.crypto.tink.shaded.protobuf.j0 r7 = r15.mo35747u(r4)
            int r6 = com.google.crypto.tink.shaded.protobuf.C4733k0.m38163p(r8, r6, r7)
            goto L_0x03c4
        L_0x0374:
            java.util.List r6 = m37653J(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.C4733k0.m38168u(r8, r6)
            goto L_0x03c4
        L_0x037d:
            java.util.List r6 = m37653J(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.C4733k0.m38143a(r8, r6, r3)
            goto L_0x03c4
        L_0x0386:
            java.util.List r6 = m37653J(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.C4733k0.m38153f(r8, r6, r3)
            goto L_0x03c4
        L_0x038f:
            java.util.List r6 = m37653J(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.C4733k0.m38155h(r8, r6, r3)
            goto L_0x03c4
        L_0x0398:
            java.util.List r6 = m37653J(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.C4733k0.m38158k(r8, r6, r3)
            goto L_0x03c4
        L_0x03a1:
            java.util.List r6 = m37653J(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.C4733k0.m38171x(r8, r6, r3)
            goto L_0x03c4
        L_0x03aa:
            java.util.List r6 = m37653J(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.C4733k0.m38160m(r8, r6, r3)
            goto L_0x03c4
        L_0x03b3:
            java.util.List r6 = m37653J(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.C4733k0.m38153f(r8, r6, r3)
            goto L_0x03c4
        L_0x03bc:
            java.util.List r6 = m37653J(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.C4733k0.m38155h(r8, r6, r3)
        L_0x03c4:
            int r5 = r5 + r6
            goto L_0x04df
        L_0x03c7:
            boolean r6 = r15.mo35700B(r1, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = p000.q47.m50234G(r1, r9)
            com.google.crypto.tink.shaded.protobuf.c0 r6 = (com.google.crypto.tink.shaded.protobuf.C4705c0) r6
            com.google.crypto.tink.shaded.protobuf.j0 r7 = r15.mo35747u(r4)
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37237t(r8, r6, r7)
            goto L_0x03c4
        L_0x03dc:
            boolean r6 = r15.mo35700B(r1, r4)
            if (r6 == 0) goto L_0x04df
            long r6 = p000.q47.m50232E(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37208R(r8, r6)
            goto L_0x03c4
        L_0x03eb:
            boolean r6 = r15.mo35700B(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = p000.q47.m50230C(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37206P(r8, r6)
            goto L_0x03c4
        L_0x03fa:
            boolean r6 = r15.mo35700B(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37204N(r8, r13)
            goto L_0x03c4
        L_0x0405:
            boolean r6 = r15.mo35700B(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37202L(r8, r3)
            goto L_0x03c4
        L_0x0410:
            boolean r6 = r15.mo35700B(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = p000.q47.m50230C(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37229l(r8, r6)
            goto L_0x03c4
        L_0x041f:
            boolean r6 = r15.mo35700B(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = p000.q47.m50230C(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37213W(r8, r6)
            goto L_0x03c4
        L_0x042e:
            boolean r6 = r15.mo35700B(r1, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = p000.q47.m50234G(r1, r9)
            com.google.crypto.tink.shaded.protobuf.ByteString r6 = (com.google.crypto.tink.shaded.protobuf.ByteString) r6
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37225h(r8, r6)
            goto L_0x03c4
        L_0x043f:
            boolean r6 = r15.mo35700B(r1, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = p000.q47.m50234G(r1, r9)
            com.google.crypto.tink.shaded.protobuf.j0 r7 = r15.mo35747u(r4)
            int r6 = com.google.crypto.tink.shaded.protobuf.C4733k0.m38162o(r8, r6, r7)
            goto L_0x03c4
        L_0x0453:
            boolean r6 = r15.mo35700B(r1, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = p000.q47.m50234G(r1, r9)
            boolean r7 = r6 instanceof com.google.crypto.tink.shaded.protobuf.ByteString
            if (r7 == 0) goto L_0x0469
            com.google.crypto.tink.shaded.protobuf.ByteString r6 = (com.google.crypto.tink.shaded.protobuf.ByteString) r6
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37225h(r8, r6)
            goto L_0x03c4
        L_0x0469:
            java.lang.String r6 = (java.lang.String) r6
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37210T(r8, r6)
            goto L_0x03c4
        L_0x0471:
            boolean r6 = r15.mo35700B(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37220e(r8, r11)
            goto L_0x03c4
        L_0x047d:
            boolean r6 = r15.mo35700B(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37231n(r8, r3)
            goto L_0x03c4
        L_0x0489:
            boolean r6 = r15.mo35700B(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37233p(r8, r13)
            goto L_0x03c4
        L_0x0495:
            boolean r6 = r15.mo35700B(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = p000.q47.m50230C(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37240w(r8, r6)
            goto L_0x03c4
        L_0x04a5:
            boolean r6 = r15.mo35700B(r1, r4)
            if (r6 == 0) goto L_0x04df
            long r6 = p000.q47.m50232E(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37215Y(r8, r6)
            goto L_0x03c4
        L_0x04b5:
            boolean r6 = r15.mo35700B(r1, r4)
            if (r6 == 0) goto L_0x04df
            long r6 = p000.q47.m50232E(r1, r9)
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37242y(r8, r6)
            goto L_0x03c4
        L_0x04c5:
            boolean r6 = r15.mo35700B(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37235r(r8, r12)
            goto L_0x03c4
        L_0x04d1:
            boolean r6 = r15.mo35700B(r1, r4)
            if (r6 == 0) goto L_0x04df
            r6 = 0
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.m37227j(r8, r6)
            goto L_0x03c4
        L_0x04df:
            int r4 = r4 + 3
            goto L_0x0008
        L_0x04e3:
            com.google.crypto.tink.shaded.protobuf.m0<?, ?> r2 = r0.f25169o
            int r1 = r15.mo35754y(r2, r1)
            int r5 = r5 + r1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C4714e0.mo35752x(java.lang.Object):int");
    }

    /* renamed from: x0 */
    public final <UT, UB> void mo35753x0(C4747m0<UT, UB> m0Var, T t, Writer writer) throws IOException {
        m0Var.mo28868t(m0Var.mo28857g(t), writer);
    }

    /* renamed from: y */
    public final <UT, UB> int mo35754y(C4747m0<UT, UB> m0Var, T t) {
        return m0Var.mo28858h(m0Var.mo28857g(t));
    }
}
