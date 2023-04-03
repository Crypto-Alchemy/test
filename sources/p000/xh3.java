package p000;

import com.google.common.collect.ImmutableList;

/* renamed from: xh3 */
/* compiled from: ListChunk */
public final class xh3 implements C3763zv {

    /* renamed from: a */
    public final ImmutableList<C3763zv> f19833a;

    /* renamed from: b */
    public final int f19834b;

    public xh3(int i, ImmutableList<C3763zv> immutableList) {
        this.f19834b = i;
        this.f19833a = immutableList;
    }

    /* renamed from: a */
    public static C3763zv m30099a(int i, int i2, gm4 gm4) {
        switch (i) {
            case 1718776947:
                return na6.m23071d(i2, gm4);
            case 1751742049:
                return C1657bw.m11604b(gm4);
            case 1752331379:
                return C2125cw.m14586c(gm4);
            case 1852994675:
                return qa6.m25567a(gm4);
            default:
                return null;
        }
    }

    /* renamed from: c */
    public static xh3 m30100c(int i, gm4 gm4) {
        C3763zv zvVar;
        ImmutableList.C4534a aVar = new ImmutableList.C4534a();
        int f = gm4.mo20681f();
        int i2 = -2;
        while (gm4.mo20676a() > 8) {
            int q = gm4.mo20692q();
            int e = gm4.mo20680e() + gm4.mo20692q();
            gm4.mo20673O(e);
            if (q == 1414744396) {
                zvVar = m30100c(gm4.mo20692q(), gm4);
            } else {
                zvVar = m30099a(q, i2, gm4);
            }
            if (zvVar != null) {
                if (zvVar.getType() == 1752331379) {
                    i2 = ((C2125cw) zvVar).mo18364b();
                }
                aVar.mo34667a(zvVar);
            }
            gm4.mo20674P(e);
            gm4.mo20673O(f);
        }
        return new xh3(i, aVar.mo34692l());
    }

    /* renamed from: b */
    public <T extends C3763zv> T mo27734b(Class<T> cls) {
        c47<C3763zv> it = this.f19833a.iterator();
        while (it.hasNext()) {
            T t = (C3763zv) it.next();
            if (t.getClass() == cls) {
                return t;
            }
        }
        return null;
    }

    public int getType() {
        return this.f19834b;
    }
}
