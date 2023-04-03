package net.safemoon.androidwallet.viewmodels;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.SwapMigrationViewModel$approve$1", mo48632f = "SwapMigrationViewModel.kt", mo48633l = {185}, mo48634m = "invokeSuspend")
/* compiled from: SwapMigrationViewModel.kt */
public final class SwapMigrationViewModel$approve$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public int label;
    public final /* synthetic */ SwapMigrationViewModel this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    @v21(mo48631c = "net.safemoon.androidwallet.viewmodels.SwapMigrationViewModel$approve$1$1", mo48632f = "SwapMigrationViewModel.kt", mo48633l = {188}, mo48634m = "invokeSuspend")
    /* renamed from: net.safemoon.androidwallet.viewmodels.SwapMigrationViewModel$approve$1$1 */
    /* compiled from: SwapMigrationViewModel.kt */
    public static final class C87421 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
        public int label;

        public final ns0<r37> create(Object obj, ns0<?> ns0) {
            return new C87421(swapMigrationViewModel, ns0);
        }

        public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
            return ((C87421) create(hu0, ns0)).invokeSuspend(r37.f33317a);
        }

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0048 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            /*
                r3 = this;
                java.lang.Object r0 = p000.wx2.m54101d()
                int r1 = r3.label
                r2 = 1
                if (r1 == 0) goto L_0x0019
                if (r1 != r2) goto L_0x0011
                p000.hg5.m45199b(r4)     // Catch:{ Exception -> 0x0048 }
                goto L_0x0039
            L_0x000f:
                r4 = move-exception
                goto L_0x0065
            L_0x0011:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L_0x0019:
                p000.hg5.m45199b(r4)
                net.safemoon.androidwallet.viewmodels.SwapMigrationViewModel r4 = r3
                k04 r4 = r4.mo61440F()
                net.safemoon.androidwallet.model.common.LoadingState r1 = net.safemoon.androidwallet.model.common.LoadingState.Loading
                r4.postValue(r1)
                net.safemoon.androidwallet.viewmodels.SwapMigrationViewModel r4 = r3     // Catch:{ Exception -> 0x0048 }
                net.safemoon.androidwallet.viewmodels.blockChainClass.MigrationToV2 r4 = r4.f42873w     // Catch:{ Exception -> 0x0048 }
                p000.vx2.m53588d(r4)     // Catch:{ Exception -> 0x0048 }
                r3.label = r2     // Catch:{ Exception -> 0x0048 }
                java.lang.Object r4 = r4.mo61814e(r3)     // Catch:{ Exception -> 0x0048 }
                if (r4 != r0) goto L_0x0039
                return r0
            L_0x0039:
                ss1 r4 = (p000.ss1) r4     // Catch:{ Exception -> 0x0048 }
                net.safemoon.androidwallet.viewmodels.SwapMigrationViewModel r0 = r3     // Catch:{ Exception -> 0x0048 }
                java.lang.String r4 = r4.getTransactionHash()     // Catch:{ Exception -> 0x0048 }
                p000.vx2.m53588d(r4)     // Catch:{ Exception -> 0x0048 }
                r0.mo61483z(r4)     // Catch:{ Exception -> 0x0048 }
                goto L_0x0057
            L_0x0048:
                net.safemoon.androidwallet.viewmodels.SwapMigrationViewModel r4 = r3     // Catch:{ all -> 0x000f }
                k04 r4 = r4.mo61466f0()     // Catch:{ all -> 0x000f }
                r0 = 0
                r4.postValue(r0)     // Catch:{ all -> 0x000f }
                net.safemoon.androidwallet.viewmodels.SwapMigrationViewModel r4 = r3     // Catch:{ all -> 0x000f }
                r4.mo61477u0()     // Catch:{ all -> 0x000f }
            L_0x0057:
                net.safemoon.androidwallet.viewmodels.SwapMigrationViewModel r4 = r3
                k04 r4 = r4.mo61440F()
                net.safemoon.androidwallet.model.common.LoadingState r0 = net.safemoon.androidwallet.model.common.LoadingState.Normal
                r4.postValue(r0)
                r37 r4 = p000.r37.f33317a
                return r4
            L_0x0065:
                net.safemoon.androidwallet.viewmodels.SwapMigrationViewModel r0 = r3
                k04 r0 = r0.mo61440F()
                net.safemoon.androidwallet.model.common.LoadingState r1 = net.safemoon.androidwallet.model.common.LoadingState.Normal
                r0.postValue(r1)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.SwapMigrationViewModel$approve$1.C87421.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwapMigrationViewModel$approve$1(SwapMigrationViewModel swapMigrationViewModel, ns0<? super SwapMigrationViewModel$approve$1> ns0) {
        super(2, ns0);
        this.this$0 = swapMigrationViewModel;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new SwapMigrationViewModel$approve$1(this.this$0, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((SwapMigrationViewModel$approve$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            CoroutineDispatcher b = qh1.m71265b();
            final SwapMigrationViewModel swapMigrationViewModel = this.this$0;
            C87421 r1 = new C87421((ns0<? super C87421>) null);
            this.label = 1;
            if (b50.m55768e(b, r1, this) == d) {
                return d;
            }
        } else if (i == 1) {
            hg5.m45199b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return r37.f33317a;
    }
}
