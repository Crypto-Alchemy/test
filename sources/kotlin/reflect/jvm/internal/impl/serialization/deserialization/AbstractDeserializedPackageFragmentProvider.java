package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.Collection;
import java.util.List;

/* compiled from: AbstractDeserializedPackageFragmentProvider.kt */
public abstract class AbstractDeserializedPackageFragmentProvider implements jk4 {

    /* renamed from: a */
    public final da6 f40128a;

    /* renamed from: b */
    public final wc3 f40129b;

    /* renamed from: c */
    public final mx3 f40130c;

    /* renamed from: d */
    public id1 f40131d;

    /* renamed from: e */
    public final ws3<u82, fk4> f40132e;

    public AbstractDeserializedPackageFragmentProvider(da6 da6, wc3 wc3, mx3 mx3) {
        vx2.m53591g(da6, "storageManager");
        vx2.m53591g(wc3, "finder");
        vx2.m53591g(mx3, "moduleDescriptor");
        this.f40128a = da6;
        this.f40129b = wc3;
        this.f40130c = mx3;
        this.f40132e = da6.mo51159d(new AbstractDeserializedPackageFragmentProvider$fragments$1(this));
    }

    /* renamed from: a */
    public void mo52736a(u82 u82, Collection<fk4> collection) {
        vx2.m53591g(u82, "fqName");
        vx2.m53591g(collection, "packageFragments");
        ak0.m55531a(collection, this.f40132e.invoke(u82));
    }

    /* renamed from: b */
    public boolean mo52737b(u82 u82) {
        Object obj;
        vx2.m53591g(u82, "fqName");
        if (this.f40132e.mo55252u(u82)) {
            obj = this.f40132e.invoke(u82);
        } else {
            obj = mo55108d(u82);
        }
        if (obj == null) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public List<fk4> mo52234c(u82 u82) {
        vx2.m53591g(u82, "fqName");
        return ck0.m33066n(this.f40132e.invoke(u82));
    }

    /* renamed from: d */
    public abstract vd1 mo55108d(u82 u82);

    /* renamed from: e */
    public final id1 mo55109e() {
        id1 id1 = this.f40131d;
        if (id1 != null) {
            return id1;
        }
        vx2.m53605u("components");
        return null;
    }

    /* renamed from: f */
    public final wc3 mo55110f() {
        return this.f40129b;
    }

    /* renamed from: g */
    public final mx3 mo55111g() {
        return this.f40130c;
    }

    /* renamed from: h */
    public final da6 mo55112h() {
        return this.f40128a;
    }

    /* renamed from: i */
    public final void mo55113i(id1 id1) {
        vx2.m53591g(id1, "<set-?>");
        this.f40131d = id1;
    }

    /* renamed from: l */
    public Collection<u82> mo52235l(u82 u82, rc2<? super r24, Boolean> rc2) {
        vx2.m53591g(u82, "fqName");
        vx2.m53591g(rc2, "nameFilter");
        return ny5.m49095e();
    }
}
