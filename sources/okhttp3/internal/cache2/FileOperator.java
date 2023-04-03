package okhttp3.internal.cache2;

import java.io.IOException;
import java.nio.channels.FileChannel;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u001e\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, mo44877d2 = {"Lokhttp3/internal/cache2/FileOperator;", "", "", "pos", "Lm40;", "source", "byteCount", "Lr37;", "write", "sink", "read", "Ljava/nio/channels/FileChannel;", "fileChannel", "Ljava/nio/channels/FileChannel;", "<init>", "(Ljava/nio/channels/FileChannel;)V", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* compiled from: FileOperator.kt */
public final class FileOperator {
    private final FileChannel fileChannel;

    public FileOperator(FileChannel fileChannel2) {
        vx2.m53591g(fileChannel2, "fileChannel");
        this.fileChannel = fileChannel2;
    }

    public final void read(long j, m40 m40, long j2) {
        vx2.m53591g(m40, "sink");
        if (j2 >= 0) {
            while (j2 > 0) {
                long transferTo = this.fileChannel.transferTo(j, j2, m40);
                j += transferTo;
                j2 -= transferTo;
            }
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    public final void write(long j, m40 m40, long j2) throws IOException {
        vx2.m53591g(m40, "source");
        if (j2 < 0 || j2 > m40.size()) {
            throw new IndexOutOfBoundsException();
        }
        while (j2 > 0) {
            long transferFrom = this.fileChannel.transferFrom(m40, j, j2);
            j += transferFrom;
            j2 -= transferFrom;
        }
    }
}
