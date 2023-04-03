package p000;

import com.facebook.cache.disk.C1916b;
import com.facebook.cache.disk.C1919c;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: fh1 */
/* compiled from: DiskStorageCacheFactory */
public class fh1 implements o02 {

    /* renamed from: a */
    public gh1 f11837a;

    public fh1(gh1 gh1) {
        this.f11837a = gh1;
    }

    /* renamed from: b */
    public static C1919c m16996b(vg1 vg1, C1916b bVar) {
        return m16997c(vg1, bVar, Executors.newSingleThreadExecutor());
    }

    /* renamed from: c */
    public static C1919c m16997c(vg1 vg1, C1916b bVar, Executor executor) {
        return new C1919c(bVar, vg1.mo27138h(), new C1919c.C1922c(vg1.mo27141k(), vg1.mo27140j(), vg1.mo27136f()), vg1.mo27135e(), vg1.mo27134d(), vg1.mo27137g(), executor, vg1.mo27139i());
    }

    /* renamed from: a */
    public n02 mo19915a(vg1 vg1) {
        return m16996b(vg1, this.f11837a.mo20578a(vg1));
    }
}
