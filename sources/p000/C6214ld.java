package p000;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.C4734l;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;

/* renamed from: ld */
/* compiled from: AesCmacKey */
public final class C6214ld extends GeneratedMessageLite<C6214ld, C6216b> implements su3 {
    /* access modifiers changed from: private */
    public static final C6214ld DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 3;
    private static volatile km4<C6214ld> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private ByteString keyValue_ = ByteString.EMPTY;
    private C6403qd params_;
    private int version_;

    /* renamed from: ld$a */
    /* compiled from: AesCmacKey */
    public static /* synthetic */ class C6215a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f31288a;

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
                f31288a = r0
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f31288a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f31288a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f31288a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f31288a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f31288a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f31288a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C6214ld.C6215a.<clinit>():void");
        }
    }

    /* renamed from: ld$b */
    /* compiled from: AesCmacKey */
    public static final class C6216b extends GeneratedMessageLite.C4680a<C6214ld, C6216b> implements su3 {
        public /* synthetic */ C6216b(C6215a aVar) {
            this();
        }

        /* renamed from: t */
        public C6216b mo45418t(ByteString byteString) {
            mo35467j();
            ((C6214ld) this.f25103d).mo45415L(byteString);
            return this;
        }

        /* renamed from: u */
        public C6216b mo45419u(C6403qd qdVar) {
            mo35467j();
            ((C6214ld) this.f25103d).mo45416M(qdVar);
            return this;
        }

        /* renamed from: v */
        public C6216b mo45420v(int i) {
            mo35467j();
            ((C6214ld) this.f25103d).mo45417N(i);
            return this;
        }

        public C6216b() {
            super(C6214ld.DEFAULT_INSTANCE);
        }
    }

    static {
        C6214ld ldVar = new C6214ld();
        DEFAULT_INSTANCE = ldVar;
        GeneratedMessageLite.m37317A(C6214ld.class, ldVar);
    }

    /* renamed from: J */
    public static C6216b m47762J() {
        return (C6216b) DEFAULT_INSTANCE.mo35450i();
    }

    /* renamed from: K */
    public static C6214ld m47763K(ByteString byteString, C4734l lVar) throws InvalidProtocolBufferException {
        return (C6214ld) GeneratedMessageLite.m37325v(DEFAULT_INSTANCE, byteString, lVar);
    }

    /* renamed from: G */
    public ByteString mo45412G() {
        return this.keyValue_;
    }

    /* renamed from: H */
    public C6403qd mo45413H() {
        C6403qd qdVar = this.params_;
        if (qdVar == null) {
            return C6403qd.m50516E();
        }
        return qdVar;
    }

    /* renamed from: I */
    public int mo45414I() {
        return this.version_;
    }

    /* renamed from: L */
    public final void mo45415L(ByteString byteString) {
        byteString.getClass();
        this.keyValue_ = byteString;
    }

    /* renamed from: M */
    public final void mo45416M(C6403qd qdVar) {
        qdVar.getClass();
        this.params_ = qdVar;
    }

    /* renamed from: N */
    public final void mo45417N(int i) {
        this.version_ = i;
    }

    /* renamed from: l */
    public final Object mo28927l(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C6215a.f31288a[methodToInvoke.ordinal()]) {
            case 1:
                return new C6214ld();
            case 2:
                return new C6216b((C6215a) null);
            case 3:
                return GeneratedMessageLite.m37324u(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"version_", "keyValue_", "params_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                km4<C6214ld> km4 = PARSER;
                if (km4 == null) {
                    synchronized (C6214ld.class) {
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
