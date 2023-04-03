package androidx.media3.exoplayer.audio;

import android.os.Handler;
import androidx.media3.common.C0792h;

/* renamed from: androidx.media3.exoplayer.audio.a */
/* compiled from: AudioRendererEventListener */
public interface C0860a {

    /* renamed from: androidx.media3.exoplayer.audio.a$a */
    /* compiled from: AudioRendererEventListener */
    public static final class C0861a {

        /* renamed from: a */
        public final Handler f4693a;

        /* renamed from: b */
        public final C0860a f4694b;

        public C0861a(Handler handler, C0860a aVar) {
            Handler handler2;
            if (aVar != null) {
                handler2 = (Handler) C2725kr.m20985e(handler);
            } else {
                handler2 = null;
            }
            this.f4693a = handler2;
            this.f4694b = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: A */
        public /* synthetic */ void m6120A(int i, long j, long j2) {
            ((C0860a) w67.m29360j(this.f4694b)).mo7080A(i, j, j2);
        }

        /* access modifiers changed from: private */
        /* renamed from: r */
        public /* synthetic */ void m6131r(Exception exc) {
            ((C0860a) w67.m29360j(this.f4694b)).mo7089y(exc);
        }

        /* access modifiers changed from: private */
        /* renamed from: s */
        public /* synthetic */ void m6132s(Exception exc) {
            ((C0860a) w67.m29360j(this.f4694b)).mo7083c(exc);
        }

        /* access modifiers changed from: private */
        /* renamed from: t */
        public /* synthetic */ void m6133t(String str, long j, long j2) {
            ((C0860a) w67.m29360j(this.f4694b)).mo7085j(str, j, j2);
        }

        /* access modifiers changed from: private */
        /* renamed from: u */
        public /* synthetic */ void m6134u(String str) {
            ((C0860a) w67.m29360j(this.f4694b)).mo7084i(str);
        }

        /* access modifiers changed from: private */
        /* renamed from: v */
        public /* synthetic */ void m6135v(n31 n31) {
            n31.mo23488c();
            ((C0860a) w67.m29360j(this.f4694b)).mo7088s(n31);
        }

        /* access modifiers changed from: private */
        /* renamed from: w */
        public /* synthetic */ void m6136w(n31 n31) {
            ((C0860a) w67.m29360j(this.f4694b)).mo7081B(n31);
        }

        /* access modifiers changed from: private */
        /* renamed from: x */
        public /* synthetic */ void m6137x(C0792h hVar, p31 p31) {
            ((C0860a) w67.m29360j(this.f4694b)).mo7090z(hVar);
            ((C0860a) w67.m29360j(this.f4694b)).mo7086l(hVar, p31);
        }

        /* access modifiers changed from: private */
        /* renamed from: y */
        public /* synthetic */ void m6138y(long j) {
            ((C0860a) w67.m29360j(this.f4694b)).mo7087n(j);
        }

        /* access modifiers changed from: private */
        /* renamed from: z */
        public /* synthetic */ void m6139z(boolean z) {
            ((C0860a) w67.m29360j(this.f4694b)).mo7082b(z);
        }

        /* renamed from: B */
        public void mo7091B(long j) {
            Handler handler = this.f4693a;
            if (handler != null) {
                handler.post(new C3757zs(this, j));
            }
        }

        /* renamed from: C */
        public void mo7092C(boolean z) {
            Handler handler = this.f4693a;
            if (handler != null) {
                handler.post(new C2250et(this, z));
            }
        }

        /* renamed from: D */
        public void mo7093D(int i, long j, long j2) {
            Handler handler = this.f4693a;
            if (handler != null) {
                handler.post(new C2327ft(this, i, j, j2));
            }
        }

        /* renamed from: k */
        public void mo7094k(Exception exc) {
            Handler handler = this.f4693a;
            if (handler != null) {
                handler.post(new C3560ws(this, exc));
            }
        }

        /* renamed from: l */
        public void mo7095l(Exception exc) {
            Handler handler = this.f4693a;
            if (handler != null) {
                handler.post(new C1648bt(this, exc));
            }
        }

        /* renamed from: m */
        public void mo7096m(String str, long j, long j2) {
            Handler handler = this.f4693a;
            if (handler != null) {
                handler.post(new C1579at(this, str, j, j2));
            }
        }

        /* renamed from: n */
        public void mo7097n(String str) {
            Handler handler = this.f4693a;
            if (handler != null) {
                handler.post(new C2119ct(this, str));
            }
        }

        /* renamed from: o */
        public void mo7098o(n31 n31) {
            n31.mo23488c();
            Handler handler = this.f4693a;
            if (handler != null) {
                handler.post(new C3639xs(this, n31));
            }
        }

        /* renamed from: p */
        public void mo7099p(n31 n31) {
            Handler handler = this.f4693a;
            if (handler != null) {
                handler.post(new C3690ys(this, n31));
            }
        }

        /* renamed from: q */
        public void mo7100q(C0792h hVar, p31 p31) {
            Handler handler = this.f4693a;
            if (handler != null) {
                handler.post(new C2196dt(this, hVar, p31));
            }
        }
    }

    /* renamed from: A */
    void mo7080A(int i, long j, long j2);

    /* renamed from: B */
    void mo7081B(n31 n31);

    /* renamed from: b */
    void mo7082b(boolean z);

    /* renamed from: c */
    void mo7083c(Exception exc);

    /* renamed from: i */
    void mo7084i(String str);

    /* renamed from: j */
    void mo7085j(String str, long j, long j2);

    /* renamed from: l */
    void mo7086l(C0792h hVar, p31 p31);

    /* renamed from: n */
    void mo7087n(long j);

    /* renamed from: s */
    void mo7088s(n31 n31);

    /* renamed from: y */
    void mo7089y(Exception exc);

    @Deprecated
    /* renamed from: z */
    void mo7090z(C0792h hVar);
}
