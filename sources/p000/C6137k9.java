package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;
import net.safemoon.androidwallet.R;

/* renamed from: k9 */
/* compiled from: ActivityAktAnswerQuestionBinding */
public final class C6137k9 {

    /* renamed from: a */
    public final ConstraintLayout f30741a;

    /* renamed from: b */
    public final MaterialButton f30742b;

    /* renamed from: c */
    public final LinearLayout f30743c;

    /* renamed from: d */
    public final ConstraintLayout f30744d;

    /* renamed from: e */
    public final TextInputLayout f30745e;

    /* renamed from: f */
    public final TextInputLayout f30746f;

    /* renamed from: g */
    public final AppCompatImageView f30747g;

    /* renamed from: h */
    public final c36 f30748h;

    /* renamed from: i */
    public final TextView f30749i;

    /* renamed from: j */
    public final TextView f30750j;

    public C6137k9(ConstraintLayout constraintLayout, MaterialButton materialButton, LinearLayout linearLayout, ConstraintLayout constraintLayout2, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, AppCompatImageView appCompatImageView, c36 c36, TextView textView, TextView textView2) {
        this.f30741a = constraintLayout;
        this.f30742b = materialButton;
        this.f30743c = linearLayout;
        this.f30744d = constraintLayout2;
        this.f30745e = textInputLayout;
        this.f30746f = textInputLayout2;
        this.f30747g = appCompatImageView;
        this.f30748h = c36;
        this.f30749i = textView;
        this.f30750j = textView2;
    }

    /* renamed from: a */
    public static C6137k9 m46929a(View view) {
        int i = R.id.btnContinue;
        MaterialButton materialButton = (MaterialButton) ca7.m11819a(view, R.id.btnContinue);
        if (materialButton != null) {
            i = R.id.content_layout;
            LinearLayout linearLayout = (LinearLayout) ca7.m11819a(view, R.id.content_layout);
            if (linearLayout != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i = R.id.et_first_answer;
                TextInputLayout textInputLayout = (TextInputLayout) ca7.m11819a(view, R.id.et_first_answer);
                if (textInputLayout != null) {
                    i = R.id.et_second_answer;
                    TextInputLayout textInputLayout2 = (TextInputLayout) ca7.m11819a(view, R.id.et_second_answer);
                    if (textInputLayout2 != null) {
                        i = R.id.img_logo;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) ca7.m11819a(view, R.id.img_logo);
                        if (appCompatImageView != null) {
                            i = R.id.toolbar;
                            View a = ca7.m11819a(view, R.id.toolbar);
                            if (a != null) {
                                c36 a2 = c36.m32847a(a);
                                i = R.id.txt_first_question_header;
                                TextView textView = (TextView) ca7.m11819a(view, R.id.txt_first_question_header);
                                if (textView != null) {
                                    i = R.id.txt_second_question_header;
                                    TextView textView2 = (TextView) ca7.m11819a(view, R.id.txt_second_question_header);
                                    if (textView2 != null) {
                                        return new C6137k9(constraintLayout, materialButton, linearLayout, constraintLayout, textInputLayout, textInputLayout2, appCompatImageView, a2, textView, textView2);
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
    public static C6137k9 m46930c(LayoutInflater layoutInflater) {
        return m46931d(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: d */
    public static C6137k9 m46931d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_akt_answer_question, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m46929a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout mo44705b() {
        return this.f30741a;
    }
}
