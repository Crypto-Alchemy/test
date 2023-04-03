package java8.util.stream;

import p000.z66;

/* renamed from: java8.util.stream.d */
/* compiled from: Node */
public interface C6068d<T> {

    /* renamed from: java8.util.stream.d$a */
    /* compiled from: Node */
    public interface C6069a<T> extends C6095h<T> {
        C6068d<T> build();
    }

    /* renamed from: java8.util.stream.d$b */
    /* compiled from: Node */
    public interface C6070b extends C6073e<Double, ni1, double[], z66.C6755a, C6070b> {
    }

    /* renamed from: java8.util.stream.d$c */
    /* compiled from: Node */
    public interface C6071c extends C6073e<Integer, jw2, int[], z66.C6756b, C6071c> {
    }

    /* renamed from: java8.util.stream.d$d */
    /* compiled from: Node */
    public interface C6072d extends C6073e<Long, dl3, long[], z66.C6757c, C6072d> {
    }

    /* renamed from: java8.util.stream.d$e */
    /* compiled from: Node */
    public interface C6073e<T, T_CONS, T_ARR, T_SPLITR extends z66.C6758d<T, T_CONS, T_SPLITR>, T_NODE extends C6073e<T, T_CONS, T_ARR, T_SPLITR, T_NODE>> extends C6068d<T> {
        /* renamed from: a */
        void mo44371a(T_CONS t_cons);

        T_SPLITR spliterator();
    }

    /* renamed from: c */
    void mo44368c(xq0<? super T> xq0);

    z66<T> spliterator();
}
