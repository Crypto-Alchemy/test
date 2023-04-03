package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;
import org.web3j.ens.contracts.generated.PublicResolver;

/* renamed from: wd1 */
/* compiled from: DeserializedPackageMemberScope.kt */
public class wd1 extends DeserializedMemberScope {

    /* renamed from: g */
    public final fk4 f45507g;

    /* renamed from: h */
    public final String f45508h;

    /* renamed from: i */
    public final u82 f45509i;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public wd1(p000.fk4 r17, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package r18, p000.t24 r19, p000.o10 r20, p000.sd1 r21, p000.id1 r22, java.lang.String r23, p000.pc2<? extends java.util.Collection<p000.r24>> r24) {
        /*
            r16 = this;
            r6 = r16
            r14 = r17
            r15 = r23
            java.lang.String r0 = "packageDescriptor"
            p000.vx2.m53591g(r14, r0)
            java.lang.String r0 = "proto"
            r1 = r18
            p000.vx2.m53591g(r1, r0)
            java.lang.String r0 = "nameResolver"
            r2 = r19
            p000.vx2.m53591g(r2, r0)
            java.lang.String r0 = "metadataVersion"
            r3 = r20
            p000.vx2.m53591g(r3, r0)
            java.lang.String r0 = "components"
            r4 = r22
            p000.vx2.m53591g(r4, r0)
            java.lang.String r0 = "debugName"
            p000.vx2.m53591g(r15, r0)
            java.lang.String r0 = "classNames"
            r5 = r24
            p000.vx2.m53591g(r5, r0)
            w17 r10 = new w17
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable r0 = r18.getTypeTable()
            java.lang.String r7 = "proto.typeTable"
            p000.vx2.m53590f(r0, r7)
            r10.<init>(r0)
            a97$a r0 = p000.a97.f36407b
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable r7 = r18.getVersionRequirementTable()
            java.lang.String r8 = "proto.versionRequirementTable"
            p000.vx2.m53590f(r7, r8)
            a97 r11 = r0.mo50122a(r7)
            r7 = r22
            r8 = r17
            r9 = r19
            r12 = r20
            r13 = r21
            md1 r2 = r7.mo52434a(r8, r9, r10, r11, r12, r13)
            java.util.List r3 = r18.getFunctionList()
            java.lang.String r0 = "proto.functionList"
            p000.vx2.m53590f(r3, r0)
            java.util.List r4 = r18.getPropertyList()
            java.lang.String r0 = "proto.propertyList"
            p000.vx2.m53590f(r4, r0)
            java.util.List r7 = r18.getTypeAliasList()
            java.lang.String r0 = "proto.typeAliasList"
            p000.vx2.m53590f(r7, r0)
            r0 = r16
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f45507g = r14
            r6.f45508h = r15
            u82 r0 = r17.mo51711e()
            r6.f45509i = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.wd1.<init>(fk4, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package, t24, o10, sd1, id1, java.lang.String, pc2):void");
    }

    /* renamed from: e */
    public eg0 mo50864e(r24 r24, ul3 ul3) {
        vx2.m53591g(r24, PublicResolver.FUNC_NAME);
        vx2.m53591g(ul3, "location");
        mo66691z(r24, ul3);
        return super.mo50864e(r24, ul3);
    }

    /* renamed from: i */
    public void mo55183i(Collection<d31> collection, rc2<? super r24, Boolean> rc2) {
        vx2.m53591g(collection, "result");
        vx2.m53591g(rc2, "nameFilter");
    }

    /* renamed from: m */
    public nf0 mo55186m(r24 r24) {
        vx2.m53591g(r24, PublicResolver.FUNC_NAME);
        return new nf0(this.f45509i, r24);
    }

    /* renamed from: s */
    public Set<r24> mo55187s() {
        return ny5.m49095e();
    }

    /* renamed from: t */
    public Set<r24> mo55188t() {
        return ny5.m49095e();
    }

    public String toString() {
        return this.f45508h;
    }

    /* renamed from: u */
    public Set<r24> mo55189u() {
        return ny5.m49095e();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo55205w(p000.r24 r6) {
        /*
            r5 = this;
            java.lang.String r0 = "name"
            p000.vx2.m53591g(r6, r0)
            boolean r0 = super.mo55205w(r6)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0045
            md1 r0 = r5.mo55201p()
            id1 r0 = r0.mo56226c()
            java.lang.Iterable r0 = r0.mo52444k()
            boolean r3 = r0 instanceof java.util.Collection
            if (r3 == 0) goto L_0x0028
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0028
        L_0x0026:
            r6 = r2
            goto L_0x0041
        L_0x0028:
            java.util.Iterator r0 = r0.iterator()
        L_0x002c:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0026
            java.lang.Object r3 = r0.next()
            kf0 r3 = (p000.kf0) r3
            u82 r4 = r5.f45509i
            boolean r3 = r3.mo51604c(r4, r6)
            if (r3 == 0) goto L_0x002c
            r6 = r1
        L_0x0041:
            if (r6 == 0) goto L_0x0044
            goto L_0x0045
        L_0x0044:
            r1 = r2
        L_0x0045:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.wd1.mo55205w(r24):boolean");
    }

    /* renamed from: y */
    public List<d31> mo50865f(yc1 yc1, rc2<? super r24, Boolean> rc2) {
        vx2.m53591g(yc1, "kindFilter");
        vx2.m53591g(rc2, "nameFilter");
        Collection<d31> j = mo55198j(yc1, rc2, NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS);
        Iterable<kf0> k = mo55201p().mo56226c().mo52444k();
        ArrayList arrayList = new ArrayList();
        for (kf0 b : k) {
            hk0.m45275z(arrayList, b.mo51603b(this.f45509i));
        }
        return CollectionsKt___CollectionsKt.m47350u0(j, arrayList);
    }

    /* renamed from: z */
    public void mo66691z(r24 r24, ul3 ul3) {
        vx2.m53591g(r24, PublicResolver.FUNC_NAME);
        vx2.m53591g(ul3, "location");
        u77.m72645b(mo55201p().mo56226c().mo52448o(), ul3, this.f45507g, r24);
    }
}
