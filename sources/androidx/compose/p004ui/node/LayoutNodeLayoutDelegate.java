package androidx.compose.p004ui.node;

import androidx.compose.p004ui.node.LayoutNode;
import com.github.mikephil.charting.utils.Utils;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import p000.vo4;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001:\u0002`aB\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b^\u0010_J\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u000f\u0010\fJ\u0019\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0006\u0010\u0014\u001a\u00020\u0007J\u0006\u0010\u0015\u001a\u00020\u0007J\u0006\u0010\u0016\u001a\u00020\u0007R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R$\u0010 \u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a8\u0000@BX\u000e¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR$\u0010%\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00038\u0000@BX\u000e¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R$\u0010(\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00038\u0000@BX\u000e¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b'\u0010$R\u0016\u0010*\u001a\u00020\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b)\u0010\"R$\u0010-\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00038\u0000@BX\u000e¢\u0006\f\n\u0004\b+\u0010\"\u001a\u0004\b,\u0010$R$\u00100\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00038\u0000@BX\u000e¢\u0006\f\n\u0004\b.\u0010\"\u001a\u0004\b/\u0010$R\u0016\u00102\u001a\u00020\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b1\u0010\"R*\u00108\u001a\u00020\u00032\u0006\u00103\u001a\u00020\u00038\u0006@FX\u000e¢\u0006\u0012\n\u0004\b4\u0010\"\u001a\u0004\b5\u0010$\"\u0004\b6\u00107R*\u0010?\u001a\u0002092\u0006\u00103\u001a\u0002098\u0006@FX\u000e¢\u0006\u0012\n\u0004\b:\u0010\n\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001e\u0010E\u001a\u00060@R\u00020\u00008\u0000X\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR0\u0010K\u001a\b\u0018\u00010FR\u00020\u00002\f\u0010\u001b\u001a\b\u0018\u00010FR\u00020\u00008\u0000@BX\u000e¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u0011\u0010O\u001a\u00020L8F¢\u0006\u0006\u001a\u0004\bM\u0010NR\u001c\u0010R\u001a\u0004\u0018\u00010\u00058Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bP\u0010QR\u001c\u0010T\u001a\u0004\u0018\u00010\u00058Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bS\u0010QR\u0014\u0010V\u001a\u0002098@X\u0004¢\u0006\u0006\u001a\u0004\bU\u0010<R\u0014\u0010X\u001a\u0002098@X\u0004¢\u0006\u0006\u001a\u0004\bW\u0010<R\u0014\u0010[\u001a\u00020Y8@X\u0004¢\u0006\u0006\u001a\u0004\bG\u0010ZR\u0016\u0010]\u001a\u0004\u0018\u00010Y8@X\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010Z\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006b"}, mo44877d2 = {"Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "", "Landroidx/compose/ui/node/LayoutNode;", "", "B", "Lmq0;", "constraints", "Lr37;", "J", "(J)V", "I", "D", "()V", "G", "E", "F", "Lsl3;", "newScope", "H", "(Lsl3;)V", "N", "K", "C", "a", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Landroidx/compose/ui/node/LayoutNode$LayoutState;", "<set-?>", "b", "Landroidx/compose/ui/node/LayoutNode$LayoutState;", "s", "()Landroidx/compose/ui/node/LayoutNode$LayoutState;", "layoutState", "c", "Z", "y", "()Z", "measurePending", "d", "r", "layoutPending", "e", "layoutPendingForAlignment", "f", "v", "lookaheadMeasurePending", "g", "u", "lookaheadLayoutPending", "h", "lookaheadLayoutPendingForAlignment", "value", "i", "n", "M", "(Z)V", "coordinatesAccessedDuringPlacement", "", "j", "m", "()I", "L", "(I)V", "childrenAccessingCoordinatesDuringPlacement", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate;", "k", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate;", "x", "()Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate;", "measurePassDelegate", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate;", "l", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate;", "w", "()Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate;", "lookaheadPassDelegate", "Landroidx/compose/ui/node/NodeCoordinator;", "z", "()Landroidx/compose/ui/node/NodeCoordinator;", "outerCoordinator", "p", "()Lmq0;", "lastConstraints", "q", "lastLookaheadConstraints", "o", "height", "A", "width", "Ldf;", "()Ldf;", "alignmentLinesOwner", "t", "lookaheadAlignmentLinesOwner", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "LookaheadPassDelegate", "MeasurePassDelegate", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.node.LayoutNodeLayoutDelegate */
/* compiled from: LayoutNodeLayoutDelegate.kt */
public final class LayoutNodeLayoutDelegate {

    /* renamed from: a */
    public final LayoutNode f1787a;

    /* renamed from: b */
    public LayoutNode.LayoutState f1788b = LayoutNode.LayoutState.Idle;

    /* renamed from: c */
    public boolean f1789c;

    /* renamed from: d */
    public boolean f1790d;

    /* renamed from: e */
    public boolean f1791e;

    /* renamed from: f */
    public boolean f1792f;

    /* renamed from: g */
    public boolean f1793g;

    /* renamed from: h */
    public boolean f1794h;

    /* renamed from: i */
    public boolean f1795i;

    /* renamed from: j */
    public int f1796j;

    /* renamed from: k */
    public final MeasurePassDelegate f1797k = new MeasurePassDelegate();

    /* renamed from: l */
    public LookaheadPassDelegate f1798l;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\t\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010,\u001a\u00020)¢\u0006\u0004\be\u0010fJ\b\u0010\u0005\u001a\u00020\u0004H\u0002J\f\u0010\u0007\u001a\u00020\u0004*\u00020\u0006H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\u0004H\u0002J\b\u0010\n\u001a\u00020\u0004H\u0016J\u0014\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0016J\u001c\u0010\u0011\u001a\u00020\u00042\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\b\u0010\u0013\u001a\u00020\u0004H\u0016J\u0006\u0010\u0014\u001a\u00020\u0004J\u001d\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u0015H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0015ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ;\u0010\"\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0014\u0010!\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000fH\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#J\u000e\u0010%\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u0019J\u0006\u0010&\u001a\u00020\u0019J\u0006\u0010'\u001a\u00020\u0004J\u0006\u0010(\u001a\u00020\u0004R\u0014\u0010,\u001a\u00020)8\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\"\u00102\u001a\u00020\u00198\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b-\u0010\u0014\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0016\u00104\u001a\u00020\u00198\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b3\u0010\u0014R\u0016\u00106\u001a\u00020\u00198\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b5\u0010\u0014R!\u00109\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b7\u00108R\u001f\u0010<\u001a\u00020\u001c8\u0002@\u0002X\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b:\u0010;R\"\u0010@\u001a\u00020\u00198\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b=\u0010\u0014\u001a\u0004\b>\u0010/\"\u0004\b?\u00101R\u0016\u0010B\u001a\u00020\u00198\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bA\u0010\u0014R\u001a\u0010H\u001a\u00020C8\u0016X\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00020I8\u0002X\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\"\u0010P\u001a\u00020\u00198\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bM\u0010\u0014\u001a\u0004\bN\u0010/\"\u0004\bO\u00101R(\u0010W\u001a\u0004\u0018\u00010Q2\b\u0010R\u001a\u0004\u0018\u00010Q8\u0016@RX\u000e¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u001c\u0010Z\u001a\u0004\u0018\u00010\u00158Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bX\u0010YR\u0014\u0010]\u001a\u00020[8VX\u0004¢\u0006\u0006\u001a\u0004\b3\u0010\\R\u001a\u0010a\u001a\b\u0012\u0004\u0012\u00020\u00020^8@X\u0004¢\u0006\u0006\u001a\u0004\b_\u0010`R\u0016\u0010d\u001a\u0004\u0018\u00010\u00038VX\u0004¢\u0006\u0006\u001a\u0004\bb\u0010c\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006g"}, mo44877d2 = {"Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate;", "Lvo4;", "Liq3;", "Ldf;", "Lr37;", "Y", "Landroidx/compose/ui/node/LayoutNode;", "h0", "e0", "a0", "l", "", "Lcf;", "", "c", "Lkotlin/Function1;", "block", "p", "requestLayout", "E", "Z", "Lmq0;", "constraints", "t", "(J)Lvo4;", "", "c0", "(J)Z", "Lnw2;", "position", "", "zIndex", "Lnj2;", "layerBlock", "O", "(JFLrc2;)V", "forceRequest", "X", "i0", "b0", "d0", "Lsl3;", "k", "Lsl3;", "lookaheadScope", "r", "getDuringAlignmentLinesQuery$ui_release", "()Z", "setDuringAlignmentLinesQuery$ui_release", "(Z)V", "duringAlignmentLinesQuery", "s", "placedOnce", "x", "measuredOnce", "y", "Lmq0;", "lookaheadConstraints", "A", "J", "lastPosition", "B", "a", "g0", "isPlaced", "C", "isPreviouslyPlaced", "Landroidx/compose/ui/node/AlignmentLines;", "H", "Landroidx/compose/ui/node/AlignmentLines;", "b", "()Landroidx/compose/ui/node/AlignmentLines;", "alignmentLines", "Lv04;", "I", "Lv04;", "_childMeasurables", "L", "getChildMeasurablesDirty$ui_release", "f0", "childMeasurablesDirty", "", "<set-?>", "M", "Ljava/lang/Object;", "W", "()Ljava/lang/Object;", "parentData", "V", "()Lmq0;", "lastConstraints", "Landroidx/compose/ui/node/NodeCoordinator;", "()Landroidx/compose/ui/node/NodeCoordinator;", "innerCoordinator", "", "U", "()Ljava/util/List;", "childMeasurables", "d", "()Ldf;", "parentAlignmentLinesOwner", "<init>", "(Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;Lsl3;)V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: androidx.compose.ui.node.LayoutNodeLayoutDelegate$LookaheadPassDelegate */
    /* compiled from: LayoutNodeLayoutDelegate.kt */
    public final class LookaheadPassDelegate extends vo4 implements iq3, C2164df {

        /* renamed from: A */
        public long f1799A = nw2.f15691a.mo23808a();

        /* renamed from: B */
        public boolean f1800B = true;

        /* renamed from: C */
        public boolean f1801C;

        /* renamed from: H */
        public final AlignmentLines f1802H = new ml3(this);

        /* renamed from: I */
        public final v04<iq3> f1803I = new v04<>(new iq3[16], 0);

        /* renamed from: L */
        public boolean f1804L = true;

        /* renamed from: M */
        public Object f1805M;

        /* renamed from: P */
        public final /* synthetic */ LayoutNodeLayoutDelegate f1806P;

        /* renamed from: k */
        public final sl3 f1807k;

        /* renamed from: r */
        public boolean f1808r;

        /* renamed from: s */
        public boolean f1809s;

        /* renamed from: x */
        public boolean f1810x;

        /* renamed from: y */
        public mq0 f1811y;

        @Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
        /* renamed from: androidx.compose.ui.node.LayoutNodeLayoutDelegate$LookaheadPassDelegate$a */
        /* compiled from: LayoutNodeLayoutDelegate.kt */
        public /* synthetic */ class C0381a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f1812a;

            /* renamed from: b */
            public static final /* synthetic */ int[] f1813b;

            static {
                int[] iArr = new int[LayoutNode.LayoutState.values().length];
                iArr[LayoutNode.LayoutState.LookaheadMeasuring.ordinal()] = 1;
                iArr[LayoutNode.LayoutState.Measuring.ordinal()] = 2;
                iArr[LayoutNode.LayoutState.LayingOut.ordinal()] = 3;
                iArr[LayoutNode.LayoutState.LookaheadLayingOut.ordinal()] = 4;
                f1812a = iArr;
                int[] iArr2 = new int[LayoutNode.UsageByParent.values().length];
                iArr2[LayoutNode.UsageByParent.InMeasureBlock.ordinal()] = 1;
                iArr2[LayoutNode.UsageByParent.InLayoutBlock.ordinal()] = 2;
                f1813b = iArr2;
            }
        }

        public LookaheadPassDelegate(LayoutNodeLayoutDelegate layoutNodeLayoutDelegate, sl3 sl3) {
            vx2.m53591g(sl3, "lookaheadScope");
            this.f1806P = layoutNodeLayoutDelegate;
            this.f1807k = sl3;
            this.f1805M = layoutNodeLayoutDelegate.mo3516x().mo3548U();
        }

        /* renamed from: E */
        public void mo3519E() {
            LayoutNode.m2540L0(this.f1806P.f1787a, false, 1, (Object) null);
        }

        /* renamed from: O */
        public void mo3520O(long j, float f, rc2<? super nj2, r37> rc2) {
            this.f1806P.f1788b = LayoutNode.LayoutState.LookaheadLayingOut;
            this.f1809s = true;
            if (!nw2.m23480e(j, this.f1799A)) {
                mo3526Z();
            }
            mo3529b().mo3345r(false);
            nj4 a = ze3.m31152a(this.f1806P.f1787a);
            this.f1806P.mo3502M(false);
            OwnerSnapshotObserver.m2849c(a.getSnapshotObserver(), this.f1806P.f1787a, false, new LayoutNodeLayoutDelegate$LookaheadPassDelegate$placeAt$1(this.f1806P, j), 2, (Object) null);
            this.f1799A = j;
            this.f1806P.f1788b = LayoutNode.LayoutState.Idle;
        }

        /* renamed from: U */
        public final List<iq3> mo3521U() {
            this.f1806P.f1787a.mo3479w();
            if (!this.f1804L) {
                return this.f1803I.mo26957h();
            }
            af3.m228b(this.f1806P.f1787a, this.f1803I, C0383xc4ae5339.INSTANCE);
            this.f1804L = false;
            return this.f1803I.mo26957h();
        }

        /* renamed from: V */
        public final mq0 mo3522V() {
            return this.f1811y;
        }

        /* renamed from: W */
        public Object mo3523W() {
            return this.f1805M;
        }

        /* renamed from: X */
        public final void mo3524X(boolean z) {
            LayoutNode V;
            LayoutNode V2 = this.f1806P.f1787a.mo3430V();
            LayoutNode.UsageByParent C = this.f1806P.f1787a.mo3397C();
            if (V2 != null && C != LayoutNode.UsageByParent.NotUsed) {
                while (V2.mo3397C() == C && (V = V2.mo3430V()) != null) {
                    V2 = V;
                }
                int i = C0381a.f1813b[C.ordinal()];
                if (i == 1) {
                    V2.mo3412K0(z);
                } else if (i == 2) {
                    V2.mo3409I0(z);
                } else {
                    throw new IllegalStateException("Intrinsics isn't used by the parent".toString());
                }
            }
        }

        /* renamed from: Y */
        public final void mo3525Y() {
            int i = 0;
            mo3537g0(false);
            v04<LayoutNode> b0 = this.f1806P.f1787a.mo3443b0();
            int n = b0.mo26963n();
            if (n > 0) {
                Object[] m = b0.mo26962m();
                vx2.m53589e(m, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                do {
                    LookaheadPassDelegate w = ((LayoutNode) m[i]).mo3399D().mo3515w();
                    vx2.m53588d(w);
                    w.mo3525Y();
                    i++;
                } while (i < n);
            }
        }

        /* renamed from: Z */
        public final void mo3526Z() {
            if (this.f1806P.mo3505m() > 0) {
                List<LayoutNode> w = this.f1806P.f1787a.mo3479w();
                int size = w.size();
                for (int i = 0; i < size; i++) {
                    LayoutNode layoutNode = w.get(i);
                    LayoutNodeLayoutDelegate D = layoutNode.mo3399D();
                    if (D.mo3506n() && !D.mo3510r()) {
                        LayoutNode.m2539J0(layoutNode, false, 1, (Object) null);
                    }
                    LookaheadPassDelegate w2 = D.mo3515w();
                    if (w2 != null) {
                        w2.mo3526Z();
                    }
                }
            }
        }

        /* renamed from: a */
        public boolean mo3527a() {
            return this.f1800B;
        }

        /* renamed from: a0 */
        public final void mo3528a0() {
            LayoutNode a = this.f1806P.f1787a;
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.f1806P;
            v04<LayoutNode> b0 = a.mo3443b0();
            int n = b0.mo26963n();
            if (n > 0) {
                Object[] m = b0.mo26962m();
                vx2.m53589e(m, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                int i = 0;
                do {
                    LayoutNode layoutNode = (LayoutNode) m[i];
                    if (layoutNode.mo3406H() && layoutNode.mo3419P() == LayoutNode.UsageByParent.InMeasureBlock) {
                        LookaheadPassDelegate w = layoutNode.mo3399D().mo3515w();
                        vx2.m53588d(w);
                        mq0 V = mo3522V();
                        vx2.m53588d(V);
                        if (w.mo3532c0(V.mo23282m())) {
                            LayoutNode.m2540L0(layoutNodeLayoutDelegate.f1787a, false, 1, (Object) null);
                        }
                    }
                    i++;
                } while (i < n);
            }
        }

        /* renamed from: b */
        public AlignmentLines mo3529b() {
            return this.f1802H;
        }

        /* renamed from: b0 */
        public final void mo3530b0() {
            if (!mo3527a()) {
                mo3537g0(true);
                if (!this.f1801C) {
                    mo3535e0();
                }
            }
        }

        /* renamed from: c */
        public Map<C1677cf, Integer> mo3531c() {
            if (!this.f1808r) {
                if (this.f1806P.mo3511s() == LayoutNode.LayoutState.LookaheadMeasuring) {
                    mo3529b().mo3346s(true);
                    if (mo3529b().mo3334g()) {
                        this.f1806P.mo3494E();
                    }
                } else {
                    mo3529b().mo3345r(true);
                }
            }
            ol3 K0 = mo3543s().mo3580K0();
            if (K0 != null) {
                K0.mo23727f0(true);
            }
            mo3540l();
            ol3 K02 = mo3543s().mo3580K0();
            if (K02 != null) {
                K02.mo23727f0(false);
            }
            return mo3529b().mo3335h();
        }

        /* renamed from: c0 */
        public final boolean mo3532c0(long j) {
            boolean z;
            boolean z2;
            boolean z3;
            LayoutNode V = this.f1806P.f1787a.mo3430V();
            LayoutNode a = this.f1806P.f1787a;
            if (this.f1806P.f1787a.mo3472t() || (V != null && V.mo3472t())) {
                z = true;
            } else {
                z = false;
            }
            a.mo3425S0(z);
            if (!this.f1806P.f1787a.mo3406H()) {
                mq0 mq0 = this.f1811y;
                if (mq0 == null) {
                    z3 = false;
                } else {
                    z3 = mq0.m22474e(mq0.mo23282m(), j);
                }
                if (z3) {
                    return false;
                }
            }
            this.f1811y = mq0.m22471b(j);
            mo3529b().mo3346s(false);
            mo3541p(LayoutNodeLayoutDelegate$LookaheadPassDelegate$remeasure$1.INSTANCE);
            this.f1810x = true;
            ol3 K0 = this.f1806P.mo3518z().mo3580K0();
            if (K0 != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                long a2 = tw2.m27948a(K0.mo27277N(), K0.mo27273I());
                this.f1806P.mo3498I(j);
                mo27279Q(tw2.m27948a(K0.mo27277N(), K0.mo27273I()));
                if (sw2.m27143f(a2) == K0.mo27277N() && sw2.m27142e(a2) == K0.mo27273I()) {
                    return false;
                }
                return true;
            }
            throw new IllegalStateException("Lookahead result from lookaheadRemeasure cannot be null".toString());
        }

        /* renamed from: d */
        public C2164df mo3533d() {
            LayoutNodeLayoutDelegate D;
            LayoutNode V = this.f1806P.f1787a.mo3430V();
            if (V == null || (D = V.mo3399D()) == null) {
                return null;
            }
            return D.mo3512t();
        }

        /* renamed from: d0 */
        public final void mo3534d0() {
            if (this.f1809s) {
                mo3520O(this.f1799A, Utils.FLOAT_EPSILON, (rc2<? super nj2, r37>) null);
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        }

        /* renamed from: e0 */
        public final void mo3535e0() {
            v04<LayoutNode> b0 = this.f1806P.f1787a.mo3443b0();
            int n = b0.mo26963n();
            if (n > 0) {
                int i = 0;
                Object[] m = b0.mo26962m();
                vx2.m53589e(m, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                do {
                    LayoutNode layoutNode = (LayoutNode) m[i];
                    layoutNode.mo3421Q0(layoutNode);
                    LookaheadPassDelegate w = layoutNode.mo3399D().mo3515w();
                    vx2.m53588d(w);
                    w.mo3535e0();
                    i++;
                } while (i < n);
            }
        }

        /* renamed from: f0 */
        public final void mo3536f0(boolean z) {
            this.f1804L = z;
        }

        /* renamed from: g0 */
        public void mo3537g0(boolean z) {
            this.f1800B = z;
        }

        /* renamed from: h0 */
        public final void mo3538h0(LayoutNode layoutNode) {
            boolean z;
            LayoutNode.UsageByParent usageByParent;
            LayoutNode V = layoutNode.mo3430V();
            if (V != null) {
                if (layoutNode.mo3419P() == LayoutNode.UsageByParent.NotUsed || layoutNode.mo3472t()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    int i = C0381a.f1812a[V.mo3402F().ordinal()];
                    if (i == 1 || i == 2) {
                        usageByParent = LayoutNode.UsageByParent.InMeasureBlock;
                    } else if (i == 3 || i == 4) {
                        usageByParent = LayoutNode.UsageByParent.InLayoutBlock;
                    } else {
                        throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + V.mo3402F());
                    }
                    layoutNode.mo3437Y0(usageByParent);
                    return;
                }
                throw new IllegalStateException(("measure() may not be called multiple times on the same Measurable. Current state " + layoutNode.mo3419P() + ". Parent state " + V.mo3402F() + '.').toString());
            }
            layoutNode.mo3437Y0(LayoutNode.UsageByParent.NotUsed);
        }

        /* renamed from: i0 */
        public final boolean mo3539i0() {
            Object W = mo3523W();
            ol3 K0 = this.f1806P.mo3518z().mo3580K0();
            vx2.m53588d(K0);
            boolean z = !vx2.m53586b(W, K0.mo23999p0());
            ol3 K02 = this.f1806P.mo3518z().mo3580K0();
            vx2.m53588d(K02);
            this.f1805M = K02.mo23999p0();
            return z;
        }

        /* renamed from: l */
        public void mo3540l() {
            mo3529b().mo3342o();
            if (this.f1806P.mo3513u()) {
                mo3528a0();
            }
            ol3 K0 = mo3543s().mo3580K0();
            vx2.m53588d(K0);
            if (this.f1806P.f1794h || (!this.f1808r && !K0.mo23725c0() && this.f1806P.mo3513u())) {
                this.f1806P.f1793g = false;
                LayoutNode.LayoutState s = this.f1806P.mo3511s();
                this.f1806P.f1788b = LayoutNode.LayoutState.LookaheadLayingOut;
                OwnerSnapshotObserver.m2850e(ze3.m31152a(this.f1806P.f1787a).getSnapshotObserver(), this.f1806P.f1787a, false, new LayoutNodeLayoutDelegate$LookaheadPassDelegate$layoutChildren$1(this, this.f1806P, K0), 2, (Object) null);
                this.f1806P.f1788b = s;
                if (this.f1806P.mo3506n() && K0.mo23725c0()) {
                    requestLayout();
                }
                this.f1806P.f1794h = false;
            }
            if (mo3529b().mo3339l()) {
                mo3529b().mo3344q(true);
            }
            if (mo3529b().mo3334g() && mo3529b().mo3338k()) {
                mo3529b().mo3341n();
            }
        }

        /* renamed from: p */
        public void mo3541p(rc2<? super C2164df, r37> rc2) {
            vx2.m53591g(rc2, "block");
            List<LayoutNode> w = this.f1806P.f1787a.mo3479w();
            int size = w.size();
            for (int i = 0; i < size; i++) {
                C2164df t = w.get(i).mo3399D().mo3512t();
                vx2.m53588d(t);
                rc2.invoke(t);
            }
        }

        public void requestLayout() {
            LayoutNode.m2539J0(this.f1806P.f1787a, false, 1, (Object) null);
        }

        /* renamed from: s */
        public NodeCoordinator mo3543s() {
            return this.f1806P.f1787a.mo3393A();
        }

        /* renamed from: t */
        public vo4 mo3544t(long j) {
            mo3538h0(this.f1806P.f1787a);
            if (this.f1806P.f1787a.mo3397C() == LayoutNode.UsageByParent.NotUsed) {
                this.f1806P.f1787a.mo3458l();
            }
            mo3532c0(j);
            return this;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\f\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\ba\u0010bJ\f\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002J;\u0010\u000e\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0005H\u0002J\b\u0010\u0011\u001a\u00020\u0005H\u0016J\u001d\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0012ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018J;\u0010\u0019\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000bH\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u000fJ\u0006\u0010\u001a\u001a\u00020\u0005J\u0006\u0010\u001b\u001a\u00020\u0016J\u0014\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001cH\u0016J\u001c\u0010!\u001a\u00020\u00052\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u000bH\u0016J\b\u0010\"\u001a\u00020\u0005H\u0016J\b\u0010#\u001a\u00020\u0005H\u0016J\u0006\u0010$\u001a\u00020\u0005J\u000e\u0010&\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u0016R\u0016\u0010(\u001a\u00020\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b'\u0010\u0017R\u0016\u0010*\u001a\u00020\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b)\u0010\u0017R\"\u00100\u001a\u00020\u00168\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b+\u0010\u0017\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001f\u00103\u001a\u00020\u00078\u0002@\u0002X\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b1\u00102R$\u00106\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00109\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b7\u00108R(\u0010@\u001a\u0004\u0018\u00010:2\b\u0010;\u001a\u0004\u0018\u00010:8\u0016@RX\u000e¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u001a\u0010F\u001a\u00020A8\u0016X\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00010G8\u0002X\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\"\u0010N\u001a\u00020\u00168\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bK\u0010\u0017\u001a\u0004\bL\u0010-\"\u0004\bM\u0010/R\u001c\u0010Q\u001a\u0004\u0018\u00010\u00128Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0014\u0010S\u001a\u00020\u00168VX\u0004¢\u0006\u0006\u001a\u0004\bR\u0010-R\u0014\u0010V\u001a\u00020T8VX\u0004¢\u0006\u0006\u001a\u0004\b+\u0010UR\u001a\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u00010W8@X\u0004¢\u0006\u0006\u001a\u0004\bX\u0010YR\u0014\u0010]\u001a\u00020\u001e8VX\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\\R\u0016\u0010`\u001a\u0004\u0018\u00010\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b^\u0010_\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006c"}, mo44877d2 = {"Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate;", "Liq3;", "Lvo4;", "Ldf;", "Landroidx/compose/ui/node/LayoutNode;", "Lr37;", "c0", "Lnw2;", "position", "", "zIndex", "Lkotlin/Function1;", "Lnj2;", "layerBlock", "Y", "(JFLrc2;)V", "X", "l", "Lmq0;", "constraints", "t", "(J)Lvo4;", "", "Z", "(J)Z", "O", "a0", "d0", "", "Lcf;", "", "c", "block", "p", "requestLayout", "E", "W", "forceRequest", "V", "k", "measuredOnce", "r", "placedOnce", "s", "getDuringAlignmentLinesQuery$ui_release", "()Z", "setDuringAlignmentLinesQuery$ui_release", "(Z)V", "duringAlignmentLinesQuery", "x", "J", "lastPosition", "y", "Lrc2;", "lastLayerBlock", "A", "F", "lastZIndex", "", "<set-?>", "B", "Ljava/lang/Object;", "U", "()Ljava/lang/Object;", "parentData", "Landroidx/compose/ui/node/AlignmentLines;", "C", "Landroidx/compose/ui/node/AlignmentLines;", "b", "()Landroidx/compose/ui/node/AlignmentLines;", "alignmentLines", "Lv04;", "H", "Lv04;", "_childMeasurables", "I", "getChildMeasurablesDirty$ui_release", "b0", "childMeasurablesDirty", "T", "()Lmq0;", "lastConstraints", "a", "isPlaced", "Landroidx/compose/ui/node/NodeCoordinator;", "()Landroidx/compose/ui/node/NodeCoordinator;", "innerCoordinator", "", "S", "()Ljava/util/List;", "childMeasurables", "L", "()I", "measuredWidth", "d", "()Ldf;", "parentAlignmentLinesOwner", "<init>", "(Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;)V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: androidx.compose.ui.node.LayoutNodeLayoutDelegate$MeasurePassDelegate */
    /* compiled from: LayoutNodeLayoutDelegate.kt */
    public final class MeasurePassDelegate extends vo4 implements iq3, C2164df {

        /* renamed from: A */
        public float f1814A;

        /* renamed from: B */
        public Object f1815B;

        /* renamed from: C */
        public final AlignmentLines f1816C = new xe3(this);

        /* renamed from: H */
        public final v04<iq3> f1817H = new v04<>(new iq3[16], 0);

        /* renamed from: I */
        public boolean f1818I = true;

        /* renamed from: k */
        public boolean f1820k;

        /* renamed from: r */
        public boolean f1821r;

        /* renamed from: s */
        public boolean f1822s;

        /* renamed from: x */
        public long f1823x = nw2.f15691a.mo23808a();

        /* renamed from: y */
        public rc2<? super nj2, r37> f1824y;

        @Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
        /* renamed from: androidx.compose.ui.node.LayoutNodeLayoutDelegate$MeasurePassDelegate$a */
        /* compiled from: LayoutNodeLayoutDelegate.kt */
        public /* synthetic */ class C0382a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f1825a;

            /* renamed from: b */
            public static final /* synthetic */ int[] f1826b;

            static {
                int[] iArr = new int[LayoutNode.LayoutState.values().length];
                iArr[LayoutNode.LayoutState.Measuring.ordinal()] = 1;
                iArr[LayoutNode.LayoutState.LayingOut.ordinal()] = 2;
                f1825a = iArr;
                int[] iArr2 = new int[LayoutNode.UsageByParent.values().length];
                iArr2[LayoutNode.UsageByParent.InMeasureBlock.ordinal()] = 1;
                iArr2[LayoutNode.UsageByParent.InLayoutBlock.ordinal()] = 2;
                f1826b = iArr2;
            }
        }

        public MeasurePassDelegate() {
        }

        /* renamed from: E */
        public void mo3519E() {
            LayoutNode.m2542P0(LayoutNodeLayoutDelegate.this.f1787a, false, 1, (Object) null);
        }

        /* renamed from: L */
        public int mo3545L() {
            return LayoutNodeLayoutDelegate.this.mo3518z().mo3545L();
        }

        /* renamed from: O */
        public void mo3520O(long j, float f, rc2<? super nj2, r37> rc2) {
            if (!nw2.m23480e(j, this.f1823x)) {
                mo3550W();
            }
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            if (layoutNodeLayoutDelegate.mo3491B(layoutNodeLayoutDelegate.f1787a)) {
                vo4.C3501a.C3502a aVar = vo4.C3501a.f18872a;
                LookaheadPassDelegate w = LayoutNodeLayoutDelegate.this.mo3515w();
                vx2.m53588d(w);
                vo4.C3501a.m29011n(aVar, w, nw2.m23481f(j), nw2.m23482g(j), Utils.FLOAT_EPSILON, 4, (Object) null);
            }
            LayoutNodeLayoutDelegate.this.f1788b = LayoutNode.LayoutState.LayingOut;
            mo3552Y(j, f, rc2);
            LayoutNodeLayoutDelegate.this.f1788b = LayoutNode.LayoutState.Idle;
        }

        /* renamed from: S */
        public final List<iq3> mo3546S() {
            LayoutNodeLayoutDelegate.this.f1787a.mo3447c1();
            if (!this.f1818I) {
                return this.f1817H.mo26957h();
            }
            af3.m228b(LayoutNodeLayoutDelegate.this.f1787a, this.f1817H, LayoutNodeLayoutDelegate$MeasurePassDelegate$childMeasurables$1.INSTANCE);
            this.f1818I = false;
            return this.f1817H.mo26957h();
        }

        /* renamed from: T */
        public final mq0 mo3547T() {
            if (this.f1820k) {
                return mq0.m22471b(mo27276M());
            }
            return null;
        }

        /* renamed from: U */
        public Object mo3548U() {
            return this.f1815B;
        }

        /* renamed from: V */
        public final void mo3549V(boolean z) {
            LayoutNode V;
            LayoutNode V2 = LayoutNodeLayoutDelegate.this.f1787a.mo3430V();
            LayoutNode.UsageByParent C = LayoutNodeLayoutDelegate.this.f1787a.mo3397C();
            if (V2 != null && C != LayoutNode.UsageByParent.NotUsed) {
                while (V2.mo3397C() == C && (V = V2.mo3430V()) != null) {
                    V2 = V;
                }
                int i = C0382a.f1826b[C.ordinal()];
                if (i == 1) {
                    V2.mo3418O0(z);
                } else if (i == 2) {
                    V2.mo3415M0(z);
                } else {
                    throw new IllegalStateException("Intrinsics isn't used by the parent".toString());
                }
            }
        }

        /* renamed from: W */
        public final void mo3550W() {
            if (LayoutNodeLayoutDelegate.this.mo3505m() > 0) {
                List<LayoutNode> w = LayoutNodeLayoutDelegate.this.f1787a.mo3479w();
                int size = w.size();
                for (int i = 0; i < size; i++) {
                    LayoutNode layoutNode = w.get(i);
                    LayoutNodeLayoutDelegate D = layoutNode.mo3399D();
                    if (D.mo3506n() && !D.mo3510r()) {
                        LayoutNode.m2541N0(layoutNode, false, 1, (Object) null);
                    }
                    D.mo3516x().mo3550W();
                }
            }
        }

        /* renamed from: X */
        public final void mo3551X() {
            LayoutNode a = LayoutNodeLayoutDelegate.this.f1787a;
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            v04<LayoutNode> b0 = a.mo3443b0();
            int n = b0.mo26963n();
            if (n > 0) {
                Object[] m = b0.mo26962m();
                vx2.m53589e(m, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                int i = 0;
                do {
                    LayoutNode layoutNode = (LayoutNode) m[i];
                    if (layoutNode.mo3414M() && layoutNode.mo3417O() == LayoutNode.UsageByParent.InMeasureBlock && LayoutNode.m2538E0(layoutNode, (mq0) null, 1, (Object) null)) {
                        LayoutNode.m2542P0(layoutNodeLayoutDelegate.f1787a, false, 1, (Object) null);
                    }
                    i++;
                } while (i < n);
            }
        }

        /* renamed from: Y */
        public final void mo3552Y(long j, float f, rc2<? super nj2, r37> rc2) {
            this.f1823x = j;
            this.f1814A = f;
            this.f1824y = rc2;
            this.f1821r = true;
            mo3529b().mo3345r(false);
            LayoutNodeLayoutDelegate.this.mo3502M(false);
            ze3.m31152a(LayoutNodeLayoutDelegate.this.f1787a).getSnapshotObserver().mo3654b(LayoutNodeLayoutDelegate.this.f1787a, false, new C0388x14fd4410(rc2, LayoutNodeLayoutDelegate.this, j, f));
        }

        /* renamed from: Z */
        public final boolean mo3553Z(long j) {
            boolean z;
            nj4 a = ze3.m31152a(LayoutNodeLayoutDelegate.this.f1787a);
            LayoutNode V = LayoutNodeLayoutDelegate.this.f1787a.mo3430V();
            LayoutNode a2 = LayoutNodeLayoutDelegate.this.f1787a;
            boolean z2 = true;
            if (LayoutNodeLayoutDelegate.this.f1787a.mo3472t() || (V != null && V.mo3472t())) {
                z = true;
            } else {
                z = false;
            }
            a2.mo3425S0(z);
            if (LayoutNodeLayoutDelegate.this.f1787a.mo3414M() || !mq0.m22474e(mo27276M(), j)) {
                mo3529b().mo3346s(false);
                mo3541p(LayoutNodeLayoutDelegate$MeasurePassDelegate$remeasure$1.INSTANCE);
                this.f1820k = true;
                long g = LayoutNodeLayoutDelegate.this.mo3518z().mo3611g();
                mo27280R(j);
                LayoutNodeLayoutDelegate.this.mo3499J(j);
                if (sw2.m27141d(LayoutNodeLayoutDelegate.this.mo3518z().mo3611g(), g) && LayoutNodeLayoutDelegate.this.mo3518z().mo27277N() == mo27277N() && LayoutNodeLayoutDelegate.this.mo3518z().mo27273I() == mo27273I()) {
                    z2 = false;
                }
                mo27279Q(tw2.m27948a(LayoutNodeLayoutDelegate.this.mo3518z().mo27277N(), LayoutNodeLayoutDelegate.this.mo3518z().mo27273I()));
                return z2;
            }
            a.mo3733g(LayoutNodeLayoutDelegate.this.f1787a);
            LayoutNodeLayoutDelegate.this.f1787a.mo3423R0();
            return false;
        }

        /* renamed from: a */
        public boolean mo3527a() {
            return LayoutNodeLayoutDelegate.this.f1787a.mo3440a();
        }

        /* renamed from: a0 */
        public final void mo3554a0() {
            if (this.f1821r) {
                mo3552Y(this.f1823x, this.f1814A, this.f1824y);
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        }

        /* renamed from: b */
        public AlignmentLines mo3529b() {
            return this.f1816C;
        }

        /* renamed from: b0 */
        public final void mo3555b0(boolean z) {
            this.f1818I = z;
        }

        /* renamed from: c */
        public Map<C1677cf, Integer> mo3531c() {
            if (!this.f1822s) {
                if (LayoutNodeLayoutDelegate.this.mo3511s() == LayoutNode.LayoutState.Measuring) {
                    mo3529b().mo3346s(true);
                    if (mo3529b().mo3334g()) {
                        LayoutNodeLayoutDelegate.this.mo3493D();
                    }
                } else {
                    mo3529b().mo3345r(true);
                }
            }
            mo3543s().mo23727f0(true);
            mo3540l();
            mo3543s().mo23727f0(false);
            return mo3529b().mo3335h();
        }

        /* renamed from: c0 */
        public final void mo3556c0(LayoutNode layoutNode) {
            boolean z;
            LayoutNode.UsageByParent usageByParent;
            LayoutNode V = layoutNode.mo3430V();
            if (V != null) {
                if (layoutNode.mo3417O() == LayoutNode.UsageByParent.NotUsed || layoutNode.mo3472t()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    int i = C0382a.f1825a[V.mo3402F().ordinal()];
                    if (i == 1) {
                        usageByParent = LayoutNode.UsageByParent.InMeasureBlock;
                    } else if (i == 2) {
                        usageByParent = LayoutNode.UsageByParent.InLayoutBlock;
                    } else {
                        throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + V.mo3402F());
                    }
                    layoutNode.mo3435X0(usageByParent);
                    return;
                }
                throw new IllegalStateException(("measure() may not be called multiple times on the same Measurable. Current state " + layoutNode.mo3417O() + ". Parent state " + V.mo3402F() + '.').toString());
            }
            layoutNode.mo3435X0(LayoutNode.UsageByParent.NotUsed);
        }

        /* renamed from: d */
        public C2164df mo3533d() {
            LayoutNodeLayoutDelegate D;
            LayoutNode V = LayoutNodeLayoutDelegate.this.f1787a.mo3430V();
            if (V == null || (D = V.mo3399D()) == null) {
                return null;
            }
            return D.mo3504l();
        }

        /* renamed from: d0 */
        public final boolean mo3557d0() {
            boolean z = !vx2.m53586b(mo3548U(), LayoutNodeLayoutDelegate.this.mo3518z().mo3582M0());
            this.f1815B = LayoutNodeLayoutDelegate.this.mo3518z().mo3582M0();
            return z;
        }

        /* renamed from: l */
        public void mo3540l() {
            mo3529b().mo3342o();
            if (LayoutNodeLayoutDelegate.this.mo3510r()) {
                mo3551X();
            }
            if (LayoutNodeLayoutDelegate.this.f1791e || (!this.f1822s && !mo3543s().mo23725c0() && LayoutNodeLayoutDelegate.this.mo3510r())) {
                LayoutNodeLayoutDelegate.this.f1790d = false;
                LayoutNode.LayoutState s = LayoutNodeLayoutDelegate.this.mo3511s();
                LayoutNodeLayoutDelegate.this.f1788b = LayoutNode.LayoutState.LayingOut;
                LayoutNode a = LayoutNodeLayoutDelegate.this.f1787a;
                ze3.m31152a(a).getSnapshotObserver().mo3655d(a, false, new LayoutNodeLayoutDelegate$MeasurePassDelegate$layoutChildren$1$1(LayoutNodeLayoutDelegate.this, this, a));
                LayoutNodeLayoutDelegate.this.f1788b = s;
                if (mo3543s().mo23725c0() && LayoutNodeLayoutDelegate.this.mo3506n()) {
                    requestLayout();
                }
                LayoutNodeLayoutDelegate.this.f1791e = false;
            }
            if (mo3529b().mo3339l()) {
                mo3529b().mo3344q(true);
            }
            if (mo3529b().mo3334g() && mo3529b().mo3338k()) {
                mo3529b().mo3341n();
            }
        }

        /* renamed from: p */
        public void mo3541p(rc2<? super C2164df, r37> rc2) {
            vx2.m53591g(rc2, "block");
            List<LayoutNode> w = LayoutNodeLayoutDelegate.this.f1787a.mo3479w();
            int size = w.size();
            for (int i = 0; i < size; i++) {
                rc2.invoke(w.get(i).mo3399D().mo3504l());
            }
        }

        public void requestLayout() {
            LayoutNode.m2541N0(LayoutNodeLayoutDelegate.this.f1787a, false, 1, (Object) null);
        }

        /* renamed from: s */
        public NodeCoordinator mo3543s() {
            return LayoutNodeLayoutDelegate.this.f1787a.mo3393A();
        }

        /* renamed from: t */
        public vo4 mo3544t(long j) {
            LayoutNode.UsageByParent C = LayoutNodeLayoutDelegate.this.f1787a.mo3397C();
            LayoutNode.UsageByParent usageByParent = LayoutNode.UsageByParent.NotUsed;
            if (C == usageByParent) {
                LayoutNodeLayoutDelegate.this.f1787a.mo3458l();
            }
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
            if (layoutNodeLayoutDelegate.mo3491B(layoutNodeLayoutDelegate.f1787a)) {
                this.f1820k = true;
                mo27280R(j);
                LayoutNodeLayoutDelegate.this.f1787a.mo3437Y0(usageByParent);
                LookaheadPassDelegate w = LayoutNodeLayoutDelegate.this.mo3515w();
                vx2.m53588d(w);
                w.mo3544t(j);
            }
            mo3556c0(LayoutNodeLayoutDelegate.this.f1787a);
            mo3553Z(j);
            return this;
        }
    }

    public LayoutNodeLayoutDelegate(LayoutNode layoutNode) {
        vx2.m53591g(layoutNode, "layoutNode");
        this.f1787a = layoutNode;
    }

    /* renamed from: A */
    public final int mo3490A() {
        return this.f1797k.mo27277N();
    }

    /* renamed from: B */
    public final boolean mo3491B(LayoutNode layoutNode) {
        LayoutNode layoutNode2;
        sl3 K = layoutNode.mo3411K();
        if (K != null) {
            layoutNode2 = K.mo25853a();
        } else {
            layoutNode2 = null;
        }
        return vx2.m53586b(layoutNode2, layoutNode);
    }

    /* renamed from: C */
    public final void mo3492C() {
        this.f1797k.mo3555b0(true);
        LookaheadPassDelegate lookaheadPassDelegate = this.f1798l;
        if (lookaheadPassDelegate != null) {
            lookaheadPassDelegate.mo3536f0(true);
        }
    }

    /* renamed from: D */
    public final void mo3493D() {
        this.f1790d = true;
        this.f1791e = true;
    }

    /* renamed from: E */
    public final void mo3494E() {
        this.f1793g = true;
        this.f1794h = true;
    }

    /* renamed from: F */
    public final void mo3495F() {
        this.f1792f = true;
    }

    /* renamed from: G */
    public final void mo3496G() {
        this.f1789c = true;
    }

    /* renamed from: H */
    public final void mo3497H(sl3 sl3) {
        LookaheadPassDelegate lookaheadPassDelegate;
        if (sl3 != null) {
            lookaheadPassDelegate = new LookaheadPassDelegate(this, sl3);
        } else {
            lookaheadPassDelegate = null;
        }
        this.f1798l = lookaheadPassDelegate;
    }

    /* renamed from: I */
    public final void mo3498I(long j) {
        this.f1788b = LayoutNode.LayoutState.LookaheadMeasuring;
        this.f1792f = false;
        OwnerSnapshotObserver.m2851g(ze3.m31152a(this.f1787a).getSnapshotObserver(), this.f1787a, false, new LayoutNodeLayoutDelegate$performLookaheadMeasure$1(this, j), 2, (Object) null);
        mo3494E();
        if (mo3491B(this.f1787a)) {
            mo3493D();
        } else {
            mo3496G();
        }
        this.f1788b = LayoutNode.LayoutState.Idle;
    }

    /* renamed from: J */
    public final void mo3499J(long j) {
        boolean z;
        LayoutNode.LayoutState layoutState = this.f1788b;
        LayoutNode.LayoutState layoutState2 = LayoutNode.LayoutState.Idle;
        if (layoutState == layoutState2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            LayoutNode.LayoutState layoutState3 = LayoutNode.LayoutState.Measuring;
            this.f1788b = layoutState3;
            this.f1789c = false;
            ze3.m31152a(this.f1787a).getSnapshotObserver().mo3656f(this.f1787a, false, new LayoutNodeLayoutDelegate$performMeasure$2(this, j));
            if (this.f1788b == layoutState3) {
                mo3493D();
                this.f1788b = layoutState2;
                return;
            }
            return;
        }
        throw new IllegalStateException("layout state is not idle before measure starts".toString());
    }

    /* renamed from: K */
    public final void mo3500K() {
        AlignmentLines b;
        this.f1797k.mo3529b().mo3343p();
        LookaheadPassDelegate lookaheadPassDelegate = this.f1798l;
        if (lookaheadPassDelegate != null && (b = lookaheadPassDelegate.mo3529b()) != null) {
            b.mo3343p();
        }
    }

    /* renamed from: L */
    public final void mo3501L(int i) {
        boolean z;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate;
        int i2 = this.f1796j;
        this.f1796j = i;
        boolean z2 = false;
        if (i2 == 0) {
            z = true;
        } else {
            z = false;
        }
        if (i == 0) {
            z2 = true;
        }
        if (z != z2) {
            LayoutNode V = this.f1787a.mo3430V();
            if (V != null) {
                layoutNodeLayoutDelegate = V.mo3399D();
            } else {
                layoutNodeLayoutDelegate = null;
            }
            if (layoutNodeLayoutDelegate == null) {
                return;
            }
            if (i == 0) {
                layoutNodeLayoutDelegate.mo3501L(layoutNodeLayoutDelegate.f1796j - 1);
            } else {
                layoutNodeLayoutDelegate.mo3501L(layoutNodeLayoutDelegate.f1796j + 1);
            }
        }
    }

    /* renamed from: M */
    public final void mo3502M(boolean z) {
        if (this.f1795i != z) {
            this.f1795i = z;
            if (z) {
                mo3501L(this.f1796j + 1);
            } else {
                mo3501L(this.f1796j - 1);
            }
        }
    }

    /* renamed from: N */
    public final void mo3503N() {
        boolean z;
        LayoutNode V;
        if (this.f1797k.mo3557d0() && (V = this.f1787a.mo3430V()) != null) {
            LayoutNode.m2542P0(V, false, 1, (Object) null);
        }
        LookaheadPassDelegate lookaheadPassDelegate = this.f1798l;
        if (lookaheadPassDelegate == null || !lookaheadPassDelegate.mo3539i0()) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return;
        }
        if (mo3491B(this.f1787a)) {
            LayoutNode V2 = this.f1787a.mo3430V();
            if (V2 != null) {
                LayoutNode.m2542P0(V2, false, 1, (Object) null);
                return;
            }
            return;
        }
        LayoutNode V3 = this.f1787a.mo3430V();
        if (V3 != null) {
            LayoutNode.m2540L0(V3, false, 1, (Object) null);
        }
    }

    /* renamed from: l */
    public final C2164df mo3504l() {
        return this.f1797k;
    }

    /* renamed from: m */
    public final int mo3505m() {
        return this.f1796j;
    }

    /* renamed from: n */
    public final boolean mo3506n() {
        return this.f1795i;
    }

    /* renamed from: o */
    public final int mo3507o() {
        return this.f1797k.mo27273I();
    }

    /* renamed from: p */
    public final mq0 mo3508p() {
        return this.f1797k.mo3547T();
    }

    /* renamed from: q */
    public final mq0 mo3509q() {
        LookaheadPassDelegate lookaheadPassDelegate = this.f1798l;
        if (lookaheadPassDelegate != null) {
            return lookaheadPassDelegate.mo3522V();
        }
        return null;
    }

    /* renamed from: r */
    public final boolean mo3510r() {
        return this.f1790d;
    }

    /* renamed from: s */
    public final LayoutNode.LayoutState mo3511s() {
        return this.f1788b;
    }

    /* renamed from: t */
    public final C2164df mo3512t() {
        return this.f1798l;
    }

    /* renamed from: u */
    public final boolean mo3513u() {
        return this.f1793g;
    }

    /* renamed from: v */
    public final boolean mo3514v() {
        return this.f1792f;
    }

    /* renamed from: w */
    public final LookaheadPassDelegate mo3515w() {
        return this.f1798l;
    }

    /* renamed from: x */
    public final MeasurePassDelegate mo3516x() {
        return this.f1797k;
    }

    /* renamed from: y */
    public final boolean mo3517y() {
        return this.f1789c;
    }

    /* renamed from: z */
    public final NodeCoordinator mo3518z() {
        return this.f1787a.mo3424S().mo28351n();
    }
}
