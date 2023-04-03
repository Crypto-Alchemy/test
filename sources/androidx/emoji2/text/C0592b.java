package androidx.emoji2.text;

import android.text.TextPaint;
import androidx.emoji2.text.C0593c;

/* renamed from: androidx.emoji2.text.b */
/* compiled from: DefaultGlyphChecker */
public class C0592b implements C0593c.C0598d {

    /* renamed from: b */
    public static final ThreadLocal<StringBuilder> f3528b = new ThreadLocal<>();

    /* renamed from: a */
    public final TextPaint f3529a;

    public C0592b() {
        TextPaint textPaint = new TextPaint();
        this.f3529a = textPaint;
        textPaint.setTextSize(10.0f);
    }

    /* renamed from: b */
    public static StringBuilder m4514b() {
        ThreadLocal<StringBuilder> threadLocal = f3528b;
        if (threadLocal.get() == null) {
            threadLocal.set(new StringBuilder());
        }
        return threadLocal.get();
    }

    /* renamed from: a */
    public boolean mo5618a(CharSequence charSequence, int i, int i2, int i3) {
        StringBuilder b = m4514b();
        b.setLength(0);
        while (i < i2) {
            b.append(charSequence.charAt(i));
            i++;
        }
        return hl4.m18966a(this.f3529a, b.toString());
    }
}
