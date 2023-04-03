package kotlin.reflect.jvm.internal.impl.metadata;

import kotlin.reflect.jvm.internal.impl.protobuf.C7621f;

public enum ProtoBuf$MemberKind implements C7621f.C7622a {
    DECLARATION(0, 0),
    FAKE_OVERRIDE(1, 1),
    DELEGATION(2, 2),
    SYNTHESIZED(3, 3);
    

    /* renamed from: a */
    public static C7621f.C7623b<ProtoBuf$MemberKind> f39743a;
    private final int value;

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$MemberKind$a */
    public static class C7549a implements C7621f.C7623b<ProtoBuf$MemberKind> {
        /* renamed from: a */
        public ProtoBuf$MemberKind findValueByNumber(int i) {
            return ProtoBuf$MemberKind.valueOf(i);
        }
    }

    /* access modifiers changed from: public */
    static {
        f39743a = new C7549a();
    }

    /* access modifiers changed from: public */
    ProtoBuf$MemberKind(int i, int i2) {
        this.value = i2;
    }

    public final int getNumber() {
        return this.value;
    }

    public static ProtoBuf$MemberKind valueOf(int i) {
        if (i == 0) {
            return DECLARATION;
        }
        if (i == 1) {
            return FAKE_OVERRIDE;
        }
        if (i == 2) {
            return DELEGATION;
        }
        if (i != 3) {
            return null;
        }
        return SYNTHESIZED;
    }
}
