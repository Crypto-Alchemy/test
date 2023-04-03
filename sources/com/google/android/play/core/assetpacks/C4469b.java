package com.google.android.play.core.assetpacks;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.play.core.assetpacks.b */
public final class C4469b {

    /* renamed from: c */
    public static final pq7 f24708c = new pq7("AssetPackStorage");

    /* renamed from: d */
    public static final long f24709d;

    /* renamed from: e */
    public static final long f24710e;

    /* renamed from: a */
    public final Context f24711a;

    /* renamed from: b */
    public final lu7 f24712b;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        f24709d = timeUnit.toMillis(14);
        f24710e = timeUnit.toMillis(28);
    }

    public C4469b(Context context, lu7 lu7) {
        this.f24711a = context;
        this.f24712b = lu7;
    }

    /* renamed from: g */
    public static void m36375g(File file) {
        if (file.listFiles() != null && file.listFiles().length > 1) {
            long j = m36378j(file);
            for (File file2 : file.listFiles()) {
                if (!file2.getName().equals(String.valueOf(j)) && !file2.getName().equals("stale.tmp")) {
                    m36379o(file2);
                }
            }
        }
    }

    /* renamed from: h */
    public static long m36376h(File file) {
        return m36377i(file, true);
    }

    /* renamed from: i */
    public static long m36377i(File file, boolean z) {
        if (!file.exists()) {
            return -1;
        }
        ArrayList arrayList = new ArrayList();
        if (z && file.listFiles().length > 1) {
            f24708c.mo46856e("Multiple pack versions found, using highest version code.", new Object[0]);
        }
        try {
            for (File file2 : file.listFiles()) {
                if (!file2.getName().equals("stale.tmp")) {
                    arrayList.add(Long.valueOf(file2.getName()));
                }
            }
        } catch (NumberFormatException e) {
            f24708c.mo46854c(e, "Corrupt asset pack directories.", new Object[0]);
        }
        if (arrayList.isEmpty()) {
            return -1;
        }
        Collections.sort(arrayList);
        return ((Long) arrayList.get(arrayList.size() - 1)).longValue();
    }

    /* renamed from: j */
    public static long m36378j(File file) {
        return m36377i(file, false);
    }

    /* renamed from: o */
    public static boolean m36379o(File file) {
        boolean z;
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            z = true;
            for (File o : listFiles) {
                z &= m36379o(o);
            }
        } else {
            z = true;
        }
        return file.delete() && true == z;
    }

    /* renamed from: A */
    public final File mo34153A(String str, int i, long j, String str2) {
        return new File(mo34155C(str, i, j, str2), "checkpoint.dat");
    }

    /* renamed from: B */
    public final File mo34154B(String str, int i, long j, String str2) {
        return new File(mo34155C(str, i, j, str2), "checkpoint_ext.dat");
    }

    /* renamed from: C */
    public final File mo34155C(String str, int i, long j, String str2) {
        return new File(mo34156D(str, i, j), str2);
    }

    /* renamed from: D */
    public final File mo34156D(String str, int i, long j) {
        return new File(new File(mo34171l(str, i, j), "_slices"), "_metadata");
    }

    /* renamed from: E */
    public final void mo34157E(String str, int i, long j) {
        File e = mo34168e(str);
        if (e.exists()) {
            for (File file : e.listFiles()) {
                if (!file.getName().equals(String.valueOf(i)) && !file.getName().equals("stale.tmp")) {
                    m36379o(file);
                } else if (file.getName().equals(String.valueOf(i))) {
                    for (File file2 : file.listFiles()) {
                        if (!file2.getName().equals(String.valueOf(j))) {
                            m36379o(file2);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: F */
    public final void mo34158F() {
        for (File next : mo34170k()) {
            if (next.listFiles() != null) {
                m36375g(next);
                long j = m36378j(next);
                if (((long) this.f24712b.mo45535a()) != j) {
                    try {
                        new File(new File(next, String.valueOf(j)), "stale.tmp").createNewFile();
                    } catch (IOException unused) {
                        f24708c.mo46853b("Could not write staleness marker.", new Object[0]);
                    }
                }
                for (File g : next.listFiles()) {
                    m36375g(g);
                }
            }
        }
    }

    /* renamed from: G */
    public final int mo34159G(String str) {
        return (int) m36376h(mo34168e(str));
    }

    /* renamed from: H */
    public final long mo34160H(String str) {
        return m36376h(mo34167d(str, mo34159G(str)));
    }

    /* renamed from: I */
    public final void mo34161I() {
        for (File next : mo34170k()) {
            if (next.listFiles() != null) {
                for (File file : next.listFiles()) {
                    File file2 = new File(file, "stale.tmp");
                    if (file2.exists() && System.currentTimeMillis() - file2.lastModified() > f24710e) {
                        m36379o(file);
                    }
                }
            }
        }
    }

    /* renamed from: J */
    public final void mo34162J() {
        if (mo34172m().exists()) {
            for (File file : mo34172m().listFiles()) {
                if (System.currentTimeMillis() - file.lastModified() > f24709d) {
                    m36379o(file);
                } else {
                    m36375g(file);
                }
            }
        }
    }

    /* renamed from: K */
    public final void mo34163K() {
        m36379o(mo34173n());
    }

    /* renamed from: a */
    public final void mo34164a(List<String> list) {
        int a = this.f24712b.mo45535a();
        for (File next : mo34170k()) {
            if (!list.contains(next.getName()) && m36376h(next) != ((long) a)) {
                m36379o(next);
            }
        }
    }

    /* renamed from: b */
    public final void mo34165b(String str, int i, long j) {
        if (mo34171l(str, i, j).exists()) {
            m36379o(mo34171l(str, i, j));
        }
    }

    /* renamed from: c */
    public final void mo34166c(String str, int i, long j) {
        if (mo34178t(str, i, j).exists()) {
            m36379o(mo34178t(str, i, j));
        }
    }

    /* renamed from: d */
    public final File mo34167d(String str, int i) {
        return new File(mo34168e(str), String.valueOf(i));
    }

    /* renamed from: e */
    public final File mo34168e(String str) {
        return new File(mo34173n(), str);
    }

    /* renamed from: f */
    public final File mo34169f(String str, int i, long j) {
        return new File(mo34182x(str, i, j), "merge.tmp");
    }

    /* renamed from: k */
    public final List<File> mo34170k() {
        ArrayList arrayList = new ArrayList();
        try {
            if (mo34173n().exists()) {
                if (mo34173n().listFiles() != null) {
                    for (File file : mo34173n().listFiles()) {
                        if (!file.getCanonicalPath().equals(mo34172m().getCanonicalPath())) {
                            arrayList.add(file);
                        }
                    }
                    return arrayList;
                }
            }
            return arrayList;
        } catch (IOException e) {
            f24708c.mo46853b("Could not process directory while scanning installed packs. %s", e);
        }
    }

    /* renamed from: l */
    public final File mo34171l(String str, int i, long j) {
        return new File(new File(new File(mo34172m(), str), String.valueOf(i)), String.valueOf(j));
    }

    /* renamed from: m */
    public final File mo34172m() {
        return new File(mo34173n(), "_tmp");
    }

    /* renamed from: n */
    public final File mo34173n() {
        return new File(this.f24711a.getFilesDir(), "assetpacks");
    }

    /* renamed from: p */
    public final Map<String, C6289nr> mo34174p() {
        HashMap hashMap = new HashMap();
        try {
            for (File next : mo34170k()) {
                C6289nr r = mo34176r(next.getName());
                if (r != null) {
                    hashMap.put(next.getName(), r);
                }
            }
        } catch (IOException e) {
            f24708c.mo46853b("Could not process directory while scanning installed packs: %s", e);
        }
        return hashMap;
    }

    /* renamed from: q */
    public final Map<String, Long> mo34175q() {
        HashMap hashMap = new HashMap();
        for (String next : mo34174p().keySet()) {
            hashMap.put(next, Long.valueOf(mo34160H(next)));
        }
        return hashMap;
    }

    /* renamed from: r */
    public final C6289nr mo34176r(String str) throws IOException {
        String s = mo34177s(str);
        if (s == null) {
            return null;
        }
        File file = new File(s, "assets");
        if (file.isDirectory()) {
            return C6289nr.m48922b(s, file.getCanonicalPath());
        }
        f24708c.mo46853b("Failed to find assets directory: %s", file);
        return null;
    }

    /* renamed from: s */
    public final String mo34177s(String str) throws IOException {
        int length;
        File file = new File(mo34173n(), str);
        if (!file.exists()) {
            f24708c.mo46852a("Pack not found with pack name: %s", str);
            return null;
        }
        File file2 = new File(file, String.valueOf(this.f24712b.mo45535a()));
        if (!file2.exists()) {
            f24708c.mo46852a("Pack not found with pack name: %s app version: %s", str, Integer.valueOf(this.f24712b.mo45535a()));
            return null;
        }
        File[] listFiles = file2.listFiles();
        if (listFiles == null || (length = listFiles.length) == 0) {
            f24708c.mo46852a("No pack version found for pack name: %s app version: %s", str, Integer.valueOf(this.f24712b.mo45535a()));
            return null;
        } else if (length <= 1) {
            return listFiles[0].getCanonicalPath();
        } else {
            f24708c.mo46853b("Multiple pack versions found for pack name: %s app version: %s", str, Integer.valueOf(this.f24712b.mo45535a()));
            return null;
        }
    }

    /* renamed from: t */
    public final File mo34178t(String str, int i, long j) {
        return new File(mo34167d(str, i), String.valueOf(j));
    }

    /* renamed from: u */
    public final File mo34179u(String str, int i, long j) {
        return new File(mo34178t(str, i, j), "_metadata");
    }

    /* renamed from: v */
    public final File mo34180v(String str, int i, long j, String str2) {
        return new File(new File(new File(mo34171l(str, i, j), "_slices"), "_unverified"), str2);
    }

    /* renamed from: w */
    public final File mo34181w(String str, int i, long j, String str2) {
        return new File(new File(new File(mo34171l(str, i, j), "_slices"), "_verified"), str2);
    }

    /* renamed from: x */
    public final File mo34182x(String str, int i, long j) {
        return new File(mo34171l(str, i, j), "_packs");
    }

    /* renamed from: y */
    public final int mo34183y(String str, int i, long j) throws IOException {
        File f = mo34169f(str, i, j);
        if (!f.exists()) {
            return 0;
        }
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(f);
        try {
            properties.load(fileInputStream);
            fileInputStream.close();
            if (properties.getProperty("numberOfMerges") != null) {
                try {
                    return Integer.parseInt(properties.getProperty("numberOfMerges"));
                } catch (NumberFormatException e) {
                    throw new C4470bj("Merge checkpoint file corrupt.", (Exception) e);
                }
            } else {
                throw new C4470bj("Merge checkpoint file corrupt.");
            }
        } catch (Throwable th) {
            mt7.m48481a(th, th);
        }
        throw th;
    }

    /* renamed from: z */
    public final void mo34184z(String str, int i, long j, int i2) throws IOException {
        File f = mo34169f(str, i, j);
        Properties properties = new Properties();
        properties.put("numberOfMerges", String.valueOf(i2));
        f.getParentFile().mkdirs();
        f.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(f);
        properties.store(fileOutputStream, (String) null);
        fileOutputStream.close();
    }
}
