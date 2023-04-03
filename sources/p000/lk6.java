package p000;

import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;
import p000.xk2;

/* renamed from: lk6 */
/* compiled from: SystemHandlerWrapper */
public final class lk6 implements xk2 {

    /* renamed from: b */
    public static final List<C2763b> f14539b = new ArrayList(50);

    /* renamed from: a */
    public final Handler f14540a;

    /* renamed from: lk6$b */
    /* compiled from: SystemHandlerWrapper */
    public static final class C2763b implements xk2.C3610a {

        /* renamed from: a */
        public Message f14541a;

        /* renamed from: b */
        public lk6 f14542b;

        public C2763b() {
        }

        /* renamed from: a */
        public void mo22784a() {
            ((Message) C2725kr.m20985e(this.f14541a)).sendToTarget();
            mo22785b();
        }

        /* renamed from: b */
        public final void mo22785b() {
            this.f14541a = null;
            this.f14542b = null;
            lk6.m21478n(this);
        }

        /* renamed from: c */
        public boolean mo22786c(Handler handler) {
            boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((Message) C2725kr.m20985e(this.f14541a));
            mo22785b();
            return sendMessageAtFrontOfQueue;
        }

        /* renamed from: d */
        public C2763b mo22787d(Message message, lk6 lk6) {
            this.f14541a = message;
            this.f14542b = lk6;
            return this;
        }
    }

    public lk6(Handler handler) {
        this.f14540a = handler;
    }

    /* renamed from: m */
    public static C2763b m21477m() {
        C2763b bVar;
        List<C2763b> list = f14539b;
        synchronized (list) {
            if (list.isEmpty()) {
                bVar = new C2763b();
            } else {
                bVar = list.remove(list.size() - 1);
            }
        }
        return bVar;
    }

    /* renamed from: n */
    public static void m21478n(C2763b bVar) {
        List<C2763b> list = f14539b;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(bVar);
            }
        }
    }

    /* renamed from: a */
    public xk2.C3610a mo22773a(int i) {
        return m21477m().mo22787d(this.f14540a.obtainMessage(i), this);
    }

    /* renamed from: b */
    public boolean mo22774b(int i) {
        return this.f14540a.hasMessages(i);
    }

    /* renamed from: c */
    public xk2.C3610a mo22775c(int i, int i2, int i3, Object obj) {
        return m21477m().mo22787d(this.f14540a.obtainMessage(i, i2, i3, obj), this);
    }

    /* renamed from: d */
    public xk2.C3610a mo22776d(int i, Object obj) {
        return m21477m().mo22787d(this.f14540a.obtainMessage(i, obj), this);
    }

    /* renamed from: e */
    public void mo22777e(Object obj) {
        this.f14540a.removeCallbacksAndMessages(obj);
    }

    /* renamed from: f */
    public xk2.C3610a mo22778f(int i, int i2, int i3) {
        return m21477m().mo22787d(this.f14540a.obtainMessage(i, i2, i3), this);
    }

    /* renamed from: g */
    public boolean mo22779g(xk2.C3610a aVar) {
        return ((C2763b) aVar).mo22786c(this.f14540a);
    }

    /* renamed from: h */
    public boolean mo22780h(Runnable runnable) {
        return this.f14540a.post(runnable);
    }

    /* renamed from: i */
    public boolean mo22781i(int i) {
        return this.f14540a.sendEmptyMessage(i);
    }

    /* renamed from: j */
    public boolean mo22782j(int i, long j) {
        return this.f14540a.sendEmptyMessageAtTime(i, j);
    }

    /* renamed from: k */
    public void mo22783k(int i) {
        this.f14540a.removeMessages(i);
    }
}
