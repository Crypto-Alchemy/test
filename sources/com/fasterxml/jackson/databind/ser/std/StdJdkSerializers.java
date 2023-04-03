package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.URL;
import java.util.Collection;
import java.util.Currency;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

public class StdJdkSerializers {

    public static class AtomicBooleanSerializer extends StdScalarSerializer<AtomicBoolean> {
        public AtomicBooleanSerializer() {
            super(AtomicBoolean.class, false);
        }

        public void acceptJsonFormatVisitor(t43 t43, JavaType javaType) throws JsonMappingException {
            t43.mo26060o(javaType);
        }

        public g53 getSchema(zw5 zw5, Type type) {
            return createSchemaNode("boolean", true);
        }

        public void serialize(AtomicBoolean atomicBoolean, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
            jsonGenerator.mo13849P(atomicBoolean.get());
        }
    }

    public static class AtomicIntegerSerializer extends StdScalarSerializer<AtomicInteger> {
        public AtomicIntegerSerializer() {
            super(AtomicInteger.class, false);
        }

        public void acceptJsonFormatVisitor(t43 t43, JavaType javaType) throws JsonMappingException {
            visitIntFormat(t43, javaType, JsonParser.NumberType.INT);
        }

        public g53 getSchema(zw5 zw5, Type type) {
            return createSchemaNode("integer", true);
        }

        public void serialize(AtomicInteger atomicInteger, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
            jsonGenerator.mo13880h0(atomicInteger.get());
        }
    }

    public static class AtomicLongSerializer extends StdScalarSerializer<AtomicLong> {
        public AtomicLongSerializer() {
            super(AtomicLong.class, false);
        }

        public void acceptJsonFormatVisitor(t43 t43, JavaType javaType) throws JsonMappingException {
            visitIntFormat(t43, javaType, JsonParser.NumberType.LONG);
        }

        public g53 getSchema(zw5 zw5, Type type) {
            return createSchemaNode("integer", true);
        }

        public void serialize(AtomicLong atomicLong, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
            jsonGenerator.mo13882i0(atomicLong.get());
        }
    }

    /* renamed from: a */
    public static Collection<Map.Entry<Class<?>, Object>> m14318a() {
        HashMap hashMap = new HashMap();
        hashMap.put(URL.class, new ToStringSerializer(URL.class));
        hashMap.put(URI.class, new ToStringSerializer(URI.class));
        hashMap.put(Currency.class, new ToStringSerializer(Currency.class));
        hashMap.put(UUID.class, new UUIDSerializer());
        hashMap.put(Pattern.class, new ToStringSerializer(Pattern.class));
        hashMap.put(Locale.class, new ToStringSerializer(Locale.class));
        hashMap.put(AtomicBoolean.class, AtomicBooleanSerializer.class);
        hashMap.put(AtomicInteger.class, AtomicIntegerSerializer.class);
        hashMap.put(AtomicLong.class, AtomicLongSerializer.class);
        hashMap.put(File.class, FileSerializer.class);
        hashMap.put(Class.class, ClassSerializer.class);
        NullSerializer nullSerializer = NullSerializer.instance;
        hashMap.put(Void.class, nullSerializer);
        hashMap.put(Void.TYPE, nullSerializer);
        return hashMap.entrySet();
    }
}
