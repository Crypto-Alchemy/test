package p000;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: q95 */
/* compiled from: ReflectJavaAnnotationArguments.kt */
public final class q95 extends p95 implements j03 {

    /* renamed from: c */
    public final Annotation f44158c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q95(r24 r24, Annotation annotation) {
        super(r24, (DefaultConstructorMarker) null);
        vx2.m53591g(annotation, "annotation");
        this.f44158c = annotation;
    }

    /* renamed from: a */
    public h03 mo52571a() {
        return new o95(this.f44158c);
    }
}
