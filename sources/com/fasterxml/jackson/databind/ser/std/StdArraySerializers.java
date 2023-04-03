package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;
import org.web3j.abi.datatypes.Utf8String;

public class StdArraySerializers {

    /* renamed from: a */
    public static final HashMap<String, y63<?>> f10123a;

    @zz2
    public static class BooleanArraySerializer extends ArraySerializerBase<boolean[]> {

        /* renamed from: d */
        public static final JavaType f10124d = TypeFactory.defaultInstance().uncheckedSimpleType(Boolean.class);

        public BooleanArraySerializer() {
            super(boolean[].class);
        }

        public y63<?> _withResolved(BeanProperty beanProperty, Boolean bool) {
            return new BooleanArraySerializer(this, beanProperty, bool);
        }

        public ContainerSerializer<?> _withValueTypeSerializer(m17 m17) {
            return this;
        }

        public void acceptJsonFormatVisitor(t43 t43, JavaType javaType) throws JsonMappingException {
            visitArrayFormat(t43, javaType, JsonFormatTypes.BOOLEAN);
        }

        public y63<?> getContentSerializer() {
            return null;
        }

        public JavaType getContentType() {
            return f10124d;
        }

        public g53 getSchema(zw5 zw5, Type type) {
            ObjectNode createSchemaNode = createSchemaNode("array", true);
            createSchemaNode.set("items", createSchemaNode("boolean"));
            return createSchemaNode;
        }

        public BooleanArraySerializer(BooleanArraySerializer booleanArraySerializer, BeanProperty beanProperty, Boolean bool) {
            super(booleanArraySerializer, beanProperty, bool);
        }

        public boolean hasSingleElement(boolean[] zArr) {
            return zArr.length == 1;
        }

        public boolean isEmpty(zw5 zw5, boolean[] zArr) {
            return zArr.length == 0;
        }

        public final void serialize(boolean[] zArr, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
            int length = zArr.length;
            if (length != 1 || !_shouldUnwrapSingle(zw5)) {
                jsonGenerator.mo13850P0(zArr, length);
                serializeContents(zArr, jsonGenerator, zw5);
                jsonGenerator.mo13853S();
                return;
            }
            serializeContents(zArr, jsonGenerator, zw5);
        }

        public void serializeContents(boolean[] zArr, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
            for (boolean P : zArr) {
                jsonGenerator.mo13849P(P);
            }
        }
    }

    @zz2
    public static class CharArraySerializer extends StdSerializer<char[]> {
        public CharArraySerializer() {
            super(char[].class);
        }

        /* renamed from: a */
        public final void mo16766a(JsonGenerator jsonGenerator, char[] cArr) throws IOException {
            int length = cArr.length;
            for (int i = 0; i < length; i++) {
                jsonGenerator.mo13862a1(cArr, i, 1);
            }
        }

        public void acceptJsonFormatVisitor(t43 t43, JavaType javaType) throws JsonMappingException {
            visitArrayFormat(t43, javaType, JsonFormatTypes.STRING);
        }

        public g53 getSchema(zw5 zw5, Type type) {
            ObjectNode createSchemaNode = createSchemaNode("array", true);
            ObjectNode createSchemaNode2 = createSchemaNode(Utf8String.TYPE_NAME);
            createSchemaNode2.put("type", Utf8String.TYPE_NAME);
            return createSchemaNode.set("items", createSchemaNode2);
        }

        public boolean isEmpty(zw5 zw5, char[] cArr) {
            return cArr.length == 0;
        }

        public void serialize(char[] cArr, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
            if (zw5.isEnabled(SerializationFeature.WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS)) {
                jsonGenerator.mo13850P0(cArr, cArr.length);
                mo16766a(jsonGenerator, cArr);
                jsonGenerator.mo13853S();
                return;
            }
            jsonGenerator.mo13862a1(cArr, 0, cArr.length);
        }

        public void serializeWithType(char[] cArr, JsonGenerator jsonGenerator, zw5 zw5, m17 m17) throws IOException {
            WritableTypeId writableTypeId;
            if (zw5.isEnabled(SerializationFeature.WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS)) {
                writableTypeId = m17.mo16712g(jsonGenerator, m17.mo23018d(cArr, JsonToken.START_ARRAY));
                mo16766a(jsonGenerator, cArr);
            } else {
                writableTypeId = m17.mo16712g(jsonGenerator, m17.mo23018d(cArr, JsonToken.VALUE_STRING));
                jsonGenerator.mo13862a1(cArr, 0, cArr.length);
            }
            m17.mo16713h(jsonGenerator, writableTypeId);
        }
    }

    @zz2
    public static class DoubleArraySerializer extends ArraySerializerBase<double[]> {

        /* renamed from: d */
        public static final JavaType f10125d = TypeFactory.defaultInstance().uncheckedSimpleType(Double.TYPE);

        public DoubleArraySerializer() {
            super(double[].class);
        }

        public y63<?> _withResolved(BeanProperty beanProperty, Boolean bool) {
            return new DoubleArraySerializer(this, beanProperty, bool);
        }

        public ContainerSerializer<?> _withValueTypeSerializer(m17 m17) {
            return this;
        }

        public void acceptJsonFormatVisitor(t43 t43, JavaType javaType) throws JsonMappingException {
            visitArrayFormat(t43, javaType, JsonFormatTypes.NUMBER);
        }

        public y63<?> getContentSerializer() {
            return null;
        }

        public JavaType getContentType() {
            return f10125d;
        }

        public g53 getSchema(zw5 zw5, Type type) {
            return createSchemaNode("array", true).set("items", createSchemaNode("number"));
        }

        public DoubleArraySerializer(DoubleArraySerializer doubleArraySerializer, BeanProperty beanProperty, Boolean bool) {
            super(doubleArraySerializer, beanProperty, bool);
        }

        public boolean hasSingleElement(double[] dArr) {
            return dArr.length == 1;
        }

        public boolean isEmpty(zw5 zw5, double[] dArr) {
            return dArr.length == 0;
        }

        public final void serialize(double[] dArr, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
            if (dArr.length != 1 || !_shouldUnwrapSingle(zw5)) {
                jsonGenerator.mo13835C(dArr, 0, dArr.length);
            } else {
                serializeContents(dArr, jsonGenerator, zw5);
            }
        }

        public void serializeContents(double[] dArr, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
            for (double e0 : dArr) {
                jsonGenerator.mo13872e0(e0);
            }
        }
    }

    @zz2
    public static class FloatArraySerializer extends TypedPrimitiveArraySerializer<float[]> {

        /* renamed from: d */
        public static final JavaType f10126d = TypeFactory.defaultInstance().uncheckedSimpleType(Float.TYPE);

        public FloatArraySerializer() {
            super(float[].class);
        }

        public y63<?> _withResolved(BeanProperty beanProperty, Boolean bool) {
            return new FloatArraySerializer(this, beanProperty, bool);
        }

        public void acceptJsonFormatVisitor(t43 t43, JavaType javaType) throws JsonMappingException {
            visitArrayFormat(t43, javaType, JsonFormatTypes.NUMBER);
        }

        public y63<?> getContentSerializer() {
            return null;
        }

        public JavaType getContentType() {
            return f10126d;
        }

        public g53 getSchema(zw5 zw5, Type type) {
            return createSchemaNode("array", true).set("items", createSchemaNode("number"));
        }

        public FloatArraySerializer(FloatArraySerializer floatArraySerializer, BeanProperty beanProperty, Boolean bool) {
            super(floatArraySerializer, beanProperty, bool);
        }

        public boolean hasSingleElement(float[] fArr) {
            return fArr.length == 1;
        }

        public boolean isEmpty(zw5 zw5, float[] fArr) {
            return fArr.length == 0;
        }

        public final void serialize(float[] fArr, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
            int length = fArr.length;
            if (length != 1 || !_shouldUnwrapSingle(zw5)) {
                jsonGenerator.mo13850P0(fArr, length);
                serializeContents(fArr, jsonGenerator, zw5);
                jsonGenerator.mo13853S();
                return;
            }
            serializeContents(fArr, jsonGenerator, zw5);
        }

        public void serializeContents(float[] fArr, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
            for (float g0 : fArr) {
                jsonGenerator.mo13877g0(g0);
            }
        }
    }

    @zz2
    public static class IntArraySerializer extends ArraySerializerBase<int[]> {

        /* renamed from: d */
        public static final JavaType f10127d = TypeFactory.defaultInstance().uncheckedSimpleType(Integer.TYPE);

        public IntArraySerializer() {
            super(int[].class);
        }

        public y63<?> _withResolved(BeanProperty beanProperty, Boolean bool) {
            return new IntArraySerializer(this, beanProperty, bool);
        }

        public ContainerSerializer<?> _withValueTypeSerializer(m17 m17) {
            return this;
        }

        public void acceptJsonFormatVisitor(t43 t43, JavaType javaType) throws JsonMappingException {
            visitArrayFormat(t43, javaType, JsonFormatTypes.INTEGER);
        }

        public y63<?> getContentSerializer() {
            return null;
        }

        public JavaType getContentType() {
            return f10127d;
        }

        public g53 getSchema(zw5 zw5, Type type) {
            return createSchemaNode("array", true).set("items", createSchemaNode("integer"));
        }

        public IntArraySerializer(IntArraySerializer intArraySerializer, BeanProperty beanProperty, Boolean bool) {
            super(intArraySerializer, beanProperty, bool);
        }

        public boolean hasSingleElement(int[] iArr) {
            return iArr.length == 1;
        }

        public boolean isEmpty(zw5 zw5, int[] iArr) {
            return iArr.length == 0;
        }

        public final void serialize(int[] iArr, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
            if (iArr.length != 1 || !_shouldUnwrapSingle(zw5)) {
                jsonGenerator.mo13839G(iArr, 0, iArr.length);
            } else {
                serializeContents(iArr, jsonGenerator, zw5);
            }
        }

        public void serializeContents(int[] iArr, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
            for (int h0 : iArr) {
                jsonGenerator.mo13880h0(h0);
            }
        }
    }

    @zz2
    public static class LongArraySerializer extends TypedPrimitiveArraySerializer<long[]> {

        /* renamed from: d */
        public static final JavaType f10128d = TypeFactory.defaultInstance().uncheckedSimpleType(Long.TYPE);

        public LongArraySerializer() {
            super(long[].class);
        }

        public y63<?> _withResolved(BeanProperty beanProperty, Boolean bool) {
            return new LongArraySerializer(this, beanProperty, bool);
        }

        public void acceptJsonFormatVisitor(t43 t43, JavaType javaType) throws JsonMappingException {
            visitArrayFormat(t43, javaType, JsonFormatTypes.NUMBER);
        }

        public y63<?> getContentSerializer() {
            return null;
        }

        public JavaType getContentType() {
            return f10128d;
        }

        public g53 getSchema(zw5 zw5, Type type) {
            return createSchemaNode("array", true).set("items", createSchemaNode("number", true));
        }

        public LongArraySerializer(LongArraySerializer longArraySerializer, BeanProperty beanProperty, Boolean bool) {
            super(longArraySerializer, beanProperty, bool);
        }

        public boolean hasSingleElement(long[] jArr) {
            return jArr.length == 1;
        }

        public boolean isEmpty(zw5 zw5, long[] jArr) {
            return jArr.length == 0;
        }

        public final void serialize(long[] jArr, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
            if (jArr.length != 1 || !_shouldUnwrapSingle(zw5)) {
                jsonGenerator.mo13841I(jArr, 0, jArr.length);
            } else {
                serializeContents(jArr, jsonGenerator, zw5);
            }
        }

        public void serializeContents(long[] jArr, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
            for (long i0 : jArr) {
                jsonGenerator.mo13882i0(i0);
            }
        }
    }

    @zz2
    public static class ShortArraySerializer extends TypedPrimitiveArraySerializer<short[]> {

        /* renamed from: d */
        public static final JavaType f10129d = TypeFactory.defaultInstance().uncheckedSimpleType(Short.TYPE);

        public ShortArraySerializer() {
            super(short[].class);
        }

        public y63<?> _withResolved(BeanProperty beanProperty, Boolean bool) {
            return new ShortArraySerializer(this, beanProperty, bool);
        }

        public void acceptJsonFormatVisitor(t43 t43, JavaType javaType) throws JsonMappingException {
            visitArrayFormat(t43, javaType, JsonFormatTypes.INTEGER);
        }

        public y63<?> getContentSerializer() {
            return null;
        }

        public JavaType getContentType() {
            return f10129d;
        }

        public g53 getSchema(zw5 zw5, Type type) {
            return createSchemaNode("array", true).set("items", createSchemaNode("integer"));
        }

        public ShortArraySerializer(ShortArraySerializer shortArraySerializer, BeanProperty beanProperty, Boolean bool) {
            super(shortArraySerializer, beanProperty, bool);
        }

        public boolean hasSingleElement(short[] sArr) {
            return sArr.length == 1;
        }

        public boolean isEmpty(zw5 zw5, short[] sArr) {
            return sArr.length == 0;
        }

        public final void serialize(short[] sArr, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
            int length = sArr.length;
            if (length != 1 || !_shouldUnwrapSingle(zw5)) {
                jsonGenerator.mo13850P0(sArr, length);
                serializeContents(sArr, jsonGenerator, zw5);
                jsonGenerator.mo13853S();
                return;
            }
            serializeContents(sArr, jsonGenerator, zw5);
        }

        public void serializeContents(short[] sArr, JsonGenerator jsonGenerator, zw5 zw5) throws IOException {
            for (short h0 : sArr) {
                jsonGenerator.mo13880h0(h0);
            }
        }
    }

    public static abstract class TypedPrimitiveArraySerializer<T> extends ArraySerializerBase<T> {
        public TypedPrimitiveArraySerializer(Class<T> cls) {
            super(cls);
        }

        public final ContainerSerializer<?> _withValueTypeSerializer(m17 m17) {
            return this;
        }

        public TypedPrimitiveArraySerializer(TypedPrimitiveArraySerializer<T> typedPrimitiveArraySerializer, BeanProperty beanProperty, Boolean bool) {
            super(typedPrimitiveArraySerializer, beanProperty, bool);
        }
    }

    static {
        HashMap<String, y63<?>> hashMap = new HashMap<>();
        f10123a = hashMap;
        hashMap.put(boolean[].class.getName(), new BooleanArraySerializer());
        hashMap.put(byte[].class.getName(), new ByteArraySerializer());
        hashMap.put(char[].class.getName(), new CharArraySerializer());
        hashMap.put(short[].class.getName(), new ShortArraySerializer());
        hashMap.put(int[].class.getName(), new IntArraySerializer());
        hashMap.put(long[].class.getName(), new LongArraySerializer());
        hashMap.put(float[].class.getName(), new FloatArraySerializer());
        hashMap.put(double[].class.getName(), new DoubleArraySerializer());
    }

    /* renamed from: a */
    public static y63<?> m14316a(Class<?> cls) {
        return f10123a.get(cls.getName());
    }
}
