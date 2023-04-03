package p000;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* renamed from: an */
/* compiled from: AppCompatEmojiEditTextHelper */
public class C0038an {

    /* renamed from: a */
    public final EditText f192a;

    /* renamed from: b */
    public final co1 f193b;

    public C0038an(EditText editText) {
        this.f192a = editText;
        this.f193b = new co1(editText, false);
    }

    /* renamed from: a */
    public KeyListener mo419a(KeyListener keyListener) {
        if (mo420b(keyListener)) {
            return this.f193b.mo12137a(keyListener);
        }
        return keyListener;
    }

    /* renamed from: b */
    public boolean mo420b(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    public void mo421c(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f192a.getContext().obtainStyledAttributes(attributeSet, j65.AppCompatTextView, i, 0);
        try {
            int i2 = j65.AppCompatTextView_emojiCompatEnabled;
            boolean z = true;
            if (obtainStyledAttributes.hasValue(i2)) {
                z = obtainStyledAttributes.getBoolean(i2, true);
            }
            obtainStyledAttributes.recycle();
            mo423e(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* renamed from: d */
    public InputConnection mo422d(InputConnection inputConnection, EditorInfo editorInfo) {
        return this.f193b.mo12138b(inputConnection, editorInfo);
    }

    /* renamed from: e */
    public void mo423e(boolean z) {
        this.f193b.mo12139c(z);
    }
}
