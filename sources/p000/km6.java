package p000;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000 \n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0014\u0010\u0003\u001a\u00020\u00008\u0000X\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"\u0014\u0010\t\u001a\u00020\u00048\u0000X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006\"\u0014\u0010\u000b\u001a\u00020\u00008\u0000X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0002\"\u0016\u0010\u000f\u001a\u00020\f8\u0000@\u0000X\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e\"\u0014\u0010\u0013\u001a\u00020\u00108\u0000X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0015\u001a\u00020\u00108\u0000X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012¨\u0006\u0016"}, mo44877d2 = {"", "a", "J", "WORK_STEALING_TIME_RESOLUTION_NS", "", "b", "I", "CORE_POOL_SIZE", "c", "MAX_POOL_SIZE", "d", "IDLE_WORKER_KEEP_ALIVE_NS", "Lrm5;", "e", "Lrm5;", "schedulerTimeSource", "Lzl6;", "f", "Lzl6;", "NonBlockingContext", "g", "BlockingContext", "kotlinx-coroutines-core"}, mo44878k = 2, mo44879mv = {1, 6, 0})
/* renamed from: km6 */
/* compiled from: Tasks.kt */
public final class km6 {

    /* renamed from: a */
    public static final long f38922a = fl6.m57787e("kotlinx.coroutines.scheduler.resolution.ns", 100000, 0, 0, 12, (Object) null);

    /* renamed from: b */
    public static final int f38923b = fl6.m57786d("kotlinx.coroutines.scheduler.core.pool.size", d75.m43382d(dl6.m56896a(), 2), 1, 0, 8, (Object) null);

    /* renamed from: c */
    public static final int f38924c = fl6.m57786d("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4, (Object) null);

    /* renamed from: d */
    public static final long f38925d = TimeUnit.SECONDS.toNanos(fl6.m57787e("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 0, 0, 12, (Object) null));

    /* renamed from: e */
    public static rm5 f38926e = e34.f37447a;

    /* renamed from: f */
    public static final zl6 f38927f = new am6(0);

    /* renamed from: g */
    public static final zl6 f38928g = new am6(1);
}
