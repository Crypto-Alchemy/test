package p000;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import p000.rl4;

/* renamed from: fe5 */
/* compiled from: RequestFactory */
public final class fe5 {

    /* renamed from: a */
    public final Method f37752a;

    /* renamed from: b */
    public final HttpUrl f37753b;

    /* renamed from: c */
    public final String f37754c;

    /* renamed from: d */
    public final String f37755d;

    /* renamed from: e */
    public final Headers f37756e;

    /* renamed from: f */
    public final MediaType f37757f;

    /* renamed from: g */
    public final boolean f37758g;

    /* renamed from: h */
    public final boolean f37759h;

    /* renamed from: i */
    public final boolean f37760i;

    /* renamed from: j */
    public final rl4<?>[] f37761j;

    /* renamed from: k */
    public final boolean f37762k;

    /* renamed from: fe5$a */
    /* compiled from: RequestFactory */
    public static final class C7075a {

        /* renamed from: x */
        public static final Pattern f37763x = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

        /* renamed from: y */
        public static final Pattern f37764y = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

        /* renamed from: a */
        public final og5 f37765a;

        /* renamed from: b */
        public final Method f37766b;

        /* renamed from: c */
        public final Annotation[] f37767c;

        /* renamed from: d */
        public final Annotation[][] f37768d;

        /* renamed from: e */
        public final Type[] f37769e;

        /* renamed from: f */
        public boolean f37770f;

        /* renamed from: g */
        public boolean f37771g;

        /* renamed from: h */
        public boolean f37772h;

        /* renamed from: i */
        public boolean f37773i;

        /* renamed from: j */
        public boolean f37774j;

        /* renamed from: k */
        public boolean f37775k;

        /* renamed from: l */
        public boolean f37776l;

        /* renamed from: m */
        public boolean f37777m;

        /* renamed from: n */
        public String f37778n;

        /* renamed from: o */
        public boolean f37779o;

        /* renamed from: p */
        public boolean f37780p;

        /* renamed from: q */
        public boolean f37781q;

        /* renamed from: r */
        public String f37782r;

        /* renamed from: s */
        public Headers f37783s;

        /* renamed from: t */
        public MediaType f37784t;

        /* renamed from: u */
        public Set<String> f37785u;

        /* renamed from: v */
        public rl4<?>[] f37786v;

        /* renamed from: w */
        public boolean f37787w;

        public C7075a(og5 og5, Method method) {
            this.f37765a = og5;
            this.f37766b = method;
            this.f37767c = method.getAnnotations();
            this.f37769e = method.getGenericParameterTypes();
            this.f37768d = method.getParameterAnnotations();
        }

        /* renamed from: a */
        public static Class<?> m57672a(Class<?> cls) {
            if (Boolean.TYPE == cls) {
                return Boolean.class;
            }
            if (Byte.TYPE == cls) {
                return Byte.class;
            }
            if (Character.TYPE == cls) {
                return Character.class;
            }
            if (Double.TYPE == cls) {
                return Double.class;
            }
            if (Float.TYPE == cls) {
                return Float.class;
            }
            if (Integer.TYPE == cls) {
                return Integer.class;
            }
            if (Long.TYPE == cls) {
                return Long.class;
            }
            if (Short.TYPE == cls) {
                return Short.class;
            }
            return cls;
        }

        /* renamed from: h */
        public static Set<String> m57673h(String str) {
            Matcher matcher = f37763x.matcher(str);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            return linkedHashSet;
        }

        /* renamed from: b */
        public fe5 mo51647b() {
            for (Annotation e : this.f37767c) {
                mo51650e(e);
            }
            if (this.f37778n != null) {
                if (!this.f37779o) {
                    if (this.f37781q) {
                        throw t77.m72182m(this.f37766b, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    } else if (this.f37780p) {
                        throw t77.m72182m(this.f37766b, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                }
                int length = this.f37768d.length;
                this.f37786v = new rl4[length];
                int i = length - 1;
                int i2 = 0;
                while (true) {
                    boolean z = true;
                    if (i2 >= length) {
                        break;
                    }
                    rl4<?>[] rl4Arr = this.f37786v;
                    Type type = this.f37769e[i2];
                    Annotation[] annotationArr = this.f37768d[i2];
                    if (i2 != i) {
                        z = false;
                    }
                    rl4Arr[i2] = mo51651f(i2, type, annotationArr, z);
                    i2++;
                }
                if (this.f37782r != null || this.f37777m) {
                    boolean z2 = this.f37780p;
                    if (!z2 && !this.f37781q && !this.f37779o && this.f37772h) {
                        throw t77.m72182m(this.f37766b, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                    } else if (z2 && !this.f37770f) {
                        throw t77.m72182m(this.f37766b, "Form-encoded method must contain at least one @Field.", new Object[0]);
                    } else if (!this.f37781q || this.f37771g) {
                        return new fe5(this);
                    } else {
                        throw t77.m72182m(this.f37766b, "Multipart method must contain at least one @Part.", new Object[0]);
                    }
                } else {
                    throw t77.m72182m(this.f37766b, "Missing either @%s URL or @Url parameter.", this.f37778n);
                }
            } else {
                throw t77.m72182m(this.f37766b, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
            }
        }

        /* renamed from: c */
        public final Headers mo51648c(String[] strArr) {
            Headers.Builder builder = new Headers.Builder();
            for (String str : strArr) {
                int indexOf = str.indexOf(58);
                if (indexOf == -1 || indexOf == 0 || indexOf == str.length() - 1) {
                    throw t77.m72182m(this.f37766b, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                String substring = str.substring(0, indexOf);
                String trim = str.substring(indexOf + 1).trim();
                if ("Content-Type".equalsIgnoreCase(substring)) {
                    try {
                        this.f37784t = MediaType.get(trim);
                    } catch (IllegalArgumentException e) {
                        throw t77.m72183n(this.f37766b, e, "Malformed content type: %s", trim);
                    }
                } else {
                    builder.add(substring, trim);
                }
            }
            return builder.build();
        }

        /* renamed from: d */
        public final void mo51649d(String str, String str2, boolean z) {
            String str3 = this.f37778n;
            if (str3 == null) {
                this.f37778n = str;
                this.f37779o = z;
                if (!str2.isEmpty()) {
                    int indexOf = str2.indexOf(63);
                    if (indexOf != -1 && indexOf < str2.length() - 1) {
                        String substring = str2.substring(indexOf + 1);
                        if (f37763x.matcher(substring).find()) {
                            throw t77.m72182m(this.f37766b, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                        }
                    }
                    this.f37782r = str2;
                    this.f37785u = m57673h(str2);
                    return;
                }
                return;
            }
            throw t77.m72182m(this.f37766b, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
        }

        /* renamed from: e */
        public final void mo51650e(Annotation annotation) {
            if (annotation instanceof mz0) {
                mo51649d("DELETE", ((mz0) annotation).value(), false);
            } else if (annotation instanceof le2) {
                mo51649d("GET", ((le2) annotation).value(), false);
            } else if (annotation instanceof hk2) {
                mo51649d("HEAD", ((hk2) annotation).value(), false);
            } else if (annotation instanceof pj4) {
                mo51649d("PATCH", ((pj4) annotation).value(), true);
            } else if (annotation instanceof ak4) {
                mo51649d("POST", ((ak4) annotation).value(), true);
            } else if (annotation instanceof dk4) {
                mo51649d("PUT", ((dk4) annotation).value(), true);
            } else if (annotation instanceof uc4) {
                mo51649d("OPTIONS", ((uc4) annotation).value(), false);
            } else if (annotation instanceof pk2) {
                pk2 pk2 = (pk2) annotation;
                mo51649d(pk2.method(), pk2.path(), pk2.hasBody());
            } else if (annotation instanceof rl2) {
                String[] value = ((rl2) annotation).value();
                if (value.length != 0) {
                    this.f37783s = mo51648c(value);
                    return;
                }
                throw t77.m72182m(this.f37766b, "@Headers annotation is empty.", new Object[0]);
            } else if (annotation instanceof d04) {
                if (!this.f37780p) {
                    this.f37781q = true;
                    return;
                }
                throw t77.m72182m(this.f37766b, "Only one encoding annotation is allowed.", new Object[0]);
            } else if (!(annotation instanceof z72)) {
            } else {
                if (!this.f37781q) {
                    this.f37780p = true;
                    return;
                }
                throw t77.m72182m(this.f37766b, "Only one encoding annotation is allowed.", new Object[0]);
            }
        }

        /* renamed from: f */
        public final rl4<?> mo51651f(int i, Type type, Annotation[] annotationArr, boolean z) {
            rl4<?> rl4;
            if (annotationArr != null) {
                rl4 = null;
                for (Annotation g : annotationArr) {
                    rl4<?> g2 = mo51652g(i, type, annotationArr, g);
                    if (g2 != null) {
                        if (rl4 == null) {
                            rl4 = g2;
                        } else {
                            throw t77.m72184o(this.f37766b, i, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                        }
                    }
                }
            } else {
                rl4 = null;
            }
            if (rl4 != null) {
                return rl4;
            }
            if (z) {
                try {
                    if (t77.m72177h(type) == ns0.class) {
                        this.f37787w = true;
                        return null;
                    }
                } catch (NoClassDefFoundError unused) {
                }
            }
            throw t77.m72184o(this.f37766b, i, "No Retrofit annotation found.", new Object[0]);
        }

        /* renamed from: g */
        public final rl4<?> mo51652g(int i, Type type, Annotation[] annotationArr, Annotation annotation) {
            Class<String> cls = String.class;
            Class<MultipartBody.Part> cls2 = MultipartBody.Part.class;
            if (annotation instanceof k57) {
                mo51654j(i, type);
                if (this.f37777m) {
                    throw t77.m72184o(this.f37766b, i, "Multiple @Url method annotations found.", new Object[0]);
                } else if (this.f37773i) {
                    throw t77.m72184o(this.f37766b, i, "@Path parameters may not be used with @Url.", new Object[0]);
                } else if (this.f37774j) {
                    throw t77.m72184o(this.f37766b, i, "A @Url parameter must not come after a @Query.", new Object[0]);
                } else if (this.f37775k) {
                    throw t77.m72184o(this.f37766b, i, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                } else if (this.f37776l) {
                    throw t77.m72184o(this.f37766b, i, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                } else if (this.f37782r == null) {
                    this.f37777m = true;
                    if (type == HttpUrl.class || type == cls || type == URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                        return new rl4.C9272p(this.f37766b, i);
                    }
                    throw t77.m72184o(this.f37766b, i, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                } else {
                    throw t77.m72184o(this.f37766b, i, "@Url cannot be used with @%s URL", this.f37778n);
                }
            } else if (annotation instanceof sm4) {
                mo51654j(i, type);
                if (this.f37774j) {
                    throw t77.m72184o(this.f37766b, i, "A @Path parameter must not come after a @Query.", new Object[0]);
                } else if (this.f37775k) {
                    throw t77.m72184o(this.f37766b, i, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                } else if (this.f37776l) {
                    throw t77.m72184o(this.f37766b, i, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                } else if (this.f37777m) {
                    throw t77.m72184o(this.f37766b, i, "@Path parameters may not be used with @Url.", new Object[0]);
                } else if (this.f37782r != null) {
                    this.f37773i = true;
                    sm4 sm4 = (sm4) annotation;
                    String value = sm4.value();
                    mo51653i(i, value);
                    return new rl4.C9267k(this.f37766b, i, value, this.f37765a.mo62917j(type, annotationArr), sm4.encoded());
                } else {
                    throw t77.m72184o(this.f37766b, i, "@Path can only be used with relative url on @%s", this.f37778n);
                }
            } else if (annotation instanceof sz4) {
                mo51654j(i, type);
                sz4 sz4 = (sz4) annotation;
                String value2 = sz4.value();
                boolean encoded = sz4.encoded();
                Class<?> h = t77.m72177h(type);
                this.f37774j = true;
                if (Iterable.class.isAssignableFrom(h)) {
                    if (type instanceof ParameterizedType) {
                        return new rl4.C9268l(value2, this.f37765a.mo62917j(t77.m72176g(0, (ParameterizedType) type), annotationArr), encoded).mo65670c();
                    }
                    throw t77.m72184o(this.f37766b, i, h.getSimpleName() + " must include generic type (e.g., " + h.getSimpleName() + "<String>)", new Object[0]);
                } else if (!h.isArray()) {
                    return new rl4.C9268l(value2, this.f37765a.mo62917j(type, annotationArr), encoded);
                } else {
                    return new rl4.C9268l(value2, this.f37765a.mo62917j(m57672a(h.getComponentType()), annotationArr), encoded).mo65669b();
                }
            } else if (annotation instanceof n05) {
                mo51654j(i, type);
                boolean encoded2 = ((n05) annotation).encoded();
                Class<?> h2 = t77.m72177h(type);
                this.f37775k = true;
                if (Iterable.class.isAssignableFrom(h2)) {
                    if (type instanceof ParameterizedType) {
                        return new rl4.C9270n(this.f37765a.mo62917j(t77.m72176g(0, (ParameterizedType) type), annotationArr), encoded2).mo65670c();
                    }
                    throw t77.m72184o(this.f37766b, i, h2.getSimpleName() + " must include generic type (e.g., " + h2.getSimpleName() + "<String>)", new Object[0]);
                } else if (!h2.isArray()) {
                    return new rl4.C9270n(this.f37765a.mo62917j(type, annotationArr), encoded2);
                } else {
                    return new rl4.C9270n(this.f37765a.mo62917j(m57672a(h2.getComponentType()), annotationArr), encoded2).mo65669b();
                }
            } else if (annotation instanceof m05) {
                mo51654j(i, type);
                Class<?> h3 = t77.m72177h(type);
                this.f37776l = true;
                if (Map.class.isAssignableFrom(h3)) {
                    Type i2 = t77.m72178i(type, h3, Map.class);
                    if (i2 instanceof ParameterizedType) {
                        ParameterizedType parameterizedType = (ParameterizedType) i2;
                        Type g = t77.m72176g(0, parameterizedType);
                        if (cls == g) {
                            return new rl4.C9269m(this.f37766b, i, this.f37765a.mo62917j(t77.m72176g(1, parameterizedType), annotationArr), ((m05) annotation).encoded());
                        }
                        throw t77.m72184o(this.f37766b, i, "@QueryMap keys must be of type String: " + g, new Object[0]);
                    }
                    throw t77.m72184o(this.f37766b, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                throw t77.m72184o(this.f37766b, i, "@QueryMap parameter type must be Map.", new Object[0]);
            } else if (annotation instanceof nl2) {
                mo51654j(i, type);
                String value3 = ((nl2) annotation).value();
                Class<?> h4 = t77.m72177h(type);
                if (Iterable.class.isAssignableFrom(h4)) {
                    if (type instanceof ParameterizedType) {
                        return new rl4.C9262f(value3, this.f37765a.mo62917j(t77.m72176g(0, (ParameterizedType) type), annotationArr)).mo65670c();
                    }
                    throw t77.m72184o(this.f37766b, i, h4.getSimpleName() + " must include generic type (e.g., " + h4.getSimpleName() + "<String>)", new Object[0]);
                } else if (!h4.isArray()) {
                    return new rl4.C9262f(value3, this.f37765a.mo62917j(type, annotationArr));
                } else {
                    return new rl4.C9262f(value3, this.f37765a.mo62917j(m57672a(h4.getComponentType()), annotationArr)).mo65669b();
                }
            } else if (annotation instanceof ol2) {
                if (type == Headers.class) {
                    return new rl4.C9264h(this.f37766b, i);
                }
                mo51654j(i, type);
                Class<?> h5 = t77.m72177h(type);
                if (Map.class.isAssignableFrom(h5)) {
                    Type i3 = t77.m72178i(type, h5, Map.class);
                    if (i3 instanceof ParameterizedType) {
                        ParameterizedType parameterizedType2 = (ParameterizedType) i3;
                        Type g2 = t77.m72176g(0, parameterizedType2);
                        if (cls == g2) {
                            return new rl4.C9263g(this.f37766b, i, this.f37765a.mo62917j(t77.m72176g(1, parameterizedType2), annotationArr));
                        }
                        throw t77.m72184o(this.f37766b, i, "@HeaderMap keys must be of type String: " + g2, new Object[0]);
                    }
                    throw t77.m72184o(this.f37766b, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                throw t77.m72184o(this.f37766b, i, "@HeaderMap parameter type must be Map.", new Object[0]);
            } else if (annotation instanceof e02) {
                mo51654j(i, type);
                if (this.f37780p) {
                    e02 e02 = (e02) annotation;
                    String value4 = e02.value();
                    boolean encoded3 = e02.encoded();
                    this.f37770f = true;
                    Class<?> h6 = t77.m72177h(type);
                    if (Iterable.class.isAssignableFrom(h6)) {
                        if (type instanceof ParameterizedType) {
                            return new rl4.C9260d(value4, this.f37765a.mo62917j(t77.m72176g(0, (ParameterizedType) type), annotationArr), encoded3).mo65670c();
                        }
                        throw t77.m72184o(this.f37766b, i, h6.getSimpleName() + " must include generic type (e.g., " + h6.getSimpleName() + "<String>)", new Object[0]);
                    } else if (!h6.isArray()) {
                        return new rl4.C9260d(value4, this.f37765a.mo62917j(type, annotationArr), encoded3);
                    } else {
                        return new rl4.C9260d(value4, this.f37765a.mo62917j(m57672a(h6.getComponentType()), annotationArr), encoded3).mo65669b();
                    }
                } else {
                    throw t77.m72184o(this.f37766b, i, "@Field parameters can only be used with form encoding.", new Object[0]);
                }
            } else if (annotation instanceof i02) {
                mo51654j(i, type);
                if (this.f37780p) {
                    Class<?> h7 = t77.m72177h(type);
                    if (Map.class.isAssignableFrom(h7)) {
                        Type i4 = t77.m72178i(type, h7, Map.class);
                        if (i4 instanceof ParameterizedType) {
                            ParameterizedType parameterizedType3 = (ParameterizedType) i4;
                            Type g3 = t77.m72176g(0, parameterizedType3);
                            if (cls == g3) {
                                pt0 j = this.f37765a.mo62917j(t77.m72176g(1, parameterizedType3), annotationArr);
                                this.f37770f = true;
                                return new rl4.C9261e(this.f37766b, i, j, ((i02) annotation).encoded());
                            }
                            throw t77.m72184o(this.f37766b, i, "@FieldMap keys must be of type String: " + g3, new Object[0]);
                        }
                        throw t77.m72184o(this.f37766b, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw t77.m72184o(this.f37766b, i, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                throw t77.m72184o(this.f37766b, i, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
            } else if (annotation instanceof nm4) {
                mo51654j(i, type);
                if (this.f37781q) {
                    nm4 nm4 = (nm4) annotation;
                    this.f37771g = true;
                    String value5 = nm4.value();
                    Class<?> h8 = t77.m72177h(type);
                    if (!value5.isEmpty()) {
                        Headers of = Headers.m70303of("Content-Disposition", "form-data; name=\"" + value5 + "\"", "Content-Transfer-Encoding", nm4.encoding());
                        if (Iterable.class.isAssignableFrom(h8)) {
                            if (type instanceof ParameterizedType) {
                                Type g4 = t77.m72176g(0, (ParameterizedType) type);
                                if (!cls2.isAssignableFrom(t77.m72177h(g4))) {
                                    return new rl4.C9265i(this.f37766b, i, of, this.f37765a.mo62915h(g4, annotationArr, this.f37767c)).mo65670c();
                                }
                                throw t77.m72184o(this.f37766b, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                            }
                            throw t77.m72184o(this.f37766b, i, h8.getSimpleName() + " must include generic type (e.g., " + h8.getSimpleName() + "<String>)", new Object[0]);
                        } else if (h8.isArray()) {
                            Class<?> a = m57672a(h8.getComponentType());
                            if (!cls2.isAssignableFrom(a)) {
                                return new rl4.C9265i(this.f37766b, i, of, this.f37765a.mo62915h(a, annotationArr, this.f37767c)).mo65669b();
                            }
                            throw t77.m72184o(this.f37766b, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                        } else if (!cls2.isAssignableFrom(h8)) {
                            return new rl4.C9265i(this.f37766b, i, of, this.f37765a.mo62915h(type, annotationArr, this.f37767c));
                        } else {
                            throw t77.m72184o(this.f37766b, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                        }
                    } else if (Iterable.class.isAssignableFrom(h8)) {
                        if (!(type instanceof ParameterizedType)) {
                            throw t77.m72184o(this.f37766b, i, h8.getSimpleName() + " must include generic type (e.g., " + h8.getSimpleName() + "<String>)", new Object[0]);
                        } else if (cls2.isAssignableFrom(t77.m72177h(t77.m72176g(0, (ParameterizedType) type)))) {
                            return rl4.C9271o.f44427a.mo65670c();
                        } else {
                            throw t77.m72184o(this.f37766b, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                        }
                    } else if (h8.isArray()) {
                        if (cls2.isAssignableFrom(h8.getComponentType())) {
                            return rl4.C9271o.f44427a.mo65669b();
                        }
                        throw t77.m72184o(this.f37766b, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    } else if (cls2.isAssignableFrom(h8)) {
                        return rl4.C9271o.f44427a;
                    } else {
                        throw t77.m72184o(this.f37766b, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    }
                } else {
                    throw t77.m72184o(this.f37766b, i, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                }
            } else if (annotation instanceof om4) {
                mo51654j(i, type);
                if (this.f37781q) {
                    this.f37771g = true;
                    Class<?> h9 = t77.m72177h(type);
                    if (Map.class.isAssignableFrom(h9)) {
                        Type i5 = t77.m72178i(type, h9, Map.class);
                        if (i5 instanceof ParameterizedType) {
                            ParameterizedType parameterizedType4 = (ParameterizedType) i5;
                            Type g5 = t77.m72176g(0, parameterizedType4);
                            if (cls == g5) {
                                Type g6 = t77.m72176g(1, parameterizedType4);
                                if (!cls2.isAssignableFrom(t77.m72177h(g6))) {
                                    return new rl4.C9266j(this.f37766b, i, this.f37765a.mo62915h(g6, annotationArr, this.f37767c), ((om4) annotation).encoding());
                                }
                                throw t77.m72184o(this.f37766b, i, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                            }
                            throw t77.m72184o(this.f37766b, i, "@PartMap keys must be of type String: " + g5, new Object[0]);
                        }
                        throw t77.m72184o(this.f37766b, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw t77.m72184o(this.f37766b, i, "@PartMap parameter type must be Map.", new Object[0]);
                }
                throw t77.m72184o(this.f37766b, i, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
            } else if (annotation instanceof p30) {
                mo51654j(i, type);
                if (this.f37780p || this.f37781q) {
                    throw t77.m72184o(this.f37766b, i, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                } else if (!this.f37772h) {
                    try {
                        pt0 h10 = this.f37765a.mo62915h(type, annotationArr, this.f37767c);
                        this.f37772h = true;
                        return new rl4.C9259c(this.f37766b, i, h10);
                    } catch (RuntimeException e) {
                        throw t77.m72185p(this.f37766b, e, i, "Unable to create @Body converter for %s", type);
                    }
                } else {
                    throw t77.m72184o(this.f37766b, i, "Multiple @Body method annotations found.", new Object[0]);
                }
            } else if (!(annotation instanceof ml6)) {
                return null;
            } else {
                mo51654j(i, type);
                Class<?> h11 = t77.m72177h(type);
                int i6 = i - 1;
                while (i6 >= 0) {
                    rl4<?> rl4 = this.f37786v[i6];
                    if (!(rl4 instanceof rl4.C9273q) || !((rl4.C9273q) rl4).f44430a.equals(h11)) {
                        i6--;
                    } else {
                        throw t77.m72184o(this.f37766b, i, "@Tag type " + h11.getName() + " is duplicate of parameter #" + (i6 + 1) + " and would always overwrite its value.", new Object[0]);
                    }
                }
                return new rl4.C9273q(h11);
            }
        }

        /* renamed from: i */
        public final void mo51653i(int i, String str) {
            if (!f37764y.matcher(str).matches()) {
                throw t77.m72184o(this.f37766b, i, "@Path parameter name must match %s. Found: %s", f37763x.pattern(), str);
            } else if (!this.f37785u.contains(str)) {
                throw t77.m72184o(this.f37766b, i, "URL \"%s\" does not contain \"{%s}\".", this.f37782r, str);
            }
        }

        /* renamed from: j */
        public final void mo51654j(int i, Type type) {
            if (t77.m72179j(type)) {
                throw t77.m72184o(this.f37766b, i, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }
    }

    public fe5(C7075a aVar) {
        this.f37752a = aVar.f37766b;
        this.f37753b = aVar.f37765a.f43644c;
        this.f37754c = aVar.f37778n;
        this.f37755d = aVar.f37782r;
        this.f37756e = aVar.f37783s;
        this.f37757f = aVar.f37784t;
        this.f37758g = aVar.f37779o;
        this.f37759h = aVar.f37780p;
        this.f37760i = aVar.f37781q;
        this.f37761j = aVar.f37786v;
        this.f37762k = aVar.f37787w;
    }

    /* renamed from: b */
    public static fe5 m57670b(og5 og5, Method method) {
        return new C7075a(og5, method).mo51647b();
    }

    /* renamed from: a */
    public Request mo51646a(Object[] objArr) throws IOException {
        rl4<?>[] rl4Arr = this.f37761j;
        int length = objArr.length;
        if (length == rl4Arr.length) {
            ce5 ce5 = new ce5(this.f37754c, this.f37753b, this.f37755d, this.f37756e, this.f37757f, this.f37758g, this.f37759h, this.f37760i);
            if (this.f37762k) {
                length--;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                arrayList.add(objArr[i]);
                rl4Arr[i].mo65668a(ce5, objArr[i]);
            }
            return ce5.mo50882k().tag(iy2.class, new iy2(this.f37752a, arrayList)).build();
        }
        throw new IllegalArgumentException("Argument count (" + length + ") doesn't match expected count (" + rl4Arr.length + ")");
    }
}
