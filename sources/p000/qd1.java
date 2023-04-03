package p000;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.C7424b;
import kotlin.reflect.jvm.internal.impl.descriptors.C7425c;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor;

/* renamed from: qd1 */
/* compiled from: DeserializedMemberDescriptor.kt */
public final class qd1 extends ff0 implements pd1 {

    /* renamed from: s1 */
    public final ProtoBuf$Constructor f44176s1;

    /* renamed from: t1 */
    public final t24 f44177t1;

    /* renamed from: u1 */
    public final w17 f44178u1;

    /* renamed from: v1 */
    public final a97 f44179v1;

    /* renamed from: w1 */
    public final sd1 f44180w1;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qd1(if0 if0, C7424b bVar, C6983dm dmVar, boolean z, CallableMemberDescriptor.Kind kind, ProtoBuf$Constructor protoBuf$Constructor, t24 t24, w17 w17, a97 a97, sd1 sd1, a66 a66, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(if0, bVar, dmVar, z, kind, protoBuf$Constructor, t24, w17, a97, sd1, (i & RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE) != 0 ? null : a66);
    }

    /* renamed from: A */
    public w17 mo65453A() {
        return this.f44178u1;
    }

    /* renamed from: E */
    public t24 mo65454E() {
        return this.f44177t1;
    }

    /* renamed from: F */
    public sd1 mo65455F() {
        return this.f44180w1;
    }

    public boolean isExternal() {
        return false;
    }

    public boolean isInline() {
        return false;
    }

    public boolean isSuspend() {
        return false;
    }

    /* renamed from: m1 */
    public qd1 mo51663i1(d31 d31, C7425c cVar, CallableMemberDescriptor.Kind kind, r24 r24, C6983dm dmVar, a66 a66) {
        vx2.m53591g(d31, "newOwner");
        CallableMemberDescriptor.Kind kind2 = kind;
        vx2.m53591g(kind2, "kind");
        C6983dm dmVar2 = dmVar;
        vx2.m53591g(dmVar2, "annotations");
        a66 a662 = a66;
        vx2.m53591g(a662, "source");
        qd1 qd1 = new qd1((if0) d31, (C7424b) cVar, dmVar2, this.f37790r1, kind2, mo65456Z(), mo65454E(), mo65453A(), mo65459o1(), mo65455F(), a662);
        qd1.mo53329S0(mo53322K0());
        return qd1;
    }

    /* renamed from: n1 */
    public ProtoBuf$Constructor mo65456Z() {
        return this.f44176s1;
    }

    /* renamed from: o1 */
    public a97 mo65459o1() {
        return this.f44179v1;
    }

    /* renamed from: y */
    public boolean mo50147y() {
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qd1(if0 if0, C7424b bVar, C6983dm dmVar, boolean z, CallableMemberDescriptor.Kind kind, ProtoBuf$Constructor protoBuf$Constructor, t24 t24, w17 w17, a97 a97, sd1 sd1, a66 a66) {
        super(if0, bVar, dmVar, z, kind, a66 == null ? a66.f36360a : a66);
        ProtoBuf$Constructor protoBuf$Constructor2 = protoBuf$Constructor;
        t24 t242 = t24;
        w17 w172 = w17;
        a97 a972 = a97;
        if0 if02 = if0;
        vx2.m53591g(if0, "containingDeclaration");
        C6983dm dmVar2 = dmVar;
        vx2.m53591g(dmVar, "annotations");
        vx2.m53591g(kind, "kind");
        vx2.m53591g(protoBuf$Constructor2, "proto");
        vx2.m53591g(t242, "nameResolver");
        vx2.m53591g(w172, "typeTable");
        vx2.m53591g(a972, "versionRequirementTable");
        this.f44176s1 = protoBuf$Constructor2;
        this.f44177t1 = t242;
        this.f44178u1 = w172;
        this.f44179v1 = a972;
        this.f44180w1 = sd1;
    }
}
