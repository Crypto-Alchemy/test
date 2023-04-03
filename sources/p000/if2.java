package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.facebook.drawee.generic.RoundingParams;
import p000.xl5;

/* renamed from: if2 */
/* compiled from: GenericDraweeHierarchyInflater */
public class if2 {
    /* renamed from: a */
    public static Drawable m19582a(Context context, TypedArray typedArray, int i) {
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        return context.getResources().getDrawable(resourceId);
    }

    /* renamed from: b */
    public static RoundingParams m19583b(hf2 hf2) {
        if (hf2.mo21149s() == null) {
            hf2.mo21129I(new RoundingParams());
        }
        return hf2.mo21149s();
    }

    /* renamed from: c */
    public static xl5.C3616b m19584c(TypedArray typedArray, int i) {
        switch (typedArray.getInt(i, -2)) {
            case -1:
                return null;
            case 0:
                return xl5.C3616b.f19893a;
            case 1:
                return xl5.C3616b.f19896d;
            case 2:
                return xl5.C3616b.f19897e;
            case 3:
                return xl5.C3616b.f19898f;
            case 4:
                return xl5.C3616b.f19899g;
            case 5:
                return xl5.C3616b.f19900h;
            case 6:
                return xl5.C3616b.f19901i;
            case 7:
                return xl5.C3616b.f19902j;
            case 8:
                return xl5.C3616b.f19903k;
            default:
                throw new RuntimeException("XML attribute not specified!");
        }
    }

    /* renamed from: d */
    public static hf2 m19585d(Context context, AttributeSet attributeSet) {
        if (lc2.m21369d()) {
            lc2.m21366a("GenericDraweeHierarchyBuilder#inflateBuilder");
        }
        hf2 e = m19586e(new hf2(context.getResources()), context, attributeSet);
        if (lc2.m21369d()) {
            lc2.m21367b();
        }
        return e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01c4, code lost:
        if (r13 != false) goto L_0x01e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x01de, code lost:
        if (r15 != false) goto L_0x01e0;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p000.hf2 m19586e(p000.hf2 r17, android.content.Context r18, android.util.AttributeSet r19) {
        /*
            r0 = r17
            r1 = r18
            r2 = r19
            if (r2 == 0) goto L_0x0201
            int[] r6 = p000.q55.GenericDraweeHierarchy
            android.content.res.TypedArray r2 = r1.obtainStyledAttributes(r2, r6)
            int r6 = r2.getIndexCount()     // Catch:{ all -> 0x01e7 }
            r5 = 0
            r7 = 0
            r8 = 1
            r9 = 1
            r10 = 1
            r11 = 1
            r12 = 1
            r13 = 1
            r14 = 1
            r15 = 1
            r16 = 0
        L_0x001e:
            if (r7 >= r6) goto L_0x019a
            int r3 = r2.getIndex(r7)     // Catch:{ all -> 0x0197 }
            int r4 = p000.q55.GenericDraweeHierarchy_actualImageScaleType     // Catch:{ all -> 0x0197 }
            if (r3 != r4) goto L_0x0031
            xl5$b r3 = m19584c(r2, r3)     // Catch:{ all -> 0x0197 }
            r0.mo21151u(r3)     // Catch:{ all -> 0x0197 }
            goto L_0x00c2
        L_0x0031:
            int r4 = p000.q55.GenericDraweeHierarchy_placeholderImage     // Catch:{ all -> 0x0197 }
            if (r3 != r4) goto L_0x003e
            android.graphics.drawable.Drawable r3 = m19582a(r1, r2, r3)     // Catch:{ all -> 0x0197 }
            r0.mo21122B(r3)     // Catch:{ all -> 0x0197 }
            goto L_0x00c2
        L_0x003e:
            int r4 = p000.q55.GenericDraweeHierarchy_pressedStateOverlayImage     // Catch:{ all -> 0x0197 }
            if (r3 != r4) goto L_0x004b
            android.graphics.drawable.Drawable r3 = m19582a(r1, r2, r3)     // Catch:{ all -> 0x0197 }
            r0.mo21124D(r3)     // Catch:{ all -> 0x0197 }
            goto L_0x00c2
        L_0x004b:
            int r4 = p000.q55.GenericDraweeHierarchy_progressBarImage     // Catch:{ all -> 0x0197 }
            if (r3 != r4) goto L_0x0058
            android.graphics.drawable.Drawable r3 = m19582a(r1, r2, r3)     // Catch:{ all -> 0x0197 }
            r0.mo21125E(r3)     // Catch:{ all -> 0x0197 }
            goto L_0x00c2
        L_0x0058:
            int r4 = p000.q55.GenericDraweeHierarchy_fadeDuration     // Catch:{ all -> 0x0197 }
            if (r3 != r4) goto L_0x0065
            r4 = 0
            int r3 = r2.getInt(r3, r4)     // Catch:{ all -> 0x0197 }
            r0.mo21154x(r3)     // Catch:{ all -> 0x0197 }
            goto L_0x00c2
        L_0x0065:
            int r4 = p000.q55.GenericDraweeHierarchy_viewAspectRatio     // Catch:{ all -> 0x0197 }
            if (r3 != r4) goto L_0x0072
            r4 = 0
            float r3 = r2.getFloat(r3, r4)     // Catch:{ all -> 0x0197 }
            r0.mo21153w(r3)     // Catch:{ all -> 0x0197 }
            goto L_0x00c2
        L_0x0072:
            int r4 = p000.q55.GenericDraweeHierarchy_placeholderImageScaleType     // Catch:{ all -> 0x0197 }
            if (r3 != r4) goto L_0x007e
            xl5$b r3 = m19584c(r2, r3)     // Catch:{ all -> 0x0197 }
            r0.mo21123C(r3)     // Catch:{ all -> 0x0197 }
            goto L_0x00c2
        L_0x007e:
            int r4 = p000.q55.GenericDraweeHierarchy_retryImage     // Catch:{ all -> 0x0197 }
            if (r3 != r4) goto L_0x008a
            android.graphics.drawable.Drawable r3 = m19582a(r1, r2, r3)     // Catch:{ all -> 0x0197 }
            r0.mo21127G(r3)     // Catch:{ all -> 0x0197 }
            goto L_0x00c2
        L_0x008a:
            int r4 = p000.q55.GenericDraweeHierarchy_retryImageScaleType     // Catch:{ all -> 0x0197 }
            if (r3 != r4) goto L_0x0096
            xl5$b r3 = m19584c(r2, r3)     // Catch:{ all -> 0x0197 }
            r0.mo21128H(r3)     // Catch:{ all -> 0x0197 }
            goto L_0x00c2
        L_0x0096:
            int r4 = p000.q55.GenericDraweeHierarchy_failureImage     // Catch:{ all -> 0x0197 }
            if (r3 != r4) goto L_0x00a2
            android.graphics.drawable.Drawable r3 = m19582a(r1, r2, r3)     // Catch:{ all -> 0x0197 }
            r0.mo21155y(r3)     // Catch:{ all -> 0x0197 }
            goto L_0x00c2
        L_0x00a2:
            int r4 = p000.q55.GenericDraweeHierarchy_failureImageScaleType     // Catch:{ all -> 0x0197 }
            if (r3 != r4) goto L_0x00ae
            xl5$b r3 = m19584c(r2, r3)     // Catch:{ all -> 0x0197 }
            r0.mo21156z(r3)     // Catch:{ all -> 0x0197 }
            goto L_0x00c2
        L_0x00ae:
            int r4 = p000.q55.GenericDraweeHierarchy_progressBarImageScaleType     // Catch:{ all -> 0x0197 }
            if (r3 != r4) goto L_0x00ba
            xl5$b r3 = m19584c(r2, r3)     // Catch:{ all -> 0x0197 }
            r0.mo21126F(r3)     // Catch:{ all -> 0x0197 }
            goto L_0x00c2
        L_0x00ba:
            int r4 = p000.q55.GenericDraweeHierarchy_progressBarAutoRotateInterval     // Catch:{ all -> 0x0197 }
            if (r3 != r4) goto L_0x00c5
            int r5 = r2.getInteger(r3, r5)     // Catch:{ all -> 0x0197 }
        L_0x00c2:
            r4 = 0
            goto L_0x0191
        L_0x00c5:
            int r4 = p000.q55.GenericDraweeHierarchy_backgroundImage     // Catch:{ all -> 0x0197 }
            if (r3 != r4) goto L_0x00d1
            android.graphics.drawable.Drawable r3 = m19582a(r1, r2, r3)     // Catch:{ all -> 0x0197 }
            r0.mo21152v(r3)     // Catch:{ all -> 0x0197 }
            goto L_0x00c2
        L_0x00d1:
            int r4 = p000.q55.GenericDraweeHierarchy_overlayImage     // Catch:{ all -> 0x0197 }
            if (r3 != r4) goto L_0x00dd
            android.graphics.drawable.Drawable r3 = m19582a(r1, r2, r3)     // Catch:{ all -> 0x0197 }
            r0.mo21121A(r3)     // Catch:{ all -> 0x0197 }
            goto L_0x00c2
        L_0x00dd:
            int r4 = p000.q55.GenericDraweeHierarchy_roundAsCircle     // Catch:{ all -> 0x0197 }
            if (r3 != r4) goto L_0x00ee
            com.facebook.drawee.generic.RoundingParams r4 = m19583b(r17)     // Catch:{ all -> 0x0197 }
            r1 = 0
            boolean r3 = r2.getBoolean(r3, r1)     // Catch:{ all -> 0x0197 }
            r4.mo13270p(r3)     // Catch:{ all -> 0x0197 }
            goto L_0x00c2
        L_0x00ee:
            int r1 = p000.q55.GenericDraweeHierarchy_roundedCornerRadius     // Catch:{ all -> 0x0197 }
            if (r3 != r1) goto L_0x00f9
            r4 = r16
            int r16 = r2.getDimensionPixelSize(r3, r4)     // Catch:{ all -> 0x0197 }
            goto L_0x00c2
        L_0x00f9:
            r4 = r16
            int r1 = p000.q55.GenericDraweeHierarchy_roundTopLeft     // Catch:{ all -> 0x0197 }
            if (r3 != r1) goto L_0x0106
            boolean r8 = r2.getBoolean(r3, r8)     // Catch:{ all -> 0x0197 }
        L_0x0103:
            r16 = r4
            goto L_0x00c2
        L_0x0106:
            int r1 = p000.q55.GenericDraweeHierarchy_roundTopRight     // Catch:{ all -> 0x0197 }
            if (r3 != r1) goto L_0x010f
            boolean r10 = r2.getBoolean(r3, r10)     // Catch:{ all -> 0x0197 }
            goto L_0x0103
        L_0x010f:
            int r1 = p000.q55.GenericDraweeHierarchy_roundBottomLeft     // Catch:{ all -> 0x0197 }
            if (r3 != r1) goto L_0x0118
            boolean r14 = r2.getBoolean(r3, r14)     // Catch:{ all -> 0x0197 }
            goto L_0x0103
        L_0x0118:
            int r1 = p000.q55.GenericDraweeHierarchy_roundBottomRight     // Catch:{ all -> 0x0197 }
            if (r3 != r1) goto L_0x0121
            boolean r12 = r2.getBoolean(r3, r12)     // Catch:{ all -> 0x0197 }
            goto L_0x0103
        L_0x0121:
            int r1 = p000.q55.GenericDraweeHierarchy_roundTopStart     // Catch:{ all -> 0x0197 }
            if (r3 != r1) goto L_0x012a
            boolean r9 = r2.getBoolean(r3, r9)     // Catch:{ all -> 0x0197 }
            goto L_0x0103
        L_0x012a:
            int r1 = p000.q55.GenericDraweeHierarchy_roundTopEnd     // Catch:{ all -> 0x0197 }
            if (r3 != r1) goto L_0x0133
            boolean r11 = r2.getBoolean(r3, r11)     // Catch:{ all -> 0x0197 }
            goto L_0x0103
        L_0x0133:
            int r1 = p000.q55.GenericDraweeHierarchy_roundBottomStart     // Catch:{ all -> 0x0197 }
            if (r3 != r1) goto L_0x013c
            boolean r15 = r2.getBoolean(r3, r15)     // Catch:{ all -> 0x0197 }
            goto L_0x0103
        L_0x013c:
            int r1 = p000.q55.GenericDraweeHierarchy_roundBottomEnd     // Catch:{ all -> 0x0197 }
            if (r3 != r1) goto L_0x0145
            boolean r13 = r2.getBoolean(r3, r13)     // Catch:{ all -> 0x0197 }
            goto L_0x0103
        L_0x0145:
            int r1 = p000.q55.GenericDraweeHierarchy_roundWithOverlayColor     // Catch:{ all -> 0x0197 }
            if (r3 != r1) goto L_0x0159
            com.facebook.drawee.generic.RoundingParams r1 = m19583b(r17)     // Catch:{ all -> 0x0197 }
            r16 = r4
            r4 = 0
            int r3 = r2.getColor(r3, r4)     // Catch:{ all -> 0x0197 }
            r1.mo13268n(r3)     // Catch:{ all -> 0x0197 }
            goto L_0x00c2
        L_0x0159:
            r16 = r4
            int r1 = p000.q55.GenericDraweeHierarchy_roundingBorderWidth     // Catch:{ all -> 0x0197 }
            if (r3 != r1) goto L_0x016e
            com.facebook.drawee.generic.RoundingParams r1 = m19583b(r17)     // Catch:{ all -> 0x0197 }
            r4 = 0
            int r3 = r2.getDimensionPixelSize(r3, r4)     // Catch:{ all -> 0x0197 }
            float r3 = (float) r3     // Catch:{ all -> 0x0197 }
            r1.mo13266l(r3)     // Catch:{ all -> 0x0197 }
            goto L_0x00c2
        L_0x016e:
            int r1 = p000.q55.GenericDraweeHierarchy_roundingBorderColor     // Catch:{ all -> 0x0197 }
            if (r3 != r1) goto L_0x0180
            com.facebook.drawee.generic.RoundingParams r1 = m19583b(r17)     // Catch:{ all -> 0x0197 }
            r4 = 0
            int r3 = r2.getColor(r3, r4)     // Catch:{ all -> 0x0197 }
            r1.mo13265k(r3)     // Catch:{ all -> 0x0197 }
            goto L_0x00c2
        L_0x0180:
            int r1 = p000.q55.GenericDraweeHierarchy_roundingBorderPadding     // Catch:{ all -> 0x0197 }
            if (r3 != r1) goto L_0x00c2
            com.facebook.drawee.generic.RoundingParams r1 = m19583b(r17)     // Catch:{ all -> 0x0197 }
            r4 = 0
            int r3 = r2.getDimensionPixelSize(r3, r4)     // Catch:{ all -> 0x0197 }
            float r3 = (float) r3     // Catch:{ all -> 0x0197 }
            r1.mo13269o(r3)     // Catch:{ all -> 0x0197 }
        L_0x0191:
            int r7 = r7 + 1
            r1 = r18
            goto L_0x001e
        L_0x0197:
            r0 = move-exception
            goto L_0x01f0
        L_0x019a:
            r4 = 0
            r2.recycle()
            android.content.res.Resources r1 = r18.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r1 = r1.getLayoutDirection()
            r2 = 1
            if (r1 != r2) goto L_0x01c7
            if (r8 == 0) goto L_0x01b3
            if (r11 == 0) goto L_0x01b3
            r1 = 1
            goto L_0x01b4
        L_0x01b3:
            r1 = r4
        L_0x01b4:
            if (r10 == 0) goto L_0x01ba
            if (r9 == 0) goto L_0x01ba
            r2 = 1
            goto L_0x01bb
        L_0x01ba:
            r2 = r4
        L_0x01bb:
            if (r12 == 0) goto L_0x01c1
            if (r15 == 0) goto L_0x01c1
            r3 = 1
            goto L_0x01c2
        L_0x01c1:
            r3 = r4
        L_0x01c2:
            if (r14 == 0) goto L_0x01e1
            if (r13 == 0) goto L_0x01e1
            goto L_0x01e0
        L_0x01c7:
            if (r8 == 0) goto L_0x01cd
            if (r9 == 0) goto L_0x01cd
            r1 = 1
            goto L_0x01ce
        L_0x01cd:
            r1 = r4
        L_0x01ce:
            if (r10 == 0) goto L_0x01d4
            if (r11 == 0) goto L_0x01d4
            r2 = 1
            goto L_0x01d5
        L_0x01d4:
            r2 = r4
        L_0x01d5:
            if (r12 == 0) goto L_0x01db
            if (r13 == 0) goto L_0x01db
            r3 = 1
            goto L_0x01dc
        L_0x01db:
            r3 = r4
        L_0x01dc:
            if (r14 == 0) goto L_0x01e1
            if (r15 == 0) goto L_0x01e1
        L_0x01e0:
            r4 = 1
        L_0x01e1:
            r6 = r4
            r4 = r5
            r5 = r1
            r1 = r16
            goto L_0x0207
        L_0x01e7:
            r0 = move-exception
            r8 = 1
            r9 = 1
            r10 = 1
            r11 = 1
            r12 = 1
            r13 = 1
            r14 = 1
            r15 = 1
        L_0x01f0:
            r2.recycle()
            android.content.res.Resources r1 = r18.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r1 = r1.getLayoutDirection()
            r2 = 1
            throw r0
        L_0x0201:
            r2 = 1
            r4 = 0
            r3 = r2
            r5 = r3
            r6 = r5
            r1 = r4
        L_0x0207:
            android.graphics.drawable.Drawable r7 = r17.mo21144n()
            if (r7 == 0) goto L_0x021b
            if (r4 <= 0) goto L_0x021b
            xt r7 = new xt
            android.graphics.drawable.Drawable r8 = r17.mo21144n()
            r7.<init>(r8, r4)
            r0.mo21125E(r7)
        L_0x021b:
            if (r1 <= 0) goto L_0x0238
            com.facebook.drawee.generic.RoundingParams r4 = m19583b(r17)
            if (r5 == 0) goto L_0x0225
            float r5 = (float) r1
            goto L_0x0226
        L_0x0225:
            r5 = 0
        L_0x0226:
            if (r2 == 0) goto L_0x022a
            float r2 = (float) r1
            goto L_0x022b
        L_0x022a:
            r2 = 0
        L_0x022b:
            if (r3 == 0) goto L_0x022f
            float r3 = (float) r1
            goto L_0x0230
        L_0x022f:
            r3 = 0
        L_0x0230:
            if (r6 == 0) goto L_0x0234
            float r1 = (float) r1
            goto L_0x0235
        L_0x0234:
            r1 = 0
        L_0x0235:
            r4.mo13267m(r5, r2, r3, r1)
        L_0x0238:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.if2.m19586e(hf2, android.content.Context, android.util.AttributeSet):hf2");
    }
}
