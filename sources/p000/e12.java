package p000;

import android.annotation.SuppressLint;
import android.os.Build;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0006"}, mo44877d2 = {"Ljava/nio/channels/ReadableByteChannel;", "input", "Ljava/nio/channels/FileChannel;", "output", "Lr37;", "a", "room-runtime_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: e12 */
/* compiled from: FileUtil.kt */
public final class e12 {
    @SuppressLint({"LambdaLast"})
    /* renamed from: a */
    public static final void m15631a(ReadableByteChannel readableByteChannel, FileChannel fileChannel) throws IOException {
        vx2.m53591g(readableByteChannel, "input");
        vx2.m53591g(fileChannel, "output");
        try {
            if (Build.VERSION.SDK_INT <= 23) {
                InputStream newInputStream = Channels.newInputStream(readableByteChannel);
                OutputStream newOutputStream = Channels.newOutputStream(fileChannel);
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = newInputStream.read(bArr);
                    if (read <= 0) {
                        break;
                    }
                    newOutputStream.write(bArr, 0, read);
                }
            } else {
                fileChannel.transferFrom(readableByteChannel, 0, Long.MAX_VALUE);
            }
            fileChannel.force(false);
        } finally {
            readableByteChannel.close();
            fileChannel.close();
        }
    }
}
