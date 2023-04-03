package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* renamed from: androidx.work.impl.foreground.a */
/* compiled from: SystemForegroundDispatcher */
public class C1550a implements bm7, tu1 {

    /* renamed from: B */
    public static final String f7622B = qk3.m25728f("SystemFgDispatcher");

    /* renamed from: A */
    public C1552b f7623A;

    /* renamed from: a */
    public Context f7624a;

    /* renamed from: d */
    public nm7 f7625d;

    /* renamed from: e */
    public final bm6 f7626e;

    /* renamed from: g */
    public final Object f7627g = new Object();

    /* renamed from: k */
    public String f7628k;

    /* renamed from: r */
    public final Map<String, w72> f7629r;

    /* renamed from: s */
    public final Map<String, an7> f7630s;

    /* renamed from: x */
    public final Set<an7> f7631x;

    /* renamed from: y */
    public final cm7 f7632y;

    /* renamed from: androidx.work.impl.foreground.a$a */
    /* compiled from: SystemForegroundDispatcher */
    public class C1551a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ WorkDatabase f7633a;

        /* renamed from: d */
        public final /* synthetic */ String f7634d;

        public C1551a(WorkDatabase workDatabase, String str) {
            this.f7633a = workDatabase;
            this.f7634d = str;
        }

        public void run() {
            an7 f = this.f7633a.mo10955N().mo11715f(this.f7634d);
            if (f != null && f.mo432b()) {
                synchronized (C1550a.this.f7627g) {
                    C1550a.this.f7630s.put(this.f7634d, f);
                    C1550a.this.f7631x.add(f);
                    C1550a aVar = C1550a.this;
                    aVar.f7632y.mo12128d(aVar.f7631x);
                }
            }
        }
    }

    /* renamed from: androidx.work.impl.foreground.a$b */
    /* compiled from: SystemForegroundDispatcher */
    public interface C1552b {
        /* renamed from: a */
        void mo11007a(int i, Notification notification);

        /* renamed from: c */
        void mo11008c(int i, int i2, Notification notification);

        /* renamed from: d */
        void mo11009d(int i);

        void stop();
    }

    public C1550a(Context context) {
        this.f7624a = context;
        nm7 m = nm7.m23322m(context);
        this.f7625d = m;
        bm6 r = m.mo23744r();
        this.f7626e = r;
        this.f7628k = null;
        this.f7629r = new LinkedHashMap();
        this.f7631x = new HashSet();
        this.f7630s = new HashMap();
        this.f7632y = new cm7(this.f7624a, r, this);
        this.f7625d.mo23741o().mo26576c(this);
    }

    /* renamed from: a */
    public static Intent m10597a(Context context, String str, w72 w72) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", w72.mo27458c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", w72.mo27456a());
        intent.putExtra("KEY_NOTIFICATION", w72.mo27457b());
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* renamed from: c */
    public static Intent m10598c(Context context, String str, w72 w72) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", w72.mo27458c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", w72.mo27456a());
        intent.putExtra("KEY_NOTIFICATION", w72.mo27457b());
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* renamed from: d */
    public static Intent m10599d(Context context) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    /* renamed from: b */
    public void mo10982b(List<String> list) {
        if (!list.isEmpty()) {
            for (String next : list) {
                qk3.m25726c().mo25135a(f7622B, String.format("Constraints unmet for WorkSpec %s", new Object[]{next}), new Throwable[0]);
                this.f7625d.mo23751y(next);
            }
        }
    }

    /* renamed from: e */
    public void mo10971e(String str, boolean z) {
        boolean z2;
        Map.Entry entry;
        synchronized (this.f7627g) {
            an7 remove = this.f7630s.remove(str);
            if (remove != null) {
                z2 = this.f7631x.remove(remove);
            } else {
                z2 = false;
            }
            if (z2) {
                this.f7632y.mo12128d(this.f7631x);
            }
        }
        w72 remove2 = this.f7629r.remove(str);
        if (str.equals(this.f7628k) && this.f7629r.size() > 0) {
            Iterator it = this.f7629r.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                }
                next = it.next();
            }
            this.f7628k = (String) entry.getKey();
            if (this.f7623A != null) {
                w72 w72 = (w72) entry.getValue();
                this.f7623A.mo11008c(w72.mo27458c(), w72.mo27456a(), w72.mo27457b());
                this.f7623A.mo11009d(w72.mo27458c());
            }
        }
        C1552b bVar = this.f7623A;
        if (remove2 != null && bVar != null) {
            qk3.m25726c().mo25135a(f7622B, String.format("Removing Notification (id: %s, workSpecId: %s ,notificationType: %s)", new Object[]{Integer.valueOf(remove2.mo27458c()), str, Integer.valueOf(remove2.mo27456a())}), new Throwable[0]);
            bVar.mo11009d(remove2.mo27458c());
        }
    }

    /* renamed from: f */
    public void mo10985f(List<String> list) {
    }

    /* renamed from: g */
    public final void mo11015g(Intent intent) {
        qk3.m25726c().mo25137d(f7622B, String.format("Stopping foreground work for %s", new Object[]{intent}), new Throwable[0]);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra != null && !TextUtils.isEmpty(stringExtra)) {
            this.f7625d.mo23736h(UUID.fromString(stringExtra));
        }
    }

    /* renamed from: h */
    public final void mo11016h(Intent intent) {
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        qk3.m25726c().mo25135a(f7622B, String.format("Notifying with (id: %s, workSpecId: %s, notificationType: %s)", new Object[]{Integer.valueOf(intExtra), stringExtra, Integer.valueOf(intExtra2)}), new Throwable[0]);
        if (notification != null && this.f7623A != null) {
            this.f7629r.put(stringExtra, new w72(intExtra, notification, intExtra2));
            if (TextUtils.isEmpty(this.f7628k)) {
                this.f7628k = stringExtra;
                this.f7623A.mo11008c(intExtra, intExtra2, notification);
                return;
            }
            this.f7623A.mo11007a(intExtra, notification);
            if (intExtra2 != 0 && Build.VERSION.SDK_INT >= 29) {
                for (Map.Entry<String, w72> value : this.f7629r.entrySet()) {
                    i |= ((w72) value.getValue()).mo27456a();
                }
                w72 w72 = this.f7629r.get(this.f7628k);
                if (w72 != null) {
                    this.f7623A.mo11008c(w72.mo27458c(), i, w72.mo27457b());
                }
            }
        }
    }

    /* renamed from: i */
    public final void mo11017i(Intent intent) {
        qk3.m25726c().mo25137d(f7622B, String.format("Started foreground service %s", new Object[]{intent}), new Throwable[0]);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        this.f7626e.mo11700b(new C1551a(this.f7625d.mo23743q(), stringExtra));
    }

    /* renamed from: j */
    public void mo11018j(Intent intent) {
        qk3.m25726c().mo25137d(f7622B, "Stopping foreground service", new Throwable[0]);
        C1552b bVar = this.f7623A;
        if (bVar != null) {
            bVar.stop();
        }
    }

    /* renamed from: k */
    public void mo11019k() {
        this.f7623A = null;
        synchronized (this.f7627g) {
            this.f7632y.mo12129e();
        }
        this.f7625d.mo23741o().mo26580i(this);
    }

    /* renamed from: l */
    public void mo11020l(Intent intent) {
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            mo11017i(intent);
            mo11016h(intent);
        } else if ("ACTION_NOTIFY".equals(action)) {
            mo11016h(intent);
        } else if ("ACTION_CANCEL_WORK".equals(action)) {
            mo11015g(intent);
        } else if ("ACTION_STOP_FOREGROUND".equals(action)) {
            mo11018j(intent);
        }
    }

    /* renamed from: m */
    public void mo11021m(C1552b bVar) {
        if (this.f7623A != null) {
            qk3.m25726c().mo25136b(f7622B, "A callback already exists.", new Throwable[0]);
        } else {
            this.f7623A = bVar;
        }
    }
}
