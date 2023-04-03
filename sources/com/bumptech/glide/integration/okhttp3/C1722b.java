package com.bumptech.glide.integration.okhttp3;

import java.io.InputStream;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import p000.mw3;

/* renamed from: com.bumptech.glide.integration.okhttp3.b */
/* compiled from: OkHttpUrlLoader */
public class C1722b implements mw3<dh2, InputStream> {

    /* renamed from: a */
    public final Call.Factory f8709a;

    /* renamed from: com.bumptech.glide.integration.okhttp3.b$a */
    /* compiled from: OkHttpUrlLoader */
    public static class C1723a implements nw3<dh2, InputStream> {

        /* renamed from: b */
        public static volatile Call.Factory f8710b;

        /* renamed from: a */
        public final Call.Factory f8711a;

        public C1723a() {
            this(m12261b());
        }

        /* renamed from: b */
        public static Call.Factory m12261b() {
            if (f8710b == null) {
                synchronized (C1723a.class) {
                    if (f8710b == null) {
                        f8710b = new OkHttpClient();
                    }
                }
            }
            return f8710b;
        }

        /* renamed from: a */
        public void mo11937a() {
        }

        /* renamed from: c */
        public mw3<dh2, InputStream> mo11938c(vz3 vz3) {
            return new C1722b(this.f8711a);
        }

        public C1723a(Call.Factory factory) {
            this.f8711a = factory;
        }
    }

    public C1722b(Call.Factory factory) {
        this.f8709a = factory;
    }

    /* renamed from: c */
    public mw3.C2853a<InputStream> mo11934b(dh2 dh2, int i, int i2, xi4 xi4) {
        return new mw3.C2853a<>(dh2, new mg4(this.f8709a, dh2));
    }

    /* renamed from: d */
    public boolean mo11933a(dh2 dh2) {
        return true;
    }
}
