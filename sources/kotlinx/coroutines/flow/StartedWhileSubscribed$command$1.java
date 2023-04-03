package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H@"}, mo44877d2 = {"La52;", "Lkotlinx/coroutines/flow/SharingCommand;", "", "count", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 6, 0})
@v21(mo48631c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1", mo48632f = "SharingStarted.kt", mo48633l = {178, 180, 182, 183, 185}, mo48634m = "invokeSuspend")
/* compiled from: SharingStarted.kt */
public final class StartedWhileSubscribed$command$1 extends SuspendLambda implements id2<a52<? super SharingCommand>, Integer, ns0<? super r37>, Object> {
    public /* synthetic */ int I$0;
    private /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ StartedWhileSubscribed this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StartedWhileSubscribed$command$1(StartedWhileSubscribed startedWhileSubscribed, ns0<? super StartedWhileSubscribed$command$1> ns0) {
        super(3, ns0);
        this.this$0 = startedWhileSubscribed;
    }

    public final Object invoke(a52<? super SharingCommand> a52, int i, ns0<? super r37> ns0) {
        StartedWhileSubscribed$command$1 startedWhileSubscribed$command$1 = new StartedWhileSubscribed$command$1(this.this$0, ns0);
        startedWhileSubscribed$command$1.L$0 = a52;
        startedWhileSubscribed$command$1.I$0 = i;
        return startedWhileSubscribed$command$1.invokeSuspend(r37.f33317a);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((a52<? super SharingCommand>) (a52) obj, ((Number) obj2).intValue(), (ns0<? super r37>) (ns0) obj3);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: a52} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009b A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = p000.wx2.m54101d()
            int r1 = r9.label
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L_0x003c
            if (r1 == r6) goto L_0x0038
            if (r1 == r5) goto L_0x0030
            if (r1 == r4) goto L_0x0028
            if (r1 == r3) goto L_0x0020
            if (r1 != r2) goto L_0x0018
            goto L_0x0038
        L_0x0018:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x0020:
            java.lang.Object r1 = r9.L$0
            a52 r1 = (p000.a52) r1
            p000.hg5.m45199b(r10)
            goto L_0x008e
        L_0x0028:
            java.lang.Object r1 = r9.L$0
            a52 r1 = (p000.a52) r1
            p000.hg5.m45199b(r10)
            goto L_0x007d
        L_0x0030:
            java.lang.Object r1 = r9.L$0
            a52 r1 = (p000.a52) r1
            p000.hg5.m45199b(r10)
            goto L_0x0064
        L_0x0038:
            p000.hg5.m45199b(r10)
            goto L_0x009c
        L_0x003c:
            p000.hg5.m45199b(r10)
            java.lang.Object r10 = r9.L$0
            r1 = r10
            a52 r1 = (p000.a52) r1
            int r10 = r9.I$0
            if (r10 <= 0) goto L_0x0053
            kotlinx.coroutines.flow.SharingCommand r10 = kotlinx.coroutines.flow.SharingCommand.START
            r9.label = r6
            java.lang.Object r10 = r1.emit(r10, r9)
            if (r10 != r0) goto L_0x009c
            return r0
        L_0x0053:
            kotlinx.coroutines.flow.StartedWhileSubscribed r10 = r9.this$0
            long r6 = r10.f40447b
            r9.L$0 = r1
            r9.label = r5
            java.lang.Object r10 = p000.jb1.m59336a(r6, r9)
            if (r10 != r0) goto L_0x0064
            return r0
        L_0x0064:
            kotlinx.coroutines.flow.StartedWhileSubscribed r10 = r9.this$0
            long r5 = r10.f40448c
            r7 = 0
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 <= 0) goto L_0x008e
            kotlinx.coroutines.flow.SharingCommand r10 = kotlinx.coroutines.flow.SharingCommand.STOP
            r9.L$0 = r1
            r9.label = r4
            java.lang.Object r10 = r1.emit(r10, r9)
            if (r10 != r0) goto L_0x007d
            return r0
        L_0x007d:
            kotlinx.coroutines.flow.StartedWhileSubscribed r10 = r9.this$0
            long r4 = r10.f40448c
            r9.L$0 = r1
            r9.label = r3
            java.lang.Object r10 = p000.jb1.m59336a(r4, r9)
            if (r10 != r0) goto L_0x008e
            return r0
        L_0x008e:
            kotlinx.coroutines.flow.SharingCommand r10 = kotlinx.coroutines.flow.SharingCommand.STOP_AND_RESET_REPLAY_CACHE
            r3 = 0
            r9.L$0 = r3
            r9.label = r2
            java.lang.Object r10 = r1.emit(r10, r9)
            if (r10 != r0) goto L_0x009c
            return r0
        L_0x009c:
            r37 r10 = p000.r37.f33317a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.StartedWhileSubscribed$command$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
