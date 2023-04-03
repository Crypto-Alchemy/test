package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.C6177b;
import kotlin.reflect.jvm.internal.impl.builtins.C7395c;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinRetention;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget;

/* compiled from: JavaAnnotationMapper.kt */
public final class JavaAnnotationTargetMapper {

    /* renamed from: a */
    public static final JavaAnnotationTargetMapper f39435a = new JavaAnnotationTargetMapper();

    /* renamed from: b */
    public static final Map<String, EnumSet<KotlinTarget>> f39436b = C6177b.m47364l(wy6.m54142a("PACKAGE", EnumSet.noneOf(KotlinTarget.class)), wy6.m54142a("TYPE", EnumSet.of(KotlinTarget.CLASS, KotlinTarget.FILE)), wy6.m54142a("ANNOTATION_TYPE", EnumSet.of(KotlinTarget.ANNOTATION_CLASS)), wy6.m54142a("TYPE_PARAMETER", EnumSet.of(KotlinTarget.TYPE_PARAMETER)), wy6.m54142a("FIELD", EnumSet.of(KotlinTarget.FIELD)), wy6.m54142a("LOCAL_VARIABLE", EnumSet.of(KotlinTarget.LOCAL_VARIABLE)), wy6.m54142a("PARAMETER", EnumSet.of(KotlinTarget.VALUE_PARAMETER)), wy6.m54142a("CONSTRUCTOR", EnumSet.of(KotlinTarget.CONSTRUCTOR)), wy6.m54142a("METHOD", EnumSet.of(KotlinTarget.FUNCTION, KotlinTarget.PROPERTY_GETTER, KotlinTarget.PROPERTY_SETTER)), wy6.m54142a("TYPE_USE", EnumSet.of(KotlinTarget.TYPE)));

    /* renamed from: c */
    public static final Map<String, KotlinRetention> f39437c = C6177b.m47364l(wy6.m54142a("RUNTIME", KotlinRetention.RUNTIME), wy6.m54142a("CLASS", KotlinRetention.BINARY), wy6.m54142a("SOURCE", KotlinRetention.SOURCE));

    /* renamed from: a */
    public final fq0<?> mo53480a(i03 i03) {
        e13 e13;
        String str;
        if (i03 instanceof e13) {
            e13 = (e13) i03;
        } else {
            e13 = null;
        }
        if (e13 == null) {
            return null;
        }
        Map<String, KotlinRetention> map = f39437c;
        r24 e = e13.mo50549e();
        if (e != null) {
            str = e.mo65594d();
        } else {
            str = null;
        }
        KotlinRetention kotlinRetention = map.get(str);
        if (kotlinRetention == null) {
            return null;
        }
        nf0 m = nf0.m69751m(C7395c.C7396a.f39140K);
        vx2.m53590f(m, "topLevel(StandardNames.F…ames.annotationRetention)");
        r24 h = r24.m71445h(kotlinRetention.name());
        vx2.m53590f(h, "identifier(retention.name)");
        return new zq1(m, h);
    }

    /* renamed from: b */
    public final Set<KotlinTarget> mo53481b(String str) {
        EnumSet enumSet = f39436b.get(str);
        if (enumSet != null) {
            return enumSet;
        }
        return ny5.m49095e();
    }

    /* renamed from: c */
    public final fq0<?> mo53482c(List<? extends i03> list) {
        String str;
        vx2.m53591g(list, "arguments");
        ArrayList<e13> arrayList = new ArrayList<>();
        for (T next : list) {
            if (next instanceof e13) {
                arrayList.add(next);
            }
        }
        ArrayList<KotlinTarget> arrayList2 = new ArrayList<>();
        for (e13 e : arrayList) {
            JavaAnnotationTargetMapper javaAnnotationTargetMapper = f39435a;
            r24 e2 = e.mo50549e();
            if (e2 != null) {
                str = e2.mo65594d();
            } else {
                str = null;
            }
            hk0.m45275z(arrayList2, javaAnnotationTargetMapper.mo53481b(str));
        }
        ArrayList arrayList3 = new ArrayList(dk0.m43495u(arrayList2, 10));
        for (KotlinTarget name : arrayList2) {
            nf0 m = nf0.m69751m(C7395c.C7396a.f39138J);
            vx2.m53590f(m, "topLevel(StandardNames.FqNames.annotationTarget)");
            r24 h = r24.m71445h(name.name());
            vx2.m53590f(h, "identifier(kotlinTarget.name)");
            arrayList3.add(new zq1(m, h));
        }
        return new C9313sq(arrayList3, JavaAnnotationTargetMapper$mapJavaTargetArguments$1.INSTANCE);
    }
}
