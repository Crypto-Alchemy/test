package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.button.MaterialButton;
import net.safemoon.androidwallet.R;

/* renamed from: kz2 */
/* compiled from: ItemSimpleTextButtonBinding */
public final class kz2 {

    /* renamed from: a */
    public final MaterialButton f31129a;

    /* renamed from: b */
    public final MaterialButton f31130b;

    public kz2(MaterialButton materialButton, MaterialButton materialButton2) {
        this.f31129a = materialButton;
        this.f31130b = materialButton2;
    }

    /* renamed from: a */
    public static kz2 m47576a(View view) {
        if (view != null) {
            MaterialButton materialButton = (MaterialButton) view;
            return new kz2(materialButton, materialButton);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: c */
    public static kz2 m47577c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_simple_text_button, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m47576a(inflate);
    }

    /* renamed from: b */
    public MaterialButton mo45315b() {
        return this.f31129a;
    }
}
