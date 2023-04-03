package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.p009io.ContentReference;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.CreatorProperty;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;

public class JsonLocationInstantiator extends ValueInstantiator.Base {
    private static final long serialVersionUID = 1;

    public JsonLocationInstantiator() {
        super((Class<?>) JsonLocation.class);
    }

    /* renamed from: a */
    public static final int m14100a(Object obj) {
        if (obj == null) {
            return 0;
        }
        return ((Number) obj).intValue();
    }

    /* renamed from: b */
    public static final long m14101b(Object obj) {
        if (obj == null) {
            return 0;
        }
        return ((Number) obj).longValue();
    }

    /* renamed from: c */
    public static CreatorProperty m14102c(String str, JavaType javaType, int i) {
        return CreatorProperty.construct(PropertyName.construct(str), javaType, (PropertyName) null, (j07) null, (C2236em) null, (AnnotatedParameter) null, i, (JacksonInject.Value) null, PropertyMetadata.STD_REQUIRED);
    }

    public boolean canCreateFromObjectWith() {
        return true;
    }

    public Object createFromObjectWith(DeserializationContext deserializationContext, Object[] objArr) {
        return new JsonLocation(ContentReference.rawReference(objArr[0]), m14101b(objArr[1]), m14101b(objArr[2]), m14100a(objArr[3]), m14100a(objArr[4]));
    }

    public SettableBeanProperty[] getFromObjectArguments(DeserializationConfig deserializationConfig) {
        JavaType constructType = deserializationConfig.constructType((Class<?>) Integer.TYPE);
        JavaType constructType2 = deserializationConfig.constructType((Class<?>) Long.TYPE);
        return new SettableBeanProperty[]{m14102c("sourceRef", deserializationConfig.constructType((Class<?>) Object.class), 0), m14102c("byteOffset", constructType2, 1), m14102c("charOffset", constructType2, 2), m14102c("lineNr", constructType, 3), m14102c("columnNr", constructType, 4)};
    }
}
