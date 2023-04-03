package p000;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: ws7 */
public abstract class ws7 implements Closeable {
    /* renamed from: a */
    public abstract long mo34185a();

    /* renamed from: b */
    public abstract InputStream mo34186b(long j, long j2) throws IOException;

    /* renamed from: c */
    public final synchronized InputStream mo49262c() throws IOException {
        return mo34186b(0, mo34185a());
    }
}
