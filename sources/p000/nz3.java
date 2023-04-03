package p000;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: nz3 */
/* compiled from: MultiDex */
public final class nz3 {

    /* renamed from: a */
    public static final Set<File> f15744a = new HashSet();

    /* renamed from: b */
    public static final boolean f15745b = m23557m(System.getProperty("java.vm.version"));

    /* renamed from: nz3$a */
    /* compiled from: MultiDex */
    public static final class C2933a {
        /* renamed from: a */
        public static void m23559a(ClassLoader classLoader, List<? extends File> list, File file) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, IOException {
            IOException[] iOExceptionArr;
            Object obj = nz3.m23551g(classLoader, "pathList").get(classLoader);
            ArrayList arrayList = new ArrayList();
            nz3.m23550f(obj, "dexElements", m23560b(obj, new ArrayList(list), file, arrayList));
            if (arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    IOException iOException = (IOException) it.next();
                }
                Field a = nz3.m23551g(obj, "dexElementsSuppressedExceptions");
                IOException[] iOExceptionArr2 = (IOException[]) a.get(obj);
                if (iOExceptionArr2 == null) {
                    iOExceptionArr = (IOException[]) arrayList.toArray(new IOException[arrayList.size()]);
                } else {
                    IOException[] iOExceptionArr3 = new IOException[(arrayList.size() + iOExceptionArr2.length)];
                    arrayList.toArray(iOExceptionArr3);
                    System.arraycopy(iOExceptionArr2, 0, iOExceptionArr3, arrayList.size(), iOExceptionArr2.length);
                    iOExceptionArr = iOExceptionArr3;
                }
                a.set(obj, iOExceptionArr);
                IOException iOException2 = new IOException("I/O exception during makeDexElement");
                iOException2.initCause((Throwable) arrayList.get(0));
                throw iOException2;
            }
        }

        /* renamed from: b */
        public static Object[] m23560b(Object obj, ArrayList<File> arrayList, File file, ArrayList<IOException> arrayList2) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
            return (Object[]) nz3.m23552h(obj, "makeDexElements", ArrayList.class, File.class, ArrayList.class).invoke(obj, new Object[]{arrayList, file, arrayList2});
        }
    }

    /* renamed from: d */
    public static void m23548d(Context context) throws Exception {
        File file = new File(context.getFilesDir(), "secondary-dexes");
        if (file.isDirectory()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Clearing old secondary dex dir (");
            sb.append(file.getPath());
            sb.append(").");
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Failed to list secondary dex dir content (");
                sb2.append(file.getPath());
                sb2.append(").");
                return;
            }
            for (File file2 : listFiles) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Trying to delete old file ");
                sb3.append(file2.getPath());
                sb3.append(" of size ");
                sb3.append(file2.length());
                if (!file2.delete()) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Failed to delete old file ");
                    sb4.append(file2.getPath());
                } else {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Deleted old file ");
                    sb5.append(file2.getPath());
                }
            }
            if (!file.delete()) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append("Failed to delete secondary dex dir ");
                sb6.append(file.getPath());
                return;
            }
            StringBuilder sb7 = new StringBuilder();
            sb7.append("Deleted old secondary dex dir ");
            sb7.append(file.getPath());
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x004f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x007c */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0074 A[SYNTHETIC, Splitter:B:32:0x0074] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0076 A[Catch:{ RuntimeException -> 0x007d }] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m23549e(android.content.Context r4, java.io.File r5, java.io.File r6, java.lang.String r7, java.lang.String r8, boolean r9) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.reflect.InvocationTargetException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.ClassNotFoundException, java.lang.InstantiationException {
        /*
            java.util.Set<java.io.File> r0 = f15744a
            monitor-enter(r0)
            boolean r1 = r0.contains(r5)     // Catch:{ all -> 0x007f }
            if (r1 == 0) goto L_0x000b
            monitor-exit(r0)     // Catch:{ all -> 0x007f }
            return
        L_0x000b:
            r0.add(r5)     // Catch:{ all -> 0x007f }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x007f }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x007f }
            r2.<init>()     // Catch:{ all -> 0x007f }
            java.lang.String r3 = "MultiDex is not guaranteed to work in SDK version "
            r2.append(r3)     // Catch:{ all -> 0x007f }
            r2.append(r1)     // Catch:{ all -> 0x007f }
            java.lang.String r1 = ": SDK version higher than "
            r2.append(r1)     // Catch:{ all -> 0x007f }
            r1 = 20
            r2.append(r1)     // Catch:{ all -> 0x007f }
            java.lang.String r1 = " should be backed by "
            r2.append(r1)     // Catch:{ all -> 0x007f }
            java.lang.String r1 = "runtime with built-in multidex capabilty but it's not the "
            r2.append(r1)     // Catch:{ all -> 0x007f }
            java.lang.String r1 = "case here: java.vm.version=\""
            r2.append(r1)     // Catch:{ all -> 0x007f }
            java.lang.String r1 = "java.vm.version"
            java.lang.String r1 = java.lang.System.getProperty(r1)     // Catch:{ all -> 0x007f }
            r2.append(r1)     // Catch:{ all -> 0x007f }
            java.lang.String r1 = "\""
            r2.append(r1)     // Catch:{ all -> 0x007f }
            java.lang.ClassLoader r1 = r4.getClassLoader()     // Catch:{ RuntimeException -> 0x007d }
            if (r1 != 0) goto L_0x004c
            monitor-exit(r0)     // Catch:{ all -> 0x007f }
            return
        L_0x004c:
            m23548d(r4)     // Catch:{ all -> 0x004f }
        L_0x004f:
            java.io.File r6 = m23554j(r4, r6, r7)     // Catch:{ all -> 0x007f }
            androidx.multidex.MultiDexExtractor r7 = new androidx.multidex.MultiDexExtractor     // Catch:{ all -> 0x007f }
            r7.<init>(r5, r6)     // Catch:{ all -> 0x007f }
            r5 = 0
            r2 = 0
            java.util.List r2 = r7.mo8395h(r4, r8, r2)     // Catch:{ all -> 0x0078 }
            m23556l(r1, r6, r2)     // Catch:{ IOException -> 0x0062 }
            goto L_0x006d
        L_0x0062:
            r2 = move-exception
            if (r9 == 0) goto L_0x0077
            r9 = 1
            java.util.List r4 = r7.mo8395h(r4, r8, r9)     // Catch:{ all -> 0x0078 }
            m23556l(r1, r6, r4)     // Catch:{ all -> 0x0078 }
        L_0x006d:
            r7.close()     // Catch:{ IOException -> 0x0071 }
            goto L_0x0072
        L_0x0071:
            r5 = move-exception
        L_0x0072:
            if (r5 != 0) goto L_0x0076
            monitor-exit(r0)     // Catch:{ all -> 0x007f }
            return
        L_0x0076:
            throw r5     // Catch:{ all -> 0x007f }
        L_0x0077:
            throw r2     // Catch:{ all -> 0x0078 }
        L_0x0078:
            r4 = move-exception
            r7.close()     // Catch:{ IOException -> 0x007c }
        L_0x007c:
            throw r4     // Catch:{ all -> 0x007f }
        L_0x007d:
            monitor-exit(r0)     // Catch:{ all -> 0x007f }
            return
        L_0x007f:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x007f }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.nz3.m23549e(android.content.Context, java.io.File, java.io.File, java.lang.String, java.lang.String, boolean):void");
    }

    /* renamed from: f */
    public static void m23550f(Object obj, String str, Object[] objArr) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        Field g = m23551g(obj, str);
        Object[] objArr2 = (Object[]) g.get(obj);
        Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
        System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
        System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
        g.set(obj, objArr3);
    }

    /* renamed from: g */
    public static Field m23551g(Object obj, String str) throws NoSuchFieldException {
        Class cls = obj.getClass();
        while (cls != null) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
                cls = cls.getSuperclass();
            }
        }
        throw new NoSuchFieldException("Field " + str + " not found in " + obj.getClass());
    }

    /* renamed from: h */
    public static Method m23552h(Object obj, String str, Class<?>... clsArr) throws NoSuchMethodException {
        Class cls = obj.getClass();
        while (cls != null) {
            try {
                Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
                cls = cls.getSuperclass();
            }
        }
        throw new NoSuchMethodException("Method " + str + " with parameters " + Arrays.asList(clsArr) + " not found in " + obj.getClass());
    }

    /* renamed from: i */
    public static ApplicationInfo m23553i(Context context) {
        try {
            return context.getApplicationInfo();
        } catch (RuntimeException unused) {
            return null;
        }
    }

    /* renamed from: j */
    public static File m23554j(Context context, File file, String str) throws IOException {
        File file2 = new File(file, "code_cache");
        try {
            m23558n(file2);
        } catch (IOException unused) {
            file2 = new File(context.getFilesDir(), "code_cache");
            m23558n(file2);
        }
        File file3 = new File(file2, str);
        m23558n(file3);
        return file3;
    }

    /* renamed from: k */
    public static void m23555k(Context context) {
        if (!f15745b) {
            try {
                ApplicationInfo i = m23553i(context);
                if (i != null) {
                    m23549e(context, new File(i.sourceDir), new File(i.dataDir), "secondary-dexes", "", true);
                }
            } catch (Exception e) {
                throw new RuntimeException("MultiDex installation failed (" + e.getMessage() + ").");
            }
        }
    }

    /* renamed from: l */
    public static void m23556l(ClassLoader classLoader, File file, List<? extends File> list) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, IOException, SecurityException, ClassNotFoundException, InstantiationException {
        if (!list.isEmpty()) {
            C2933a.m23559a(classLoader, list, file);
        }
    }

    /* renamed from: m */
    public static boolean m23557m(String str) {
        String str2;
        boolean z = false;
        if (str != null) {
            Matcher matcher = Pattern.compile("(\\d+)\\.(\\d+)(\\.\\d+)?").matcher(str);
            if (matcher.matches()) {
                try {
                    int parseInt = Integer.parseInt(matcher.group(1));
                    int parseInt2 = Integer.parseInt(matcher.group(2));
                    if (parseInt > 2 || (parseInt == 2 && parseInt2 >= 1)) {
                        z = true;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("VM with version ");
        sb.append(str);
        if (z) {
            str2 = " has multidex support";
        } else {
            str2 = " does not have multidex support";
        }
        sb.append(str2);
        return z;
    }

    /* renamed from: n */
    public static void m23558n(File file) throws IOException {
        file.mkdir();
        if (!file.isDirectory()) {
            File parentFile = file.getParentFile();
            if (parentFile == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to create dir ");
                sb.append(file.getPath());
                sb.append(". Parent file is null.");
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Failed to create dir ");
                sb2.append(file.getPath());
                sb2.append(". parent file is a dir ");
                sb2.append(parentFile.isDirectory());
                sb2.append(", a file ");
                sb2.append(parentFile.isFile());
                sb2.append(", exists ");
                sb2.append(parentFile.exists());
                sb2.append(", readable ");
                sb2.append(parentFile.canRead());
                sb2.append(", writable ");
                sb2.append(parentFile.canWrite());
            }
            throw new IOException("Failed to create directory " + file.getPath());
        }
    }
}
