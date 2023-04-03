package okhttp3.internal.p022io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\b\bf\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H&J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0002H&¨\u0006\u0015"}, mo44877d2 = {"Lokhttp3/internal/io/FileSystem;", "", "Ljava/io/File;", "file", "Lz56;", "source", "Ls36;", "sink", "appendingSink", "Lr37;", "delete", "", "exists", "", "size", "from", "to", "rename", "directory", "deleteContents", "Companion", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: okhttp3.internal.io.FileSystem */
/* compiled from: FileSystem.kt */
public interface FileSystem {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final FileSystem SYSTEM = new Companion.SystemFileSystem();

    @Metadata(mo44876d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001¨\u0006\u0006"}, mo44877d2 = {"Lokhttp3/internal/io/FileSystem$Companion;", "", "()V", "SYSTEM", "Lokhttp3/internal/io/FileSystem;", "SystemFileSystem", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0}, mo44881xi = 48)
    /* renamed from: okhttp3.internal.io.FileSystem$Companion */
    /* compiled from: FileSystem.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0002H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016¨\u0006\u0018"}, mo44877d2 = {"Lokhttp3/internal/io/FileSystem$Companion$SystemFileSystem;", "Lokhttp3/internal/io/FileSystem;", "Ljava/io/File;", "file", "Lz56;", "source", "Ls36;", "sink", "appendingSink", "Lr37;", "delete", "", "exists", "", "size", "from", "to", "rename", "directory", "deleteContents", "", "toString", "<init>", "()V", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0})
        /* renamed from: okhttp3.internal.io.FileSystem$Companion$SystemFileSystem */
        /* compiled from: FileSystem.kt */
        public static final class SystemFileSystem implements FileSystem {
            public s36 appendingSink(File file) throws FileNotFoundException {
                vx2.m53591g(file, "file");
                try {
                    return sg4.m71926a(file);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return sg4.m71926a(file);
                }
            }

            public void delete(File file) throws IOException {
                vx2.m53591g(file, "file");
                if (!file.delete() && file.exists()) {
                    throw new IOException(vx2.m53598n("failed to delete ", file));
                }
            }

            public void deleteContents(File file) throws IOException {
                vx2.m53591g(file, "directory");
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    int i = 0;
                    int length = listFiles.length;
                    while (i < length) {
                        File file2 = listFiles[i];
                        i++;
                        if (file2.isDirectory()) {
                            vx2.m53590f(file2, "file");
                            deleteContents(file2);
                        }
                        if (!file2.delete()) {
                            throw new IOException(vx2.m53598n("failed to delete ", file2));
                        }
                    }
                    return;
                }
                throw new IOException(vx2.m53598n("not a readable directory: ", file));
            }

            public boolean exists(File file) {
                vx2.m53591g(file, "file");
                return file.exists();
            }

            public void rename(File file, File file2) throws IOException {
                vx2.m53591g(file, "from");
                vx2.m53591g(file2, "to");
                delete(file2);
                if (!file.renameTo(file2)) {
                    throw new IOException("failed to rename " + file + " to " + file2);
                }
            }

            public s36 sink(File file) throws FileNotFoundException {
                vx2.m53591g(file, "file");
                try {
                    return tg4.m72309h(file, false, 1, (Object) null);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return tg4.m72309h(file, false, 1, (Object) null);
                }
            }

            public long size(File file) {
                vx2.m53591g(file, "file");
                return file.length();
            }

            public z56 source(File file) throws FileNotFoundException {
                vx2.m53591g(file, "file");
                return sg4.m71936k(file);
            }

            public String toString() {
                return "FileSystem.SYSTEM";
            }
        }

        private Companion() {
        }
    }

    s36 appendingSink(File file) throws FileNotFoundException;

    void delete(File file) throws IOException;

    void deleteContents(File file) throws IOException;

    boolean exists(File file);

    void rename(File file, File file2) throws IOException;

    s36 sink(File file) throws FileNotFoundException;

    long size(File file);

    z56 source(File file) throws FileNotFoundException;
}
