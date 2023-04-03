package p000;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;

/* renamed from: ax5 */
/* compiled from: Serializers */
public interface ax5 {

    /* renamed from: ax5$a */
    /* compiled from: Serializers */
    public static class C1597a implements ax5 {
        public y63<?> findArraySerializer(SerializationConfig serializationConfig, ArrayType arrayType, n00 n00, m17 m17, y63<Object> y63) {
            return null;
        }

        public y63<?> findCollectionLikeSerializer(SerializationConfig serializationConfig, CollectionLikeType collectionLikeType, n00 n00, m17 m17, y63<Object> y63) {
            return null;
        }

        public y63<?> findCollectionSerializer(SerializationConfig serializationConfig, CollectionType collectionType, n00 n00, m17 m17, y63<Object> y63) {
            return null;
        }

        public y63<?> findMapLikeSerializer(SerializationConfig serializationConfig, MapLikeType mapLikeType, n00 n00, y63<Object> y63, m17 m17, y63<Object> y632) {
            return null;
        }

        public y63<?> findMapSerializer(SerializationConfig serializationConfig, MapType mapType, n00 n00, y63<Object> y63, m17 m17, y63<Object> y632) {
            return null;
        }

        public y63<?> findReferenceSerializer(SerializationConfig serializationConfig, ReferenceType referenceType, n00 n00, m17 m17, y63<Object> y63) {
            return findSerializer(serializationConfig, referenceType, n00);
        }

        public y63<?> findSerializer(SerializationConfig serializationConfig, JavaType javaType, n00 n00) {
            return null;
        }
    }

    y63<?> findArraySerializer(SerializationConfig serializationConfig, ArrayType arrayType, n00 n00, m17 m17, y63<Object> y63);

    y63<?> findCollectionLikeSerializer(SerializationConfig serializationConfig, CollectionLikeType collectionLikeType, n00 n00, m17 m17, y63<Object> y63);

    y63<?> findCollectionSerializer(SerializationConfig serializationConfig, CollectionType collectionType, n00 n00, m17 m17, y63<Object> y63);

    y63<?> findMapLikeSerializer(SerializationConfig serializationConfig, MapLikeType mapLikeType, n00 n00, y63<Object> y63, m17 m17, y63<Object> y632);

    y63<?> findMapSerializer(SerializationConfig serializationConfig, MapType mapType, n00 n00, y63<Object> y63, m17 m17, y63<Object> y632);

    y63<?> findReferenceSerializer(SerializationConfig serializationConfig, ReferenceType referenceType, n00 n00, m17 m17, y63<Object> y63);

    y63<?> findSerializer(SerializationConfig serializationConfig, JavaType javaType, n00 n00);
}
