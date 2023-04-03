package p000;

import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable;

/* renamed from: w17 */
/* compiled from: TypeTable.kt */
public final class w17 {

    /* renamed from: a */
    public final List<ProtoBuf$Type> f45416a;

    public w17(ProtoBuf$TypeTable protoBuf$TypeTable) {
        vx2.m53591g(protoBuf$TypeTable, "typeTable");
        List<ProtoBuf$Type> typeList = protoBuf$TypeTable.getTypeList();
        if (protoBuf$TypeTable.hasFirstNullable()) {
            int firstNullable = protoBuf$TypeTable.getFirstNullable();
            List<ProtoBuf$Type> typeList2 = protoBuf$TypeTable.getTypeList();
            vx2.m53590f(typeList2, "typeTable.typeList");
            ArrayList arrayList = new ArrayList(dk0.m43495u(typeList2, 10));
            int i = 0;
            for (T next : typeList2) {
                int i2 = i + 1;
                if (i < 0) {
                    ck0.m33072t();
                }
                ProtoBuf$Type protoBuf$Type = (ProtoBuf$Type) next;
                if (i >= firstNullable) {
                    protoBuf$Type = protoBuf$Type.toBuilder().mo54350I(true).build();
                }
                arrayList.add(protoBuf$Type);
                i = i2;
            }
            typeList = arrayList;
        }
        vx2.m53590f(typeList, "run {\n        val origin… else originalTypes\n    }");
        this.f45416a = typeList;
    }

    /* renamed from: a */
    public final ProtoBuf$Type mo66609a(int i) {
        return this.f45416a.get(i);
    }
}
