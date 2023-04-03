package p000;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import net.safemoon.androidwallet.R;

/* renamed from: b92 */
/* compiled from: FragmentAddEditContactBinding */
public final class b92 {

    /* renamed from: a */
    public final ConstraintLayout f21175a;

    /* renamed from: b */
    public final MaterialButton f21176b;

    /* renamed from: c */
    public final FlexboxLayout f21177c;

    /* renamed from: d */
    public final CardView f21178d;

    /* renamed from: e */
    public final EditText f21179e;

    /* renamed from: f */
    public final ImageView f21180f;

    /* renamed from: g */
    public final LinearLayoutCompat f21181g;

    /* renamed from: h */
    public final ConstraintLayout f21182h;

    /* renamed from: i */
    public final MaterialCheckBox f21183i;

    /* renamed from: j */
    public final MaterialButton f21184j;

    /* renamed from: k */
    public final LinearLayout f21185k;

    /* renamed from: l */
    public final tr6 f21186l;

    /* renamed from: m */
    public final TextView f21187m;

    /* renamed from: n */
    public final TextView f21188n;

    /* renamed from: o */
    public final View f21189o;

    /* renamed from: p */
    public final View f21190p;

    /* renamed from: q */
    public final View f21191q;

    /* renamed from: r */
    public final View f21192r;

    public b92(ConstraintLayout constraintLayout, MaterialButton materialButton, FlexboxLayout flexboxLayout, CardView cardView, EditText editText, ImageView imageView, LinearLayoutCompat linearLayoutCompat, ConstraintLayout constraintLayout2, MaterialCheckBox materialCheckBox, MaterialButton materialButton2, LinearLayout linearLayout, tr6 tr6, TextView textView, TextView textView2, View view, View view2, View view3, View view4) {
        this.f21175a = constraintLayout;
        this.f21176b = materialButton;
        this.f21177c = flexboxLayout;
        this.f21178d = cardView;
        this.f21179e = editText;
        this.f21180f = imageView;
        this.f21181g = linearLayoutCompat;
        this.f21182h = constraintLayout2;
        this.f21183i = materialCheckBox;
        this.f21184j = materialButton2;
        this.f21185k = linearLayout;
        this.f21186l = tr6;
        this.f21187m = textView;
        this.f21188n = textView2;
        this.f21189o = view;
        this.f21190p = view2;
        this.f21191q = view3;
        this.f21192r = view4;
    }

    /* renamed from: a */
    public static b92 m32431a(View view) {
        View view2 = view;
        int i = R.id.btnSave;
        MaterialButton materialButton = (MaterialButton) ca7.m11819a(view2, R.id.btnSave);
        if (materialButton != null) {
            i = R.id.childWrapper;
            FlexboxLayout flexboxLayout = (FlexboxLayout) ca7.m11819a(view2, R.id.childWrapper);
            if (flexboxLayout != null) {
                i = R.id.cvContactIconContainer;
                CardView cardView = (CardView) ca7.m11819a(view2, R.id.cvContactIconContainer);
                if (cardView != null) {
                    i = R.id.etContactName;
                    EditText editText = (EditText) ca7.m11819a(view2, R.id.etContactName);
                    if (editText != null) {
                        i = R.id.ivContactIcon;
                        ImageView imageView = (ImageView) ca7.m11819a(view2, R.id.ivContactIcon);
                        if (imageView != null) {
                            i = R.id.lContactAddressContainer;
                            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ca7.m11819a(view2, R.id.lContactAddressContainer);
                            if (linearLayoutCompat != null) {
                                ConstraintLayout constraintLayout = (ConstraintLayout) view2;
                                i = R.id.selectAllChains;
                                MaterialCheckBox materialCheckBox = (MaterialCheckBox) ca7.m11819a(view2, R.id.selectAllChains);
                                if (materialCheckBox != null) {
                                    i = R.id.selectChain;
                                    MaterialButton materialButton2 = (MaterialButton) ca7.m11819a(view2, R.id.selectChain);
                                    if (materialButton2 != null) {
                                        i = R.id.selectedChainWrapper;
                                        LinearLayout linearLayout = (LinearLayout) ca7.m11819a(view2, R.id.selectedChainWrapper);
                                        if (linearLayout != null) {
                                            i = R.id.toolbar;
                                            View a = ca7.m11819a(view2, R.id.toolbar);
                                            if (a != null) {
                                                tr6 a2 = tr6.m52423a(a);
                                                i = R.id.tvContactNameText;
                                                TextView textView = (TextView) ca7.m11819a(view2, R.id.tvContactNameText);
                                                if (textView != null) {
                                                    i = R.id.tvHintEnableForUseOnTheseChains;
                                                    TextView textView2 = (TextView) ca7.m11819a(view2, R.id.tvHintEnableForUseOnTheseChains);
                                                    if (textView2 != null) {
                                                        i = R.id.vContactAllChainDivider;
                                                        View a3 = ca7.m11819a(view2, R.id.vContactAllChainDivider);
                                                        if (a3 != null) {
                                                            i = R.id.vContactNameDivider;
                                                            View a4 = ca7.m11819a(view2, R.id.vContactNameDivider);
                                                            if (a4 != null) {
                                                                i = R.id.vContactSelectChainDivider;
                                                                View a5 = ca7.m11819a(view2, R.id.vContactSelectChainDivider);
                                                                if (a5 != null) {
                                                                    i = R.id.vSelectChainDivider;
                                                                    View a6 = ca7.m11819a(view2, R.id.vSelectChainDivider);
                                                                    if (a6 != null) {
                                                                        return new b92(constraintLayout, materialButton, flexboxLayout, cardView, editText, imageView, linearLayoutCompat, constraintLayout, materialCheckBox, materialButton2, linearLayout, a2, textView, textView2, a3, a4, a5, a6);
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
    public ConstraintLayout mo29498b() {
        return this.f21175a;
    }
}
