package p000;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.builtins.C7389b;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver;
import kotlin.reflect.jvm.internal.impl.protobuf.C7616d;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import p000.C6818ad;
import p000.bp4;
import p000.gj3;
import p000.ld1;

/* renamed from: jd1 */
/* compiled from: DeserializationComponentsForJava.kt */
public final class jd1 {

    /* renamed from: b */
    public static final C7260a f38644b = new C7260a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final id1 f38645a;

    /* renamed from: jd1$a */
    /* compiled from: DeserializationComponentsForJava.kt */
    public static final class C7260a {

        /* renamed from: jd1$a$a */
        /* compiled from: DeserializationComponentsForJava.kt */
        public static final class C7261a {

            /* renamed from: a */
            public final jd1 f38646a;

            /* renamed from: b */
            public final DeserializedDescriptorResolver f38647b;

            public C7261a(jd1 jd1, DeserializedDescriptorResolver deserializedDescriptorResolver) {
                vx2.m53591g(jd1, "deserializationComponentsForJava");
                vx2.m53591g(deserializedDescriptorResolver, "deserializedDescriptorResolver");
                this.f38646a = jd1;
                this.f38647b = deserializedDescriptorResolver;
            }

            /* renamed from: a */
            public final jd1 mo52666a() {
                return this.f38646a;
            }

            /* renamed from: b */
            public final DeserializedDescriptorResolver mo52667b() {
                return this.f38647b;
            }
        }

        public C7260a() {
        }

        public /* synthetic */ C7260a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C7261a mo52665a(nc3 nc3, nc3 nc32, t03 t03, String str, gr1 gr1, b23 b23) {
            String str2 = str;
            vx2.m53591g(nc3, "kotlinClassFinder");
            vx2.m53591g(nc32, "jvmBuiltInsKotlinClassFinder");
            t03 t032 = t03;
            vx2.m53591g(t032, "javaClassFinder");
            vx2.m53591g(str2, "moduleName");
            vx2.m53591g(gr1, "errorReporter");
            b23 b232 = b23;
            vx2.m53591g(b232, "javaSourceElementFactory");
            LockBasedStorageManager lockBasedStorageManager = new LockBasedStorageManager("DeserializationComponentsForJava.ModuleData");
            JvmBuiltIns jvmBuiltIns = new JvmBuiltIns(lockBasedStorageManager, JvmBuiltIns.Kind.FROM_DEPENDENCIES);
            r24 m = r24.m71447m('<' + str2 + '>');
            vx2.m53590f(m, "special(\"<$moduleName>\")");
            ModuleDescriptorImpl moduleDescriptorImpl = new ModuleDescriptorImpl(m, lockBasedStorageManager, jvmBuiltIns, (ql6) null, (Map) null, (r24) null, 56, (DefaultConstructorMarker) null);
            jvmBuiltIns.mo53146D0(moduleDescriptorImpl);
            jvmBuiltIns.mo53214I0(moduleDescriptorImpl, true);
            DeserializedDescriptorResolver deserializedDescriptorResolver = new DeserializedDescriptorResolver();
            k36 k36 = new k36();
            NotFoundClasses notFoundClasses = new NotFoundClasses(lockBasedStorageManager, moduleDescriptorImpl);
            nc3 nc33 = nc3;
            NotFoundClasses notFoundClasses2 = notFoundClasses;
            k36 k362 = k36;
            gr1 gr12 = gr1;
            DeserializedDescriptorResolver deserializedDescriptorResolver2 = deserializedDescriptorResolver;
            ModuleDescriptorImpl moduleDescriptorImpl2 = moduleDescriptorImpl;
            JvmBuiltIns jvmBuiltIns2 = jvmBuiltIns;
            LazyJavaPackageFragmentProvider c = kd1.m59745c(t032, moduleDescriptorImpl, lockBasedStorageManager, notFoundClasses, nc33, deserializedDescriptorResolver, gr12, b232, k362, (nk4) null, RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN, (Object) null);
            jd1 a = kd1.m59743a(moduleDescriptorImpl2, lockBasedStorageManager, notFoundClasses2, c, nc33, deserializedDescriptorResolver2, gr12);
            DeserializedDescriptorResolver deserializedDescriptorResolver3 = deserializedDescriptorResolver2;
            deserializedDescriptorResolver3.mo53807m(a);
            x13 x13 = x13.f45832a;
            vx2.m53590f(x13, "EMPTY");
            a13 a13 = new a13(c, x13);
            k362.mo52857c(a13);
            v73 v73 = new v73(lockBasedStorageManager, nc32, moduleDescriptorImpl2, notFoundClasses2, jvmBuiltIns2.mo53213H0(), jvmBuiltIns2.mo53213H0(), ld1.C7827a.f40603a, k64.f38868b.mo52871a(), new wk5(lockBasedStorageManager, ck0.m33062j()));
            ModuleDescriptorImpl moduleDescriptorImpl3 = moduleDescriptorImpl2;
            moduleDescriptorImpl3.mo53300S0(moduleDescriptorImpl3);
            List m2 = ck0.m33065m(a13.mo50039a(), v73);
            moduleDescriptorImpl3.mo53294M0(new rn0(m2, "CompositeProvider@RuntimeModuleData for " + moduleDescriptorImpl3));
            return new C7261a(a, deserializedDescriptorResolver3);
        }
    }

    public jd1(da6 da6, mx3 mx3, ld1 ld1, r03 r03, j10 j10, LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider, NotFoundClasses notFoundClasses, gr1 gr1, wl3 wl3, ht0 ht0, k64 k64, qz6 qz6) {
        bp4 bp4;
        C6818ad adVar;
        da6 da62 = da6;
        vx2.m53591g(da62, "storageManager");
        vx2.m53591g(mx3, "moduleDescriptor");
        vx2.m53591g(ld1, "configuration");
        vx2.m53591g(r03, "classDataFinder");
        vx2.m53591g(j10, "annotationAndConstantLoader");
        vx2.m53591g(lazyJavaPackageFragmentProvider, "packageFragmentProvider");
        vx2.m53591g(notFoundClasses, "notFoundClasses");
        vx2.m53591g(gr1, "errorReporter");
        vx2.m53591g(wl3, "lookupTracker");
        vx2.m53591g(ht0, "contractDeserializer");
        vx2.m53591g(k64, "kotlinTypeChecker");
        vx2.m53591g(qz6, "typeAttributeTranslators");
        C7389b k = mx3.mo51535k();
        JvmBuiltIns jvmBuiltIns = k instanceof JvmBuiltIns ? (JvmBuiltIns) k : null;
        gj3.C7132a aVar = gj3.C7132a.f38031a;
        g13 g13 = g13.f37941a;
        List j = ck0.m33062j();
        C6818ad adVar2 = (jvmBuiltIns == null || (adVar = jvmBuiltIns.mo53213H0()) == null) ? C6818ad.C6819a.f36428a : adVar;
        bp4 bp42 = (jvmBuiltIns == null || (bp4 = jvmBuiltIns.mo53213H0()) == null) ? bp4.C6872b.f36922a : bp4;
        C7616d a = i83.f38338a.mo52417a();
        wk5 wk5 = r0;
        wk5 wk52 = new wk5(da62, ck0.m33062j());
        id1 id1 = r0;
        id1 id12 = new id1(da6, mx3, ld1, r03, j10, lazyJavaPackageFragmentProvider, aVar, gr1, wl3, g13, j, notFoundClasses, ht0, adVar2, bp42, a, k64, wk5, (dp4) null, qz6.mo65573a(), 262144, (DefaultConstructorMarker) null);
        this.f38645a = id1;
    }

    /* renamed from: a */
    public final id1 mo52664a() {
        return this.f38645a;
    }
}
