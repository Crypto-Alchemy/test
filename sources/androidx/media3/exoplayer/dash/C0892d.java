package androidx.media3.exoplayer.dash;

import android.os.Handler;
import android.os.Message;
import androidx.media3.common.C0792h;
import androidx.media3.common.Metadata;
import androidx.media3.common.ParserException;
import androidx.media3.exoplayer.source.C0997p;
import androidx.media3.extractor.metadata.emsg.EventMessage;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import p000.zs6;

/* renamed from: androidx.media3.exoplayer.dash.d */
/* compiled from: PlayerEmsgHandler */
public final class C0892d implements Handler.Callback {

    /* renamed from: A */
    public boolean f4911A;

    /* renamed from: a */
    public final C2891nf f4912a;

    /* renamed from: d */
    public final C0894b f4913d;

    /* renamed from: e */
    public final zt1 f4914e = new zt1();

    /* renamed from: g */
    public final Handler f4915g = w67.m29386w(this);

    /* renamed from: k */
    public final TreeMap<Long, Long> f4916k = new TreeMap<>();

    /* renamed from: r */
    public d11 f4917r;

    /* renamed from: s */
    public long f4918s;

    /* renamed from: x */
    public boolean f4919x;

    /* renamed from: y */
    public boolean f4920y;

    /* renamed from: androidx.media3.exoplayer.dash.d$a */
    /* compiled from: PlayerEmsgHandler */
    public static final class C0893a {

        /* renamed from: a */
        public final long f4921a;

        /* renamed from: b */
        public final long f4922b;

        public C0893a(long j, long j2) {
            this.f4921a = j;
            this.f4922b = j2;
        }
    }

    /* renamed from: androidx.media3.exoplayer.dash.d$b */
    /* compiled from: PlayerEmsgHandler */
    public interface C0894b {
        /* renamed from: a */
        void mo7215a(long j);

        /* renamed from: b */
        void mo7216b();
    }

    /* renamed from: androidx.media3.exoplayer.dash.d$c */
    /* compiled from: PlayerEmsgHandler */
    public final class C0895c implements zs6 {

        /* renamed from: a */
        public final C0997p f4923a;

        /* renamed from: b */
        public final c82 f4924b = new c82();

        /* renamed from: c */
        public final ev3 f4925c = new ev3();

        /* renamed from: d */
        public long f4926d = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;

        public C0895c(C2891nf nfVar) {
            this.f4923a = C0997p.m7427l(nfVar);
        }

        /* renamed from: a */
        public /* synthetic */ void mo7300a(gm4 gm4, int i) {
            ys6.m30779b(this, gm4, i);
        }

        /* renamed from: b */
        public void mo7301b(long j, int i, int i2, int i3, zs6.C3758a aVar) {
            this.f4923a.mo7301b(j, i, i2, i3, aVar);
            mo7311l();
        }

        /* renamed from: c */
        public void mo7302c(gm4 gm4, int i, int i2) {
            this.f4923a.mo7300a(gm4, i);
        }

        /* renamed from: d */
        public void mo7303d(C0792h hVar) {
            this.f4923a.mo7303d(hVar);
        }

        /* renamed from: e */
        public /* synthetic */ int mo7304e(u11 u11, int i, boolean z) {
            return ys6.m30778a(this, u11, i, z);
        }

        /* renamed from: f */
        public int mo7305f(u11 u11, int i, boolean z, int i2) throws IOException {
            return this.f4923a.mo7304e(u11, i, z);
        }

        /* renamed from: g */
        public final ev3 mo7306g() {
            this.f4925c.mo6968h();
            if (this.f4923a.mo7768R(this.f4924b, this.f4925c, 0, false) != -4) {
                return null;
            }
            this.f4925c.mo6971x();
            return this.f4925c;
        }

        /* renamed from: h */
        public boolean mo7307h(long j) {
            return C0892d.this.mo7292j(j);
        }

        /* renamed from: i */
        public void mo7308i(pe0 pe0) {
            long j = this.f4926d;
            if (j == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED || pe0.f16399h > j) {
                this.f4926d = pe0.f16399h;
            }
            C0892d.this.mo7295m(pe0);
        }

        /* renamed from: j */
        public boolean mo7309j(pe0 pe0) {
            boolean z;
            long j = this.f4926d;
            if (j == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED || j >= pe0.f16398g) {
                z = false;
            } else {
                z = true;
            }
            return C0892d.this.mo7296n(z);
        }

        /* renamed from: k */
        public final void mo7310k(long j, long j2) {
            C0892d.this.f4915g.sendMessage(C0892d.this.f4915g.obtainMessage(1, new C0893a(j, j2)));
        }

        /* renamed from: l */
        public final void mo7311l() {
            while (this.f4923a.mo7762K(false)) {
                ev3 g = mo7306g();
                if (g != null) {
                    long j = g.f4594k;
                    Metadata a = C0892d.this.f4914e.mo18362a(g);
                    if (a != null) {
                        EventMessage eventMessage = (EventMessage) a.mo6544c(0);
                        if (C0892d.m6444h(eventMessage.f5561a, eventMessage.f5562d)) {
                            mo7312m(j, eventMessage);
                        }
                    }
                }
            }
            this.f4923a.mo7790s();
        }

        /* renamed from: m */
        public final void mo7312m(long j, EventMessage eventMessage) {
            long c = C0892d.m6443f(eventMessage);
            if (c != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
                mo7310k(j, c);
            }
        }

        /* renamed from: n */
        public void mo7313n() {
            this.f4923a.mo7769S();
        }
    }

    public C0892d(d11 d11, C0894b bVar, C2891nf nfVar) {
        this.f4917r = d11;
        this.f4913d = bVar;
        this.f4912a = nfVar;
    }

    /* renamed from: f */
    public static long m6443f(EventMessage eventMessage) {
        try {
            return w67.m29303E0(w67.m29296B(eventMessage.f5565k));
        } catch (ParserException unused) {
            return CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        }
    }

    /* renamed from: h */
    public static boolean m6444h(String str, String str2) {
        if (!"urn:mpeg:dash:event:2012".equals(str) || (!"1".equals(str2) && !"2".equals(str2) && !"3".equals(str2))) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final Map.Entry<Long, Long> mo7288e(long j) {
        return this.f4916k.ceilingEntry(Long.valueOf(j));
    }

    /* renamed from: g */
    public final void mo7289g(long j, long j2) {
        Long l = this.f4916k.get(Long.valueOf(j2));
        if (l == null) {
            this.f4916k.put(Long.valueOf(j2), Long.valueOf(j));
        } else if (l.longValue() > j) {
            this.f4916k.put(Long.valueOf(j2), Long.valueOf(j));
        }
    }

    public boolean handleMessage(Message message) {
        if (this.f4911A) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        C0893a aVar = (C0893a) message.obj;
        mo7289g(aVar.f4921a, aVar.f4922b);
        return true;
    }

    /* renamed from: i */
    public final void mo7291i() {
        if (this.f4919x) {
            this.f4920y = true;
            this.f4919x = false;
            this.f4913d.mo7216b();
        }
    }

    /* renamed from: j */
    public boolean mo7292j(long j) {
        d11 d11 = this.f4917r;
        boolean z = false;
        if (!d11.f10422d) {
            return false;
        }
        if (this.f4920y) {
            return true;
        }
        Map.Entry<Long, Long> e = mo7288e(d11.f10426h);
        if (e != null && e.getValue().longValue() < j) {
            this.f4918s = e.getKey().longValue();
            mo7294l();
            z = true;
        }
        if (z) {
            mo7291i();
        }
        return z;
    }

    /* renamed from: k */
    public C0895c mo7293k() {
        return new C0895c(this.f4912a);
    }

    /* renamed from: l */
    public final void mo7294l() {
        this.f4913d.mo7215a(this.f4918s);
    }

    /* renamed from: m */
    public void mo7295m(pe0 pe0) {
        this.f4919x = true;
    }

    /* renamed from: n */
    public boolean mo7296n(boolean z) {
        if (!this.f4917r.f10422d) {
            return false;
        }
        if (this.f4920y) {
            return true;
        }
        if (!z) {
            return false;
        }
        mo7291i();
        return true;
    }

    /* renamed from: o */
    public void mo7297o() {
        this.f4911A = true;
        this.f4915g.removeCallbacksAndMessages((Object) null);
    }

    /* renamed from: p */
    public final void mo7298p() {
        Iterator<Map.Entry<Long, Long>> it = this.f4916k.entrySet().iterator();
        while (it.hasNext()) {
            if (((Long) it.next().getKey()).longValue() < this.f4917r.f10426h) {
                it.remove();
            }
        }
    }

    /* renamed from: q */
    public void mo7299q(d11 d11) {
        this.f4920y = false;
        this.f4918s = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        this.f4917r = d11;
        mo7298p();
    }
}
