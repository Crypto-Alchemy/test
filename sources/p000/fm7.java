package p000;

import android.content.Context;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* renamed from: fm7 */
/* compiled from: WorkDatabasePathHelper */
public class fm7 {

    /* renamed from: a */
    public static final String f11943a = qk3.m25728f("WrkDbPathHelper");

    /* renamed from: b */
    public static final String[] f11944b = {"-journal", "-shm", "-wal"};

    /* renamed from: a */
    public static File m17129a(Context context) {
        return m17131c(context, "androidx.work.workdb");
    }

    /* renamed from: b */
    public static File m17130b(Context context) {
        return context.getDatabasePath("androidx.work.workdb");
    }

    /* renamed from: c */
    public static File m17131c(Context context, String str) {
        return new File(context.getNoBackupFilesDir(), str);
    }

    /* renamed from: d */
    public static String m17132d() {
        return "androidx.work.workdb";
    }

    /* renamed from: e */
    public static void m17133e(Context context) {
        String str;
        if (m17130b(context).exists()) {
            qk3.m25726c().mo25135a(f11943a, "Migrating WorkDatabase to the no-backup directory", new Throwable[0]);
            Map<File, File> f = m17134f(context);
            for (File next : f.keySet()) {
                File file = f.get(next);
                if (next.exists() && file != null) {
                    if (file.exists()) {
                        qk3.m25726c().mo25139h(f11943a, String.format("Over-writing contents of %s", new Object[]{file}), new Throwable[0]);
                    }
                    if (next.renameTo(file)) {
                        str = String.format("Migrated %s to %s", new Object[]{next, file});
                    } else {
                        str = String.format("Renaming %s to %s failed", new Object[]{next, file});
                    }
                    qk3.m25726c().mo25135a(f11943a, str, new Throwable[0]);
                }
            }
        }
    }

    /* renamed from: f */
    public static Map<File, File> m17134f(Context context) {
        HashMap hashMap = new HashMap();
        File b = m17130b(context);
        File a = m17129a(context);
        hashMap.put(b, a);
        for (String str : f11944b) {
            hashMap.put(new File(b.getPath() + str), new File(a.getPath() + str));
        }
        return hashMap;
    }
}
