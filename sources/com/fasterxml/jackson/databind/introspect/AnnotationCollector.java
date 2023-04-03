package com.fasterxml.jackson.databind.introspect;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public abstract class AnnotationCollector {

    /* renamed from: b */
    public static final C2236em f9981b = new NoAnnotations();

    /* renamed from: a */
    public final Object f9982a;

    public static class NoAnnotations implements C2236em, Serializable {
        private static final long serialVersionUID = 1;

        public <A extends Annotation> A get(Class<A> cls) {
            return null;
        }

        public boolean has(Class<?> cls) {
            return false;
        }

        public boolean hasOneOf(Class<? extends Annotation>[] clsArr) {
            return false;
        }

        public int size() {
            return 0;
        }
    }

    public static class OneAnnotation implements C2236em, Serializable {
        private static final long serialVersionUID = 1;
        private final Class<?> _type;
        private final Annotation _value;

        public OneAnnotation(Class<?> cls, Annotation annotation) {
            this._type = cls;
            this._value = annotation;
        }

        public <A extends Annotation> A get(Class<A> cls) {
            if (this._type == cls) {
                return this._value;
            }
            return null;
        }

        public boolean has(Class<?> cls) {
            if (this._type == cls) {
                return true;
            }
            return false;
        }

        public boolean hasOneOf(Class<? extends Annotation>[] clsArr) {
            for (Class<?> cls : clsArr) {
                if (cls == this._type) {
                    return true;
                }
            }
            return false;
        }

        public int size() {
            return 1;
        }
    }

    public static class TwoAnnotations implements C2236em, Serializable {
        private static final long serialVersionUID = 1;
        private final Class<?> _type1;
        private final Class<?> _type2;
        private final Annotation _value1;
        private final Annotation _value2;

        public TwoAnnotations(Class<?> cls, Annotation annotation, Class<?> cls2, Annotation annotation2) {
            this._type1 = cls;
            this._value1 = annotation;
            this._type2 = cls2;
            this._value2 = annotation2;
        }

        public <A extends Annotation> A get(Class<A> cls) {
            if (this._type1 == cls) {
                return this._value1;
            }
            if (this._type2 == cls) {
                return this._value2;
            }
            return null;
        }

        public boolean has(Class<?> cls) {
            if (this._type1 == cls || this._type2 == cls) {
                return true;
            }
            return false;
        }

        public boolean hasOneOf(Class<? extends Annotation>[] clsArr) {
            for (Class<?> cls : clsArr) {
                if (cls == this._type1 || cls == this._type2) {
                    return true;
                }
            }
            return false;
        }

        public int size() {
            return 2;
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.introspect.AnnotationCollector$a */
    public static class C2012a extends AnnotationCollector {

        /* renamed from: c */
        public static final C2012a f9983c = new C2012a((Object) null);

        public C2012a(Object obj) {
            super(obj);
        }

        /* renamed from: a */
        public AnnotationCollector mo15947a(Annotation annotation) {
            return new C2014c(this.f9982a, annotation.annotationType(), annotation);
        }

        /* renamed from: b */
        public C3742zl mo15948b() {
            return new C3742zl();
        }

        /* renamed from: c */
        public C2236em mo15949c() {
            return AnnotationCollector.f9981b;
        }

        /* renamed from: f */
        public boolean mo15950f(Annotation annotation) {
            return false;
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.introspect.AnnotationCollector$b */
    public static class C2013b extends AnnotationCollector {

        /* renamed from: c */
        public final HashMap<Class<?>, Annotation> f9984c;

        public C2013b(Object obj, Class<?> cls, Annotation annotation, Class<?> cls2, Annotation annotation2) {
            super(obj);
            HashMap<Class<?>, Annotation> hashMap = new HashMap<>();
            this.f9984c = hashMap;
            hashMap.put(cls, annotation);
            hashMap.put(cls2, annotation2);
        }

        /* renamed from: a */
        public AnnotationCollector mo15947a(Annotation annotation) {
            this.f9984c.put(annotation.annotationType(), annotation);
            return this;
        }

        /* renamed from: b */
        public C3742zl mo15948b() {
            C3742zl zlVar = new C3742zl();
            for (Annotation b : this.f9984c.values()) {
                zlVar.mo28520b(b);
            }
            return zlVar;
        }

        /* renamed from: c */
        public C2236em mo15949c() {
            if (this.f9984c.size() != 2) {
                return new C3742zl(this.f9984c);
            }
            Iterator<Map.Entry<Class<?>, Annotation>> it = this.f9984c.entrySet().iterator();
            Map.Entry next = it.next();
            Map.Entry next2 = it.next();
            return new TwoAnnotations((Class) next.getKey(), (Annotation) next.getValue(), (Class) next2.getKey(), (Annotation) next2.getValue());
        }

        /* renamed from: f */
        public boolean mo15950f(Annotation annotation) {
            return this.f9984c.containsKey(annotation.annotationType());
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.introspect.AnnotationCollector$c */
    public static class C2014c extends AnnotationCollector {

        /* renamed from: c */
        public Class<?> f9985c;

        /* renamed from: d */
        public Annotation f9986d;

        public C2014c(Object obj, Class<?> cls, Annotation annotation) {
            super(obj);
            this.f9985c = cls;
            this.f9986d = annotation;
        }

        /* renamed from: a */
        public AnnotationCollector mo15947a(Annotation annotation) {
            Class<? extends Annotation> annotationType = annotation.annotationType();
            Class<?> cls = this.f9985c;
            if (cls != annotationType) {
                return new C2013b(this.f9982a, cls, this.f9986d, annotationType, annotation);
            }
            this.f9986d = annotation;
            return this;
        }

        /* renamed from: b */
        public C3742zl mo15948b() {
            return C3742zl.m31357e(this.f9985c, this.f9986d);
        }

        /* renamed from: c */
        public C2236em mo15949c() {
            return new OneAnnotation(this.f9985c, this.f9986d);
        }

        /* renamed from: f */
        public boolean mo15950f(Annotation annotation) {
            if (annotation.annotationType() == this.f9985c) {
                return true;
            }
            return false;
        }
    }

    public AnnotationCollector(Object obj) {
        this.f9982a = obj;
    }

    /* renamed from: d */
    public static C2236em m14133d() {
        return f9981b;
    }

    /* renamed from: e */
    public static AnnotationCollector m14134e() {
        return C2012a.f9983c;
    }

    /* renamed from: a */
    public abstract AnnotationCollector mo15947a(Annotation annotation);

    /* renamed from: b */
    public abstract C3742zl mo15948b();

    /* renamed from: c */
    public abstract C2236em mo15949c();

    /* renamed from: f */
    public abstract boolean mo15950f(Annotation annotation);
}
