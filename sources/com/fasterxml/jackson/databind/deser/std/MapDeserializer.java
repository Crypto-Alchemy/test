package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.C2001a;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.IgnorePropertiesUtil;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@zz2
public class MapDeserializer extends ContainerDeserializerBase<Map<Object, Object>> implements js0, xe5 {
    private static final long serialVersionUID = 1;
    public o43<Object> _delegateDeserializer;
    public final boolean _hasDefaultCreator;
    public Set<String> _ignorableProperties;
    public Set<String> _includableProperties;
    public IgnorePropertiesUtil.Checker _inclusionChecker;
    public final ha3 _keyDeserializer;
    public PropertyBasedCreator _propertyBasedCreator;
    public boolean _standardStringKey;
    public final o43<Object> _valueDeserializer;
    public final ValueInstantiator _valueInstantiator;
    public final j07 _valueTypeDeserializer;

    /* renamed from: com.fasterxml.jackson.databind.deser.std.MapDeserializer$a */
    public static class C2008a extends C2001a.C2002a {

        /* renamed from: c */
        public final C2009b f9964c;

        /* renamed from: d */
        public final Map<Object, Object> f9965d = new LinkedHashMap();

        /* renamed from: e */
        public final Object f9966e;

        public C2008a(C2009b bVar, UnresolvedForwardReference unresolvedForwardReference, Class<?> cls, Object obj) {
            super(unresolvedForwardReference, cls);
            this.f9964c = bVar;
            this.f9966e = obj;
        }

        /* renamed from: c */
        public void mo15344c(Object obj, Object obj2) throws IOException {
            this.f9964c.mo15706c(obj, obj2);
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.deser.std.MapDeserializer$b */
    public static final class C2009b {

        /* renamed from: a */
        public final Class<?> f9967a;

        /* renamed from: b */
        public Map<Object, Object> f9968b;

        /* renamed from: c */
        public List<C2008a> f9969c = new ArrayList();

        public C2009b(Class<?> cls, Map<Object, Object> map) {
            this.f9967a = cls;
            this.f9968b = map;
        }

        /* renamed from: a */
        public C2001a.C2002a mo15704a(UnresolvedForwardReference unresolvedForwardReference, Object obj) {
            C2008a aVar = new C2008a(this, unresolvedForwardReference, this.f9967a, obj);
            this.f9969c.add(aVar);
            return aVar;
        }

        /* renamed from: b */
        public void mo15705b(Object obj, Object obj2) {
            if (this.f9969c.isEmpty()) {
                this.f9968b.put(obj, obj2);
                return;
            }
            List<C2008a> list = this.f9969c;
            list.get(list.size() - 1).f9965d.put(obj, obj2);
        }

        /* renamed from: c */
        public void mo15706c(Object obj, Object obj2) throws IOException {
            Iterator<C2008a> it = this.f9969c.iterator();
            Map<Object, Object> map = this.f9968b;
            while (it.hasNext()) {
                C2008a next = it.next();
                if (next.mo15620d(obj)) {
                    it.remove();
                    map.put(next.f9966e, obj2);
                    map.putAll(next.f9965d);
                    return;
                }
                map = next.f9965d;
            }
            throw new IllegalArgumentException("Trying to resolve a forward reference with id [" + obj + "] that wasn't previously seen as unresolved.");
        }
    }

    public MapDeserializer(JavaType javaType, ValueInstantiator valueInstantiator, ha3 ha3, o43<Object> o43, j07 j07) {
        super(javaType, (bc4) null, (Boolean) null);
        this._keyDeserializer = ha3;
        this._valueDeserializer = o43;
        this._valueTypeDeserializer = j07;
        this._valueInstantiator = valueInstantiator;
        this._hasDefaultCreator = valueInstantiator.canCreateUsingDefault();
        this._delegateDeserializer = null;
        this._propertyBasedCreator = null;
        this._standardStringKey = _isStdKeyDeser(javaType, ha3);
        this._inclusionChecker = null;
    }

    public Map<Object, Object> _deserializeUsingCreator(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String str;
        Object obj;
        PropertyBasedCreator propertyBasedCreator = this._propertyBasedCreator;
        ox4 g = propertyBasedCreator.mo15602g(jsonParser, deserializationContext, (ObjectIdReader) null);
        o43<Object> o43 = this._valueDeserializer;
        j07 j07 = this._valueTypeDeserializer;
        if (jsonParser.mo13928C0()) {
            str = jsonParser.mo13930E0();
        } else if (jsonParser.mo13984s0(JsonToken.FIELD_NAME)) {
            str = jsonParser.mo13964f();
        } else {
            str = null;
        }
        while (str != null) {
            JsonToken N0 = jsonParser.mo13938N0();
            IgnorePropertiesUtil.Checker checker = this._inclusionChecker;
            if (checker == null || !checker.shouldIgnore(str)) {
                SettableBeanProperty e = propertyBasedCreator.mo15600e(str);
                if (e == null) {
                    Object deserializeKey = this._keyDeserializer.deserializeKey(str, deserializationContext);
                    try {
                        if (N0 == JsonToken.VALUE_NULL) {
                            if (!this._skipNullValues) {
                                obj = this._nullProvider.getNullValue(deserializationContext);
                            }
                        } else if (j07 == null) {
                            obj = o43.deserialize(jsonParser, deserializationContext);
                        } else {
                            obj = o43.deserializeWithType(jsonParser, deserializationContext, j07);
                        }
                        g.mo24273d(deserializeKey, obj);
                    } catch (Exception e2) {
                        wrapAndThrow(deserializationContext, e2, this._containerType.getRawClass(), str);
                        return null;
                    }
                } else if (g.mo24271b(e, e.deserialize(jsonParser, deserializationContext))) {
                    jsonParser.mo13938N0();
                    try {
                        Map<Object, Object> map = (Map) propertyBasedCreator.mo15598a(deserializationContext, g);
                        _readAndBind(jsonParser, deserializationContext, map);
                        return map;
                    } catch (Exception e3) {
                        return (Map) wrapAndThrow(deserializationContext, e3, this._containerType.getRawClass(), str);
                    }
                }
            } else {
                jsonParser.mo13959c1();
            }
            str = jsonParser.mo13930E0();
        }
        try {
            return (Map) propertyBasedCreator.mo15598a(deserializationContext, g);
        } catch (Exception e4) {
            wrapAndThrow(deserializationContext, e4, this._containerType.getRawClass(), str);
            return null;
        }
    }

    public final boolean _isStdKeyDeser(JavaType javaType, ha3 ha3) {
        JavaType keyType;
        if (ha3 == null || (keyType = javaType.getKeyType()) == null) {
            return true;
        }
        Class<?> rawClass = keyType.getRawClass();
        if ((rawClass == String.class || rawClass == Object.class) && isDefaultKeyDeserializer(ha3)) {
            return true;
        }
        return false;
    }

    public final void _readAndBind(JsonParser jsonParser, DeserializationContext deserializationContext, Map<Object, Object> map) throws IOException {
        boolean z;
        C2009b bVar;
        String str;
        Object obj;
        ha3 ha3 = this._keyDeserializer;
        o43<Object> o43 = this._valueDeserializer;
        j07 j07 = this._valueTypeDeserializer;
        if (o43.getObjectIdReader() != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            bVar = new C2009b(this._containerType.getContentType().getRawClass(), map);
        } else {
            bVar = null;
        }
        if (jsonParser.mo13928C0()) {
            str = jsonParser.mo13930E0();
        } else {
            JsonToken g = jsonParser.mo13965g();
            JsonToken jsonToken = JsonToken.FIELD_NAME;
            if (g != jsonToken) {
                if (g != JsonToken.END_OBJECT) {
                    deserializationContext.reportWrongTokenException((o43<?>) this, jsonToken, (String) null, new Object[0]);
                } else {
                    return;
                }
            }
            str = jsonParser.mo13964f();
        }
        while (str != null) {
            Object deserializeKey = ha3.deserializeKey(str, deserializationContext);
            JsonToken N0 = jsonParser.mo13938N0();
            IgnorePropertiesUtil.Checker checker = this._inclusionChecker;
            if (checker == null || !checker.shouldIgnore(str)) {
                try {
                    if (N0 == JsonToken.VALUE_NULL) {
                        if (!this._skipNullValues) {
                            obj = this._nullProvider.getNullValue(deserializationContext);
                        }
                    } else if (j07 == null) {
                        obj = o43.deserialize(jsonParser, deserializationContext);
                    } else {
                        obj = o43.deserializeWithType(jsonParser, deserializationContext, j07);
                    }
                    if (z) {
                        bVar.mo15705b(deserializeKey, obj);
                    } else {
                        map.put(deserializeKey, obj);
                    }
                } catch (UnresolvedForwardReference e) {
                    mo15696a(deserializationContext, bVar, deserializeKey, e);
                } catch (Exception e2) {
                    wrapAndThrow(deserializationContext, e2, map, str);
                }
            } else {
                jsonParser.mo13959c1();
            }
            str = jsonParser.mo13930E0();
        }
    }

    public final void _readAndBindStringKeyMap(JsonParser jsonParser, DeserializationContext deserializationContext, Map<Object, Object> map) throws IOException {
        boolean z;
        C2009b bVar;
        String str;
        Object obj;
        o43<Object> o43 = this._valueDeserializer;
        j07 j07 = this._valueTypeDeserializer;
        if (o43.getObjectIdReader() != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            bVar = new C2009b(this._containerType.getContentType().getRawClass(), map);
        } else {
            bVar = null;
        }
        if (jsonParser.mo13928C0()) {
            str = jsonParser.mo13930E0();
        } else {
            JsonToken g = jsonParser.mo13965g();
            if (g != JsonToken.END_OBJECT) {
                JsonToken jsonToken = JsonToken.FIELD_NAME;
                if (g != jsonToken) {
                    deserializationContext.reportWrongTokenException((o43<?>) this, jsonToken, (String) null, new Object[0]);
                }
                str = jsonParser.mo13964f();
            } else {
                return;
            }
        }
        while (str != null) {
            JsonToken N0 = jsonParser.mo13938N0();
            IgnorePropertiesUtil.Checker checker = this._inclusionChecker;
            if (checker == null || !checker.shouldIgnore(str)) {
                try {
                    if (N0 == JsonToken.VALUE_NULL) {
                        if (!this._skipNullValues) {
                            obj = this._nullProvider.getNullValue(deserializationContext);
                        }
                    } else if (j07 == null) {
                        obj = o43.deserialize(jsonParser, deserializationContext);
                    } else {
                        obj = o43.deserializeWithType(jsonParser, deserializationContext, j07);
                    }
                    if (z) {
                        bVar.mo15705b(str, obj);
                    } else {
                        map.put(str, obj);
                    }
                } catch (UnresolvedForwardReference e) {
                    mo15696a(deserializationContext, bVar, str, e);
                } catch (Exception e2) {
                    wrapAndThrow(deserializationContext, e2, map, str);
                }
            } else {
                jsonParser.mo13959c1();
            }
            str = jsonParser.mo13930E0();
        }
    }

    public final void _readAndUpdate(JsonParser jsonParser, DeserializationContext deserializationContext, Map<Object, Object> map) throws IOException {
        String str;
        Object obj;
        ha3 ha3 = this._keyDeserializer;
        o43<Object> o43 = this._valueDeserializer;
        j07 j07 = this._valueTypeDeserializer;
        if (jsonParser.mo13928C0()) {
            str = jsonParser.mo13930E0();
        } else {
            JsonToken g = jsonParser.mo13965g();
            if (g != JsonToken.END_OBJECT) {
                JsonToken jsonToken = JsonToken.FIELD_NAME;
                if (g != jsonToken) {
                    deserializationContext.reportWrongTokenException((o43<?>) this, jsonToken, (String) null, new Object[0]);
                }
                str = jsonParser.mo13964f();
            } else {
                return;
            }
        }
        while (str != null) {
            Object deserializeKey = ha3.deserializeKey(str, deserializationContext);
            JsonToken N0 = jsonParser.mo13938N0();
            IgnorePropertiesUtil.Checker checker = this._inclusionChecker;
            if (checker == null || !checker.shouldIgnore(str)) {
                try {
                    if (N0 != JsonToken.VALUE_NULL) {
                        Object obj2 = map.get(deserializeKey);
                        if (obj2 != null) {
                            if (j07 == null) {
                                obj = o43.deserialize(jsonParser, deserializationContext, obj2);
                            } else {
                                obj = o43.deserializeWithType(jsonParser, deserializationContext, j07, obj2);
                            }
                        } else if (j07 == null) {
                            obj = o43.deserialize(jsonParser, deserializationContext);
                        } else {
                            obj = o43.deserializeWithType(jsonParser, deserializationContext, j07);
                        }
                        if (obj != obj2) {
                            map.put(deserializeKey, obj);
                        }
                    } else if (!this._skipNullValues) {
                        map.put(deserializeKey, this._nullProvider.getNullValue(deserializationContext));
                    }
                } catch (Exception e) {
                    wrapAndThrow(deserializationContext, e, map, str);
                }
            } else {
                jsonParser.mo13959c1();
            }
            str = jsonParser.mo13930E0();
        }
    }

    public final void _readAndUpdateStringKeyMap(JsonParser jsonParser, DeserializationContext deserializationContext, Map<Object, Object> map) throws IOException {
        String str;
        Object obj;
        o43<Object> o43 = this._valueDeserializer;
        j07 j07 = this._valueTypeDeserializer;
        if (jsonParser.mo13928C0()) {
            str = jsonParser.mo13930E0();
        } else {
            JsonToken g = jsonParser.mo13965g();
            if (g != JsonToken.END_OBJECT) {
                JsonToken jsonToken = JsonToken.FIELD_NAME;
                if (g != jsonToken) {
                    deserializationContext.reportWrongTokenException((o43<?>) this, jsonToken, (String) null, new Object[0]);
                }
                str = jsonParser.mo13964f();
            } else {
                return;
            }
        }
        while (str != null) {
            JsonToken N0 = jsonParser.mo13938N0();
            IgnorePropertiesUtil.Checker checker = this._inclusionChecker;
            if (checker == null || !checker.shouldIgnore(str)) {
                try {
                    if (N0 != JsonToken.VALUE_NULL) {
                        Object obj2 = map.get(str);
                        if (obj2 != null) {
                            if (j07 == null) {
                                obj = o43.deserialize(jsonParser, deserializationContext, obj2);
                            } else {
                                obj = o43.deserializeWithType(jsonParser, deserializationContext, j07, obj2);
                            }
                        } else if (j07 == null) {
                            obj = o43.deserialize(jsonParser, deserializationContext);
                        } else {
                            obj = o43.deserializeWithType(jsonParser, deserializationContext, j07);
                        }
                        if (obj != obj2) {
                            map.put(str, obj);
                        }
                    } else if (!this._skipNullValues) {
                        map.put(str, this._nullProvider.getNullValue(deserializationContext));
                    }
                } catch (Exception e) {
                    wrapAndThrow(deserializationContext, e, map, str);
                }
            } else {
                jsonParser.mo13959c1();
            }
            str = jsonParser.mo13930E0();
        }
    }

    /* renamed from: a */
    public final void mo15696a(DeserializationContext deserializationContext, C2009b bVar, Object obj, UnresolvedForwardReference unresolvedForwardReference) throws JsonMappingException {
        if (bVar == null) {
            deserializationContext.reportInputMismatch((o43<?>) this, "Unresolved forward reference but no identity info: " + unresolvedForwardReference, new Object[0]);
        }
        unresolvedForwardReference.getRoid().mo15609a(bVar.mo15704a(unresolvedForwardReference, obj));
    }

    public o43<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        o43 o43;
        HashSet hashSet;
        Set<String> set;
        AnnotatedMember member;
        Set<String> included;
        ha3 ha3 = this._keyDeserializer;
        if (ha3 == null) {
            ha3 = deserializationContext.findKeyDeserializer(this._containerType.getKeyType(), beanProperty);
        } else if (ha3 instanceof ks0) {
            ha3 = ((ks0) ha3).createContextual(deserializationContext, beanProperty);
        }
        ha3 ha32 = ha3;
        o43 o432 = this._valueDeserializer;
        if (beanProperty != null) {
            o432 = findConvertingContentDeserializer(deserializationContext, beanProperty, o432);
        }
        JavaType contentType = this._containerType.getContentType();
        if (o432 == null) {
            o43 = deserializationContext.findContextualValueDeserializer(contentType, beanProperty);
        } else {
            o43 = deserializationContext.handleSecondaryContextualization(o432, beanProperty, contentType);
        }
        o43 o433 = o43;
        j07 j07 = this._valueTypeDeserializer;
        if (j07 != null) {
            j07 = j07.forProperty(beanProperty);
        }
        j07 j072 = j07;
        Set<String> set2 = this._ignorableProperties;
        Set<String> set3 = this._includableProperties;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (StdDeserializer._neitherNull(annotationIntrospector, beanProperty) && (member = beanProperty.getMember()) != null) {
            DeserializationConfig config = deserializationContext.getConfig();
            JsonIgnoreProperties.Value findPropertyIgnoralByName = annotationIntrospector.findPropertyIgnoralByName(config, member);
            if (findPropertyIgnoralByName != null) {
                Set<String> findIgnoredForDeserialization = findPropertyIgnoralByName.findIgnoredForDeserialization();
                if (!findIgnoredForDeserialization.isEmpty()) {
                    if (set2 == null) {
                        set2 = new HashSet<>();
                    } else {
                        set2 = new HashSet<>(set2);
                    }
                    for (String add : findIgnoredForDeserialization) {
                        set2.add(add);
                    }
                }
            }
            JsonIncludeProperties.Value findPropertyInclusionByName = annotationIntrospector.findPropertyInclusionByName(config, member);
            if (!(findPropertyInclusionByName == null || (included = findPropertyInclusionByName.getIncluded()) == null)) {
                HashSet hashSet2 = new HashSet();
                if (set3 == null) {
                    hashSet2 = new HashSet(included);
                } else {
                    for (String next : included) {
                        if (set3.contains(next)) {
                            hashSet2.add(next);
                        }
                    }
                }
                hashSet = hashSet2;
                set = set2;
                return withResolved(ha32, j072, o433, findContentNullProvider(deserializationContext, beanProperty, o433), set, hashSet);
            }
        }
        set = set2;
        hashSet = set3;
        return withResolved(ha32, j072, o433, findContentNullProvider(deserializationContext, beanProperty, o433), set, hashSet);
    }

    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, j07 j07) throws IOException {
        return j07.deserializeTypedFromObject(jsonParser, deserializationContext);
    }

    public o43<Object> getContentDeserializer() {
        return this._valueDeserializer;
    }

    public final Class<?> getMapClass() {
        return this._containerType.getRawClass();
    }

    public ValueInstantiator getValueInstantiator() {
        return this._valueInstantiator;
    }

    public JavaType getValueType() {
        return this._containerType;
    }

    public boolean isCachable() {
        if (this._valueDeserializer == null && this._keyDeserializer == null && this._valueTypeDeserializer == null && this._ignorableProperties == null && this._includableProperties == null) {
            return true;
        }
        return false;
    }

    public LogicalType logicalType() {
        return LogicalType.Map;
    }

    public void resolve(DeserializationContext deserializationContext) throws JsonMappingException {
        if (this._valueInstantiator.canCreateUsingDelegate()) {
            JavaType delegateType = this._valueInstantiator.getDelegateType(deserializationContext.getConfig());
            if (delegateType == null) {
                JavaType javaType = this._containerType;
                deserializationContext.reportBadDefinition(javaType, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'", new Object[]{javaType, this._valueInstantiator.getClass().getName()}));
            }
            this._delegateDeserializer = findDeserializer(deserializationContext, delegateType, (BeanProperty) null);
        } else if (this._valueInstantiator.canCreateUsingArrayDelegate()) {
            JavaType arrayDelegateType = this._valueInstantiator.getArrayDelegateType(deserializationContext.getConfig());
            if (arrayDelegateType == null) {
                JavaType javaType2 = this._containerType;
                deserializationContext.reportBadDefinition(javaType2, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'", new Object[]{javaType2, this._valueInstantiator.getClass().getName()}));
            }
            this._delegateDeserializer = findDeserializer(deserializationContext, arrayDelegateType, (BeanProperty) null);
        }
        if (this._valueInstantiator.canCreateFromObjectWith()) {
            this._propertyBasedCreator = PropertyBasedCreator.m14069c(deserializationContext, this._valueInstantiator, this._valueInstantiator.getFromObjectArguments(deserializationContext.getConfig()), deserializationContext.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES));
        }
        this._standardStringKey = _isStdKeyDeser(this._containerType, this._keyDeserializer);
    }

    @Deprecated
    public void setIgnorableProperties(String[] strArr) {
        HashSet a = (strArr == null || strArr.length == 0) ? null : C2103cq.m14358a(strArr);
        this._ignorableProperties = a;
        this._inclusionChecker = IgnorePropertiesUtil.m14341a(a, this._includableProperties);
    }

    public void setIncludableProperties(Set<String> set) {
        this._includableProperties = set;
        this._inclusionChecker = IgnorePropertiesUtil.m14341a(this._ignorableProperties, set);
    }

    public MapDeserializer withResolved(ha3 ha3, j07 j07, o43<?> o43, bc4 bc4, Set<String> set) {
        return withResolved(ha3, j07, o43, bc4, set, this._includableProperties);
    }

    public MapDeserializer withResolved(ha3 ha3, j07 j07, o43<?> o43, bc4 bc4, Set<String> set, Set<String> set2) {
        if (this._keyDeserializer == ha3 && this._valueDeserializer == o43 && this._valueTypeDeserializer == j07 && this._nullProvider == bc4 && this._ignorableProperties == set && this._includableProperties == set2) {
            return this;
        }
        return new MapDeserializer(this, ha3, o43, j07, bc4, set, set2);
    }

    public Map<Object, Object> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (this._propertyBasedCreator != null) {
            return _deserializeUsingCreator(jsonParser, deserializationContext);
        }
        o43<Object> o43 = this._delegateDeserializer;
        if (o43 != null) {
            return (Map) this._valueInstantiator.createUsingDelegate(deserializationContext, o43.deserialize(jsonParser, deserializationContext));
        }
        if (!this._hasDefaultCreator) {
            return (Map) deserializationContext.handleMissingInstantiator(getMapClass(), getValueInstantiator(), jsonParser, "no default constructor found", new Object[0]);
        }
        int h = jsonParser.mo13967h();
        if (!(h == 1 || h == 2)) {
            if (h == 3) {
                return (Map) _deserializeFromArray(jsonParser, deserializationContext);
            }
            if (h != 5) {
                if (h != 6) {
                    return (Map) deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
                }
                return (Map) _deserializeFromString(jsonParser, deserializationContext);
            }
        }
        Map<Object, Object> map = (Map) this._valueInstantiator.createUsingDefault(deserializationContext);
        if (this._standardStringKey) {
            _readAndBindStringKeyMap(jsonParser, deserializationContext, map);
            return map;
        }
        _readAndBind(jsonParser, deserializationContext, map);
        return map;
    }

    public void setIgnorableProperties(Set<String> set) {
        if (set == null || set.size() == 0) {
            set = null;
        }
        this._ignorableProperties = set;
        this._inclusionChecker = IgnorePropertiesUtil.m14341a(set, this._includableProperties);
    }

    public MapDeserializer(MapDeserializer mapDeserializer) {
        super((ContainerDeserializerBase<?>) mapDeserializer);
        this._keyDeserializer = mapDeserializer._keyDeserializer;
        this._valueDeserializer = mapDeserializer._valueDeserializer;
        this._valueTypeDeserializer = mapDeserializer._valueTypeDeserializer;
        this._valueInstantiator = mapDeserializer._valueInstantiator;
        this._propertyBasedCreator = mapDeserializer._propertyBasedCreator;
        this._delegateDeserializer = mapDeserializer._delegateDeserializer;
        this._hasDefaultCreator = mapDeserializer._hasDefaultCreator;
        this._ignorableProperties = mapDeserializer._ignorableProperties;
        this._includableProperties = mapDeserializer._includableProperties;
        this._inclusionChecker = mapDeserializer._inclusionChecker;
        this._standardStringKey = mapDeserializer._standardStringKey;
    }

    public Map<Object, Object> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Map<Object, Object> map) throws IOException {
        jsonParser.mo13951Y0(map);
        JsonToken g = jsonParser.mo13965g();
        if (g != JsonToken.START_OBJECT && g != JsonToken.FIELD_NAME) {
            return (Map) deserializationContext.handleUnexpectedToken(getMapClass(), jsonParser);
        }
        if (this._standardStringKey) {
            _readAndUpdateStringKeyMap(jsonParser, deserializationContext, map);
            return map;
        }
        _readAndUpdate(jsonParser, deserializationContext, map);
        return map;
    }

    public MapDeserializer(MapDeserializer mapDeserializer, ha3 ha3, o43<Object> o43, j07 j07, bc4 bc4, Set<String> set) {
        this(mapDeserializer, ha3, o43, j07, bc4, set, (Set<String>) null);
    }

    public MapDeserializer(MapDeserializer mapDeserializer, ha3 ha3, o43<Object> o43, j07 j07, bc4 bc4, Set<String> set, Set<String> set2) {
        super((ContainerDeserializerBase<?>) mapDeserializer, bc4, mapDeserializer._unwrapSingle);
        this._keyDeserializer = ha3;
        this._valueDeserializer = o43;
        this._valueTypeDeserializer = j07;
        this._valueInstantiator = mapDeserializer._valueInstantiator;
        this._propertyBasedCreator = mapDeserializer._propertyBasedCreator;
        this._delegateDeserializer = mapDeserializer._delegateDeserializer;
        this._hasDefaultCreator = mapDeserializer._hasDefaultCreator;
        this._ignorableProperties = set;
        this._includableProperties = set2;
        this._inclusionChecker = IgnorePropertiesUtil.m14341a(set, set2);
        this._standardStringKey = _isStdKeyDeser(this._containerType, ha3);
    }
}
