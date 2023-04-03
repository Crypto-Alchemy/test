package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.C7428e;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;

/* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$NoReorderImplementation$functionsByName$2 */
/* compiled from: DeserializedMemberScope.kt */
public final class C7687x615757a4 extends Lambda implements pc2<Map<r24, ? extends List<? extends C7428e>>> {
    public final /* synthetic */ DeserializedMemberScope.NoReorderImplementation this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7687x615757a4(DeserializedMemberScope.NoReorderImplementation noReorderImplementation) {
        super(0);
        this.this$0 = noReorderImplementation;
    }

    public final Map<r24, List<C7428e>> invoke() {
        List m = this.this$0.mo55206A();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object next : m) {
            r24 name = ((C7428e) next).getName();
            vx2.m53590f(name, "it.name");
            Object obj = linkedHashMap.get(name);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(name, obj);
            }
            ((List) obj).add(next);
        }
        return linkedHashMap;
    }
}
