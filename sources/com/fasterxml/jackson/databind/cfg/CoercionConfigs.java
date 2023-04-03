package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class CoercionConfigs implements Serializable {

    /* renamed from: a */
    public static final int f9901a = LogicalType.values().length;
    private static final long serialVersionUID = 1;
    public CoercionAction _defaultAction;
    public final MutableCoercionConfig _defaultCoercions;
    public Map<Class<?>, MutableCoercionConfig> _perClassCoercions;
    public MutableCoercionConfig[] _perTypeCoercions;

    /* renamed from: com.fasterxml.jackson.databind.cfg.CoercionConfigs$a */
    public static /* synthetic */ class C1991a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f9902a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.fasterxml.jackson.databind.cfg.CoercionInputShape[] r0 = com.fasterxml.jackson.databind.cfg.CoercionInputShape.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9902a = r0
                com.fasterxml.jackson.databind.cfg.CoercionInputShape r1 = com.fasterxml.jackson.databind.cfg.CoercionInputShape.EmptyArray     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f9902a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.fasterxml.jackson.databind.cfg.CoercionInputShape r1 = com.fasterxml.jackson.databind.cfg.CoercionInputShape.Float     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f9902a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.fasterxml.jackson.databind.cfg.CoercionInputShape r1 = com.fasterxml.jackson.databind.cfg.CoercionInputShape.Integer     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.cfg.CoercionConfigs.C1991a.<clinit>():void");
        }
    }

    public CoercionConfigs() {
        this(CoercionAction.TryConvert, new MutableCoercionConfig(), (MutableCoercionConfig[]) null, (Map<Class<?>, MutableCoercionConfig>) null);
    }

    /* renamed from: a */
    public static MutableCoercionConfig m14023a(MutableCoercionConfig mutableCoercionConfig) {
        if (mutableCoercionConfig == null) {
            return null;
        }
        return mutableCoercionConfig.copy();
    }

    public boolean _isScalarType(LogicalType logicalType) {
        if (logicalType == LogicalType.Float || logicalType == LogicalType.Integer || logicalType == LogicalType.Boolean || logicalType == LogicalType.DateTime) {
            return true;
        }
        return false;
    }

    public CoercionConfigs copy() {
        MutableCoercionConfig[] mutableCoercionConfigArr;
        MutableCoercionConfig[] mutableCoercionConfigArr2 = this._perTypeCoercions;
        HashMap hashMap = null;
        if (mutableCoercionConfigArr2 == null) {
            mutableCoercionConfigArr = null;
        } else {
            int length = mutableCoercionConfigArr2.length;
            mutableCoercionConfigArr = new MutableCoercionConfig[length];
            for (int i = 0; i < length; i++) {
                mutableCoercionConfigArr[i] = m14023a(this._perTypeCoercions[i]);
            }
        }
        if (this._perClassCoercions != null) {
            hashMap = new HashMap();
            for (Map.Entry next : this._perClassCoercions.entrySet()) {
                hashMap.put(next.getKey(), ((MutableCoercionConfig) next.getValue()).copy());
            }
        }
        return new CoercionConfigs(this._defaultAction, this._defaultCoercions.copy(), mutableCoercionConfigArr, hashMap);
    }

    public MutableCoercionConfig defaultCoercions() {
        return this._defaultCoercions;
    }

    public CoercionAction findCoercion(DeserializationConfig deserializationConfig, LogicalType logicalType, Class<?> cls, CoercionInputShape coercionInputShape) {
        MutableCoercionConfig mutableCoercionConfig;
        CoercionAction findAction;
        MutableCoercionConfig mutableCoercionConfig2;
        CoercionAction findAction2;
        Map<Class<?>, MutableCoercionConfig> map = this._perClassCoercions;
        if (map != null && cls != null && (mutableCoercionConfig2 = map.get(cls)) != null && (findAction2 = mutableCoercionConfig2.findAction(coercionInputShape)) != null) {
            return findAction2;
        }
        MutableCoercionConfig[] mutableCoercionConfigArr = this._perTypeCoercions;
        if (mutableCoercionConfigArr != null && logicalType != null && (mutableCoercionConfig = mutableCoercionConfigArr[logicalType.ordinal()]) != null && (findAction = mutableCoercionConfig.findAction(coercionInputShape)) != null) {
            return findAction;
        }
        CoercionAction findAction3 = this._defaultCoercions.findAction(coercionInputShape);
        if (findAction3 != null) {
            return findAction3;
        }
        int i = C1991a.f9902a[coercionInputShape.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3 && logicalType == LogicalType.Enum && deserializationConfig.isEnabled(DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS)) {
                    return CoercionAction.Fail;
                }
            } else if (logicalType == LogicalType.Integer) {
                if (deserializationConfig.isEnabled(DeserializationFeature.ACCEPT_FLOAT_AS_INT)) {
                    return CoercionAction.TryConvert;
                }
                return CoercionAction.Fail;
            }
            boolean _isScalarType = _isScalarType(logicalType);
            if (_isScalarType && !deserializationConfig.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS)) {
                return CoercionAction.Fail;
            }
            if (coercionInputShape != CoercionInputShape.EmptyString) {
                return this._defaultAction;
            }
            if (_isScalarType || deserializationConfig.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT)) {
                return CoercionAction.AsNull;
            }
            if (logicalType == LogicalType.OtherScalar) {
                return CoercionAction.TryConvert;
            }
            return CoercionAction.Fail;
        } else if (deserializationConfig.isEnabled(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT)) {
            return CoercionAction.AsNull;
        } else {
            return CoercionAction.Fail;
        }
    }

    public CoercionAction findCoercionFromBlankString(DeserializationConfig deserializationConfig, LogicalType logicalType, Class<?> cls, CoercionAction coercionAction) {
        CoercionAction coercionAction2;
        MutableCoercionConfig mutableCoercionConfig;
        MutableCoercionConfig mutableCoercionConfig2;
        Map<Class<?>, MutableCoercionConfig> map = this._perClassCoercions;
        Boolean bool = null;
        if (map == null || cls == null || (mutableCoercionConfig2 = map.get(cls)) == null) {
            coercionAction2 = null;
        } else {
            bool = mutableCoercionConfig2.getAcceptBlankAsEmpty();
            coercionAction2 = mutableCoercionConfig2.findAction(CoercionInputShape.EmptyString);
        }
        MutableCoercionConfig[] mutableCoercionConfigArr = this._perTypeCoercions;
        if (!(mutableCoercionConfigArr == null || logicalType == null || (mutableCoercionConfig = mutableCoercionConfigArr[logicalType.ordinal()]) == null)) {
            if (bool == null) {
                bool = mutableCoercionConfig.getAcceptBlankAsEmpty();
            }
            if (coercionAction2 == null) {
                coercionAction2 = mutableCoercionConfig.findAction(CoercionInputShape.EmptyString);
            }
        }
        if (bool == null) {
            bool = this._defaultCoercions.getAcceptBlankAsEmpty();
        }
        if (coercionAction2 == null) {
            coercionAction2 = this._defaultCoercions.findAction(CoercionInputShape.EmptyString);
        }
        if (Boolean.FALSE.equals(bool)) {
            return coercionAction;
        }
        if (coercionAction2 != null) {
            return coercionAction2;
        }
        if (_isScalarType(logicalType)) {
            return CoercionAction.AsNull;
        }
        if (deserializationConfig.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT)) {
            return CoercionAction.AsNull;
        }
        return coercionAction;
    }

    public MutableCoercionConfig findOrCreateCoercion(LogicalType logicalType) {
        if (this._perTypeCoercions == null) {
            this._perTypeCoercions = new MutableCoercionConfig[f9901a];
        }
        MutableCoercionConfig mutableCoercionConfig = this._perTypeCoercions[logicalType.ordinal()];
        if (mutableCoercionConfig != null) {
            return mutableCoercionConfig;
        }
        MutableCoercionConfig[] mutableCoercionConfigArr = this._perTypeCoercions;
        int ordinal = logicalType.ordinal();
        MutableCoercionConfig mutableCoercionConfig2 = new MutableCoercionConfig();
        mutableCoercionConfigArr[ordinal] = mutableCoercionConfig2;
        return mutableCoercionConfig2;
    }

    public CoercionConfigs(CoercionAction coercionAction, MutableCoercionConfig mutableCoercionConfig, MutableCoercionConfig[] mutableCoercionConfigArr, Map<Class<?>, MutableCoercionConfig> map) {
        this._defaultCoercions = mutableCoercionConfig;
        this._defaultAction = coercionAction;
        this._perTypeCoercions = mutableCoercionConfigArr;
        this._perClassCoercions = map;
    }

    public MutableCoercionConfig findOrCreateCoercion(Class<?> cls) {
        if (this._perClassCoercions == null) {
            this._perClassCoercions = new HashMap();
        }
        MutableCoercionConfig mutableCoercionConfig = this._perClassCoercions.get(cls);
        if (mutableCoercionConfig != null) {
            return mutableCoercionConfig;
        }
        MutableCoercionConfig mutableCoercionConfig2 = new MutableCoercionConfig();
        this._perClassCoercions.put(cls, mutableCoercionConfig2);
        return mutableCoercionConfig2;
    }
}
