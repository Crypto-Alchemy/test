package p000;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.google.android.material.textview.MaterialTextView;
import net.safemoon.androidwallet.R;

/* renamed from: na2 */
/* compiled from: FragmentSecurityBinding */
public final class na2 {

    /* renamed from: A */
    public final TextView f32026A;

    /* renamed from: B */
    public final TextView f32027B;

    /* renamed from: C */
    public final TextView f32028C;

    /* renamed from: D */
    public final TextView f32029D;

    /* renamed from: E */
    public final TextView f32030E;

    /* renamed from: F */
    public final MaterialTextView f32031F;

    /* renamed from: G */
    public final MaterialTextView f32032G;

    /* renamed from: H */
    public final MaterialTextView f32033H;

    /* renamed from: a */
    public final ConstraintLayout f32034a;

    /* renamed from: b */
    public final MaterialButton f32035b;

    /* renamed from: c */
    public final ConstraintLayout f32036c;

    /* renamed from: d */
    public final CardView f32037d;

    /* renamed from: e */
    public final CardView f32038e;

    /* renamed from: f */
    public final CardView f32039f;

    /* renamed from: g */
    public final MaterialCardView f32040g;

    /* renamed from: h */
    public final MaterialCardView f32041h;

    /* renamed from: i */
    public final MaterialCardView f32042i;

    /* renamed from: j */
    public final CardView f32043j;

    /* renamed from: k */
    public final EditText f32044k;

    /* renamed from: l */
    public final Group f32045l;

    /* renamed from: m */
    public final Group f32046m;

    /* renamed from: n */
    public final SwitchMaterial f32047n;

    /* renamed from: o */
    public final SwitchMaterial f32048o;

    /* renamed from: p */
    public final SwitchMaterial f32049p;

    /* renamed from: q */
    public final TextView f32050q;

    /* renamed from: r */
    public final TextView f32051r;

    /* renamed from: s */
    public final TextView f32052s;

    /* renamed from: t */
    public final TextView f32053t;

    /* renamed from: u */
    public final TextView f32054u;

    /* renamed from: v */
    public final TextView f32055v;

    /* renamed from: w */
    public final b36 f32056w;

    /* renamed from: x */
    public final TextView f32057x;

    /* renamed from: y */
    public final MaterialTextView f32058y;

    /* renamed from: z */
    public final TextView f32059z;

    public na2(ConstraintLayout constraintLayout, MaterialButton materialButton, ConstraintLayout constraintLayout2, CardView cardView, CardView cardView2, CardView cardView3, MaterialCardView materialCardView, MaterialCardView materialCardView2, MaterialCardView materialCardView3, CardView cardView4, EditText editText, Group group, Group group2, SwitchMaterial switchMaterial, SwitchMaterial switchMaterial2, SwitchMaterial switchMaterial3, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, b36 b36, TextView textView7, MaterialTextView materialTextView, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, MaterialTextView materialTextView2, MaterialTextView materialTextView3, MaterialTextView materialTextView4) {
        this.f32034a = constraintLayout;
        this.f32035b = materialButton;
        this.f32036c = constraintLayout2;
        this.f32037d = cardView;
        this.f32038e = cardView2;
        this.f32039f = cardView3;
        this.f32040g = materialCardView;
        this.f32041h = materialCardView2;
        this.f32042i = materialCardView3;
        this.f32043j = cardView4;
        this.f32044k = editText;
        this.f32045l = group;
        this.f32046m = group2;
        this.f32047n = switchMaterial;
        this.f32048o = switchMaterial2;
        this.f32049p = switchMaterial3;
        this.f32050q = textView;
        this.f32051r = textView2;
        this.f32052s = textView3;
        this.f32053t = textView4;
        this.f32054u = textView5;
        this.f32055v = textView6;
        this.f32056w = b36;
        this.f32057x = textView7;
        this.f32058y = materialTextView;
        this.f32059z = textView8;
        this.f32026A = textView9;
        this.f32027B = textView10;
        this.f32028C = textView11;
        this.f32029D = textView12;
        this.f32030E = textView13;
        this.f32031F = materialTextView2;
        this.f32032G = materialTextView3;
        this.f32033H = materialTextView4;
    }

    /* renamed from: a */
    public static na2 m48714a(View view) {
        View view2 = view;
        int i = R.id.btnUnpair;
        MaterialButton materialButton = (MaterialButton) ca7.m11819a(view2, R.id.btnUnpair);
        if (materialButton != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view2;
            i = R.id.cv_2;
            CardView cardView = (CardView) ca7.m11819a(view2, R.id.cv_2);
            if (cardView != null) {
                i = R.id.cv2Layer;
                CardView cardView2 = (CardView) ca7.m11819a(view2, R.id.cv2Layer);
                if (cardView2 != null) {
                    i = R.id.cv_3;
                    CardView cardView3 = (CardView) ca7.m11819a(view2, R.id.cv_3);
                    if (cardView3 != null) {
                        i = R.id.cvChangeEmail;
                        MaterialCardView materialCardView = (MaterialCardView) ca7.m11819a(view2, R.id.cvChangeEmail);
                        if (materialCardView != null) {
                            i = R.id.cvChangePassword;
                            MaterialCardView materialCardView2 = (MaterialCardView) ca7.m11819a(view2, R.id.cvChangePassword);
                            if (materialCardView2 != null) {
                                i = R.id.cvGoogleAuth;
                                MaterialCardView materialCardView3 = (MaterialCardView) ca7.m11819a(view2, R.id.cvGoogleAuth);
                                if (materialCardView3 != null) {
                                    i = R.id.cvLayerTransactionSigning;
                                    CardView cardView4 = (CardView) ca7.m11819a(view2, R.id.cvLayerTransactionSigning);
                                    if (cardView4 != null) {
                                        i = R.id.et2FaPassword;
                                        EditText editText = (EditText) ca7.m11819a(view2, R.id.et2FaPassword);
                                        if (editText != null) {
                                            i = R.id.gp_pass;
                                            Group group = (Group) ca7.m11819a(view2, R.id.gp_pass);
                                            if (group != null) {
                                                i = R.id.group2;
                                                Group group2 = (Group) ca7.m11819a(view2, R.id.group2);
                                                if (group2 != null) {
                                                    i = R.id.switch2stepVerification;
                                                    SwitchMaterial switchMaterial = (SwitchMaterial) ca7.m11819a(view2, R.id.switch2stepVerification);
                                                    if (switchMaterial != null) {
                                                        i = R.id.switchAuthTransactionSign;
                                                        SwitchMaterial switchMaterial2 = (SwitchMaterial) ca7.m11819a(view2, R.id.switchAuthTransactionSign);
                                                        if (switchMaterial2 != null) {
                                                            i = R.id.switchTwoLayerConfirmation;
                                                            SwitchMaterial switchMaterial3 = (SwitchMaterial) ca7.m11819a(view2, R.id.switchTwoLayerConfirmation);
                                                            if (switchMaterial3 != null) {
                                                                i = R.id.textView20;
                                                                TextView textView = (TextView) ca7.m11819a(view2, R.id.textView20);
                                                                if (textView != null) {
                                                                    i = R.id.textView21;
                                                                    TextView textView2 = (TextView) ca7.m11819a(view2, R.id.textView21);
                                                                    if (textView2 != null) {
                                                                        i = R.id.textView22;
                                                                        TextView textView3 = (TextView) ca7.m11819a(view2, R.id.textView22);
                                                                        if (textView3 != null) {
                                                                            i = R.id.textView25;
                                                                            TextView textView4 = (TextView) ca7.m11819a(view2, R.id.textView25);
                                                                            if (textView4 != null) {
                                                                                i = R.id.textView35;
                                                                                TextView textView5 = (TextView) ca7.m11819a(view2, R.id.textView35);
                                                                                if (textView5 != null) {
                                                                                    i = R.id.textView8;
                                                                                    TextView textView6 = (TextView) ca7.m11819a(view2, R.id.textView8);
                                                                                    if (textView6 != null) {
                                                                                        i = R.id.toolbar;
                                                                                        View a = ca7.m11819a(view2, R.id.toolbar);
                                                                                        if (a != null) {
                                                                                            b36 a2 = b36.m32346a(a);
                                                                                            i = R.id.tv2FaErrorVerification;
                                                                                            TextView textView7 = (TextView) ca7.m11819a(view2, R.id.tv2FaErrorVerification);
                                                                                            if (textView7 != null) {
                                                                                                i = R.id.tv2FaInfo;
                                                                                                MaterialTextView materialTextView = (MaterialTextView) ca7.m11819a(view2, R.id.tv2FaInfo);
                                                                                                if (materialTextView != null) {
                                                                                                    i = R.id.tv_copy;
                                                                                                    TextView textView8 = (TextView) ca7.m11819a(view2, R.id.tv_copy);
                                                                                                    if (textView8 != null) {
                                                                                                        i = R.id.tv_passpharese_reveal;
                                                                                                        TextView textView9 = (TextView) ca7.m11819a(view2, R.id.tv_passpharese_reveal);
                                                                                                        if (textView9 != null) {
                                                                                                            i = R.id.tv_passphrase;
                                                                                                            TextView textView10 = (TextView) ca7.m11819a(view2, R.id.tv_passphrase);
                                                                                                            if (textView10 != null) {
                                                                                                                i = R.id.tv_private;
                                                                                                                TextView textView11 = (TextView) ca7.m11819a(view2, R.id.tv_private);
                                                                                                                if (textView11 != null) {
                                                                                                                    i = R.id.tv_private_copy;
                                                                                                                    TextView textView12 = (TextView) ca7.m11819a(view2, R.id.tv_private_copy);
                                                                                                                    if (textView12 != null) {
                                                                                                                        i = R.id.tv_private_key_reveal;
                                                                                                                        TextView textView13 = (TextView) ca7.m11819a(view2, R.id.tv_private_key_reveal);
                                                                                                                        if (textView13 != null) {
                                                                                                                            i = R.id.txtTitleAuthTransactionSign;
                                                                                                                            MaterialTextView materialTextView2 = (MaterialTextView) ca7.m11819a(view2, R.id.txtTitleAuthTransactionSign);
                                                                                                                            if (materialTextView2 != null) {
                                                                                                                                i = R.id.txtTitleSecurity;
                                                                                                                                MaterialTextView materialTextView3 = (MaterialTextView) ca7.m11819a(view2, R.id.txtTitleSecurity);
                                                                                                                                if (materialTextView3 != null) {
                                                                                                                                    i = R.id.txtTitleTV;
                                                                                                                                    MaterialTextView materialTextView4 = (MaterialTextView) ca7.m11819a(view2, R.id.txtTitleTV);
                                                                                                                                    if (materialTextView4 != null) {
                                                                                                                                        return new na2(constraintLayout, materialButton, constraintLayout, cardView, cardView2, cardView3, materialCardView, materialCardView2, materialCardView3, cardView4, editText, group, group2, switchMaterial, switchMaterial2, switchMaterial3, textView, textView2, textView3, textView4, textView5, textView6, a2, textView7, materialTextView, textView8, textView9, textView10, textView11, textView12, textView13, materialTextView2, materialTextView3, materialTextView4);
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
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: b */
    public ConstraintLayout mo46048b() {
        return this.f32034a;
    }
}
