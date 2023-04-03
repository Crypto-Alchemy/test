package p000;

import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;

/* renamed from: cb3 */
/* compiled from: KeyTemplate */
public final class cb3 extends GeneratedMessageLite<cb3, C3927b> implements su3 {
    /* access modifiers changed from: private */
    public static final cb3 DEFAULT_INSTANCE;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 3;
    private static volatile km4<cb3> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int outputPrefixType_;
    private String typeUrl_ = "";
    private ByteString value_ = ByteString.EMPTY;

    /* renamed from: cb3$a */
    /* compiled from: KeyTemplate */
    public static /* synthetic */ class C3926a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f21668a;

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
                f21668a = r0
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f21668a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f21668a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f21668a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f21668a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f21668a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f21668a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.cb3.C3926a.<clinit>():void");
        }
    }

    /* renamed from: cb3$b */
    /* compiled from: KeyTemplate */
    public static final class C3927b extends GeneratedMessageLite.C4680a<cb3, C3927b> implements su3 {
        public /* synthetic */ C3927b(C3926a aVar) {
            this();
        }

        /* renamed from: t */
        public C3927b mo29920t(OutputPrefixType outputPrefixType) {
            mo35467j();
            ((cb3) this.f25103d).mo29917L(outputPrefixType);
            return this;
        }

        /* renamed from: u */
        public C3927b mo29921u(String str) {
            mo35467j();
            ((cb3) this.f25103d).mo29918M(str);
            return this;
        }

        /* renamed from: v */
        public C3927b mo29922v(ByteString byteString) {
            mo35467j();
            ((cb3) this.f25103d).mo29919N(byteString);
            return this;
        }

        public C3927b() {
            super(cb3.DEFAULT_INSTANCE);
        }
    }

    static {
        cb3 cb3 = new cb3();
        DEFAULT_INSTANCE = cb3;
        GeneratedMessageLite.m37317A(cb3.class, cb3);
    }

    /* renamed from: G */
    public static cb3 m32898G() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: K */
    public static C3927b m32899K() {
        return (C3927b) DEFAULT_INSTANCE.mo35450i();
    }

    /* renamed from: H */
    public OutputPrefixType mo29914H() {
        OutputPrefixType forNumber = OutputPrefixType.forNumber(this.outputPrefixType_);
        if (forNumber == null) {
            return OutputPrefixType.UNRECOGNIZED;
        }
        return forNumber;
    }

    /* renamed from: I */
    public String mo29915I() {
        return this.typeUrl_;
    }

    /* renamed from: J */
    public ByteString mo29916J() {
        return this.value_;
    }

    /* renamed from: L */
    public final void mo29917L(OutputPrefixType outputPrefixType) {
        this.outputPrefixType_ = outputPrefixType.getNumber();
    }

    /* renamed from: M */
    public final void mo29918M(String str) {
        str.getClass();
        this.typeUrl_ = str;
    }

    /* renamed from: N */
    public final void mo29919N(ByteString byteString) {
        byteString.getClass();
        this.value_ = byteString;
    }

    /* renamed from: l */
    public final Object mo28927l(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C3926a.f21668a[methodToInvoke.ordinal()]) {
            case 1:
                return new cb3();
            case 2:
                return new C3927b((C3926a) null);
            case 3:
                return GeneratedMessageLite.m37324u(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "outputPrefixType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                km4<cb3> km4 = PARSER;
                if (km4 == null) {
                    synchronized (cb3.class) {
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
