package net.safemoon.androidwallet.dialogs;

import android.text.Editable;
import com.github.mikephil.charting.utils.Utils;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.model.priceAlert.PriceAlertToken;
import net.safemoon.androidwallet.viewmodels.CryptoPriceAlertViewModel;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Landroid/text/Editable;", "it", "Lr37;", "invoke", "(Landroid/text/Editable;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: CryptoPriceAlertFragment.kt */
public final class CryptoPriceAlertFragment$onViewCreated$1$1$5$3 extends Lambda implements rc2<Editable, r37> {
    public final /* synthetic */ et2 $this_with;
    public final /* synthetic */ CryptoPriceAlertFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CryptoPriceAlertFragment$onViewCreated$1$1$5$3(CryptoPriceAlertFragment cryptoPriceAlertFragment, et2 et2) {
        super(1);
        this.this$0 = cryptoPriceAlertFragment;
        this.$this_with = et2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Editable) obj);
        return r37.f33317a;
    }

    public final void invoke(Editable editable) {
        String str;
        Number number;
        String obj;
        BigDecimal K;
        boolean z = true;
        this.this$0.f41728U = true;
        PriceAlertToken value = this.this$0.mo57192Q().mo61140v().getValue();
        if (value != null) {
            et2 et2 = this.$this_with;
            CryptoPriceAlertFragment cryptoPriceAlertFragment = this.this$0;
            if (editable == null || (str = editable.toString()) == null) {
                str = "";
            }
            value.setDecreasePercentString(str);
            if (editable == null || (obj = editable.toString()) == null || (K = ol0.m70331K(obj)) == null || (number = K.setScale(1, RoundingMode.HALF_DOWN)) == null) {
                number = Double.valueOf(Utils.DOUBLE_EPSILON);
            }
            float floatValue = number.floatValue();
            if (floatValue != et2.f28665f.getValue()) {
                z = false;
            }
            if (!z) {
                et2.f28665f.setValue(floatValue);
            }
            CryptoPriceAlertViewModel.m68532B(cryptoPriceAlertFragment.mo57192Q(), value, (Integer) null, 2, (Object) null);
        }
    }
}
