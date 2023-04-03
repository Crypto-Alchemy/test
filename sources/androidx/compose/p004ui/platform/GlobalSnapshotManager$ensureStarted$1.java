package androidx.compose.p004ui.platform;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1", mo48632f = "GlobalSnapshotManager.android.kt", mo48633l = {63}, mo48634m = "invokeSuspend")
/* renamed from: androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1 */
/* compiled from: GlobalSnapshotManager.android.kt */
public final class GlobalSnapshotManager$ensureStarted$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ fd0<r37> $channel;
    public Object L$0;
    public Object L$1;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GlobalSnapshotManager$ensureStarted$1(fd0<r37> fd0, ns0<? super GlobalSnapshotManager$ensureStarted$1> ns0) {
        super(2, ns0);
        this.$channel = fd0;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new GlobalSnapshotManager$ensureStarted$1(this.$channel, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((GlobalSnapshotManager$ensureStarted$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004a A[Catch:{ all -> 0x0060 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = p000.wx2.m54101d()
            int r1 = r7.label
            r2 = 1
            if (r1 == 0) goto L_0x0023
            if (r1 != r2) goto L_0x001b
            java.lang.Object r1 = r7.L$1
            md0 r1 = (p000.md0) r1
            java.lang.Object r3 = r7.L$0
            z75 r3 = (p000.z75) r3
            p000.hg5.m45199b(r8)     // Catch:{ all -> 0x0063 }
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r7
            goto L_0x0041
        L_0x001b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0023:
            p000.hg5.m45199b(r8)
            fd0<r37> r3 = r7.$channel
            md0 r8 = r3.iterator()     // Catch:{ all -> 0x0063 }
            r1 = r8
            r8 = r7
        L_0x002e:
            r8.L$0 = r3     // Catch:{ all -> 0x0063 }
            r8.L$1 = r1     // Catch:{ all -> 0x0063 }
            r8.label = r2     // Catch:{ all -> 0x0063 }
            java.lang.Object r4 = r1.mo55581a(r8)     // Catch:{ all -> 0x0063 }
            if (r4 != r0) goto L_0x003b
            return r0
        L_0x003b:
            r6 = r0
            r0 = r8
            r8 = r4
            r4 = r3
            r3 = r1
            r1 = r6
        L_0x0041:
            r5 = 0
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ all -> 0x0060 }
            boolean r8 = r8.booleanValue()     // Catch:{ all -> 0x0060 }
            if (r8 == 0) goto L_0x005a
            java.lang.Object r8 = r3.next()     // Catch:{ all -> 0x0060 }
            r37 r8 = (p000.r37) r8     // Catch:{ all -> 0x0060 }
            a56$a r8 = p000.a56.f41e     // Catch:{ all -> 0x0060 }
            r8.mo68g()     // Catch:{ all -> 0x0060 }
            r8 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L_0x002e
        L_0x005a:
            p000.rd0.m71508a(r4, r5)
            r37 r8 = p000.r37.f33317a
            return r8
        L_0x0060:
            r8 = move-exception
            r3 = r4
            goto L_0x0064
        L_0x0063:
            r8 = move-exception
        L_0x0064:
            throw r8     // Catch:{ all -> 0x0065 }
        L_0x0065:
            r0 = move-exception
            p000.rd0.m71508a(r3, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.platform.GlobalSnapshotManager$ensureStarted$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
