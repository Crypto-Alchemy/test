package p000;

import android.annotation.TargetApi;
import java.lang.reflect.Method;

@TargetApi(24)
/* renamed from: dd8 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class dd8 {

    /* renamed from: a */
    public static final Method f28160a;

    /* renamed from: b */
    public static final Method f28161b;

    /* JADX WARNING: Removed duplicated region for block: B:9:0x002c  */
    static {
        /*
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 0
            r3 = 24
            r4 = 0
            if (r1 < r3) goto L_0x0025
            r1 = 4
            java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch:{ NoSuchMethodException -> 0x0025 }
            java.lang.Class<android.app.job.JobInfo> r5 = android.app.job.JobInfo.class
            r1[r2] = r5     // Catch:{ NoSuchMethodException -> 0x0025 }
            r5 = 1
            r1[r5] = r0     // Catch:{ NoSuchMethodException -> 0x0025 }
            r5 = 2
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x0025 }
            r1[r5] = r6     // Catch:{ NoSuchMethodException -> 0x0025 }
            r5 = 3
            r1[r5] = r0     // Catch:{ NoSuchMethodException -> 0x0025 }
            java.lang.Class<android.app.job.JobScheduler> r0 = android.app.job.JobScheduler.class
            java.lang.String r5 = "scheduleAsPackage"
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r5, r1)     // Catch:{ NoSuchMethodException -> 0x0025 }
            goto L_0x0026
        L_0x0025:
            r0 = r4
        L_0x0026:
            f28160a = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r3) goto L_0x0036
            java.lang.Class<android.os.UserHandle> r0 = android.os.UserHandle.class
            java.lang.String r1 = "myUserId"
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x0036 }
            java.lang.reflect.Method r4 = r0.getDeclaredMethod(r1, r2)     // Catch:{ NoSuchMethodException -> 0x0036 }
        L_0x0036:
            f28161b = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.dd8.<clinit>():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m43456a(android.content.Context r5, android.app.job.JobInfo r6, java.lang.String r7, java.lang.String r8) {
        /*
            java.lang.String r7 = "jobscheduler"
            java.lang.Object r7 = r5.getSystemService(r7)
            android.app.job.JobScheduler r7 = (android.app.job.JobScheduler) r7
            r7.getClass()
            java.lang.reflect.Method r8 = f28160a
            if (r8 == 0) goto L_0x005b
            java.lang.String r8 = "android.permission.UPDATE_DEVICE_STATS"
            int r5 = r5.checkSelfPermission(r8)
            if (r5 == 0) goto L_0x0018
            goto L_0x005b
        L_0x0018:
            java.lang.reflect.Method r5 = f28161b
            r8 = 0
            if (r5 == 0) goto L_0x002e
            java.lang.Class<android.os.UserHandle> r0 = android.os.UserHandle.class
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x002e }
            java.lang.Object r5 = r5.invoke(r0, r1)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x002e }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x002e }
            if (r5 == 0) goto L_0x002e
            int r5 = r5.intValue()     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x002e }
            goto L_0x002f
        L_0x002e:
            r5 = r8
        L_0x002f:
            java.lang.String r0 = "com.google.android.gms"
            java.lang.String r1 = "UploadAlarm"
            java.lang.reflect.Method r2 = f28160a
            if (r2 == 0) goto L_0x0056
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0056 }
            r3[r8] = r6     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0056 }
            r4 = 1
            r3[r4] = r0     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0056 }
            r0 = 2
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0056 }
            r3[r0] = r5     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0056 }
            r5 = 3
            r3[r5] = r1     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0056 }
            java.lang.Object r5 = r2.invoke(r7, r3)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0056 }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0056 }
            if (r5 == 0) goto L_0x005a
            int r8 = r5.intValue()     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0056 }
            goto L_0x005a
        L_0x0056:
            int r8 = r7.schedule(r6)
        L_0x005a:
            return r8
        L_0x005b:
            int r5 = r7.schedule(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.dd8.m43456a(android.content.Context, android.app.job.JobInfo, java.lang.String, java.lang.String):int");
    }
}
