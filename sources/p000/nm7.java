package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import androidx.work.C1515a;
import androidx.work.C1521c;
import androidx.work.C1523d;
import androidx.work.ExistingWorkPolicy;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import p000.qk3;

/* renamed from: nm7 */
/* compiled from: WorkManagerImpl */
public class nm7 extends mm7 {

    /* renamed from: j */
    public static final String f15613j = qk3.m25728f("WorkManagerImpl");

    /* renamed from: k */
    public static nm7 f15614k = null;

    /* renamed from: l */
    public static nm7 f15615l = null;

    /* renamed from: m */
    public static final Object f15616m = new Object();

    /* renamed from: a */
    public Context f15617a;

    /* renamed from: b */
    public C1515a f15618b;

    /* renamed from: c */
    public WorkDatabase f15619c;

    /* renamed from: d */
    public bm6 f15620d;

    /* renamed from: e */
    public List<om5> f15621e;

    /* renamed from: f */
    public tv4 f15622f;

    /* renamed from: g */
    public pu4 f15623g;

    /* renamed from: h */
    public boolean f15624h;

    /* renamed from: i */
    public BroadcastReceiver.PendingResult f15625i;

    public nm7(Context context, C1515a aVar, bm6 bm6) {
        this(context, aVar, bm6, context.getResources().getBoolean(n15.workmanager_test_configuration));
    }

    /* renamed from: g */
    public static void m23320g(Context context, C1515a aVar) {
        synchronized (f15616m) {
            nm7 nm7 = f15614k;
            if (nm7 != null) {
                if (f15615l != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
            }
            if (nm7 == null) {
                Context applicationContext = context.getApplicationContext();
                if (f15615l == null) {
                    f15615l = new nm7(applicationContext, aVar, new om7(aVar.mo10916l()));
                }
                f15614k = f15615l;
            }
        }
    }

    @Deprecated
    /* renamed from: l */
    public static nm7 m23321l() {
        synchronized (f15616m) {
            nm7 nm7 = f15614k;
            if (nm7 != null) {
                return nm7;
            }
            nm7 nm72 = f15615l;
            return nm72;
        }
    }

    /* renamed from: m */
    public static nm7 m23322m(Context context) {
        nm7 l;
        synchronized (f15616m) {
            l = m23321l();
            if (l == null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext instanceof C1515a.C1518c) {
                    m23320g(applicationContext, ((C1515a.C1518c) applicationContext).mo10920a());
                    l = m23322m(applicationContext);
                } else {
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
            }
        }
        return l;
    }

    /* renamed from: a */
    public mi4 mo23235a(String str) {
        ia0 d = ia0.m19528d(str, this);
        this.f15620d.mo11700b(d);
        return d.mo21509e();
    }

    /* renamed from: c */
    public mi4 mo23237c(List<? extends C1523d> list) {
        if (!list.isEmpty()) {
            return new em7(this, list).mo19380a();
        }
        throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
    }

    /* renamed from: e */
    public mi4 mo23239e(String str, ExistingWorkPolicy existingWorkPolicy, List<C1521c> list) {
        return new em7(this, str, existingWorkPolicy, list).mo19380a();
    }

    /* renamed from: h */
    public mi4 mo23736h(UUID uuid) {
        ia0 b = ia0.m19526b(uuid, this);
        this.f15620d.mo11700b(b);
        return b.mo21509e();
    }

    /* renamed from: i */
    public List<om5> mo23737i(Context context, C1515a aVar, bm6 bm6) {
        return Arrays.asList(new om5[]{tm5.m27832a(context, this), new rj2(context, aVar, bm6, this)});
    }

    /* renamed from: j */
    public Context mo23738j() {
        return this.f15617a;
    }

    /* renamed from: k */
    public C1515a mo23739k() {
        return this.f15618b;
    }

    /* renamed from: n */
    public pu4 mo23740n() {
        return this.f15623g;
    }

    /* renamed from: o */
    public tv4 mo23741o() {
        return this.f15622f;
    }

    /* renamed from: p */
    public List<om5> mo23742p() {
        return this.f15621e;
    }

    /* renamed from: q */
    public WorkDatabase mo23743q() {
        return this.f15619c;
    }

    /* renamed from: r */
    public bm6 mo23744r() {
        return this.f15620d;
    }

    /* renamed from: s */
    public final void mo23745s(Context context, C1515a aVar, bm6 bm6, WorkDatabase workDatabase, List<om5> list, tv4 tv4) {
        Context applicationContext = context.getApplicationContext();
        this.f15617a = applicationContext;
        this.f15618b = aVar;
        this.f15620d = bm6;
        this.f15619c = workDatabase;
        this.f15621e = list;
        this.f15622f = tv4;
        this.f15623g = new pu4(workDatabase);
        this.f15624h = false;
        if (Build.VERSION.SDK_INT < 24 || !applicationContext.isDeviceProtectedStorage()) {
            this.f15620d.mo11700b(new ForceStopRunnable(applicationContext, this));
            return;
        }
        throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
    }

    /* renamed from: t */
    public void mo23746t() {
        synchronized (f15616m) {
            this.f15624h = true;
            BroadcastReceiver.PendingResult pendingResult = this.f15625i;
            if (pendingResult != null) {
                pendingResult.finish();
                this.f15625i = null;
            }
        }
    }

    /* renamed from: u */
    public void mo23747u() {
        yk6.m30661b(mo23738j());
        mo23743q().mo10955N().mo11720k();
        tm5.m27833b(mo23739k(), mo23743q(), mo23742p());
    }

    /* renamed from: v */
    public void mo23748v(BroadcastReceiver.PendingResult pendingResult) {
        synchronized (f15616m) {
            this.f15625i = pendingResult;
            if (this.f15624h) {
                pendingResult.finish();
                this.f15625i = null;
            }
        }
    }

    /* renamed from: w */
    public void mo23749w(String str) {
        mo23750x(str, (WorkerParameters.C1514a) null);
    }

    /* renamed from: x */
    public void mo23750x(String str, WorkerParameters.C1514a aVar) {
        this.f15620d.mo11700b(new n86(this, str, aVar));
    }

    /* renamed from: y */
    public void mo23751y(String str) {
        this.f15620d.mo11700b(new z96(this, str, true));
    }

    /* renamed from: z */
    public void mo23752z(String str) {
        this.f15620d.mo11700b(new z96(this, str, false));
    }

    public nm7(Context context, C1515a aVar, bm6 bm6, boolean z) {
        this(context, aVar, bm6, WorkDatabase.m10502E(context.getApplicationContext(), bm6.mo11701c(), z));
    }

    public nm7(Context context, C1515a aVar, bm6 bm6, WorkDatabase workDatabase) {
        Context applicationContext = context.getApplicationContext();
        qk3.m25727e(new qk3.C3151a(aVar.mo10914j()));
        Context context2 = context;
        C1515a aVar2 = aVar;
        bm6 bm62 = bm6;
        WorkDatabase workDatabase2 = workDatabase;
        List<om5> i = mo23737i(applicationContext, aVar, bm6);
        mo23745s(context2, aVar2, bm62, workDatabase2, i, new tv4(context2, aVar2, bm62, workDatabase2, i));
    }
}
