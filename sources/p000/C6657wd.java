package p000;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.C4734l;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;

/* renamed from: wd */
/* compiled from: AesCtrHmacAeadKey */
public final class C6657wd extends GeneratedMessageLite<C6657wd, C6659b> implements su3 {
    public static final int AES_CTR_KEY_FIELD_NUMBER = 2;
    /* access modifiers changed from: private */
    public static final C6657wd DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FIELD_NUMBER = 3;
    private static volatile km4<C6657wd> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private C3807ae aesCtrKey_;
    private gm2 hmacKey_;
    private int version_;

    /* renamed from: wd$a */
    /* compiled from: AesCtrHmacAeadKey */
    public static /* synthetic */ class C6658a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f35302a;

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
                f35302a = r0
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f35302a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f35302a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f35302a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f35302a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f35302a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f35302a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C6657wd.C6658a.<clinit>():void");
        }
    }

    /* renamed from: wd$b */
    /* compiled from: AesCtrHmacAeadKey */
    public static final class C6659b extends GeneratedMessageLite.C4680a<C6657wd, C6659b> implements su3 {
        public /* synthetic */ C6659b(C6658a aVar) {
            this();
        }

        /* renamed from: t */
        public C6659b mo49176t(C3807ae aeVar) {
            mo35467j();
            ((C6657wd) this.f25103d).mo49173L(aeVar);
            return this;
        }

        /* renamed from: u */
        public C6659b mo49177u(gm2 gm2) {
            mo35467j();
            ((C6657wd) this.f25103d).mo49174M(gm2);
            return this;
        }

        /* renamed from: v */
        public C6659b mo49178v(int i) {
            mo35467j();
            ((C6657wd) this.f25103d).mo49175N(i);
            return this;
        }

        public C6659b() {
            super(C6657wd.DEFAULT_INSTANCE);
        }
    }

    static {
        C6657wd wdVar = new C6657wd();
        DEFAULT_INSTANCE = wdVar;
        GeneratedMessageLite.m37317A(C6657wd.class, wdVar);
    }

    /* renamed from: J */
    public static C6659b m53840J() {
        return (C6659b) DEFAULT_INSTANCE.mo35450i();
    }

    /* renamed from: K */
    public static C6657wd m53841K(ByteString byteString, C4734l lVar) throws InvalidProtocolBufferException {
        return (C6657wd) GeneratedMessageLite.m37325v(DEFAULT_INSTANCE, byteString, lVar);
    }

    /* renamed from: G */
    public C3807ae mo49170G() {
        C3807ae aeVar = this.aesCtrKey_;
        if (aeVar == null) {
            return C3807ae.m31784G();
        }
        return aeVar;
    }

    /* renamed from: H */
    public gm2 mo49171H() {
        gm2 gm2 = this.hmacKey_;
        if (gm2 == null) {
            return gm2.m44777G();
        }
        return gm2;
    }

    /* renamed from: I */
    public int mo49172I() {
        return this.version_;
    }

    /* renamed from: L */
    public final void mo49173L(C3807ae aeVar) {
        aeVar.getClass();
        this.aesCtrKey_ = aeVar;
    }

    /* renamed from: M */
    public final void mo49174M(gm2 gm2) {
        gm2.getClass();
        this.hmacKey_ = gm2;
    }

    /* renamed from: N */
    public final void mo49175N(int i) {
        this.version_ = i;
    }

    /* renamed from: l */
    public final Object mo28927l(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C6658a.f35302a[methodToInvoke.ordinal()]) {
            case 1:
                return new C6657wd();
            case 2:
                return new C6659b((C6658a) null);
            case 3:
                return GeneratedMessageLite.m37324u(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"version_", "aesCtrKey_", "hmacKey_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                km4<C6657wd> km4 = PARSER;
                if (km4 == null) {
                    synchronized (C6657wd.class) {
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
