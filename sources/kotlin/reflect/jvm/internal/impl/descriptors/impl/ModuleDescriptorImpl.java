package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C6169a;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.C6177b;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.builtins.C7389b;
import p000.mx3;
import p000.uk4;

/* compiled from: ModuleDescriptorImpl.kt */
public final class ModuleDescriptorImpl extends e31 implements mx3 {

    /* renamed from: A */
    public boolean f39299A;

    /* renamed from: B */
    public final vs3<u82, tk4> f39300B;

    /* renamed from: C */
    public final ef3 f39301C;

    /* renamed from: e */
    public final da6 f39302e;

    /* renamed from: g */
    public final C7389b f39303g;

    /* renamed from: k */
    public final r24 f39304k;

    /* renamed from: r */
    public final Map<hx3<?>, Object> f39305r;

    /* renamed from: s */
    public final uk4 f39306s;

    /* renamed from: x */
    public kx3 f39307x;

    /* renamed from: y */
    public hk4 f39308y;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ModuleDescriptorImpl(r24 r24, da6 da6, C7389b bVar, ql6 ql6) {
        this(r24, da6, bVar, ql6, (Map) null, (r24) null, 48, (DefaultConstructorMarker) null);
        vx2.m53591g(r24, "moduleName");
        vx2.m53591g(da6, "storageManager");
        vx2.m53591g(bVar, "builtIns");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ModuleDescriptorImpl(r24 r24, da6 da6, C7389b bVar, ql6 ql6, Map map, r24 r242, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r24, da6, bVar, (i & 8) != 0 ? null : ql6, (i & 16) != 0 ? C6177b.m47361i() : map, (i & 32) != 0 ? null : r242);
    }

    /* renamed from: I0 */
    public void mo53290I0() {
        if (!mo53296O0()) {
            by2.m56239a(this);
        }
    }

    /* renamed from: J0 */
    public final String mo53291J0() {
        String r24 = getName().toString();
        vx2.m53590f(r24, "name.toString()");
        return r24;
    }

    /* renamed from: K0 */
    public final hk4 mo53292K0() {
        mo53290I0();
        return mo53293L0();
    }

    /* renamed from: L0 */
    public final rn0 mo53293L0() {
        return (rn0) this.f39301C.getValue();
    }

    /* renamed from: M0 */
    public final void mo53294M0(hk4 hk4) {
        vx2.m53591g(hk4, "providerForModuleContent");
        mo53295N0();
        this.f39308y = hk4;
    }

    /* renamed from: N */
    public tk4 mo51532N(u82 u82) {
        vx2.m53591g(u82, "fqName");
        mo53290I0();
        return this.f39300B.invoke(u82);
    }

    /* renamed from: N0 */
    public final boolean mo53295N0() {
        if (this.f39308y != null) {
            return true;
        }
        return false;
    }

    /* renamed from: O0 */
    public boolean mo53296O0() {
        return this.f39299A;
    }

    /* renamed from: P0 */
    public final void mo53297P0(kx3 kx3) {
        vx2.m53591g(kx3, "dependencies");
        this.f39307x = kx3;
    }

    /* renamed from: Q0 */
    public final void mo53298Q0(List<ModuleDescriptorImpl> list) {
        vx2.m53591g(list, "descriptors");
        mo53299R0(list, ny5.m49095e());
    }

    /* renamed from: R0 */
    public final void mo53299R0(List<ModuleDescriptorImpl> list, Set<ModuleDescriptorImpl> set) {
        vx2.m53591g(list, "descriptors");
        vx2.m53591g(set, "friends");
        mo53297P0(new lx3(list, set, ck0.m33062j(), ny5.m49095e()));
    }

    /* renamed from: S0 */
    public final void mo53300S0(ModuleDescriptorImpl... moduleDescriptorImplArr) {
        vx2.m53591g(moduleDescriptorImplArr, "descriptors");
        mo53298Q0(ArraysKt___ArraysKt.m47291q0(moduleDescriptorImplArr));
    }

    /* renamed from: b */
    public d31 mo51119b() {
        return mx3.C7916a.m64476b(this);
    }

    /* renamed from: j0 */
    public <R, D> R mo51120j0(h31<R, D> h31, D d) {
        return mx3.C7916a.m64475a(this, h31, d);
    }

    /* renamed from: k */
    public C7389b mo51535k() {
        return this.f39303g;
    }

    /* renamed from: l */
    public Collection<u82> mo51536l(u82 u82, rc2<? super r24, Boolean> rc2) {
        vx2.m53591g(u82, "fqName");
        vx2.m53591g(rc2, "nameFilter");
        mo53290I0();
        return mo53292K0().mo52235l(u82, rc2);
    }

    /* renamed from: l0 */
    public <T> T mo51537l0(hx3<T> hx3) {
        vx2.m53591g(hx3, "capability");
        T t = this.f39305r.get(hx3);
        if (t == null) {
            return null;
        }
        return t;
    }

    /* renamed from: u0 */
    public List<mx3> mo51538u0() {
        kx3 kx3 = this.f39307x;
        if (kx3 != null) {
            return kx3.mo55789b();
        }
        throw new AssertionError("Dependencies of module " + mo53291J0() + " were not set");
    }

    /* renamed from: v */
    public boolean mo51539v(mx3 mx3) {
        vx2.m53591g(mx3, "targetModule");
        if (vx2.m53586b(this, mx3)) {
            return true;
        }
        kx3 kx3 = this.f39307x;
        vx2.m53588d(kx3);
        if (!CollectionsKt___CollectionsKt.m47320R(kx3.mo55790c(), mx3) && !mo51538u0().contains(mx3) && !mx3.mo51538u0().contains(this)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ModuleDescriptorImpl(r24 r24, da6 da6, C7389b bVar, ql6 ql6, Map<hx3<?>, ? extends Object> map, r24 r242) {
        super(C6983dm.f37317b.mo51228b(), r24);
        vx2.m53591g(r24, "moduleName");
        vx2.m53591g(da6, "storageManager");
        vx2.m53591g(bVar, "builtIns");
        vx2.m53591g(map, "capabilities");
        this.f39302e = da6;
        this.f39303g = bVar;
        this.f39304k = r242;
        if (r24.mo65599i()) {
            this.f39305r = map;
            uk4 uk4 = (uk4) mo51537l0(uk4.f45088a.mo66294a());
            this.f39306s = uk4 == null ? uk4.C9402b.f45091b : uk4;
            this.f39299A = true;
            this.f39300B = da6.mo51163h(new ModuleDescriptorImpl$packages$1(this));
            this.f39301C = C6169a.m47232a(new C7430x39a25915(this));
            return;
        }
        throw new IllegalArgumentException("Module name must be special: " + r24);
    }
}
