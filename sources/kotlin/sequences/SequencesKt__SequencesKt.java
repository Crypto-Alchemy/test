package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a-\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\"\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0012\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000\u001a\"\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0002\u001aE\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\n*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002\u001a&\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0000*\u00020\u00102\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0011\u001a?\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0000*\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00018\u00002\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000bH\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a<\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0000*\u00020\u00102\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00112\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000b¨\u0006\u0019"}, mo44877d2 = {"T", "", "Lhw5;", "c", "", "elements", "k", "([Ljava/lang/Object;)Lhw5;", "e", "f", "R", "Lkotlin/Function1;", "iterator", "g", "(Lhw5;Lrc2;)Lhw5;", "d", "", "Lkotlin/Function0;", "nextFunction", "h", "seed", "j", "(Ljava/lang/Object;Lrc2;)Lhw5;", "seedFunction", "i", "kotlin-stdlib"}, mo44878k = 5, mo44879mv = {1, 7, 1}, mo44882xs = "kotlin/sequences/SequencesKt")
/* compiled from: Sequences.kt */
public class SequencesKt__SequencesKt extends lw5 {

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0002¨\u0006\u0004"}, mo44877d2 = {"kotlin/sequences/SequencesKt__SequencesKt$a", "Lhw5;", "", "iterator", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: kotlin.sequences.SequencesKt__SequencesKt$a */
    /* compiled from: Sequences.kt */
    public static final class C7744a implements hw5<T> {

        /* renamed from: a */
        public final /* synthetic */ Iterator f40334a;

        public C7744a(Iterator it) {
            this.f40334a = it;
        }

        public Iterator<T> iterator() {
            return this.f40334a;
        }
    }

    /* renamed from: c */
    public static final <T> hw5<T> m63008c(Iterator<? extends T> it) {
        vx2.m53591g(it, "<this>");
        return m63009d(new C7744a(it));
    }

    /* renamed from: d */
    public static final <T> hw5<T> m63009d(hw5<? extends T> hw5) {
        vx2.m53591g(hw5, "<this>");
        if (hw5 instanceof hq0) {
            return hw5;
        }
        return new hq0(hw5);
    }

    /* renamed from: e */
    public static final <T> hw5<T> m63010e() {
        return yo1.f46233a;
    }

    /* renamed from: f */
    public static final <T> hw5<T> m63011f(hw5<? extends hw5<? extends T>> hw5) {
        vx2.m53591g(hw5, "<this>");
        return m63012g(hw5, SequencesKt__SequencesKt$flatten$1.INSTANCE);
    }

    /* renamed from: g */
    public static final <T, R> hw5<R> m63012g(hw5<? extends T> hw5, rc2<? super T, ? extends Iterator<? extends R>> rc2) {
        if (hw5 instanceof uw6) {
            return ((uw6) hw5).mo66359d(rc2);
        }
        return new e42(hw5, SequencesKt__SequencesKt$flatten$3.INSTANCE, rc2);
    }

    /* renamed from: h */
    public static final <T> hw5<T> m63013h(pc2<? extends T> pc2) {
        vx2.m53591g(pc2, "nextFunction");
        return m63009d(new ef2(pc2, new SequencesKt__SequencesKt$generateSequence$1(pc2)));
    }

    /* renamed from: i */
    public static final <T> hw5<T> m63014i(pc2<? extends T> pc2, rc2<? super T, ? extends T> rc2) {
        vx2.m53591g(pc2, "seedFunction");
        vx2.m53591g(rc2, "nextFunction");
        return new ef2(pc2, rc2);
    }

    /* renamed from: j */
    public static final <T> hw5<T> m63015j(T t, rc2<? super T, ? extends T> rc2) {
        vx2.m53591g(rc2, "nextFunction");
        if (t == null) {
            return yo1.f46233a;
        }
        return new ef2(new SequencesKt__SequencesKt$generateSequence$2(t), rc2);
    }

    /* renamed from: k */
    public static final <T> hw5<T> m63016k(T... tArr) {
        boolean z;
        vx2.m53591g(tArr, "elements");
        if (tArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return m63010e();
        }
        return ArraysKt___ArraysKt.m47245B(tArr);
    }
}
