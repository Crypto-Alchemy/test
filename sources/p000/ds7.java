package p000;

import com.google.android.play.core.internal.C4487bf;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: ds7 */
public final class ds7 implements qr7 {

    /* renamed from: a */
    public final /* synthetic */ int f28290a = 2;

    public ds7(char[] cArr) {
    }

    public ds7(float[] fArr) {
    }

    public ds7(int[] iArr) {
    }

    public ds7(short[] sArr) {
    }

    public ds7(boolean[] zArr) {
    }

    public ds7(byte[][] bArr) {
    }

    /* renamed from: c */
    public static void m43638c(ClassLoader classLoader, Set<File> set) {
        if (!set.isEmpty()) {
            HashSet hashSet = new HashSet();
            for (File next : set) {
                String valueOf = String.valueOf(next.getParentFile().getAbsolutePath());
                if (valueOf.length() != 0) {
                    "Adding native library parent directory: ".concat(valueOf);
                }
                hashSet.add(next.getParentFile());
            }
            ls7 e = ns7.m48998e(m43640e(classLoader), "nativeLibraryDirectories", File.class);
            hashSet.removeAll(Arrays.asList((File[]) e.mo45513a()));
            synchronized (uv7.class) {
                int size = hashSet.size();
                StringBuilder sb = new StringBuilder(30);
                sb.append("Adding directories ");
                sb.append(size);
                e.mo45517e(hashSet);
            }
        }
    }

    /* renamed from: d */
    public static boolean m43639d(ClassLoader classLoader, File file, File file2, boolean z, vr7 vr7, String str, tr7 tr7) {
        ArrayList arrayList = new ArrayList();
        Object e = m43640e(classLoader);
        ls7 e2 = ns7.m48998e(e, "dexElements", Object.class);
        List<Object> asList = Arrays.asList((Object[]) e2.mo45513a());
        ArrayList arrayList2 = new ArrayList();
        for (Object d : asList) {
            arrayList2.add(ns7.m48997d(d, str, File.class).mo45513a());
        }
        if (arrayList2.contains(file2)) {
            return true;
        }
        if (z || tr7.mo43917a(e, file2, file)) {
            e2.mo45516d(Arrays.asList(vr7.mo42399a(e, new ArrayList(Collections.singleton(file2)), file, arrayList)));
            if (arrayList.isEmpty()) {
                return true;
            }
            C4487bf bfVar = new C4487bf("DexPathList.makeDexElement failed");
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                mt7.m48481a(bfVar, (IOException) arrayList.get(i));
            }
            ns7.m48998e(e, "dexElementsSuppressedExceptions", IOException.class).mo45516d(arrayList);
            throw bfVar;
        }
        String valueOf = String.valueOf(file2.getPath());
        if (valueOf.length() != 0) {
            "Should be optimized ".concat(valueOf);
        }
        return false;
    }

    /* renamed from: e */
    public static Object m43640e(ClassLoader classLoader) {
        return ns7.m48997d(classLoader, "pathList", Object.class).mo45513a();
    }

    /* renamed from: f */
    public static vr7 m43641f() {
        return new es7((byte[]) null);
    }

    /* renamed from: g */
    public static tr7 m43642g() {
        return new is7((byte[]) null);
    }

    /* renamed from: h */
    public static void m43643h(ClassLoader classLoader, Set<File> set, fs7 fs7) {
        Class<uv7> cls = uv7.class;
        if (!set.isEmpty()) {
            HashSet hashSet = new HashSet();
            for (File parentFile : set) {
                hashSet.add(parentFile.getParentFile());
            }
            Object e = m43640e(classLoader);
            ls7<List> d = ns7.m48997d(e, "nativeLibraryDirectories", List.class);
            synchronized (cls) {
                ArrayList arrayList = new ArrayList(d.mo45513a());
                hashSet.removeAll(arrayList);
                arrayList.addAll(hashSet);
                d.mo45514b(arrayList);
            }
            ArrayList arrayList2 = new ArrayList();
            Object[] a = fs7.mo42657a(e, new ArrayList(hashSet), arrayList2);
            if (!arrayList2.isEmpty()) {
                C4487bf bfVar = new C4487bf("Error in makePathElements");
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    mt7.m48481a(bfVar, (IOException) arrayList2.get(i));
                }
                throw bfVar;
            }
            synchronized (cls) {
                ns7.m48998e(e, "nativeLibraryPathElements", Object.class).mo45517e(Arrays.asList(a));
            }
        }
    }

    /* renamed from: i */
    public static vr7 m43644i() {
        return new es7();
    }

    /* renamed from: j */
    public static fs7 m43645j() {
        return new gs7((byte[]) null);
    }

    /* renamed from: k */
    public static boolean m43646k(ClassLoader classLoader, File file, File file2, boolean z) {
        return m43639d(classLoader, file, file2, z, m43644i(), "zip", m43642g());
    }

    /* renamed from: l */
    public static void m43647l(ClassLoader classLoader, Set<File> set) {
        m43643h(classLoader, set, new gs7());
    }

    /* renamed from: m */
    public static boolean m43648m(ClassLoader classLoader, File file, File file2, boolean z) {
        return m43639d(classLoader, file, file2, z, m43644i(), "path", new is7());
    }

    /* renamed from: a */
    public final boolean mo42042a(ClassLoader classLoader, File file, File file2, boolean z) {
        vr7 f;
        tr7 g;
        String str;
        switch (this.f28290a) {
            case 0:
            case 1:
                f = m43641f();
                g = m43642g();
                str = "zip";
                break;
            case 2:
                return m43646k(classLoader, file, file2, z);
            case 3:
                return m43646k(classLoader, file, file2, z);
            case 4:
                return m43646k(classLoader, file, file2, z);
            case 5:
                return m43648m(classLoader, file, file2, z);
            case 6:
                return m43648m(classLoader, file, file2, z);
            default:
                f = m43644i();
                g = new is7((char[]) null);
                str = "path";
                break;
        }
        return m43639d(classLoader, file, file2, z, f, str, g);
    }

    /* renamed from: b */
    public final void mo42043b(ClassLoader classLoader, Set set) {
        switch (this.f28290a) {
            case 0:
                m43638c(classLoader, set);
                return;
            case 1:
                m43638c(classLoader, set);
                return;
            case 2:
            case 3:
            case 4:
                m43643h(classLoader, set, m43645j());
                return;
            case 5:
                m43647l(classLoader, set);
                return;
            case 6:
                m43647l(classLoader, set);
                return;
            default:
                m43647l(classLoader, set);
                return;
        }
    }
}
