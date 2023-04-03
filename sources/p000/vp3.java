package p000;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import org.bouncycastle.pqc.jcajce.provider.mceliece.BCMcElieceCCA2PrivateKey;
import org.bouncycastle.pqc.jcajce.provider.mceliece.BCMcElieceCCA2PublicKey;

/* renamed from: vp3 */
public class vp3 extends KeyFactorySpi implements C9370tr {
    /* renamed from: a */
    public PublicKey mo50693a(ic6 ic6) throws IOException {
        zp3 t = zp3.m75184t(ic6.mo52432u());
        return new BCMcElieceCCA2PublicKey(new aq3(t.mo67378u(), t.mo67379w(), t.mo67377s(), s77.m71891b(t.mo67376r()).mo50201d()));
    }

    /* renamed from: b */
    public PrivateKey mo50694b(lv4 lv4) throws IOException {
        xp3 u = xp3.m74054u(lv4.mo55983A().mo50158n());
        return new BCMcElieceCCA2PrivateKey(new yp3(u.mo66916A(), u.mo66921w(), u.mo66919s(), u.mo66920t(), u.mo66917B(), (String) null));
    }

    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof PKCS8EncodedKeySpec) {
            try {
                lv4 s = lv4.m64012s(C9326t4.m72150D(((PKCS8EncodedKeySpec) keySpec).getEncoded()));
                try {
                    if (bk4.f36881n.mo65963B(s.mo55985t().mo50159r())) {
                        xp3 u = xp3.m74054u(s.mo55983A());
                        return new BCMcElieceCCA2PrivateKey(new yp3(u.mo66916A(), u.mo66921w(), u.mo66919s(), u.mo66920t(), u.mo66917B(), s77.m71891b(u.mo66918r()).mo50201d()));
                    }
                    throw new InvalidKeySpecException("Unable to recognise OID in McEliece public key");
                } catch (IOException unused) {
                    throw new InvalidKeySpecException("Unable to decode PKCS8EncodedKeySpec.");
                }
            } catch (IOException e) {
                throw new InvalidKeySpecException("Unable to decode PKCS8EncodedKeySpec: " + e);
            }
        } else {
            throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
        }
    }

    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof X509EncodedKeySpec) {
            try {
                ic6 s = ic6.m58895s(C9326t4.m72150D(((X509EncodedKeySpec) keySpec).getEncoded()));
                try {
                    if (bk4.f36881n.mo65963B(s.mo52430r().mo50159r())) {
                        zp3 t = zp3.m75184t(s.mo52432u());
                        return new BCMcElieceCCA2PublicKey(new aq3(t.mo67378u(), t.mo67379w(), t.mo67377s(), s77.m71891b(t.mo67376r()).mo50201d()));
                    }
                    throw new InvalidKeySpecException("Unable to recognise OID in McEliece private key");
                } catch (IOException e) {
                    throw new InvalidKeySpecException("Unable to decode X509EncodedKeySpec: " + e.getMessage());
                }
            } catch (IOException e2) {
                throw new InvalidKeySpecException(e2.toString());
            }
        } else {
            throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
        }
    }

    public KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        return null;
    }

    public Key engineTranslateKey(Key key) throws InvalidKeyException {
        return null;
    }
}
