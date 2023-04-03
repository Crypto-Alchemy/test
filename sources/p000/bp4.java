package p000;

import kotlin.reflect.jvm.internal.impl.descriptors.C7428e;

/* renamed from: bp4 */
/* compiled from: PlatformDependentDeclarationFilter.kt */
public interface bp4 {

    /* renamed from: bp4$a */
    /* compiled from: PlatformDependentDeclarationFilter.kt */
    public static final class C6871a implements bp4 {

        /* renamed from: a */
        public static final C6871a f36921a = new C6871a();

        /* renamed from: c */
        public boolean mo50688c(if0 if0, C7428e eVar) {
            vx2.m53591g(if0, "classDescriptor");
            vx2.m53591g(eVar, "functionDescriptor");
            return true;
        }
    }

    /* renamed from: bp4$b */
    /* compiled from: PlatformDependentDeclarationFilter.kt */
    public static final class C6872b implements bp4 {

        /* renamed from: a */
        public static final C6872b f36922a = new C6872b();

        /* renamed from: c */
        public boolean mo50688c(if0 if0, C7428e eVar) {
            vx2.m53591g(if0, "classDescriptor");
            vx2.m53591g(eVar, "functionDescriptor");
            return !eVar.getAnnotations().mo51224C0(cp4.m56488a());
        }
    }

    /* renamed from: c */
    boolean mo50688c(if0 if0, C7428e eVar);
}
