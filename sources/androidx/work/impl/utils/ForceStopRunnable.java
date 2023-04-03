package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.C1515a;
import androidx.work.WorkInfo;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ForceStopRunnable implements Runnable {

    /* renamed from: g */
    public static final String f7636g = qk3.m25728f("ForceStopRunnable");

    /* renamed from: k */
    public static final long f7637k = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: a */
    public final Context f7638a;

    /* renamed from: d */
    public final nm7 f7639d;

    /* renamed from: e */
    public int f7640e = 0;

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* renamed from: a */
        public static final String f7641a = qk3.m25728f("ForceStopRunnable$Rcvr");

        public void onReceive(Context context, Intent intent) {
            if (intent != null && "ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                qk3.m25726c().mo25138g(f7641a, "Rescheduling alarm that keeps track of force-stops.", new Throwable[0]);
                ForceStopRunnable.m10615g(context);
            }
        }
    }

    public ForceStopRunnable(Context context, nm7 nm7) {
        this.f7638a = context.getApplicationContext();
        this.f7639d = nm7;
    }

    /* renamed from: c */
    public static Intent m10613c(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent;
    }

    /* renamed from: d */
    public static PendingIntent m10614d(Context context, int i) {
        return PendingIntent.getBroadcast(context, -1, m10613c(context), i);
    }

    @SuppressLint({"ClassVerificationFailure"})
    /* renamed from: g */
    public static void m10615g(Context context) {
        int i;
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        if (x40.m29874c()) {
            i = 167772160;
        } else {
            i = 134217728;
        }
        PendingIntent d = m10614d(context, i);
        long currentTimeMillis = System.currentTimeMillis() + f7637k;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, d);
        }
    }

    /* renamed from: a */
    public boolean mo11023a() {
        boolean z;
        boolean i = yk6.m30666i(this.f7638a, this.f7639d);
        WorkDatabase q = this.f7639d.mo23743q();
        bn7 N = q.mo10955N();
        tm7 M = q.mo10954M();
        q.mo10119e();
        try {
            List<an7> p = N.mo11725p();
            if (p == null || p.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                for (an7 next : p) {
                    N.mo11709a(WorkInfo.State.ENQUEUED, next.f204a);
                    N.mo11721l(next.f204a, -1);
                }
            }
            M.mo26514a();
            q.mo10115C();
            if (z || i) {
                return true;
            }
            return false;
        } finally {
            q.mo10124j();
        }
    }

    /* renamed from: b */
    public void mo11024b() {
        boolean a = mo11023a();
        if (mo11027h()) {
            qk3.m25726c().mo25135a(f7636g, "Rescheduling Workers.", new Throwable[0]);
            this.f7639d.mo23747u();
            this.f7639d.mo23740n().mo24792c(false);
        } else if (mo11025e()) {
            qk3.m25726c().mo25135a(f7636g, "Application was force-stopped, rescheduling.", new Throwable[0]);
            this.f7639d.mo23747u();
        } else if (a) {
            qk3.m25726c().mo25135a(f7636g, "Found unfinished work, scheduling it.", new Throwable[0]);
            tm5.m27833b(this.f7639d.mo23739k(), this.f7639d.mo23743q(), this.f7639d.mo23742p());
        }
    }

    @SuppressLint({"ClassVerificationFailure"})
    /* renamed from: e */
    public boolean mo11025e() {
        int i = 536870912;
        try {
            if (x40.m29874c()) {
                i = 570425344;
            }
            PendingIntent d = m10614d(this.f7638a, i);
            if (Build.VERSION.SDK_INT >= 30) {
                if (d != null) {
                    d.cancel();
                }
                List a = ((ActivityManager) this.f7638a.getSystemService("activity")).getHistoricalProcessExitReasons((String) null, 0, 0);
                if (a != null && !a.isEmpty()) {
                    for (int i2 = 0; i2 < a.size(); i2++) {
                        if (((ApplicationExitInfo) a.get(i2)).getReason() == 10) {
                            return true;
                        }
                    }
                }
            } else if (d == null) {
                m10615g(this.f7638a);
                return true;
            }
            return false;
        } catch (IllegalArgumentException | SecurityException e) {
            qk3.m25726c().mo25139h(f7636g, "Ignoring exception", e);
            return true;
        }
    }

    /* renamed from: f */
    public boolean mo11026f() {
        C1515a k = this.f7639d.mo23739k();
        if (TextUtils.isEmpty(k.mo10907c())) {
            qk3.m25726c().mo25135a(f7636g, "The default process name was not specified.", new Throwable[0]);
            return true;
        }
        boolean b = sv4.m27137b(this.f7638a, k);
        qk3.m25726c().mo25135a(f7636g, String.format("Is default app process = %s", new Object[]{Boolean.valueOf(b)}), new Throwable[0]);
        return b;
    }

    /* renamed from: h */
    public boolean mo11027h() {
        return this.f7639d.mo23740n().mo24791a();
    }

    /* renamed from: i */
    public void mo11028i(long j) {
        try {
            Thread.sleep(j);
        } catch (InterruptedException unused) {
        }
    }

    public void run() {
        try {
            if (!mo11026f()) {
                this.f7639d.mo23746t();
                return;
            }
            while (true) {
                fm7.m17133e(this.f7638a);
                qk3.m25726c().mo25135a(f7636g, "Performing cleanup operations.", new Throwable[0]);
                mo11024b();
                break;
            }
            this.f7639d.mo23746t();
        } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e) {
            int i = this.f7640e + 1;
            this.f7640e = i;
            if (i >= 3) {
                qk3 c = qk3.m25726c();
                String str = f7636g;
                c.mo25136b(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
                IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
                eu2 d = this.f7639d.mo23739k().mo10908d();
                if (d != null) {
                    qk3.m25726c().mo25135a(str, "Routing exception to the specified exception handler", illegalStateException);
                    d.mo19490a(illegalStateException);
                } else {
                    throw illegalStateException;
                }
            } else {
                qk3.m25726c().mo25135a(f7636g, String.format("Retrying after %s", new Object[]{Long.valueOf(((long) i) * 300)}), e);
                mo11028i(((long) this.f7640e) * 300);
            }
        } catch (Throwable th) {
            this.f7639d.mo23746t();
            throw th;
        }
    }
}
