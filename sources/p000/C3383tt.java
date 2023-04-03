package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.sqlite.p006db.SupportSQLiteDatabase;
import androidx.sqlite.p006db.SupportSQLiteOpenHelper;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0012B\u001f\u0012\u0006\u0010F\u001a\u00020%\u0012\u0006\u0010H\u001a\u00020G\u0012\u0006\u0010I\u001a\u00020(¢\u0006\u0004\bJ\u0010KJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J'\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\f\u001a\u00020\bJ\u0006\u0010\r\u001a\u00020\u0004J\u0006\u0010\u000e\u001a\u00020\u0004J\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR$\u0010\"\u001a\u0004\u0018\u00010\u000f8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010#R\u0016\u0010'\u001a\u00020%8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\"\u00102\u001a\u00020,8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\n\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u00108\u001a\u00020%8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b3\u0010&\u001a\u0004\b4\u00105\"\u0004\b6\u00107R$\u0010=\u001a\u0004\u0018\u00010\b8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0014\u00109\u001a\u0004\b3\u0010:\"\u0004\b;\u0010<R\u0016\u0010@\u001a\u00020>8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010?R\u0014\u0010A\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u0014\u0010C\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\bB\u0010\u001dR\u0011\u0010E\u001a\u00020>8F¢\u0006\u0006\u001a\u0004\bB\u0010D¨\u0006L"}, mo44877d2 = {"Ltt;", "", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "delegateOpenHelper", "Lr37;", "k", "V", "Lkotlin/Function1;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "block", "g", "(Lrc2;)Ljava/lang/Object;", "j", "e", "d", "Ljava/lang/Runnable;", "onAutoClose", "m", "a", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "i", "()Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "n", "(Landroidx/sqlite/db/SupportSQLiteOpenHelper;)V", "Landroid/os/Handler;", "b", "Landroid/os/Handler;", "handler", "c", "Ljava/lang/Runnable;", "getOnAutoCloseCallback$room_runtime_release", "()Ljava/lang/Runnable;", "setOnAutoCloseCallback$room_runtime_release", "(Ljava/lang/Runnable;)V", "onAutoCloseCallback", "Ljava/lang/Object;", "lock", "", "J", "autoCloseTimeoutInMs", "Ljava/util/concurrent/Executor;", "f", "Ljava/util/concurrent/Executor;", "executor", "", "I", "getRefCount$room_runtime_release", "()I", "setRefCount$room_runtime_release", "(I)V", "refCount", "h", "getLastDecrementRefCountTimeStamp$room_runtime_release", "()J", "setLastDecrementRefCountTimeStamp$room_runtime_release", "(J)V", "lastDecrementRefCountTimeStamp", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "()Landroidx/sqlite/db/SupportSQLiteDatabase;", "setDelegateDatabase$room_runtime_release", "(Landroidx/sqlite/db/SupportSQLiteDatabase;)V", "delegateDatabase", "", "Z", "manuallyClosed", "executeAutoCloser", "l", "autoCloser", "()Z", "isActive", "autoCloseTimeoutAmount", "Ljava/util/concurrent/TimeUnit;", "autoCloseTimeUnit", "autoCloseExecutor", "<init>", "(JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/Executor;)V", "room-runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: tt */
/* compiled from: AutoCloser.kt */
public final class C3383tt {

    /* renamed from: m */
    public static final C3384a f18243m = new C3384a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public SupportSQLiteOpenHelper f18244a;

    /* renamed from: b */
    public final Handler f18245b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    public Runnable f18246c;

    /* renamed from: d */
    public final Object f18247d = new Object();

    /* renamed from: e */
    public long f18248e;

    /* renamed from: f */
    public final Executor f18249f;

    /* renamed from: g */
    public int f18250g;

    /* renamed from: h */
    public long f18251h;

    /* renamed from: i */
    public SupportSQLiteDatabase f18252i;

    /* renamed from: j */
    public boolean f18253j;

    /* renamed from: k */
    public final Runnable f18254k;

    /* renamed from: l */
    public final Runnable f18255l;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, mo44877d2 = {"Ltt$a;", "", "", "autoCloseBug", "Ljava/lang/String;", "<init>", "()V", "room-runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: tt$a */
    /* compiled from: AutoCloser.kt */
    public static final class C3384a {
        public C3384a() {
        }

        public /* synthetic */ C3384a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C3383tt(long j, TimeUnit timeUnit, Executor executor) {
        vx2.m53591g(timeUnit, "autoCloseTimeUnit");
        vx2.m53591g(executor, "autoCloseExecutor");
        this.f18248e = timeUnit.toMillis(j);
        this.f18249f = executor;
        this.f18251h = SystemClock.uptimeMillis();
        this.f18254k = new C3224rt(this);
        this.f18255l = new C3297st(this);
    }

    /* renamed from: c */
    public static final void m27896c(C3383tt ttVar) {
        r37 r37;
        vx2.m53591g(ttVar, "this$0");
        synchronized (ttVar.f18247d) {
            if (SystemClock.uptimeMillis() - ttVar.f18251h >= ttVar.f18248e) {
                if (ttVar.f18250g == 0) {
                    Runnable runnable = ttVar.f18246c;
                    if (runnable != null) {
                        runnable.run();
                        r37 = r37.f33317a;
                    } else {
                        r37 = null;
                    }
                    if (r37 != null) {
                        SupportSQLiteDatabase supportSQLiteDatabase = ttVar.f18252i;
                        if (supportSQLiteDatabase != null && supportSQLiteDatabase.isOpen()) {
                            supportSQLiteDatabase.close();
                        }
                        ttVar.f18252i = null;
                        r37 r372 = r37.f33317a;
                        return;
                    }
                    throw new IllegalStateException("onAutoCloseCallback is null but it should have been set before use. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568".toString());
                }
            }
        }
    }

    /* renamed from: f */
    public static final void m27897f(C3383tt ttVar) {
        vx2.m53591g(ttVar, "this$0");
        ttVar.f18249f.execute(ttVar.f18255l);
    }

    /* renamed from: d */
    public final void mo26543d() throws IOException {
        synchronized (this.f18247d) {
            this.f18253j = true;
            SupportSQLiteDatabase supportSQLiteDatabase = this.f18252i;
            if (supportSQLiteDatabase != null) {
                supportSQLiteDatabase.close();
            }
            this.f18252i = null;
            r37 r37 = r37.f33317a;
        }
    }

    /* renamed from: e */
    public final void mo26544e() {
        boolean z;
        synchronized (this.f18247d) {
            int i = this.f18250g;
            if (i > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int i2 = i - 1;
                this.f18250g = i2;
                if (i2 == 0) {
                    if (this.f18252i != null) {
                        this.f18245b.postDelayed(this.f18254k, this.f18248e);
                    } else {
                        return;
                    }
                }
                r37 r37 = r37.f33317a;
                return;
            }
            throw new IllegalStateException("ref count is 0 or lower but we're supposed to decrement".toString());
        }
    }

    /* renamed from: g */
    public final <V> V mo26545g(rc2<? super SupportSQLiteDatabase, ? extends V> rc2) {
        vx2.m53591g(rc2, "block");
        try {
            return rc2.invoke(mo26548j());
        } finally {
            mo26544e();
        }
    }

    /* renamed from: h */
    public final SupportSQLiteDatabase mo26546h() {
        return this.f18252i;
    }

    /* renamed from: i */
    public final SupportSQLiteOpenHelper mo26547i() {
        SupportSQLiteOpenHelper supportSQLiteOpenHelper = this.f18244a;
        if (supportSQLiteOpenHelper != null) {
            return supportSQLiteOpenHelper;
        }
        vx2.m53605u("delegateOpenHelper");
        return null;
    }

    /* renamed from: j */
    public final SupportSQLiteDatabase mo26548j() {
        synchronized (this.f18247d) {
            this.f18245b.removeCallbacks(this.f18254k);
            this.f18250g++;
            if (!this.f18253j) {
                SupportSQLiteDatabase supportSQLiteDatabase = this.f18252i;
                if (supportSQLiteDatabase != null && supportSQLiteDatabase.isOpen()) {
                    return supportSQLiteDatabase;
                }
                SupportSQLiteDatabase writableDatabase = mo26547i().getWritableDatabase();
                this.f18252i = writableDatabase;
                return writableDatabase;
            }
            throw new IllegalStateException("Attempting to open already closed database.".toString());
        }
    }

    /* renamed from: k */
    public final void mo26549k(SupportSQLiteOpenHelper supportSQLiteOpenHelper) {
        vx2.m53591g(supportSQLiteOpenHelper, "delegateOpenHelper");
        mo26552n(supportSQLiteOpenHelper);
    }

    /* renamed from: l */
    public final boolean mo26550l() {
        return !this.f18253j;
    }

    /* renamed from: m */
    public final void mo26551m(Runnable runnable) {
        vx2.m53591g(runnable, "onAutoClose");
        this.f18246c = runnable;
    }

    /* renamed from: n */
    public final void mo26552n(SupportSQLiteOpenHelper supportSQLiteOpenHelper) {
        vx2.m53591g(supportSQLiteOpenHelper, "<set-?>");
        this.f18244a = supportSQLiteOpenHelper;
    }
}
