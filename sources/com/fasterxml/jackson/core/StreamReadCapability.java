package com.fasterxml.jackson.core;

public enum StreamReadCapability implements xz2 {
    DUPLICATE_PROPERTIES(false),
    SCALARS_AS_OBJECTS(false),
    UNTYPED_SCALARS(false);
    
    private final boolean _defaultState;
    private final int _mask;

    /* access modifiers changed from: public */
    StreamReadCapability(boolean z) {
        this._defaultState = z;
        this._mask = 1 << ordinal();
    }

    public boolean enabledByDefault() {
        return this._defaultState;
    }

    public boolean enabledIn(int i) {
        if ((i & this._mask) != 0) {
            return true;
        }
        return false;
    }

    public int getMask() {
        return this._mask;
    }
}
