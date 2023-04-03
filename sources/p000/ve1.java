package p000;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ViewSwitcher;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.views.CurrencyConverterLayout;

/* renamed from: ve1 */
/* compiled from: DialogAnchorCurrencyConverterBinding */
public final class ve1 {

    /* renamed from: a */
    public final ConstraintLayout f34927a;

    /* renamed from: b */
    public final ViewSwitcher f34928b;

    /* renamed from: c */
    public final CurrencyConverterLayout f34929c;

    /* renamed from: d */
    public final CurrencyConverterLayout f34930d;

    /* renamed from: e */
    public final AppCompatTextView f34931e;

    /* renamed from: f */
    public final ImageButton f34932f;

    /* renamed from: g */
    public final RecyclerView f34933g;

    /* renamed from: h */
    public final vn5 f34934h;

    /* renamed from: i */
    public final AppCompatTextView f34935i;

    public ve1(ConstraintLayout constraintLayout, ViewSwitcher viewSwitcher, CurrencyConverterLayout currencyConverterLayout, CurrencyConverterLayout currencyConverterLayout2, AppCompatTextView appCompatTextView, ImageButton imageButton, RecyclerView recyclerView, vn5 vn5, AppCompatTextView appCompatTextView2) {
        this.f34927a = constraintLayout;
        this.f34928b = viewSwitcher;
        this.f34929c = currencyConverterLayout;
        this.f34930d = currencyConverterLayout2;
        this.f34931e = appCompatTextView;
        this.f34932f = imageButton;
        this.f34933g = recyclerView;
        this.f34934h = vn5;
        this.f34935i = appCompatTextView2;
    }

    /* renamed from: a */
    public static ve1 m53362a(View view) {
        int i = R.id.ccWrapper;
        ViewSwitcher viewSwitcher = (ViewSwitcher) ca7.m11819a(view, R.id.ccWrapper);
        if (viewSwitcher != null) {
            i = R.id.convertFrom;
            CurrencyConverterLayout currencyConverterLayout = (CurrencyConverterLayout) ca7.m11819a(view, R.id.convertFrom);
            if (currencyConverterLayout != null) {
                i = R.id.convertTo;
                CurrencyConverterLayout currencyConverterLayout2 = (CurrencyConverterLayout) ca7.m11819a(view, R.id.convertTo);
                if (currencyConverterLayout2 != null) {
                    i = R.id.defaultCurrencyTitle;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) ca7.m11819a(view, R.id.defaultCurrencyTitle);
                    if (appCompatTextView != null) {
                        i = R.id.imgArrow;
                        ImageButton imageButton = (ImageButton) ca7.m11819a(view, R.id.imgArrow);
                        if (imageButton != null) {
                            i = R.id.recyclerView;
                            RecyclerView recyclerView = (RecyclerView) ca7.m11819a(view, R.id.recyclerView);
                            if (recyclerView != null) {
                                i = R.id.searchBar;
                                View a = ca7.m11819a(view, R.id.searchBar);
                                if (a != null) {
                                    vn5 a2 = vn5.m53437a(a);
                                    i = R.id.txtTitle;
                                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) ca7.m11819a(view, R.id.txtTitle);
                                    if (appCompatTextView2 != null) {
                                        return new ve1((ConstraintLayout) view, viewSwitcher, currencyConverterLayout, currencyConverterLayout2, appCompatTextView, imageButton, recyclerView, a2, appCompatTextView2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
