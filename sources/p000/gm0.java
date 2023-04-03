package p000;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import p000.l90;
import retrofit2.HttpException;

@IgnoreJRERequirement
/* renamed from: gm0 */
/* compiled from: CompletableFutureCallAdapterFactory */
public final class gm0 extends l90.C7825a {

    /* renamed from: a */
    public static final l90.C7825a f38037a = new gm0();

    @IgnoreJRERequirement
    /* renamed from: gm0$a */
    /* compiled from: CompletableFutureCallAdapterFactory */
    public static final class C7134a<R> implements l90<R, CompletableFuture<R>> {

        /* renamed from: a */
        public final Type f38038a;

        @IgnoreJRERequirement
        /* renamed from: gm0$a$a */
        /* compiled from: CompletableFutureCallAdapterFactory */
        public class C7135a implements p90<R> {

            /* renamed from: a */
            public final CompletableFuture<R> f38039a;

            public C7135a(CompletableFuture<R> completableFuture) {
                this.f38039a = completableFuture;
            }

            /* renamed from: a */
            public void mo47103a(k90<R> k90, Throwable th) {
                this.f38039a.completeExceptionally(th);
            }

            /* renamed from: b */
            public void mo47104b(k90<R> k90, bg5<R> bg5) {
                if (bg5.mo50581e()) {
                    this.f38039a.complete(bg5.mo50578a());
                } else {
                    this.f38039a.completeExceptionally(new HttpException(bg5));
                }
            }
        }

        public C7134a(Type type) {
            this.f38038a = type;
        }

        /* renamed from: a */
        public Type mo50509a() {
            return this.f38038a;
        }

        /* renamed from: c */
        public CompletableFuture<R> mo50510b(k90<R> k90) {
            C7136b bVar = new C7136b(k90);
            k90.mo50512X(new C7135a(bVar));
            return bVar;
        }
    }

    @IgnoreJRERequirement
    /* renamed from: gm0$b */
    /* compiled from: CompletableFutureCallAdapterFactory */
    public static final class C7136b<T> extends CompletableFuture<T> {

        /* renamed from: a */
        public final k90<?> f38041a;

        public C7136b(k90<?> k90) {
            this.f38041a = k90;
        }

        public boolean cancel(boolean z) {
            if (z) {
                this.f38041a.cancel();
            }
            return super.cancel(z);
        }
    }

    @IgnoreJRERequirement
    /* renamed from: gm0$c */
    /* compiled from: CompletableFutureCallAdapterFactory */
    public static final class C7137c<R> implements l90<R, CompletableFuture<bg5<R>>> {

        /* renamed from: a */
        public final Type f38042a;

        @IgnoreJRERequirement
        /* renamed from: gm0$c$a */
        /* compiled from: CompletableFutureCallAdapterFactory */
        public class C7138a implements p90<R> {

            /* renamed from: a */
            public final CompletableFuture<bg5<R>> f38043a;

            public C7138a(CompletableFuture<bg5<R>> completableFuture) {
                this.f38043a = completableFuture;
            }

            /* renamed from: a */
            public void mo47103a(k90<R> k90, Throwable th) {
                this.f38043a.completeExceptionally(th);
            }

            /* renamed from: b */
            public void mo47104b(k90<R> k90, bg5<R> bg5) {
                this.f38043a.complete(bg5);
            }
        }

        public C7137c(Type type) {
            this.f38042a = type;
        }

        /* renamed from: a */
        public Type mo50509a() {
            return this.f38042a;
        }

        /* renamed from: c */
        public CompletableFuture<bg5<R>> mo50510b(k90<R> k90) {
            C7136b bVar = new C7136b(k90);
            k90.mo50512X(new C7138a(bVar));
            return bVar;
        }
    }

    /* renamed from: a */
    public l90<?, ?> mo50508a(Type type, Annotation[] annotationArr, og5 og5) {
        if (l90.C7825a.m63732c(type) != CompletableFuture.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type b = l90.C7825a.m63731b(0, (ParameterizedType) type);
            if (l90.C7825a.m63732c(b) != bg5.class) {
                return new C7134a(b);
            }
            if (b instanceof ParameterizedType) {
                return new C7137c(l90.C7825a.m63731b(0, (ParameterizedType) b));
            }
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
    }
}
