package kotlin.reflect.jvm.internal.impl.metadata;

import kotlin.reflect.jvm.internal.impl.protobuf.C7621f;

public enum ProtoBuf$Visibility implements C7621f.C7622a {
    INTERNAL(0, 0),
    PRIVATE(1, 1),
    PROTECTED(2, 2),
    PUBLIC(3, 3),
    PRIVATE_TO_THIS(4, 4),
    LOCAL(5, 5);
    

    /* renamed from: a */
    public static C7621f.C7623b<ProtoBuf$Visibility> f39862a;
    private final int value;

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility$a */
    public static class C7584a implements C7621f.C7623b<ProtoBuf$Visibility> {
        /* renamed from: a */
        public ProtoBuf$Visibility findValueByNumber(int i) {
            return ProtoBuf$Visibility.valueOf(i);
        }
    }

    /* access modifiers changed from: public */
    static {
        f39862a = new C7584a();
    }

    /* access modifiers changed from: public */
    ProtoBuf$Visibility(int i, int i2) {
        this.value = i2;
    }

    public final int getNumber() {
        return this.value;
    }

    public static ProtoBuf$Visibility valueOf(int i) {
        if (i == 0) {
            return INTERNAL;
        }
        if (i == 1) {
            return PRIVATE;
        }
        if (i == 2) {
            return PROTECTED;
        }
        if (i == 3) {
            return PUBLIC;
        }
        if (i == 4) {
            return PRIVATE_TO_THIS;
        }
        if (i != 5) {
            return null;
        }
        return LOCAL;
    }
}
