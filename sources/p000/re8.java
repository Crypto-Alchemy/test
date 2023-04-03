package p000;

import dalvik.system.PathClassLoader;

/* renamed from: re8 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class re8 extends PathClassLoader {
    public re8(String str, ClassLoader classLoader) {
        super(str, classLoader);
    }

    public final Class loadClass(String str, boolean z) throws ClassNotFoundException {
        if (!str.startsWith("java.") && !str.startsWith("android.")) {
            try {
                return findClass(str);
            } catch (ClassNotFoundException unused) {
            }
        }
        return super.loadClass(str, z);
    }
}
