package com.facebook.cache.disk;

import java.io.IOException;
import java.util.Collection;

/* renamed from: com.facebook.cache.disk.b */
/* compiled from: DiskStorage */
public interface C1916b {

    /* renamed from: com.facebook.cache.disk.b$a */
    /* compiled from: DiskStorage */
    public interface C1917a {
        String getId();

        long getSize();

        long getTimestamp();
    }

    /* renamed from: com.facebook.cache.disk.b$b */
    /* compiled from: DiskStorage */
    public interface C1918b {
        /* renamed from: a */
        l10 mo13122a(Object obj) throws IOException;

        /* renamed from: b */
        void mo13123b(wn7 wn7, Object obj) throws IOException;

        /* renamed from: o */
        boolean mo13125o();
    }

    /* renamed from: a */
    void mo13096a();

    /* renamed from: b */
    boolean mo13097b(String str, Object obj) throws IOException;

    /* renamed from: c */
    long mo13098c(C1917a aVar) throws IOException;

    /* renamed from: d */
    C1918b mo13099d(String str, Object obj) throws IOException;

    /* renamed from: e */
    l10 mo13100e(String str, Object obj) throws IOException;

    /* renamed from: f */
    Collection<C1917a> mo13101f() throws IOException;

    boolean isExternal();

    long remove(String str) throws IOException;
}
