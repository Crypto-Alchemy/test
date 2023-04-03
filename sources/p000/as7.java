package p000;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: as7 */
public final class as7 implements zv3 {

    /* renamed from: e */
    public static final pq7 f20987e = new pq7("MissingSplitsManagerImpl");

    /* renamed from: a */
    public final Context f20988a;

    /* renamed from: b */
    public final Runtime f20989b;

    /* renamed from: c */
    public final fq7 f20990c;

    /* renamed from: d */
    public final AtomicReference<Boolean> f20991d;

    public as7(Context context, Runtime runtime, fq7 fq7, AtomicReference<Boolean> atomicReference) {
        this.f20988a = context;
        this.f20989b = runtime;
        this.f20990c = fq7;
        this.f20991d = atomicReference;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:19|20) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        f20987e.mo46856e("App '%s' is not found in PackageManager", r7.f20988a.getPackageName());
        r5 = java.util.Collections.emptySet();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0056 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo29045a() {
        /*
            r7 = this;
            java.util.concurrent.atomic.AtomicReference<java.lang.Boolean> r0 = r7.f20991d
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicReference<java.lang.Boolean> r1 = r7.f20991d     // Catch:{ all -> 0x01b4 }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x01b4 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x01b4 }
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x009c
            java.util.concurrent.atomic.AtomicReference<java.lang.Boolean> r1 = r7.f20991d     // Catch:{ all -> 0x01b4 }
            android.content.Context r4 = r7.f20988a     // Catch:{ all -> 0x01b4 }
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch:{ all -> 0x01b4 }
            android.content.Context r5 = r7.f20988a     // Catch:{ NameNotFoundException -> 0x0083 }
            java.lang.String r5 = r5.getPackageName()     // Catch:{ NameNotFoundException -> 0x0083 }
            r6 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r4 = r4.getApplicationInfo(r5, r6)     // Catch:{ NameNotFoundException -> 0x0083 }
            if (r4 == 0) goto L_0x0081
            android.os.Bundle r4 = r4.metaData     // Catch:{ NameNotFoundException -> 0x0083 }
            if (r4 == 0) goto L_0x0081
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ NameNotFoundException -> 0x0083 }
            java.lang.String r6 = "com.android.vending.splits.required"
            java.lang.Object r4 = r4.get(r6)     // Catch:{ NameNotFoundException -> 0x0083 }
            boolean r4 = r5.equals(r4)     // Catch:{ NameNotFoundException -> 0x0083 }
            if (r4 == 0) goto L_0x0081
            android.content.Context r4 = r7.f20988a     // Catch:{ NameNotFoundException -> 0x0056 }
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0056 }
            android.content.Context r5 = r7.f20988a     // Catch:{ NameNotFoundException -> 0x0056 }
            java.lang.String r5 = r5.getPackageName()     // Catch:{ NameNotFoundException -> 0x0056 }
            android.content.pm.PackageInfo r4 = r4.getPackageInfo(r5, r3)     // Catch:{ NameNotFoundException -> 0x0056 }
            java.util.HashSet r5 = new java.util.HashSet     // Catch:{ NameNotFoundException -> 0x0056 }
            r5.<init>()     // Catch:{ NameNotFoundException -> 0x0056 }
            if (r4 == 0) goto L_0x006b
            java.lang.String[] r4 = r4.splitNames     // Catch:{ NameNotFoundException -> 0x0056 }
            if (r4 == 0) goto L_0x006b
            java.util.Collections.addAll(r5, r4)     // Catch:{ NameNotFoundException -> 0x0056 }
            goto L_0x006b
        L_0x0056:
            pq7 r4 = f20987e     // Catch:{ all -> 0x01b4 }
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ all -> 0x01b4 }
            android.content.Context r6 = r7.f20988a     // Catch:{ all -> 0x01b4 }
            java.lang.String r6 = r6.getPackageName()     // Catch:{ all -> 0x01b4 }
            r5[r3] = r6     // Catch:{ all -> 0x01b4 }
            java.lang.String r6 = "App '%s' is not found in PackageManager"
            r4.mo46856e(r6, r5)     // Catch:{ all -> 0x01b4 }
            java.util.Set r5 = java.util.Collections.emptySet()     // Catch:{ all -> 0x01b4 }
        L_0x006b:
            boolean r4 = r5.isEmpty()     // Catch:{ all -> 0x01b4 }
            if (r4 != 0) goto L_0x007f
            int r4 = r5.size()     // Catch:{ all -> 0x01b4 }
            if (r4 != r2) goto L_0x0081
            java.lang.String r4 = ""
            boolean r4 = r5.contains(r4)     // Catch:{ all -> 0x01b4 }
            if (r4 == 0) goto L_0x0081
        L_0x007f:
            r4 = r2
            goto L_0x0095
        L_0x0081:
            r4 = r3
            goto L_0x0095
        L_0x0083:
            pq7 r4 = f20987e     // Catch:{ all -> 0x01b4 }
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ all -> 0x01b4 }
            android.content.Context r6 = r7.f20988a     // Catch:{ all -> 0x01b4 }
            java.lang.String r6 = r6.getPackageName()     // Catch:{ all -> 0x01b4 }
            r5[r3] = r6     // Catch:{ all -> 0x01b4 }
            java.lang.String r6 = "App '%s' is not found in the PackageManager"
            r4.mo46856e(r6, r5)     // Catch:{ all -> 0x01b4 }
            goto L_0x0081
        L_0x0095:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x01b4 }
            r1.set(r4)     // Catch:{ all -> 0x01b4 }
        L_0x009c:
            java.util.concurrent.atomic.AtomicReference<java.lang.Boolean> r1 = r7.f20991d     // Catch:{ all -> 0x01b4 }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x01b4 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x01b4 }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x01b4 }
            monitor-exit(r0)     // Catch:{ all -> 0x01b4 }
            if (r1 == 0) goto L_0x01a1
            java.util.List r0 = r7.mo29046b()
            java.util.Iterator r0 = r0.iterator()
        L_0x00b3:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00f5
            java.lang.Object r1 = r0.next()
            android.app.ActivityManager$AppTask r1 = (android.app.ActivityManager.AppTask) r1
            android.app.ActivityManager$RecentTaskInfo r4 = r1.getTaskInfo()
            if (r4 == 0) goto L_0x00b3
            android.app.ActivityManager$RecentTaskInfo r4 = r1.getTaskInfo()
            android.content.Intent r4 = r4.baseIntent
            if (r4 == 0) goto L_0x00b3
            android.app.ActivityManager$RecentTaskInfo r4 = r1.getTaskInfo()
            android.content.Intent r4 = r4.baseIntent
            android.content.ComponentName r4 = r4.getComponent()
            if (r4 == 0) goto L_0x00b3
            android.app.ActivityManager$RecentTaskInfo r1 = r1.getTaskInfo()
            android.content.Intent r1 = r1.baseIntent
            android.content.ComponentName r1 = r1.getComponent()
            java.lang.String r1 = r1.getClassName()
            java.lang.Class<com.google.android.play.core.missingsplits.PlayCoreMissingSplitsActivity> r4 = com.google.android.play.core.missingsplits.PlayCoreMissingSplitsActivity.class
            java.lang.String r4 = r4.getName()
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x00b3
            goto L_0x01a0
        L_0x00f5:
            java.util.List r0 = r7.mo29046b()
            java.util.Iterator r0 = r0.iterator()
        L_0x00fd:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0155
            java.lang.Object r1 = r0.next()
            android.app.ActivityManager$AppTask r1 = (android.app.ActivityManager.AppTask) r1
            android.app.ActivityManager$RecentTaskInfo r1 = r1.getTaskInfo()
            if (r1 == 0) goto L_0x00fd
            android.content.Intent r4 = r1.baseIntent
            if (r4 == 0) goto L_0x00fd
            android.content.ComponentName r4 = r4.getComponent()
            if (r4 == 0) goto L_0x00fd
            android.content.Intent r1 = r1.baseIntent
            android.content.ComponentName r1 = r1.getComponent()
            java.lang.String r4 = r1.getClassName()
            java.lang.Class r1 = java.lang.Class.forName(r4)     // Catch:{ ClassNotFoundException -> 0x013d }
        L_0x0127:
            if (r1 == 0) goto L_0x00fd
            java.lang.Class<android.app.Activity> r4 = android.app.Activity.class
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x0133
        L_0x0131:
            r0 = r2
            goto L_0x0156
        L_0x0133:
            java.lang.Class r4 = r1.getSuperclass()
            if (r4 == r1) goto L_0x013b
            r1 = r4
            goto L_0x0127
        L_0x013b:
            r1 = 0
            goto L_0x0127
        L_0x013d:
            pq7 r5 = f20987e
            java.lang.Object[] r6 = new java.lang.Object[r2]
            r6[r3] = r4
            java.lang.String r4 = "ClassNotFoundException when scanning class hierarchy of '%s'"
            r5.mo46856e(r4, r6)
            android.content.Context r4 = r7.f20988a     // Catch:{ NameNotFoundException -> 0x00fd }
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch:{ NameNotFoundException -> 0x00fd }
            android.content.pm.ActivityInfo r1 = r4.getActivityInfo(r1, r3)     // Catch:{ NameNotFoundException -> 0x00fd }
            if (r1 == 0) goto L_0x00fd
            goto L_0x0131
        L_0x0155:
            r0 = r3
        L_0x0156:
            fq7 r1 = r7.f20990c
            r1.mo42645b()
            java.util.List r1 = r7.mo29046b()
            java.util.Iterator r1 = r1.iterator()
        L_0x0163:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0173
            java.lang.Object r4 = r1.next()
            android.app.ActivityManager$AppTask r4 = (android.app.ActivityManager.AppTask) r4
            r4.finishAndRemoveTask()
            goto L_0x0163
        L_0x0173:
            if (r0 == 0) goto L_0x019b
            android.content.Context r0 = r7.f20988a
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            android.content.ComponentName r1 = new android.content.ComponentName
            android.content.Context r4 = r7.f20988a
            java.lang.Class<com.google.android.play.core.missingsplits.PlayCoreMissingSplitsActivity> r5 = com.google.android.play.core.missingsplits.PlayCoreMissingSplitsActivity.class
            r1.<init>(r4, r5)
            r0.setComponentEnabledSetting(r1, r2, r2)
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r1 = r7.f20988a
            java.lang.Class<com.google.android.play.core.missingsplits.PlayCoreMissingSplitsActivity> r4 = com.google.android.play.core.missingsplits.PlayCoreMissingSplitsActivity.class
            r0.<init>(r1, r4)
            r1 = 884998144(0x34c00000, float:3.5762787E-7)
            android.content.Intent r0 = r0.addFlags(r1)
            android.content.Context r1 = r7.f20988a
            r1.startActivity(r0)
        L_0x019b:
            java.lang.Runtime r0 = r7.f20989b
            r0.exit(r3)
        L_0x01a0:
            return r2
        L_0x01a1:
            fq7 r0 = r7.f20990c
            boolean r0 = r0.mo42644a()
            if (r0 == 0) goto L_0x01b3
            fq7 r0 = r7.f20990c
            r0.mo42646c()
            java.lang.Runtime r0 = r7.f20989b
            r0.exit(r3)
        L_0x01b3:
            return r3
        L_0x01b4:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x01b4 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.as7.mo29045a():boolean");
    }

    @TargetApi(21)
    /* renamed from: b */
    public final List<ActivityManager.AppTask> mo29046b() {
        List<ActivityManager.AppTask> appTasks = ((ActivityManager) this.f20988a.getSystemService("activity")).getAppTasks();
        return appTasks != null ? appTasks : Collections.emptyList();
    }
}
