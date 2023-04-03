package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers;
import java.io.Serializable;

public class DeserializerFactoryConfig implements Serializable {
    public static final ia3[] DEFAULT_KEY_DESERIALIZERS = {new StdKeyDeserializers()};
    public static final C2805m7[] NO_ABSTRACT_TYPE_RESOLVERS = new C2805m7[0];
    public static final be1[] NO_DESERIALIZERS = new be1[0];
    public static final p00[] NO_MODIFIERS = new p00[0];
    public static final l87[] NO_VALUE_INSTANTIATORS = new l87[0];
    private static final long serialVersionUID = 1;
    public final C2805m7[] _abstractTypeResolvers;
    public final be1[] _additionalDeserializers;
    public final ia3[] _additionalKeyDeserializers;
    public final p00[] _modifiers;
    public final l87[] _valueInstantiators;

    public DeserializerFactoryConfig() {
        this((be1[]) null, (ia3[]) null, (p00[]) null, (C2805m7[]) null, (l87[]) null);
    }

    public Iterable<C2805m7> abstractTypeResolvers() {
        return new C2566iq(this._abstractTypeResolvers);
    }

    public Iterable<p00> deserializerModifiers() {
        return new C2566iq(this._modifiers);
    }

    public Iterable<be1> deserializers() {
        return new C2566iq(this._additionalDeserializers);
    }

    public boolean hasAbstractTypeResolvers() {
        if (this._abstractTypeResolvers.length > 0) {
            return true;
        }
        return false;
    }

    public boolean hasDeserializerModifiers() {
        if (this._modifiers.length > 0) {
            return true;
        }
        return false;
    }

    public boolean hasDeserializers() {
        if (this._additionalDeserializers.length > 0) {
            return true;
        }
        return false;
    }

    public boolean hasKeyDeserializers() {
        if (this._additionalKeyDeserializers.length > 0) {
            return true;
        }
        return false;
    }

    public boolean hasValueInstantiators() {
        if (this._valueInstantiators.length > 0) {
            return true;
        }
        return false;
    }

    public Iterable<ia3> keyDeserializers() {
        return new C2566iq(this._additionalKeyDeserializers);
    }

    public Iterable<l87> valueInstantiators() {
        return new C2566iq(this._valueInstantiators);
    }

    public DeserializerFactoryConfig withAbstractTypeResolver(C2805m7 m7Var) {
        if (m7Var != null) {
            return new DeserializerFactoryConfig(this._additionalDeserializers, this._additionalKeyDeserializers, this._modifiers, (C2805m7[]) C2103cq.m14360j(this._abstractTypeResolvers, m7Var), this._valueInstantiators);
        }
        throw new IllegalArgumentException("Cannot pass null resolver");
    }

    public DeserializerFactoryConfig withAdditionalDeserializers(be1 be1) {
        if (be1 != null) {
            return new DeserializerFactoryConfig((be1[]) C2103cq.m14360j(this._additionalDeserializers, be1), this._additionalKeyDeserializers, this._modifiers, this._abstractTypeResolvers, this._valueInstantiators);
        }
        throw new IllegalArgumentException("Cannot pass null Deserializers");
    }

    public DeserializerFactoryConfig withAdditionalKeyDeserializers(ia3 ia3) {
        if (ia3 != null) {
            return new DeserializerFactoryConfig(this._additionalDeserializers, (ia3[]) C2103cq.m14360j(this._additionalKeyDeserializers, ia3), this._modifiers, this._abstractTypeResolvers, this._valueInstantiators);
        }
        throw new IllegalArgumentException("Cannot pass null KeyDeserializers");
    }

    public DeserializerFactoryConfig withDeserializerModifier(p00 p00) {
        if (p00 != null) {
            return new DeserializerFactoryConfig(this._additionalDeserializers, this._additionalKeyDeserializers, (p00[]) C2103cq.m14360j(this._modifiers, p00), this._abstractTypeResolvers, this._valueInstantiators);
        }
        throw new IllegalArgumentException("Cannot pass null modifier");
    }

    public DeserializerFactoryConfig withValueInstantiators(l87 l87) {
        if (l87 != null) {
            return new DeserializerFactoryConfig(this._additionalDeserializers, this._additionalKeyDeserializers, this._modifiers, this._abstractTypeResolvers, (l87[]) C2103cq.m14360j(this._valueInstantiators, l87));
        }
        throw new IllegalArgumentException("Cannot pass null resolver");
    }

    public DeserializerFactoryConfig(be1[] be1Arr, ia3[] ia3Arr, p00[] p00Arr, C2805m7[] m7VarArr, l87[] l87Arr) {
        this._additionalDeserializers = be1Arr == null ? NO_DESERIALIZERS : be1Arr;
        this._additionalKeyDeserializers = ia3Arr == null ? DEFAULT_KEY_DESERIALIZERS : ia3Arr;
        this._modifiers = p00Arr == null ? NO_MODIFIERS : p00Arr;
        this._abstractTypeResolvers = m7VarArr == null ? NO_ABSTRACT_TYPE_RESOLVERS : m7VarArr;
        this._valueInstantiators = l87Arr == null ? NO_VALUE_INSTANTIATORS : l87Arr;
    }
}
