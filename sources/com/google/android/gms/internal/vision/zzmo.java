package com.google.android.gms.internal.vision;

import com.github.mikephil.charting.utils.Utils;

/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public enum zzmo {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(Utils.FLOAT_EPSILON)),
    DOUBLE(Double.valueOf(Utils.DOUBLE_EPSILON)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(zzht.zza),
    ENUM((String) null),
    MESSAGE((String) null);
    
    private final Object zzj;

    /* access modifiers changed from: public */
    zzmo(Object obj) {
        this.zzj = obj;
    }
}
