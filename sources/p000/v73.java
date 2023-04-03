package p000;

import java.io.InputStream;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AbstractDeserializedPackageFragmentProvider;
import p000.gj3;
import p000.j42;
import p000.wl3;

/* renamed from: v73 */
/* compiled from: JvmBuiltInsPackageFragmentProvider.kt */
public final class v73 extends AbstractDeserializedPackageFragmentProvider {

    /* renamed from: f */
    public static final C9445a f45231f = new C9445a((DefaultConstructorMarker) null);

    /* renamed from: v73$a */
    /* compiled from: JvmBuiltInsPackageFragmentProvider.kt */
    public static final class C9445a {
        public C9445a() {
        }

        public /* synthetic */ C9445a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v73(da6 da6, nc3 nc3, mx3 mx3, NotFoundClasses notFoundClasses, C6818ad adVar, bp4 bp4, ld1 ld1, k64 k64, vk5 vk5) {
        super(da6, nc3, mx3);
        da6 da62 = da6;
        mx3 mx32 = mx3;
        NotFoundClasses notFoundClasses2 = notFoundClasses;
        vx2.m53591g(da62, "storageManager");
        vx2.m53591g(nc3, "finder");
        vx2.m53591g(mx32, "moduleDescriptor");
        vx2.m53591g(notFoundClasses2, "notFoundClasses");
        vx2.m53591g(adVar, "additionalClassPartsProvider");
        vx2.m53591g(bp4, "platformDependentDeclarationFilter");
        vx2.m53591g(ld1, "deserializationConfiguration");
        vx2.m53591g(k64, "kotlinTypeChecker");
        vx2.m53591g(vk5, "samConversionResolver");
        rd1 rd1 = r5;
        rd1 rd12 = new rd1(this);
        C9403ul ulVar = r8;
        h50 h50 = h50.f38161n;
        C9403ul ulVar2 = new C9403ul(mx32, notFoundClasses2, h50);
        gj3.C7132a aVar = gj3.C7132a.f38031a;
        gr1 gr1 = gr1.f38061a;
        vx2.m53590f(gr1, "DO_NOTHING");
        id1 id1 = r0;
        da6 da63 = da6;
        mx3 mx33 = mx3;
        id1 id12 = new id1(da63, mx33, ld1, rd1, ulVar, this, aVar, gr1, wl3.C9555a.f45737a, j42.C7244a.f38591a, ck0.m33065m(new f50(da62, mx3), new JvmBuiltInClassDescriptorFactory(da6, mx3, (rc2) null, 4, (DefaultConstructorMarker) null)), notFoundClasses, ht0.f38268a.mo52313a(), adVar, bp4, h50.mo66954e(), k64, vk5, (dp4) null, (List) null, 786432, (DefaultConstructorMarker) null);
        mo55113i(id1);
    }

    /* renamed from: d */
    public vd1 mo55108d(u82 u82) {
        vx2.m53591g(u82, "fqName");
        InputStream b = mo55110f().mo65431b(u82);
        if (b == null) {
            return null;
        }
        return l50.f40572L.mo55820a(u82, mo55112h(), mo55111g(), b, false);
    }
}
