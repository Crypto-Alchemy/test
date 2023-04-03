package p000;

import android.annotation.SuppressLint;
import androidx.lifecycle.LiveData;
import androidx.room.RoomDatabase;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import p000.gy2;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B=\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0015\u001a\u00020\u0010\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\u0012\u000e\u0010;\u001a\n\u0012\u0006\b\u0001\u0012\u00020:09¢\u0006\u0004\b<\u0010=J\b\u0010\u0004\u001a\u00020\u0003H\u0014J\b\u0010\u0005\u001a\u00020\u0003H\u0014R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010!\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010'\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010*\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b)\u0010&R\u0017\u0010-\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b+\u0010$\u001a\u0004\b,\u0010&R\u0017\u00103\u001a\u00020.8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0017\u00105\u001a\u00020.8\u0006¢\u0006\f\n\u0004\b4\u00100\u001a\u0004\b\u0011\u00102R\u0011\u00108\u001a\u0002068F¢\u0006\u0006\u001a\u0004\b\u0017\u00107¨\u0006>"}, mo44877d2 = {"Loh5;", "T", "Landroidx/lifecycle/LiveData;", "Lr37;", "onActive", "onInactive", "Landroidx/room/RoomDatabase;", "a", "Landroidx/room/RoomDatabase;", "getDatabase", "()Landroidx/room/RoomDatabase;", "database", "Ley2;", "b", "Ley2;", "container", "", "c", "Z", "getInTransaction", "()Z", "inTransaction", "Ljava/util/concurrent/Callable;", "d", "Ljava/util/concurrent/Callable;", "getComputeFunction", "()Ljava/util/concurrent/Callable;", "computeFunction", "Lgy2$c;", "e", "Lgy2$c;", "getObserver", "()Lgy2$c;", "observer", "Ljava/util/concurrent/atomic/AtomicBoolean;", "f", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getInvalid", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "invalid", "g", "getComputing", "computing", "h", "getRegisteredObserver", "registeredObserver", "Ljava/lang/Runnable;", "i", "Ljava/lang/Runnable;", "getRefreshRunnable", "()Ljava/lang/Runnable;", "refreshRunnable", "j", "invalidationRunnable", "Ljava/util/concurrent/Executor;", "()Ljava/util/concurrent/Executor;", "queryExecutor", "", "", "tableNames", "<init>", "(Landroidx/room/RoomDatabase;Ley2;ZLjava/util/concurrent/Callable;[Ljava/lang/String;)V", "room-runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
@SuppressLint({"RestrictedApi"})
/* renamed from: oh5 */
/* compiled from: RoomTrackingLiveData.kt */
public final class oh5<T> extends LiveData<T> {

    /* renamed from: a */
    public final RoomDatabase f15899a;

    /* renamed from: b */
    public final ey2 f15900b;

    /* renamed from: c */
    public final boolean f15901c;

    /* renamed from: d */
    public final Callable<T> f15902d;

    /* renamed from: e */
    public final gy2.C2435c f15903e;

    /* renamed from: f */
    public final AtomicBoolean f15904f = new AtomicBoolean(true);

    /* renamed from: g */
    public final AtomicBoolean f15905g = new AtomicBoolean(false);

    /* renamed from: h */
    public final AtomicBoolean f15906h = new AtomicBoolean(false);

    /* renamed from: i */
    public final Runnable f15907i = new mh5(this);

    /* renamed from: j */
    public final Runnable f15908j = new nh5(this);

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\u0007"}, mo44877d2 = {"oh5$a", "Lgy2$c;", "", "", "tables", "Lr37;", "c", "room-runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: oh5$a */
    /* compiled from: RoomTrackingLiveData.kt */
    public static final class C2958a extends gy2.C2435c {

        /* renamed from: b */
        public final /* synthetic */ oh5<T> f15909b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2958a(String[] strArr, oh5<T> oh5) {
            super(strArr);
            this.f15909b = oh5;
        }

        /* renamed from: c */
        public void mo20895c(Set<String> set) {
            vx2.m53591g(set, "tables");
            C3634xp.m30269f().mo12124b(this.f15909b.mo23958c());
        }
    }

    public oh5(RoomDatabase roomDatabase, ey2 ey2, boolean z, Callable<T> callable, String[] strArr) {
        vx2.m53591g(roomDatabase, "database");
        vx2.m53591g(ey2, "container");
        vx2.m53591g(callable, "computeFunction");
        vx2.m53591g(strArr, "tableNames");
        this.f15899a = roomDatabase;
        this.f15900b = ey2;
        this.f15901c = z;
        this.f15902d = callable;
        this.f15903e = new C2958a(strArr, this);
    }

    /* renamed from: e */
    public static final void m23826e(oh5 oh5) {
        vx2.m53591g(oh5, "this$0");
        boolean hasActiveObservers = oh5.hasActiveObservers();
        if (oh5.f15904f.compareAndSet(false, true) && hasActiveObservers) {
            oh5.mo23959d().execute(oh5.f15907i);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0022  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m23827f(p000.oh5 r5) {
        /*
            java.lang.String r0 = "this$0"
            p000.vx2.m53591g(r5, r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.f15906h
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L_0x001a
            androidx.room.RoomDatabase r0 = r5.f15899a
            gy2 r0 = r0.mo10128n()
            gy2$c r3 = r5.f15903e
            r0.mo20866c(r3)
        L_0x001a:
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.f15905g
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L_0x004f
            r0 = 0
            r3 = r1
        L_0x0024:
            java.util.concurrent.atomic.AtomicBoolean r4 = r5.f15904f     // Catch:{ all -> 0x0048 }
            boolean r4 = r4.compareAndSet(r2, r1)     // Catch:{ all -> 0x0048 }
            if (r4 == 0) goto L_0x003d
            java.util.concurrent.Callable<T> r0 = r5.f15902d     // Catch:{ Exception -> 0x0034 }
            java.lang.Object r0 = r0.call()     // Catch:{ Exception -> 0x0034 }
            r3 = r2
            goto L_0x0024
        L_0x0034:
            r0 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ all -> 0x0048 }
            java.lang.String r3 = "Exception while computing database live data."
            r2.<init>(r3, r0)     // Catch:{ all -> 0x0048 }
            throw r2     // Catch:{ all -> 0x0048 }
        L_0x003d:
            if (r3 == 0) goto L_0x0042
            r5.postValue(r0)     // Catch:{ all -> 0x0048 }
        L_0x0042:
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.f15905g
            r0.set(r1)
            goto L_0x0050
        L_0x0048:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicBoolean r5 = r5.f15905g
            r5.set(r1)
            throw r0
        L_0x004f:
            r3 = r1
        L_0x0050:
            if (r3 == 0) goto L_0x005a
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.f15904f
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x001a
        L_0x005a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.oh5.m23827f(oh5):void");
    }

    /* renamed from: c */
    public final Runnable mo23958c() {
        return this.f15908j;
    }

    /* renamed from: d */
    public final Executor mo23959d() {
        if (this.f15901c) {
            return this.f15899a.mo10133s();
        }
        return this.f15899a.mo10130p();
    }

    public void onActive() {
        super.onActive();
        ey2 ey2 = this.f15900b;
        vx2.m53589e(this, "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.Any>");
        ey2.mo19555b(this);
        mo23959d().execute(this.f15907i);
    }

    public void onInactive() {
        super.onInactive();
        ey2 ey2 = this.f15900b;
        vx2.m53589e(this, "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.Any>");
        ey2.mo19556c(this);
    }
}
