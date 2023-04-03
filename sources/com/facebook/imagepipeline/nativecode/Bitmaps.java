package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;

@ii1
public class Bitmaps {
    static {
        qr2.m25860a();
    }

    @ii1
    public static void copyBitmap(Bitmap bitmap, Bitmap bitmap2) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (bitmap2.getConfig() == bitmap.getConfig()) {
            z = true;
        } else {
            z = false;
        }
        au4.m10787b(Boolean.valueOf(z));
        au4.m10787b(Boolean.valueOf(bitmap.isMutable()));
        if (bitmap.getWidth() == bitmap2.getWidth()) {
            z2 = true;
        } else {
            z2 = false;
        }
        au4.m10787b(Boolean.valueOf(z2));
        if (bitmap.getHeight() != bitmap2.getHeight()) {
            z3 = false;
        }
        au4.m10787b(Boolean.valueOf(z3));
        nativeCopyBitmap(bitmap, bitmap.getRowBytes(), bitmap2, bitmap2.getRowBytes(), bitmap.getHeight());
    }

    @ii1
    private static native void nativeCopyBitmap(Bitmap bitmap, int i, Bitmap bitmap2, int i2, int i3);
}
