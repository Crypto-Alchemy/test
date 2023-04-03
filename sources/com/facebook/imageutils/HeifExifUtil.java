package com.facebook.imageutils;

import android.media.ExifInterface;
import android.os.Build;
import java.io.IOException;
import java.io.InputStream;

public class HeifExifUtil {

    @hi1
    public static class HeifExifUtilAndroidN {
        private HeifExifUtilAndroidN() {
        }

        /* renamed from: a */
        public static int m13706a(InputStream inputStream) {
            try {
                return new ExifInterface(inputStream).getAttributeInt("Orientation", 1);
            } catch (IOException e) {
                oy1.m24416c("HeifExifUtil", "Failed reading Heif Exif orientation -> ignoring", e);
                return 0;
            }
        }
    }

    /* renamed from: a */
    public static int m13705a(InputStream inputStream) {
        if (Build.VERSION.SDK_INT >= 24) {
            return HeifExifUtilAndroidN.m13706a(inputStream);
        }
        oy1.m24415b("HeifExifUtil", "Trying to read Heif Exif information before Android N -> ignoring");
        return 0;
    }
}
