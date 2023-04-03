package net.safemoon.androidwallet.extension;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000&\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001ag\u0010\f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\"\u0010\u000b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\bH@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, mo44877d2 = {"T", "", "times", "", "initialDelay", "maxDelay", "", "factor", "Lkotlin/Function2;", "Lns0;", "", "block", "a", "(IJJDLfd2;Lns0;)Ljava/lang/Object;", "development-V3.40(117)_netMainRelease"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* compiled from: ThreadExtension.kt */
public final class ThreadExtensionKt {
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x008a A[SYNTHETIC, Splitter:B:21:0x008a] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object m66347a(int r19, long r20, long r22, double r24, p000.fd2<? super java.lang.Integer, ? super p000.ns0<? super T>, ? extends java.lang.Object> r26, p000.ns0<? super T> r27) {
        /*
            r0 = r27
            boolean r1 = r0 instanceof net.safemoon.androidwallet.extension.ThreadExtensionKt$retryIO$1
            if (r1 == 0) goto L_0x0015
            r1 = r0
            net.safemoon.androidwallet.extension.ThreadExtensionKt$retryIO$1 r1 = (net.safemoon.androidwallet.extension.ThreadExtensionKt$retryIO$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0015
            int r2 = r2 - r3
            r1.label = r2
            goto L_0x001a
        L_0x0015:
            net.safemoon.androidwallet.extension.ThreadExtensionKt$retryIO$1 r1 = new net.safemoon.androidwallet.extension.ThreadExtensionKt$retryIO$1
            r1.<init>(r0)
        L_0x001a:
            java.lang.Object r0 = r1.result
            java.lang.Object r2 = p000.wx2.m54101d()
            int r3 = r1.label
            r4 = 3
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L_0x006d
            if (r3 == r6) goto L_0x0059
            if (r3 == r5) goto L_0x003a
            if (r3 != r4) goto L_0x0032
            p000.hg5.m45199b(r0)
            goto L_0x00eb
        L_0x0032:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003a:
            int r3 = r1.I$1
            int r7 = r1.I$0
            double r8 = r1.D$0
            long r10 = r1.J$0
            java.lang.Object r12 = r1.L$1
            kotlin.jvm.internal.Ref$LongRef r12 = (kotlin.jvm.internal.Ref$LongRef) r12
            java.lang.Object r13 = r1.L$0
            fd2 r13 = (p000.fd2) r13
            p000.hg5.m45199b(r0)
        L_0x004d:
            r16 = r8
            r9 = r1
            r0 = r10
            r8 = r12
            r10 = r2
            r11 = r7
            r7 = r3
            r2 = r16
            goto L_0x00c9
        L_0x0059:
            int r3 = r1.I$1
            int r7 = r1.I$0
            double r8 = r1.D$0
            long r10 = r1.J$0
            java.lang.Object r12 = r1.L$1
            kotlin.jvm.internal.Ref$LongRef r12 = (kotlin.jvm.internal.Ref$LongRef) r12
            java.lang.Object r13 = r1.L$0
            fd2 r13 = (p000.fd2) r13
            p000.hg5.m45199b(r0)     // Catch:{ Exception -> 0x00b2 }
            goto L_0x00a3
        L_0x006d:
            p000.hg5.m45199b(r0)
            kotlin.jvm.internal.Ref$LongRef r0 = new kotlin.jvm.internal.Ref$LongRef
            r0.<init>()
            r7 = r20
            r0.element = r7
            int r3 = r19 + 1
            int r3 = r3 - r6
            r7 = 0
            r8 = r0
            r9 = r1
            r10 = r2
            r11 = r3
            r12 = r7
            r0 = r22
            r2 = r24
            r7 = r26
        L_0x0088:
            if (r12 >= r11) goto L_0x00d8
            java.lang.Integer r13 = p000.a40.m31673d(r12)     // Catch:{ Exception -> 0x00a4 }
            r9.L$0 = r7     // Catch:{ Exception -> 0x00a4 }
            r9.L$1 = r8     // Catch:{ Exception -> 0x00a4 }
            r9.J$0 = r0     // Catch:{ Exception -> 0x00a4 }
            r9.D$0 = r2     // Catch:{ Exception -> 0x00a4 }
            r9.I$0 = r11     // Catch:{ Exception -> 0x00a4 }
            r9.I$1 = r12     // Catch:{ Exception -> 0x00a4 }
            r9.label = r6     // Catch:{ Exception -> 0x00a4 }
            java.lang.Object r0 = r7.invoke(r13, r9)     // Catch:{ Exception -> 0x00a4 }
            if (r0 != r10) goto L_0x00a3
            return r10
        L_0x00a3:
            return r0
        L_0x00a4:
            r13 = r7
            r7 = r11
            r16 = r12
            r12 = r8
            r17 = r0
            r1 = r9
            r8 = r2
            r2 = r10
            r3 = r16
            r10 = r17
        L_0x00b2:
            long r14 = r12.element
            r1.L$0 = r13
            r1.L$1 = r12
            r1.J$0 = r10
            r1.D$0 = r8
            r1.I$0 = r7
            r1.I$1 = r3
            r1.label = r5
            java.lang.Object r0 = p000.jb1.m59336a(r14, r1)
            if (r0 != r2) goto L_0x004d
            return r2
        L_0x00c9:
            long r14 = r8.element
            double r14 = (double) r14
            double r14 = r14 * r2
            long r14 = (long) r14
            long r14 = p000.d75.m43386h(r14, r0)
            r8.element = r14
            int r12 = r7 + 1
            r7 = r13
            goto L_0x0088
        L_0x00d8:
            r0 = -1
            java.lang.Integer r0 = p000.a40.m31673d(r0)
            r1 = 0
            r9.L$0 = r1
            r9.L$1 = r1
            r9.label = r4
            java.lang.Object r0 = r7.invoke(r0, r9)
            if (r0 != r10) goto L_0x00eb
            return r10
        L_0x00eb:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.extension.ThreadExtensionKt.m66347a(int, long, long, double, fd2, ns0):java.lang.Object");
    }

    /* renamed from: b */
    public static /* synthetic */ Object m66348b(int i, long j, long j2, double d, fd2 fd2, ns0 ns0, int i2, Object obj) {
        int i3;
        long j3;
        long j4;
        double d2;
        if ((i2 & 1) != 0) {
            i3 = Integer.MAX_VALUE;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            j3 = 500;
        } else {
            j3 = j;
        }
        if ((i2 & 4) != 0) {
            j4 = 3000;
        } else {
            j4 = j2;
        }
        if ((i2 & 8) != 0) {
            d2 = 2.0d;
        } else {
            d2 = d;
        }
        return m66347a(i3, j3, j4, d2, fd2, ns0);
    }
}
