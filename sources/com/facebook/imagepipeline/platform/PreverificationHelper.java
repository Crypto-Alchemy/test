package com.facebook.imagepipeline.platform;

import android.annotation.TargetApi;
import android.graphics.Bitmap;

@hi1
class PreverificationHelper {
    @hi1
    @TargetApi(26)
    public boolean shouldUseHardwareBitmapConfig(Bitmap.Config config) {
        if (config == Bitmap.Config.HARDWARE) {
            return true;
        }
        return false;
    }
}
