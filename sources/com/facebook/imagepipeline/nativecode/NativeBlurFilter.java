package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;

@ii1
public class NativeBlurFilter {
    static {
        r34.m26041a();
    }

    @ii1
    private static native void nativeIterativeBoxBlur(Bitmap bitmap, int i, int i2);
}
