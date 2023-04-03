package p000;

import java.io.IOException;
import okhttp3.Request;

/* renamed from: k90 */
/* compiled from: Call */
public interface k90<T> extends Cloneable {
    /* renamed from: X */
    void mo50512X(p90<T> p90);

    void cancel();

    k90<T> clone();

    bg5<T> execute() throws IOException;

    boolean isCanceled();

    Request request();
}
