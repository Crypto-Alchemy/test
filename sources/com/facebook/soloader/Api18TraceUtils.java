package com.facebook.soloader;

import android.annotation.TargetApi;
import android.os.Trace;

@hi1
@TargetApi(18)
class Api18TraceUtils {
    /* renamed from: a */
    public static void m13707a(String str, String str2, String str3) {
        String str4 = str + str2 + str3;
        if (str4.length() > 127 && str2 != null) {
            int length = (127 - str.length()) - str3.length();
            str4 = str + str2.substring(0, length) + str3;
        }
        Trace.beginSection(str4);
    }

    /* renamed from: b */
    public static void m13708b() {
        Trace.endSection();
    }
}
