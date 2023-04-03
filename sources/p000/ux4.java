package p000;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$PackageFragment;

/* renamed from: ux4 */
/* compiled from: ProtoBasedClassDataFinder.kt */
public final class ux4 implements hf0 {

    /* renamed from: a */
    public final t24 f45187a;

    /* renamed from: b */
    public final o10 f45188b;

    /* renamed from: c */
    public final rc2<nf0, a66> f45189c;

    /* renamed from: d */
    public final Map<nf0, ProtoBuf$Class> f45190d;

    public ux4(ProtoBuf$PackageFragment protoBuf$PackageFragment, t24 t24, o10 o10, rc2<? super nf0, ? extends a66> rc2) {
        vx2.m53591g(protoBuf$PackageFragment, "proto");
        vx2.m53591g(t24, "nameResolver");
        vx2.m53591g(o10, "metadataVersion");
        vx2.m53591g(rc2, "classSource");
        this.f45187a = t24;
        this.f45188b = o10;
        this.f45189c = rc2;
        List<ProtoBuf$Class> class_List = protoBuf$PackageFragment.getClass_List();
        vx2.m53590f(class_List, "proto.class_List");
        LinkedHashMap linkedHashMap = new LinkedHashMap(d75.m43382d(ao3.m31893e(dk0.m43495u(class_List, 10)), 16));
        for (T next : class_List) {
            linkedHashMap.put(v24.m73043a(this.f45187a, ((ProtoBuf$Class) next).getFqName()), next);
        }
        this.f45190d = linkedHashMap;
    }

    /* renamed from: a */
    public gf0 mo52195a(nf0 nf0) {
        vx2.m53591g(nf0, "classId");
        ProtoBuf$Class protoBuf$Class = this.f45190d.get(nf0);
        if (protoBuf$Class == null) {
            return null;
        }
        return new gf0(this.f45187a, protoBuf$Class, this.f45188b, this.f45189c.invoke(nf0));
    }

    /* renamed from: b */
    public final Collection<nf0> mo66366b() {
        return this.f45190d.keySet();
    }
}
