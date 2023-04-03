package androidx.compose.p004ui.platform;

import android.content.res.Configuration;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"Landroid/content/res/Configuration;", "it", "Lr37;", "invoke", "(Landroid/content/res/Configuration;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.platform.AndroidComposeView$configurationChangeObserver$1 */
/* compiled from: AndroidComposeView.android.kt */
public final class AndroidComposeView$configurationChangeObserver$1 extends Lambda implements rc2<Configuration, r37> {
    public static final AndroidComposeView$configurationChangeObserver$1 INSTANCE = new AndroidComposeView$configurationChangeObserver$1();

    public AndroidComposeView$configurationChangeObserver$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Configuration) obj);
        return r37.f33317a;
    }

    public final void invoke(Configuration configuration) {
        vx2.m53591g(configuration, "it");
    }
}
