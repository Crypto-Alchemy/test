package p000;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$MemberKind;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility;

/* renamed from: zx4 */
/* compiled from: ProtoEnumFlagsUtils.kt */
public final class zx4 {

    /* renamed from: zx4$a */
    /* compiled from: ProtoEnumFlagsUtils.kt */
    public /* synthetic */ class C9716a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f46504a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f46505b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f46506c;

        static {
            int[] iArr = new int[ProtoBuf$MemberKind.values().length];
            iArr[ProtoBuf$MemberKind.DECLARATION.ordinal()] = 1;
            iArr[ProtoBuf$MemberKind.FAKE_OVERRIDE.ordinal()] = 2;
            iArr[ProtoBuf$MemberKind.DELEGATION.ordinal()] = 3;
            iArr[ProtoBuf$MemberKind.SYNTHESIZED.ordinal()] = 4;
            f46504a = iArr;
            int[] iArr2 = new int[CallableMemberDescriptor.Kind.values().length];
            iArr2[CallableMemberDescriptor.Kind.DECLARATION.ordinal()] = 1;
            iArr2[CallableMemberDescriptor.Kind.FAKE_OVERRIDE.ordinal()] = 2;
            iArr2[CallableMemberDescriptor.Kind.DELEGATION.ordinal()] = 3;
            iArr2[CallableMemberDescriptor.Kind.SYNTHESIZED.ordinal()] = 4;
            f46505b = iArr2;
            int[] iArr3 = new int[ProtoBuf$Visibility.values().length];
            iArr3[ProtoBuf$Visibility.INTERNAL.ordinal()] = 1;
            iArr3[ProtoBuf$Visibility.PRIVATE.ordinal()] = 2;
            iArr3[ProtoBuf$Visibility.PRIVATE_TO_THIS.ordinal()] = 3;
            iArr3[ProtoBuf$Visibility.PROTECTED.ordinal()] = 4;
            iArr3[ProtoBuf$Visibility.PUBLIC.ordinal()] = 5;
            iArr3[ProtoBuf$Visibility.LOCAL.ordinal()] = 6;
            f46506c = iArr3;
        }
    }

    /* renamed from: a */
    public static final fd1 m75243a(yx4 yx4, ProtoBuf$Visibility protoBuf$Visibility) {
        int i;
        vx2.m53591g(yx4, "<this>");
        if (protoBuf$Visibility == null) {
            i = -1;
        } else {
            i = C9716a.f46506c[protoBuf$Visibility.ordinal()];
        }
        switch (i) {
            case 1:
                fd1 fd1 = ed1.f37509d;
                vx2.m53590f(fd1, "INTERNAL");
                return fd1;
            case 2:
                fd1 fd12 = ed1.f37506a;
                vx2.m53590f(fd12, "PRIVATE");
                return fd12;
            case 3:
                fd1 fd13 = ed1.f37507b;
                vx2.m53590f(fd13, "PRIVATE_TO_THIS");
                return fd13;
            case 4:
                fd1 fd14 = ed1.f37508c;
                vx2.m53590f(fd14, "PROTECTED");
                return fd14;
            case 5:
                fd1 fd15 = ed1.f37510e;
                vx2.m53590f(fd15, "PUBLIC");
                return fd15;
            case 6:
                fd1 fd16 = ed1.f37511f;
                vx2.m53590f(fd16, "LOCAL");
                return fd16;
            default:
                fd1 fd17 = ed1.f37506a;
                vx2.m53590f(fd17, "PRIVATE");
                return fd17;
        }
    }

    /* renamed from: b */
    public static final CallableMemberDescriptor.Kind m75244b(yx4 yx4, ProtoBuf$MemberKind protoBuf$MemberKind) {
        int i;
        vx2.m53591g(yx4, "<this>");
        if (protoBuf$MemberKind == null) {
            i = -1;
        } else {
            i = C9716a.f46504a[protoBuf$MemberKind.ordinal()];
        }
        if (i == 1) {
            return CallableMemberDescriptor.Kind.DECLARATION;
        }
        if (i == 2) {
            return CallableMemberDescriptor.Kind.FAKE_OVERRIDE;
        }
        if (i == 3) {
            return CallableMemberDescriptor.Kind.DELEGATION;
        }
        if (i != 4) {
            return CallableMemberDescriptor.Kind.DECLARATION;
        }
        return CallableMemberDescriptor.Kind.SYNTHESIZED;
    }
}
