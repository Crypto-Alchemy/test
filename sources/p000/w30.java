package p000;

import java.security.Permission;
import java.security.spec.ECParameterSpec;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.jcajce.provider.config.ProviderConfigurationPermission;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* renamed from: w30 */
public class w30 implements my4 {

    /* renamed from: g */
    public static Permission f45422g = new ProviderConfigurationPermission(BouncyCastleProvider.PROVIDER_NAME, "threadLocalEcImplicitlyCa");

    /* renamed from: h */
    public static Permission f45423h = new ProviderConfigurationPermission(BouncyCastleProvider.PROVIDER_NAME, "ecImplicitlyCa");

    /* renamed from: i */
    public static Permission f45424i = new ProviderConfigurationPermission(BouncyCastleProvider.PROVIDER_NAME, "threadLocalDhDefaultParams");

    /* renamed from: j */
    public static Permission f45425j = new ProviderConfigurationPermission(BouncyCastleProvider.PROVIDER_NAME, "DhDefaultParams");

    /* renamed from: k */
    public static Permission f45426k = new ProviderConfigurationPermission(BouncyCastleProvider.PROVIDER_NAME, "acceptableEcCurves");

    /* renamed from: l */
    public static Permission f45427l = new ProviderConfigurationPermission(BouncyCastleProvider.PROVIDER_NAME, "additionalEcParameters");

    /* renamed from: a */
    public ThreadLocal f45428a = new ThreadLocal();

    /* renamed from: b */
    public ThreadLocal f45429b = new ThreadLocal();

    /* renamed from: c */
    public volatile mm1 f45430c;

    /* renamed from: d */
    public volatile Object f45431d;

    /* renamed from: e */
    public volatile Set f45432e = new HashSet();

    /* renamed from: f */
    public volatile Map f45433f = new HashMap();

    /* renamed from: a */
    public Map mo56334a() {
        return Collections.unmodifiableMap(this.f45433f);
    }

    /* renamed from: b */
    public mm1 mo56335b() {
        mm1 mm1 = (mm1) this.f45428a.get();
        return mm1 != null ? mm1 : this.f45430c;
    }

    /* renamed from: c */
    public Set mo56336c() {
        return Collections.unmodifiableSet(this.f45432e);
    }

    /* renamed from: d */
    public void mo66613d(String str, Object obj) {
        ThreadLocal threadLocal;
        SecurityManager securityManager = System.getSecurityManager();
        if (str.equals("threadLocalEcImplicitlyCa")) {
            if (securityManager != null) {
                securityManager.checkPermission(f45422g);
            }
            mm1 g = ((obj instanceof mm1) || obj == null) ? (mm1) obj : rl1.m71566g((ECParameterSpec) obj);
            if (g == null) {
                threadLocal = this.f45428a;
            } else {
                this.f45428a.set(g);
                return;
            }
        } else if (str.equals("ecImplicitlyCa")) {
            if (securityManager != null) {
                securityManager.checkPermission(f45423h);
            }
            if ((obj instanceof mm1) || obj == null) {
                this.f45430c = (mm1) obj;
                return;
            } else {
                this.f45430c = rl1.m71566g((ECParameterSpec) obj);
                return;
            }
        } else if (str.equals("threadLocalDhDefaultParams")) {
            if (securityManager != null) {
                securityManager.checkPermission(f45424i);
            }
            if ((obj instanceof DHParameterSpec) || (obj instanceof DHParameterSpec[]) || obj == null) {
                threadLocal = this.f45429b;
                if (obj != null) {
                    threadLocal.set(obj);
                    return;
                }
            } else {
                throw new IllegalArgumentException("not a valid DHParameterSpec");
            }
        } else if (str.equals("DhDefaultParams")) {
            if (securityManager != null) {
                securityManager.checkPermission(f45425j);
            }
            if ((obj instanceof DHParameterSpec) || (obj instanceof DHParameterSpec[]) || obj == null) {
                this.f45431d = obj;
                return;
            }
            throw new IllegalArgumentException("not a valid DHParameterSpec or DHParameterSpec[]");
        } else if (str.equals("acceptableEcCurves")) {
            if (securityManager != null) {
                securityManager.checkPermission(f45426k);
            }
            this.f45432e = (Set) obj;
            return;
        } else if (str.equals("additionalEcParameters")) {
            if (securityManager != null) {
                securityManager.checkPermission(f45427l);
            }
            this.f45433f = (Map) obj;
            return;
        } else {
            return;
        }
        threadLocal.remove();
    }
}
