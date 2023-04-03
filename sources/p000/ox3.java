package p000;

import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import org.koin.core.error.DefinitionOverrideException;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\u001a \u0010\u0006\u001a\u00020\u00052\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0001\u001a-\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0010¨\u0006\r"}, mo44877d2 = {"Lzv2;", "factory", "", "Lorg/koin/core/definition/IndexKey;", "mapping", "Lr37;", "c", "", "Ldx3;", "modules", "", "newModules", "a", "koin-core"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: ox3 */
/* compiled from: Module.kt */
public final class ox3 {
    /* renamed from: a */
    public static final Set<dx3> m70800a(List<dx3> list, Set<dx3> set) {
        Set<T> set2;
        List<T> list2;
        vx2.m53591g(list, "modules");
        vx2.m53591g(set, "newModules");
        List<T> list3 = list;
        Set<dx3> set3 = set;
        while (!list3.isEmpty()) {
            dx3 dx3 = (dx3) CollectionsKt___CollectionsKt.m47329Z(list3);
            if (dx3 != null) {
                List<T> subList = list3.subList(1, list3.size());
                if (dx3.mo51297b().isEmpty()) {
                    list2 = subList;
                    set2 = oy5.m49612l(set3, dx3);
                } else {
                    list2 = CollectionsKt___CollectionsKt.m47350u0(dx3.mo51297b(), subList);
                    set2 = oy5.m49612l(set3, dx3);
                }
                set3 = set2;
                list3 = list2;
            } else {
                throw new IllegalStateException("Flatten - No head element in list".toString());
            }
        }
        return set3;
    }

    /* renamed from: b */
    public static /* synthetic */ Set m70801b(List list, Set set, int i, Object obj) {
        if ((i & 2) != 0) {
            set = ny5.m49095e();
        }
        return m70800a(list, set);
    }

    /* renamed from: c */
    public static final void m70802c(zv2<?> zv2, String str) {
        vx2.m53591g(zv2, "factory");
        vx2.m53591g(str, "mapping");
        throw new DefinitionOverrideException("Already existing definition for " + zv2.mo67401c() + " at " + str);
    }
}
