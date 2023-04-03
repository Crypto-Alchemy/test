package p000;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import net.safemoon.androidwallet.R;

/* renamed from: ue1 */
/* compiled from: DialogAnchorCollectionOptionBinding */
public final class ue1 {

    /* renamed from: a */
    public final ConstraintLayout f34585a;

    /* renamed from: b */
    public final MaterialButton f34586b;

    /* renamed from: c */
    public final MaterialButton f34587c;

    /* renamed from: d */
    public final AppCompatTextView f34588d;

    public ue1(ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialButton materialButton2, AppCompatTextView appCompatTextView) {
        this.f34585a = constraintLayout;
        this.f34586b = materialButton;
        this.f34587c = materialButton2;
        this.f34588d = appCompatTextView;
    }

    /* renamed from: a */
    public static ue1 m52812a(View view) {
        int i = R.id.btnHiddenCollections;
        MaterialButton materialButton = (MaterialButton) ca7.m11819a(view, R.id.btnHiddenCollections);
        if (materialButton != null) {
            i = R.id.btnHideCollections;
            MaterialButton materialButton2 = (MaterialButton) ca7.m11819a(view, R.id.btnHideCollections);
            if (materialButton2 != null) {
                i = R.id.txtTitle;
                AppCompatTextView appCompatTextView = (AppCompatTextView) ca7.m11819a(view, R.id.txtTitle);
                if (appCompatTextView != null) {
                    return new ue1((ConstraintLayout) view, materialButton, materialButton2, appCompatTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
