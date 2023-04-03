package net.safemoon.androidwallet.dialogs;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.model.priceAlert.PriceAlertToken;
import net.safemoon.androidwallet.viewmodels.CryptoPriceAlertViewModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"", "isChecked", "Lr37;", "invoke", "(Z)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: CryptoPriceAlertFragment.kt */
public final class CryptoPriceAlertFragment$onViewCreated$1$1$1 extends Lambda implements rc2<Boolean, r37> {
    public final /* synthetic */ CryptoPriceAlertFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CryptoPriceAlertFragment$onViewCreated$1$1$1(CryptoPriceAlertFragment cryptoPriceAlertFragment) {
        super(1);
        this.this$0 = cryptoPriceAlertFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return r37.f33317a;
    }

    public final void invoke(boolean z) {
        this.this$0.f41728U = true;
        PriceAlertToken value = this.this$0.mo57192Q().mo61140v().getValue();
        if (value != null) {
            CryptoPriceAlertFragment cryptoPriceAlertFragment = this.this$0;
            value.setStatus(z);
            CryptoPriceAlertViewModel.m68532B(cryptoPriceAlertFragment.mo57192Q(), value, (Integer) null, 2, (Object) null);
        }
    }
}
