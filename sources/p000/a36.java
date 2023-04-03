package p000;

import android.view.View;
import com.google.android.material.button.MaterialButton;

/* renamed from: a36 */
/* compiled from: SimpleTextButtonNoInsetBinding */
public final class a36 {

    /* renamed from: a */
    public final MaterialButton f20798a;

    /* renamed from: b */
    public final MaterialButton f20799b;

    public a36(MaterialButton materialButton, MaterialButton materialButton2) {
        this.f20798a = materialButton;
        this.f20799b = materialButton2;
    }

    /* renamed from: a */
    public static a36 m31661a(View view) {
        if (view != null) {
            MaterialButton materialButton = (MaterialButton) view;
            return new a36(materialButton, materialButton);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: b */
    public MaterialButton mo28803b() {
        return this.f20798a;
    }
}
