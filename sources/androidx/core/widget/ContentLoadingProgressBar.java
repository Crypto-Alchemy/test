package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

public class ContentLoadingProgressBar extends ProgressBar {

    /* renamed from: a */
    public long f3422a;

    /* renamed from: d */
    public boolean f3423d;

    /* renamed from: e */
    public boolean f3424e;

    /* renamed from: g */
    public boolean f3425g;

    /* renamed from: k */
    public final Runnable f3426k;

    /* renamed from: r */
    public final Runnable f3427r;

    public ContentLoadingProgressBar(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m4353c() {
        this.f3423d = false;
        this.f3422a = -1;
        setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m4354d() {
        this.f3424e = false;
        if (!this.f3425g) {
            this.f3422a = System.currentTimeMillis();
            setVisibility(0);
        }
    }

    /* renamed from: e */
    public final void mo5371e() {
        removeCallbacks(this.f3426k);
        removeCallbacks(this.f3427r);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mo5371e();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo5371e();
    }

    public ContentLoadingProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f3422a = -1;
        this.f3423d = false;
        this.f3424e = false;
        this.f3425g = false;
        this.f3426k = new tr0(this);
        this.f3427r = new ur0(this);
    }
}
