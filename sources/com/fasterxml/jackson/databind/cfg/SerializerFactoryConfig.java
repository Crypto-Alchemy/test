package com.fasterxml.jackson.databind.cfg;

import java.io.Serializable;

public final class SerializerFactoryConfig implements Serializable {
    public static final s00[] NO_MODIFIERS = new s00[0];
    public static final ax5[] NO_SERIALIZERS = new ax5[0];
    private static final long serialVersionUID = 1;
    public final ax5[] _additionalKeySerializers;
    public final ax5[] _additionalSerializers;
    public final s00[] _modifiers;

    public SerializerFactoryConfig() {
        this((ax5[]) null, (ax5[]) null, (s00[]) null);
    }

    public boolean hasKeySerializers() {
        if (this._additionalKeySerializers.length > 0) {
            return true;
        }
        return false;
    }

    public boolean hasSerializerModifiers() {
        if (this._modifiers.length > 0) {
            return true;
        }
        return false;
    }

    public boolean hasSerializers() {
        if (this._additionalSerializers.length > 0) {
            return true;
        }
        return false;
    }

    public Iterable<ax5> keySerializers() {
        return new C2566iq(this._additionalKeySerializers);
    }

    public Iterable<s00> serializerModifiers() {
        return new C2566iq(this._modifiers);
    }

    public Iterable<ax5> serializers() {
        return new C2566iq(this._additionalSerializers);
    }

    public SerializerFactoryConfig withAdditionalKeySerializers(ax5 ax5) {
        if (ax5 != null) {
            return new SerializerFactoryConfig(this._additionalSerializers, (ax5[]) C2103cq.m14360j(this._additionalKeySerializers, ax5), this._modifiers);
        }
        throw new IllegalArgumentException("Cannot pass null Serializers");
    }

    public SerializerFactoryConfig withAdditionalSerializers(ax5 ax5) {
        if (ax5 != null) {
            return new SerializerFactoryConfig((ax5[]) C2103cq.m14360j(this._additionalSerializers, ax5), this._additionalKeySerializers, this._modifiers);
        }
        throw new IllegalArgumentException("Cannot pass null Serializers");
    }

    public SerializerFactoryConfig withSerializerModifier(s00 s00) {
        if (s00 != null) {
            return new SerializerFactoryConfig(this._additionalSerializers, this._additionalKeySerializers, (s00[]) C2103cq.m14360j(this._modifiers, s00));
        }
        throw new IllegalArgumentException("Cannot pass null modifier");
    }

    public SerializerFactoryConfig(ax5[] ax5Arr, ax5[] ax5Arr2, s00[] s00Arr) {
        this._additionalSerializers = ax5Arr == null ? NO_SERIALIZERS : ax5Arr;
        this._additionalKeySerializers = ax5Arr2 == null ? NO_SERIALIZERS : ax5Arr2;
        this._modifiers = s00Arr == null ? NO_MODIFIERS : s00Arr;
    }
}
