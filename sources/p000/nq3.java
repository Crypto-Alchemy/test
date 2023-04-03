package p000;

import androidx.compose.p004ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.p004ui.unit.LayoutDirection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C6177b;
import p000.vo4;

/* renamed from: nq3 */
/* compiled from: MeasureScope.kt */
public final /* synthetic */ class nq3 {

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\b\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000b\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\u0007R&\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\f8\u0016X\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\t\u0010\u0010¨\u0006\u0012"}, mo44877d2 = {"nq3$a", "Lmq3;", "Lr37;", "a", "", "I", "getWidth", "()I", "width", "b", "getHeight", "height", "", "Lcf;", "c", "Ljava/util/Map;", "()Ljava/util/Map;", "alignmentLines", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: nq3$a */
    /* compiled from: MeasureScope.kt */
    public static final class C2918a implements mq3 {

        /* renamed from: a */
        public final int f15649a;

        /* renamed from: b */
        public final int f15650b;

        /* renamed from: c */
        public final Map<C1677cf, Integer> f15651c;

        /* renamed from: d */
        public final /* synthetic */ int f15652d;

        /* renamed from: e */
        public final /* synthetic */ oq3 f15653e;

        /* renamed from: f */
        public final /* synthetic */ rc2<vo4.C3501a, r37> f15654f;

        public C2918a(int i, int i2, Map<C1677cf, Integer> map, oq3 oq3, rc2<? super vo4.C3501a, r37> rc2) {
            this.f15652d = i;
            this.f15653e = oq3;
            this.f15654f = rc2;
            this.f15649a = i;
            this.f15650b = i2;
            this.f15651c = map;
        }

        /* renamed from: a */
        public void mo23299a() {
            nl3 nl3;
            vo4.C3501a.C3502a aVar = vo4.C3501a.f18872a;
            int i = this.f15652d;
            LayoutDirection layoutDirection = this.f15653e.getLayoutDirection();
            oq3 oq3 = this.f15653e;
            if (oq3 instanceof nl3) {
                nl3 = (nl3) oq3;
            } else {
                nl3 = null;
            }
            rc2<vo4.C3501a, r37> rc2 = this.f15654f;
            me3 f = vo4.C3501a.f18875d;
            int x = aVar.mo27282l();
            LayoutDirection w = aVar.mo27281k();
            LayoutNodeLayoutDelegate a = vo4.C3501a.f18876e;
            vo4.C3501a.f18874c = i;
            vo4.C3501a.f18873b = layoutDirection;
            boolean v = aVar.mo27288y(nl3);
            rc2.invoke(aVar);
            if (nl3 != null) {
                nl3.mo23727f0(v);
            }
            vo4.C3501a.f18874c = x;
            vo4.C3501a.f18873b = w;
            vo4.C3501a.f18875d = f;
            vo4.C3501a.f18876e = a;
        }

        /* renamed from: b */
        public Map<C1677cf, Integer> mo23300b() {
            return this.f15651c;
        }

        public int getHeight() {
            return this.f15650b;
        }

        public int getWidth() {
            return this.f15649a;
        }
    }

    /* renamed from: a */
    public static mq3 m23394a(oq3 oq3, int i, int i2, Map map, rc2 rc2) {
        vx2.m53591g(map, "alignmentLines");
        vx2.m53591g(rc2, "placementBlock");
        return new C2918a(i, i2, map, oq3, rc2);
    }

    /* renamed from: b */
    public static /* synthetic */ mq3 m23395b(oq3 oq3, int i, int i2, Map map, rc2 rc2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 4) != 0) {
                map = C6177b.m47361i();
            }
            return oq3.mo23729h(i, i2, map, rc2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: layout");
    }
}
