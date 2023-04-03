package p000;

import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;

@Immutable
/* renamed from: dg3 */
/* compiled from: LegacyProtoKey */
public final class dg3 extends aa3 {

    /* renamed from: a */
    public final ay4 f28184a;

    /* renamed from: dg3$a */
    /* compiled from: LegacyProtoKey */
    public static /* synthetic */ class C5736a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f28185a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f28186b;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|5|6|7|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|5|6|7|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0038 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0043 */
        static {
            /*
                com.google.crypto.tink.proto.KeyData$KeyMaterialType[] r0 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f28186b = r0
                r1 = 1
                com.google.crypto.tink.proto.KeyData$KeyMaterialType r2 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.SYMMETRIC     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f28186b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.crypto.tink.proto.KeyData$KeyMaterialType r3 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.ASYMMETRIC_PRIVATE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                com.google.crypto.tink.proto.OutputPrefixType[] r2 = com.google.crypto.tink.proto.OutputPrefixType.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f28185a = r2
                com.google.crypto.tink.proto.OutputPrefixType r3 = com.google.crypto.tink.proto.OutputPrefixType.TINK     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r1 = f28185a     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.google.crypto.tink.proto.OutputPrefixType r2 = com.google.crypto.tink.proto.OutputPrefixType.LEGACY     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r0 = f28185a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.RAW     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f28185a     // Catch:{ NoSuchFieldError -> 0x004e }
                com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.CRUNCHY     // Catch:{ NoSuchFieldError -> 0x004e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.dg3.C5736a.<clinit>():void");
        }
    }

    @Immutable
    /* renamed from: dg3$b */
    /* compiled from: LegacyProtoKey */
    public static class C5737b extends tl4 {

        /* renamed from: a */
        public final String f28187a;

        /* renamed from: b */
        public final OutputPrefixType f28188b;

        public /* synthetic */ C5737b(String str, OutputPrefixType outputPrefixType, C5736a aVar) {
            this(str, outputPrefixType);
        }

        /* renamed from: a */
        public static String m43481a(OutputPrefixType outputPrefixType) {
            int i = C5736a.f28185a[outputPrefixType.ordinal()];
            if (i == 1) {
                return "TINK";
            }
            if (i == 2) {
                return "LEGACY";
            }
            if (i == 3) {
                return "RAW";
            }
            if (i != 4) {
                return "UNKNOWN";
            }
            return "CRUNCHY";
        }

        public String toString() {
            return String.format("(typeUrl=%s, outputPrefixType=%s)", new Object[]{this.f28187a, m43481a(this.f28188b)});
        }

        public C5737b(String str, OutputPrefixType outputPrefixType) {
            this.f28187a = str;
            this.f28188b = outputPrefixType;
        }
    }

    public dg3(ay4 ay4, ur5 ur5) throws GeneralSecurityException {
        m43479b(ay4, ur5);
        this.f28184a = ay4;
    }

    /* renamed from: b */
    public static void m43479b(ay4 ay4, ur5 ur5) throws GeneralSecurityException {
        int i = C5736a.f28186b[ay4.mo29384d().ordinal()];
        if (i == 1 || i == 2) {
            ur5.m52983b(ur5);
        }
    }

    /* renamed from: a */
    public tl4 mo28899a() {
        return new C5737b(this.f28184a.mo29386f(), this.f28184a.mo29385e(), (C5736a) null);
    }
}
