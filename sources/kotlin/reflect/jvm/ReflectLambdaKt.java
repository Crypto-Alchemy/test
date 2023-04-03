package kotlin.reflect.jvm;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.C7375a;
import kotlin.reflect.jvm.internal.KFunctionImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.C7428e;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¨\u0006\u0004"}, mo44877d2 = {"R", "Lnd2;", "Lz83;", "a", "kotlin-reflection"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* compiled from: reflectLambda.kt */
public final class ReflectLambdaKt {
    /* renamed from: a */
    public static final <R> z83<R> m20957a(nd2<? extends R> nd2) {
        boolean z;
        vx2.m53591g(nd2, "<this>");
        Metadata metadata = (Metadata) nd2.getClass().getAnnotation(Metadata.class);
        if (metadata == null) {
            return null;
        }
        String[] d1 = metadata.mo44876d1();
        boolean z2 = true;
        if (d1.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            d1 = null;
        }
        if (d1 == null) {
            return null;
        }
        Pair<d83, ProtoBuf$Function> j = i83.m58873j(d1, metadata.mo44877d2());
        d83 component1 = j.component1();
        ProtoBuf$Function component2 = j.component2();
        int[] mv = metadata.mo44879mv();
        if ((metadata.mo44881xi() & 8) == 0) {
            z2 = false;
        }
        c83 c83 = new c83(mv, z2);
        Class<?> cls = nd2.getClass();
        ProtoBuf$TypeTable typeTable = component2.getTypeTable();
        vx2.m53590f(typeTable, "proto.typeTable");
        return new KFunctionImpl(C7375a.f39040g, (C7428e) y67.m74278h(cls, component2, component1, new w17(typeTable), c83, ReflectLambdaKt$reflect$descriptor$1.INSTANCE));
    }
}
