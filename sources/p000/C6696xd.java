package p000;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.C4734l;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;

/* renamed from: xd */
/* compiled from: AesCtrHmacAeadKeyFormat */
public final class C6696xd extends GeneratedMessageLite<C6696xd, C6698b> implements su3 {
    public static final int AES_CTR_KEY_FORMAT_FIELD_NUMBER = 1;
    /* access modifiers changed from: private */
    public static final C6696xd DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FORMAT_FIELD_NUMBER = 2;
    private static volatile km4<C6696xd> PARSER;
    private C3890be aesCtrKeyFormat_;
    private hm2 hmacKeyFormat_;

    /* renamed from: xd$a */
    /* compiled from: AesCtrHmacAeadKeyFormat */
    public static /* synthetic */ class C6697a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f35604a;

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
                f35604a = r0
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f35604a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f35604a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f35604a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f35604a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f35604a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f35604a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C6696xd.C6697a.<clinit>():void");
        }
    }

    /* renamed from: xd$b */
    /* compiled from: AesCtrHmacAeadKeyFormat */
    public static final class C6698b extends GeneratedMessageLite.C4680a<C6696xd, C6698b> implements su3 {
        public /* synthetic */ C6698b(C6697a aVar) {
            this();
        }

        /* renamed from: t */
        public C6698b mo49469t(C3890be beVar) {
            mo35467j();
            ((C6696xd) this.f25103d).mo49467J(beVar);
            return this;
        }

        /* renamed from: u */
        public C6698b mo49470u(hm2 hm2) {
            mo35467j();
            ((C6696xd) this.f25103d).mo49468K(hm2);
            return this;
        }

        public C6698b() {
            super(C6696xd.DEFAULT_INSTANCE);
        }
    }

    static {
        C6696xd xdVar = new C6696xd();
        DEFAULT_INSTANCE = xdVar;
        GeneratedMessageLite.m37317A(C6696xd.class, xdVar);
    }

    /* renamed from: H */
    public static C6698b m54358H() {
        return (C6698b) DEFAULT_INSTANCE.mo35450i();
    }

    /* renamed from: I */
    public static C6696xd m54359I(ByteString byteString, C4734l lVar) throws InvalidProtocolBufferException {
        return (C6696xd) GeneratedMessageLite.m37325v(DEFAULT_INSTANCE, byteString, lVar);
    }

    /* renamed from: F */
    public C3890be mo49465F() {
        C3890be beVar = this.aesCtrKeyFormat_;
        if (beVar == null) {
            return C3890be.m32488F();
        }
        return beVar;
    }

    /* renamed from: G */
    public hm2 mo49466G() {
        hm2 hm2 = this.hmacKeyFormat_;
        if (hm2 == null) {
            return hm2.m45292F();
        }
        return hm2;
    }

    /* renamed from: J */
    public final void mo49467J(C3890be beVar) {
        beVar.getClass();
        this.aesCtrKeyFormat_ = beVar;
    }

    /* renamed from: K */
    public final void mo49468K(hm2 hm2) {
        hm2.getClass();
        this.hmacKeyFormat_ = hm2;
    }

    /* renamed from: l */
    public final Object mo28927l(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C6697a.f35604a[methodToInvoke.ordinal()]) {
            case 1:
                return new C6696xd();
            case 2:
                return new C6698b((C6697a) null);
            case 3:
                return GeneratedMessageLite.m37324u(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"aesCtrKeyFormat_", "hmacKeyFormat_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                km4<C6696xd> km4 = PARSER;
                if (km4 == null) {
                    synchronized (C6696xd.class) {
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
