package com.facebook.drawee.generic;

import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import com.facebook.drawee.drawable.RoundedCornersDrawable;
import com.facebook.drawee.generic.RoundingParams;
import p000.xl5;

/* renamed from: com.facebook.drawee.generic.a */
/* compiled from: WrappingUtils */
public class C1934a {

    /* renamed from: a */
    public static final Drawable f9574a = new ColorDrawable(0);

    /* renamed from: a */
    public static Drawable m13410a(Drawable drawable, RoundingParams roundingParams, Resources resources) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            di5 di5 = new di5(resources, bitmapDrawable.getBitmap(), bitmapDrawable.getPaint());
            m13411b(di5, roundingParams);
            return di5;
        } else if (drawable instanceof NinePatchDrawable) {
            hi5 hi5 = new hi5((NinePatchDrawable) drawable);
            m13411b(hi5, roundingParams);
            return hi5;
        } else if (drawable instanceof ColorDrawable) {
            ei5 c = ei5.m16105c((ColorDrawable) drawable);
            m13411b(c, roundingParams);
            return c;
        } else {
            oy1.m24437x("WrappingUtils", "Don't know how to round that drawable: %s", drawable);
            return drawable;
        }
    }

    /* renamed from: b */
    public static void m13411b(ci5 ci5, RoundingParams roundingParams) {
        ci5.mo12063b(roundingParams.mo13261h());
        ci5.mo12067l(roundingParams.mo13255c());
        ci5.mo12062a(roundingParams.mo13253a(), roundingParams.mo13254b());
        ci5.mo12064e(roundingParams.mo13259f());
        ci5.mo12066h(roundingParams.mo13264j());
        ci5.mo12065g(roundingParams.mo13260g());
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p000.nj1 m13412c(p000.nj1 r2) {
        /*
        L_0x0000:
            android.graphics.drawable.Drawable r0 = r2.mo20787j()
            if (r0 == r2) goto L_0x000f
            boolean r1 = r0 instanceof p000.nj1
            if (r1 != 0) goto L_0x000b
            goto L_0x000f
        L_0x000b:
            r2 = r0
            nj1 r2 = (p000.nj1) r2
            goto L_0x0000
        L_0x000f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.drawee.generic.C1934a.m13412c(nj1):nj1");
    }

    /* renamed from: d */
    public static Drawable m13413d(Drawable drawable, RoundingParams roundingParams, Resources resources) {
        try {
            if (lc2.m21369d()) {
                lc2.m21366a("WrappingUtils#maybeApplyLeafRounding");
            }
            if (!(drawable == null || roundingParams == null)) {
                if (roundingParams.mo13263i() == RoundingParams.RoundingMethod.BITMAP_ONLY) {
                    if (drawable instanceof h82) {
                        nj1 c = m13412c((h82) drawable);
                        c.mo20786d(m13410a(c.mo20786d(f9574a), roundingParams, resources));
                        if (lc2.m21369d()) {
                            lc2.m21367b();
                        }
                        return drawable;
                    }
                    Drawable a = m13410a(drawable, roundingParams, resources);
                    if (lc2.m21369d()) {
                        lc2.m21367b();
                    }
                    return a;
                }
            }
            return drawable;
        } finally {
            if (lc2.m21369d()) {
                lc2.m21367b();
            }
        }
    }

    /* renamed from: e */
    public static Drawable m13414e(Drawable drawable, RoundingParams roundingParams) {
        try {
            if (lc2.m21369d()) {
                lc2.m21366a("WrappingUtils#maybeWrapWithRoundedOverlayColor");
            }
            if (!(drawable == null || roundingParams == null)) {
                if (roundingParams.mo13263i() == RoundingParams.RoundingMethod.OVERLAY_COLOR) {
                    RoundedCornersDrawable roundedCornersDrawable = new RoundedCornersDrawable(drawable);
                    m13411b(roundedCornersDrawable, roundingParams);
                    roundedCornersDrawable.mo13251q(roundingParams.mo13257e());
                    if (lc2.m21369d()) {
                        lc2.m21367b();
                    }
                    return roundedCornersDrawable;
                }
            }
            return drawable;
        } finally {
            if (lc2.m21369d()) {
                lc2.m21367b();
            }
        }
    }

    /* renamed from: f */
    public static Drawable m13415f(Drawable drawable, xl5.C3616b bVar) {
        return m13416g(drawable, bVar, (PointF) null);
    }

    /* renamed from: g */
    public static Drawable m13416g(Drawable drawable, xl5.C3616b bVar, PointF pointF) {
        if (lc2.m21369d()) {
            lc2.m21366a("WrappingUtils#maybeWrapWithScaleType");
        }
        if (drawable == null || bVar == null) {
            if (lc2.m21369d()) {
                lc2.m21367b();
            }
            return drawable;
        }
        vl5 vl5 = new vl5(drawable, bVar);
        if (pointF != null) {
            vl5.mo27215t(pointF);
        }
        if (lc2.m21369d()) {
            lc2.m21367b();
        }
        return vl5;
    }

    /* renamed from: h */
    public static vl5 m13417h(nj1 nj1, xl5.C3616b bVar) {
        Drawable f = m13415f(nj1.mo20786d(f9574a), bVar);
        nj1.mo20786d(f);
        au4.m10793h(f, "Parent has no child drawable!");
        return (vl5) f;
    }
}
