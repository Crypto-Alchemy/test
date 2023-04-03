package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import net.safemoon.androidwallet.R;

/* renamed from: ya */
/* compiled from: ActivitySetPasswordBinding */
public final class C6727ya {

    /* renamed from: a */
    public final ConstraintLayout f35807a;

    /* renamed from: b */
    public final AppCompatButton f35808b;

    /* renamed from: c */
    public final EditText f35809c;

    /* renamed from: d */
    public final EditText f35810d;

    /* renamed from: e */
    public final Group f35811e;

    /* renamed from: f */
    public final ImageView f35812f;

    /* renamed from: g */
    public final AppCompatImageView f35813g;

    /* renamed from: h */
    public final ImageView f35814h;

    /* renamed from: i */
    public final ImageView f35815i;

    /* renamed from: j */
    public final ImageView f35816j;

    /* renamed from: k */
    public final ImageView f35817k;

    /* renamed from: l */
    public final TextView f35818l;

    /* renamed from: m */
    public final TextView f35819m;

    /* renamed from: n */
    public final TextView f35820n;

    /* renamed from: o */
    public final TextView f35821o;

    /* renamed from: p */
    public final TextView f35822p;

    /* renamed from: q */
    public final TextView f35823q;

    /* renamed from: r */
    public final TextView f35824r;

    /* renamed from: s */
    public final TextView f35825s;

    /* renamed from: t */
    public final TextView f35826t;

    public C6727ya(ConstraintLayout constraintLayout, AppCompatButton appCompatButton, EditText editText, EditText editText2, Group group, ImageView imageView, AppCompatImageView appCompatImageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9) {
        this.f35807a = constraintLayout;
        this.f35808b = appCompatButton;
        this.f35809c = editText;
        this.f35810d = editText2;
        this.f35811e = group;
        this.f35812f = imageView;
        this.f35813g = appCompatImageView;
        this.f35814h = imageView2;
        this.f35815i = imageView3;
        this.f35816j = imageView4;
        this.f35817k = imageView5;
        this.f35818l = textView;
        this.f35819m = textView2;
        this.f35820n = textView3;
        this.f35821o = textView4;
        this.f35822p = textView5;
        this.f35823q = textView6;
        this.f35824r = textView7;
        this.f35825s = textView8;
        this.f35826t = textView9;
    }

    /* renamed from: a */
    public static C6727ya m54661a(View view) {
        View view2 = view;
        int i = R.id.btnConfirm;
        AppCompatButton appCompatButton = (AppCompatButton) ca7.m11819a(view2, R.id.btnConfirm);
        if (appCompatButton != null) {
            i = R.id.et_confirm;
            EditText editText = (EditText) ca7.m11819a(view2, R.id.et_confirm);
            if (editText != null) {
                i = R.id.et_enter;
                EditText editText2 = (EditText) ca7.m11819a(view2, R.id.et_enter);
                if (editText2 != null) {
                    i = R.id.gp_require;
                    Group group = (Group) ca7.m11819a(view2, R.id.gp_require);
                    if (group != null) {
                        i = R.id.imageView15;
                        ImageView imageView = (ImageView) ca7.m11819a(view2, R.id.imageView15);
                        if (imageView != null) {
                            i = R.id.img_logo;
                            AppCompatImageView appCompatImageView = (AppCompatImageView) ca7.m11819a(view2, R.id.img_logo);
                            if (appCompatImageView != null) {
                                i = R.id.iv_1;
                                ImageView imageView2 = (ImageView) ca7.m11819a(view2, R.id.iv_1);
                                if (imageView2 != null) {
                                    i = R.id.iv_2;
                                    ImageView imageView3 = (ImageView) ca7.m11819a(view2, R.id.iv_2);
                                    if (imageView3 != null) {
                                        i = R.id.iv_3;
                                        ImageView imageView4 = (ImageView) ca7.m11819a(view2, R.id.iv_3);
                                        if (imageView4 != null) {
                                            i = R.id.iv_4;
                                            ImageView imageView5 = (ImageView) ca7.m11819a(view2, R.id.iv_4);
                                            if (imageView5 != null) {
                                                i = R.id.min_char;
                                                TextView textView = (TextView) ca7.m11819a(view2, R.id.min_char);
                                                if (textView != null) {
                                                    i = R.id.textView;
                                                    TextView textView2 = (TextView) ca7.m11819a(view2, R.id.textView);
                                                    if (textView2 != null) {
                                                        i = R.id.textView1;
                                                        TextView textView3 = (TextView) ca7.m11819a(view2, R.id.textView1);
                                                        if (textView3 != null) {
                                                            i = R.id.textView2;
                                                            TextView textView4 = (TextView) ca7.m11819a(view2, R.id.textView2);
                                                            if (textView4 != null) {
                                                                i = R.id.textView21;
                                                                TextView textView5 = (TextView) ca7.m11819a(view2, R.id.textView21);
                                                                if (textView5 != null) {
                                                                    i = R.id.tv_cap;
                                                                    TextView textView6 = (TextView) ca7.m11819a(view2, R.id.tv_cap);
                                                                    if (textView6 != null) {
                                                                        i = R.id.tv_not;
                                                                        TextView textView7 = (TextView) ca7.m11819a(view2, R.id.tv_not);
                                                                        if (textView7 != null) {
                                                                            i = R.id.tv_number;
                                                                            TextView textView8 = (TextView) ca7.m11819a(view2, R.id.tv_number);
                                                                            if (textView8 != null) {
                                                                                i = R.id.tv_special;
                                                                                TextView textView9 = (TextView) ca7.m11819a(view2, R.id.tv_special);
                                                                                if (textView9 != null) {
                                                                                    return new C6727ya((ConstraintLayout) view2, appCompatButton, editText, editText2, group, imageView, appCompatImageView, imageView2, imageView3, imageView4, imageView5, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9);
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
    public static C6727ya m54662c(LayoutInflater layoutInflater) {
        return m54663d(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: d */
    public static C6727ya m54663d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_set_password, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m54661a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout mo49618b() {
        return this.f35807a;
    }
}
