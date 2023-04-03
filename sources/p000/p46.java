package p000;

import androidx.compose.runtime.ComposerKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b,\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010.\u001a\u00020*¢\u0006\u0004\b\\\u0010]J\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u000e\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003J\u0010\u0010\f\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0003J\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003J\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001J\u0006\u0010\u0019\u001a\u00020\u0018J\u0006\u0010\u001a\u001a\u00020\u0018J\u0006\u0010\u001b\u001a\u00020\u0018J\u0006\u0010\u001c\u001a\u00020\u0018J\u0006\u0010\u001d\u001a\u00020\u0018J\u0006\u0010\u001e\u001a\u00020\u0003J\u0006\u0010\u001f\u001a\u00020\u0018J\u000e\u0010 \u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010!\u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u0003J\u0006\u0010\"\u001a\u00020\u0018J\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#J\b\u0010'\u001a\u00020&H\u0016J\u0010\u0010)\u001a\u00020(2\b\b\u0002\u0010\u0004\u001a\u00020\u0003R\u001a\u0010.\u001a\u00020*8\u0000X\u0004¢\u0006\f\n\u0004\b)\u0010+\u001a\u0004\b,\u0010-R\u0014\u00100\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010/R\u0014\u00101\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0005R\u001c\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u00103R\u0014\u00105\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0005R$\u0010:\u001a\u00020\t2\u0006\u00106\u001a\u00020\t8\u0006@BX\u000e¢\u0006\f\n\u0004\b\u001a\u00107\u001a\u0004\b8\u00109R$\u0010=\u001a\u00020\u00032\u0006\u00106\u001a\u00020\u00038\u0006@BX\u000e¢\u0006\f\n\u0004\b\"\u0010\u0005\u001a\u0004\b;\u0010<R$\u0010?\u001a\u00020\u00032\u0006\u00106\u001a\u00020\u00038\u0006@BX\u000e¢\u0006\f\n\u0004\b%\u0010\u0005\u001a\u0004\b>\u0010<R$\u0010A\u001a\u00020\u00032\u0006\u00106\u001a\u00020\u00038\u0006@BX\u000e¢\u0006\f\n\u0004\b8\u0010\u0005\u001a\u0004\b@\u0010<R\u0016\u0010B\u001a\u00020\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b;\u0010\u0005R\u0016\u0010D\u001a\u00020\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bC\u0010\u0005R\u0016\u0010F\u001a\u00020\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bE\u0010\u0005R\u0011\u0010H\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bG\u0010<R\u0011\u0010J\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bI\u00109R\u0011\u0010L\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bK\u00109R\u0011\u0010N\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bM\u00109R\u0011\u0010P\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bO\u0010<R\u0011\u0010Q\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bE\u0010<R\u0011\u0010S\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bR\u0010<R\u0011\u0010U\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bT\u0010<R\u0013\u0010X\u001a\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\bV\u0010WR\u0013\u0010Y\u001a\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\bC\u0010WR\u0011\u0010[\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bZ\u0010<¨\u0006^"}, mo44877d2 = {"Lp46;", "", "", "", "index", "I", "b", "K", "L", "", "F", "J", "H", "A", "y", "C", "z", "v", "B", "e", "w", "group", "x", "G", "Lr37;", "c", "f", "d", "Q", "R", "O", "P", "M", "N", "g", "", "Lpa3;", "h", "", "toString", "Lbg;", "a", "Lq46;", "Lq46;", "u", "()Lq46;", "table", "[I", "groups", "groupsSize", "", "[Ljava/lang/Object;", "slots", "slotsSize", "<set-?>", "Z", "i", "()Z", "closed", "j", "()I", "currentGroup", "getCurrentEnd", "currentEnd", "r", "parent", "emptyCount", "k", "currentSlot", "l", "currentSlotEnd", "t", "size", "E", "isNode", "D", "isGroupEnd", "q", "inEmpty", "o", "groupSize", "groupEnd", "m", "groupKey", "p", "groupSlotIndex", "n", "()Ljava/lang/Object;", "groupObjectKey", "groupAux", "s", "parentNodes", "<init>", "(Lq46;)V", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: p46 */
/* compiled from: SlotTable.kt */
public final class p46 {

    /* renamed from: a */
    public final q46 f16300a;

    /* renamed from: b */
    public final int[] f16301b;

    /* renamed from: c */
    public final int f16302c;

    /* renamed from: d */
    public final Object[] f16303d;

    /* renamed from: e */
    public final int f16304e;

    /* renamed from: f */
    public boolean f16305f;

    /* renamed from: g */
    public int f16306g;

    /* renamed from: h */
    public int f16307h;

    /* renamed from: i */
    public int f16308i = -1;

    /* renamed from: j */
    public int f16309j;

    /* renamed from: k */
    public int f16310k;

    /* renamed from: l */
    public int f16311l;

    public p46(q46 q46) {
        vx2.m53591g(q46, "table");
        this.f16300a = q46;
        this.f16301b = q46.mo24937r();
        int s = q46.mo24938s();
        this.f16302c = s;
        this.f16303d = q46.mo24939t();
        this.f16304e = q46.mo24940u();
        this.f16307h = s;
    }

    /* renamed from: A */
    public final int mo24393A(int i) {
        return s46.m26597G(this.f16301b, i);
    }

    /* renamed from: B */
    public final boolean mo24394B(int i) {
        return s46.m26599I(this.f16301b, i);
    }

    /* renamed from: C */
    public final boolean mo24395C(int i) {
        return s46.m26600J(this.f16301b, i);
    }

    /* renamed from: D */
    public final boolean mo24396D() {
        if (mo24427q() || this.f16306g == this.f16307h) {
            return true;
        }
        return false;
    }

    /* renamed from: E */
    public final boolean mo24397E() {
        return s46.m26602L(this.f16301b, this.f16306g);
    }

    /* renamed from: F */
    public final boolean mo24398F(int i) {
        return s46.m26602L(this.f16301b, i);
    }

    /* renamed from: G */
    public final Object mo24399G() {
        int i;
        if (this.f16309j > 0 || (i = this.f16310k) >= this.f16311l) {
            return nn0.f15626a.mo23753a();
        }
        Object[] objArr = this.f16303d;
        this.f16310k = i + 1;
        return objArr[i];
    }

    /* renamed from: H */
    public final Object mo24400H(int i) {
        if (s46.m26602L(this.f16301b, i)) {
            return mo24401I(this.f16301b, i);
        }
        return null;
    }

    /* renamed from: I */
    public final Object mo24401I(int[] iArr, int i) {
        if (s46.m26602L(iArr, i)) {
            return this.f16303d[s46.m26606P(iArr, i)];
        }
        return nn0.f15626a.mo23753a();
    }

    /* renamed from: J */
    public final int mo24402J(int i) {
        return s46.m26605O(this.f16301b, i);
    }

    /* renamed from: K */
    public final Object mo24403K(int[] iArr, int i) {
        if (s46.m26600J(iArr, i)) {
            return this.f16303d[s46.m26607Q(iArr, i)];
        }
        return null;
    }

    /* renamed from: L */
    public final int mo24404L(int i) {
        return s46.m26608R(this.f16301b, i);
    }

    /* renamed from: M */
    public final void mo24405M(int i) {
        boolean z;
        int i2;
        if (this.f16309j == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f16306g = i;
            if (i < this.f16302c) {
                i2 = s46.m26608R(this.f16301b, i);
            } else {
                i2 = -1;
            }
            this.f16308i = i2;
            if (i2 < 0) {
                this.f16307h = this.f16302c;
            } else {
                this.f16307h = i2 + s46.m26597G(this.f16301b, i2);
            }
            this.f16310k = 0;
            this.f16311l = 0;
            return;
        }
        ComposerKt.m2032x("Cannot reposition while in an empty region".toString());
        throw new KotlinNothingValueException();
    }

    /* renamed from: N */
    public final void mo24406N(int i) {
        boolean z;
        int g = s46.m26597G(this.f16301b, i) + i;
        int i2 = this.f16306g;
        if (i2 < i || i2 > g) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            this.f16308i = i;
            this.f16307h = g;
            this.f16310k = 0;
            this.f16311l = 0;
            return;
        }
        ComposerKt.m2032x(("Index " + i + " is not a parent of " + i2).toString());
        throw new KotlinNothingValueException();
    }

    /* renamed from: O */
    public final int mo24407O() {
        boolean z;
        int i = 1;
        if (this.f16309j == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (!s46.m26602L(this.f16301b, this.f16306g)) {
                i = s46.m26605O(this.f16301b, this.f16306g);
            }
            int i2 = this.f16306g;
            this.f16306g = i2 + s46.m26597G(this.f16301b, i2);
            return i;
        }
        ComposerKt.m2032x("Cannot skip while in an empty region".toString());
        throw new KotlinNothingValueException();
    }

    /* renamed from: P */
    public final void mo24408P() {
        boolean z;
        if (this.f16309j == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f16306g = this.f16307h;
        } else {
            ComposerKt.m2032x("Cannot skip the enclosing group while in an empty region".toString());
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: Q */
    public final void mo24409Q() {
        boolean z;
        int i;
        if (this.f16309j <= 0) {
            if (s46.m26608R(this.f16301b, this.f16306g) == this.f16308i) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int i2 = this.f16306g;
                this.f16308i = i2;
                this.f16307h = i2 + s46.m26597G(this.f16301b, i2);
                int i3 = this.f16306g;
                int i4 = i3 + 1;
                this.f16306g = i4;
                this.f16310k = s46.m26610T(this.f16301b, i3);
                if (i3 >= this.f16302c - 1) {
                    i = this.f16304e;
                } else {
                    i = s46.m26595E(this.f16301b, i4);
                }
                this.f16311l = i;
                return;
            }
            throw new IllegalArgumentException("Invalid slot table detected".toString());
        }
    }

    /* renamed from: R */
    public final void mo24410R() {
        if (this.f16309j > 0) {
            return;
        }
        if (s46.m26602L(this.f16301b, this.f16306g)) {
            mo24409Q();
            return;
        }
        throw new IllegalArgumentException("Expected a node group".toString());
    }

    /* renamed from: a */
    public final C1628bg mo24411a(int i) {
        ArrayList<C1628bg> q = this.f16300a.mo24936q();
        int s = s46.m26609S(q, i, this.f16302c);
        if (s < 0) {
            C1628bg bgVar = new C1628bg(i);
            q.add(-(s + 1), bgVar);
            return bgVar;
        }
        C1628bg bgVar2 = q.get(s);
        vx2.m53590f(bgVar2, "get(location)");
        return bgVar2;
    }

    /* renamed from: b */
    public final Object mo24412b(int[] iArr, int i) {
        if (s46.m26598H(iArr, i)) {
            return this.f16303d[s46.m26591A(iArr, i)];
        }
        return nn0.f15626a.mo23753a();
    }

    /* renamed from: c */
    public final void mo24413c() {
        this.f16309j++;
    }

    /* renamed from: d */
    public final void mo24414d() {
        this.f16305f = true;
        this.f16300a.mo24934k(this);
    }

    /* renamed from: e */
    public final boolean mo24415e(int i) {
        return s46.m26593C(this.f16301b, i);
    }

    /* renamed from: f */
    public final void mo24416f() {
        boolean z;
        int i = this.f16309j;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f16309j = i - 1;
            return;
        }
        throw new IllegalArgumentException("Unbalanced begin/end empty".toString());
    }

    /* renamed from: g */
    public final void mo24417g() {
        boolean z;
        int i;
        if (this.f16309j == 0) {
            if (this.f16306g == this.f16307h) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int r = s46.m26608R(this.f16301b, this.f16308i);
                this.f16308i = r;
                if (r < 0) {
                    i = this.f16302c;
                } else {
                    i = r + s46.m26597G(this.f16301b, r);
                }
                this.f16307h = i;
                return;
            }
            ComposerKt.m2032x("endGroup() not called at the end of a group".toString());
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: h */
    public final List<pa3> mo24418h() {
        int i;
        ArrayList arrayList = new ArrayList();
        if (this.f16309j > 0) {
            return arrayList;
        }
        int i2 = this.f16306g;
        int i3 = 0;
        while (i2 < this.f16307h) {
            int m = s46.m26603M(this.f16301b, i2);
            Object K = mo24403K(this.f16301b, i2);
            if (s46.m26602L(this.f16301b, i2)) {
                i = 1;
            } else {
                i = s46.m26605O(this.f16301b, i2);
            }
            arrayList.add(new pa3(m, K, i2, i, i3));
            i2 += s46.m26597G(this.f16301b, i2);
            i3++;
        }
        return arrayList;
    }

    /* renamed from: i */
    public final boolean mo24419i() {
        return this.f16305f;
    }

    /* renamed from: j */
    public final int mo24420j() {
        return this.f16306g;
    }

    /* renamed from: k */
    public final Object mo24421k() {
        int i = this.f16306g;
        if (i < this.f16307h) {
            return mo24412b(this.f16301b, i);
        }
        return 0;
    }

    /* renamed from: l */
    public final int mo24422l() {
        return this.f16307h;
    }

    /* renamed from: m */
    public final int mo24423m() {
        int i = this.f16306g;
        if (i < this.f16307h) {
            return s46.m26603M(this.f16301b, i);
        }
        return 0;
    }

    /* renamed from: n */
    public final Object mo24424n() {
        int i = this.f16306g;
        if (i < this.f16307h) {
            return mo24403K(this.f16301b, i);
        }
        return null;
    }

    /* renamed from: o */
    public final int mo24425o() {
        return s46.m26597G(this.f16301b, this.f16306g);
    }

    /* renamed from: p */
    public final int mo24426p() {
        return this.f16310k - s46.m26610T(this.f16301b, this.f16308i);
    }

    /* renamed from: q */
    public final boolean mo24427q() {
        if (this.f16309j > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public final int mo24428r() {
        return this.f16308i;
    }

    /* renamed from: s */
    public final int mo24429s() {
        int i = this.f16308i;
        if (i >= 0) {
            return s46.m26605O(this.f16301b, i);
        }
        return 0;
    }

    /* renamed from: t */
    public final int mo24430t() {
        return this.f16302c;
    }

    public String toString() {
        return "SlotReader(current=" + this.f16306g + ", key=" + mo24423m() + ", parent=" + this.f16308i + ", end=" + this.f16307h + ')';
    }

    /* renamed from: u */
    public final q46 mo24432u() {
        return this.f16300a;
    }

    /* renamed from: v */
    public final Object mo24433v(int i) {
        return mo24412b(this.f16301b, i);
    }

    /* renamed from: w */
    public final Object mo24434w(int i) {
        return mo24435x(this.f16306g, i);
    }

    /* renamed from: x */
    public final Object mo24435x(int i, int i2) {
        int i3;
        int t = s46.m26610T(this.f16301b, i);
        int i4 = i + 1;
        if (i4 < this.f16302c) {
            i3 = s46.m26595E(this.f16301b, i4);
        } else {
            i3 = this.f16304e;
        }
        int i5 = t + i2;
        if (i5 < i3) {
            return this.f16303d[i5];
        }
        return nn0.f15626a.mo23753a();
    }

    /* renamed from: y */
    public final int mo24436y(int i) {
        return s46.m26603M(this.f16301b, i);
    }

    /* renamed from: z */
    public final Object mo24437z(int i) {
        return mo24403K(this.f16301b, i);
    }
}
