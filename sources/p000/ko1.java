package p000;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.C0593c;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* renamed from: ko1 */
/* compiled from: EmojiTextWatcher */
public final class ko1 implements TextWatcher {

    /* renamed from: a */
    public final EditText f14231a;

    /* renamed from: d */
    public final boolean f14232d;

    /* renamed from: e */
    public C0593c.C0599e f14233e;

    /* renamed from: g */
    public int f14234g = Integer.MAX_VALUE;

    /* renamed from: k */
    public int f14235k = 0;

    /* renamed from: r */
    public boolean f14236r;

    /* renamed from: ko1$a */
    /* compiled from: EmojiTextWatcher */
    public static class C2719a extends C0593c.C0599e {

        /* renamed from: a */
        public final Reference<EditText> f14237a;

        public C2719a(EditText editText) {
            this.f14237a = new WeakReference(editText);
        }

        /* renamed from: b */
        public void mo2437b() {
            super.mo2437b();
            ko1.m20933b(this.f14237a.get(), 1);
        }
    }

    public ko1(EditText editText, boolean z) {
        this.f14231a = editText;
        this.f14232d = z;
        this.f14236r = true;
    }

    /* renamed from: b */
    public static void m20933b(EditText editText, int i) {
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            C0593c.m4517b().mo5627o(editableText);
            fo1.m17161b(editableText, selectionStart, selectionEnd);
        }
    }

    /* renamed from: a */
    public final C0593c.C0599e mo22417a() {
        if (this.f14233e == null) {
            this.f14233e = new C2719a(this.f14231a);
        }
        return this.f14233e;
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* renamed from: c */
    public void mo22420c(boolean z) {
        if (this.f14236r != z) {
            if (this.f14233e != null) {
                C0593c.m4517b().mo5632t(this.f14233e);
            }
            this.f14236r = z;
            if (z) {
                m20933b(this.f14231a, C0593c.m4517b().mo5620d());
            }
        }
    }

    /* renamed from: d */
    public final boolean mo22421d() {
        if (!this.f14236r || (!this.f14232d && !C0593c.m4521h())) {
            return true;
        }
        return false;
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (!this.f14231a.isInEditMode() && !mo22421d() && i2 <= i3 && (charSequence instanceof Spannable)) {
            int d = C0593c.m4517b().mo5620d();
            if (d != 0) {
                if (d == 1) {
                    C0593c.m4517b().mo5630r((Spannable) charSequence, i, i + i3, this.f14234g, this.f14235k);
                    return;
                } else if (d != 3) {
                    return;
                }
            }
            C0593c.m4517b().mo5631s(mo22417a());
        }
    }
}
