package net.safemoon.androidwallet.viewmodels;

import java.math.BigInteger;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;
import net.safemoon.androidwallet.model.swap.Swap;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.SwapMigrationViewModel$loadDestinationBalance$1", mo48632f = "SwapMigrationViewModel.kt", mo48633l = {337}, mo48634m = "invokeSuspend")
/* compiled from: SwapMigrationViewModel.kt */
public final class SwapMigrationViewModel$loadDestinationBalance$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ Swap $swap;
    public int label;
    public final /* synthetic */ SwapMigrationViewModel this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    @v21(mo48631c = "net.safemoon.androidwallet.viewmodels.SwapMigrationViewModel$loadDestinationBalance$1$1", mo48632f = "SwapMigrationViewModel.kt", mo48633l = {356}, mo48634m = "invokeSuspend")
    /* renamed from: net.safemoon.androidwallet.viewmodels.SwapMigrationViewModel$loadDestinationBalance$1$1 */
    /* compiled from: SwapMigrationViewModel.kt */
    public static final class C87601 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
        public int label;

        public final ns0<r37> create(Object obj, ns0<?> ns0) {
            return new C87601(swap, swapMigrationViewModel, ns0);
        }

        public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
            return ((C87601) create(hu0, ns0)).invokeSuspend(r37.f33317a);
        }

        public final Object invokeSuspend(Object obj) {
            Object d = wx2.m54101d();
            int i = this.label;
            if (i == 0) {
                hg5.m45199b(obj);
                final Swap swap = swap;
                final SwapMigrationViewModel swapMigrationViewModel = swapMigrationViewModel;
                z42 f = e52.m57214f(e52.m57228t(new fd2<a52<? super BigInteger>, ns0<? super r37>, Object>((ns0<? super C87611>) null) {
                    private /* synthetic */ Object L$0;
                    public int label;

                    public final ns0<r37> create(Object obj, ns0<?> ns0) {
                        C87611 r0 = 

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        public SwapMigrationViewModel$loadDestinationBalance$1(Swap swap, SwapMigrationViewModel swapMigrationViewModel, ns0<? super SwapMigrationViewModel$loadDestinationBalance$1> ns0) {
                            super(2, ns0);
                            this.$swap = swap;
                            this.this$0 = swapMigrationViewModel;
                        }

                        public final ns0<r37> create(Object obj, ns0<?> ns0) {
                            return new SwapMigrationViewModel$loadDestinationBalance$1(this.$swap, this.this$0, ns0);
                        }

                        public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
                            return ((SwapMigrationViewModel$loadDestinationBalance$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
                        }

                        public final Object invokeSuspend(Object obj) {
                            Object d = wx2.m54101d();
                            int i = this.label;
                            if (i == 0) {
                                hg5.m45199b(obj);
                                CoroutineDispatcher b = qh1.m71265b();
                                final Swap swap = this.$swap;
                                final SwapMigrationViewModel swapMigrationViewModel = this.this$0;
                                C87601 r1 = new C87601((ns0<? super C87601>) null);
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
