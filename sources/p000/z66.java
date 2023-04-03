package p000;

import java.util.Comparator;

/* renamed from: z66 */
/* compiled from: Spliterator */
public interface z66<T> {

    /* renamed from: z66$a */
    /* compiled from: Spliterator */
    public interface C6755a extends C6758d<Double, ni1, C6755a> {
        /* renamed from: a */
        void mo29473a(xq0<? super Double> xq0);

        /* renamed from: f */
        void mo29485f(ni1 ni1);

        /* renamed from: g */
        boolean mo29486g(ni1 ni1);
    }

    /* renamed from: z66$b */
    /* compiled from: Spliterator */
    public interface C6756b extends C6758d<Integer, jw2, C6756b> {
        /* renamed from: a */
        void mo29473a(xq0<? super Integer> xq0);

        /* renamed from: d */
        boolean mo29487d(jw2 jw2);

        /* renamed from: e */
        void mo29488e(jw2 jw2);
    }

    /* renamed from: z66$c */
    /* compiled from: Spliterator */
    public interface C6757c extends C6758d<Long, dl3, C6757c> {
        /* renamed from: a */
        void mo29473a(xq0<? super Long> xq0);

        /* renamed from: b */
        void mo29489b(dl3 dl3);

        /* renamed from: h */
        boolean mo29490h(dl3 dl3);
    }

    /* renamed from: z66$d */
    /* compiled from: Spliterator */
    public interface C6758d<T, T_CONS, T_SPLITR extends C6758d<T, T_CONS, T_SPLITR>> extends z66<T> {
    }

    /* renamed from: a */
    void mo29473a(xq0<? super T> xq0);

    /* renamed from: c */
    boolean mo29474c(xq0<? super T> xq0);

    int characteristics();

    long estimateSize();

    Comparator<? super T> getComparator();

    long getExactSizeIfKnown();

    boolean hasCharacteristics(int i);

    z66<T> trySplit();
}
