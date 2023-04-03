package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.C7420a;
import kotlin.reflect.jvm.internal.impl.descriptors.C7425c;
import kotlin.reflect.jvm.internal.impl.descriptors.C7427d;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C7433a;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C7438c;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.web3j.ens.contracts.generated.ENS;
import org.web3j.ens.contracts.generated.PublicResolver;

/* renamed from: gx4 */
/* compiled from: PropertyDescriptorImpl */
public class gx4 extends C7438c implements fx4 {

    /* renamed from: A */
    public fd1 f38087A;

    /* renamed from: B */
    public Collection<? extends fx4> f38088B;

    /* renamed from: C */
    public final fx4 f38089C;

    /* renamed from: H */
    public final CallableMemberDescriptor.Kind f38090H;

    /* renamed from: I */
    public final boolean f38091I;

    /* renamed from: L */
    public final boolean f38092L;

    /* renamed from: M */
    public final boolean f38093M;

    /* renamed from: P */
    public final boolean f38094P;

    /* renamed from: Q */
    public final boolean f38095Q;

    /* renamed from: U */
    public final boolean f38096U;

    /* renamed from: X */
    public List<h85> f38097X;

    /* renamed from: Y */
    public h85 f38098Y;

    /* renamed from: Z */
    public h85 f38099Z;

    /* renamed from: b1 */
    public boolean f38100b1;

    /* renamed from: e0 */
    public List<a17> f38101e0;

    /* renamed from: e1 */
    public g02 f38102e1;

    /* renamed from: k0 */
    public jx4 f38103k0;

    /* renamed from: o1 */
    public g02 f38104o1;

    /* renamed from: v0 */
    public lx4 f38105v0;

    /* renamed from: y */
    public final Modality f38106y;

    /* renamed from: gx4$a */
    /* compiled from: PropertyDescriptorImpl */
    public class C7148a {

        /* renamed from: a */
        public d31 f38107a;

        /* renamed from: b */
        public Modality f38108b;

        /* renamed from: c */
        public fd1 f38109c;

        /* renamed from: d */
        public fx4 f38110d = null;

        /* renamed from: e */
        public boolean f38111e = false;

        /* renamed from: f */
        public CallableMemberDescriptor.Kind f38112f;

        /* renamed from: g */
        public p17 f38113g;

        /* renamed from: h */
        public boolean f38114h;

        /* renamed from: i */
        public h85 f38115i;

        /* renamed from: j */
        public List<a17> f38116j;

        /* renamed from: k */
        public r24 f38117k;

        /* renamed from: l */
        public xc3 f38118l;

        public C7148a() {
            this.f38107a = gx4.this.mo51119b();
            this.f38108b = gx4.this.mo51326p();
            this.f38109c = gx4.this.getVisibility();
            this.f38112f = gx4.this.getKind();
            this.f38113g = p17.f43974b;
            this.f38114h = true;
            this.f38115i = gx4.this.f38098Y;
            this.f38116j = null;
            this.f38117k = gx4.this.getName();
            this.f38118l = gx4.this.getType();
        }

        /* renamed from: a */
        public static /* synthetic */ void m58329a(int i) {
            int i2 = i;
            String str = (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 5 || i2 == 7 || i2 == 9 || i2 == 11 || i2 == 19 || i2 == 13 || i2 == 14 || i2 == 16 || i2 == 17) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[((i2 == 1 || i2 == 2 || i2 == 3 || i2 == 5 || i2 == 7 || i2 == 9 || i2 == 11 || i2 == 19 || i2 == 13 || i2 == 14 || i2 == 16 || i2 == 17) ? 2 : 3)];
            switch (i2) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                    break;
                case 4:
                    objArr[0] = "type";
                    break;
                case 6:
                    objArr[0] = "modality";
                    break;
                case 8:
                    objArr[0] = "visibility";
                    break;
                case 10:
                    objArr[0] = "kind";
                    break;
                case 12:
                    objArr[0] = "typeParameters";
                    break;
                case 15:
                    objArr[0] = "substitution";
                    break;
                case 18:
                    objArr[0] = PublicResolver.FUNC_NAME;
                    break;
                default:
                    objArr[0] = ENS.FUNC_OWNER;
                    break;
            }
            if (i2 == 1) {
                objArr[1] = ENS.FUNC_SETOWNER;
            } else if (i2 == 2) {
                objArr[1] = "setOriginal";
            } else if (i2 == 3) {
                objArr[1] = "setPreserveSourceElement";
            } else if (i2 == 5) {
                objArr[1] = "setReturnType";
            } else if (i2 == 7) {
                objArr[1] = "setModality";
            } else if (i2 == 9) {
                objArr[1] = "setVisibility";
            } else if (i2 == 11) {
                objArr[1] = "setKind";
            } else if (i2 == 19) {
                objArr[1] = PublicResolver.FUNC_SETNAME;
            } else if (i2 == 13) {
                objArr[1] = "setTypeParameters";
            } else if (i2 == 14) {
                objArr[1] = "setDispatchReceiverParameter";
            } else if (i2 == 16) {
                objArr[1] = "setSubstitution";
            } else if (i2 != 17) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
            } else {
                objArr[1] = "setCopyOverrides";
            }
            switch (i2) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19:
                    break;
                case 4:
                    objArr[2] = "setReturnType";
                    break;
                case 6:
                    objArr[2] = "setModality";
                    break;
                case 8:
                    objArr[2] = "setVisibility";
                    break;
                case 10:
                    objArr[2] = "setKind";
                    break;
                case 12:
                    objArr[2] = "setTypeParameters";
                    break;
                case 15:
                    objArr[2] = "setSubstitution";
                    break;
                case 18:
                    objArr[2] = PublicResolver.FUNC_SETNAME;
                    break;
                default:
                    objArr[2] = ENS.FUNC_SETOWNER;
                    break;
            }
            String format = String.format(str, objArr);
            throw ((i2 == 1 || i2 == 2 || i2 == 3 || i2 == 5 || i2 == 7 || i2 == 9 || i2 == 11 || i2 == 19 || i2 == 13 || i2 == 14 || i2 == 16 || i2 == 17) ? new IllegalStateException(format) : new IllegalArgumentException(format));
        }

        /* renamed from: n */
        public fx4 mo52052n() {
            return gx4.this.mo52041K0(this);
        }

        /* renamed from: o */
        public ix4 mo52053o() {
            fx4 fx4 = this.f38110d;
            if (fx4 == null) {
                return null;
            }
            return fx4.getGetter();
        }

        /* renamed from: p */
        public lx4 mo52054p() {
            fx4 fx4 = this.f38110d;
            if (fx4 == null) {
                return null;
            }
            return fx4.getSetter();
        }

        /* renamed from: q */
        public C7148a mo52055q(boolean z) {
            this.f38114h = z;
            return this;
        }

        /* renamed from: r */
        public C7148a mo52056r(CallableMemberDescriptor.Kind kind) {
            if (kind == null) {
                m58329a(10);
            }
            this.f38112f = kind;
            return this;
        }

        /* renamed from: s */
        public C7148a mo52057s(Modality modality) {
            if (modality == null) {
                m58329a(6);
            }
            this.f38108b = modality;
            return this;
        }

        /* renamed from: t */
        public C7148a mo52058t(CallableMemberDescriptor callableMemberDescriptor) {
            this.f38110d = (fx4) callableMemberDescriptor;
            return this;
        }

        /* renamed from: u */
        public C7148a mo52059u(d31 d31) {
            if (d31 == null) {
                m58329a(0);
            }
            this.f38107a = d31;
            return this;
        }

        /* renamed from: v */
        public C7148a mo52060v(p17 p17) {
            if (p17 == null) {
                m58329a(15);
            }
            this.f38113g = p17;
            return this;
        }

        /* renamed from: w */
        public C7148a mo52061w(fd1 fd1) {
            if (fd1 == null) {
                m58329a(8);
            }
            this.f38109c = fd1;
            return this;
        }
    }

    /* JADX WARNING: type inference failed for: r13v0, types: [fx4] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public gx4(p000.d31 r12, p000.fx4 r13, p000.C6983dm r14, kotlin.reflect.jvm.internal.impl.descriptors.Modality r15, p000.fd1 r16, boolean r17, p000.r24 r18, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind r19, p000.a66 r20, boolean r21, boolean r22, boolean r23, boolean r24, boolean r25, boolean r26) {
        /*
            r11 = this;
            r7 = r11
            r8 = r15
            r9 = r16
            r10 = r19
            if (r12 != 0) goto L_0x000c
            r0 = 0
            m58289Q(r0)
        L_0x000c:
            if (r14 != 0) goto L_0x0012
            r0 = 1
            m58289Q(r0)
        L_0x0012:
            if (r8 != 0) goto L_0x0018
            r0 = 2
            m58289Q(r0)
        L_0x0018:
            if (r9 != 0) goto L_0x001e
            r0 = 3
            m58289Q(r0)
        L_0x001e:
            if (r18 != 0) goto L_0x0024
            r0 = 4
            m58289Q(r0)
        L_0x0024:
            if (r10 != 0) goto L_0x002a
            r0 = 5
            m58289Q(r0)
        L_0x002a:
            if (r20 != 0) goto L_0x0030
            r0 = 6
            m58289Q(r0)
        L_0x0030:
            r4 = 0
            r0 = r11
            r1 = r12
            r2 = r14
            r3 = r18
            r5 = r17
            r6 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0 = 0
            r7.f38088B = r0
            java.util.List r0 = java.util.Collections.emptyList()
            r7.f38097X = r0
            r7.f38106y = r8
            r7.f38087A = r9
            if (r13 != 0) goto L_0x004e
            r0 = r7
            goto L_0x004f
        L_0x004e:
            r0 = r13
        L_0x004f:
            r7.f38089C = r0
            r7.f38090H = r10
            r0 = r21
            r7.f38091I = r0
            r0 = r22
            r7.f38092L = r0
            r0 = r23
            r7.f38093M = r0
            r0 = r24
            r7.f38094P = r0
            r0 = r25
            r7.f38095Q = r0
            r0 = r26
            r7.f38096U = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.gx4.<init>(d31, fx4, dm, kotlin.reflect.jvm.internal.impl.descriptors.Modality, fd1, boolean, r24, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind, a66, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }

    /* renamed from: I0 */
    public static gx4 m58287I0(d31 d31, C6983dm dmVar, Modality modality, fd1 fd1, boolean z, r24 r24, CallableMemberDescriptor.Kind kind, a66 a66, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        if (d31 == null) {
            m58289Q(7);
        }
        if (dmVar == null) {
            m58289Q(8);
        }
        if (modality == null) {
            m58289Q(9);
        }
        if (fd1 == null) {
            m58289Q(10);
        }
        if (r24 == null) {
            m58289Q(11);
        }
        if (kind == null) {
            m58289Q(12);
        }
        if (a66 == null) {
            m58289Q(13);
        }
        return new gx4(d31, (fx4) null, dmVar, modality, fd1, z, r24, kind, a66, z2, z3, z4, z5, z6, z7);
    }

    /* renamed from: N0 */
    public static C7425c m58288N0(TypeSubstitutor typeSubstitutor, C7427d dVar) {
        if (typeSubstitutor == null) {
            m58289Q(30);
        }
        if (dVar == null) {
            m58289Q(31);
        }
        if (dVar.mo51325n0() != null) {
            return dVar.mo51325n0().mo50708c(typeSubstitutor);
        }
        return null;
    }

    /* renamed from: Q */
    public static /* synthetic */ void m58289Q(int i) {
        String str;
        int i2;
        Throwable th;
        if (!(i == 28 || i == 38 || i == 39 || i == 41 || i == 42)) {
            switch (i) {
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        }
        str = "@NotNull method %s.%s must not return null";
        if (!(i == 28 || i == 38 || i == 39 || i == 41 || i == 42)) {
            switch (i) {
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    break;
                default:
                    i2 = 3;
                    break;
            }
        }
        i2 = 2;
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
            case 20:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = PublicResolver.FUNC_NAME;
                break;
            case 5:
            case 12:
            case 35:
                objArr[0] = "kind";
                break;
            case 6:
            case 13:
            case 37:
                objArr[0] = "source";
                break;
            case 14:
                objArr[0] = "inType";
                break;
            case 15:
            case 17:
                objArr[0] = "outType";
                break;
            case 16:
            case 18:
                objArr[0] = "typeParameters";
                break;
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 28:
            case 38:
            case 39:
            case 41:
            case 42:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                break;
            case 27:
                objArr[0] = "originalSubstitutor";
                break;
            case 29:
                objArr[0] = "copyConfiguration";
                break;
            case 30:
                objArr[0] = "substitutor";
                break;
            case 31:
                objArr[0] = "accessorDescriptor";
                break;
            case 32:
                objArr[0] = "newOwner";
                break;
            case 33:
                objArr[0] = "newModality";
                break;
            case 34:
                objArr[0] = "newVisibility";
                break;
            case 36:
                objArr[0] = "newName";
                break;
            case 40:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 28) {
            objArr[1] = "getSourceToUseForCopy";
        } else if (i == 38) {
            objArr[1] = "getOriginal";
        } else if (i == 39) {
            objArr[1] = "getKind";
        } else if (i == 41) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i != 42) {
            switch (i) {
                case 21:
                    objArr[1] = "getTypeParameters";
                    break;
                case 22:
                    objArr[1] = "getContextReceiverParameters";
                    break;
                case 23:
                    objArr[1] = "getReturnType";
                    break;
                case 24:
                    objArr[1] = "getModality";
                    break;
                case 25:
                    objArr[1] = "getVisibility";
                    break;
                case 26:
                    objArr[1] = "getAccessors";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                    break;
            }
        } else {
            objArr[1] = "copy";
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[2] = "create";
                break;
            case 14:
                objArr[2] = "setInType";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "setType";
                break;
            case 20:
                objArr[2] = "setVisibility";
                break;
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 28:
            case 38:
            case 39:
            case 41:
            case 42:
                break;
            case 27:
                objArr[2] = "substitute";
                break;
            case 29:
                objArr[2] = "doSubstitute";
                break;
            case 30:
            case 31:
                objArr[2] = "getSubstitutedInitialSignatureDescriptor";
                break;
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 40:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (!(i == 28 || i == 38 || i == 39 || i == 41 || i == 42)) {
            switch (i) {
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    break;
                default:
                    th = new IllegalArgumentException(format);
                    break;
            }
        }
        th = new IllegalStateException(format);
        throw th;
    }

    /* renamed from: S0 */
    public static fd1 m58290S0(fd1 fd1, CallableMemberDescriptor.Kind kind) {
        if (kind != CallableMemberDescriptor.Kind.FAKE_OVERRIDE || !ed1.m57282g(fd1.mo51644f())) {
            return fd1;
        }
        return ed1.f37513h;
    }

    /* renamed from: X0 */
    public static h85 m58291X0(TypeSubstitutor typeSubstitutor, fx4 fx4, h85 h85) {
        xc3 p = typeSubstitutor.mo55339p(h85.getType(), Variance.IN_VARIANCE);
        if (p == null) {
            return null;
        }
        return new i85(fx4, new fs0(fx4, p, h85.getValue()), h85.getAnnotations());
    }

    /* renamed from: Y0 */
    public static h85 m58292Y0(TypeSubstitutor typeSubstitutor, fx4 fx4, h85 h85) {
        xc3 p = typeSubstitutor.mo55339p(h85.getType(), Variance.IN_VARIANCE);
        if (p == null) {
            return null;
        }
        return new i85(fx4, new vx1(fx4, p, h85.getValue()), h85.getAnnotations());
    }

    /* renamed from: G */
    public h85 mo51311G() {
        return this.f38098Y;
    }

    /* renamed from: H0 */
    public fx4 mo50948f0(d31 d31, Modality modality, fd1 fd1, CallableMemberDescriptor.Kind kind, boolean z) {
        fx4 n = mo52047R0().mo52059u(d31).mo52058t((CallableMemberDescriptor) null).mo52057s(modality).mo52061w(fd1).mo52056r(kind).mo52055q(z).mo52052n();
        if (n == null) {
            m58289Q(42);
        }
        return n;
    }

    /* renamed from: J */
    public h85 mo51315J() {
        return this.f38099Z;
    }

    /* renamed from: J0 */
    public gx4 mo52040J0(d31 d31, Modality modality, fd1 fd1, fx4 fx4, CallableMemberDescriptor.Kind kind, r24 r24, a66 a66) {
        if (d31 == null) {
            m58289Q(32);
        }
        if (modality == null) {
            m58289Q(33);
        }
        if (fd1 == null) {
            m58289Q(34);
        }
        if (kind == null) {
            m58289Q(35);
        }
        if (r24 == null) {
            m58289Q(36);
        }
        if (a66 == null) {
            m58289Q(37);
        }
        return new gx4(d31, fx4, getAnnotations(), modality, fd1, mo51761I(), r24, kind, a66, mo51772t0(), isConst(), mo51319d0(), mo51317T(), isExternal(), mo51773x());
    }

    /* renamed from: K */
    public g02 mo51762K() {
        return this.f38104o1;
    }

    /* renamed from: K0 */
    public fx4 mo52041K0(C7148a aVar) {
        List<a17> list;
        h85 h85;
        h85 h852;
        jx4 jx4;
        mx4 mx4;
        h02 h02;
        pc2<gc4<fq0<?>>> pc2;
        xc3 xc3;
        if (aVar == null) {
            m58289Q(29);
        }
        gx4 J0 = mo52040J0(aVar.f38107a, aVar.f38108b, aVar.f38109c, aVar.f38110d, aVar.f38112f, aVar.f38117k, mo52043M0(aVar.f38111e, aVar.f38110d));
        if (aVar.f38116j == null) {
            list = getTypeParameters();
        } else {
            list = aVar.f38116j;
        }
        ArrayList arrayList = new ArrayList(list.size());
        TypeSubstitutor b = bd1.m55845b(list, aVar.f38113g, J0, arrayList);
        xc3 c = aVar.f38118l;
        xc3 p = b.mo55339p(c, Variance.OUT_VARIANCE);
        h02 h022 = null;
        if (p == null) {
            return null;
        }
        xc3 p2 = b.mo55339p(c, Variance.IN_VARIANCE);
        if (p2 != null) {
            J0.mo52048T0(p2);
        }
        h85 d = aVar.f38115i;
        if (d != null) {
            h85 c2 = d.mo50708c(b);
            if (c2 == null) {
                return null;
            }
            h85 = c2;
        } else {
            h85 = null;
        }
        h85 h853 = this.f38099Z;
        if (h853 != null) {
            h852 = m58292Y0(b, J0, h853);
        } else {
            h852 = null;
        }
        ArrayList arrayList2 = new ArrayList();
        for (h85 X0 : this.f38097X) {
            h85 X02 = m58291X0(b, J0, X0);
            if (X02 != null) {
                arrayList2.add(X02);
            }
        }
        J0.mo52050V0(p, arrayList, h85, h852, arrayList2);
        if (this.f38103k0 == null) {
            jx4 = null;
        } else {
            jx4 = new jx4(J0, this.f38103k0.getAnnotations(), aVar.f38108b, m58290S0(this.f38103k0.getVisibility(), aVar.f38112f), this.f38103k0.mo51308B(), this.f38103k0.isExternal(), this.f38103k0.isInline(), aVar.f38112f, aVar.mo52053o(), a66.f36360a);
        }
        if (jx4 != null) {
            xc3 returnType = this.f38103k0.getReturnType();
            jx4.mo51313H0(m58288N0(b, this.f38103k0));
            if (returnType != null) {
                xc3 = b.mo55339p(returnType, Variance.OUT_VARIANCE);
            } else {
                xc3 = null;
            }
            jx4.mo52818K0(xc3);
        }
        if (this.f38105v0 == null) {
            mx4 = null;
        } else {
            mx4 = new mx4(J0, this.f38105v0.getAnnotations(), aVar.f38108b, m58290S0(this.f38105v0.getVisibility(), aVar.f38112f), this.f38105v0.mo51308B(), this.f38105v0.isExternal(), this.f38105v0.isInline(), aVar.f38112f, aVar.mo52054p(), a66.f36360a);
        }
        if (mx4 != null) {
            List<n87> J02 = C7433a.m60481J0(mx4, this.f38105v0.mo51763f(), b, false, false, (boolean[]) null);
            if (J02 == null) {
                J0.mo52049U0(true);
                J02 = Collections.singletonList(mx4.m64477J0(mx4, DescriptorUtilsKt.m62445f(aVar.f38107a).mo53150H(), this.f38105v0.mo51763f().get(0).getAnnotations()));
            }
            if (J02.size() == 1) {
                mx4.mo51313H0(m58288N0(b, this.f38105v0));
                mx4.mo56333L0(J02.get(0));
            } else {
                throw new IllegalStateException();
            }
        }
        g02 g02 = this.f38102e1;
        if (g02 == null) {
            h02 = null;
        } else {
            h02 = new h02(g02.getAnnotations(), J0);
        }
        g02 g022 = this.f38104o1;
        if (g022 != null) {
            h022 = new h02(g022.getAnnotations(), J0);
        }
        J0.mo52045P0(jx4, mx4, h02, h022);
        if (aVar.f38114h) {
            w46 e = w46.m73463e();
            for (fx4 c3 : mo51659d()) {
                e.add(c3.mo50708c(b));
            }
            J0.mo50952x0(e);
        }
        if (isConst() && (pc2 = this.f39379x) != null) {
            J0.mo53364E0(this.f39378s, pc2);
        }
        return J0;
    }

    /* renamed from: L0 */
    public jx4 getGetter() {
        return this.f38103k0;
    }

    /* renamed from: M0 */
    public final a66 mo52043M0(boolean z, fx4 fx4) {
        a66 a66;
        if (z) {
            if (fx4 == null) {
                fx4 = mo51329y0();
            }
            a66 = fx4.getSource();
        } else {
            a66 = a66.f36360a;
        }
        if (a66 == null) {
            m58289Q(28);
        }
        return a66;
    }

    /* renamed from: O0 */
    public void mo52044O0(jx4 jx4, lx4 lx4) {
        mo52045P0(jx4, lx4, (g02) null, (g02) null);
    }

    /* renamed from: P0 */
    public void mo52045P0(jx4 jx4, lx4 lx4, g02 g02, g02 g022) {
        this.f38103k0 = jx4;
        this.f38105v0 = lx4;
        this.f38102e1 = g02;
        this.f38104o1 = g022;
    }

    /* renamed from: Q0 */
    public boolean mo52046Q0() {
        return this.f38100b1;
    }

    /* renamed from: R0 */
    public C7148a mo52047R0() {
        return new C7148a();
    }

    /* renamed from: T */
    public boolean mo51317T() {
        return this.f38094P;
    }

    /* renamed from: T0 */
    public void mo52048T0(xc3 xc3) {
        if (xc3 == null) {
            m58289Q(14);
        }
    }

    /* renamed from: U0 */
    public void mo52049U0(boolean z) {
        this.f38100b1 = z;
    }

    /* renamed from: V0 */
    public void mo52050V0(xc3 xc3, List<? extends a17> list, h85 h85, h85 h852, List<h85> list2) {
        if (xc3 == null) {
            m58289Q(17);
        }
        if (list == null) {
            m58289Q(18);
        }
        if (list2 == null) {
            m58289Q(19);
        }
        mo53363A0(xc3);
        this.f38101e0 = new ArrayList(list);
        this.f38099Z = h852;
        this.f38098Y = h85;
        this.f38097X = list2;
    }

    /* renamed from: W0 */
    public void mo52051W0(fd1 fd1) {
        if (fd1 == null) {
            m58289Q(20);
        }
        this.f38087A = fd1;
    }

    /* renamed from: d */
    public Collection<? extends fx4> mo51659d() {
        Collection<? extends fx4> collection = this.f38088B;
        if (collection == null) {
            collection = Collections.emptyList();
        }
        if (collection == null) {
            m58289Q(41);
        }
        return collection;
    }

    /* renamed from: d0 */
    public boolean mo51319d0() {
        return this.f38093M;
    }

    public CallableMemberDescriptor.Kind getKind() {
        CallableMemberDescriptor.Kind kind = this.f38090H;
        if (kind == null) {
            m58289Q(39);
        }
        return kind;
    }

    public xc3 getReturnType() {
        xc3 type = getType();
        if (type == null) {
            m58289Q(23);
        }
        return type;
    }

    public lx4 getSetter() {
        return this.f38105v0;
    }

    public List<a17> getTypeParameters() {
        List<a17> list = this.f38101e0;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("typeParameters == null for " + toString());
    }

    public fd1 getVisibility() {
        fd1 fd1 = this.f38087A;
        if (fd1 == null) {
            m58289Q(25);
        }
        return fd1;
    }

    public boolean isConst() {
        return this.f38092L;
    }

    public boolean isExternal() {
        return this.f38095Q;
    }

    /* renamed from: j0 */
    public <R, D> R mo51120j0(h31<R, D> h31, D d) {
        return h31.mo52107e(this, d);
    }

    /* renamed from: p */
    public Modality mo51326p() {
        Modality modality = this.f38106y;
        if (modality == null) {
            m58289Q(24);
        }
        return modality;
    }

    /* renamed from: p0 */
    public <V> V mo50950p0(C7420a.C7421a<V> aVar) {
        return null;
    }

    /* renamed from: r0 */
    public g02 mo51770r0() {
        return this.f38102e1;
    }

    /* renamed from: s0 */
    public List<h85> mo51327s0() {
        List<h85> list = this.f38097X;
        if (list == null) {
            m58289Q(22);
        }
        return list;
    }

    /* renamed from: t */
    public List<C7427d> mo51771t() {
        ArrayList arrayList = new ArrayList(2);
        jx4 jx4 = this.f38103k0;
        if (jx4 != null) {
            arrayList.add(jx4);
        }
        lx4 lx4 = this.f38105v0;
        if (lx4 != null) {
            arrayList.add(lx4);
        }
        return arrayList;
    }

    /* renamed from: t0 */
    public boolean mo51772t0() {
        return this.f38091I;
    }

    /* renamed from: x */
    public boolean mo51773x() {
        return this.f38096U;
    }

    /* renamed from: x0 */
    public void mo50952x0(Collection<? extends CallableMemberDescriptor> collection) {
        if (collection == null) {
            m58289Q(40);
        }
        this.f38088B = collection;
    }

    /* renamed from: c */
    public fx4 m58315c(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            m58289Q(27);
        }
        if (typeSubstitutor.mo55336k()) {
            return this;
        }
        return mo52047R0().mo52060v(typeSubstitutor.mo55335j()).mo52058t(mo51329y0()).mo52052n();
    }

    /* renamed from: a */
    public fx4 m58311a() {
        fx4 fx4 = this.f38089C;
        fx4 a = fx4 == this ? this : fx4.mo50045a();
        if (a == null) {
            m58289Q(38);
        }
        return a;
    }
}
