package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.textview.MaterialTextView;
import net.safemoon.androidwallet.R;

/* renamed from: s9 */
/* compiled from: ActivityAktSecurityQuestionsBinding */
public final class C6472s9 {

    /* renamed from: A */
    public final TextView f33762A;

    /* renamed from: a */
    public final ConstraintLayout f33763a;

    /* renamed from: b */
    public final MaterialButton f33764b;

    /* renamed from: c */
    public final MaterialButton f33765c;

    /* renamed from: d */
    public final MaterialCheckBox f33766d;

    /* renamed from: e */
    public final MaterialTextView f33767e;

    /* renamed from: f */
    public final LinearLayout f33768f;

    /* renamed from: g */
    public final ConstraintLayout f33769g;

    /* renamed from: h */
    public final View f33770h;

    /* renamed from: i */
    public final View f33771i;

    /* renamed from: j */
    public final EditText f33772j;

    /* renamed from: k */
    public final EditText f33773k;

    /* renamed from: l */
    public final EditText f33774l;

    /* renamed from: m */
    public final EditText f33775m;

    /* renamed from: n */
    public final LinearLayout f33776n;

    /* renamed from: o */
    public final LinearLayout f33777o;

    /* renamed from: p */
    public final c36 f33778p;

    /* renamed from: q */
    public final TextView f33779q;

    /* renamed from: r */
    public final TextView f33780r;

    /* renamed from: s */
    public final AppCompatTextView f33781s;

    /* renamed from: t */
    public final TextView f33782t;

    /* renamed from: u */
    public final TextView f33783u;

    /* renamed from: v */
    public final TextView f33784v;

    /* renamed from: w */
    public final TextView f33785w;

    /* renamed from: x */
    public final TextView f33786x;

    /* renamed from: y */
    public final TextView f33787y;

    /* renamed from: z */
    public final AppCompatTextView f33788z;

    public C6472s9(ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialButton materialButton2, MaterialCheckBox materialCheckBox, MaterialTextView materialTextView, LinearLayout linearLayout, ConstraintLayout constraintLayout2, View view, View view2, EditText editText, EditText editText2, EditText editText3, EditText editText4, LinearLayout linearLayout2, LinearLayout linearLayout3, c36 c36, TextView textView, TextView textView2, AppCompatTextView appCompatTextView, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, AppCompatTextView appCompatTextView2, TextView textView9) {
        this.f33763a = constraintLayout;
        this.f33764b = materialButton;
        this.f33765c = materialButton2;
        this.f33766d = materialCheckBox;
        this.f33767e = materialTextView;
        this.f33768f = linearLayout;
        this.f33769g = constraintLayout2;
        this.f33770h = view;
        this.f33771i = view2;
        this.f33772j = editText;
        this.f33773k = editText2;
        this.f33774l = editText3;
        this.f33775m = editText4;
        this.f33776n = linearLayout2;
        this.f33777o = linearLayout3;
        this.f33778p = c36;
        this.f33779q = textView;
        this.f33780r = textView2;
        this.f33781s = appCompatTextView;
        this.f33782t = textView3;
        this.f33783u = textView4;
        this.f33784v = textView5;
        this.f33785w = textView6;
        this.f33786x = textView7;
        this.f33787y = textView8;
        this.f33788z = appCompatTextView2;
        this.f33762A = textView9;
    }

    /* renamed from: a */
    public static C6472s9 m51625a(View view) {
        View view2 = view;
        int i = R.id.btnMnemonic;
        MaterialButton materialButton = (MaterialButton) ca7.m11819a(view2, R.id.btnMnemonic);
        if (materialButton != null) {
            i = R.id.btnRegister;
            MaterialButton materialButton2 = (MaterialButton) ca7.m11819a(view2, R.id.btnRegister);
            if (materialButton2 != null) {
                i = R.id.chkTermsAgree;
                MaterialCheckBox materialCheckBox = (MaterialCheckBox) ca7.m11819a(view2, R.id.chkTermsAgree);
                if (materialCheckBox != null) {
                    i = R.id.chkTermsAgreeTC;
                    MaterialTextView materialTextView = (MaterialTextView) ca7.m11819a(view2, R.id.chkTermsAgreeTC);
                    if (materialTextView != null) {
                        i = R.id.content_layout;
                        LinearLayout linearLayout = (LinearLayout) ca7.m11819a(view2, R.id.content_layout);
                        if (linearLayout != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) view2;
                            i = R.id.divider_second_answer_et;
                            View a = ca7.m11819a(view2, R.id.divider_second_answer_et);
                            if (a != null) {
                                i = R.id.divider_second_question_spinner;
                                View a2 = ca7.m11819a(view2, R.id.divider_second_question_spinner);
                                if (a2 != null) {
                                    i = R.id.et_first_answer;
                                    EditText editText = (EditText) ca7.m11819a(view2, R.id.et_first_answer);
                                    if (editText != null) {
                                        i = R.id.et_first_your_question;
                                        EditText editText2 = (EditText) ca7.m11819a(view2, R.id.et_first_your_question);
                                        if (editText2 != null) {
                                            i = R.id.et_second_answer;
                                            EditText editText3 = (EditText) ca7.m11819a(view2, R.id.et_second_answer);
                                            if (editText3 != null) {
                                                i = R.id.et_second_your_question;
                                                EditText editText4 = (EditText) ca7.m11819a(view2, R.id.et_second_your_question);
                                                if (editText4 != null) {
                                                    i = R.id.firstQuestionLayout;
                                                    LinearLayout linearLayout2 = (LinearLayout) ca7.m11819a(view2, R.id.firstQuestionLayout);
                                                    if (linearLayout2 != null) {
                                                        i = R.id.secondQuestionLayout;
                                                        LinearLayout linearLayout3 = (LinearLayout) ca7.m11819a(view2, R.id.secondQuestionLayout);
                                                        if (linearLayout3 != null) {
                                                            i = R.id.toolbar;
                                                            View a3 = ca7.m11819a(view2, R.id.toolbar);
                                                            if (a3 != null) {
                                                                c36 a4 = c36.m32847a(a3);
                                                                i = R.id.tv_not_first_answer;
                                                                TextView textView = (TextView) ca7.m11819a(view2, R.id.tv_not_first_answer);
                                                                if (textView != null) {
                                                                    i = R.id.tv_not_second_answer;
                                                                    TextView textView2 = (TextView) ca7.m11819a(view2, R.id.tv_not_second_answer);
                                                                    if (textView2 != null) {
                                                                        i = R.id.txt_email;
                                                                        AppCompatTextView appCompatTextView = (AppCompatTextView) ca7.m11819a(view2, R.id.txt_email);
                                                                        if (appCompatTextView != null) {
                                                                            i = R.id.txt_email_header;
                                                                            TextView textView3 = (TextView) ca7.m11819a(view2, R.id.txt_email_header);
                                                                            if (textView3 != null) {
                                                                                i = R.id.txt_first_question_content;
                                                                                TextView textView4 = (TextView) ca7.m11819a(view2, R.id.txt_first_question_content);
                                                                                if (textView4 != null) {
                                                                                    i = R.id.txt_first_question_header;
                                                                                    TextView textView5 = (TextView) ca7.m11819a(view2, R.id.txt_first_question_header);
                                                                                    if (textView5 != null) {
                                                                                        i = R.id.txt_questions_header;
                                                                                        TextView textView6 = (TextView) ca7.m11819a(view2, R.id.txt_questions_header);
                                                                                        if (textView6 != null) {
                                                                                            i = R.id.txt_second_question_content;
                                                                                            TextView textView7 = (TextView) ca7.m11819a(view2, R.id.txt_second_question_content);
                                                                                            if (textView7 != null) {
                                                                                                i = R.id.txt_second_question_header;
                                                                                                TextView textView8 = (TextView) ca7.m11819a(view2, R.id.txt_second_question_header);
                                                                                                if (textView8 != null) {
                                                                                                    i = R.id.txt_username;
                                                                                                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) ca7.m11819a(view2, R.id.txt_username);
                                                                                                    if (appCompatTextView2 != null) {
                                                                                                        i = R.id.txt_username_header;
                                                                                                        TextView textView9 = (TextView) ca7.m11819a(view2, R.id.txt_username_header);
                                                                                                        if (textView9 != null) {
                                                                                                            return new C6472s9(constraintLayout, materialButton, materialButton2, materialCheckBox, materialTextView, linearLayout, constraintLayout, a, a2, editText, editText2, editText3, editText4, linearLayout2, linearLayout3, a4, textView, textView2, appCompatTextView, textView3, textView4, textView5, textView6, textView7, textView8, appCompatTextView2, textView9);
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

    /* renamed from: c */
    public static C6472s9 m51626c(LayoutInflater layoutInflater) {
        return m51627d(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: d */
    public static C6472s9 m51627d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_akt_security_questions, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m51625a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout mo47702b() {
        return this.f33763a;
    }
}
