package p000;

import androidx.compose.p004ui.node.LayoutNode;
import androidx.compose.p004ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.p004ui.node.NodeCoordinator;
import androidx.compose.p004ui.unit.LayoutDirection;
import com.github.mikephil.charting.utils.Utils;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import p000.vo4;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\b \u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0015\u0012\u0006\u0010 \u001a\u00020\u001b¢\u0006\u0004\ba\u0010bJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0010¢\u0006\u0004\b\t\u0010\nJ;\u0010\u0012\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u000fH\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0014\u001a\u00020\bH\u0014R\u0017\u0010\u001a\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010 \u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR+\u0010\f\u001a\u00020\u000b8\u0016@\u0016X\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010'8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0017\u00100\u001a\u00020+8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R(\u00107\u001a\u0004\u0018\u0001012\b\u00102\u001a\u0004\u0018\u0001018\u0002@BX\u000e¢\u0006\f\n\u0004\b3\u00104\"\u0004\b5\u00106R&\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050'8\u0004X\u0004¢\u0006\f\n\u0004\b8\u0010)\u001a\u0004\b9\u0010:R\u0016\u0010>\u001a\u0004\u0018\u00010\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0014\u0010B\u001a\u00020?8VX\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0014\u0010E\u001a\u0002018PX\u0004¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0014\u0010I\u001a\u00020F8VX\u0004¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0014\u0010L\u001a\u00020\r8VX\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0014\u0010N\u001a\u00020\r8VX\u0004¢\u0006\u0006\u001a\u0004\bM\u0010KR\u0016\u0010P\u001a\u0004\u0018\u00010\u00028VX\u0004¢\u0006\u0006\u001a\u0004\bO\u0010=R\u0014\u0010T\u001a\u00020Q8VX\u0004¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0014\u0010X\u001a\u00020U8VX\u0004¢\u0006\u0006\u001a\u0004\bV\u0010WR\u0014\u0010\\\u001a\u00020Y8VX\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010[R\u0016\u0010`\u001a\u0004\u0018\u00010]8VX\u0004¢\u0006\u0006\u001a\u0004\b^\u0010_\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006c"}, mo44877d2 = {"Lol3;", "Liq3;", "Lnl3;", "Lcf;", "alignmentLine", "", "k0", "(Lcf;)I", "Lr37;", "e0", "()V", "Lnw2;", "position", "", "zIndex", "Lkotlin/Function1;", "Lnj2;", "layerBlock", "O", "(JFLrc2;)V", "q0", "Landroidx/compose/ui/node/NodeCoordinator;", "s", "Landroidx/compose/ui/node/NodeCoordinator;", "m0", "()Landroidx/compose/ui/node/NodeCoordinator;", "coordinator", "Lsl3;", "x", "Lsl3;", "o0", "()Lsl3;", "lookaheadScope", "y", "J", "a0", "()J", "r0", "(J)V", "", "A", "Ljava/util/Map;", "oldAlignmentLines", "Lql3;", "B", "Lql3;", "n0", "()Lql3;", "lookaheadLayoutCoordinates", "Lmq3;", "result", "C", "Lmq3;", "s0", "(Lmq3;)V", "_measureResult", "H", "l0", "()Ljava/util/Map;", "cachedAlignmentLinesMap", "U", "()Lnl3;", "child", "", "W", "()Z", "hasMeasureResult", "Y", "()Lmq3;", "measureResult", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "getDensity", "()F", "density", "v", "fontScale", "Z", "parent", "Landroidx/compose/ui/node/LayoutNode;", "X", "()Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Lme3;", "V", "()Lme3;", "coordinates", "Ldf;", "j0", "()Ldf;", "alignmentLinesOwner", "", "p0", "()Ljava/lang/Object;", "parentData", "<init>", "(Landroidx/compose/ui/node/NodeCoordinator;Lsl3;)V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: ol3 */
/* compiled from: LookaheadDelegate.kt */
public abstract class ol3 extends nl3 implements iq3 {

    /* renamed from: A */
    public Map<C1677cf, Integer> f15940A;

    /* renamed from: B */
    public final ql3 f15941B = new ql3(this);

    /* renamed from: C */
    public mq3 f15942C;

    /* renamed from: H */
    public final Map<C1677cf, Integer> f15943H = new LinkedHashMap();

    /* renamed from: s */
    public final NodeCoordinator f15944s;

    /* renamed from: x */
    public final sl3 f15945x;

    /* renamed from: y */
    public long f15946y = nw2.f15691a.mo23808a();

    public ol3(NodeCoordinator nodeCoordinator, sl3 sl3) {
        vx2.m53591g(nodeCoordinator, "coordinator");
        vx2.m53591g(sl3, "lookaheadScope");
        this.f15944s = nodeCoordinator;
        this.f15945x = sl3;
    }

    /* renamed from: O */
    public final void mo3520O(long j, float f, rc2<? super nj2, r37> rc2) {
        if (!nw2.m23480e(mo3602a0(), j)) {
            mo24001r0(j);
            LayoutNodeLayoutDelegate.LookaheadPassDelegate w = mo3596X().mo3399D().mo3515w();
            if (w != null) {
                w.mo3526Z();
            }
            mo23724b0(this.f15944s);
        }
        if (!mo23726d0()) {
            mo24000q0();
        }
    }

    /* renamed from: U */
    public nl3 mo3590U() {
        NodeCoordinator Q0 = this.f15944s.mo3586Q0();
        if (Q0 != null) {
            return Q0.mo3580K0();
        }
        return null;
    }

    /* renamed from: V */
    public me3 mo3592V() {
        return this.f15941B;
    }

    /* renamed from: W */
    public boolean mo3594W() {
        if (this.f15942C != null) {
            return true;
        }
        return false;
    }

    /* renamed from: X */
    public LayoutNode mo3596X() {
        return this.f15944s.mo3596X();
    }

    /* renamed from: Y */
    public mq3 mo3598Y() {
        mq3 mq3 = this.f15942C;
        if (mq3 != null) {
            return mq3;
        }
        throw new IllegalStateException("LookaheadDelegate has not been measured yet when measureResult is requested.".toString());
    }

    /* renamed from: Z */
    public nl3 mo3600Z() {
        NodeCoordinator R0 = this.f15944s.mo3587R0();
        if (R0 != null) {
            return R0.mo3580K0();
        }
        return null;
    }

    /* renamed from: a0 */
    public long mo3602a0() {
        return this.f15946y;
    }

    /* renamed from: e0 */
    public void mo3608e0() {
        mo3520O(mo3602a0(), Utils.FLOAT_EPSILON, (rc2<? super nj2, r37>) null);
    }

    public float getDensity() {
        return this.f15944s.getDensity();
    }

    public LayoutDirection getLayoutDirection() {
        return this.f15944s.getLayoutDirection();
    }

    /* renamed from: j0 */
    public C2164df mo23993j0() {
        C2164df t = this.f15944s.mo3596X().mo3399D().mo3512t();
        vx2.m53588d(t);
        return t;
    }

    /* renamed from: k0 */
    public final int mo23994k0(C1677cf cfVar) {
        vx2.m53591g(cfVar, "alignmentLine");
        Integer num = this.f15943H.get(cfVar);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    /* renamed from: l0 */
    public final Map<C1677cf, Integer> mo23995l0() {
        return this.f15943H;
    }

    /* renamed from: m0 */
    public final NodeCoordinator mo23996m0() {
        return this.f15944s;
    }

    /* renamed from: n0 */
    public final ql3 mo23997n0() {
        return this.f15941B;
    }

    /* renamed from: o0 */
    public final sl3 mo23998o0() {
        return this.f15945x;
    }

    /* renamed from: p0 */
    public Object mo23999p0() {
        return this.f15944s.mo3582M0();
    }

    /* renamed from: q0 */
    public void mo24000q0() {
        vo4.C3501a.C3502a aVar = vo4.C3501a.f18872a;
        int width = mo3598Y().getWidth();
        LayoutDirection layoutDirection = this.f15944s.getLayoutDirection();
        me3 f = vo4.C3501a.f18875d;
        int x = aVar.mo27282l();
        LayoutDirection w = aVar.mo27281k();
        LayoutNodeLayoutDelegate a = vo4.C3501a.f18876e;
        vo4.C3501a.f18874c = width;
        vo4.C3501a.f18873b = layoutDirection;
        boolean v = aVar.mo27288y(this);
        mo3598Y().mo23299a();
        mo23727f0(v);
        vo4.C3501a.f18874c = x;
        vo4.C3501a.f18873b = w;
        vo4.C3501a.f18875d = f;
        vo4.C3501a.f18876e = a;
    }

    /* renamed from: r0 */
    public void mo24001r0(long j) {
        this.f15946y = j;
    }

    /* renamed from: s0 */
    public final void mo24002s0(mq3 mq3) {
        r37 r37;
        boolean z;
        if (mq3 != null) {
            mo27279Q(tw2.m27948a(mq3.getWidth(), mq3.getHeight()));
            r37 = r37.f33317a;
        } else {
            r37 = null;
        }
        if (r37 == null) {
            mo27279Q(sw2.f17817b.mo25975a());
        }
        if (!vx2.m53586b(this.f15942C, mq3) && mq3 != null) {
            Map<C1677cf, Integer> map = this.f15940A;
            if (map == null || map.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if ((!z || (!mq3.mo23300b().isEmpty())) && !vx2.m53586b(mq3.mo23300b(), this.f15940A)) {
                mo23993j0().mo3529b().mo3340m();
                Map map2 = this.f15940A;
                if (map2 == null) {
                    map2 = new LinkedHashMap();
                    this.f15940A = map2;
                }
                map2.clear();
                map2.putAll(mq3.mo23300b());
            }
        }
        this.f15942C = mq3;
    }

    /* renamed from: v */
    public float mo3631v() {
        return this.f15944s.mo3631v();
    }
}
