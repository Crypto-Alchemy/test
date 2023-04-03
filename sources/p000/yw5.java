package p000;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializationConfig;

/* renamed from: yw5 */
/* compiled from: SerializerFactory */
public abstract class yw5 {
    @Deprecated
    public abstract y63<Object> createKeySerializer(SerializationConfig serializationConfig, JavaType javaType, y63<Object> y63) throws JsonMappingException;

    public y63<Object> createKeySerializer(zw5 zw5, JavaType javaType, y63<Object> y63) throws JsonMappingException {
        return createKeySerializer(zw5.getConfig(), javaType, y63);
    }

    public abstract y63<Object> createSerializer(zw5 zw5, JavaType javaType) throws JsonMappingException;

    public abstract m17 createTypeSerializer(SerializationConfig serializationConfig, JavaType javaType) throws JsonMappingException;

    public abstract yw5 withAdditionalKeySerializers(ax5 ax5);

    public abstract yw5 withAdditionalSerializers(ax5 ax5);

    public abstract yw5 withSerializerModifier(s00 s00);
}
