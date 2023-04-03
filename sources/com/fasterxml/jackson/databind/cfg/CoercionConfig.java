package com.fasterxml.jackson.databind.cfg;

import java.io.Serializable;
import java.util.Arrays;

public class CoercionConfig implements Serializable {

    /* renamed from: a */
    public static final int f9900a = CoercionInputShape.values().length;
    private static final long serialVersionUID = 1;
    public Boolean _acceptBlankAsEmpty;
    public final CoercionAction[] _coercionsByShape;

    public CoercionConfig() {
        this._coercionsByShape = new CoercionAction[f9900a];
        this._acceptBlankAsEmpty = null;
    }

    public CoercionAction findAction(CoercionInputShape coercionInputShape) {
        return this._coercionsByShape[coercionInputShape.ordinal()];
    }

    public Boolean getAcceptBlankAsEmpty() {
        return this._acceptBlankAsEmpty;
    }

    public CoercionConfig(CoercionConfig coercionConfig) {
        this._acceptBlankAsEmpty = coercionConfig._acceptBlankAsEmpty;
        CoercionAction[] coercionActionArr = coercionConfig._coercionsByShape;
        this._coercionsByShape = (CoercionAction[]) Arrays.copyOf(coercionActionArr, coercionActionArr.length);
    }
}
