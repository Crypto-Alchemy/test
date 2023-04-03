package androidx.compose.p004ui.platform;

import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* renamed from: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$3 */
/* compiled from: AndroidCompositionLocals.android.kt */
public final class C0419x611323ab extends Lambda implements fd2<nn0, Integer, r37> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ fd2<nn0, Integer, r37> $content;
    public final /* synthetic */ AndroidComposeView $owner;
    public final /* synthetic */ C3269sj $uriHandler;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0419x611323ab(AndroidComposeView androidComposeView, C3269sj sjVar, fd2<? super nn0, ? super Integer, r37> fd2, int i) {
        super(2);
        this.$owner = androidComposeView;
        this.$uriHandler = sjVar;
        this.$content = fd2;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((nn0) obj, ((Number) obj2).intValue());
        return r37.f33317a;
    }

    public final void invoke(nn0 nn0, int i) {
        if ((i & 11) != 2 || !nn0.mo2932b()) {
            if (ComposerKt.m1997O()) {
                ComposerKt.m2008Z(1471621628, i, -1, "androidx.compose.ui.platform.ProvideAndroidCompositionLocals.<anonymous> (AndroidCompositionLocals.android.kt:121)");
            }
            CompositionLocalsKt.m3074a(this.$owner, this.$uriHandler, this.$content, nn0, ((this.$$dirty << 3) & 896) | 72);
            if (ComposerKt.m1997O()) {
                ComposerKt.m2007Y();
                return;
            }
            return;
        }
        nn0.mo2963m();
    }
}
