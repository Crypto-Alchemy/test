package p000;

import android.annotation.TargetApi;
import android.os.SystemClock;

/* renamed from: ok3 */
/* compiled from: LogTime */
public final class ok3 {

    /* renamed from: a */
    public static final double f15919a = (1.0d / Math.pow(10.0d, 6.0d));

    /* renamed from: a */
    public static double m23849a(long j) {
        return ((double) (m23850b() - j)) * f15919a;
    }

    @TargetApi(17)
    /* renamed from: b */
    public static long m23850b() {
        return SystemClock.elapsedRealtimeNanos();
    }
}
