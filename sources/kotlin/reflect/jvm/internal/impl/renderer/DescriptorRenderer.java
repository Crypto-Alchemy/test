package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.builtins.C7389b;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget;

/* compiled from: DescriptorRenderer.kt */
public abstract class DescriptorRenderer {

    /* renamed from: a */
    public static final C7638a f39986a;

    /* renamed from: b */
    public static final DescriptorRenderer f39987b;

    /* renamed from: c */
    public static final DescriptorRenderer f39988c;

    /* renamed from: d */
    public static final DescriptorRenderer f39989d;

    /* renamed from: e */
    public static final DescriptorRenderer f39990e;

    /* renamed from: f */
    public static final DescriptorRenderer f39991f;

    /* renamed from: g */
    public static final DescriptorRenderer f39992g;

    /* renamed from: h */
    public static final DescriptorRenderer f39993h;

    /* renamed from: i */
    public static final DescriptorRenderer f39994i;

    /* renamed from: j */
    public static final DescriptorRenderer f39995j;

    /* renamed from: k */
    public static final DescriptorRenderer f39996k;

    /* renamed from: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$a */
    /* compiled from: DescriptorRenderer.kt */
    public static final class C7638a {

        /* renamed from: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$a$a */
        /* compiled from: DescriptorRenderer.kt */
        public /* synthetic */ class C7639a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f39997a;

            static {
                int[] iArr = new int[ClassKind.values().length];
                iArr[ClassKind.CLASS.ordinal()] = 1;
                iArr[ClassKind.INTERFACE.ordinal()] = 2;
                iArr[ClassKind.ENUM_CLASS.ordinal()] = 3;
                iArr[ClassKind.OBJECT.ordinal()] = 4;
                iArr[ClassKind.ANNOTATION_CLASS.ordinal()] = 5;
                iArr[ClassKind.ENUM_ENTRY.ordinal()] = 6;
                f39997a = iArr;
            }
        }

        public C7638a() {
        }

        public /* synthetic */ C7638a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final String mo54818a(fg0 fg0) {
            vx2.m53591g(fg0, "classifier");
            if (fg0 instanceof hz6) {
                return "typealias";
            }
            if (fg0 instanceof if0) {
                if0 if0 = (if0) fg0;
                if (if0.mo52345V()) {
                    return "companion object";
                }
                switch (C7639a.f39997a[if0.getKind().ordinal()]) {
                    case 1:
                        return "class";
                    case 2:
                        return "interface";
                    case 3:
                        return "enum class";
                    case 4:
                        return "object";
                    case 5:
                        return "annotation class";
                    case 6:
                        return "enum entry";
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            } else {
                throw new AssertionError("Unexpected classifier: " + fg0);
            }
        }

        /* renamed from: b */
        public final DescriptorRenderer mo54819b(rc2<? super zc1, r37> rc2) {
            vx2.m53591g(rc2, "changeOptions");
            DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = new DescriptorRendererOptionsImpl();
            rc2.invoke(descriptorRendererOptionsImpl);
            descriptorRendererOptionsImpl.mo55024l0();
            return new DescriptorRendererImpl(descriptorRendererOptionsImpl);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$b */
    /* compiled from: DescriptorRenderer.kt */
    public interface C7640b {

        /* renamed from: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$b$a */
        /* compiled from: DescriptorRenderer.kt */
        public static final class C7641a implements C7640b {

            /* renamed from: a */
            public static final C7641a f39998a = new C7641a();

            /* renamed from: a */
            public void mo54820a(n87 n87, int i, int i2, StringBuilder sb) {
                vx2.m53591g(n87, "parameter");
                vx2.m53591g(sb, "builder");
                if (i != i2 - 1) {
                    sb.append(", ");
                }
            }

            /* renamed from: b */
            public void mo54821b(int i, StringBuilder sb) {
                vx2.m53591g(sb, "builder");
                sb.append("(");
            }

            /* renamed from: c */
            public void mo54822c(int i, StringBuilder sb) {
                vx2.m53591g(sb, "builder");
                sb.append(")");
            }

            /* renamed from: d */
            public void mo54823d(n87 n87, int i, int i2, StringBuilder sb) {
                vx2.m53591g(n87, "parameter");
                vx2.m53591g(sb, "builder");
            }
        }

        /* renamed from: a */
        void mo54820a(n87 n87, int i, int i2, StringBuilder sb);

        /* renamed from: b */
        void mo54821b(int i, StringBuilder sb);

        /* renamed from: c */
        void mo54822c(int i, StringBuilder sb);

        /* renamed from: d */
        void mo54823d(n87 n87, int i, int i2, StringBuilder sb);
    }

    static {
        C7638a aVar = new C7638a((DefaultConstructorMarker) null);
        f39986a = aVar;
        f39987b = aVar.mo54819b(DescriptorRenderer$Companion$COMPACT_WITH_MODIFIERS$1.INSTANCE);
        f39988c = aVar.mo54819b(DescriptorRenderer$Companion$COMPACT$1.INSTANCE);
        f39989d = aVar.mo54819b(DescriptorRenderer$Companion$COMPACT_WITHOUT_SUPERTYPES$1.INSTANCE);
        f39990e = aVar.mo54819b(DescriptorRenderer$Companion$COMPACT_WITH_SHORT_TYPES$1.INSTANCE);
        f39991f = aVar.mo54819b(DescriptorRenderer$Companion$ONLY_NAMES_WITH_SHORT_TYPES$1.INSTANCE);
        f39992g = aVar.mo54819b(DescriptorRenderer$Companion$FQ_NAMES_IN_TYPES$1.INSTANCE);
        f39993h = aVar.mo54819b(C7642xb65db377.INSTANCE);
        f39994i = aVar.mo54819b(DescriptorRenderer$Companion$SHORT_NAMES_IN_TYPES$1.INSTANCE);
        f39995j = aVar.mo54819b(DescriptorRenderer$Companion$DEBUG_TEXT$1.INSTANCE);
        f39996k = aVar.mo54819b(DescriptorRenderer$Companion$HTML$1.INSTANCE);
    }

    /* renamed from: s */
    public static /* synthetic */ String m62073s(DescriptorRenderer descriptorRenderer, C9460vl vlVar, AnnotationUseSiteTarget annotationUseSiteTarget, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                annotationUseSiteTarget = null;
            }
            return descriptorRenderer.mo54811r(vlVar, annotationUseSiteTarget);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: renderAnnotation");
    }

    /* renamed from: q */
    public abstract String mo54810q(d31 d31);

    /* renamed from: r */
    public abstract String mo54811r(C9460vl vlVar, AnnotationUseSiteTarget annotationUseSiteTarget);

    /* renamed from: t */
    public abstract String mo54812t(String str, String str2, C7389b bVar);

    /* renamed from: u */
    public abstract String mo54813u(v82 v82);

    /* renamed from: v */
    public abstract String mo54814v(r24 r24, boolean z);

    /* renamed from: w */
    public abstract String mo54815w(xc3 xc3);

    /* renamed from: x */
    public abstract String mo54816x(f17 f17);

    /* renamed from: y */
    public final DescriptorRenderer mo54817y(rc2<? super zc1, r37> rc2) {
        vx2.m53591g(rc2, "changeOptions");
        vx2.m53589e(this, "null cannot be cast to non-null type org.jetbrains.kotlin.renderer.DescriptorRendererImpl");
        DescriptorRendererOptionsImpl q = ((DescriptorRendererImpl) this).mo54921h0().mo55026q();
        rc2.invoke(q);
        q.mo55024l0();
        return new DescriptorRendererImpl(q);
    }
}
