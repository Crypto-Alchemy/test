package p000;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;

/* renamed from: be1 */
/* compiled from: Deserializers */
public interface be1 {

    /* renamed from: be1$a */
    /* compiled from: Deserializers */
    public static abstract class C1623a implements be1 {
        public o43<?> findArrayDeserializer(ArrayType arrayType, DeserializationConfig deserializationConfig, n00 n00, j07 j07, o43<?> o43) throws JsonMappingException {
            return null;
        }

        public o43<?> findBeanDeserializer(JavaType javaType, DeserializationConfig deserializationConfig, n00 n00) throws JsonMappingException {
            return null;
        }

        public o43<?> findCollectionDeserializer(CollectionType collectionType, DeserializationConfig deserializationConfig, n00 n00, j07 j07, o43<?> o43) throws JsonMappingException {
            return null;
        }

        public o43<?> findCollectionLikeDeserializer(CollectionLikeType collectionLikeType, DeserializationConfig deserializationConfig, n00 n00, j07 j07, o43<?> o43) throws JsonMappingException {
            return null;
        }

        public o43<?> findEnumDeserializer(Class<?> cls, DeserializationConfig deserializationConfig, n00 n00) throws JsonMappingException {
            return null;
        }

        public o43<?> findMapDeserializer(MapType mapType, DeserializationConfig deserializationConfig, n00 n00, ha3 ha3, j07 j07, o43<?> o43) throws JsonMappingException {
            return null;
        }

        public o43<?> findMapLikeDeserializer(MapLikeType mapLikeType, DeserializationConfig deserializationConfig, n00 n00, ha3 ha3, j07 j07, o43<?> o43) throws JsonMappingException {
            return null;
        }

        public o43<?> findReferenceDeserializer(ReferenceType referenceType, DeserializationConfig deserializationConfig, n00 n00, j07 j07, o43<?> o43) throws JsonMappingException {
            return null;
        }

        public o43<?> findTreeNodeDeserializer(Class<? extends g53> cls, DeserializationConfig deserializationConfig, n00 n00) throws JsonMappingException {
            return null;
        }
    }

    o43<?> findArrayDeserializer(ArrayType arrayType, DeserializationConfig deserializationConfig, n00 n00, j07 j07, o43<?> o43) throws JsonMappingException;

    o43<?> findBeanDeserializer(JavaType javaType, DeserializationConfig deserializationConfig, n00 n00) throws JsonMappingException;

    o43<?> findCollectionDeserializer(CollectionType collectionType, DeserializationConfig deserializationConfig, n00 n00, j07 j07, o43<?> o43) throws JsonMappingException;

    o43<?> findCollectionLikeDeserializer(CollectionLikeType collectionLikeType, DeserializationConfig deserializationConfig, n00 n00, j07 j07, o43<?> o43) throws JsonMappingException;

    o43<?> findEnumDeserializer(Class<?> cls, DeserializationConfig deserializationConfig, n00 n00) throws JsonMappingException;

    o43<?> findMapDeserializer(MapType mapType, DeserializationConfig deserializationConfig, n00 n00, ha3 ha3, j07 j07, o43<?> o43) throws JsonMappingException;

    o43<?> findMapLikeDeserializer(MapLikeType mapLikeType, DeserializationConfig deserializationConfig, n00 n00, ha3 ha3, j07 j07, o43<?> o43) throws JsonMappingException;

    o43<?> findReferenceDeserializer(ReferenceType referenceType, DeserializationConfig deserializationConfig, n00 n00, j07 j07, o43<?> o43) throws JsonMappingException;

    o43<?> findTreeNodeDeserializer(Class<? extends g53> cls, DeserializationConfig deserializationConfig, n00 n00) throws JsonMappingException;
}
