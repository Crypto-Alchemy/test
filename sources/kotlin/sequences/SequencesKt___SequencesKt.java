package kotlin.sequences;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\\\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010!\n\u0002\b\n\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001f\u0010\u0002\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001d\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0004\u0010\u0003\u001a$\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0006\u001a\u00020\u0005\u001a0\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007\u001a0\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007\u001a\"\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0000*\u00020\f*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001\u001a0\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007\u001a7\u0010\u0010\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0010\b\u0001\u0010\u0010*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u000f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0011\u001a\u00028\u0001¢\u0006\u0004\b\u0010\u0010\u0012\u001a\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a<\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0017*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00010\u0007\u001a6\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0017*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u001a<\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0017*\u00020\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0007\u001a\u0016\u0010\u001c\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a.\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u001d\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a-\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 H\u0002\u001a}\u0010,\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\f\b\u0001\u0010\u001e*\u00060#j\u0002`$*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010%\u001a\u00028\u00012\b\b\u0002\u0010'\u001a\u00020&2\b\b\u0002\u0010(\u001a\u00020&2\b\b\u0002\u0010)\u001a\u00020&2\b\b\u0002\u0010*\u001a\u00020\u00052\b\b\u0002\u0010+\u001a\u00020&2\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020&\u0018\u00010\u0007¢\u0006\u0004\b,\u0010-\u001a`\u0010/\u001a\u00020.\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010'\u001a\u00020&2\b\b\u0002\u0010(\u001a\u00020&2\b\b\u0002\u0010)\u001a\u00020&2\b\b\u0002\u0010*\u001a\u00020\u00052\b\b\u0002\u0010+\u001a\u00020&2\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020&\u0018\u00010\u0007\u001a\u001c\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000 \"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u00061"}, mo44877d2 = {"T", "Lhw5;", "r", "(Lhw5;)Ljava/lang/Object;", "w", "", "n", "Lkotlin/Function1;", "", "predicate", "o", "p", "", "q", "B", "", "C", "destination", "(Lhw5;Ljava/util/Collection;)Ljava/util/Collection;", "", "D", "", "E", "R", "transform", "s", "x", "y", "m", "element", "A", "(Lhw5;Ljava/lang/Object;)Lhw5;", "", "elements", "z", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "buffer", "", "separator", "prefix", "postfix", "limit", "truncated", "t", "(Lhw5;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lrc2;)Ljava/lang/Appendable;", "", "u", "l", "kotlin-stdlib"}, mo44878k = 5, mo44879mv = {1, 7, 1}, mo44882xs = "kotlin/sequences/SequencesKt")
/* compiled from: _Sequences.kt */
public class SequencesKt___SequencesKt extends mw5 {

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010\u001c\n\u0002\u0010(\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0002¨\u0006\u0004"}, mo44877d2 = {"kotlin/sequences/SequencesKt___SequencesKt$a", "", "", "iterator", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: kotlin.sequences.SequencesKt___SequencesKt$a */
    /* compiled from: Iterables.kt */
    public static final class C7745a implements Iterable<T>, a93 {

        /* renamed from: a */
        public final /* synthetic */ hw5 f40335a;

        public C7745a(hw5 hw5) {
            this.f40335a = hw5;
        }

        public Iterator<T> iterator() {
            return this.f40335a.iterator();
        }
    }

    /* renamed from: A */
    public static final <T> hw5<T> m63017A(hw5<? extends T> hw5, T t) {
        vx2.m53591g(hw5, "<this>");
        return SequencesKt__SequencesKt.m63011f(SequencesKt__SequencesKt.m63016k(hw5, SequencesKt__SequencesKt.m63016k(t)));
    }

    /* renamed from: B */
    public static final <T> hw5<T> m63018B(hw5<? extends T> hw5, rc2<? super T, Boolean> rc2) {
        vx2.m53591g(hw5, "<this>");
        vx2.m53591g(rc2, "predicate");
        return new ol6(hw5, rc2);
    }

    /* renamed from: C */
    public static final <T, C extends Collection<? super T>> C m63019C(hw5<? extends T> hw5, C c) {
        vx2.m53591g(hw5, "<this>");
        vx2.m53591g(c, "destination");
        for (Object add : hw5) {
            c.add(add);
        }
        return c;
    }

    /* renamed from: D */
    public static final <T> List<T> m63020D(hw5<? extends T> hw5) {
        vx2.m53591g(hw5, "<this>");
        return ck0.m33069q(m63021E(hw5));
    }

    /* renamed from: E */
    public static final <T> List<T> m63021E(hw5<? extends T> hw5) {
        vx2.m53591g(hw5, "<this>");
        return (List) m63019C(hw5, new ArrayList());
    }

    /* renamed from: l */
    public static final <T> Iterable<T> m63022l(hw5<? extends T> hw5) {
        vx2.m53591g(hw5, "<this>");
        return new C7745a(hw5);
    }

    /* renamed from: m */
    public static final <T> int m63023m(hw5<? extends T> hw5) {
        vx2.m53591g(hw5, "<this>");
        Iterator<? extends T> it = hw5.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
            if (i < 0) {
                ck0.m33071s();
            }
        }
        return i;
    }

    /* renamed from: n */
    public static final <T> hw5<T> m63024n(hw5<? extends T> hw5, int i) {
        boolean z;
        vx2.m53591g(hw5, "<this>");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        } else if (i == 0) {
            return hw5;
        } else {
            if (hw5 instanceof xk1) {
                return ((xk1) hw5).mo66723a(i);
            }
            return new wk1(hw5, i);
        }
    }

    /* renamed from: o */
    public static final <T> hw5<T> m63025o(hw5<? extends T> hw5, rc2<? super T, Boolean> rc2) {
        vx2.m53591g(hw5, "<this>");
        vx2.m53591g(rc2, "predicate");
        return new u12(hw5, true, rc2);
    }

    /* renamed from: p */
    public static final <T> hw5<T> m63026p(hw5<? extends T> hw5, rc2<? super T, Boolean> rc2) {
        vx2.m53591g(hw5, "<this>");
        vx2.m53591g(rc2, "predicate");
        return new u12(hw5, false, rc2);
    }

    /* renamed from: q */
    public static final <T> hw5<T> m63027q(hw5<? extends T> hw5) {
        vx2.m53591g(hw5, "<this>");
        hw5<T> p = m63026p(hw5, SequencesKt___SequencesKt$filterNotNull$1.INSTANCE);
        vx2.m53589e(p, "null cannot be cast to non-null type kotlin.sequences.Sequence<T of kotlin.sequences.SequencesKt___SequencesKt.filterNotNull>");
        return p;
    }

    /* renamed from: r */
    public static final <T> T m63028r(hw5<? extends T> hw5) {
        vx2.m53591g(hw5, "<this>");
        Iterator<? extends T> it = hw5.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return it.next();
    }

    /* renamed from: s */
    public static final <T, R> hw5<R> m63029s(hw5<? extends T> hw5, rc2<? super T, ? extends hw5<? extends R>> rc2) {
        vx2.m53591g(hw5, "<this>");
        vx2.m53591g(rc2, "transform");
        return new e42(hw5, rc2, SequencesKt___SequencesKt$flatMap$2.INSTANCE);
    }

    /* renamed from: t */
    public static final <T, A extends Appendable> A m63030t(hw5<? extends T> hw5, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, rc2<? super T, ? extends CharSequence> rc2) {
        vx2.m53591g(hw5, "<this>");
        vx2.m53591g(a, "buffer");
        vx2.m53591g(charSequence, "separator");
        vx2.m53591g(charSequence2, "prefix");
        vx2.m53591g(charSequence3, "postfix");
        vx2.m53591g(charSequence4, "truncated");
        a.append(charSequence2);
        int i2 = 0;
        for (Object next : hw5) {
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            rb6.m71504a(a, next, rc2);
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    /* renamed from: u */
    public static final <T> String m63031u(hw5<? extends T> hw5, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, rc2<? super T, ? extends CharSequence> rc2) {
        vx2.m53591g(hw5, "<this>");
        vx2.m53591g(charSequence, "separator");
        vx2.m53591g(charSequence2, "prefix");
        vx2.m53591g(charSequence3, "postfix");
        vx2.m53591g(charSequence4, "truncated");
        String sb = ((StringBuilder) m63030t(hw5, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, rc2)).toString();
        vx2.m53590f(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    /* renamed from: v */
    public static /* synthetic */ String m63032v(hw5 hw5, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, rc2 rc2, int i2, Object obj) {
        CharSequence charSequence5;
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence6 = "";
        if ((i2 & 2) != 0) {
            charSequence5 = charSequence6;
        } else {
            charSequence5 = charSequence2;
        }
        if ((i2 & 4) == 0) {
            charSequence6 = charSequence3;
        }
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            rc2 = null;
        }
        return m63031u(hw5, charSequence, charSequence5, charSequence6, i3, charSequence7, rc2);
    }

    /* renamed from: w */
    public static final <T> T m63033w(hw5<? extends T> hw5) {
        vx2.m53591g(hw5, "<this>");
        Iterator<? extends T> it = hw5.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                next = it.next();
            }
            return next;
        }
        throw new NoSuchElementException("Sequence is empty.");
    }

    /* renamed from: x */
    public static final <T, R> hw5<R> m63034x(hw5<? extends T> hw5, rc2<? super T, ? extends R> rc2) {
        vx2.m53591g(hw5, "<this>");
        vx2.m53591g(rc2, "transform");
        return new uw6(hw5, rc2);
    }

    /* renamed from: y */
    public static final <T, R> hw5<R> m63035y(hw5<? extends T> hw5, rc2<? super T, ? extends R> rc2) {
        vx2.m53591g(hw5, "<this>");
        vx2.m53591g(rc2, "transform");
        return m63027q(new uw6(hw5, rc2));
    }

    /* renamed from: z */
    public static final <T> hw5<T> m63036z(hw5<? extends T> hw5, Iterable<? extends T> iterable) {
        vx2.m53591g(hw5, "<this>");
        vx2.m53591g(iterable, "elements");
        return SequencesKt__SequencesKt.m63011f(SequencesKt__SequencesKt.m63016k(hw5, CollectionsKt___CollectionsKt.m47318Q(iterable)));
    }
}
