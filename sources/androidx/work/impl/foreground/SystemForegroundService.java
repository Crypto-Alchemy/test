package androidx.work.impl.foreground;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.LifecycleService;
import androidx.work.impl.foreground.C1550a;

public class SystemForegroundService extends LifecycleService implements C1550a.C1552b {

    /* renamed from: r */
    public static final String f7607r = qk3.m25728f("SystemFgService");

    /* renamed from: s */
    public static SystemForegroundService f7608s = null;

    /* renamed from: d */
    public Handler f7609d;

    /* renamed from: e */
    public boolean f7610e;

    /* renamed from: g */
    public C1550a f7611g;

    /* renamed from: k */
    public NotificationManager f7612k;

    /* renamed from: androidx.work.impl.foreground.SystemForegroundService$a */
    public class C1547a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ int f7613a;

        /* renamed from: d */
        public final /* synthetic */ Notification f7614d;

        /* renamed from: e */
        public final /* synthetic */ int f7615e;

        public C1547a(int i, Notification notification, int i2) {
            this.f7613a = i;
            this.f7614d = notification;
            this.f7615e = i2;
        }

        public void run() {
            if (Build.VERSION.SDK_INT >= 29) {
                SystemForegroundService.this.startForeground(this.f7613a, this.f7614d, this.f7615e);
            } else {
                SystemForegroundService.this.startForeground(this.f7613a, this.f7614d);
            }
        }
    }

    /* renamed from: androidx.work.impl.foreground.SystemForegroundService$b */
    public class C1548b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ int f7617a;

        /* renamed from: d */
        public final /* synthetic */ Notification f7618d;

        public C1548b(int i, Notification notification) {
            this.f7617a = i;
            this.f7618d = notification;
        }

        public void run() {
            SystemForegroundService.this.f7612k.notify(this.f7617a, this.f7618d);
        }
    }

    /* renamed from: androidx.work.impl.foreground.SystemForegroundService$c */
    public class C1549c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ int f7620a;

        public C1549c(int i) {
            this.f7620a = i;
        }

        public void run() {
            SystemForegroundService.this.f7612k.cancel(this.f7620a);
        }
    }

    /* renamed from: a */
    public void mo11007a(int i, Notification notification) {
        this.f7609d.post(new C1548b(i, notification));
    }

    /* renamed from: c */
    public void mo11008c(int i, int i2, Notification notification) {
        this.f7609d.post(new C1547a(i, notification, i2));
    }

    /* renamed from: d */
    public void mo11009d(int i) {
        this.f7609d.post(new C1549c(i));
    }

    /* renamed from: e */
    public final void mo11010e() {
        this.f7609d = new Handler(Looper.getMainLooper());
        this.f7612k = (NotificationManager) getApplicationContext().getSystemService("notification");
        C1550a aVar = new C1550a(getApplicationContext());
        this.f7611g = aVar;
        aVar.mo11021m(this);
    }

    public void onCreate() {
        super.onCreate();
        f7608s = this;
        mo11010e();
    }

    public void onDestroy() {
        super.onDestroy();
        this.f7611g.mo11019k();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.f7610e) {
            qk3.m25726c().mo25137d(f7607r, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            this.f7611g.mo11019k();
            mo11010e();
            this.f7610e = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f7611g.mo11020l(intent);
        return 3;
    }

    public void stop() {
        this.f7610e = true;
        qk3.m25726c().mo25135a(f7607r, "All commands completed.", new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
        f7608s = null;
        stopSelf();
    }
}
