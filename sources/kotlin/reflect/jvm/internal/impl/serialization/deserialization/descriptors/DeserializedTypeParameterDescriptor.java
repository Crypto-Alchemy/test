package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer;

/* compiled from: DeserializedTypeParameterDescriptor.kt */
public final class DeserializedTypeParameterDescriptor extends C7162h6 {

    /* renamed from: B */
    public final md1 f40220B;

    /* renamed from: C */
    public final ProtoBuf$TypeParameter f40221C;

    /* renamed from: H */
    public final od1 f40222H;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public DeserializedTypeParameterDescriptor(p000.md1 r12, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter r13, int r14) {
        /*
            r11 = this;
            java.lang.String r0 = "c"
            p000.vx2.m53591g(r12, r0)
            java.lang.String r0 = "proto"
            p000.vx2.m53591g(r13, r0)
            da6 r2 = r12.mo56231h()
            d31 r3 = r12.mo56228e()
            dm$a r0 = p000.C6983dm.f37317b
            dm r4 = r0.mo51228b()
            t24 r0 = r12.mo56230g()
            int r1 = r13.getName()
            r24 r5 = p000.v24.m73044b(r0, r1)
            yx4 r0 = p000.yx4.f46285a
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter$Variance r1 = r13.getVariance()
            java.lang.String r6 = "proto.variance"
            p000.vx2.m53590f(r1, r6)
            kotlin.reflect.jvm.internal.impl.types.Variance r6 = r0.mo67188d(r1)
            boolean r7 = r13.getReified()
            a66 r9 = p000.a66.f36360a
            nd6$a r10 = p000.nd6.C7936a.f41155a
            r1 = r11
            r8 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.f40220B = r12
            r11.f40221C = r13
            od1 r13 = new od1
            da6 r12 = r12.mo56231h()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeParameterDescriptor$annotations$1 r14 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeParameterDescriptor$annotations$1
            r14.<init>(r11)
            r13.<init>(r12, r14)
            r11.f40222H = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeParameterDescriptor.<init>(md1, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter, int):void");
    }

    /* renamed from: F0 */
    public List<xc3> mo50451F0() {
        List<ProtoBuf$Type> p = cy4.m56611p(this.f40221C, this.f40220B.mo56233j());
        if (p.isEmpty()) {
            return bk0.m32598e(DescriptorUtilsKt.m62445f(this).mo53185y());
        }
        TypeDeserializer i = this.f40220B.mo56232i();
        ArrayList arrayList = new ArrayList(dk0.m43495u(p, 10));
        for (ProtoBuf$Type q : p) {
            arrayList.add(i.mo55153q(q));
        }
        return arrayList;
    }

    /* renamed from: H0 */
    public od1 getAnnotations() {
        return this.f40222H;
    }

    /* renamed from: I0 */
    public final ProtoBuf$TypeParameter mo55236I0() {
        return this.f40221C;
    }

    /* renamed from: J0 */
    public Void mo50450E0(xc3 xc3) {
        vx2.m53591g(xc3, "type");
        throw new IllegalStateException("There should be no cycles for deserialized type parameters, but found for: " + this);
    }
}
