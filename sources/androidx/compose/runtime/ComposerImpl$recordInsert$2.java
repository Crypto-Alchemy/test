package androidx.compose.runtime;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, mo44877d2 = {"Ltp;", "applier", "Lt46;", "slots", "Lmc5;", "rememberManager", "Lr37;", "invoke", "(Ltp;Lt46;Lmc5;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: Composer.kt */
public final class ComposerImpl$recordInsert$2 extends Lambda implements id2<C3379tp<?>, t46, mc5, r37> {
    public final /* synthetic */ C1628bg $anchor;
    public final /* synthetic */ List<id2<C3379tp<?>, t46, mc5, r37>> $fixups;
    public final /* synthetic */ q46 $insertTable;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComposerImpl$recordInsert$2(q46 q46, C1628bg bgVar, List<id2<C3379tp<?>, t46, mc5, r37>> list) {
        super(3);
        this.$insertTable = q46;
        this.$anchor = bgVar;
        this.$fixups = list;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C3379tp<?>) (C3379tp) obj, (t46) obj2, (mc5) obj3);
        return r37.f33317a;
    }

    /* JADX INFO: finally extract failed */
    public final void invoke(C3379tp<?> tpVar, t46 t46, mc5 mc5) {
        vx2.m53591g(tpVar, "applier");
        vx2.m53591g(t46, "slots");
        vx2.m53591g(mc5, "rememberManager");
        q46 q46 = this.$insertTable;
        List<id2<C3379tp<?>, t46, mc5, r37>> list = this.$fixups;
        t46 E = q46.mo24927E();
        try {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                list.get(i).invoke(tpVar, E, mc5);
            }
            r37 r37 = r37.f33317a;
            E.mo26072F();
            t46.mo26068D();
            q46 q462 = this.$insertTable;
            t46.mo26131o0(q462, this.$anchor.mo11642d(q462));
            t46.mo26090O();
        } catch (Throwable th) {
            E.mo26072F();
            throw th;
        }
    }
}