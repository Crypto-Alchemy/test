package p000;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: wp1 */
/* compiled from: EndIconDelegate */
public abstract class wp1 {

    /* renamed from: a */
    public TextInputLayout f35405a;

    /* renamed from: b */
    public Context f35406b;

    /* renamed from: c */
    public CheckableImageButton f35407c;

    public wp1(TextInputLayout textInputLayout) {
        this.f35405a = textInputLayout;
        this.f35406b = textInputLayout.getContext();
        this.f35407c = textInputLayout.getEndIconView();
    }

    /* renamed from: a */
    public abstract void mo33993a();

    /* renamed from: b */
    public boolean mo34016b(int i) {
        return true;
    }

    /* renamed from: c */
    public void mo33994c(boolean z) {
    }

    /* renamed from: d */
    public boolean mo34017d() {
        return false;
    }
}
