package p000;

import java.io.Closeable;
import java.io.IOException;

@Deprecated
/* renamed from: qo2 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class qo2 {
    /* renamed from: a */
    public static void m50661a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
