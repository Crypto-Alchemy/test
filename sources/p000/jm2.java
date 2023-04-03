package p000;

import com.google.crypto.tink.proto.HashType;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;

/* renamed from: jm2 */
/* compiled from: HmacParams */
public final class jm2 extends GeneratedMessageLite<jm2, C6111b> implements su3 {
    /* access modifiers changed from: private */
    public static final jm2 DEFAULT_INSTANCE;
    public static final int HASH_FIELD_NUMBER = 1;
    private static volatile km4<jm2> PARSER = null;
    public static final int TAG_SIZE_FIELD_NUMBER = 2;
    private int hash_;
    private int tagSize_;

    /* renamed from: jm2$a */
    /* compiled from: HmacParams */
    public static /* synthetic */ class C6110a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f30526a;

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
                f30526a = r0
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f30526a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f30526a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f30526a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f30526a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f30526a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f30526a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.jm2.C6110a.<clinit>():void");
        }
    }

    /* renamed from: jm2$b */
    /* compiled from: HmacParams */
    public static final class C6111b extends GeneratedMessageLite.C4680a<jm2, C6111b> implements su3 {
        public /* synthetic */ C6111b(C6110a aVar) {
            this();
        }

        /* renamed from: t */
        public C6111b mo44512t(HashType hashType) {
            mo35467j();
            ((jm2) this.f25103d).mo44510J(hashType);
            return this;
        }

        /* renamed from: u */
        public C6111b mo44513u(int i) {
            mo35467j();
            ((jm2) this.f25103d).mo44511K(i);
            return this;
        }

        public C6111b() {
            super(jm2.DEFAULT_INSTANCE);
        }
    }

    static {
        jm2 jm2 = new jm2();
        DEFAULT_INSTANCE = jm2;
        GeneratedMessageLite.m37317A(jm2.class, jm2);
    }

    /* renamed from: F */
    public static jm2 m46606F() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: I */
    public static C6111b m46607I() {
        return (C6111b) DEFAULT_INSTANCE.mo35450i();
    }

    /* renamed from: G */
    public HashType mo44508G() {
        HashType forNumber = HashType.forNumber(this.hash_);
        if (forNumber == null) {
            return HashType.UNRECOGNIZED;
        }
        return forNumber;
    }

    /* renamed from: H */
    public int mo44509H() {
        return this.tagSize_;
    }

    /* renamed from: J */
    public final void mo44510J(HashType hashType) {
        this.hash_ = hashType.getNumber();
    }

    /* renamed from: K */
    public final void mo44511K(int i) {
        this.tagSize_ = i;
    }

    /* renamed from: l */
    public final Object mo28927l(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C6110a.f30526a[methodToInvoke.ordinal()]) {
            case 1:
                return new jm2();
            case 2:
                return new C6111b((C6110a) null);
            case 3:
                return GeneratedMessageLite.m37324u(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"hash_", "tagSize_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                km4<jm2> km4 = PARSER;
                if (km4 == null) {
                    synchronized (jm2.class) {
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
