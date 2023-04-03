package p000;

import java.io.OutputStream;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, mo44877d2 = {"Lhj4;", "Ls36;", "Lm40;", "source", "", "byteCount", "Lr37;", "write", "flush", "close", "Lqq6;", "timeout", "", "toString", "Ljava/io/OutputStream;", "a", "Ljava/io/OutputStream;", "out", "d", "Lqq6;", "<init>", "(Ljava/io/OutputStream;Lqq6;)V", "okio"}, mo44878k = 1, mo44879mv = {1, 5, 1})
/* renamed from: hj4 */
/* compiled from: JvmOkio.kt */
public final class hj4 implements s36 {

    /* renamed from: a */
    public final OutputStream f38223a;

    /* renamed from: d */
    public final qq6 f38224d;

    public hj4(OutputStream outputStream, qq6 qq6) {
        vx2.m53591g(outputStream, "out");
        vx2.m53591g(qq6, "timeout");
        this.f38223a = outputStream;
        this.f38224d = qq6;
    }

    public void close() {
        this.f38223a.close();
    }

    public void flush() {
        this.f38223a.flush();
    }

    public qq6 timeout() {
        return this.f38224d;
    }

    public String toString() {
        return "sink(" + this.f38223a + ')';
    }

    public void write(m40 m40, long j) {
        vx2.m53591g(m40, "source");
        zp7.m75204b(m40.size(), 0, j);
        while (j > 0) {
            this.f38224d.throwIfReached();
            ct5 ct5 = m40.f40752a;
            vx2.m53588d(ct5);
            int min = (int) Math.min(j, (long) (ct5.f37202c - ct5.f37201b));
            this.f38223a.write(ct5.f37200a, ct5.f37201b, min);
            ct5.f37201b += min;
            long j2 = (long) min;
            j -= j2;
            m40.mo56027K(m40.size() - j2);
            if (ct5.f37201b == ct5.f37202c) {
                m40.f40752a = ct5.mo51003b();
                et5.m57488b(ct5);
            }
        }
    }
}
