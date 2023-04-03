package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import net.safemoon.androidwallet.R;

/* renamed from: q9 */
/* compiled from: ActivityAktRegisterGuideBinding */
public final class C6395q9 {

    /* renamed from: a */
    public final ConstraintLayout f32983a;

    /* renamed from: b */
    public final MaterialButton f32984b;

    /* renamed from: c */
    public final c36 f32985c;

    /* renamed from: d */
    public final TextView f32986d;

    /* renamed from: e */
    public final TextView f32987e;

    /* renamed from: f */
    public final TextView f32988f;

    /* renamed from: g */
    public final TextView f32989g;

    /* renamed from: h */
    public final TextView f32990h;

    /* renamed from: i */
    public final TextView f32991i;

    /* renamed from: j */
    public final TextView f32992j;

    public C6395q9(ConstraintLayout constraintLayout, MaterialButton materialButton, c36 c36, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7) {
        this.f32983a = constraintLayout;
        this.f32984b = materialButton;
        this.f32985c = c36;
        this.f32986d = textView;
        this.f32987e = textView2;
        this.f32988f = textView3;
        this.f32989g = textView4;
        this.f32990h = textView5;
        this.f32991i = textView6;
        this.f32992j = textView7;
    }

    /* renamed from: a */
    public static C6395q9 m50456a(View view) {
        int i = R.id.btnContinue;
        MaterialButton materialButton = (MaterialButton) ca7.m11819a(view, R.id.btnContinue);
        if (materialButton != null) {
            i = R.id.toolbar;
            View a = ca7.m11819a(view, R.id.toolbar);
            if (a != null) {
                c36 a2 = c36.m32847a(a);
                i = R.id.tvFirstContent;
                TextView textView = (TextView) ca7.m11819a(view, R.id.tvFirstContent);
                if (textView != null) {
                    i = R.id.tvHeader;
                    TextView textView2 = (TextView) ca7.m11819a(view, R.id.tvHeader);
                    if (textView2 != null) {
                        i = R.id.tvLogin;
                        TextView textView3 = (TextView) ca7.m11819a(view, R.id.tvLogin);
                        if (textView3 != null) {
                            i = R.id.tvLoginNotice;
                            TextView textView4 = (TextView) ca7.m11819a(view, R.id.tvLoginNotice);
                            if (textView4 != null) {
                                i = R.id.tvSecondContent;
                                TextView textView5 = (TextView) ca7.m11819a(view, R.id.tvSecondContent);
                                if (textView5 != null) {
                                    i = R.id.tvThirdContent;
                                    TextView textView6 = (TextView) ca7.m11819a(view, R.id.tvThirdContent);
                                    if (textView6 != null) {
                                        i = R.id.tvTitle;
                                        TextView textView7 = (TextView) ca7.m11819a(view, R.id.tvTitle);
                                        if (textView7 != null) {
                                            return new C6395q9((ConstraintLayout) view, materialButton, a2, textView, textView2, textView3, textView4, textView5, textView6, textView7);
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

    /* renamed from: c */
    public static C6395q9 m50457c(LayoutInflater layoutInflater) {
        return m50458d(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: d */
    public static C6395q9 m50458d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_akt_register_guide, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m50456a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout mo47022b() {
        return this.f32983a;
    }
}
