package p000;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;

/* renamed from: bn */
/* compiled from: AppCompatEmojiTextHelper */
public class C1640bn {

    /* renamed from: a */
    public final TextView f8187a;

    /* renamed from: b */
    public final jo1 f8188b;

    public C1640bn(TextView textView) {
        this.f8187a = textView;
        this.f8188b = new jo1(textView, false);
    }

    /* renamed from: a */
    public InputFilter[] mo11702a(InputFilter[] inputFilterArr) {
        return this.f8188b.mo22007a(inputFilterArr);
    }

    /* renamed from: b */
    public boolean mo11703b() {
        return this.f8188b.mo22008b();
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    public void mo11704c(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f8187a.getContext().obtainStyledAttributes(attributeSet, j65.AppCompatTextView, i, 0);
        try {
            int i2 = j65.AppCompatTextView_emojiCompatEnabled;
            boolean z = true;
            if (obtainStyledAttributes.hasValue(i2)) {
                z = obtainStyledAttributes.getBoolean(i2, true);
            }
            obtainStyledAttributes.recycle();
            mo11706e(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* renamed from: d */
    public void mo11705d(boolean z) {
        this.f8188b.mo22009c(z);
    }

    /* renamed from: e */
    public void mo11706e(boolean z) {
        this.f8188b.mo22010d(z);
    }

    /* renamed from: f */
    public TransformationMethod mo11707f(TransformationMethod transformationMethod) {
        return this.f8188b.mo22011e(transformationMethod);
    }
}
