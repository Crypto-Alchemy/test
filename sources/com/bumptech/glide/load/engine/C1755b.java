package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.C1756c;
import java.io.File;
import java.util.List;
import p000.mw3;
import p000.r11;

/* renamed from: com.bumptech.glide.load.engine.b */
/* compiled from: DataCacheGenerator */
public class C1755b implements C1756c, r11.C3179a<Object> {

    /* renamed from: a */
    public final List<z93> f8795a;

    /* renamed from: d */
    public final C1758d<?> f8796d;

    /* renamed from: e */
    public final C1756c.C1757a f8797e;

    /* renamed from: g */
    public int f8798g;

    /* renamed from: k */
    public z93 f8799k;

    /* renamed from: r */
    public List<mw3<File, ?>> f8800r;

    /* renamed from: s */
    public int f8801s;

    /* renamed from: x */
    public volatile mw3.C2853a<?> f8802x;

    /* renamed from: y */
    public File f8803y;

    public C1755b(C1758d<?> dVar, C1756c.C1757a aVar) {
        this(dVar.mo12490c(), dVar, aVar);
    }

    /* renamed from: a */
    public boolean mo12483a() {
        ch2.m11868a("DataCacheGenerator.startNext");
        while (true) {
            try {
                boolean z = false;
                if (this.f8800r != null) {
                    if (mo12484b()) {
                        this.f8802x = null;
                        while (!z && mo12484b()) {
                            List<mw3<File, ?>> list = this.f8800r;
                            int i = this.f8801s;
                            this.f8801s = i + 1;
                            this.f8802x = list.get(i).mo11934b(this.f8803y, this.f8796d.mo12507t(), this.f8796d.mo12493f(), this.f8796d.mo12498k());
                            if (this.f8802x != null && this.f8796d.mo12508u(this.f8802x.f15262c.mo11939a())) {
                                this.f8802x.f15262c.mo11943d(this.f8796d.mo12499l(), this);
                                z = true;
                            }
                        }
                        ch2.m11872e();
                        return z;
                    }
                }
                int i2 = this.f8798g + 1;
                this.f8798g = i2;
                if (i2 >= this.f8795a.size()) {
                    return false;
                }
                z93 z93 = this.f8795a.get(this.f8798g);
                File a = this.f8796d.mo12491d().mo19243a(new k11(z93, this.f8796d.mo12503p()));
                this.f8803y = a;
                if (a != null) {
                    this.f8799k = z93;
                    this.f8800r = this.f8796d.mo12497j(a);
                    this.f8801s = 0;
                }
            } finally {
                ch2.m11872e();
            }
        }
    }

    /* renamed from: b */
    public final boolean mo12484b() {
        if (this.f8801s < this.f8800r.size()) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public void mo12485c(Exception exc) {
        this.f8797e.mo12424g(this.f8799k, exc, this.f8802x.f15262c, DataSource.DATA_DISK_CACHE);
    }

    public void cancel() {
        mw3.C2853a<?> aVar = this.f8802x;
        if (aVar != null) {
            aVar.f15262c.cancel();
        }
    }

    /* renamed from: f */
    public void mo12487f(Object obj) {
        this.f8797e.mo12422e(this.f8799k, obj, this.f8802x.f15262c, DataSource.DATA_DISK_CACHE, this.f8799k);
    }

    public C1755b(List<z93> list, C1758d<?> dVar, C1756c.C1757a aVar) {
        this.f8798g = -1;
        this.f8795a = list;
        this.f8796d = dVar;
        this.f8797e = aVar;
    }
}
