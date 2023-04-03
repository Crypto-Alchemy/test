package p000;

import java.io.File;

/* renamed from: is7 */
public final class is7 implements tr7 {

    /* renamed from: a */
    public final /* synthetic */ int f30116a = 0;

    public is7() {
    }

    public is7(byte[] bArr) {
    }

    public is7(char[] cArr) {
    }

    /* renamed from: a */
    public final boolean mo43917a(Object obj, File file, File file2) {
        int i = this.f30116a;
        if (i == 0) {
            try {
                return !((Boolean) ns7.m48999f(Class.forName("dalvik.system.DexFile"), Boolean.class, String.class, file.getPath())).booleanValue();
            } catch (ClassNotFoundException unused) {
                return false;
            }
        } else if (i != 1) {
            return true;
        } else {
            return new File((String) ns7.m49000g(obj.getClass(), String.class, File.class, file, File.class, file2)).exists();
        }
    }
}
