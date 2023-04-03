package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.C7428e;
import org.web3j.ens.contracts.generated.PublicResolver;

/* renamed from: un0 */
/* compiled from: SyntheticJavaPartsProvider.kt */
public final class un0 implements ek6 {

    /* renamed from: b */
    public final List<ek6> f45143b;

    public un0(List<? extends ek6> list) {
        vx2.m53591g(list, "inner");
        this.f45143b = list;
    }

    /* renamed from: a */
    public void mo51507a(if0 if0, r24 r24, Collection<C7428e> collection) {
        vx2.m53591g(if0, "thisDescriptor");
        vx2.m53591g(r24, PublicResolver.FUNC_NAME);
        vx2.m53591g(collection, "result");
        for (ek6 a : this.f45143b) {
            a.mo51507a(if0, r24, collection);
        }
    }

    /* renamed from: b */
    public void mo51508b(if0 if0, List<ef0> list) {
        vx2.m53591g(if0, "thisDescriptor");
        vx2.m53591g(list, "result");
        for (ek6 b : this.f45143b) {
            b.mo51508b(if0, list);
        }
    }

    /* renamed from: c */
    public List<r24> mo51509c(if0 if0) {
        vx2.m53591g(if0, "thisDescriptor");
        List<ek6> list = this.f45143b;
        ArrayList arrayList = new ArrayList();
        for (ek6 c : list) {
            hk0.m45275z(arrayList, c.mo51509c(if0));
        }
        return arrayList;
    }

    /* renamed from: d */
    public void mo51510d(if0 if0, r24 r24, Collection<C7428e> collection) {
        vx2.m53591g(if0, "thisDescriptor");
        vx2.m53591g(r24, PublicResolver.FUNC_NAME);
        vx2.m53591g(collection, "result");
        for (ek6 d : this.f45143b) {
            d.mo51510d(if0, r24, collection);
        }
    }

    /* renamed from: e */
    public List<r24> mo51511e(if0 if0) {
        vx2.m53591g(if0, "thisDescriptor");
        List<ek6> list = this.f45143b;
        ArrayList arrayList = new ArrayList();
        for (ek6 e : list) {
            hk0.m45275z(arrayList, e.mo51511e(if0));
        }
        return arrayList;
    }
}
