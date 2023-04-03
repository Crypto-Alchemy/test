package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.Picasso;

/* renamed from: com.squareup.picasso.o */
/* compiled from: Target */
public interface C5457o {
    void onBitmapFailed(Exception exc, Drawable drawable);

    void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom);

    void onPrepareLoad(Drawable drawable);
}
