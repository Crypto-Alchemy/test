package net.safemoon.androidwallet.dialogs;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import net.safemoon.androidwallet.model.fiat.gson.Fiat;
import net.safemoon.androidwallet.model.fiat.room.RoomFiat;
import net.safemoon.androidwallet.views.CurrencyConverterLayout;
import net.safemoon.androidwallet.views.editText.autoSize.AutofitEdittext;

@Metadata(mo44876d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"<anonymous>", "", "it", "Lnet/safemoon/androidwallet/model/fiat/room/RoomFiat;", "invoke", "(Lnet/safemoon/androidwallet/model/fiat/room/RoomFiat;)Ljava/lang/Boolean;"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: AnchorCurrencyConverter.kt */
public final class AnchorCurrencyConverter$2$8 extends Lambda implements rc2<RoomFiat, Boolean> {
    public final /* synthetic */ AutofitEdittext $convertFromEdt;
    public final /* synthetic */ AutofitEdittext $convertToEdt;
    public final /* synthetic */ ve1 $this_with;
    public final /* synthetic */ AnchorCurrencyConverter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnchorCurrencyConverter$2$8(AnchorCurrencyConverter anchorCurrencyConverter, AutofitEdittext autofitEdittext, ve1 ve1, AutofitEdittext autofitEdittext2) {
        super(1);
        this.this$0 = anchorCurrencyConverter;
        this.$convertToEdt = autofitEdittext;
        this.$this_with = ve1;
        this.$convertFromEdt = autofitEdittext2;
    }

    public final Boolean invoke(RoomFiat roomFiat) {
        if (roomFiat != null) {
            AnchorCurrencyConverter anchorCurrencyConverter = this.this$0;
            AutofitEdittext autofitEdittext = this.$convertToEdt;
            ve1 ve1 = this.$this_with;
            AutofitEdittext autofitEdittext2 = this.$convertFromEdt;
            Fiat fiat = new Fiat(roomFiat.getSymbol(), roomFiat.getName(), roomFiat.getRate());
            if (!vx2.m53586b(fiat.getSymbol(), anchorCurrencyConverter.f41688e.getSymbol())) {
                anchorCurrencyConverter.f41689f = new Fiat(roomFiat.getSymbol(), roomFiat.getName(), roomFiat.getRate());
                if (autofitEdittext.hasFocus()) {
                    CurrencyConverterLayout currencyConverterLayout = ve1.f34930d;
                    vx2.m53590f(currencyConverterLayout, "convertTo");
                    CurrencyConverterLayout currencyConverterLayout2 = ve1.f34929c;
                    vx2.m53590f(currencyConverterLayout2, "convertFrom");
                    anchorCurrencyConverter.mo57129r(currencyConverterLayout, currencyConverterLayout2, autofitEdittext.getText(), false);
                } else {
                    CurrencyConverterLayout currencyConverterLayout3 = ve1.f34929c;
                    vx2.m53590f(currencyConverterLayout3, "convertFrom");
                    CurrencyConverterLayout currencyConverterLayout4 = ve1.f34930d;
                    vx2.m53590f(currencyConverterLayout4, "convertTo");
                    anchorCurrencyConverter.mo57129r(currencyConverterLayout3, currencyConverterLayout4, autofitEdittext2.getText(), true);
                }
                ve1.f34929c.mo62085o(new RoomFiat(fiat));
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }
}
