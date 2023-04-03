package p000;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.C0593c;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* renamed from: fo1 */
/* compiled from: EmojiInputFilter */
public final class fo1 implements InputFilter {

    /* renamed from: a */
    public final TextView f11956a;

    /* renamed from: b */
    public C0593c.C0599e f11957b;

    /* renamed from: fo1$a */
    /* compiled from: EmojiInputFilter */
    public static class C2313a extends C0593c.C0599e {

        /* renamed from: a */
        public final Reference<TextView> f11958a;

        /* renamed from: b */
        public final Reference<fo1> f11959b;

        public C2313a(TextView textView, fo1 fo1) {
            this.f11958a = new WeakReference(textView);
            this.f11959b = new WeakReference(fo1);
        }

        /* renamed from: b */
        public void mo2437b() {
            CharSequence text;
            CharSequence o;
            super.mo2437b();
            TextView textView = this.f11958a.get();
            if (mo20031c(textView, this.f11959b.get()) && textView.isAttachedToWindow() && (text = textView.getText()) != (o = C0593c.m4517b().mo5627o(text))) {
                int selectionStart = Selection.getSelectionStart(o);
                int selectionEnd = Selection.getSelectionEnd(o);
                textView.setText(o);
                if (o instanceof Spannable) {
                    fo1.m17161b((Spannable) o, selectionStart, selectionEnd);
                }
            }
        }

        /* renamed from: c */
        public final boolean mo20031c(TextView textView, InputFilter inputFilter) {
            InputFilter[] filters;
            if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
                return false;
            }
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    return true;
                }
            }
            return false;
        }
    }

    public fo1(TextView textView) {
        this.f11956a = textView;
    }

    /* renamed from: b */
    public static void m17161b(Spannable spannable, int i, int i2) {
        if (i >= 0 && i2 >= 0) {
            Selection.setSelection(spannable, i, i2);
        } else if (i >= 0) {
            Selection.setSelection(spannable, i);
        } else if (i2 >= 0) {
            Selection.setSelection(spannable, i2);
        }
    }

    /* renamed from: a */
    public final C0593c.C0599e mo20029a() {
        if (this.f11957b == null) {
            this.f11957b = new C2313a(this.f11956a, this);
        }
        return this.f11957b;
    }

    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (this.f11956a.isInEditMode()) {
            return charSequence;
        }
        int d = C0593c.m4517b().mo5620d();
        if (d != 0) {
            boolean z = true;
            if (d == 1) {
                if (i4 == 0 && i3 == 0 && spanned.length() == 0 && charSequence == this.f11956a.getText()) {
                    z = false;
                }
                if (!z || charSequence == null) {
                    return charSequence;
                }
                if (!(i == 0 && i2 == charSequence.length())) {
                    charSequence = charSequence.subSequence(i, i2);
                }
                return C0593c.m4517b().mo5628p(charSequence, 0, charSequence.length());
            } else if (d != 3) {
                return charSequence;
            }
        }
        C0593c.m4517b().mo5631s(mo20029a());
        return charSequence;
    }
}
