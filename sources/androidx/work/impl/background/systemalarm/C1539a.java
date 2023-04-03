package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.C1542d;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.work.impl.background.systemalarm.a */
/* compiled from: CommandHandler */
public class C1539a implements tu1 {

    /* renamed from: g */
    public static final String f7568g = qk3.m25728f("CommandHandler");

    /* renamed from: a */
    public final Context f7569a;

    /* renamed from: d */
    public final Map<String, tu1> f7570d = new HashMap();

    /* renamed from: e */
    public final Object f7571e = new Object();

    public C1539a(Context context) {
        this.f7569a = context;
    }

    /* renamed from: a */
    public static Intent m10554a(Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    /* renamed from: b */
    public static Intent m10555b(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* renamed from: c */
    public static Intent m10556c(Context context, String str, boolean z) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        return intent;
    }

    /* renamed from: d */
    public static Intent m10557d(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* renamed from: f */
    public static Intent m10558f(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* renamed from: m */
    public static boolean m10559m(Bundle bundle, String... strArr) {
        if (bundle == null || bundle.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (bundle.get(str) == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public void mo10971e(String str, boolean z) {
        synchronized (this.f7571e) {
            tu1 remove = this.f7570d.remove(str);
            if (remove != null) {
                remove.mo10971e(str, z);
            }
        }
    }

    /* renamed from: g */
    public final void mo10972g(Intent intent, int i, C1542d dVar) {
        qk3.m25726c().mo25135a(f7568g, String.format("Handling constraints changed %s", new Object[]{intent}), new Throwable[0]);
        new C1540b(this.f7569a, i, dVar).mo10980a();
    }

    /* renamed from: h */
    public final void mo10973h(Intent intent, int i, C1542d dVar) {
        Bundle extras = intent.getExtras();
        synchronized (this.f7571e) {
            String string = extras.getString("KEY_WORKSPEC_ID");
            qk3 c = qk3.m25726c();
            String str = f7568g;
            c.mo25135a(str, String.format("Handing delay met for %s", new Object[]{string}), new Throwable[0]);
            if (!this.f7570d.containsKey(string)) {
                C1541c cVar = new C1541c(this.f7569a, i, string, dVar);
                this.f7570d.put(string, cVar);
                cVar.mo10984d();
            } else {
                qk3.m25726c().mo25135a(str, String.format("WorkSpec %s is already being handled for ACTION_DELAY_MET", new Object[]{string}), new Throwable[0]);
            }
        }
    }

    /* renamed from: i */
    public final void mo10974i(Intent intent, int i) {
        Bundle extras = intent.getExtras();
        String string = extras.getString("KEY_WORKSPEC_ID");
        boolean z = extras.getBoolean("KEY_NEEDS_RESCHEDULE");
        qk3.m25726c().mo25135a(f7568g, String.format("Handling onExecutionCompleted %s, %s", new Object[]{intent, Integer.valueOf(i)}), new Throwable[0]);
        mo10971e(string, z);
    }

    /* renamed from: j */
    public final void mo10975j(Intent intent, int i, C1542d dVar) {
        qk3.m25726c().mo25135a(f7568g, String.format("Handling reschedule %s, %s", new Object[]{intent, Integer.valueOf(i)}), new Throwable[0]);
        dVar.mo10992g().mo23747u();
    }

    /* renamed from: k */
    public final void mo10976k(Intent intent, int i, C1542d dVar) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        qk3 c = qk3.m25726c();
        String str = f7568g;
        c.mo25135a(str, String.format("Handling schedule work for %s", new Object[]{string}), new Throwable[0]);
        WorkDatabase q = dVar.mo10992g().mo23743q();
        q.mo10119e();
        try {
            an7 f = q.mo10955N().mo11715f(string);
            if (f == null) {
                qk3 c2 = qk3.m25726c();
                c2.mo25139h(str, "Skipping scheduling " + string + " because it's no longer in the DB", new Throwable[0]);
            } else if (f.f205b.isFinished()) {
                qk3 c3 = qk3.m25726c();
                c3.mo25139h(str, "Skipping scheduling " + string + "because it is finished.", new Throwable[0]);
                q.mo10124j();
            } else {
                long a = f.mo431a();
                if (!f.mo432b()) {
                    qk3.m25726c().mo25135a(str, String.format("Setting up Alarms for %s at %s", new Object[]{string, Long.valueOf(a)}), new Throwable[0]);
                    C3672ye.m30548c(this.f7569a, dVar.mo10992g(), string, a);
                } else {
                    qk3.m25726c().mo25135a(str, String.format("Opportunistically setting an alarm for %s at %s", new Object[]{string, Long.valueOf(a)}), new Throwable[0]);
                    C3672ye.m30548c(this.f7569a, dVar.mo10992g(), string, a);
                    dVar.mo10996k(new C1542d.C1544b(dVar, m10554a(this.f7569a), i));
                }
                q.mo10115C();
                q.mo10124j();
            }
        } finally {
            q.mo10124j();
        }
    }

    /* renamed from: l */
    public final void mo10977l(Intent intent, C1542d dVar) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        qk3.m25726c().mo25135a(f7568g, String.format("Handing stopWork work for %s", new Object[]{string}), new Throwable[0]);
        dVar.mo10992g().mo23752z(string);
        C3672ye.m30546a(this.f7569a, dVar.mo10992g(), string);
        dVar.mo10971e(string, false);
    }

    /* renamed from: n */
    public boolean mo10978n() {
        boolean z;
        synchronized (this.f7571e) {
            if (!this.f7570d.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: o */
    public void mo10979o(Intent intent, int i, C1542d dVar) {
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            mo10972g(intent, i, dVar);
        } else if ("ACTION_RESCHEDULE".equals(action)) {
            mo10975j(intent, i, dVar);
        } else if (!m10559m(intent.getExtras(), "KEY_WORKSPEC_ID")) {
            qk3.m25726c().mo25136b(f7568g, String.format("Invalid request for %s, requires %s.", new Object[]{action, "KEY_WORKSPEC_ID"}), new Throwable[0]);
        } else if ("ACTION_SCHEDULE_WORK".equals(action)) {
            mo10976k(intent, i, dVar);
        } else if ("ACTION_DELAY_MET".equals(action)) {
            mo10973h(intent, i, dVar);
        } else if ("ACTION_STOP_WORK".equals(action)) {
            mo10977l(intent, dVar);
        } else if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
            mo10974i(intent, i);
        } else {
            qk3.m25726c().mo25139h(f7568g, String.format("Ignoring intent %s", new Object[]{intent}), new Throwable[0]);
        }
    }
}
