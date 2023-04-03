package net.safemoon.androidwallet.views;

import android.view.View;
import java.util.List;
import net.safemoon.androidwallet.model.fiat.room.RoomFiat;

/* renamed from: net.safemoon.androidwallet.views.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C8945a implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ List f43265a;

    /* renamed from: d */
    public final /* synthetic */ RoomFiat f43266d;

    /* renamed from: e */
    public final /* synthetic */ CurrencyConverterLayout f43267e;

    public /* synthetic */ C8945a(List list, RoomFiat roomFiat, CurrencyConverterLayout currencyConverterLayout) {
        this.f43265a = list;
        this.f43266d = roomFiat;
        this.f43267e = currencyConverterLayout;
    }

    public final void onClick(View view) {
        CurrencyConverterLayout$attachView$1$3.m69487b(this.f43265a, this.f43266d, this.f43267e, view);
    }
}
