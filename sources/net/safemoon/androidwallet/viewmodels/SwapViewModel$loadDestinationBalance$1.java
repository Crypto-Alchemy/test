package net.safemoon.androidwallet.viewmodels;

import java.math.BigInteger;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;
import net.safemoon.androidwallet.model.swap.Swap;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.SwapViewModel$loadDestinationBalance$1", mo48632f = "SwapViewModel.kt", mo48633l = {423}, mo48634m = "invokeSuspend")
/* compiled from: SwapViewModel.kt */
public final class SwapViewModel$loadDestinationBalance$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ Swap $swap;
    public int label;
    public final /* synthetic */ SwapViewModel this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    @v21(mo48631c = "net.safemoon.androidwallet.viewmodels.SwapViewModel$loadDestinationBalance$1$1", mo48632f = "SwapViewModel.kt", mo48633l = {443}, mo48634m = "invokeSuspend")
    /* renamed from: net.safemoon.androidwallet.viewmodels.SwapViewModel$loadDestinationBalance$1$1 */
    /* compiled from: SwapViewModel.kt */
    public static final class C88331 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
        public int label;

        public final ns0<r37> create(Object obj, ns0<?> ns0) {
            return new C88331(swap, swapViewModel, ns0);
        }

        public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
            return ((C88331) create(hu0, ns0)).invokeSuspend(r37.f33317a);
        }

        public final Object invokeSuspend(Object obj) {
            Object d = wx2.m54101d();
            int i = this.label;
            if (i == 0) {
                hg5.m45199b(obj);
                final Swap swap = swap;
                final SwapViewModel swapViewModel = swapViewModel;
                z42 t = e52.m57228t(new fd2<a52<? super BigInteger>, ns0<? super r37>, Object>((ns0<? super C88341>) null) {
                    private /* synthetic */ Object L$0;
                    public int label;

                    public final ns0<r37> create(Object obj, ns0<?> ns0) {
                        C88341 r0 = 

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        public SwapViewModel$loadDestinationBalance$1(Swap swap, SwapViewModel swapViewModel, ns0<? super SwapViewModel$loadDestinationBalance$1> ns0) {
                            super(2, ns0);
                            this.$swap = swap;
                            this.this$0 = swapViewModel;
                        }

                        public final ns0<r37> create(Object obj, ns0<?> ns0) {
                            return new SwapViewModel$loadDestinationBalance$1(this.$swap, this.this$0, ns0);
                        }

                        public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
                            return ((SwapViewModel$loadDestinationBalance$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
                        }

                        public final Object invokeSuspend(Object obj) {
                            Object d = wx2.m54101d();
                            int i = this.label;
                            if (i == 0) {
                                hg5.m45199b(obj);
                                CoroutineDispatcher b = qh1.m71265b();
                                final Swap swap = this.$swap;
                                final SwapViewModel swapViewModel = this.this$0;
                                C88331 r1 = new C88331((ns0<? super C88331>) null);
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
