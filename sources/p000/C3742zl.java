package p000;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: zl */
/* compiled from: AnnotationMap */
public final class C3742zl implements C2236em {

    /* renamed from: a */
    public HashMap<Class<?>, Annotation> f20594a;

    public C3742zl() {
    }

    public C3742zl(HashMap<Class<?>, Annotation> hashMap) {
        this.f20594a = hashMap;
    }

    /* renamed from: d */
    public static C3742zl m31356d(C3742zl zlVar, C3742zl zlVar2) {
        HashMap<Class<?>, Annotation> hashMap;
        HashMap<Class<?>, Annotation> hashMap2;
        if (zlVar == null || (hashMap = zlVar.f20594a) == null || hashMap.isEmpty()) {
            return zlVar2;
        }
        if (zlVar2 == null || (hashMap2 = zlVar2.f20594a) == null || hashMap2.isEmpty()) {
            return zlVar;
        }
        HashMap hashMap3 = new HashMap();
        for (Annotation next : zlVar2.f20594a.values()) {
            hashMap3.put(next.annotationType(), next);
        }
        for (Annotation next2 : zlVar.f20594a.values()) {
            hashMap3.put(next2.annotationType(), next2);
        }
        return new C3742zl(hashMap3);
    }

    /* renamed from: e */
    public static C3742zl m31357e(Class<?> cls, Annotation annotation) {
        HashMap hashMap = new HashMap(4);
        hashMap.put(cls, annotation);
        return new C3742zl(hashMap);
    }

    /* renamed from: a */
    public final boolean mo28519a(Annotation annotation) {
        if (this.f20594a == null) {
            this.f20594a = new HashMap<>();
        }
        Annotation put = this.f20594a.put(annotation.annotationType(), annotation);
        if (put == null || !put.equals(annotation)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public boolean mo28520b(Annotation annotation) {
        return mo28519a(annotation);
    }

    /* renamed from: c */
    public Iterable<Annotation> mo28521c() {
        HashMap<Class<?>, Annotation> hashMap = this.f20594a;
        if (hashMap == null || hashMap.size() == 0) {
            return Collections.emptyList();
        }
        return this.f20594a.values();
    }

    public <A extends Annotation> A get(Class<A> cls) {
        HashMap<Class<?>, Annotation> hashMap = this.f20594a;
        if (hashMap == null) {
            return null;
        }
        return (Annotation) hashMap.get(cls);
    }

    public boolean has(Class<?> cls) {
        HashMap<Class<?>, Annotation> hashMap = this.f20594a;
        if (hashMap == null) {
            return false;
        }
        return hashMap.containsKey(cls);
    }

    public boolean hasOneOf(Class<? extends Annotation>[] clsArr) {
        if (this.f20594a != null) {
            for (Class<? extends Annotation> containsKey : clsArr) {
                if (this.f20594a.containsKey(containsKey)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int size() {
        HashMap<Class<?>, Annotation> hashMap = this.f20594a;
        if (hashMap == null) {
            return 0;
        }
        return hashMap.size();
    }

    public String toString() {
        HashMap<Class<?>, Annotation> hashMap = this.f20594a;
        if (hashMap == null) {
            return "[null]";
        }
        return hashMap.toString();
    }
}
