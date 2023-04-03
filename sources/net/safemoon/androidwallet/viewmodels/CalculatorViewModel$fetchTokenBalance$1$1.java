package net.safemoon.androidwallet.viewmodels;

import android.app.Application;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;
import net.safemoon.androidwallet.model.wallets.Wallet;
import net.safemoon.androidwallet.viewmodels.blockChainClass.WalletWeb3;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.CalculatorViewModel$fetchTokenBalance$1$1", mo48632f = "CalculatorViewModel.kt", mo48633l = {321}, mo48634m = "invokeSuspend")
/* compiled from: CalculatorViewModel.kt */
public final class CalculatorViewModel$fetchTokenBalance$1$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ C9449vc $model;
    public int label;
    public final /* synthetic */ CalculatorViewModel this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    @v21(mo48631c = "net.safemoon.androidwallet.viewmodels.CalculatorViewModel$fetchTokenBalance$1$1$1", mo48632f = "CalculatorViewModel.kt", mo48633l = {324}, mo48634m = "invokeSuspend")
    /* renamed from: net.safemoon.androidwallet.viewmodels.CalculatorViewModel$fetchTokenBalance$1$1$1 */
    /* compiled from: CalculatorViewModel.kt */
    public static final class C86451 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
        public Object L$0;
        public Object L$1;
        public int label;

        public final ns0<r37> create(Object obj, ns0<?> ns0) {
            return new C86451(calculatorViewModel, vcVar, ns0);
        }

        public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
            return ((C86451) create(hu0, ns0)).invokeSuspend(r37.f33317a);
        }

        public final Object invokeSuspend(Object obj) {
            BigDecimal bigDecimal;
            CalculatorViewModel calculatorViewModel;
            CalculatorViewModel calculatorViewModel2;
            CalculatorViewModel calculatorViewModel3;
            Object d = wx2.m54101d();
            int i = this.label;
            if (i == 0) {
                hg5.m45199b(obj);
                calculatorViewModel3 = calculatorViewModel;
                try {
                    Application b = calculatorViewModel3.mo27549b();
                    vx2.m53590f(b, "getApplication<Application>()");
                    Wallet c = ol0.m70351c(b);
                    if (c != null) {
                        C9449vc vcVar = vcVar;
                        WalletWeb3 walletWeb3 = new WalletWeb3(vcVar.mo66469b(), c);
                        String a = vcVar.mo66468a();
                        int c2 = vcVar.mo66470c();
                        this.L$0 = calculatorViewModel3;
                        this.L$1 = calculatorViewModel3;
                        this.label = 1;
                        Object f = walletWeb3.mo61876f(a, c2, this);
                        if (f == d) {
                            return d;
                        }
                        calculatorViewModel = calculatorViewModel3;
                        obj = f;
                        calculatorViewModel2 = calculatorViewModel;
                    } else {
                        CalculatorViewModel calculatorViewModel4 = calculatorViewModel3;
                        calculatorViewModel = calculatorViewModel3;
                        bigDecimal = BigDecimal.ZERO;
                        vx2.m53590f(bigDecimal, "{\n                      …ERO\n                    }");
                        calculatorViewModel.mo60991B(bigDecimal);
                        return r37.f33317a;
                    }
                } catch (Exception unused) {
                    calculatorViewModel2 = calculatorViewModel3;
                    bigDecimal = BigDecimal.ZERO;
                    vx2.m53590f(bigDecimal, "{\n                      …ERO\n                    }");
                    calculatorViewModel = calculatorViewModel2;
                    calculatorViewModel.mo60991B(bigDecimal);
                    return r37.f33317a;
                }
            } else if (i == 1) {
                calculatorViewModel = (CalculatorViewModel) this.L$1;
                calculatorViewModel2 = (CalculatorViewModel) this.L$0;
                try {
                    hg5.m45199b(obj);
                } catch (Exception unused2) {
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bigDecimal = (BigDecimal) obj;
            if (bigDecimal == null) {
                calculatorViewModel3 = calculatorViewModel;
                calculatorViewModel = calculatorViewModel3;
                bigDecimal = BigDecimal.ZERO;
            }
            vx2.m53590f(bigDecimal, "{\n                      …ERO\n                    }");
            calculatorViewModel.mo60991B(bigDecimal);
            return r37.f33317a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CalculatorViewModel$fetchTokenBalance$1$1(CalculatorViewModel calculatorViewModel, C9449vc vcVar, ns0<? super CalculatorViewModel$fetchTokenBalance$1$1> ns0) {
        super(2, ns0);
        this.this$0 = calculatorViewModel;
        this.$model = vcVar;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new CalculatorViewModel$fetchTokenBalance$1$1(this.this$0, this.$model, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((CalculatorViewModel$fetchTokenBalance$1$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            CoroutineDispatcher b = qh1.m71265b();
            final CalculatorViewModel calculatorViewModel = this.this$0;
            final C9449vc vcVar = this.$model;
            C86451 r1 = new C86451((ns0<? super C86451>) null);
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
