package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.C4734l;
import com.google.crypto.tink.shaded.protobuf.C4758t;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.crypto.tink.proto.a */
/* compiled from: Keyset */
public final class C4663a extends GeneratedMessageLite<C4663a, C4665b> implements su3 {
    /* access modifiers changed from: private */
    public static final C4663a DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile km4<C4663a> PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private C4758t.C4767i<C4666c> key_ = GeneratedMessageLite.m37319m();
    private int primaryKeyId_;

    /* renamed from: com.google.crypto.tink.proto.a$a */
    /* compiled from: Keyset */
    public static /* synthetic */ class C4664a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f25072a;

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
                f25072a = r0
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f25072a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f25072a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f25072a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f25072a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f25072a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f25072a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.proto.C4663a.C4664a.<clinit>():void");
        }
    }

    /* renamed from: com.google.crypto.tink.proto.a$b */
    /* compiled from: Keyset */
    public static final class C4665b extends GeneratedMessageLite.C4680a<C4663a, C4665b> implements su3 {
        public /* synthetic */ C4665b(C4664a aVar) {
            this();
        }

        /* renamed from: t */
        public C4665b mo35307t(C4666c cVar) {
            mo35467j();
            ((C4663a) this.f25103d).mo35300F(cVar);
            return this;
        }

        /* renamed from: u */
        public C4666c mo35308u(int i) {
            return ((C4663a) this.f25103d).mo35302H(i);
        }

        /* renamed from: v */
        public int mo35309v() {
            return ((C4663a) this.f25103d).mo35303I();
        }

        /* renamed from: w */
        public List<C4666c> mo35310w() {
            return Collections.unmodifiableList(((C4663a) this.f25103d).mo35304J());
        }

        /* renamed from: x */
        public C4665b mo35311x(int i) {
            mo35467j();
            ((C4663a) this.f25103d).mo35306N(i);
            return this;
        }

        public C4665b() {
            super(C4663a.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.google.crypto.tink.proto.a$c */
    /* compiled from: Keyset */
    public static final class C4666c extends GeneratedMessageLite<C4666c, C4667a> implements su3 {
        /* access modifiers changed from: private */
        public static final C4666c DEFAULT_INSTANCE;
        public static final int KEY_DATA_FIELD_NUMBER = 1;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile km4<C4666c> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        private KeyData keyData_;
        private int keyId_;
        private int outputPrefixType_;
        private int status_;

        /* renamed from: com.google.crypto.tink.proto.a$c$a */
        /* compiled from: Keyset */
        public static final class C4667a extends GeneratedMessageLite.C4680a<C4666c, C4667a> implements su3 {
            public /* synthetic */ C4667a(C4664a aVar) {
                this();
            }

            /* renamed from: t */
            public C4667a mo35321t(KeyData keyData) {
                mo35467j();
                ((C4666c) this.f25103d).mo35317N(keyData);
                return this;
            }

            /* renamed from: u */
            public C4667a mo35322u(int i) {
                mo35467j();
                ((C4666c) this.f25103d).mo35318O(i);
                return this;
            }

            /* renamed from: v */
            public C4667a mo35323v(OutputPrefixType outputPrefixType) {
                mo35467j();
                ((C4666c) this.f25103d).mo35319P(outputPrefixType);
                return this;
            }

            /* renamed from: w */
            public C4667a mo35324w(KeyStatusType keyStatusType) {
                mo35467j();
                ((C4666c) this.f25103d).mo35320Q(keyStatusType);
                return this;
            }

            public C4667a() {
                super(C4666c.DEFAULT_INSTANCE);
            }
        }

        static {
            C4666c cVar = new C4666c();
            DEFAULT_INSTANCE = cVar;
            GeneratedMessageLite.m37317A(C4666c.class, cVar);
        }

        /* renamed from: M */
        public static C4667a m37162M() {
            return (C4667a) DEFAULT_INSTANCE.mo35450i();
        }

        /* renamed from: H */
        public KeyData mo35312H() {
            KeyData keyData = this.keyData_;
            if (keyData == null) {
                return KeyData.m37124G();
            }
            return keyData;
        }

        /* renamed from: I */
        public int mo35313I() {
            return this.keyId_;
        }

        /* renamed from: J */
        public OutputPrefixType mo35314J() {
            OutputPrefixType forNumber = OutputPrefixType.forNumber(this.outputPrefixType_);
            if (forNumber == null) {
                return OutputPrefixType.UNRECOGNIZED;
            }
            return forNumber;
        }

        /* renamed from: K */
        public KeyStatusType mo35315K() {
            KeyStatusType forNumber = KeyStatusType.forNumber(this.status_);
            if (forNumber == null) {
                return KeyStatusType.UNRECOGNIZED;
            }
            return forNumber;
        }

        /* renamed from: L */
        public boolean mo35316L() {
            if (this.keyData_ != null) {
                return true;
            }
            return false;
        }

        /* renamed from: N */
        public final void mo35317N(KeyData keyData) {
            keyData.getClass();
            this.keyData_ = keyData;
        }

        /* renamed from: O */
        public final void mo35318O(int i) {
            this.keyId_ = i;
        }

        /* renamed from: P */
        public final void mo35319P(OutputPrefixType outputPrefixType) {
            this.outputPrefixType_ = outputPrefixType.getNumber();
        }

        /* renamed from: Q */
        public final void mo35320Q(KeyStatusType keyStatusType) {
            this.status_ = keyStatusType.getNumber();
        }

        /* renamed from: l */
        public final Object mo28927l(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C4664a.f25072a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C4666c();
                case 2:
                    return new C4667a((C4664a) null);
                case 3:
                    return GeneratedMessageLite.m37324u(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"keyData_", "status_", "keyId_", "outputPrefixType_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    km4<C4666c> km4 = PARSER;
                    if (km4 == null) {
                        synchronized (C4666c.class) {
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

    static {
        C4663a aVar = new C4663a();
        DEFAULT_INSTANCE = aVar;
        GeneratedMessageLite.m37317A(C4663a.class, aVar);
    }

    /* renamed from: L */
    public static C4665b m37142L() {
        return (C4665b) DEFAULT_INSTANCE.mo35450i();
    }

    /* renamed from: M */
    public static C4663a m37143M(byte[] bArr, C4734l lVar) throws InvalidProtocolBufferException {
        return (C4663a) GeneratedMessageLite.m37326w(DEFAULT_INSTANCE, bArr, lVar);
    }

    /* renamed from: F */
    public final void mo35300F(C4666c cVar) {
        cVar.getClass();
        mo35301G();
        this.key_.add(cVar);
    }

    /* renamed from: G */
    public final void mo35301G() {
        C4758t.C4767i<C4666c> iVar = this.key_;
        if (!iVar.mo35633v()) {
            this.key_ = GeneratedMessageLite.m37323s(iVar);
        }
    }

    /* renamed from: H */
    public C4666c mo35302H(int i) {
        return this.key_.get(i);
    }

    /* renamed from: I */
    public int mo35303I() {
        return this.key_.size();
    }

    /* renamed from: J */
    public List<C4666c> mo35304J() {
        return this.key_;
    }

    /* renamed from: K */
    public int mo35305K() {
        return this.primaryKeyId_;
    }

    /* renamed from: N */
    public final void mo35306N(int i) {
        this.primaryKeyId_ = i;
    }

    /* renamed from: l */
    public final Object mo28927l(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C4664a.f25072a[methodToInvoke.ordinal()]) {
            case 1:
                return new C4663a();
            case 2:
                return new C4665b((C4664a) null);
            case 3:
                return GeneratedMessageLite.m37324u(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "key_", C4666c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                km4<C4663a> km4 = PARSER;
                if (km4 == null) {
                    synchronized (C4663a.class) {
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
