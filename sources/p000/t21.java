package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.nio.CharBuffer;

@SuppressLint({"LogConditional"})
/* renamed from: t21 */
/* compiled from: Debug */
public class t21 {
    /* renamed from: a */
    public static String m27243a() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName() + "()";
    }

    /* renamed from: b */
    public static String m27244b() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")";
    }

    /* renamed from: c */
    public static String m27245c(Context context, int i) {
        if (i == -1) {
            return "UNKNOWN";
        }
        try {
            return context.getResources().getResourceEntryName(i);
        } catch (Exception unused) {
            return "?" + i;
        }
    }

    /* renamed from: d */
    public static String m27246d(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }

    /* renamed from: e */
    public static String m27247e(MotionLayout motionLayout, int i) {
        return m27248f(motionLayout, i, -1);
    }

    /* renamed from: f */
    public static String m27248f(MotionLayout motionLayout, int i, int i2) {
        int length;
        if (i == -1) {
            return "UNDEFINED";
        }
        String resourceEntryName = motionLayout.getContext().getResources().getResourceEntryName(i);
        if (i2 == -1) {
            return resourceEntryName;
        }
        if (resourceEntryName.length() > i2) {
            resourceEntryName = resourceEntryName.replaceAll("([^_])[aeiou]+", "$1");
        }
        if (resourceEntryName.length() <= i2 || (length = resourceEntryName.replaceAll("[^_]", "").length()) <= 0) {
            return resourceEntryName;
        }
        int length2 = (resourceEntryName.length() - i2) / length;
        return resourceEntryName.replaceAll(CharBuffer.allocate(length2).toString().replace(0, '.') + "_", "_");
    }

    /* renamed from: g */
    public static void m27249g(String str, String str2, int i) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int min = Math.min(i, stackTrace.length - 1);
        String str3 = " ";
        for (int i2 = 1; i2 <= min; i2++) {
            StackTraceElement stackTraceElement = stackTrace[i2];
            str3 = str3 + " ";
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(str3);
            sb.append(".(" + stackTrace[i2].getFileName() + ":" + stackTrace[i2].getLineNumber() + ") " + stackTrace[i2].getMethodName());
            sb.append(str3);
        }
    }
}
