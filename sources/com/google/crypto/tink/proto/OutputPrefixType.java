package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.C4758t;

public enum OutputPrefixType implements C4758t.C4761c {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);
    
    public static final int CRUNCHY_VALUE = 4;
    public static final int LEGACY_VALUE = 2;
    public static final int RAW_VALUE = 3;
    public static final int TINK_VALUE = 1;
    public static final int UNKNOWN_PREFIX_VALUE = 0;

    /* renamed from: a */
    public static final C4758t.C4762d<OutputPrefixType> f25069a = null;
    private final int value;

    /* renamed from: com.google.crypto.tink.proto.OutputPrefixType$a */
    public class C4661a implements C4758t.C4762d<OutputPrefixType> {
        /* renamed from: a */
        public OutputPrefixType findValueByNumber(int i) {
            return OutputPrefixType.forNumber(i);
        }
    }

    /* renamed from: com.google.crypto.tink.proto.OutputPrefixType$b */
    public static final class C4662b implements C4758t.C4763e {

        /* renamed from: a */
        public static final C4758t.C4763e f25071a = null;

        static {
            f25071a = new C4662b();
        }

        public boolean isInRange(int i) {
            if (OutputPrefixType.forNumber(i) != null) {
                return true;
            }
            return false;
        }
    }

    /* access modifiers changed from: public */
    static {
        f25069a = new C4661a();
    }

    /* access modifiers changed from: public */
    OutputPrefixType(int i) {
        this.value = i;
    }

    public static OutputPrefixType forNumber(int i) {
        if (i == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i == 1) {
            return TINK;
        }
        if (i == 2) {
            return LEGACY;
        }
        if (i == 3) {
            return RAW;
        }
        if (i != 4) {
            return null;
        }
        return CRUNCHY;
    }

    public static C4758t.C4762d<OutputPrefixType> internalGetValueMap() {
        return f25069a;
    }

    public static C4758t.C4763e internalGetVerifier() {
        return C4662b.f25071a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static OutputPrefixType valueOf(int i) {
        return forNumber(i);
    }
}
