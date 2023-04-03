package p000;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\t\u001a\u00020\u0007H&J\b\u0010\u000b\u001a\u00020\nH&J\b\u0010\f\u001a\u00020\u0007H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, mo44877d2 = {"Ls36;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "Lm40;", "source", "", "byteCount", "Lr37;", "write", "flush", "Lqq6;", "timeout", "close", "okio"}, mo44878k = 1, mo44879mv = {1, 5, 1})
/* renamed from: s36 */
/* compiled from: Sink.kt */
public interface s36 extends Closeable, Flushable {
    void close() throws IOException;

    void flush() throws IOException;

    qq6 timeout();

    void write(m40 m40, long j) throws IOException;
}
