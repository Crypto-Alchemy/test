package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.C4758t;

public enum KeyStatusType implements C4758t.C4761c {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);
    
    public static final int DESTROYED_VALUE = 3;
    public static final int DISABLED_VALUE = 2;
    public static final int ENABLED_VALUE = 1;
    public static final int UNKNOWN_STATUS_VALUE = 0;

    /* renamed from: a */
    public static final C4758t.C4762d<KeyStatusType> f25066a = null;
    private final int value;

    /* renamed from: com.google.crypto.tink.proto.KeyStatusType$a */
    public class C4659a implements C4758t.C4762d<KeyStatusType> {
        /* renamed from: a */
        public KeyStatusType findValueByNumber(int i) {
            return KeyStatusType.forNumber(i);
        }
    }

    /* renamed from: com.google.crypto.tink.proto.KeyStatusType$b */
    public static final class C4660b implements C4758t.C4763e {

        /* renamed from: a */
        public static final C4758t.C4763e f25068a = null;

        static {
            f25068a = new C4660b();
        }

        public boolean isInRange(int i) {
            if (KeyStatusType.forNumber(i) != null) {
                return true;
            }
            return false;
        }
    }

    /* access modifiers changed from: public */
    static {
        f25066a = new C4659a();
    }

    /* access modifiers changed from: public */
    KeyStatusType(int i) {
        this.value = i;
    }

    public static KeyStatusType forNumber(int i) {
        if (i == 0) {
            return UNKNOWN_STATUS;
        }
        if (i == 1) {
            return ENABLED;
        }
        if (i == 2) {
            return DISABLED;
        }
        if (i != 3) {
            return null;
        }
        return DESTROYED;
    }

    public static C4758t.C4762d<KeyStatusType> internalGetValueMap() {
        return f25066a;
    }

    public static C4758t.C4763e internalGetVerifier() {
        return C4660b.f25068a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static KeyStatusType valueOf(int i) {
        return forNumber(i);
    }
}
