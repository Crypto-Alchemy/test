package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;

/* compiled from: ConstantValueFactory.kt */
public final class ConstantValueFactory {

    /* renamed from: a */
    public static final ConstantValueFactory f40088a = new ConstantValueFactory();

    /* renamed from: a */
    public final C9313sq mo55064a(List<? extends fq0<?>> list, xc3 xc3) {
        vx2.m53591g(list, "value");
        vx2.m53591g(xc3, "type");
        return new C9313sq(list, new ConstantValueFactory$createArrayValue$1(xc3));
    }

    /* renamed from: b */
    public final C9313sq mo55065b(List<?> list, PrimitiveType primitiveType) {
        List<T> K0 = CollectionsKt___CollectionsKt.m47311K0(list);
        ArrayList arrayList = new ArrayList();
        for (T c : K0) {
            fq0<?> c2 = mo55066c(c);
            if (c2 != null) {
                arrayList.add(c2);
            }
        }
        return new C9313sq(arrayList, new ConstantValueFactory$createArrayValue$3(primitiveType));
    }

    /* renamed from: c */
    public final fq0<?> mo55066c(Object obj) {
        if (obj instanceof Byte) {
            return new d70(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new u06(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new ax2(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new jl3(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            return new vd0(((Character) obj).charValue());
        }
        if (obj instanceof Float) {
            return new u42(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new qi1(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return new r30(((Boolean) obj).booleanValue());
        }
        if (obj instanceof String) {
            return new lb6((String) obj);
        }
        if (obj instanceof byte[]) {
            return mo55065b(ArraysKt___ArraysKt.m47285k0((byte[]) obj), PrimitiveType.BYTE);
        }
        if (obj instanceof short[]) {
            return mo55065b(ArraysKt___ArraysKt.m47292r0((short[]) obj), PrimitiveType.SHORT);
        }
        if (obj instanceof int[]) {
            return mo55065b(ArraysKt___ArraysKt.m47289o0((int[]) obj), PrimitiveType.INT);
        }
        if (obj instanceof long[]) {
            return mo55065b(ArraysKt___ArraysKt.m47290p0((long[]) obj), PrimitiveType.LONG);
        }
        if (obj instanceof char[]) {
            return mo55065b(ArraysKt___ArraysKt.m47286l0((char[]) obj), PrimitiveType.CHAR);
        }
        if (obj instanceof float[]) {
            return mo55065b(ArraysKt___ArraysKt.m47288n0((float[]) obj), PrimitiveType.FLOAT);
        }
        if (obj instanceof double[]) {
            return mo55065b(ArraysKt___ArraysKt.m47287m0((double[]) obj), PrimitiveType.DOUBLE);
        }
        if (obj instanceof boolean[]) {
            return mo55065b(ArraysKt___ArraysKt.m47293s0((boolean[]) obj), PrimitiveType.BOOLEAN);
        }
        if (obj == null) {
            return new zb4();
        }
        return null;
    }
}
