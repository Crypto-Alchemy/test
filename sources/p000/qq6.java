package p000;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0016\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\b\u0010\f\u001a\u00020\u0000H\u0016J\b\u0010\r\u001a\u00020\u0000H\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u000e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0001J/\u0010\u0016\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00122\u0006\u0010\u0013\u001a\u00020\u00002\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\bø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0018R\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0019R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019\u0002\u0007\n\u0005\b20\u0001¨\u0006\u001e"}, mo44877d2 = {"Lqq6;", "", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "timeoutNanos", "", "hasDeadline", "deadlineNanoTime", "duration", "deadline", "clearTimeout", "clearDeadline", "Lr37;", "throwIfReached", "monitor", "waitUntilNotified", "T", "other", "Lkotlin/Function0;", "block", "intersectWith", "(Lqq6;Lpc2;)Ljava/lang/Object;", "Z", "J", "<init>", "()V", "Companion", "b", "okio"}, mo44878k = 1, mo44879mv = {1, 5, 1})
/* renamed from: qq6 */
/* compiled from: Timeout.kt */
public class qq6 {
    public static final C9220b Companion = new C9220b((DefaultConstructorMarker) null);
    public static final qq6 NONE = new C9219a();
    private long deadlineNanoTime;
    private boolean hasDeadline;
    private long timeoutNanos;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\t"}, mo44877d2 = {"qq6$a", "Lqq6;", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "deadlineNanoTime", "Lr37;", "throwIfReached", "okio"}, mo44878k = 1, mo44879mv = {1, 5, 1})
    /* renamed from: qq6$a */
    /* compiled from: Timeout.kt */
    public static final class C9219a extends qq6 {
        public qq6 deadlineNanoTime(long j) {
            return this;
        }

        public void throwIfReached() {
        }

        public qq6 timeout(long j, TimeUnit timeUnit) {
            vx2.m53591g(timeUnit, "unit");
            return this;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, mo44877d2 = {"Lqq6$b;", "", "", "aNanos", "bNanos", "a", "Lqq6;", "NONE", "Lqq6;", "<init>", "()V", "okio"}, mo44878k = 1, mo44879mv = {1, 5, 1})
    /* renamed from: qq6$b */
    /* compiled from: Timeout.kt */
    public static final class C9220b {
        public C9220b() {
        }

        public /* synthetic */ C9220b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final long mo65511a(long j, long j2) {
            return (j != 0 && (j2 == 0 || j < j2)) ? j : j2;
        }
    }

    public qq6 clearDeadline() {
        this.hasDeadline = false;
        return this;
    }

    public qq6 clearTimeout() {
        this.timeoutNanos = 0;
        return this;
    }

    public final qq6 deadline(long j, TimeUnit timeUnit) {
        boolean z;
        vx2.m53591g(timeUnit, "unit");
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return deadlineNanoTime(System.nanoTime() + timeUnit.toNanos(j));
        }
        throw new IllegalArgumentException(vx2.m53598n("duration <= 0: ", Long.valueOf(j)).toString());
    }

    public long deadlineNanoTime() {
        if (this.hasDeadline) {
            return this.deadlineNanoTime;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    public boolean hasDeadline() {
        return this.hasDeadline;
    }

    public final <T> T intersectWith(qq6 qq6, pc2<? extends T> pc2) {
        vx2.m53591g(qq6, "other");
        vx2.m53591g(pc2, "block");
        long timeoutNanos2 = timeoutNanos();
        long a = Companion.mo65511a(qq6.timeoutNanos(), timeoutNanos());
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        timeout(a, timeUnit);
        if (hasDeadline()) {
            long deadlineNanoTime2 = deadlineNanoTime();
            if (qq6.hasDeadline()) {
                deadlineNanoTime(Math.min(deadlineNanoTime(), qq6.deadlineNanoTime()));
            }
            try {
                T invoke = pc2.invoke();
                pu2.m50113b(1);
                timeout(timeoutNanos2, timeUnit);
                if (qq6.hasDeadline()) {
                    deadlineNanoTime(deadlineNanoTime2);
                }
                pu2.m50112a(1);
                return invoke;
            } catch (Throwable th) {
                pu2.m50113b(1);
                timeout(timeoutNanos2, TimeUnit.NANOSECONDS);
                if (qq6.hasDeadline()) {
                    deadlineNanoTime(deadlineNanoTime2);
                }
                pu2.m50112a(1);
                throw th;
            }
        } else {
            if (qq6.hasDeadline()) {
                deadlineNanoTime(qq6.deadlineNanoTime());
            }
            try {
                T invoke2 = pc2.invoke();
                pu2.m50113b(1);
                timeout(timeoutNanos2, timeUnit);
                if (qq6.hasDeadline()) {
                    clearDeadline();
                }
                pu2.m50112a(1);
                return invoke2;
            } catch (Throwable th2) {
                pu2.m50113b(1);
                timeout(timeoutNanos2, TimeUnit.NANOSECONDS);
                if (qq6.hasDeadline()) {
                    clearDeadline();
                }
                pu2.m50112a(1);
                throw th2;
            }
        }
    }

    public void throwIfReached() throws IOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        } else if (this.hasDeadline && this.deadlineNanoTime - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public qq6 timeout(long j, TimeUnit timeUnit) {
        boolean z;
        vx2.m53591g(timeUnit, "unit");
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.timeoutNanos = timeUnit.toNanos(j);
            return this;
        }
        throw new IllegalArgumentException(vx2.m53598n("timeout < 0: ", Long.valueOf(j)).toString());
    }

    public long timeoutNanos() {
        return this.timeoutNanos;
    }

    public final void waitUntilNotified(Object obj) throws InterruptedIOException {
        vx2.m53591g(obj, "monitor");
        try {
            boolean hasDeadline2 = hasDeadline();
            long timeoutNanos2 = timeoutNanos();
            long j = 0;
            if (hasDeadline2 || timeoutNanos2 != 0) {
                long nanoTime = System.nanoTime();
                if (hasDeadline2 && timeoutNanos2 != 0) {
                    timeoutNanos2 = Math.min(timeoutNanos2, deadlineNanoTime() - nanoTime);
                } else if (hasDeadline2) {
                    timeoutNanos2 = deadlineNanoTime() - nanoTime;
                }
                if (timeoutNanos2 > 0) {
                    long j2 = timeoutNanos2 / 1000000;
                    Long.signum(j2);
                    obj.wait(j2, (int) (timeoutNanos2 - (1000000 * j2)));
                    j = System.nanoTime() - nanoTime;
                }
                if (j >= timeoutNanos2) {
                    throw new InterruptedIOException("timeout");
                }
                return;
            }
            obj.wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    public qq6 deadlineNanoTime(long j) {
        this.hasDeadline = true;
        this.deadlineNanoTime = j;
        return this;
    }
}
