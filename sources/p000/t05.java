package p000;

import android.os.Handler;
import android.os.Looper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u0018*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\tB\u0015\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\b\u001a\u00020\u0007H\u0002R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\rR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0015\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, mo44877d2 = {"Lt05;", "T", "Lpf4;", "value", "Lr37;", "onChanged", "(Ljava/lang/Object;)V", "", "b", "a", "Lpf4;", "origin", "Landroid/os/Handler;", "Landroid/os/Handler;", "handler", "Ljava/lang/Runnable;", "c", "Ljava/lang/Runnable;", "runnable", "d", "Ljava/lang/Object;", "latestValue", "<init>", "(Lpf4;)V", "e", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: t05 */
/* compiled from: QuietLiveDataObserver.kt */
public final class t05<T> implements pf4<T> {

    /* renamed from: e */
    public static final C9321a f44628e = new C9321a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final pf4<T> f44629a;

    /* renamed from: b */
    public final Handler f44630b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    public Runnable f44631c;

    /* renamed from: d */
    public T f44632d;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, mo44877d2 = {"Lt05$a;", "", "", "POST_VALUE_DELAY", "J", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: t05$a */
    /* compiled from: QuietLiveDataObserver.kt */
    public static final class C9321a {
        public C9321a() {
        }

        public /* synthetic */ C9321a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public t05(pf4<T> pf4) {
        vx2.m53591g(pf4, "origin");
        this.f44629a = pf4;
    }

    /* renamed from: c */
    public static final void m72143c(t05 t05) {
        vx2.m53591g(t05, "this$0");
        pf4<T> pf4 = t05.f44629a;
        T t = t05.f44632d;
        vx2.m53588d(t);
        pf4.onChanged(t);
        t05.f44631c = null;
    }

    /* renamed from: b */
    public final boolean mo65960b() {
        if (this.f44632d == null) {
            return true;
        }
        return false;
    }

    public void onChanged(T t) {
        if (mo65960b()) {
            this.f44632d = t;
            this.f44629a.onChanged(t);
            return;
        }
        this.f44632d = t;
        Runnable runnable = this.f44631c;
        if (runnable != null) {
            Handler handler = this.f44630b;
            vx2.m53588d(runnable);
            handler.removeCallbacks(runnable);
        }
        s05 s05 = new s05(this);
        this.f44631c = s05;
        Handler handler2 = this.f44630b;
        vx2.m53588d(s05);
        handler2.postDelayed(s05, 500);
    }
}
