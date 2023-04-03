package kotlin.reflect.jvm.internal;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44876d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo44877d2 = {"<no name provided>", "Ljava/lang/reflect/Type;", "invoke"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: KTypeImpl.kt */
public final class KTypeImpl$arguments$2$1$type$1 extends Lambda implements pc2<Type> {

    /* renamed from: $i */
    public final /* synthetic */ int f39031$i;
    public final /* synthetic */ ef3<List<Type>> $parameterizedTypeArguments$delegate;
    public final /* synthetic */ KTypeImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KTypeImpl$arguments$2$1$type$1(KTypeImpl kTypeImpl, int i, ef3<? extends List<? extends Type>> ef3) {
        super(0);
        this.this$0 = kTypeImpl;
        this.f39031$i = i;
        this.$parameterizedTypeArguments$delegate = ef3;
    }

    public final Type invoke() {
        Type g = this.this$0.mo46045g();
        if (g instanceof Class) {
            Class cls = (Class) g;
            Class componentType = cls.isArray() ? cls.getComponentType() : Object.class;
            vx2.m53590f(componentType, "{\n                      …                        }");
            return componentType;
        } else if (g instanceof GenericArrayType) {
            if (this.f39031$i == 0) {
                Type genericComponentType = ((GenericArrayType) g).getGenericComponentType();
                vx2.m53590f(genericComponentType, "{\n                      …                        }");
                return genericComponentType;
            }
            throw new KotlinReflectionInternalError("Array type has been queried for a non-0th argument: " + this.this$0);
        } else if (g instanceof ParameterizedType) {
            Type type = (Type) KTypeImpl$arguments$2.m60050a(this.$parameterizedTypeArguments$delegate).get(this.f39031$i);
            if (type instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type;
                Type[] lowerBounds = wildcardType.getLowerBounds();
                vx2.m53590f(lowerBounds, "argument.lowerBounds");
                Type type2 = (Type) ArraysKt___ArraysKt.m47257I(lowerBounds);
                if (type2 == null) {
                    Type[] upperBounds = wildcardType.getUpperBounds();
                    vx2.m53590f(upperBounds, "argument.upperBounds");
                    type = (Type) ArraysKt___ArraysKt.m47256H(upperBounds);
                } else {
                    type = type2;
                }
            }
            vx2.m53590f(type, "{\n                      …                        }");
            return type;
        } else {
            throw new KotlinReflectionInternalError("Non-generic type has been queried for arguments: " + this.this$0);
        }
    }
}
