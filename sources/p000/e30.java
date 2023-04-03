package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0016¨\u0006\u000e"}, mo44877d2 = {"Le30;", "Ls36;", "Lm40;", "source", "", "byteCount", "Lr37;", "write", "flush", "Lqq6;", "timeout", "close", "<init>", "()V", "okio"}, mo44878k = 1, mo44879mv = {1, 5, 1})
/* renamed from: e30 */
/* compiled from: Okio.kt */
public final class e30 implements s36 {
    public void close() {
    }

    public void flush() {
    }

    public qq6 timeout() {
        return qq6.NONE;
    }

    public void write(m40 m40, long j) {
        vx2.m53591g(m40, "source");
        m40.skip(j);
    }
}
