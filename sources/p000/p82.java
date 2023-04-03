package p000;

import java.io.IOException;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\u000f\u0010\u0010\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u0014"}, mo44877d2 = {"Lp82;", "Ls36;", "Lm40;", "source", "", "byteCount", "Lr37;", "write", "flush", "Lqq6;", "timeout", "close", "", "toString", "-deprecated_delegate", "()Ls36;", "delegate", "Ls36;", "<init>", "(Ls36;)V", "okio"}, mo44878k = 1, mo44879mv = {1, 5, 1})
/* renamed from: p82 */
/* compiled from: ForwardingSink.kt */
public abstract class p82 implements s36 {
    private final s36 delegate;

    public p82(s36 s36) {
        vx2.m53591g(s36, "delegate");
        this.delegate = s36;
    }

    /* renamed from: -deprecated_delegate  reason: not valid java name */
    public final s36 m75785deprecated_delegate() {
        return this.delegate;
    }

    public void close() throws IOException {
        this.delegate.close();
    }

    public final s36 delegate() {
        return this.delegate;
    }

    public void flush() throws IOException {
        this.delegate.flush();
    }

    public qq6 timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }

    public void write(m40 m40, long j) throws IOException {
        vx2.m53591g(m40, "source");
        this.delegate.write(m40, j);
    }
}
