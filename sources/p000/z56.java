package p000;

import java.io.Closeable;
import java.io.IOException;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00060\u0001j\u0002`\u0002J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\t\u001a\u00020\bH&J\b\u0010\u000b\u001a\u00020\nH&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, mo44877d2 = {"Lz56;", "Ljava/io/Closeable;", "Lokio/Closeable;", "Lm40;", "sink", "", "byteCount", "read", "Lqq6;", "timeout", "Lr37;", "close", "okio"}, mo44878k = 1, mo44879mv = {1, 5, 1})
/* renamed from: z56 */
/* compiled from: Source.kt */
public interface z56 extends Closeable {
    void close() throws IOException;

    long read(m40 m40, long j) throws IOException;

    qq6 timeout();
}
