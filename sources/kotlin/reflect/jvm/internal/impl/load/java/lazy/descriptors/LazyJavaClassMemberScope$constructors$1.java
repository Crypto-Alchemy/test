package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement;

/* compiled from: LazyJavaClassMemberScope.kt */
public final class LazyJavaClassMemberScope$constructors$1 extends Lambda implements pc2<List<? extends ef0>> {

    /* renamed from: $c */
    public final /* synthetic */ pf3 f39508$c;
    public final /* synthetic */ LazyJavaClassMemberScope this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaClassMemberScope$constructors$1(LazyJavaClassMemberScope lazyJavaClassMemberScope, pf3 pf3) {
        super(0);
        this.this$0 = lazyJavaClassMemberScope;
        this.f39508$c = pf3;
    }

    public final List<ef0> invoke() {
        Collection<y03> h = this.this$0.f39502o.mo53386h();
        ArrayList arrayList = new ArrayList(h.size());
        for (y03 R : h) {
            arrayList.add(this.this$0.mo53537G0(R));
        }
        if (this.this$0.f39502o.mo53391p()) {
            ef0 N = this.this$0.mo53553e0();
            boolean z = false;
            String c = ov3.m70793c(N, false, false, 2, (Object) null);
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (vx2.m53586b(ov3.m70793c((ef0) it.next(), false, false, 2, (Object) null), c)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z = true;
            if (z) {
                arrayList.add(N);
                this.f39508$c.mo65296a().mo67005h().mo66819c(this.this$0.f39502o, N);
            }
        }
        this.f39508$c.mo65296a().mo67020w().mo51508b(this.this$0.mo53531C(), arrayList);
        SignatureEnhancement r = this.f39508$c.mo65296a().mo67015r();
        pf3 pf3 = this.f39508$c;
        LazyJavaClassMemberScope lazyJavaClassMemberScope = this.this$0;
        boolean isEmpty = arrayList.isEmpty();
        List list = arrayList;
        if (isEmpty) {
            list = ck0.m33066n(lazyJavaClassMemberScope.mo53552d0());
        }
        return CollectionsKt___CollectionsKt.m47311K0(r.mo53747g(pf3, list));
    }
}
