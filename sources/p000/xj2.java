package p000;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Ref$BooleanRef;
import p000.ae1;
import p000.vw5;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\u000e\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003\u001a0\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\b\b\u0000\u0010\u0007*\u00020\u00062\u0018\u0010\u000b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0004\u0012\u00020\n0\b\u001a,\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\b\b\u0000\u0010\u0007*\u00020\u00062\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00018\u00000\b¨\u0006\u0012"}, mo44877d2 = {"Ljava/lang/reflect/ParameterizedType;", "", "a", "Ljava/lang/reflect/Type;", "type", "d", "", "T", "Lkotlin/Function1;", "Lvw5;", "Lcom/google/gson/JsonElement;", "serializer", "Lcom/google/gson/JsonSerializer;", "c", "Lae1;", "deserializer", "Lcom/google/gson/JsonDeserializer;", "b", "kotson_main"}, mo44878k = 2, mo44879mv = {1, 4, 0})
/* renamed from: xj2 */
/* compiled from: GsonBuilder.kt */
public final class xj2 {

    @Metadata(mo44875bv = {1, 0, 0}, mo44876d1 = {"\u0000 \n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00042\u000e\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00070\u00072\u000e\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\t0\tH\n¢\u0006\u0004\b\n\u0010\u000b"}, mo44877d2 = {"<anonymous>", "T", "", "json", "Lcom/google/gson/JsonElement;", "kotlin.jvm.PlatformType", "type", "Ljava/lang/reflect/Type;", "context", "Lcom/google/gson/JsonDeserializationContext;", "deserialize", "(Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;Lcom/google/gson/JsonDeserializationContext;)Ljava/lang/Object;"}, mo44878k = 3, mo44879mv = {1, 1, 1})
    /* renamed from: xj2$a */
    /* compiled from: GsonBuilder.kt */
    public static final class C3608a<T> implements JsonDeserializer<T> {

        /* renamed from: a */
        public final /* synthetic */ rc2 f19857a;

        public C3608a(rc2 rc2) {
            this.f19857a = rc2;
        }

        public final T deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            rc2 rc2 = this.f19857a;
            vx2.m53587c(jsonElement, "json");
            vx2.m53587c(type, "type");
            vx2.m53587c(jsonDeserializationContext, "context");
            return rc2.invoke(new ae1(jsonElement, type, new ae1.C0018a(jsonDeserializationContext)));
        }
    }

    @Metadata(mo44875bv = {1, 0, 0}, mo44876d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u000e\u0010\u0004\u001a\n \u0005*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00070\u00072\u000e\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\t0\tH\n¢\u0006\u0004\b\n\u0010\u000b"}, mo44877d2 = {"<anonymous>", "Lcom/google/gson/JsonElement;", "T", "", "src", "kotlin.jvm.PlatformType", "type", "Ljava/lang/reflect/Type;", "context", "Lcom/google/gson/JsonSerializationContext;", "serialize", "(Ljava/lang/Object;Ljava/lang/reflect/Type;Lcom/google/gson/JsonSerializationContext;)Lcom/google/gson/JsonElement;"}, mo44878k = 3, mo44879mv = {1, 1, 1})
    /* renamed from: xj2$b */
    /* compiled from: GsonBuilder.kt */
    public static final class C3609b<T> implements JsonSerializer<T> {

        /* renamed from: a */
        public final /* synthetic */ rc2 f19858a;

        public C3609b(rc2 rc2) {
            this.f19858a = rc2;
        }

        public final JsonElement serialize(T t, Type type, JsonSerializationContext jsonSerializationContext) {
            rc2 rc2 = this.f19858a;
            vx2.m53587c(t, "src");
            vx2.m53587c(type, "type");
            vx2.m53587c(jsonSerializationContext, "context");
            return (JsonElement) rc2.invoke(new vw5(t, type, new vw5.C3513a(jsonSerializationContext)));
        }
    }

    /* renamed from: a */
    public static final boolean m30136a(ParameterizedType parameterizedType) {
        Type type;
        vx2.m53592h(parameterizedType, "$receiver");
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        ref$BooleanRef.element = false;
        Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
        ref$BooleanRef2.element = false;
        Ref$BooleanRef ref$BooleanRef3 = new Ref$BooleanRef();
        ref$BooleanRef3.element = false;
        Type rawType = parameterizedType.getRawType();
        if (rawType != null) {
            TypeVariable[] typeParameters = ((Class) rawType).getTypeParameters();
            int i = 0;
            int i2 = 0;
            while (i < typeParameters.length) {
                TypeVariable typeVariable = typeParameters[i];
                int i3 = i2 + 1;
                Type type2 = parameterizedType.getActualTypeArguments()[i2];
                if (type2 instanceof WildcardType) {
                    Type[] bounds = typeVariable.getBounds();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= bounds.length) {
                            type = null;
                            break;
                        }
                        type = bounds[i4];
                        if (ArraysKt___ArraysKt.m47249D(((WildcardType) type2).getUpperBounds(), type)) {
                            break;
                        }
                        i4++;
                    }
                    if (type == null) {
                        ref$BooleanRef3.element = true;
                    } else if (vx2.m53586b(type, Object.class)) {
                        ref$BooleanRef.element = true;
                    } else {
                        ref$BooleanRef2.element = true;
                    }
                } else {
                    ref$BooleanRef3.element = true;
                }
                i++;
                i2 = i3;
            }
            boolean z = ref$BooleanRef.element;
            if (z && ref$BooleanRef3.element) {
                throw new IllegalArgumentException("Either none or all type parameters can be wildcard in " + parameterizedType);
            } else if (z || (ref$BooleanRef2.element && !ref$BooleanRef3.element)) {
                return true;
            } else {
                return false;
            }
        } else {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.Class<*>");
        }
    }

    /* renamed from: b */
    public static final <T> JsonDeserializer<T> m30137b(rc2<? super ae1, ? extends T> rc2) {
        vx2.m53592h(rc2, "deserializer");
        return new C3608a(rc2);
    }

    /* renamed from: c */
    public static final <T> JsonSerializer<T> m30138c(rc2<? super vw5<T>, ? extends JsonElement> rc2) {
        vx2.m53592h(rc2, "serializer");
        return new C3609b(rc2);
    }

    /* renamed from: d */
    public static final Type m30139d(Type type) {
        vx2.m53592h(type, "type");
        if (!(type instanceof ParameterizedType)) {
            return type;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        ArrayList<Type> arrayList = new ArrayList<>(actualTypeArguments.length);
        for (Type type2 : actualTypeArguments) {
            if (type2 instanceof WildcardType) {
                type2 = ((WildcardType) type2).getUpperBounds()[0];
            }
            arrayList.add(type2);
        }
        ArrayList arrayList2 = new ArrayList(dk0.m43495u(arrayList, 10));
        for (Type type3 : arrayList) {
            vx2.m53587c(type3, "it");
            arrayList2.add(m30139d(type3));
        }
        Object[] array = arrayList2.toArray(new Type[arrayList2.size()]);
        if (array != null) {
            Type[] typeArr = (Type[]) array;
            Type type4 = TypeToken.getParameterized(parameterizedType.getRawType(), (Type[]) Arrays.copyOf(typeArr, typeArr.length)).getType();
            vx2.m53587c(type4, "TypeToken.getParameteriz…rawType, *arguments).type");
            return type4;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }
}
