package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;

@ii1
public class NativeRoundingFilter {
    static {
        r34.m26041a();
    }

    @ii1
    private static native void nativeAddRoundedCornersFilter(Bitmap bitmap, int i, int i2, int i3, int i4);

    @ii1
    private static native void nativeToCircleFastFilter(Bitmap bitmap, boolean z);

    @ii1
    private static native void nativeToCircleFilter(Bitmap bitmap, boolean z);

    @ii1
    private static native void nativeToCircleWithBorderFilter(Bitmap bitmap, int i, int i2, boolean z);

    @ii1
    public static void toCircle(Bitmap bitmap, boolean z) {
        au4.m10792g(bitmap);
        if (bitmap.getWidth() >= 3 && bitmap.getHeight() >= 3) {
            nativeToCircleFilter(bitmap, z);
        }
    }

    @ii1
    public static void toCircleFast(Bitmap bitmap, boolean z) {
        au4.m10792g(bitmap);
        if (bitmap.getWidth() >= 3 && bitmap.getHeight() >= 3) {
            nativeToCircleFastFilter(bitmap, z);
        }
    }
}
