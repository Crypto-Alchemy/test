package okhttp3.internal.p023ws;

import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Inflater;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0016R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, mo44877d2 = {"Lokhttp3/internal/ws/MessageInflater;", "Ljava/io/Closeable;", "Lm40;", "buffer", "Lr37;", "inflate", "close", "", "noContextTakeover", "Z", "deflatedBytes", "Lm40;", "Ljava/util/zip/Inflater;", "inflater", "Ljava/util/zip/Inflater;", "Lbu2;", "inflaterSource", "Lbu2;", "<init>", "(Z)V", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: okhttp3.internal.ws.MessageInflater */
/* compiled from: MessageInflater.kt */
public final class MessageInflater implements Closeable {
    private final m40 deflatedBytes;
    private final Inflater inflater;
    private final bu2 inflaterSource;
    private final boolean noContextTakeover;

    public MessageInflater(boolean z) {
        this.noContextTakeover = z;
        m40 m40 = new m40();
        this.deflatedBytes = m40;
        Inflater inflater2 = new Inflater(true);
        this.inflater = inflater2;
        this.inflaterSource = new bu2((z56) m40, inflater2);
    }

    public void close() throws IOException {
        this.inflaterSource.close();
    }

    public final void inflate(m40 m40) throws IOException {
        boolean z;
        vx2.m53591g(m40, "buffer");
        if (this.deflatedBytes.size() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.noContextTakeover) {
                this.inflater.reset();
            }
            this.deflatedBytes.mo56029L0(m40);
            this.deflatedBytes.writeInt(65535);
            long bytesRead = this.inflater.getBytesRead() + this.deflatedBytes.size();
            do {
                this.inflaterSource.mo50729a(m40, Long.MAX_VALUE);
            } while (this.inflater.getBytesRead() < bytesRead);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
