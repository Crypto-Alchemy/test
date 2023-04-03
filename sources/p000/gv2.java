package p000;

import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0012\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, mo44877d2 = {"Lgv2;", "Lz56;", "Lm40;", "sink", "", "byteCount", "read", "Lr37;", "close", "Lqq6;", "timeout", "", "toString", "Ljava/io/InputStream;", "a", "Ljava/io/InputStream;", "input", "d", "Lqq6;", "<init>", "(Ljava/io/InputStream;Lqq6;)V", "okio"}, mo44878k = 1, mo44879mv = {1, 5, 1})
/* renamed from: gv2 */
/* compiled from: JvmOkio.kt */
public class gv2 implements z56 {

    /* renamed from: a */
    public final InputStream f38068a;

    /* renamed from: d */
    public final qq6 f38069d;

    public gv2(InputStream inputStream, qq6 qq6) {
        vx2.m53591g(inputStream, "input");
        vx2.m53591g(qq6, "timeout");
        this.f38068a = inputStream;
        this.f38069d = qq6;
    }

    public void close() {
        this.f38068a.close();
    }

    public long read(m40 m40, long j) {
        boolean z;
        vx2.m53591g(m40, "sink");
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i == 0) {
            return 0;
        }
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            try {
                this.f38069d.throwIfReached();
                ct5 O = m40.mo56033O(1);
                int read = this.f38068a.read(O.f37200a, O.f37202c, (int) Math.min(j, (long) (8192 - O.f37202c)));
                if (read != -1) {
                    O.f37202c += read;
                    long j2 = (long) read;
                    m40.mo56027K(m40.size() + j2);
                    return j2;
                } else if (O.f37201b != O.f37202c) {
                    return -1;
                } else {
                    m40.f40752a = O.mo51003b();
                    et5.m57488b(O);
                    return -1;
                }
            } catch (AssertionError e) {
                if (sg4.m71930e(e)) {
                    throw new IOException(e);
                }
                throw e;
            }
        } else {
            throw new IllegalArgumentException(vx2.m53598n("byteCount < 0: ", Long.valueOf(j)).toString());
        }
    }

    public qq6 timeout() {
        return this.f38069d;
    }

    public String toString() {
        return "source(" + this.f38068a + ')';
    }
}
