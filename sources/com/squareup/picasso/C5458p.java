package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.Picasso;

/* renamed from: com.squareup.picasso.p */
/* compiled from: TargetAction */
public final class C5458p extends C5428a<C5457o> {
    public C5458p(Picasso picasso, C5457o oVar, C5450k kVar, int i, int i2, Drawable drawable, String str, Object obj, int i3) {
        super(picasso, oVar, kVar, i, i2, i3, drawable, str, obj, false);
    }

    /* renamed from: b */
    public void mo39490b(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
        if (bitmap != null) {
            C5457o oVar = (C5457o) mo39499k();
            if (oVar != null) {
                oVar.onBitmapLoaded(bitmap, loadedFrom);
                if (bitmap.isRecycled()) {
                    throw new IllegalStateException("Target callback must not recycle bitmap!");
                }
                return;
            }
            return;
        }
        throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", new Object[]{this}));
    }

    /* renamed from: c */
    public void mo39491c(Exception exc) {
        C5457o oVar = (C5457o) mo39499k();
        if (oVar == null) {
            return;
        }
        if (this.f26815g != 0) {
            oVar.onBitmapFailed(exc, this.f26809a.f26780e.getResources().getDrawable(this.f26815g));
        } else {
            oVar.onBitmapFailed(exc, this.f26816h);
        }
    }
}
