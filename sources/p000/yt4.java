package p000;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;

/* renamed from: yt4 */
/* compiled from: PrecomputedTextCompat */
public class yt4 implements Spannable {

    /* renamed from: g */
    public static final Object f20368g = new Object();

    /* renamed from: a */
    public final Spannable f20369a;

    /* renamed from: d */
    public final C3695a f20370d;

    /* renamed from: e */
    public final PrecomputedText f20371e;

    /* renamed from: a */
    public C3695a mo28238a() {
        return this.f20370d;
    }

    /* renamed from: b */
    public PrecomputedText mo28239b() {
        Spannable spannable = this.f20369a;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    public char charAt(int i) {
        return this.f20369a.charAt(i);
    }

    public int getSpanEnd(Object obj) {
        return this.f20369a.getSpanEnd(obj);
    }

    public int getSpanFlags(Object obj) {
        return this.f20369a.getSpanFlags(obj);
    }

    public int getSpanStart(Object obj) {
        return this.f20369a.getSpanStart(obj);
    }

    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 29) {
            return this.f20371e.getSpans(i, i2, cls);
        }
        return this.f20369a.getSpans(i, i2, cls);
    }

    public int length() {
        return this.f20369a.length();
    }

    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.f20369a.nextSpanTransition(i, i2, cls);
    }

    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.f20371e.removeSpan(obj);
        } else {
            this.f20369a.removeSpan(obj);
        }
    }

    public void setSpan(Object obj, int i, int i2, int i3) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.f20371e.setSpan(obj, i, i2, i3);
        } else {
            this.f20369a.setSpan(obj, i, i2, i3);
        }
    }

    public CharSequence subSequence(int i, int i2) {
        return this.f20369a.subSequence(i, i2);
    }

    public String toString() {
        return this.f20369a.toString();
    }

    /* renamed from: yt4$a */
    /* compiled from: PrecomputedTextCompat */
    public static final class C3695a {

        /* renamed from: a */
        public final TextPaint f20372a;

        /* renamed from: b */
        public final TextDirectionHeuristic f20373b;

        /* renamed from: c */
        public final int f20374c;

        /* renamed from: d */
        public final int f20375d;

        /* renamed from: e */
        public final PrecomputedText.Params f20376e;

        /* renamed from: yt4$a$a */
        /* compiled from: PrecomputedTextCompat */
        public static class C3696a {

            /* renamed from: a */
            public final TextPaint f20377a;

            /* renamed from: b */
            public TextDirectionHeuristic f20378b = TextDirectionHeuristics.FIRSTSTRONG_LTR;

            /* renamed from: c */
            public int f20379c = 1;

            /* renamed from: d */
            public int f20380d = 1;

            public C3696a(TextPaint textPaint) {
                this.f20377a = textPaint;
            }

            /* renamed from: a */
            public C3695a mo28259a() {
                return new C3695a(this.f20377a, this.f20378b, this.f20379c, this.f20380d);
            }

            /* renamed from: b */
            public C3696a mo28260b(int i) {
                this.f20379c = i;
                return this;
            }

            /* renamed from: c */
            public C3696a mo28261c(int i) {
                this.f20380d = i;
                return this;
            }

            /* renamed from: d */
            public C3696a mo28262d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f20378b = textDirectionHeuristic;
                return this;
            }
        }

        public C3695a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f20376e = new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
            } else {
                this.f20376e = null;
            }
            this.f20372a = textPaint;
            this.f20373b = textDirectionHeuristic;
            this.f20374c = i;
            this.f20375d = i2;
        }

        /* renamed from: a */
        public boolean mo28251a(C3695a aVar) {
            int i = Build.VERSION.SDK_INT;
            if (this.f20374c != aVar.mo28252b() || this.f20375d != aVar.mo28253c() || this.f20372a.getTextSize() != aVar.mo28255e().getTextSize() || this.f20372a.getTextScaleX() != aVar.mo28255e().getTextScaleX() || this.f20372a.getTextSkewX() != aVar.mo28255e().getTextSkewX() || this.f20372a.getLetterSpacing() != aVar.mo28255e().getLetterSpacing() || !TextUtils.equals(this.f20372a.getFontFeatureSettings(), aVar.mo28255e().getFontFeatureSettings()) || this.f20372a.getFlags() != aVar.mo28255e().getFlags()) {
                return false;
            }
            if (i >= 24) {
                if (!this.f20372a.getTextLocales().equals(aVar.mo28255e().getTextLocales())) {
                    return false;
                }
            } else if (!this.f20372a.getTextLocale().equals(aVar.mo28255e().getTextLocale())) {
                return false;
            }
            if (this.f20372a.getTypeface() == null) {
                if (aVar.mo28255e().getTypeface() != null) {
                    return false;
                }
                return true;
            } else if (!this.f20372a.getTypeface().equals(aVar.mo28255e().getTypeface())) {
                return false;
            } else {
                return true;
            }
        }

        /* renamed from: b */
        public int mo28252b() {
            return this.f20374c;
        }

        /* renamed from: c */
        public int mo28253c() {
            return this.f20375d;
        }

        /* renamed from: d */
        public TextDirectionHeuristic mo28254d() {
            return this.f20373b;
        }

        /* renamed from: e */
        public TextPaint mo28255e() {
            return this.f20372a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C3695a)) {
                return false;
            }
            C3695a aVar = (C3695a) obj;
            if (mo28251a(aVar) && this.f20373b == aVar.mo28254d()) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            if (Build.VERSION.SDK_INT >= 24) {
                return mf4.m22284b(Float.valueOf(this.f20372a.getTextSize()), Float.valueOf(this.f20372a.getTextScaleX()), Float.valueOf(this.f20372a.getTextSkewX()), Float.valueOf(this.f20372a.getLetterSpacing()), Integer.valueOf(this.f20372a.getFlags()), this.f20372a.getTextLocales(), this.f20372a.getTypeface(), Boolean.valueOf(this.f20372a.isElegantTextHeight()), this.f20373b, Integer.valueOf(this.f20374c), Integer.valueOf(this.f20375d));
            }
            return mf4.m22284b(Float.valueOf(this.f20372a.getTextSize()), Float.valueOf(this.f20372a.getTextScaleX()), Float.valueOf(this.f20372a.getTextSkewX()), Float.valueOf(this.f20372a.getLetterSpacing()), Integer.valueOf(this.f20372a.getFlags()), this.f20372a.getTextLocale(), this.f20372a.getTypeface(), Boolean.valueOf(this.f20372a.isElegantTextHeight()), this.f20373b, Integer.valueOf(this.f20374c), Integer.valueOf(this.f20375d));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            sb.append("textSize=" + this.f20372a.getTextSize());
            sb.append(", textScaleX=" + this.f20372a.getTextScaleX());
            sb.append(", textSkewX=" + this.f20372a.getTextSkewX());
            int i = Build.VERSION.SDK_INT;
            sb.append(", letterSpacing=" + this.f20372a.getLetterSpacing());
            sb.append(", elegantTextHeight=" + this.f20372a.isElegantTextHeight());
            if (i >= 24) {
                sb.append(", textLocale=" + this.f20372a.getTextLocales());
            } else {
                sb.append(", textLocale=" + this.f20372a.getTextLocale());
            }
            sb.append(", typeface=" + this.f20372a.getTypeface());
            if (i >= 26) {
                sb.append(", variationSettings=" + this.f20372a.getFontVariationSettings());
            }
            sb.append(", textDir=" + this.f20373b);
            sb.append(", breakStrategy=" + this.f20374c);
            sb.append(", hyphenationFrequency=" + this.f20375d);
            sb.append("}");
            return sb.toString();
        }

        public C3695a(PrecomputedText.Params params) {
            this.f20372a = params.getTextPaint();
            this.f20373b = params.getTextDirection();
            this.f20374c = params.getBreakStrategy();
            this.f20375d = params.getHyphenationFrequency();
            this.f20376e = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }
}
