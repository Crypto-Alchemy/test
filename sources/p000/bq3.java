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
import org.bouncycastle.pqc.jcajce.provider.mceliece.BCMcEliecePrivateKey;
import org.bouncycastle.pqc.jcajce.provider.mceliece.BCMcEliecePublicKey;

/* renamed from: bq3 */
public class bq3 extends KeyFactorySpi implements C9370tr {
    /* renamed from: a */
    public PublicKey mo50693a(ic6 ic6) throws IOException {
        gq3 s = gq3.m58205s(ic6.mo52432u());
        return new BCMcEliecePublicKey(new hq3(s.mo51970t(), s.mo51971u(), s.mo51969r()));
    }

    /* renamed from: b */
    public PrivateKey mo50694b(lv4 lv4) throws IOException {
        eq3 t = eq3.m57435t(lv4.mo55983A().mo50158n());
        return new BCMcEliecePrivateKey(new fq3(t.mo51523w(), t.mo51522u(), t.mo51520r(), t.mo51521s(), t.mo51517A(), t.mo51518B(), t.mo51519D()));
    }

    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof PKCS8EncodedKeySpec) {
            try {
                lv4 s = lv4.m64012s(C9326t4.m72150D(((PKCS8EncodedKeySpec) keySpec).getEncoded()));
                try {
                    if (bk4.f36880m.mo65963B(s.mo55985t().mo50159r())) {
                        eq3 t = eq3.m57435t(s.mo55983A());
                        return new BCMcEliecePrivateKey(new fq3(t.mo51523w(), t.mo51522u(), t.mo51520r(), t.mo51521s(), t.mo51517A(), t.mo51518B(), t.mo51519D()));
                    }
                    throw new InvalidKeySpecException("Unable to recognise OID in McEliece private key");
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
                    if (bk4.f36880m.mo65963B(s.mo52430r().mo50159r())) {
                        gq3 s2 = gq3.m58205s(s.mo52432u());
                        return new BCMcEliecePublicKey(new hq3(s2.mo51970t(), s2.mo51971u(), s2.mo51969r()));
                    }
                    throw new InvalidKeySpecException("Unable to recognise OID in McEliece public key");
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
