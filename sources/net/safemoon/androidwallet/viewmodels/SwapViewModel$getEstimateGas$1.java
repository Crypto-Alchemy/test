package net.safemoon.androidwallet.viewmodels;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;
import net.safemoon.androidwallet.viewmodels.SwapViewModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.SwapViewModel$getEstimateGas$1", mo48632f = "SwapViewModel.kt", mo48633l = {539}, mo48634m = "invokeSuspend")
/* compiled from: SwapViewModel.kt */
public final class SwapViewModel$getEstimateGas$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public int label;
    public final /* synthetic */ SwapViewModel this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    @v21(mo48631c = "net.safemoon.androidwallet.viewmodels.SwapViewModel$getEstimateGas$1$1", mo48632f = "SwapViewModel.kt", mo48633l = {956}, mo48634m = "invokeSuspend")
    /* renamed from: net.safemoon.androidwallet.viewmodels.SwapViewModel$getEstimateGas$1$1 */
    /* compiled from: SwapViewModel.kt */
    public static final class C88131 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
        public int label;

        public final ns0<r37> create(Object obj, ns0<?> ns0) {
            return new C88131(swapViewModel, ns0);
        }

        public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
            return ((C88131) create(hu0, ns0)).invokeSuspend(r37.f33317a);
        }

        public final Object invokeSuspend(Object obj) {
            Object d = wx2.m54101d();
            int i = this.label;
            if (i == 0) {
                hg5.m45199b(obj);
                final SwapViewModel swapViewModel = swapViewModel;
                z42 t = e52.m57228t(new fd2<a52<? super SwapViewModel.C8789d>, ns0<? super r37>, Object>((ns0<? super C88141>) null) {
                    private /* synthetic */ Object L$0;
                    public Object L$1;
                    public Object L$2;
                    public Object L$3;
                    public int label;

                    public final ns0<r37> create(Object obj, ns0<?> ns0) {
                        C88141 r0 = 

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        public SwapViewModel$getEstimateGas$1(SwapViewModel swapViewModel, ns0<? super SwapViewModel$getEstimateGas$1> ns0) {
                            super(2, ns0);
                            this.this$0 = swapViewModel;
                        }

                        public final ns0<r37> create(Object obj, ns0<?> ns0) {
                            return new SwapViewModel$getEstimateGas$1(this.this$0, ns0);
                        }

                        public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
                            return ((SwapViewModel$getEstimateGas$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
                        }

                        public final Object invokeSuspend(Object obj) {
                            Object d = wx2.m54101d();
                            int i = this.label;
                            if (i == 0) {
                                hg5.m45199b(obj);
                                CoroutineDispatcher b = qh1.m71265b();
                                final SwapViewModel swapViewModel = this.this$0;
                                C88131 r1 = new C88131((ns0<? super C88131>) null);
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
