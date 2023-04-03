package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Lambda;

/* compiled from: LazyJavaClassMemberScope.kt */
public final class LazyJavaClassMemberScope$enumEntryIndex$1 extends Lambda implements pc2<Map<r24, ? extends f13>> {
    public final /* synthetic */ LazyJavaClassMemberScope this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaClassMemberScope$enumEntryIndex$1(LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        super(0);
        this.this$0 = lazyJavaClassMemberScope;
    }

    public final Map<r24, f13> invoke() {
        Collection<f13> y = this.this$0.f39502o.mo53395y();
        ArrayList arrayList = new ArrayList();
        for (T next : y) {
            if (((f13) next).mo50846H()) {
                arrayList.add(next);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d75.m43382d(ao3.m31893e(dk0.m43495u(arrayList, 10)), 16));
        for (Object next2 : arrayList) {
            linkedHashMap.put(((f13) next2).getName(), next2);
        }
        return linkedHashMap;
    }
}
