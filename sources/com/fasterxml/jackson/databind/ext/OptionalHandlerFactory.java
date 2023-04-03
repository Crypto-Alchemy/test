package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class OptionalHandlerFactory implements Serializable {

    /* renamed from: a */
    public static final Class<?> f9978a = Node.class;

    /* renamed from: d */
    public static final Class<?> f9979d;

    /* renamed from: e */
    public static final c03 f9980e;
    public static final OptionalHandlerFactory instance = new OptionalHandlerFactory();
    private static final long serialVersionUID = 1;
    private final Map<String, String> _sqlDeserializers;
    private final Map<String, Object> _sqlSerializers;

    static {
        c03 c03 = null;
        Class<Document> cls = Document.class;
        f9979d = cls;
        try {
            c03 = c03.m11667c();
        } catch (Throwable unused) {
        }
        f9980e = c03;
    }

    public OptionalHandlerFactory() {
        HashMap hashMap = new HashMap();
        this._sqlDeserializers = hashMap;
        hashMap.put("java.sql.Date", "com.fasterxml.jackson.databind.deser.std.DateDeserializers$SqlDateDeserializer");
        hashMap.put("java.sql.Timestamp", "com.fasterxml.jackson.databind.deser.std.DateDeserializers$TimestampDeserializer");
        HashMap hashMap2 = new HashMap();
        this._sqlSerializers = hashMap2;
        hashMap2.put("java.sql.Timestamp", DateSerializer.instance);
        hashMap2.put("java.sql.Date", "com.fasterxml.jackson.databind.ser.std.SqlDateSerializer");
        hashMap2.put("java.sql.Time", "com.fasterxml.jackson.databind.ser.std.SqlTimeSerializer");
        hashMap2.put("java.sql.Blob", "com.fasterxml.jackson.databind.ext.SqlBlobSerializer");
        hashMap2.put("javax.sql.rowset.serial.SerialBlob", "com.fasterxml.jackson.databind.ext.SqlBlobSerializer");
    }

    /* renamed from: a */
    public final boolean mo15883a(Class<?> cls, Class<?> cls2) {
        if (cls2 == null || !cls2.isAssignableFrom(cls)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final boolean mo15884b(Class<?> cls, String str) {
        boolean startsWith;
        do {
            Class<? super Object> superclass = r3.getSuperclass();
            Class<? super Object> cls2 = cls;
            if (superclass == null || superclass == Object.class) {
                return false;
            }
            startsWith = superclass.getName().startsWith(str);
            cls2 = superclass;
        } while (!startsWith);
        return true;
    }

    /* renamed from: c */
    public final Object mo15885c(Class<?> cls, JavaType javaType) {
        try {
            return wf0.m29522l(cls, false);
        } catch (Throwable th) {
            throw new IllegalStateException("Failed to create instance of `" + cls.getName() + "` for handling values of type " + wf0.m29480G(javaType) + ", problem: (" + th.getClass().getName() + ") " + th.getMessage());
        }
    }

    /* renamed from: d */
    public final Object mo15886d(String str, JavaType javaType) {
        try {
            return mo15885c(Class.forName(str), javaType);
        } catch (Throwable th) {
            throw new IllegalStateException("Failed to find class `" + str + "` for handling values of type " + wf0.m29480G(javaType) + ", problem: (" + th.getClass().getName() + ") " + th.getMessage());
        }
    }

    public o43<?> findDeserializer(JavaType javaType, DeserializationConfig deserializationConfig, n00 n00) throws JsonMappingException {
        Object d;
        o43<?> a;
        Class<?> rawClass = javaType.getRawClass();
        c03 c03 = f9980e;
        if (c03 != null && (a = c03.mo11952a(rawClass)) != null) {
            return a;
        }
        if (mo15883a(rawClass, f9978a)) {
            return (o43) mo15886d("com.fasterxml.jackson.databind.ext.DOMDeserializer$NodeDeserializer", javaType);
        }
        if (mo15883a(rawClass, f9979d)) {
            return (o43) mo15886d("com.fasterxml.jackson.databind.ext.DOMDeserializer$DocumentDeserializer", javaType);
        }
        String name = rawClass.getName();
        String str = this._sqlDeserializers.get(name);
        if (str != null) {
            return (o43) mo15886d(str, javaType);
        }
        if ((name.startsWith("javax.xml.") || mo15884b(rawClass, "javax.xml.")) && (d = mo15886d("com.fasterxml.jackson.databind.ext.CoreXMLDeserializers", javaType)) != null) {
            return ((be1) d).findBeanDeserializer(javaType, deserializationConfig, n00);
        }
        return null;
    }

    public y63<?> findSerializer(SerializationConfig serializationConfig, JavaType javaType, n00 n00) {
        Object d;
        y63<?> b;
        Class<?> rawClass = javaType.getRawClass();
        if (mo15883a(rawClass, f9978a)) {
            return (y63) mo15886d("com.fasterxml.jackson.databind.ext.DOMSerializer", javaType);
        }
        c03 c03 = f9980e;
        if (c03 != null && (b = c03.mo11953b(rawClass)) != null) {
            return b;
        }
        String name = rawClass.getName();
        Object obj = this._sqlSerializers.get(name);
        if (obj != null) {
            if (obj instanceof y63) {
                return (y63) obj;
            }
            return (y63) mo15886d((String) obj, javaType);
        } else if ((name.startsWith("javax.xml.") || mo15884b(rawClass, "javax.xml.")) && (d = mo15886d("com.fasterxml.jackson.databind.ext.CoreXMLSerializers", javaType)) != null) {
            return ((ax5) d).findSerializer(serializationConfig, javaType, n00);
        } else {
            return null;
        }
    }

    public boolean hasDeserializerFor(Class<?> cls) {
        if (mo15883a(cls, f9978a) || mo15883a(cls, f9979d)) {
            return true;
        }
        String name = cls.getName();
        if (name.startsWith("javax.xml.") || mo15884b(cls, "javax.xml.")) {
            return true;
        }
        return this._sqlDeserializers.containsKey(name);
    }
}
