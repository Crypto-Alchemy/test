package net.safemoon.androidwallet.service;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n"}, mo44877d2 = {"Lnet/safemoon/androidwallet/service/DailyWorker;", "Landroidx/work/Worker;", "Landroidx/work/ListenableWorker$a;", "r", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: DailyWorker.kt */
public final class DailyWorker extends Worker {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DailyWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        vx2.m53591g(context, "context");
        vx2.m53591g(workerParameters, "workerParams");
    }

    /* renamed from: r */
    public ListenableWorker.C1509a mo10897r() {
        System.out.print("JobRunning");
        ol0.m70350b0("JobRunning", "DAILY_JOB");
        ListenableWorker.C1509a c = ListenableWorker.C1509a.m10434c();
        vx2.m53590f(c, "success()");
        return c;
    }
}
