package p000;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import java.util.List;

/* renamed from: p00 */
/* compiled from: BeanDeserializerModifier */
public abstract class p00 {
    public o43<?> modifyArrayDeserializer(DeserializationConfig deserializationConfig, ArrayType arrayType, n00 n00, o43<?> o43) {
        return o43;
    }

    public o43<?> modifyCollectionDeserializer(DeserializationConfig deserializationConfig, CollectionType collectionType, n00 n00, o43<?> o43) {
        return o43;
    }

    public o43<?> modifyCollectionLikeDeserializer(DeserializationConfig deserializationConfig, CollectionLikeType collectionLikeType, n00 n00, o43<?> o43) {
        return o43;
    }

    public o43<?> modifyDeserializer(DeserializationConfig deserializationConfig, n00 n00, o43<?> o43) {
        return o43;
    }

    public o43<?> modifyEnumDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, n00 n00, o43<?> o43) {
        return o43;
    }

    public ha3 modifyKeyDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, ha3 ha3) {
        return ha3;
    }

    public o43<?> modifyMapDeserializer(DeserializationConfig deserializationConfig, MapType mapType, n00 n00, o43<?> o43) {
        return o43;
    }

    public o43<?> modifyMapLikeDeserializer(DeserializationConfig deserializationConfig, MapLikeType mapLikeType, n00 n00, o43<?> o43) {
        return o43;
    }

    public o43<?> modifyReferenceDeserializer(DeserializationConfig deserializationConfig, ReferenceType referenceType, n00 n00, o43<?> o43) {
        return o43;
    }

    public o00 updateBuilder(DeserializationConfig deserializationConfig, n00 n00, o00 o00) {
        return o00;
    }

    public List<q00> updateProperties(DeserializationConfig deserializationConfig, n00 n00, List<q00> list) {
        return list;
    }
}
