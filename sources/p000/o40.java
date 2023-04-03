package p000;

import net.sqlcipher.database.SQLiteDatabase;

/* renamed from: o40 */
/* compiled from: Buffer */
public abstract class o40 {

    /* renamed from: a */
    public int f15786a;

    /* renamed from: g */
    public final void mo23888g(int i) {
        this.f15786a = i | this.f15786a;
    }

    /* renamed from: h */
    public void mo6968h() {
        this.f15786a = 0;
    }

    /* renamed from: i */
    public final void mo23889i(int i) {
        this.f15786a = (~i) & this.f15786a;
    }

    /* renamed from: l */
    public final boolean mo23890l(int i) {
        if ((this.f15786a & i) == i) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public final boolean mo23891m() {
        return mo23890l(SQLiteDatabase.CREATE_IF_NECESSARY);
    }

    /* renamed from: o */
    public final boolean mo23892o() {
        return mo23890l(Integer.MIN_VALUE);
    }

    /* renamed from: p */
    public final boolean mo23893p() {
        return mo23890l(4);
    }

    /* renamed from: r */
    public final boolean mo23894r() {
        return mo23890l(134217728);
    }

    /* renamed from: t */
    public final boolean mo23895t() {
        return mo23890l(1);
    }

    /* renamed from: u */
    public final void mo23896u(int i) {
        this.f15786a = i;
    }
}
