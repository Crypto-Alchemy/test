package p000;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.C7425c;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope;

/* renamed from: vd2 */
/* compiled from: FunctionClassScope.kt */
public final class vd2 extends GivenFunctionsMemberScope {

    /* renamed from: vd2$a */
    /* compiled from: FunctionClassScope.kt */
    public /* synthetic */ class C9450a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f45277a;

        static {
            int[] iArr = new int[FunctionClassKind.values().length];
            iArr[FunctionClassKind.Function.ordinal()] = 1;
            iArr[FunctionClassKind.SuspendFunction.ordinal()] = 2;
            f45277a = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vd2(da6 da6, ud2 ud2) {
        super(da6, ud2);
        vx2.m53591g(da6, "storageManager");
        vx2.m53591g(ud2, "containingClass");
    }

    /* renamed from: i */
    public List<C7425c> mo51467i() {
        if0 l = mo55093l();
        vx2.m53589e(l, "null cannot be cast to non-null type org.jetbrains.kotlin.builtins.functions.FunctionClassDescriptor");
        int i = C9450a.f45277a[((ud2) l).mo66240O0().ordinal()];
        if (i == 1) {
            return bk0.m32598e(ae2.f36443r1.mo50148a((ud2) mo55093l(), false));
        }
        if (i != 2) {
            return ck0.m33062j();
        }
        return bk0.m32598e(ae2.f36443r1.mo50148a((ud2) mo55093l(), true));
    }
}
