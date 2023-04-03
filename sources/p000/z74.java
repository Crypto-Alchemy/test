package p000;

import androidx.compose.p004ui.node.BackwardsCompatNode;
import androidx.compose.p004ui.node.LayoutNode;
import androidx.compose.p004ui.node.NodeChainKt;
import androidx.compose.p004ui.node.NodeCoordinator;
import kotlin.Metadata;
import p000.sw3;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0002,2B\u000f\u0012\u0006\u00100\u001a\u00020+¢\u0006\u0004\bO\u0010PJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J0\u0010\r\u001a\u00060\fR\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J<\u0010\u0011\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006H\u0002J\u0010\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0002J\u0010\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0002J\u0018\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0006H\u0002J\u0018\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006H\u0002J \u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0006H\u0002J\u0017\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001dH\u0000¢\u0006\u0004\b\u001f\u0010 J\u0006\u0010!\u001a\u00020\u0002J\u000f\u0010\"\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\"\u0010#J!\u0010'\u001a\u00020&2\n\u0010%\u001a\u0006\u0012\u0002\b\u00030$H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010(J\b\u0010*\u001a\u00020)H\u0016R\u0017\u00100\u001a\u00020+8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001a\u00105\u001a\u0002018\u0000X\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b\u001e\u00104R$\u0010<\u001a\u0002062\u0006\u00107\u001a\u0002068\u0000@BX\u000e¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R$\u0010C\u001a\u00020\u00062\u0006\u00107\u001a\u00020\u00068\u0000@BX\u000e¢\u0006\f\n\u0004\bA\u0010>\u001a\u0004\bB\u0010@R\u001e\u0010E\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b!\u0010DR\u001e\u0010F\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010DR\u001c\u0010H\u001a\b\u0018\u00010\fR\u00020\u00008\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\"\u0010GR\u0018\u0010K\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010JR\u0014\u0010N\u001a\u00020\u000e8BX\u0004¢\u0006\u0006\u001a\u0004\bL\u0010M\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006Q"}, mo44877d2 = {"Lz74;", "", "Lr37;", "r", "w", "v", "Lsw3$c;", "tail", "Lv04;", "Lsw3$b;", "before", "after", "Lz74$a;", "k", "", "beforeSize", "afterSize", "u", "prev", "next", "t", "node", "i", "s", "element", "child", "g", "q", "y", "Lsw3;", "m", "x", "(Lsw3;)V", "f", "h", "()V", "Lc84;", "type", "", "p", "(I)Z", "", "toString", "Landroidx/compose/ui/node/LayoutNode;", "a", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Lru2;", "b", "Lru2;", "()Lru2;", "innerCoordinator", "Landroidx/compose/ui/node/NodeCoordinator;", "<set-?>", "c", "Landroidx/compose/ui/node/NodeCoordinator;", "n", "()Landroidx/compose/ui/node/NodeCoordinator;", "outerCoordinator", "d", "Lsw3$c;", "o", "()Lsw3$c;", "e", "l", "head", "Lv04;", "current", "buffer", "Lz74$a;", "cachedDiffer", "Lz74$b;", "Lz74$b;", "logger", "j", "()I", "aggregateChildKindSet", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: z74 */
/* compiled from: NodeChain.kt */
public final class z74 {

    /* renamed from: a */
    public final LayoutNode f20479a;

    /* renamed from: b */
    public final ru2 f20480b;

    /* renamed from: c */
    public NodeCoordinator f20481c;

    /* renamed from: d */
    public final sw3.C3310c f20482d;

    /* renamed from: e */
    public sw3.C3310c f20483e;

    /* renamed from: f */
    public v04<sw3.C3309b> f20484f;

    /* renamed from: g */
    public v04<sw3.C3309b> f20485g;

    /* renamed from: h */
    public C3718a f20486h;

    /* renamed from: i */
    public C3719b f20487i;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0004\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0012\u001a\u00020\f\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019¢\u0006\u0004\b$\u0010%J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016R\"\u0010\u0012\u001a\u00020\f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0018\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R(\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR(\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010\u001d\"\u0004\b!\u0010\u001f¨\u0006&"}, mo44877d2 = {"Lz74$a;", "Lgg1;", "", "oldIndex", "newIndex", "", "a", "atIndex", "Lr37;", "c", "remove", "b", "Lsw3$c;", "Lsw3$c;", "getNode", "()Lsw3$c;", "g", "(Lsw3$c;)V", "node", "I", "getAggregateChildKindSet", "()I", "e", "(I)V", "aggregateChildKindSet", "Lv04;", "Lsw3$b;", "Lv04;", "getBefore", "()Lv04;", "f", "(Lv04;)V", "before", "d", "getAfter", "after", "<init>", "(Lz74;Lsw3$c;ILv04;Lv04;)V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: z74$a */
    /* compiled from: NodeChain.kt */
    public final class C3718a implements gg1 {

        /* renamed from: a */
        public sw3.C3310c f20488a;

        /* renamed from: b */
        public int f20489b;

        /* renamed from: c */
        public v04<sw3.C3309b> f20490c;

        /* renamed from: d */
        public v04<sw3.C3309b> f20491d;

        /* renamed from: e */
        public final /* synthetic */ z74 f20492e;

        public C3718a(z74 z74, sw3.C3310c cVar, int i, v04<sw3.C3309b> v04, v04<sw3.C3309b> v042) {
            vx2.m53591g(cVar, "node");
            vx2.m53591g(v04, "before");
            vx2.m53591g(v042, "after");
            this.f20492e = z74;
            this.f20488a = cVar;
            this.f20489b = i;
            this.f20490c = v04;
            this.f20491d = v042;
        }

        /* renamed from: a */
        public boolean mo20574a(int i, int i2) {
            if (NodeChainKt.m2743e((sw3.C3309b) this.f20490c.mo26962m()[i], (sw3.C3309b) this.f20491d.mo26962m()[i2]) != 0) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public void mo20575b(int i, int i2) {
            sw3.C3310c x = this.f20488a.mo25989x();
            vx2.m53588d(x);
            this.f20488a = x;
            sw3.C3309b bVar = (sw3.C3309b) this.f20490c.mo26962m()[i];
            sw3.C3309b bVar2 = (sw3.C3309b) this.f20491d.mo26962m()[i2];
            if (!vx2.m53586b(bVar, bVar2)) {
                sw3.C3310c cVar = this.f20488a;
                this.f20488a = this.f20492e.mo28363y(bVar, bVar2, cVar);
                C3719b d = this.f20492e.f20487i;
                if (d != null) {
                    d.mo28372e(i, i2, bVar, bVar2, cVar, this.f20488a);
                }
            } else {
                C3719b d2 = this.f20492e.f20487i;
                if (d2 != null) {
                    d2.mo28369b(i, i2, bVar, bVar2, this.f20488a);
                }
            }
            int w = this.f20489b | this.f20488a.mo25988w();
            this.f20489b = w;
            this.f20488a.mo25977B(w);
        }

        /* renamed from: c */
        public void mo20576c(int i, int i2) {
            sw3.C3310c cVar = this.f20488a;
            this.f20488a = this.f20492e.mo28344g((sw3.C3309b) this.f20491d.mo26962m()[i2], cVar);
            C3719b d = this.f20492e.f20487i;
            if (d != null) {
                d.mo28368a(i, i2, (sw3.C3309b) this.f20491d.mo26962m()[i2], cVar, this.f20488a);
            }
            int w = this.f20489b | this.f20488a.mo25988w();
            this.f20489b = w;
            this.f20488a.mo25977B(w);
        }

        /* renamed from: d */
        public final void mo28364d(v04<sw3.C3309b> v04) {
            vx2.m53591g(v04, "<set-?>");
            this.f20491d = v04;
        }

        /* renamed from: e */
        public final void mo28365e(int i) {
            this.f20489b = i;
        }

        /* renamed from: f */
        public final void mo28366f(v04<sw3.C3309b> v04) {
            vx2.m53591g(v04, "<set-?>");
            this.f20490c = v04;
        }

        /* renamed from: g */
        public final void mo28367g(sw3.C3310c cVar) {
            vx2.m53591g(cVar, "<set-?>");
            this.f20488a = cVar;
        }

        public void remove(int i) {
            sw3.C3310c x = this.f20488a.mo25989x();
            vx2.m53588d(x);
            this.f20488a = x;
            C3719b d = this.f20492e.f20487i;
            if (d != null) {
                d.mo28371d(i, (sw3.C3309b) this.f20490c.mo26962m()[i], this.f20488a);
            }
            this.f20488a = this.f20492e.mo28346i(this.f20488a);
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b`\u0018\u00002\u00020\u0001J(\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&J8\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H&J0\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&J0\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0007H&J \u0010\u0016\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0017À\u0006\u0001"}, mo44877d2 = {"Lz74$b;", "", "", "index", "Lsw3$b;", "prev", "next", "Lsw3$c;", "node", "Lr37;", "c", "oldIndex", "newIndex", "before", "after", "e", "b", "atIndex", "element", "child", "inserted", "a", "d", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: z74$b */
    /* compiled from: NodeChain.kt */
    public interface C3719b {
        /* renamed from: a */
        void mo28368a(int i, int i2, sw3.C3309b bVar, sw3.C3310c cVar, sw3.C3310c cVar2);

        /* renamed from: b */
        void mo28369b(int i, int i2, sw3.C3309b bVar, sw3.C3309b bVar2, sw3.C3310c cVar);

        /* renamed from: c */
        void mo28370c(int i, sw3.C3309b bVar, sw3.C3309b bVar2, sw3.C3310c cVar);

        /* renamed from: d */
        void mo28371d(int i, sw3.C3309b bVar, sw3.C3310c cVar);

        /* renamed from: e */
        void mo28372e(int i, int i2, sw3.C3309b bVar, sw3.C3309b bVar2, sw3.C3310c cVar, sw3.C3310c cVar2);
    }

    public z74(LayoutNode layoutNode) {
        vx2.m53591g(layoutNode, "layoutNode");
        this.f20479a = layoutNode;
        ru2 ru2 = new ru2(layoutNode);
        this.f20480b = ru2;
        this.f20481c = ru2;
        sw3.C3310c P0 = ru2.mo3585P0();
        this.f20482d = P0;
        this.f20483e = P0;
    }

    /* renamed from: f */
    public final void mo28343f() {
        for (sw3.C3310c l = mo28349l(); l != null; l = l.mo25986u()) {
            if (!l.mo25990y()) {
                l.mo25983r();
            }
        }
    }

    /* renamed from: g */
    public final sw3.C3310c mo28344g(sw3.C3309b bVar, sw3.C3310c cVar) {
        sw3.C3310c cVar2;
        if (bVar instanceof cx3) {
            cVar2 = ((cx3) bVar).mo18367q();
            cVar2.mo25979D(d84.m14845b(cVar2));
        } else {
            cVar2 = new BackwardsCompatNode(bVar);
        }
        return mo28354q(cVar2, cVar);
    }

    /* renamed from: h */
    public final void mo28345h() {
        for (sw3.C3310c o = mo28352o(); o != null; o = o.mo25989x()) {
            if (o.mo25990y()) {
                o.mo25984s();
            }
        }
    }

    /* renamed from: i */
    public final sw3.C3310c mo28346i(sw3.C3310c cVar) {
        if (cVar.mo25990y()) {
            cVar.mo25984s();
        }
        return mo28356s(cVar);
    }

    /* renamed from: j */
    public final int mo28347j() {
        return this.f20483e.mo25985t();
    }

    /* renamed from: k */
    public final C3718a mo28348k(sw3.C3310c cVar, v04<sw3.C3309b> v04, v04<sw3.C3309b> v042) {
        C3718a aVar = this.f20486h;
        if (aVar == null) {
            C3718a aVar2 = new C3718a(this, cVar, cVar.mo25985t(), v04, v042);
            this.f20486h = aVar2;
            return aVar2;
        }
        aVar.mo28367g(cVar);
        aVar.mo28365e(cVar.mo25985t());
        aVar.mo28366f(v04);
        aVar.mo28364d(v042);
        return aVar;
    }

    /* renamed from: l */
    public final sw3.C3310c mo28349l() {
        return this.f20483e;
    }

    /* renamed from: m */
    public final ru2 mo28350m() {
        return this.f20480b;
    }

    /* renamed from: n */
    public final NodeCoordinator mo28351n() {
        return this.f20481c;
    }

    /* renamed from: o */
    public final sw3.C3310c mo28352o() {
        return this.f20482d;
    }

    /* renamed from: p */
    public final boolean mo28353p(int i) {
        if ((i & mo28347j()) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public final sw3.C3310c mo28354q(sw3.C3310c cVar, sw3.C3310c cVar2) {
        sw3.C3310c x = cVar2.mo25989x();
        if (x != null) {
            x.mo25978C(cVar);
            cVar.mo25980E(x);
        }
        cVar2.mo25980E(cVar);
        cVar.mo25978C(cVar2);
        return cVar;
    }

    /* renamed from: r */
    public final void mo28355r() {
        boolean z;
        if (this.f20483e != NodeChainKt.f1827a) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            sw3.C3310c cVar = this.f20483e;
            cVar.mo25980E(NodeChainKt.f1827a);
            NodeChainKt.f1827a.mo25978C(cVar);
            this.f20483e = NodeChainKt.f1827a;
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: s */
    public final sw3.C3310c mo28356s(sw3.C3310c cVar) {
        sw3.C3310c u = cVar.mo25986u();
        sw3.C3310c x = cVar.mo25989x();
        if (u != null) {
            u.mo25980E(x);
            cVar.mo25978C((sw3.C3310c) null);
        }
        if (x != null) {
            x.mo25978C(u);
            cVar.mo25980E((sw3.C3310c) null);
        }
        vx2.m53588d(u);
        return u;
    }

    /* renamed from: t */
    public final sw3.C3310c mo28357t(sw3.C3310c cVar, sw3.C3310c cVar2) {
        sw3.C3310c x = cVar.mo25989x();
        if (x != null) {
            cVar2.mo25980E(x);
            x.mo25978C(cVar2);
            cVar.mo25980E((sw3.C3310c) null);
        }
        sw3.C3310c u = cVar.mo25986u();
        if (u != null) {
            cVar2.mo25978C(u);
            u.mo25980E(cVar2);
            cVar.mo25978C((sw3.C3310c) null);
        }
        cVar2.mo25982G(cVar.mo25987v());
        return cVar2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        if (this.f20483e != this.f20482d) {
            sw3.C3310c l = mo28349l();
            while (true) {
                if (l == null || l == mo28352o()) {
                    break;
                }
                sb.append(String.valueOf(l));
                if (l.mo25986u() == this.f20482d) {
                    sb.append("]");
                    break;
                }
                sb.append(",");
                l = l.mo25986u();
            }
        } else {
            sb.append("]");
        }
        String sb2 = sb.toString();
        vx2.m53590f(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: u */
    public final void mo28359u(v04<sw3.C3309b> v04, int i, v04<sw3.C3309b> v042, int i2, sw3.C3310c cVar) {
        f24.m16472e(i, i2, mo28348k(cVar, v04, v042));
    }

    /* renamed from: v */
    public final void mo28360v() {
        NodeCoordinator nodeCoordinator;
        boolean z;
        te3 te3;
        NodeCoordinator nodeCoordinator2 = this.f20480b;
        for (sw3.C3310c x = this.f20482d.mo25989x(); x != null; x = x.mo25989x()) {
            if ((g84.f12195a.mo20429e() & x.mo25988w()) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z || !(x instanceof se3)) {
                x.mo25982G(nodeCoordinator2);
            } else {
                if (x.mo25990y()) {
                    NodeCoordinator v = x.mo25987v();
                    vx2.m53589e(v, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
                    te3 te32 = (te3) v;
                    se3 B1 = te32.mo26432B1();
                    te32.mo26434D1((se3) x);
                    te3 = te32;
                    if (B1 != x) {
                        te32.mo3615h1();
                        te3 = te32;
                    }
                } else {
                    te3 te33 = new te3(this.f20479a, (se3) x);
                    x.mo25982G(te33);
                    te3 = te33;
                }
                nodeCoordinator2.mo3626r1(te3);
                te3.mo3625q1(nodeCoordinator2);
                nodeCoordinator2 = te3;
            }
        }
        LayoutNode V = this.f20479a.mo3430V();
        if (V != null) {
            nodeCoordinator = V.mo3393A();
        } else {
            nodeCoordinator = null;
        }
        nodeCoordinator2.mo3626r1(nodeCoordinator);
        this.f20481c = nodeCoordinator2;
    }

    /* renamed from: w */
    public final void mo28361w() {
        boolean z;
        boolean z2 = true;
        if (this.f20483e == NodeChainKt.f1827a) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            sw3.C3310c u = NodeChainKt.f1827a.mo25986u();
            if (u == null) {
                u = this.f20482d;
            }
            this.f20483e = u;
            u.mo25980E((sw3.C3310c) null);
            NodeChainKt.f1827a.mo25978C((sw3.C3310c) null);
            if (this.f20483e == NodeChainKt.f1827a) {
                z2 = false;
            }
            if (!z2) {
                throw new IllegalStateException("Check failed.".toString());
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo28362x(p000.sw3 r18) {
        /*
            r17 = this;
            r6 = r17
            r0 = r18
            java.lang.String r1 = "m"
            p000.vx2.m53591g(r0, r1)
            r17.mo28355r()
            v04<sw3$b> r1 = r6.f20484f
            r2 = 16
            r3 = 0
            if (r1 != 0) goto L_0x001a
            v04 r1 = new v04
            sw3$b[] r4 = new p000.sw3.C3309b[r2]
            r1.<init>(r4, r3)
        L_0x001a:
            r7 = r1
            v04<sw3$b> r1 = r6.f20485g
            if (r1 != 0) goto L_0x0026
            v04 r1 = new v04
            sw3$b[] r2 = new p000.sw3.C3309b[r2]
            r1.<init>(r2, r3)
        L_0x0026:
            v04 r8 = androidx.compose.p004ui.node.NodeChainKt.m2742d(r0, r1)
            int r0 = r8.mo26963n()
            int r1 = r7.mo26963n()
            r9 = 1
            if (r0 != r1) goto L_0x00c4
            int r0 = r7.mo26963n()
            sw3$c r1 = r6.f20482d
            sw3$c r1 = r1.mo25989x()
            int r0 = r0 - r9
            r2 = r3
            r4 = r2
        L_0x0042:
            if (r1 == 0) goto L_0x00a4
            if (r0 < 0) goto L_0x00a4
            java.lang.Object[] r5 = r7.mo26962m()
            r5 = r5[r0]
            r13 = r5
            sw3$b r13 = (p000.sw3.C3309b) r13
            java.lang.Object[] r5 = r8.mo26962m()
            r5 = r5[r0]
            r14 = r5
            sw3$b r14 = (p000.sw3.C3309b) r14
            int r5 = androidx.compose.p004ui.node.NodeChainKt.m2743e(r13, r14)
            if (r5 == 0) goto L_0x0097
            if (r5 == r9) goto L_0x006f
            r10 = 2
            if (r5 == r10) goto L_0x0064
            goto L_0x0088
        L_0x0064:
            z74$b r10 = r6.f20487i
            if (r10 == 0) goto L_0x0088
            r11 = r0
            r12 = r0
            r15 = r1
            r10.mo28369b(r11, r12, r13, r14, r15)
            goto L_0x0088
        L_0x006f:
            sw3$c r5 = r6.mo28363y(r13, r14, r1)
            if (r2 != 0) goto L_0x007a
            if (r1 == r5) goto L_0x0078
            goto L_0x007a
        L_0x0078:
            r2 = r3
            goto L_0x007b
        L_0x007a:
            r2 = r9
        L_0x007b:
            z74$b r10 = r6.f20487i
            if (r10 == 0) goto L_0x0087
            r11 = r0
            r12 = r0
            r15 = r1
            r16 = r5
            r10.mo28372e(r11, r12, r13, r14, r15, r16)
        L_0x0087:
            r1 = r5
        L_0x0088:
            int r0 = r0 + -1
            int r5 = r1.mo25988w()
            r4 = r4 | r5
            r1.mo25977B(r4)
            sw3$c r1 = r1.mo25989x()
            goto L_0x0042
        L_0x0097:
            z74$b r4 = r6.f20487i
            if (r4 == 0) goto L_0x009e
            r4.mo28370c(r0, r13, r14, r1)
        L_0x009e:
            int r0 = r0 + 1
            sw3$c r1 = r1.mo25986u()
        L_0x00a4:
            r4 = r0
            r5 = r1
            if (r4 <= 0) goto L_0x00c2
            if (r5 == 0) goto L_0x00ab
            r3 = r9
        L_0x00ab:
            if (r3 == 0) goto L_0x00b6
            r0 = r17
            r1 = r7
            r2 = r4
            r3 = r8
            r0.mo28359u(r1, r2, r3, r4, r5)
            goto L_0x0107
        L_0x00b6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Check failed."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00c2:
            r9 = r2
            goto L_0x0108
        L_0x00c4:
            int r0 = r7.mo26963n()
            if (r0 != 0) goto L_0x00f6
            int r0 = r8.mo26963n()
            int r0 = r0 - r9
            sw3$c r1 = r6.f20482d
        L_0x00d1:
            r14 = r1
            if (r0 < 0) goto L_0x0107
            java.lang.Object[] r1 = r8.mo26962m()
            r1 = r1[r0]
            r13 = r1
            sw3$b r13 = (p000.sw3.C3309b) r13
            sw3$c r1 = r6.mo28344g(r13, r14)
            z74$b r10 = r6.f20487i
            if (r10 == 0) goto L_0x00eb
            r11 = 0
            r12 = r0
            r15 = r1
            r10.mo28368a(r11, r12, r13, r14, r15)
        L_0x00eb:
            int r2 = r1.mo25988w()
            r3 = r3 | r2
            r1.mo25977B(r3)
            int r0 = r0 + -1
            goto L_0x00d1
        L_0x00f6:
            int r2 = r7.mo26963n()
            int r4 = r8.mo26963n()
            sw3$c r5 = r6.f20482d
            r0 = r17
            r1 = r7
            r3 = r8
            r0.mo28359u(r1, r2, r3, r4, r5)
        L_0x0107:
            r3 = r9
        L_0x0108:
            r6.f20484f = r8
            r7.mo26958i()
            r6.f20485g = r7
            r17.mo28361w()
            if (r3 == 0) goto L_0x0117
            r17.mo28360v()
        L_0x0117:
            if (r9 == 0) goto L_0x0124
            androidx.compose.ui.node.LayoutNode r0 = r6.f20479a
            boolean r0 = r0.mo3459l0()
            if (r0 == 0) goto L_0x0124
            r17.mo28343f()
        L_0x0124:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.z74.mo28362x(sw3):void");
    }

    /* renamed from: y */
    public final sw3.C3310c mo28363y(sw3.C3309b bVar, sw3.C3309b bVar2, sw3.C3310c cVar) {
        if ((bVar instanceof cx3) && (bVar2 instanceof cx3)) {
            sw3.C3310c c = NodeChainKt.m2744f((cx3) bVar2, cVar);
            if (c == cVar) {
                return c;
            }
            cVar.mo25984s();
            return mo28357t(cVar, c);
        } else if (cVar instanceof BackwardsCompatNode) {
            ((BackwardsCompatNode) cVar).mo3355N(bVar2);
            return cVar;
        } else {
            throw new IllegalStateException("Check failed.".toString());
        }
    }
}
