package p000;

import kotlin.reflect.jvm.internal.impl.descriptors.impl.LazyPackageViewDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;

/* renamed from: uk4 */
/* compiled from: PackageViewDescriptorFactory.kt */
public interface uk4 {

    /* renamed from: a */
    public static final C9401a f45088a = C9401a.f45089a;

    /* renamed from: uk4$a */
    /* compiled from: PackageViewDescriptorFactory.kt */
    public static final class C9401a {

        /* renamed from: a */
        public static final /* synthetic */ C9401a f45089a = new C9401a();

        /* renamed from: b */
        public static final hx3<uk4> f45090b = new hx3<>("PackageViewDescriptorFactory");

        /* renamed from: a */
        public final hx3<uk4> mo66294a() {
            return f45090b;
        }
    }

    /* renamed from: uk4$b */
    /* compiled from: PackageViewDescriptorFactory.kt */
    public static final class C9402b implements uk4 {

        /* renamed from: b */
        public static final C9402b f45091b = new C9402b();

        /* renamed from: a */
        public tk4 mo66293a(ModuleDescriptorImpl moduleDescriptorImpl, u82 u82, da6 da6) {
            vx2.m53591g(moduleDescriptorImpl, "module");
            vx2.m53591g(u82, "fqName");
            vx2.m53591g(da6, "storageManager");
            return new LazyPackageViewDescriptorImpl(moduleDescriptorImpl, u82, da6);
        }
    }

    /* renamed from: a */
    tk4 mo66293a(ModuleDescriptorImpl moduleDescriptorImpl, u82 u82, da6 da6);
}
