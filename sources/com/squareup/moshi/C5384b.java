package com.squareup.moshi;

import com.squareup.moshi.C5391d;
import com.squareup.moshi.JsonReader;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: com.squareup.moshi.b */
/* compiled from: ClassJsonAdapter */
public final class C5384b<T> extends C5391d<T> {

    /* renamed from: d */
    public static final C5391d.C5395d f26698d = new C5385a();

    /* renamed from: a */
    public final mf0<T> f26699a;

    /* renamed from: b */
    public final C5386b<?>[] f26700b;

    /* renamed from: c */
    public final JsonReader.C5372b f26701c;

    /* renamed from: com.squareup.moshi.b$a */
    /* compiled from: ClassJsonAdapter */
    public class C5385a implements C5391d.C5395d {
        /* renamed from: a */
        public C5391d<?> mo39349a(Type type, Set<? extends Annotation> set, C5401h hVar) {
            if (!(type instanceof Class) && !(type instanceof ParameterizedType)) {
                return null;
            }
            Class<?> g = u27.m52591g(type);
            if (g.isInterface() || g.isEnum() || !set.isEmpty()) {
                return null;
            }
            if (t67.m52108i(g)) {
                mo39353d(type, List.class);
                mo39353d(type, Set.class);
                mo39353d(type, Map.class);
                mo39353d(type, Collection.class);
                String str = "Platform " + g;
                if (type instanceof ParameterizedType) {
                    str = str + " in " + type;
                }
                throw new IllegalArgumentException(str + " requires explicit JsonAdapter to be registered");
            } else if (g.isAnonymousClass()) {
                throw new IllegalArgumentException("Cannot serialize anonymous class " + g.getName());
            } else if (g.isLocalClass()) {
                throw new IllegalArgumentException("Cannot serialize local class " + g.getName());
            } else if (g.getEnclosingClass() != null && !Modifier.isStatic(g.getModifiers())) {
                throw new IllegalArgumentException("Cannot serialize non-static nested class " + g.getName());
            } else if (Modifier.isAbstract(g.getModifiers())) {
                throw new IllegalArgumentException("Cannot serialize abstract class " + g.getName());
            } else if (!t67.m52107h(g)) {
                mf0<?> a = mf0.m48270a(g);
                TreeMap treeMap = new TreeMap();
                while (type != Object.class) {
                    mo39351b(hVar, type, treeMap);
                    type = u27.m52590f(type);
                }
                return new C5384b(a, treeMap).mo39365f();
            } else {
                throw new IllegalArgumentException("Cannot serialize Kotlin type " + g.getName() + ". Reflective serialization of Kotlin classes without using kotlin-reflect has undefined and unexpected behavior. Please use KotlinJsonAdapterFactory from the moshi-kotlin artifact or use code gen from the moshi-kotlin-codegen artifact.");
            }
        }

        /* renamed from: b */
        public final void mo39351b(C5401h hVar, Type type, Map<String, C5386b<?>> map) {
            y33 y33;
            Class<?> g = u27.m52591g(type);
            boolean i = t67.m52108i(g);
            for (Field field : g.getDeclaredFields()) {
                if (mo39352c(i, field.getModifiers()) && ((y33 = (y33) field.getAnnotation(y33.class)) == null || !y33.ignore())) {
                    Type p = t67.m52115p(type, g, field.getGenericType());
                    Set<? extends Annotation> j = t67.m52109j(field);
                    String name = field.getName();
                    C5391d<T> f = hVar.mo39411f(p, j, name);
                    field.setAccessible(true);
                    String l = t67.m52111l(name, y33);
                    C5386b bVar = new C5386b(l, field, f);
                    C5386b put = map.put(l, bVar);
                    if (put != null) {
                        throw new IllegalArgumentException("Conflicting fields:\n    " + put.f26703b + "\n    " + bVar.f26703b);
                    }
                }
            }
        }

        /* renamed from: c */
        public final boolean mo39352c(boolean z, int i) {
            if (Modifier.isStatic(i) || Modifier.isTransient(i)) {
                return false;
            }
            if (Modifier.isPublic(i) || Modifier.isProtected(i) || !z) {
                return true;
            }
            return false;
        }

        /* renamed from: d */
        public final void mo39353d(Type type, Class<?> cls) {
            Class<?> g = u27.m52591g(type);
            if (cls.isAssignableFrom(g)) {
                throw new IllegalArgumentException("No JsonAdapter for " + type + ", you should probably use " + cls.getSimpleName() + " instead of " + g.getSimpleName() + " (Moshi only supports the collection interfaces by default) or else register a custom JsonAdapter.");
            }
        }
    }

    /* renamed from: com.squareup.moshi.b$b */
    /* compiled from: ClassJsonAdapter */
    public static class C5386b<T> {

        /* renamed from: a */
        public final String f26702a;

        /* renamed from: b */
        public final Field f26703b;

        /* renamed from: c */
        public final C5391d<T> f26704c;

        public C5386b(String str, Field field, C5391d<T> dVar) {
            this.f26702a = str;
            this.f26703b = field;
            this.f26704c = dVar;
        }

        /* renamed from: a */
        public void mo39354a(JsonReader jsonReader, Object obj) throws IOException, IllegalAccessException {
            this.f26703b.set(obj, this.f26704c.mo39346b(jsonReader));
        }

        /* renamed from: b */
        public void mo39355b(q73 q73, Object obj) throws IllegalAccessException, IOException {
            this.f26704c.mo39347j(q73, this.f26703b.get(obj));
        }
    }

    public C5384b(mf0<T> mf0, Map<String, C5386b<?>> map) {
        this.f26699a = mf0;
        this.f26700b = (C5386b[]) map.values().toArray(new C5386b[map.size()]);
        this.f26701c = JsonReader.C5372b.m41530a((String[]) map.keySet().toArray(new String[map.size()]));
    }

    /* renamed from: b */
    public T mo39346b(JsonReader jsonReader) throws IOException {
        try {
            T b = this.f26699a.mo45778b();
            try {
                jsonReader.mo39276b();
                while (jsonReader.mo39280f()) {
                    int z = jsonReader.mo39295z(this.f26701c);
                    if (z == -1) {
                        jsonReader.mo39272I();
                        jsonReader.mo39273J();
                    } else {
                        this.f26700b[z].mo39354a(jsonReader, b);
                    }
                }
                jsonReader.mo39278d();
                return b;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw t67.m52118s(e2);
        } catch (IllegalAccessException unused2) {
            throw new AssertionError();
        }
    }

    /* renamed from: j */
    public void mo39347j(q73 q73, T t) throws IOException {
        try {
            q73.mo39394c();
            for (C5386b<?> bVar : this.f26700b) {
                q73.mo39399j(bVar.f26702a);
                bVar.mo39355b(q73, t);
            }
            q73.mo39398g();
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        }
    }

    public String toString() {
        return "JsonAdapter(" + this.f26699a + ")";
    }
}
