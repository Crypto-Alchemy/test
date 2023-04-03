package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: s12 */
/* compiled from: Annotations.kt */
public final class s12 implements C6983dm {

    /* renamed from: a */
    public final C6983dm f44510a;

    /* renamed from: d */
    public final boolean f44511d;

    /* renamed from: e */
    public final rc2<u82, Boolean> f44512e;

    public s12(C6983dm dmVar, boolean z, rc2<? super u82, Boolean> rc2) {
        vx2.m53591g(dmVar, "delegate");
        vx2.m53591g(rc2, "fqNameFilter");
        this.f44510a = dmVar;
        this.f44511d = z;
        this.f44512e = rc2;
    }

    /* renamed from: C0 */
    public boolean mo51224C0(u82 u82) {
        vx2.m53591g(u82, "fqName");
        if (this.f44512e.invoke(u82).booleanValue()) {
            return this.f44510a.mo51224C0(u82);
        }
        return false;
    }

    /* renamed from: e */
    public final boolean mo65790e(C9460vl vlVar) {
        u82 e = vlVar.mo53263e();
        if (e == null || !this.f44512e.invoke(e).booleanValue()) {
            return false;
        }
        return true;
    }

    public boolean isEmpty() {
        boolean z;
        C6983dm dmVar = this.f44510a;
        if (!(dmVar instanceof Collection) || !((Collection) dmVar).isEmpty()) {
            Iterator it = dmVar.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (mo65790e((C9460vl) it.next())) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z = false;
        if (!this.f44511d) {
            return z;
        }
        if (!z) {
            return true;
        }
        return false;
    }

    public Iterator<C9460vl> iterator() {
        C6983dm dmVar = this.f44510a;
        ArrayList arrayList = new ArrayList();
        for (Object next : dmVar) {
            if (mo65790e((C9460vl) next)) {
                arrayList.add(next);
            }
        }
        return arrayList.iterator();
    }

    /* renamed from: x */
    public C9460vl mo51226x(u82 u82) {
        vx2.m53591g(u82, "fqName");
        if (this.f44512e.invoke(u82).booleanValue()) {
            return this.f44510a.mo51226x(u82);
        }
        return null;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public s12(C6983dm dmVar, rc2<? super u82, Boolean> rc2) {
        this(dmVar, false, rc2);
        vx2.m53591g(dmVar, "delegate");
        vx2.m53591g(rc2, "fqNameFilter");
    }
}
