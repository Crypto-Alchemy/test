package androidx.compose.p004ui.platform;

import android.content.res.Configuration;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* renamed from: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$1$1 */
/* compiled from: AndroidCompositionLocals.android.kt */
public final class C0416x68d8e1f6 extends Lambda implements rc2<Configuration, r37> {
    public final /* synthetic */ t04<Configuration> $configuration$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0416x68d8e1f6(t04<Configuration> t04) {
        super(1);
        this.$configuration$delegate = t04;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Configuration) obj);
        return r37.f33317a;
    }

    public final void invoke(Configuration configuration) {
        vx2.m53591g(configuration, "it");
        AndroidCompositionLocals_androidKt.m3044c(this.$configuration$delegate, configuration);
    }
}
