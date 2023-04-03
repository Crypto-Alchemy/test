package p000;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0015\u0010\u0014J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0004H\u0016J\b\u0010\f\u001a\u00020\u0001H\u0016J\b\u0010\r\u001a\u00020\u0001H\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016R\"\u0010\u0002\u001a\u00020\u00018\u0007@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, mo44877d2 = {"Ls82;", "Lqq6;", "delegate", "b", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "timeoutNanos", "", "hasDeadline", "deadlineNanoTime", "clearTimeout", "clearDeadline", "Lr37;", "throwIfReached", "a", "Lqq6;", "()Lqq6;", "setDelegate", "(Lqq6;)V", "<init>", "okio"}, mo44878k = 1, mo44879mv = {1, 5, 1})
/* renamed from: s82 */
/* compiled from: ForwardingTimeout.kt */
public class s82 extends qq6 {

    /* renamed from: a */
    public qq6 f44542a;

    public s82(qq6 qq6) {
        vx2.m53591g(qq6, "delegate");
        this.f44542a = qq6;
    }

    /* renamed from: a */
    public final qq6 mo65832a() {
        return this.f44542a;
    }

    /* renamed from: b */
    public final s82 mo65833b(qq6 qq6) {
        vx2.m53591g(qq6, "delegate");
        this.f44542a = qq6;
        return this;
    }

    public qq6 clearDeadline() {
        return this.f44542a.clearDeadline();
    }

    public qq6 clearTimeout() {
        return this.f44542a.clearTimeout();
    }

    public long deadlineNanoTime() {
        return this.f44542a.deadlineNanoTime();
    }

    public boolean hasDeadline() {
        return this.f44542a.hasDeadline();
    }

    public void throwIfReached() throws IOException {
        this.f44542a.throwIfReached();
    }

    public qq6 timeout(long j, TimeUnit timeUnit) {
        vx2.m53591g(timeUnit, "unit");
        return this.f44542a.timeout(j, timeUnit);
    }

    public long timeoutNanos() {
        return this.f44542a.timeoutNanos();
    }

    public qq6 deadlineNanoTime(long j) {
        return this.f44542a.deadlineNanoTime(j);
    }
}
