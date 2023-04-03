package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;

/* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$NoReorderImplementation$propertiesByName$2 */
/* compiled from: DeserializedMemberScope.kt */
public final class C7688xd0ec09aa extends Lambda implements pc2<Map<r24, ? extends List<? extends fx4>>> {
    public final /* synthetic */ DeserializedMemberScope.NoReorderImplementation this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7688xd0ec09aa(DeserializedMemberScope.NoReorderImplementation noReorderImplementation) {
        super(0);
        this.this$0 = noReorderImplementation;
    }

    public final Map<r24, List<fx4>> invoke() {
        List n = this.this$0.mo55207B();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object next : n) {
            r24 name = ((fx4) next).getName();
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
