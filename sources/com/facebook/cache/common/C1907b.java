package com.facebook.cache.common;

import com.facebook.cache.common.CacheErrorLogger;

/* renamed from: com.facebook.cache.common.b */
/* compiled from: NoOpCacheErrorLogger */
public class C1907b implements CacheErrorLogger {

    /* renamed from: a */
    public static C1907b f9418a;

    /* renamed from: b */
    public static synchronized C1907b m13207b() {
        C1907b bVar;
        synchronized (C1907b.class) {
            if (f9418a == null) {
                f9418a = new C1907b();
            }
            bVar = f9418a;
        }
        return bVar;
    }

    /* renamed from: a */
    public void mo13088a(CacheErrorLogger.CacheErrorCategory cacheErrorCategory, Class<?> cls, String str, Throwable th) {
    }
}
