package androidx.compose.runtime;

import com.google.mlkit.common.MlKitException;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo44877d2 = {"Lr37;", "invoke", "()V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: Composer.kt */
public final class ComposerImpl$doCompose$2$5 extends Lambda implements pc2<r37> {
    public final /* synthetic */ fd2<nn0, Integer, r37> $content;
    public final /* synthetic */ Object $savedContent;
    public final /* synthetic */ ComposerImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComposerImpl$doCompose$2$5(fd2<? super nn0, ? super Integer, r37> fd2, ComposerImpl composerImpl, Object obj) {
        super(0);
        this.$content = fd2;
        this.this$0 = composerImpl;
        this.$savedContent = obj;
    }

    public final void invoke() {
        Object obj;
        if (this.$content != null) {
            this.this$0.mo2946f1(MlKitException.CODE_SCANNER_UNAVAILABLE, ComposerKt.m1989G());
            C2283fb.m16820b(this.this$0, this.$content);
            this.this$0.mo2918U();
        } else if (!this.this$0.f1489r || (obj = this.$savedContent) == null || vx2.m53586b(obj, nn0.f15626a.mo23753a())) {
            this.this$0.mo2931a1();
        } else {
            this.this$0.mo2946f1(MlKitException.CODE_SCANNER_UNAVAILABLE, ComposerKt.m1989G());
            ComposerImpl composerImpl = this.this$0;
            Object obj2 = this.$savedContent;
            vx2.m53589e(obj2, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
            C2283fb.m16820b(composerImpl, (fd2) t07.m52027f(obj2, 2));
            this.this$0.mo2918U();
        }
    }
}
