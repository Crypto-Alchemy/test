package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.C1756c;
import java.io.File;
import java.util.List;
import p000.mw3;
import p000.r11;

/* renamed from: com.bumptech.glide.load.engine.j */
/* compiled from: ResourceCacheGenerator */
public class C1777j implements C1756c, r11.C3179a<Object> {

    /* renamed from: A */
    public df5 f8897A;

    /* renamed from: a */
    public final C1756c.C1757a f8898a;

    /* renamed from: d */
    public final C1758d<?> f8899d;

    /* renamed from: e */
    public int f8900e;

    /* renamed from: g */
    public int f8901g = -1;

    /* renamed from: k */
    public z93 f8902k;

    /* renamed from: r */
    public List<mw3<File, ?>> f8903r;

    /* renamed from: s */
    public int f8904s;

    /* renamed from: x */
    public volatile mw3.C2853a<?> f8905x;

    /* renamed from: y */
    public File f8906y;

    public C1777j(C1758d<?> dVar, C1756c.C1757a aVar) {
        this.f8899d = dVar;
        this.f8898a = aVar;
    }

    /* renamed from: a */
    public boolean mo12483a() {
        ch2.m11868a("ResourceCacheGenerator.startNext");
        try {
            List<z93> c = this.f8899d.mo12490c();
            boolean z = false;
            if (c.isEmpty()) {
                return false;
            }
            List<Class<?>> m = this.f8899d.mo12500m();
            if (!m.isEmpty()) {
                while (true) {
                    if (this.f8903r != null) {
                        if (mo12570b()) {
                            this.f8905x = null;
                            while (!z && mo12570b()) {
                                List<mw3<File, ?>> list = this.f8903r;
                                int i = this.f8904s;
                                this.f8904s = i + 1;
                                this.f8905x = list.get(i).mo11934b(this.f8906y, this.f8899d.mo12507t(), this.f8899d.mo12493f(), this.f8899d.mo12498k());
                                if (this.f8905x != null && this.f8899d.mo12508u(this.f8905x.f15262c.mo11939a())) {
                                    this.f8905x.f15262c.mo11943d(this.f8899d.mo12499l(), this);
                                    z = true;
                                }
                            }
                            ch2.m11872e();
                            return z;
                        }
                    }
                    int i2 = this.f8901g + 1;
                    this.f8901g = i2;
                    if (i2 >= m.size()) {
                        int i3 = this.f8900e + 1;
                        this.f8900e = i3;
                        if (i3 >= c.size()) {
                            ch2.m11872e();
                            return false;
                        }
                        this.f8901g = 0;
                    }
                    z93 z93 = c.get(this.f8900e);
                    Class cls = m.get(this.f8901g);
                    this.f8897A = new df5(this.f8899d.mo12489b(), z93, this.f8899d.mo12503p(), this.f8899d.mo12507t(), this.f8899d.mo12493f(), this.f8899d.mo12506s(cls), cls, this.f8899d.mo12498k());
                    File a = this.f8899d.mo12491d().mo19243a(this.f8897A);
                    this.f8906y = a;
                    if (a != null) {
                        this.f8902k = z93;
                        this.f8903r = this.f8899d.mo12497j(a);
                        this.f8904s = 0;
                    }
                }
            } else if (File.class.equals(this.f8899d.mo12505r())) {
                ch2.m11872e();
                return false;
            } else {
                throw new IllegalStateException("Failed to find any load path from " + this.f8899d.mo12496i() + " to " + this.f8899d.mo12505r());
            }
        } finally {
            ch2.m11872e();
        }
    }

    /* renamed from: b */
    public final boolean mo12570b() {
        if (this.f8904s < this.f8903r.size()) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public void mo12485c(Exception exc) {
        this.f8898a.mo12424g(this.f8897A, exc, this.f8905x.f15262c, DataSource.RESOURCE_DISK_CACHE);
    }

    public void cancel() {
        mw3.C2853a<?> aVar = this.f8905x;
        if (aVar != null) {
            aVar.f15262c.cancel();
        }
    }

    /* renamed from: f */
    public void mo12487f(Object obj) {
        this.f8898a.mo12422e(this.f8902k, obj, this.f8905x.f15262c, DataSource.RESOURCE_DISK_CACHE, this.f8897A);
    }
}
