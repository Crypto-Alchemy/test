package p000;

import androidx.compose.runtime.ComposerKt;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010(\n\u0002\b!\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0007¢\u0006\u0004\bD\u0010EJ\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\nJ\u0016\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\nJ\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0014\u0010\u0015JW\u0010!\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\b2\u000e\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001a2\u0006\u0010\u001d\u001a\u00020\b2\u0016\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\n0\u001ej\b\u0012\u0004\u0012\u00020\n`\u001fH\u0000¢\u0006\u0004\b!\u0010\"JO\u0010#\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\b2\u000e\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001a2\u0006\u0010\u001d\u001a\u00020\b2\u0016\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\n0\u001ej\b\u0012\u0004\u0012\u00020\n`\u001fH\u0000¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00030%H\u0002R$\u0010\u0018\u001a\u00020\u00172\u0006\u0010'\u001a\u00020\u00178\u0006@BX\u000e¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R$\u0010\u0019\u001a\u00020\b2\u0006\u0010'\u001a\u00020\b8\u0006@BX\u000e¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R4\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001a2\u000e\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001a8\u0006@BX\u000e¢\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\b1\u00102R$\u0010\u001d\u001a\u00020\b2\u0006\u0010'\u001a\u00020\b8\u0006@BX\u000e¢\u0006\f\n\u0004\b3\u0010-\u001a\u0004\b4\u0010/R\u0016\u00105\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010-R$\u0010\u0016\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\u000e8\u0000@BX\u000e¢\u0006\f\n\u0004\b*\u00106\u001a\u0004\b7\u00108R\"\u0010<\u001a\u00020\b8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b.\u0010-\u001a\u0004\b9\u0010/\"\u0004\b:\u0010;R2\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\n0\u001ej\b\u0012\u0004\u0012\u00020\n`\u001f8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u0014\u0010C\u001a\u00020\u000e8VX\u0004¢\u0006\u0006\u001a\u0004\bC\u00108¨\u0006F"}, mo44877d2 = {"Lq46;", "Lyn0;", "", "Lzn0;", "Lp46;", "D", "Lt46;", "E", "", "index", "Lbg;", "e", "anchor", "j", "", "F", "groupIndex", "B", "reader", "Lr37;", "k", "(Lp46;)V", "writer", "", "groups", "groupsSize", "", "", "slots", "slotsSize", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "anchors", "n", "(Lt46;[II[Ljava/lang/Object;ILjava/util/ArrayList;)V", "H", "([II[Ljava/lang/Object;ILjava/util/ArrayList;)V", "", "iterator", "<set-?>", "a", "[I", "r", "()[I", "d", "I", "s", "()I", "[Ljava/lang/Object;", "t", "()[Ljava/lang/Object;", "g", "u", "readers", "Z", "A", "()Z", "w", "setVersion$runtime_release", "(I)V", "version", "x", "Ljava/util/ArrayList;", "q", "()Ljava/util/ArrayList;", "setAnchors$runtime_release", "(Ljava/util/ArrayList;)V", "isEmpty", "<init>", "()V", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: q46 */
/* compiled from: SlotTable.kt */
public final class q46 implements yn0, Iterable<zn0>, a93 {

    /* renamed from: a */
    public int[] f16786a = new int[0];

    /* renamed from: d */
    public int f16787d;

    /* renamed from: e */
    public Object[] f16788e = new Object[0];

    /* renamed from: g */
    public int f16789g;

    /* renamed from: k */
    public int f16790k;

    /* renamed from: r */
    public boolean f16791r;

    /* renamed from: s */
    public int f16792s;

    /* renamed from: x */
    public ArrayList<C1628bg> f16793x = new ArrayList<>();

    /* renamed from: A */
    public final boolean mo24924A() {
        return this.f16791r;
    }

    /* renamed from: B */
    public final boolean mo24925B(int i, C1628bg bgVar) {
        boolean z;
        boolean z2;
        vx2.m53591g(bgVar, "anchor");
        if (!this.f16791r) {
            if (i < 0 || i >= this.f16787d) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                if (mo24928F(bgVar)) {
                    int g = s46.m26597G(this.f16786a, i) + i;
                    int a = bgVar.mo11639a();
                    if (i > a || a >= g) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                        return true;
                    }
                }
                return false;
            }
            ComposerKt.m2032x("Invalid group index".toString());
            throw new KotlinNothingValueException();
        }
        ComposerKt.m2032x("Writer is active".toString());
        throw new KotlinNothingValueException();
    }

    /* renamed from: D */
    public final p46 mo24926D() {
        if (!this.f16791r) {
            this.f16790k++;
            return new p46(this);
        }
        throw new IllegalStateException("Cannot read while a writer is pending".toString());
    }

    /* renamed from: E */
    public final t46 mo24927E() {
        boolean z;
        if (!this.f16791r) {
            if (this.f16790k <= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f16791r = true;
                this.f16792s++;
                return new t46(this);
            }
            ComposerKt.m2032x("Cannot start a writer when a reader is pending".toString());
            throw new KotlinNothingValueException();
        }
        ComposerKt.m2032x("Cannot start a writer when another writer is pending".toString());
        throw new KotlinNothingValueException();
    }

    /* renamed from: F */
    public final boolean mo24928F(C1628bg bgVar) {
        boolean z;
        vx2.m53591g(bgVar, "anchor");
        if (bgVar.mo11640b()) {
            int s = s46.m26609S(this.f16793x, bgVar.mo11639a(), this.f16787d);
            if (s < 0 || !vx2.m53586b(this.f16793x.get(s), bgVar)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: H */
    public final void mo24929H(int[] iArr, int i, Object[] objArr, int i2, ArrayList<C1628bg> arrayList) {
        vx2.m53591g(iArr, "groups");
        vx2.m53591g(objArr, "slots");
        vx2.m53591g(arrayList, "anchors");
        this.f16786a = iArr;
        this.f16787d = i;
        this.f16788e = objArr;
        this.f16789g = i2;
        this.f16793x = arrayList;
    }

    /* renamed from: e */
    public final C1628bg mo24930e(int i) {
        if (!this.f16791r) {
            boolean z = false;
            if (i >= 0 && i < this.f16787d) {
                z = true;
            }
            if (z) {
                ArrayList<C1628bg> arrayList = this.f16793x;
                int s = s46.m26609S(arrayList, i, this.f16787d);
                if (s < 0) {
                    C1628bg bgVar = new C1628bg(i);
                    arrayList.add(-(s + 1), bgVar);
                    return bgVar;
                }
                C1628bg bgVar2 = arrayList.get(s);
                vx2.m53590f(bgVar2, "get(location)");
                return bgVar2;
            }
            throw new IllegalArgumentException("Parameter index is out of range".toString());
        }
        ComposerKt.m2032x("use active SlotWriter to create an anchor location instead ".toString());
        throw new KotlinNothingValueException();
    }

    public boolean isEmpty() {
        if (this.f16787d == 0) {
            return true;
        }
        return false;
    }

    public Iterator<zn0> iterator() {
        return new tj2(this, 0, this.f16787d);
    }

    /* renamed from: j */
    public final int mo24933j(C1628bg bgVar) {
        vx2.m53591g(bgVar, "anchor");
        if (!(!this.f16791r)) {
            ComposerKt.m2032x("Use active SlotWriter to determine anchor location instead".toString());
            throw new KotlinNothingValueException();
        } else if (bgVar.mo11640b()) {
            return bgVar.mo11639a();
        } else {
            throw new IllegalArgumentException("Anchor refers to a group that was removed".toString());
        }
    }

    /* renamed from: k */
    public final void mo24934k(p46 p46) {
        boolean z;
        vx2.m53591g(p46, "reader");
        if (p46.mo24432u() != this || this.f16790k <= 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            this.f16790k--;
        } else {
            ComposerKt.m2032x("Unexpected reader close()".toString());
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: n */
    public final void mo24935n(t46 t46, int[] iArr, int i, Object[] objArr, int i2, ArrayList<C1628bg> arrayList) {
        boolean z;
        vx2.m53591g(t46, "writer");
        vx2.m53591g(iArr, "groups");
        vx2.m53591g(objArr, "slots");
        vx2.m53591g(arrayList, "anchors");
        if (t46.mo26108X() != this || !this.f16791r) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            this.f16791r = false;
            mo24929H(iArr, i, objArr, i2, arrayList);
            return;
        }
        throw new IllegalArgumentException("Unexpected writer close()".toString());
    }

    /* renamed from: q */
    public final ArrayList<C1628bg> mo24936q() {
        return this.f16793x;
    }

    /* renamed from: r */
    public final int[] mo24937r() {
        return this.f16786a;
    }

    /* renamed from: s */
    public final int mo24938s() {
        return this.f16787d;
    }

    /* renamed from: t */
    public final Object[] mo24939t() {
        return this.f16788e;
    }

    /* renamed from: u */
    public final int mo24940u() {
        return this.f16789g;
    }

    /* renamed from: w */
    public final int mo24941w() {
        return this.f16792s;
    }
}
