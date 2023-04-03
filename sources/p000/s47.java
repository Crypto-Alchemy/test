package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.C6177b;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.reflect.jvm.internal.impl.builtins.C7395c;
import kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType;
import kotlin.reflect.jvm.internal.impl.builtins.UnsignedType;
import org.web3j.ens.contracts.generated.PublicResolver;

/* renamed from: s47 */
/* compiled from: UnsignedType.kt */
public final class s47 {

    /* renamed from: a */
    public static final s47 f44525a = new s47();

    /* renamed from: b */
    public static final Set<r24> f44526b;

    /* renamed from: c */
    public static final Set<r24> f44527c;

    /* renamed from: d */
    public static final HashMap<nf0, nf0> f44528d = new HashMap<>();

    /* renamed from: e */
    public static final HashMap<nf0, nf0> f44529e = new HashMap<>();

    /* renamed from: f */
    public static final HashMap<UnsignedArrayType, r24> f44530f = C6177b.m47363k(wy6.m54142a(UnsignedArrayType.UBYTEARRAY, r24.m71445h("ubyteArrayOf")), wy6.m54142a(UnsignedArrayType.USHORTARRAY, r24.m71445h("ushortArrayOf")), wy6.m54142a(UnsignedArrayType.UINTARRAY, r24.m71445h("uintArrayOf")), wy6.m54142a(UnsignedArrayType.ULONGARRAY, r24.m71445h("ulongArrayOf")));

    /* renamed from: g */
    public static final Set<r24> f44531g;

    static {
        UnsignedType[] values = UnsignedType.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (UnsignedType typeName : values) {
            arrayList.add(typeName.getTypeName());
        }
        f44526b = CollectionsKt___CollectionsKt.m47315O0(arrayList);
        UnsignedArrayType[] values2 = UnsignedArrayType.values();
        ArrayList arrayList2 = new ArrayList(values2.length);
        for (UnsignedArrayType typeName2 : values2) {
            arrayList2.add(typeName2.getTypeName());
        }
        f44527c = CollectionsKt___CollectionsKt.m47315O0(arrayList2);
        UnsignedType[] values3 = UnsignedType.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (UnsignedType arrayClassId : values3) {
            linkedHashSet.add(arrayClassId.getArrayClassId().mo62681j());
        }
        f44531g = linkedHashSet;
        for (UnsignedType unsignedType : UnsignedType.values()) {
            f44528d.put(unsignedType.getArrayClassId(), unsignedType.getClassId());
            f44529e.put(unsignedType.getClassId(), unsignedType.getArrayClassId());
        }
    }

    /* renamed from: d */
    public static final boolean m71878d(xc3 xc3) {
        eg0 d;
        vx2.m53591g(xc3, "type");
        if (!x17.m73838v(xc3) && (d = xc3.mo51134H0().mo51180d()) != null) {
            return f44525a.mo65820c(d);
        }
        return false;
    }

    /* renamed from: a */
    public final nf0 mo65818a(nf0 nf0) {
        vx2.m53591g(nf0, "arrayClassId");
        return f44528d.get(nf0);
    }

    /* renamed from: b */
    public final boolean mo65819b(r24 r24) {
        vx2.m53591g(r24, PublicResolver.FUNC_NAME);
        return f44531g.contains(r24);
    }

    /* renamed from: c */
    public final boolean mo65820c(d31 d31) {
        vx2.m53591g(d31, "descriptor");
        d31 b = d31.mo51119b();
        if (!(b instanceof fk4) || !vx2.m53586b(((fk4) b).mo51711e(), C7395c.f39113r) || !f44526b.contains(d31.getName())) {
            return false;
        }
        return true;
    }
}
