package p000;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: y7 */
/* compiled from: AccessibilityClickableSpanCompat */
public final class C3657y7 extends ClickableSpan {

    /* renamed from: a */
    public final int f20056a;

    /* renamed from: d */
    public final C3335t8 f20057d;

    /* renamed from: e */
    public final int f20058e;

    public C3657y7(int i, C3335t8 t8Var, int i2) {
        this.f20056a = i;
        this.f20057d = t8Var;
        this.f20058e = i2;
    }

    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f20056a);
        this.f20057d.mo26221U(this.f20058e, bundle);
    }
}
