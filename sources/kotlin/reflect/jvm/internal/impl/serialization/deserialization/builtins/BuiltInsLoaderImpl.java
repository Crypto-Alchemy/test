package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader;
import kotlin.reflect.jvm.internal.impl.builtins.C7395c;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderImpl;
import kotlin.reflect.jvm.internal.impl.protobuf.C7616d;
import p000.gj3;
import p000.j42;
import p000.ld1;
import p000.wl3;

/* compiled from: BuiltInsLoaderImpl.kt */
public final class BuiltInsLoaderImpl implements BuiltInsLoader {

    /* renamed from: b */
    public final n50 f40157b = new n50();

    /* renamed from: a */
    public hk4 mo53127a(da6 da6, mx3 mx3, Iterable<? extends kf0> iterable, bp4 bp4, C6818ad adVar, boolean z) {
        vx2.m53591g(da6, "storageManager");
        vx2.m53591g(mx3, "builtInsModule");
        vx2.m53591g(iterable, "classDescriptorFactories");
        vx2.m53591g(bp4, "platformDependentDeclarationFilter");
        vx2.m53591g(adVar, "additionalClassPartsProvider");
        return mo55162b(da6, mx3, C7395c.f39119x, iterable, bp4, adVar, z, new BuiltInsLoaderImpl$createPackageFragmentProvider$1(this.f40157b));
    }

    /* renamed from: b */
    public final hk4 mo55162b(da6 da6, mx3 mx3, Set<u82> set, Iterable<? extends kf0> iterable, bp4 bp4, C6818ad adVar, boolean z, rc2<? super String, ? extends InputStream> rc2) {
        da6 da62 = da6;
        mx3 mx32 = mx3;
        Set<u82> set2 = set;
        rc2<? super String, ? extends InputStream> rc22 = rc2;
        vx2.m53591g(da62, "storageManager");
        vx2.m53591g(mx32, "module");
        vx2.m53591g(set2, "packageFqNames");
        vx2.m53591g(iterable, "classDescriptorFactories");
        vx2.m53591g(bp4, "platformDependentDeclarationFilter");
        vx2.m53591g(adVar, "additionalClassPartsProvider");
        vx2.m53591g(rc22, "loadResource");
        ArrayList arrayList = new ArrayList(dk0.m43495u(set2, 10));
        for (u82 u82 : set) {
            String n = h50.f38161n.mo52122n(u82);
            InputStream inputStream = (InputStream) rc22.invoke(n);
            if (inputStream != null) {
                arrayList.add(l50.f40572L.mo55820a(u82, da6, mx3, inputStream, z));
            } else {
                throw new IllegalStateException("Resource not found in classpath: " + n);
            }
        }
        PackageFragmentProviderImpl packageFragmentProviderImpl = r2;
        PackageFragmentProviderImpl packageFragmentProviderImpl2 = new PackageFragmentProviderImpl(arrayList);
        NotFoundClasses notFoundClasses = r1;
        NotFoundClasses notFoundClasses2 = new NotFoundClasses(da62, mx32);
        ld1.C7827a aVar = ld1.C7827a.f40603a;
        rd1 rd1 = r5;
        rd1 rd12 = new rd1(packageFragmentProviderImpl2);
        C9403ul ulVar = r7;
        PackageFragmentProviderImpl packageFragmentProviderImpl3 = packageFragmentProviderImpl2;
        h50 h50 = h50.f38161n;
        C9403ul ulVar2 = new C9403ul(mx32, notFoundClasses2, h50);
        gj3.C7132a aVar2 = gj3.C7132a.f38031a;
        gr1 gr1 = gr1.f38061a;
        id1 id1 = r0;
        gr1 gr12 = gr1;
        ArrayList arrayList2 = arrayList;
        vx2.m53590f(gr1, "DO_NOTHING");
        wl3.C9555a aVar3 = wl3.C9555a.f45737a;
        ArrayList<l50> arrayList3 = arrayList2;
        j42.C7244a aVar4 = j42.C7244a.f38591a;
        ht0 a = ht0.f38268a.mo52313a();
        C7616d e = h50.mo66954e();
        wk5 wk5 = r1;
        wk5 wk52 = new wk5(da62, ck0.m33062j());
        PackageFragmentProviderImpl packageFragmentProviderImpl4 = packageFragmentProviderImpl3;
        id1 id12 = new id1(da6, mx3, aVar, rd1, ulVar, packageFragmentProviderImpl, aVar2, gr12, aVar3, aVar4, iterable, notFoundClasses, a, adVar, bp4, e, (k64) null, wk5, (dp4) null, (List) null, 851968, (DefaultConstructorMarker) null);
        for (l50 F0 : arrayList3) {
            F0.mo55126F0(id1);
        }
        return packageFragmentProviderImpl4;
    }
}
