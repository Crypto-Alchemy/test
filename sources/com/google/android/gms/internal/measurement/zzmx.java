package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.0 */
public enum zzmx {
    DOUBLE(zzmy.DOUBLE, 1),
    FLOAT(zzmy.FLOAT, 5),
    INT64(r5, 0),
    UINT64(r5, 0),
    INT32(r11, 0),
    FIXED64(r5, 1),
    FIXED32(r11, 5),
    BOOL(zzmy.BOOLEAN, 0),
    STRING(zzmy.STRING, 2),
    GROUP(r13, 3),
    MESSAGE(r13, 2),
    BYTES(zzmy.BYTE_STRING, 2),
    UINT32(r11, 0),
    ENUM(zzmy.ENUM, 0),
    SFIXED32(r11, 5),
    SFIXED64(r5, 1),
    SINT32(r11, 0),
    SINT64(r5, 0);
    
    private final zzmy zzs;

    /* access modifiers changed from: public */
    zzmx(zzmy zzmy, int i) {
        this.zzs = zzmy;
    }

    public final zzmy zza() {
        return this.zzs;
    }
}
