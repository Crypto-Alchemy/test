package p000;

import java.io.File;

/* renamed from: a12 */
/* compiled from: FileTree */
public class a12 {
    /* renamed from: a */
    public static boolean m8a(File file) {
        File[] listFiles = file.listFiles();
        boolean z = true;
        if (listFiles != null) {
            for (File b : listFiles) {
                z &= m9b(b);
            }
        }
        return z;
    }

    /* renamed from: b */
    public static boolean m9b(File file) {
        if (file.isDirectory()) {
            m8a(file);
        }
        return file.delete();
    }

    /* renamed from: c */
    public static void m10c(File file, b12 b12) {
        b12.mo11336c(file);
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    m10c(file2, b12);
                } else {
                    b12.mo11335b(file2);
                }
            }
        }
        b12.mo11334a(file);
    }
}
