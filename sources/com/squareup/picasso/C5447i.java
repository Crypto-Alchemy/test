package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;

/* renamed from: com.squareup.picasso.i */
/* compiled from: PicassoDrawable */
public final class C5447i extends BitmapDrawable {

    /* renamed from: h */
    public static final Paint f26878h = new Paint();

    /* renamed from: a */
    public final boolean f26879a;

    /* renamed from: b */
    public final float f26880b;

    /* renamed from: c */
    public final Picasso.LoadedFrom f26881c;

    /* renamed from: d */
    public Drawable f26882d;

    /* renamed from: e */
    public long f26883e;

    /* renamed from: f */
    public boolean f26884f;

    /* renamed from: g */
    public int f26885g = 255;

    public C5447i(Context context, Bitmap bitmap, Drawable drawable, Picasso.LoadedFrom loadedFrom, boolean z, boolean z2) {
        super(context.getResources(), bitmap);
        boolean z3;
        this.f26879a = z2;
        this.f26880b = context.getResources().getDisplayMetrics().density;
        this.f26881c = loadedFrom;
        if (loadedFrom == Picasso.LoadedFrom.MEMORY || z) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z3) {
            this.f26882d = drawable;
            this.f26884f = true;
            this.f26883e = SystemClock.uptimeMillis();
        }
    }

    /* renamed from: b */
    public static Path m41822b(int i, int i2, int i3) {
        Path path = new Path();
        float f = (float) i;
        float f2 = (float) i2;
        path.moveTo(f, f2);
        path.lineTo((float) (i + i3), f2);
        path.lineTo(f, (float) (i2 + i3));
        return path;
    }

    /* renamed from: c */
    public static void m41823c(ImageView imageView, Context context, Bitmap bitmap, Picasso.LoadedFrom loadedFrom, boolean z, boolean z2) {
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        imageView.setImageDrawable(new C5447i(context, bitmap, drawable, loadedFrom, z, z2));
    }

    /* renamed from: d */
    public static void m41824d(ImageView imageView, Drawable drawable) {
        imageView.setImageDrawable(drawable);
        if (imageView.getDrawable() instanceof Animatable) {
            ((Animatable) imageView.getDrawable()).start();
        }
    }

    /* renamed from: a */
    public final void mo39556a(Canvas canvas) {
        Paint paint = f26878h;
        paint.setColor(-1);
        canvas.drawPath(m41822b(0, 0, (int) (this.f26880b * 16.0f)), paint);
        paint.setColor(this.f26881c.debugColor);
        canvas.drawPath(m41822b(0, 0, (int) (this.f26880b * 15.0f)), paint);
    }

    public void draw(Canvas canvas) {
        if (!this.f26884f) {
            super.draw(canvas);
        } else {
            float uptimeMillis = ((float) (SystemClock.uptimeMillis() - this.f26883e)) / 200.0f;
            if (uptimeMillis >= 1.0f) {
                this.f26884f = false;
                this.f26882d = null;
                super.draw(canvas);
            } else {
                Drawable drawable = this.f26882d;
                if (drawable != null) {
                    drawable.draw(canvas);
                }
                super.setAlpha((int) (((float) this.f26885g) * uptimeMillis));
                super.draw(canvas);
                super.setAlpha(this.f26885g);
            }
        }
        if (this.f26879a) {
            mo39556a(canvas);
        }
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f26882d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        super.onBoundsChange(rect);
    }

    public void setAlpha(int i) {
        this.f26885g = i;
        Drawable drawable = this.f26882d;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
        super.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f26882d;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        super.setColorFilter(colorFilter);
    }
}
