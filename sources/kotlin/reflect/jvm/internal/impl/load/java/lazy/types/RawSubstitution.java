package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import com.fasterxml.jackson.core.JsonFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.builtins.C7389b;
import kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;

/* compiled from: RawType.kt */
public final class RawSubstitution extends p17 {

    /* renamed from: d */
    public static final C7468a f39561d = new C7468a((DefaultConstructorMarker) null);

    /* renamed from: e */
    public static final f23 f39562e;

    /* renamed from: f */
    public static final f23 f39563f;

    /* renamed from: c */
    public final TypeParameterUpperBoundEraser f39564c;

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawSubstitution$a */
    /* compiled from: RawType.kt */
    public static final class C7468a {
        public C7468a() {
        }

        public /* synthetic */ C7468a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawSubstitution$b */
    /* compiled from: RawType.kt */
    public /* synthetic */ class C7469b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f39565a;

        static {
            int[] iArr = new int[JavaTypeFlexibility.values().length];
            iArr[JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND.ordinal()] = 1;
            iArr[JavaTypeFlexibility.FLEXIBLE_UPPER_BOUND.ordinal()] = 2;
            iArr[JavaTypeFlexibility.INFLEXIBLE.ordinal()] = 3;
            f39565a = iArr;
        }
    }

    static {
        TypeUsage typeUsage = TypeUsage.COMMON;
        f39562e = l23.m63664d(typeUsage, false, (a17) null, 3, (Object) null).mo51588i(JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND);
        f39563f = l23.m63664d(typeUsage, false, (a17) null, 3, (Object) null).mo51588i(JavaTypeFlexibility.FLEXIBLE_UPPER_BOUND);
    }

    public RawSubstitution(TypeParameterUpperBoundEraser typeParameterUpperBoundEraser) {
        this.f39564c = typeParameterUpperBoundEraser == null ? new TypeParameterUpperBoundEraser(this) : typeParameterUpperBoundEraser;
    }

    /* renamed from: k */
    public static /* synthetic */ f17 m61002k(RawSubstitution rawSubstitution, a17 a17, f23 f23, xc3 xc3, int i, Object obj) {
        if ((i & 4) != 0) {
            xc3 = rawSubstitution.f39564c.mo53672c(a17, true, f23);
            vx2.m53590f(xc3, "typeParameterUpperBoundE…eter, isRaw = true, attr)");
        }
        return rawSubstitution.mo53662j(a17, f23, xc3);
    }

    /* renamed from: n */
    public static /* synthetic */ xc3 m61003n(RawSubstitution rawSubstitution, xc3 xc3, f23 f23, int i, Object obj) {
        if ((i & 2) != 0) {
            f23 = new f23(TypeUsage.COMMON, (JavaTypeFlexibility) null, false, (Set) null, (d36) null, 30, (DefaultConstructorMarker) null);
        }
        return rawSubstitution.mo53664m(xc3, f23);
    }

    /* renamed from: f */
    public boolean mo50031f() {
        return false;
    }

    /* renamed from: j */
    public final f17 mo53662j(a17 a17, f23 f23, xc3 xc3) {
        vx2.m53591g(a17, "parameter");
        vx2.m53591g(f23, "attr");
        vx2.m53591g(xc3, "erasedUpperBound");
        int i = C7469b.f39565a[f23.mo51581d().ordinal()];
        if (i == 1) {
            return new h17(Variance.INVARIANT, xc3);
        }
        if (i != 2 && i != 3) {
            throw new NoWhenBranchMatchedException();
        } else if (!a17.mo50049j().getAllowsOutPosition()) {
            return new h17(Variance.INVARIANT, DescriptorUtilsKt.m62445f(a17).mo53150H());
        } else {
            List<a17> parameters = xc3.mo51134H0().getParameters();
            vx2.m53590f(parameters, "erasedUpperBound.constructor.parameters");
            if (!parameters.isEmpty()) {
                return new h17(Variance.OUT_VARIANCE, xc3);
            }
            return l23.m63662b(a17, f23);
        }
    }

    /* renamed from: l */
    public final Pair<d36, Boolean> mo53663l(d36 d36, if0 if0, f23 f23) {
        if (d36.mo51134H0().getParameters().isEmpty()) {
            return wy6.m54142a(d36, Boolean.FALSE);
        }
        if (C7389b.m60125c0(d36)) {
            f17 f17 = d36.mo51132F0().get(0);
            Variance c = f17.mo51409c();
            xc3 type = f17.getType();
            vx2.m53590f(type, "componentTypeProjection.type");
            return wy6.m54142a(KotlinTypeFactory.m62853i(d36.mo51133G0(), d36.mo51134H0(), bk0.m32598e(new h17(c, mo53664m(type, f23))), d36.mo51135I0(), (bd3) null, 16, (Object) null), Boolean.FALSE);
        } else if (zc3.m74855a(d36)) {
            return wy6.m54142a(nr1.m70033d(ErrorTypeKind.ERROR_RAW_TYPE, d36.mo51134H0().toString()), Boolean.FALSE);
        } else {
            MemberScope D = if0.mo52459D(this);
            vx2.m53590f(D, "declaration.getMemberScope(this)");
            rz6 G0 = d36.mo51133G0();
            yz6 g = if0.mo50046g();
            vx2.m53590f(g, "declaration.typeConstructor");
            List<a17> parameters = if0.mo50046g().getParameters();
            vx2.m53590f(parameters, "declaration.typeConstructor.parameters");
            ArrayList arrayList = new ArrayList(dk0.m43495u(parameters, 10));
            for (a17 a17 : parameters) {
                vx2.m53590f(a17, "parameter");
                arrayList.add(m61002k(this, a17, f23, (xc3) null, 4, (Object) null));
            }
            return wy6.m54142a(KotlinTypeFactory.m62855k(G0, g, arrayList, d36.mo51135I0(), D, new RawSubstitution$eraseInflexibleBasedOnClassDescriptor$2(if0, this, d36, f23)), Boolean.TRUE);
        }
    }

    /* renamed from: m */
    public final xc3 mo53664m(xc3 xc3, f23 f23) {
        eg0 d = xc3.mo51134H0().mo51180d();
        if (d instanceof a17) {
            xc3 c = this.f39564c.mo53672c((a17) d, true, f23);
            vx2.m53590f(c, "typeParameterUpperBoundE…tion, isRaw = true, attr)");
            return mo53664m(c, f23);
        } else if (d instanceof if0) {
            eg0 d2 = n42.m64518d(xc3).mo51134H0().mo51180d();
            if (d2 instanceof if0) {
                Pair<d36, Boolean> l = mo53663l(n42.m64517c(xc3), (if0) d, f39562e);
                d36 component1 = l.component1();
                boolean booleanValue = l.component2().booleanValue();
                Pair<d36, Boolean> l2 = mo53663l(n42.m64518d(xc3), (if0) d2, f39563f);
                d36 component12 = l2.component1();
                boolean booleanValue2 = l2.component2().booleanValue();
                if (booleanValue || booleanValue2) {
                    return new RawTypeImpl(component1, component12);
                }
                return KotlinTypeFactory.m62849d(component1, component12);
            }
            throw new IllegalStateException(("For some reason declaration for upper bound is not a class but \"" + d2 + "\" while for lower it's \"" + d + JsonFactory.DEFAULT_QUOTE_CHAR).toString());
        } else {
            throw new IllegalStateException(("Unexpected declaration kind: " + d).toString());
        }
    }

    /* renamed from: o */
    public h17 mo50024e(xc3 xc3) {
        vx2.m53591g(xc3, "key");
        return new h17(m61003n(this, xc3, (f23) null, 2, (Object) null));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RawSubstitution(TypeParameterUpperBoundEraser typeParameterUpperBoundEraser, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : typeParameterUpperBoundEraser);
    }
}
