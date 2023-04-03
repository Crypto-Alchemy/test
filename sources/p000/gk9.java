package p000;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* renamed from: gk9 */
public class gk9 {

    /* renamed from: a */
    public static final Uri f29248a = Uri.parse("content://com.google.android.gsf.gservices");

    /* renamed from: b */
    public static final Uri f29249b = Uri.parse("content://com.google.android.gsf.gservices/prefix");

    /* renamed from: c */
    public static final Pattern f29250c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    /* renamed from: d */
    public static final Pattern f29251d = Pattern.compile("^(0|false|f|off|no|n)$", 2);

    /* renamed from: e */
    public static final AtomicBoolean f29252e = new AtomicBoolean();

    /* renamed from: f */
    public static HashMap<String, String> f29253f;

    /* renamed from: g */
    public static final HashMap<String, Boolean> f29254g = new HashMap<>();

    /* renamed from: h */
    public static final HashMap<String, Integer> f29255h = new HashMap<>();

    /* renamed from: i */
    public static final HashMap<String, Long> f29256i = new HashMap<>();

    /* renamed from: j */
    public static final HashMap<String, Float> f29257j = new HashMap<>();

    /* renamed from: k */
    public static Object f29258k;

    /* renamed from: l */
    public static boolean f29259l;

    /* renamed from: m */
    public static String[] f29260m = new String[0];

    /* renamed from: a */
    public static long m44741a(ContentResolver contentResolver, String str, long j) {
        Object i = m44749i(contentResolver);
        long j2 = 0;
        Long l = (Long) m44742b(f29256i, str, 0L);
        if (l != null) {
            return l.longValue();
        }
        String c = m44743c(contentResolver, str, (String) null);
        if (c != null) {
            try {
                long parseLong = Long.parseLong(c);
                l = Long.valueOf(parseLong);
                j2 = parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        m44747g(i, f29256i, str, l);
        return j2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
        return r4;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> T m44742b(java.util.HashMap<java.lang.String, T> r2, java.lang.String r3, T r4) {
        /*
            java.lang.Class<gk9> r0 = p000.gk9.class
            monitor-enter(r0)
            boolean r1 = r2.containsKey(r3)     // Catch:{ all -> 0x0015 }
            if (r1 == 0) goto L_0x0012
            java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x0015 }
            if (r2 == 0) goto L_0x0010
            r4 = r2
        L_0x0010:
            monitor-exit(r0)     // Catch:{ all -> 0x0015 }
            return r4
        L_0x0012:
            monitor-exit(r0)     // Catch:{ all -> 0x0015 }
            r2 = 0
            return r2
        L_0x0015:
            r2 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0015 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.gk9.m44742b(java.util.HashMap, java.lang.String, java.lang.Object):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005b, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0062, code lost:
        r13 = r13.query(f29248a, (java.lang.String[]) null, (java.lang.String) null, new java.lang.String[]{r14}, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0070, code lost:
        if (r13 == null) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0076, code lost:
        if (r13.moveToFirst() != false) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0079, code lost:
        r15 = r13.getString(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007d, code lost:
        if (r15 == null) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0083, code lost:
        if (r15.equals((java.lang.Object) null) == false) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0085, code lost:
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0086, code lost:
        m44746f(r0, r14, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0089, code lost:
        if (r15 == null) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x008b, code lost:
        r2 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x008c, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x008f, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        m44746f(r0, r14, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0093, code lost:
        if (r13 == null) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0095, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0098, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0099, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x009a, code lost:
        if (r13 != null) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x009c, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x009f, code lost:
        throw r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        return r2;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m44743c(android.content.ContentResolver r13, java.lang.String r14, java.lang.String r15) {
        /*
            java.lang.Class<gk9> r15 = p000.gk9.class
            monitor-enter(r15)
            m44745e(r13)     // Catch:{ all -> 0x00a0 }
            java.lang.Object r0 = f29258k     // Catch:{ all -> 0x00a0 }
            java.util.HashMap<java.lang.String, java.lang.String> r1 = f29253f     // Catch:{ all -> 0x00a0 }
            boolean r1 = r1.containsKey(r14)     // Catch:{ all -> 0x00a0 }
            r2 = 0
            if (r1 == 0) goto L_0x001e
            java.util.HashMap<java.lang.String, java.lang.String> r13 = f29253f     // Catch:{ all -> 0x00a0 }
            java.lang.Object r13 = r13.get(r14)     // Catch:{ all -> 0x00a0 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x00a0 }
            if (r13 == 0) goto L_0x001c
            r2 = r13
        L_0x001c:
            monitor-exit(r15)     // Catch:{ all -> 0x00a0 }
            return r2
        L_0x001e:
            java.lang.String[] r1 = f29260m     // Catch:{ all -> 0x00a0 }
            int r3 = r1.length     // Catch:{ all -> 0x00a0 }
            r4 = 0
            r5 = r4
        L_0x0023:
            r6 = 1
            if (r5 >= r3) goto L_0x0061
            r7 = r1[r5]     // Catch:{ all -> 0x00a0 }
            boolean r7 = r14.startsWith(r7)     // Catch:{ all -> 0x00a0 }
            if (r7 == 0) goto L_0x005e
            boolean r0 = f29259l     // Catch:{ all -> 0x00a0 }
            if (r0 == 0) goto L_0x003a
            java.util.HashMap<java.lang.String, java.lang.String> r0 = f29253f     // Catch:{ all -> 0x00a0 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00a0 }
            if (r0 == 0) goto L_0x005c
        L_0x003a:
            java.lang.String[] r0 = f29260m     // Catch:{ all -> 0x00a0 }
            java.util.HashMap<java.lang.String, java.lang.String> r1 = f29253f     // Catch:{ all -> 0x00a0 }
            java.util.Map r13 = m44744d(r13, r0)     // Catch:{ all -> 0x00a0 }
            r1.putAll(r13)     // Catch:{ all -> 0x00a0 }
            f29259l = r6     // Catch:{ all -> 0x00a0 }
            java.util.HashMap<java.lang.String, java.lang.String> r13 = f29253f     // Catch:{ all -> 0x00a0 }
            boolean r13 = r13.containsKey(r14)     // Catch:{ all -> 0x00a0 }
            if (r13 == 0) goto L_0x005c
            java.util.HashMap<java.lang.String, java.lang.String> r13 = f29253f     // Catch:{ all -> 0x00a0 }
            java.lang.Object r13 = r13.get(r14)     // Catch:{ all -> 0x00a0 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x00a0 }
            if (r13 == 0) goto L_0x005a
            r2 = r13
        L_0x005a:
            monitor-exit(r15)     // Catch:{ all -> 0x00a0 }
            return r2
        L_0x005c:
            monitor-exit(r15)     // Catch:{ all -> 0x00a0 }
            return r2
        L_0x005e:
            int r5 = r5 + 1
            goto L_0x0023
        L_0x0061:
            monitor-exit(r15)     // Catch:{ all -> 0x00a0 }
            android.net.Uri r8 = f29248a
            r9 = 0
            r10 = 0
            java.lang.String[] r11 = new java.lang.String[r6]
            r11[r4] = r14
            r12 = 0
            r7 = r13
            android.database.Cursor r13 = r7.query(r8, r9, r10, r11, r12)
            if (r13 == 0) goto L_0x0090
            boolean r15 = r13.moveToFirst()     // Catch:{ all -> 0x0099 }
            if (r15 != 0) goto L_0x0079
            goto L_0x0090
        L_0x0079:
            java.lang.String r15 = r13.getString(r6)     // Catch:{ all -> 0x0099 }
            if (r15 == 0) goto L_0x0086
            boolean r1 = r15.equals(r2)     // Catch:{ all -> 0x0099 }
            if (r1 == 0) goto L_0x0086
            r15 = r2
        L_0x0086:
            m44746f(r0, r14, r15)     // Catch:{ all -> 0x0099 }
            if (r15 == 0) goto L_0x008c
            r2 = r15
        L_0x008c:
            r13.close()
            return r2
        L_0x0090:
            m44746f(r0, r14, r2)     // Catch:{ all -> 0x0099 }
            if (r13 == 0) goto L_0x0098
            r13.close()
        L_0x0098:
            return r2
        L_0x0099:
            r14 = move-exception
            if (r13 == 0) goto L_0x009f
            r13.close()
        L_0x009f:
            throw r14
        L_0x00a0:
            r13 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x00a0 }
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.gk9.m44743c(android.content.ContentResolver, java.lang.String, java.lang.String):java.lang.String");
    }

    /* renamed from: d */
    public static Map<String, String> m44744d(ContentResolver contentResolver, String... strArr) {
        Cursor query = contentResolver.query(f29249b, (String[]) null, (String) null, strArr, (String) null);
        TreeMap treeMap = new TreeMap();
        if (query == null) {
            return treeMap;
        }
        while (query.moveToNext()) {
            try {
                treeMap.put(query.getString(0), query.getString(1));
            } finally {
                query.close();
            }
        }
        return treeMap;
    }

    /* renamed from: e */
    public static void m44745e(ContentResolver contentResolver) {
        if (f29253f == null) {
            f29252e.set(false);
            f29253f = new HashMap<>();
            f29258k = new Object();
            f29259l = false;
            contentResolver.registerContentObserver(f29248a, true, new nk9((Handler) null));
        } else if (f29252e.getAndSet(false)) {
            f29253f.clear();
            f29254g.clear();
            f29255h.clear();
            f29256i.clear();
            f29257j.clear();
            f29258k = new Object();
            f29259l = false;
        }
    }

    /* renamed from: f */
    public static void m44746f(Object obj, String str, String str2) {
        synchronized (gk9.class) {
            if (obj == f29258k) {
                f29253f.put(str, str2);
            }
        }
    }

    /* renamed from: g */
    public static <T> void m44747g(Object obj, HashMap<String, T> hashMap, String str, T t) {
        synchronized (gk9.class) {
            if (obj == f29258k) {
                hashMap.put(str, t);
                f29253f.remove(str);
            }
        }
    }

    /* renamed from: h */
    public static boolean m44748h(ContentResolver contentResolver, String str, boolean z) {
        Object i = m44749i(contentResolver);
        HashMap<String, Boolean> hashMap = f29254g;
        Boolean bool = (Boolean) m44742b(hashMap, str, Boolean.valueOf(z));
        if (bool != null) {
            return bool.booleanValue();
        }
        String c = m44743c(contentResolver, str, (String) null);
        if (c != null && !c.equals("")) {
            if (f29250c.matcher(c).matches()) {
                z = true;
                bool = Boolean.TRUE;
            } else if (f29251d.matcher(c).matches()) {
                z = false;
                bool = Boolean.FALSE;
            } else {
                StringBuilder sb = new StringBuilder("attempt to read gservices key ");
                sb.append(str);
                sb.append(" (value \"");
                sb.append(c);
                sb.append("\") as boolean");
            }
        }
        m44747g(i, hashMap, str, bool);
        return z;
    }

    /* renamed from: i */
    public static Object m44749i(ContentResolver contentResolver) {
        Object obj;
        synchronized (gk9.class) {
            m44745e(contentResolver);
            obj = f29258k;
        }
        return obj;
    }
}
