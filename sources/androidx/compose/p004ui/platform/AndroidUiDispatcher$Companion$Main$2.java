package androidx.compose.p004ui.platform;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44876d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo44877d2 = {"<anonymous>", "Lkotlin/coroutines/CoroutineContext;", "invoke"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* renamed from: androidx.compose.ui.platform.AndroidUiDispatcher$Companion$Main$2 */
/* compiled from: AndroidUiDispatcher.android.kt */
public final class AndroidUiDispatcher$Companion$Main$2 extends Lambda implements pc2<CoroutineContext> {
    public static final AndroidUiDispatcher$Companion$Main$2 INSTANCE = new AndroidUiDispatcher$Companion$Main$2();

    public AndroidUiDispatcher$Companion$Main$2() {
        super(0);
    }

    public final CoroutineContext invoke() {
        Choreographer choreographer;
        if (C3195rj.m26215b()) {
            choreographer = Choreographer.getInstance();
        } else {
            choreographer = (Choreographer) b50.m55766c(qh1.m71266c(), new AndroidUiDispatcher$Companion$Main$2$dispatcher$1((ns0<? super AndroidUiDispatcher$Companion$Main$2$dispatcher$1>) null));
        }
        vx2.m53590f(choreographer, "if (isMainThread()) Chor…eographer.getInstance() }");
        Handler a = rk2.m26266a(Looper.getMainLooper());
        vx2.m53590f(a, "createAsync(Looper.getMainLooper())");
        AndroidUiDispatcher androidUiDispatcher = new AndroidUiDispatcher(choreographer, a, (DefaultConstructorMarker) null);
        return androidUiDispatcher.plus(androidUiDispatcher.mo3888Y());
    }
}
