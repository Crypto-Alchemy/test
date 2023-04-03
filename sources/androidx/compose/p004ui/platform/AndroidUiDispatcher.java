package androidx.compose.p004ui.platform;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.ArrayList;
import java.util.List;
import kotlin.C6169a;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineDispatcher;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000k\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n*\u00010\b\u0007\u0018\u0000 <2\u00020\u0001:\u0001=B\u0019\b\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0012\u0012\u0006\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b:\u0010;J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\u0006J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\nH\u0002J\b\u0010\u000e\u001a\u00020\u0004H\u0002J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0002R\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\n0 8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001c\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00020$8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001c\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020$8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b(\u0010&R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010/\u001a\u00020*8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b.\u0010,R\u0014\u00103\u001a\u0002008\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0017\u00109\u001a\u0002048\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108¨\u0006>"}, mo44877d2 = {"Landroidx/compose/ui/platform/AndroidUiDispatcher;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Landroid/view/Choreographer$FrameCallback;", "callback", "Lr37;", "g0", "(Landroid/view/Choreographer$FrameCallback;)V", "h0", "Lkotlin/coroutines/CoroutineContext;", "context", "Ljava/lang/Runnable;", "block", "m", "b0", "e0", "", "frameTimeNanos", "c0", "Landroid/view/Choreographer;", "e", "Landroid/view/Choreographer;", "X", "()Landroid/view/Choreographer;", "choreographer", "Landroid/os/Handler;", "g", "Landroid/os/Handler;", "handler", "", "k", "Ljava/lang/Object;", "lock", "Leq;", "r", "Leq;", "toRunTrampolined", "", "s", "Ljava/util/List;", "toRunOnFrame", "x", "spareToRunOnFrame", "", "y", "Z", "scheduledTrampolineDispatch", "A", "scheduledFrameDispatch", "androidx/compose/ui/platform/AndroidUiDispatcher$c", "B", "Landroidx/compose/ui/platform/AndroidUiDispatcher$c;", "dispatchCallback", "Lyx3;", "C", "Lyx3;", "Y", "()Lyx3;", "frameClock", "<init>", "(Landroid/view/Choreographer;Landroid/os/Handler;)V", "H", "b", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.platform.AndroidUiDispatcher */
/* compiled from: AndroidUiDispatcher.android.kt */
public final class AndroidUiDispatcher extends CoroutineDispatcher {

    /* renamed from: H */
    public static final C0423b f1997H = new C0423b((DefaultConstructorMarker) null);

    /* renamed from: I */
    public static final int f1998I = 8;

    /* renamed from: L */
    public static final ef3<CoroutineContext> f1999L = C6169a.m47232a(AndroidUiDispatcher$Companion$Main$2.INSTANCE);

    /* renamed from: M */
    public static final ThreadLocal<CoroutineContext> f2000M = new C0422a();

    /* renamed from: A */
    public boolean f2001A;

    /* renamed from: B */
    public final C0424c f2002B;

    /* renamed from: C */
    public final yx3 f2003C;

    /* renamed from: e */
    public final Choreographer f2004e;

    /* renamed from: g */
    public final Handler f2005g;

    /* renamed from: k */
    public final Object f2006k;

    /* renamed from: r */
    public final C5808eq<Runnable> f2007r;

    /* renamed from: s */
    public List<Choreographer.FrameCallback> f2008s;

    /* renamed from: x */
    public List<Choreographer.FrameCallback> f2009x;

    /* renamed from: y */
    public boolean f2010y;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0014¨\u0006\u0004"}, mo44877d2 = {"androidx/compose/ui/platform/AndroidUiDispatcher$a", "Ljava/lang/ThreadLocal;", "Lkotlin/coroutines/CoroutineContext;", "a", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: androidx.compose.ui.platform.AndroidUiDispatcher$a */
    /* compiled from: AndroidUiDispatcher.android.kt */
    public static final class C0422a extends ThreadLocal<CoroutineContext> {
        /* renamed from: a */
        public CoroutineContext initialValue() {
            Choreographer instance = Choreographer.getInstance();
            vx2.m53590f(instance, "getInstance()");
            Looper myLooper = Looper.myLooper();
            if (myLooper != null) {
                Handler a = rk2.m26266a(myLooper);
                vx2.m53590f(a, "createAsync(\n           …d\")\n                    )");
                AndroidUiDispatcher androidUiDispatcher = new AndroidUiDispatcher(instance, a, (DefaultConstructorMarker) null);
                return androidUiDispatcher.plus(androidUiDispatcher.mo3888Y());
            }
            throw new IllegalStateException("no Looper on this thread".toString());
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001b\u0010\u0007\u001a\u00020\u00028FX\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, mo44877d2 = {"Landroidx/compose/ui/platform/AndroidUiDispatcher$b;", "", "Lkotlin/coroutines/CoroutineContext;", "Main$delegate", "Lef3;", "b", "()Lkotlin/coroutines/CoroutineContext;", "Main", "a", "CurrentThread", "Ljava/lang/ThreadLocal;", "currentThread", "Ljava/lang/ThreadLocal;", "<init>", "()V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: androidx.compose.ui.platform.AndroidUiDispatcher$b */
    /* compiled from: AndroidUiDispatcher.android.kt */
    public static final class C0423b {
        public C0423b() {
        }

        public /* synthetic */ C0423b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final CoroutineContext mo3897a() {
            if (C3195rj.m26215b()) {
                return mo3898b();
            }
            CoroutineContext coroutineContext = (CoroutineContext) AndroidUiDispatcher.f2000M.get();
            if (coroutineContext != null) {
                return coroutineContext;
            }
            throw new IllegalStateException("no AndroidUiDispatcher for this thread".toString());
        }

        /* renamed from: b */
        public final CoroutineContext mo3898b() {
            return (CoroutineContext) AndroidUiDispatcher.f1999L.getValue();
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\b"}, mo44877d2 = {"androidx/compose/ui/platform/AndroidUiDispatcher$c", "Landroid/view/Choreographer$FrameCallback;", "Ljava/lang/Runnable;", "Lr37;", "run", "", "frameTimeNanos", "doFrame", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: androidx.compose.ui.platform.AndroidUiDispatcher$c */
    /* compiled from: AndroidUiDispatcher.android.kt */
    public static final class C0424c implements Choreographer.FrameCallback, Runnable {

        /* renamed from: a */
        public final /* synthetic */ AndroidUiDispatcher f2011a;

        public C0424c(AndroidUiDispatcher androidUiDispatcher) {
            this.f2011a = androidUiDispatcher;
        }

        public void doFrame(long j) {
            this.f2011a.f2005g.removeCallbacks(this);
            this.f2011a.mo3891e0();
            this.f2011a.mo3890c0(j);
        }

        public void run() {
            this.f2011a.mo3891e0();
            Object N = this.f2011a.f2006k;
            AndroidUiDispatcher androidUiDispatcher = this.f2011a;
            synchronized (N) {
                if (androidUiDispatcher.f2008s.isEmpty()) {
                    androidUiDispatcher.mo3887X().removeFrameCallback(this);
                    androidUiDispatcher.f2001A = false;
                }
                r37 r37 = r37.f33317a;
            }
        }
    }

    public AndroidUiDispatcher(Choreographer choreographer, Handler handler) {
        this.f2004e = choreographer;
        this.f2005g = handler;
        this.f2006k = new Object();
        this.f2007r = new C5808eq<>();
        this.f2008s = new ArrayList();
        this.f2009x = new ArrayList();
        this.f2002B = new C0424c(this);
        this.f2003C = new AndroidUiFrameClock(choreographer);
    }

    public /* synthetic */ AndroidUiDispatcher(Choreographer choreographer, Handler handler, DefaultConstructorMarker defaultConstructorMarker) {
        this(choreographer, handler);
    }

    /* renamed from: X */
    public final Choreographer mo3887X() {
        return this.f2004e;
    }

    /* renamed from: Y */
    public final yx3 mo3888Y() {
        return this.f2003C;
    }

    /* renamed from: b0 */
    public final Runnable mo3889b0() {
        Runnable w;
        synchronized (this.f2006k) {
            w = this.f2007r.mo42377w();
        }
        return w;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0015, code lost:
        r0 = r2.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0019, code lost:
        if (r1 >= r0) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001b, code lost:
        r2.get(r1).doFrame(r5);
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        r2.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002a, code lost:
        return;
     */
    /* renamed from: c0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3890c0(long r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f2006k
            monitor-enter(r0)
            boolean r1 = r4.f2001A     // Catch:{ all -> 0x002b }
            if (r1 != 0) goto L_0x0009
            monitor-exit(r0)
            return
        L_0x0009:
            r1 = 0
            r4.f2001A = r1     // Catch:{ all -> 0x002b }
            java.util.List<android.view.Choreographer$FrameCallback> r2 = r4.f2008s     // Catch:{ all -> 0x002b }
            java.util.List<android.view.Choreographer$FrameCallback> r3 = r4.f2009x     // Catch:{ all -> 0x002b }
            r4.f2008s = r3     // Catch:{ all -> 0x002b }
            r4.f2009x = r2     // Catch:{ all -> 0x002b }
            monitor-exit(r0)
            int r0 = r2.size()
        L_0x0019:
            if (r1 >= r0) goto L_0x0027
            java.lang.Object r3 = r2.get(r1)
            android.view.Choreographer$FrameCallback r3 = (android.view.Choreographer.FrameCallback) r3
            r3.doFrame(r5)
            int r1 = r1 + 1
            goto L_0x0019
        L_0x0027:
            r2.clear()
            return
        L_0x002b:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.platform.AndroidUiDispatcher.mo3890c0(long):void");
    }

    /* renamed from: e0 */
    public final void mo3891e0() {
        boolean z;
        do {
            Runnable b0 = mo3889b0();
            while (b0 != null) {
                b0.run();
                b0 = mo3889b0();
            }
            synchronized (this.f2006k) {
                z = false;
                if (this.f2007r.isEmpty()) {
                    this.f2010y = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }

    /* renamed from: g0 */
    public final void mo3892g0(Choreographer.FrameCallback frameCallback) {
        vx2.m53591g(frameCallback, "callback");
        synchronized (this.f2006k) {
            this.f2008s.add(frameCallback);
            if (!this.f2001A) {
                this.f2001A = true;
                this.f2004e.postFrameCallback(this.f2002B);
            }
            r37 r37 = r37.f33317a;
        }
    }

    /* renamed from: h0 */
    public final void mo3893h0(Choreographer.FrameCallback frameCallback) {
        vx2.m53591g(frameCallback, "callback");
        synchronized (this.f2006k) {
            this.f2008s.remove(frameCallback);
        }
    }

    /* renamed from: m */
    public void mo3894m(CoroutineContext coroutineContext, Runnable runnable) {
        vx2.m53591g(coroutineContext, "context");
        vx2.m53591g(runnable, "block");
        synchronized (this.f2006k) {
            this.f2007r.addLast(runnable);
            if (!this.f2010y) {
                this.f2010y = true;
                this.f2005g.post(this.f2002B);
                if (!this.f2001A) {
                    this.f2001A = true;
                    this.f2004e.postFrameCallback(this.f2002B);
                }
            }
            r37 r37 = r37.f33317a;
        }
    }
}
