package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.p009io.SerializedString;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.util.Iterator;
import java.util.Map;
import p000.t43;

public class UnwrappingBeanPropertyWriter extends BeanPropertyWriter {
    private static final long serialVersionUID = 1;
    public final NameTransformer _nameTransformer;

    /* renamed from: com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter$a */
    public class C2039a extends t43.C3329a {

        /* renamed from: b */
        public final /* synthetic */ j53 f10099b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2039a(zw5 zw5, j53 j53) {
            super(zw5);
            this.f10099b = j53;
        }

        /* renamed from: e */
        public j53 mo16635e(JavaType javaType) throws JsonMappingException {
            return this.f10099b;
        }
    }

    public UnwrappingBeanPropertyWriter(BeanPropertyWriter beanPropertyWriter, NameTransformer nameTransformer) {
        super(beanPropertyWriter);
        this._nameTransformer = nameTransformer;
    }

    public void _depositSchemaProperty(ObjectNode objectNode, g53 g53) {
        g53 g532 = g53.get("properties");
        if (g532 != null) {
            Iterator<Map.Entry<String, g53>> fields = g532.fields();
            while (fields.hasNext()) {
                Map.Entry next = fields.next();
                String str = (String) next.getKey();
                NameTransformer nameTransformer = this._nameTransformer;
                if (nameTransformer != null) {
                    str = nameTransformer.transform(str);
                }
                objectNode.set(str, (g53) next.getValue());
            }
        }
    }

    public y63<Object> _findAndAddDynamic(C2040a aVar, Class<?> cls, zw5 zw5) throws JsonMappingException {
        y63<Object> y63;
        JavaType javaType = this._nonTrivialBaseType;
        if (javaType != null) {
            y63 = zw5.findValueSerializer(zw5.constructSpecializedType(javaType, cls), (BeanProperty) this);
        } else {
            y63 = zw5.findValueSerializer(cls, (BeanProperty) this);
        }
        NameTransformer nameTransformer = this._nameTransformer;
        if (y63.isUnwrappingSerializer() && (y63 instanceof UnwrappingBeanSerializer)) {
            nameTransformer = NameTransformer.chainedTransformer(nameTransformer, ((UnwrappingBeanSerializer) y63)._nameTransformer);
        }
        y63<Object> unwrappingSerializer = y63.unwrappingSerializer(nameTransformer);
        this._dynamicSerializers = this._dynamicSerializers.mo16644j(cls, unwrappingSerializer);
        return unwrappingSerializer;
    }

    public UnwrappingBeanPropertyWriter _new(NameTransformer nameTransformer, SerializedString serializedString) {
        return new UnwrappingBeanPropertyWriter(this, nameTransformer, serializedString);
    }

    public void assignSerializer(y63<Object> y63) {
        if (y63 != null) {
            NameTransformer nameTransformer = this._nameTransformer;
            if (y63.isUnwrappingSerializer() && (y63 instanceof UnwrappingBeanSerializer)) {
                nameTransformer = NameTransformer.chainedTransformer(nameTransformer, ((UnwrappingBeanSerializer) y63)._nameTransformer);
            }
            y63 = y63.unwrappingSerializer(nameTransformer);
        }
        super.assignSerializer(y63);
    }

    public void depositSchemaProperty(j53 j53, zw5 zw5) throws JsonMappingException {
        y63<Object> unwrappingSerializer = zw5.findValueSerializer(getType(), (BeanProperty) this).unwrappingSerializer(this._nameTransformer);
        if (unwrappingSerializer.isUnwrappingSerializer()) {
            unwrappingSerializer.acceptJsonFormatVisitor(new C2039a(zw5, j53), getType());
        } else {
            super.depositSchemaProperty(j53, zw5);
        }
    }

    public boolean isUnwrapping() {
        return true;
    }

    public void serializeAsField(Object obj, JsonGenerator jsonGenerator, zw5 zw5) throws Exception {
        Object obj2 = get(obj);
        if (obj2 != null) {
            y63<Object> y63 = this._serializer;
            if (y63 == null) {
                Class<?> cls = obj2.getClass();
                C2040a aVar = this._dynamicSerializers;
                y63<Object> k = aVar.mo16645k(cls);
                if (k == null) {
                    y63 = _findAndAddDynamic(aVar, cls, zw5);
                } else {
                    y63 = k;
                }
            }
            Object obj3 = this._suppressableValue;
            if (obj3 != null) {
                if (BeanPropertyWriter.MARKER_FOR_EMPTY == obj3) {
                    if (y63.isEmpty(zw5, obj2)) {
                        return;
                    }
                } else if (obj3.equals(obj2)) {
                    return;
                }
            }
            if (obj2 != obj || !_handleSelfReference(obj, jsonGenerator, zw5, y63)) {
                if (!y63.isUnwrappingSerializer()) {
                    jsonGenerator.mo13858Y(this._name);
                }
                m17 m17 = this._typeSerializer;
                if (m17 == null) {
                    y63.serialize(obj2, jsonGenerator, zw5);
                } else {
                    y63.serializeWithType(obj2, jsonGenerator, zw5, m17);
                }
            }
        }
    }

    public UnwrappingBeanPropertyWriter rename(NameTransformer nameTransformer) {
        return _new(NameTransformer.chainedTransformer(nameTransformer, this._nameTransformer), new SerializedString(nameTransformer.transform(this._name.getValue())));
    }

    public UnwrappingBeanPropertyWriter(UnwrappingBeanPropertyWriter unwrappingBeanPropertyWriter, NameTransformer nameTransformer, SerializedString serializedString) {
        super((BeanPropertyWriter) unwrappingBeanPropertyWriter, serializedString);
        this._nameTransformer = nameTransformer;
    }
}
