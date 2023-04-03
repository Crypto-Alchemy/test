package p000;

import java.security.AccessController;
import java.security.PrivilegedAction;

/* renamed from: vf0 */
public class vf0 {

    /* renamed from: vf0$a */
    public static class C9451a implements PrivilegedAction {

        /* renamed from: a */
        public final /* synthetic */ String f45282a;

        public C9451a(String str) {
            this.f45282a = str;
        }

        public Object run() {
            try {
                return Class.forName(this.f45282a);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: a */
    public static Class m73205a(Class cls, String str) {
        try {
            ClassLoader classLoader = cls.getClassLoader();
            return classLoader != null ? classLoader.loadClass(str) : (Class) AccessController.doPrivileged(new C9451a(str));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
