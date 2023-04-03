package p000;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.C1539a;

/* renamed from: ye */
/* compiled from: Alarms */
public class C3672ye {

    /* renamed from: a */
    public static final String f20186a = qk3.m25728f("Alarms");

    /* renamed from: a */
    public static void m30546a(Context context, nm7 nm7, String str) {
        nk6 K = nm7.mo23743q().mo10952K();
        mk6 a = K.mo23713a(str);
        if (a != null) {
            m30547b(context, str, a.f14998b);
            qk3.m25726c().mo25135a(f20186a, String.format("Removing SystemIdInfo for workSpecId (%s)", new Object[]{str}), new Throwable[0]);
            K.mo23716d(str);
        }
    }

    /* renamed from: b */
    public static void m30547b(Context context, String str, int i) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, C1539a.m10555b(context, str), 603979776);
        if (service != null && alarmManager != null) {
            qk3.m25726c().mo25135a(f20186a, String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", new Object[]{str, Integer.valueOf(i)}), new Throwable[0]);
            alarmManager.cancel(service);
        }
    }

    /* renamed from: c */
    public static void m30548c(Context context, nm7 nm7, String str, long j) {
        WorkDatabase q = nm7.mo23743q();
        nk6 K = q.mo10952K();
        mk6 a = K.mo23713a(str);
        if (a != null) {
            m30547b(context, str, a.f14998b);
            m30549d(context, str, a.f14998b, j);
            return;
        }
        int b = new yp2(q).mo28170b();
        K.mo23715c(new mk6(str, b));
        m30549d(context, str, b, j);
    }

    /* renamed from: d */
    public static void m30549d(Context context, String str, int i, long j) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, C1539a.m10555b(context, str), 201326592);
        if (alarmManager != null) {
            alarmManager.setExact(0, j, service);
        }
    }
}
