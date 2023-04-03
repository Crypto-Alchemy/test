package p000;

import com.google.crypto.tink.proto.C4663a;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* renamed from: iw0 */
/* compiled from: CryptoFormat */
public final class iw0 {

    /* renamed from: a */
    public static final byte[] f30139a = new byte[0];

    /* renamed from: iw0$a */
    /* compiled from: CryptoFormat */
    public static /* synthetic */ class C6010a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f30140a;

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
                f30140a = r0
                com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.LEGACY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f30140a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.CRUNCHY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f30140a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.TINK     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f30140a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.RAW     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.iw0.C6010a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static byte[] m46033a(C4663a.C4666c cVar) throws GeneralSecurityException {
        int i = C6010a.f30140a[cVar.mo35314J().ordinal()];
        if (i == 1 || i == 2) {
            return ByteBuffer.allocate(5).put((byte) 0).putInt(cVar.mo35313I()).array();
        }
        if (i == 3) {
            return ByteBuffer.allocate(5).put((byte) 1).putInt(cVar.mo35313I()).array();
        }
        if (i == 4) {
            return f30139a;
        }
        throw new GeneralSecurityException("unknown output prefix type");
    }
}
