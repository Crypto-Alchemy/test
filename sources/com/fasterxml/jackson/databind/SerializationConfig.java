package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.json.JsonWriteFeature;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.cfg.ConfigOverrides;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.cfg.MapperConfigBase;
import com.fasterxml.jackson.databind.introspect.SimpleMixInResolver;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import java.text.DateFormat;

public final class SerializationConfig extends MapperConfigBase<SerializationFeature, SerializationConfig> {
    public static final su4 DEFAULT_PRETTY_PRINTER = new DefaultPrettyPrinter();

    /* renamed from: e */
    public static final int f9883e = MapperConfig.collectFeatureDefaults(SerializationFeature.class);
    private static final long serialVersionUID = 1;
    public final su4 _defaultPrettyPrinter;
    public final p12 _filterProvider;
    public final int _formatWriteFeatures;
    public final int _formatWriteFeaturesToChange;
    public final int _generatorFeatures;
    public final int _generatorFeaturesToChange;
    public final int _serFeatures;

    public SerializationConfig(BaseSettings baseSettings, jd6 jd6, SimpleMixInResolver simpleMixInResolver, RootNameLookup rootNameLookup, ConfigOverrides configOverrides) {
        super(baseSettings, jd6, simpleMixInResolver, rootNameLookup, configOverrides);
        this._serFeatures = f9883e;
        this._defaultPrettyPrinter = DEFAULT_PRETTY_PRINTER;
        this._generatorFeatures = 0;
        this._generatorFeaturesToChange = 0;
        this._formatWriteFeatures = 0;
        this._formatWriteFeaturesToChange = 0;
    }

    /* renamed from: a */
    public final SerializationConfig mo15002a(b82... b82Arr) {
        JsonGenerator.Feature mappedFeature;
        int i = this._generatorFeatures;
        int i2 = this._generatorFeaturesToChange;
        int i3 = this._formatWriteFeatures;
        int i4 = this._formatWriteFeaturesToChange;
        int i5 = i2;
        int i6 = i3;
        int i7 = i4;
        int i8 = i;
        for (JsonWriteFeature jsonWriteFeature : b82Arr) {
            int mask = jsonWriteFeature.getMask();
            i6 |= mask;
            i7 |= mask;
            if ((jsonWriteFeature instanceof JsonWriteFeature) && (mappedFeature = jsonWriteFeature.mappedFeature()) != null) {
                int mask2 = mappedFeature.getMask();
                i8 |= mask2;
                i5 |= mask2;
            }
        }
        if (this._formatWriteFeatures == i6 && this._formatWriteFeaturesToChange == i7 && this._generatorFeatures == i8 && this._generatorFeaturesToChange == i5) {
            return this;
        }
        return new SerializationConfig(this, this._mapperFeatures, this._serFeatures, i8, i5, i6, i7);
    }

    /* renamed from: b */
    public final SerializationConfig mo15003b(b82... b82Arr) {
        JsonGenerator.Feature mappedFeature;
        int i = this._generatorFeatures;
        int i2 = this._generatorFeaturesToChange;
        int i3 = this._formatWriteFeatures;
        int i4 = this._formatWriteFeaturesToChange;
        int i5 = i2;
        int i6 = i3;
        int i7 = i4;
        int i8 = i;
        for (JsonWriteFeature jsonWriteFeature : b82Arr) {
            int mask = jsonWriteFeature.getMask();
            i6 &= ~mask;
            i7 |= mask;
            if ((jsonWriteFeature instanceof JsonWriteFeature) && (mappedFeature = jsonWriteFeature.mappedFeature()) != null) {
                int mask2 = mappedFeature.getMask();
                i8 &= ~mask2;
                i5 |= mask2;
            }
        }
        if (this._formatWriteFeatures == i6 && this._formatWriteFeaturesToChange == i7 && this._generatorFeatures == i8 && this._generatorFeaturesToChange == i5) {
            return this;
        }
        return new SerializationConfig(this, this._mapperFeatures, this._serFeatures, i8, i5, i6, i7);
    }

    public su4 constructDefaultPrettyPrinter() {
        su4 su4 = this._defaultPrettyPrinter;
        if (su4 instanceof ew2) {
            return (su4) ((ew2) su4).createInstance();
        }
        return su4;
    }

    public su4 getDefaultPrettyPrinter() {
        return this._defaultPrettyPrinter;
    }

    public p12 getFilterProvider() {
        return null;
    }

    public final int getSerializationFeatures() {
        return this._serFeatures;
    }

    @Deprecated
    public JsonInclude.Include getSerializationInclusion() {
        JsonInclude.Include valueInclusion = getDefaultPropertyInclusion().getValueInclusion();
        if (valueInclusion == JsonInclude.Include.USE_DEFAULTS) {
            return JsonInclude.Include.ALWAYS;
        }
        return valueInclusion;
    }

    public final boolean hasSerializationFeatures(int i) {
        if ((this._serFeatures & i) == i) {
            return true;
        }
        return false;
    }

    public void initialize(JsonGenerator jsonGenerator) {
        su4 constructDefaultPrettyPrinter;
        if (SerializationFeature.INDENT_OUTPUT.enabledIn(this._serFeatures) && jsonGenerator.mo13887l() == null && (constructDefaultPrettyPrinter = constructDefaultPrettyPrinter()) != null) {
            jsonGenerator.mo13901y(constructDefaultPrettyPrinter);
        }
        boolean enabledIn = SerializationFeature.WRITE_BIGDECIMAL_AS_PLAIN.enabledIn(this._serFeatures);
        int i = this._generatorFeaturesToChange;
        if (i != 0 || enabledIn) {
            int i2 = this._generatorFeatures;
            if (enabledIn) {
                int mask = JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN.getMask();
                i2 |= mask;
                i |= mask;
            }
            jsonGenerator.mo13892p(i2, i);
        }
        int i3 = this._formatWriteFeaturesToChange;
        if (i3 != 0) {
            jsonGenerator.mo13890n(this._formatWriteFeatures, i3);
        }
    }

    public n00 introspect(JavaType javaType) {
        return getClassIntrospector().forSerialization(this, javaType, this);
    }

    public final boolean isEnabled(SerializationFeature serializationFeature) {
        return (serializationFeature.getMask() & this._serFeatures) != 0;
    }

    public boolean useRootWrapping() {
        PropertyName propertyName = this._rootName;
        if (propertyName != null) {
            return !propertyName.isEmpty();
        }
        return isEnabled(SerializationFeature.WRAP_ROOT_VALUE);
    }

    public SerializationConfig withDefaultPrettyPrinter(su4 su4) {
        if (this._defaultPrettyPrinter == su4) {
            return this;
        }
        return new SerializationConfig(this, su4);
    }

    public SerializationConfig withFeatures(SerializationFeature... serializationFeatureArr) {
        int i = this._serFeatures;
        int i2 = i;
        for (SerializationFeature mask : serializationFeatureArr) {
            i2 |= mask.getMask();
        }
        if (i2 == this._serFeatures) {
            return this;
        }
        return new SerializationConfig(this, this._mapperFeatures, i2, this._generatorFeatures, this._generatorFeaturesToChange, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
    }

    public SerializationConfig withFilters(p12 p12) {
        return this;
    }

    @Deprecated
    public SerializationConfig withPropertyInclusion(JsonInclude.Value value) {
        this._configOverrides.setDefaultInclusion(value);
        return this;
    }

    public SerializationConfig without(SerializationFeature serializationFeature) {
        int i = this._serFeatures & (~serializationFeature.getMask());
        if (i == this._serFeatures) {
            return this;
        }
        return new SerializationConfig(this, this._mapperFeatures, i, this._generatorFeatures, this._generatorFeaturesToChange, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
    }

    public SerializationConfig withoutFeatures(SerializationFeature... serializationFeatureArr) {
        int i = this._serFeatures;
        int i2 = i;
        for (SerializationFeature mask : serializationFeatureArr) {
            i2 &= ~mask.getMask();
        }
        if (i2 == this._serFeatures) {
            return this;
        }
        return new SerializationConfig(this, this._mapperFeatures, i2, this._generatorFeatures, this._generatorFeaturesToChange, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
    }

    public final SerializationConfig _withBase(BaseSettings baseSettings) {
        return this._base == baseSettings ? this : new SerializationConfig(this, baseSettings);
    }

    public final SerializationConfig _withMapperFeatures(long j) {
        return new SerializationConfig(this, j, this._serFeatures, this._generatorFeatures, this._generatorFeaturesToChange, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
    }

    public final boolean isEnabled(JsonGenerator.Feature feature, JsonFactory jsonFactory) {
        if ((feature.getMask() & this._generatorFeaturesToChange) == 0) {
            return jsonFactory.isEnabled(feature);
        }
        return (feature.getMask() & this._generatorFeatures) != 0;
    }

    public SerializationConfig withRootName(PropertyName propertyName) {
        if (propertyName == null) {
            if (this._rootName == null) {
                return this;
            }
        } else if (propertyName.equals(this._rootName)) {
            return this;
        }
        return new SerializationConfig(this, propertyName);
    }

    public SerializationConfig withView(Class<?> cls) {
        return this._view == cls ? this : new SerializationConfig(this, cls);
    }

    public SerializationConfig without(SerializationFeature serializationFeature, SerializationFeature... serializationFeatureArr) {
        int i = (~serializationFeature.getMask()) & this._serFeatures;
        int i2 = i;
        for (SerializationFeature mask : serializationFeatureArr) {
            i2 &= ~mask.getMask();
        }
        if (i2 == this._serFeatures) {
            return this;
        }
        return new SerializationConfig(this, this._mapperFeatures, i2, this._generatorFeatures, this._generatorFeaturesToChange, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
    }

    public SerializationConfig with(jd6 jd6) {
        return jd6 == this._subtypeResolver ? this : new SerializationConfig(this, jd6);
    }

    public SerializationConfig with(ContextAttributes contextAttributes) {
        return contextAttributes == this._attributes ? this : new SerializationConfig(this, contextAttributes);
    }

    public SerializationConfig withFeatures(JsonGenerator.Feature... featureArr) {
        int i = this._generatorFeatures;
        int i2 = this._generatorFeaturesToChange;
        int i3 = i;
        int i4 = i2;
        for (JsonGenerator.Feature mask : featureArr) {
            int mask2 = mask.getMask();
            i3 |= mask2;
            i4 |= mask2;
        }
        if (this._generatorFeatures == i3 && this._generatorFeaturesToChange == i4) {
            return this;
        }
        return new SerializationConfig(this, this._mapperFeatures, this._serFeatures, i3, i4, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
    }

    public SerializationConfig withoutFeatures(JsonGenerator.Feature... featureArr) {
        int i = this._generatorFeatures;
        int i2 = this._generatorFeaturesToChange;
        int i3 = i;
        int i4 = i2;
        for (JsonGenerator.Feature mask : featureArr) {
            int mask2 = mask.getMask();
            i3 &= ~mask2;
            i4 |= mask2;
        }
        if (this._generatorFeatures == i3 && this._generatorFeaturesToChange == i4) {
            return this;
        }
        return new SerializationConfig(this, this._mapperFeatures, this._serFeatures, i3, i4, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
    }

    public SerializationConfig with(DateFormat dateFormat) {
        SerializationConfig serializationConfig = (SerializationConfig) super.with(dateFormat);
        if (dateFormat == null) {
            return serializationConfig.with(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        }
        return serializationConfig.without(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
    }

    public SerializationConfig without(JsonGenerator.Feature feature) {
        int i = this._generatorFeatures & (~feature.getMask());
        int mask = this._generatorFeaturesToChange | feature.getMask();
        if (this._generatorFeatures == i && this._generatorFeaturesToChange == mask) {
            return this;
        }
        return new SerializationConfig(this, this._mapperFeatures, this._serFeatures, i, mask, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
    }

    public SerializationConfig(SerializationConfig serializationConfig, jd6 jd6, SimpleMixInResolver simpleMixInResolver, RootNameLookup rootNameLookup, ConfigOverrides configOverrides) {
        super(serializationConfig, jd6, simpleMixInResolver, rootNameLookup, configOverrides);
        this._serFeatures = serializationConfig._serFeatures;
        this._defaultPrettyPrinter = serializationConfig._defaultPrettyPrinter;
        this._generatorFeatures = serializationConfig._generatorFeatures;
        this._generatorFeaturesToChange = serializationConfig._generatorFeaturesToChange;
        this._formatWriteFeatures = serializationConfig._formatWriteFeatures;
        this._formatWriteFeaturesToChange = serializationConfig._formatWriteFeaturesToChange;
    }

    public SerializationConfig with(SerializationFeature serializationFeature) {
        int mask = this._serFeatures | serializationFeature.getMask();
        if (mask == this._serFeatures) {
            return this;
        }
        return new SerializationConfig(this, this._mapperFeatures, mask, this._generatorFeatures, this._generatorFeaturesToChange, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
    }

    public SerializationConfig withFeatures(b82... b82Arr) {
        if (b82Arr.length > 0 && (b82Arr[0] instanceof JsonWriteFeature)) {
            return mo15002a(b82Arr);
        }
        int i = this._formatWriteFeatures;
        int i2 = this._formatWriteFeaturesToChange;
        int i3 = i;
        int i4 = i2;
        for (b82 mask : b82Arr) {
            int mask2 = mask.getMask();
            i3 |= mask2;
            i4 |= mask2;
        }
        if (this._formatWriteFeatures == i3 && this._formatWriteFeaturesToChange == i4) {
            return this;
        }
        return new SerializationConfig(this, this._mapperFeatures, this._serFeatures, this._generatorFeatures, this._generatorFeaturesToChange, i3, i4);
    }

    public SerializationConfig without(b82 b82) {
        if (b82 instanceof JsonWriteFeature) {
            return mo15003b(b82);
        }
        int i = this._formatWriteFeatures & (~b82.getMask());
        int mask = this._formatWriteFeaturesToChange | b82.getMask();
        if (this._formatWriteFeatures == i && this._formatWriteFeaturesToChange == mask) {
            return this;
        }
        return new SerializationConfig(this, this._mapperFeatures, this._serFeatures, this._generatorFeatures, this._generatorFeaturesToChange, i, mask);
    }

    public SerializationConfig withoutFeatures(b82... b82Arr) {
        if (b82Arr.length > 0 && (b82Arr[0] instanceof JsonWriteFeature)) {
            return mo15003b(b82Arr);
        }
        int i = this._formatWriteFeatures;
        int i2 = this._formatWriteFeaturesToChange;
        int i3 = i;
        int i4 = i2;
        for (b82 mask : b82Arr) {
            int mask2 = mask.getMask();
            i3 &= ~mask2;
            i4 |= mask2;
        }
        if (this._formatWriteFeatures == i3 && this._formatWriteFeaturesToChange == i4) {
            return this;
        }
        return new SerializationConfig(this, this._mapperFeatures, this._serFeatures, this._generatorFeatures, this._generatorFeaturesToChange, i3, i4);
    }

    public SerializationConfig with(SerializationFeature serializationFeature, SerializationFeature... serializationFeatureArr) {
        int mask = serializationFeature.getMask() | this._serFeatures;
        int i = mask;
        for (SerializationFeature mask2 : serializationFeatureArr) {
            i |= mask2.getMask();
        }
        if (i == this._serFeatures) {
            return this;
        }
        return new SerializationConfig(this, this._mapperFeatures, i, this._generatorFeatures, this._generatorFeaturesToChange, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
    }

    @Deprecated
    public SerializationConfig(SerializationConfig serializationConfig, SimpleMixInResolver simpleMixInResolver, RootNameLookup rootNameLookup, ConfigOverrides configOverrides) {
        this(serializationConfig, serializationConfig._subtypeResolver, simpleMixInResolver, rootNameLookup, configOverrides);
    }

    public SerializationConfig with(JsonGenerator.Feature feature) {
        int mask = this._generatorFeatures | feature.getMask();
        int mask2 = this._generatorFeaturesToChange | feature.getMask();
        if (this._generatorFeatures == mask && this._generatorFeaturesToChange == mask2) {
            return this;
        }
        return new SerializationConfig(this, this._mapperFeatures, this._serFeatures, mask, mask2, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
    }

    public SerializationConfig(SerializationConfig serializationConfig, jd6 jd6) {
        super(serializationConfig, jd6);
        this._serFeatures = serializationConfig._serFeatures;
        this._defaultPrettyPrinter = serializationConfig._defaultPrettyPrinter;
        this._generatorFeatures = serializationConfig._generatorFeatures;
        this._generatorFeaturesToChange = serializationConfig._generatorFeaturesToChange;
        this._formatWriteFeatures = serializationConfig._formatWriteFeatures;
        this._formatWriteFeaturesToChange = serializationConfig._formatWriteFeaturesToChange;
    }

    public SerializationConfig with(b82 b82) {
        if (b82 instanceof JsonWriteFeature) {
            return mo15002a(b82);
        }
        int mask = this._formatWriteFeatures | b82.getMask();
        int mask2 = this._formatWriteFeaturesToChange | b82.getMask();
        if (this._formatWriteFeatures == mask && this._formatWriteFeaturesToChange == mask2) {
            return this;
        }
        return new SerializationConfig(this, this._mapperFeatures, this._serFeatures, this._generatorFeatures, this._generatorFeaturesToChange, mask, mask2);
    }

    public SerializationConfig(SerializationConfig serializationConfig, long j, int i, int i2, int i3, int i4, int i5) {
        super(serializationConfig, j);
        this._serFeatures = i;
        serializationConfig.getClass();
        this._defaultPrettyPrinter = serializationConfig._defaultPrettyPrinter;
        this._generatorFeatures = i2;
        this._generatorFeaturesToChange = i3;
        this._formatWriteFeatures = i4;
        this._formatWriteFeaturesToChange = i5;
    }

    public SerializationConfig(SerializationConfig serializationConfig, BaseSettings baseSettings) {
        super(serializationConfig, baseSettings);
        this._serFeatures = serializationConfig._serFeatures;
        this._defaultPrettyPrinter = serializationConfig._defaultPrettyPrinter;
        this._generatorFeatures = serializationConfig._generatorFeatures;
        this._generatorFeaturesToChange = serializationConfig._generatorFeaturesToChange;
        this._formatWriteFeatures = serializationConfig._formatWriteFeatures;
        this._formatWriteFeaturesToChange = serializationConfig._formatWriteFeaturesToChange;
    }

    public SerializationConfig(SerializationConfig serializationConfig, Class<?> cls) {
        super(serializationConfig, cls);
        this._serFeatures = serializationConfig._serFeatures;
        this._defaultPrettyPrinter = serializationConfig._defaultPrettyPrinter;
        this._generatorFeatures = serializationConfig._generatorFeatures;
        this._generatorFeaturesToChange = serializationConfig._generatorFeaturesToChange;
        this._formatWriteFeatures = serializationConfig._formatWriteFeatures;
        this._formatWriteFeaturesToChange = serializationConfig._formatWriteFeaturesToChange;
    }

    public SerializationConfig(SerializationConfig serializationConfig, PropertyName propertyName) {
        super(serializationConfig, propertyName);
        this._serFeatures = serializationConfig._serFeatures;
        this._defaultPrettyPrinter = serializationConfig._defaultPrettyPrinter;
        this._generatorFeatures = serializationConfig._generatorFeatures;
        this._generatorFeaturesToChange = serializationConfig._generatorFeaturesToChange;
        this._formatWriteFeatures = serializationConfig._formatWriteFeatures;
        this._formatWriteFeaturesToChange = serializationConfig._formatWriteFeaturesToChange;
    }

    public SerializationConfig(SerializationConfig serializationConfig, ContextAttributes contextAttributes) {
        super(serializationConfig, contextAttributes);
        this._serFeatures = serializationConfig._serFeatures;
        this._defaultPrettyPrinter = serializationConfig._defaultPrettyPrinter;
        this._generatorFeatures = serializationConfig._generatorFeatures;
        this._generatorFeaturesToChange = serializationConfig._generatorFeaturesToChange;
        this._formatWriteFeatures = serializationConfig._formatWriteFeatures;
        this._formatWriteFeaturesToChange = serializationConfig._formatWriteFeaturesToChange;
    }

    public SerializationConfig(SerializationConfig serializationConfig, SimpleMixInResolver simpleMixInResolver) {
        super(serializationConfig, simpleMixInResolver);
        this._serFeatures = serializationConfig._serFeatures;
        this._defaultPrettyPrinter = serializationConfig._defaultPrettyPrinter;
        this._generatorFeatures = serializationConfig._generatorFeatures;
        this._generatorFeaturesToChange = serializationConfig._generatorFeaturesToChange;
        this._formatWriteFeatures = serializationConfig._formatWriteFeatures;
        this._formatWriteFeaturesToChange = serializationConfig._formatWriteFeaturesToChange;
    }

    public SerializationConfig(SerializationConfig serializationConfig, su4 su4) {
        super(serializationConfig);
        this._serFeatures = serializationConfig._serFeatures;
        this._defaultPrettyPrinter = su4;
        this._generatorFeatures = serializationConfig._generatorFeatures;
        this._generatorFeaturesToChange = serializationConfig._generatorFeaturesToChange;
        this._formatWriteFeatures = serializationConfig._formatWriteFeatures;
        this._formatWriteFeaturesToChange = serializationConfig._formatWriteFeaturesToChange;
    }
}
