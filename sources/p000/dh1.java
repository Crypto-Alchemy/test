package p000;

import java.io.File;
import p000.tg1;

/* renamed from: dh1 */
/* compiled from: DiskLruCacheFactory */
public class dh1 implements tg1.C3362a {

    /* renamed from: a */
    public final long f10713a;

    /* renamed from: b */
    public final C2166a f10714b;

    /* renamed from: dh1$a */
    /* compiled from: DiskLruCacheFactory */
    public interface C2166a {
        /* renamed from: a */
        File mo18774a();
    }

    public dh1(C2166a aVar, long j) {
        this.f10713a = j;
        this.f10714b = aVar;
    }

    public tg1 build() {
        File a = this.f10714b.mo18774a();
        if (a == null) {
            return null;
        }
        if (a.isDirectory() || a.mkdirs()) {
            return eh1.m16095c(a, this.f10713a);
        }
        return null;
    }
}
