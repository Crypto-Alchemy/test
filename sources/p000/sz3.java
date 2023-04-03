package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import org.web3j.ens.contracts.generated.PublicResolver;
import p000.gy2;
import p000.ko2;
import p000.lo2;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010C\u001a\u00020\u0014\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010E\u001a\u00020D\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\bF\u0010GR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0017\u001a\n \u0015*\u0004\u0018\u00010\u00140\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0016R\"\u0010\u001d\u001a\u00020\u00188\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u000f\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010$\u001a\u00020\u001e8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!\"\u0004\b\"\u0010#R$\u0010,\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0017\u00101\u001a\u00020-8\u0006¢\u0006\f\n\u0004\b(\u0010.\u001a\u0004\b/\u00100R\u0017\u00107\u001a\u0002028\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0017\u0010<\u001a\u0002088\u0006¢\u0006\f\n\u0004\b5\u00109\u001a\u0004\b:\u0010;R\u0017\u0010A\u001a\u00020=8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b3\u0010@R\u0017\u0010B\u001a\u00020=8\u0006¢\u0006\f\n\u0004\b\"\u0010?\u001a\u0004\b&\u0010@¨\u0006H"}, mo44877d2 = {"Lsz3;", "", "", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "Lgy2;", "b", "Lgy2;", "e", "()Lgy2;", "invalidationTracker", "Ljava/util/concurrent/Executor;", "c", "Ljava/util/concurrent/Executor;", "d", "()Ljava/util/concurrent/Executor;", "executor", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "Landroid/content/Context;", "appContext", "", "I", "()I", "setClientId", "(I)V", "clientId", "Lgy2$c;", "f", "Lgy2$c;", "()Lgy2$c;", "l", "(Lgy2$c;)V", "observer", "Llo2;", "g", "Llo2;", "h", "()Llo2;", "m", "(Llo2;)V", "service", "Lko2;", "Lko2;", "getCallback", "()Lko2;", "callback", "Ljava/util/concurrent/atomic/AtomicBoolean;", "i", "Ljava/util/concurrent/atomic/AtomicBoolean;", "j", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "stopped", "Landroid/content/ServiceConnection;", "Landroid/content/ServiceConnection;", "getServiceConnection", "()Landroid/content/ServiceConnection;", "serviceConnection", "Ljava/lang/Runnable;", "k", "Ljava/lang/Runnable;", "()Ljava/lang/Runnable;", "setUpRunnable", "removeObserverRunnable", "context", "Landroid/content/Intent;", "serviceIntent", "<init>", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;Lgy2;Ljava/util/concurrent/Executor;)V", "room-runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: sz3 */
/* compiled from: MultiInstanceInvalidationClient.kt */
public final class sz3 {

    /* renamed from: a */
    public final String f17856a;

    /* renamed from: b */
    public final gy2 f17857b;

    /* renamed from: c */
    public final Executor f17858c;

    /* renamed from: d */
    public final Context f17859d;

    /* renamed from: e */
    public int f17860e;

    /* renamed from: f */
    public gy2.C2435c f17861f;

    /* renamed from: g */
    public lo2 f17862g;

    /* renamed from: h */
    public final ko2 f17863h = new C3319b(this);

    /* renamed from: i */
    public final AtomicBoolean f17864i = new AtomicBoolean(false);

    /* renamed from: j */
    public final ServiceConnection f17865j;

    /* renamed from: k */
    public final Runnable f17866k;

    /* renamed from: l */
    public final Runnable f17867l;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u0014\u0010\n\u001a\u00020\u00078PX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, mo44877d2 = {"sz3$a", "Lgy2$c;", "", "", "tables", "Lr37;", "c", "", "b", "()Z", "isRemote", "room-runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: sz3$a */
    /* compiled from: MultiInstanceInvalidationClient.kt */
    public static final class C3318a extends gy2.C2435c {

        /* renamed from: b */
        public final /* synthetic */ sz3 f17868b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3318a(sz3 sz3, String[] strArr) {
            super(strArr);
            this.f17868b = sz3;
        }

        /* renamed from: b */
        public boolean mo20894b() {
            return true;
        }

        /* renamed from: c */
        public void mo20895c(Set<String> set) {
            vx2.m53591g(set, "tables");
            if (!this.f17868b.mo26013j().get()) {
                try {
                    lo2 h = this.f17868b.mo26011h();
                    if (h != null) {
                        int c = this.f17868b.mo26006c();
                        Object[] array = set.toArray(new String[0]);
                        vx2.m53589e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                        h.mo10109X(c, (String[]) array);
                    }
                } catch (RemoteException unused) {
                }
            }
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo44877d2 = {"sz3$b", "Lko2$a;", "", "", "tables", "Lr37;", "l", "([Ljava/lang/String;)V", "room-runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: sz3$b */
    /* compiled from: MultiInstanceInvalidationClient.kt */
    public static final class C3319b extends ko2.C2720a {

        /* renamed from: a */
        public final /* synthetic */ sz3 f17869a;

        public C3319b(sz3 sz3) {
            this.f17869a = sz3;
        }

        /* renamed from: r1 */
        public static final void m27228r1(sz3 sz3, String[] strArr) {
            vx2.m53591g(sz3, "this$0");
            vx2.m53591g(strArr, "$tables");
            sz3.mo26008e().mo20875l((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        /* renamed from: l */
        public void mo22423l(String[] strArr) {
            vx2.m53591g(strArr, "tables");
            this.f17869a.mo26007d().execute(new tz3(this.f17869a, strArr));
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, mo44877d2 = {"sz3$c", "Landroid/content/ServiceConnection;", "Landroid/content/ComponentName;", "name", "Landroid/os/IBinder;", "service", "Lr37;", "onServiceConnected", "onServiceDisconnected", "room-runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: sz3$c */
    /* compiled from: MultiInstanceInvalidationClient.kt */
    public static final class C3320c implements ServiceConnection {

        /* renamed from: a */
        public final /* synthetic */ sz3 f17870a;

        public C3320c(sz3 sz3) {
            this.f17870a = sz3;
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            vx2.m53591g(componentName, PublicResolver.FUNC_NAME);
            vx2.m53591g(iBinder, "service");
            this.f17870a.mo26015m(lo2.C2773a.m21640E0(iBinder));
            this.f17870a.mo26007d().execute(this.f17870a.mo26012i());
        }

        public void onServiceDisconnected(ComponentName componentName) {
            vx2.m53591g(componentName, PublicResolver.FUNC_NAME);
            this.f17870a.mo26007d().execute(this.f17870a.mo26010g());
            this.f17870a.mo26015m((lo2) null);
        }
    }

    public sz3(Context context, String str, Intent intent, gy2 gy2, Executor executor) {
        vx2.m53591g(context, "context");
        vx2.m53591g(str, PublicResolver.FUNC_NAME);
        vx2.m53591g(intent, "serviceIntent");
        vx2.m53591g(gy2, "invalidationTracker");
        vx2.m53591g(executor, "executor");
        this.f17856a = str;
        this.f17857b = gy2;
        this.f17858c = executor;
        Context applicationContext = context.getApplicationContext();
        this.f17859d = applicationContext;
        C3320c cVar = new C3320c(this);
        this.f17865j = cVar;
        this.f17866k = new qz3(this);
        this.f17867l = new rz3(this);
        Object[] array = gy2.mo20873j().keySet().toArray(new String[0]);
        vx2.m53589e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        mo26014l(new C3318a(this, (String[]) array));
        applicationContext.bindService(intent, cVar, 1);
    }

    /* renamed from: k */
    public static final void m27213k(sz3 sz3) {
        vx2.m53591g(sz3, "this$0");
        sz3.f17857b.mo20878o(sz3.mo26009f());
    }

    /* renamed from: n */
    public static final void m27214n(sz3 sz3) {
        vx2.m53591g(sz3, "this$0");
        try {
            lo2 lo2 = sz3.f17862g;
            if (lo2 != null) {
                sz3.f17860e = lo2.mo10111o(sz3.f17863h, sz3.f17856a);
                sz3.f17857b.mo20865b(sz3.mo26009f());
            }
        } catch (RemoteException unused) {
        }
    }

    /* renamed from: c */
    public final int mo26006c() {
        return this.f17860e;
    }

    /* renamed from: d */
    public final Executor mo26007d() {
        return this.f17858c;
    }

    /* renamed from: e */
    public final gy2 mo26008e() {
        return this.f17857b;
    }

    /* renamed from: f */
    public final gy2.C2435c mo26009f() {
        gy2.C2435c cVar = this.f17861f;
        if (cVar != null) {
            return cVar;
        }
        vx2.m53605u("observer");
        return null;
    }

    /* renamed from: g */
    public final Runnable mo26010g() {
        return this.f17867l;
    }

    /* renamed from: h */
    public final lo2 mo26011h() {
        return this.f17862g;
    }

    /* renamed from: i */
    public final Runnable mo26012i() {
        return this.f17866k;
    }

    /* renamed from: j */
    public final AtomicBoolean mo26013j() {
        return this.f17864i;
    }

    /* renamed from: l */
    public final void mo26014l(gy2.C2435c cVar) {
        vx2.m53591g(cVar, "<set-?>");
        this.f17861f = cVar;
    }

    /* renamed from: m */
    public final void mo26015m(lo2 lo2) {
        this.f17862g = lo2;
    }
}
