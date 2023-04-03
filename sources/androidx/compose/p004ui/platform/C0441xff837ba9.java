package androidx.compose.p004ui.platform;

import android.view.View;
import androidx.compose.runtime.PausableMonotonicFrameClock;
import androidx.compose.runtime.Recomposer;
import androidx.lifecycle.C0715e;
import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineStart;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, mo44877d2 = {"androidx/compose/ui/platform/WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2", "Landroidx/lifecycle/e;", "Lug3;", "lifecycleOwner", "Landroidx/lifecycle/Lifecycle$Event;", "event", "Lr37;", "f", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 */
/* compiled from: WindowRecomposer.android.kt */
public final class C0441xff837ba9 implements C0715e {

    /* renamed from: a */
    public final /* synthetic */ hu0 f2094a;

    /* renamed from: d */
    public final /* synthetic */ PausableMonotonicFrameClock f2095d;

    /* renamed from: e */
    public final /* synthetic */ Recomposer f2096e;

    /* renamed from: g */
    public final /* synthetic */ Ref$ObjectRef<my3> f2097g;

    /* renamed from: k */
    public final /* synthetic */ View f2098k;

    @Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* renamed from: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$a */
    /* compiled from: WindowRecomposer.android.kt */
    public /* synthetic */ class C0442a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2099a;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
            iArr[Lifecycle.Event.ON_START.ordinal()] = 2;
            iArr[Lifecycle.Event.ON_STOP.ordinal()] = 3;
            iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 4;
            iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 5;
            iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 6;
            iArr[Lifecycle.Event.ON_ANY.ordinal()] = 7;
            f2099a = iArr;
        }
    }

    public C0441xff837ba9(hu0 hu0, PausableMonotonicFrameClock pausableMonotonicFrameClock, Recomposer recomposer, Ref$ObjectRef<my3> ref$ObjectRef, View view) {
        this.f2094a = hu0;
        this.f2095d = pausableMonotonicFrameClock;
        this.f2096e = recomposer;
        this.f2097g = ref$ObjectRef;
        this.f2098k = view;
    }

    /* renamed from: f */
    public void mo907f(ug3 ug3, Lifecycle.Event event) {
        vx2.m53591g(ug3, "lifecycleOwner");
        vx2.m53591g(event, "event");
        int i = C0442a.f2099a[event.ordinal()];
        if (i == 1) {
            y23 unused = d50.m56748b(this.f2094a, (CoroutineContext) null, CoroutineStart.UNDISPATCHED, new C0443x149b840a(this.f2097g, this.f2096e, ug3, this, this.f2098k, (ns0<? super C0443x149b840a>) null), 1, (Object) null);
        } else if (i == 2) {
            PausableMonotonicFrameClock pausableMonotonicFrameClock = this.f2095d;
            if (pausableMonotonicFrameClock != null) {
                pausableMonotonicFrameClock.mo3043i();
            }
        } else if (i == 3) {
            PausableMonotonicFrameClock pausableMonotonicFrameClock2 = this.f2095d;
            if (pausableMonotonicFrameClock2 != null) {
                pausableMonotonicFrameClock2.mo3042f();
            }
        } else if (i == 4) {
            this.f2096e.mo3090T();
        }
    }
}
