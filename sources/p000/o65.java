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
import org.bouncycastle.pqc.jcajce.provider.rainbow.BCRainbowPrivateKey;
import org.bouncycastle.pqc.jcajce.provider.rainbow.BCRainbowPublicKey;

/* renamed from: o65 */
public class o65 extends KeyFactorySpi implements C9370tr {
    /* renamed from: a */
    public PublicKey mo50693a(ic6 ic6) throws IOException {
        u65 w = u65.m72612w(ic6.mo52432u());
        return new BCRainbowPublicKey(w.mo66185u(), w.mo66182r(), w.mo66184t(), w.mo66183s());
    }

    /* renamed from: b */
    public PrivateKey mo50694b(lv4 lv4) throws IOException {
        r65 t = r65.m71455t(lv4.mo55983A());
        return new BCRainbowPrivateKey(t.mo65608u(), t.mo65606r(), t.mo65609w(), t.mo65607s(), t.mo65605B(), t.mo65604A());
    }

    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof t65) {
            return new BCRainbowPrivateKey((t65) keySpec);
        }
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
        if (keySpec instanceof w65) {
            return new BCRainbowPublicKey((w65) keySpec);
        }
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
        if (key instanceof BCRainbowPrivateKey) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(key.getEncoded());
            }
            if (t65.class.isAssignableFrom(cls)) {
                BCRainbowPrivateKey bCRainbowPrivateKey = (BCRainbowPrivateKey) key;
                return new t65(bCRainbowPrivateKey.getInvA1(), bCRainbowPrivateKey.getB1(), bCRainbowPrivateKey.getInvA2(), bCRainbowPrivateKey.getB2(), bCRainbowPrivateKey.getVi(), bCRainbowPrivateKey.getLayers());
            }
        } else if (!(key instanceof BCRainbowPublicKey)) {
            throw new InvalidKeySpecException("Unsupported key type: " + key.getClass() + ".");
        } else if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
            return new X509EncodedKeySpec(key.getEncoded());
        } else {
            if (w65.class.isAssignableFrom(cls)) {
                BCRainbowPublicKey bCRainbowPublicKey = (BCRainbowPublicKey) key;
                return new w65(bCRainbowPublicKey.getDocLength(), bCRainbowPublicKey.getCoeffQuadratic(), bCRainbowPublicKey.getCoeffSingular(), bCRainbowPublicKey.getCoeffScalar());
            }
        }
        throw new InvalidKeySpecException("Unknown key specification: " + cls + ".");
    }

    public final Key engineTranslateKey(Key key) throws InvalidKeyException {
        if ((key instanceof BCRainbowPrivateKey) || (key instanceof BCRainbowPublicKey)) {
            return key;
        }
        throw new InvalidKeyException("Unsupported key type");
    }
}
