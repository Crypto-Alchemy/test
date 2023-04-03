package com.fasterxml.jackson.core;

public enum StreamWriteCapability implements xz2 {
    CAN_WRITE_BINARY_NATIVELY(false),
    CAN_WRITE_FORMATTED_NUMBERS(false);
    
    private final boolean _defaultState;
    private final int _mask;

    /* access modifiers changed from: public */
    StreamWriteCapability(boolean z) {
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
