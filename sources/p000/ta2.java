package p000;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.textfield.TextInputEditText;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.views.carousel.ContactCarouselView;

/* renamed from: ta2 */
/* compiled from: FragmentSendtoBinding */
public final class ta2 {

    /* renamed from: A */
    public final TextView f34175A;

    /* renamed from: B */
    public final TextView f34176B;

    /* renamed from: C */
    public final TextView f34177C;

    /* renamed from: a */
    public final ScrollView f34178a;

    /* renamed from: b */
    public final MaterialButton f34179b;

    /* renamed from: c */
    public final MaterialButton f34180c;

    /* renamed from: d */
    public final MaterialButton f34181d;

    /* renamed from: e */
    public final AppCompatImageView f34182e;

    /* renamed from: f */
    public final ImageView f34183f;

    /* renamed from: g */
    public final MaterialCheckBox f34184g;

    /* renamed from: h */
    public final ConstraintLayout f34185h;

    /* renamed from: i */
    public final ContactCarouselView f34186i;

    /* renamed from: j */
    public final EditText f34187j;

    /* renamed from: k */
    public final TextInputEditText f34188k;

    /* renamed from: l */
    public final AppCompatEditText f34189l;

    /* renamed from: m */
    public final AppCompatImageView f34190m;

    /* renamed from: n */
    public final AppCompatImageView f34191n;

    /* renamed from: o */
    public final AppCompatImageView f34192o;

    /* renamed from: p */
    public final ImageView f34193p;

    /* renamed from: q */
    public final LinearLayout f34194q;

    /* renamed from: r */
    public final View f34195r;

    /* renamed from: s */
    public final LinearLayoutCompat f34196s;

    /* renamed from: t */
    public final ScrollView f34197t;

    /* renamed from: u */
    public final TextView f34198u;

    /* renamed from: v */
    public final TextView f34199v;

    /* renamed from: w */
    public final TextView f34200w;

    /* renamed from: x */
    public final TextView f34201x;

    /* renamed from: y */
    public final TextView f34202y;

    /* renamed from: z */
    public final TextView f34203z;

    public ta2(ScrollView scrollView, MaterialButton materialButton, MaterialButton materialButton2, MaterialButton materialButton3, AppCompatImageView appCompatImageView, ImageView imageView, MaterialCheckBox materialCheckBox, ConstraintLayout constraintLayout, ContactCarouselView contactCarouselView, EditText editText, TextInputEditText textInputEditText, AppCompatEditText appCompatEditText, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, AppCompatImageView appCompatImageView4, ImageView imageView2, LinearLayout linearLayout, View view, LinearLayoutCompat linearLayoutCompat, ScrollView scrollView2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9) {
        this.f34178a = scrollView;
        this.f34179b = materialButton;
        this.f34180c = materialButton2;
        this.f34181d = materialButton3;
        this.f34182e = appCompatImageView;
        this.f34183f = imageView;
        this.f34184g = materialCheckBox;
        this.f34185h = constraintLayout;
        this.f34186i = contactCarouselView;
        this.f34187j = editText;
        this.f34188k = textInputEditText;
        this.f34189l = appCompatEditText;
        this.f34190m = appCompatImageView2;
        this.f34191n = appCompatImageView3;
        this.f34192o = appCompatImageView4;
        this.f34193p = imageView2;
        this.f34194q = linearLayout;
        this.f34195r = view;
        this.f34196s = linearLayoutCompat;
        this.f34197t = scrollView2;
        this.f34198u = textView;
        this.f34199v = textView2;
        this.f34200w = textView3;
        this.f34201x = textView4;
        this.f34202y = textView5;
        this.f34203z = textView6;
        this.f34175A = textView7;
        this.f34176B = textView8;
        this.f34177C = textView9;
    }

    /* renamed from: a */
    public static ta2 m52147a(View view) {
        View view2 = view;
        int i = R.id.btnAddContact;
        MaterialButton materialButton = (MaterialButton) ca7.m11819a(view2, R.id.btnAddContact);
        if (materialButton != null) {
            i = R.id.btnClearText;
            MaterialButton materialButton2 = (MaterialButton) ca7.m11819a(view2, R.id.btnClearText);
            if (materialButton2 != null) {
                i = R.id.btnSend;
                MaterialButton materialButton3 = (MaterialButton) ca7.m11819a(view2, R.id.btnSend);
                if (materialButton3 != null) {
                    i = R.id.bubble;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) ca7.m11819a(view2, R.id.bubble);
                    if (appCompatImageView != null) {
                        i = R.id.camera;
                        ImageView imageView = (ImageView) ca7.m11819a(view2, R.id.camera);
                        if (imageView != null) {
                            i = R.id.chkFullAmountRecipient;
                            MaterialCheckBox materialCheckBox = (MaterialCheckBox) ca7.m11819a(view2, R.id.chkFullAmountRecipient);
                            if (materialCheckBox != null) {
                                i = R.id.container;
                                ConstraintLayout constraintLayout = (ConstraintLayout) ca7.m11819a(view2, R.id.container);
                                if (constraintLayout != null) {
                                    i = R.id.cvRecentContact;
                                    ContactCarouselView contactCarouselView = (ContactCarouselView) ca7.m11819a(view2, R.id.cvRecentContact);
                                    if (contactCarouselView != null) {
                                        i = R.id.etAddress;
                                        EditText editText = (EditText) ca7.m11819a(view2, R.id.etAddress);
                                        if (editText != null) {
                                            i = R.id.etAmount;
                                            TextInputEditText textInputEditText = (TextInputEditText) ca7.m11819a(view2, R.id.etAmount);
                                            if (textInputEditText != null) {
                                                i = R.id.etContactSearch;
                                                AppCompatEditText appCompatEditText = (AppCompatEditText) ca7.m11819a(view2, R.id.etContactSearch);
                                                if (appCompatEditText != null) {
                                                    i = R.id.imgContacts;
                                                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) ca7.m11819a(view2, R.id.imgContacts);
                                                    if (appCompatImageView2 != null) {
                                                        i = R.id.imgSymbol;
                                                        AppCompatImageView appCompatImageView3 = (AppCompatImageView) ca7.m11819a(view2, R.id.imgSymbol);
                                                        if (appCompatImageView3 != null) {
                                                            i = R.id.imgWallets;
                                                            AppCompatImageView appCompatImageView4 = (AppCompatImageView) ca7.m11819a(view2, R.id.imgWallets);
                                                            if (appCompatImageView4 != null) {
                                                                i = R.id.iv_back;
                                                                ImageView imageView2 = (ImageView) ca7.m11819a(view2, R.id.iv_back);
                                                                if (imageView2 != null) {
                                                                    i = R.id.lAddressContainer;
                                                                    LinearLayout linearLayout = (LinearLayout) ca7.m11819a(view2, R.id.lAddressContainer);
                                                                    if (linearLayout != null) {
                                                                        i = R.id.line;
                                                                        View a = ca7.m11819a(view2, R.id.line);
                                                                        if (a != null) {
                                                                            i = R.id.lnDetails;
                                                                            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ca7.m11819a(view2, R.id.lnDetails);
                                                                            if (linearLayoutCompat != null) {
                                                                                ScrollView scrollView = (ScrollView) view2;
                                                                                i = R.id.tvBalance;
                                                                                TextView textView = (TextView) ca7.m11819a(view2, R.id.tvBalance);
                                                                                if (textView != null) {
                                                                                    i = R.id.tvFiat;
                                                                                    TextView textView2 = (TextView) ca7.m11819a(view2, R.id.tvFiat);
                                                                                    if (textView2 != null) {
                                                                                        i = R.id.tvHalf;
                                                                                        TextView textView3 = (TextView) ca7.m11819a(view2, R.id.tvHalf);
                                                                                        if (textView3 != null) {
                                                                                            i = R.id.tvMax;
                                                                                            TextView textView4 = (TextView) ca7.m11819a(view2, R.id.tvMax);
                                                                                            if (textView4 != null) {
                                                                                                i = R.id.tv_paste;
                                                                                                TextView textView5 = (TextView) ca7.m11819a(view2, R.id.tv_paste);
                                                                                                if (textView5 != null) {
                                                                                                    i = R.id.tvPreviewToken;
                                                                                                    TextView textView6 = (TextView) ca7.m11819a(view2, R.id.tvPreviewToken);
                                                                                                    if (textView6 != null) {
                                                                                                        i = R.id.tvQuarter;
                                                                                                        TextView textView7 = (TextView) ca7.m11819a(view2, R.id.tvQuarter);
                                                                                                        if (textView7 != null) {
                                                                                                            i = R.id.tvSend2;
                                                                                                            TextView textView8 = (TextView) ca7.m11819a(view2, R.id.tvSend2);
                                                                                                            if (textView8 != null) {
                                                                                                                i = R.id.tvTokenName;
                                                                                                                TextView textView9 = (TextView) ca7.m11819a(view2, R.id.tvTokenName);
                                                                                                                if (textView9 != null) {
                                                                                                                    return new ta2(scrollView, materialButton, materialButton2, materialButton3, appCompatImageView, imageView, materialCheckBox, constraintLayout, contactCarouselView, editText, textInputEditText, appCompatEditText, appCompatImageView2, appCompatImageView3, appCompatImageView4, imageView2, linearLayout, a, linearLayoutCompat, scrollView, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
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

    /* renamed from: b */
    public ScrollView mo48037b() {
        return this.f34178a;
    }
}
