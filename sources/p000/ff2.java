package p000;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.reflect.TypesJVMKt;
import okhttp3.HttpUrl;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016R\u0014\u0010\u000f\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, mo44877d2 = {"Lff2;", "Ljava/lang/reflect/GenericArrayType;", "", "Ljava/lang/reflect/Type;", "getGenericComponentType", "", "getTypeName", "other", "", "equals", "", "hashCode", "toString", "a", "Ljava/lang/reflect/Type;", "elementType", "<init>", "(Ljava/lang/reflect/Type;)V", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: ff2 */
/* compiled from: TypesJVM.kt */
public final class ff2 implements GenericArrayType, Type {

    /* renamed from: a */
    public final Type f28852a;

    public ff2(Type type) {
        vx2.m53591g(type, "elementType");
        this.f28852a = type;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof GenericArrayType) || !vx2.m53586b(getGenericComponentType(), ((GenericArrayType) obj).getGenericComponentType())) {
            return false;
        }
        return true;
    }

    public Type getGenericComponentType() {
        return this.f28852a;
    }

    public String getTypeName() {
        return TypesJVMKt.m47449h(this.f28852a) + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
    }

    public int hashCode() {
        return getGenericComponentType().hashCode();
    }

    public String toString() {
        return getTypeName();
    }
}
