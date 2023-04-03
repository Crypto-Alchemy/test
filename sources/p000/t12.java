package p000;

import android.net.Uri;
import androidx.media3.common.StreamKey;
import androidx.media3.exoplayer.upstream.C1023c;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import p000.r12;

/* renamed from: t12 */
/* compiled from: FilteringManifestParser */
public final class t12<T extends r12<T>> implements C1023c.C1024a<T> {

    /* renamed from: a */
    public final C1023c.C1024a<? extends T> f17874a;

    /* renamed from: b */
    public final List<StreamKey> f17875b;

    public t12(C1023c.C1024a<? extends T> aVar, List<StreamKey> list) {
        this.f17874a = aVar;
        this.f17875b = list;
    }

    /* renamed from: b */
    public T mo7217a(Uri uri, InputStream inputStream) throws IOException {
        T t = (r12) this.f17874a.mo7217a(uri, inputStream);
        List<StreamKey> list = this.f17875b;
        if (list == null || list.isEmpty()) {
            return t;
        }
        return (r12) t.mo18390a(this.f17875b);
    }
}
