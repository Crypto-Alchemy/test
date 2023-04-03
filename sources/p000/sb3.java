package p000;

import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.C4758t;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;

/* renamed from: sb3 */
/* compiled from: KeysetInfo */
public final class sb3 extends GeneratedMessageLite<sb3, C6474b> implements su3 {
    /* access modifiers changed from: private */
    public static final sb3 DEFAULT_INSTANCE;
    public static final int KEY_INFO_FIELD_NUMBER = 2;
    private static volatile km4<sb3> PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private C4758t.C4767i<C6475c> keyInfo_ = GeneratedMessageLite.m37319m();
    private int primaryKeyId_;

    /* renamed from: sb3$a */
    /* compiled from: KeysetInfo */
    public static /* synthetic */ class C6473a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f33821a;

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
                f33821a = r0
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f33821a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f33821a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f33821a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f33821a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f33821a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f33821a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.sb3.C6473a.<clinit>():void");
        }
    }

    /* renamed from: sb3$b */
    /* compiled from: KeysetInfo */
    public static final class C6474b extends GeneratedMessageLite.C4680a<sb3, C6474b> implements su3 {
        public /* synthetic */ C6474b(C6473a aVar) {
            this();
        }

        /* renamed from: t */
        public C6474b mo47720t(C6475c cVar) {
            mo35467j();
            ((sb3) this.f25103d).mo47716F(cVar);
            return this;
        }

        /* renamed from: u */
        public C6474b mo47721u(int i) {
            mo35467j();
            ((sb3) this.f25103d).mo47719J(i);
            return this;
        }

        public C6474b() {
            super(sb3.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: sb3$c */
    /* compiled from: KeysetInfo */
    public static final class C6475c extends GeneratedMessageLite<C6475c, C6476a> implements su3 {
        /* access modifiers changed from: private */
        public static final C6475c DEFAULT_INSTANCE;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile km4<C6475c> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        public static final int TYPE_URL_FIELD_NUMBER = 1;
        private int keyId_;
        private int outputPrefixType_;
        private int status_;
        private String typeUrl_ = "";

        /* renamed from: sb3$c$a */
        /* compiled from: KeysetInfo */
        public static final class C6476a extends GeneratedMessageLite.C4680a<C6475c, C6476a> implements su3 {
            public /* synthetic */ C6476a(C6473a aVar) {
                this();
            }

            /* renamed from: t */
            public C6476a mo47727t(int i) {
                mo35467j();
                ((C6475c) this.f25103d).mo47723J(i);
                return this;
            }

            /* renamed from: u */
            public C6476a mo47728u(OutputPrefixType outputPrefixType) {
                mo35467j();
                ((C6475c) this.f25103d).mo47724K(outputPrefixType);
                return this;
            }

            /* renamed from: v */
            public C6476a mo47729v(KeyStatusType keyStatusType) {
                mo35467j();
                ((C6475c) this.f25103d).mo47725L(keyStatusType);
                return this;
            }

            /* renamed from: w */
            public C6476a mo47730w(String str) {
                mo35467j();
                ((C6475c) this.f25103d).mo47726M(str);
                return this;
            }

            public C6476a() {
                super(C6475c.DEFAULT_INSTANCE);
            }
        }

        static {
            C6475c cVar = new C6475c();
            DEFAULT_INSTANCE = cVar;
            GeneratedMessageLite.m37317A(C6475c.class, cVar);
        }

        /* renamed from: I */
        public static C6476a m51693I() {
            return (C6476a) DEFAULT_INSTANCE.mo35450i();
        }

        /* renamed from: H */
        public int mo47722H() {
            return this.keyId_;
        }

        /* renamed from: J */
        public final void mo47723J(int i) {
            this.keyId_ = i;
        }

        /* renamed from: K */
        public final void mo47724K(OutputPrefixType outputPrefixType) {
            this.outputPrefixType_ = outputPrefixType.getNumber();
        }

        /* renamed from: L */
        public final void mo47725L(KeyStatusType keyStatusType) {
            this.status_ = keyStatusType.getNumber();
        }

        /* renamed from: M */
        public final void mo47726M(String str) {
            str.getClass();
            this.typeUrl_ = str;
        }

        /* renamed from: l */
        public final Object mo28927l(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C6473a.f33821a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C6475c();
                case 2:
                    return new C6476a((C6473a) null);
                case 3:
                    return GeneratedMessageLite.m37324u(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"typeUrl_", "status_", "keyId_", "outputPrefixType_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    km4<C6475c> km4 = PARSER;
                    if (km4 == null) {
                        synchronized (C6475c.class) {
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
        sb3 sb3 = new sb3();
        DEFAULT_INSTANCE = sb3;
        GeneratedMessageLite.m37317A(sb3.class, sb3);
    }

    /* renamed from: I */
    public static C6474b m51680I() {
        return (C6474b) DEFAULT_INSTANCE.mo35450i();
    }

    /* renamed from: F */
    public final void mo47716F(C6475c cVar) {
        cVar.getClass();
        mo47717G();
        this.keyInfo_.add(cVar);
    }

    /* renamed from: G */
    public final void mo47717G() {
        C4758t.C4767i<C6475c> iVar = this.keyInfo_;
        if (!iVar.mo35633v()) {
            this.keyInfo_ = GeneratedMessageLite.m37323s(iVar);
        }
    }

    /* renamed from: H */
    public C6475c mo47718H(int i) {
        return this.keyInfo_.get(i);
    }

    /* renamed from: J */
    public final void mo47719J(int i) {
        this.primaryKeyId_ = i;
    }

    /* renamed from: l */
    public final Object mo28927l(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C6473a.f33821a[methodToInvoke.ordinal()]) {
            case 1:
                return new sb3();
            case 2:
                return new C6474b((C6473a) null);
            case 3:
                return GeneratedMessageLite.m37324u(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "keyInfo_", C6475c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                km4<sb3> km4 = PARSER;
                if (km4 == null) {
                    synchronized (sb3.class) {
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
