package androidx.media3.p005ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p000.dx0;

/* renamed from: androidx.media3.ui.SubtitleView */
public final class SubtitleView extends FrameLayout {

    /* renamed from: A */
    public View f5913A;

    /* renamed from: a */
    public List<dx0> f5914a;

    /* renamed from: d */
    public ib0 f5915d;

    /* renamed from: e */
    public int f5916e;

    /* renamed from: g */
    public float f5917g;

    /* renamed from: k */
    public float f5918k;

    /* renamed from: r */
    public boolean f5919r;

    /* renamed from: s */
    public boolean f5920s;

    /* renamed from: x */
    public int f5921x;

    /* renamed from: y */
    public C1091a f5922y;

    /* renamed from: androidx.media3.ui.SubtitleView$a */
    public interface C1091a {
        /* renamed from: a */
        void mo8100a(List<dx0> list, ib0 ib0, float f, int i, float f2);
    }

    public SubtitleView(Context context) {
        this(context, (AttributeSet) null);
    }

    private List<dx0> getCuesWithStylingPreferencesApplied() {
        if (this.f5919r && this.f5920s) {
            return this.f5914a;
        }
        ArrayList arrayList = new ArrayList(this.f5914a.size());
        for (int i = 0; i < this.f5914a.size(); i++) {
            arrayList.add(mo8355a(this.f5914a.get(i)));
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (w67.f19021a < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private ib0 getUserCaptionStyle() {
        if (w67.f19021a < 19 || isInEditMode()) {
            return ib0.f13235g;
        }
        CaptioningManager captioningManager = (CaptioningManager) getContext().getSystemService("captioning");
        if (captioningManager == null || !captioningManager.isEnabled()) {
            return ib0.f13235g;
        }
        return ib0.m19541a(captioningManager.getUserStyle());
    }

    private <T extends View & C1091a> void setView(T t) {
        removeView(this.f5913A);
        View view = this.f5913A;
        if (view instanceof WebViewSubtitleOutput) {
            ((WebViewSubtitleOutput) view).mo8387g();
        }
        this.f5913A = t;
        this.f5922y = (C1091a) t;
        addView(t);
    }

    /* renamed from: a */
    public final dx0 mo8355a(dx0 dx0) {
        dx0.C2206b b = dx0.mo18976b();
        if (!this.f5919r) {
            gd6.m18015e(b);
        } else if (!this.f5920s) {
            gd6.m18016f(b);
        }
        return b.mo18979a();
    }

    /* renamed from: b */
    public final void mo8356b(int i, float f) {
        this.f5916e = i;
        this.f5917g = f;
        mo8357c();
    }

    /* renamed from: c */
    public final void mo8357c() {
        this.f5922y.mo8100a(getCuesWithStylingPreferencesApplied(), this.f5915d, this.f5917g, this.f5916e, this.f5918k);
    }

    public void setApplyEmbeddedFontSizes(boolean z) {
        this.f5920s = z;
        mo8357c();
    }

    public void setApplyEmbeddedStyles(boolean z) {
        this.f5919r = z;
        mo8357c();
    }

    public void setBottomPaddingFraction(float f) {
        this.f5918k = f;
        mo8357c();
    }

    public void setCues(List<dx0> list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        this.f5914a = list;
        mo8357c();
    }

    public void setFixedTextSize(int i, float f) {
        Resources resources;
        Context context = getContext();
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        mo8356b(2, TypedValue.applyDimension(i, f, resources.getDisplayMetrics()));
    }

    public void setFractionalTextSize(float f) {
        setFractionalTextSize(f, false);
    }

    public void setStyle(ib0 ib0) {
        this.f5915d = ib0;
        mo8357c();
    }

    public void setUserDefaultStyle() {
        setStyle(getUserCaptionStyle());
    }

    public void setUserDefaultTextSize() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    public void setViewType(int i) {
        if (this.f5921x != i) {
            if (i == 1) {
                setView(new CanvasSubtitleOutput(getContext()));
            } else if (i == 2) {
                setView(new WebViewSubtitleOutput(getContext()));
            } else {
                throw new IllegalArgumentException();
            }
            this.f5921x = i;
        }
    }

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5914a = Collections.emptyList();
        this.f5915d = ib0.f13235g;
        this.f5916e = 0;
        this.f5917g = 0.0533f;
        this.f5918k = 0.08f;
        this.f5919r = true;
        this.f5920s = true;
        CanvasSubtitleOutput canvasSubtitleOutput = new CanvasSubtitleOutput(context);
        this.f5922y = canvasSubtitleOutput;
        this.f5913A = canvasSubtitleOutput;
        addView(canvasSubtitleOutput);
        this.f5921x = 1;
    }

    public void setFractionalTextSize(float f, boolean z) {
        mo8356b(z ? 1 : 0, f);
    }
}
