package p000;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.text.StringsKt__StringsKt;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005J1\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J3\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¨\u0006\u001a"}, mo44877d2 = {"Ldz1;", "", "", "Lwm3;", "c", "()Ljava/util/List;", "S", "Ljava/lang/Class;", "service", "Ljava/lang/ClassLoader;", "loader", "d", "(Ljava/lang/Class;Ljava/lang/ClassLoader;)Ljava/util/List;", "b", "", "name", "a", "(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/Class;)Ljava/lang/Object;", "Ljava/net/URL;", "url", "e", "Ljava/io/BufferedReader;", "r", "f", "<init>", "()V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: dz1 */
/* compiled from: FastServiceLoader.kt */
public final class dz1 {

    /* renamed from: a */
    public static final dz1 f37433a = new dz1();

    /* renamed from: a */
    public final <S> S mo51335a(String str, ClassLoader classLoader, Class<S> cls) {
        Class<?> cls2 = Class.forName(str, false, classLoader);
        if (cls.isAssignableFrom(cls2)) {
            return cls.cast(cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        }
        throw new IllegalArgumentException(("Expected service of class " + cls + ", but found " + cls2).toString());
    }

    /* renamed from: b */
    public final <S> List<S> mo51336b(Class<S> cls, ClassLoader classLoader) {
        try {
            return mo51338d(cls, classLoader);
        } catch (Throwable unused) {
            return CollectionsKt___CollectionsKt.m47311K0(ServiceLoader.load(cls, classLoader));
        }
    }

    /* renamed from: c */
    public final List<wm3> mo51337c() {
        wm3 wm3;
        Class<wm3> cls = wm3.class;
        if (!ez1.m57500a()) {
            return mo51336b(cls, cls.getClassLoader());
        }
        try {
            ArrayList arrayList = new ArrayList(2);
            wm3 wm32 = null;
            try {
                wm3 = cls.cast(Class.forName("gi", true, cls.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused) {
                wm3 = null;
            }
            if (wm3 != null) {
                arrayList.add(wm3);
            }
            try {
                wm32 = cls.cast(Class.forName("kotlinx.coroutines.test.internal.TestMainDispatcherFactory", true, cls.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused2) {
            }
            if (wm32 == null) {
                return arrayList;
            }
            arrayList.add(wm32);
            return arrayList;
        } catch (Throwable unused3) {
            return mo51336b(cls, cls.getClassLoader());
        }
    }

    /* renamed from: d */
    public final <S> List<S> mo51338d(Class<S> cls, ClassLoader classLoader) {
        ArrayList<T> list = Collections.list(classLoader.getResources("META-INF/services/" + cls.getName()));
        vx2.m53590f(list, "list(this)");
        ArrayList arrayList = new ArrayList();
        for (T e : list) {
            hk0.m45275z(arrayList, f37433a.mo51339e(e));
        }
        Set<String> O0 = CollectionsKt___CollectionsKt.m47315O0(arrayList);
        if (!O0.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(dk0.m43495u(O0, 10));
            for (String a : O0) {
                arrayList2.add(f37433a.mo51335a(a, classLoader, cls));
            }
            return arrayList2;
        }
        throw new IllegalArgumentException("No providers were loaded with FastServiceLoader".toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004c, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        p000.lh0.m47807a(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0050, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0053, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0057, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0058, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0059, code lost:
        p000.ru1.m51326a(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005c, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0077, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0078, code lost:
        p000.lh0.m47807a(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x007b, code lost:
        throw r1;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<java.lang.String> mo51339e(java.net.URL r6) {
        /*
            r5 = this;
            java.lang.String r0 = r6.toString()
            java.lang.String r1 = "jar"
            r2 = 0
            r3 = 2
            r4 = 0
            boolean r1 = p000.yb6.m74336M(r0, r1, r2, r3, r4)
            if (r1 == 0) goto L_0x005d
            java.lang.String r6 = "jar:file:"
            java.lang.String r6 = kotlin.text.StringsKt__StringsKt.m63072M0(r0, r6, r4, r3, r4)
            r1 = 33
            java.lang.String r6 = kotlin.text.StringsKt__StringsKt.m63082R0(r6, r1, r4, r3, r4)
            java.lang.String r1 = "!/"
            java.lang.String r0 = kotlin.text.StringsKt__StringsKt.m63072M0(r0, r1, r4, r3, r4)
            java.util.jar.JarFile r1 = new java.util.jar.JarFile
            r1.<init>(r6, r2)
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch:{ all -> 0x0051 }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ all -> 0x0051 }
            java.util.zip.ZipEntry r3 = new java.util.zip.ZipEntry     // Catch:{ all -> 0x0051 }
            r3.<init>(r0)     // Catch:{ all -> 0x0051 }
            java.io.InputStream r0 = r1.getInputStream(r3)     // Catch:{ all -> 0x0051 }
            java.lang.String r3 = "UTF-8"
            r2.<init>(r0, r3)     // Catch:{ all -> 0x0051 }
            r6.<init>(r2)     // Catch:{ all -> 0x0051 }
            dz1 r0 = f37433a     // Catch:{ all -> 0x004a }
            java.util.List r0 = r0.mo51340f(r6)     // Catch:{ all -> 0x004a }
            p000.lh0.m47807a(r6, r4)     // Catch:{ all -> 0x0051 }
            r1.close()     // Catch:{ all -> 0x0048 }
            return r0
        L_0x0048:
            r6 = move-exception
            throw r6
        L_0x004a:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x004c }
        L_0x004c:
            r2 = move-exception
            p000.lh0.m47807a(r6, r0)     // Catch:{ all -> 0x0051 }
            throw r2     // Catch:{ all -> 0x0051 }
        L_0x0051:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0053 }
        L_0x0053:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0058 }
            throw r0
        L_0x0058:
            r0 = move-exception
            p000.ru1.m51326a(r6, r0)
            throw r6
        L_0x005d:
            java.io.BufferedReader r0 = new java.io.BufferedReader
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            java.io.InputStream r6 = r6.openStream()
            r1.<init>(r6)
            r0.<init>(r1)
            dz1 r6 = f37433a     // Catch:{ all -> 0x0075 }
            java.util.List r6 = r6.mo51340f(r0)     // Catch:{ all -> 0x0075 }
            p000.lh0.m47807a(r0, r4)
            return r6
        L_0x0075:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0077 }
        L_0x0077:
            r1 = move-exception
            p000.lh0.m47807a(r0, r6)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.dz1.mo51339e(java.net.URL):java.util.List");
    }

    /* renamed from: f */
    public final List<String> mo51340f(BufferedReader bufferedReader) {
        boolean z;
        boolean z2;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return CollectionsKt___CollectionsKt.m47311K0(linkedHashSet);
            }
            String obj = StringsKt__StringsKt.m63090V0(StringsKt__StringsKt.m63084S0(readLine, "#", (String) null, 2, (Object) null)).toString();
            boolean z3 = false;
            int i = 0;
            while (true) {
                if (i >= obj.length()) {
                    z = true;
                    break;
                }
                char charAt = obj.charAt(i);
                if (charAt == '.' || Character.isJavaIdentifierPart(charAt)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    z = false;
                    break;
                }
                i++;
            }
            if (z) {
                if (obj.length() > 0) {
                    z3 = true;
                }
                if (z3) {
                    linkedHashSet.add(obj);
                }
            } else {
                throw new IllegalArgumentException(("Illegal service provider class name: " + obj).toString());
            }
        }
    }
}
