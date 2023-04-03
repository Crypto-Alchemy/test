package androidx.compose.p004ui.platform;

import android.view.Choreographer;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Landroid/view/Choreographer;", "kotlin.jvm.PlatformType", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "androidx.compose.ui.platform.AndroidUiDispatcher$Companion$Main$2$dispatcher$1", mo48632f = "AndroidUiDispatcher.android.kt", mo48633l = {}, mo48634m = "invokeSuspend")
/* renamed from: androidx.compose.ui.platform.AndroidUiDispatcher$Companion$Main$2$dispatcher$1 */
/* compiled from: AndroidUiDispatcher.android.kt */
public final class AndroidUiDispatcher$Companion$Main$2$dispatcher$1 extends SuspendLambda implements fd2<hu0, ns0<? super Choreographer>, Object> {
    public int label;

    public AndroidUiDispatcher$Companion$Main$2$dispatcher$1(ns0<? super AndroidUiDispatcher$Companion$Main$2$dispatcher$1> ns0) {
        super(2, ns0);
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new AndroidUiDispatcher$Companion$Main$2$dispatcher$1(ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super Choreographer> ns0) {
        return ((AndroidUiDispatcher$Companion$Main$2$dispatcher$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        wx2.m54101d();
        if (this.label == 0) {
            hg5.m45199b(obj);
            return Choreographer.getInstance();
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
