package com.walletconnect.foundation.network.data.adapter;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H@"}, mo44877d2 = {"T", "La52;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "com.walletconnect.foundation.network.data.adapter.FlowStreamAdapter$adapt$1", mo48632f = "FlowStreamAdapter.kt", mo48633l = {37, 15}, mo48634m = "invokeSuspend")
/* compiled from: FlowStreamAdapter.kt */
public final class FlowStreamAdapter$adapt$1 extends SuspendLambda implements fd2<a52<? super T>, ns0<? super r37>, Object> {
    public final /* synthetic */ ia6<T> $stream;
    private /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowStreamAdapter$adapt$1(ia6<T> ia6, ns0<? super FlowStreamAdapter$adapt$1> ns0) {
        super(2, ns0);
        this.$stream = ia6;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        FlowStreamAdapter$adapt$1 flowStreamAdapter$adapt$1 = new FlowStreamAdapter$adapt$1(this.$stream, ns0);
        flowStreamAdapter$adapt$1.L$0 = obj;
        return flowStreamAdapter$adapt$1;
    }

    public final Object invoke(a52<? super T> a52, ns0<? super r37> ns0) {
        return ((FlowStreamAdapter$adapt$1) create(a52, ns0)).invokeSuspend(r37.f33317a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0087, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0088, code lost:
        p000.rd0.m71508a(r5, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008b, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005b A[Catch:{ all -> 0x0087 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0067 A[Catch:{ all -> 0x0087 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = p000.wx2.m54101d()
            int r1 = r9.label
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x0039
            if (r1 == r4) goto L_0x0028
            if (r1 != r3) goto L_0x0020
            java.lang.Object r1 = r9.L$2
            md0 r1 = (p000.md0) r1
            java.lang.Object r5 = r9.L$1
            z75 r5 = (p000.z75) r5
            java.lang.Object r6 = r9.L$0
            a52 r6 = (p000.a52) r6
            p000.hg5.m45199b(r10)     // Catch:{ all -> 0x0085 }
            r10 = r6
            goto L_0x004b
        L_0x0020:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x0028:
            java.lang.Object r1 = r9.L$2
            md0 r1 = (p000.md0) r1
            java.lang.Object r5 = r9.L$1
            z75 r5 = (p000.z75) r5
            java.lang.Object r6 = r9.L$0
            a52 r6 = (p000.a52) r6
            p000.hg5.m45199b(r10)     // Catch:{ all -> 0x0085 }
            r7 = r9
            goto L_0x005f
        L_0x0039:
            p000.hg5.m45199b(r10)
            java.lang.Object r10 = r9.L$0
            a52 r10 = (p000.a52) r10
            ia6<T> r1 = r9.$stream
            r5 = 0
            z75 r5 = p000.nd0.m64628b(r1, r5, r4, r2)
            md0 r1 = r5.iterator()     // Catch:{ all -> 0x0085 }
        L_0x004b:
            r6 = r9
        L_0x004c:
            r6.L$0 = r10     // Catch:{ all -> 0x0085 }
            r6.L$1 = r5     // Catch:{ all -> 0x0085 }
            r6.L$2 = r1     // Catch:{ all -> 0x0085 }
            r6.label = r4     // Catch:{ all -> 0x0085 }
            java.lang.Object r7 = r1.mo55581a(r6)     // Catch:{ all -> 0x0085 }
            if (r7 != r0) goto L_0x005b
            return r0
        L_0x005b:
            r8 = r6
            r6 = r10
            r10 = r7
            r7 = r8
        L_0x005f:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ all -> 0x0085 }
            boolean r10 = r10.booleanValue()     // Catch:{ all -> 0x0085 }
            if (r10 == 0) goto L_0x007d
            java.lang.Object r10 = r1.next()     // Catch:{ all -> 0x0085 }
            r7.L$0 = r6     // Catch:{ all -> 0x0085 }
            r7.L$1 = r5     // Catch:{ all -> 0x0085 }
            r7.L$2 = r1     // Catch:{ all -> 0x0085 }
            r7.label = r3     // Catch:{ all -> 0x0085 }
            java.lang.Object r10 = r6.emit(r10, r7)     // Catch:{ all -> 0x0085 }
            if (r10 != r0) goto L_0x007a
            return r0
        L_0x007a:
            r10 = r6
            r6 = r7
            goto L_0x004c
        L_0x007d:
            r37 r10 = p000.r37.f33317a     // Catch:{ all -> 0x0085 }
            p000.rd0.m71508a(r5, r2)
            r37 r10 = p000.r37.f33317a
            return r10
        L_0x0085:
            r10 = move-exception
            throw r10     // Catch:{ all -> 0x0087 }
        L_0x0087:
            r0 = move-exception
            p000.rd0.m71508a(r5, r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.walletconnect.foundation.network.data.adapter.FlowStreamAdapter$adapt$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
