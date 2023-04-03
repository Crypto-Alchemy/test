package p000;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.protobuf.C7616d;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer;

/* renamed from: id1 */
/* compiled from: context.kt */
public final class id1 {

    /* renamed from: a */
    public final da6 f38353a;

    /* renamed from: b */
    public final mx3 f38354b;

    /* renamed from: c */
    public final ld1 f38355c;

    /* renamed from: d */
    public final hf0 f38356d;

    /* renamed from: e */
    public final C9363tl<C9460vl, fq0<?>> f38357e;

    /* renamed from: f */
    public final hk4 f38358f;

    /* renamed from: g */
    public final gj3 f38359g;

    /* renamed from: h */
    public final gr1 f38360h;

    /* renamed from: i */
    public final wl3 f38361i;

    /* renamed from: j */
    public final j42 f38362j;

    /* renamed from: k */
    public final Iterable<kf0> f38363k;

    /* renamed from: l */
    public final NotFoundClasses f38364l;

    /* renamed from: m */
    public final ht0 f38365m;

    /* renamed from: n */
    public final C6818ad f38366n;

    /* renamed from: o */
    public final bp4 f38367o;

    /* renamed from: p */
    public final C7616d f38368p;

    /* renamed from: q */
    public final k64 f38369q;

    /* renamed from: r */
    public final vk5 f38370r;

    /* renamed from: s */
    public final dp4 f38371s;

    /* renamed from: t */
    public final List<pz6> f38372t;

    /* renamed from: u */
    public final ClassDeserializer f38373u;

    public id1(da6 da6, mx3 mx3, ld1 ld1, hf0 hf0, C9363tl<? extends C9460vl, ? extends fq0<?>> tlVar, hk4 hk4, gj3 gj3, gr1 gr1, wl3 wl3, j42 j42, Iterable<? extends kf0> iterable, NotFoundClasses notFoundClasses, ht0 ht0, C6818ad adVar, bp4 bp4, C7616d dVar, k64 k64, vk5 vk5, dp4 dp4, List<? extends pz6> list) {
        da6 da62 = da6;
        mx3 mx32 = mx3;
        ld1 ld12 = ld1;
        hf0 hf02 = hf0;
        C9363tl<? extends C9460vl, ? extends fq0<?>> tlVar2 = tlVar;
        hk4 hk42 = hk4;
        gj3 gj32 = gj3;
        gr1 gr12 = gr1;
        wl3 wl32 = wl3;
        j42 j422 = j42;
        Iterable<? extends kf0> iterable2 = iterable;
        NotFoundClasses notFoundClasses2 = notFoundClasses;
        ht0 ht02 = ht0;
        C6818ad adVar2 = adVar;
        C7616d dVar2 = dVar;
        vx2.m53591g(da62, "storageManager");
        vx2.m53591g(mx32, "moduleDescriptor");
        vx2.m53591g(ld12, "configuration");
        vx2.m53591g(hf02, "classDataFinder");
        vx2.m53591g(tlVar2, "annotationAndConstantLoader");
        vx2.m53591g(hk42, "packageFragmentProvider");
        vx2.m53591g(gj32, "localClassifierTypeSettings");
        vx2.m53591g(gr12, "errorReporter");
        vx2.m53591g(wl32, "lookupTracker");
        vx2.m53591g(j422, "flexibleTypeDeserializer");
        vx2.m53591g(iterable2, "fictitiousClassDescriptorFactories");
        vx2.m53591g(notFoundClasses2, "notFoundClasses");
        vx2.m53591g(ht02, "contractDeserializer");
        vx2.m53591g(adVar2, "additionalClassPartsProvider");
        vx2.m53591g(bp4, "platformDependentDeclarationFilter");
        vx2.m53591g(dVar, "extensionRegistryLite");
        vx2.m53591g(k64, "kotlinTypeChecker");
        vx2.m53591g(vk5, "samConversionResolver");
        vx2.m53591g(dp4, "platformDependentTypeTransformer");
        vx2.m53591g(list, "typeAttributeTranslators");
        this.f38353a = da62;
        this.f38354b = mx32;
        this.f38355c = ld12;
        this.f38356d = hf02;
        this.f38357e = tlVar2;
        this.f38358f = hk42;
        this.f38359g = gj32;
        this.f38360h = gr12;
        this.f38361i = wl32;
        this.f38362j = j422;
        this.f38363k = iterable2;
        this.f38364l = notFoundClasses2;
        this.f38365m = ht02;
        this.f38366n = adVar2;
        this.f38367o = bp4;
        this.f38368p = dVar;
        this.f38369q = k64;
        this.f38370r = vk5;
        this.f38371s = dp4;
        this.f38372t = list;
        this.f38373u = new ClassDeserializer(this);
    }

    /* renamed from: a */
    public final md1 mo52434a(fk4 fk4, t24 t24, w17 w17, a97 a97, o10 o10, sd1 sd1) {
        vx2.m53591g(fk4, "descriptor");
        t24 t242 = t24;
        vx2.m53591g(t24, "nameResolver");
        vx2.m53591g(w17, "typeTable");
        vx2.m53591g(a97, "versionRequirementTable");
        o10 o102 = o10;
        vx2.m53591g(o102, "metadataVersion");
        return new md1(this, t242, fk4, w17, a97, o102, sd1, (TypeDeserializer) null, ck0.m33062j());
    }

    /* renamed from: b */
    public final if0 mo52435b(nf0 nf0) {
        vx2.m53591g(nf0, "classId");
        return ClassDeserializer.m62527e(this.f38373u, nf0, (gf0) null, 2, (Object) null);
    }

    /* renamed from: c */
    public final C6818ad mo52436c() {
        return this.f38366n;
    }

    /* renamed from: d */
    public final C9363tl<C9460vl, fq0<?>> mo52437d() {
        return this.f38357e;
    }

    /* renamed from: e */
    public final hf0 mo52438e() {
        return this.f38356d;
    }

    /* renamed from: f */
    public final ClassDeserializer mo52439f() {
        return this.f38373u;
    }

    /* renamed from: g */
    public final ld1 mo52440g() {
        return this.f38355c;
    }

    /* renamed from: h */
    public final ht0 mo52441h() {
        return this.f38365m;
    }

    /* renamed from: i */
    public final gr1 mo52442i() {
        return this.f38360h;
    }

    /* renamed from: j */
    public final C7616d mo52443j() {
        return this.f38368p;
    }

    /* renamed from: k */
    public final Iterable<kf0> mo52444k() {
        return this.f38363k;
    }

    /* renamed from: l */
    public final j42 mo52445l() {
        return this.f38362j;
    }

    /* renamed from: m */
    public final k64 mo52446m() {
        return this.f38369q;
    }

    /* renamed from: n */
    public final gj3 mo52447n() {
        return this.f38359g;
    }

    /* renamed from: o */
    public final wl3 mo52448o() {
        return this.f38361i;
    }

    /* renamed from: p */
    public final mx3 mo52449p() {
        return this.f38354b;
    }

    /* renamed from: q */
    public final NotFoundClasses mo52450q() {
        return this.f38364l;
    }

    /* renamed from: r */
    public final hk4 mo52451r() {
        return this.f38358f;
    }

    /* renamed from: s */
    public final bp4 mo52452s() {
        return this.f38367o;
    }

    /* renamed from: t */
    public final dp4 mo52453t() {
        return this.f38371s;
    }

    /* renamed from: u */
    public final da6 mo52454u() {
        return this.f38353a;
    }

    /* renamed from: v */
    public final List<pz6> mo52455v() {
        return this.f38372t;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ id1(p000.da6 r24, p000.mx3 r25, p000.ld1 r26, p000.hf0 r27, p000.C9363tl r28, p000.hk4 r29, p000.gj3 r30, p000.gr1 r31, p000.wl3 r32, p000.j42 r33, java.lang.Iterable r34, kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses r35, p000.ht0 r36, p000.C6818ad r37, p000.bp4 r38, kotlin.reflect.jvm.internal.impl.protobuf.C7616d r39, p000.k64 r40, p000.vk5 r41, p000.dp4 r42, java.util.List r43, int r44, kotlin.jvm.internal.DefaultConstructorMarker r45) {
        /*
            r23 = this;
            r0 = r44
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x000b
            ad$a r1 = p000.C6818ad.C6819a.f36428a
            r16 = r1
            goto L_0x000d
        L_0x000b:
            r16 = r37
        L_0x000d:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x0016
            bp4$a r1 = p000.bp4.C6871a.f36921a
            r17 = r1
            goto L_0x0018
        L_0x0016:
            r17 = r38
        L_0x0018:
            r1 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0026
            k64$a r1 = p000.k64.f38868b
            l64 r1 = r1.mo52871a()
            r19 = r1
            goto L_0x0028
        L_0x0026:
            r19 = r40
        L_0x0028:
            r1 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0032
            dp4$a r1 = p000.dp4.C6994a.f37362a
            r21 = r1
            goto L_0x0034
        L_0x0032:
            r21 = r42
        L_0x0034:
            r1 = 524288(0x80000, float:7.34684E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0042
            ta1 r0 = p000.ta1.f44696a
            java.util.List r0 = p000.bk0.m32598e(r0)
            r22 = r0
            goto L_0x0044
        L_0x0042:
            r22 = r43
        L_0x0044:
            r2 = r23
            r3 = r24
            r4 = r25
            r5 = r26
            r6 = r27
            r7 = r28
            r8 = r29
            r9 = r30
            r10 = r31
            r11 = r32
            r12 = r33
            r13 = r34
            r14 = r35
            r15 = r36
            r18 = r39
            r20 = r41
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.id1.<init>(da6, mx3, ld1, hf0, tl, hk4, gj3, gr1, wl3, j42, java.lang.Iterable, kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses, ht0, ad, bp4, kotlin.reflect.jvm.internal.impl.protobuf.d, k64, vk5, dp4, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
