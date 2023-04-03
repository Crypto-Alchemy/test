package p000;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.PropertyReference1Impl;
import p000.C6983dm;

/* renamed from: od1 */
/* compiled from: DeserializedAnnotations.kt */
public class od1 implements C6983dm {

    /* renamed from: d */
    public static final /* synthetic */ i93<Object>[] f43630d = {ua5.m52732g(new PropertyReference1Impl(ua5.m52727b(od1.class), "annotations", "getAnnotations()Ljava/util/List;"))};

    /* renamed from: a */
    public final q84 f43631a;

    public od1(da6 da6, pc2<? extends List<? extends C9460vl>> pc2) {
        vx2.m53591g(da6, "storageManager");
        vx2.m53591g(pc2, "compute");
        this.f43631a = da6.mo51164i(pc2);
    }

    /* renamed from: C0 */
    public boolean mo51224C0(u82 u82) {
        return C6983dm.C6986b.m56911b(this, u82);
    }

    /* renamed from: e */
    public final List<C9460vl> mo62882e() {
        return (List) ca6.m56364a(this.f43631a, this, f43630d[0]);
    }

    public boolean isEmpty() {
        return mo62882e().isEmpty();
    }

    public Iterator<C9460vl> iterator() {
        return mo62882e().iterator();
    }

    /* renamed from: x */
    public C9460vl mo51226x(u82 u82) {
        return C6983dm.C6986b.m56910a(this, u82);
    }
}
