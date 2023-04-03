package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import kotlin.collections.C6177b;
import kotlin.reflect.jvm.internal.impl.builtins.C7389b;
import kotlin.reflect.jvm.internal.impl.builtins.C7395c;

/* compiled from: annotationUtil.kt */
public final class AnnotationUtilKt {

    /* renamed from: a */
    public static final r24 f39261a;

    /* renamed from: b */
    public static final r24 f39262b;

    /* renamed from: c */
    public static final r24 f39263c;

    /* renamed from: d */
    public static final r24 f39264d;

    /* renamed from: e */
    public static final r24 f39265e;

    static {
        r24 h = r24.m71445h(ThrowableDeserializer.PROP_NAME_MESSAGE);
        vx2.m53590f(h, "identifier(\"message\")");
        f39261a = h;
        r24 h2 = r24.m71445h("replaceWith");
        vx2.m53590f(h2, "identifier(\"replaceWith\")");
        f39262b = h2;
        r24 h3 = r24.m71445h("level");
        vx2.m53590f(h3, "identifier(\"level\")");
        f39263c = h3;
        r24 h4 = r24.m71445h("expression");
        vx2.m53590f(h4, "identifier(\"expression\")");
        f39264d = h4;
        r24 h5 = r24.m71445h("imports");
        vx2.m53590f(h5, "identifier(\"imports\")");
        f39265e = h5;
    }

    /* renamed from: a */
    public static final C9460vl m60332a(C7389b bVar, String str, String str2, String str3) {
        vx2.m53591g(bVar, "<this>");
        vx2.m53591g(str, ThrowableDeserializer.PROP_NAME_MESSAGE);
        vx2.m53591g(str2, "replaceWith");
        vx2.m53591g(str3, "level");
        BuiltInAnnotationDescriptor builtInAnnotationDescriptor = new BuiltInAnnotationDescriptor(bVar, C7395c.C7396a.f39122B, C6177b.m47364l(wy6.m54142a(f39264d, new lb6(str2)), wy6.m54142a(f39265e, new C9313sq(ck0.m33062j(), new C7422xf14e0c1a(bVar)))));
        u82 u82 = C7395c.C7396a.f39204y;
        r24 r24 = f39263c;
        nf0 m = nf0.m69751m(C7395c.C7396a.f39120A);
        vx2.m53590f(m, "topLevel(StandardNames.FqNames.deprecationLevel)");
        r24 h = r24.m71445h(str3);
        vx2.m53590f(h, "identifier(level)");
        return new BuiltInAnnotationDescriptor(bVar, u82, C6177b.m47364l(wy6.m54142a(f39261a, new lb6(str)), wy6.m54142a(f39262b, new C6948cm(builtInAnnotationDescriptor)), wy6.m54142a(r24, new zq1(m, h))));
    }

    /* renamed from: b */
    public static /* synthetic */ C9460vl m60333b(C7389b bVar, String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = "WARNING";
        }
        return m60332a(bVar, str, str2, str3);
    }
}
