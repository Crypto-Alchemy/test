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
import org.bouncycastle.pqc.jcajce.provider.qtesla.BCqTESLAPrivateKey;
import org.bouncycastle.pqc.jcajce.provider.qtesla.BCqTESLAPublicKey;

/* renamed from: gz4 */
public class gz4 extends KeyFactorySpi implements C9370tr {
    /* renamed from: a */
    public PublicKey mo50693a(ic6 ic6) throws IOException {
        return new BCqTESLAPublicKey(ic6);
    }

    /* renamed from: b */
    public PrivateKey mo50694b(lv4 lv4) throws IOException {
        return new BCqTESLAPrivateKey(lv4);
    }

    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof PKCS8EncodedKeySpec) {
            try {
                return mo50694b(lv4.m64012s(C9326t4.m72150D(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
            } catch (Exception e) {
                throw new InvalidKeySpecException(e.toString());
            }
        } else {
            throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
        }
    }

    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof X509EncodedKeySpec) {
            try {
                return mo50693a(ic6.m58895s(((X509EncodedKeySpec) keySpec).getEncoded()));
            } catch (Exception e) {
                throw new InvalidKeySpecException(e.toString());
            }
        } else {
            throw new InvalidKeySpecException("Unknown key specification: " + keySpec + ".");
        }
    }

    public final KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if (key instanceof BCqTESLAPrivateKey) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(key.getEncoded());
            }
        } else if (!(key instanceof BCqTESLAPublicKey)) {
            throw new InvalidKeySpecException("Unsupported key type: " + key.getClass() + ".");
        } else if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
            return new X509EncodedKeySpec(key.getEncoded());
        }
        throw new InvalidKeySpecException("Unknown key specification: " + cls + ".");
    }

    public final Key engineTranslateKey(Key key) throws InvalidKeyException {
        if ((key instanceof BCqTESLAPrivateKey) || (key instanceof BCqTESLAPublicKey)) {
            return key;
        }
        throw new InvalidKeyException("Unsupported key type");
    }
}
