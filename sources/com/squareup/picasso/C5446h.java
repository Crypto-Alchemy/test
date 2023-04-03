package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;

/* renamed from: com.squareup.picasso.h */
/* compiled from: ImageViewAction */
public class C5446h extends C5428a<ImageView> {

    /* renamed from: m */
    public q90 f26877m;

    public C5446h(Picasso picasso, ImageView imageView, C5450k kVar, int i, int i2, int i3, Drawable drawable, String str, Object obj, q90 q90, boolean z) {
        super(picasso, imageView, kVar, i, i2, i3, drawable, str, obj, z);
        this.f26877m = q90;
    }

    /* renamed from: a */
    public void mo39489a() {
        super.mo39489a();
        if (this.f26877m != null) {
            this.f26877m = null;
        }
    }

    /* renamed from: b */
    public void mo39490b(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
        if (bitmap != null) {
            ImageView imageView = (ImageView) this.f26811c.get();
            if (imageView != null) {
                Picasso picasso = this.f26809a;
                Bitmap bitmap2 = bitmap;
                Picasso.LoadedFrom loadedFrom2 = loadedFrom;
                C5447i.m41823c(imageView, picasso.f26780e, bitmap2, loadedFrom2, this.f26812d, picasso.f26788m);
                q90 q90 = this.f26877m;
                if (q90 != null) {
                    q90.onSuccess();
                    return;
                }
                return;
            }
            return;
        }
        throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", new Object[]{this}));
    }

    /* renamed from: c */
    public void mo39491c(Exception exc) {
        ImageView imageView = (ImageView) this.f26811c.get();
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof Animatable) {
                ((Animatable) drawable).stop();
            }
            int i = this.f26815g;
            if (i != 0) {
                imageView.setImageResource(i);
            } else {
                Drawable drawable2 = this.f26816h;
                if (drawable2 != null) {
                    imageView.setImageDrawable(drawable2);
                }
            }
            q90 q90 = this.f26877m;
            if (q90 != null) {
                q90.onError(exc);
            }
        }
    }
}
