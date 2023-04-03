package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment;
import p000.e17;
import p000.t03;

/* compiled from: LazyJavaPackageFragmentProvider.kt */
public final class LazyJavaPackageFragmentProvider implements jk4 {

    /* renamed from: a */
    public final pf3 f39454a;

    /* renamed from: b */
    public final i80<u82, LazyJavaPackageFragment> f39455b;

    public LazyJavaPackageFragmentProvider(y13 y13) {
        vx2.m53591g(y13, "components");
        pf3 pf3 = new pf3(y13, e17.C7009a.f37444a, sf3.m51750c(null));
        this.f39454a = pf3;
        this.f39455b = pf3.mo65300e().mo51157b();
    }

    /* renamed from: a */
    public void mo52736a(u82 u82, Collection<fk4> collection) {
        vx2.m53591g(u82, "fqName");
        vx2.m53591g(collection, "packageFragments");
        ak0.m55531a(collection, mo53490e(u82));
    }

    /* renamed from: b */
    public boolean mo52737b(u82 u82) {
        vx2.m53591g(u82, "fqName");
        if (t03.C9319a.m72140a(this.f39454a.mo65296a().mo67001d(), u82, false, 2, (Object) null) == null) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public List<LazyJavaPackageFragment> mo52234c(u82 u82) {
        vx2.m53591g(u82, "fqName");
        return ck0.m33066n(mo53490e(u82));
    }

    /* renamed from: e */
    public final LazyJavaPackageFragment mo53490e(u82 u82) {
        s13 a = t03.C9319a.m72140a(this.f39454a.mo65296a().mo67001d(), u82, false, 2, (Object) null);
        if (a == null) {
            return null;
        }
        return this.f39455b.mo52416a(u82, new LazyJavaPackageFragmentProvider$getPackageFragment$1(this, a));
    }

    /* renamed from: f */
    public List<u82> mo52235l(u82 u82, rc2<? super r24, Boolean> rc2) {
        List<u82> list;
        vx2.m53591g(u82, "fqName");
        vx2.m53591g(rc2, "nameFilter");
        LazyJavaPackageFragment e = mo53490e(u82);
        if (e != null) {
            list = e.mo53593I0();
        } else {
            list = null;
        }
        if (list == null) {
            return ck0.m33062j();
        }
        return list;
    }

    public String toString() {
        return "LazyJavaPackageFragmentProvider of module " + this.f39454a.mo65296a().mo67010m();
    }
}
