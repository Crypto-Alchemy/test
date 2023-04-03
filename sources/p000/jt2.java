package p000;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import net.safemoon.androidwallet.R;

/* renamed from: jt2 */
/* compiled from: IncludeWalletAddressBinding */
public final class jt2 {

    /* renamed from: a */
    public final LinearLayoutCompat f30599a;

    /* renamed from: b */
    public final TextView f30600b;

    /* renamed from: c */
    public final AppCompatImageView f30601c;

    /* renamed from: d */
    public final EditText f30602d;

    /* renamed from: e */
    public final ImageView f30603e;

    /* renamed from: f */
    public final AppCompatImageView f30604f;

    /* renamed from: g */
    public final LinearLayoutCompat f30605g;

    /* renamed from: h */
    public final TextView f30606h;

    /* renamed from: i */
    public final View f30607i;

    public jt2(LinearLayoutCompat linearLayoutCompat, TextView textView, AppCompatImageView appCompatImageView, EditText editText, ImageView imageView, AppCompatImageView appCompatImageView2, LinearLayoutCompat linearLayoutCompat2, TextView textView2, View view) {
        this.f30599a = linearLayoutCompat;
        this.f30600b = textView;
        this.f30601c = appCompatImageView;
        this.f30602d = editText;
        this.f30603e = imageView;
        this.f30604f = appCompatImageView2;
        this.f30605g = linearLayoutCompat2;
        this.f30606h = textView2;
        this.f30607i = view;
    }

    /* renamed from: a */
    public static jt2 m46743a(View view) {
        int i = R.id.btnPaste;
        TextView textView = (TextView) ca7.m11819a(view, R.id.btnPaste);
        if (textView != null) {
            i = R.id.btnQr;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ca7.m11819a(view, R.id.btnQr);
            if (appCompatImageView != null) {
                i = R.id.etContactAddress;
                EditText editText = (EditText) ca7.m11819a(view, R.id.etContactAddress);
                if (editText != null) {
                    i = R.id.ivClear;
                    ImageView imageView = (ImageView) ca7.m11819a(view, R.id.ivClear);
                    if (imageView != null) {
                        i = R.id.ivCopy;
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) ca7.m11819a(view, R.id.ivCopy);
                        if (appCompatImageView2 != null) {
                            i = R.id.lContactAddressContainer;
                            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ca7.m11819a(view, R.id.lContactAddressContainer);
                            if (linearLayoutCompat != null) {
                                i = R.id.tvContactAddressText;
                                TextView textView2 = (TextView) ca7.m11819a(view, R.id.tvContactAddressText);
                                if (textView2 != null) {
                                    i = R.id.vContactAddressDivider;
                                    View a = ca7.m11819a(view, R.id.vContactAddressDivider);
                                    if (a != null) {
                                        return new jt2((LinearLayoutCompat) view, textView, appCompatImageView, editText, imageView, appCompatImageView2, linearLayoutCompat, textView2, a);
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
