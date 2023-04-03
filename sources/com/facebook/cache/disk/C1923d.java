package com.facebook.cache.disk;

import com.facebook.cache.common.CacheErrorLogger;
import com.facebook.cache.disk.C1916b;
import com.facebook.common.file.FileUtils;
import java.io.File;
import java.io.IOException;
import java.util.Collection;

/* renamed from: com.facebook.cache.disk.d */
/* compiled from: DynamicDefaultDiskStorage */
public class C1923d implements C1916b {

    /* renamed from: f */
    public static final Class<?> f9467f = C1923d.class;

    /* renamed from: a */
    public final int f9468a;

    /* renamed from: b */
    public final td6<File> f9469b;

    /* renamed from: c */
    public final String f9470c;

    /* renamed from: d */
    public final CacheErrorLogger f9471d;

    /* renamed from: e */
    public volatile C1924a f9472e = new C1924a((File) null, (C1916b) null);

    /* renamed from: com.facebook.cache.disk.d$a */
    /* compiled from: DynamicDefaultDiskStorage */
    public static class C1924a {

        /* renamed from: a */
        public final C1916b f9473a;

        /* renamed from: b */
        public final File f9474b;

        public C1924a(File file, C1916b bVar) {
            this.f9473a = bVar;
            this.f9474b = file;
        }
    }

    public C1923d(int i, td6<File> td6, String str, CacheErrorLogger cacheErrorLogger) {
        this.f9468a = i;
        this.f9471d = cacheErrorLogger;
        this.f9469b = td6;
        this.f9470c = str;
    }

    /* renamed from: a */
    public void mo13096a() {
        try {
            mo13153j().mo13096a();
        } catch (IOException e) {
            oy1.m24418e(f9467f, "purgeUnexpectedResources", e);
        }
    }

    /* renamed from: b */
    public boolean mo13097b(String str, Object obj) throws IOException {
        return mo13153j().mo13097b(str, obj);
    }

    /* renamed from: c */
    public long mo13098c(C1916b.C1917a aVar) throws IOException {
        return mo13153j().mo13098c(aVar);
    }

    /* renamed from: d */
    public C1916b.C1918b mo13099d(String str, Object obj) throws IOException {
        return mo13153j().mo13099d(str, obj);
    }

    /* renamed from: e */
    public l10 mo13100e(String str, Object obj) throws IOException {
        return mo13153j().mo13100e(str, obj);
    }

    /* renamed from: f */
    public Collection<C1916b.C1917a> mo13101f() throws IOException {
        return mo13153j().mo13101f();
    }

    /* renamed from: g */
    public void mo13150g(File file) throws IOException {
        try {
            FileUtils.m13297a(file);
            oy1.m24414a(f9467f, "Created cache directory %s", file.getAbsolutePath());
        } catch (FileUtils.CreateDirectoryException e) {
            this.f9471d.mo13088a(CacheErrorLogger.CacheErrorCategory.WRITE_CREATE_DIR, f9467f, "createRootDirectoryIfNecessary", e);
            throw e;
        }
    }

    /* renamed from: h */
    public final void mo13151h() throws IOException {
        File file = new File(this.f9469b.get(), this.f9470c);
        mo13150g(file);
        this.f9472e = new C1924a(file, new DefaultDiskStorage(file, this.f9468a, this.f9471d));
    }

    /* renamed from: i */
    public void mo13152i() {
        if (this.f9472e.f9473a != null && this.f9472e.f9474b != null) {
            a12.m9b(this.f9472e.f9474b);
        }
    }

    public boolean isExternal() {
        try {
            return mo13153j().isExternal();
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: j */
    public synchronized C1916b mo13153j() throws IOException {
        if (mo13154k()) {
            mo13152i();
            mo13151h();
        }
        return (C1916b) au4.m10792g(this.f9472e.f9473a);
    }

    /* renamed from: k */
    public final boolean mo13154k() {
        File file;
        C1924a aVar = this.f9472e;
        if (aVar.f9473a == null || (file = aVar.f9474b) == null || !file.exists()) {
            return true;
        }
        return false;
    }

    public long remove(String str) throws IOException {
        return mo13153j().remove(str);
    }
}
