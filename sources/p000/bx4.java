package p000;

import java.security.AccessControlException;
import java.security.PrivilegedAction;
import java.security.Security;

/* renamed from: bx4 */
public class bx4 {

    /* renamed from: a */
    public static final ThreadLocal f36980a = new ThreadLocal();

    /* renamed from: bx4$a */
    public static class C6878a implements PrivilegedAction {

        /* renamed from: a */
        public final /* synthetic */ String f36981a;

        public C6878a(String str) {
            this.f36981a = str;
        }

        public Object run() {
            return Security.getProperty(this.f36981a);
        }
    }

    /* renamed from: bx4$b */
    public static class C6879b implements PrivilegedAction {

        /* renamed from: a */
        public final /* synthetic */ String f36982a;

        public C6879b(String str) {
            this.f36982a = str;
        }

        public Object run() {
            return System.getProperty(this.f36982a);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        r0 = (java.lang.String) r0.get(r1);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m56191a(java.lang.String r1) {
        /*
            bx4$a r0 = new bx4$a
            r0.<init>(r1)
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x000e
            return r0
        L_0x000e:
            java.lang.ThreadLocal r0 = f36980a
            java.lang.Object r0 = r0.get()
            java.util.Map r0 = (java.util.Map) r0
            if (r0 == 0) goto L_0x0021
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x0021
            return r0
        L_0x0021:
            bx4$b r0 = new bx4$b
            r0.<init>(r1)
            java.lang.Object r1 = java.security.AccessController.doPrivileged(r0)
            java.lang.String r1 = (java.lang.String) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.bx4.m56191a(java.lang.String):java.lang.String");
    }

    /* renamed from: b */
    public static boolean m56192b(String str) {
        try {
            return m56193c(m56191a(str));
        } catch (AccessControlException unused) {
            return false;
        }
    }

    /* renamed from: c */
    public static boolean m56193c(String str) {
        if (str == null || str.length() != 4) {
            return false;
        }
        if (str.charAt(0) != 't' && str.charAt(0) != 'T') {
            return false;
        }
        if (str.charAt(1) != 'r' && str.charAt(1) != 'R') {
            return false;
        }
        if (str.charAt(2) == 'u' || str.charAt(2) == 'U') {
            return str.charAt(3) == 'e' || str.charAt(3) == 'E';
        }
        return false;
    }
}
