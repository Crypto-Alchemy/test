package p000;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: rh0 */
/* compiled from: Closeables */
public final class rh0 {

    /* renamed from: a */
    public static final Logger f17247a = Logger.getLogger(rh0.class.getName());

    /* renamed from: a */
    public static void m26190a(Closeable closeable, boolean z) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                if (z) {
                    f17247a.log(Level.WARNING, "IOException thrown while closing Closeable.", e);
                    return;
                }
                throw e;
            }
        }
    }

    /* renamed from: b */
    public static void m26191b(InputStream inputStream) {
        try {
            m26190a(inputStream, true);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
