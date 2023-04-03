package p000;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.module.SimpleModule;
import org.web3j.protocol.deserializer.RawResponseDeserializer;

/* renamed from: ef4 */
/* compiled from: ObjectMapperFactory */
public class ef4 {
    private static final ObjectMapper DEFAULT_OBJECT_MAPPER;

    /* renamed from: ef4$a */
    /* compiled from: ObjectMapperFactory */
    public static class C7046a extends p00 {
        public o43<?> modifyDeserializer(DeserializationConfig deserializationConfig, n00 n00, o43<?> o43) {
            if (ag5.class.isAssignableFrom(n00.mo23460r())) {
                return new RawResponseDeserializer(o43);
            }
            return o43;
        }
    }

    static {
        ObjectMapper objectMapper = new ObjectMapper();
        DEFAULT_OBJECT_MAPPER = objectMapper;
        configureObjectMapper(objectMapper, false);
    }

    private static ObjectMapper configureObjectMapper(ObjectMapper objectMapper, boolean z) {
        if (z) {
            SimpleModule simpleModule = new SimpleModule();
            simpleModule.setDeserializerModifier(new C7046a());
            objectMapper.registerModule(simpleModule);
        }
        objectMapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return objectMapper;
    }

    public static ObjectMapper getObjectMapper() {
        return getObjectMapper(false);
    }

    public static ObjectReader getObjectReader() {
        return DEFAULT_OBJECT_MAPPER.reader();
    }

    public static ObjectMapper getObjectMapper(boolean z) {
        if (!z) {
            return DEFAULT_OBJECT_MAPPER;
        }
        return configureObjectMapper(new ObjectMapper(), true);
    }
}
