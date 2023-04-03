package androidx.compose.p004ui.platform;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* renamed from: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$4 */
/* compiled from: AndroidCompositionLocals.android.kt */
public final class C0420x611323ac extends Lambda implements fd2<nn0, Integer, r37> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ fd2<nn0, Integer, r37> $content;
    public final /* synthetic */ AndroidComposeView $owner;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0420x611323ac(AndroidComposeView androidComposeView, fd2<? super nn0, ? super Integer, r37> fd2, int i) {
        super(2);
        this.$owner = androidComposeView;
        this.$content = fd2;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((nn0) obj, ((Number) obj2).intValue());
        return r37.f33317a;
    }

    public final void invoke(nn0 nn0, int i) {
        AndroidCompositionLocals_androidKt.m3042a(this.$owner, this.$content, nn0, this.$$changed | 1);
    }
}
