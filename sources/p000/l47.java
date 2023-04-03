package p000;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* renamed from: l47 */
/* compiled from: UnprecomputeTextOnModificationSpannable */
public class l47 implements Spannable {

    /* renamed from: a */
    public boolean f14410a = false;

    /* renamed from: d */
    public Spannable f14411d;

    /* renamed from: l47$a */
    /* compiled from: UnprecomputeTextOnModificationSpannable */
    public static class C2737a {
        /* renamed from: a */
        public static IntStream m21223a(CharSequence charSequence) {
            return charSequence.chars();
        }

        /* renamed from: b */
        public static IntStream m21224b(CharSequence charSequence) {
            return charSequence.codePoints();
        }
    }

    /* renamed from: l47$b */
    /* compiled from: UnprecomputeTextOnModificationSpannable */
    public static class C2738b {
        /* renamed from: a */
        public boolean mo22663a(CharSequence charSequence) {
            return charSequence instanceof yt4;
        }
    }

    /* renamed from: l47$c */
    /* compiled from: UnprecomputeTextOnModificationSpannable */
    public static class C2739c extends C2738b {
        /* renamed from: a */
        public boolean mo22663a(CharSequence charSequence) {
            if ((charSequence instanceof PrecomputedText) || (charSequence instanceof yt4)) {
                return true;
            }
            return false;
        }
    }

    public l47(Spannable spannable) {
        this.f14411d = spannable;
    }

    /* renamed from: c */
    public static C2738b m21220c() {
        if (Build.VERSION.SDK_INT < 28) {
            return new C2738b();
        }
        return new C2739c();
    }

    /* renamed from: a */
    public final void mo22648a() {
        Spannable spannable = this.f14411d;
        if (!this.f14410a && m21220c().mo22663a(spannable)) {
            this.f14411d = new SpannableString(spannable);
        }
        this.f14410a = true;
    }

    /* renamed from: b */
    public Spannable mo22649b() {
        return this.f14411d;
    }

    public char charAt(int i) {
        return this.f14411d.charAt(i);
    }

    public IntStream chars() {
        return C2737a.m21223a(this.f14411d);
    }

    public IntStream codePoints() {
        return C2737a.m21224b(this.f14411d);
    }

    public int getSpanEnd(Object obj) {
        return this.f14411d.getSpanEnd(obj);
    }

    public int getSpanFlags(Object obj) {
        return this.f14411d.getSpanFlags(obj);
    }

    public int getSpanStart(Object obj) {
        return this.f14411d.getSpanStart(obj);
    }

    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        return this.f14411d.getSpans(i, i2, cls);
    }

    public int length() {
        return this.f14411d.length();
    }

    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.f14411d.nextSpanTransition(i, i2, cls);
    }

    public void removeSpan(Object obj) {
        mo22648a();
        this.f14411d.removeSpan(obj);
    }

    public void setSpan(Object obj, int i, int i2, int i3) {
        mo22648a();
        this.f14411d.setSpan(obj, i, i2, i3);
    }

    public CharSequence subSequence(int i, int i2) {
        return this.f14411d.subSequence(i, i2);
    }

    public String toString() {
        return this.f14411d.toString();
    }

    public l47(CharSequence charSequence) {
        this.f14411d = new SpannableString(charSequence);
    }
}
