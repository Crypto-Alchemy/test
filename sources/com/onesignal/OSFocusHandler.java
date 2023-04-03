package com.onesignal;

import android.content.Context;
import androidx.work.C1521c;
import androidx.work.C1523d;
import androidx.work.ExistingWorkPolicy;
import androidx.work.ListenableWorker;
import androidx.work.NetworkType;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.onesignal.OneSignal;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.nq0;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0002\u0016\u001bB\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\u0007\u001a\u00020\u0005J\u0006\u0010\b\u001a\u00020\u0005J\u001e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rJ\u0016\u0010\u0010\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rJ\b\u0010\u0011\u001a\u00020\u0005H\u0002J\b\u0010\u0012\u001a\u00020\u0005H\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0002R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001c"}, mo44877d2 = {"Lcom/onesignal/OSFocusHandler;", "", "", "f", "g", "Lr37;", "j", "l", "m", "", "tag", "", "delay", "Landroid/content/Context;", "context", "k", "e", "i", "h", "Lnq0;", "d", "Ljava/lang/Runnable;", "a", "Ljava/lang/Runnable;", "stopRunnable", "<init>", "()V", "OnLostFocusWorker", "onesignal_release"}, mo44878k = 1, mo44879mv = {1, 4, 2})
/* compiled from: OSFocusHandler.kt */
public final class OSFocusHandler {

    /* renamed from: b */
    public static boolean f25898b;

    /* renamed from: c */
    public static boolean f25899c;

    /* renamed from: d */
    public static boolean f25900d;

    /* renamed from: e */
    public static final C5107a f25901e = new C5107a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public Runnable f25902a;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n"}, mo44877d2 = {"Lcom/onesignal/OSFocusHandler$OnLostFocusWorker;", "Landroidx/work/Worker;", "Landroidx/work/ListenableWorker$a;", "r", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "onesignal_release"}, mo44878k = 1, mo44879mv = {1, 4, 2})
    /* compiled from: OSFocusHandler.kt */
    public static final class OnLostFocusWorker extends Worker {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public OnLostFocusWorker(Context context, WorkerParameters workerParameters) {
            super(context, workerParameters);
            vx2.m53591g(context, "context");
            vx2.m53591g(workerParameters, "workerParams");
        }

        /* renamed from: r */
        public ListenableWorker.C1509a mo10897r() {
            OSFocusHandler.f25901e.mo38459a();
            ListenableWorker.C1509a c = ListenableWorker.C1509a.m10434c();
            vx2.m53590f(c, "Result.success()");
            return c;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\u000e"}, mo44877d2 = {"Lcom/onesignal/OSFocusHandler$a;", "", "Lr37;", "a", "", "backgrounded", "Z", "completed", "", "stopDelay", "J", "stopped", "<init>", "()V", "onesignal_release"}, mo44878k = 1, mo44879mv = {1, 4, 2})
    /* renamed from: com.onesignal.OSFocusHandler$a */
    /* compiled from: OSFocusHandler.kt */
    public static final class C5107a {
        public C5107a() {
        }

        public /* synthetic */ C5107a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo38459a() {
            C5179a b = C6139ka.m46938b();
            if (b == null || b.mo38653d() == null) {
                OneSignal.m40312C1(false);
            }
            OneSignal.m40387d1(OneSignal.LOG_LEVEL.DEBUG, "OSFocusHandler running onAppLostFocus");
            OSFocusHandler.f25899c = true;
            OneSignal.m40378a1();
            OSFocusHandler.f25900d = true;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo44877d2 = {"Lr37;", "run", "()V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 4, 2})
    /* renamed from: com.onesignal.OSFocusHandler$b */
    /* compiled from: OSFocusHandler.kt */
    public static final class C5108b implements Runnable {

        /* renamed from: a */
        public static final C5108b f25903a = new C5108b();

        public final void run() {
            OSFocusHandler.f25898b = true;
            OneSignal.m40387d1(OneSignal.LOG_LEVEL.DEBUG, "OSFocusHandler setting stop state: true");
        }
    }

    /* renamed from: d */
    public final nq0 mo38449d() {
        nq0 a = new nq0.C2917a().mo23778b(NetworkType.CONNECTED).mo23777a();
        vx2.m53590f(a, "Constraints.Builder()\n  …TED)\n            .build()");
        return a;
    }

    /* renamed from: e */
    public final void mo38450e(String str, Context context) {
        vx2.m53591g(str, "tag");
        vx2.m53591g(context, "context");
        te4.m52273a(context).mo23235a(str);
    }

    /* renamed from: f */
    public final boolean mo38451f() {
        return f25899c;
    }

    /* renamed from: g */
    public final boolean mo38452g() {
        return f25900d;
    }

    /* renamed from: h */
    public final void mo38453h() {
        mo38454i();
        f25899c = false;
    }

    /* renamed from: i */
    public final void mo38454i() {
        f25898b = false;
        Runnable runnable = this.f25902a;
        if (runnable != null) {
            C5331t0.m41330b().mo39118a(runnable);
        }
    }

    /* renamed from: j */
    public final void mo38455j() {
        mo38453h();
        OneSignal.m40387d1(OneSignal.LOG_LEVEL.DEBUG, "OSFocusHandler running onAppFocus");
        OneSignal.m40373Y0();
    }

    /* renamed from: k */
    public final void mo38456k(String str, long j, Context context) {
        vx2.m53591g(str, "tag");
        vx2.m53591g(context, "context");
        C1523d b = ((C1521c.C1522a) ((C1521c.C1522a) ((C1521c.C1522a) new C1521c.C1522a(OnLostFocusWorker.class).mo10947e(mo38449d())).mo10948f(j, TimeUnit.MILLISECONDS)).mo10945a(str)).mo10946b();
        vx2.m53590f(b, "OneTimeWorkRequest.Build…tag)\n            .build()");
        te4.m52273a(context).mo23238d(str, ExistingWorkPolicy.KEEP, (C1521c) b);
    }

    /* renamed from: l */
    public final void mo38457l() {
        if (f25898b) {
            f25898b = false;
            this.f25902a = null;
            OneSignal.m40387d1(OneSignal.LOG_LEVEL.DEBUG, "OSFocusHandler running onAppStartFocusLogic");
            OneSignal.m40381b1();
            return;
        }
        mo38454i();
    }

    /* renamed from: m */
    public final void mo38458m() {
        C5108b bVar = C5108b.f25903a;
        C5331t0.m41330b().mo39119c(1500, bVar);
        r37 r37 = r37.f33317a;
        this.f25902a = bVar;
    }
}
