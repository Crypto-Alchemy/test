package p000;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import androidx.emoji2.text.C0593c;

/* renamed from: eo1 */
/* compiled from: EmojiInputConnection */
public final class eo1 extends InputConnectionWrapper {

    /* renamed from: a */
    public final TextView f11296a;

    /* renamed from: b */
    public final C2241a f11297b;

    /* renamed from: eo1$a */
    /* compiled from: EmojiInputConnection */
    public static class C2241a {
        /* renamed from: a */
        public boolean mo19436a(InputConnection inputConnection, Editable editable, int i, int i2, boolean z) {
            return C0593c.m4518e(inputConnection, editable, i, i2, z);
        }

        /* renamed from: b */
        public void mo19437b(EditorInfo editorInfo) {
            if (C0593c.m4521h()) {
                C0593c.m4517b().mo5633u(editorInfo);
            }
        }
    }

    public eo1(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        this(textView, inputConnection, editorInfo, new C2241a());
    }

    /* renamed from: a */
    public final Editable mo19433a() {
        return this.f11296a.getEditableText();
    }

    public boolean deleteSurroundingText(int i, int i2) {
        if (this.f11297b.mo19436a(this, mo19433a(), i, i2, false) || super.deleteSurroundingText(i, i2)) {
            return true;
        }
        return false;
    }

    public boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        if (this.f11297b.mo19436a(this, mo19433a(), i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2)) {
            return true;
        }
        return false;
    }

    public eo1(TextView textView, InputConnection inputConnection, EditorInfo editorInfo, C2241a aVar) {
        super(inputConnection, false);
        this.f11296a = textView;
        this.f11297b = aVar;
        aVar.mo19437b(editorInfo);
    }
}
