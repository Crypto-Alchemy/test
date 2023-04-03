package com.google.android.gms.internal.measurement;

import com.github.mikephil.charting.utils.Utils;

/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.0 */
public enum zzmy {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(Utils.FLOAT_EPSILON)),
    DOUBLE(Double.valueOf(Utils.DOUBLE_EPSILON)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(zzjd.zzb),
    ENUM((String) null),
    MESSAGE((String) null);
    
    private final Object zzj;

    /* access modifiers changed from: public */
    zzmy(Object obj) {
        this.zzj = obj;
    }
}
