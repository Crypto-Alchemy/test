package p000;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* renamed from: zm7 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class zm7 {

    /* renamed from: a */
    public static final int f36185a = Process.myUid();

    /* renamed from: b */
    public static final Method f36186b;

    /* renamed from: c */
    public static final Method f36187c;

    /* renamed from: d */
    public static final Method f36188d;

    /* renamed from: e */
    public static final Method f36189e;

    /* renamed from: f */
    public static final Method f36190f;

    /* renamed from: g */
    public static final Method f36191g;

    /* renamed from: h */
    public static final Method f36192h;

    /* renamed from: i */
    public static final Method f36193i;

    /* JADX WARNING: Removed duplicated region for block: B:23:0x005c A[SYNTHETIC, Splitter:B:23:0x005c] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a6  */
    static {
        /*
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.String r1 = "add"
            int r2 = android.os.Process.myUid()
            f36185a = r2
            r2 = 1
            r3 = 0
            r4 = 0
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x001a }
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x001a }
            r5[r3] = r6     // Catch:{ Exception -> 0x001a }
            java.lang.Class<android.os.WorkSource> r6 = android.os.WorkSource.class
            java.lang.reflect.Method r5 = r6.getMethod(r1, r5)     // Catch:{ Exception -> 0x001a }
            goto L_0x001b
        L_0x001a:
            r5 = r4
        L_0x001b:
            f36186b = r5
            boolean r5 = p000.xp4.m54478c()
            r6 = 2
            if (r5 == 0) goto L_0x0033
            java.lang.Class[] r5 = new java.lang.Class[r6]     // Catch:{ Exception -> 0x0033 }
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0033 }
            r5[r3] = r7     // Catch:{ Exception -> 0x0033 }
            r5[r2] = r0     // Catch:{ Exception -> 0x0033 }
            java.lang.Class<android.os.WorkSource> r7 = android.os.WorkSource.class
            java.lang.reflect.Method r1 = r7.getMethod(r1, r5)     // Catch:{ Exception -> 0x0033 }
            goto L_0x0034
        L_0x0033:
            r1 = r4
        L_0x0034:
            f36187c = r1
            java.lang.Class<android.os.WorkSource> r1 = android.os.WorkSource.class
            java.lang.String r5 = "size"
            java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x0041 }
            java.lang.reflect.Method r1 = r1.getMethod(r5, r7)     // Catch:{ Exception -> 0x0041 }
            goto L_0x0042
        L_0x0041:
            r1 = r4
        L_0x0042:
            f36188d = r1
            java.lang.Class[] r1 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x0053 }
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0053 }
            r1[r3] = r5     // Catch:{ Exception -> 0x0053 }
            java.lang.Class<android.os.WorkSource> r5 = android.os.WorkSource.class
            java.lang.String r7 = "get"
            java.lang.reflect.Method r1 = r5.getMethod(r7, r1)     // Catch:{ Exception -> 0x0053 }
            goto L_0x0054
        L_0x0053:
            r1 = r4
        L_0x0054:
            f36189e = r1
            boolean r1 = p000.xp4.m54478c()
            if (r1 == 0) goto L_0x006b
            java.lang.Class[] r1 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x006b }
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x006b }
            r1[r3] = r5     // Catch:{ Exception -> 0x006b }
            java.lang.Class<android.os.WorkSource> r5 = android.os.WorkSource.class
            java.lang.String r7 = "getName"
            java.lang.reflect.Method r1 = r5.getMethod(r7, r1)     // Catch:{ Exception -> 0x006b }
            goto L_0x006c
        L_0x006b:
            r1 = r4
        L_0x006c:
            f36190f = r1
            boolean r1 = p000.xp4.m54484i()
            if (r1 == 0) goto L_0x007f
            java.lang.Class<android.os.WorkSource> r1 = android.os.WorkSource.class
            java.lang.String r5 = "createWorkChain"
            java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x007f }
            java.lang.reflect.Method r1 = r1.getMethod(r5, r7)     // Catch:{ Exception -> 0x007f }
            goto L_0x0080
        L_0x007f:
            r1 = r4
        L_0x0080:
            f36191g = r1
            boolean r1 = p000.xp4.m54484i()
            if (r1 == 0) goto L_0x009d
            java.lang.String r1 = "android.os.WorkSource$WorkChain"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ Exception -> 0x009d }
            java.lang.Class[] r5 = new java.lang.Class[r6]     // Catch:{ Exception -> 0x009d }
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x009d }
            r5[r3] = r6     // Catch:{ Exception -> 0x009d }
            r5[r2] = r0     // Catch:{ Exception -> 0x009d }
            java.lang.String r0 = "addNode"
            java.lang.reflect.Method r0 = r1.getMethod(r0, r5)     // Catch:{ Exception -> 0x009d }
            goto L_0x009e
        L_0x009d:
            r0 = r4
        L_0x009e:
            f36192h = r0
            boolean r0 = p000.xp4.m54484i()
            if (r0 == 0) goto L_0x00b3
            java.lang.Class<android.os.WorkSource> r0 = android.os.WorkSource.class
            java.lang.String r1 = "isEmpty"
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x00b3 }
            java.lang.reflect.Method r4 = r0.getMethod(r1, r3)     // Catch:{ Exception -> 0x00b3 }
            r4.setAccessible(r2)     // Catch:{ Exception -> 0x00b3 }
        L_0x00b3:
            f36193i = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.zm7.<clinit>():void");
    }

    /* renamed from: a */
    public static void m55145a(WorkSource workSource, int i, String str) {
        Method method = f36187c;
        if (method != null) {
            if (str == null) {
                str = "";
            }
            try {
                method.invoke(workSource, new Object[]{Integer.valueOf(i), str});
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            }
        } else {
            Method method2 = f36186b;
            if (method2 != null) {
                try {
                    method2.invoke(workSource, new Object[]{Integer.valueOf(i)});
                } catch (Exception e2) {
                    Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
                }
            }
        }
    }

    /* renamed from: b */
    public static WorkSource m55146b(Context context, String str) {
        if (!(context == null || context.getPackageManager() == null || str == null)) {
            try {
                ApplicationInfo c = tn7.m52384a(context).mo45809c(str, 0);
                if (c == null) {
                    "Could not get applicationInfo from package: ".concat(str);
                    return null;
                }
                int i = c.uid;
                WorkSource workSource = new WorkSource();
                m55145a(workSource, i, str);
                return workSource;
            } catch (PackageManager.NameNotFoundException unused) {
                "Could not find package: ".concat(str);
            }
        }
        return null;
    }

    /* renamed from: c */
    public static String m55147c(WorkSource workSource, int i) {
        Method method = f36190f;
        if (method == null) {
            return null;
        }
        try {
            return (String) method.invoke(workSource, new Object[]{Integer.valueOf(i)});
        } catch (Exception e) {
            Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            return null;
        }
    }

    /* renamed from: d */
    public static List<String> m55148d(WorkSource workSource) {
        int i;
        ArrayList arrayList = new ArrayList();
        if (workSource == null) {
            i = 0;
        } else {
            i = m55150f(workSource);
        }
        if (i != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                String c = m55147c(workSource, i2);
                if (!qb6.m50490a(c)) {
                    cu4.m43221k(c);
                    arrayList.add(c);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public static boolean m55149e(Context context) {
        if (context == null || context.getPackageManager() == null || tn7.m52384a(context).mo45808b("android.permission.UPDATE_DEVICE_STATS", context.getPackageName()) != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static int m55150f(WorkSource workSource) {
        Method method = f36188d;
        if (method != null) {
            try {
                Object invoke = method.invoke(workSource, new Object[0]);
                cu4.m43221k(invoke);
                return ((Integer) invoke).intValue();
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            }
        }
        return 0;
    }
}
