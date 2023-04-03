package p000;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import okhttp3.Call;
import okhttp3.Response;
import okhttp3.ResponseBody;
import p000.t77;
import retrofit2.KotlinExtensions;

/* renamed from: in2 */
/* compiled from: HttpServiceMethod */
public abstract class in2<ResponseT, ReturnT> extends lx5<ReturnT> {

    /* renamed from: a */
    public final fe5 f38421a;

    /* renamed from: b */
    public final Call.Factory f38422b;

    /* renamed from: c */
    public final pt0<ResponseBody, ResponseT> f38423c;

    /* renamed from: in2$a */
    /* compiled from: HttpServiceMethod */
    public static final class C7219a<ResponseT, ReturnT> extends in2<ResponseT, ReturnT> {

        /* renamed from: d */
        public final l90<ResponseT, ReturnT> f38424d;

        public C7219a(fe5 fe5, Call.Factory factory, pt0<ResponseBody, ResponseT> pt0, l90<ResponseT, ReturnT> l90) {
            super(fe5, factory, pt0);
            this.f38424d = l90;
        }

        /* JADX WARNING: type inference failed for: r1v0, types: [k90, k90<ResponseT>] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public ReturnT mo52513c(p000.k90<ResponseT> r1, java.lang.Object[] r2) {
            /*
                r0 = this;
                l90<ResponseT, ReturnT> r2 = r0.f38424d
                java.lang.Object r1 = r2.mo50510b(r1)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.in2.C7219a.mo52513c(k90, java.lang.Object[]):java.lang.Object");
        }
    }

    /* renamed from: in2$b */
    /* compiled from: HttpServiceMethod */
    public static final class C7220b<ResponseT> extends in2<ResponseT, Object> {

        /* renamed from: d */
        public final l90<ResponseT, k90<ResponseT>> f38425d;

        /* renamed from: e */
        public final boolean f38426e;

        public C7220b(fe5 fe5, Call.Factory factory, pt0<ResponseBody, ResponseT> pt0, l90<ResponseT, k90<ResponseT>> l90, boolean z) {
            super(fe5, factory, pt0);
            this.f38425d = l90;
            this.f38426e = z;
        }

        /* renamed from: c */
        public Object mo52513c(k90<ResponseT> k90, Object[] objArr) {
            k90 k902 = (k90) this.f38425d.mo50510b(k90);
            ns0 ns0 = objArr[objArr.length - 1];
            try {
                if (this.f38426e) {
                    return KotlinExtensions.m71520b(k902, ns0);
                }
                return KotlinExtensions.m71519a(k902, ns0);
            } catch (Exception e) {
                return KotlinExtensions.m71522d(e, ns0);
            }
        }
    }

    /* renamed from: in2$c */
    /* compiled from: HttpServiceMethod */
    public static final class C7221c<ResponseT> extends in2<ResponseT, Object> {

        /* renamed from: d */
        public final l90<ResponseT, k90<ResponseT>> f38427d;

        public C7221c(fe5 fe5, Call.Factory factory, pt0<ResponseBody, ResponseT> pt0, l90<ResponseT, k90<ResponseT>> l90) {
            super(fe5, factory, pt0);
            this.f38427d = l90;
        }

        /* renamed from: c */
        public Object mo52513c(k90<ResponseT> k90, Object[] objArr) {
            k90 k902 = (k90) this.f38427d.mo50510b(k90);
            ns0 ns0 = objArr[objArr.length - 1];
            try {
                return KotlinExtensions.m71521c(k902, ns0);
            } catch (Exception e) {
                return KotlinExtensions.m71522d(e, ns0);
            }
        }
    }

    public in2(fe5 fe5, Call.Factory factory, pt0<ResponseBody, ResponseT> pt0) {
        this.f38421a = fe5;
        this.f38422b = factory;
        this.f38423c = pt0;
    }

    /* renamed from: d */
    public static <ResponseT, ReturnT> l90<ResponseT, ReturnT> m59023d(og5 og5, Method method, Type type, Annotation[] annotationArr) {
        try {
            return og5.mo62908a(type, annotationArr);
        } catch (RuntimeException e) {
            throw t77.m72183n(method, e, "Unable to create call adapter for %s", type);
        }
    }

    /* renamed from: e */
    public static <ResponseT> pt0<ResponseBody, ResponseT> m59024e(og5 og5, Method method, Type type) {
        try {
            return og5.mo62916i(type, method.getAnnotations());
        } catch (RuntimeException e) {
            throw t77.m72183n(method, e, "Unable to create converter for %s", type);
        }
    }

    /* renamed from: f */
    public static <ResponseT, ReturnT> in2<ResponseT, ReturnT> m59025f(og5 og5, Method method, fe5 fe5) {
        Type type;
        boolean z;
        Class<bg5> cls = bg5.class;
        boolean z2 = fe5.f37762k;
        Annotation[] annotations = method.getAnnotations();
        if (z2) {
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            Type f = t77.m72175f(0, (ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]);
            if (t77.m72177h(f) != cls || !(f instanceof ParameterizedType)) {
                z = false;
            } else {
                f = t77.m72176g(0, (ParameterizedType) f);
                z = true;
            }
            type = new t77.C9329b((Type) null, k90.class, f);
            annotations = z36.m74744a(annotations);
        } else {
            type = method.getGenericReturnType();
            z = false;
        }
        l90 d = m59023d(og5, method, type, annotations);
        Type a = d.mo50509a();
        if (a == Response.class) {
            throw t77.m72182m(method, "'" + t77.m72177h(a).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
        } else if (a == cls) {
            throw t77.m72182m(method, "Response must include generic type (e.g., Response<String>)", new Object[0]);
        } else if (!fe5.f37754c.equals("HEAD") || Void.class.equals(a)) {
            pt0 e = m59024e(og5, method, a);
            Call.Factory factory = og5.f43643b;
            if (!z2) {
                return new C7219a(fe5, factory, e, d);
            }
            if (z) {
                return new C7221c(fe5, factory, e, d);
            }
            return new C7220b(fe5, factory, e, d, false);
        } else {
            throw t77.m72182m(method, "HEAD method must use Void as response type.", new Object[0]);
        }
    }

    /* renamed from: a */
    public final ReturnT mo52512a(Object[] objArr) {
        return mo52513c(new jg4(this.f38421a, objArr, this.f38422b, this.f38423c), objArr);
    }

    /* renamed from: c */
    public abstract ReturnT mo52513c(k90<ResponseT> k90, Object[] objArr);
}
