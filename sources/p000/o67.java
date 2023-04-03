package p000;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* renamed from: o67 */
/* compiled from: Util */
public final class o67 {

    /* renamed from: a */
    public static final Charset f15824a = Charset.forName("US-ASCII");

    /* renamed from: b */
    public static final Charset f15825b = Charset.forName("UTF-8");

    /* renamed from: a */
    public static void m23689a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    public static void m23690b(File file) throws IOException {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            int length = listFiles.length;
            int i = 0;
            while (i < length) {
                File file2 = listFiles[i];
                if (file2.isDirectory()) {
                    m23690b(file2);
                }
                if (file2.delete()) {
                    i++;
                } else {
                    throw new IOException("failed to delete file: " + file2);
                }
            }
            return;
        }
        throw new IOException("not a readable directory: " + file);
    }
}
