package com.google.crypto.tink;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.errorprone.annotations.Immutable;

@Immutable
public final class KeyTemplate {

    /* renamed from: a */
    public final cb3 f25025a;

    public enum OutputPrefixType {
        TINK,
        LEGACY,
        RAW,
        CRUNCHY
    }

    /* renamed from: com.google.crypto.tink.KeyTemplate$a */
    public static /* synthetic */ class C4639a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f25027a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f25028b;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|(3:23|24|26)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(21:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        static {
            /*
                com.google.crypto.tink.KeyTemplate$OutputPrefixType[] r0 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f25028b = r0
                r1 = 1
                com.google.crypto.tink.KeyTemplate$OutputPrefixType r2 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.TINK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f25028b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.crypto.tink.KeyTemplate$OutputPrefixType r3 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.LEGACY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f25028b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.crypto.tink.KeyTemplate$OutputPrefixType r4 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.RAW     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f25028b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.crypto.tink.KeyTemplate$OutputPrefixType r5 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.CRUNCHY     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                com.google.crypto.tink.proto.OutputPrefixType[] r4 = com.google.crypto.tink.proto.OutputPrefixType.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f25027a = r4
                com.google.crypto.tink.proto.OutputPrefixType r5 = com.google.crypto.tink.proto.OutputPrefixType.TINK     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = f25027a     // Catch:{ NoSuchFieldError -> 0x004e }
                com.google.crypto.tink.proto.OutputPrefixType r4 = com.google.crypto.tink.proto.OutputPrefixType.LEGACY     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = f25027a     // Catch:{ NoSuchFieldError -> 0x0058 }
                com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.RAW     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = f25027a     // Catch:{ NoSuchFieldError -> 0x0062 }
                com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.CRUNCHY     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.KeyTemplate.C4639a.<clinit>():void");
        }
    }

    public KeyTemplate(cb3 cb3) {
        this.f25025a = cb3;
    }

    /* renamed from: a */
    public static KeyTemplate m37053a(String str, byte[] bArr, OutputPrefixType outputPrefixType) {
        return new KeyTemplate((cb3) cb3.m32899K().mo29921u(str).mo29922v(ByteString.copyFrom(bArr)).mo29920t(m37054c(outputPrefixType)).build());
    }

    /* renamed from: c */
    public static com.google.crypto.tink.proto.OutputPrefixType m37054c(OutputPrefixType outputPrefixType) {
        int i = C4639a.f25028b[outputPrefixType.ordinal()];
        if (i == 1) {
            return com.google.crypto.tink.proto.OutputPrefixType.TINK;
        }
        if (i == 2) {
            return com.google.crypto.tink.proto.OutputPrefixType.LEGACY;
        }
        if (i == 3) {
            return com.google.crypto.tink.proto.OutputPrefixType.RAW;
        }
        if (i == 4) {
            return com.google.crypto.tink.proto.OutputPrefixType.CRUNCHY;
        }
        throw new IllegalArgumentException("Unknown output prefix type");
    }

    /* renamed from: b */
    public cb3 mo35243b() {
        return this.f25025a;
    }
}
