package p000;

import android.os.Handler;
import android.os.SystemClock;
import androidx.media3.common.C0792h;
import androidx.media3.common.C0844x;

/* renamed from: z97 */
/* compiled from: VideoRendererEventListener */
public interface z97 {

    /* renamed from: z97$a */
    /* compiled from: VideoRendererEventListener */
    public static final class C3721a {

        /* renamed from: a */
        public final Handler f20516a;

        /* renamed from: b */
        public final z97 f20517b;

        public C3721a(Handler handler, z97 z97) {
            Handler handler2;
            if (z97 != null) {
                handler2 = (Handler) C2725kr.m20985e(handler);
            } else {
                handler2 = null;
            }
            this.f20516a = handler2;
            this.f20517b = z97;
        }

        /* access modifiers changed from: private */
        /* renamed from: q */
        public /* synthetic */ void m31109q(String str, long j, long j2) {
            ((z97) w67.m29360j(this.f20517b)).mo24175f(str, j, j2);
        }

        /* access modifiers changed from: private */
        /* renamed from: r */
        public /* synthetic */ void m31110r(String str) {
            ((z97) w67.m29360j(this.f20517b)).mo24174e(str);
        }

        /* access modifiers changed from: private */
        /* renamed from: s */
        public /* synthetic */ void m31111s(n31 n31) {
            n31.mo23488c();
            ((z97) w67.m29360j(this.f20517b)).mo24183q(n31);
        }

        /* access modifiers changed from: private */
        /* renamed from: t */
        public /* synthetic */ void m31112t(int i, long j) {
            ((z97) w67.m29360j(this.f20517b)).mo24189u(i, j);
        }

        /* access modifiers changed from: private */
        /* renamed from: u */
        public /* synthetic */ void m31113u(n31 n31) {
            ((z97) w67.m29360j(this.f20517b)).mo24184r(n31);
        }

        /* access modifiers changed from: private */
        /* renamed from: v */
        public /* synthetic */ void m31114v(C0792h hVar, p31 p31) {
            ((z97) w67.m29360j(this.f20517b)).mo24169D(hVar);
            ((z97) w67.m29360j(this.f20517b)).mo24173d(hVar, p31);
        }

        /* access modifiers changed from: private */
        /* renamed from: w */
        public /* synthetic */ void m31115w(Object obj, long j) {
            ((z97) w67.m29360j(this.f20517b)).mo24190v(obj, j);
        }

        /* access modifiers changed from: private */
        /* renamed from: x */
        public /* synthetic */ void m31116x(long j, int i) {
            ((z97) w67.m29360j(this.f20517b)).mo24168C(j, i);
        }

        /* access modifiers changed from: private */
        /* renamed from: y */
        public /* synthetic */ void m31117y(Exception exc) {
            ((z97) w67.m29360j(this.f20517b)).mo24178o(exc);
        }

        /* access modifiers changed from: private */
        /* renamed from: z */
        public /* synthetic */ void m31118z(C0844x xVar) {
            ((z97) w67.m29360j(this.f20517b)).mo24176h(xVar);
        }

        /* renamed from: A */
        public void mo28395A(Object obj) {
            if (this.f20516a != null) {
                this.f20516a.post(new q97(this, obj, SystemClock.elapsedRealtime()));
            }
        }

        /* renamed from: B */
        public void mo28396B(long j, int i) {
            Handler handler = this.f20516a;
            if (handler != null) {
                handler.post(new s97(this, j, i));
            }
        }

        /* renamed from: C */
        public void mo28397C(Exception exc) {
            Handler handler = this.f20516a;
            if (handler != null) {
                handler.post(new r97(this, exc));
            }
        }

        /* renamed from: D */
        public void mo28398D(C0844x xVar) {
            Handler handler = this.f20516a;
            if (handler != null) {
                handler.post(new x97(this, xVar));
            }
        }

        /* renamed from: k */
        public void mo28399k(String str, long j, long j2) {
            Handler handler = this.f20516a;
            if (handler != null) {
                handler.post(new v97(this, str, j, j2));
            }
        }

        /* renamed from: l */
        public void mo28400l(String str) {
            Handler handler = this.f20516a;
            if (handler != null) {
                handler.post(new y97(this, str));
            }
        }

        /* renamed from: m */
        public void mo28401m(n31 n31) {
            n31.mo23488c();
            Handler handler = this.f20516a;
            if (handler != null) {
                handler.post(new u97(this, n31));
            }
        }

        /* renamed from: n */
        public void mo28402n(int i, long j) {
            Handler handler = this.f20516a;
            if (handler != null) {
                handler.post(new p97(this, i, j));
            }
        }

        /* renamed from: o */
        public void mo28403o(n31 n31) {
            Handler handler = this.f20516a;
            if (handler != null) {
                handler.post(new t97(this, n31));
            }
        }

        /* renamed from: p */
        public void mo28404p(C0792h hVar, p31 p31) {
            Handler handler = this.f20516a;
            if (handler != null) {
                handler.post(new w97(this, hVar, p31));
            }
        }
    }

    /* renamed from: C */
    void mo24168C(long j, int i);

    @Deprecated
    /* renamed from: D */
    void mo24169D(C0792h hVar);

    /* renamed from: d */
    void mo24173d(C0792h hVar, p31 p31);

    /* renamed from: e */
    void mo24174e(String str);

    /* renamed from: f */
    void mo24175f(String str, long j, long j2);

    /* renamed from: h */
    void mo24176h(C0844x xVar);

    /* renamed from: o */
    void mo24178o(Exception exc);

    /* renamed from: q */
    void mo24183q(n31 n31);

    /* renamed from: r */
    void mo24184r(n31 n31);

    /* renamed from: u */
    void mo24189u(int i, long j);

    /* renamed from: v */
    void mo24190v(Object obj, long j);
}
