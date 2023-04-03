package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope;
import kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind;
import p000.nc3;
import p000.t03;

/* compiled from: LazyJavaPackageScope.kt */
public final class LazyJavaPackageScope$classes$1 extends Lambda implements rc2<LazyJavaPackageScope.C7457a, if0> {

    /* renamed from: $c */
    public final /* synthetic */ pf3 f39528$c;
    public final /* synthetic */ LazyJavaPackageScope this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaPackageScope$classes$1(LazyJavaPackageScope lazyJavaPackageScope, pf3 pf3) {
        super(1);
        this.this$0 = lazyJavaPackageScope;
        this.f39528$c = pf3;
    }

    public final if0 invoke(LazyJavaPackageScope.C7457a aVar) {
        nc3.C7933a aVar2;
        byte[] bArr;
        vx2.m53591g(aVar, "request");
        nf0 nf0 = new nf0(this.this$0.mo53531C().mo51711e(), aVar.mo53600b());
        if (aVar.mo53599a() != null) {
            aVar2 = this.f39528$c.mo65296a().mo67007j().mo56448a(aVar.mo53599a());
        } else {
            aVar2 = this.f39528$c.mo65296a().mo67007j().mo56449c(nf0);
        }
        tc3 a = aVar2 != null ? aVar2.mo56450a() : null;
        nf0 i = a != null ? a.mo65268i() : null;
        if (i != null && (i.mo62683l() || i.mo62682k())) {
            return null;
        }
        LazyJavaPackageScope.C7458b M = this.this$0.mo53598R(a);
        if (M instanceof LazyJavaPackageScope.C7458b.C7459a) {
            return ((LazyJavaPackageScope.C7458b.C7459a) M).mo53603a();
        }
        if (M instanceof LazyJavaPackageScope.C7458b.C7461c) {
            return null;
        }
        if (M instanceof LazyJavaPackageScope.C7458b.C7460b) {
            p03 a2 = aVar.mo53599a();
            if (a2 == null) {
                t03 d = this.f39528$c.mo65296a().mo67001d();
                if (aVar2 != null) {
                    if (!(aVar2 instanceof nc3.C7933a.C7934a)) {
                        aVar2 = null;
                    }
                    nc3.C7933a.C7934a aVar3 = (nc3.C7933a.C7934a) aVar2;
                    if (aVar3 != null) {
                        bArr = aVar3.mo56451b();
                        a2 = d.mo65955c(new t03.C9320b(nf0, bArr, (p03) null, 4, (DefaultConstructorMarker) null));
                    }
                }
                bArr = null;
                a2 = d.mo65955c(new t03.C9320b(nf0, bArr, (p03) null, 4, (DefaultConstructorMarker) null));
            }
            p03 p03 = a2;
            if ((p03 != null ? p03.mo53372J() : null) != LightClassOriginKind.BINARY) {
                u82 e = p03 != null ? p03.mo53383e() : null;
                if (e == null || e.mo66197d() || !vx2.m53586b(e.mo66198e(), this.this$0.mo53531C().mo51711e())) {
                    return null;
                }
                LazyJavaClassDescriptor lazyJavaClassDescriptor = new LazyJavaClassDescriptor(this.f39528$c, this.this$0.mo53531C(), p03, (if0) null, 8, (DefaultConstructorMarker) null);
                this.f39528$c.mo65296a().mo67002e().mo66383a(lazyJavaClassDescriptor);
                return lazyJavaClassDescriptor;
            }
            throw new IllegalStateException("Couldn't find kotlin binary class for light class created by kotlin binary file\nJavaClass: " + p03 + "\nClassId: " + nf0 + "\nfindKotlinClass(JavaClass) = " + oc3.m70234b(this.f39528$c.mo65296a().mo67007j(), p03) + "\nfindKotlinClass(ClassId) = " + oc3.m70233a(this.f39528$c.mo65296a().mo67007j(), nf0) + 10);
        }
        throw new NoWhenBranchMatchedException();
    }
}
