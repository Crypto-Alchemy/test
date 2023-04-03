package p000;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* renamed from: co1 */
/* compiled from: EmojiEditTextHelper */
public final class co1 {

    /* renamed from: a */
    public final C1699b f8507a;

    /* renamed from: b */
    public int f8508b = Integer.MAX_VALUE;

    /* renamed from: c */
    public int f8509c = 0;

    /* renamed from: co1$a */
    /* compiled from: EmojiEditTextHelper */
    public static class C1698a extends C1699b {

        /* renamed from: a */
        public final EditText f8510a;

        /* renamed from: b */
        public final ko1 f8511b;

        public C1698a(EditText editText, boolean z) {
            this.f8510a = editText;
            ko1 ko1 = new ko1(editText, z);
            this.f8511b = ko1;
            editText.addTextChangedListener(ko1);
            editText.setEditableFactory(do1.getInstance());
        }

        /* renamed from: a */
        public KeyListener mo12140a(KeyListener keyListener) {
            if (keyListener instanceof go1) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            if (keyListener instanceof NumberKeyListener) {
                return keyListener;
            }
            return new go1(keyListener);
        }

        /* renamed from: b */
        public InputConnection mo12141b(InputConnection inputConnection, EditorInfo editorInfo) {
            if (inputConnection instanceof eo1) {
                return inputConnection;
            }
            return new eo1(this.f8510a, inputConnection, editorInfo);
        }

        /* renamed from: c */
        public void mo12142c(boolean z) {
            this.f8511b.mo22420c(z);
        }
    }

    /* renamed from: co1$b */
    /* compiled from: EmojiEditTextHelper */
    public static class C1699b {
        /* renamed from: a */
        public KeyListener mo12140a(KeyListener keyListener) {
            throw null;
        }

        /* renamed from: b */
        public InputConnection mo12141b(InputConnection inputConnection, EditorInfo editorInfo) {
            throw null;
        }

        /* renamed from: c */
        public void mo12142c(boolean z) {
            throw null;
        }
    }

    public co1(EditText editText, boolean z) {
        gu4.m18429g(editText, "editText cannot be null");
        this.f8507a = new C1698a(editText, z);
    }

    /* renamed from: a */
    public KeyListener mo12137a(KeyListener keyListener) {
        return this.f8507a.mo12140a(keyListener);
    }

    /* renamed from: b */
    public InputConnection mo12138b(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f8507a.mo12141b(inputConnection, editorInfo);
    }

    /* renamed from: c */
    public void mo12139c(boolean z) {
        this.f8507a.mo12142c(z);
    }
}
