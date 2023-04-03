package com.google.firebase.crashlytics.internal.common;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Debug;
import android.os.StatFs;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import org.web3j.abi.datatypes.Bool;
import org.web3j.abi.datatypes.Utf8String;

public class CommonUtils {

    /* renamed from: a */
    public static final char[] f25316a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b */
    public static long f25317b = -1;

    public enum Architecture {
        X86_32,
        X86_64,
        ARM_UNKNOWN,
        PPC,
        PPC64,
        ARMV6,
        ARMV7,
        UNKNOWN,
        ARMV7S,
        ARM64;
        

        /* renamed from: a */
        public static final Map<String, Architecture> f25318a = null;

        /* access modifiers changed from: public */
        static {
            Architecture architecture;
            Architecture architecture2;
            Architecture architecture3;
            Architecture architecture4;
            HashMap hashMap = new HashMap(4);
            f25318a = hashMap;
            hashMap.put("armeabi-v7a", architecture3);
            hashMap.put("armeabi", architecture2);
            hashMap.put("arm64-v8a", architecture4);
            hashMap.put("x86", architecture);
        }

        public static Architecture getValue() {
            String str = Build.CPU_ABI;
            if (TextUtils.isEmpty(str)) {
                rk3.m51112f().mo47429i("Architecture#getValue()::Build.CPU_ABI returned null or empty");
                return UNKNOWN;
            }
            Architecture architecture = f25318a.get(str.toLowerCase(Locale.US));
            if (architecture == null) {
                return UNKNOWN;
            }
            return architecture;
        }
    }

    /* renamed from: A */
    public static String m38396A(String str) {
        return m38417t(str, "SHA-1");
    }

    /* renamed from: B */
    public static String m38397B(InputStream inputStream) {
        Scanner useDelimiter = new Scanner(inputStream).useDelimiter("\\A");
        if (useDelimiter.hasNext()) {
            return useDelimiter.next();
        }
        return "";
    }

    /* renamed from: a */
    public static long m38398a(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    /* renamed from: b */
    public static long m38399b(String str) {
        StatFs statFs = new StatFs(str);
        long blockSize = (long) statFs.getBlockSize();
        return (((long) statFs.getBlockCount()) * blockSize) - (blockSize * ((long) statFs.getAvailableBlocks()));
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: c */
    public static boolean m38400c(Context context) {
        if (!m38401d(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return true;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnectedOrConnecting()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m38401d(Context context, String str) {
        if (context.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static void m38402e(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                rk3.m51112f().mo47426e(str, e);
            }
        }
    }

    /* renamed from: f */
    public static void m38403f(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: g */
    public static long m38404g(String str, String str2, int i) {
        return Long.parseLong(str.split(str2)[0].trim()) * ((long) i);
    }

    /* renamed from: h */
    public static String m38405h(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        for (String str : strArr) {
            if (str != null) {
                arrayList.add(str.replace("-", "").toLowerCase(Locale.US));
            }
        }
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        for (String append : arrayList) {
            sb.append(append);
        }
        String sb2 = sb.toString();
        if (sb2.length() > 0) {
            return m38396A(sb2);
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v2, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m38406i(java.io.File r6, java.lang.String r7) {
        /*
            java.lang.String r0 = "Failed to close system file reader."
            boolean r1 = r6.exists()
            r2 = 0
            if (r1 == 0) goto L_0x005f
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Exception -> 0x003e, all -> 0x003c }
            java.io.FileReader r3 = new java.io.FileReader     // Catch:{ Exception -> 0x003e, all -> 0x003c }
            r3.<init>(r6)     // Catch:{ Exception -> 0x003e, all -> 0x003c }
            r4 = 1024(0x400, float:1.435E-42)
            r1.<init>(r3, r4)     // Catch:{ Exception -> 0x003e, all -> 0x003c }
        L_0x0015:
            java.lang.String r3 = r1.readLine()     // Catch:{ Exception -> 0x003a }
            if (r3 == 0) goto L_0x0036
            java.lang.String r4 = "\\s*:\\s*"
            java.util.regex.Pattern r4 = java.util.regex.Pattern.compile(r4)     // Catch:{ Exception -> 0x003a }
            r5 = 2
            java.lang.String[] r3 = r4.split(r3, r5)     // Catch:{ Exception -> 0x003a }
            int r4 = r3.length     // Catch:{ Exception -> 0x003a }
            r5 = 1
            if (r4 <= r5) goto L_0x0015
            r4 = 0
            r4 = r3[r4]     // Catch:{ Exception -> 0x003a }
            boolean r4 = r4.equals(r7)     // Catch:{ Exception -> 0x003a }
            if (r4 == 0) goto L_0x0015
            r6 = r3[r5]     // Catch:{ Exception -> 0x003a }
            r2 = r6
        L_0x0036:
            m38402e(r1, r0)
            goto L_0x005f
        L_0x003a:
            r7 = move-exception
            goto L_0x0040
        L_0x003c:
            r6 = move-exception
            goto L_0x005b
        L_0x003e:
            r7 = move-exception
            r1 = r2
        L_0x0040:
            rk3 r3 = p000.rk3.m51112f()     // Catch:{ all -> 0x0059 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0059 }
            r4.<init>()     // Catch:{ all -> 0x0059 }
            java.lang.String r5 = "Error parsing "
            r4.append(r5)     // Catch:{ all -> 0x0059 }
            r4.append(r6)     // Catch:{ all -> 0x0059 }
            java.lang.String r6 = r4.toString()     // Catch:{ all -> 0x0059 }
            r3.mo47426e(r6, r7)     // Catch:{ all -> 0x0059 }
            goto L_0x0036
        L_0x0059:
            r6 = move-exception
            r2 = r1
        L_0x005b:
            m38402e(r2, r0)
            throw r6
        L_0x005f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.common.CommonUtils.m38406i(java.io.File, java.lang.String):java.lang.String");
    }

    /* renamed from: j */
    public static ActivityManager.RunningAppProcessInfo m38407j(String str, Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                if (next.processName.equals(str)) {
                    return next;
                }
            }
        }
        return null;
    }

    /* renamed from: k */
    public static boolean m38408k(Context context, String str, boolean z) {
        Resources resources;
        if (!(context == null || (resources = context.getResources()) == null)) {
            int q = m38414q(context, str, Bool.TYPE_NAME);
            if (q > 0) {
                return resources.getBoolean(q);
            }
            int q2 = m38414q(context, str, Utf8String.TYPE_NAME);
            if (q2 > 0) {
                return Boolean.parseBoolean(context.getString(q2));
            }
        }
        return z;
    }

    /* renamed from: l */
    public static int m38409l() {
        return Architecture.getValue().ordinal();
    }

    /* renamed from: m */
    public static int m38410m(Context context) {
        boolean x = m38421x(context);
        if (m38422y(context)) {
            x |= true;
        }
        return m38420w() ? x | true ? 1 : 0 : x ? 1 : 0;
    }

    /* renamed from: n */
    public static String m38411n(Context context) {
        int q = m38414q(context, "com.google.firebase.crashlytics.mapping_file_id", Utf8String.TYPE_NAME);
        if (q == 0) {
            q = m38414q(context, "com.crashlytics.android.build_id", Utf8String.TYPE_NAME);
        }
        if (q != 0) {
            return context.getResources().getString(q);
        }
        return null;
    }

    /* renamed from: o */
    public static boolean m38412o(Context context) {
        if (!m38421x(context) && ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public static String m38413p(Context context) {
        int i = context.getApplicationContext().getApplicationInfo().icon;
        if (i <= 0) {
            return context.getPackageName();
        }
        try {
            String resourcePackageName = context.getResources().getResourcePackageName(i);
            if ("android".equals(resourcePackageName)) {
                return context.getPackageName();
            }
            return resourcePackageName;
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    /* renamed from: q */
    public static int m38414q(Context context, String str, String str2) {
        return context.getResources().getIdentifier(str, str2, m38413p(context));
    }

    /* renamed from: r */
    public static SharedPreferences m38415r(Context context) {
        return context.getSharedPreferences("com.google.firebase.crashlytics", 0);
    }

    /* renamed from: s */
    public static synchronized long m38416s() {
        long j;
        synchronized (CommonUtils.class) {
            if (f25317b == -1) {
                long j2 = 0;
                String i = m38406i(new File("/proc/meminfo"), "MemTotal");
                if (!TextUtils.isEmpty(i)) {
                    String upperCase = i.toUpperCase(Locale.US);
                    try {
                        if (upperCase.endsWith("KB")) {
                            j2 = m38404g(upperCase, "KB", RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE);
                        } else if (upperCase.endsWith("MB")) {
                            j2 = m38404g(upperCase, "MB", 1048576);
                        } else if (upperCase.endsWith("GB")) {
                            j2 = m38404g(upperCase, "GB", 1073741824);
                        } else {
                            rk3 f = rk3.m51112f();
                            f.mo47431k("Unexpected meminfo format while computing RAM: " + upperCase);
                        }
                    } catch (NumberFormatException e) {
                        rk3 f2 = rk3.m51112f();
                        f2.mo47426e("Unexpected meminfo format while computing RAM: " + upperCase, e);
                    }
                }
                f25317b = j2;
            }
            j = f25317b;
        }
        return j;
    }

    /* renamed from: t */
    public static String m38417t(String str, String str2) {
        return m38418u(str.getBytes(), str2);
    }

    /* renamed from: u */
    public static String m38418u(byte[] bArr, String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance(str);
            instance.update(bArr);
            return m38419v(instance.digest());
        } catch (NoSuchAlgorithmException e) {
            rk3 f = rk3.m51112f();
            f.mo47426e("Could not create hashing algorithm: " + str + ", returning empty string.", e);
            return "";
        }
    }

    /* renamed from: v */
    public static String m38419v(byte[] bArr) {
        char[] cArr = new char[(bArr.length * 2)];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i] & 255;
            int i2 = i * 2;
            char[] cArr2 = f25316a;
            cArr[i2] = cArr2[b >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    /* renamed from: w */
    public static boolean m38420w() {
        if (Debug.isDebuggerConnected() || Debug.waitingForDebugger()) {
            return true;
        }
        return false;
    }

    /* renamed from: x */
    public static boolean m38421x(Context context) {
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        if (!Build.PRODUCT.contains("sdk")) {
            String str = Build.HARDWARE;
            if (str.contains("goldfish") || str.contains("ranchu") || string == null) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: y */
    public static boolean m38422y(Context context) {
        boolean x = m38421x(context);
        String str = Build.TAGS;
        if ((!x && str != null && str.contains("test-keys")) || new File("/system/app/Superuser.apk").exists()) {
            return true;
        }
        File file = new File("/system/xbin/su");
        if (x || !file.exists()) {
            return false;
        }
        return true;
    }

    /* renamed from: z */
    public static String m38423z(Context context) {
        int q = m38414q(context, "com.google.firebase.crashlytics.unity_version", Utf8String.TYPE_NAME);
        if (q == 0) {
            return null;
        }
        String string = context.getResources().getString(q);
        rk3 f = rk3.m51112f();
        f.mo47429i("Unity Editor version is: " + string);
        return string;
    }
}
