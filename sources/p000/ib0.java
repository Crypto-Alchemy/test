package p000;

import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;

/* renamed from: ib0 */
/* compiled from: CaptionStyleCompat */
public final class ib0 {

    /* renamed from: g */
    public static final ib0 f13235g = new ib0(-1, -16777216, 0, 0, -1, (Typeface) null);

    /* renamed from: a */
    public final int f13236a;

    /* renamed from: b */
    public final int f13237b;

    /* renamed from: c */
    public final int f13238c;

    /* renamed from: d */
    public final int f13239d;

    /* renamed from: e */
    public final int f13240e;

    /* renamed from: f */
    public final Typeface f13241f;

    public ib0(int i, int i2, int i3, int i4, int i5, Typeface typeface) {
        this.f13236a = i;
        this.f13237b = i2;
        this.f13238c = i3;
        this.f13239d = i4;
        this.f13240e = i5;
        this.f13241f = typeface;
    }

    /* renamed from: a */
    public static ib0 m19541a(CaptioningManager.CaptionStyle captionStyle) {
        if (w67.f19021a >= 21) {
            return m19543c(captionStyle);
        }
        return m19542b(captionStyle);
    }

    /* renamed from: b */
    public static ib0 m19542b(CaptioningManager.CaptionStyle captionStyle) {
        return new ib0(captionStyle.foregroundColor, captionStyle.backgroundColor, 0, captionStyle.edgeType, captionStyle.edgeColor, captionStyle.getTypeface());
    }

    /* renamed from: c */
    public static ib0 m19543c(CaptioningManager.CaptionStyle captionStyle) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        if (captionStyle.hasForegroundColor()) {
            i = captionStyle.foregroundColor;
        } else {
            i = f13235g.f13236a;
        }
        int i6 = i;
        if (captionStyle.hasBackgroundColor()) {
            i2 = captionStyle.backgroundColor;
        } else {
            i2 = f13235g.f13237b;
        }
        int i7 = i2;
        if (captionStyle.hasWindowColor()) {
            i3 = captionStyle.windowColor;
        } else {
            i3 = f13235g.f13238c;
        }
        int i8 = i3;
        if (captionStyle.hasEdgeType()) {
            i4 = captionStyle.edgeType;
        } else {
            i4 = f13235g.f13239d;
        }
        int i9 = i4;
        if (captionStyle.hasEdgeColor()) {
            i5 = captionStyle.edgeColor;
        } else {
            i5 = f13235g.f13240e;
        }
        return new ib0(i6, i7, i8, i9, i5, captionStyle.getTypeface());
    }
}
