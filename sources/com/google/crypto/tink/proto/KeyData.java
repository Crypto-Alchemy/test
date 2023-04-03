package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.C4758t;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;

public final class KeyData extends GeneratedMessageLite<KeyData, C4658b> implements su3 {
    /* access modifiers changed from: private */
    public static final KeyData DEFAULT_INSTANCE;
    public static final int KEY_MATERIAL_TYPE_FIELD_NUMBER = 3;
    private static volatile km4<KeyData> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int keyMaterialType_;
    private String typeUrl_ = "";
    private ByteString value_ = ByteString.EMPTY;

    public enum KeyMaterialType implements C4758t.C4761c {
        UNKNOWN_KEYMATERIAL(0),
        SYMMETRIC(1),
        ASYMMETRIC_PRIVATE(2),
        ASYMMETRIC_PUBLIC(3),
        REMOTE(4),
        UNRECOGNIZED(-1);
        
        public static final int ASYMMETRIC_PRIVATE_VALUE = 2;
        public static final int ASYMMETRIC_PUBLIC_VALUE = 3;
        public static final int REMOTE_VALUE = 4;
        public static final int SYMMETRIC_VALUE = 1;
        public static final int UNKNOWN_KEYMATERIAL_VALUE = 0;

        /* renamed from: a */
        public static final C4758t.C4762d<KeyMaterialType> f25062a = null;
        private final int value;

        /* renamed from: com.google.crypto.tink.proto.KeyData$KeyMaterialType$a */
        public class C4655a implements C4758t.C4762d<KeyMaterialType> {
            /* renamed from: a */
            public KeyMaterialType findValueByNumber(int i) {
                return KeyMaterialType.forNumber(i);
            }
        }

        /* renamed from: com.google.crypto.tink.proto.KeyData$KeyMaterialType$b */
        public static final class C4656b implements C4758t.C4763e {

            /* renamed from: a */
            public static final C4758t.C4763e f25064a = null;

            static {
                f25064a = new C4656b();
            }

            public boolean isInRange(int i) {
                if (KeyMaterialType.forNumber(i) != null) {
                    return true;
                }
                return false;
            }
        }

        /* access modifiers changed from: public */
        static {
            f25062a = new C4655a();
        }

        /* access modifiers changed from: public */
        KeyMaterialType(int i) {
            this.value = i;
        }

        public static KeyMaterialType forNumber(int i) {
            if (i == 0) {
                return UNKNOWN_KEYMATERIAL;
            }
            if (i == 1) {
                return SYMMETRIC;
            }
            if (i == 2) {
                return ASYMMETRIC_PRIVATE;
            }
            if (i == 3) {
                return ASYMMETRIC_PUBLIC;
            }
            if (i != 4) {
                return null;
            }
            return REMOTE;
        }

        public static C4758t.C4762d<KeyMaterialType> internalGetValueMap() {
            return f25062a;
        }

        public static C4758t.C4763e internalGetVerifier() {
            return C4656b.f25064a;
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static KeyMaterialType valueOf(int i) {
            return forNumber(i);
        }
    }

    /* renamed from: com.google.crypto.tink.proto.KeyData$a */
    public static /* synthetic */ class C4657a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f25065a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke[] r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f25065a = r0
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f25065a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f25065a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f25065a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f25065a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f25065a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f25065a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.proto.KeyData.C4657a.<clinit>():void");
        }
    }

    /* renamed from: com.google.crypto.tink.proto.KeyData$b */
    public static final class C4658b extends GeneratedMessageLite.C4680a<KeyData, C4658b> implements su3 {
        public /* synthetic */ C4658b(C4657a aVar) {
            this();
        }

        /* renamed from: t */
        public C4658b mo35295t(KeyMaterialType keyMaterialType) {
            mo35467j();
            ((KeyData) this.f25103d).mo35291L(keyMaterialType);
            return this;
        }

        /* renamed from: u */
        public C4658b mo35296u(String str) {
            mo35467j();
            ((KeyData) this.f25103d).mo35292M(str);
            return this;
        }

        /* renamed from: v */
        public C4658b mo35297v(ByteString byteString) {
            mo35467j();
            ((KeyData) this.f25103d).mo35293N(byteString);
            return this;
        }

        public C4658b() {
            super(KeyData.DEFAULT_INSTANCE);
        }
    }

    static {
        KeyData keyData = new KeyData();
        DEFAULT_INSTANCE = keyData;
        GeneratedMessageLite.m37317A(KeyData.class, keyData);
    }

    /* renamed from: G */
    public static KeyData m37124G() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: K */
    public static C4658b m37125K() {
        return (C4658b) DEFAULT_INSTANCE.mo35450i();
    }

    /* renamed from: H */
    public KeyMaterialType mo35288H() {
        KeyMaterialType forNumber = KeyMaterialType.forNumber(this.keyMaterialType_);
        if (forNumber == null) {
            return KeyMaterialType.UNRECOGNIZED;
        }
        return forNumber;
    }

    /* renamed from: I */
    public String mo35289I() {
        return this.typeUrl_;
    }

    /* renamed from: J */
    public ByteString mo35290J() {
        return this.value_;
    }

    /* renamed from: L */
    public final void mo35291L(KeyMaterialType keyMaterialType) {
        this.keyMaterialType_ = keyMaterialType.getNumber();
    }

    /* renamed from: M */
    public final void mo35292M(String str) {
        str.getClass();
        this.typeUrl_ = str;
    }

    /* renamed from: N */
    public final void mo35293N(ByteString byteString) {
        byteString.getClass();
        this.value_ = byteString;
    }

    /* renamed from: l */
    public final Object mo28927l(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C4657a.f25065a[methodToInvoke.ordinal()]) {
            case 1:
                return new KeyData();
            case 2:
                return new C4658b((C4657a) null);
            case 3:
                return GeneratedMessageLite.m37324u(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "keyMaterialType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                km4<KeyData> km4 = PARSER;
                if (km4 == null) {
                    synchronized (KeyData.class) {
                        km4 = PARSER;
                        if (km4 == null) {
                            km4 = new GeneratedMessageLite.C4681b<>(DEFAULT_INSTANCE);
                            PARSER = km4;
                        }
                    }
                }
                return km4;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
