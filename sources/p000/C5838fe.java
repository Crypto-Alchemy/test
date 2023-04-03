package p000;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.C4734l;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;

/* renamed from: fe */
/* compiled from: AesEaxKey */
public final class C5838fe extends GeneratedMessageLite<C5838fe, C5840b> implements su3 {
    /* access modifiers changed from: private */
    public static final C5838fe DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile km4<C5838fe> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private ByteString keyValue_ = ByteString.EMPTY;
    private C5955ie params_;
    private int version_;

    /* renamed from: fe$a */
    /* compiled from: AesEaxKey */
    public static /* synthetic */ class C5839a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f28821a;

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
                f28821a = r0
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f28821a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f28821a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f28821a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f28821a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f28821a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f28821a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C5838fe.C5839a.<clinit>():void");
        }
    }

    /* renamed from: fe$b */
    /* compiled from: AesEaxKey */
    public static final class C5840b extends GeneratedMessageLite.C4680a<C5838fe, C5840b> implements su3 {
        public /* synthetic */ C5840b(C5839a aVar) {
            this();
        }

        /* renamed from: t */
        public C5840b mo42555t(ByteString byteString) {
            mo35467j();
            ((C5838fe) this.f25103d).mo42552L(byteString);
            return this;
        }

        /* renamed from: u */
        public C5840b mo42556u(C5955ie ieVar) {
            mo35467j();
            ((C5838fe) this.f25103d).mo42553M(ieVar);
            return this;
        }

        /* renamed from: v */
        public C5840b mo42557v(int i) {
            mo35467j();
            ((C5838fe) this.f25103d).mo42554N(i);
            return this;
        }

        public C5840b() {
            super(C5838fe.DEFAULT_INSTANCE);
        }
    }

    static {
        C5838fe feVar = new C5838fe();
        DEFAULT_INSTANCE = feVar;
        GeneratedMessageLite.m37317A(C5838fe.class, feVar);
    }

    /* renamed from: J */
    public static C5840b m44268J() {
        return (C5840b) DEFAULT_INSTANCE.mo35450i();
    }

    /* renamed from: K */
    public static C5838fe m44269K(ByteString byteString, C4734l lVar) throws InvalidProtocolBufferException {
        return (C5838fe) GeneratedMessageLite.m37325v(DEFAULT_INSTANCE, byteString, lVar);
    }

    /* renamed from: G */
    public ByteString mo42549G() {
        return this.keyValue_;
    }

    /* renamed from: H */
    public C5955ie mo42550H() {
        C5955ie ieVar = this.params_;
        if (ieVar == null) {
            return C5955ie.m45685E();
        }
        return ieVar;
    }

    /* renamed from: I */
    public int mo42551I() {
        return this.version_;
    }

    /* renamed from: L */
    public final void mo42552L(ByteString byteString) {
        byteString.getClass();
        this.keyValue_ = byteString;
    }

    /* renamed from: M */
    public final void mo42553M(C5955ie ieVar) {
        ieVar.getClass();
        this.params_ = ieVar;
    }

    /* renamed from: N */
    public final void mo42554N(int i) {
        this.version_ = i;
    }

    /* renamed from: l */
    public final Object mo28927l(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C5839a.f28821a[methodToInvoke.ordinal()]) {
            case 1:
                return new C5838fe();
            case 2:
                return new C5840b((C5839a) null);
            case 3:
                return GeneratedMessageLite.m37324u(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                km4<C5838fe> km4 = PARSER;
                if (km4 == null) {
                    synchronized (C5838fe.class) {
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
