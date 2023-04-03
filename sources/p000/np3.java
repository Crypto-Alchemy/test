package p000;

import android.text.InputFilter;
import android.text.Spanned;

/* renamed from: np3 */
/* compiled from: MaxInputValidator */
public class np3 implements InputFilter {

    /* renamed from: a */
    public int f32167a;

    public np3(int i) {
        this.f32167a = i;
    }

    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        try {
            StringBuilder sb = new StringBuilder(spanned);
            sb.replace(i3, i4, charSequence.subSequence(i, i2).toString());
            if (Integer.parseInt(sb.toString()) <= this.f32167a) {
                return null;
            }
            return "";
        } catch (NumberFormatException unused) {
            return "";
        }
    }
}
