package p000;

import com.google.crypto.tink.config.internal.TinkFipsUtil;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import p000.iq1;

/* renamed from: cq1 */
/* compiled from: EngineFactory */
public final class cq1<T_WRAPPER extends iq1<T_ENGINE>, T_ENGINE> {

    /* renamed from: b */
    public static final Logger f27855b = Logger.getLogger(cq1.class.getName());

    /* renamed from: c */
    public static final List<Provider> f27856c;

    /* renamed from: d */
    public static final boolean f27857d;

    /* renamed from: e */
    public static final cq1<iq1.C5994a, Cipher> f27858e = new cq1<>(new iq1.C5994a());

    /* renamed from: f */
    public static final cq1<iq1.C5998e, Mac> f27859f = new cq1<>(new iq1.C5998e());

    /* renamed from: g */
    public static final cq1<iq1.C6000g, Signature> f27860g = new cq1<>(new iq1.C6000g());

    /* renamed from: h */
    public static final cq1<iq1.C5999f, MessageDigest> f27861h = new cq1<>(new iq1.C5999f());

    /* renamed from: i */
    public static final cq1<iq1.C5995b, KeyAgreement> f27862i = new cq1<>(new iq1.C5995b());

    /* renamed from: j */
    public static final cq1<iq1.C5997d, KeyPairGenerator> f27863j = new cq1<>(new iq1.C5997d());

    /* renamed from: k */
    public static final cq1<iq1.C5996c, KeyFactory> f27864k = new cq1<>(new iq1.C5996c());

    /* renamed from: a */
    public final T_WRAPPER f27865a;

    static {
        if (TinkFipsUtil.m37104c()) {
            f27856c = m43092b("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt");
            f27857d = false;
        } else if (hd6.m45163b()) {
            f27856c = m43092b("GmsCore_OpenSSL", "AndroidOpenSSL");
            f27857d = true;
        } else {
            f27856c = new ArrayList();
            f27857d = true;
        }
    }

    public cq1(T_WRAPPER t_wrapper) {
        this.f27865a = t_wrapper;
    }

    /* renamed from: b */
    public static List<Provider> m43092b(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            } else {
                f27855b.info(String.format("Provider %s not available", new Object[]{str}));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public T_ENGINE mo41605a(String str) throws GeneralSecurityException {
        Exception exc = null;
        for (Provider a : f27856c) {
            try {
                return this.f27865a.mo43886a(str, a);
            } catch (Exception e) {
                if (exc == null) {
                    exc = e;
                }
            }
        }
        if (f27857d) {
            return this.f27865a.mo43886a(str, (Provider) null);
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
