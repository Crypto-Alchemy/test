package p000;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;

/* renamed from: xd1 */
/* compiled from: DeserializedMemberDescriptor.kt */
public final class xd1 extends gx4 implements pd1 {

    /* renamed from: p1 */
    public final ProtoBuf$Property f45871p1;

    /* renamed from: q1 */
    public final t24 f45872q1;

    /* renamed from: r1 */
    public final w17 f45873r1;

    /* renamed from: s1 */
    public final a97 f45874s1;

    /* renamed from: t1 */
    public final sd1 f45875t1;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public xd1(p000.d31 r18, p000.fx4 r19, p000.C6983dm r20, kotlin.reflect.jvm.internal.impl.descriptors.Modality r21, p000.fd1 r22, boolean r23, p000.r24 r24, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind r25, boolean r26, boolean r27, boolean r28, boolean r29, boolean r30, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property r31, p000.t24 r32, p000.w17 r33, p000.a97 r34, p000.sd1 r35) {
        /*
            r17 = this;
            r15 = r17
            r14 = r31
            r13 = r32
            r12 = r33
            r11 = r34
            java.lang.String r0 = "containingDeclaration"
            r1 = r18
            p000.vx2.m53591g(r1, r0)
            java.lang.String r0 = "annotations"
            r3 = r20
            p000.vx2.m53591g(r3, r0)
            java.lang.String r0 = "modality"
            r4 = r21
            p000.vx2.m53591g(r4, r0)
            java.lang.String r0 = "visibility"
            r5 = r22
            p000.vx2.m53591g(r5, r0)
            java.lang.String r0 = "name"
            r7 = r24
            p000.vx2.m53591g(r7, r0)
            java.lang.String r0 = "kind"
            r8 = r25
            p000.vx2.m53591g(r8, r0)
            java.lang.String r0 = "proto"
            p000.vx2.m53591g(r14, r0)
            java.lang.String r0 = "nameResolver"
            p000.vx2.m53591g(r13, r0)
            java.lang.String r0 = "typeTable"
            p000.vx2.m53591g(r12, r0)
            java.lang.String r0 = "versionRequirementTable"
            p000.vx2.m53591g(r11, r0)
            a66 r9 = p000.a66.f36360a
            r16 = 0
            r0 = r17
            r2 = r19
            r6 = r23
            r10 = r26
            r11 = r27
            r12 = r30
            r13 = r16
            r14 = r28
            r15 = r29
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1 = r31
            r0.f45871p1 = r1
            r1 = r32
            r0.f45872q1 = r1
            r1 = r33
            r0.f45873r1 = r1
            r1 = r34
            r0.f45874s1 = r1
            r1 = r35
            r0.f45875t1 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.xd1.<init>(d31, fx4, dm, kotlin.reflect.jvm.internal.impl.descriptors.Modality, fd1, boolean, r24, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind, boolean, boolean, boolean, boolean, boolean, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property, t24, w17, a97, sd1):void");
    }

    /* renamed from: A */
    public w17 mo65453A() {
        return this.f45873r1;
    }

    /* renamed from: E */
    public t24 mo65454E() {
        return this.f45872q1;
    }

    /* renamed from: F */
    public sd1 mo65455F() {
        return this.f45875t1;
    }

    /* renamed from: J0 */
    public gx4 mo52040J0(d31 d31, Modality modality, fd1 fd1, fx4 fx4, CallableMemberDescriptor.Kind kind, r24 r24, a66 a66) {
        fx4 fx42 = fx4;
        r24 r242 = r24;
        vx2.m53591g(d31, "newOwner");
        vx2.m53591g(modality, "newModality");
        vx2.m53591g(fd1, "newVisibility");
        vx2.m53591g(kind, "kind");
        vx2.m53591g(r24, "newName");
        vx2.m53591g(a66, "source");
        return new xd1(d31, fx42, getAnnotations(), modality, fd1, mo51761I(), r242, kind, mo51772t0(), isConst(), isExternal(), mo51773x(), mo51319d0(), mo65456Z(), mo65454E(), mo65453A(), mo66853a1(), mo65455F());
    }

    /* renamed from: Z0 */
    public ProtoBuf$Property mo65456Z() {
        return this.f45871p1;
    }

    /* renamed from: a1 */
    public a97 mo66853a1() {
        return this.f45874s1;
    }

    public boolean isExternal() {
        Boolean g = b42.f36640D.mo50465d(mo65456Z().getFlags());
        vx2.m53590f(g, "IS_EXTERNAL_PROPERTY.get(proto.flags)");
        return g.booleanValue();
    }
}
