package p000;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;

/* renamed from: s95 */
/* compiled from: ReflectJavaAnnotationOwner.kt */
public final class s95 {
    /* renamed from: a */
    public static final o95 m71899a(Annotation[] annotationArr, u82 u82) {
        Annotation annotation;
        vx2.m53591g(annotationArr, "<this>");
        vx2.m53591g(u82, "fqName");
        int length = annotationArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                annotation = null;
                break;
            }
            annotation = annotationArr[i];
            if (vx2.m53586b(ReflectClassUtilKt.m60593a(x73.m54253b(x73.m54252a(annotation))).mo62673b(), u82)) {
                break;
            }
            i++;
        }
        if (annotation != null) {
            return new o95(annotation);
        }
        return null;
    }

    /* renamed from: b */
    public static final List<o95> m71900b(Annotation[] annotationArr) {
        vx2.m53591g(annotationArr, "<this>");
        ArrayList arrayList = new ArrayList(annotationArr.length);
        for (Annotation o95 : annotationArr) {
            arrayList.add(new o95(o95));
        }
        return arrayList;
    }
}
