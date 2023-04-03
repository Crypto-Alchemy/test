package kotlin.reflect.jvm.internal.impl.metadata;

import kotlin.reflect.jvm.internal.impl.protobuf.C7621f;

public enum ProtoBuf$Modality implements C7621f.C7622a {
    FINAL(0, 0),
    OPEN(1, 1),
    ABSTRACT(2, 2),
    SEALED(3, 3);
    

    /* renamed from: a */
    public static C7621f.C7623b<ProtoBuf$Modality> f39745a;
    private final int value;

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Modality$a */
    public static class C7550a implements C7621f.C7623b<ProtoBuf$Modality> {
        /* renamed from: a */
        public ProtoBuf$Modality findValueByNumber(int i) {
            return ProtoBuf$Modality.valueOf(i);
        }
    }

    /* access modifiers changed from: public */
    static {
        f39745a = new C7550a();
    }

    /* access modifiers changed from: public */
    ProtoBuf$Modality(int i, int i2) {
        this.value = i2;
    }

    public final int getNumber() {
        return this.value;
    }

    public static ProtoBuf$Modality valueOf(int i) {
        if (i == 0) {
            return FINAL;
        }
        if (i == 1) {
            return OPEN;
        }
        if (i == 2) {
            return ABSTRACT;
        }
        if (i != 3) {
            return null;
        }
        return SEALED;
    }
}
