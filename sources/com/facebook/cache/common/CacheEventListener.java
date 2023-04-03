package com.facebook.cache.common;

public interface CacheEventListener {

    public enum EvictionReason {
        CACHE_FULL,
        CONTENT_STALE,
        USER_FORCED,
        CACHE_MANAGER_TRIMMED
    }

    /* renamed from: a */
    void mo13089a(C1906a aVar);

    /* renamed from: b */
    void mo13090b(C1906a aVar);

    /* renamed from: c */
    void mo13091c(C1906a aVar);

    /* renamed from: d */
    void mo13092d(C1906a aVar);

    /* renamed from: e */
    void mo13093e(C1906a aVar);

    /* renamed from: f */
    void mo13094f(C1906a aVar);

    /* renamed from: g */
    void mo13095g(C1906a aVar);
}
