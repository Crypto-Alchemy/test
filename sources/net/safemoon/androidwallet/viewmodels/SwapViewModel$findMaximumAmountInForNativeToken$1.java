package net.safemoon.androidwallet.viewmodels;

import java.math.BigDecimal;
import java.math.BigInteger;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineDispatcher;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.SwapViewModel$findMaximumAmountInForNativeToken$1", mo48632f = "SwapViewModel.kt", mo48633l = {165}, mo48634m = "invokeSuspend")
/* compiled from: SwapViewModel.kt */
public final class SwapViewModel$findMaximumAmountInForNativeToken$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ BigDecimal $amountIn;
    public final /* synthetic */ j36<BigDecimal> $callBack;
    public int label;
    public final /* synthetic */ SwapViewModel this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    @v21(mo48631c = "net.safemoon.androidwallet.viewmodels.SwapViewModel$findMaximumAmountInForNativeToken$1$1", mo48632f = "SwapViewModel.kt", mo48633l = {227}, mo48634m = "invokeSuspend")
    /* renamed from: net.safemoon.androidwallet.viewmodels.SwapViewModel$findMaximumAmountInForNativeToken$1$1 */
    /* compiled from: SwapViewModel.kt */
    public static final class C88041 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
        public int label;

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Ljava/math/BigInteger;", "it", "Lr37;", "a", "(Ljava/math/BigInteger;Lns0;)Ljava/lang/Object;"}, mo44878k = 3, mo44879mv = {1, 7, 1})
        /* renamed from: net.safemoon.androidwallet.viewmodels.SwapViewModel$findMaximumAmountInForNativeToken$1$1$a */
        /* compiled from: SwapViewModel.kt */
        public static final class C8807a<T> implements a52 {

            /* renamed from: a */
            public final /* synthetic */ SwapViewModel f42962a;

            /* renamed from: d */
            public final /* synthetic */ Ref$ObjectRef<BigInteger> f42963d;

            /* renamed from: e */
            public final /* synthetic */ j36<BigDecimal> f42964e;

            public C8807a(SwapViewModel swapViewModel, Ref$ObjectRef<BigInteger> ref$ObjectRef, j36<BigDecimal> j36) {
                this.f42962a = swapViewModel;
                this.f42963d = ref$ObjectRef;
                this.f42964e = j36;
            }

            /* renamed from: a */
            public final Object emit(BigInteger bigInteger, ns0<? super r37> ns0) {
                if (bigInteger != null) {
                    BigDecimal multiply = new BigDecimal(bigInteger).multiply(new BigDecimal(1.1d));
                    vx2.m53590f(multiply, "this.multiply(other)");
                    BigInteger bigInteger2 = multiply.toBigInteger();
                    BigInteger r = this.f42962a.mo61615k0();
                    vx2.m53590f(r, "getGasPrice()");
                    vx2.m53590f(bigInteger2, "newEstimateGas");
                    BigInteger multiply2 = r.multiply(bigInteger2);
                    vx2.m53590f(multiply2, "this.multiply(other)");
                    BigInteger add = multiply2.add((BigInteger) this.f42963d.element);
                    vx2.m53590f(add, "getGasPrice() * newEstimateGas).add(tradeFee)");
                    BigDecimal r2 = ol0.m70376r(add, 18);
                    j36<BigDecimal> j36 = this.f42964e;
                    vx2.m53590f(r2, "gasLimitAmount");
                    BigDecimal valueOf = BigDecimal.valueOf(0.001d);
                    vx2.m53590f(valueOf, "valueOf(0.001)");
                    BigDecimal add2 = r2.add(valueOf);
                    vx2.m53590f(add2, "this.add(other)");
                    j36.postValue(add2);
                } else {
                    this.f42964e.postValue(null);
                }
                return r37.f33317a;
            }
        }

        public final ns0<r37> create(Object obj, ns0<?> ns0) {
            return new C88041(swapViewModel, bigDecimal, j36, ns0);
        }

        public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
            return ((C88041) create(hu0, ns0)).invokeSuspend(r37.f33317a);
        }

        public final Object invokeSuspend(Object obj) {
            Object d = wx2.m54101d();
            int i = this.label;
            if (i == 0) {
                hg5.m45199b(obj);
                final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                ref$ObjectRef.element = BigInteger.ZERO;
                final SwapViewModel swapViewModel = swapViewModel;
                final BigDecimal bigDecimal = bigDecimal;
                z42 t = e52.m57228t(new fd2<a52<? super BigInteger>, ns0<? super r37>, Object>((ns0<? super C88051>) null) {
                    private /* synthetic */ Object L$0;
                    public Object L$1;
                    public Object L$2;
                    public Object L$3;
                    public Object L$4;
                    public int label;

                    public final ns0<r37> create(Object obj, ns0<?> ns0) {
                        C88051 r0 = 

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        public SwapViewModel$findMaximumAmountInForNativeToken$1(SwapViewModel swapViewModel, BigDecimal bigDecimal, j36<BigDecimal> j36, ns0<? super SwapViewModel$findMaximumAmountInForNativeToken$1> ns0) {
                            super(2, ns0);
                            this.this$0 = swapViewModel;
                            this.$amountIn = bigDecimal;
                            this.$callBack = j36;
                        }

                        public final ns0<r37> create(Object obj, ns0<?> ns0) {
                            return new SwapViewModel$findMaximumAmountInForNativeToken$1(this.this$0, this.$amountIn, this.$callBack, ns0);
                        }

                        public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
                            return ((SwapViewModel$findMaximumAmountInForNativeToken$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
                        }

                        public final Object invokeSuspend(Object obj) {
                            Object d = wx2.m54101d();
                            int i = this.label;
                            if (i == 0) {
                                hg5.m45199b(obj);
                                CoroutineDispatcher b = qh1.m71265b();
                                final SwapViewModel swapViewModel = this.this$0;
                                final BigDecimal bigDecimal = this.$amountIn;
                                final j36<BigDecimal> j36 = this.$callBack;
                                C88041 r1 = new C88041((ns0<? super C88041>) null);
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
