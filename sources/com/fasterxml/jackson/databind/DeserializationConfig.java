package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.json.JsonReadFeature;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.cfg.CoercionAction;
import com.fasterxml.jackson.databind.cfg.CoercionConfigs;
import com.fasterxml.jackson.databind.cfg.CoercionInputShape;
import com.fasterxml.jackson.databind.cfg.ConfigOverrides;
import com.fasterxml.jackson.databind.cfg.ConstructorDetector;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.cfg.MapperConfigBase;
import com.fasterxml.jackson.databind.introspect.C2021a;
import com.fasterxml.jackson.databind.introspect.SimpleMixInResolver;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import java.util.Collection;

public final class DeserializationConfig extends MapperConfigBase<DeserializationFeature, DeserializationConfig> {

    /* renamed from: e */
    public static final int f9872e = MapperConfig.collectFeatureDefaults(DeserializationFeature.class);
    private static final long serialVersionUID = 2;
    public final CoercionConfigs _coercionConfigs;
    public final ConstructorDetector _ctorDetector;
    public final int _deserFeatures;
    public final int _formatReadFeatures;
    public final int _formatReadFeaturesToChange;
    public final JsonNodeFactory _nodeFactory;
    public final int _parserFeatures;
    public final int _parserFeaturesToChange;
    public final th3<nd1> _problemHandlers;

    public DeserializationConfig(BaseSettings baseSettings, jd6 jd6, SimpleMixInResolver simpleMixInResolver, RootNameLookup rootNameLookup, ConfigOverrides configOverrides, CoercionConfigs coercionConfigs) {
        super(baseSettings, jd6, simpleMixInResolver, rootNameLookup, configOverrides);
        this._deserFeatures = f9872e;
        this._problemHandlers = null;
        this._nodeFactory = JsonNodeFactory.instance;
        this._ctorDetector = null;
        this._coercionConfigs = coercionConfigs;
        this._parserFeatures = 0;
        this._parserFeaturesToChange = 0;
        this._formatReadFeatures = 0;
        this._formatReadFeaturesToChange = 0;
    }

    /* renamed from: a */
    public final DeserializationConfig mo14244a(b82... b82Arr) {
        JsonParser.Feature mappedFeature;
        int i = this._parserFeatures;
        int i2 = this._parserFeaturesToChange;
        int i3 = this._formatReadFeatures;
        int i4 = this._formatReadFeaturesToChange;
        int i5 = i2;
        int i6 = i3;
        int i7 = i4;
        int i8 = i;
        for (JsonReadFeature jsonReadFeature : b82Arr) {
            int mask = jsonReadFeature.getMask();
            i6 |= mask;
            i7 |= mask;
            if ((jsonReadFeature instanceof JsonReadFeature) && (mappedFeature = jsonReadFeature.mappedFeature()) != null) {
                int mask2 = mappedFeature.getMask();
                i8 |= mask2;
                i5 |= mask2;
            }
        }
        if (this._formatReadFeatures == i6 && this._formatReadFeaturesToChange == i7 && this._parserFeatures == i8 && this._parserFeaturesToChange == i5) {
            return this;
        }
        return new DeserializationConfig(this, this._mapperFeatures, this._deserFeatures, i8, i5, i6, i7);
    }

    /* renamed from: b */
    public final DeserializationConfig mo14245b(b82... b82Arr) {
        JsonParser.Feature mappedFeature;
        int i = this._parserFeatures;
        int i2 = this._parserFeaturesToChange;
        int i3 = this._formatReadFeatures;
        int i4 = this._formatReadFeaturesToChange;
        int i5 = i2;
        int i6 = i3;
        int i7 = i4;
        int i8 = i;
        for (JsonReadFeature jsonReadFeature : b82Arr) {
            int mask = jsonReadFeature.getMask();
            i6 &= ~mask;
            i7 |= mask;
            if ((jsonReadFeature instanceof JsonReadFeature) && (mappedFeature = jsonReadFeature.mappedFeature()) != null) {
                int mask2 = mappedFeature.getMask();
                i8 &= ~mask2;
                i5 |= mask2;
            }
        }
        if (this._formatReadFeatures == i6 && this._formatReadFeaturesToChange == i7 && this._parserFeatures == i8 && this._parserFeaturesToChange == i5) {
            return this;
        }
        return new DeserializationConfig(this, this._mapperFeatures, this._deserFeatures, i8, i5, i6, i7);
    }

    public CoercionAction findCoercionAction(LogicalType logicalType, Class<?> cls, CoercionInputShape coercionInputShape) {
        return this._coercionConfigs.findCoercion(this, logicalType, cls, coercionInputShape);
    }

    public CoercionAction findCoercionFromBlankString(LogicalType logicalType, Class<?> cls, CoercionAction coercionAction) {
        return this._coercionConfigs.findCoercionFromBlankString(this, logicalType, cls, coercionAction);
    }

    public j07 findTypeDeserializer(JavaType javaType) throws JsonMappingException {
        C2021a t = introspectClassAnnotations(javaType.getRawClass()).mo23462t();
        l17<?> findTypeResolver = getAnnotationIntrospector().findTypeResolver(this, t, javaType);
        Collection<NamedType> collection = null;
        if (findTypeResolver == null) {
            findTypeResolver = getDefaultTyper(javaType);
            if (findTypeResolver == null) {
                return null;
            }
        } else {
            collection = getSubtypeResolver().collectAndResolveSubtypesByTypeId(this, t);
        }
        return findTypeResolver.buildTypeDeserializer(this, javaType, collection);
    }

    public BaseSettings getBaseSettings() {
        return this._base;
    }

    public ConstructorDetector getConstructorDetector() {
        ConstructorDetector constructorDetector = this._ctorDetector;
        if (constructorDetector == null) {
            return ConstructorDetector.DEFAULT;
        }
        return constructorDetector;
    }

    public final int getDeserializationFeatures() {
        return this._deserFeatures;
    }

    public final JsonNodeFactory getNodeFactory() {
        return this._nodeFactory;
    }

    public th3<nd1> getProblemHandlers() {
        return this._problemHandlers;
    }

    public final boolean hasDeserializationFeatures(int i) {
        if ((this._deserFeatures & i) == i) {
            return true;
        }
        return false;
    }

    public final boolean hasSomeOfFeatures(int i) {
        if ((i & this._deserFeatures) != 0) {
            return true;
        }
        return false;
    }

    public JsonParser initialize(JsonParser jsonParser) {
        int i = this._parserFeaturesToChange;
        if (i != 0) {
            jsonParser.mo13944Q0(this._parserFeatures, i);
        }
        int i2 = this._formatReadFeaturesToChange;
        if (i2 != 0) {
            jsonParser.mo13942P0(this._formatReadFeatures, i2);
        }
        return jsonParser;
    }

    public n00 introspect(JavaType javaType) {
        return getClassIntrospector().forDeserialization(this, javaType, this);
    }

    public n00 introspectForBuilder(JavaType javaType, n00 n00) {
        return getClassIntrospector().forDeserializationWithBuilder(this, javaType, this, n00);
    }

    public n00 introspectForCreation(JavaType javaType) {
        return getClassIntrospector().forCreation(this, javaType, this);
    }

    public final boolean isEnabled(DeserializationFeature deserializationFeature) {
        return (deserializationFeature.getMask() & this._deserFeatures) != 0;
    }

    public final boolean requiresFullValue() {
        return DeserializationFeature.FAIL_ON_TRAILING_TOKENS.enabledIn(this._deserFeatures);
    }

    public boolean useRootWrapping() {
        PropertyName propertyName = this._rootName;
        if (propertyName != null) {
            return !propertyName.isEmpty();
        }
        return isEnabled(DeserializationFeature.UNWRAP_ROOT_VALUE);
    }

    public DeserializationConfig withFeatures(DeserializationFeature... deserializationFeatureArr) {
        int i = this._deserFeatures;
        int i2 = i;
        for (DeserializationFeature mask : deserializationFeatureArr) {
            i2 |= mask.getMask();
        }
        if (i2 == this._deserFeatures) {
            return this;
        }
        return new DeserializationConfig(this, this._mapperFeatures, i2, this._parserFeatures, this._parserFeaturesToChange, this._formatReadFeatures, this._formatReadFeaturesToChange);
    }

    public DeserializationConfig withHandler(nd1 nd1) {
        if (th3.m27749a(this._problemHandlers, nd1)) {
            return this;
        }
        return new DeserializationConfig(this, (th3<nd1>) new th3(nd1, this._problemHandlers));
    }

    public DeserializationConfig withNoProblemHandlers() {
        if (this._problemHandlers == null) {
            return this;
        }
        return new DeserializationConfig(this, (th3<nd1>) null);
    }

    public DeserializationConfig without(DeserializationFeature deserializationFeature) {
        int i = this._deserFeatures & (~deserializationFeature.getMask());
        if (i == this._deserFeatures) {
            return this;
        }
        return new DeserializationConfig(this, this._mapperFeatures, i, this._parserFeatures, this._parserFeaturesToChange, this._formatReadFeatures, this._formatReadFeaturesToChange);
    }

    public DeserializationConfig withoutFeatures(DeserializationFeature... deserializationFeatureArr) {
        int i = this._deserFeatures;
        int i2 = i;
        for (DeserializationFeature mask : deserializationFeatureArr) {
            i2 &= ~mask.getMask();
        }
        if (i2 == this._deserFeatures) {
            return this;
        }
        return new DeserializationConfig(this, this._mapperFeatures, i2, this._parserFeatures, this._parserFeaturesToChange, this._formatReadFeatures, this._formatReadFeaturesToChange);
    }

    public final DeserializationConfig _withBase(BaseSettings baseSettings) {
        return this._base == baseSettings ? this : new DeserializationConfig(this, baseSettings);
    }

    public final DeserializationConfig _withMapperFeatures(long j) {
        return new DeserializationConfig(this, j, this._deserFeatures, this._parserFeatures, this._parserFeaturesToChange, this._formatReadFeatures, this._formatReadFeaturesToChange);
    }

    @Deprecated
    public n00 introspectForBuilder(JavaType javaType) {
        return getClassIntrospector().forDeserializationWithBuilder(this, javaType, this);
    }

    public final boolean isEnabled(JsonParser.Feature feature, JsonFactory jsonFactory) {
        if ((feature.getMask() & this._parserFeaturesToChange) == 0) {
            return jsonFactory.isEnabled(feature);
        }
        return (feature.getMask() & this._parserFeatures) != 0;
    }

    public DeserializationConfig withRootName(PropertyName propertyName) {
        if (propertyName == null) {
            if (this._rootName == null) {
                return this;
            }
        } else if (propertyName.equals(this._rootName)) {
            return this;
        }
        return new DeserializationConfig(this, propertyName);
    }

    public DeserializationConfig withView(Class<?> cls) {
        return this._view == cls ? this : new DeserializationConfig(this, cls);
    }

    public DeserializationConfig with(jd6 jd6) {
        return this._subtypeResolver == jd6 ? this : new DeserializationConfig(this, jd6);
    }

    public DeserializationConfig without(DeserializationFeature deserializationFeature, DeserializationFeature... deserializationFeatureArr) {
        int i = (~deserializationFeature.getMask()) & this._deserFeatures;
        int i2 = i;
        for (DeserializationFeature mask : deserializationFeatureArr) {
            i2 &= ~mask.getMask();
        }
        if (i2 == this._deserFeatures) {
            return this;
        }
        return new DeserializationConfig(this, this._mapperFeatures, i2, this._parserFeatures, this._parserFeaturesToChange, this._formatReadFeatures, this._formatReadFeaturesToChange);
    }

    public DeserializationConfig with(ContextAttributes contextAttributes) {
        return contextAttributes == this._attributes ? this : new DeserializationConfig(this, contextAttributes);
    }

    public JsonParser initialize(JsonParser jsonParser, d82 d82) {
        int i = this._parserFeaturesToChange;
        if (i != 0) {
            jsonParser.mo13944Q0(this._parserFeatures, i);
        }
        int i2 = this._formatReadFeaturesToChange;
        if (i2 != 0) {
            jsonParser.mo13942P0(this._formatReadFeatures, i2);
        }
        if (d82 != null) {
            jsonParser.mo13954a1(d82);
        }
        return jsonParser;
    }

    public DeserializationConfig with(DeserializationFeature deserializationFeature) {
        int mask = this._deserFeatures | deserializationFeature.getMask();
        if (mask == this._deserFeatures) {
            return this;
        }
        return new DeserializationConfig(this, this._mapperFeatures, mask, this._parserFeatures, this._parserFeaturesToChange, this._formatReadFeatures, this._formatReadFeaturesToChange);
    }

    public DeserializationConfig withFeatures(JsonParser.Feature... featureArr) {
        int i = this._parserFeatures;
        int i2 = this._parserFeaturesToChange;
        int i3 = i;
        int i4 = i2;
        for (JsonParser.Feature mask : featureArr) {
            int mask2 = mask.getMask();
            i3 |= mask2;
            i4 |= mask2;
        }
        if (this._parserFeatures == i3 && this._parserFeaturesToChange == i4) {
            return this;
        }
        return new DeserializationConfig(this, this._mapperFeatures, this._deserFeatures, i3, i4, this._formatReadFeatures, this._formatReadFeaturesToChange);
    }

    public DeserializationConfig withoutFeatures(JsonParser.Feature... featureArr) {
        int i = this._parserFeatures;
        int i2 = this._parserFeaturesToChange;
        int i3 = i;
        int i4 = i2;
        for (JsonParser.Feature mask : featureArr) {
            int mask2 = mask.getMask();
            i3 &= ~mask2;
            i4 |= mask2;
        }
        if (this._parserFeatures == i3 && this._parserFeaturesToChange == i4) {
            return this;
        }
        return new DeserializationConfig(this, this._mapperFeatures, this._deserFeatures, i3, i4, this._formatReadFeatures, this._formatReadFeaturesToChange);
    }

    public DeserializationConfig with(DeserializationFeature deserializationFeature, DeserializationFeature... deserializationFeatureArr) {
        int mask = deserializationFeature.getMask() | this._deserFeatures;
        int i = mask;
        for (DeserializationFeature mask2 : deserializationFeatureArr) {
            i |= mask2.getMask();
        }
        if (i == this._deserFeatures) {
            return this;
        }
        return new DeserializationConfig(this, this._mapperFeatures, i, this._parserFeatures, this._parserFeaturesToChange, this._formatReadFeatures, this._formatReadFeaturesToChange);
    }

    public DeserializationConfig without(JsonParser.Feature feature) {
        int i = this._parserFeatures & (~feature.getMask());
        int mask = this._parserFeaturesToChange | feature.getMask();
        if (this._parserFeatures == i && this._parserFeaturesToChange == mask) {
            return this;
        }
        return new DeserializationConfig(this, this._mapperFeatures, this._deserFeatures, i, mask, this._formatReadFeatures, this._formatReadFeaturesToChange);
    }

    public DeserializationConfig withFeatures(b82... b82Arr) {
        if (b82Arr.length > 0 && (b82Arr[0] instanceof JsonReadFeature)) {
            return mo14244a(b82Arr);
        }
        int i = this._formatReadFeatures;
        int i2 = this._formatReadFeaturesToChange;
        int i3 = i;
        int i4 = i2;
        for (b82 mask : b82Arr) {
            int mask2 = mask.getMask();
            i3 |= mask2;
            i4 |= mask2;
        }
        if (this._formatReadFeatures == i3 && this._formatReadFeaturesToChange == i4) {
            return this;
        }
        return new DeserializationConfig(this, this._mapperFeatures, this._deserFeatures, this._parserFeatures, this._parserFeaturesToChange, i3, i4);
    }

    public DeserializationConfig without(b82 b82) {
        if (b82 instanceof JsonReadFeature) {
            return mo14245b(b82);
        }
        int i = this._formatReadFeatures & (~b82.getMask());
        int mask = this._formatReadFeaturesToChange | b82.getMask();
        if (this._formatReadFeatures == i && this._formatReadFeaturesToChange == mask) {
            return this;
        }
        return new DeserializationConfig(this, this._mapperFeatures, this._deserFeatures, this._parserFeatures, this._parserFeaturesToChange, i, mask);
    }

    public DeserializationConfig withoutFeatures(b82... b82Arr) {
        if (b82Arr.length > 0 && (b82Arr[0] instanceof JsonReadFeature)) {
            return mo14245b(b82Arr);
        }
        int i = this._formatReadFeatures;
        int i2 = this._formatReadFeaturesToChange;
        int i3 = i;
        int i4 = i2;
        for (b82 mask : b82Arr) {
            int mask2 = mask.getMask();
            i3 &= ~mask2;
            i4 |= mask2;
        }
        if (this._formatReadFeatures == i3 && this._formatReadFeaturesToChange == i4) {
            return this;
        }
        return new DeserializationConfig(this, this._mapperFeatures, this._deserFeatures, this._parserFeatures, this._parserFeaturesToChange, i3, i4);
    }

    public DeserializationConfig(DeserializationConfig deserializationConfig, jd6 jd6, SimpleMixInResolver simpleMixInResolver, RootNameLookup rootNameLookup, ConfigOverrides configOverrides, CoercionConfigs coercionConfigs) {
        super(deserializationConfig, jd6, simpleMixInResolver, rootNameLookup, configOverrides);
        this._deserFeatures = deserializationConfig._deserFeatures;
        this._problemHandlers = deserializationConfig._problemHandlers;
        this._nodeFactory = deserializationConfig._nodeFactory;
        this._ctorDetector = deserializationConfig._ctorDetector;
        this._coercionConfigs = coercionConfigs;
        this._parserFeatures = deserializationConfig._parserFeatures;
        this._parserFeaturesToChange = deserializationConfig._parserFeaturesToChange;
        this._formatReadFeatures = deserializationConfig._formatReadFeatures;
        this._formatReadFeaturesToChange = deserializationConfig._formatReadFeaturesToChange;
    }

    public DeserializationConfig with(JsonParser.Feature feature) {
        int mask = this._parserFeatures | feature.getMask();
        int mask2 = this._parserFeaturesToChange | feature.getMask();
        if (this._parserFeatures == mask && this._parserFeaturesToChange == mask2) {
            return this;
        }
        return new DeserializationConfig(this, this._mapperFeatures, this._deserFeatures, mask, mask2, this._formatReadFeatures, this._formatReadFeaturesToChange);
    }

    public DeserializationConfig with(b82 b82) {
        if (b82 instanceof JsonReadFeature) {
            return mo14244a(b82);
        }
        int mask = this._formatReadFeatures | b82.getMask();
        int mask2 = this._formatReadFeaturesToChange | b82.getMask();
        if (this._formatReadFeatures == mask && this._formatReadFeaturesToChange == mask2) {
            return this;
        }
        return new DeserializationConfig(this, this._mapperFeatures, this._deserFeatures, this._parserFeatures, this._parserFeaturesToChange, mask, mask2);
    }

    public DeserializationConfig with(JsonNodeFactory jsonNodeFactory) {
        if (this._nodeFactory == jsonNodeFactory) {
            return this;
        }
        return new DeserializationConfig(this, jsonNodeFactory);
    }

    @Deprecated
    public DeserializationConfig(BaseSettings baseSettings, jd6 jd6, SimpleMixInResolver simpleMixInResolver, RootNameLookup rootNameLookup, ConfigOverrides configOverrides) {
        this(baseSettings, jd6, simpleMixInResolver, rootNameLookup, configOverrides, new CoercionConfigs());
    }

    public DeserializationConfig with(ConstructorDetector constructorDetector) {
        if (this._ctorDetector == constructorDetector) {
            return this;
        }
        return new DeserializationConfig(this, constructorDetector);
    }

    @Deprecated
    public DeserializationConfig(DeserializationConfig deserializationConfig, SimpleMixInResolver simpleMixInResolver, RootNameLookup rootNameLookup, ConfigOverrides configOverrides) {
        this(deserializationConfig, deserializationConfig._subtypeResolver, simpleMixInResolver, rootNameLookup, configOverrides, new CoercionConfigs());
    }

    public DeserializationConfig(DeserializationConfig deserializationConfig, long j, int i, int i2, int i3, int i4, int i5) {
        super(deserializationConfig, j);
        this._deserFeatures = i;
        this._problemHandlers = deserializationConfig._problemHandlers;
        this._nodeFactory = deserializationConfig._nodeFactory;
        this._coercionConfigs = deserializationConfig._coercionConfigs;
        this._ctorDetector = deserializationConfig._ctorDetector;
        this._parserFeatures = i2;
        this._parserFeaturesToChange = i3;
        this._formatReadFeatures = i4;
        this._formatReadFeaturesToChange = i5;
    }

    public DeserializationConfig(DeserializationConfig deserializationConfig, jd6 jd6) {
        super(deserializationConfig, jd6);
        this._deserFeatures = deserializationConfig._deserFeatures;
        this._problemHandlers = deserializationConfig._problemHandlers;
        this._nodeFactory = deserializationConfig._nodeFactory;
        this._coercionConfigs = deserializationConfig._coercionConfigs;
        this._ctorDetector = deserializationConfig._ctorDetector;
        this._parserFeatures = deserializationConfig._parserFeatures;
        this._parserFeaturesToChange = deserializationConfig._parserFeaturesToChange;
        this._formatReadFeatures = deserializationConfig._formatReadFeatures;
        this._formatReadFeaturesToChange = deserializationConfig._formatReadFeaturesToChange;
    }

    public DeserializationConfig(DeserializationConfig deserializationConfig, BaseSettings baseSettings) {
        super(deserializationConfig, baseSettings);
        this._deserFeatures = deserializationConfig._deserFeatures;
        this._problemHandlers = deserializationConfig._problemHandlers;
        this._nodeFactory = deserializationConfig._nodeFactory;
        this._coercionConfigs = deserializationConfig._coercionConfigs;
        this._ctorDetector = deserializationConfig._ctorDetector;
        this._parserFeatures = deserializationConfig._parserFeatures;
        this._parserFeaturesToChange = deserializationConfig._parserFeaturesToChange;
        this._formatReadFeatures = deserializationConfig._formatReadFeatures;
        this._formatReadFeaturesToChange = deserializationConfig._formatReadFeaturesToChange;
    }

    public DeserializationConfig(DeserializationConfig deserializationConfig, JsonNodeFactory jsonNodeFactory) {
        super(deserializationConfig);
        this._deserFeatures = deserializationConfig._deserFeatures;
        this._problemHandlers = deserializationConfig._problemHandlers;
        this._nodeFactory = jsonNodeFactory;
        this._coercionConfigs = deserializationConfig._coercionConfigs;
        this._ctorDetector = deserializationConfig._ctorDetector;
        this._parserFeatures = deserializationConfig._parserFeatures;
        this._parserFeaturesToChange = deserializationConfig._parserFeaturesToChange;
        this._formatReadFeatures = deserializationConfig._formatReadFeatures;
        this._formatReadFeaturesToChange = deserializationConfig._formatReadFeaturesToChange;
    }

    public DeserializationConfig(DeserializationConfig deserializationConfig, ConstructorDetector constructorDetector) {
        super(deserializationConfig);
        this._deserFeatures = deserializationConfig._deserFeatures;
        this._problemHandlers = deserializationConfig._problemHandlers;
        this._nodeFactory = deserializationConfig._nodeFactory;
        this._coercionConfigs = deserializationConfig._coercionConfigs;
        this._ctorDetector = constructorDetector;
        this._parserFeatures = deserializationConfig._parserFeatures;
        this._parserFeaturesToChange = deserializationConfig._parserFeaturesToChange;
        this._formatReadFeatures = deserializationConfig._formatReadFeatures;
        this._formatReadFeaturesToChange = deserializationConfig._formatReadFeaturesToChange;
    }

    public DeserializationConfig(DeserializationConfig deserializationConfig, th3<nd1> th3) {
        super(deserializationConfig);
        this._deserFeatures = deserializationConfig._deserFeatures;
        this._problemHandlers = th3;
        this._nodeFactory = deserializationConfig._nodeFactory;
        this._coercionConfigs = deserializationConfig._coercionConfigs;
        this._ctorDetector = deserializationConfig._ctorDetector;
        this._parserFeatures = deserializationConfig._parserFeatures;
        this._parserFeaturesToChange = deserializationConfig._parserFeaturesToChange;
        this._formatReadFeatures = deserializationConfig._formatReadFeatures;
        this._formatReadFeaturesToChange = deserializationConfig._formatReadFeaturesToChange;
    }

    public DeserializationConfig(DeserializationConfig deserializationConfig, PropertyName propertyName) {
        super(deserializationConfig, propertyName);
        this._deserFeatures = deserializationConfig._deserFeatures;
        this._problemHandlers = deserializationConfig._problemHandlers;
        this._nodeFactory = deserializationConfig._nodeFactory;
        this._coercionConfigs = deserializationConfig._coercionConfigs;
        this._ctorDetector = deserializationConfig._ctorDetector;
        this._parserFeatures = deserializationConfig._parserFeatures;
        this._parserFeaturesToChange = deserializationConfig._parserFeaturesToChange;
        this._formatReadFeatures = deserializationConfig._formatReadFeatures;
        this._formatReadFeaturesToChange = deserializationConfig._formatReadFeaturesToChange;
    }

    public DeserializationConfig(DeserializationConfig deserializationConfig, Class<?> cls) {
        super(deserializationConfig, cls);
        this._deserFeatures = deserializationConfig._deserFeatures;
        this._problemHandlers = deserializationConfig._problemHandlers;
        this._nodeFactory = deserializationConfig._nodeFactory;
        this._coercionConfigs = deserializationConfig._coercionConfigs;
        this._ctorDetector = deserializationConfig._ctorDetector;
        this._parserFeatures = deserializationConfig._parserFeatures;
        this._parserFeaturesToChange = deserializationConfig._parserFeaturesToChange;
        this._formatReadFeatures = deserializationConfig._formatReadFeatures;
        this._formatReadFeaturesToChange = deserializationConfig._formatReadFeaturesToChange;
    }

    public DeserializationConfig(DeserializationConfig deserializationConfig, ContextAttributes contextAttributes) {
        super(deserializationConfig, contextAttributes);
        this._deserFeatures = deserializationConfig._deserFeatures;
        this._problemHandlers = deserializationConfig._problemHandlers;
        this._nodeFactory = deserializationConfig._nodeFactory;
        this._coercionConfigs = deserializationConfig._coercionConfigs;
        this._ctorDetector = deserializationConfig._ctorDetector;
        this._parserFeatures = deserializationConfig._parserFeatures;
        this._parserFeaturesToChange = deserializationConfig._parserFeaturesToChange;
        this._formatReadFeatures = deserializationConfig._formatReadFeatures;
        this._formatReadFeaturesToChange = deserializationConfig._formatReadFeaturesToChange;
    }

    public DeserializationConfig(DeserializationConfig deserializationConfig, SimpleMixInResolver simpleMixInResolver) {
        super(deserializationConfig, simpleMixInResolver);
        this._deserFeatures = deserializationConfig._deserFeatures;
        this._problemHandlers = deserializationConfig._problemHandlers;
        this._nodeFactory = deserializationConfig._nodeFactory;
        this._coercionConfigs = deserializationConfig._coercionConfigs;
        this._ctorDetector = deserializationConfig._ctorDetector;
        this._parserFeatures = deserializationConfig._parserFeatures;
        this._parserFeaturesToChange = deserializationConfig._parserFeaturesToChange;
        this._formatReadFeatures = deserializationConfig._formatReadFeatures;
        this._formatReadFeaturesToChange = deserializationConfig._formatReadFeaturesToChange;
    }
}
