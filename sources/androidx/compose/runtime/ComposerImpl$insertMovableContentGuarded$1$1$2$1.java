package androidx.compose.runtime;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo44877d2 = {"Lr37;", "invoke", "()V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: Composer.kt */
public final class ComposerImpl$insertMovableContentGuarded$1$1$2$1 extends Lambda implements pc2<r37> {
    public final /* synthetic */ List<id2<C3379tp<?>, t46, mc5, r37>> $offsetChanges;
    public final /* synthetic */ p46 $reader;
    public final /* synthetic */ zy3 $to;
    public final /* synthetic */ ComposerImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComposerImpl$insertMovableContentGuarded$1$1$2$1(ComposerImpl composerImpl, List<id2<C3379tp<?>, t46, mc5, r37>> list, p46 p46, zy3 zy3) {
        super(0);
        this.this$0 = composerImpl;
        this.$offsetChanges = list;
        this.$reader = p46;
        this.$to = zy3;
    }

    public final void invoke() {
        p46 x;
        int[] v;
        ComposerImpl composerImpl = this.this$0;
        List<id2<C3379tp<?>, t46, mc5, r37>> list = this.$offsetChanges;
        p46 p46 = this.$reader;
        zy3 zy3 = this.$to;
        List s = composerImpl.f1477f;
        try {
            composerImpl.f1477f = list;
            x = composerImpl.f1452H;
            v = composerImpl.f1486o;
            composerImpl.f1486o = null;
            composerImpl.f1452H = p46;
            composerImpl.mo2972p0(zy3.mo28674c(), zy3.mo28676e(), zy3.mo28677f(), true);
            r37 r37 = r37.f33317a;
            composerImpl.f1452H = x;
            composerImpl.f1486o = v;
            composerImpl.f1477f = s;
        } catch (Throwable th) {
            composerImpl.f1477f = s;
            throw th;
        }
    }
}
