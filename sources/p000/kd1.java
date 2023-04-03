package p000;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeEnhancementState;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver;
import p000.ld1;
import p000.nd6;
import p000.nk4;
import p000.v03;
import p000.v13;
import p000.wl3;
import p000.z13;

/* renamed from: kd1 */
/* compiled from: DeserializationComponentsForJava.kt */
public final class kd1 {

    /* renamed from: kd1$a */
    /* compiled from: DeserializationComponentsForJava.kt */
    public static final class C7341a implements o13 {
        /* renamed from: a */
        public List<h03> mo52892a(nf0 nf0) {
            vx2.m53591g(nf0, "classId");
            return null;
        }
    }

    /* renamed from: a */
    public static final jd1 m59743a(mx3 mx3, da6 da6, NotFoundClasses notFoundClasses, LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider, nc3 nc3, DeserializedDescriptorResolver deserializedDescriptorResolver, gr1 gr1) {
        da6 da62 = da6;
        NotFoundClasses notFoundClasses2 = notFoundClasses;
        nc3 nc32 = nc3;
        DeserializedDescriptorResolver deserializedDescriptorResolver2 = deserializedDescriptorResolver;
        vx2.m53591g(mx3, "module");
        vx2.m53591g(da6, "storageManager");
        vx2.m53591g(notFoundClasses2, "notFoundClasses");
        LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider2 = lazyJavaPackageFragmentProvider;
        vx2.m53591g(lazyJavaPackageFragmentProvider2, "lazyJavaPackageFragmentProvider");
        vx2.m53591g(nc32, "reflectKotlinClassFinder");
        vx2.m53591g(deserializedDescriptorResolver2, "deserializedDescriptorResolver");
        gr1 gr12 = gr1;
        vx2.m53591g(gr12, "errorReporter");
        return new jd1(da62, mx3, ld1.C7827a.f40603a, new r03(nc32, deserializedDescriptorResolver2), new j10(mx3, notFoundClasses2, da6, nc32), lazyJavaPackageFragmentProvider2, notFoundClasses2, gr12, wl3.C9555a.f45737a, ht0.f38268a.mo52313a(), k64.f38868b.mo52871a(), new qz6(bk0.m32598e(ta1.f44696a)));
    }

    /* renamed from: b */
    public static final LazyJavaPackageFragmentProvider m59744b(t03 t03, mx3 mx3, da6 da6, NotFoundClasses notFoundClasses, nc3 nc3, DeserializedDescriptorResolver deserializedDescriptorResolver, gr1 gr1, b23 b23, ix3 ix3, nk4 nk4) {
        da6 da62 = da6;
        vx2.m53591g(t03, "javaClassFinder");
        vx2.m53591g(mx3, "module");
        vx2.m53591g(da62, "storageManager");
        vx2.m53591g(notFoundClasses, "notFoundClasses");
        vx2.m53591g(nc3, "reflectKotlinClassFinder");
        vx2.m53591g(deserializedDescriptorResolver, "deserializedDescriptorResolver");
        vx2.m53591g(gr1, "errorReporter");
        vx2.m53591g(b23, "javaSourceElementFactory");
        vx2.m53591g(ix3, "singleModuleClassResolver");
        vx2.m53591g(nk4, "packagePartProvider");
        v16 v16 = v16.f45205a;
        v16 v162 = v16;
        vx2.m53590f(v16, "DO_NOTHING");
        x13 x13 = x13.f45832a;
        x13 x132 = x13;
        vx2.m53590f(x13, "EMPTY");
        v13.C9431a aVar = v13.C9431a.f45203a;
        y13 y13 = r0;
        wk5 wk5 = r14;
        wk5 wk52 = new wk5(da62, ck0.m33062j());
        nd6.C7936a aVar2 = nd6.C7936a.f41155a;
        wl3.C9555a aVar3 = wl3.C9555a.f45737a;
        t03 t032 = t03;
        ReflectionTypes reflectionTypes = r2;
        ReflectionTypes reflectionTypes2 = new ReflectionTypes(mx3, notFoundClasses);
        C6868bm bmVar = r0;
        JavaTypeEnhancementState.C7447a aVar4 = JavaTypeEnhancementState.f39397d;
        C6868bm bmVar2 = new C6868bm(aVar4.mo53443a());
        SignatureEnhancement signatureEnhancement = r0;
        z13.C9661a aVar5 = z13.C9661a.f46323a;
        z13.C9661a aVar6 = aVar5;
        SignatureEnhancement signatureEnhancement2 = new SignatureEnhancement(new g23(aVar5));
        v03.C9428a aVar7 = v03.C9428a.f45200a;
        l64 a = k64.f38868b.mo52871a();
        JavaTypeEnhancementState a2 = aVar4.mo53443a();
        C7341a aVar8 = r0;
        C7341a aVar9 = new C7341a();
        da6 da63 = da6;
        t03 t033 = t032;
        nc3 nc32 = nc3;
        y13 y132 = new y13(da63, t033, nc32, deserializedDescriptorResolver, v162, gr1, x132, aVar, wk5, b23, ix3, nk4, aVar2, aVar3, mx3, reflectionTypes, bmVar, signatureEnhancement, aVar7, aVar6, a, a2, aVar8, (ek6) null, 8388608, (DefaultConstructorMarker) null);
        return new LazyJavaPackageFragmentProvider(y13);
    }

    /* renamed from: c */
    public static /* synthetic */ LazyJavaPackageFragmentProvider m59745c(t03 t03, mx3 mx3, da6 da6, NotFoundClasses notFoundClasses, nc3 nc3, DeserializedDescriptorResolver deserializedDescriptorResolver, gr1 gr1, b23 b23, ix3 ix3, nk4 nk4, int i, Object obj) {
        nk4.C8991a aVar;
        if ((i & RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0) {
            aVar = nk4.C8991a.f43498a;
        } else {
            aVar = nk4;
        }
        return m59744b(t03, mx3, da6, notFoundClasses, nc3, deserializedDescriptorResolver, gr1, b23, ix3, aVar);
    }
}
