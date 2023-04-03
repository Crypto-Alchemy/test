package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class LifecycleService extends Service implements ug3 {

    /* renamed from: a */
    public final C0727k f3908a = new C0727k(this);

    public Lifecycle getLifecycle() {
        return this.f3908a.mo6414a();
    }

    public IBinder onBind(Intent intent) {
        this.f3908a.mo6415b();
        return null;
    }

    public void onCreate() {
        this.f3908a.mo6416c();
        super.onCreate();
    }

    public void onDestroy() {
        this.f3908a.mo6417d();
        super.onDestroy();
    }

    public void onStart(Intent intent, int i) {
        this.f3908a.mo6418e();
        super.onStart(intent, i);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        return super.onStartCommand(intent, i, i2);
    }
}
