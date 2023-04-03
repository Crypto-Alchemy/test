package p000;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import okhttp3.Headers;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

/* renamed from: rl4 */
/* compiled from: ParameterHandler */
public abstract class rl4<T> {

    /* renamed from: rl4$a */
    /* compiled from: ParameterHandler */
    public class C9257a extends rl4<Iterable<T>> {
        public C9257a() {
        }

        /* renamed from: d */
        public void mo65668a(ce5 ce5, Iterable<T> iterable) throws IOException {
            if (iterable != null) {
                for (T a : iterable) {
                    rl4.this.mo65668a(ce5, a);
                }
            }
        }
    }

    /* renamed from: rl4$b */
    /* compiled from: ParameterHandler */
    public class C9258b extends rl4<Object> {
        public C9258b() {
        }

        /* renamed from: a */
        public void mo65668a(ce5 ce5, Object obj) throws IOException {
            if (obj != null) {
                int length = Array.getLength(obj);
                for (int i = 0; i < length; i++) {
                    rl4.this.mo65668a(ce5, Array.get(obj, i));
                }
            }
        }
    }

    /* renamed from: rl4$c */
    /* compiled from: ParameterHandler */
    public static final class C9259c<T> extends rl4<T> {

        /* renamed from: a */
        public final Method f44388a;

        /* renamed from: b */
        public final int f44389b;

        /* renamed from: c */
        public final pt0<T, RequestBody> f44390c;

        public C9259c(Method method, int i, pt0<T, RequestBody> pt0) {
            this.f44388a = method;
            this.f44389b = i;
            this.f44390c = pt0;
        }

        /* renamed from: a */
        public void mo65668a(ce5 ce5, T t) {
            if (t != null) {
                try {
                    ce5.mo50883l(this.f44390c.mo50216a(t));
                } catch (IOException e) {
                    Method method = this.f44388a;
                    int i = this.f44389b;
                    throw t77.m72185p(method, e, i, "Unable to convert " + t + " to RequestBody", new Object[0]);
                }
            } else {
                throw t77.m72184o(this.f44388a, this.f44389b, "Body parameter value must not be null.", new Object[0]);
            }
        }
    }

    /* renamed from: rl4$d */
    /* compiled from: ParameterHandler */
    public static final class C9260d<T> extends rl4<T> {

        /* renamed from: a */
        public final String f44391a;

        /* renamed from: b */
        public final pt0<T, String> f44392b;

        /* renamed from: c */
        public final boolean f44393c;

        public C9260d(String str, pt0<T, String> pt0, boolean z) {
            Objects.requireNonNull(str, "name == null");
            this.f44391a = str;
            this.f44392b = pt0;
            this.f44393c = z;
        }

        /* renamed from: a */
        public void mo65668a(ce5 ce5, T t) throws IOException {
            String a;
            if (t != null && (a = this.f44392b.mo50216a(t)) != null) {
                ce5.mo50874a(this.f44391a, a, this.f44393c);
            }
        }
    }

    /* renamed from: rl4$e */
    /* compiled from: ParameterHandler */
    public static final class C9261e<T> extends rl4<Map<String, T>> {

        /* renamed from: a */
        public final Method f44394a;

        /* renamed from: b */
        public final int f44395b;

        /* renamed from: c */
        public final pt0<T, String> f44396c;

        /* renamed from: d */
        public final boolean f44397d;

        public C9261e(Method method, int i, pt0<T, String> pt0, boolean z) {
            this.f44394a = method;
            this.f44395b = i;
            this.f44396c = pt0;
            this.f44397d = z;
        }

        /* renamed from: d */
        public void mo65668a(ce5 ce5, Map<String, T> map) throws IOException {
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    String str = (String) next.getKey();
                    if (str != null) {
                        Object value = next.getValue();
                        if (value != null) {
                            String a = this.f44396c.mo50216a(value);
                            if (a != null) {
                                ce5.mo50874a(str, a, this.f44397d);
                            } else {
                                Method method = this.f44394a;
                                int i = this.f44395b;
                                throw t77.m72184o(method, i, "Field map value '" + value + "' converted to null by " + this.f44396c.getClass().getName() + " for key '" + str + "'.", new Object[0]);
                            }
                        } else {
                            Method method2 = this.f44394a;
                            int i2 = this.f44395b;
                            throw t77.m72184o(method2, i2, "Field map contained null value for key '" + str + "'.", new Object[0]);
                        }
                    } else {
                        throw t77.m72184o(this.f44394a, this.f44395b, "Field map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw t77.m72184o(this.f44394a, this.f44395b, "Field map was null.", new Object[0]);
        }
    }

    /* renamed from: rl4$f */
    /* compiled from: ParameterHandler */
    public static final class C9262f<T> extends rl4<T> {

        /* renamed from: a */
        public final String f44398a;

        /* renamed from: b */
        public final pt0<T, String> f44399b;

        public C9262f(String str, pt0<T, String> pt0) {
            Objects.requireNonNull(str, "name == null");
            this.f44398a = str;
            this.f44399b = pt0;
        }

        /* renamed from: a */
        public void mo65668a(ce5 ce5, T t) throws IOException {
            String a;
            if (t != null && (a = this.f44399b.mo50216a(t)) != null) {
                ce5.mo50875b(this.f44398a, a);
            }
        }
    }

    /* renamed from: rl4$g */
    /* compiled from: ParameterHandler */
    public static final class C9263g<T> extends rl4<Map<String, T>> {

        /* renamed from: a */
        public final Method f44400a;

        /* renamed from: b */
        public final int f44401b;

        /* renamed from: c */
        public final pt0<T, String> f44402c;

        public C9263g(Method method, int i, pt0<T, String> pt0) {
            this.f44400a = method;
            this.f44401b = i;
            this.f44402c = pt0;
        }

        /* renamed from: d */
        public void mo65668a(ce5 ce5, Map<String, T> map) throws IOException {
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    String str = (String) next.getKey();
                    if (str != null) {
                        Object value = next.getValue();
                        if (value != null) {
                            ce5.mo50875b(str, this.f44402c.mo50216a(value));
                        } else {
                            Method method = this.f44400a;
                            int i = this.f44401b;
                            throw t77.m72184o(method, i, "Header map contained null value for key '" + str + "'.", new Object[0]);
                        }
                    } else {
                        throw t77.m72184o(this.f44400a, this.f44401b, "Header map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw t77.m72184o(this.f44400a, this.f44401b, "Header map was null.", new Object[0]);
        }
    }

    /* renamed from: rl4$h */
    /* compiled from: ParameterHandler */
    public static final class C9264h extends rl4<Headers> {

        /* renamed from: a */
        public final Method f44403a;

        /* renamed from: b */
        public final int f44404b;

        public C9264h(Method method, int i) {
            this.f44403a = method;
            this.f44404b = i;
        }

        /* renamed from: d */
        public void mo65668a(ce5 ce5, Headers headers) {
            if (headers != null) {
                ce5.mo50876c(headers);
                return;
            }
            throw t77.m72184o(this.f44403a, this.f44404b, "Headers parameter must not be null.", new Object[0]);
        }
    }

    /* renamed from: rl4$i */
    /* compiled from: ParameterHandler */
    public static final class C9265i<T> extends rl4<T> {

        /* renamed from: a */
        public final Method f44405a;

        /* renamed from: b */
        public final int f44406b;

        /* renamed from: c */
        public final Headers f44407c;

        /* renamed from: d */
        public final pt0<T, RequestBody> f44408d;

        public C9265i(Method method, int i, Headers headers, pt0<T, RequestBody> pt0) {
            this.f44405a = method;
            this.f44406b = i;
            this.f44407c = headers;
            this.f44408d = pt0;
        }

        /* renamed from: a */
        public void mo65668a(ce5 ce5, T t) {
            if (t != null) {
                try {
                    ce5.mo50877d(this.f44407c, this.f44408d.mo50216a(t));
                } catch (IOException e) {
                    Method method = this.f44405a;
                    int i = this.f44406b;
                    throw t77.m72184o(method, i, "Unable to convert " + t + " to RequestBody", e);
                }
            }
        }
    }

    /* renamed from: rl4$j */
    /* compiled from: ParameterHandler */
    public static final class C9266j<T> extends rl4<Map<String, T>> {

        /* renamed from: a */
        public final Method f44409a;

        /* renamed from: b */
        public final int f44410b;

        /* renamed from: c */
        public final pt0<T, RequestBody> f44411c;

        /* renamed from: d */
        public final String f44412d;

        public C9266j(Method method, int i, pt0<T, RequestBody> pt0, String str) {
            this.f44409a = method;
            this.f44410b = i;
            this.f44411c = pt0;
            this.f44412d = str;
        }

        /* renamed from: d */
        public void mo65668a(ce5 ce5, Map<String, T> map) throws IOException {
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    String str = (String) next.getKey();
                    if (str != null) {
                        Object value = next.getValue();
                        if (value != null) {
                            ce5.mo50877d(Headers.m70303of("Content-Disposition", "form-data; name=\"" + str + "\"", "Content-Transfer-Encoding", this.f44412d), this.f44411c.mo50216a(value));
                        } else {
                            Method method = this.f44409a;
                            int i = this.f44410b;
                            throw t77.m72184o(method, i, "Part map contained null value for key '" + str + "'.", new Object[0]);
                        }
                    } else {
                        throw t77.m72184o(this.f44409a, this.f44410b, "Part map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw t77.m72184o(this.f44409a, this.f44410b, "Part map was null.", new Object[0]);
        }
    }

    /* renamed from: rl4$k */
    /* compiled from: ParameterHandler */
    public static final class C9267k<T> extends rl4<T> {

        /* renamed from: a */
        public final Method f44413a;

        /* renamed from: b */
        public final int f44414b;

        /* renamed from: c */
        public final String f44415c;

        /* renamed from: d */
        public final pt0<T, String> f44416d;

        /* renamed from: e */
        public final boolean f44417e;

        public C9267k(Method method, int i, String str, pt0<T, String> pt0, boolean z) {
            this.f44413a = method;
            this.f44414b = i;
            Objects.requireNonNull(str, "name == null");
            this.f44415c = str;
            this.f44416d = pt0;
            this.f44417e = z;
        }

        /* renamed from: a */
        public void mo65668a(ce5 ce5, T t) throws IOException {
            if (t != null) {
                ce5.mo50879f(this.f44415c, this.f44416d.mo50216a(t), this.f44417e);
                return;
            }
            Method method = this.f44413a;
            int i = this.f44414b;
            throw t77.m72184o(method, i, "Path parameter \"" + this.f44415c + "\" value must not be null.", new Object[0]);
        }
    }

    /* renamed from: rl4$l */
    /* compiled from: ParameterHandler */
    public static final class C9268l<T> extends rl4<T> {

        /* renamed from: a */
        public final String f44418a;

        /* renamed from: b */
        public final pt0<T, String> f44419b;

        /* renamed from: c */
        public final boolean f44420c;

        public C9268l(String str, pt0<T, String> pt0, boolean z) {
            Objects.requireNonNull(str, "name == null");
            this.f44418a = str;
            this.f44419b = pt0;
            this.f44420c = z;
        }

        /* renamed from: a */
        public void mo65668a(ce5 ce5, T t) throws IOException {
            String a;
            if (t != null && (a = this.f44419b.mo50216a(t)) != null) {
                ce5.mo50880g(this.f44418a, a, this.f44420c);
            }
        }
    }

    /* renamed from: rl4$m */
    /* compiled from: ParameterHandler */
    public static final class C9269m<T> extends rl4<Map<String, T>> {

        /* renamed from: a */
        public final Method f44421a;

        /* renamed from: b */
        public final int f44422b;

        /* renamed from: c */
        public final pt0<T, String> f44423c;

        /* renamed from: d */
        public final boolean f44424d;

        public C9269m(Method method, int i, pt0<T, String> pt0, boolean z) {
            this.f44421a = method;
            this.f44422b = i;
            this.f44423c = pt0;
            this.f44424d = z;
        }

        /* renamed from: d */
        public void mo65668a(ce5 ce5, Map<String, T> map) throws IOException {
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    String str = (String) next.getKey();
                    if (str != null) {
                        Object value = next.getValue();
                        if (value != null) {
                            String a = this.f44423c.mo50216a(value);
                            if (a != null) {
                                ce5.mo50880g(str, a, this.f44424d);
                            } else {
                                Method method = this.f44421a;
                                int i = this.f44422b;
                                throw t77.m72184o(method, i, "Query map value '" + value + "' converted to null by " + this.f44423c.getClass().getName() + " for key '" + str + "'.", new Object[0]);
                            }
                        } else {
                            Method method2 = this.f44421a;
                            int i2 = this.f44422b;
                            throw t77.m72184o(method2, i2, "Query map contained null value for key '" + str + "'.", new Object[0]);
                        }
                    } else {
                        throw t77.m72184o(this.f44421a, this.f44422b, "Query map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw t77.m72184o(this.f44421a, this.f44422b, "Query map was null", new Object[0]);
        }
    }

    /* renamed from: rl4$n */
    /* compiled from: ParameterHandler */
    public static final class C9270n<T> extends rl4<T> {

        /* renamed from: a */
        public final pt0<T, String> f44425a;

        /* renamed from: b */
        public final boolean f44426b;

        public C9270n(pt0<T, String> pt0, boolean z) {
            this.f44425a = pt0;
            this.f44426b = z;
        }

        /* renamed from: a */
        public void mo65668a(ce5 ce5, T t) throws IOException {
            if (t != null) {
                ce5.mo50880g(this.f44425a.mo50216a(t), (String) null, this.f44426b);
            }
        }
    }

    /* renamed from: rl4$o */
    /* compiled from: ParameterHandler */
    public static final class C9271o extends rl4<MultipartBody.Part> {

        /* renamed from: a */
        public static final C9271o f44427a = new C9271o();

        /* renamed from: d */
        public void mo65668a(ce5 ce5, MultipartBody.Part part) {
            if (part != null) {
                ce5.mo50878e(part);
            }
        }
    }

    /* renamed from: rl4$p */
    /* compiled from: ParameterHandler */
    public static final class C9272p extends rl4<Object> {

        /* renamed from: a */
        public final Method f44428a;

        /* renamed from: b */
        public final int f44429b;

        public C9272p(Method method, int i) {
            this.f44428a = method;
            this.f44429b = i;
        }

        /* renamed from: a */
        public void mo65668a(ce5 ce5, Object obj) {
            if (obj != null) {
                ce5.mo50884m(obj);
                return;
            }
            throw t77.m72184o(this.f44428a, this.f44429b, "@Url parameter is null.", new Object[0]);
        }
    }

    /* renamed from: rl4$q */
    /* compiled from: ParameterHandler */
    public static final class C9273q<T> extends rl4<T> {

        /* renamed from: a */
        public final Class<T> f44430a;

        public C9273q(Class<T> cls) {
            this.f44430a = cls;
        }

        /* renamed from: a */
        public void mo65668a(ce5 ce5, T t) {
            ce5.mo50881h(this.f44430a, t);
        }
    }

    /* renamed from: a */
    public abstract void mo65668a(ce5 ce5, T t) throws IOException;

    /* renamed from: b */
    public final rl4<Object> mo65669b() {
        return new C9258b();
    }

    /* renamed from: c */
    public final rl4<Iterable<T>> mo65670c() {
        return new C9257a();
    }
}
