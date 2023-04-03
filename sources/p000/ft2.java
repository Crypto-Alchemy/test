package p000;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.views.editText.autoSize.AutofitEdittext;

/* renamed from: ft2 */
/* compiled from: IncludeCurrencyConverterLayoutBinding */
public final class ft2 {

    /* renamed from: a */
    public final FrameLayout f28957a;

    /* renamed from: b */
    public final LinearLayout f28958b;

    /* renamed from: c */
    public final ImageView f28959c;

    /* renamed from: d */
    public final AppCompatImageView f28960d;

    /* renamed from: e */
    public final AppCompatTextView f28961e;

    /* renamed from: f */
    public final AppCompatTextView f28962f;

    /* renamed from: g */
    public final AutofitEdittext f28963g;

    /* renamed from: h */
    public final LinearLayout f28964h;

    public ft2(FrameLayout frameLayout, LinearLayout linearLayout, ImageView imageView, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AutofitEdittext autofitEdittext, LinearLayout linearLayout2) {
        this.f28957a = frameLayout;
        this.f28958b = linearLayout;
        this.f28959c = imageView;
        this.f28960d = appCompatImageView;
        this.f28961e = appCompatTextView;
        this.f28962f = appCompatTextView2;
        this.f28963g = autofitEdittext;
        this.f28964h = linearLayout2;
    }

    /* renamed from: a */
    public static ft2 m44389a(View view) {
        int i = R.id.buttonWrapper;
        LinearLayout linearLayout = (LinearLayout) ca7.m11819a(view, R.id.buttonWrapper);
        if (linearLayout != null) {
            i = R.id.ivClear;
            ImageView imageView = (ImageView) ca7.m11819a(view, R.id.ivClear);
            if (imageView != null) {
                i = R.id.ivCopy;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ca7.m11819a(view, R.id.ivCopy);
                if (appCompatImageView != null) {
                    i = R.id.selectedCurrencyFullName;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) ca7.m11819a(view, R.id.selectedCurrencyFullName);
                    if (appCompatTextView != null) {
                        i = R.id.selectedCurrencyShortName;
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) ca7.m11819a(view, R.id.selectedCurrencyShortName);
                        if (appCompatTextView2 != null) {
                            i = R.id.txtValue;
                            AutofitEdittext autofitEdittext = (AutofitEdittext) ca7.m11819a(view, R.id.txtValue);
                            if (autofitEdittext != null) {
                                i = R.id.txtValueWrapper;
                                LinearLayout linearLayout2 = (LinearLayout) ca7.m11819a(view, R.id.txtValueWrapper);
                                if (linearLayout2 != null) {
                                    return new ft2((FrameLayout) view, linearLayout, imageView, appCompatImageView, appCompatTextView, appCompatTextView2, autofitEdittext, linearLayout2);
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
