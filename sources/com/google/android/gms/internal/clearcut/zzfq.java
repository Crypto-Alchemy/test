package com.google.android.gms.internal.clearcut;

import com.github.mikephil.charting.utils.Utils;

public enum zzfq {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(Utils.FLOAT_EPSILON)),
    DOUBLE(Double.valueOf(Utils.DOUBLE_EPSILON)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(zzbb.zzfi),
    ENUM((String) null),
    MESSAGE((String) null);
    
    private final Object zzlj;

    /* access modifiers changed from: public */
    zzfq(Object obj) {
        this.zzlj = obj;
    }
}
