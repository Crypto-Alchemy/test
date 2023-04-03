package com.onesignal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.onesignal.OneSignal;

/* renamed from: com.onesignal.s */
/* compiled from: OSBackgroundSync */
public abstract class C5322s {

    /* renamed from: c */
    public static final Object f26520c = new Object();

    /* renamed from: a */
    public boolean f26521a = false;

    /* renamed from: b */
    public Thread f26522b;

    /* renamed from: n */
    public static boolean m41260n() {
        return true;
    }

    /* renamed from: a */
    public void mo39089a(Context context) {
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
        OneSignal.m40387d1(log_level, getClass().getSimpleName() + " cancel background sync");
        synchronized (f26520c) {
            if (m41260n()) {
                ((JobScheduler) context.getSystemService("jobscheduler")).cancel(mo39078e());
            } else {
                ((AlarmManager) context.getSystemService("alarm")).cancel(mo39097m(context));
            }
        }
    }

    /* renamed from: b */
    public void mo39090b(Context context, Runnable runnable) {
        OneSignal.m40387d1(OneSignal.LOG_LEVEL.DEBUG, "OSBackground sync, calling initWithContext");
        OneSignal.m40338L0(context);
        Thread thread = new Thread(runnable, mo39079f());
        this.f26522b = thread;
        thread.start();
    }

    /* renamed from: c */
    public abstract Class mo39076c();

    /* renamed from: d */
    public abstract Class mo39077d();

    /* renamed from: e */
    public abstract int mo39078e();

    /* renamed from: f */
    public abstract String mo39079f();

    /* renamed from: g */
    public final boolean mo39091g(Context context) {
        if (C6285nj.m48809a(context, "android.permission.RECEIVE_BOOT_COMPLETED") == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final boolean mo39092h(Context context) {
        Thread thread;
        for (JobInfo id : ((JobScheduler) context.getSystemService("jobscheduler")).getAllPendingJobs()) {
            if (id.getId() == mo39078e() && (thread = this.f26522b) != null && thread.isAlive()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public void mo39093i(Context context, long j) {
        synchronized (f26520c) {
            if (m41260n()) {
                mo39095k(context, j);
            } else {
                mo39094j(context, j);
            }
        }
    }

    /* renamed from: j */
    public final void mo39094j(Context context, long j) {
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.VERBOSE;
        OneSignal.m40376a(log_level, getClass().getSimpleName() + " scheduleServiceSyncTask:atTime: " + j);
        ((AlarmManager) context.getSystemService("alarm")).set(0, OneSignal.m40443w0().mo46064a() + j, mo39097m(context));
    }

    /* renamed from: k */
    public final void mo39095k(Context context, long j) {
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.VERBOSE;
        OneSignal.m40376a(log_level, "OSBackgroundSync scheduleSyncServiceAsJob:atTime: " + j);
        if (mo39092h(context)) {
            OneSignal.m40376a(log_level, "OSBackgroundSync scheduleSyncServiceAsJob Scheduler already running!");
            this.f26521a = true;
            return;
        }
        JobInfo.Builder builder = new JobInfo.Builder(mo39078e(), new ComponentName(context, mo39076c()));
        builder.setMinimumLatency(j).setRequiredNetworkType(1);
        if (mo39091g(context)) {
            builder.setPersisted(true);
        }
        try {
            int schedule = ((JobScheduler) context.getSystemService("jobscheduler")).schedule(builder.build());
            OneSignal.LOG_LEVEL log_level2 = OneSignal.LOG_LEVEL.INFO;
            OneSignal.m40376a(log_level2, "OSBackgroundSync scheduleSyncServiceAsJob:result: " + schedule);
        } catch (NullPointerException e) {
            OneSignal.m40379b(OneSignal.LOG_LEVEL.ERROR, "scheduleSyncServiceAsJob called JobScheduler.jobScheduler which triggered an internal null Android error. Skipping job.", e);
        }
    }

    /* renamed from: l */
    public boolean mo39096l() {
        Thread thread = this.f26522b;
        if (thread == null || !thread.isAlive()) {
            return false;
        }
        this.f26522b.interrupt();
        return true;
    }

    /* renamed from: m */
    public final PendingIntent mo39097m(Context context) {
        return PendingIntent.getService(context, mo39078e(), new Intent(context, mo39077d()), 201326592);
    }
}
