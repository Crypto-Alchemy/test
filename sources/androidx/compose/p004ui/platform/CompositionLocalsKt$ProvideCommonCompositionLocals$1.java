package androidx.compose.p004ui.platform;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* renamed from: androidx.compose.ui.platform.CompositionLocalsKt$ProvideCommonCompositionLocals$1 */
/* compiled from: CompositionLocals.kt */
public final class CompositionLocalsKt$ProvideCommonCompositionLocals$1 extends Lambda implements fd2<nn0, Integer, r37> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ fd2<nn0, Integer, r37> $content;
    public final /* synthetic */ nj4 $owner;
    public final /* synthetic */ g57 $uriHandler;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CompositionLocalsKt$ProvideCommonCompositionLocals$1(nj4 nj4, g57 g57, fd2<? super nn0, ? super Integer, r37> fd2, int i) {
        super(2);
        this.$owner = nj4;
        this.$uriHandler = g57;
        this.$content = fd2;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((nn0) obj, ((Number) obj2).intValue());
        return r37.f33317a;
    }

    public final void invoke(nn0 nn0, int i) {
        CompositionLocalsKt.m3074a(this.$owner, this.$uriHandler, this.$content, nn0, this.$$changed | 1);
    }
}
