package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind;
import kotlin.text.StringsKt__StringsKt;
import org.web3j.ens.contracts.generated.PublicResolver;

/* renamed from: f50 */
/* compiled from: BuiltInFictitiousFunctionClassFactory.kt */
public final class f50 implements kf0 {

    /* renamed from: a */
    public final da6 f37728a;

    /* renamed from: b */
    public final mx3 f37729b;

    public f50(da6 da6, mx3 mx3) {
        vx2.m53591g(da6, "storageManager");
        vx2.m53591g(mx3, "module");
        this.f37728a = da6;
        this.f37729b = mx3;
    }

    /* renamed from: a */
    public if0 mo51602a(nf0 nf0) {
        vx2.m53591g(nf0, "classId");
        if (nf0.mo62682k() || nf0.mo62683l()) {
            return null;
        }
        String b = nf0.mo62680i().mo66195b();
        vx2.m53590f(b, "classId.relativeClassName.asString()");
        if (!StringsKt__StringsKt.m63081R(b, "Function", false, 2, (Object) null)) {
            return null;
        }
        u82 h = nf0.mo62678h();
        vx2.m53590f(h, "classId.packageFqName");
        FunctionClassKind.C7397a.C7398a c = FunctionClassKind.Companion.mo53201c(b, h);
        if (c == null) {
            return null;
        }
        FunctionClassKind a = c.mo53203a();
        int b2 = c.mo53204b();
        List<fk4> c0 = this.f37729b.mo51532N(h).mo53282c0();
        ArrayList arrayList = new ArrayList();
        for (T next : c0) {
            if (next instanceof k50) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object next2 : arrayList) {
            if (next2 instanceof zd2) {
                arrayList2.add(next2);
            }
        }
        fk4 fk4 = (zd2) CollectionsKt___CollectionsKt.m47331b0(arrayList2);
        if (fk4 == null) {
            fk4 = (k50) CollectionsKt___CollectionsKt.m47329Z(arrayList);
        }
        return new ud2(this.f37728a, fk4, a, b2);
    }

    /* renamed from: b */
    public Collection<if0> mo51603b(u82 u82) {
        vx2.m53591g(u82, "packageFqName");
        return ny5.m49095e();
    }

    /* renamed from: c */
    public boolean mo51604c(u82 u82, r24 r24) {
        vx2.m53591g(u82, "packageFqName");
        vx2.m53591g(r24, PublicResolver.FUNC_NAME);
        String d = r24.mo65594d();
        vx2.m53590f(d, "name.asString()");
        if ((yb6.m74336M(d, "Function", false, 2, (Object) null) || yb6.m74336M(d, "KFunction", false, 2, (Object) null) || yb6.m74336M(d, "SuspendFunction", false, 2, (Object) null) || yb6.m74336M(d, "KSuspendFunction", false, 2, (Object) null)) && FunctionClassKind.Companion.mo53201c(d, u82) != null) {
            return true;
        }
        return false;
    }
}
