package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.introspect.AnnotationCollector;
import com.fasterxml.jackson.databind.introspect.C2029f;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;

/* renamed from: com.fasterxml.jackson.databind.introspect.a */
/* compiled from: AnnotatedClass */
public final class C2021a extends C2911nl implements C2033i {

    /* renamed from: L */
    public static final C2022a f10005L = new C2022a((AnnotatedConstructor) null, Collections.emptyList(), Collections.emptyList());

    /* renamed from: A */
    public final C2236em f10006A;

    /* renamed from: B */
    public C2022a f10007B;

    /* renamed from: C */
    public C3153ql f10008C;

    /* renamed from: H */
    public List<AnnotatedField> f10009H;

    /* renamed from: I */
    public transient Boolean f10010I;

    /* renamed from: a */
    public final JavaType f10011a;

    /* renamed from: d */
    public final Class<?> f10012d;

    /* renamed from: e */
    public final TypeBindings f10013e;

    /* renamed from: g */
    public final List<JavaType> f10014g;

    /* renamed from: k */
    public final AnnotationIntrospector f10015k;

    /* renamed from: r */
    public final TypeFactory f10016r;

    /* renamed from: s */
    public final C2029f.C2030a f10017s;

    /* renamed from: x */
    public final Class<?> f10018x;

    /* renamed from: y */
    public final boolean f10019y;

    /* renamed from: com.fasterxml.jackson.databind.introspect.a$a */
    /* compiled from: AnnotatedClass */
    public static final class C2022a {

        /* renamed from: a */
        public final AnnotatedConstructor f10020a;

        /* renamed from: b */
        public final List<AnnotatedConstructor> f10021b;

        /* renamed from: c */
        public final List<AnnotatedMethod> f10022c;

        public C2022a(AnnotatedConstructor annotatedConstructor, List<AnnotatedConstructor> list, List<AnnotatedMethod> list2) {
            this.f10020a = annotatedConstructor;
            this.f10021b = list;
            this.f10022c = list2;
        }
    }

    public C2021a(JavaType javaType, Class<?> cls, List<JavaType> list, Class<?> cls2, C2236em emVar, TypeBindings typeBindings, AnnotationIntrospector annotationIntrospector, C2029f.C2030a aVar, TypeFactory typeFactory, boolean z) {
        this.f10011a = javaType;
        this.f10012d = cls;
        this.f10014g = list;
        this.f10018x = cls2;
        this.f10006A = emVar;
        this.f10013e = typeBindings;
        this.f10015k = annotationIntrospector;
        this.f10017s = aVar;
        this.f10016r = typeFactory;
        this.f10019y = z;
    }

    /* renamed from: a */
    public JavaType mo16038a(Type type) {
        return this.f10016r.resolveMemberType(type, this.f10013e);
    }

    @Deprecated
    public Iterable<Annotation> annotations() {
        C2236em emVar = this.f10006A;
        if (emVar instanceof C3742zl) {
            return ((C3742zl) emVar).mo28521c();
        }
        if (!(emVar instanceof AnnotationCollector.OneAnnotation) && !(emVar instanceof AnnotationCollector.TwoAnnotations)) {
            return Collections.emptyList();
        }
        throw new UnsupportedOperationException("please use getAnnotations/ hasAnnotation to check for Annotations");
    }

    /* renamed from: b */
    public final C2022a mo16039b() {
        C2022a aVar = this.f10007B;
        if (aVar == null) {
            JavaType javaType = this.f10011a;
            if (javaType == null) {
                aVar = f10005L;
            } else {
                aVar = C2024c.m14201p(this.f10015k, this.f10016r, this, javaType, this.f10018x, this.f10019y);
            }
            this.f10007B = aVar;
        }
        return aVar;
    }

    /* renamed from: c */
    public final List<AnnotatedField> mo16040c() {
        List<AnnotatedField> list = this.f10009H;
        if (list == null) {
            JavaType javaType = this.f10011a;
            if (javaType == null) {
                list = Collections.emptyList();
            } else {
                list = C2025d.m14212m(this.f10015k, this, this.f10017s, this.f10016r, javaType, this.f10019y);
            }
            this.f10009H = list;
        }
        return list;
    }

    /* renamed from: d */
    public final C3153ql mo16041d() {
        C3153ql qlVar = this.f10008C;
        if (qlVar == null) {
            JavaType javaType = this.f10011a;
            if (javaType == null) {
                qlVar = new C3153ql();
            } else {
                qlVar = C2027e.m14219m(this.f10015k, this, this.f10017s, this.f10016r, javaType, this.f10014g, this.f10018x, this.f10019y);
            }
            this.f10008C = qlVar;
        }
        return qlVar;
    }

    /* renamed from: e */
    public Iterable<AnnotatedField> mo16042e() {
        return mo16040c();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!wf0.m29481H(obj, C2021a.class)) {
            return false;
        }
        if (((C2021a) obj).f10012d == this.f10012d) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public AnnotatedMethod mo16043f(String str, Class<?>[] clsArr) {
        return mo16041d().mo25140e(str, clsArr);
    }

    /* renamed from: g */
    public Class<?> getAnnotated() {
        return this.f10012d;
    }

    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        return this.f10006A.get(cls);
    }

    public int getModifiers() {
        return this.f10012d.getModifiers();
    }

    public String getName() {
        return this.f10012d.getName();
    }

    public Class<?> getRawType() {
        return this.f10012d;
    }

    public JavaType getType() {
        return this.f10011a;
    }

    /* renamed from: h */
    public C2236em mo16045h() {
        return this.f10006A;
    }

    public boolean hasAnnotation(Class<?> cls) {
        return this.f10006A.has(cls);
    }

    public boolean hasOneOf(Class<? extends Annotation>[] clsArr) {
        return this.f10006A.hasOneOf(clsArr);
    }

    public int hashCode() {
        return this.f10012d.getName().hashCode();
    }

    /* renamed from: i */
    public List<AnnotatedConstructor> mo16046i() {
        return mo16039b().f10021b;
    }

    /* renamed from: j */
    public AnnotatedConstructor mo16047j() {
        return mo16039b().f10020a;
    }

    /* renamed from: k */
    public List<AnnotatedMethod> mo16048k() {
        return mo16039b().f10022c;
    }

    /* renamed from: l */
    public boolean mo16049l() {
        if (this.f10006A.size() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public boolean mo16050m() {
        Boolean bool = this.f10010I;
        if (bool == null) {
            bool = Boolean.valueOf(wf0.m29490Q(this.f10012d));
            this.f10010I = bool;
        }
        return bool.booleanValue();
    }

    /* renamed from: n */
    public Iterable<AnnotatedMethod> mo16051n() {
        return mo16041d();
    }

    public String toString() {
        return "[AnnotedClass " + this.f10012d.getName() + "]";
    }

    public C2021a(Class<?> cls) {
        this.f10011a = null;
        this.f10012d = cls;
        this.f10014g = Collections.emptyList();
        this.f10018x = null;
        this.f10006A = AnnotationCollector.m14133d();
        this.f10013e = TypeBindings.emptyBindings();
        this.f10015k = null;
        this.f10017s = null;
        this.f10016r = null;
        this.f10019y = false;
    }
}
