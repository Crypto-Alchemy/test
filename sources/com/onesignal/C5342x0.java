package com.onesignal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.HandlerThread;
import com.onesignal.OneSignal;
import java.util.HashMap;
import java.util.Set;

/* renamed from: com.onesignal.x0 */
/* compiled from: OneSignalPrefs */
public class C5342x0 {

    /* renamed from: a */
    public static final String f26571a = OneSignal.class.getSimpleName();

    /* renamed from: b */
    public static HashMap<String, HashMap<String, Object>> f26572b;

    /* renamed from: c */
    public static C5343a f26573c;

    /* renamed from: com.onesignal.x0$a */
    /* compiled from: OneSignalPrefs */
    public static class C5343a extends HandlerThread {

        /* renamed from: a */
        public Handler f26574a;

        /* renamed from: d */
        public long f26575d = 0;

        /* renamed from: e */
        public boolean f26576e;

        /* renamed from: com.onesignal.x0$a$a */
        /* compiled from: OneSignalPrefs */
        public class C5344a implements Runnable {
            public C5344a() {
            }

            public void run() {
                C5343a.this.mo39159c();
            }
        }

        public C5343a(String str) {
            super(str);
        }

        /* renamed from: c */
        public final void mo39159c() {
            for (String next : C5342x0.f26572b.keySet()) {
                SharedPreferences.Editor edit = C5342x0.m41394e(next).edit();
                HashMap hashMap = C5342x0.f26572b.get(next);
                synchronized (hashMap) {
                    for (String str : hashMap.keySet()) {
                        Object obj = hashMap.get(str);
                        if (obj instanceof String) {
                            edit.putString(str, (String) obj);
                        } else if (obj instanceof Boolean) {
                            edit.putBoolean(str, ((Boolean) obj).booleanValue());
                        } else if (obj instanceof Integer) {
                            edit.putInt(str, ((Integer) obj).intValue());
                        } else if (obj instanceof Long) {
                            edit.putLong(str, ((Long) obj).longValue());
                        } else if (obj instanceof Set) {
                            edit.putStringSet(str, (Set) obj);
                        } else if (obj == null) {
                            edit.remove(str);
                        }
                    }
                    hashMap.clear();
                }
                edit.apply();
            }
            this.f26575d = OneSignal.m40443w0().mo46064a();
        }

        /* renamed from: d */
        public final synchronized void mo39160d() {
            Handler handler = this.f26574a;
            if (handler != null) {
                handler.removeCallbacksAndMessages((Object) null);
                if (this.f26575d == 0) {
                    this.f26575d = OneSignal.m40443w0().mo46064a();
                }
                C5344a aVar = new C5344a();
                this.f26574a.postDelayed(aVar, (this.f26575d - OneSignal.m40443w0().mo46064a()) + 200);
            }
        }

        /* renamed from: e */
        public final synchronized void mo39161e() {
            if (OneSignal.f26030e != null) {
                mo39162f();
                mo39160d();
            }
        }

        /* renamed from: f */
        public final void mo39162f() {
            if (!this.f26576e) {
                start();
                this.f26576e = true;
            }
        }

        public void onLooperPrepared() {
            super.onLooperPrepared();
            this.f26574a = new Handler(getLooper());
            mo39160d();
        }
    }

    static {
        m41397h();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002a, code lost:
        r4 = m41394e(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002e, code lost:
        if (r4 == null) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0036, code lost:
        if (r6.equals(java.lang.String.class) == false) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003e, code lost:
        return r4.getString(r5, (java.lang.String) r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0045, code lost:
        if (r6.equals(java.lang.Boolean.class) == false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0055, code lost:
        return java.lang.Boolean.valueOf(r4.getBoolean(r5, ((java.lang.Boolean) r7).booleanValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005c, code lost:
        if (r6.equals(java.lang.Integer.class) == false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006c, code lost:
        return java.lang.Integer.valueOf(r4.getInt(r5, ((java.lang.Integer) r7).intValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0073, code lost:
        if (r6.equals(java.lang.Long.class) == false) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0083, code lost:
        return java.lang.Long.valueOf(r4.getLong(r5, ((java.lang.Long) r7).longValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008a, code lost:
        if (r6.equals(java.util.Set.class) == false) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0092, code lost:
        return r4.getStringSet(r5, (java.util.Set) r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0097, code lost:
        if (r6.equals(r0) == false) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a1, code lost:
        return java.lang.Boolean.valueOf(r4.contains(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a2, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a4, code lost:
        return r7;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object m41390a(java.lang.String r4, java.lang.String r5, java.lang.Class r6, java.lang.Object r7) {
        /*
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, java.lang.Object>> r1 = f26572b
            java.lang.Object r1 = r1.get(r4)
            java.util.HashMap r1 = (java.util.HashMap) r1
            monitor-enter(r1)
            boolean r2 = r6.equals(r0)     // Catch:{ all -> 0x00a7 }
            if (r2 == 0) goto L_0x001b
            boolean r2 = r1.containsKey(r5)     // Catch:{ all -> 0x00a7 }
            if (r2 == 0) goto L_0x001b
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00a7 }
            monitor-exit(r1)     // Catch:{ all -> 0x00a7 }
            return r4
        L_0x001b:
            java.lang.Object r2 = r1.get(r5)     // Catch:{ all -> 0x00a7 }
            if (r2 != 0) goto L_0x00a5
            boolean r3 = r1.containsKey(r5)     // Catch:{ all -> 0x00a7 }
            if (r3 == 0) goto L_0x0029
            goto L_0x00a5
        L_0x0029:
            monitor-exit(r1)     // Catch:{ all -> 0x00a7 }
            android.content.SharedPreferences r4 = m41394e(r4)
            if (r4 == 0) goto L_0x00a4
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x003f
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r4 = r4.getString(r5, r7)
            return r4
        L_0x003f:
            java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x0056
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r6 = r7.booleanValue()
            boolean r4 = r4.getBoolean(r5, r6)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        L_0x0056:
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x006d
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r6 = r7.intValue()
            int r4 = r4.getInt(r5, r6)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            return r4
        L_0x006d:
            java.lang.Class<java.lang.Long> r1 = java.lang.Long.class
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x0084
            java.lang.Long r7 = (java.lang.Long) r7
            long r6 = r7.longValue()
            long r4 = r4.getLong(r5, r6)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            return r4
        L_0x0084:
            java.lang.Class<java.util.Set> r1 = java.util.Set.class
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x0093
            java.util.Set r7 = (java.util.Set) r7
            java.util.Set r4 = r4.getStringSet(r5, r7)
            return r4
        L_0x0093:
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x00a2
            boolean r4 = r4.contains(r5)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        L_0x00a2:
            r4 = 0
            return r4
        L_0x00a4:
            return r7
        L_0x00a5:
            monitor-exit(r1)     // Catch:{ all -> 0x00a7 }
            return r2
        L_0x00a7:
            r4 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00a7 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.C5342x0.m41390a(java.lang.String, java.lang.String, java.lang.Class, java.lang.Object):java.lang.Object");
    }

    /* renamed from: b */
    public static boolean m41391b(String str, String str2, boolean z) {
        return ((Boolean) m41390a(str, str2, Boolean.class, Boolean.valueOf(z))).booleanValue();
    }

    /* renamed from: c */
    public static int m41392c(String str, String str2, int i) {
        return ((Integer) m41390a(str, str2, Integer.class, Integer.valueOf(i))).intValue();
    }

    /* renamed from: d */
    public static long m41393d(String str, String str2, long j) {
        return ((Long) m41390a(str, str2, Long.class, Long.valueOf(j))).longValue();
    }

    /* renamed from: e */
    public static synchronized SharedPreferences m41394e(String str) {
        synchronized (C5342x0.class) {
            Context context = OneSignal.f26030e;
            if (context == null) {
                OneSignal.m40379b(OneSignal.LOG_LEVEL.WARN, "OneSignal.appContext null, could not read " + str + " from getSharedPreferences.", new Throwable());
                return null;
            }
            SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
            return sharedPreferences;
        }
    }

    /* renamed from: f */
    public static String m41395f(String str, String str2, String str3) {
        return (String) m41390a(str, str2, String.class, str3);
    }

    /* renamed from: g */
    public static Set<String> m41396g(String str, String str2, Set<String> set) {
        return (Set) m41390a(str, str2, Set.class, set);
    }

    /* renamed from: h */
    public static void m41397h() {
        HashMap<String, HashMap<String, Object>> hashMap = new HashMap<>();
        f26572b = hashMap;
        hashMap.put(f26571a, new HashMap());
        f26572b.put("GTPlayerPurchases", new HashMap());
        f26572b.put("OneSignalTriggers", new HashMap());
        f26573c = new C5343a("OSH_WritePrefs");
    }

    /* renamed from: i */
    public static void m41398i(String str, String str2, Object obj) {
        HashMap hashMap = f26572b.get(str);
        synchronized (hashMap) {
            hashMap.put(str2, obj);
        }
        m41404o();
    }

    /* renamed from: j */
    public static void m41399j(String str, String str2, boolean z) {
        m41398i(str, str2, Boolean.valueOf(z));
    }

    /* renamed from: k */
    public static void m41400k(String str, String str2, int i) {
        m41398i(str, str2, Integer.valueOf(i));
    }

    /* renamed from: l */
    public static void m41401l(String str, String str2, long j) {
        m41398i(str, str2, Long.valueOf(j));
    }

    /* renamed from: m */
    public static void m41402m(String str, String str2, String str3) {
        m41398i(str, str2, str3);
    }

    /* renamed from: n */
    public static void m41403n(String str, String str2, Set<String> set) {
        m41398i(str, str2, set);
    }

    /* renamed from: o */
    public static void m41404o() {
        f26573c.mo39161e();
    }
}
