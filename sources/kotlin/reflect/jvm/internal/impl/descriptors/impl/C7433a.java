package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.C7420a;
import kotlin.reflect.jvm.internal.impl.descriptors.C7425c;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.web3j.ens.contracts.generated.ENS;
import org.web3j.ens.contracts.generated.PublicResolver;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.a */
/* compiled from: FunctionDescriptorImpl */
public abstract class C7433a extends g31 implements C7425c {

    /* renamed from: A */
    public h85 f39323A;

    /* renamed from: B */
    public Modality f39324B;

    /* renamed from: C */
    public fd1 f39325C;

    /* renamed from: H */
    public boolean f39326H;

    /* renamed from: I */
    public boolean f39327I;

    /* renamed from: L */
    public boolean f39328L;

    /* renamed from: M */
    public boolean f39329M;

    /* renamed from: P */
    public boolean f39330P;

    /* renamed from: Q */
    public boolean f39331Q;

    /* renamed from: U */
    public boolean f39332U;

    /* renamed from: X */
    public boolean f39333X;

    /* renamed from: Y */
    public boolean f39334Y;

    /* renamed from: Z */
    public boolean f39335Z;

    /* renamed from: b1 */
    public volatile pc2<Collection<C7425c>> f39336b1;

    /* renamed from: e0 */
    public boolean f39337e0;

    /* renamed from: e1 */
    public final C7425c f39338e1;

    /* renamed from: k */
    public List<a17> f39339k;

    /* renamed from: k0 */
    public boolean f39340k0;

    /* renamed from: o1 */
    public final CallableMemberDescriptor.Kind f39341o1;

    /* renamed from: p1 */
    public C7425c f39342p1;

    /* renamed from: q1 */
    public Map<C7420a.C7421a<?>, Object> f39343q1;

    /* renamed from: r */
    public List<n87> f39344r;

    /* renamed from: s */
    public xc3 f39345s;

    /* renamed from: v0 */
    public Collection<? extends C7425c> f39346v0;

    /* renamed from: x */
    public List<h85> f39347x;

    /* renamed from: y */
    public h85 f39348y;

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.a$a */
    /* compiled from: FunctionDescriptorImpl */
    public class C7434a implements pc2<Collection<C7425c>> {

        /* renamed from: a */
        public final /* synthetic */ TypeSubstitutor f39349a;

        public C7434a(TypeSubstitutor typeSubstitutor) {
            this.f39349a = typeSubstitutor;
        }

        /* renamed from: a */
        public Collection<C7425c> invoke() {
            v46 v46 = new v46();
            for (C7425c c : C7433a.this.mo51659d()) {
                v46.add(c.mo50708c(this.f39349a));
            }
            return v46;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.a$b */
    /* compiled from: FunctionDescriptorImpl */
    public static class C7435b implements pc2<List<o87>> {

        /* renamed from: a */
        public final /* synthetic */ List f39351a;

        public C7435b(List list) {
            this.f39351a = list;
        }

        /* renamed from: a */
        public List<o87> invoke() {
            return this.f39351a;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.a$c */
    /* compiled from: FunctionDescriptorImpl */
    public class C7436c implements C7425c.C7426a<C7425c> {

        /* renamed from: a */
        public p17 f39352a;

        /* renamed from: b */
        public d31 f39353b;

        /* renamed from: c */
        public Modality f39354c;

        /* renamed from: d */
        public fd1 f39355d;

        /* renamed from: e */
        public C7425c f39356e;

        /* renamed from: f */
        public CallableMemberDescriptor.Kind f39357f;

        /* renamed from: g */
        public List<n87> f39358g;

        /* renamed from: h */
        public List<h85> f39359h;

        /* renamed from: i */
        public h85 f39360i;

        /* renamed from: j */
        public h85 f39361j;

        /* renamed from: k */
        public xc3 f39362k;

        /* renamed from: l */
        public r24 f39363l;

        /* renamed from: m */
        public boolean f39364m;

        /* renamed from: n */
        public boolean f39365n;

        /* renamed from: o */
        public boolean f39366o;

        /* renamed from: p */
        public boolean f39367p;

        /* renamed from: q */
        public boolean f39368q;

        /* renamed from: r */
        public List<a17> f39369r;

        /* renamed from: s */
        public C6983dm f39370s;

        /* renamed from: t */
        public boolean f39371t;

        /* renamed from: u */
        public Map<C7420a.C7421a<?>, Object> f39372u;

        /* renamed from: v */
        public Boolean f39373v;

        /* renamed from: w */
        public boolean f39374w;

        /* renamed from: x */
        public final /* synthetic */ C7433a f39375x;

        public C7436c(C7433a aVar, p17 p17, d31 d31, Modality modality, fd1 fd1, CallableMemberDescriptor.Kind kind, List<n87> list, List<h85> list2, h85 h85, xc3 xc3, r24 r24) {
            if (p17 == null) {
                m60535u(0);
            }
            if (d31 == null) {
                m60535u(1);
            }
            if (modality == null) {
                m60535u(2);
            }
            if (fd1 == null) {
                m60535u(3);
            }
            if (kind == null) {
                m60535u(4);
            }
            if (list == null) {
                m60535u(5);
            }
            if (list2 == null) {
                m60535u(6);
            }
            if (xc3 == null) {
                m60535u(7);
            }
            this.f39375x = aVar;
            this.f39356e = null;
            this.f39361j = aVar.f39323A;
            this.f39364m = true;
            this.f39365n = false;
            this.f39366o = false;
            this.f39367p = false;
            this.f39368q = aVar.mo51328w0();
            this.f39369r = null;
            this.f39370s = null;
            this.f39371t = aVar.mo51330z0();
            this.f39372u = new LinkedHashMap();
            this.f39373v = null;
            this.f39374w = false;
            this.f39352a = p17;
            this.f39353b = d31;
            this.f39354c = modality;
            this.f39355d = fd1;
            this.f39357f = kind;
            this.f39358g = list;
            this.f39359h = list2;
            this.f39360i = h85;
            this.f39362k = xc3;
            this.f39363l = r24;
        }

        /* renamed from: u */
        public static /* synthetic */ void m60535u(int i) {
            String str;
            int i2;
            Throwable th;
            switch (i) {
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            switch (i) {
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    i2 = 2;
                    break;
                default:
                    i2 = 3;
                    break;
            }
            Object[] objArr = new Object[i2];
            switch (i) {
                case 1:
                    objArr[0] = "newOwner";
                    break;
                case 2:
                    objArr[0] = "newModality";
                    break;
                case 3:
                    objArr[0] = "newVisibility";
                    break;
                case 4:
                case 14:
                    objArr[0] = "kind";
                    break;
                case 5:
                    objArr[0] = "newValueParameterDescriptors";
                    break;
                case 6:
                    objArr[0] = "newContextReceiverParameters";
                    break;
                case 7:
                    objArr[0] = "newReturnType";
                    break;
                case 8:
                    objArr[0] = ENS.FUNC_OWNER;
                    break;
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                    break;
                case 10:
                    objArr[0] = "modality";
                    break;
                case 12:
                    objArr[0] = "visibility";
                    break;
                case 17:
                    objArr[0] = PublicResolver.FUNC_NAME;
                    break;
                case 19:
                case 21:
                    objArr[0] = "parameters";
                    break;
                case 23:
                    objArr[0] = "type";
                    break;
                case 25:
                    objArr[0] = "contextReceiverParameters";
                    break;
                case 35:
                    objArr[0] = "additionalAnnotations";
                    break;
                case 39:
                    objArr[0] = "userDataKey";
                    break;
                default:
                    objArr[0] = "substitution";
                    break;
            }
            switch (i) {
                case 9:
                    objArr[1] = ENS.FUNC_SETOWNER;
                    break;
                case 11:
                    objArr[1] = "setModality";
                    break;
                case 13:
                    objArr[1] = "setVisibility";
                    break;
                case 15:
                    objArr[1] = "setKind";
                    break;
                case 16:
                    objArr[1] = "setCopyOverrides";
                    break;
                case 18:
                    objArr[1] = PublicResolver.FUNC_SETNAME;
                    break;
                case 20:
                    objArr[1] = "setValueParameters";
                    break;
                case 22:
                    objArr[1] = "setTypeParameters";
                    break;
                case 24:
                    objArr[1] = "setReturnType";
                    break;
                case 26:
                    objArr[1] = "setContextReceiverParameters";
                    break;
                case 27:
                    objArr[1] = "setExtensionReceiverParameter";
                    break;
                case 28:
                    objArr[1] = "setDispatchReceiverParameter";
                    break;
                case 29:
                    objArr[1] = "setOriginal";
                    break;
                case 30:
                    objArr[1] = "setSignatureChange";
                    break;
                case 31:
                    objArr[1] = "setPreserveSourceElement";
                    break;
                case 32:
                    objArr[1] = "setDropOriginalInContainingParts";
                    break;
                case 33:
                    objArr[1] = "setHiddenToOvercomeSignatureClash";
                    break;
                case 34:
                    objArr[1] = "setHiddenForResolutionEverywhereBesideSupercalls";
                    break;
                case 36:
                    objArr[1] = "setAdditionalAnnotations";
                    break;
                case 38:
                    objArr[1] = "setSubstitution";
                    break;
                case 40:
                    objArr[1] = "putUserData";
                    break;
                case 41:
                    objArr[1] = "getSubstitution";
                    break;
                case 42:
                    objArr[1] = "setJustForTypeSubstitution";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                    break;
            }
            switch (i) {
                case 8:
                    objArr[2] = ENS.FUNC_SETOWNER;
                    break;
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    break;
                case 10:
                    objArr[2] = "setModality";
                    break;
                case 12:
                    objArr[2] = "setVisibility";
                    break;
                case 14:
                    objArr[2] = "setKind";
                    break;
                case 17:
                    objArr[2] = PublicResolver.FUNC_SETNAME;
                    break;
                case 19:
                    objArr[2] = "setValueParameters";
                    break;
                case 21:
                    objArr[2] = "setTypeParameters";
                    break;
                case 23:
                    objArr[2] = "setReturnType";
                    break;
                case 25:
                    objArr[2] = "setContextReceiverParameters";
                    break;
                case 35:
                    objArr[2] = "setAdditionalAnnotations";
                    break;
                case 37:
                    objArr[2] = "setSubstitution";
                    break;
                case 39:
                    objArr[2] = "putUserData";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String format = String.format(str, objArr);
            switch (i) {
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    th = new IllegalStateException(format);
                    break;
                default:
                    th = new IllegalArgumentException(format);
                    break;
            }
            throw th;
        }

        /* renamed from: B */
        public C7436c mo50969p(C6983dm dmVar) {
            if (dmVar == null) {
                m60535u(35);
            }
            this.f39370s = dmVar;
            return this;
        }

        /* renamed from: C */
        public C7436c mo50967n(boolean z) {
            this.f39364m = z;
            return this;
        }

        /* renamed from: D */
        public C7436c mo50958e(h85 h85) {
            this.f39361j = h85;
            return this;
        }

        /* renamed from: E */
        public C7436c mo50953a() {
            this.f39367p = true;
            return this;
        }

        /* renamed from: F */
        public C7436c mo50956c(h85 h85) {
            this.f39360i = h85;
            return this;
        }

        /* renamed from: G */
        public C7436c mo53347G(boolean z) {
            this.f39373v = Boolean.valueOf(z);
            return this;
        }

        /* renamed from: H */
        public C7436c mo50960g() {
            this.f39371t = true;
            return this;
        }

        /* renamed from: I */
        public C7436c mo50962i() {
            this.f39368q = true;
            return this;
        }

        /* renamed from: J */
        public C7436c mo53350J(boolean z) {
            this.f39374w = z;
            return this;
        }

        /* renamed from: K */
        public C7436c mo50971r(CallableMemberDescriptor.Kind kind) {
            if (kind == null) {
                m60535u(14);
            }
            this.f39357f = kind;
            return this;
        }

        /* renamed from: L */
        public C7436c mo50964k(Modality modality) {
            if (modality == null) {
                m60535u(10);
            }
            this.f39354c = modality;
            return this;
        }

        /* renamed from: M */
        public C7436c mo50972s(r24 r24) {
            if (r24 == null) {
                m60535u(17);
            }
            this.f39363l = r24;
            return this;
        }

        /* renamed from: N */
        public C7436c mo50966m(CallableMemberDescriptor callableMemberDescriptor) {
            this.f39356e = (C7425c) callableMemberDescriptor;
            return this;
        }

        /* renamed from: O */
        public C7436c mo50963j(d31 d31) {
            if (d31 == null) {
                m60535u(8);
            }
            this.f39353b = d31;
            return this;
        }

        /* renamed from: P */
        public C7436c mo50965l() {
            this.f39366o = true;
            return this;
        }

        /* renamed from: Q */
        public C7436c mo50970q(xc3 xc3) {
            if (xc3 == null) {
                m60535u(23);
            }
            this.f39362k = xc3;
            return this;
        }

        /* renamed from: R */
        public C7436c mo50973t() {
            this.f39365n = true;
            return this;
        }

        /* renamed from: S */
        public C7436c mo50959f(p17 p17) {
            if (p17 == null) {
                m60535u(37);
            }
            this.f39352a = p17;
            return this;
        }

        /* renamed from: T */
        public C7436c mo50968o(List<a17> list) {
            if (list == null) {
                m60535u(21);
            }
            this.f39369r = list;
            return this;
        }

        /* renamed from: U */
        public C7436c mo50954b(List<n87> list) {
            if (list == null) {
                m60535u(19);
            }
            this.f39358g = list;
            return this;
        }

        /* renamed from: V */
        public C7436c mo50957d(fd1 fd1) {
            if (fd1 == null) {
                m60535u(12);
            }
            this.f39355d = fd1;
            return this;
        }

        public C7425c build() {
            return this.f39375x.mo50143G0(this);
        }

        /* renamed from: h */
        public <V> C7425c.C7426a<C7425c> mo50961h(C7420a.C7421a<V> aVar, V v) {
            if (aVar == null) {
                m60535u(39);
            }
            this.f39372u.put(aVar, v);
            return this;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7433a(d31 d31, C7425c cVar, C6983dm dmVar, r24 r24, CallableMemberDescriptor.Kind kind, a66 a66) {
        super(d31, dmVar, r24, a66);
        if (d31 == null) {
            m60482Q(0);
        }
        if (dmVar == null) {
            m60482Q(1);
        }
        if (r24 == null) {
            m60482Q(2);
        }
        if (kind == null) {
            m60482Q(3);
        }
        if (a66 == null) {
            m60482Q(4);
        }
        this.f39325C = ed1.f37514i;
        this.f39326H = false;
        this.f39327I = false;
        this.f39328L = false;
        this.f39329M = false;
        this.f39330P = false;
        this.f39331Q = false;
        this.f39332U = false;
        this.f39333X = false;
        this.f39334Y = false;
        this.f39335Z = false;
        this.f39337e0 = true;
        this.f39340k0 = false;
        this.f39346v0 = null;
        this.f39336b1 = null;
        this.f39342p1 = null;
        this.f39343q1 = null;
        this.f39338e1 = cVar == null ? this : cVar;
        this.f39341o1 = kind;
    }

    /* renamed from: I0 */
    public static List<n87> m60480I0(C7425c cVar, List<n87> list, TypeSubstitutor typeSubstitutor) {
        if (list == null) {
            m60482Q(28);
        }
        if (typeSubstitutor == null) {
            m60482Q(29);
        }
        return m60481J0(cVar, list, typeSubstitutor, false, false, (boolean[]) null);
    }

    /* renamed from: J0 */
    public static List<n87> m60481J0(C7425c cVar, List<n87> list, TypeSubstitutor typeSubstitutor, boolean z, boolean z2, boolean[] zArr) {
        xc3 xc3;
        C7435b bVar;
        n87 n87;
        a66 a66;
        TypeSubstitutor typeSubstitutor2 = typeSubstitutor;
        if (list == null) {
            m60482Q(30);
        }
        if (typeSubstitutor2 == null) {
            m60482Q(31);
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (n87 next : list) {
            xc3 type = next.getType();
            Variance variance = Variance.IN_VARIANCE;
            xc3 p = typeSubstitutor2.mo55339p(type, variance);
            xc3 q0 = next.mo53317q0();
            if (q0 == null) {
                xc3 = null;
            } else {
                xc3 = typeSubstitutor2.mo55339p(q0, variance);
            }
            if (p == null) {
                return null;
            }
            if (!((p == next.getType() && q0 == xc3) || zArr == null)) {
                zArr[0] = true;
            }
            if (next instanceof ValueParameterDescriptorImpl.WithDestructuringDeclaration) {
                bVar = new C7435b(((ValueParameterDescriptorImpl.WithDestructuringDeclaration) next).mo53319H0());
            } else {
                bVar = null;
            }
            if (z) {
                n87 = null;
            } else {
                n87 = next;
            }
            int index = next.getIndex();
            C6983dm annotations = next.getAnnotations();
            r24 name = next.getName();
            boolean v0 = next.mo53318v0();
            boolean m0 = next.mo53316m0();
            boolean k0 = next.mo53315k0();
            if (z2) {
                a66 = next.getSource();
            } else {
                a66 = a66.f36360a;
            }
            arrayList.add(ValueParameterDescriptorImpl.m60457E0(cVar, n87, index, annotations, name, p, v0, m0, k0, xc3, a66, bVar));
        }
        return arrayList;
    }

    /* renamed from: Q */
    public static /* synthetic */ void m60482Q(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = PublicResolver.FUNC_NAME;
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "source";
                break;
            case 5:
                objArr[0] = "contextReceiverParameters";
                break;
            case 6:
                objArr[0] = "typeParameters";
                break;
            case 7:
            case 28:
            case 30:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 8:
            case 10:
                objArr[0] = "visibility";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 11:
                objArr[0] = "unsubstitutedReturnType";
                break;
            case 12:
                objArr[0] = "extensionReceiverParameter";
                break;
            case 17:
                objArr[0] = "overriddenDescriptors";
                break;
            case 22:
                objArr[0] = "originalSubstitutor";
                break;
            case 24:
            case 29:
            case 31:
                objArr[0] = "substitutor";
                break;
            case 25:
                objArr[0] = "configuration";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 9:
                objArr[1] = "initialize";
                break;
            case 13:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 14:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 15:
                objArr[1] = "getModality";
                break;
            case 16:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getTypeParameters";
                break;
            case 19:
                objArr[1] = "getValueParameters";
                break;
            case 20:
                objArr[1] = "getOriginal";
                break;
            case 21:
                objArr[1] = "getKind";
                break;
            case 23:
                objArr[1] = "newCopyBuilder";
                break;
            case 26:
                objArr[1] = "copy";
                break;
            case 27:
                objArr[1] = "getSourceToUseForCopy";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                break;
            case 10:
                objArr[2] = "setVisibility";
                break;
            case 11:
                objArr[2] = "setReturnType";
                break;
            case 12:
                objArr[2] = "setExtensionReceiverParameter";
                break;
            case 17:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 22:
                objArr[2] = "substitute";
                break;
            case 24:
                objArr[2] = "newCopyBuilder";
                break;
            case 25:
                objArr[2] = "doSubstitute";
                break;
            case 28:
            case 29:
            case 30:
            case 31:
                objArr[2] = "getSubstitutedValueParameters";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    /* renamed from: X0 */
    private void m60483X0(C7425c cVar) {
        this.f39342p1 = cVar;
    }

    /* renamed from: E0 */
    public C7425c mo50948f0(d31 d31, Modality modality, fd1 fd1, CallableMemberDescriptor.Kind kind, boolean z) {
        C7425c build = mo50951s().mo50963j(d31).mo50964k(modality).mo50957d(fd1).mo50971r(kind).mo50967n(z).build();
        if (build == null) {
            m60482Q(26);
        }
        return build;
    }

    /* renamed from: F0 */
    public abstract C7433a mo50142F0(d31 d31, C7425c cVar, CallableMemberDescriptor.Kind kind, r24 r24, C6983dm dmVar, a66 a66);

    /* renamed from: G */
    public h85 mo51311G() {
        return this.f39323A;
    }

    /* renamed from: G0 */
    public C7425c mo50143G0(C7436c cVar) {
        C6983dm dmVar;
        List<a17> list;
        i85 i85;
        h85 h85;
        xc3 p;
        boolean z;
        boolean z2;
        C7425c cVar2;
        boolean z3;
        boolean z4;
        boolean z5;
        C7436c cVar3 = cVar;
        if (cVar3 == null) {
            m60482Q(25);
        }
        boolean[] zArr = new boolean[1];
        if (cVar.f39370s != null) {
            dmVar = C7133gm.m58141a(getAnnotations(), cVar.f39370s);
        } else {
            dmVar = getAnnotations();
        }
        d31 d31 = cVar3.f39353b;
        C7425c cVar4 = cVar3.f39356e;
        C7433a F0 = mo50142F0(d31, cVar4, cVar3.f39357f, cVar3.f39363l, dmVar, mo53321H0(cVar3.f39366o, cVar4));
        if (cVar.f39369r == null) {
            list = getTypeParameters();
        } else {
            list = cVar.f39369r;
        }
        zArr[0] = zArr[0] | (!list.isEmpty());
        ArrayList arrayList = new ArrayList(list.size());
        TypeSubstitutor c = bd1.m55846c(list, cVar3.f39352a, F0, arrayList, zArr);
        if (c == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        if (!cVar3.f39359h.isEmpty()) {
            for (h85 next : cVar3.f39359h) {
                xc3 p2 = c.mo55339p(next.getType(), Variance.IN_VARIANCE);
                if (p2 == null) {
                    return null;
                }
                arrayList2.add(wc1.m73542b(F0, p2, next.getAnnotations()));
                boolean z6 = zArr[0];
                if (p2 != next.getType()) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                zArr[0] = z5 | z6;
            }
        }
        h85 h852 = cVar3.f39360i;
        if (h852 != null) {
            xc3 p3 = c.mo55339p(h852.getType(), Variance.IN_VARIANCE);
            if (p3 == null) {
                return null;
            }
            i85 i852 = new i85(F0, new vx1(F0, p3, cVar3.f39360i.getValue()), cVar3.f39360i.getAnnotations());
            boolean z7 = zArr[0];
            if (p3 != cVar3.f39360i.getType()) {
                z4 = true;
            } else {
                z4 = false;
            }
            zArr[0] = z4 | z7;
            i85 = i852;
        } else {
            i85 = null;
        }
        h85 h853 = cVar3.f39361j;
        if (h853 != null) {
            h85 c2 = h853.mo50708c(c);
            if (c2 == null) {
                return null;
            }
            boolean z8 = zArr[0];
            if (c2 != cVar3.f39361j) {
                z3 = true;
            } else {
                z3 = false;
            }
            zArr[0] = z8 | z3;
            h85 = c2;
        } else {
            h85 = null;
        }
        List<n87> J0 = m60481J0(F0, cVar3.f39358g, c, cVar3.f39367p, cVar3.f39366o, zArr);
        if (J0 == null || (p = c.mo55339p(cVar3.f39362k, Variance.OUT_VARIANCE)) == null) {
            return null;
        }
        boolean z9 = zArr[0];
        if (p != cVar3.f39362k) {
            z = true;
        } else {
            z = false;
        }
        boolean z10 = z9 | z;
        zArr[0] = z10;
        if (!z10 && cVar3.f39374w) {
            return this;
        }
        TypeSubstitutor typeSubstitutor = c;
        F0.mo52098L0(i85, h85, arrayList2, arrayList, J0, p, cVar3.f39354c, cVar3.f39355d);
        F0.mo53335Z0(this.f39326H);
        F0.mo53333W0(this.f39327I);
        F0.mo53328R0(this.f39328L);
        F0.mo53334Y0(this.f39329M);
        F0.mo53338c1(this.f39330P);
        F0.mo53337b1(this.f39335Z);
        F0.mo53327Q0(this.f39331Q);
        F0.mo53326P0(this.f39332U);
        F0.mo53329S0(this.f39337e0);
        F0.mo53332V0(cVar.f39368q);
        F0.mo53331U0(cVar.f39371t);
        if (cVar.f39373v != null) {
            z2 = cVar.f39373v.booleanValue();
        } else {
            z2 = this.f39340k0;
        }
        F0.mo53330T0(z2);
        if (!cVar.f39372u.isEmpty() || this.f39343q1 != null) {
            Map<C7420a.C7421a<?>, Object> A = cVar.f39372u;
            Map<C7420a.C7421a<?>, Object> map = this.f39343q1;
            if (map != null) {
                for (Map.Entry next2 : map.entrySet()) {
                    if (!A.containsKey(next2.getKey())) {
                        A.put(next2.getKey(), next2.getValue());
                    }
                }
            }
            if (A.size() == 1) {
                F0.f39343q1 = Collections.singletonMap(A.keySet().iterator().next(), A.values().iterator().next());
            } else {
                F0.f39343q1 = A;
            }
        }
        if (cVar3.f39365n || mo51325n0() != null) {
            if (mo51325n0() != null) {
                cVar2 = mo51325n0();
            } else {
                cVar2 = this;
            }
            F0.m60483X0(cVar2.mo50708c(typeSubstitutor));
        }
        if (cVar3.f39364m && !mo51329y0().mo51659d().isEmpty()) {
            if (cVar3.f39352a.mo50031f()) {
                pc2<Collection<C7425c>> pc2 = this.f39336b1;
                if (pc2 != null) {
                    F0.f39336b1 = pc2;
                } else {
                    F0.mo50952x0(mo51659d());
                }
            } else {
                F0.f39336b1 = new C7434a(typeSubstitutor);
            }
        }
        return F0;
    }

    /* renamed from: H0 */
    public final a66 mo53321H0(boolean z, C7425c cVar) {
        a66 a66;
        if (z) {
            if (cVar == null) {
                cVar = mo51329y0();
            }
            a66 = cVar.getSource();
        } else {
            a66 = a66.f36360a;
        }
        if (a66 == null) {
            m60482Q(27);
        }
        return a66;
    }

    /* renamed from: J */
    public h85 mo51315J() {
        return this.f39348y;
    }

    /* renamed from: K0 */
    public boolean mo53322K0() {
        return this.f39337e0;
    }

    /* renamed from: L0 */
    public C7433a mo52098L0(h85 h85, h85 h852, List<h85> list, List<? extends a17> list2, List<n87> list3, xc3 xc3, Modality modality, fd1 fd1) {
        if (list == null) {
            m60482Q(5);
        }
        if (list2 == null) {
            m60482Q(6);
        }
        if (list3 == null) {
            m60482Q(7);
        }
        if (fd1 == null) {
            m60482Q(8);
        }
        this.f39339k = CollectionsKt___CollectionsKt.m47311K0(list2);
        this.f39344r = CollectionsKt___CollectionsKt.m47311K0(list3);
        this.f39345s = xc3;
        this.f39324B = modality;
        this.f39325C = fd1;
        this.f39348y = h85;
        this.f39323A = h852;
        this.f39347x = list;
        int i = 0;
        int i2 = 0;
        while (i2 < list2.size()) {
            a17 a17 = (a17) list2.get(i2);
            if (a17.getIndex() == i2) {
                i2++;
            } else {
                throw new IllegalStateException(a17 + " index is " + a17.getIndex() + " but position is " + i2);
            }
        }
        while (i < list3.size()) {
            n87 n87 = list3.get(i);
            if (n87.getIndex() == i + 0) {
                i++;
            } else {
                throw new IllegalStateException(n87 + "index is " + n87.getIndex() + " but position is " + i);
            }
        }
        return this;
    }

    /* renamed from: M0 */
    public C7436c mo53323M0(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            m60482Q(24);
        }
        return new C7436c(this, typeSubstitutor.mo55335j(), mo51119b(), mo51326p(), getVisibility(), getKind(), mo51763f(), mo51327s0(), mo51315J(), getReturnType(), (r24) null);
    }

    /* renamed from: N0 */
    public final void mo53324N0() {
        pc2<Collection<C7425c>> pc2 = this.f39336b1;
        if (pc2 != null) {
            this.f39346v0 = pc2.invoke();
            this.f39336b1 = null;
        }
    }

    /* renamed from: O0 */
    public <V> void mo53325O0(C7420a.C7421a<V> aVar, Object obj) {
        if (this.f39343q1 == null) {
            this.f39343q1 = new LinkedHashMap();
        }
        this.f39343q1.put(aVar, obj);
    }

    /* renamed from: P0 */
    public void mo53326P0(boolean z) {
        this.f39332U = z;
    }

    /* renamed from: Q0 */
    public void mo53327Q0(boolean z) {
        this.f39331Q = z;
    }

    /* renamed from: R0 */
    public void mo53328R0(boolean z) {
        this.f39328L = z;
    }

    /* renamed from: S0 */
    public void mo53329S0(boolean z) {
        this.f39337e0 = z;
    }

    /* renamed from: T */
    public boolean mo51317T() {
        return this.f39332U;
    }

    /* renamed from: T0 */
    public void mo53330T0(boolean z) {
        this.f39340k0 = z;
    }

    /* renamed from: U0 */
    public final void mo53331U0(boolean z) {
        this.f39334Y = z;
    }

    /* renamed from: V0 */
    public final void mo53332V0(boolean z) {
        this.f39333X = z;
    }

    /* renamed from: W0 */
    public void mo53333W0(boolean z) {
        this.f39327I = z;
    }

    /* renamed from: Y0 */
    public void mo53334Y0(boolean z) {
        this.f39329M = z;
    }

    /* renamed from: Z0 */
    public void mo53335Z0(boolean z) {
        this.f39326H = z;
    }

    /* renamed from: a0 */
    public boolean mo51318a0() {
        return this.f39340k0;
    }

    /* renamed from: a1 */
    public void mo53336a1(xc3 xc3) {
        if (xc3 == null) {
            m60482Q(11);
        }
        this.f39345s = xc3;
    }

    /* renamed from: b1 */
    public void mo53337b1(boolean z) {
        this.f39335Z = z;
    }

    /* renamed from: c1 */
    public void mo53338c1(boolean z) {
        this.f39330P = z;
    }

    /* renamed from: d */
    public Collection<? extends C7425c> mo51659d() {
        mo53324N0();
        Collection<? extends C7425c> collection = this.f39346v0;
        if (collection == null) {
            collection = Collections.emptyList();
        }
        if (collection == null) {
            m60482Q(14);
        }
        return collection;
    }

    /* renamed from: d0 */
    public boolean mo51319d0() {
        return this.f39331Q;
    }

    /* renamed from: d1 */
    public void mo53339d1(fd1 fd1) {
        if (fd1 == null) {
            m60482Q(10);
        }
        this.f39325C = fd1;
    }

    /* renamed from: f */
    public List<n87> mo51763f() {
        List<n87> list = this.f39344r;
        if (list == null) {
            m60482Q(19);
        }
        return list;
    }

    public CallableMemberDescriptor.Kind getKind() {
        CallableMemberDescriptor.Kind kind = this.f39341o1;
        if (kind == null) {
            m60482Q(21);
        }
        return kind;
    }

    public xc3 getReturnType() {
        return this.f39345s;
    }

    public List<a17> getTypeParameters() {
        List<a17> list = this.f39339k;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("typeParameters == null for " + this);
    }

    public fd1 getVisibility() {
        fd1 fd1 = this.f39325C;
        if (fd1 == null) {
            m60482Q(16);
        }
        return fd1;
    }

    public boolean isExternal() {
        return this.f39328L;
    }

    public boolean isInfix() {
        if (this.f39327I) {
            return true;
        }
        for (C7425c isInfix : mo51329y0().mo51659d()) {
            if (isInfix.isInfix()) {
                return true;
            }
        }
        return false;
    }

    public boolean isInline() {
        return this.f39329M;
    }

    public boolean isOperator() {
        if (this.f39326H) {
            return true;
        }
        for (C7425c isOperator : mo51329y0().mo51659d()) {
            if (isOperator.isOperator()) {
                return true;
            }
        }
        return false;
    }

    public boolean isSuspend() {
        return this.f39335Z;
    }

    /* renamed from: j0 */
    public <R, D> R mo51120j0(h31<R, D> h31, D d) {
        return h31.mo52111i(this, d);
    }

    /* renamed from: n0 */
    public C7425c mo51325n0() {
        return this.f39342p1;
    }

    /* renamed from: p */
    public Modality mo51326p() {
        Modality modality = this.f39324B;
        if (modality == null) {
            m60482Q(15);
        }
        return modality;
    }

    /* renamed from: p0 */
    public <V> V mo50950p0(C7420a.C7421a<V> aVar) {
        Map map = this.f39343q1;
        if (map == null) {
            return null;
        }
        return map.get(aVar);
    }

    /* renamed from: s */
    public C7425c.C7426a<? extends C7425c> mo50951s() {
        C7436c M0 = mo53323M0(TypeSubstitutor.f40287b);
        if (M0 == null) {
            m60482Q(23);
        }
        return M0;
    }

    /* renamed from: s0 */
    public List<h85> mo51327s0() {
        List<h85> list = this.f39347x;
        if (list == null) {
            m60482Q(13);
        }
        return list;
    }

    /* renamed from: w0 */
    public boolean mo51328w0() {
        return this.f39333X;
    }

    /* renamed from: x0 */
    public void mo50952x0(Collection<? extends CallableMemberDescriptor> collection) {
        if (collection == null) {
            m60482Q(17);
        }
        this.f39346v0 = collection;
        Iterator<? extends CallableMemberDescriptor> it = collection.iterator();
        while (it.hasNext()) {
            if (((C7425c) it.next()).mo51330z0()) {
                this.f39334Y = true;
                return;
            }
        }
    }

    /* renamed from: y */
    public boolean mo50147y() {
        return this.f39330P;
    }

    /* renamed from: z0 */
    public boolean mo51330z0() {
        return this.f39334Y;
    }

    /* renamed from: c */
    public C7425c m60514c(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            m60482Q(22);
        }
        if (typeSubstitutor.mo55336k()) {
            return this;
        }
        return mo53323M0(typeSubstitutor).mo50966m(mo51329y0()).mo50965l().mo53350J(true).build();
    }

    /* renamed from: a */
    public C7425c m60509a() {
        C7425c cVar = this.f39338e1;
        C7425c a = cVar == this ? this : cVar.mo50045a();
        if (a == null) {
            m60482Q(20);
        }
        return a;
    }
}
