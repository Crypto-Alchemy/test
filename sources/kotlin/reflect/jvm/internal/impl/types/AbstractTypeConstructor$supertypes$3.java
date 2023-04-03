package kotlin.reflect.jvm.internal.impl.types;

import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor;

/* compiled from: AbstractTypeConstructor.kt */
public final class AbstractTypeConstructor$supertypes$3 extends Lambda implements rc2<AbstractTypeConstructor.C7712a, r37> {
    public final /* synthetic */ AbstractTypeConstructor this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractTypeConstructor$supertypes$3(AbstractTypeConstructor abstractTypeConstructor) {
        super(1);
        this.this$0 = abstractTypeConstructor;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((AbstractTypeConstructor.C7712a) obj);
        return r37.f33317a;
    }

    public final void invoke(AbstractTypeConstructor.C7712a aVar) {
        vx2.m53591g(aVar, "supertypes");
        Collection<xc3> a = this.this$0.mo52634q().mo56461a(this.this$0, aVar.mo55286a(), new AbstractTypeConstructor$supertypes$3$resultWithoutCycles$1(this.this$0), new AbstractTypeConstructor$supertypes$3$resultWithoutCycles$2(this.this$0));
        List<T> list = null;
        if (a.isEmpty()) {
            xc3 n = this.this$0.mo52633n();
            a = n != null ? bk0.m32598e(n) : null;
            if (a == null) {
                a = ck0.m33062j();
            }
        }
        if (this.this$0.mo55278p()) {
            nd6 q = this.this$0.mo52634q();
            final AbstractTypeConstructor abstractTypeConstructor = this.this$0;
            C77142 r4 = new rc2<yz6, Iterable<? extends xc3>>() {
                public final Iterable<xc3> invoke(yz6 yz6) {
                    vx2.m53591g(yz6, "it");
                    return abstractTypeConstructor.mo55276l(yz6, true);
                }
            };
            final AbstractTypeConstructor abstractTypeConstructor2 = this.this$0;
            q.mo56461a(abstractTypeConstructor, a, r4, new rc2<xc3, r37>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((xc3) obj);
                    return r37.f33317a;
                }

                public final void invoke(xc3 xc3) {
                    vx2.m53591g(xc3, "it");
                    abstractTypeConstructor2.mo55280t(xc3);
                }
            });
        }
        AbstractTypeConstructor abstractTypeConstructor3 = this.this$0;
        if (a instanceof List) {
            list = a;
        }
        if (list == null) {
            list = CollectionsKt___CollectionsKt.m47311K0(a);
        }
        aVar.mo55288c(abstractTypeConstructor3.mo52635s(list));
    }
}
