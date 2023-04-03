package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.C4758t;

public enum HashType implements C4758t.C4761c {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    SHA224(5),
    UNRECOGNIZED(-1);
    
    public static final int SHA1_VALUE = 1;
    public static final int SHA224_VALUE = 5;
    public static final int SHA256_VALUE = 3;
    public static final int SHA384_VALUE = 2;
    public static final int SHA512_VALUE = 4;
    public static final int UNKNOWN_HASH_VALUE = 0;

    /* renamed from: a */
    public static final C4758t.C4762d<HashType> f25059a = null;
    private final int value;

    /* renamed from: com.google.crypto.tink.proto.HashType$a */
    public class C4653a implements C4758t.C4762d<HashType> {
        /* renamed from: a */
        public HashType findValueByNumber(int i) {
            return HashType.forNumber(i);
        }
    }

    /* renamed from: com.google.crypto.tink.proto.HashType$b */
    public static final class C4654b implements C4758t.C4763e {

        /* renamed from: a */
        public static final C4758t.C4763e f25061a = null;

        static {
            f25061a = new C4654b();
        }

        public boolean isInRange(int i) {
            if (HashType.forNumber(i) != null) {
                return true;
            }
            return false;
        }
    }

    /* access modifiers changed from: public */
    static {
        f25059a = new C4653a();
    }

    /* access modifiers changed from: public */
    HashType(int i) {
        this.value = i;
    }

    public static HashType forNumber(int i) {
        if (i == 0) {
            return UNKNOWN_HASH;
        }
        if (i == 1) {
            return SHA1;
        }
        if (i == 2) {
            return SHA384;
        }
        if (i == 3) {
            return SHA256;
        }
        if (i == 4) {
            return SHA512;
        }
        if (i != 5) {
            return null;
        }
        return SHA224;
    }

    public static C4758t.C4762d<HashType> internalGetValueMap() {
        return f25059a;
    }

    public static C4758t.C4763e internalGetVerifier() {
        return C4654b.f25061a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static HashType valueOf(int i) {
        return forNumber(i);
    }
}
