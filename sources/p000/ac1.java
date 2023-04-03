package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Pair;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BG\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012&\u0010\u0013\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u00100\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0002R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000bR4\u0010\u0013\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u00100\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, mo44877d2 = {"Lac1;", "Lhw5;", "Lrw2;", "", "iterator", "", "a", "Ljava/lang/CharSequence;", "input", "", "b", "I", "startIndex", "c", "limit", "Lkotlin/Function2;", "Lkotlin/Pair;", "d", "Lfd2;", "getNextMatch", "<init>", "(Ljava/lang/CharSequence;IILfd2;)V", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: ac1 */
/* compiled from: Strings.kt */
public final class ac1 implements hw5<rw2> {

    /* renamed from: a */
    public final CharSequence f36413a;

    /* renamed from: b */
    public final int f36414b;

    /* renamed from: c */
    public final int f36415c;

    /* renamed from: d */
    public final fd2<CharSequence, Integer, Pair<Integer, Integer>> f36416d;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000#\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u001a*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u0002J\t\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002R\"\u0010\u000e\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0012\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\t\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\"\u0010\u0016\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\rR$\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010!\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\t\u001a\u0004\b\u001f\u0010\u000b\"\u0004\b \u0010\r¨\u0006\""}, mo44877d2 = {"ac1$a", "", "Lrw2;", "b", "", "hasNext", "Lr37;", "a", "", "I", "getNextState", "()I", "setNextState", "(I)V", "nextState", "d", "getCurrentStartIndex", "setCurrentStartIndex", "currentStartIndex", "e", "getNextSearchIndex", "setNextSearchIndex", "nextSearchIndex", "g", "Lrw2;", "getNextItem", "()Lrw2;", "setNextItem", "(Lrw2;)V", "nextItem", "k", "getCounter", "setCounter", "counter", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: ac1$a */
    /* compiled from: Strings.kt */
    public static final class C6816a implements Iterator<rw2>, a93 {

        /* renamed from: a */
        public int f36417a = -1;

        /* renamed from: d */
        public int f36418d;

        /* renamed from: e */
        public int f36419e;

        /* renamed from: g */
        public rw2 f36420g;

        /* renamed from: k */
        public int f36421k;

        /* renamed from: r */
        public final /* synthetic */ ac1 f36422r;

        public C6816a(ac1 ac1) {
            this.f36422r = ac1;
            int k = d75.m43389k(ac1.f36414b, 0, ac1.f36413a.length());
            this.f36418d = k;
            this.f36419e = k;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
            if (r0 < p000.ac1.m55437d(r6.f36422r)) goto L_0x0023;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo50125a() {
            /*
                r6 = this;
                int r0 = r6.f36419e
                r1 = 0
                if (r0 >= 0) goto L_0x000c
                r6.f36417a = r1
                r0 = 0
                r6.f36420g = r0
                goto L_0x009e
            L_0x000c:
                ac1 r0 = r6.f36422r
                int r0 = r0.f36415c
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L_0x0023
                int r0 = r6.f36421k
                int r0 = r0 + r3
                r6.f36421k = r0
                ac1 r4 = r6.f36422r
                int r4 = r4.f36415c
                if (r0 >= r4) goto L_0x0031
            L_0x0023:
                int r0 = r6.f36419e
                ac1 r4 = r6.f36422r
                java.lang.CharSequence r4 = r4.f36413a
                int r4 = r4.length()
                if (r0 <= r4) goto L_0x0047
            L_0x0031:
                rw2 r0 = new rw2
                int r1 = r6.f36418d
                ac1 r4 = r6.f36422r
                java.lang.CharSequence r4 = r4.f36413a
                int r4 = kotlin.text.StringsKt__StringsKt.m63094Y(r4)
                r0.<init>(r1, r4)
                r6.f36420g = r0
                r6.f36419e = r2
                goto L_0x009c
            L_0x0047:
                ac1 r0 = r6.f36422r
                fd2 r0 = r0.f36416d
                ac1 r4 = r6.f36422r
                java.lang.CharSequence r4 = r4.f36413a
                int r5 = r6.f36419e
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.invoke(r4, r5)
                kotlin.Pair r0 = (kotlin.Pair) r0
                if (r0 != 0) goto L_0x0077
                rw2 r0 = new rw2
                int r1 = r6.f36418d
                ac1 r4 = r6.f36422r
                java.lang.CharSequence r4 = r4.f36413a
                int r4 = kotlin.text.StringsKt__StringsKt.m63094Y(r4)
                r0.<init>(r1, r4)
                r6.f36420g = r0
                r6.f36419e = r2
                goto L_0x009c
            L_0x0077:
                java.lang.Object r2 = r0.component1()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.component2()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f36418d
                rw2 r4 = p000.d75.m43395q(r4, r2)
                r6.f36420g = r4
                int r2 = r2 + r0
                r6.f36418d = r2
                if (r0 != 0) goto L_0x0099
                r1 = r3
            L_0x0099:
                int r2 = r2 + r1
                r6.f36419e = r2
            L_0x009c:
                r6.f36417a = r3
            L_0x009e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.ac1.C6816a.mo50125a():void");
        }

        /* renamed from: b */
        public rw2 next() {
            if (this.f36417a == -1) {
                mo50125a();
            }
            if (this.f36417a != 0) {
                rw2 rw2 = this.f36420g;
                vx2.m53589e(rw2, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                this.f36420g = null;
                this.f36417a = -1;
                return rw2;
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            if (this.f36417a == -1) {
                mo50125a();
            }
            if (this.f36417a == 1) {
                return true;
            }
            return false;
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public ac1(CharSequence charSequence, int i, int i2, fd2<? super CharSequence, ? super Integer, Pair<Integer, Integer>> fd2) {
        vx2.m53591g(charSequence, "input");
        vx2.m53591g(fd2, "getNextMatch");
        this.f36413a = charSequence;
        this.f36414b = i;
        this.f36415c = i2;
        this.f36416d = fd2;
    }

    public Iterator<rw2> iterator() {
        return new C6816a(this);
    }
}
