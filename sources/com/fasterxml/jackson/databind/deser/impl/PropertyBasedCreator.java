package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

public final class PropertyBasedCreator {

    /* renamed from: a */
    public final int f9941a;

    /* renamed from: b */
    public final ValueInstantiator f9942b;

    /* renamed from: c */
    public final HashMap<String, SettableBeanProperty> f9943c;

    /* renamed from: d */
    public final SettableBeanProperty[] f9944d;

    public static class CaseInsensitiveMap extends HashMap<String, SettableBeanProperty> {
        private static final long serialVersionUID = 1;
        public final Locale _locale;

        @Deprecated
        public CaseInsensitiveMap() {
            this(Locale.getDefault());
        }

        public static CaseInsensitiveMap construct(Locale locale) {
            return new CaseInsensitiveMap(locale);
        }

        public CaseInsensitiveMap(Locale locale) {
            this._locale = locale;
        }

        public SettableBeanProperty get(Object obj) {
            return (SettableBeanProperty) super.get(((String) obj).toLowerCase(this._locale));
        }

        public SettableBeanProperty put(String str, SettableBeanProperty settableBeanProperty) {
            return (SettableBeanProperty) super.put(str.toLowerCase(this._locale), settableBeanProperty);
        }
    }

    public PropertyBasedCreator(DeserializationContext deserializationContext, ValueInstantiator valueInstantiator, SettableBeanProperty[] settableBeanPropertyArr, boolean z, boolean z2) {
        this.f9942b = valueInstantiator;
        if (z) {
            this.f9943c = CaseInsensitiveMap.construct(deserializationContext.getConfig().getLocale());
        } else {
            this.f9943c = new HashMap<>();
        }
        int length = settableBeanPropertyArr.length;
        this.f9941a = length;
        this.f9944d = new SettableBeanProperty[length];
        if (z2) {
            DeserializationConfig config = deserializationContext.getConfig();
            for (SettableBeanProperty settableBeanProperty : settableBeanPropertyArr) {
                if (!settableBeanProperty.isIgnorable()) {
                    List<PropertyName> findAliases = settableBeanProperty.findAliases(config);
                    if (!findAliases.isEmpty()) {
                        for (PropertyName simpleName : findAliases) {
                            this.f9943c.put(simpleName.getSimpleName(), settableBeanProperty);
                        }
                    }
                }
            }
        }
        for (int i = 0; i < length; i++) {
            SettableBeanProperty settableBeanProperty2 = settableBeanPropertyArr[i];
            this.f9944d[i] = settableBeanProperty2;
            if (!settableBeanProperty2.isIgnorable()) {
                this.f9943c.put(settableBeanProperty2.getName(), settableBeanProperty2);
            }
        }
    }

    /* renamed from: b */
    public static PropertyBasedCreator m14068b(DeserializationContext deserializationContext, ValueInstantiator valueInstantiator, SettableBeanProperty[] settableBeanPropertyArr, BeanPropertyMap beanPropertyMap) throws JsonMappingException {
        int length = settableBeanPropertyArr.length;
        SettableBeanProperty[] settableBeanPropertyArr2 = new SettableBeanProperty[length];
        for (int i = 0; i < length; i++) {
            SettableBeanProperty settableBeanProperty = settableBeanPropertyArr[i];
            if (!settableBeanProperty.hasValueDeserializer() && !settableBeanProperty.isInjectionOnly()) {
                settableBeanProperty = settableBeanProperty.withValueDeserializer(deserializationContext.findContextualValueDeserializer(settableBeanProperty.getType(), settableBeanProperty));
            }
            settableBeanPropertyArr2[i] = settableBeanProperty;
        }
        return new PropertyBasedCreator(deserializationContext, valueInstantiator, settableBeanPropertyArr2, beanPropertyMap.isCaseInsensitive(), true);
    }

    /* renamed from: c */
    public static PropertyBasedCreator m14069c(DeserializationContext deserializationContext, ValueInstantiator valueInstantiator, SettableBeanProperty[] settableBeanPropertyArr, boolean z) throws JsonMappingException {
        int length = settableBeanPropertyArr.length;
        SettableBeanProperty[] settableBeanPropertyArr2 = new SettableBeanProperty[length];
        for (int i = 0; i < length; i++) {
            SettableBeanProperty settableBeanProperty = settableBeanPropertyArr[i];
            if (!settableBeanProperty.hasValueDeserializer()) {
                settableBeanProperty = settableBeanProperty.withValueDeserializer(deserializationContext.findContextualValueDeserializer(settableBeanProperty.getType(), settableBeanProperty));
            }
            settableBeanPropertyArr2[i] = settableBeanProperty;
        }
        return new PropertyBasedCreator(deserializationContext, valueInstantiator, settableBeanPropertyArr2, z, false);
    }

    /* renamed from: a */
    public Object mo15598a(DeserializationContext deserializationContext, ox4 ox4) throws IOException {
        Object createFromObjectWith = this.f9942b.createFromObjectWith(deserializationContext, this.f9944d, ox4);
        if (createFromObjectWith != null) {
            createFromObjectWith = ox4.mo24277h(deserializationContext, createFromObjectWith);
            for (nx4 f = ox4.mo24275f(); f != null; f = f.f15713a) {
                f.mo23825a(createFromObjectWith);
            }
        }
        return createFromObjectWith;
    }

    /* renamed from: d */
    public SettableBeanProperty mo15599d(int i) {
        for (SettableBeanProperty next : this.f9943c.values()) {
            if (next.getPropertyIndex() == i) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: e */
    public SettableBeanProperty mo15600e(String str) {
        return this.f9943c.get(str);
    }

    /* renamed from: f */
    public Collection<SettableBeanProperty> mo15601f() {
        return this.f9943c.values();
    }

    /* renamed from: g */
    public ox4 mo15602g(JsonParser jsonParser, DeserializationContext deserializationContext, ObjectIdReader objectIdReader) {
        return new ox4(jsonParser, deserializationContext, this.f9941a, objectIdReader);
    }
}
