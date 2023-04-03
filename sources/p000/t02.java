package p000;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;

/* renamed from: t02 */
/* compiled from: FileLocker */
public final class t02 implements Closeable {

    /* renamed from: a */
    public final FileOutputStream f17871a;

    /* renamed from: d */
    public final FileLock f17872d;

    public t02(File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        this.f17871a = fileOutputStream;
        try {
            FileLock lock = fileOutputStream.getChannel().lock();
            if (lock == null) {
                fileOutputStream.close();
            }
            this.f17872d = lock;
        } catch (Throwable th) {
            this.f17871a.close();
            throw th;
        }
    }

    /* renamed from: a */
    public static t02 m27234a(File file) throws IOException {
        return new t02(file);
    }

    public void close() throws IOException {
        try {
            FileLock fileLock = this.f17872d;
            if (fileLock != null) {
                fileLock.release();
            }
        } finally {
            this.f17871a.close();
        }
    }
}
