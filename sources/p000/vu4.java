package p000;

import com.google.crypto.tink.config.internal.TinkFipsUtil;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;

@Immutable
/* renamed from: vu4 */
/* compiled from: PrfHmacJce */
public final class vu4 implements tu4 {

    /* renamed from: e */
    public static final TinkFipsUtil.AlgorithmFipsCompatibility f35162e = TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;

    /* renamed from: a */
    public final ThreadLocal<Mac> f35163a;

    /* renamed from: b */
    public final String f35164b;

    /* renamed from: c */
    public final Key f35165c;

    /* renamed from: d */
    public final int f35166d;

    /* renamed from: vu4$a */
    /* compiled from: PrfHmacJce */
    public class C6637a extends ThreadLocal<Mac> {
        public C6637a() {
        }

        /* renamed from: a */
        public Mac initialValue() {
            try {
                Mac a = cq1.f27859f.mo41605a(vu4.this.f35164b);
                a.init(vu4.this.f35165c);
                return a;
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public vu4(String str, Key key) throws GeneralSecurityException {
        C6637a aVar = new C6637a();
        this.f35163a = aVar;
        if (f35162e.isCompatible()) {
            this.f35164b = str;
            this.f35165c = key;
            if (key.getEncoded().length >= 16) {
                str.hashCode();
                char c = 65535;
                switch (str.hashCode()) {
                    case -1823053428:
                        if (str.equals("HMACSHA1")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 392315023:
                        if (str.equals("HMACSHA224")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 392315118:
                        if (str.equals("HMACSHA256")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 392316170:
                        if (str.equals("HMACSHA384")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 392317873:
                        if (str.equals("HMACSHA512")) {
                            c = 4;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        this.f35166d = 20;
                        break;
                    case 1:
                        this.f35166d = 28;
                        break;
                    case 2:
                        this.f35166d = 32;
                        break;
                    case 3:
                        this.f35166d = 48;
                        break;
                    case 4:
                        this.f35166d = 64;
                        break;
                    default:
                        throw new NoSuchAlgorithmException("unknown Hmac algorithm: " + str);
                }
                aVar.get();
                return;
            }
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }

    /* renamed from: a */
    public byte[] mo48232a(byte[] bArr, int i) throws GeneralSecurityException {
        if (i <= this.f35166d) {
            this.f35163a.get().update(bArr);
            return Arrays.copyOf(this.f35163a.get().doFinal(), i);
        }
        throw new InvalidAlgorithmParameterException("tag size too big");
    }
}
