package p000;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import java.util.Collection;
import p000.l17;

/* renamed from: l17 */
/* compiled from: TypeResolverBuilder */
public interface l17<T extends l17<T>> {
    j07 buildTypeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, Collection<NamedType> collection);

    m17 buildTypeSerializer(SerializationConfig serializationConfig, JavaType javaType, Collection<NamedType> collection);

    T defaultImpl(Class<?> cls);

    Class<?> getDefaultImpl();

    T inclusion(JsonTypeInfo.C1971As as);

    T init(JsonTypeInfo.C1972Id id, r07 r07);

    T typeIdVisibility(boolean z);

    T typeProperty(String str);

    T withDefaultImpl(Class<?> cls);
}
