package p000;

import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.C4734l;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import p000.C6345pd;

@C6643w7
/* renamed from: vd */
/* compiled from: AesCmacProtoSerialization */
public final class C6599vd {

    /* renamed from: a */
    public static final e70 f34914a;

    /* renamed from: b */
    public static final xl4<C6345pd, by4> f34915b;

    /* renamed from: c */
    public static final wl4<by4> f34916c;

    /* renamed from: d */
    public static final za3<C6241md, ay4> f34917d;

    /* renamed from: e */
    public static final wa3<ay4> f34918e;

    /* renamed from: vd$a */
    /* compiled from: AesCmacProtoSerialization */
    public static /* synthetic */ class C6600a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f34919a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.google.crypto.tink.proto.OutputPrefixType[] r0 = com.google.crypto.tink.proto.OutputPrefixType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f34919a = r0
                com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.TINK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f34919a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.CRUNCHY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f34919a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.LEGACY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f34919a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.RAW     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C6599vd.C6600a.<clinit>():void");
        }
    }

    static {
        Class<ay4> cls = ay4.class;
        Class<by4> cls2 = by4.class;
        e70 d = r67.m50957d("type.googleapis.com/google.crypto.tink.AesCmacKey");
        f34914a = d;
        f34915b = xl4.m54428a(new C6434rd(), C6345pd.class, cls2);
        f34916c = wl4.m53969a(new C6477sd(), d, cls2);
        f34917d = za3.m55040a(new C6523td(), C6241md.class, cls);
        f34918e = wa3.m53770a(new C6565ud(), d, cls);
    }

    /* renamed from: b */
    public static C6241md m53350b(ay4 ay4, ur5 ur5) throws GeneralSecurityException {
        if (ay4.mo29386f().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            try {
                C6214ld K = C6214ld.m47763K(ay4.mo29387g(), C4734l.m38174b());
                if (K.mo45414I() == 0) {
                    return C6241md.m48214d(m53351c(K.mo45413H(), ay4.mo29385e()), tr5.m52421a(K.mo45412G().toByteArray(), ur5.m52983b(ur5)), ay4.mo29383c());
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (InvalidProtocolBufferException | IllegalArgumentException unused) {
                throw new GeneralSecurityException("Parsing AesCmacKey failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacParameters.parseParameters");
        }
    }

    /* renamed from: c */
    public static C6345pd m53351c(C6403qd qdVar, OutputPrefixType outputPrefixType) throws GeneralSecurityException {
        return C6345pd.m49860a(qdVar.mo47063F(), m53354f(outputPrefixType));
    }

    /* renamed from: d */
    public static void m53352d() throws GeneralSecurityException {
        m53353e(q04.m50211a());
    }

    /* renamed from: e */
    public static void m53353e(q04 q04) throws GeneralSecurityException {
        q04.mo46933g(f34915b);
        q04.mo46932f(f34916c);
        q04.mo46931e(f34917d);
        q04.mo46930d(f34918e);
    }

    /* renamed from: f */
    public static C6345pd.C6346a m53354f(OutputPrefixType outputPrefixType) throws GeneralSecurityException {
        int i = C6600a.f34919a[outputPrefixType.ordinal()];
        if (i == 1) {
            return C6345pd.C6346a.f32657b;
        }
        if (i == 2) {
            return C6345pd.C6346a.f32658c;
        }
        if (i == 3) {
            return C6345pd.C6346a.f32659d;
        }
        if (i == 4) {
            return C6345pd.C6346a.f32660e;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + outputPrefixType.getNumber());
    }
}
