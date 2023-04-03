package com.google.android.material.internal;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.github.mikephil.charting.utils.Utils;

public final class StaticLayoutBuilderCompat {

    /* renamed from: n */
    public static final int f24012n = 1;

    /* renamed from: a */
    public CharSequence f24013a;

    /* renamed from: b */
    public final TextPaint f24014b;

    /* renamed from: c */
    public final int f24015c;

    /* renamed from: d */
    public int f24016d = 0;

    /* renamed from: e */
    public int f24017e;

    /* renamed from: f */
    public Layout.Alignment f24018f;

    /* renamed from: g */
    public int f24019g;

    /* renamed from: h */
    public float f24020h;

    /* renamed from: i */
    public float f24021i;

    /* renamed from: j */
    public int f24022j;

    /* renamed from: k */
    public boolean f24023k;

    /* renamed from: l */
    public boolean f24024l;

    /* renamed from: m */
    public TextUtils.TruncateAt f24025m;

    public static class StaticLayoutBuilderCompatException extends Exception {
        public StaticLayoutBuilderCompatException(Throwable th) {
            super("Error thrown initializing StaticLayout " + th.getMessage(), th);
        }
    }

    public StaticLayoutBuilderCompat(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f24013a = charSequence;
        this.f24014b = textPaint;
        this.f24015c = i;
        this.f24017e = charSequence.length();
        this.f24018f = Layout.Alignment.ALIGN_NORMAL;
        this.f24019g = Integer.MAX_VALUE;
        this.f24020h = Utils.FLOAT_EPSILON;
        this.f24021i = 1.0f;
        this.f24022j = f24012n;
        this.f24023k = true;
        this.f24025m = null;
    }

    /* renamed from: b */
    public static StaticLayoutBuilderCompat m35595b(CharSequence charSequence, TextPaint textPaint, int i) {
        return new StaticLayoutBuilderCompat(charSequence, textPaint, i);
    }

    /* renamed from: a */
    public StaticLayout mo33005a() throws StaticLayoutBuilderCompatException {
        TextDirectionHeuristic textDirectionHeuristic;
        if (this.f24013a == null) {
            this.f24013a = "";
        }
        int max = Math.max(0, this.f24015c);
        CharSequence charSequence = this.f24013a;
        if (this.f24019g == 1) {
            charSequence = TextUtils.ellipsize(charSequence, this.f24014b, (float) max, this.f24025m);
        }
        int min = Math.min(charSequence.length(), this.f24017e);
        this.f24017e = min;
        if (this.f24024l && this.f24019g == 1) {
            this.f24018f = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, this.f24016d, min, this.f24014b, max);
        obtain.setAlignment(this.f24018f);
        obtain.setIncludePad(this.f24023k);
        if (this.f24024l) {
            textDirectionHeuristic = TextDirectionHeuristics.RTL;
        } else {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        }
        obtain.setTextDirection(textDirectionHeuristic);
        TextUtils.TruncateAt truncateAt = this.f24025m;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f24019g);
        float f = this.f24020h;
        if (!(f == Utils.FLOAT_EPSILON && this.f24021i == 1.0f)) {
            obtain.setLineSpacing(f, this.f24021i);
        }
        if (this.f24019g > 1) {
            obtain.setHyphenationFrequency(this.f24022j);
        }
        return obtain.build();
    }

    /* renamed from: c */
    public StaticLayoutBuilderCompat mo33006c(Layout.Alignment alignment) {
        this.f24018f = alignment;
        return this;
    }

    /* renamed from: d */
    public StaticLayoutBuilderCompat mo33007d(TextUtils.TruncateAt truncateAt) {
        this.f24025m = truncateAt;
        return this;
    }

    /* renamed from: e */
    public StaticLayoutBuilderCompat mo33008e(int i) {
        this.f24022j = i;
        return this;
    }

    /* renamed from: f */
    public StaticLayoutBuilderCompat mo33009f(boolean z) {
        this.f24023k = z;
        return this;
    }

    /* renamed from: g */
    public StaticLayoutBuilderCompat mo33010g(boolean z) {
        this.f24024l = z;
        return this;
    }

    /* renamed from: h */
    public StaticLayoutBuilderCompat mo33011h(float f, float f2) {
        this.f24020h = f;
        this.f24021i = f2;
        return this;
    }

    /* renamed from: i */
    public StaticLayoutBuilderCompat mo33012i(int i) {
        this.f24019g = i;
        return this;
    }
}
