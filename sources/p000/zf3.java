package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.SubstitutingScope;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* renamed from: zf3 */
/* compiled from: LazySubstitutingClassDescriptor */
public class zf3 extends ex3 {

    /* renamed from: d */
    public final ex3 f46369d;

    /* renamed from: e */
    public final TypeSubstitutor f46370e;

    /* renamed from: g */
    public TypeSubstitutor f46371g;

    /* renamed from: k */
    public List<a17> f46372k;

    /* renamed from: r */
    public List<a17> f46373r;

    /* renamed from: s */
    public yz6 f46374s;

    /* renamed from: zf3$a */
    /* compiled from: LazySubstitutingClassDescriptor */
    public class C9674a implements rc2<a17, Boolean> {
        public C9674a() {
        }

        /* renamed from: a */
        public Boolean invoke(a17 a17) {
            return Boolean.valueOf(!a17.mo50044L());
        }
    }

    /* renamed from: zf3$b */
    /* compiled from: LazySubstitutingClassDescriptor */
    public class C9675b implements rc2<d36, d36> {
        public C9675b() {
        }

        /* renamed from: a */
        public d36 invoke(d36 d36) {
            return zf3.this.mo67265G0(d36);
        }
    }

    public zf3(ex3 ex3, TypeSubstitutor typeSubstitutor) {
        this.f46369d = ex3;
        this.f46370e = typeSubstitutor;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00c6 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00e3 A[ADDED_TO_REGION] */
    /* renamed from: y0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void m74878y0(int r15) {
        /*
            r0 = 23
            r1 = 13
            r2 = 10
            r3 = 8
            r4 = 6
            r5 = 5
            r6 = 3
            r7 = 2
            if (r15 == r7) goto L_0x001f
            if (r15 == r6) goto L_0x001f
            if (r15 == r5) goto L_0x001f
            if (r15 == r4) goto L_0x001f
            if (r15 == r3) goto L_0x001f
            if (r15 == r2) goto L_0x001f
            if (r15 == r1) goto L_0x001f
            if (r15 == r0) goto L_0x001f
            java.lang.String r8 = "@NotNull method %s.%s must not return null"
            goto L_0x0021
        L_0x001f:
            java.lang.String r8 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
        L_0x0021:
            if (r15 == r7) goto L_0x0033
            if (r15 == r6) goto L_0x0033
            if (r15 == r5) goto L_0x0033
            if (r15 == r4) goto L_0x0033
            if (r15 == r3) goto L_0x0033
            if (r15 == r2) goto L_0x0033
            if (r15 == r1) goto L_0x0033
            if (r15 == r0) goto L_0x0033
            r9 = r7
            goto L_0x0034
        L_0x0033:
            r9 = r6
        L_0x0034:
            java.lang.Object[] r9 = new java.lang.Object[r9]
            java.lang.String r10 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor"
            r11 = 0
            if (r15 == r7) goto L_0x005b
            if (r15 == r6) goto L_0x0056
            if (r15 == r5) goto L_0x0051
            if (r15 == r4) goto L_0x0056
            if (r15 == r3) goto L_0x005b
            if (r15 == r2) goto L_0x0051
            if (r15 == r1) goto L_0x0056
            if (r15 == r0) goto L_0x004c
            r9[r11] = r10
            goto L_0x005f
        L_0x004c:
            java.lang.String r12 = "substitutor"
            r9[r11] = r12
            goto L_0x005f
        L_0x0051:
            java.lang.String r12 = "typeSubstitution"
            r9[r11] = r12
            goto L_0x005f
        L_0x0056:
            java.lang.String r12 = "kotlinTypeRefiner"
            r9[r11] = r12
            goto L_0x005f
        L_0x005b:
            java.lang.String r12 = "typeArguments"
            r9[r11] = r12
        L_0x005f:
            java.lang.String r11 = "substitute"
            java.lang.String r12 = "getUnsubstitutedMemberScope"
            java.lang.String r13 = "getMemberScope"
            r14 = 1
            switch(r15) {
                case 2: goto L_0x00c2;
                case 3: goto L_0x00c2;
                case 4: goto L_0x00bf;
                case 5: goto L_0x00c2;
                case 6: goto L_0x00c2;
                case 7: goto L_0x00bf;
                case 8: goto L_0x00c2;
                case 9: goto L_0x00bf;
                case 10: goto L_0x00c2;
                case 11: goto L_0x00bf;
                case 12: goto L_0x00bc;
                case 13: goto L_0x00c2;
                case 14: goto L_0x00bc;
                case 15: goto L_0x00b7;
                case 16: goto L_0x00b2;
                case 17: goto L_0x00ad;
                case 18: goto L_0x00a8;
                case 19: goto L_0x00a3;
                case 20: goto L_0x009e;
                case 21: goto L_0x0099;
                case 22: goto L_0x0094;
                case 23: goto L_0x00c2;
                case 24: goto L_0x0091;
                case 25: goto L_0x008c;
                case 26: goto L_0x0087;
                case 27: goto L_0x0082;
                case 28: goto L_0x007d;
                case 29: goto L_0x0078;
                case 30: goto L_0x0073;
                case 31: goto L_0x006e;
                default: goto L_0x0069;
            }
        L_0x0069:
            java.lang.String r10 = "getTypeConstructor"
            r9[r14] = r10
            goto L_0x00c4
        L_0x006e:
            java.lang.String r10 = "getSealedSubclasses"
            r9[r14] = r10
            goto L_0x00c4
        L_0x0073:
            java.lang.String r10 = "getDeclaredTypeParameters"
            r9[r14] = r10
            goto L_0x00c4
        L_0x0078:
            java.lang.String r10 = "getSource"
            r9[r14] = r10
            goto L_0x00c4
        L_0x007d:
            java.lang.String r10 = "getUnsubstitutedInnerClassesScope"
            r9[r14] = r10
            goto L_0x00c4
        L_0x0082:
            java.lang.String r10 = "getVisibility"
            r9[r14] = r10
            goto L_0x00c4
        L_0x0087:
            java.lang.String r10 = "getModality"
            r9[r14] = r10
            goto L_0x00c4
        L_0x008c:
            java.lang.String r10 = "getKind"
            r9[r14] = r10
            goto L_0x00c4
        L_0x0091:
            r9[r14] = r11
            goto L_0x00c4
        L_0x0094:
            java.lang.String r10 = "getContainingDeclaration"
            r9[r14] = r10
            goto L_0x00c4
        L_0x0099:
            java.lang.String r10 = "getOriginal"
            r9[r14] = r10
            goto L_0x00c4
        L_0x009e:
            java.lang.String r10 = "getName"
            r9[r14] = r10
            goto L_0x00c4
        L_0x00a3:
            java.lang.String r10 = "getAnnotations"
            r9[r14] = r10
            goto L_0x00c4
        L_0x00a8:
            java.lang.String r10 = "getConstructors"
            r9[r14] = r10
            goto L_0x00c4
        L_0x00ad:
            java.lang.String r10 = "getContextReceivers"
            r9[r14] = r10
            goto L_0x00c4
        L_0x00b2:
            java.lang.String r10 = "getDefaultType"
            r9[r14] = r10
            goto L_0x00c4
        L_0x00b7:
            java.lang.String r10 = "getStaticScope"
            r9[r14] = r10
            goto L_0x00c4
        L_0x00bc:
            r9[r14] = r12
            goto L_0x00c4
        L_0x00bf:
            r9[r14] = r13
            goto L_0x00c4
        L_0x00c2:
            r9[r14] = r10
        L_0x00c4:
            if (r15 == r7) goto L_0x00db
            if (r15 == r6) goto L_0x00db
            if (r15 == r5) goto L_0x00db
            if (r15 == r4) goto L_0x00db
            if (r15 == r3) goto L_0x00db
            if (r15 == r2) goto L_0x00db
            if (r15 == r1) goto L_0x00d8
            if (r15 == r0) goto L_0x00d5
            goto L_0x00dd
        L_0x00d5:
            r9[r7] = r11
            goto L_0x00dd
        L_0x00d8:
            r9[r7] = r12
            goto L_0x00dd
        L_0x00db:
            r9[r7] = r13
        L_0x00dd:
            java.lang.String r8 = java.lang.String.format(r8, r9)
            if (r15 == r7) goto L_0x00f7
            if (r15 == r6) goto L_0x00f7
            if (r15 == r5) goto L_0x00f7
            if (r15 == r4) goto L_0x00f7
            if (r15 == r3) goto L_0x00f7
            if (r15 == r2) goto L_0x00f7
            if (r15 == r1) goto L_0x00f7
            if (r15 == r0) goto L_0x00f7
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            r15.<init>(r8)
            goto L_0x00fc
        L_0x00f7:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            r15.<init>(r8)
        L_0x00fc:
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.zf3.m74878y0(int):void");
    }

    /* renamed from: C0 */
    public boolean mo52338C0() {
        return this.f46369d.mo52338C0();
    }

    /* renamed from: D */
    public MemberScope mo52459D(p17 p17) {
        if (p17 == null) {
            m74878y0(10);
        }
        MemberScope Q = mo50707Q(p17, DescriptorUtilsKt.m62450k(dd1.m56815g(this)));
        if (Q == null) {
            m74878y0(11);
        }
        return Q;
    }

    /* renamed from: D0 */
    public h85 mo52460D0() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: E0 */
    public final TypeSubstitutor mo67263E0() {
        if (this.f46371g == null) {
            if (this.f46370e.mo55336k()) {
                this.f46371g = this.f46370e;
            } else {
                List<a17> parameters = this.f46369d.mo50046g().getParameters();
                this.f46372k = new ArrayList(parameters.size());
                this.f46371g = bd1.m55845b(parameters, this.f46370e.mo55335j(), this, this.f46372k);
                this.f46373r = CollectionsKt___CollectionsKt.m47325V(this.f46372k, new C9674a());
            }
        }
        return this.f46371g;
    }

    /* renamed from: F0 */
    public if0 mo50708c(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            m74878y0(23);
        }
        if (typeSubstitutor.mo55336k()) {
            return this;
        }
        return new zf3(this, TypeSubstitutor.m62903h(typeSubstitutor.mo55335j(), mo67263E0().mo55335j()));
    }

    /* renamed from: G0 */
    public final d36 mo67265G0(d36 d36) {
        if (d36 == null || this.f46370e.mo55336k()) {
            return d36;
        }
        return (d36) mo67263E0().mo55339p(d36, Variance.INVARIANT);
    }

    /* renamed from: O */
    public MemberScope mo52461O() {
        MemberScope O = this.f46369d.mo52461O();
        if (O == null) {
            m74878y0(28);
        }
        return O;
    }

    /* renamed from: P */
    public d87<d36> mo52344P() {
        d87<d36> P = this.f46369d.mo52344P();
        if (P == null) {
            return null;
        }
        return P.mo51153b(new C9675b());
    }

    /* renamed from: Q */
    public MemberScope mo50707Q(p17 p17, bd3 bd3) {
        if (p17 == null) {
            m74878y0(5);
        }
        if (bd3 == null) {
            m74878y0(6);
        }
        MemberScope Q = this.f46369d.mo50707Q(p17, bd3);
        if (!this.f46370e.mo55336k()) {
            return new SubstitutingScope(Q, mo67263E0());
        }
        if (Q == null) {
            m74878y0(7);
        }
        return Q;
    }

    /* renamed from: S */
    public MemberScope mo52462S() {
        MemberScope b0 = mo51546b0(DescriptorUtilsKt.m62450k(dd1.m56815g(this.f46369d)));
        if (b0 == null) {
            m74878y0(12);
        }
        return b0;
    }

    /* renamed from: T */
    public boolean mo51317T() {
        return this.f46369d.mo51317T();
    }

    /* renamed from: U */
    public List<h85> mo52463U() {
        List<h85> emptyList = Collections.emptyList();
        if (emptyList == null) {
            m74878y0(17);
        }
        return emptyList;
    }

    /* renamed from: V */
    public boolean mo52345V() {
        return this.f46369d.mo52345V();
    }

    /* renamed from: Y */
    public boolean mo52346Y() {
        return this.f46369d.mo52346Y();
    }

    /* renamed from: b */
    public d31 mo51119b() {
        d31 b = this.f46369d.mo51119b();
        if (b == null) {
            m74878y0(22);
        }
        return b;
    }

    /* renamed from: b0 */
    public MemberScope mo51546b0(bd3 bd3) {
        if (bd3 == null) {
            m74878y0(13);
        }
        MemberScope b0 = this.f46369d.mo51546b0(bd3);
        if (!this.f46370e.mo55336k()) {
            return new SubstitutingScope(b0, mo67263E0());
        }
        if (b0 == null) {
            m74878y0(14);
        }
        return b0;
    }

    /* renamed from: d0 */
    public boolean mo51319d0() {
        return this.f46369d.mo51319d0();
    }

    /* renamed from: g */
    public yz6 mo50046g() {
        yz6 g = this.f46369d.mo50046g();
        if (this.f46370e.mo55336k()) {
            if (g == null) {
                m74878y0(0);
            }
            return g;
        }
        if (this.f46374s == null) {
            TypeSubstitutor E0 = mo67263E0();
            Collection<xc3> g2 = g.mo51811g();
            ArrayList arrayList = new ArrayList(g2.size());
            for (xc3 p : g2) {
                arrayList.add(E0.mo55339p(p, Variance.INVARIANT));
            }
            this.f46374s = new uf0(this, this.f46372k, arrayList, LockBasedStorageManager.f40224e);
        }
        yz6 yz6 = this.f46374s;
        if (yz6 == null) {
            m74878y0(1);
        }
        return yz6;
    }

    /* renamed from: g0 */
    public MemberScope mo52347g0() {
        MemberScope g0 = this.f46369d.mo52347g0();
        if (g0 == null) {
            m74878y0(15);
        }
        return g0;
    }

    public C6983dm getAnnotations() {
        C6983dm annotations = this.f46369d.getAnnotations();
        if (annotations == null) {
            m74878y0(19);
        }
        return annotations;
    }

    public ClassKind getKind() {
        ClassKind kind = this.f46369d.getKind();
        if (kind == null) {
            m74878y0(25);
        }
        return kind;
    }

    public r24 getName() {
        r24 name = this.f46369d.getName();
        if (name == null) {
            m74878y0(20);
        }
        return name;
    }

    public a66 getSource() {
        a66 a66 = a66.f36360a;
        if (a66 == null) {
            m74878y0(29);
        }
        return a66;
    }

    public fd1 getVisibility() {
        fd1 visibility = this.f46369d.getVisibility();
        if (visibility == null) {
            m74878y0(27);
        }
        return visibility;
    }

    /* renamed from: h */
    public Collection<ef0> mo52349h() {
        Collection<ef0> h = this.f46369d.mo52349h();
        ArrayList arrayList = new ArrayList(h.size());
        for (ef0 next : h) {
            arrayList.add(((ef0) next.mo50951s().mo50966m(next.mo50045a()).mo50964k(next.mo51326p()).mo50957d(next.getVisibility()).mo50971r(next.getKind()).mo50967n(false).build()).mo50708c(mo67263E0()));
        }
        return arrayList;
    }

    /* renamed from: h0 */
    public if0 mo52350h0() {
        return this.f46369d.mo52350h0();
    }

    /* renamed from: i */
    public boolean mo51669i() {
        return this.f46369d.mo51669i();
    }

    public boolean isExternal() {
        return this.f46369d.isExternal();
    }

    public boolean isInline() {
        return this.f46369d.isInline();
    }

    /* renamed from: j0 */
    public <R, D> R mo51120j0(h31<R, D> h31, D d) {
        return h31.mo52105c(this, d);
    }

    /* renamed from: n */
    public d36 mo51464n() {
        d36 j = KotlinTypeFactory.m62854j(ta1.f44696a.mo65408a(getAnnotations(), (yz6) null, (d31) null), mo50046g(), x17.m73823g(mo50046g().getParameters()), false, mo52462S());
        if (j == null) {
            m74878y0(16);
        }
        return j;
    }

    /* renamed from: o */
    public List<a17> mo51670o() {
        mo67263E0();
        List<a17> list = this.f46373r;
        if (list == null) {
            m74878y0(30);
        }
        return list;
    }

    /* renamed from: p */
    public Modality mo51326p() {
        Modality p = this.f46369d.mo51326p();
        if (p == null) {
            m74878y0(26);
        }
        return p;
    }

    /* renamed from: q */
    public boolean mo52352q() {
        return this.f46369d.mo52352q();
    }

    /* renamed from: w */
    public Collection<if0> mo52354w() {
        Collection<if0> w = this.f46369d.mo52354w();
        if (w == null) {
            m74878y0(31);
        }
        return w;
    }

    /* renamed from: z */
    public ef0 mo52355z() {
        return this.f46369d.mo52355z();
    }

    /* renamed from: a */
    public if0 m74895a() {
        if0 a = this.f46369d.mo50045a();
        if (a == null) {
            m74878y0(21);
        }
        return a;
    }
}
