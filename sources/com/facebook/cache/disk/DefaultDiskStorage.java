package com.facebook.cache.disk;

import android.os.Environment;
import com.facebook.cache.common.CacheErrorLogger;
import com.facebook.cache.disk.C1916b;
import com.facebook.common.file.FileUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class DefaultDiskStorage implements C1916b {

    /* renamed from: f */
    public static final Class<?> f9419f = DefaultDiskStorage.class;

    /* renamed from: g */
    public static final long f9420g = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a */
    public final File f9421a;

    /* renamed from: b */
    public final boolean f9422b;

    /* renamed from: c */
    public final File f9423c;

    /* renamed from: d */
    public final CacheErrorLogger f9424d;

    /* renamed from: e */
    public final zg0 f9425e = fk6.m17050a();

    public static class IncompleteFileException extends IOException {
        public IncompleteFileException(long j, long j2) {
            super("File was not written completely. Expected: " + j + ", found: " + j2);
        }
    }

    /* renamed from: com.facebook.cache.disk.DefaultDiskStorage$b */
    public class C1909b implements b12 {

        /* renamed from: a */
        public final List<C1916b.C1917a> f9426a;

        public C1909b() {
            this.f9426a = new ArrayList();
        }

        /* renamed from: a */
        public void mo11334a(File file) {
        }

        /* renamed from: b */
        public void mo11335b(File file) {
            C1911d g = DefaultDiskStorage.this.mo13108s(file);
            if (g != null && g.f9432a == ".cnt") {
                this.f9426a.add(new C1910c(g.f9433b, file));
            }
        }

        /* renamed from: c */
        public void mo11336c(File file) {
        }

        /* renamed from: d */
        public List<C1916b.C1917a> mo13114d() {
            return Collections.unmodifiableList(this.f9426a);
        }
    }

    /* renamed from: com.facebook.cache.disk.DefaultDiskStorage$c */
    public static class C1910c implements C1916b.C1917a {

        /* renamed from: a */
        public final String f9428a;

        /* renamed from: b */
        public final m02 f9429b;

        /* renamed from: c */
        public long f9430c;

        /* renamed from: d */
        public long f9431d;

        /* renamed from: a */
        public m02 mo13115a() {
            return this.f9429b;
        }

        public String getId() {
            return this.f9428a;
        }

        public long getSize() {
            if (this.f9430c < 0) {
                this.f9430c = this.f9429b.size();
            }
            return this.f9430c;
        }

        public long getTimestamp() {
            if (this.f9431d < 0) {
                this.f9431d = this.f9429b.mo22993d().lastModified();
            }
            return this.f9431d;
        }

        public C1910c(String str, File file) {
            au4.m10792g(file);
            this.f9428a = (String) au4.m10792g(str);
            this.f9429b = m02.m21926b(file);
            this.f9430c = -1;
            this.f9431d = -1;
        }
    }

    /* renamed from: com.facebook.cache.disk.DefaultDiskStorage$d */
    public static class C1911d {

        /* renamed from: a */
        public final String f9432a;

        /* renamed from: b */
        public final String f9433b;

        /* renamed from: b */
        public static C1911d m13240b(File file) {
            String l;
            String name = file.getName();
            int lastIndexOf = name.lastIndexOf(46);
            if (lastIndexOf <= 0 || (l = DefaultDiskStorage.m13216q(name.substring(lastIndexOf))) == null) {
                return null;
            }
            String substring = name.substring(0, lastIndexOf);
            if (l.equals(".tmp")) {
                int lastIndexOf2 = substring.lastIndexOf(46);
                if (lastIndexOf2 <= 0) {
                    return null;
                }
                substring = substring.substring(0, lastIndexOf2);
            }
            return new C1911d(l, substring);
        }

        /* renamed from: a */
        public File mo13119a(File file) throws IOException {
            return File.createTempFile(this.f9433b + ".", ".tmp", file);
        }

        /* renamed from: c */
        public String mo13120c(String str) {
            return str + File.separator + this.f9433b + this.f9432a;
        }

        public String toString() {
            return this.f9432a + "(" + this.f9433b + ")";
        }

        public C1911d(String str, String str2) {
            this.f9432a = str;
            this.f9433b = str2;
        }
    }

    /* renamed from: com.facebook.cache.disk.DefaultDiskStorage$e */
    public class C1912e implements C1916b.C1918b {

        /* renamed from: a */
        public final String f9434a;

        /* renamed from: b */
        public final File f9435b;

        public C1912e(String str, File file) {
            this.f9434a = str;
            this.f9435b = file;
        }

        /* renamed from: a */
        public l10 mo13122a(Object obj) throws IOException {
            return mo13124c(obj, DefaultDiskStorage.this.f9425e.now());
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: b */
        public void mo13123b(wn7 wn7, Object obj) throws IOException {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(this.f9435b);
                try {
                    ou0 ou0 = new ou0(fileOutputStream);
                    wn7.mo26047a(ou0);
                    ou0.flush();
                    long a = ou0.mo24116a();
                    fileOutputStream.close();
                    if (this.f9435b.length() != a) {
                        throw new IncompleteFileException(a, this.f9435b.length());
                    }
                } catch (Throwable th) {
                    fileOutputStream.close();
                    throw th;
                }
            } catch (FileNotFoundException e) {
                DefaultDiskStorage.this.f9424d.mo13088a(CacheErrorLogger.CacheErrorCategory.WRITE_UPDATE_FILE_NOT_FOUND, DefaultDiskStorage.f9419f, "updateResource", e);
                throw e;
            }
        }

        /* renamed from: c */
        public l10 mo13124c(Object obj, long j) throws IOException {
            CacheErrorLogger.CacheErrorCategory cacheErrorCategory;
            File o = DefaultDiskStorage.this.mo13104o(this.f9434a);
            try {
                FileUtils.m13298b(this.f9435b, o);
                if (o.exists()) {
                    o.setLastModified(j);
                }
                return m02.m21926b(o);
            } catch (FileUtils.RenameException e) {
                Throwable cause = e.getCause();
                if (cause == null) {
                    cacheErrorCategory = CacheErrorLogger.CacheErrorCategory.WRITE_RENAME_FILE_OTHER;
                } else if (cause instanceof FileUtils.ParentDirNotFoundException) {
                    cacheErrorCategory = CacheErrorLogger.CacheErrorCategory.WRITE_RENAME_FILE_TEMPFILE_PARENT_NOT_FOUND;
                } else if (cause instanceof FileNotFoundException) {
                    cacheErrorCategory = CacheErrorLogger.CacheErrorCategory.WRITE_RENAME_FILE_TEMPFILE_NOT_FOUND;
                } else {
                    cacheErrorCategory = CacheErrorLogger.CacheErrorCategory.WRITE_RENAME_FILE_OTHER;
                }
                DefaultDiskStorage.this.f9424d.mo13088a(cacheErrorCategory, DefaultDiskStorage.f9419f, "commit", e);
                throw e;
            }
        }

        /* renamed from: o */
        public boolean mo13125o() {
            if (!this.f9435b.exists() || this.f9435b.delete()) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.facebook.cache.disk.DefaultDiskStorage$f */
    public class C1913f implements b12 {

        /* renamed from: a */
        public boolean f9437a;

        public C1913f() {
        }

        /* renamed from: a */
        public void mo11334a(File file) {
            if (!DefaultDiskStorage.this.f9421a.equals(file) && !this.f9437a) {
                file.delete();
            }
            if (this.f9437a && file.equals(DefaultDiskStorage.this.f9423c)) {
                this.f9437a = false;
            }
        }

        /* renamed from: b */
        public void mo11335b(File file) {
            if (!this.f9437a || !mo13126d(file)) {
                file.delete();
            }
        }

        /* renamed from: c */
        public void mo11336c(File file) {
            if (!this.f9437a && file.equals(DefaultDiskStorage.this.f9423c)) {
                this.f9437a = true;
            }
        }

        /* renamed from: d */
        public final boolean mo13126d(File file) {
            C1911d g = DefaultDiskStorage.this.mo13108s(file);
            boolean z = false;
            if (g == null) {
                return false;
            }
            String str = g.f9432a;
            if (str == ".tmp") {
                return mo13127e(file);
            }
            if (str == ".cnt") {
                z = true;
            }
            au4.m10794i(z);
            return true;
        }

        /* renamed from: e */
        public final boolean mo13127e(File file) {
            if (file.lastModified() > DefaultDiskStorage.this.f9425e.now() - DefaultDiskStorage.f9420g) {
                return true;
            }
            return false;
        }
    }

    public DefaultDiskStorage(File file, int i, CacheErrorLogger cacheErrorLogger) {
        au4.m10792g(file);
        this.f9421a = file;
        this.f9422b = m13218w(file, cacheErrorLogger);
        this.f9423c = new File(file, m13217v(i));
        this.f9424d = cacheErrorLogger;
        mo13113z();
    }

    /* renamed from: q */
    public static String m13216q(String str) {
        if (".cnt".equals(str)) {
            return ".cnt";
        }
        if (".tmp".equals(str)) {
            return ".tmp";
        }
        return null;
    }

    /* renamed from: v */
    public static String m13217v(int i) {
        return String.format((Locale) null, "%s.ols%d.%d", new Object[]{"v2", 100, Integer.valueOf(i)});
    }

    /* renamed from: w */
    public static boolean m13218w(File file, CacheErrorLogger cacheErrorLogger) {
        String str;
        try {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (externalStorageDirectory == null) {
                return false;
            }
            String file2 = externalStorageDirectory.toString();
            try {
                str = file.getCanonicalPath();
                try {
                    return str.contains(file2);
                } catch (IOException e) {
                    e = e;
                    CacheErrorLogger.CacheErrorCategory cacheErrorCategory = CacheErrorLogger.CacheErrorCategory.OTHER;
                    Class<?> cls = f9419f;
                    cacheErrorLogger.mo13088a(cacheErrorCategory, cls, "failed to read folder to check if external: " + str, e);
                    return false;
                }
            } catch (IOException e2) {
                e = e2;
                str = null;
                CacheErrorLogger.CacheErrorCategory cacheErrorCategory2 = CacheErrorLogger.CacheErrorCategory.OTHER;
                Class<?> cls2 = f9419f;
                cacheErrorLogger.mo13088a(cacheErrorCategory2, cls2, "failed to read folder to check if external: " + str, e);
                return false;
            }
        } catch (Exception e3) {
            cacheErrorLogger.mo13088a(CacheErrorLogger.CacheErrorCategory.OTHER, f9419f, "failed to get the external storage directory!", e3);
            return false;
        }
    }

    /* renamed from: a */
    public void mo13096a() {
        a12.m10c(this.f9421a, new C1913f());
    }

    /* renamed from: b */
    public boolean mo13097b(String str, Object obj) {
        return mo13112y(str, true);
    }

    /* renamed from: c */
    public long mo13098c(C1916b.C1917a aVar) {
        return mo13103n(((C1910c) aVar).mo13115a().mo22993d());
    }

    /* renamed from: d */
    public C1916b.C1918b mo13099d(String str, Object obj) throws IOException {
        C1911d dVar = new C1911d(".tmp", str);
        File t = mo13109t(dVar.f9433b);
        if (!t.exists()) {
            mo13111x(t, "insert");
        }
        try {
            return new C1912e(str, dVar.mo13119a(t));
        } catch (IOException e) {
            this.f9424d.mo13088a(CacheErrorLogger.CacheErrorCategory.WRITE_CREATE_TEMPFILE, f9419f, "insert", e);
            throw e;
        }
    }

    /* renamed from: e */
    public l10 mo13100e(String str, Object obj) {
        File o = mo13104o(str);
        if (!o.exists()) {
            return null;
        }
        o.setLastModified(this.f9425e.now());
        return m02.m21927c(o);
    }

    public boolean isExternal() {
        return this.f9422b;
    }

    /* renamed from: n */
    public final long mo13103n(File file) {
        if (!file.exists()) {
            return 0;
        }
        long length = file.length();
        if (file.delete()) {
            return length;
        }
        return -1;
    }

    /* renamed from: o */
    public File mo13104o(String str) {
        return new File(mo13106r(str));
    }

    /* renamed from: p */
    public List<C1916b.C1917a> mo13101f() throws IOException {
        C1909b bVar = new C1909b();
        a12.m10c(this.f9423c, bVar);
        return bVar.mo13114d();
    }

    /* renamed from: r */
    public final String mo13106r(String str) {
        C1911d dVar = new C1911d(".cnt", str);
        return dVar.mo13120c(mo13110u(dVar.f9433b));
    }

    public long remove(String str) {
        return mo13103n(mo13104o(str));
    }

    /* renamed from: s */
    public final C1911d mo13108s(File file) {
        C1911d b = C1911d.m13240b(file);
        if (b == null) {
            return null;
        }
        if (mo13109t(b.f9433b).equals(file.getParentFile())) {
            return b;
        }
        return null;
    }

    /* renamed from: t */
    public final File mo13109t(String str) {
        return new File(mo13110u(str));
    }

    /* renamed from: u */
    public final String mo13110u(String str) {
        String valueOf = String.valueOf(Math.abs(str.hashCode() % 100));
        return this.f9423c + File.separator + valueOf;
    }

    /* renamed from: x */
    public final void mo13111x(File file, String str) throws IOException {
        try {
            FileUtils.m13297a(file);
        } catch (FileUtils.CreateDirectoryException e) {
            this.f9424d.mo13088a(CacheErrorLogger.CacheErrorCategory.WRITE_CREATE_DIR, f9419f, str, e);
            throw e;
        }
    }

    /* renamed from: y */
    public final boolean mo13112y(String str, boolean z) {
        File o = mo13104o(str);
        boolean exists = o.exists();
        if (z && exists) {
            o.setLastModified(this.f9425e.now());
        }
        return exists;
    }

    /* renamed from: z */
    public final void mo13113z() {
        boolean z = true;
        if (this.f9421a.exists()) {
            if (!this.f9423c.exists()) {
                a12.m9b(this.f9421a);
            } else {
                z = false;
            }
        }
        if (z) {
            try {
                FileUtils.m13297a(this.f9423c);
            } catch (FileUtils.CreateDirectoryException unused) {
                CacheErrorLogger cacheErrorLogger = this.f9424d;
                CacheErrorLogger.CacheErrorCategory cacheErrorCategory = CacheErrorLogger.CacheErrorCategory.WRITE_CREATE_DIR;
                Class<?> cls = f9419f;
                cacheErrorLogger.mo13088a(cacheErrorCategory, cls, "version directory could not be created: " + this.f9423c, (Throwable) null);
            }
        }
    }
}
