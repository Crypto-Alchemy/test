package androidx.media3.exoplayer.upstream;

import android.net.Uri;
import androidx.media3.exoplayer.upstream.Loader;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import p000.d21;

/* renamed from: androidx.media3.exoplayer.upstream.c */
/* compiled from: ParsingLoadable */
public final class C1023c<T> implements Loader.C1015e {

    /* renamed from: a */
    public final long f5478a;

    /* renamed from: b */
    public final d21 f5479b;

    /* renamed from: c */
    public final int f5480c;

    /* renamed from: d */
    public final n96 f5481d;

    /* renamed from: e */
    public final C1024a<? extends T> f5482e;

    /* renamed from: f */
    public volatile T f5483f;

    /* renamed from: androidx.media3.exoplayer.upstream.c$a */
    /* compiled from: ParsingLoadable */
    public interface C1024a<T> {
        /* renamed from: a */
        T mo7217a(Uri uri, InputStream inputStream) throws IOException;
    }

    public C1023c(x11 x11, Uri uri, int i, C1024a<? extends T> aVar) {
        this(x11, new d21.C2129b().mo18411i(uri).mo18404b(1).mo18403a(), i, aVar);
    }

    /* renamed from: a */
    public final void mo7723a() throws IOException {
        this.f5481d.mo23542r();
        a21 a21 = new a21(this.f5481d, this.f5479b);
        try {
            a21.mo13b();
            this.f5483f = this.f5482e.mo7217a((Uri) C2725kr.m20985e(this.f5481d.mo6966m()), a21);
        } finally {
            w67.m29368n(a21);
        }
    }

    /* renamed from: b */
    public long mo7830b() {
        return this.f5481d.mo23539o();
    }

    /* renamed from: c */
    public final void mo7724c() {
    }

    /* renamed from: d */
    public Map<String, List<String>> mo7831d() {
        return this.f5481d.mo23541q();
    }

    /* renamed from: e */
    public final T mo7832e() {
        return this.f5483f;
    }

    /* renamed from: f */
    public Uri mo7833f() {
        return this.f5481d.mo23540p();
    }

    public C1023c(x11 x11, d21 d21, int i, C1024a<? extends T> aVar) {
        this.f5481d = new n96(x11);
        this.f5479b = d21;
        this.f5480c = i;
        this.f5482e = aVar;
        this.f5478a = vi3.m28818a();
    }
}
