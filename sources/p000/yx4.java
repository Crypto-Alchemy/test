package p000;

import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Modality;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* renamed from: yx4 */
/* compiled from: ProtoEnumFlags.kt */
public final class yx4 {

    /* renamed from: a */
    public static final yx4 f46285a = new yx4();

    /* renamed from: yx4$a */
    /* compiled from: ProtoEnumFlags.kt */
    public /* synthetic */ class C9652a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f46286a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f46287b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f46288c;

        /* renamed from: d */
        public static final /* synthetic */ int[] f46289d;

        /* renamed from: e */
        public static final /* synthetic */ int[] f46290e;

        /* renamed from: f */
        public static final /* synthetic */ int[] f46291f;

        /* renamed from: g */
        public static final /* synthetic */ int[] f46292g;

        /* renamed from: h */
        public static final /* synthetic */ int[] f46293h;

        static {
            int[] iArr = new int[ProtoBuf$Modality.values().length];
            iArr[ProtoBuf$Modality.FINAL.ordinal()] = 1;
            iArr[ProtoBuf$Modality.OPEN.ordinal()] = 2;
            iArr[ProtoBuf$Modality.ABSTRACT.ordinal()] = 3;
            iArr[ProtoBuf$Modality.SEALED.ordinal()] = 4;
            f46286a = iArr;
            int[] iArr2 = new int[Modality.values().length];
            iArr2[Modality.FINAL.ordinal()] = 1;
            iArr2[Modality.OPEN.ordinal()] = 2;
            iArr2[Modality.ABSTRACT.ordinal()] = 3;
            iArr2[Modality.SEALED.ordinal()] = 4;
            f46287b = iArr2;
            int[] iArr3 = new int[ProtoBuf$Visibility.values().length];
            iArr3[ProtoBuf$Visibility.INTERNAL.ordinal()] = 1;
            iArr3[ProtoBuf$Visibility.PRIVATE.ordinal()] = 2;
            iArr3[ProtoBuf$Visibility.PRIVATE_TO_THIS.ordinal()] = 3;
            iArr3[ProtoBuf$Visibility.PROTECTED.ordinal()] = 4;
            iArr3[ProtoBuf$Visibility.PUBLIC.ordinal()] = 5;
            iArr3[ProtoBuf$Visibility.LOCAL.ordinal()] = 6;
            f46288c = iArr3;
            int[] iArr4 = new int[ProtoBuf$Class.Kind.values().length];
            iArr4[ProtoBuf$Class.Kind.CLASS.ordinal()] = 1;
            iArr4[ProtoBuf$Class.Kind.INTERFACE.ordinal()] = 2;
            iArr4[ProtoBuf$Class.Kind.ENUM_CLASS.ordinal()] = 3;
            iArr4[ProtoBuf$Class.Kind.ENUM_ENTRY.ordinal()] = 4;
            iArr4[ProtoBuf$Class.Kind.ANNOTATION_CLASS.ordinal()] = 5;
            iArr4[ProtoBuf$Class.Kind.OBJECT.ordinal()] = 6;
            iArr4[ProtoBuf$Class.Kind.COMPANION_OBJECT.ordinal()] = 7;
            f46289d = iArr4;
            int[] iArr5 = new int[ClassKind.values().length];
            iArr5[ClassKind.CLASS.ordinal()] = 1;
            iArr5[ClassKind.INTERFACE.ordinal()] = 2;
            iArr5[ClassKind.ENUM_CLASS.ordinal()] = 3;
            iArr5[ClassKind.ENUM_ENTRY.ordinal()] = 4;
            iArr5[ClassKind.ANNOTATION_CLASS.ordinal()] = 5;
            iArr5[ClassKind.OBJECT.ordinal()] = 6;
            f46290e = iArr5;
            int[] iArr6 = new int[ProtoBuf$TypeParameter.Variance.values().length];
            iArr6[ProtoBuf$TypeParameter.Variance.IN.ordinal()] = 1;
            iArr6[ProtoBuf$TypeParameter.Variance.OUT.ordinal()] = 2;
            iArr6[ProtoBuf$TypeParameter.Variance.INV.ordinal()] = 3;
            f46291f = iArr6;
            int[] iArr7 = new int[ProtoBuf$Type.Argument.Projection.values().length];
            iArr7[ProtoBuf$Type.Argument.Projection.IN.ordinal()] = 1;
            iArr7[ProtoBuf$Type.Argument.Projection.OUT.ordinal()] = 2;
            iArr7[ProtoBuf$Type.Argument.Projection.INV.ordinal()] = 3;
            iArr7[ProtoBuf$Type.Argument.Projection.STAR.ordinal()] = 4;
            f46292g = iArr7;
            int[] iArr8 = new int[Variance.values().length];
            iArr8[Variance.IN_VARIANCE.ordinal()] = 1;
            iArr8[Variance.OUT_VARIANCE.ordinal()] = 2;
            iArr8[Variance.INVARIANT.ordinal()] = 3;
            f46293h = iArr8;
        }
    }

    /* renamed from: a */
    public final ClassKind mo67185a(ProtoBuf$Class.Kind kind) {
        int i;
        if (kind == null) {
            i = -1;
        } else {
            i = C9652a.f46289d[kind.ordinal()];
        }
        switch (i) {
            case 1:
                return ClassKind.CLASS;
            case 2:
                return ClassKind.INTERFACE;
            case 3:
                return ClassKind.ENUM_CLASS;
            case 4:
                return ClassKind.ENUM_ENTRY;
            case 5:
                return ClassKind.ANNOTATION_CLASS;
            case 6:
            case 7:
                return ClassKind.OBJECT;
            default:
                return ClassKind.CLASS;
        }
    }

    /* renamed from: b */
    public final Modality mo67186b(ProtoBuf$Modality protoBuf$Modality) {
        int i;
        if (protoBuf$Modality == null) {
            i = -1;
        } else {
            i = C9652a.f46286a[protoBuf$Modality.ordinal()];
        }
        if (i == 1) {
            return Modality.FINAL;
        }
        if (i == 2) {
            return Modality.OPEN;
        }
        if (i == 3) {
            return Modality.ABSTRACT;
        }
        if (i != 4) {
            return Modality.FINAL;
        }
        return Modality.SEALED;
    }

    /* renamed from: c */
    public final Variance mo67187c(ProtoBuf$Type.Argument.Projection projection) {
        vx2.m53591g(projection, "projection");
        int i = C9652a.f46292g[projection.ordinal()];
        if (i == 1) {
            return Variance.IN_VARIANCE;
        }
        if (i == 2) {
            return Variance.OUT_VARIANCE;
        }
        if (i == 3) {
            return Variance.INVARIANT;
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalArgumentException("Only IN, OUT and INV are supported. Actual argument: " + projection);
    }

    /* renamed from: d */
    public final Variance mo67188d(ProtoBuf$TypeParameter.Variance variance) {
        vx2.m53591g(variance, "variance");
        int i = C9652a.f46291f[variance.ordinal()];
        if (i == 1) {
            return Variance.IN_VARIANCE;
        }
        if (i == 2) {
            return Variance.OUT_VARIANCE;
        }
        if (i == 3) {
            return Variance.INVARIANT;
        }
        throw new NoWhenBranchMatchedException();
    }
}
