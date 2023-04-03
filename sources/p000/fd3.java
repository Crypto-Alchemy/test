package p000;

import android.annotation.SuppressLint;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;

/* renamed from: fd3 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public class fd3 {
    /* renamed from: a */
    public static int m44252a(@RecentlyNonNull String str, @RecentlyNonNull Object... objArr) {
        if (Log.isLoggable("Vision", 3)) {
            return Log.d("Vision", String.format(str, objArr));
        }
        return 0;
    }

    /* renamed from: b */
    public static int m44253b(@RecentlyNonNull String str, @RecentlyNonNull Object... objArr) {
        if (Log.isLoggable("Vision", 6)) {
            return Log.e("Vision", String.format(str, objArr));
        }
        return 0;
    }

    @SuppressLint({"LogTagMismatch"})
    /* renamed from: c */
    public static int m44254c(@RecentlyNonNull Throwable th, @RecentlyNonNull String str, @RecentlyNonNull Object... objArr) {
        if (!Log.isLoggable("Vision", 6)) {
            return 0;
        }
        if (Log.isLoggable("Vision", 3)) {
            return Log.e("Vision", String.format(str, objArr), th);
        }
        String format = String.format(str, objArr);
        String valueOf = String.valueOf(th);
        StringBuilder sb = new StringBuilder(String.valueOf(format).length() + 2 + valueOf.length());
        sb.append(format);
        sb.append(": ");
        sb.append(valueOf);
        return Log.e("Vision", sb.toString());
    }

    /* renamed from: d */
    public static int m44255d(@RecentlyNonNull String str, @RecentlyNonNull Object... objArr) {
        if (Log.isLoggable("Vision", 4)) {
            return Log.i("Vision", String.format(str, objArr));
        }
        return 0;
    }

    /* renamed from: e */
    public static int m44256e(@RecentlyNonNull String str, @RecentlyNonNull Object... objArr) {
        if (Log.isLoggable("Vision", 2)) {
            return Log.v("Vision", String.format(str, objArr));
        }
        return 0;
    }
}
