package org.bouncycastle.jce.provider;

import java.io.IOException;
import java.security.AccessController;
import java.security.PrivateKey;
import java.security.PrivilegedAction;
import java.security.Provider;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;

public final class BouncyCastleProvider extends Provider implements po0 {

    /* renamed from: A */
    public static final String[] f43766A = {PROVIDER_NAME, "BCFKS", "PKCS12"};

    /* renamed from: B */
    public static final String[] f43767B = {"DRBG"};
    public static final my4 CONFIGURATION = new w30();
    public static final String PROVIDER_NAME = "BC";

    /* renamed from: a */
    public static String f43768a = "BouncyCastle Security Provider v1.70";

    /* renamed from: d */
    public static final Map f43769d = new HashMap();

    /* renamed from: e */
    public static final Class f43770e = vf0.m73205a(BouncyCastleProvider.class, "java.security.cert.PKIXRevocationChecker");

    /* renamed from: g */
    public static final String[] f43771g = {"PBEPBKDF1", "PBEPBKDF2", "PBEPKCS12", "TLSKDF", "SCRYPT"};

    /* renamed from: k */
    public static final String[] f43772k = {"SipHash", "SipHash128", "Poly1305"};

    /* renamed from: r */
    public static final String[] f43773r = {"AES", "ARC4", "ARIA", "Blowfish", "Camellia", "CAST5", "CAST6", "ChaCha", "DES", "DESede", "GOST28147", "Grainv1", "Grain128", "HC128", "HC256", "IDEA", "Noekeon", "RC2", "RC5", "RC6", "Rijndael", "Salsa20", "SEED", "Serpent", "Shacal2", "Skipjack", "SM4", "TEA", "Twofish", "Threefish", "VMPC", "VMPCKSA3", "XTEA", "XSalsa20", "OpenSSLPBKDF", "DSTU7624", "GOST3412_2015", "Zuc"};

    /* renamed from: s */
    public static final String[] f43774s = {"X509", "IES", "COMPOSITE"};

    /* renamed from: x */
    public static final String[] f43775x = {"DSA", "DH", "EC", "RSA", "GOST", "ECGOST", "ElGamal", "DSTU4145", "GM", "EdEC"};

    /* renamed from: y */
    public static final String[] f43776y = {"GOST3411", "Keccak", "MD2", "MD4", "MD5", "SHA1", "RIPEMD128", "RIPEMD160", "RIPEMD256", "RIPEMD320", "SHA224", "SHA256", "SHA384", "SHA512", "SHA3", "Skein", "SM3", "Tiger", "Whirlpool", "Blake2b", "Blake2s", "DSTU7564", "Haraka"};

    /* renamed from: org.bouncycastle.jce.provider.BouncyCastleProvider$a */
    public class C9037a implements PrivilegedAction {
        public C9037a() {
        }

        public Object run() {
            BouncyCastleProvider.this.mo64577f();
            return null;
        }
    }

    public BouncyCastleProvider() {
        super(PROVIDER_NAME, 1.7d, f43768a);
        AccessController.doPrivileged(new C9037a());
    }

    /* renamed from: a */
    public static C9370tr m70484a(C9156p4 p4Var) {
        C9370tr trVar;
        Map map = f43769d;
        synchronized (map) {
            trVar = (C9370tr) map.get(p4Var);
        }
        return trVar;
    }

    public static PrivateKey getPrivateKey(lv4 lv4) throws IOException {
        C9370tr a = m70484a(lv4.mo55985t().mo50159r());
        if (a == null) {
            return null;
        }
        return a.mo50694b(lv4);
    }

    public static PublicKey getPublicKey(ic6 ic6) throws IOException {
        C9370tr a = m70484a(ic6.mo52430r().mo50159r());
        if (a == null) {
            return null;
        }
        return a.mo50693a(ic6);
    }

    public void addAlgorithm(String str, String str2) {
        if (!containsKey(str)) {
            put(str, str2);
            return;
        }
        throw new IllegalStateException("duplicate provider key (" + str + ") found");
    }

    public void addAlgorithm(String str, C9156p4 p4Var, String str2) {
        addAlgorithm(str + "." + p4Var, str2);
        addAlgorithm(str + ".OID." + p4Var, str2);
    }

    public void addAttributes(String str, Map<String, String> map) {
        for (String next : map.keySet()) {
            String str2 = str + " " + next;
            if (!containsKey(str2)) {
                put(str2, map.get(next));
            } else {
                throw new IllegalStateException("duplicate provider attribute key (" + str2 + ") found");
            }
        }
    }

    public void addKeyInfoConverter(C9156p4 p4Var, C9370tr trVar) {
        Map map = f43769d;
        synchronized (map) {
            map.put(p4Var, trVar);
        }
    }

    /* renamed from: b */
    public final void mo64575b(String str, String[] strArr) {
        for (int i = 0; i != strArr.length; i++) {
            Class a = vf0.m73205a(BouncyCastleProvider.class, str + strArr[i] + "$Mappings");
            if (a != null) {
                try {
                    ((C6860bf) a.newInstance()).mo50565a(this);
                } catch (Exception e) {
                    throw new InternalError("cannot create instance of " + str + strArr[i] + "$Mappings : " + e);
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo64576d() {
        addKeyInfoConverter(bk4.f36885r, new r66());
        addKeyInfoConverter(bk4.f36889v, new j24());
        addKeyInfoConverter(bk4.f36890w, new no7());
        addKeyInfoConverter(py2.f44128a, new no7());
        addKeyInfoConverter(bk4.f36848F, new qo7());
        addKeyInfoConverter(py2.f44129b, new qo7());
        addKeyInfoConverter(bk4.f36880m, new bq3());
        addKeyInfoConverter(bk4.f36881n, new vp3());
        addKeyInfoConverter(bk4.f36868a, new o65());
        addKeyInfoConverter(bk4.f36866X, new gz4());
        addKeyInfoConverter(bk4.f36867Y, new gz4());
        addKeyInfoConverter(wj4.f45596I0, new nd3());
    }

    /* renamed from: f */
    public final void mo64577f() {
        String str;
        String str2;
        mo64575b("org.bouncycastle.jcajce.provider.digest.", f43776y);
        mo64575b("org.bouncycastle.jcajce.provider.symmetric.", f43771g);
        mo64575b("org.bouncycastle.jcajce.provider.symmetric.", f43772k);
        mo64575b("org.bouncycastle.jcajce.provider.symmetric.", f43773r);
        mo64575b("org.bouncycastle.jcajce.provider.asymmetric.", f43774s);
        mo64575b("org.bouncycastle.jcajce.provider.asymmetric.", f43775x);
        mo64575b("org.bouncycastle.jcajce.provider.keystore.", f43766A);
        mo64575b("org.bouncycastle.jcajce.provider.drbg.", f43767B);
        mo64576d();
        put("X509Store.CERTIFICATE/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCertCollection");
        put("X509Store.ATTRIBUTECERTIFICATE/COLLECTION", "org.bouncycastle.jce.provider.X509StoreAttrCertCollection");
        put("X509Store.CRL/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCRLCollection");
        put("X509Store.CERTIFICATEPAIR/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCertPairCollection");
        put("X509Store.CERTIFICATE/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCerts");
        put("X509Store.CRL/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCRLs");
        put("X509Store.ATTRIBUTECERTIFICATE/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPAttrCerts");
        put("X509Store.CERTIFICATEPAIR/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCertPairs");
        put("X509StreamParser.CERTIFICATE", "org.bouncycastle.jce.provider.X509CertParser");
        put("X509StreamParser.ATTRIBUTECERTIFICATE", "org.bouncycastle.jce.provider.X509AttrCertParser");
        put("X509StreamParser.CRL", "org.bouncycastle.jce.provider.X509CRLParser");
        put("X509StreamParser.CERTIFICATEPAIR", "org.bouncycastle.jce.provider.X509CertPairParser");
        put("Cipher.BROKENPBEWITHMD5ANDDES", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithMD5AndDES");
        put("Cipher.BROKENPBEWITHSHA1ANDDES", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithSHA1AndDES");
        put("Cipher.OLDPBEWITHSHAANDTWOFISH-CBC", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$OldPBEWithSHAAndTwofish");
        Class cls = f43770e;
        put("CertPathValidator.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathValidatorSpi");
        put("CertPathBuilder.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathBuilderSpi");
        if (cls != null) {
            str2 = "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi_8";
            put("CertPathValidator.RFC3280", str2);
            str = "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi_8";
        } else {
            str2 = "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi";
            put("CertPathValidator.RFC3280", str2);
            str = "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi";
        }
        put("CertPathBuilder.RFC3280", str);
        put("CertPathValidator.PKIX", str2);
        put("CertPathBuilder.PKIX", str);
        put("CertStore.Collection", "org.bouncycastle.jce.provider.CertStoreCollectionSpi");
        put("CertStore.LDAP", "org.bouncycastle.jce.provider.X509LDAPCertStoreSpi");
        put("CertStore.Multi", "org.bouncycastle.jce.provider.MultiCertStoreSpi");
        put("Alg.Alias.CertStore.X509LDAP", "LDAP");
    }

    public C9370tr getKeyInfoConverter(C9156p4 p4Var) {
        return (C9370tr) f43769d.get(p4Var);
    }

    public boolean hasAlgorithm(String str, String str2) {
        if (!containsKey(str + "." + str2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Alg.Alias.");
            sb.append(str);
            sb.append(".");
            sb.append(str2);
            return containsKey(sb.toString());
        }
    }

    public void setParameter(String str, Object obj) {
        my4 my4 = CONFIGURATION;
        synchronized (my4) {
            ((w30) my4).mo66613d(str, obj);
        }
    }
}
