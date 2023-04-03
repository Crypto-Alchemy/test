package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: fl2 */
/* compiled from: HardwareKeyWatcher */
public class fl2 {

    /* renamed from: a */
    public Context f11910a;

    /* renamed from: b */
    public IntentFilter f11911b;

    /* renamed from: c */
    public C2304b f11912c;

    /* renamed from: d */
    public C2303a f11913d;

    /* renamed from: fl2$a */
    /* compiled from: HardwareKeyWatcher */
    public class C2303a extends BroadcastReceiver {

        /* renamed from: a */
        public final String f11914a = "reason";

        /* renamed from: b */
        public final String f11915b = "homekey";

        /* renamed from: c */
        public final String f11916c = "recentapps";

        /* renamed from: d */
        public final String f11917d = "fs_gesture";

        public C2303a() {
        }

        public void onReceive(Context context, Intent intent) {
            String stringExtra;
            String action = intent.getAction();
            if ("android.intent.action.CLOSE_SYSTEM_DIALOGS".equals(action) && (stringExtra = intent.getStringExtra("reason")) != null) {
                fl2 fl2 = fl2.this;
                fl2.mo19961f("action:" + action + ", reason:" + stringExtra);
                if (fl2.this.f11912c != null) {
                    char c = 65535;
                    switch (stringExtra.hashCode()) {
                        case 350448461:
                            if (stringExtra.equals("recentapps")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 1092716832:
                            if (stringExtra.equals("homekey")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 2014770135:
                            if (stringExtra.equals("fs_gesture")) {
                                c = 2;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            fl2.this.mo19960e("onRecentAppsPressed (recentapps)");
                            fl2.this.f11912c.mo19967b();
                            return;
                        case 1:
                            fl2.this.mo19960e("onHomePressed (homekey)");
                            fl2.this.f11912c.mo19966a();
                            return;
                        case 2:
                            fl2.this.mo19960e("onRecentAppsPressed (fs_gesture)");
                            fl2.this.f11912c.mo19967b();
                            return;
                        default:
                            return;
                    }
                }
            }
        }
    }

    /* renamed from: fl2$b */
    /* compiled from: HardwareKeyWatcher */
    public interface C2304b {
        /* renamed from: a */
        void mo19966a();

        /* renamed from: b */
        void mo19967b();
    }

    public fl2(Context context) {
        this.f11910a = context;
        IntentFilter intentFilter = new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS");
        this.f11911b = intentFilter;
        intentFilter.setPriority(1000);
    }

    /* renamed from: d */
    public Context mo19959d() {
        return this.f11910a;
    }

    /* renamed from: e */
    public final void mo19960e(String str) {
    }

    /* renamed from: f */
    public final void mo19961f(String str) {
    }

    /* renamed from: g */
    public void mo19962g(C2304b bVar) {
        this.f11912c = bVar;
        this.f11913d = new C2303a();
    }

    /* renamed from: h */
    public void mo19963h() {
        if (this.f11913d != null) {
            mo19960e("startWatch on " + this.f11910a);
            this.f11910a.registerReceiver(this.f11913d, this.f11911b);
        }
    }

    /* renamed from: i */
    public void mo19964i() {
        if (this.f11913d != null) {
            mo19960e("stopWatch on " + this.f11910a);
            this.f11910a.unregisterReceiver(this.f11913d);
        }
    }
}
