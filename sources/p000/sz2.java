package p000;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: sz2 */
/* compiled from: JDK14Util */
public class sz2 {

    /* renamed from: sz2$a */
    /* compiled from: JDK14Util */
    public static class C3315a {

        /* renamed from: a */
        public final n00 f17843a;

        /* renamed from: b */
        public final DeserializationConfig f17844b;

        /* renamed from: c */
        public final AnnotationIntrospector f17845c;

        /* renamed from: d */
        public final List<AnnotatedConstructor> f17846d;

        /* renamed from: e */
        public final AnnotatedConstructor f17847e;

        /* renamed from: f */
        public final C3316b[] f17848f;

        public C3315a(DeserializationContext deserializationContext, n00 n00) {
            AnnotatedConstructor annotatedConstructor;
            this.f17843a = n00;
            this.f17845c = deserializationContext.getAnnotationIntrospector();
            this.f17844b = deserializationContext.getConfig();
            C3316b[] b = C3317c.m27207c().mo26004b(n00.mo23460r());
            this.f17848f = b;
            int length = b.length;
            if (length != 0) {
                List<AnnotatedConstructor> u = n00.mo23463u();
                this.f17846d = u;
                Iterator<AnnotatedConstructor> it = u.iterator();
                loop0:
                while (true) {
                    if (!it.hasNext()) {
                        annotatedConstructor = null;
                        break;
                    }
                    AnnotatedConstructor next = it.next();
                    if (next.getParameterCount() == length) {
                        int i = 0;
                        while (i < length) {
                            if (next.getRawParameterType(i).equals(this.f17848f[i].f17849a)) {
                                i++;
                            }
                        }
                        annotatedConstructor = next;
                        break loop0;
                    }
                }
            } else {
                annotatedConstructor = n00.mo23446d();
                this.f17846d = Collections.singletonList(annotatedConstructor);
            }
            if (annotatedConstructor != null) {
                this.f17847e = annotatedConstructor;
                return;
            }
            throw new IllegalArgumentException("Failed to find the canonical Record constructor of type " + wf0.m29480G(this.f17843a.mo23439A()));
        }

        /* renamed from: a */
        public AnnotatedConstructor mo26002a(List<String> list) {
            for (AnnotatedConstructor next : this.f17846d) {
                JsonCreator.Mode findCreatorAnnotation = this.f17845c.findCreatorAnnotation(this.f17844b, next);
                if (!(findCreatorAnnotation == null || JsonCreator.Mode.DISABLED == findCreatorAnnotation)) {
                    if (JsonCreator.Mode.DELEGATING == findCreatorAnnotation || next != this.f17847e) {
                        return null;
                    }
                }
            }
            for (C3316b bVar : this.f17848f) {
                list.add(bVar.f17850b);
            }
            return this.f17847e;
        }
    }

    /* renamed from: sz2$b */
    /* compiled from: JDK14Util */
    public static class C3316b {

        /* renamed from: a */
        public final Class<?> f17849a;

        /* renamed from: b */
        public final String f17850b;

        public C3316b(Class<?> cls, String str) {
            this.f17849a = cls;
            this.f17850b = str;
        }
    }

    /* renamed from: sz2$c */
    /* compiled from: JDK14Util */
    public static class C3317c {

        /* renamed from: d */
        public static final C3317c f17851d;

        /* renamed from: e */
        public static final RuntimeException f17852e;

        /* renamed from: a */
        public final Method f17853a;

        /* renamed from: b */
        public final Method f17854b;

        /* renamed from: c */
        public final Method f17855c;

        static {
            C3317c cVar = null;
            try {
                e = null;
                cVar = new C3317c();
            } catch (RuntimeException e) {
                e = e;
            }
            f17851d = cVar;
            f17852e = e;
        }

        public C3317c() throws RuntimeException {
            try {
                this.f17853a = Class.class.getMethod("getRecordComponents", new Class[0]);
                Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
                this.f17854b = cls.getMethod("getName", new Class[0]);
                this.f17855c = cls.getMethod("getType", new Class[0]);
            } catch (Exception e) {
                throw new RuntimeException(String.format("Failed to access Methods needed to support `java.lang.Record`: (%s) %s", new Object[]{e.getClass().getName(), e.getMessage()}), e);
            }
        }

        /* renamed from: c */
        public static C3317c m27207c() {
            RuntimeException runtimeException = f17852e;
            if (runtimeException == null) {
                return f17851d;
            }
            throw runtimeException;
        }

        /* renamed from: a */
        public String[] mo26003a(Class<?> cls) throws IllegalArgumentException {
            Object[] d = mo26005d(cls);
            String[] strArr = new String[d.length];
            int i = 0;
            while (i < d.length) {
                try {
                    strArr[i] = (String) this.f17854b.invoke(d[i], new Object[0]);
                    i++;
                } catch (Exception e) {
                    throw new IllegalArgumentException(String.format("Failed to access name of field #%d (of %d) of Record type %s", new Object[]{Integer.valueOf(i), Integer.valueOf(d.length), wf0.m29497X(cls)}), e);
                }
            }
            return strArr;
        }

        /* renamed from: b */
        public C3316b[] mo26004b(Class<?> cls) throws IllegalArgumentException {
            Object[] d = mo26005d(cls);
            C3316b[] bVarArr = new C3316b[d.length];
            int i = 0;
            while (i < d.length) {
                try {
                    try {
                        bVarArr[i] = new C3316b((Class) this.f17855c.invoke(d[i], new Object[0]), (String) this.f17854b.invoke(d[i], new Object[0]));
                        i++;
                    } catch (Exception e) {
                        throw new IllegalArgumentException(String.format("Failed to access type of field #%d (of %d) of Record type %s", new Object[]{Integer.valueOf(i), Integer.valueOf(d.length), wf0.m29497X(cls)}), e);
                    }
                } catch (Exception e2) {
                    throw new IllegalArgumentException(String.format("Failed to access name of field #%d (of %d) of Record type %s", new Object[]{Integer.valueOf(i), Integer.valueOf(d.length), wf0.m29497X(cls)}), e2);
                }
            }
            return bVarArr;
        }

        /* renamed from: d */
        public Object[] mo26005d(Class<?> cls) throws IllegalArgumentException {
            try {
                return (Object[]) this.f17853a.invoke(cls, new Object[0]);
            } catch (Exception unused) {
                throw new IllegalArgumentException("Failed to access RecordComponents of type " + wf0.m29497X(cls));
            }
        }
    }

    /* renamed from: a */
    public static AnnotatedConstructor m27204a(DeserializationContext deserializationContext, n00 n00, List<String> list) {
        return new C3315a(deserializationContext, n00).mo26002a(list);
    }

    /* renamed from: b */
    public static String[] m27205b(Class<?> cls) {
        return C3317c.m27207c().mo26003a(cls);
    }
}
