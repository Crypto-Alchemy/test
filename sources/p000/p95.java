package p000;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;

/* renamed from: p95 */
/* compiled from: ReflectJavaAnnotationArguments.kt */
public abstract class p95 implements i03 {

    /* renamed from: b */
    public static final C9173a f44016b = new C9173a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final r24 f44017a;

    /* renamed from: p95$a */
    /* compiled from: ReflectJavaAnnotationArguments.kt */
    public static final class C9173a {
        public C9173a() {
        }

        public /* synthetic */ C9173a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final p95 mo65260a(Object obj, r24 r24) {
            vx2.m53591g(obj, "value");
            if (ReflectClassUtilKt.m60600h(obj.getClass())) {
                return new ba5(r24, (Enum) obj);
            }
            if (obj instanceof Annotation) {
                return new q95(r24, (Annotation) obj);
            }
            if (obj instanceof Object[]) {
                return new t95(r24, (Object[]) obj);
            }
            if (obj instanceof Class) {
                return new x95(r24, (Class) obj);
            }
            return new da5(r24, obj);
        }
    }

    public p95(r24 r24) {
        this.f44017a = r24;
    }

    public /* synthetic */ p95(r24 r24, DefaultConstructorMarker defaultConstructorMarker) {
        this(r24);
    }

    public r24 getName() {
        return this.f44017a;
    }
}
