package p000;

import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* renamed from: kz6 */
/* compiled from: TypeAliasExpansionReportStrategy.kt */
public interface kz6 {

    /* renamed from: kz6$a */
    /* compiled from: TypeAliasExpansionReportStrategy.kt */
    public static final class C7812a implements kz6 {

        /* renamed from: a */
        public static final C7812a f40548a = new C7812a();

        /* renamed from: a */
        public void mo55791a(C9460vl vlVar) {
            vx2.m53591g(vlVar, "annotation");
        }

        /* renamed from: b */
        public void mo55792b(hz6 hz6, a17 a17, xc3 xc3) {
            vx2.m53591g(hz6, "typeAlias");
            vx2.m53591g(xc3, "substitutedArgument");
        }

        /* renamed from: c */
        public void mo55793c(TypeSubstitutor typeSubstitutor, xc3 xc3, xc3 xc32, a17 a17) {
            vx2.m53591g(typeSubstitutor, "substitutor");
            vx2.m53591g(xc3, "unsubstitutedArgument");
            vx2.m53591g(xc32, "argument");
            vx2.m53591g(a17, "typeParameter");
        }

        /* renamed from: d */
        public void mo55794d(hz6 hz6) {
            vx2.m53591g(hz6, "typeAlias");
        }
    }

    /* renamed from: a */
    void mo55791a(C9460vl vlVar);

    /* renamed from: b */
    void mo55792b(hz6 hz6, a17 a17, xc3 xc3);

    /* renamed from: c */
    void mo55793c(TypeSubstitutor typeSubstitutor, xc3 xc3, xc3 xc32, a17 a17);

    /* renamed from: d */
    void mo55794d(hz6 hz6);
}
