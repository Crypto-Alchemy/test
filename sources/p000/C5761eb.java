package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import net.safemoon.androidwallet.R;

/* renamed from: eb */
/* compiled from: ActivityWipeDataBinding */
public final class C5761eb {

    /* renamed from: a */
    public final ConstraintLayout f28521a;

    /* renamed from: b */
    public final MaterialButton f28522b;

    /* renamed from: c */
    public final MaterialButton f28523c;

    /* renamed from: d */
    public final AppCompatImageView f28524d;

    /* renamed from: e */
    public final AppCompatImageView f28525e;

    /* renamed from: f */
    public final c36 f28526f;

    /* renamed from: g */
    public final TextView f28527g;

    /* renamed from: h */
    public final TextView f28528h;

    /* renamed from: i */
    public final TextView f28529i;

    public C5761eb(ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialButton materialButton2, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, c36 c36, TextView textView, TextView textView2, TextView textView3) {
        this.f28521a = constraintLayout;
        this.f28522b = materialButton;
        this.f28523c = materialButton2;
        this.f28524d = appCompatImageView;
        this.f28525e = appCompatImageView2;
        this.f28526f = c36;
        this.f28527g = textView;
        this.f28528h = textView2;
        this.f28529i = textView3;
    }

    /* renamed from: a */
    public static C5761eb m43882a(View view) {
        int i = R.id.btnCancel;
        MaterialButton materialButton = (MaterialButton) ca7.m11819a(view, R.id.btnCancel);
        if (materialButton != null) {
            i = R.id.btnConfirm;
            MaterialButton materialButton2 = (MaterialButton) ca7.m11819a(view, R.id.btnConfirm);
            if (materialButton2 != null) {
                i = R.id.imgCancel;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ca7.m11819a(view, R.id.imgCancel);
                if (appCompatImageView != null) {
                    i = R.id.imgCard;
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) ca7.m11819a(view, R.id.imgCard);
                    if (appCompatImageView2 != null) {
                        i = R.id.toolbar;
                        View a = ca7.m11819a(view, R.id.toolbar);
                        if (a != null) {
                            c36 a2 = c36.m32847a(a);
                            i = R.id.tvLoginNote;
                            TextView textView = (TextView) ca7.m11819a(view, R.id.tvLoginNote);
                            if (textView != null) {
                                i = R.id.tvNoticeContent;
                                TextView textView2 = (TextView) ca7.m11819a(view, R.id.tvNoticeContent);
                                if (textView2 != null) {
                                    i = R.id.tvResetWalletsHeader;
                                    TextView textView3 = (TextView) ca7.m11819a(view, R.id.tvResetWalletsHeader);
                                    if (textView3 != null) {
                                        return new C5761eb((ConstraintLayout) view, materialButton, materialButton2, appCompatImageView, appCompatImageView2, a2, textView, textView2, textView3);
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
    public static C5761eb m43883c(LayoutInflater layoutInflater) {
        return m43884d(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: d */
    public static C5761eb m43884d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_wipe_data, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m43882a(inflate);
    }

    /* renamed from: b */
    public ConstraintLayout mo42200b() {
        return this.f28521a;
    }
}
