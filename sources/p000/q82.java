package p000;

import java.io.IOException;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\u000f\u0010\u000f\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0013"}, mo44877d2 = {"Lq82;", "Lz56;", "Lm40;", "sink", "", "byteCount", "read", "Lqq6;", "timeout", "Lr37;", "close", "", "toString", "-deprecated_delegate", "()Lz56;", "delegate", "Lz56;", "<init>", "(Lz56;)V", "okio"}, mo44878k = 1, mo44879mv = {1, 5, 1})
/* renamed from: q82 */
/* compiled from: ForwardingSource.kt */
public abstract class q82 implements z56 {
    private final z56 delegate;

    public q82(z56 z56) {
        vx2.m53591g(z56, "delegate");
        this.delegate = z56;
    }

    /* renamed from: -deprecated_delegate  reason: not valid java name */
    public final z56 m75786deprecated_delegate() {
        return this.delegate;
    }

    public void close() throws IOException {
        this.delegate.close();
    }

    public final z56 delegate() {
        return this.delegate;
    }

    public long read(m40 m40, long j) throws IOException {
        vx2.m53591g(m40, "sink");
        return this.delegate.read(m40, j);
    }

    public qq6 timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }
}
