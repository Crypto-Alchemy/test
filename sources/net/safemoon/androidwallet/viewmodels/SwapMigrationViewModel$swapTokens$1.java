package net.safemoon.androidwallet.viewmodels;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;
import net.safemoon.androidwallet.model.common.LoadingState;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.SwapMigrationViewModel$swapTokens$1", mo48632f = "SwapMigrationViewModel.kt", mo48633l = {1363}, mo48634m = "invokeSuspend")
/* compiled from: SwapMigrationViewModel.kt */
public final class SwapMigrationViewModel$swapTokens$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public int label;
    public final /* synthetic */ SwapMigrationViewModel this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    @v21(mo48631c = "net.safemoon.androidwallet.viewmodels.SwapMigrationViewModel$swapTokens$1$1", mo48632f = "SwapMigrationViewModel.kt", mo48633l = {1376}, mo48634m = "invokeSuspend")
    /* renamed from: net.safemoon.androidwallet.viewmodels.SwapMigrationViewModel$swapTokens$1$1 */
    /* compiled from: SwapMigrationViewModel.kt */
    public static final class C87801 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
        public int label;

        public final ns0<r37> create(Object obj, ns0<?> ns0) {
            return new C87801(swapMigrationViewModel, ns0);
        }

        public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
            return ((C87801) create(hu0, ns0)).invokeSuspend(r37.f33317a);
        }

        public final Object invokeSuspend(Object obj) {
            Object d = wx2.m54101d();
            int i = this.label;
            if (i == 0) {
                hg5.m45199b(obj);
                final SwapMigrationViewModel swapMigrationViewModel = swapMigrationViewModel;
                z42 t = e52.m57228t(new fd2<a52<? super au6>, ns0<? super r37>, Object>((ns0<? super C87811>) null) {
                    private /* synthetic */ Object L$0;
                    public int label;

                    public final ns0<r37> create(Object obj, ns0<?> ns0) {
                        C87811 r0 = 

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        public SwapMigrationViewModel$swapTokens$1(SwapMigrationViewModel swapMigrationViewModel, ns0<? super SwapMigrationViewModel$swapTokens$1> ns0) {
                            super(2, ns0);
                            this.this$0 = swapMigrationViewModel;
                        }

                        public final ns0<r37> create(Object obj, ns0<?> ns0) {
                            return new SwapMigrationViewModel$swapTokens$1(this.this$0, ns0);
                        }

                        public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
                            return ((SwapMigrationViewModel$swapTokens$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
                        }

                        public final Object invokeSuspend(Object obj) {
                            Object d = wx2.m54101d();
                            int i = this.label;
                            if (i == 0) {
                                hg5.m45199b(obj);
                                this.this$0.mo61453S().setValue(LoadingState.Loading);
                                CoroutineDispatcher b = qh1.m71265b();
                                final SwapMigrationViewModel swapMigrationViewModel = this.this$0;
                                C87801 r1 = new C87801((ns0<? super C87801>) null);
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
