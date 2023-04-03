package p000;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\b\n\u0002\u0010\t\n\u0002\b\u000f\"\u0017\u0010\u0004\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0001\u0010\u0003\"\u0017\u0010\u0007\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0003\"\u0017\u0010\t\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\b\u0010\u0002\u001a\u0004\b\b\u0010\u0003\"\u0017\u0010\u000b\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\n\u0010\u0002\u001a\u0004\b\u0005\u0010\u0003\"\u0017\u0010\r\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0002\u001a\u0004\b\f\u0010\u0003\"\u0017\u0010\u000e\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\f\u0010\u0002\u001a\u0004\b\n\u0010\u0003¨\u0006\u000f"}, mo44877d2 = {"", "a", "J", "()J", "CURRENT_TIME_IN_SECONDS", "b", "e", "THIRTY_SECONDS", "c", "FIVE_MINUTES_IN_SECONDS", "d", "DAY_IN_SECONDS", "f", "WEEK_IN_SECONDS", "MONTH_IN_SECONDS", "sdk_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: fq6 */
/* compiled from: Time.kt */
public final class fq6 {

    /* renamed from: a */
    public static final long f28939a = (System.currentTimeMillis() / ((long) 1000));

    /* renamed from: b */
    public static final long f28940b;

    /* renamed from: c */
    public static final long f28941c;

    /* renamed from: d */
    public static final long f28942d;

    /* renamed from: e */
    public static final long f28943e;

    /* renamed from: f */
    public static final long f28944f;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f28940b = timeUnit.convert(30, timeUnit);
        f28941c = timeUnit.convert(5, TimeUnit.MINUTES);
        TimeUnit timeUnit2 = TimeUnit.DAYS;
        f28942d = timeUnit.convert(1, timeUnit2);
        f28943e = timeUnit.convert(7, timeUnit2);
        f28944f = timeUnit.convert(30, timeUnit2);
    }

    /* renamed from: a */
    public static final long m44369a() {
        return f28939a;
    }

    /* renamed from: b */
    public static final long m44370b() {
        return f28942d;
    }

    /* renamed from: c */
    public static final long m44371c() {
        return f28941c;
    }

    /* renamed from: d */
    public static final long m44372d() {
        return f28944f;
    }

    /* renamed from: e */
    public static final long m44373e() {
        return f28940b;
    }

    /* renamed from: f */
    public static final long m44374f() {
        return f28943e;
    }
}
