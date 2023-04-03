package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.C1974a;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators$PropertyGenerator;
import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import com.fasterxml.jackson.databind.deser.impl.C2001a;
import com.fasterxml.jackson.databind.deser.impl.InnerClassProperty;
import com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty;
import com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator;
import com.fasterxml.jackson.databind.deser.impl.SetterlessProperty;
import com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer;
import com.fasterxml.jackson.databind.deser.impl.ValueInjector;
import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.exc.IgnoredPropertyException;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.type.ClassKey;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.AccessPattern;
import com.fasterxml.jackson.databind.util.IgnorePropertiesUtil;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p000.ey1;

public abstract class BeanDeserializerBase extends StdDeserializer<Object> implements js0, xe5 {
    public static final PropertyName TEMP_PROPERTY_NAME = new PropertyName("#temporary-name");
    private static final long serialVersionUID = 1;
    public SettableAnyProperty _anySetter;
    public o43<Object> _arrayDelegateDeserializer;
    public final Map<String, SettableBeanProperty> _backRefs;
    public final BeanPropertyMap _beanProperties;
    public final JavaType _beanType;
    public o43<Object> _delegateDeserializer;
    public ey1 _externalTypeIdHandler;
    public final Set<String> _ignorableProps;
    public final boolean _ignoreAllUnknown;
    public final Set<String> _includableProps;
    public final ValueInjector[] _injectables;
    public final boolean _needViewProcesing;
    public boolean _nonStandardCreation;
    public final ObjectIdReader _objectIdReader;
    public PropertyBasedCreator _propertyBasedCreator;
    public final JsonFormat.Shape _serializationShape;
    public transient HashMap<ClassKey, o43<Object>> _subDeserializers;
    public v47 _unwrappedPropertyHandler;
    public final ValueInstantiator _valueInstantiator;
    public boolean _vanillaProcessing;

    public BeanDeserializerBase(o00 o00, n00 n00, BeanPropertyMap beanPropertyMap, Map<String, SettableBeanProperty> map, Set<String> set, boolean z, Set<String> set2, boolean z2) {
        super(n00.mo23439A());
        this._beanType = n00.mo23439A();
        ValueInstantiator u = o00.mo23869u();
        this._valueInstantiator = u;
        this._delegateDeserializer = null;
        this._arrayDelegateDeserializer = null;
        this._propertyBasedCreator = null;
        this._beanProperties = beanPropertyMap;
        this._backRefs = map;
        this._ignorableProps = set;
        this._ignoreAllUnknown = z;
        this._includableProps = set2;
        this._anySetter = o00.mo23865q();
        List<ValueInjector> s = o00.mo23867s();
        ValueInjector[] valueInjectorArr = (s == null || s.isEmpty()) ? null : (ValueInjector[]) s.toArray(new ValueInjector[s.size()]);
        this._injectables = valueInjectorArr;
        ObjectIdReader t = o00.mo23868t();
        this._objectIdReader = t;
        boolean z3 = false;
        this._nonStandardCreation = this._unwrappedPropertyHandler != null || u.canCreateUsingDelegate() || u.canCreateFromObjectWith() || !u.canCreateUsingDefault();
        this._serializationShape = n00.mo23449g((JsonFormat.Value) null).getShape();
        this._needViewProcesing = z2;
        if (!this._nonStandardCreation && valueInjectorArr == null && !z2 && t == null) {
            z3 = true;
        }
        this._vanillaProcessing = z3;
    }

    public Object _convertObjectId(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, o43<Object> o43) throws IOException {
        fr6 bufferForInputBuffering = deserializationContext.bufferForInputBuffering(jsonParser);
        if (obj instanceof String) {
            bufferForInputBuffering.mo13860Z0((String) obj);
        } else if (obj instanceof Long) {
            bufferForInputBuffering.mo13882i0(((Long) obj).longValue());
        } else if (obj instanceof Integer) {
            bufferForInputBuffering.mo13880h0(((Integer) obj).intValue());
        } else {
            bufferForInputBuffering.writeObject(obj);
        }
        JsonParser x1 = bufferForInputBuffering.mo20092x1();
        x1.mo13938N0();
        return o43.deserialize(x1, deserializationContext);
    }

    public final o43<Object> _delegateDeserializer() {
        o43<Object> o43 = this._delegateDeserializer;
        if (o43 == null) {
            return this._arrayDelegateDeserializer;
        }
        return o43;
    }

    public abstract Object _deserializeUsingPropertyBased(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException;

    public NameTransformer _findPropertyUnwrapper(DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty) throws JsonMappingException {
        NameTransformer findUnwrappingNameTransformer;
        AnnotatedMember member = settableBeanProperty.getMember();
        if (member == null || (findUnwrappingNameTransformer = deserializationContext.getAnnotationIntrospector().findUnwrappingNameTransformer(member)) == null) {
            return null;
        }
        if (settableBeanProperty instanceof CreatorProperty) {
            deserializationContext.reportBadDefinition(getValueType(), String.format("Cannot define Creator property \"%s\" as `@JsonUnwrapped`: combination not yet supported", new Object[]{settableBeanProperty.getName()}));
        }
        return findUnwrappingNameTransformer;
    }

    public o43<Object> _findSubclassDeserializer(DeserializationContext deserializationContext, Object obj, fr6 fr6) throws IOException {
        o43<Object> o43;
        synchronized (this) {
            HashMap<ClassKey, o43<Object>> hashMap = this._subDeserializers;
            if (hashMap == null) {
                o43 = null;
            } else {
                o43 = hashMap.get(new ClassKey(obj.getClass()));
            }
        }
        if (o43 != null) {
            return o43;
        }
        o43<Object> findRootValueDeserializer = deserializationContext.findRootValueDeserializer(deserializationContext.constructType(obj.getClass()));
        if (findRootValueDeserializer != null) {
            synchronized (this) {
                if (this._subDeserializers == null) {
                    this._subDeserializers = new HashMap<>();
                }
                this._subDeserializers.put(new ClassKey(obj.getClass()), findRootValueDeserializer);
            }
        }
        return findRootValueDeserializer;
    }

    public BeanDeserializerBase _handleByNameInclusion(DeserializationContext deserializationContext, AnnotationIntrospector annotationIntrospector, BeanDeserializerBase beanDeserializerBase, AnnotatedMember annotatedMember) throws JsonMappingException {
        DeserializationConfig config = deserializationContext.getConfig();
        JsonIgnoreProperties.Value findPropertyIgnoralByName = annotationIntrospector.findPropertyIgnoralByName(config, annotatedMember);
        if (findPropertyIgnoralByName.getIgnoreUnknown() && !this._ignoreAllUnknown) {
            beanDeserializerBase = beanDeserializerBase.withIgnoreAllUnknown(true);
        }
        Set<String> findIgnoredForDeserialization = findPropertyIgnoralByName.findIgnoredForDeserialization();
        Set<String> set = beanDeserializerBase._ignorableProps;
        if (findIgnoredForDeserialization.isEmpty()) {
            findIgnoredForDeserialization = set;
        } else if (set != null && !set.isEmpty()) {
            HashSet hashSet = new HashSet(set);
            hashSet.addAll(findIgnoredForDeserialization);
            findIgnoredForDeserialization = hashSet;
        }
        Set<String> set2 = beanDeserializerBase._includableProps;
        Set<String> b = IgnorePropertiesUtil.m14342b(set2, annotationIntrospector.findPropertyInclusionByName(config, annotatedMember).getIncluded());
        if (findIgnoredForDeserialization == set && b == set2) {
            return beanDeserializerBase;
        }
        return beanDeserializerBase.withByNameInclusion(findIgnoredForDeserialization, b);
    }

    public Object _handleTypedObjectId(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, Object obj2) throws IOException {
        o43<Object> deserializer = this._objectIdReader.getDeserializer();
        if (deserializer.handledType() != obj2.getClass()) {
            obj2 = _convertObjectId(jsonParser, deserializationContext, obj2, deserializer);
        }
        ObjectIdReader objectIdReader = this._objectIdReader;
        deserializationContext.findObjectId(obj2, objectIdReader.generator, objectIdReader.resolver).mo15610b(obj);
        SettableBeanProperty settableBeanProperty = this._objectIdReader.idProperty;
        if (settableBeanProperty != null) {
            return settableBeanProperty.setAndReturn(obj, obj2);
        }
        return obj;
    }

    public void _replaceProperty(BeanPropertyMap beanPropertyMap, SettableBeanProperty[] settableBeanPropertyArr, SettableBeanProperty settableBeanProperty, SettableBeanProperty settableBeanProperty2) {
        beanPropertyMap.replace(settableBeanProperty, settableBeanProperty2);
        if (settableBeanPropertyArr != null) {
            int length = settableBeanPropertyArr.length;
            for (int i = 0; i < length; i++) {
                if (settableBeanPropertyArr[i] == settableBeanProperty) {
                    settableBeanPropertyArr[i] = settableBeanProperty2;
                    return;
                }
            }
        }
    }

    public SettableBeanProperty _resolveInnerClassValuedProperty(DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty) {
        Class<?> rawClass;
        Class<?> E;
        o43<Object> valueDeserializer = settableBeanProperty.getValueDeserializer();
        if ((valueDeserializer instanceof BeanDeserializerBase) && !((BeanDeserializerBase) valueDeserializer).getValueInstantiator().canCreateUsingDefault() && (E = wf0.m29478E(rawClass)) != null && E == this._beanType.getRawClass()) {
            Constructor[] constructors = (rawClass = settableBeanProperty.getType().getRawClass()).getConstructors();
            int length = constructors.length;
            int i = 0;
            while (i < length) {
                Constructor constructor = constructors[i];
                Class[] parameterTypes = constructor.getParameterTypes();
                if (parameterTypes.length != 1 || !E.equals(parameterTypes[0])) {
                    i++;
                } else {
                    if (deserializationContext.canOverrideAccessModifiers()) {
                        wf0.m29512g(constructor, deserializationContext.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
                    }
                    return new InnerClassProperty(settableBeanProperty, (Constructor<?>) constructor);
                }
            }
        }
        return settableBeanProperty;
    }

    public SettableBeanProperty _resolveManagedReferenceProperty(DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty) throws JsonMappingException {
        String managedReferenceName = settableBeanProperty.getManagedReferenceName();
        if (managedReferenceName == null) {
            return settableBeanProperty;
        }
        SettableBeanProperty findBackReference = settableBeanProperty.getValueDeserializer().findBackReference(managedReferenceName);
        if (findBackReference == null) {
            return (SettableBeanProperty) deserializationContext.reportBadDefinition(this._beanType, String.format("Cannot handle managed/back reference %s: no back reference property found from type %s", new Object[]{wf0.m29495V(managedReferenceName), wf0.m29480G(settableBeanProperty.getType())}));
        }
        JavaType javaType = this._beanType;
        JavaType type = findBackReference.getType();
        boolean isContainerType = settableBeanProperty.getType().isContainerType();
        if (!type.getRawClass().isAssignableFrom(javaType.getRawClass())) {
            deserializationContext.reportBadDefinition(this._beanType, String.format("Cannot handle managed/back reference %s: back reference type (%s) not compatible with managed type (%s)", new Object[]{wf0.m29495V(managedReferenceName), wf0.m29480G(type), javaType.getRawClass().getName()}));
        }
        return new ManagedReferenceProperty(settableBeanProperty, managedReferenceName, findBackReference, isContainerType);
    }

    public SettableBeanProperty _resolveMergeAndNullSettings(DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty, PropertyMetadata propertyMetadata) throws JsonMappingException {
        PropertyMetadata.C1987a mergeInfo = propertyMetadata.getMergeInfo();
        if (mergeInfo != null) {
            o43<Object> valueDeserializer = settableBeanProperty.getValueDeserializer();
            Boolean supportsUpdate = valueDeserializer.supportsUpdate(deserializationContext.getConfig());
            if (supportsUpdate == null) {
                if (mergeInfo.f9882b) {
                    return settableBeanProperty;
                }
            } else if (!supportsUpdate.booleanValue()) {
                if (!mergeInfo.f9882b) {
                    deserializationContext.handleBadMerge(valueDeserializer);
                }
                return settableBeanProperty;
            }
            AnnotatedMember annotatedMember = mergeInfo.f9881a;
            annotatedMember.fixAccess(deserializationContext.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
            if (!(settableBeanProperty instanceof SetterlessProperty)) {
                settableBeanProperty = MergingSettableBeanProperty.construct(settableBeanProperty, annotatedMember);
            }
        }
        bc4 findValueNullProvider = findValueNullProvider(deserializationContext, settableBeanProperty, propertyMetadata);
        if (findValueNullProvider != null) {
            return settableBeanProperty.withNullProvider(findValueNullProvider);
        }
        return settableBeanProperty;
    }

    public SettableBeanProperty _resolvedObjectIdProperty(DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty) throws JsonMappingException {
        ObjectIdReader objectIdReader;
        bf4 objectIdInfo = settableBeanProperty.getObjectIdInfo();
        o43<Object> valueDeserializer = settableBeanProperty.getValueDeserializer();
        if (valueDeserializer == null) {
            objectIdReader = null;
        } else {
            objectIdReader = valueDeserializer.getObjectIdReader();
        }
        if (objectIdInfo == null && objectIdReader == null) {
            return settableBeanProperty;
        }
        return new ObjectIdReferenceProperty(settableBeanProperty, objectIdInfo);
    }

    /* renamed from: a */
    public final o43<Object> mo15357a(DeserializationContext deserializationContext, JavaType javaType, AnnotatedWithParams annotatedWithParams) throws JsonMappingException {
        o43 o43;
        BeanProperty.Std std = new BeanProperty.Std(TEMP_PROPERTY_NAME, javaType, (PropertyName) null, annotatedWithParams, PropertyMetadata.STD_OPTIONAL);
        j07 j07 = (j07) javaType.getTypeHandler();
        if (j07 == null) {
            j07 = deserializationContext.getConfig().findTypeDeserializer(javaType);
        }
        o43 o432 = (o43) javaType.getValueHandler();
        if (o432 == null) {
            o43 = findDeserializer(deserializationContext, javaType, std);
        } else {
            o43 = deserializationContext.handleSecondaryContextualization(o432, std, javaType);
        }
        if (j07 != null) {
            return new TypeWrappedDeserializer(j07.forProperty(std), o43);
        }
        return o43;
    }

    public abstract BeanDeserializerBase asArrayDeserializer();

    /* renamed from: b */
    public final Throwable mo15358b(Throwable th, DeserializationContext deserializationContext) throws IOException {
        boolean z;
        while ((th instanceof InvocationTargetException) && th.getCause() != null) {
            th = th.getCause();
        }
        wf0.m29515h0(th);
        if (deserializationContext == null || deserializationContext.isEnabled(DeserializationFeature.WRAP_EXCEPTIONS)) {
            z = true;
        } else {
            z = false;
        }
        if (th instanceof IOException) {
            if (!z || !(th instanceof JacksonException)) {
                throw ((IOException) th);
            }
        } else if (!z) {
            wf0.m29519j0(th);
        }
        return th;
    }

    public o43<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        AnnotatedMember annotatedMember;
        BeanDeserializerBase beanDeserializerBase;
        BeanPropertyMap beanPropertyMap;
        BeanPropertyMap withCaseInsensitivity;
        bf4 findObjectIdInfo;
        SettableBeanProperty settableBeanProperty;
        PropertyBasedObjectIdGenerator propertyBasedObjectIdGenerator;
        JavaType javaType;
        ObjectIdReader objectIdReader = this._objectIdReader;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        JsonFormat.Shape shape = null;
        if (StdDeserializer._neitherNull(beanProperty, annotationIntrospector)) {
            annotatedMember = beanProperty.getMember();
        } else {
            annotatedMember = null;
        }
        if (!(annotatedMember == null || (findObjectIdInfo = annotationIntrospector.findObjectIdInfo(annotatedMember)) == null)) {
            bf4 findObjectReferenceInfo = annotationIntrospector.findObjectReferenceInfo(annotatedMember, findObjectIdInfo);
            Class<? extends ObjectIdGenerator<?>> c = findObjectReferenceInfo.mo11628c();
            C1974a objectIdResolverInstance = deserializationContext.objectIdResolverInstance(annotatedMember, findObjectReferenceInfo);
            if (c == ObjectIdGenerators$PropertyGenerator.class) {
                PropertyName d = findObjectReferenceInfo.mo11629d();
                SettableBeanProperty findProperty = findProperty(d);
                if (findProperty == null) {
                    return (o43) deserializationContext.reportBadDefinition(this._beanType, String.format("Invalid Object Id definition for %s: cannot find property with name %s", new Object[]{wf0.m29497X(handledType()), wf0.m29494U(d)}));
                }
                javaType = findProperty.getType();
                settableBeanProperty = findProperty;
                propertyBasedObjectIdGenerator = new PropertyBasedObjectIdGenerator(findObjectReferenceInfo.mo11631f());
            } else {
                javaType = deserializationContext.getTypeFactory().findTypeParameters(deserializationContext.constructType(c), (Class<?>) ObjectIdGenerator.class)[0];
                settableBeanProperty = null;
                propertyBasedObjectIdGenerator = deserializationContext.objectIdGeneratorInstance(annotatedMember, findObjectReferenceInfo);
            }
            JavaType javaType2 = javaType;
            objectIdReader = ObjectIdReader.construct(javaType2, findObjectReferenceInfo.mo11629d(), propertyBasedObjectIdGenerator, deserializationContext.findRootValueDeserializer(javaType2), settableBeanProperty, objectIdResolverInstance);
        }
        if (objectIdReader == null || objectIdReader == this._objectIdReader) {
            beanDeserializerBase = this;
        } else {
            beanDeserializerBase = withObjectIdReader(objectIdReader);
        }
        if (annotatedMember != null) {
            beanDeserializerBase = _handleByNameInclusion(deserializationContext, annotationIntrospector, beanDeserializerBase, annotatedMember);
        }
        JsonFormat.Value findFormatOverrides = findFormatOverrides(deserializationContext, beanProperty, handledType());
        if (findFormatOverrides != null) {
            if (findFormatOverrides.hasShape()) {
                shape = findFormatOverrides.getShape();
            }
            Boolean feature = findFormatOverrides.getFeature(JsonFormat.Feature.ACCEPT_CASE_INSENSITIVE_PROPERTIES);
            if (!(feature == null || (withCaseInsensitivity = beanPropertyMap.withCaseInsensitivity(feature.booleanValue())) == (beanPropertyMap = this._beanProperties))) {
                beanDeserializerBase = beanDeserializerBase.withBeanProperties(withCaseInsensitivity);
            }
        }
        if (shape == null) {
            shape = this._serializationShape;
        }
        if (shape == JsonFormat.Shape.ARRAY) {
            return beanDeserializerBase.asArrayDeserializer();
        }
        return beanDeserializerBase;
    }

    public Iterator<SettableBeanProperty> creatorProperties() {
        PropertyBasedCreator propertyBasedCreator = this._propertyBasedCreator;
        if (propertyBasedCreator == null) {
            return Collections.emptyList().iterator();
        }
        return propertyBasedCreator.mo15601f().iterator();
    }

    @Deprecated
    public Object deserializeFromArray(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return _deserializeFromArray(jsonParser, deserializationContext);
    }

    public Object deserializeFromBoolean(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        boolean z;
        o43<Object> _delegateDeserializer2 = _delegateDeserializer();
        if (_delegateDeserializer2 == null || this._valueInstantiator.canCreateFromBoolean()) {
            if (jsonParser.mo13965g() == JsonToken.VALUE_TRUE) {
                z = true;
            } else {
                z = false;
            }
            return this._valueInstantiator.createFromBoolean(deserializationContext, z);
        }
        Object createUsingDelegate = this._valueInstantiator.createUsingDelegate(deserializationContext, _delegateDeserializer2.deserialize(jsonParser, deserializationContext));
        if (this._injectables != null) {
            injectValues(deserializationContext, createUsingDelegate);
        }
        return createUsingDelegate;
    }

    public Object deserializeFromDouble(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonParser.NumberType K = jsonParser.mo13935K();
        if (K == JsonParser.NumberType.DOUBLE || K == JsonParser.NumberType.FLOAT) {
            o43<Object> _delegateDeserializer2 = _delegateDeserializer();
            if (_delegateDeserializer2 == null || this._valueInstantiator.canCreateFromDouble()) {
                return this._valueInstantiator.createFromDouble(deserializationContext, jsonParser.mo13990z());
            }
            Object createUsingDelegate = this._valueInstantiator.createUsingDelegate(deserializationContext, _delegateDeserializer2.deserialize(jsonParser, deserializationContext));
            if (this._injectables != null) {
                injectValues(deserializationContext, createUsingDelegate);
            }
            return createUsingDelegate;
        } else if (K == JsonParser.NumberType.BIG_DECIMAL) {
            o43<Object> _delegateDeserializer3 = _delegateDeserializer();
            if (_delegateDeserializer3 == null || this._valueInstantiator.canCreateFromBigDecimal()) {
                return this._valueInstantiator.createFromBigDecimal(deserializationContext, jsonParser.mo13988y());
            }
            Object createUsingDelegate2 = this._valueInstantiator.createUsingDelegate(deserializationContext, _delegateDeserializer3.deserialize(jsonParser, deserializationContext));
            if (this._injectables != null) {
                injectValues(deserializationContext, createUsingDelegate2);
            }
            return createUsingDelegate2;
        } else {
            return deserializationContext.handleMissingInstantiator(handledType(), getValueInstantiator(), jsonParser, "no suitable creator method found to deserialize from Number value (%s)", jsonParser.mo13936L());
        }
    }

    public Object deserializeFromEmbedded(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (this._objectIdReader != null) {
            return deserializeFromObjectId(jsonParser, deserializationContext);
        }
        o43<Object> _delegateDeserializer2 = _delegateDeserializer();
        if (_delegateDeserializer2 == null || this._valueInstantiator.canCreateFromString()) {
            Object A = jsonParser.mo13924A();
            if (A == null || this._beanType.isTypeOrSuperTypeOf(A.getClass())) {
                return A;
            }
            return deserializationContext.handleWeirdNativeValue(this._beanType, A, jsonParser);
        }
        Object createUsingDelegate = this._valueInstantiator.createUsingDelegate(deserializationContext, _delegateDeserializer2.deserialize(jsonParser, deserializationContext));
        if (this._injectables != null) {
            injectValues(deserializationContext, createUsingDelegate);
        }
        return createUsingDelegate;
    }

    public Object deserializeFromNumber(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (this._objectIdReader != null) {
            return deserializeFromObjectId(jsonParser, deserializationContext);
        }
        o43<Object> _delegateDeserializer2 = _delegateDeserializer();
        JsonParser.NumberType K = jsonParser.mo13935K();
        if (K == JsonParser.NumberType.INT) {
            if (_delegateDeserializer2 == null || this._valueInstantiator.canCreateFromInt()) {
                return this._valueInstantiator.createFromInt(deserializationContext, jsonParser.mo13933I());
            }
            Object createUsingDelegate = this._valueInstantiator.createUsingDelegate(deserializationContext, _delegateDeserializer2.deserialize(jsonParser, deserializationContext));
            if (this._injectables != null) {
                injectValues(deserializationContext, createUsingDelegate);
            }
            return createUsingDelegate;
        } else if (K == JsonParser.NumberType.LONG) {
            if (_delegateDeserializer2 == null || this._valueInstantiator.canCreateFromInt()) {
                return this._valueInstantiator.createFromLong(deserializationContext, jsonParser.mo13934J());
            }
            Object createUsingDelegate2 = this._valueInstantiator.createUsingDelegate(deserializationContext, _delegateDeserializer2.deserialize(jsonParser, deserializationContext));
            if (this._injectables != null) {
                injectValues(deserializationContext, createUsingDelegate2);
            }
            return createUsingDelegate2;
        } else if (K != JsonParser.NumberType.BIG_INTEGER) {
            return deserializationContext.handleMissingInstantiator(handledType(), getValueInstantiator(), jsonParser, "no suitable creator method found to deserialize from Number value (%s)", jsonParser.mo13936L());
        } else if (_delegateDeserializer2 == null || this._valueInstantiator.canCreateFromBigInteger()) {
            return this._valueInstantiator.createFromBigInteger(deserializationContext, jsonParser.mo13971j());
        } else {
            Object createUsingDelegate3 = this._valueInstantiator.createUsingDelegate(deserializationContext, _delegateDeserializer2.deserialize(jsonParser, deserializationContext));
            if (this._injectables != null) {
                injectValues(deserializationContext, createUsingDelegate3);
            }
            return createUsingDelegate3;
        }
    }

    public abstract Object deserializeFromObject(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException;

    public Object deserializeFromObjectId(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object readObjectReference = this._objectIdReader.readObjectReference(jsonParser, deserializationContext);
        ObjectIdReader objectIdReader = this._objectIdReader;
        C2001a findObjectId = deserializationContext.findObjectId(readObjectReference, objectIdReader.generator, objectIdReader.resolver);
        Object f = findObjectId.mo15614f();
        if (f != null) {
            return f;
        }
        throw new UnresolvedForwardReference(jsonParser, "Could not resolve Object Id [" + readObjectReference + "] (for " + this._beanType + ").", jsonParser.mo13981q(), findObjectId);
    }

    public Object deserializeFromObjectUsingNonDefault(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        o43<Object> _delegateDeserializer2 = _delegateDeserializer();
        if (_delegateDeserializer2 != null) {
            Object createUsingDelegate = this._valueInstantiator.createUsingDelegate(deserializationContext, _delegateDeserializer2.deserialize(jsonParser, deserializationContext));
            if (this._injectables != null) {
                injectValues(deserializationContext, createUsingDelegate);
            }
            return createUsingDelegate;
        } else if (this._propertyBasedCreator != null) {
            return _deserializeUsingPropertyBased(jsonParser, deserializationContext);
        } else {
            Class<?> rawClass = this._beanType.getRawClass();
            if (wf0.m29490Q(rawClass)) {
                return deserializationContext.handleMissingInstantiator(rawClass, (ValueInstantiator) null, jsonParser, "non-static inner classes like this can only by instantiated using default, no-argument constructor", new Object[0]);
            }
            return deserializationContext.handleMissingInstantiator(rawClass, getValueInstantiator(), jsonParser, "cannot deserialize from Object value (no delegate- or property-based Creator)", new Object[0]);
        }
    }

    public Object deserializeFromString(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (this._objectIdReader != null) {
            return deserializeFromObjectId(jsonParser, deserializationContext);
        }
        o43<Object> _delegateDeserializer2 = _delegateDeserializer();
        if (_delegateDeserializer2 == null || this._valueInstantiator.canCreateFromString()) {
            return _deserializeFromString(jsonParser, deserializationContext);
        }
        Object createUsingDelegate = this._valueInstantiator.createUsingDelegate(deserializationContext, _delegateDeserializer2.deserialize(jsonParser, deserializationContext));
        if (this._injectables != null) {
            injectValues(deserializationContext, createUsingDelegate);
        }
        return createUsingDelegate;
    }

    public Object deserializeWithObjectId(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return deserializeFromObject(jsonParser, deserializationContext);
    }

    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, j07 j07) throws IOException {
        Object O;
        if (this._objectIdReader != null) {
            if (jsonParser.mo13957c() && (O = jsonParser.mo13939O()) != null) {
                return _handleTypedObjectId(jsonParser, deserializationContext, j07.deserializeTypedFromObject(jsonParser, deserializationContext), O);
            }
            JsonToken g = jsonParser.mo13965g();
            if (g != null) {
                if (g.isScalarValue()) {
                    return deserializeFromObjectId(jsonParser, deserializationContext);
                }
                if (g == JsonToken.START_OBJECT) {
                    g = jsonParser.mo13938N0();
                }
                if (g == JsonToken.FIELD_NAME && this._objectIdReader.maySerializeAsObject() && this._objectIdReader.isValidReferencePropertyName(jsonParser.mo13964f(), jsonParser)) {
                    return deserializeFromObjectId(jsonParser, deserializationContext);
                }
            }
        }
        return j07.deserializeTypedFromObject(jsonParser, deserializationContext);
    }

    public SettableBeanProperty findBackReference(String str) {
        Map<String, SettableBeanProperty> map = this._backRefs;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public o43<Object> findConvertingDeserializer(DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty) throws JsonMappingException {
        Object findDeserializationConverter;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector == null || (findDeserializationConverter = annotationIntrospector.findDeserializationConverter(settableBeanProperty.getMember())) == null) {
            return null;
        }
        ot0<Object, Object> converterInstance = deserializationContext.converterInstance(settableBeanProperty.getMember(), findDeserializationConverter);
        JavaType b = converterInstance.mo23477b(deserializationContext.getTypeFactory());
        return new StdDelegatingDeserializer(converterInstance, b, deserializationContext.findNonContextualValueDeserializer(b));
    }

    public SettableBeanProperty findProperty(PropertyName propertyName) {
        return findProperty(propertyName.getSimpleName());
    }

    @Deprecated
    public final Class<?> getBeanClass() {
        return this._beanType.getRawClass();
    }

    public AccessPattern getEmptyAccessPattern() {
        return AccessPattern.DYNAMIC;
    }

    public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
        try {
            return this._valueInstantiator.createUsingDefault(deserializationContext);
        } catch (IOException e) {
            return wf0.m29513g0(deserializationContext, e);
        }
    }

    public Collection<Object> getKnownPropertyNames() {
        ArrayList arrayList = new ArrayList();
        Iterator<SettableBeanProperty> it = this._beanProperties.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getName());
        }
        return arrayList;
    }

    public AccessPattern getNullAccessPattern() {
        return AccessPattern.ALWAYS_NULL;
    }

    public ObjectIdReader getObjectIdReader() {
        return this._objectIdReader;
    }

    public int getPropertyCount() {
        return this._beanProperties.size();
    }

    public ValueInstantiator getValueInstantiator() {
        return this._valueInstantiator;
    }

    public JavaType getValueType() {
        return this._beanType;
    }

    public void handleIgnoredProperty(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, String str) throws IOException {
        if (!deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES)) {
            jsonParser.mo13959c1();
            return;
        }
        throw IgnoredPropertyException.from(jsonParser, obj, str, getKnownPropertyNames());
    }

    public Object handlePolymorphic(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, fr6 fr6) throws IOException {
        o43<Object> _findSubclassDeserializer = _findSubclassDeserializer(deserializationContext, obj, fr6);
        if (_findSubclassDeserializer != null) {
            if (fr6 != null) {
                fr6.mo13855W();
                JsonParser x1 = fr6.mo20092x1();
                x1.mo13938N0();
                obj = _findSubclassDeserializer.deserialize(x1, deserializationContext, obj);
            }
            if (jsonParser != null) {
                return _findSubclassDeserializer.deserialize(jsonParser, deserializationContext, obj);
            }
            return obj;
        }
        if (fr6 != null) {
            obj = handleUnknownProperties(deserializationContext, obj, fr6);
        }
        if (jsonParser != null) {
            return deserialize(jsonParser, deserializationContext, obj);
        }
        return obj;
    }

    public Object handleUnknownProperties(DeserializationContext deserializationContext, Object obj, fr6 fr6) throws IOException {
        fr6.mo13855W();
        JsonParser x1 = fr6.mo20092x1();
        while (x1.mo13938N0() != JsonToken.END_OBJECT) {
            String f = x1.mo13964f();
            x1.mo13938N0();
            handleUnknownProperty(x1, deserializationContext, obj, f);
        }
        return obj;
    }

    public void handleUnknownProperty(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, String str) throws IOException {
        if (this._ignoreAllUnknown) {
            jsonParser.mo13959c1();
            return;
        }
        if (IgnorePropertiesUtil.m14343c(str, this._ignorableProps, this._includableProps)) {
            handleIgnoredProperty(jsonParser, deserializationContext, obj, str);
        }
        super.handleUnknownProperty(jsonParser, deserializationContext, obj, str);
    }

    public void handleUnknownVanilla(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, String str) throws IOException {
        if (IgnorePropertiesUtil.m14343c(str, this._ignorableProps, this._includableProps)) {
            handleIgnoredProperty(jsonParser, deserializationContext, obj, str);
            return;
        }
        SettableAnyProperty settableAnyProperty = this._anySetter;
        if (settableAnyProperty != null) {
            try {
                settableAnyProperty.deserializeAndSet(jsonParser, deserializationContext, obj, str);
            } catch (Exception e) {
                wrapAndThrow(e, obj, str, deserializationContext);
            }
        } else {
            handleUnknownProperty(jsonParser, deserializationContext, obj, str);
        }
    }

    public Class<?> handledType() {
        return this._beanType.getRawClass();
    }

    public boolean hasProperty(String str) {
        if (this._beanProperties.find(str) != null) {
            return true;
        }
        return false;
    }

    public boolean hasViews() {
        return this._needViewProcesing;
    }

    public void injectValues(DeserializationContext deserializationContext, Object obj) throws IOException {
        for (ValueInjector inject : this._injectables) {
            inject.inject(deserializationContext, obj);
        }
    }

    public boolean isCachable() {
        return true;
    }

    public boolean isCaseInsensitive() {
        return this._beanProperties.isCaseInsensitive();
    }

    public LogicalType logicalType() {
        return LogicalType.POJO;
    }

    public Iterator<SettableBeanProperty> properties() {
        BeanPropertyMap beanPropertyMap = this._beanProperties;
        if (beanPropertyMap != null) {
            return beanPropertyMap.iterator();
        }
        throw new IllegalStateException("Can only call after BeanDeserializer has been resolved");
    }

    public void replaceProperty(SettableBeanProperty settableBeanProperty, SettableBeanProperty settableBeanProperty2) {
        this._beanProperties.replace(settableBeanProperty, settableBeanProperty2);
    }

    public void resolve(DeserializationContext deserializationContext) throws JsonMappingException {
        SettableBeanProperty[] settableBeanPropertyArr;
        o43<Object> valueDeserializer;
        o43<Object> unwrappingDeserializer;
        ey1.C2255a aVar = null;
        boolean z = false;
        if (this._valueInstantiator.canCreateFromObjectWith()) {
            settableBeanPropertyArr = this._valueInstantiator.getFromObjectArguments(deserializationContext.getConfig());
            if (!(this._ignorableProps == null && this._includableProps == null)) {
                int length = settableBeanPropertyArr.length;
                for (int i = 0; i < length; i++) {
                    if (IgnorePropertiesUtil.m14343c(settableBeanPropertyArr[i].getName(), this._ignorableProps, this._includableProps)) {
                        settableBeanPropertyArr[i].markAsIgnorable();
                    }
                }
            }
        } else {
            settableBeanPropertyArr = null;
        }
        Iterator<SettableBeanProperty> it = this._beanProperties.iterator();
        while (it.hasNext()) {
            SettableBeanProperty next = it.next();
            if (!next.hasValueDeserializer()) {
                o43<Object> findConvertingDeserializer = findConvertingDeserializer(deserializationContext, next);
                if (findConvertingDeserializer == null) {
                    findConvertingDeserializer = deserializationContext.findNonContextualValueDeserializer(next.getType());
                }
                _replaceProperty(this._beanProperties, settableBeanPropertyArr, next, next.withValueDeserializer(findConvertingDeserializer));
            }
        }
        Iterator<SettableBeanProperty> it2 = this._beanProperties.iterator();
        v47 v47 = null;
        while (it2.hasNext()) {
            SettableBeanProperty next2 = it2.next();
            SettableBeanProperty _resolveManagedReferenceProperty = _resolveManagedReferenceProperty(deserializationContext, next2.withValueDeserializer(deserializationContext.handlePrimaryContextualization(next2.getValueDeserializer(), next2, next2.getType())));
            if (!(_resolveManagedReferenceProperty instanceof ManagedReferenceProperty)) {
                _resolveManagedReferenceProperty = _resolvedObjectIdProperty(deserializationContext, _resolveManagedReferenceProperty);
            }
            NameTransformer _findPropertyUnwrapper = _findPropertyUnwrapper(deserializationContext, _resolveManagedReferenceProperty);
            if (_findPropertyUnwrapper == null || (unwrappingDeserializer = valueDeserializer.unwrappingDeserializer(_findPropertyUnwrapper)) == (valueDeserializer = _resolveManagedReferenceProperty.getValueDeserializer()) || unwrappingDeserializer == null) {
                SettableBeanProperty _resolveInnerClassValuedProperty = _resolveInnerClassValuedProperty(deserializationContext, _resolveMergeAndNullSettings(deserializationContext, _resolveManagedReferenceProperty, _resolveManagedReferenceProperty.getMetadata()));
                if (_resolveInnerClassValuedProperty != next2) {
                    _replaceProperty(this._beanProperties, settableBeanPropertyArr, next2, _resolveInnerClassValuedProperty);
                }
                if (_resolveInnerClassValuedProperty.hasValueTypeDeserializer()) {
                    j07 valueTypeDeserializer = _resolveInnerClassValuedProperty.getValueTypeDeserializer();
                    if (valueTypeDeserializer.getTypeInclusion() == JsonTypeInfo.C1971As.EXTERNAL_PROPERTY) {
                        if (aVar == null) {
                            aVar = ey1.m16404d(this._beanType);
                        }
                        aVar.mo19545b(_resolveInnerClassValuedProperty, valueTypeDeserializer);
                        this._beanProperties.remove(_resolveInnerClassValuedProperty);
                    }
                }
            } else {
                SettableBeanProperty withValueDeserializer = _resolveManagedReferenceProperty.withValueDeserializer(unwrappingDeserializer);
                if (v47 == null) {
                    v47 = new v47();
                }
                v47.mo27059a(withValueDeserializer);
                this._beanProperties.remove(withValueDeserializer);
            }
        }
        SettableAnyProperty settableAnyProperty = this._anySetter;
        if (settableAnyProperty != null && !settableAnyProperty.hasValueDeserializer()) {
            SettableAnyProperty settableAnyProperty2 = this._anySetter;
            this._anySetter = settableAnyProperty2.withValueDeserializer(findDeserializer(deserializationContext, settableAnyProperty2.getType(), this._anySetter.getProperty()));
        }
        if (this._valueInstantiator.canCreateUsingDelegate()) {
            JavaType delegateType = this._valueInstantiator.getDelegateType(deserializationContext.getConfig());
            if (delegateType == null) {
                JavaType javaType = this._beanType;
                deserializationContext.reportBadDefinition(javaType, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'", new Object[]{wf0.m29480G(javaType), wf0.m29514h(this._valueInstantiator)}));
            }
            this._delegateDeserializer = mo15357a(deserializationContext, delegateType, this._valueInstantiator.getDelegateCreator());
        }
        if (this._valueInstantiator.canCreateUsingArrayDelegate()) {
            JavaType arrayDelegateType = this._valueInstantiator.getArrayDelegateType(deserializationContext.getConfig());
            if (arrayDelegateType == null) {
                JavaType javaType2 = this._beanType;
                deserializationContext.reportBadDefinition(javaType2, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'", new Object[]{wf0.m29480G(javaType2), wf0.m29514h(this._valueInstantiator)}));
            }
            this._arrayDelegateDeserializer = mo15357a(deserializationContext, arrayDelegateType, this._valueInstantiator.getArrayDelegateCreator());
        }
        if (settableBeanPropertyArr != null) {
            this._propertyBasedCreator = PropertyBasedCreator.m14068b(deserializationContext, this._valueInstantiator, settableBeanPropertyArr, this._beanProperties);
        }
        if (aVar != null) {
            this._externalTypeIdHandler = aVar.mo19546c(this._beanProperties);
            this._nonStandardCreation = true;
        }
        this._unwrappedPropertyHandler = v47;
        if (v47 != null) {
            this._nonStandardCreation = true;
        }
        if (this._vanillaProcessing && !this._nonStandardCreation) {
            z = true;
        }
        this._vanillaProcessing = z;
    }

    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return Boolean.TRUE;
    }

    public abstract o43<Object> unwrappingDeserializer(NameTransformer nameTransformer);

    public BeanDeserializerBase withBeanProperties(BeanPropertyMap beanPropertyMap) {
        throw new UnsupportedOperationException("Class " + getClass().getName() + " does not override `withBeanProperties()`, needs to");
    }

    public abstract BeanDeserializerBase withByNameInclusion(Set<String> set, Set<String> set2);

    @Deprecated
    public BeanDeserializerBase withIgnorableProperties(Set<String> set) {
        return withByNameInclusion(set, this._includableProps);
    }

    public abstract BeanDeserializerBase withIgnoreAllUnknown(boolean z);

    public abstract BeanDeserializerBase withObjectIdReader(ObjectIdReader objectIdReader);

    public void wrapAndThrow(Throwable th, Object obj, String str, DeserializationContext deserializationContext) throws IOException {
        throw JsonMappingException.wrapWithPath(mo15358b(th, deserializationContext), obj, str);
    }

    public Object wrapInstantiationProblem(Throwable th, DeserializationContext deserializationContext) throws IOException {
        while ((th instanceof InvocationTargetException) && th.getCause() != null) {
            th = th.getCause();
        }
        wf0.m29515h0(th);
        if (th instanceof IOException) {
            throw ((IOException) th);
        } else if (deserializationContext != null) {
            if (!deserializationContext.isEnabled(DeserializationFeature.WRAP_EXCEPTIONS)) {
                wf0.m29519j0(th);
            }
            return deserializationContext.handleInstantiationProblem(this._beanType.getRawClass(), (Object) null, th);
        } else {
            throw new IllegalArgumentException(th.getMessage(), th);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        r1 = r2._propertyBasedCreator;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.databind.deser.SettableBeanProperty findProperty(java.lang.String r3) {
        /*
            r2 = this;
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap r0 = r2._beanProperties
            if (r0 != 0) goto L_0x0006
            r0 = 0
            goto L_0x000a
        L_0x0006:
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r0 = r0.find((java.lang.String) r3)
        L_0x000a:
            if (r0 != 0) goto L_0x0014
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator r1 = r2._propertyBasedCreator
            if (r1 == 0) goto L_0x0014
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r0 = r1.mo15600e(r3)
        L_0x0014:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findProperty(java.lang.String):com.fasterxml.jackson.databind.deser.SettableBeanProperty");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        r1 = r2._propertyBasedCreator;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.databind.deser.SettableBeanProperty findProperty(int r3) {
        /*
            r2 = this;
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap r0 = r2._beanProperties
            if (r0 != 0) goto L_0x0006
            r0 = 0
            goto L_0x000a
        L_0x0006:
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r0 = r0.find((int) r3)
        L_0x000a:
            if (r0 != 0) goto L_0x0014
            com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator r1 = r2._propertyBasedCreator
            if (r1 == 0) goto L_0x0014
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r0 = r1.mo15599d(r3)
        L_0x0014:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BeanDeserializerBase.findProperty(int):com.fasterxml.jackson.databind.deser.SettableBeanProperty");
    }

    public BeanDeserializerBase(BeanDeserializerBase beanDeserializerBase) {
        this(beanDeserializerBase, beanDeserializerBase._ignoreAllUnknown);
    }

    public BeanDeserializerBase(BeanDeserializerBase beanDeserializerBase, boolean z) {
        super(beanDeserializerBase._beanType);
        this._beanType = beanDeserializerBase._beanType;
        this._valueInstantiator = beanDeserializerBase._valueInstantiator;
        this._delegateDeserializer = beanDeserializerBase._delegateDeserializer;
        this._arrayDelegateDeserializer = beanDeserializerBase._arrayDelegateDeserializer;
        this._propertyBasedCreator = beanDeserializerBase._propertyBasedCreator;
        this._beanProperties = beanDeserializerBase._beanProperties;
        this._backRefs = beanDeserializerBase._backRefs;
        this._ignorableProps = beanDeserializerBase._ignorableProps;
        this._ignoreAllUnknown = z;
        this._includableProps = beanDeserializerBase._includableProps;
        this._anySetter = beanDeserializerBase._anySetter;
        this._injectables = beanDeserializerBase._injectables;
        this._objectIdReader = beanDeserializerBase._objectIdReader;
        this._nonStandardCreation = beanDeserializerBase._nonStandardCreation;
        this._unwrappedPropertyHandler = beanDeserializerBase._unwrappedPropertyHandler;
        this._needViewProcesing = beanDeserializerBase._needViewProcesing;
        this._serializationShape = beanDeserializerBase._serializationShape;
        this._vanillaProcessing = beanDeserializerBase._vanillaProcessing;
    }

    public BeanDeserializerBase(BeanDeserializerBase beanDeserializerBase, NameTransformer nameTransformer) {
        super(beanDeserializerBase._beanType);
        this._beanType = beanDeserializerBase._beanType;
        this._valueInstantiator = beanDeserializerBase._valueInstantiator;
        this._delegateDeserializer = beanDeserializerBase._delegateDeserializer;
        this._arrayDelegateDeserializer = beanDeserializerBase._arrayDelegateDeserializer;
        this._propertyBasedCreator = beanDeserializerBase._propertyBasedCreator;
        this._backRefs = beanDeserializerBase._backRefs;
        this._ignorableProps = beanDeserializerBase._ignorableProps;
        this._ignoreAllUnknown = nameTransformer != null || beanDeserializerBase._ignoreAllUnknown;
        this._includableProps = beanDeserializerBase._includableProps;
        this._anySetter = beanDeserializerBase._anySetter;
        this._injectables = beanDeserializerBase._injectables;
        this._objectIdReader = beanDeserializerBase._objectIdReader;
        this._nonStandardCreation = beanDeserializerBase._nonStandardCreation;
        v47 v47 = beanDeserializerBase._unwrappedPropertyHandler;
        if (nameTransformer != null) {
            v47 = v47 != null ? v47.mo27061c(nameTransformer) : v47;
            this._beanProperties = beanDeserializerBase._beanProperties.renameAll(nameTransformer);
        } else {
            this._beanProperties = beanDeserializerBase._beanProperties;
        }
        this._unwrappedPropertyHandler = v47;
        this._needViewProcesing = beanDeserializerBase._needViewProcesing;
        this._serializationShape = beanDeserializerBase._serializationShape;
        this._vanillaProcessing = false;
    }

    public BeanDeserializerBase(BeanDeserializerBase beanDeserializerBase, ObjectIdReader objectIdReader) {
        super(beanDeserializerBase._beanType);
        this._beanType = beanDeserializerBase._beanType;
        this._valueInstantiator = beanDeserializerBase._valueInstantiator;
        this._delegateDeserializer = beanDeserializerBase._delegateDeserializer;
        this._arrayDelegateDeserializer = beanDeserializerBase._arrayDelegateDeserializer;
        this._propertyBasedCreator = beanDeserializerBase._propertyBasedCreator;
        this._backRefs = beanDeserializerBase._backRefs;
        this._ignorableProps = beanDeserializerBase._ignorableProps;
        this._ignoreAllUnknown = beanDeserializerBase._ignoreAllUnknown;
        this._includableProps = beanDeserializerBase._includableProps;
        this._anySetter = beanDeserializerBase._anySetter;
        this._injectables = beanDeserializerBase._injectables;
        this._nonStandardCreation = beanDeserializerBase._nonStandardCreation;
        this._unwrappedPropertyHandler = beanDeserializerBase._unwrappedPropertyHandler;
        this._needViewProcesing = beanDeserializerBase._needViewProcesing;
        this._serializationShape = beanDeserializerBase._serializationShape;
        this._objectIdReader = objectIdReader;
        if (objectIdReader == null) {
            this._beanProperties = beanDeserializerBase._beanProperties;
            this._vanillaProcessing = beanDeserializerBase._vanillaProcessing;
            return;
        }
        this._beanProperties = beanDeserializerBase._beanProperties.withProperty(new ObjectIdValueProperty(objectIdReader, PropertyMetadata.STD_REQUIRED));
        this._vanillaProcessing = false;
    }

    public BeanDeserializerBase(BeanDeserializerBase beanDeserializerBase, Set<String> set, Set<String> set2) {
        super(beanDeserializerBase._beanType);
        this._beanType = beanDeserializerBase._beanType;
        this._valueInstantiator = beanDeserializerBase._valueInstantiator;
        this._delegateDeserializer = beanDeserializerBase._delegateDeserializer;
        this._arrayDelegateDeserializer = beanDeserializerBase._arrayDelegateDeserializer;
        this._propertyBasedCreator = beanDeserializerBase._propertyBasedCreator;
        this._backRefs = beanDeserializerBase._backRefs;
        this._ignorableProps = set;
        this._ignoreAllUnknown = beanDeserializerBase._ignoreAllUnknown;
        this._includableProps = set2;
        this._anySetter = beanDeserializerBase._anySetter;
        this._injectables = beanDeserializerBase._injectables;
        this._nonStandardCreation = beanDeserializerBase._nonStandardCreation;
        this._unwrappedPropertyHandler = beanDeserializerBase._unwrappedPropertyHandler;
        this._needViewProcesing = beanDeserializerBase._needViewProcesing;
        this._serializationShape = beanDeserializerBase._serializationShape;
        this._vanillaProcessing = beanDeserializerBase._vanillaProcessing;
        this._objectIdReader = beanDeserializerBase._objectIdReader;
        this._beanProperties = beanDeserializerBase._beanProperties.withoutProperties(set, set2);
    }

    public BeanDeserializerBase(BeanDeserializerBase beanDeserializerBase, BeanPropertyMap beanPropertyMap) {
        super(beanDeserializerBase._beanType);
        this._beanType = beanDeserializerBase._beanType;
        this._valueInstantiator = beanDeserializerBase._valueInstantiator;
        this._delegateDeserializer = beanDeserializerBase._delegateDeserializer;
        this._arrayDelegateDeserializer = beanDeserializerBase._arrayDelegateDeserializer;
        this._propertyBasedCreator = beanDeserializerBase._propertyBasedCreator;
        this._beanProperties = beanPropertyMap;
        this._backRefs = beanDeserializerBase._backRefs;
        this._ignorableProps = beanDeserializerBase._ignorableProps;
        this._ignoreAllUnknown = beanDeserializerBase._ignoreAllUnknown;
        this._includableProps = beanDeserializerBase._includableProps;
        this._anySetter = beanDeserializerBase._anySetter;
        this._injectables = beanDeserializerBase._injectables;
        this._objectIdReader = beanDeserializerBase._objectIdReader;
        this._nonStandardCreation = beanDeserializerBase._nonStandardCreation;
        this._unwrappedPropertyHandler = beanDeserializerBase._unwrappedPropertyHandler;
        this._needViewProcesing = beanDeserializerBase._needViewProcesing;
        this._serializationShape = beanDeserializerBase._serializationShape;
        this._vanillaProcessing = beanDeserializerBase._vanillaProcessing;
    }

    @Deprecated
    public BeanDeserializerBase(BeanDeserializerBase beanDeserializerBase, Set<String> set) {
        this(beanDeserializerBase, set, beanDeserializerBase._includableProps);
    }
}
