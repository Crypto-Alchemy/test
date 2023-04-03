package net.safemoon.androidwallet.viewmodels;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineStart;
import net.safemoon.androidwallet.model.swap.AllSwapTokens;
import net.safemoon.androidwallet.model.swap.Data;
import net.safemoon.androidwallet.model.swap.Swap;
import net.safemoon.androidwallet.utils.Common;
import net.safemoon.androidwallet.viewmodels.SwapViewModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.SwapViewModel$loadTokens$1$onResponse$1", mo48632f = "SwapViewModel.kt", mo48633l = {}, mo48634m = "invokeSuspend")
/* compiled from: SwapViewModel.kt */
public final class SwapViewModel$loadTokens$1$onResponse$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ bg5<AllSwapTokens> $response;
    public int label;
    public final /* synthetic */ SwapViewModel this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    @v21(mo48631c = "net.safemoon.androidwallet.viewmodels.SwapViewModel$loadTokens$1$onResponse$1$1", mo48632f = "SwapViewModel.kt", mo48633l = {}, mo48634m = "invokeSuspend")
    /* renamed from: net.safemoon.androidwallet.viewmodels.SwapViewModel$loadTokens$1$onResponse$1$1 */
    /* compiled from: SwapViewModel.kt */
    public static final class C88531 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
        public int label;

        public final ns0<r37> create(Object obj, ns0<?> ns0) {
            return new C88531(swapViewModel, ns0);
        }

        public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
            return ((C88531) create(hu0, ns0)).invokeSuspend(r37.f33317a);
        }

        public final Object invokeSuspend(Object obj) {
            wx2.m54101d();
            if (this.label == 0) {
                hg5.m45199b(obj);
                SwapViewModel.C8788c value = swapViewModel.mo61600a0().getValue();
                if (value != null) {
                    swapViewModel.mo61568K(value);
                }
                return r37.f33317a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwapViewModel$loadTokens$1$onResponse$1(SwapViewModel swapViewModel, bg5<AllSwapTokens> bg5, ns0<? super SwapViewModel$loadTokens$1$onResponse$1> ns0) {
        super(2, ns0);
        this.this$0 = swapViewModel;
        this.$response = bg5;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new SwapViewModel$loadTokens$1$onResponse$1(this.this$0, this.$response, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((SwapViewModel$loadTokens$1$onResponse$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Data data;
        List<Swap> tokens;
        wx2.m54101d();
        if (this.label == 0) {
            hg5.m45199b(obj);
            ArrayList arrayList = new ArrayList();
            AllSwapTokens a = this.$response.mo50578a();
            if (!(a == null || (data = a.getData()) == null || (tokens = data.getTokens()) == null)) {
                arrayList.addAll(Common.f42577a.mo60907n());
                ArrayList arrayList2 = new ArrayList(dk0.m43495u(tokens, 10));
                for (Swap swap : tokens) {
                    String str = swap.address;
                    vx2.m53590f(str, "it.address");
                    String lowerCase = str.toLowerCase(Locale.ROOT);
                    vx2.m53590f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                    if (vx2.m53586b(lowerCase, "0x16631e53c20fd2670027c6d53efe2642929b285c")) {
                        swap.name = "pSafeMoon";
                    }
                    arrayList2.add(swap);
                }
                a40.m31670a(arrayList.addAll(arrayList2));
            }
            Boolean bool = y40.f35761c;
            vx2.m53590f(bool, "IS_TEST_NET");
            if (bool.booleanValue()) {
                Swap swap2 = new Swap();
                swap2.name = "Smart Chain";
                swap2.decimals = a40.m31673d(18);
                swap2.address = "";
                swap2.symbol = "BNB";
                swap2.chainId = a40.m31673d(97);
                swap2.logoURI = "https://s2.coinmarketcap.com/static/img/coins/64x64/1839.png";
                arrayList.add(swap2);
                Swap swap3 = new Swap();
                swap3.name = "Enhance Token";
                swap3.decimals = a40.m31673d(9);
                swap3.address = "0xfdB829e3f1916633d8Ea0C5bA8FdFcF7f2D7A40b";
                swap3.symbol = "ENHANCE";
                swap3.chainId = a40.m31673d(97);
                swap3.logoURI = "https://s2.coinmarketcap.com/static/img/coins/64x64/5994.png";
                arrayList.add(swap3);
                Swap swap4 = new Swap();
                swap4.name = "SUSHI";
                swap4.decimals = a40.m31673d(18);
                swap4.address = "0x0fc943031CdB3C8393b8fC43328755c21CF3fC31";
                swap4.symbol = "SUSHI";
                swap4.chainId = a40.m31673d(97);
                swap4.logoURI = "https://s2.coinmarketcap.com/static/img/coins/64x64/6758.png";
                arrayList.add(swap4);
            }
            this.this$0.f42921W = arrayList;
            hu0 a2 = cd7.m11843a(this.this$0);
            final SwapViewModel swapViewModel = this.this$0;
            y23 unused = d50.m56748b(a2, (CoroutineContext) null, (CoroutineStart) null, new C88531((ns0<? super C88531>) null), 3, (Object) null);
            return r37.f33317a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
