package com.facebook.soloader;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.StrictMode;
import android.text.TextUtils;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class SoLoader {

    /* renamed from: a */
    public static final boolean f9765a = true;

    /* renamed from: b */
    public static r56 f9766b;

    /* renamed from: c */
    public static final ReentrantReadWriteLock f9767c = new ReentrantReadWriteLock();

    /* renamed from: d */
    public static s56[] f9768d = null;

    /* renamed from: e */
    public static volatile int f9769e = 0;

    /* renamed from: f */
    public static i47[] f9770f;

    /* renamed from: g */
    public static C3160qp f9771g;

    /* renamed from: h */
    public static final HashSet<String> f9772h = new HashSet<>();

    /* renamed from: i */
    public static final Map<String, Object> f9773i = new HashMap();

    /* renamed from: j */
    public static final Set<String> f9774j = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: k */
    public static cl6 f9775k = null;

    /* renamed from: l */
    public static int f9776l;

    /* renamed from: m */
    public static boolean f9777m;

    @hi1
    @TargetApi(14)
    public static class Api14Utils {
        private Api14Utils() {
        }

        /* renamed from: a */
        public static String m13731a() {
            ClassLoader classLoader = SoLoader.class.getClassLoader();
            if (classLoader == null || (classLoader instanceof BaseDexClassLoader)) {
                try {
                    return (String) BaseDexClassLoader.class.getMethod("getLdLibraryPath", new Class[0]).invoke((BaseDexClassLoader) classLoader, new Object[0]);
                } catch (Exception e) {
                    throw new RuntimeException("Cannot call getLdLibraryPath", e);
                }
            } else {
                throw new IllegalStateException("ClassLoader " + classLoader.getClass().getName() + " should be of type BaseDexClassLoader");
            }
        }
    }

    public static final class WrongAbiError extends UnsatisfiedLinkError {
        public WrongAbiError(Throwable th, String str) {
            super("APK was built for a different platform. Supported ABIs: " + Arrays.toString(SysUtil.m13741h()) + " error: " + str);
            initCause(th);
        }
    }

    /* renamed from: com.facebook.soloader.SoLoader$a */
    public static class C1967a implements r56 {

        /* renamed from: a */
        public final /* synthetic */ boolean f9778a;

        /* renamed from: b */
        public final /* synthetic */ String f9779b;

        /* renamed from: c */
        public final /* synthetic */ String f9780c;

        /* renamed from: d */
        public final /* synthetic */ Runtime f9781d;

        /* renamed from: e */
        public final /* synthetic */ Method f9782e;

        public C1967a(boolean z, String str, String str2, Runtime runtime, Method method) {
            this.f9778a = z;
            this.f9779b = str;
            this.f9780c = str2;
            this.f9781d = runtime;
            this.f9782e = method;
        }

        /* JADX WARNING: type inference failed for: r1v0 */
        /* JADX WARNING: type inference failed for: r1v10 */
        /* JADX WARNING: type inference failed for: r1v12 */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0035, code lost:
            if (r1 == null) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0037, code lost:
            r0 = new java.lang.StringBuilder();
            r0.append("Error when loading lib: ");
            r0.append(r1);
            r0.append(" lib hash: ");
            r0.append(mo13504b(r9));
            r0.append(" search path is ");
            r0.append(r10);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
            return;
         */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x0095  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo13503a(java.lang.String r9, int r10) {
            /*
                r8 = this;
                boolean r0 = r8.f9778a
                if (r0 == 0) goto L_0x00b7
                r0 = 4
                r10 = r10 & r0
                r1 = 1
                r2 = 0
                if (r10 != r0) goto L_0x000c
                r10 = r1
                goto L_0x000d
            L_0x000c:
                r10 = r2
            L_0x000d:
                if (r10 == 0) goto L_0x0012
                java.lang.String r10 = r8.f9779b
                goto L_0x0014
            L_0x0012:
                java.lang.String r10 = r8.f9780c
            L_0x0014:
                r0 = 0
                java.lang.Runtime r3 = r8.f9781d     // Catch:{ IllegalAccessException -> 0x0077, IllegalArgumentException -> 0x0075, InvocationTargetException -> 0x0073, all -> 0x006e }
                monitor-enter(r3)     // Catch:{ IllegalAccessException -> 0x0077, IllegalArgumentException -> 0x0075, InvocationTargetException -> 0x0073, all -> 0x006e }
                java.lang.reflect.Method r4 = r8.f9782e     // Catch:{ all -> 0x0060 }
                java.lang.Runtime r5 = r8.f9781d     // Catch:{ all -> 0x0060 }
                r6 = 3
                java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x0060 }
                r6[r2] = r9     // Catch:{ all -> 0x0060 }
                java.lang.Class<com.facebook.soloader.SoLoader> r2 = com.facebook.soloader.SoLoader.class
                java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch:{ all -> 0x0060 }
                r6[r1] = r2     // Catch:{ all -> 0x0060 }
                r1 = 2
                r6[r1] = r10     // Catch:{ all -> 0x0060 }
                java.lang.Object r1 = r4.invoke(r5, r6)     // Catch:{ all -> 0x0060 }
                java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0060 }
                if (r1 != 0) goto L_0x005a
                monitor-exit(r3)     // Catch:{ all -> 0x006c }
                if (r1 == 0) goto L_0x00ba
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Error when loading lib: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r1 = " lib hash: "
                r0.append(r1)
                java.lang.String r9 = r8.mo13504b(r9)
                r0.append(r9)
                java.lang.String r9 = " search path is "
                r0.append(r9)
                r0.append(r10)
                goto L_0x00ba
            L_0x005a:
                java.lang.UnsatisfiedLinkError r0 = new java.lang.UnsatisfiedLinkError     // Catch:{ all -> 0x006c }
                r0.<init>(r1)     // Catch:{ all -> 0x006c }
                throw r0     // Catch:{ all -> 0x006c }
            L_0x0060:
                r1 = move-exception
                r7 = r1
                r1 = r0
                r0 = r7
            L_0x0064:
                monitor-exit(r3)     // Catch:{ all -> 0x006c }
                throw r0     // Catch:{ IllegalAccessException -> 0x006a, IllegalArgumentException -> 0x0068, InvocationTargetException -> 0x0066 }
            L_0x0066:
                r0 = move-exception
                goto L_0x007b
            L_0x0068:
                r0 = move-exception
                goto L_0x007b
            L_0x006a:
                r0 = move-exception
                goto L_0x007b
            L_0x006c:
                r0 = move-exception
                goto L_0x0064
            L_0x006e:
                r1 = move-exception
                r7 = r1
                r1 = r0
                r0 = r7
                goto L_0x0093
            L_0x0073:
                r1 = move-exception
                goto L_0x0078
            L_0x0075:
                r1 = move-exception
                goto L_0x0078
            L_0x0077:
                r1 = move-exception
            L_0x0078:
                r7 = r1
                r1 = r0
                r0 = r7
            L_0x007b:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0092 }
                r2.<init>()     // Catch:{ all -> 0x0092 }
                java.lang.String r3 = "Error: Cannot load "
                r2.append(r3)     // Catch:{ all -> 0x0092 }
                r2.append(r9)     // Catch:{ all -> 0x0092 }
                java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x0092 }
                java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ all -> 0x0092 }
                r2.<init>(r1, r0)     // Catch:{ all -> 0x0092 }
                throw r2     // Catch:{ all -> 0x0092 }
            L_0x0092:
                r0 = move-exception
            L_0x0093:
                if (r1 == 0) goto L_0x00b6
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Error when loading lib: "
                r2.append(r3)
                r2.append(r1)
                java.lang.String r1 = " lib hash: "
                r2.append(r1)
                java.lang.String r9 = r8.mo13504b(r9)
                r2.append(r9)
                java.lang.String r9 = " search path is "
                r2.append(r9)
                r2.append(r10)
            L_0x00b6:
                throw r0
            L_0x00b7:
                java.lang.System.load(r9)
            L_0x00ba:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.SoLoader.C1967a.mo13503a(java.lang.String, int):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
            r1.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0042, code lost:
            throw r0;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String mo13504b(java.lang.String r7) {
            /*
                r6 = this;
                java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x004f, SecurityException -> 0x0049, NoSuchAlgorithmException -> 0x0043 }
                r0.<init>(r7)     // Catch:{ IOException -> 0x004f, SecurityException -> 0x0049, NoSuchAlgorithmException -> 0x0043 }
                java.lang.String r7 = "MD5"
                java.security.MessageDigest r7 = java.security.MessageDigest.getInstance(r7)     // Catch:{ IOException -> 0x004f, SecurityException -> 0x0049, NoSuchAlgorithmException -> 0x0043 }
                java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ IOException -> 0x004f, SecurityException -> 0x0049, NoSuchAlgorithmException -> 0x0043 }
                r1.<init>(r0)     // Catch:{ IOException -> 0x004f, SecurityException -> 0x0049, NoSuchAlgorithmException -> 0x0043 }
                r0 = 4096(0x1000, float:5.74E-42)
                byte[] r0 = new byte[r0]     // Catch:{ all -> 0x0037 }
            L_0x0014:
                int r2 = r1.read(r0)     // Catch:{ all -> 0x0037 }
                r3 = 0
                if (r2 <= 0) goto L_0x001f
                r7.update(r0, r3, r2)     // Catch:{ all -> 0x0037 }
                goto L_0x0014
            L_0x001f:
                java.lang.String r0 = "%32x"
                r2 = 1
                java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ all -> 0x0037 }
                java.math.BigInteger r5 = new java.math.BigInteger     // Catch:{ all -> 0x0037 }
                byte[] r7 = r7.digest()     // Catch:{ all -> 0x0037 }
                r5.<init>(r2, r7)     // Catch:{ all -> 0x0037 }
                r4[r3] = r5     // Catch:{ all -> 0x0037 }
                java.lang.String r7 = java.lang.String.format(r0, r4)     // Catch:{ all -> 0x0037 }
                r1.close()     // Catch:{ IOException -> 0x004f, SecurityException -> 0x0049, NoSuchAlgorithmException -> 0x0043 }
                goto L_0x0054
            L_0x0037:
                r7 = move-exception
                throw r7     // Catch:{ all -> 0x0039 }
            L_0x0039:
                r0 = move-exception
                r1.close()     // Catch:{ all -> 0x003e }
                goto L_0x0042
            L_0x003e:
                r1 = move-exception
                r7.addSuppressed(r1)     // Catch:{ IOException -> 0x004f, SecurityException -> 0x0049, NoSuchAlgorithmException -> 0x0043 }
            L_0x0042:
                throw r0     // Catch:{ IOException -> 0x004f, SecurityException -> 0x0049, NoSuchAlgorithmException -> 0x0043 }
            L_0x0043:
                r7 = move-exception
                java.lang.String r7 = r7.toString()
                goto L_0x0054
            L_0x0049:
                r7 = move-exception
                java.lang.String r7 = r7.toString()
                goto L_0x0054
            L_0x004f:
                r7 = move-exception
                java.lang.String r7 = r7.toString()
            L_0x0054:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.SoLoader.C1967a.mo13504b(java.lang.String):java.lang.String");
        }
    }

    /* renamed from: a */
    public static void m13717a() {
        if (!m13724h()) {
            throw new IllegalStateException("SoLoader.init() not yet called");
        }
    }

    /* renamed from: b */
    public static boolean m13718b(Context context, int i) {
        if ((i & 32) != 0 || context == null || (context.getApplicationInfo().flags & 129) == 0) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0125  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m13719c(java.lang.String r11, int r12, android.os.StrictMode.ThreadPolicy r13) throws java.lang.UnsatisfiedLinkError {
        /*
            java.lang.String r0 = " result: "
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = f9767c
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r1.readLock()
            r2.lock()
            s56[] r2 = f9768d     // Catch:{ all -> 0x016e }
            java.lang.String r3 = "couldn't find DSO to load: "
            if (r2 == 0) goto L_0x0147
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r1.readLock()
            r2.unlock()
            r2 = 1
            r4 = 0
            if (r13 != 0) goto L_0x0022
            android.os.StrictMode$ThreadPolicy r13 = android.os.StrictMode.allowThreadDiskReads()
            r5 = r2
            goto L_0x0023
        L_0x0022:
            r5 = r4
        L_0x0023:
            boolean r6 = f9765a
            if (r6 == 0) goto L_0x002e
            java.lang.String r6 = "SoLoader.loadLibrary["
            java.lang.String r7 = "]"
            com.facebook.soloader.Api18TraceUtils.m13707a(r6, r11, r7)
        L_0x002e:
            r6 = 3
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r1.readLock()     // Catch:{ all -> 0x0101 }
            r1.lock()     // Catch:{ all -> 0x0101 }
            r1 = r4
            r7 = r1
        L_0x0038:
            if (r1 != 0) goto L_0x007d
            s56[] r8 = f9768d     // Catch:{ all -> 0x0071 }
            int r9 = r8.length     // Catch:{ all -> 0x0071 }
            if (r7 >= r9) goto L_0x007d
            r8 = r8[r7]     // Catch:{ all -> 0x0071 }
            int r1 = r8.mo13505a(r11, r12, r13)     // Catch:{ all -> 0x0071 }
            if (r1 != r6) goto L_0x006e
            i47[] r8 = f9770f     // Catch:{ all -> 0x0071 }
            if (r8 == 0) goto L_0x006e
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0071 }
            r7.<init>()     // Catch:{ all -> 0x0071 }
            java.lang.String r8 = "Trying backup SoSource for "
            r7.append(r8)     // Catch:{ all -> 0x0071 }
            r7.append(r11)     // Catch:{ all -> 0x0071 }
            i47[] r7 = f9770f     // Catch:{ all -> 0x0071 }
            int r8 = r7.length     // Catch:{ all -> 0x0071 }
            r9 = r4
        L_0x005c:
            if (r9 >= r8) goto L_0x007d
            r10 = r7[r9]     // Catch:{ all -> 0x0071 }
            r10.mo21459n(r11)     // Catch:{ all -> 0x0071 }
            int r10 = r10.mo13505a(r11, r12, r13)     // Catch:{ all -> 0x0071 }
            if (r10 != r2) goto L_0x006b
            r1 = r10
            goto L_0x007d
        L_0x006b:
            int r9 = r9 + 1
            goto L_0x005c
        L_0x006e:
            int r7 = r7 + 1
            goto L_0x0038
        L_0x0071:
            r12 = move-exception
            r4 = r1
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = f9767c     // Catch:{ all -> 0x0101 }
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r1.readLock()     // Catch:{ all -> 0x0101 }
            r1.unlock()     // Catch:{ all -> 0x0101 }
            throw r12     // Catch:{ all -> 0x0101 }
        L_0x007d:
            java.util.concurrent.locks.ReentrantReadWriteLock r12 = f9767c     // Catch:{ all -> 0x00fe }
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r12.readLock()     // Catch:{ all -> 0x00fe }
            r2.unlock()     // Catch:{ all -> 0x00fe }
            boolean r2 = f9765a
            if (r2 == 0) goto L_0x008d
            com.facebook.soloader.Api18TraceUtils.m13708b()
        L_0x008d:
            if (r5 == 0) goto L_0x0092
            android.os.StrictMode.setThreadPolicy(r13)
        L_0x0092:
            if (r1 == 0) goto L_0x0096
            if (r1 != r6) goto L_0x0113
        L_0x0096:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r3)
            r13.append(r11)
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r11 = r12.readLock()
            r11.lock()
        L_0x00a8:
            s56[] r11 = f9768d
            int r11 = r11.length
            if (r4 >= r11) goto L_0x00c8
            java.lang.String r11 = "\n\tSoSource "
            r13.append(r11)
            r13.append(r4)
            java.lang.String r11 = ": "
            r13.append(r11)
            s56[] r11 = f9768d
            r11 = r11[r4]
            java.lang.String r11 = r11.toString()
            r13.append(r11)
            int r4 = r4 + 1
            goto L_0x00a8
        L_0x00c8:
            qp r11 = f9771g
            if (r11 == 0) goto L_0x00e5
            android.content.Context r11 = r11.mo25190e()
            java.io.File r11 = p000.C3160qp.m25821d(r11)
            java.lang.String r12 = "\n\tNative lib dir: "
            r13.append(r12)
            java.lang.String r11 = r11.getAbsolutePath()
            r13.append(r11)
            java.lang.String r11 = "\n"
            r13.append(r11)
        L_0x00e5:
            java.util.concurrent.locks.ReentrantReadWriteLock r11 = f9767c
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r11 = r11.readLock()
            r11.unlock()
            r13.append(r0)
            r13.append(r1)
            java.lang.String r11 = r13.toString()
            java.lang.UnsatisfiedLinkError r12 = new java.lang.UnsatisfiedLinkError
            r12.<init>(r11)
            throw r12
        L_0x00fe:
            r12 = move-exception
            r4 = r1
            goto L_0x0102
        L_0x0101:
            r12 = move-exception
        L_0x0102:
            boolean r1 = f9765a
            if (r1 == 0) goto L_0x0109
            com.facebook.soloader.Api18TraceUtils.m13708b()
        L_0x0109:
            if (r5 == 0) goto L_0x010e
            android.os.StrictMode.setThreadPolicy(r13)
        L_0x010e:
            if (r4 == 0) goto L_0x0114
            if (r4 != r6) goto L_0x0113
            goto L_0x0114
        L_0x0113:
            return
        L_0x0114:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r3)
            r13.append(r11)
            java.lang.String r11 = r12.getMessage()
            if (r11 != 0) goto L_0x0129
            java.lang.String r11 = r12.toString()
        L_0x0129:
            java.lang.String r1 = " caused by: "
            r13.append(r1)
            r13.append(r11)
            r12.printStackTrace()
            r13.append(r0)
            r13.append(r4)
            java.lang.String r11 = r13.toString()
            java.lang.UnsatisfiedLinkError r13 = new java.lang.UnsatisfiedLinkError
            r13.<init>(r11)
            r13.initCause(r12)
            throw r13
        L_0x0147:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x016e }
            r12.<init>()     // Catch:{ all -> 0x016e }
            java.lang.String r13 = "Could not load: "
            r12.append(r13)     // Catch:{ all -> 0x016e }
            r12.append(r11)     // Catch:{ all -> 0x016e }
            java.lang.String r13 = " because no SO source exists"
            r12.append(r13)     // Catch:{ all -> 0x016e }
            java.lang.UnsatisfiedLinkError r12 = new java.lang.UnsatisfiedLinkError     // Catch:{ all -> 0x016e }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x016e }
            r13.<init>()     // Catch:{ all -> 0x016e }
            r13.append(r3)     // Catch:{ all -> 0x016e }
            r13.append(r11)     // Catch:{ all -> 0x016e }
            java.lang.String r11 = r13.toString()     // Catch:{ all -> 0x016e }
            r12.<init>(r11)     // Catch:{ all -> 0x016e }
            throw r12     // Catch:{ all -> 0x016e }
        L_0x016e:
            r11 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock r12 = f9767c
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r12 = r12.readLock()
            r12.unlock()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.SoLoader.m13719c(java.lang.String, int, android.os.StrictMode$ThreadPolicy):void");
    }

    /* renamed from: d */
    public static Method m13720d() {
        Class<String> cls = String.class;
        if (Build.VERSION.SDK_INT > 27) {
            return null;
        }
        try {
            Method declaredMethod = Runtime.class.getDeclaredMethod("nativeLoad", new Class[]{cls, ClassLoader.class, cls});
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (NoSuchMethodException | SecurityException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static void m13721e(Context context, int i, r56 r56) throws IOException {
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        try {
            f9777m = m13718b(context, i);
            m13722f(r56);
            m13723g(context, i, r56);
            u34.m28056b(new w34());
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
        }
    }

    /* renamed from: f */
    public static synchronized void m13722f(r56 r56) {
        boolean z;
        String str;
        synchronized (SoLoader.class) {
            if (r56 != null) {
                f9766b = r56;
                return;
            }
            Runtime runtime = Runtime.getRuntime();
            Method d = m13720d();
            if (d != null) {
                z = true;
            } else {
                z = false;
            }
            boolean z2 = z;
            if (z2) {
                str = Api14Utils.m13731a();
            } else {
                str = null;
            }
            String str2 = str;
            f9766b = new C1967a(z2, str2, m13729m(str2), runtime, d);
        }
    }

    /* renamed from: g */
    public static void m13723g(Context context, int i, r56 r56) throws IOException {
        int i2;
        f9767c.writeLock().lock();
        try {
            if (f9768d == null) {
                f9776l = i;
                ArrayList arrayList = new ArrayList();
                String str = System.getenv("LD_LIBRARY_PATH");
                if (str == null) {
                    if (SysUtil.m13742i()) {
                        str = "/vendor/lib64:/system/lib64";
                    } else {
                        str = "/vendor/lib:/system/lib";
                    }
                }
                for (String str2 : str.split(":")) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("adding system library source: ");
                    sb.append(str2);
                    arrayList.add(new C1968a(new File(str2), 2));
                }
                if (context != null) {
                    if ((i & 1) != 0) {
                        f9770f = null;
                        arrayList.add(0, new bx1(context, "lib-main"));
                    } else {
                        if (f9777m) {
                            i2 = 0;
                        } else {
                            f9771g = new C3160qp(context, 0);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("adding application source: ");
                            sb2.append(f9771g.toString());
                            arrayList.add(0, f9771g);
                            i2 = 1;
                        }
                        if ((f9776l & 8) != 0) {
                            f9770f = null;
                        } else {
                            File file = new File(context.getApplicationInfo().sourceDir);
                            ArrayList arrayList2 = new ArrayList();
                            C2969om omVar = new C2969om(context, file, "lib-main", i2);
                            arrayList2.add(omVar);
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("adding backup source from : ");
                            sb3.append(omVar.toString());
                            if (context.getApplicationInfo().splitSourceDirs != null) {
                                String[] strArr = context.getApplicationInfo().splitSourceDirs;
                                int length = strArr.length;
                                int i3 = 0;
                                int i4 = 0;
                                while (i3 < length) {
                                    File file2 = new File(strArr[i3]);
                                    StringBuilder sb4 = new StringBuilder();
                                    sb4.append("lib-");
                                    int i5 = i4 + 1;
                                    sb4.append(i4);
                                    C2969om omVar2 = new C2969om(context, file2, sb4.toString(), i2);
                                    StringBuilder sb5 = new StringBuilder();
                                    sb5.append("adding backup source: ");
                                    sb5.append(omVar2.toString());
                                    arrayList2.add(omVar2);
                                    i3++;
                                    i4 = i5;
                                }
                            }
                            f9770f = (i47[]) arrayList2.toArray(new i47[arrayList2.size()]);
                            arrayList.addAll(0, arrayList2);
                        }
                    }
                }
                s56[] s56Arr = (s56[]) arrayList.toArray(new s56[arrayList.size()]);
                int n = m13730n();
                int length2 = s56Arr.length;
                while (true) {
                    int i6 = length2 - 1;
                    if (length2 <= 0) {
                        break;
                    }
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("Preparing SO source: ");
                    sb6.append(s56Arr[i6]);
                    s56Arr[i6].mo21453b(n);
                    length2 = i6;
                }
                f9768d = s56Arr;
                f9769e++;
                StringBuilder sb7 = new StringBuilder();
                sb7.append("init finish: ");
                sb7.append(f9768d.length);
                sb7.append(" SO sources prepared");
            }
        } finally {
            f9767c.writeLock().unlock();
        }
    }

    /* renamed from: h */
    public static boolean m13724h() {
        boolean z;
        ReentrantReadWriteLock reentrantReadWriteLock = f9767c;
        reentrantReadWriteLock.readLock().lock();
        try {
            if (f9768d != null) {
                z = true;
            } else {
                z = false;
            }
            reentrantReadWriteLock.readLock().unlock();
            return z;
        } catch (Throwable th) {
            f9767c.readLock().unlock();
            throw th;
        }
    }

    /* renamed from: i */
    public static boolean m13725i(String str, int i) throws UnsatisfiedLinkError {
        String str2;
        cl6 cl6;
        boolean z;
        ReentrantReadWriteLock reentrantReadWriteLock = f9767c;
        reentrantReadWriteLock.readLock().lock();
        try {
            if (f9768d == null) {
                if ("http://www.android.com/".equals(System.getProperty("java.vendor.url"))) {
                    m13717a();
                } else {
                    synchronized (SoLoader.class) {
                        z = !f9772h.contains(str);
                        if (z) {
                            cl6 cl62 = f9775k;
                            if (cl62 != null) {
                                cl62.mo12109a(str);
                            } else {
                                System.loadLibrary(str);
                            }
                        }
                    }
                    reentrantReadWriteLock.readLock().unlock();
                    return z;
                }
            }
            reentrantReadWriteLock.readLock().unlock();
            if (!f9777m || (cl6 = f9775k) == null) {
                String b = gu3.m18422b(str);
                if (b != null) {
                    str2 = b;
                } else {
                    str2 = str;
                }
                return m13727k(System.mapLibraryName(str2), str, b, i, (StrictMode.ThreadPolicy) null);
            }
            cl6.mo12109a(str);
            return true;
        } catch (Throwable th) {
            f9767c.readLock().unlock();
            throw th;
        }
    }

    public static void init(Context context, int i) throws IOException {
        m13721e(context, i, (r56) null);
    }

    /* renamed from: j */
    public static void m13726j(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        m13728l(str, (String) null, (String) null, i, threadPolicy);
    }

    /* renamed from: k */
    public static boolean m13727k(String str, String str2, String str3, int i, StrictMode.ThreadPolicy threadPolicy) {
        boolean z;
        boolean z2 = false;
        do {
            try {
                z2 = m13728l(str, str2, str3, i, threadPolicy);
                z = false;
                continue;
            } catch (UnsatisfiedLinkError e) {
                int i2 = f9769e;
                f9767c.writeLock().lock();
                try {
                    z = true;
                    if (f9771g == null || !f9771g.mo25189c()) {
                        z = false;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("sApplicationSoSource updated during load: ");
                        sb.append(str);
                        sb.append(", attempting load again.");
                        f9769e++;
                    }
                    f9767c.writeLock().unlock();
                    if (f9769e == i2) {
                        throw e;
                    }
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                } catch (Throwable th) {
                    f9767c.writeLock().unlock();
                    throw th;
                }
            }
        } while (z);
        return z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0132, code lost:
        throw r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003a, code lost:
        r6 = f9767c;
        r6.readLock().lock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0044, code lost:
        if (r3 != false) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004b, code lost:
        if (r1.contains(r9) == false) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004d, code lost:
        if (r11 != null) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004f, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0051, code lost:
        r6.readLock().unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0058, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0059, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x005b, code lost:
        if (r3 != false) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r7 = new java.lang.StringBuilder();
        r7.append("About to load: ");
        r7.append(r9);
        m13719c(r9, r12, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        r13 = new java.lang.StringBuilder();
        r13.append("Loaded: ");
        r13.append(r9);
        r1.add(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x007e, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0083, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0084, code lost:
        r10 = r9.getMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0088, code lost:
        if (r10 == null) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00a1, code lost:
        throw new com.facebook.soloader.SoLoader.WrongAbiError(r9, r10.substring(r10.lastIndexOf("unexpected e_machine:")));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00a2, code lost:
        throw r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00a8, code lost:
        if ((r12 & 16) != 0) goto L_0x011a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00ae, code lost:
        if (android.text.TextUtils.isEmpty(r10) != false) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00b6, code lost:
        if (f9774j.contains(r10) == false) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00b8, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00b9, code lost:
        if (r11 == null) goto L_0x011a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00bb, code lost:
        if (r2 != false) goto L_0x011a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00bd, code lost:
        r11 = f9765a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00bf, code lost:
        if (r11 == false) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00c1, code lost:
        com.facebook.soloader.Api18TraceUtils.m13707a("MergedSoMapping.invokeJniOnload[", r10, "]");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        r12 = new java.lang.StringBuilder();
        r12.append("About to merge: ");
        r12.append(r10);
        r12.append(" / ");
        r12.append(r9);
        p000.gu3.m18421a(r10);
        f9774j.add(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00e5, code lost:
        if (r11 == false) goto L_0x011a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        com.facebook.soloader.Api18TraceUtils.m13708b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x00eb, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x00ed, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0111, code lost:
        throw new java.lang.RuntimeException("Failed to call JNI_OnLoad from '" + r10 + "', which has been merged into '" + r9 + "'.  See comment for details.", r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0114, code lost:
        if (f9765a != false) goto L_0x0116;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0116, code lost:
        com.facebook.soloader.Api18TraceUtils.m13708b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0119, code lost:
        throw r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x011a, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x011b, code lost:
        r6.readLock().unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0124, code lost:
        return !r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0128, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0129, code lost:
        f9767c.readLock().unlock();
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m13728l(java.lang.String r9, java.lang.String r10, java.lang.String r11, int r12, android.os.StrictMode.ThreadPolicy r13) {
        /*
            java.lang.Class<com.facebook.soloader.SoLoader> r0 = com.facebook.soloader.SoLoader.class
            boolean r1 = android.text.TextUtils.isEmpty(r10)
            r2 = 0
            if (r1 != 0) goto L_0x0012
            java.util.Set<java.lang.String> r1 = f9774j
            boolean r1 = r1.contains(r10)
            if (r1 == 0) goto L_0x0012
            return r2
        L_0x0012:
            monitor-enter(r0)
            java.util.HashSet<java.lang.String> r1 = f9772h     // Catch:{ all -> 0x0133 }
            boolean r3 = r1.contains(r9)     // Catch:{ all -> 0x0133 }
            r4 = 1
            if (r3 == 0) goto L_0x0022
            if (r11 != 0) goto L_0x0020
            monitor-exit(r0)     // Catch:{ all -> 0x0133 }
            return r2
        L_0x0020:
            r3 = r4
            goto L_0x0023
        L_0x0022:
            r3 = r2
        L_0x0023:
            java.util.Map<java.lang.String, java.lang.Object> r5 = f9773i     // Catch:{ all -> 0x0133 }
            boolean r6 = r5.containsKey(r9)     // Catch:{ all -> 0x0133 }
            if (r6 == 0) goto L_0x0030
            java.lang.Object r5 = r5.get(r9)     // Catch:{ all -> 0x0133 }
            goto L_0x0039
        L_0x0030:
            java.lang.Object r6 = new java.lang.Object     // Catch:{ all -> 0x0133 }
            r6.<init>()     // Catch:{ all -> 0x0133 }
            r5.put(r9, r6)     // Catch:{ all -> 0x0133 }
            r5 = r6
        L_0x0039:
            monitor-exit(r0)     // Catch:{ all -> 0x0133 }
            java.util.concurrent.locks.ReentrantReadWriteLock r6 = f9767c
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r7 = r6.readLock()
            r7.lock()
            monitor-enter(r5)     // Catch:{ all -> 0x0128 }
            if (r3 != 0) goto L_0x00a6
            monitor-enter(r0)     // Catch:{ all -> 0x0125 }
            boolean r7 = r1.contains(r9)     // Catch:{ all -> 0x00a3 }
            if (r7 == 0) goto L_0x005a
            if (r11 != 0) goto L_0x0059
            monitor-exit(r0)     // Catch:{ all -> 0x00a3 }
            monitor-exit(r5)     // Catch:{ all -> 0x0125 }
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r9 = r6.readLock()
            r9.unlock()
            return r2
        L_0x0059:
            r3 = r4
        L_0x005a:
            monitor-exit(r0)     // Catch:{ all -> 0x00a3 }
            if (r3 != 0) goto L_0x00a6
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ UnsatisfiedLinkError -> 0x0083 }
            r7.<init>()     // Catch:{ UnsatisfiedLinkError -> 0x0083 }
            java.lang.String r8 = "About to load: "
            r7.append(r8)     // Catch:{ UnsatisfiedLinkError -> 0x0083 }
            r7.append(r9)     // Catch:{ UnsatisfiedLinkError -> 0x0083 }
            m13719c(r9, r12, r13)     // Catch:{ UnsatisfiedLinkError -> 0x0083 }
            monitor-enter(r0)     // Catch:{ all -> 0x0125 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x0080 }
            r13.<init>()     // Catch:{ all -> 0x0080 }
            java.lang.String r7 = "Loaded: "
            r13.append(r7)     // Catch:{ all -> 0x0080 }
            r13.append(r9)     // Catch:{ all -> 0x0080 }
            r1.add(r9)     // Catch:{ all -> 0x0080 }
            monitor-exit(r0)     // Catch:{ all -> 0x0080 }
            goto L_0x00a6
        L_0x0080:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0080 }
            throw r9     // Catch:{ all -> 0x0125 }
        L_0x0083:
            r9 = move-exception
            java.lang.String r10 = r9.getMessage()     // Catch:{ all -> 0x0125 }
            if (r10 == 0) goto L_0x00a2
            java.lang.String r11 = "unexpected e_machine:"
            boolean r11 = r10.contains(r11)     // Catch:{ all -> 0x0125 }
            if (r11 == 0) goto L_0x00a2
            java.lang.String r11 = "unexpected e_machine:"
            int r11 = r10.lastIndexOf(r11)     // Catch:{ all -> 0x0125 }
            java.lang.String r10 = r10.substring(r11)     // Catch:{ all -> 0x0125 }
            com.facebook.soloader.SoLoader$WrongAbiError r11 = new com.facebook.soloader.SoLoader$WrongAbiError     // Catch:{ all -> 0x0125 }
            r11.<init>(r9, r10)     // Catch:{ all -> 0x0125 }
            throw r11     // Catch:{ all -> 0x0125 }
        L_0x00a2:
            throw r9     // Catch:{ all -> 0x0125 }
        L_0x00a3:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00a3 }
            throw r9     // Catch:{ all -> 0x0125 }
        L_0x00a6:
            r12 = r12 & 16
            if (r12 != 0) goto L_0x011a
            boolean r12 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x0125 }
            if (r12 != 0) goto L_0x00b9
            java.util.Set<java.lang.String> r12 = f9774j     // Catch:{ all -> 0x0125 }
            boolean r12 = r12.contains(r10)     // Catch:{ all -> 0x0125 }
            if (r12 == 0) goto L_0x00b9
            r2 = r4
        L_0x00b9:
            if (r11 == 0) goto L_0x011a
            if (r2 != 0) goto L_0x011a
            boolean r11 = f9765a     // Catch:{ all -> 0x0125 }
            if (r11 == 0) goto L_0x00c8
            java.lang.String r12 = "MergedSoMapping.invokeJniOnload["
            java.lang.String r13 = "]"
            com.facebook.soloader.Api18TraceUtils.m13707a(r12, r10, r13)     // Catch:{ all -> 0x0125 }
        L_0x00c8:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ UnsatisfiedLinkError -> 0x00ed }
            r12.<init>()     // Catch:{ UnsatisfiedLinkError -> 0x00ed }
            java.lang.String r13 = "About to merge: "
            r12.append(r13)     // Catch:{ UnsatisfiedLinkError -> 0x00ed }
            r12.append(r10)     // Catch:{ UnsatisfiedLinkError -> 0x00ed }
            java.lang.String r13 = " / "
            r12.append(r13)     // Catch:{ UnsatisfiedLinkError -> 0x00ed }
            r12.append(r9)     // Catch:{ UnsatisfiedLinkError -> 0x00ed }
            p000.gu3.m18421a(r10)     // Catch:{ UnsatisfiedLinkError -> 0x00ed }
            java.util.Set<java.lang.String> r12 = f9774j     // Catch:{ UnsatisfiedLinkError -> 0x00ed }
            r12.add(r10)     // Catch:{ UnsatisfiedLinkError -> 0x00ed }
            if (r11 == 0) goto L_0x011a
            com.facebook.soloader.Api18TraceUtils.m13708b()     // Catch:{ all -> 0x0125 }
            goto L_0x011a
        L_0x00eb:
            r9 = move-exception
            goto L_0x0112
        L_0x00ed:
            r11 = move-exception
            java.lang.RuntimeException r12 = new java.lang.RuntimeException     // Catch:{ all -> 0x00eb }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x00eb }
            r13.<init>()     // Catch:{ all -> 0x00eb }
            java.lang.String r0 = "Failed to call JNI_OnLoad from '"
            r13.append(r0)     // Catch:{ all -> 0x00eb }
            r13.append(r10)     // Catch:{ all -> 0x00eb }
            java.lang.String r10 = "', which has been merged into '"
            r13.append(r10)     // Catch:{ all -> 0x00eb }
            r13.append(r9)     // Catch:{ all -> 0x00eb }
            java.lang.String r9 = "'.  See comment for details."
            r13.append(r9)     // Catch:{ all -> 0x00eb }
            java.lang.String r9 = r13.toString()     // Catch:{ all -> 0x00eb }
            r12.<init>(r9, r11)     // Catch:{ all -> 0x00eb }
            throw r12     // Catch:{ all -> 0x00eb }
        L_0x0112:
            boolean r10 = f9765a     // Catch:{ all -> 0x0125 }
            if (r10 == 0) goto L_0x0119
            com.facebook.soloader.Api18TraceUtils.m13708b()     // Catch:{ all -> 0x0125 }
        L_0x0119:
            throw r9     // Catch:{ all -> 0x0125 }
        L_0x011a:
            monitor-exit(r5)     // Catch:{ all -> 0x0125 }
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r9 = r6.readLock()
            r9.unlock()
            r9 = r3 ^ 1
            return r9
        L_0x0125:
            r9 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0125 }
            throw r9     // Catch:{ all -> 0x0128 }
        L_0x0128:
            r9 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock r10 = f9767c
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r10 = r10.readLock()
            r10.unlock()
            throw r9
        L_0x0133:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0133 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.SoLoader.m13728l(java.lang.String, java.lang.String, java.lang.String, int, android.os.StrictMode$ThreadPolicy):boolean");
    }

    /* renamed from: m */
    public static String m13729m(String str) {
        if (str == null) {
            return null;
        }
        String[] split = str.split(":");
        ArrayList arrayList = new ArrayList(split.length);
        for (String str2 : split) {
            if (!str2.contains("!")) {
                arrayList.add(str2);
            }
        }
        return TextUtils.join(":", arrayList);
    }

    /* renamed from: n */
    public static int m13730n() {
        int i;
        ReentrantReadWriteLock reentrantReadWriteLock = f9767c;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if ((f9776l & 2) != 0) {
                i = 1;
            } else {
                i = 0;
            }
            reentrantReadWriteLock.writeLock().unlock();
            return i;
        } catch (Throwable th) {
            f9767c.writeLock().unlock();
            throw th;
        }
    }
}
