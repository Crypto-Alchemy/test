package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.builtins.C7395c;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import p000.nd6;

/* renamed from: ud2 */
/* compiled from: FunctionClassDescriptor.kt */
public final class ud2 extends C9387u5 {

    /* renamed from: H */
    public static final C9397a f44954H = new C9397a((DefaultConstructorMarker) null);

    /* renamed from: I */
    public static final nf0 f44955I = new nf0(C7395c.f39113r, r24.m71445h("Function"));

    /* renamed from: L */
    public static final nf0 f44956L = new nf0(C7395c.f39110o, r24.m71445h("KFunction"));

    /* renamed from: A */
    public final C9398b f44957A = new C9398b();

    /* renamed from: B */
    public final vd2 f44958B;

    /* renamed from: C */
    public final List<a17> f44959C;

    /* renamed from: r */
    public final da6 f44960r;

    /* renamed from: s */
    public final fk4 f44961s;

    /* renamed from: x */
    public final FunctionClassKind f44962x;

    /* renamed from: y */
    public final int f44963y;

    /* renamed from: ud2$a */
    /* compiled from: FunctionClassDescriptor.kt */
    public static final class C9397a {
        public C9397a() {
        }

        public /* synthetic */ C9397a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ud2$b */
    /* compiled from: FunctionClassDescriptor.kt */
    public final class C9398b extends C9442v5 {

        /* renamed from: ud2$b$a */
        /* compiled from: FunctionClassDescriptor.kt */
        public /* synthetic */ class C9399a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f44965a;

            static {
                int[] iArr = new int[FunctionClassKind.values().length];
                iArr[FunctionClassKind.Function.ordinal()] = 1;
                iArr[FunctionClassKind.KFunction.ordinal()] = 2;
                iArr[FunctionClassKind.SuspendFunction.ordinal()] = 3;
                iArr[FunctionClassKind.KSuspendFunction.ordinal()] = 4;
                f44965a = iArr;
            }
        }

        public C9398b() {
            super(ud2.this.f44960r);
        }

        /* renamed from: e */
        public boolean mo51809e() {
            return true;
        }

        public List<a17> getParameters() {
            return ud2.this.f44959C;
        }

        /* renamed from: m */
        public Collection<xc3> mo52632m() {
            List<nf0> list;
            int i = C9399a.f44965a[ud2.this.mo66240O0().ordinal()];
            if (i == 1) {
                list = bk0.m32598e(ud2.f44955I);
            } else if (i == 2) {
                list = ck0.m33065m(ud2.f44956L, new nf0(C7395c.f39113r, FunctionClassKind.Function.numberedClassName(ud2.this.mo66236K0())));
            } else if (i == 3) {
                list = bk0.m32598e(ud2.f44955I);
            } else if (i == 4) {
                list = ck0.m33065m(ud2.f44956L, new nf0(C7395c.f39105j, FunctionClassKind.SuspendFunction.numberedClassName(ud2.this.mo66236K0())));
            } else {
                throw new NoWhenBranchMatchedException();
            }
            mx3 b = ud2.this.f44961s.mo51119b();
            ArrayList arrayList = new ArrayList(dk0.m43495u(list, 10));
            for (nf0 nf0 : list) {
                if0 a = FindClassInModuleKt.m60278a(b, nf0);
                if (a != null) {
                    List<T> F0 = CollectionsKt___CollectionsKt.m47306F0(getParameters(), a.mo50046g().getParameters().size());
                    ArrayList arrayList2 = new ArrayList(dk0.m43495u(F0, 10));
                    for (T n : F0) {
                        arrayList2.add(new h17(n.mo51464n()));
                    }
                    arrayList.add(KotlinTypeFactory.m62851g(rz6.f44504d.mo65783h(), a, arrayList2));
                } else {
                    throw new IllegalStateException(("Built-in class " + nf0 + " not found").toString());
                }
            }
            return CollectionsKt___CollectionsKt.m47311K0(arrayList);
        }

        /* renamed from: q */
        public nd6 mo52634q() {
            return nd6.C7936a.f41155a;
        }

        public String toString() {
            return mo53524w().toString();
        }

        /* renamed from: x */
        public ud2 mo53524w() {
            return ud2.this;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ud2(da6 da6, fk4 fk4, FunctionClassKind functionClassKind, int i) {
        super(da6, functionClassKind.numberedClassName(i));
        vx2.m53591g(da6, "storageManager");
        vx2.m53591g(fk4, "containingDeclaration");
        vx2.m53591g(functionClassKind, "functionKind");
        this.f44960r = da6;
        this.f44961s = fk4;
        this.f44962x = functionClassKind;
        this.f44963y = i;
        this.f44958B = new vd2(da6, this);
        ArrayList arrayList = new ArrayList();
        rw2 rw2 = new rw2(1, i);
        ArrayList arrayList2 = new ArrayList(dk0.m43495u(rw2, 10));
        Iterator it = rw2.iterator();
        while (it.hasNext()) {
            int nextInt = ((lw2) it).nextInt();
            Variance variance = Variance.IN_VARIANCE;
            StringBuilder sb = new StringBuilder();
            sb.append('P');
            sb.append(nextInt);
            m72708E0(arrayList, this, variance, sb.toString());
            arrayList2.add(r37.f33317a);
        }
        m72708E0(arrayList, this, Variance.OUT_VARIANCE, "R");
        this.f44959C = CollectionsKt___CollectionsKt.m47311K0(arrayList);
    }

    /* renamed from: E0 */
    public static final void m72708E0(ArrayList<a17> arrayList, ud2 ud2, Variance variance, String str) {
        arrayList.add(b17.m55708L0(ud2, C6983dm.f37317b.mo51228b(), false, variance, r24.m71445h(str), arrayList.size(), ud2.f44960r));
    }

    /* renamed from: C0 */
    public boolean mo52338C0() {
        return false;
    }

    /* renamed from: K0 */
    public final int mo66236K0() {
        return this.f44963y;
    }

    /* renamed from: L0 */
    public Void mo66237L0() {
        return null;
    }

    /* renamed from: M0 */
    public List<ef0> mo52349h() {
        return ck0.m33062j();
    }

    /* renamed from: N0 */
    public fk4 mo51119b() {
        return this.f44961s;
    }

    /* renamed from: O0 */
    public final FunctionClassKind mo66240O0() {
        return this.f44962x;
    }

    /* renamed from: P */
    public d87<d36> mo52344P() {
        return null;
    }

    /* renamed from: P0 */
    public List<if0> mo52354w() {
        return ck0.m33062j();
    }

    /* renamed from: Q0 */
    public MemberScope.C7667a mo52347g0() {
        return MemberScope.C7667a.f40117b;
    }

    /* renamed from: R0 */
    public vd2 mo51546b0(bd3 bd3) {
        vx2.m53591g(bd3, "kotlinTypeRefiner");
        return this.f44958B;
    }

    /* renamed from: S0 */
    public Void mo66244S0() {
        return null;
    }

    /* renamed from: T */
    public boolean mo51317T() {
        return false;
    }

    /* renamed from: V */
    public boolean mo52345V() {
        return false;
    }

    /* renamed from: Y */
    public boolean mo52346Y() {
        return false;
    }

    /* renamed from: d0 */
    public boolean mo51319d0() {
        return false;
    }

    /* renamed from: g */
    public yz6 mo50046g() {
        return this.f44957A;
    }

    public C6983dm getAnnotations() {
        return C6983dm.f37317b.mo51228b();
    }

    public ClassKind getKind() {
        return ClassKind.INTERFACE;
    }

    public a66 getSource() {
        a66 a66 = a66.f36360a;
        vx2.m53590f(a66, "NO_SOURCE");
        return a66;
    }

    public fd1 getVisibility() {
        fd1 fd1 = ed1.f37510e;
        vx2.m53590f(fd1, "PUBLIC");
        return fd1;
    }

    /* renamed from: h0 */
    public /* bridge */ /* synthetic */ if0 mo52350h0() {
        return (if0) mo66237L0();
    }

    /* renamed from: i */
    public boolean mo51669i() {
        return false;
    }

    public boolean isExternal() {
        return false;
    }

    public boolean isInline() {
        return false;
    }

    /* renamed from: o */
    public List<a17> mo51670o() {
        return this.f44959C;
    }

    /* renamed from: p */
    public Modality mo51326p() {
        return Modality.ABSTRACT;
    }

    /* renamed from: q */
    public boolean mo52352q() {
        return false;
    }

    public String toString() {
        String d = getName().mo65594d();
        vx2.m53590f(d, "name.asString()");
        return d;
    }

    /* renamed from: z */
    public /* bridge */ /* synthetic */ ef0 mo52355z() {
        return (ef0) mo66244S0();
    }
}
