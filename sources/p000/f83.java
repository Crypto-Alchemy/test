package p000;

import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;

/* renamed from: f83 */
/* compiled from: JvmNameResolver.kt */
public final class f83 {
    /* renamed from: a */
    public static final List<JvmProtoBuf.StringTableTypes.Record> m57635a(List<JvmProtoBuf.StringTableTypes.Record> list) {
        vx2.m53591g(list, "<this>");
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(list.size());
        for (JvmProtoBuf.StringTableTypes.Record next : list) {
            int range = next.getRange();
            for (int i = 0; i < range; i++) {
                arrayList.add(next);
            }
        }
        arrayList.trimToSize();
        return arrayList;
    }
}
