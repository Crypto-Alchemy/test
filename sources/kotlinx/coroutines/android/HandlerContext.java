package kotlinx.coroutines.android;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B#\b\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010$\u001a\u00020\u0005¢\u0006\u0004\b+\u0010,B\u001d\b\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b+\u0010-J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001c\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0016J\u001e\u0010\u0010\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u000eH\u0016J$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\n\u0010\t\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\u0013\u0010\u0017\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\u001c\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0002R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u0004\u0018\u00010\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010%\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010*\u001a\u00020\u00008\u0016X\u0004¢\u0006\f\n\u0004\b'\u0010&\u001a\u0004\b(\u0010)¨\u0006."}, mo44877d2 = {"Lkotlinx/coroutines/android/HandlerContext;", "Ltk2;", "Lib1;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "z", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lr37;", "m", "", "timeMillis", "Lma0;", "continuation", "f", "Lzh1;", "i", "", "toString", "", "other", "equals", "", "hashCode", "Q", "Landroid/os/Handler;", "e", "Landroid/os/Handler;", "handler", "g", "Ljava/lang/String;", "name", "k", "Z", "invokeImmediately", "_immediate", "Lkotlinx/coroutines/android/HandlerContext;", "r", "S", "()Lkotlinx/coroutines/android/HandlerContext;", "immediate", "<init>", "(Landroid/os/Handler;Ljava/lang/String;Z)V", "(Landroid/os/Handler;Ljava/lang/String;)V", "kotlinx-coroutines-android"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* compiled from: HandlerDispatcher.kt */
public final class HandlerContext extends tk2 {
    private volatile HandlerContext _immediate;

    /* renamed from: e */
    public final Handler f40357e;

    /* renamed from: g */
    public final String f40358g;

    /* renamed from: k */
    public final boolean f40359k;

    /* renamed from: r */
    public final HandlerContext f40360r;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo44877d2 = {"Lr37;", "run", "()V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.android.HandlerContext$a */
    /* compiled from: Runnable.kt */
    public static final class C7757a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ ma0 f40361a;

        /* renamed from: d */
        public final /* synthetic */ HandlerContext f40362d;

        public C7757a(ma0 ma0, HandlerContext handlerContext) {
            this.f40361a = ma0;
            this.f40362d = handlerContext;
        }

        public final void run() {
            this.f40361a.mo56168y(this.f40362d, r37.f33317a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HandlerContext(Handler handler, String str, boolean z) {
        super((DefaultConstructorMarker) null);
        HandlerContext handlerContext = null;
        this.f40357e = handler;
        this.f40358g = str;
        this.f40359k = z;
        this._immediate = z ? this : handlerContext;
        HandlerContext handlerContext2 = this._immediate;
        if (handlerContext2 == null) {
            handlerContext2 = new HandlerContext(handler, str, true);
            this._immediate = handlerContext2;
        }
        this.f40360r = handlerContext2;
    }

    /* renamed from: W */
    public static final void m63237W(HandlerContext handlerContext, Runnable runnable) {
        handlerContext.f40357e.removeCallbacks(runnable);
    }

    /* renamed from: Q */
    public final void mo55553Q(CoroutineContext coroutineContext, Runnable runnable) {
        g33.m58007d(coroutineContext, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        qh1.m71265b().mo3894m(coroutineContext, runnable);
    }

    /* renamed from: S */
    public HandlerContext mo55552N() {
        return this.f40360r;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof HandlerContext) || ((HandlerContext) obj).f40357e != this.f40357e) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public void mo51194f(long j, ma0<? super r37> ma0) {
        C7757a aVar = new C7757a(ma0, this);
        if (this.f40357e.postDelayed(aVar, d75.m43386h(j, 4611686018427387903L))) {
            ma0.mo56166t(new HandlerContext$scheduleResumeAfterDelay$1(this, aVar));
        } else {
            mo55553Q(ma0.getContext(), aVar);
        }
    }

    public int hashCode() {
        return System.identityHashCode(this.f40357e);
    }

    /* renamed from: i */
    public zh1 mo51195i(long j, Runnable runnable, CoroutineContext coroutineContext) {
        if (this.f40357e.postDelayed(runnable, d75.m43386h(j, 4611686018427387903L))) {
            return new sk2(this, runnable);
        }
        mo55553Q(coroutineContext, runnable);
        return j84.f38629a;
    }

    /* renamed from: m */
    public void mo3894m(CoroutineContext coroutineContext, Runnable runnable) {
        if (!this.f40357e.post(runnable)) {
            mo55553Q(coroutineContext, runnable);
        }
    }

    public String toString() {
        String L = mo66537L();
        if (L != null) {
            return L;
        }
        String str = this.f40358g;
        if (str == null) {
            str = this.f40357e.toString();
        }
        if (!this.f40359k) {
            return str;
        }
        return str + ".immediate";
    }

    /* renamed from: z */
    public boolean mo28541z(CoroutineContext coroutineContext) {
        if (!this.f40359k || !vx2.m53586b(Looper.myLooper(), this.f40357e.getLooper())) {
            return true;
        }
        return false;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HandlerContext(Handler handler, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(handler, (i & 2) != 0 ? null : str);
    }

    public HandlerContext(Handler handler, String str) {
        this(handler, str, false);
    }
}
