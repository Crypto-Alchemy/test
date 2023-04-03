package p000;

import android.view.View;
import net.safemoon.androidwallet.model.fiat.room.RoomFiat;
import net.safemoon.androidwallet.views.CurrencyConverterLayout;

/* renamed from: lx0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class lx0 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ CurrencyConverterLayout f40710a;

    /* renamed from: d */
    public final /* synthetic */ RoomFiat f40711d;

    public /* synthetic */ lx0(CurrencyConverterLayout currencyConverterLayout, RoomFiat roomFiat) {
        this.f40710a = currencyConverterLayout;
        this.f40711d = roomFiat;
    }

    public final void onClick(View view) {
        CurrencyConverterLayout.m69481p(this.f40710a, this.f40711d, view);
    }
}
