package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* renamed from: fn */
/* compiled from: AppCompatProgressBarHelper */
public class C2307fn {

    /* renamed from: c */
    public static final int[] f11945c = {16843067, 16843068};

    /* renamed from: a */
    public final ProgressBar f11946a;

    /* renamed from: b */
    public Bitmap f11947b;

    /* renamed from: fn$a */
    /* compiled from: AppCompatProgressBarHelper */
    public static class C2308a {
        /* renamed from: a */
        public static void m17140a(LayerDrawable layerDrawable, LayerDrawable layerDrawable2, int i) {
            layerDrawable2.setLayerGravity(i, layerDrawable.getLayerGravity(i));
            layerDrawable2.setLayerWidth(i, layerDrawable.getLayerWidth(i));
            layerDrawable2.setLayerHeight(i, layerDrawable.getLayerHeight(i));
            layerDrawable2.setLayerInsetLeft(i, layerDrawable.getLayerInsetLeft(i));
            layerDrawable2.setLayerInsetRight(i, layerDrawable.getLayerInsetRight(i));
            layerDrawable2.setLayerInsetTop(i, layerDrawable.getLayerInsetTop(i));
            layerDrawable2.setLayerInsetBottom(i, layerDrawable.getLayerInsetBottom(i));
            layerDrawable2.setLayerInsetStart(i, layerDrawable.getLayerInsetStart(i));
            layerDrawable2.setLayerInsetEnd(i, layerDrawable.getLayerInsetEnd(i));
        }
    }

    public C2307fn(ProgressBar progressBar) {
        this.f11946a = progressBar;
    }

    /* renamed from: a */
    public final Shape mo20016a() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, (RectF) null, (float[]) null);
    }

    /* renamed from: b */
    public Bitmap mo20017b() {
        return this.f11947b;
    }

    /* renamed from: c */
    public void mo20018c(AttributeSet attributeSet, int i) {
        yq6 v = yq6.m30733v(this.f11946a.getContext(), attributeSet, f11945c, i, 0);
        Drawable h = v.mo28182h(0);
        if (h != null) {
            this.f11946a.setIndeterminateDrawable(mo20020e(h));
        }
        Drawable h2 = v.mo28182h(1);
        if (h2 != null) {
            this.f11946a.setProgressDrawable(mo20019d(h2, false));
        }
        v.mo28194w();
    }

    /* renamed from: d */
    public Drawable mo20019d(Drawable drawable, boolean z) {
        boolean z2;
        if (drawable instanceof nn7) {
            nn7 nn7 = (nn7) drawable;
            Drawable a = nn7.mo23756a();
            if (a != null) {
                nn7.mo23757b(mo20019d(a, z));
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i = 0; i < numberOfLayers; i++) {
                int id = layerDrawable.getId(i);
                Drawable drawable2 = layerDrawable.getDrawable(i);
                if (id == 16908301 || id == 16908303) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                drawableArr[i] = mo20019d(drawable2, z2);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                layerDrawable2.setId(i2, layerDrawable.getId(i2));
                C2308a.m17140a(layerDrawable, layerDrawable2, i2);
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.f11947b == null) {
                this.f11947b = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(mo20016a());
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            if (z) {
                return new ClipDrawable(shapeDrawable, 3, 1);
            }
            return shapeDrawable;
        }
        return drawable;
    }

    /* renamed from: e */
    public final Drawable mo20020e(Drawable drawable) {
        if (!(drawable instanceof AnimationDrawable)) {
            return drawable;
        }
        AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        AnimationDrawable animationDrawable2 = new AnimationDrawable();
        animationDrawable2.setOneShot(animationDrawable.isOneShot());
        for (int i = 0; i < numberOfFrames; i++) {
            Drawable d = mo20019d(animationDrawable.getFrame(i), true);
            d.setLevel(10000);
            animationDrawable2.addFrame(d, animationDrawable.getDuration(i));
        }
        animationDrawable2.setLevel(10000);
        return animationDrawable2;
    }
}
