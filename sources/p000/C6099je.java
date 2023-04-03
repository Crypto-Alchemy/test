package p000;

import com.google.crypto.tink.config.internal.TinkFipsUtil;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: je */
/* compiled from: AesGcmJce */
public final class C6099je implements C5954id {

    /* renamed from: b */
    public static final TinkFipsUtil.AlgorithmFipsCompatibility f30479b = TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;

    /* renamed from: a */
    public final hv2 f30480a;

    public C6099je(byte[] bArr) throws GeneralSecurityException {
        if (f30479b.isCompatible()) {
            this.f30480a = new hv2(bArr, true);
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }

    /* renamed from: a */
    public byte[] mo29526a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return this.f30480a.mo43402b(y65.m54637c(12), bArr, bArr2);
    }

    /* renamed from: b */
    public byte[] mo29527b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return this.f30480a.mo43401a(Arrays.copyOf(bArr, 12), bArr, bArr2);
    }
}
