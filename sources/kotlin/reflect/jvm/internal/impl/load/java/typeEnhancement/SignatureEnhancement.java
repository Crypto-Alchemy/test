package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* compiled from: signatureEnhancement.kt */
public final class SignatureEnhancement {

    /* renamed from: a */
    public final g23 f39583a;

    public SignatureEnhancement(g23 g23) {
        vx2.m53591g(g23, "typeEnhancement");
        this.f39583a = g23;
    }

    /* renamed from: d */
    public static /* synthetic */ xc3 m61070d(SignatureEnhancement signatureEnhancement, u16 u16, xc3 xc3, List list, o07 o07, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            o07 = null;
        }
        o07 o072 = o07;
        if ((i & 8) != 0) {
            z = false;
        }
        return signatureEnhancement.mo53744b(u16, xc3, list, o072, z);
    }

    /* renamed from: e */
    public static /* synthetic */ xc3 m61071e(SignatureEnhancement signatureEnhancement, CallableMemberDescriptor callableMemberDescriptor, C7903ml mlVar, boolean z, pf3 pf3, AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType, o07 o07, boolean z2, rc2 rc2, int i, Object obj) {
        boolean z3;
        if ((i & 32) != 0) {
            z3 = false;
        } else {
            z3 = z2;
        }
        return signatureEnhancement.mo53745c(callableMemberDescriptor, mlVar, z, pf3, annotationQualifierApplicabilityType, o07, z3, rc2);
    }

    /* renamed from: a */
    public final boolean mo53743a(xc3 xc3) {
        return x17.m73819c(xc3, SignatureEnhancement$containsFunctionN$1.INSTANCE);
    }

    /* renamed from: b */
    public final xc3 mo53744b(u16 u16, xc3 xc3, List<? extends xc3> list, o07 o07, boolean z) {
        return this.f39583a.mo51847a(xc3, u16.mo53685b(xc3, list, o07, z), u16.mo53704u());
    }

    /* renamed from: c */
    public final xc3 mo53745c(CallableMemberDescriptor callableMemberDescriptor, C7903ml mlVar, boolean z, pf3 pf3, AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType, o07 o07, boolean z2, rc2<? super CallableMemberDescriptor, ? extends xc3> rc2) {
        rc2<? super CallableMemberDescriptor, ? extends xc3> rc22 = rc2;
        u16 u16 = new u16(mlVar, z, pf3, annotationQualifierApplicabilityType, false, 16, (DefaultConstructorMarker) null);
        CallableMemberDescriptor callableMemberDescriptor2 = callableMemberDescriptor;
        xc3 xc3 = (xc3) rc22.invoke(callableMemberDescriptor);
        Collection<? extends CallableMemberDescriptor> d = callableMemberDescriptor.mo51659d();
        vx2.m53590f(d, "overriddenDescriptors");
        ArrayList arrayList = new ArrayList(dk0.m43495u(d, 10));
        for (CallableMemberDescriptor callableMemberDescriptor3 : d) {
            vx2.m53590f(callableMemberDescriptor3, "it");
            arrayList.add((xc3) rc22.invoke(callableMemberDescriptor3));
        }
        return mo53744b(u16, xc3, arrayList, o07, z2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01ea  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01f8  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x018b  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <D extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> D mo53746f(D r21, p000.pf3 r22) {
        /*
            r20 = this;
            r11 = r20
            r12 = r21
            boolean r0 = r12 instanceof p000.o03
            if (r0 != 0) goto L_0x0009
            return r12
        L_0x0009:
            r13 = r12
            o03 r13 = (p000.o03) r13
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r0 = r13.getKind()
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r1 = kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.FAKE_OVERRIDE
            r14 = 1
            if (r0 != r1) goto L_0x0024
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r0 = r13.mo50045a()
            java.util.Collection r0 = r0.mo51659d()
            int r0 = r0.size()
            if (r0 != r14) goto L_0x0024
            return r12
        L_0x0024:
            dm r0 = r20.mo53751k(r21, r22)
            r7 = r22
            pf3 r8 = kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt.m60740h(r7, r0)
            boolean r0 = r12 instanceof p000.u13
            r15 = 0
            if (r0 == 0) goto L_0x0050
            r0 = r12
            u13 r0 = (p000.u13) r0
            jx4 r1 = r0.getGetter()
            if (r1 == 0) goto L_0x0044
            boolean r1 = r1.mo51308B()
            if (r1 != 0) goto L_0x0044
            r1 = r14
            goto L_0x0045
        L_0x0044:
            r1 = r15
        L_0x0045:
            if (r1 == 0) goto L_0x0050
            jx4 r0 = r0.getGetter()
            p000.vx2.m53588d(r0)
            r9 = r0
            goto L_0x0051
        L_0x0050:
            r9 = r12
        L_0x0051:
            h85 r0 = r13.mo51315J()
            r10 = 0
            if (r0 == 0) goto L_0x007e
            boolean r0 = r9 instanceof kotlin.reflect.jvm.internal.impl.descriptors.C7425c
            if (r0 != 0) goto L_0x005e
            r0 = r10
            goto L_0x005f
        L_0x005e:
            r0 = r9
        L_0x005f:
            kotlin.reflect.jvm.internal.impl.descriptors.c r0 = (kotlin.reflect.jvm.internal.impl.descriptors.C7425c) r0
            if (r0 == 0) goto L_0x006d
            kotlin.reflect.jvm.internal.impl.descriptors.a$a<n87> r1 = kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor.f39445t1
            java.lang.Object r0 = r0.mo50950p0(r1)
            n87 r0 = (p000.n87) r0
            r2 = r0
            goto L_0x006e
        L_0x006d:
            r2 = r10
        L_0x006e:
            r4 = 0
            r5 = 0
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$enhanceSignature$receiverTypeEnhancement$1 r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$enhanceSignature$receiverTypeEnhancement$1.INSTANCE
            r0 = r20
            r1 = r21
            r3 = r8
            xc3 r0 = r0.mo53750j(r1, r2, r3, r4, r5, r6)
            r16 = r0
            goto L_0x0080
        L_0x007e:
            r16 = r10
        L_0x0080:
            boolean r0 = r12 instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor
            if (r0 == 0) goto L_0x0088
            r0 = r12
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor r0 = (kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor) r0
            goto L_0x0089
        L_0x0088:
            r0 = r10
        L_0x0089:
            if (r0 == 0) goto L_0x00b0
            kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents r1 = kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents.f39611a
            d31 r2 = r0.mo51119b()
            java.lang.String r3 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"
            p000.vx2.m53589e(r2, r3)
            if0 r2 = (p000.if0) r2
            r3 = 3
            java.lang.String r0 = p000.ov3.m70793c(r0, r15, r15, r3, r10)
            java.lang.String r0 = p000.nv3.m70094a(r1, r2, r0)
            if (r0 == 0) goto L_0x00b0
            java.util.Map r1 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt.m61069d()
            java.lang.Object r0 = r1.get(r0)
            hu4 r0 = (p000.hu4) r0
            r17 = r0
            goto L_0x00b2
        L_0x00b0:
            r17 = r10
        L_0x00b2:
            if (r17 == 0) goto L_0x00c2
            java.util.List r0 = r17.mo52320a()
            r0.size()
            java.util.List r0 = r13.mo51763f()
            r0.size()
        L_0x00c2:
            y13 r0 = r22.mo65296a()
            kotlin.reflect.jvm.internal.impl.load.java.JavaTypeEnhancementState r0 = r0.mo67006i()
            boolean r0 = p000.v77.m73134b(r0)
            if (r0 != 0) goto L_0x00de
            y13 r0 = r8.mo65296a()
            z13 r0 = r0.mo67014q()
            boolean r0 = r0.mo67209b()
            if (r0 == 0) goto L_0x00e6
        L_0x00de:
            boolean r0 = p000.v77.m73133a(r21)
            if (r0 == 0) goto L_0x00e6
            r7 = r14
            goto L_0x00e7
        L_0x00e6:
            r7 = r15
        L_0x00e7:
            java.util.List r0 = r9.mo51763f()
            java.lang.String r1 = "annotationOwnerForMember.valueParameters"
            p000.vx2.m53590f(r0, r1)
            java.util.ArrayList r6 = new java.util.ArrayList
            r5 = 10
            int r1 = p000.dk0.m43495u(r0, r5)
            r6.<init>(r1)
            java.util.Iterator r18 = r0.iterator()
        L_0x00ff:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L_0x013e
            java.lang.Object r0 = r18.next()
            r2 = r0
            n87 r2 = (p000.n87) r2
            if (r17 == 0) goto L_0x0120
            java.util.List r0 = r17.mo52320a()
            if (r0 == 0) goto L_0x0120
            int r1 = r2.getIndex()
            java.lang.Object r0 = kotlin.collections.CollectionsKt___CollectionsKt.m47332c0(r0, r1)
            o07 r0 = (p000.o07) r0
            r4 = r0
            goto L_0x0121
        L_0x0120:
            r4 = r10
        L_0x0121:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$enhanceSignature$valueParameterEnhancements$1$1 r3 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$enhanceSignature$valueParameterEnhancements$1$1
            r3.<init>(r2)
            r0 = r20
            r1 = r21
            r19 = r3
            r3 = r8
            r15 = r5
            r5 = r7
            r15 = r6
            r6 = r19
            xc3 r0 = r0.mo53750j(r1, r2, r3, r4, r5, r6)
            r15.add(r0)
            r6 = r15
            r5 = 10
            r15 = 0
            goto L_0x00ff
        L_0x013e:
            r15 = r6
            r3 = 1
            boolean r0 = r12 instanceof p000.fx4
            if (r0 != 0) goto L_0x0146
            r0 = r10
            goto L_0x0147
        L_0x0146:
            r0 = r12
        L_0x0147:
            fx4 r0 = (p000.fx4) r0
            if (r0 == 0) goto L_0x0153
            boolean r0 = p000.b13.m55700a(r0)
            if (r0 != r14) goto L_0x0153
            r0 = r14
            goto L_0x0154
        L_0x0153:
            r0 = 0
        L_0x0154:
            if (r0 == 0) goto L_0x0159
            kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType r0 = kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType.FIELD
            goto L_0x015b
        L_0x0159:
            kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType r0 = kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType.METHOD_RETURN_TYPE
        L_0x015b:
            r5 = r0
            if (r17 == 0) goto L_0x0164
            o07 r0 = r17.mo52321b()
            r6 = r0
            goto L_0x0165
        L_0x0164:
            r6 = r10
        L_0x0165:
            r7 = 0
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$enhanceSignature$returnTypeEnhancement$1 r17 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$enhanceSignature$returnTypeEnhancement$1.INSTANCE
            r18 = 32
            r19 = 0
            r0 = r20
            r1 = r21
            r2 = r9
            r4 = r8
            r8 = r17
            r9 = r18
            r17 = r10
            r10 = r19
            xc3 r0 = m61071e(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            xc3 r1 = r13.getReturnType()
            p000.vx2.m53588d(r1)
            boolean r1 = r11.mo53743a(r1)
            if (r1 != 0) goto L_0x01d9
            h85 r1 = r13.mo51315J()
            if (r1 == 0) goto L_0x019c
            xc3 r1 = r1.getType()
            if (r1 == 0) goto L_0x019c
            boolean r1 = r11.mo53743a(r1)
            goto L_0x019d
        L_0x019c:
            r1 = 0
        L_0x019d:
            if (r1 != 0) goto L_0x01d9
            java.util.List r1 = r13.mo51763f()
            java.lang.String r2 = "valueParameters"
            p000.vx2.m53590f(r1, r2)
            boolean r2 = r1 instanceof java.util.Collection
            if (r2 == 0) goto L_0x01b4
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x01b4
        L_0x01b2:
            r1 = 0
            goto L_0x01d4
        L_0x01b4:
            java.util.Iterator r1 = r1.iterator()
        L_0x01b8:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x01b2
            java.lang.Object r2 = r1.next()
            n87 r2 = (p000.n87) r2
            xc3 r2 = r2.getType()
            java.lang.String r3 = "it.type"
            p000.vx2.m53590f(r2, r3)
            boolean r2 = r11.mo53743a(r2)
            if (r2 == 0) goto L_0x01b8
            r1 = r14
        L_0x01d4:
            if (r1 == 0) goto L_0x01d7
            goto L_0x01d9
        L_0x01d7:
            r1 = 0
            goto L_0x01da
        L_0x01d9:
            r1 = r14
        L_0x01da:
            if (r1 == 0) goto L_0x01ea
            kotlin.reflect.jvm.internal.impl.descriptors.a$a r1 = p000.uc1.m72695a()
            nc1 r2 = new nc1
            r2.<init>(r12)
            kotlin.Pair r10 = p000.wy6.m54142a(r1, r2)
            goto L_0x01ec
        L_0x01ea:
            r10 = r17
        L_0x01ec:
            if (r16 != 0) goto L_0x0215
            if (r0 != 0) goto L_0x0215
            boolean r1 = r15.isEmpty()
            if (r1 == 0) goto L_0x01f8
        L_0x01f6:
            r14 = 0
            goto L_0x020f
        L_0x01f8:
            java.util.Iterator r1 = r15.iterator()
        L_0x01fc:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x01f6
            java.lang.Object r2 = r1.next()
            xc3 r2 = (p000.xc3) r2
            if (r2 == 0) goto L_0x020c
            r2 = r14
            goto L_0x020d
        L_0x020c:
            r2 = 0
        L_0x020d:
            if (r2 == 0) goto L_0x01fc
        L_0x020f:
            if (r14 != 0) goto L_0x0215
            if (r10 == 0) goto L_0x0214
            goto L_0x0215
        L_0x0214:
            return r12
        L_0x0215:
            if (r16 != 0) goto L_0x0225
            h85 r1 = r13.mo51315J()
            if (r1 == 0) goto L_0x0222
            xc3 r1 = r1.getType()
            goto L_0x0227
        L_0x0222:
            r1 = r17
            goto L_0x0227
        L_0x0225:
            r1 = r16
        L_0x0227:
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = p000.dk0.m43495u(r15, r3)
            r2.<init>(r3)
            java.util.Iterator r3 = r15.iterator()
            r15 = 0
        L_0x0237:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0264
            java.lang.Object r4 = r3.next()
            int r5 = r15 + 1
            if (r15 >= 0) goto L_0x0248
            p000.ck0.m33072t()
        L_0x0248:
            xc3 r4 = (p000.xc3) r4
            if (r4 != 0) goto L_0x025f
            java.util.List r4 = r13.mo51763f()
            java.lang.Object r4 = r4.get(r15)
            n87 r4 = (p000.n87) r4
            xc3 r4 = r4.getType()
            java.lang.String r6 = "valueParameters[index].type"
            p000.vx2.m53590f(r4, r6)
        L_0x025f:
            r2.add(r4)
            r15 = r5
            goto L_0x0237
        L_0x0264:
            if (r0 != 0) goto L_0x026d
            xc3 r0 = r13.getReturnType()
            p000.vx2.m53588d(r0)
        L_0x026d:
            o03 r0 = r13.mo53484e0(r1, r2, r0, r10)
            java.lang.String r1 = "null cannot be cast to non-null type D of org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature"
            p000.vx2.m53589e(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.mo53746f(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, pf3):kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor");
    }

    /* renamed from: g */
    public final <D extends CallableMemberDescriptor> Collection<D> mo53747g(pf3 pf3, Collection<? extends D> collection) {
        vx2.m53591g(pf3, "c");
        vx2.m53591g(collection, "platformSignatures");
        ArrayList arrayList = new ArrayList(dk0.m43495u(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(mo53746f((CallableMemberDescriptor) it.next(), pf3));
        }
        return arrayList;
    }

    /* renamed from: h */
    public final xc3 mo53748h(xc3 xc3, pf3 pf3) {
        vx2.m53591g(xc3, "type");
        vx2.m53591g(pf3, "context");
        xc3 d = m61070d(this, new u16((C7903ml) null, false, pf3, AnnotationQualifierApplicabilityType.TYPE_USE, true), xc3, ck0.m33062j(), (o07) null, false, 12, (Object) null);
        if (d == null) {
            return xc3;
        }
        return d;
    }

    /* renamed from: i */
    public final List<xc3> mo53749i(a17 a17, List<? extends xc3> list, pf3 pf3) {
        vx2.m53591g(a17, "typeParameter");
        vx2.m53591g(list, "bounds");
        vx2.m53591g(pf3, "context");
        ArrayList arrayList = new ArrayList(dk0.m43495u(list, 10));
        for (xc3 xc3 : list) {
            if (!TypeUtilsKt.m62946b(xc3, SignatureEnhancement$enhanceTypeParameterBounds$1$1.INSTANCE)) {
                xc3 xc32 = xc3;
                xc3 d = m61070d(this, new u16(a17, false, pf3, AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS, false, 16, (DefaultConstructorMarker) null), xc32, ck0.m33062j(), (o07) null, false, 12, (Object) null);
                if (d != null) {
                    xc3 = d;
                }
            }
            arrayList.add(xc3);
        }
        return arrayList;
    }

    /* renamed from: j */
    public final xc3 mo53750j(CallableMemberDescriptor callableMemberDescriptor, n87 n87, pf3 pf3, o07 o07, boolean z, rc2<? super CallableMemberDescriptor, ? extends xc3> rc2) {
        pf3 pf32;
        pf3 h;
        if (n87 == null || (h = ContextKt.m60740h(pf3, n87.getAnnotations())) == null) {
            pf32 = pf3;
        } else {
            pf32 = h;
        }
        return mo53745c(callableMemberDescriptor, n87, false, pf32, AnnotationQualifierApplicabilityType.VALUE_PARAMETER, o07, z, rc2);
    }

    /* renamed from: k */
    public final <D extends CallableMemberDescriptor> C6983dm mo53751k(D d, pf3 pf3) {
        LazyJavaClassDescriptor lazyJavaClassDescriptor;
        boolean z;
        eg0 a = cd1.m56378a(d);
        if (a == null) {
            return d.getAnnotations();
        }
        List<h03> list = null;
        if (a instanceof LazyJavaClassDescriptor) {
            lazyJavaClassDescriptor = (LazyJavaClassDescriptor) a;
        } else {
            lazyJavaClassDescriptor = null;
        }
        if (lazyJavaClassDescriptor != null) {
            list = lazyJavaClassDescriptor.mo53518K0();
        }
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return d.getAnnotations();
        }
        ArrayList arrayList = new ArrayList(dk0.m43495u(list, 10));
        for (h03 lazyJavaAnnotationDescriptor : list) {
            arrayList.add(new LazyJavaAnnotationDescriptor(pf3, lazyJavaAnnotationDescriptor, true));
        }
        return C6983dm.f37317b.mo51227a(CollectionsKt___CollectionsKt.m47348s0(d.getAnnotations(), arrayList));
    }
}
