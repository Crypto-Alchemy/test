package p000;

import com.squareup.moshi.C5391d;
import com.squareup.moshi.C5401h;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import p000.pt0;

/* renamed from: ey3 */
/* compiled from: MoshiConverterFactory */
public final class ey3 extends pt0.C9195a {

    /* renamed from: a */
    public final C5401h f37682a;

    /* renamed from: b */
    public final boolean f37683b;

    /* renamed from: c */
    public final boolean f37684c;

    /* renamed from: d */
    public final boolean f37685d;

    public ey3(C5401h hVar, boolean z, boolean z2, boolean z3) {
        this.f37682a = hVar;
        this.f37683b = z;
        this.f37684c = z2;
        this.f37685d = z3;
    }

    /* renamed from: f */
    public static ey3 m57495f() {
        return m57496g(new C5401h.C5402a().mo39416c());
    }

    /* renamed from: g */
    public static ey3 m57496g(C5401h hVar) {
        if (hVar != null) {
            return new ey3(hVar, false, false, false);
        }
        throw new NullPointerException("moshi == null");
    }

    /* renamed from: h */
    public static Set<? extends Annotation> m57497h(Annotation[] annotationArr) {
        LinkedHashSet linkedHashSet = null;
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().isAnnotationPresent(r53.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        if (linkedHashSet != null) {
            return Collections.unmodifiableSet(linkedHashSet);
        }
        return Collections.emptySet();
    }

    /* renamed from: c */
    public pt0<?, RequestBody> mo51276c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, og5 og5) {
        C5391d<T> e = this.f37682a.mo39410e(type, m57497h(annotationArr));
        if (this.f37683b) {
            e = e.mo39364e();
        }
        if (this.f37684c) {
            e = e.mo39361a();
        }
        if (this.f37685d) {
            e = e.mo39366g();
        }
        return new gy3(e);
    }

    /* renamed from: d */
    public pt0<ResponseBody, ?> mo51277d(Type type, Annotation[] annotationArr, og5 og5) {
        C5391d<T> e = this.f37682a.mo39410e(type, m57497h(annotationArr));
        if (this.f37683b) {
            e = e.mo39364e();
        }
        if (this.f37684c) {
            e = e.mo39361a();
        }
        if (this.f37685d) {
            e = e.mo39366g();
        }
        return new hy3(e);
    }
}
