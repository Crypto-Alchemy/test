package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.work.impl.background.systemalarm.d */
/* compiled from: SystemAlarmDispatcher */
public class C1542d implements tu1 {

    /* renamed from: B */
    public static final String f7587B = qk3.m25728f("SystemAlarmDispatcher");

    /* renamed from: A */
    public C1545c f7588A;

    /* renamed from: a */
    public final Context f7589a;

    /* renamed from: d */
    public final bm6 f7590d;

    /* renamed from: e */
    public final gn7 f7591e;

    /* renamed from: g */
    public final tv4 f7592g;

    /* renamed from: k */
    public final nm7 f7593k;

    /* renamed from: r */
    public final C1539a f7594r;

    /* renamed from: s */
    public final Handler f7595s;

    /* renamed from: x */
    public final List<Intent> f7596x;

    /* renamed from: y */
    public Intent f7597y;

    /* renamed from: androidx.work.impl.background.systemalarm.d$a */
    /* compiled from: SystemAlarmDispatcher */
    public class C1543a implements Runnable {
        public C1543a() {
        }

        public void run() {
            C1546d dVar;
            C1542d dVar2;
            synchronized (C1542d.this.f7596x) {
                C1542d dVar3 = C1542d.this;
                dVar3.f7597y = dVar3.f7596x.get(0);
            }
            Intent intent = C1542d.this.f7597y;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = C1542d.this.f7597y.getIntExtra("KEY_START_ID", 0);
                qk3 c = qk3.m25726c();
                String str = C1542d.f7587B;
                c.mo25135a(str, String.format("Processing command %s, %s", new Object[]{C1542d.this.f7597y, Integer.valueOf(intExtra)}), new Throwable[0]);
                PowerManager.WakeLock b = fg7.m16992b(C1542d.this.f7589a, String.format("%s (%s)", new Object[]{action, Integer.valueOf(intExtra)}));
                try {
                    qk3.m25726c().mo25135a(str, String.format("Acquiring operation wake lock (%s) %s", new Object[]{action, b}), new Throwable[0]);
                    b.acquire();
                    C1542d dVar4 = C1542d.this;
                    dVar4.f7594r.mo10979o(dVar4.f7597y, intExtra, dVar4);
                    qk3.m25726c().mo25135a(str, String.format("Releasing operation wake lock (%s) %s", new Object[]{action, b}), new Throwable[0]);
                    b.release();
                    dVar2 = C1542d.this;
                    dVar = new C1546d(dVar2);
                } catch (Throwable th) {
                    qk3.m25726c().mo25135a(C1542d.f7587B, String.format("Releasing operation wake lock (%s) %s", new Object[]{action, b}), new Throwable[0]);
                    b.release();
                    C1542d dVar5 = C1542d.this;
                    dVar5.mo10996k(new C1546d(dVar5));
                    throw th;
                }
                dVar2.mo10996k(dVar);
            }
        }
    }

    /* renamed from: androidx.work.impl.background.systemalarm.d$b */
    /* compiled from: SystemAlarmDispatcher */
    public static class C1544b implements Runnable {

        /* renamed from: a */
        public final C1542d f7599a;

        /* renamed from: d */
        public final Intent f7600d;

        /* renamed from: e */
        public final int f7601e;

        public C1544b(C1542d dVar, Intent intent, int i) {
            this.f7599a = dVar;
            this.f7600d = intent;
            this.f7601e = i;
        }

        public void run() {
            this.f7599a.mo10987a(this.f7600d, this.f7601e);
        }
    }

    /* renamed from: androidx.work.impl.background.systemalarm.d$c */
    /* compiled from: SystemAlarmDispatcher */
    public interface C1545c {
        /* renamed from: b */
        void mo10969b();
    }

    /* renamed from: androidx.work.impl.background.systemalarm.d$d */
    /* compiled from: SystemAlarmDispatcher */
    public static class C1546d implements Runnable {

        /* renamed from: a */
        public final C1542d f7602a;

        public C1546d(C1542d dVar) {
            this.f7602a = dVar;
        }

        public void run() {
            this.f7602a.mo10989c();
        }
    }

    public C1542d(Context context) {
        this(context, (tv4) null, (nm7) null);
    }

    /* renamed from: a */
    public boolean mo10987a(Intent intent, int i) {
        qk3 c = qk3.m25726c();
        String str = f7587B;
        boolean z = false;
        c.mo25135a(str, String.format("Adding command %s (%s)", new Object[]{intent, Integer.valueOf(i)}), new Throwable[0]);
        mo10988b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            qk3.m25726c().mo25139h(str, "Unknown command. Ignoring", new Throwable[0]);
            return false;
        } else if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && mo10994i("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        } else {
            intent.putExtra("KEY_START_ID", i);
            synchronized (this.f7596x) {
                if (!this.f7596x.isEmpty()) {
                    z = true;
                }
                this.f7596x.add(intent);
                if (!z) {
                    mo10997l();
                }
            }
            return true;
        }
    }

    /* renamed from: b */
    public final void mo10988b() {
        if (this.f7595s.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    /* renamed from: c */
    public void mo10989c() {
        qk3 c = qk3.m25726c();
        String str = f7587B;
        c.mo25135a(str, "Checking if commands are complete.", new Throwable[0]);
        mo10988b();
        synchronized (this.f7596x) {
            if (this.f7597y != null) {
                qk3.m25726c().mo25135a(str, String.format("Removing command %s", new Object[]{this.f7597y}), new Throwable[0]);
                if (this.f7596x.remove(0).equals(this.f7597y)) {
                    this.f7597y = null;
                } else {
                    throw new IllegalStateException("Dequeue-d command is not the first.");
                }
            }
            nw5 c2 = this.f7590d.mo11701c();
            if (!this.f7594r.mo10978n() && this.f7596x.isEmpty() && !c2.mo23809a()) {
                qk3.m25726c().mo25135a(str, "No more commands & intents.", new Throwable[0]);
                C1545c cVar = this.f7588A;
                if (cVar != null) {
                    cVar.mo10969b();
                }
            } else if (!this.f7596x.isEmpty()) {
                mo10997l();
            }
        }
    }

    /* renamed from: d */
    public tv4 mo10990d() {
        return this.f7592g;
    }

    /* renamed from: e */
    public void mo10971e(String str, boolean z) {
        mo10996k(new C1544b(this, C1539a.m10556c(this.f7589a, str, z), 0));
    }

    /* renamed from: f */
    public bm6 mo10991f() {
        return this.f7590d;
    }

    /* renamed from: g */
    public nm7 mo10992g() {
        return this.f7593k;
    }

    /* renamed from: h */
    public gn7 mo10993h() {
        return this.f7591e;
    }

    /* renamed from: i */
    public final boolean mo10994i(String str) {
        mo10988b();
        synchronized (this.f7596x) {
            for (Intent action : this.f7596x) {
                if (str.equals(action.getAction())) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: j */
    public void mo10995j() {
        qk3.m25726c().mo25135a(f7587B, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.f7592g.mo26580i(this);
        this.f7591e.mo20710a();
        this.f7588A = null;
    }

    /* renamed from: k */
    public void mo10996k(Runnable runnable) {
        this.f7595s.post(runnable);
    }

    /* renamed from: l */
    public final void mo10997l() {
        mo10988b();
        PowerManager.WakeLock b = fg7.m16992b(this.f7589a, "ProcessCommand");
        try {
            b.acquire();
            this.f7593k.mo23744r().mo11700b(new C1543a());
        } finally {
            b.release();
        }
    }

    /* renamed from: m */
    public void mo10998m(C1545c cVar) {
        if (this.f7588A != null) {
            qk3.m25726c().mo25136b(f7587B, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            this.f7588A = cVar;
        }
    }

    public C1542d(Context context, tv4 tv4, nm7 nm7) {
        Context applicationContext = context.getApplicationContext();
        this.f7589a = applicationContext;
        this.f7594r = new C1539a(applicationContext);
        this.f7591e = new gn7();
        nm7 = nm7 == null ? nm7.m23322m(context) : nm7;
        this.f7593k = nm7;
        tv4 = tv4 == null ? nm7.mo23741o() : tv4;
        this.f7592g = tv4;
        this.f7590d = nm7.mo23744r();
        tv4.mo26576c(this);
        this.f7596x = new ArrayList();
        this.f7597y = null;
        this.f7595s = new Handler(Looper.getMainLooper());
    }
}
