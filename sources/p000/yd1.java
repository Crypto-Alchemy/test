package p000;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.C7425c;
import kotlin.reflect.jvm.internal.impl.descriptors.C7428e;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C7433a;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import org.web3j.ens.contracts.generated.PublicResolver;

/* renamed from: yd1 */
/* compiled from: DeserializedMemberDescriptor.kt */
public final class yd1 extends h26 implements pd1 {

    /* renamed from: r1 */
    public final ProtoBuf$Function f46195r1;

    /* renamed from: s1 */
    public final t24 f46196s1;

    /* renamed from: t1 */
    public final w17 f46197t1;

    /* renamed from: u1 */
    public final a97 f46198u1;

    /* renamed from: v1 */
    public final sd1 f46199v1;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yd1(d31 d31, C7428e eVar, C6983dm dmVar, r24 r24, CallableMemberDescriptor.Kind kind, ProtoBuf$Function protoBuf$Function, t24 t24, w17 w17, a97 a97, sd1 sd1, a66 a66, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(d31, eVar, dmVar, r24, kind, protoBuf$Function, t24, w17, a97, sd1, (i & RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE) != 0 ? null : a66);
    }

    /* renamed from: A */
    public w17 mo65453A() {
        return this.f46197t1;
    }

    /* renamed from: E */
    public t24 mo65454E() {
        return this.f46196s1;
    }

    /* renamed from: F */
    public sd1 mo65455F() {
        return this.f46199v1;
    }

    /* renamed from: F0 */
    public C7433a mo50142F0(d31 d31, C7425c cVar, CallableMemberDescriptor.Kind kind, r24 r24, C6983dm dmVar, a66 a66) {
        r24 r242;
        d31 d312 = d31;
        vx2.m53591g(d31, "newOwner");
        vx2.m53591g(kind, "kind");
        vx2.m53591g(dmVar, "annotations");
        vx2.m53591g(a66, "source");
        C7428e eVar = (C7428e) cVar;
        if (r24 == null) {
            r24 name = getName();
            vx2.m53590f(name, PublicResolver.FUNC_NAME);
            r242 = name;
        } else {
            r242 = r24;
        }
        yd1 yd1 = new yd1(d31, eVar, dmVar, r242, kind, mo65456Z(), mo65454E(), mo65453A(), mo67088k1(), mo65455F(), a66);
        yd1.mo53329S0(mo53322K0());
        return yd1;
    }

    /* renamed from: j1 */
    public ProtoBuf$Function mo65456Z() {
        return this.f46195r1;
    }

    /* renamed from: k1 */
    public a97 mo67088k1() {
        return this.f46198u1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yd1(d31 d31, C7428e eVar, C6983dm dmVar, r24 r24, CallableMemberDescriptor.Kind kind, ProtoBuf$Function protoBuf$Function, t24 t24, w17 w17, a97 a97, sd1 sd1, a66 a66) {
        super(d31, eVar, dmVar, r24, kind, a66 == null ? a66.f36360a : a66);
        ProtoBuf$Function protoBuf$Function2 = protoBuf$Function;
        t24 t242 = t24;
        w17 w172 = w17;
        a97 a972 = a97;
        d31 d312 = d31;
        vx2.m53591g(d31, "containingDeclaration");
        C6983dm dmVar2 = dmVar;
        vx2.m53591g(dmVar, "annotations");
        vx2.m53591g(r24, PublicResolver.FUNC_NAME);
        vx2.m53591g(kind, "kind");
        vx2.m53591g(protoBuf$Function2, "proto");
        vx2.m53591g(t242, "nameResolver");
        vx2.m53591g(w172, "typeTable");
        vx2.m53591g(a972, "versionRequirementTable");
        this.f46195r1 = protoBuf$Function2;
        this.f46196s1 = t242;
        this.f46197t1 = w172;
        this.f46198u1 = a972;
        this.f46199v1 = sd1;
    }
}
