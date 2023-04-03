package p000;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import p000.e50;
import p000.l90;
import p000.pt0;

/* renamed from: og5 */
/* compiled from: Retrofit */
public final class og5 {

    /* renamed from: a */
    public final Map<Method, lx5<?>> f43642a = new ConcurrentHashMap();

    /* renamed from: b */
    public final Call.Factory f43643b;

    /* renamed from: c */
    public final HttpUrl f43644c;

    /* renamed from: d */
    public final List<pt0.C9195a> f43645d;

    /* renamed from: e */
    public final List<l90.C7825a> f43646e;

    /* renamed from: f */
    public final Executor f43647f;

    /* renamed from: g */
    public final boolean f43648g;

    /* renamed from: og5$a */
    /* compiled from: Retrofit */
    public class C9025a implements InvocationHandler {

        /* renamed from: a */
        public final wo4 f43649a = wo4.m73704g();

        /* renamed from: b */
        public final Object[] f43650b = new Object[0];

        /* renamed from: c */
        public final /* synthetic */ Class f43651c;

        public C9025a(Class cls) {
            this.f43651c = cls;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (objArr == null) {
                objArr = this.f43650b;
            }
            if (this.f43649a.mo66757i(method)) {
                return this.f43649a.mo66756h(method, this.f43651c, obj, objArr);
            }
            return og5.this.mo62910c(method).mo52512a(objArr);
        }
    }

    public og5(Call.Factory factory, HttpUrl httpUrl, List<pt0.C9195a> list, List<l90.C7825a> list2, Executor executor, boolean z) {
        this.f43643b = factory;
        this.f43644c = httpUrl;
        this.f43645d = list;
        this.f43646e = list2;
        this.f43647f = executor;
        this.f43648g = z;
    }

    /* renamed from: a */
    public l90<?, ?> mo62908a(Type type, Annotation[] annotationArr) {
        return mo62912e((l90.C7825a) null, type, annotationArr);
    }

    /* renamed from: b */
    public <T> T mo62909b(Class<T> cls) {
        mo62918k(cls);
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C9025a(cls));
    }

    /* renamed from: c */
    public lx5<?> mo62910c(Method method) {
        lx5<?> lx5;
        lx5<?> lx52 = this.f43642a.get(method);
        if (lx52 != null) {
            return lx52;
        }
        synchronized (this.f43642a) {
            lx5 = this.f43642a.get(method);
            if (lx5 == null) {
                lx5 = lx5.m64026b(this, method);
                this.f43642a.put(method, lx5);
            }
        }
        return lx5;
    }

    /* renamed from: d */
    public C9026b mo62911d() {
        return new C9026b(this);
    }

    /* renamed from: e */
    public l90<?, ?> mo62912e(l90.C7825a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.f43646e.indexOf(aVar) + 1;
        int size = this.f43646e.size();
        for (int i = indexOf; i < size; i++) {
            l90<?, ?> a = this.f43646e.get(i).mo50508a(type, annotationArr, this);
            if (a != null) {
                return a;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.f43646e.get(i2).getClass().getName());
            }
            sb.append(10);
        }
        sb.append("  Tried:");
        int size2 = this.f43646e.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f43646e.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: f */
    public <T> pt0<T, RequestBody> mo62913f(pt0.C9195a aVar, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "parameterAnnotations == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        int indexOf = this.f43645d.indexOf(aVar) + 1;
        int size = this.f43645d.size();
        for (int i = indexOf; i < size; i++) {
            pt0<?, RequestBody> c = this.f43645d.get(i).mo51276c(type, annotationArr, annotationArr2, this);
            if (c != null) {
                return c;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.f43645d.get(i2).getClass().getName());
            }
            sb.append(10);
        }
        sb.append("  Tried:");
        int size2 = this.f43645d.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f43645d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: g */
    public <T> pt0<ResponseBody, T> mo62914g(pt0.C9195a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.f43645d.indexOf(aVar) + 1;
        int size = this.f43645d.size();
        for (int i = indexOf; i < size; i++) {
            pt0<ResponseBody, ?> d = this.f43645d.get(i).mo51277d(type, annotationArr, this);
            if (d != null) {
                return d;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.f43645d.get(i2).getClass().getName());
            }
            sb.append(10);
        }
        sb.append("  Tried:");
        int size2 = this.f43645d.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f43645d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: h */
    public <T> pt0<T, RequestBody> mo62915h(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return mo62913f((pt0.C9195a) null, type, annotationArr, annotationArr2);
    }

    /* renamed from: i */
    public <T> pt0<ResponseBody, T> mo62916i(Type type, Annotation[] annotationArr) {
        return mo62914g((pt0.C9195a) null, type, annotationArr);
    }

    /* renamed from: j */
    public <T> pt0<T, String> mo62917j(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int size = this.f43645d.size();
        for (int i = 0; i < size; i++) {
            pt0<?, String> e = this.f43645d.get(i).mo65359e(type, annotationArr, this);
            if (e != null) {
                return e;
            }
        }
        return e50.C7023d.f37480a;
    }

    /* renamed from: k */
    public final void mo62918k(Class<?> cls) {
        if (cls.isInterface()) {
            ArrayDeque arrayDeque = new ArrayDeque(1);
            arrayDeque.add(cls);
            while (!arrayDeque.isEmpty()) {
                Class<?> cls2 = (Class) arrayDeque.removeFirst();
                if (cls2.getTypeParameters().length != 0) {
                    StringBuilder sb = new StringBuilder("Type parameters are unsupported on ");
                    sb.append(cls2.getName());
                    if (cls2 != cls) {
                        sb.append(" which is an interface of ");
                        sb.append(cls.getName());
                    }
                    throw new IllegalArgumentException(sb.toString());
                }
                Collections.addAll(arrayDeque, cls2.getInterfaces());
            }
            if (this.f43648g) {
                wo4 g = wo4.m73704g();
                for (Method method : cls.getDeclaredMethods()) {
                    if (!g.mo66757i(method) && !Modifier.isStatic(method.getModifiers())) {
                        mo62910c(method);
                    }
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("API declarations must be interfaces.");
    }

    /* renamed from: og5$b */
    /* compiled from: Retrofit */
    public static final class C9026b {

        /* renamed from: a */
        public final wo4 f43653a;

        /* renamed from: b */
        public Call.Factory f43654b;

        /* renamed from: c */
        public HttpUrl f43655c;

        /* renamed from: d */
        public final List<pt0.C9195a> f43656d;

        /* renamed from: e */
        public final List<l90.C7825a> f43657e;

        /* renamed from: f */
        public Executor f43658f;

        /* renamed from: g */
        public boolean f43659g;

        public C9026b(wo4 wo4) {
            this.f43656d = new ArrayList();
            this.f43657e = new ArrayList();
            this.f43653a = wo4;
        }

        /* renamed from: a */
        public C9026b mo62920a(pt0.C9195a aVar) {
            List<pt0.C9195a> list = this.f43656d;
            Objects.requireNonNull(aVar, "factory == null");
            list.add(aVar);
            return this;
        }

        /* renamed from: b */
        public C9026b mo62921b(String str) {
            Objects.requireNonNull(str, "baseUrl == null");
            return mo62922c(HttpUrl.get(str));
        }

        /* renamed from: c */
        public C9026b mo62922c(HttpUrl httpUrl) {
            Objects.requireNonNull(httpUrl, "baseUrl == null");
            List<String> pathSegments = httpUrl.pathSegments();
            if ("".equals(pathSegments.get(pathSegments.size() - 1))) {
                this.f43655c = httpUrl;
                return this;
            }
            throw new IllegalArgumentException("baseUrl must end in /: " + httpUrl);
        }

        /* renamed from: d */
        public og5 mo62923d() {
            if (this.f43655c != null) {
                Call.Factory factory = this.f43654b;
                if (factory == null) {
                    factory = new OkHttpClient();
                }
                Call.Factory factory2 = factory;
                Executor executor = this.f43658f;
                if (executor == null) {
                    executor = this.f43653a.mo66753c();
                }
                Executor executor2 = executor;
                ArrayList arrayList = new ArrayList(this.f43657e);
                arrayList.addAll(this.f43653a.mo66751a(executor2));
                ArrayList arrayList2 = new ArrayList(this.f43656d.size() + 1 + this.f43653a.mo66755e());
                arrayList2.add(new e50());
                arrayList2.addAll(this.f43656d);
                arrayList2.addAll(this.f43653a.mo66754d());
                return new og5(factory2, this.f43655c, Collections.unmodifiableList(arrayList2), Collections.unmodifiableList(arrayList), executor2, this.f43659g);
            }
            throw new IllegalStateException("Base URL required.");
        }

        /* renamed from: e */
        public C9026b mo62924e(Call.Factory factory) {
            Objects.requireNonNull(factory, "factory == null");
            this.f43654b = factory;
            return this;
        }

        /* renamed from: f */
        public C9026b mo62925f(OkHttpClient okHttpClient) {
            Objects.requireNonNull(okHttpClient, "client == null");
            return mo62924e(okHttpClient);
        }

        public C9026b() {
            this(wo4.m73704g());
        }

        public C9026b(og5 og5) {
            this.f43656d = new ArrayList();
            this.f43657e = new ArrayList();
            wo4 g = wo4.m73704g();
            this.f43653a = g;
            this.f43654b = og5.f43643b;
            this.f43655c = og5.f43644c;
            int size = og5.f43645d.size() - g.mo66755e();
            for (int i = 1; i < size; i++) {
                this.f43656d.add(og5.f43645d.get(i));
            }
            int size2 = og5.f43646e.size() - this.f43653a.mo66752b();
            for (int i2 = 0; i2 < size2; i2++) {
                this.f43657e.add(og5.f43646e.get(i2));
            }
            this.f43658f = og5.f43647f;
            this.f43659g = og5.f43648g;
        }
    }
}
