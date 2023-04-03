package androidx.compose.p004ui.platform;

import android.view.View;
import androidx.compose.runtime.Recomposer;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "androidx.compose.ui.platform.WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1", mo48632f = "WindowRecomposer.android.kt", mo48633l = {233}, mo48634m = "invokeSuspend")
/* renamed from: androidx.compose.ui.platform.WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1 */
/* compiled from: WindowRecomposer.android.kt */
public final class C0438xbfd085b3 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ Recomposer $newRecomposer;
    public final /* synthetic */ View $rootView;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0438xbfd085b3(Recomposer recomposer, View view, ns0<? super C0438xbfd085b3> ns0) {
        super(2, ns0);
        this.$newRecomposer = recomposer;
        this.$rootView = view;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new C0438xbfd085b3(this.$newRecomposer, this.$rootView, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((C0438xbfd085b3) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            Recomposer recomposer = this.$newRecomposer;
            this.label = 1;
            if (recomposer.mo3100b0(this) == d) {
                return d;
            }
        } else if (i == 1) {
            try {
                hg5.m45199b(obj);
            } catch (Throwable th) {
                if (WindowRecomposer_androidKt.m3138f(this.$rootView) == this.$newRecomposer) {
                    WindowRecomposer_androidKt.m3141i(this.$rootView, (wn0) null);
                }
                throw th;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (WindowRecomposer_androidKt.m3138f(this.$rootView) == this.$newRecomposer) {
            WindowRecomposer_androidKt.m3141i(this.$rootView, (wn0) null);
        }
        return r37.f33317a;
    }
}
