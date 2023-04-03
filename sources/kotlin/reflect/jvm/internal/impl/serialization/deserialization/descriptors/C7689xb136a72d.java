package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;

/* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$NoReorderImplementation$typeAliasesByName$2 */
/* compiled from: DeserializedMemberScope.kt */
public final class C7689xb136a72d extends Lambda implements pc2<Map<r24, ? extends hz6>> {
    public final /* synthetic */ DeserializedMemberScope.NoReorderImplementation this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7689xb136a72d(DeserializedMemberScope.NoReorderImplementation noReorderImplementation) {
        super(0);
        this.this$0 = noReorderImplementation;
    }

    public final Map<r24, hz6> invoke() {
        List o = this.this$0.mo55208C();
        LinkedHashMap linkedHashMap = new LinkedHashMap(d75.m43382d(ao3.m31893e(dk0.m43495u(o, 10)), 16));
        for (Object next : o) {
            r24 name = ((hz6) next).getName();
            vx2.m53590f(name, "it.name");
            linkedHashMap.put(name, next);
        }
        return linkedHashMap;
    }
}
