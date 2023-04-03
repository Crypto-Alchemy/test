package androidx.media3.exoplayer.source;

import android.os.Handler;
import androidx.media3.common.C0798k;
import androidx.media3.common.C0831s;
import androidx.media3.exoplayer.drm.C0909b;
import androidx.media3.exoplayer.upstream.C1019b;
import java.io.IOException;

/* renamed from: androidx.media3.exoplayer.source.i */
/* compiled from: MediaSource */
public interface C0973i {

    /* renamed from: androidx.media3.exoplayer.source.i$a */
    /* compiled from: MediaSource */
    public interface C0974a {
        /* renamed from: a */
        C0973i mo7206a(C0798k kVar);

        /* renamed from: b */
        C0974a mo7207b(rk1 rk1);

        /* renamed from: c */
        C0974a mo7208c(C1019b bVar);
    }

    /* renamed from: androidx.media3.exoplayer.source.i$b */
    /* compiled from: MediaSource */
    public static final class C0975b extends nr3 {
        public C0975b(Object obj) {
            super(obj);
        }

        /* renamed from: c */
        public C0975b mo7638c(Object obj) {
            return new C0975b(super.mo23780a(obj));
        }

        public C0975b(Object obj, long j) {
            super(obj, j);
        }

        public C0975b(Object obj, long j, int i) {
            super(obj, j, i);
        }

        public C0975b(Object obj, int i, int i2, long j) {
            super(obj, i, i2, j);
        }

        public C0975b(nr3 nr3) {
            super(nr3);
        }
    }

    /* renamed from: androidx.media3.exoplayer.source.i$c */
    /* compiled from: MediaSource */
    public interface C0976c {
        /* renamed from: a */
        void mo7639a(C0973i iVar, C0831s sVar);
    }

    /* renamed from: a */
    void mo7566a(Handler handler, C0977j jVar);

    /* renamed from: b */
    void mo7567b(C0977j jVar);

    /* renamed from: c */
    C0971h mo7197c(C0975b bVar, C2891nf nfVar, long j);

    /* renamed from: d */
    C0798k mo7199d();

    /* renamed from: e */
    void mo7568e(Handler handler, C0909b bVar);

    /* renamed from: f */
    void mo7569f(C0909b bVar);

    /* renamed from: g */
    void mo7203g(C0971h hVar);

    /* renamed from: h */
    void mo7570h(C0976c cVar);

    /* renamed from: i */
    void mo7571i(C0976c cVar, ov6 ov6, br4 br4);

    /* renamed from: j */
    void mo7572j(C0976c cVar);

    /* renamed from: k */
    void mo7573k(C0976c cVar);

    /* renamed from: m */
    void mo7204m() throws IOException;

    /* renamed from: n */
    boolean mo7574n();

    /* renamed from: o */
    C0831s mo7575o();
}
