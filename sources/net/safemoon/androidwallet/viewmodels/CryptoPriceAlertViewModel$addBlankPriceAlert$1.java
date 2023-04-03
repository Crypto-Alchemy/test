package net.safemoon.androidwallet.viewmodels;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import net.safemoon.androidwallet.model.priceAlert.PAToken;
import net.safemoon.androidwallet.model.priceAlert.PriceAlertToken;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.CryptoPriceAlertViewModel$addBlankPriceAlert$1", mo48632f = "CryptoPriceAlertViewModel.kt", mo48633l = {90}, mo48634m = "invokeSuspend")
/* compiled from: CryptoPriceAlertViewModel.kt */
public final class CryptoPriceAlertViewModel$addBlankPriceAlert$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ PAToken $paToken;
    public int label;
    public final /* synthetic */ CryptoPriceAlertViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CryptoPriceAlertViewModel$addBlankPriceAlert$1(CryptoPriceAlertViewModel cryptoPriceAlertViewModel, PAToken pAToken, ns0<? super CryptoPriceAlertViewModel$addBlankPriceAlert$1> ns0) {
        super(2, ns0);
        this.this$0 = cryptoPriceAlertViewModel;
        this.$paToken = pAToken;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new CryptoPriceAlertViewModel$addBlankPriceAlert$1(this.this$0, this.$paToken, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((CryptoPriceAlertViewModel$addBlankPriceAlert$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        boolean z;
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            this.this$0.mo61142y();
            String symbol = this.$paToken.getSymbol();
            if (symbol == null) {
                symbol = "";
            }
            String str2 = symbol;
            String name = this.$paToken.getName();
            String contractAddress = this.$paToken.getContractAddress();
            if (contractAddress != null) {
                if (contractAddress.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    contractAddress = null;
                }
                str = contractAddress;
            } else {
                str = null;
            }
            int chainId = this.$paToken.getChainId();
            CryptoPriceAlertViewModel cryptoPriceAlertViewModel = this.this$0;
            Integer cmcId = this.$paToken.getCmcId();
            this.label = 1;
            obj = cryptoPriceAlertViewModel.mo61136r(str2, name, str, chainId, cmcId, this);
            if (obj == d) {
                return d;
            }
        } else if (i == 1) {
            hg5.m45199b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        PriceAlertToken priceAlertToken = (PriceAlertToken) obj;
        if (priceAlertToken != null) {
            CryptoPriceAlertViewModel cryptoPriceAlertViewModel2 = this.this$0;
            List value = cryptoPriceAlertViewModel2.mo61137s().getValue();
            if (value == null) {
                value = ck0.m33062j();
            } else {
                vx2.m53590f(value, "priceAlertTokenLiveData.value?: emptyList()");
            }
            List M0 = CollectionsKt___CollectionsKt.m47313M0(value);
            M0.add(priceAlertToken);
            cryptoPriceAlertViewModel2.mo61137s().postValue(M0);
            cryptoPriceAlertViewModel2.mo61139u().postValue(a40.m31673d(M0.size() - 1));
        }
        this.this$0.mo61143z();
        return r37.f33317a;
    }
}
