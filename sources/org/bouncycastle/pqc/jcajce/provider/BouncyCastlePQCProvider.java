package org.bouncycastle.pqc.jcajce.provider;

import java.io.IOException;
import java.security.AccessController;
import java.security.PrivateKey;
import java.security.PrivilegedAction;
import java.security.Provider;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;

public class BouncyCastlePQCProvider extends Provider implements po0 {
    public static final my4 CONFIGURATION = null;
    public static String PROVIDER_NAME = "BCPQC";

    /* renamed from: a */
    public static String f43848a = "BouncyCastle Post-Quantum Security Provider v1.70";

    /* renamed from: d */
    public static final Map f43849d = new HashMap();

    /* renamed from: e */
    public static final String[] f43850e = {"Rainbow", "McEliece", "SPHINCS", "LMS", "NH", "XMSS", "QTESLA"};

    /* renamed from: org.bouncycastle.pqc.jcajce.provider.BouncyCastlePQCProvider$a */
    public class C9056a implements PrivilegedAction {
        public C9056a() {
        }

        public Object run() {
            BouncyCastlePQCProvider.this.mo64698d();
            return null;
        }
    }

    /* renamed from: org.bouncycastle.pqc.jcajce.provider.BouncyCastlePQCProvider$b */
    public static class C9057b implements PrivilegedAction {

        /* renamed from: a */
        public final /* synthetic */ String f43852a;

        public C9057b(String str) {
            this.f43852a = str;
        }

        public Object run() {
            try {
                return Class.forName(this.f43852a);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public BouncyCastlePQCProvider() {
        super(PROVIDER_NAME, 1.7d, f43848a);
        AccessController.doPrivileged(new C9056a());
    }

    /* renamed from: a */
    public static C9370tr m70586a(C9156p4 p4Var) {
        C9370tr trVar;
        Map map = f43849d;
        synchronized (map) {
            trVar = (C9370tr) map.get(p4Var);
        }
        return trVar;
    }

    public static PrivateKey getPrivateKey(lv4 lv4) throws IOException {
        C9370tr a = m70586a(lv4.mo55985t().mo50159r());
        if (a == null) {
            return null;
        }
        return a.mo50694b(lv4);
    }

    public static PublicKey getPublicKey(ic6 ic6) throws IOException {
        C9370tr a = m70586a(ic6.mo52430r().mo50159r());
        if (a == null) {
            return null;
        }
        return a.mo50693a(ic6);
    }

    public static Class loadClass(Class cls, String str) {
        try {
            ClassLoader classLoader = cls.getClassLoader();
            return classLoader != null ? classLoader.loadClass(str) : (Class) AccessController.doPrivileged(new C9057b(str));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public void addAlgorithm(String str, String str2) {
        if (!containsKey(str)) {
            put(str, str2);
            return;
        }
        throw new IllegalStateException("duplicate provider key (" + str + ") found");
    }

    public void addAlgorithm(String str, C9156p4 p4Var, String str2) {
        if (containsKey(str + "." + str2)) {
            addAlgorithm(str + "." + p4Var, str2);
            addAlgorithm(str + ".OID." + p4Var, str2);
            return;
        }
        throw new IllegalStateException("primary key (" + str + "." + str2 + ") not found");
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
        Map map = f43849d;
        synchronized (map) {
            map.put(p4Var, trVar);
        }
    }

    /* renamed from: b */
    public final void mo64697b(String str, String[] strArr) {
        for (int i = 0; i != strArr.length; i++) {
            Class loadClass = loadClass(BouncyCastlePQCProvider.class, str + strArr[i] + "$Mappings");
            if (loadClass != null) {
                try {
                    ((C6860bf) loadClass.newInstance()).mo50565a(this);
                } catch (Exception e) {
                    throw new InternalError("cannot create instance of " + str + strArr[i] + "$Mappings : " + e);
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo64698d() {
        mo64697b("org.bouncycastle.pqc.jcajce.provider.", f43850e);
    }

    public C9370tr getKeyInfoConverter(C9156p4 p4Var) {
        return (C9370tr) f43849d.get(p4Var);
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
        synchronized (CONFIGURATION) {
        }
    }
}
