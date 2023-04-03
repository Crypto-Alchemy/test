package net.safemoon.androidwallet.activity;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import net.safemoon.androidwallet.ERC20;
import net.safemoon.androidwallet.SafeswapRouter;
import net.safemoon.androidwallet.p020ui.wallet.Convert;
import org.web3j.protocol.core.DefaultBlockParameterName;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.activity.TestActivity$onCreate$1", mo48632f = "TestActivity.kt", mo48633l = {49}, mo48634m = "invokeSuspend")
/* compiled from: TestActivity.kt */
public final class TestActivity$onCreate$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ cw0 $credentails;
    public final /* synthetic */ List<String> $path;
    public final /* synthetic */ SafeswapRouter $safeSwapRouter;
    public final /* synthetic */ ERC20 $safemoon;
    public final /* synthetic */ vj7 $web3;
    public int label;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    @v21(mo48631c = "net.safemoon.androidwallet.activity.TestActivity$onCreate$1$1", mo48632f = "TestActivity.kt", mo48633l = {}, mo48634m = "invokeSuspend")
    /* renamed from: net.safemoon.androidwallet.activity.TestActivity$onCreate$1$1 */
    /* compiled from: TestActivity.kt */
    public static final class C82051 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
        public int label;

        public final ns0<r37> create(Object obj, ns0<?> ns0) {
            return new C82051(vj7, cw0, erc20, safeswapRouter, list, ns0);
        }

        public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
            return ((C82051) create(hu0, ns0)).invokeSuspend(r37.f33317a);
        }

        public final Object invokeSuspend(Object obj) {
            wx2.m54101d();
            if (this.label == 0) {
                hg5.m45199b(obj);
                try {
                    BigInteger balance = vj7.ethGetBalance(cw0.getAddress(), DefaultBlockParameterName.LATEST).sendAsync().get().getBalance();
                    vx2.m53590f(balance, "balance.balance");
                    String plainString = Convert.m68280b(new BigDecimal(balance), Convert.Unit.ETHER).toPlainString();
                    vx2.m53590f(plainString, "fromWei(balance.balance.…it.ETHER).toPlainString()");
                    ol0.m70350b0(plainString, "BNB Balance");
                } catch (Exception e) {
                    String localizedMessage = e.getLocalizedMessage();
                    vx2.m53590f(localizedMessage, "e.localizedMessage");
                    ol0.m70350b0(localizedMessage, "ErrorBNB Balance");
                }
                try {
                    ERC20 erc20 = erc20;
                    BigInteger bigInteger = BigInteger.ONE;
                    String transactionHash = erc20.mo56478o("0xc04c3408EA62778072DBc8c14AA9d52FC77EeE8a", bigInteger.shiftLeft(256).subtract(bigInteger)).sendAsync().get().getTransactionHash();
                    vx2.m53590f(transactionHash, "approval.transactionHash");
                    ol0.m70350b0(transactionHash, "Approval");
                } catch (Exception e2) {
                    String localizedMessage2 = e2.getLocalizedMessage();
                    vx2.m53590f(localizedMessage2, "e.localizedMessage");
                    ol0.m70350b0(localizedMessage2, "ErrorApproval");
                }
                SafeswapRouter safeswapRouter = safeswapRouter;
                Convert.Unit unit = Convert.Unit.GWEI;
                List list = safeswapRouter.mo56512p(Convert.m68281c("10", unit).toBigInteger(), list).sendAsync().get();
                if (list != null) {
                    try {
                        BigDecimal a = Convert.m68279a(String.valueOf(list.get(0)), unit);
                        String valueOf = String.valueOf(list.get(1));
                        Convert.Unit unit2 = Convert.Unit.ETHER;
                        BigDecimal a2 = Convert.m68279a(valueOf, unit2);
                        String bigDecimal = a.toString();
                        vx2.m53590f(bigDecimal, "estimateSafeMoon.toString()");
                        ol0.m70350b0(bigDecimal, "AmountIn Safemoon");
                        String bigDecimal2 = a2.toString();
                        vx2.m53590f(bigDecimal2, "estimateWbnb.toString()");
                        ol0.m70350b0(bigDecimal2, "Amount WBNB:");
                        Float[] fArr = {a40.m31672c(1.0f), a40.m31672c(1.0f)};
                        Float[] fArr2 = {a40.m31672c(1000.0f), a40.m31672c(10000.0f)};
                        Float c = a40.m31672c(fArr[1].floatValue() * fArr2[1].floatValue());
                        Float[] fArr3 = {c, new Float[]{a40.m31672c((fArr2[0].floatValue() * fArr[1].floatValue()) + (fArr[0].floatValue() * fArr2[1].floatValue())), c}[0]};
                        Float c2 = a40.m31672c(c.floatValue() * a2.floatValue());
                        fArr3[0] = c2;
                        float floatValue = c2.floatValue() / fArr3[1].floatValue();
                        String bigInteger2 = Convert.m68281c(a.toString(), unit).toBigInteger().toString();
                        vx2.m53590f(bigInteger2, "toWei(estimateSafeMoon.t…toBigInteger().toString()");
                        ol0.m70350b0(bigInteger2, "AmountIN");
                        String bigInteger3 = Convert.m68281c(String.valueOf(floatValue), unit2).toBigInteger().toString();
                        vx2.m53590f(bigInteger3, "toWei(amountOutMin.toStr…toBigInteger().toString()");
                        ol0.m70350b0(bigInteger3, "AmountOUT");
                        SafeswapRouter safeswapRouter2 = safeswapRouter;
                        BigInteger bigInteger4 = Convert.m68281c(a.toString(), unit).toBigInteger();
                        BigInteger bigInteger5 = Convert.m68281c(String.valueOf(floatValue), unit2).toBigInteger();
                        List<String> list2 = list;
                        String address = cw0.getAddress();
                        BigInteger valueOf2 = BigInteger.valueOf((System.currentTimeMillis() / 1000) + ((long) 60));
                        vx2.m53590f(valueOf2, "valueOf(this)");
                        ol0.m70350b0(safeswapRouter2.mo56519x(bigInteger4, bigInteger5, list2, address, valueOf2).sendAsync().get().getTransactionHash().toString(), "ResultSwap");
                    } catch (Exception e3) {
                        String localizedMessage3 = e3.getLocalizedMessage();
                        vx2.m53590f(localizedMessage3, "e.localizedMessage");
                        ol0.m70350b0(localizedMessage3, "ErrorResultSwap");
                    }
                }
                return r37.f33317a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TestActivity$onCreate$1(vj7 vj7, cw0 cw0, ERC20 erc20, SafeswapRouter safeswapRouter, List<String> list, ns0<? super TestActivity$onCreate$1> ns0) {
        super(2, ns0);
        this.$web3 = vj7;
        this.$credentails = cw0;
        this.$safemoon = erc20;
        this.$safeSwapRouter = safeswapRouter;
        this.$path = list;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new TestActivity$onCreate$1(this.$web3, this.$credentails, this.$safemoon, this.$safeSwapRouter, this.$path, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((TestActivity$onCreate$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            final vj7 vj7 = this.$web3;
            final cw0 cw0 = this.$credentails;
            final ERC20 erc20 = this.$safemoon;
            final SafeswapRouter safeswapRouter = this.$safeSwapRouter;
            final List<String> list = this.$path;
            C82051 r3 = new C82051((ns0<? super C82051>) null);
            this.label = 1;
            if (iu0.m59115e(r3, this) == d) {
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
