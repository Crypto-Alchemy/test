package p000;

import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;

/* renamed from: br1 */
/* compiled from: ErrorClassDescriptor.kt */
public final class br1 extends lf0 {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public br1(p000.r24 r21) {
        /*
            r20 = this;
            r9 = r20
            java.lang.String r0 = "name"
            r2 = r21
            p000.vx2.m53591g(r2, r0)
            nr1 r10 = p000.nr1.f43548a
            mx3 r1 = r10.mo62789i()
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r3 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.OPEN
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r4 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.CLASS
            java.util.List r5 = p000.ck0.m33062j()
            a66 r11 = p000.a66.f36360a
            da6 r8 = kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.f40224e
            r7 = 0
            r0 = r20
            r6 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            dm$a r0 = p000.C6983dm.f37317b
            dm r0 = r0.mo51228b()
            r1 = 1
            ff0 r0 = p000.ff0.m57685h1(r9, r0, r1, r11)
            java.util.List r2 = p000.ck0.m33062j()
            fd1 r3 = p000.ed1.f37509d
            r0.mo51665k1(r2, r3)
            java.lang.String r2 = "create(this, Annotations…          )\n            }"
            p000.vx2.m53590f(r0, r2)
            kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind r2 = kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind.SCOPE_FOR_ERROR_CLASS
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]
            r24 r4 = r0.getName()
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "errorConstructor.name.toString()"
            p000.vx2.m53590f(r4, r5)
            r5 = 0
            r3[r5] = r4
            java.lang.String r4 = ""
            r3[r1] = r4
            jr1 r1 = p000.nr1.m70032b(r2, r3)
            lr1 r2 = new lr1
            kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind r14 = kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind.ERROR_CLASS
            java.lang.String[] r3 = new java.lang.String[r5]
            mr1 r12 = r10.mo62785e(r14, r3)
            java.lang.String[] r3 = new java.lang.String[r5]
            r15 = 0
            r16 = 0
            r18 = 24
            r19 = 0
            r11 = r2
            r13 = r1
            r17 = r3
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            r0.mo53336a1(r2)
            java.util.Set r2 = p000.my5.m48548d(r0)
            r9.mo55890E0(r1, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.br1.<init>(r24):void");
    }

    /* renamed from: A0 */
    public if0 mo50708c(TypeSubstitutor typeSubstitutor) {
        vx2.m53591g(typeSubstitutor, "substitutor");
        return this;
    }

    /* renamed from: Q */
    public MemberScope mo50707Q(p17 p17, bd3 bd3) {
        vx2.m53591g(p17, "typeSubstitution");
        vx2.m53591g(bd3, "kotlinTypeRefiner");
        ErrorScopeKind errorScopeKind = ErrorScopeKind.SCOPE_FOR_ERROR_CLASS;
        String r24 = getName().toString();
        vx2.m53590f(r24, "name.toString()");
        return nr1.m70032b(errorScopeKind, r24, p17.toString());
    }

    public String toString() {
        String d = getName().mo65594d();
        vx2.m53590f(d, "name.asString()");
        return d;
    }
}
