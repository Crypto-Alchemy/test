package com.fasterxml.jackson.databind.module;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.C1988a;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class SimpleModule extends C1988a implements Serializable {

    /* renamed from: a */
    public static final AtomicInteger f10081a = new AtomicInteger(1);
    private static final long serialVersionUID = 1;
    public SimpleAbstractTypeResolver _abstractTypes;
    public p00 _deserializerModifier;
    public SimpleDeserializers _deserializers;
    public final boolean _hasExplicitName;
    public SimpleKeyDeserializers _keyDeserializers;
    public SimpleSerializers _keySerializers;
    public HashMap<Class<?>, Class<?>> _mixins;
    public final String _name;
    public PropertyNamingStrategy _namingStrategy;
    public s00 _serializerModifier;
    public SimpleSerializers _serializers;
    public LinkedHashSet<NamedType> _subtypes;
    public SimpleValueInstantiators _valueInstantiators;
    public final Version _version;

    public SimpleModule() {
        String str;
        this._serializers = null;
        this._deserializers = null;
        this._keySerializers = null;
        this._keyDeserializers = null;
        this._abstractTypes = null;
        this._valueInstantiators = null;
        this._deserializerModifier = null;
        this._serializerModifier = null;
        this._mixins = null;
        this._subtypes = null;
        this._namingStrategy = null;
        if (getClass() == SimpleModule.class) {
            str = "SimpleModule-" + f10081a.getAndIncrement();
        } else {
            str = getClass().getName();
        }
        this._name = str;
        this._version = Version.unknownVersion();
        this._hasExplicitName = false;
    }

    public void _checkNotNull(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(String.format("Cannot pass `null` as %s", new Object[]{str}));
        }
    }

    public <T> SimpleModule addAbstractTypeMapping(Class<T> cls, Class<? extends T> cls2) {
        _checkNotNull(cls, "abstract type to map");
        _checkNotNull(cls2, "concrete type to map to");
        if (this._abstractTypes == null) {
            this._abstractTypes = new SimpleAbstractTypeResolver();
        }
        this._abstractTypes = this._abstractTypes.addMapping(cls, cls2);
        return this;
    }

    public <T> SimpleModule addDeserializer(Class<T> cls, o43<? extends T> o43) {
        _checkNotNull(cls, "type to register deserializer for");
        _checkNotNull(o43, "deserializer");
        if (this._deserializers == null) {
            this._deserializers = new SimpleDeserializers();
        }
        this._deserializers.addDeserializer(cls, o43);
        return this;
    }

    public SimpleModule addKeyDeserializer(Class<?> cls, ha3 ha3) {
        _checkNotNull(cls, "type to register key deserializer for");
        _checkNotNull(ha3, "key deserializer");
        if (this._keyDeserializers == null) {
            this._keyDeserializers = new SimpleKeyDeserializers();
        }
        this._keyDeserializers.addDeserializer(cls, ha3);
        return this;
    }

    public <T> SimpleModule addKeySerializer(Class<? extends T> cls, y63<T> y63) {
        _checkNotNull(cls, "type to register key serializer for");
        _checkNotNull(y63, "key serializer");
        if (this._keySerializers == null) {
            this._keySerializers = new SimpleSerializers();
        }
        this._keySerializers.addSerializer(cls, y63);
        return this;
    }

    public SimpleModule addSerializer(y63<?> y63) {
        _checkNotNull(y63, "serializer");
        if (this._serializers == null) {
            this._serializers = new SimpleSerializers();
        }
        this._serializers.addSerializer(y63);
        return this;
    }

    public SimpleModule addValueInstantiator(Class<?> cls, ValueInstantiator valueInstantiator) {
        _checkNotNull(cls, "class to register value instantiator for");
        _checkNotNull(valueInstantiator, "value instantiator");
        if (this._valueInstantiators == null) {
            this._valueInstantiators = new SimpleValueInstantiators();
        }
        this._valueInstantiators = this._valueInstantiators.addValueInstantiator(cls, valueInstantiator);
        return this;
    }

    public String getModuleName() {
        return this._name;
    }

    public Object getTypeId() {
        if (this._hasExplicitName) {
            return this._name;
        }
        if (getClass() == SimpleModule.class) {
            return this._name;
        }
        return super.getTypeId();
    }

    public SimpleModule registerSubtypes(Class<?>... clsArr) {
        if (this._subtypes == null) {
            this._subtypes = new LinkedHashSet<>();
        }
        for (Class<?> cls : clsArr) {
            _checkNotNull(cls, "subtype to register");
            this._subtypes.add(new NamedType(cls));
        }
        return this;
    }

    public void setAbstractTypes(SimpleAbstractTypeResolver simpleAbstractTypeResolver) {
        this._abstractTypes = simpleAbstractTypeResolver;
    }

    public SimpleModule setDeserializerModifier(p00 p00) {
        this._deserializerModifier = p00;
        return this;
    }

    public void setDeserializers(SimpleDeserializers simpleDeserializers) {
        this._deserializers = simpleDeserializers;
    }

    public void setKeyDeserializers(SimpleKeyDeserializers simpleKeyDeserializers) {
        this._keyDeserializers = simpleKeyDeserializers;
    }

    public void setKeySerializers(SimpleSerializers simpleSerializers) {
        this._keySerializers = simpleSerializers;
    }

    public SimpleModule setMixInAnnotation(Class<?> cls, Class<?> cls2) {
        _checkNotNull(cls, "target type");
        _checkNotNull(cls2, "mixin class");
        if (this._mixins == null) {
            this._mixins = new HashMap<>();
        }
        this._mixins.put(cls, cls2);
        return this;
    }

    public SimpleModule setNamingStrategy(PropertyNamingStrategy propertyNamingStrategy) {
        this._namingStrategy = propertyNamingStrategy;
        return this;
    }

    public SimpleModule setSerializerModifier(s00 s00) {
        this._serializerModifier = s00;
        return this;
    }

    public void setSerializers(SimpleSerializers simpleSerializers) {
        this._serializers = simpleSerializers;
    }

    public void setValueInstantiators(SimpleValueInstantiators simpleValueInstantiators) {
        this._valueInstantiators = simpleValueInstantiators;
    }

    public void setupModule(C1988a.C1989a aVar) {
        SimpleSerializers simpleSerializers = this._serializers;
        if (simpleSerializers != null) {
            aVar.mo14721d(simpleSerializers);
        }
        SimpleDeserializers simpleDeserializers = this._deserializers;
        if (simpleDeserializers != null) {
            aVar.mo14722e(simpleDeserializers);
        }
        SimpleSerializers simpleSerializers2 = this._keySerializers;
        if (simpleSerializers2 != null) {
            aVar.mo14725h(simpleSerializers2);
        }
        SimpleKeyDeserializers simpleKeyDeserializers = this._keyDeserializers;
        if (simpleKeyDeserializers != null) {
            aVar.mo14718a(simpleKeyDeserializers);
        }
        SimpleAbstractTypeResolver simpleAbstractTypeResolver = this._abstractTypes;
        if (simpleAbstractTypeResolver != null) {
            aVar.mo14724g(simpleAbstractTypeResolver);
        }
        SimpleValueInstantiators simpleValueInstantiators = this._valueInstantiators;
        if (simpleValueInstantiators != null) {
            aVar.mo14719b(simpleValueInstantiators);
        }
        p00 p00 = this._deserializerModifier;
        if (p00 != null) {
            aVar.mo14727j(p00);
        }
        s00 s00 = this._serializerModifier;
        if (s00 != null) {
            aVar.mo14728k(s00);
        }
        LinkedHashSet<NamedType> linkedHashSet = this._subtypes;
        if (linkedHashSet != null && linkedHashSet.size() > 0) {
            LinkedHashSet<NamedType> linkedHashSet2 = this._subtypes;
            aVar.mo14720c((NamedType[]) linkedHashSet2.toArray(new NamedType[linkedHashSet2.size()]));
        }
        PropertyNamingStrategy propertyNamingStrategy = this._namingStrategy;
        if (propertyNamingStrategy != null) {
            aVar.mo14726i(propertyNamingStrategy);
        }
        HashMap<Class<?>, Class<?>> hashMap = this._mixins;
        if (hashMap != null) {
            for (Map.Entry next : hashMap.entrySet()) {
                aVar.mo14723f((Class) next.getKey(), (Class) next.getValue());
            }
        }
    }

    public Version version() {
        return this._version;
    }

    public <T> SimpleModule addSerializer(Class<? extends T> cls, y63<T> y63) {
        _checkNotNull(cls, "type to register serializer for");
        _checkNotNull(y63, "serializer");
        if (this._serializers == null) {
            this._serializers = new SimpleSerializers();
        }
        this._serializers.addSerializer(cls, y63);
        return this;
    }

    public SimpleModule registerSubtypes(NamedType... namedTypeArr) {
        if (this._subtypes == null) {
            this._subtypes = new LinkedHashSet<>();
        }
        for (NamedType namedType : namedTypeArr) {
            _checkNotNull(namedType, "subtype to register");
            this._subtypes.add(namedType);
        }
        return this;
    }

    public SimpleModule registerSubtypes(Collection<Class<?>> collection) {
        if (this._subtypes == null) {
            this._subtypes = new LinkedHashSet<>();
        }
        for (Class next : collection) {
            _checkNotNull(next, "subtype to register");
            this._subtypes.add(new NamedType(next));
        }
        return this;
    }

    public SimpleModule(String str) {
        this(str, Version.unknownVersion());
    }

    public SimpleModule(Version version) {
        this(version.getArtifactId(), version);
    }

    public SimpleModule(String str, Version version) {
        this._serializers = null;
        this._deserializers = null;
        this._keySerializers = null;
        this._keyDeserializers = null;
        this._abstractTypes = null;
        this._valueInstantiators = null;
        this._deserializerModifier = null;
        this._serializerModifier = null;
        this._mixins = null;
        this._subtypes = null;
        this._namingStrategy = null;
        this._name = str;
        this._version = version;
        this._hasExplicitName = true;
    }

    public SimpleModule(String str, Version version, Map<Class<?>, o43<?>> map) {
        this(str, version, map, (List<y63<?>>) null);
    }

    public SimpleModule(String str, Version version, List<y63<?>> list) {
        this(str, version, (Map<Class<?>, o43<?>>) null, list);
    }

    public SimpleModule(String str, Version version, Map<Class<?>, o43<?>> map, List<y63<?>> list) {
        this._serializers = null;
        this._deserializers = null;
        this._keySerializers = null;
        this._keyDeserializers = null;
        this._abstractTypes = null;
        this._valueInstantiators = null;
        this._deserializerModifier = null;
        this._serializerModifier = null;
        this._mixins = null;
        this._subtypes = null;
        this._namingStrategy = null;
        this._name = str;
        this._hasExplicitName = true;
        this._version = version;
        if (map != null) {
            this._deserializers = new SimpleDeserializers(map);
        }
        if (list != null) {
            this._serializers = new SimpleSerializers(list);
        }
    }
}
