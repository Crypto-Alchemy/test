package kotlin.reflect;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B+\u0012\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0011\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0016J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\n\u001a\u00020\tH\u0016J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\tH\u0016R\u0018\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001e"}, mo44877d2 = {"Lkotlin/reflect/ParameterizedTypeImpl;", "Ljava/lang/reflect/ParameterizedType;", "", "Ljava/lang/reflect/Type;", "getRawType", "getOwnerType", "", "getActualTypeArguments", "()[Ljava/lang/reflect/Type;", "", "getTypeName", "other", "", "equals", "", "hashCode", "toString", "Ljava/lang/Class;", "a", "Ljava/lang/Class;", "rawType", "d", "Ljava/lang/reflect/Type;", "ownerType", "e", "[Ljava/lang/reflect/Type;", "typeArguments", "", "<init>", "(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/List;)V", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: TypesJVM.kt */
public final class ParameterizedTypeImpl implements ParameterizedType, Type {

    /* renamed from: a */
    public final Class<?> f30988a;

    /* renamed from: d */
    public final Type f30989d;

    /* renamed from: e */
    public final Type[] f30990e;

    public ParameterizedTypeImpl(Class<?> cls, Type type, List<? extends Type> list) {
        vx2.m53591g(cls, "rawType");
        vx2.m53591g(list, "typeArguments");
        this.f30988a = cls;
        this.f30989d = type;
        this.f30990e = (Type[]) list.toArray(new Type[0]);
    }

    public boolean equals(Object obj) {
        if (obj instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            if (!vx2.m53586b(this.f30988a, parameterizedType.getRawType()) || !vx2.m53586b(this.f30989d, parameterizedType.getOwnerType()) || !Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public Type[] getActualTypeArguments() {
        return this.f30990e;
    }

    public Type getOwnerType() {
        return this.f30989d;
    }

    public Type getRawType() {
        return this.f30988a;
    }

    public String getTypeName() {
        boolean z;
        StringBuilder sb = new StringBuilder();
        Type type = this.f30989d;
        if (type != null) {
            sb.append(TypesJVMKt.m47449h(type));
            sb.append("$");
            sb.append(this.f30988a.getSimpleName());
        } else {
            sb.append(TypesJVMKt.m47449h(this.f30988a));
        }
        Type[] typeArr = this.f30990e;
        if (typeArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            ArraysKt___ArraysKt.m47267S(typeArr, sb, (CharSequence) null, "<", ">", 0, (CharSequence) null, ParameterizedTypeImpl$getTypeName$1$1.INSTANCE, 50, (Object) null);
        }
        String sb2 = sb.toString();
        vx2.m53590f(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public int hashCode() {
        int i;
        int hashCode = this.f30988a.hashCode();
        Type type = this.f30989d;
        if (type != null) {
            i = type.hashCode();
        } else {
            i = 0;
        }
        return (hashCode ^ i) ^ Arrays.hashCode(getActualTypeArguments());
    }

    public String toString() {
        return getTypeName();
    }
}
