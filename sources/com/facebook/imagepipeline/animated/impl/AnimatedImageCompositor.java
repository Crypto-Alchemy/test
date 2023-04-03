package com.facebook.imagepipeline.animated.impl;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import com.facebook.imagepipeline.animated.base.AnimatedDrawableFrameInfo;
import com.github.mikephil.charting.utils.Utils;

public class AnimatedImageCompositor {

    /* renamed from: a */
    public final C1637bk f9609a;

    /* renamed from: b */
    public final C1944b f9610b;

    /* renamed from: c */
    public final Paint f9611c;

    public enum FrameNeededResult {
        REQUIRED,
        NOT_REQUIRED,
        SKIP,
        ABORT
    }

    /* renamed from: com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor$a */
    public static /* synthetic */ class C1943a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f9613a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor$FrameNeededResult[] r0 = com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor.FrameNeededResult.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9613a = r0
                com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor$FrameNeededResult r1 = com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor.FrameNeededResult.REQUIRED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f9613a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor$FrameNeededResult r1 = com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor.FrameNeededResult.NOT_REQUIRED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f9613a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor$FrameNeededResult r1 = com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor.FrameNeededResult.ABORT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f9613a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor$FrameNeededResult r1 = com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor.FrameNeededResult.SKIP     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor.C1943a.<clinit>():void");
        }
    }

    /* renamed from: com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor$b */
    public interface C1944b {
        /* renamed from: a */
        void mo13325a(int i, Bitmap bitmap);

        /* renamed from: b */
        nh0<Bitmap> mo13326b(int i);
    }

    public AnimatedImageCompositor(C1637bk bkVar, C1944b bVar) {
        this.f9609a = bkVar;
        this.f9610b = bVar;
        Paint paint = new Paint();
        this.f9611c = paint;
        paint.setColor(0);
        paint.setStyle(Paint.Style.FILL);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    /* renamed from: a */
    public final void mo13318a(Canvas canvas, AnimatedDrawableFrameInfo animatedDrawableFrameInfo) {
        int i = animatedDrawableFrameInfo.f9601b;
        int i2 = animatedDrawableFrameInfo.f9602c;
        canvas.drawRect((float) i, (float) i2, (float) (i + animatedDrawableFrameInfo.f9603d), (float) (i2 + animatedDrawableFrameInfo.f9604e), this.f9611c);
    }

    /* renamed from: b */
    public final FrameNeededResult mo13319b(int i) {
        AnimatedDrawableFrameInfo c = this.f9609a.mo11683c(i);
        AnimatedDrawableFrameInfo.DisposalMethod disposalMethod = c.f9606g;
        if (disposalMethod == AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_DO_NOT) {
            return FrameNeededResult.REQUIRED;
        }
        if (disposalMethod == AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_TO_BACKGROUND) {
            if (mo13320c(c)) {
                return FrameNeededResult.NOT_REQUIRED;
            }
            return FrameNeededResult.REQUIRED;
        } else if (disposalMethod == AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_TO_PREVIOUS) {
            return FrameNeededResult.SKIP;
        } else {
            return FrameNeededResult.ABORT;
        }
    }

    /* renamed from: c */
    public final boolean mo13320c(AnimatedDrawableFrameInfo animatedDrawableFrameInfo) {
        if (animatedDrawableFrameInfo.f9601b == 0 && animatedDrawableFrameInfo.f9602c == 0 && animatedDrawableFrameInfo.f9603d == this.f9609a.mo11690h() && animatedDrawableFrameInfo.f9604e == this.f9609a.mo11687g()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo13321d(int i) {
        if (i == 0) {
            return true;
        }
        AnimatedDrawableFrameInfo c = this.f9609a.mo11683c(i);
        AnimatedDrawableFrameInfo c2 = this.f9609a.mo11683c(i - 1);
        if (c.f9605f == AnimatedDrawableFrameInfo.BlendOperation.NO_BLEND && mo13320c(c)) {
            return true;
        }
        if (c2.f9606g != AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_TO_BACKGROUND || !mo13320c(c2)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final void mo13322e(Bitmap bitmap) {
        z20 c;
        C3078pk i = this.f9609a.mo11691i();
        if (i != null && (c = i.mo24624c()) != null) {
            c.transform(bitmap);
        }
    }

    /* renamed from: f */
    public final int mo13323f(int i, Canvas canvas) {
        while (i >= 0) {
            int i2 = C1943a.f9613a[mo13319b(i).ordinal()];
            if (i2 == 1) {
                AnimatedDrawableFrameInfo c = this.f9609a.mo11683c(i);
                nh0<Bitmap> b = this.f9610b.mo13326b(i);
                if (b != null) {
                    try {
                        canvas.drawBitmap(b.mo23684j(), Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (Paint) null);
                        if (c.f9606g == AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_TO_BACKGROUND) {
                            mo13318a(canvas, c);
                        }
                        return i + 1;
                    } finally {
                        b.close();
                    }
                } else if (mo13321d(i)) {
                    return i;
                }
            } else if (i2 == 2) {
                return i + 1;
            } else {
                if (i2 == 3) {
                    return i;
                }
            }
            i--;
        }
        return 0;
    }

    /* renamed from: g */
    public void mo13324g(int i, Bitmap bitmap) {
        int i2;
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(0, PorterDuff.Mode.SRC);
        if (!mo13321d(i)) {
            i2 = mo13323f(i - 1, canvas);
        } else {
            i2 = i;
        }
        while (i2 < i) {
            AnimatedDrawableFrameInfo c = this.f9609a.mo11683c(i2);
            AnimatedDrawableFrameInfo.DisposalMethod disposalMethod = c.f9606g;
            if (disposalMethod != AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_TO_PREVIOUS) {
                if (c.f9605f == AnimatedDrawableFrameInfo.BlendOperation.NO_BLEND) {
                    mo13318a(canvas, c);
                }
                this.f9609a.mo11684d(i2, canvas);
                this.f9610b.mo13325a(i2, bitmap);
                if (disposalMethod == AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_TO_BACKGROUND) {
                    mo13318a(canvas, c);
                }
            }
            i2++;
        }
        AnimatedDrawableFrameInfo c2 = this.f9609a.mo11683c(i);
        if (c2.f9605f == AnimatedDrawableFrameInfo.BlendOperation.NO_BLEND) {
            mo13318a(canvas, c2);
        }
        this.f9609a.mo11684d(i, canvas);
        mo13322e(bitmap);
    }
}
