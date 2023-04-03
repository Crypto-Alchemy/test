package p000;

import android.content.Context;
import java.io.Closeable;
import java.io.IOException;

/* renamed from: px6 */
/* compiled from: TransportRuntimeComponent */
public abstract class px6 implements Closeable {

    /* renamed from: px6$a */
    /* compiled from: TransportRuntimeComponent */
    public interface C6381a {
        /* renamed from: a */
        C6381a mo29838a(Context context);

        px6 build();
    }

    /* renamed from: a */
    public abstract du1 mo29835a();

    /* renamed from: b */
    public abstract ox6 mo29836b();

    public void close() throws IOException {
        mo29835a().close();
    }
}
