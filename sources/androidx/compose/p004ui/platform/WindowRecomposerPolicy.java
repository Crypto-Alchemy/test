package androidx.compose.p004ui.platform;

import android.os.Handler;
import android.view.View;
import androidx.compose.runtime.Recomposer;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineStart;
import p000.y23;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, mo44877d2 = {"Landroidx/compose/ui/platform/WindowRecomposerPolicy;", "", "Landroid/view/View;", "rootView", "Landroidx/compose/runtime/Recomposer;", "a", "(Landroid/view/View;)Landroidx/compose/runtime/Recomposer;", "Ljava/util/concurrent/atomic/AtomicReference;", "Lpl7;", "b", "Ljava/util/concurrent/atomic/AtomicReference;", "factory", "<init>", "()V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.platform.WindowRecomposerPolicy */
/* compiled from: WindowRecomposer.android.kt */
public final class WindowRecomposerPolicy {

    /* renamed from: a */
    public static final WindowRecomposerPolicy f2086a = new WindowRecomposerPolicy();

    /* renamed from: b */
    public static final AtomicReference<pl7> f2087b = new AtomicReference<>(pl7.f16536a.mo24641a());

    /* renamed from: c */
    public static final int f2088c = 8;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, mo44877d2 = {"androidx/compose/ui/platform/WindowRecomposerPolicy$a", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "v", "Lr37;", "onViewAttachedToWindow", "onViewDetachedFromWindow", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: androidx.compose.ui.platform.WindowRecomposerPolicy$a */
    /* compiled from: WindowRecomposer.android.kt */
    public static final class C0437a implements View.OnAttachStateChangeListener {

        /* renamed from: a */
        public final /* synthetic */ y23 f2089a;

        public C0437a(y23 y23) {
            this.f2089a = y23;
        }

        public void onViewAttachedToWindow(View view) {
            vx2.m53591g(view, "v");
        }

        public void onViewDetachedFromWindow(View view) {
            vx2.m53591g(view, "v");
            view.removeOnAttachStateChangeListener(this);
            y23.C9621a.m74226a(this.f2089a, (CancellationException) null, 1, (Object) null);
        }
    }

    /* renamed from: a */
    public final Recomposer mo3968a(View view) {
        vx2.m53591g(view, "rootView");
        Recomposer a = f2087b.get().mo24640a(view);
        WindowRecomposer_androidKt.m3141i(view, a);
        ih2 ih2 = ih2.f38385a;
        Handler handler = view.getHandler();
        vx2.m53590f(handler, "rootView.handler");
        view.addOnAttachStateChangeListener(new C0437a(d50.m56748b(ih2, uk2.m72808b(handler, "windowRecomposer cleanup").mo55552N(), (CoroutineStart) null, new C0438xbfd085b3(a, view, (ns0<? super C0438xbfd085b3>) null), 2, (Object) null)));
        return a;
    }
}
