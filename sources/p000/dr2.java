package p000;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.io.Closeable;
import p000.lt0;

/* renamed from: dr2 */
/* compiled from: ImagePerfControllerListener2 */
public class dr2 extends C2856my<vq2> implements Closeable {

    /* renamed from: d */
    public final vx3 f10818d;

    /* renamed from: e */
    public final kr2 f10819e;

    /* renamed from: g */
    public final ir2 f10820g;

    /* renamed from: k */
    public final td6<Boolean> f10821k;

    /* renamed from: r */
    public final td6<Boolean> f10822r;

    /* renamed from: s */
    public Handler f10823s;

    /* renamed from: dr2$a */
    /* compiled from: ImagePerfControllerListener2 */
    public static class C2191a extends Handler {

        /* renamed from: a */
        public final ir2 f10824a;

        public C2191a(Looper looper, ir2 ir2) {
            super(looper);
            this.f10824a = ir2;
        }

        public void handleMessage(Message message) {
            kr2 kr2 = (kr2) au4.m10792g(message.obj);
            int i = message.what;
            if (i == 1) {
                this.f10824a.mo21338b(kr2, message.arg1);
            } else if (i == 2) {
                this.f10824a.mo21337a(kr2, message.arg1);
            }
        }
    }

    public dr2(vx3 vx3, kr2 kr2, ir2 ir2, td6<Boolean> td6, td6<Boolean> td62) {
        this.f10818d = vx3;
        this.f10819e = kr2;
        this.f10820g = ir2;
        this.f10821k = td6;
        this.f10822r = td62;
    }

    public void close() {
        mo18897m();
    }

    /* renamed from: d */
    public void mo18888d(String str, lt0.C2787a aVar) {
        long now = this.f10818d.now();
        kr2 h = mo18892h();
        h.mo22502m(aVar);
        h.mo22497h(str);
        int a = h.mo22490a();
        if (!(a == 3 || a == 5 || a == 6)) {
            h.mo22494e(now);
            mo18899p(h, 4);
        }
        mo18895k(h, now);
    }

    /* renamed from: e */
    public void mo18889e(String str, Throwable th, lt0.C2787a aVar) {
        long now = this.f10818d.now();
        kr2 h = mo18892h();
        h.mo22502m(aVar);
        h.mo22495f(now);
        h.mo22497h(str);
        h.mo22501l(th);
        mo18899p(h, 5);
        mo18895k(h, now);
    }

    /* renamed from: f */
    public void mo18890f(String str, Object obj, lt0.C2787a aVar) {
        long now = this.f10818d.now();
        kr2 h = mo18892h();
        h.mo22492c();
        h.mo22500k(now);
        h.mo22497h(str);
        h.mo22493d(obj);
        h.mo22502m(aVar);
        mo18899p(h, 0);
        mo18896l(h, now);
    }

    /* renamed from: g */
    public final synchronized void mo18891g() {
        if (this.f10823s == null) {
            HandlerThread handlerThread = new HandlerThread("ImagePerfControllerListener2Thread");
            handlerThread.start();
            this.f10823s = new C2191a((Looper) au4.m10792g(handlerThread.getLooper()), this.f10820g);
        }
    }

    /* renamed from: h */
    public final kr2 mo18892h() {
        if (this.f10822r.get().booleanValue()) {
            return new kr2();
        }
        return this.f10819e;
    }

    /* renamed from: i */
    public void mo18886c(String str, vq2 vq2, lt0.C2787a aVar) {
        long now = this.f10818d.now();
        kr2 h = mo18892h();
        h.mo22502m(aVar);
        h.mo22496g(now);
        h.mo22507r(now);
        h.mo22497h(str);
        h.mo22503n(vq2);
        mo18899p(h, 3);
    }

    /* renamed from: j */
    public void mo18885a(String str, vq2 vq2) {
        long now = this.f10818d.now();
        kr2 h = mo18892h();
        h.mo22499j(now);
        h.mo22497h(str);
        h.mo22503n(vq2);
        mo18899p(h, 2);
    }

    /* renamed from: k */
    public final void mo18895k(kr2 kr2, long j) {
        kr2.mo22488A(false);
        kr2.mo22509t(j);
        mo18900q(kr2, 2);
    }

    /* renamed from: l */
    public void mo18896l(kr2 kr2, long j) {
        kr2.mo22488A(true);
        kr2.mo22515z(j);
        mo18900q(kr2, 1);
    }

    /* renamed from: m */
    public void mo18897m() {
        mo18892h().mo22491b();
    }

    /* renamed from: n */
    public final boolean mo18898n() {
        boolean booleanValue = this.f10821k.get().booleanValue();
        if (booleanValue && this.f10823s == null) {
            mo18891g();
        }
        return booleanValue;
    }

    /* renamed from: p */
    public final void mo18899p(kr2 kr2, int i) {
        if (mo18898n()) {
            Message obtainMessage = ((Handler) au4.m10792g(this.f10823s)).obtainMessage();
            obtainMessage.what = 1;
            obtainMessage.arg1 = i;
            obtainMessage.obj = kr2;
            this.f10823s.sendMessage(obtainMessage);
            return;
        }
        this.f10820g.mo21338b(kr2, i);
    }

    /* renamed from: q */
    public final void mo18900q(kr2 kr2, int i) {
        if (mo18898n()) {
            Message obtainMessage = ((Handler) au4.m10792g(this.f10823s)).obtainMessage();
            obtainMessage.what = 2;
            obtainMessage.arg1 = i;
            obtainMessage.obj = kr2;
            this.f10823s.sendMessage(obtainMessage);
            return;
        }
        this.f10820g.mo21337a(kr2, i);
    }
}
