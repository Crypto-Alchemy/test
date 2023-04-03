package p000;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: f99 */
/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public final class f99 {

    /* renamed from: a */
    public static final Logger f28793a = Logger.getLogger(f99.class.getName());

    /* renamed from: a */
    public static void m44238a(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                try {
                    f28793a.logp(Level.WARNING, "com.google.common.io.Closeables", "close", "IOException thrown while closing Closeable.", e);
                } catch (IOException e2) {
                    throw new AssertionError(e2);
                }
            }
        }
    }
}
