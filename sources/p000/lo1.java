package p000;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import androidx.emoji2.text.C0593c;

/* renamed from: lo1 */
/* compiled from: EmojiTransformationMethod */
public class lo1 implements TransformationMethod {

    /* renamed from: a */
    public final TransformationMethod f14618a;

    public lo1(TransformationMethod transformationMethod) {
        this.f14618a = transformationMethod;
    }

    /* renamed from: a */
    public TransformationMethod mo22889a() {
        return this.f14618a;
    }

    public CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f14618a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || C0593c.m4517b().mo5620d() != 1) {
            return charSequence;
        }
        return C0593c.m4517b().mo5627o(charSequence);
    }

    public void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
        TransformationMethod transformationMethod = this.f14618a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z, i, rect);
        }
    }
}
