package p000;

import androidx.compose.runtime.ComposerKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.nn0;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u0015\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010(\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0000\u0018\u0000 µ\u00012\u00020\u0001:\u0001vB\u0011\u0012\u0006\u0010n\u001a\u00020m¢\u0006\u0006\b³\u0001\u0010´\u0001J,\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0002J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0002H\u0002J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0002H\u0002J\b\u0010\r\u001a\u00020\bH\u0002J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002H\u0002J\u0018\u0010\u0011\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0002H\u0002J\b\u0010\u0013\u001a\u00020\bH\u0002J\b\u0010\u0014\u001a\u00020\u0002H\u0002J \u0010\u0018\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002H\u0002J\u0010\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0002H\u0002J\u0018\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0002J\u0010\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u0002H\u0002J\u0018\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0002J\u0018\u0010!\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u0002H\u0002J \u0010\"\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0002J\u001a\u0010$\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00022\b\u0010#\u001a\u0004\u0018\u00010\u0001H\u0002J\u0018\u0010'\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u0002H\u0002J\u0018\u0010)\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0002H\u0002J \u0010,\u001a\u00020\b2\u0006\u0010*\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0002H\u0002J\u0010\u0010-\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002H\u0002J\u0010\u0010/\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\u0002H\u0002J\u0014\u00101\u001a\u00020\u0002*\u0002002\u0006\u0010\u0019\u001a\u00020\u0002H\u0002J\u0010\u00102\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002H\u0002J\u0014\u00104\u001a\u00020\u0002*\u0002002\u0006\u00103\u001a\u00020\u0002H\u0002J\u0014\u00105\u001a\u00020\u0002*\u0002002\u0006\u00103\u001a\u00020\u0002H\u0002J\u001c\u00106\u001a\u00020\b*\u0002002\u0006\u00103\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\u0002H\u0002J\u0014\u00107\u001a\u00020\u0002*\u0002002\u0006\u00103\u001a\u00020\u0002H\u0002J\u0014\u00108\u001a\u00020\u0002*\u0002002\u0006\u00103\u001a\u00020\u0002H\u0002J(\u0010;\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00022\u0006\u00109\u001a\u00020\u00022\u0006\u0010:\u001a\u00020\u0002H\u0002J \u0010=\u001a\u00020\u00022\u0006\u0010<\u001a\u00020\u00022\u0006\u00109\u001a\u00020\u00022\u0006\u0010:\u001a\u00020\u0002H\u0002J\u0018\u0010>\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u0002H\u0002J\u0010\u0010?\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002H\u0002J\u000e\u0010@\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0002J\u000e\u0010A\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002J\u000e\u0010B\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002J\u0010\u0010C\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0019\u001a\u00020\u0002J\u000e\u0010D\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002J\u0010\u0010E\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0019\u001a\u00020\u0002J\u000e\u0010F\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0002J\u000e\u0010G\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0002J\u0016\u0010H\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002J\u0010\u0010I\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0019\u001a\u00020\u0002J\u000e\u0010J\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002J\u0006\u0010K\u001a\u00020\bJ\u0006\u0010L\u001a\u00020\bJ\u0012\u0010M\u001a\u0004\u0018\u00010\u00012\b\u0010#\u001a\u0004\u0018\u00010\u0001J\u0010\u0010N\u001a\u00020\b2\b\u0010#\u001a\u0004\u0018\u00010\u0001J\u0010\u0010O\u001a\u00020\b2\b\u0010#\u001a\u0004\u0018\u00010\u0001J\u0010\u0010P\u001a\u00020\b2\b\u0010#\u001a\u0004\u0018\u00010\u0001J\u001a\u0010Q\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0019\u001a\u00020\u00022\b\u0010#\u001a\u0004\u0018\u00010\u0001J\b\u0010R\u001a\u0004\u0018\u00010\u0001J\u0018\u0010T\u001a\u0004\u0018\u00010\u00012\u0006\u0010<\u001a\u00020S2\u0006\u0010\u0019\u001a\u00020\u0002J\u0018\u0010V\u001a\u0004\u0018\u00010\u00012\u0006\u0010U\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002J\u000e\u0010X\u001a\u00020\b2\u0006\u0010W\u001a\u00020\u0002J\u0006\u0010Y\u001a\u00020\bJ\u0006\u0010Z\u001a\u00020\bJ\u0006\u0010[\u001a\u00020\bJ\u0006\u0010\\\u001a\u00020\bJ\u0018\u0010^\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010]\u001a\u0004\u0018\u00010\u0001J\u0010\u0010_\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001J\"\u0010`\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001J\u0006\u0010a\u001a\u00020\u0002J\u000e\u0010b\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0002J\u000e\u0010c\u001a\u00020\b2\u0006\u0010<\u001a\u00020SJ\u0006\u0010d\u001a\u00020\u0002J\u0006\u0010e\u001a\u00020\u0005J\u000e\u0010g\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010fJ\u000e\u0010i\u001a\u00020\b2\u0006\u0010h\u001a\u00020\u0002J$\u0010l\u001a\b\u0012\u0004\u0012\u00020S0k2\u0006\u0010<\u001a\u00020S2\u0006\u0010h\u001a\u00020\u00022\u0006\u0010j\u001a\u00020\u0000J\u001c\u0010o\u001a\b\u0012\u0004\u0012\u00020S0k2\u0006\u0010n\u001a\u00020m2\u0006\u0010\u0019\u001a\u00020\u0002J$\u0010p\u001a\b\u0012\u0004\u0012\u00020S0k2\u0006\u0010h\u001a\u00020\u00022\u0006\u0010n\u001a\u00020m2\u0006\u0010\u0019\u001a\u00020\u0002J\u0010\u0010q\u001a\u00020S2\b\b\u0002\u0010\u0019\u001a\u00020\u0002J\u0010\u0010r\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u0002J\u000e\u0010s\u001a\u00020\u00022\u0006\u0010<\u001a\u00020SJ\b\u0010u\u001a\u00020tH\u0016R\u001a\u0010n\u001a\u00020m8\u0000X\u0004¢\u0006\f\n\u0004\bv\u0010w\u001a\u0004\bx\u0010yR\u0016\u0010|\u001a\u0002008\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bz\u0010{R\u001f\u0010\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010}8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b~\u0010R+\u0010\u0001\u001a\u0014\u0012\u0004\u0012\u00020S0\u0001j\t\u0012\u0004\u0012\u00020S`\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0018\u0010\u0001\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0001\u0010=R\u0018\u0010\u0001\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0001\u0010=R\u0018\u0010\u0001\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0001\u0010=R\u0018\u0010\u0001\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0001\u0010=R\u0018\u0010\u0001\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0001\u0010=R\u0018\u0010\u0001\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0001\u0010=R\u0018\u0010\u0001\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0001\u0010=R\u0018\u0010\u0001\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0001\u0010=R\u0018\u0010\u0001\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0001\u0010=R\u0018\u0010\u0001\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0001\u0010=R\u0018\u0010\u0001\u001a\u00030\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0018\u0010\u0001\u001a\u00030\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0018\u0010¡\u0001\u001a\u00030\u00018\u0002X\u0004¢\u0006\b\n\u0006\b \u0001\u0010\u0001R)\u0010¦\u0001\u001a\u00020\u00022\u0007\u0010¢\u0001\u001a\u00020\u00028\u0006@BX\u000e¢\u0006\u000f\n\u0005\b£\u0001\u0010=\u001a\u0006\b¤\u0001\u0010¥\u0001R(\u0010\u0015\u001a\u00020\u00022\u0007\u0010¢\u0001\u001a\u00020\u00028\u0006@BX\u000e¢\u0006\u000f\n\u0005\b§\u0001\u0010=\u001a\u0006\b¨\u0001\u0010¥\u0001R)\u0010¬\u0001\u001a\u00020\u00052\u0007\u0010¢\u0001\u001a\u00020\u00058\u0006@BX\u000e¢\u0006\u000f\n\u0005\b©\u0001\u0010-\u001a\u0006\bª\u0001\u0010«\u0001R\u001b\u0010¯\u0001\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b­\u0001\u0010®\u0001R\u0016\u0010:\u001a\u00020\u00028BX\u0004¢\u0006\b\u001a\u0006\b°\u0001\u0010¥\u0001R\u0013\u0010\u0006\u001a\u00020\u00058F¢\u0006\b\u001a\u0006\b±\u0001\u0010«\u0001R\u0016\u0010\u001c\u001a\u00020\u00028@X\u0004¢\u0006\b\u001a\u0006\b²\u0001\u0010¥\u0001¨\u0006¶\u0001"}, mo44877d2 = {"Lt46;", "", "", "key", "objectKey", "", "isNode", "aux", "Lr37;", "U0", "group", "H", "G", "B0", "Z0", "Lgv4;", "set", "a1", "E", "I0", "H0", "parent", "endGroup", "firstChild", "R", "index", "q0", "s0", "size", "h0", "i0", "start", "len", "E0", "F0", "value", "d1", "previousGapStart", "newGapStart", "X0", "gapStart", "C0", "originalLocation", "newLocation", "n0", "Z", "dataIndex", "L", "", "y0", "J", "address", "K", "Q0", "b1", "w0", "C", "gapLen", "capacity", "M", "anchor", "I", "A0", "z0", "k0", "v0", "a0", "b0", "c0", "Y", "g0", "e0", "f0", "u0", "x0", "F", "G0", "W0", "Y0", "c1", "K0", "J0", "L0", "Lbg;", "P0", "groupIndex", "O0", "amount", "z", "N0", "D", "O", "S0", "dataKey", "T0", "V0", "R0", "N", "P", "Q", "M0", "D0", "", "d0", "offset", "p0", "writer", "", "t0", "Lq46;", "table", "o0", "r0", "A", "l0", "B", "", "toString", "a", "Lq46;", "X", "()Lq46;", "b", "[I", "groups", "", "c", "[Ljava/lang/Object;", "slots", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "d", "Ljava/util/ArrayList;", "anchors", "e", "groupGapStart", "f", "groupGapLen", "g", "currentGroupEnd", "h", "currentSlot", "i", "currentSlotEnd", "j", "slotsGapStart", "k", "slotsGapLen", "l", "slotsGapOwner", "m", "insertCount", "n", "nodeCount", "Lvw2;", "o", "Lvw2;", "startStack", "p", "endStack", "q", "nodeCountStack", "<set-?>", "r", "U", "()I", "currentGroup", "s", "V", "t", "T", "()Z", "closed", "u", "Lgv4;", "pendingRecalculateMarks", "S", "j0", "W", "<init>", "(Lq46;)V", "v", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: t46 */
/* compiled from: SlotTable.kt */
public final class t46 {

    /* renamed from: v */
    public static final C3330a f17920v = new C3330a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final q46 f17921a;

    /* renamed from: b */
    public int[] f17922b;

    /* renamed from: c */
    public Object[] f17923c;

    /* renamed from: d */
    public ArrayList<C1628bg> f17924d;

    /* renamed from: e */
    public int f17925e;

    /* renamed from: f */
    public int f17926f;

    /* renamed from: g */
    public int f17927g;

    /* renamed from: h */
    public int f17928h;

    /* renamed from: i */
    public int f17929i;

    /* renamed from: j */
    public int f17930j;

    /* renamed from: k */
    public int f17931k;

    /* renamed from: l */
    public int f17932l;

    /* renamed from: m */
    public int f17933m;

    /* renamed from: n */
    public int f17934n;

    /* renamed from: o */
    public final vw2 f17935o = new vw2();

    /* renamed from: p */
    public final vw2 f17936p = new vw2();

    /* renamed from: q */
    public final vw2 f17937q = new vw2();

    /* renamed from: r */
    public int f17938r;

    /* renamed from: s */
    public int f17939s = -1;

    /* renamed from: t */
    public boolean f17940t;

    /* renamed from: u */
    public gv4 f17941u;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ6\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¨\u0006\u000f"}, mo44877d2 = {"Lt46$a;", "", "Lt46;", "fromWriter", "", "fromIndex", "toWriter", "", "updateFromCursor", "updateToCursor", "", "Lbg;", "b", "<init>", "()V", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: t46$a */
    /* compiled from: SlotTable.kt */
    public static final class C3330a {
        public C3330a() {
        }

        public /* synthetic */ C3330a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public final List<C1628bg> mo26145b(t46 t46, int i, t46 t462, boolean z, boolean z2) {
            int i2;
            ArrayList arrayList;
            boolean z3;
            int i3;
            t46 t463 = t46;
            int i4 = i;
            t46 t464 = t462;
            int c0 = t46.mo26118c0(i);
            int i5 = i4 + c0;
            int b = t46.mo26080J(i);
            int b2 = t463.mo26080J(i5);
            int i6 = b2 - b;
            boolean a = t46.mo26074G(i);
            t464.mo26125h0(c0);
            t464.mo26126i0(i6, t462.mo26102U());
            if (t46.f17925e < i5) {
                t463.mo26133q0(i5);
            }
            if (t46.f17930j < b2) {
                t463.mo26135s0(b2, i5);
            }
            int[] i7 = t462.f17922b;
            int U = t462.mo26102U();
            C6706xq.m54493g(t46.f17922b, i7, U * 5, i4 * 5, i5 * 5);
            Object[] k = t462.f17923c;
            int g = t462.f17928h;
            C6706xq.m54495i(t46.f17923c, k, g, b, b2);
            int V = t462.mo26104V();
            s46.m26616Z(i7, U, V);
            int i8 = U - i4;
            int i9 = U + c0;
            int c = g - t464.mo26082K(i7, U);
            int m = t462.f17932l;
            int i10 = V;
            int l = t462.f17931k;
            int length = k.length;
            boolean z4 = a;
            int i11 = m;
            int i12 = g;
            int i13 = U;
            while (true) {
                i2 = 0;
                if (i13 >= i9) {
                    break;
                }
                if (i13 != U) {
                    i3 = i9;
                    s46.m26616Z(i7, i13, s46.m26608R(i7, i13) + i8);
                } else {
                    i3 = i9;
                }
                int c2 = t464.mo26082K(i7, i13) + c;
                if (i11 >= i13) {
                    i2 = t462.f17930j;
                }
                int i14 = c;
                s46.m26612V(i7, i13, t464.mo26086M(c2, i2, l, length));
                if (i13 == i11) {
                    i11++;
                }
                i13++;
                c = i14;
                i9 = i3;
            }
            int i15 = i9;
            t464.f17932l = i11;
            int n = s46.m26604N(t46.f17924d, i4, t46.mo26106W());
            int n2 = s46.m26604N(t46.f17924d, i5, t46.mo26106W());
            if (n < n2) {
                ArrayList f = t46.f17924d;
                ArrayList arrayList2 = new ArrayList(n2 - n);
                for (int i16 = n; i16 < n2; i16++) {
                    Object obj = f.get(i16);
                    vx2.m53590f(obj, "sourceAnchors[anchorIndex]");
                    C1628bg bgVar = (C1628bg) obj;
                    bgVar.mo11641c(bgVar.mo11639a() + i8);
                    arrayList2.add(bgVar);
                }
                t462.f17924d.addAll(s46.m26604N(t462.f17924d, t462.mo26102U(), t462.mo26106W()), arrayList2);
                f.subList(n, n2).clear();
                arrayList = arrayList2;
            } else {
                arrayList = ck0.m33062j();
            }
            int x0 = t46.mo26141x0(i);
            int i17 = 1;
            if (z) {
                if (x0 >= 0) {
                    i2 = 1;
                }
                if (i2 != 0) {
                    t46.mo26099S0();
                    t463.mo26143z(x0 - t46.mo26102U());
                    t46.mo26099S0();
                }
                t463.mo26143z(i4 - t46.mo26102U());
                z3 = t46.mo26069D0();
                if (i2 != 0) {
                    t46.mo26089N0();
                    t46.mo26088N();
                    t46.mo26089N0();
                    t46.mo26088N();
                }
            } else {
                boolean s = t463.mo26071E0(i4, c0);
                t463.mo26073F0(b, i6, i4 - 1);
                z3 = s;
            }
            if (!z3) {
                int j = t462.f17934n;
                if (!s46.m26602L(i7, U)) {
                    i17 = s46.m26605O(i7, U);
                }
                t464.f17934n = j + i17;
                if (z2) {
                    t464.f17938r = i15;
                    t464.f17928h = i12 + i6;
                }
                if (z4) {
                    t464.mo26113Z0(i10);
                }
                return arrayList;
            }
            ComposerKt.m2032x("Unexpectedly removed anchors".toString());
            throw new KotlinNothingValueException();
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001d\n\u0000\n\u0002\u0010(\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\t\u0010\u0004\u001a\u00020\u0003H\u0002J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0002R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000e"}, mo44877d2 = {"t46$b", "", "", "", "hasNext", "next", "", "a", "I", "getCurrent", "()I", "setCurrent", "(I)V", "current", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: t46$b */
    /* compiled from: SlotTable.kt */
    public static final class C3331b implements Iterator<Object>, a93 {

        /* renamed from: a */
        public int f17942a;

        /* renamed from: d */
        public final /* synthetic */ int f17943d;

        /* renamed from: e */
        public final /* synthetic */ t46 f17944e;

        public C3331b(int i, int i2, t46 t46) {
            this.f17943d = i2;
            this.f17944e = t46;
            this.f17942a = i;
        }

        public boolean hasNext() {
            if (this.f17942a < this.f17943d) {
                return true;
            }
            return false;
        }

        public Object next() {
            if (!hasNext()) {
                return null;
            }
            Object[] k = this.f17944e.f17923c;
            t46 t46 = this.f17944e;
            int i = this.f17942a;
            this.f17942a = i + 1;
            return k[t46.mo26084L(i)];
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public t46(q46 q46) {
        vx2.m53591g(q46, "table");
        this.f17921a = q46;
        this.f17922b = q46.mo24937r();
        this.f17923c = q46.mo24939t();
        this.f17924d = q46.mo24936q();
        this.f17925e = q46.mo24938s();
        this.f17926f = (this.f17922b.length / 5) - q46.mo24938s();
        this.f17927g = q46.mo24938s();
        this.f17930j = q46.mo24940u();
        this.f17931k = this.f17923c.length - q46.mo24940u();
        this.f17932l = q46.mo24938s();
    }

    /* renamed from: m0 */
    public static /* synthetic */ void m27338m0(t46 t46, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = t46.f17939s;
        }
        t46.mo26129l0(i);
    }

    /* renamed from: A */
    public final C1628bg mo26062A(int i) {
        ArrayList<C1628bg> arrayList = this.f17924d;
        int s = s46.m26609S(arrayList, i, mo26106W());
        if (s < 0) {
            if (i > this.f17925e) {
                i = -(mo26106W() - i);
            }
            C1628bg bgVar = new C1628bg(i);
            arrayList.add(-(s + 1), bgVar);
            return bgVar;
        }
        C1628bg bgVar2 = arrayList.get(s);
        vx2.m53590f(bgVar2, "get(location)");
        return bgVar2;
    }

    /* renamed from: A0 */
    public final int mo26063A0(int i, int i2) {
        if (i < i2) {
            return i;
        }
        return -((mo26106W() - i) + 2);
    }

    /* renamed from: B */
    public final int mo26064B(C1628bg bgVar) {
        vx2.m53591g(bgVar, "anchor");
        int a = bgVar.mo11639a();
        if (a < 0) {
            return a + mo26106W();
        }
        return a;
    }

    /* renamed from: B0 */
    public final void mo26065B0() {
        gv4 gv4 = this.f17941u;
        if (gv4 != null) {
            while (gv4.mo20854b()) {
                mo26115a1(gv4.mo20856d(), gv4);
            }
        }
    }

    /* renamed from: C */
    public final int mo26066C(int[] iArr, int i) {
        return mo26082K(iArr, i) + s46.m26594D(s46.m26596F(iArr, i) >> 29);
    }

    /* renamed from: C0 */
    public final boolean mo26067C0(int i, int i2) {
        int i3 = i2 + i;
        int n = s46.m26604N(this.f17924d, i3, mo26098S() - this.f17926f);
        if (n >= this.f17924d.size()) {
            n--;
        }
        int i4 = n + 1;
        boolean z = false;
        int i5 = 0;
        while (n >= 0) {
            C1628bg bgVar = this.f17924d.get(n);
            vx2.m53590f(bgVar, "anchors[index]");
            C1628bg bgVar2 = bgVar;
            int B = mo26064B(bgVar2);
            if (B < i) {
                break;
            }
            if (B < i3) {
                bgVar2.mo11641c(Integer.MIN_VALUE);
                if (i5 == 0) {
                    i5 = n + 1;
                }
                i4 = n;
            }
            n--;
        }
        if (i4 < i5) {
            z = true;
        }
        if (z) {
            this.f17924d.subList(i4, i5).clear();
        }
        return z;
    }

    /* renamed from: D */
    public final void mo26068D() {
        int i = this.f17933m;
        this.f17933m = i + 1;
        if (i == 0) {
            mo26079I0();
        }
    }

    /* renamed from: D0 */
    public final boolean mo26069D0() {
        boolean z;
        if (this.f17933m == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i = this.f17938r;
            int i2 = this.f17928h;
            int M0 = mo26087M0();
            gv4 gv4 = this.f17941u;
            if (gv4 != null) {
                while (gv4.mo20854b() && gv4.mo20855c() >= i) {
                    gv4.mo20856d();
                }
            }
            boolean E0 = mo26071E0(i, this.f17938r - i);
            mo26073F0(i2, this.f17928h - i2, i - 1);
            this.f17938r = i;
            this.f17928h = i2;
            this.f17934n -= M0;
            return E0;
        }
        ComposerKt.m2032x("Cannot remove group while inserting".toString());
        throw new KotlinNothingValueException();
    }

    /* renamed from: E */
    public final boolean mo26070E(int i) {
        int i2 = i + 1;
        int c0 = i + mo26118c0(i);
        while (i2 < c0) {
            if (s46.m26592B(this.f17922b, mo26112Z(i2))) {
                return true;
            }
            i2 += mo26118c0(i2);
        }
        return false;
    }

    /* renamed from: E0 */
    public final boolean mo26071E0(int i, int i2) {
        boolean z = false;
        if (i2 > 0) {
            ArrayList<C1628bg> arrayList = this.f17924d;
            mo26133q0(i);
            if (!arrayList.isEmpty()) {
                z = mo26067C0(i, i2);
            }
            this.f17925e = i;
            this.f17926f += i2;
            int i3 = this.f17932l;
            if (i3 > i) {
                this.f17932l = Math.max(i, i3 - i2);
            }
            int i4 = this.f17927g;
            if (i4 >= this.f17925e) {
                this.f17927g = i4 - i2;
            }
            if (mo26076H(this.f17939s)) {
                mo26113Z0(this.f17939s);
            }
        }
        return z;
    }

    /* renamed from: F */
    public final void mo26072F() {
        this.f17940t = true;
        if (this.f17935o.mo27342d()) {
            mo26133q0(mo26106W());
            mo26135s0(this.f17923c.length - this.f17931k, this.f17925e);
            mo26065B0();
        }
        this.f17921a.mo24935n(this, this.f17922b, this.f17925e, this.f17923c, this.f17930j, this.f17924d);
    }

    /* renamed from: F0 */
    public final void mo26073F0(int i, int i2, int i3) {
        if (i2 > 0) {
            int i4 = this.f17931k;
            int i5 = i + i2;
            mo26135s0(i5, i3);
            this.f17930j = i;
            this.f17931k = i4 + i2;
            C6706xq.m54503q(this.f17923c, null, i, i5);
            int i6 = this.f17929i;
            if (i6 >= i) {
                this.f17929i = i6 - i2;
            }
        }
    }

    /* renamed from: G */
    public final boolean mo26074G(int i) {
        if (i < 0 || !s46.m26592B(this.f17922b, mo26112Z(i))) {
            return false;
        }
        return true;
    }

    /* renamed from: G0 */
    public final void mo26075G0() {
        boolean z;
        if (this.f17933m == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            mo26065B0();
            this.f17938r = 0;
            this.f17927g = mo26098S() - this.f17926f;
            this.f17928h = 0;
            this.f17929i = 0;
            this.f17934n = 0;
            return;
        }
        ComposerKt.m2032x("Cannot reset when inserting".toString());
        throw new KotlinNothingValueException();
    }

    /* renamed from: H */
    public final boolean mo26076H(int i) {
        if (i < 0 || !s46.m26593C(this.f17922b, mo26112Z(i))) {
            return false;
        }
        return true;
    }

    /* renamed from: H0 */
    public final int mo26077H0() {
        int S = (mo26098S() - this.f17926f) - this.f17936p.mo27346h();
        this.f17927g = S;
        return S;
    }

    /* renamed from: I */
    public final int mo26078I(int i, int i2, int i3) {
        return i < 0 ? (i3 - i2) + i + 1 : i;
    }

    /* renamed from: I0 */
    public final void mo26079I0() {
        this.f17936p.mo27347i((mo26098S() - this.f17926f) - this.f17927g);
    }

    /* renamed from: J */
    public final int mo26080J(int i) {
        return mo26082K(this.f17922b, mo26112Z(i));
    }

    /* renamed from: J0 */
    public final Object mo26081J0(int i, Object obj) {
        int Q0 = mo26095Q0(this.f17922b, mo26112Z(this.f17938r));
        boolean z = true;
        int K = mo26082K(this.f17922b, mo26112Z(this.f17938r + 1));
        int i2 = Q0 + i;
        if (i2 < Q0 || i2 >= K) {
            z = false;
        }
        if (z) {
            int L = mo26084L(i2);
            Object[] objArr = this.f17923c;
            Object obj2 = objArr[L];
            objArr[L] = obj;
            return obj2;
        }
        ComposerKt.m2032x(("Write to an invalid slot index " + i + " for group " + this.f17938r).toString());
        throw new KotlinNothingValueException();
    }

    /* renamed from: K */
    public final int mo26082K(int[] iArr, int i) {
        if (i >= mo26098S()) {
            return this.f17923c.length - this.f17931k;
        }
        return mo26078I(s46.m26595E(iArr, i), this.f17931k, this.f17923c.length);
    }

    /* renamed from: K0 */
    public final void mo26083K0(Object obj) {
        boolean z;
        int i = this.f17928h;
        if (i <= this.f17929i) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f17923c[mo26084L(i - 1)] = obj;
        } else {
            ComposerKt.m2032x("Writing to an invalid slot".toString());
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: L */
    public final int mo26084L(int i) {
        if (i < this.f17930j) {
            return i;
        }
        return i + this.f17931k;
    }

    /* renamed from: L0 */
    public final Object mo26085L0() {
        if (this.f17933m > 0) {
            mo26126i0(1, this.f17939s);
        }
        Object[] objArr = this.f17923c;
        int i = this.f17928h;
        this.f17928h = i + 1;
        return objArr[mo26084L(i)];
    }

    /* renamed from: M */
    public final int mo26086M(int i, int i2, int i3, int i4) {
        return i > i2 ? -(((i4 - i3) - i) + 1) : i;
    }

    /* renamed from: M0 */
    public final int mo26087M0() {
        int Z = mo26112Z(this.f17938r);
        int g = this.f17938r + s46.m26597G(this.f17922b, Z);
        this.f17938r = g;
        this.f17928h = mo26082K(this.f17922b, mo26112Z(g));
        if (s46.m26602L(this.f17922b, Z)) {
            return 1;
        }
        return s46.m26605O(this.f17922b, Z);
    }

    /* renamed from: N */
    public final int mo26088N() {
        boolean z;
        int i;
        int i2 = 1;
        int i3 = 0;
        if (this.f17933m > 0) {
            z = true;
        } else {
            z = false;
        }
        int i4 = this.f17938r;
        int i5 = this.f17927g;
        int i6 = this.f17939s;
        int Z = mo26112Z(i6);
        int i7 = this.f17934n;
        int i8 = i4 - i6;
        boolean l = s46.m26602L(this.f17922b, Z);
        if (z) {
            s46.m26613W(this.f17922b, Z, i8);
            s46.m26615Y(this.f17922b, Z, i7);
            int h = this.f17937q.mo27346h();
            if (!l) {
                i2 = i7;
            }
            this.f17934n = h + i2;
            this.f17939s = mo26142y0(this.f17922b, i6);
        } else {
            if (i4 != i5) {
                i2 = 0;
            }
            if (i2 != 0) {
                int g = s46.m26597G(this.f17922b, Z);
                int o = s46.m26605O(this.f17922b, Z);
                s46.m26613W(this.f17922b, Z, i8);
                s46.m26615Y(this.f17922b, Z, i7);
                int h2 = this.f17935o.mo27346h();
                mo26077H0();
                this.f17939s = h2;
                int y0 = mo26142y0(this.f17922b, i6);
                int h3 = this.f17937q.mo27346h();
                this.f17934n = h3;
                if (y0 == h2) {
                    if (!l) {
                        i3 = i7 - o;
                    }
                    this.f17934n = h3 + i3;
                } else {
                    int i9 = i8 - g;
                    if (l) {
                        i = 0;
                    } else {
                        i = i7 - o;
                    }
                    if (!(i9 == 0 && i == 0)) {
                        while (y0 != 0 && y0 != h2 && (i != 0 || i9 != 0)) {
                            int Z2 = mo26112Z(y0);
                            if (i9 != 0) {
                                s46.m26613W(this.f17922b, Z2, s46.m26597G(this.f17922b, Z2) + i9);
                            }
                            if (i != 0) {
                                int[] iArr = this.f17922b;
                                s46.m26615Y(iArr, Z2, s46.m26605O(iArr, Z2) + i);
                            }
                            if (s46.m26602L(this.f17922b, Z2)) {
                                i = 0;
                            }
                            y0 = mo26142y0(this.f17922b, y0);
                        }
                    }
                    this.f17934n += i;
                }
            } else {
                ComposerKt.m2032x("Expected to be at the end of a group".toString());
                throw new KotlinNothingValueException();
            }
        }
        return i7;
    }

    /* renamed from: N0 */
    public final void mo26089N0() {
        int i = this.f17927g;
        this.f17938r = i;
        this.f17928h = mo26082K(this.f17922b, mo26112Z(i));
    }

    /* renamed from: O */
    public final void mo26090O() {
        boolean z;
        int i = this.f17933m;
        boolean z2 = true;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i2 = i - 1;
            this.f17933m = i2;
            if (i2 == 0) {
                if (this.f17937q.mo27340b() != this.f17935o.mo27340b()) {
                    z2 = false;
                }
                if (z2) {
                    mo26077H0();
                } else {
                    ComposerKt.m2032x("startGroup/endGroup mismatch while inserting".toString());
                    throw new KotlinNothingValueException();
                }
            }
        } else {
            throw new IllegalStateException("Unbalanced begin/end insert".toString());
        }
    }

    /* renamed from: O0 */
    public final Object mo26091O0(int i, int i2) {
        int Q0 = mo26095Q0(this.f17922b, mo26112Z(i));
        boolean z = true;
        int K = mo26082K(this.f17922b, mo26112Z(i + 1));
        int i3 = i2 + Q0;
        if (Q0 > i3 || i3 >= K) {
            z = false;
        }
        if (!z) {
            return nn0.f15626a.mo23753a();
        }
        return this.f17923c[mo26084L(i3)];
    }

    /* renamed from: P */
    public final void mo26092P(int i) {
        boolean z;
        boolean z2 = true;
        if (this.f17933m <= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i2 = this.f17939s;
            if (i2 != i) {
                if (i < i2 || i >= this.f17927g) {
                    z2 = false;
                }
                if (z2) {
                    int i3 = this.f17938r;
                    int i4 = this.f17928h;
                    int i5 = this.f17929i;
                    this.f17938r = i;
                    mo26099S0();
                    this.f17938r = i3;
                    this.f17928h = i4;
                    this.f17929i = i5;
                    return;
                }
                ComposerKt.m2032x(("Started group at " + i + " must be a subgroup of the group at " + i2).toString());
                throw new KotlinNothingValueException();
            }
            return;
        }
        ComposerKt.m2032x("Cannot call ensureStarted() while inserting".toString());
        throw new KotlinNothingValueException();
    }

    /* renamed from: P0 */
    public final Object mo26093P0(C1628bg bgVar, int i) {
        vx2.m53591g(bgVar, "anchor");
        return mo26091O0(mo26064B(bgVar), i);
    }

    /* renamed from: Q */
    public final void mo26094Q(C1628bg bgVar) {
        vx2.m53591g(bgVar, "anchor");
        mo26092P(bgVar.mo11643e(this));
    }

    /* renamed from: Q0 */
    public final int mo26095Q0(int[] iArr, int i) {
        if (i >= mo26098S()) {
            return this.f17923c.length - this.f17931k;
        }
        return mo26078I(s46.m26610T(iArr, i), this.f17931k, this.f17923c.length);
    }

    /* renamed from: R */
    public final void mo26096R(int i, int i2, int i3) {
        int A0 = mo26063A0(i, this.f17925e);
        while (i3 < i2) {
            s46.m26616Z(this.f17922b, mo26112Z(i3), A0);
            int g = s46.m26597G(this.f17922b, mo26112Z(i3)) + i3;
            mo26096R(i3, g, i3 + 1);
            i3 = g;
        }
    }

    /* renamed from: R0 */
    public final void mo26097R0(int i, Object obj, Object obj2) {
        mo26103U0(i, obj, false, obj2);
    }

    /* renamed from: S */
    public final int mo26098S() {
        return this.f17922b.length / 5;
    }

    /* renamed from: S0 */
    public final void mo26099S0() {
        boolean z;
        if (this.f17933m == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            nn0.C2913a aVar = nn0.f15626a;
            mo26103U0(0, aVar.mo23753a(), false, aVar.mo23753a());
            return;
        }
        ComposerKt.m2032x("Key must be supplied when inserting".toString());
        throw new KotlinNothingValueException();
    }

    /* renamed from: T */
    public final boolean mo26100T() {
        return this.f17940t;
    }

    /* renamed from: T0 */
    public final void mo26101T0(int i, Object obj) {
        mo26103U0(i, obj, false, nn0.f15626a.mo23753a());
    }

    /* renamed from: U */
    public final int mo26102U() {
        return this.f17938r;
    }

    /* renamed from: U0 */
    public final void mo26103U0(int i, Object obj, boolean z, Object obj2) {
        boolean z2;
        int i2;
        boolean z3;
        boolean z4;
        Object obj3 = obj;
        Object obj4 = obj2;
        if (this.f17933m > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f17937q.mo27347i(this.f17934n);
        if (z2) {
            mo26125h0(1);
            int i3 = this.f17938r;
            int Z = mo26112Z(i3);
            nn0.C2913a aVar = nn0.f15626a;
            if (obj3 != aVar.mo23753a()) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z || obj4 == aVar.mo23753a()) {
                z4 = false;
            } else {
                z4 = true;
            }
            s46.m26601K(this.f17922b, Z, i, z, z3, z4, this.f17939s, this.f17928h);
            this.f17929i = this.f17928h;
            int i4 = (z ? 1 : 0) + (z3 ? 1 : 0) + (z4 ? 1 : 0);
            if (i4 > 0) {
                mo26126i0(i4, i3);
                Object[] objArr = this.f17923c;
                int i5 = this.f17928h;
                if (z) {
                    objArr[i5] = obj4;
                    i5++;
                }
                if (z3) {
                    objArr[i5] = obj3;
                    i5++;
                }
                if (z4) {
                    objArr[i5] = obj4;
                    i5++;
                }
                this.f17928h = i5;
            }
            this.f17934n = 0;
            i2 = i3 + 1;
            this.f17939s = i3;
            this.f17938r = i2;
        } else {
            this.f17935o.mo27347i(this.f17939s);
            mo26079I0();
            int i6 = this.f17938r;
            int Z2 = mo26112Z(i6);
            if (!vx2.m53586b(obj4, nn0.f15626a.mo23753a())) {
                if (z) {
                    mo26119c1(obj4);
                } else {
                    mo26111Y0(obj4);
                }
            }
            this.f17928h = mo26095Q0(this.f17922b, Z2);
            this.f17929i = mo26082K(this.f17922b, mo26112Z(this.f17938r + 1));
            this.f17934n = s46.m26605O(this.f17922b, Z2);
            this.f17939s = i6;
            this.f17938r = i6 + 1;
            i2 = i6 + s46.m26597G(this.f17922b, Z2);
        }
        this.f17927g = i2;
    }

    /* renamed from: V */
    public final int mo26104V() {
        return this.f17939s;
    }

    /* renamed from: V0 */
    public final void mo26105V0(Object obj) {
        mo26103U0(125, obj, true, nn0.f15626a.mo23753a());
    }

    /* renamed from: W */
    public final int mo26106W() {
        return mo26098S() - this.f17926f;
    }

    /* renamed from: W0 */
    public final Object mo26107W0(Object obj) {
        Object L0 = mo26085L0();
        mo26083K0(obj);
        return L0;
    }

    /* renamed from: X */
    public final q46 mo26108X() {
        return this.f17921a;
    }

    /* renamed from: X0 */
    public final void mo26109X0(int i, int i2) {
        int i3;
        int S = mo26098S() - this.f17926f;
        if (i < i2) {
            int n = s46.m26604N(this.f17924d, i, S);
            while (n < this.f17924d.size()) {
                C1628bg bgVar = this.f17924d.get(n);
                vx2.m53590f(bgVar, "anchors[index]");
                C1628bg bgVar2 = bgVar;
                int a = bgVar2.mo11639a();
                if (a < 0 && (i3 = a + S) < i2) {
                    bgVar2.mo11641c(i3);
                    n++;
                } else {
                    return;
                }
            }
            return;
        }
        int n2 = s46.m26604N(this.f17924d, i2, S);
        while (n2 < this.f17924d.size()) {
            C1628bg bgVar3 = this.f17924d.get(n2);
            vx2.m53590f(bgVar3, "anchors[index]");
            C1628bg bgVar4 = bgVar3;
            int a2 = bgVar4.mo11639a();
            if (a2 >= 0) {
                bgVar4.mo11641c(-(S - a2));
                n2++;
            } else {
                return;
            }
        }
    }

    /* renamed from: Y */
    public final Object mo26110Y(int i) {
        int Z = mo26112Z(i);
        if (s46.m26598H(this.f17922b, Z)) {
            return this.f17923c[mo26066C(this.f17922b, Z)];
        }
        return nn0.f15626a.mo23753a();
    }

    /* renamed from: Y0 */
    public final void mo26111Y0(Object obj) {
        int Z = mo26112Z(this.f17938r);
        if (s46.m26598H(this.f17922b, Z)) {
            this.f17923c[mo26084L(mo26066C(this.f17922b, Z))] = obj;
        } else {
            ComposerKt.m2032x("Updating the data of a group that was not created with a data slot".toString());
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: Z */
    public final int mo26112Z(int i) {
        if (i < this.f17925e) {
            return i;
        }
        return i + this.f17926f;
    }

    /* renamed from: Z0 */
    public final void mo26113Z0(int i) {
        if (i >= 0) {
            gv4 gv4 = this.f17941u;
            if (gv4 == null) {
                gv4 = new gv4((List) null, 1, (DefaultConstructorMarker) null);
                this.f17941u = gv4;
            }
            gv4.mo20853a(i);
        }
    }

    /* renamed from: a0 */
    public final int mo26114a0(int i) {
        return s46.m26603M(this.f17922b, mo26112Z(i));
    }

    /* renamed from: a1 */
    public final void mo26115a1(int i, gv4 gv4) {
        boolean z;
        int Z = mo26112Z(i);
        boolean E = mo26070E(i);
        if (s46.m26593C(this.f17922b, Z) != E) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            s46.m26611U(this.f17922b, Z, E);
            int x0 = mo26141x0(i);
            if (x0 >= 0) {
                gv4.mo20853a(x0);
            }
        }
    }

    /* renamed from: b0 */
    public final Object mo26116b0(int i) {
        int Z = mo26112Z(i);
        if (s46.m26600J(this.f17922b, Z)) {
            return this.f17923c[s46.m26607Q(this.f17922b, Z)];
        }
        return null;
    }

    /* renamed from: b1 */
    public final void mo26117b1(int[] iArr, int i, int i2) {
        s46.m26612V(iArr, i, mo26086M(i2, this.f17930j, this.f17931k, this.f17923c.length));
    }

    /* renamed from: c0 */
    public final int mo26118c0(int i) {
        return s46.m26597G(this.f17922b, mo26112Z(i));
    }

    /* renamed from: c1 */
    public final void mo26119c1(Object obj) {
        mo26121d1(this.f17938r, obj);
    }

    /* renamed from: d0 */
    public final Iterator<Object> mo26120d0() {
        int K = mo26082K(this.f17922b, mo26112Z(this.f17938r));
        int[] iArr = this.f17922b;
        int i = this.f17938r;
        return new C3331b(K, mo26082K(iArr, mo26112Z(i + mo26118c0(i))), this);
    }

    /* renamed from: d1 */
    public final void mo26121d1(int i, Object obj) {
        boolean z;
        int Z = mo26112Z(i);
        int[] iArr = this.f17922b;
        if (Z >= iArr.length || !s46.m26602L(iArr, Z)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            this.f17923c[mo26084L(mo26140w0(this.f17922b, Z))] = obj;
            return;
        }
        ComposerKt.m2032x(("Updating the node of a group at " + i + " that was not created with as a node group").toString());
        throw new KotlinNothingValueException();
    }

    /* renamed from: e0 */
    public final boolean mo26122e0(int i) {
        return mo26123f0(i, this.f17938r);
    }

    /* renamed from: f0 */
    public final boolean mo26123f0(int i, int i2) {
        int i3;
        int c0;
        if (i2 == this.f17939s) {
            i3 = this.f17927g;
        } else {
            if (i2 > this.f17935o.mo27345g(0)) {
                c0 = mo26118c0(i2);
            } else {
                int c = this.f17935o.mo27341c(i2);
                if (c < 0) {
                    c0 = mo26118c0(i2);
                } else {
                    i3 = (mo26098S() - this.f17926f) - this.f17936p.mo27344f(c);
                }
            }
            i3 = c0 + i2;
        }
        if (i <= i2 || i >= i3) {
            return false;
        }
        return true;
    }

    /* renamed from: g0 */
    public final boolean mo26124g0(int i) {
        int i2 = this.f17939s;
        if ((i <= i2 || i >= this.f17927g) && (i2 != 0 || i != 0)) {
            return false;
        }
        return true;
    }

    /* renamed from: h0 */
    public final void mo26125h0(int i) {
        int i2;
        if (i > 0) {
            int i3 = this.f17938r;
            mo26133q0(i3);
            int i4 = this.f17925e;
            int i5 = this.f17926f;
            int[] iArr = this.f17922b;
            int length = iArr.length / 5;
            int i6 = length - i5;
            int i7 = 0;
            if (i5 < i) {
                int max = Math.max(Math.max(length * 2, i6 + i), 32);
                int[] iArr2 = new int[(max * 5)];
                int i8 = max - i6;
                C6706xq.m54493g(iArr, iArr2, 0, 0, i4 * 5);
                C6706xq.m54493g(iArr, iArr2, (i4 + i8) * 5, (i5 + i4) * 5, length * 5);
                this.f17922b = iArr2;
                i5 = i8;
            }
            int i9 = this.f17927g;
            if (i9 >= i4) {
                this.f17927g = i9 + i;
            }
            int i10 = i4 + i;
            this.f17925e = i10;
            this.f17926f = i5 - i;
            if (i6 > 0) {
                i2 = mo26080J(i3 + i);
            } else {
                i2 = 0;
            }
            if (this.f17932l >= i4) {
                i7 = this.f17930j;
            }
            int M = mo26086M(i2, i7, this.f17931k, this.f17923c.length);
            for (int i11 = i4; i11 < i10; i11++) {
                s46.m26612V(this.f17922b, i11, M);
            }
            int i12 = this.f17932l;
            if (i12 >= i4) {
                this.f17932l = i12 + i;
            }
        }
    }

    /* renamed from: i0 */
    public final void mo26126i0(int i, int i2) {
        if (i > 0) {
            mo26135s0(this.f17928h, i2);
            int i3 = this.f17930j;
            int i4 = this.f17931k;
            if (i4 < i) {
                Object[] objArr = this.f17923c;
                int length = objArr.length;
                int i5 = length - i4;
                int max = Math.max(Math.max(length * 2, i5 + i), 32);
                Object[] objArr2 = new Object[max];
                for (int i6 = 0; i6 < max; i6++) {
                    objArr2[i6] = null;
                }
                int i7 = max - i5;
                C6706xq.m54495i(objArr, objArr2, 0, 0, i3);
                C6706xq.m54495i(objArr, objArr2, i3 + i7, i4 + i3, length);
                this.f17923c = objArr2;
                i4 = i7;
            }
            int i8 = this.f17929i;
            if (i8 >= i3) {
                this.f17929i = i8 + i;
            }
            this.f17930j = i3 + i;
            this.f17931k = i4 - i;
        }
    }

    /* renamed from: j0 */
    public final boolean mo26127j0() {
        int i = this.f17938r;
        if (i >= this.f17927g || !s46.m26602L(this.f17922b, mo26112Z(i))) {
            return false;
        }
        return true;
    }

    /* renamed from: k0 */
    public final boolean mo26128k0(int i) {
        return s46.m26602L(this.f17922b, mo26112Z(i));
    }

    /* renamed from: l0 */
    public final void mo26129l0(int i) {
        int Z = mo26112Z(i);
        if (!s46.m26599I(this.f17922b, Z)) {
            s46.m26614X(this.f17922b, Z, true);
            if (!s46.m26593C(this.f17922b, Z)) {
                mo26113Z0(mo26141x0(i));
            }
        }
    }

    /* renamed from: n0 */
    public final void mo26130n0(int i, int i2, int i3) {
        int i4 = i3 + i;
        int W = mo26106W();
        int n = s46.m26604N(this.f17924d, i, W);
        ArrayList arrayList = new ArrayList();
        if (n >= 0) {
            while (n < this.f17924d.size()) {
                C1628bg bgVar = this.f17924d.get(n);
                vx2.m53590f(bgVar, "anchors[index]");
                C1628bg bgVar2 = bgVar;
                int B = mo26064B(bgVar2);
                if (B < i || B >= i4) {
                    break;
                }
                arrayList.add(bgVar2);
                this.f17924d.remove(n);
            }
        }
        int i5 = i2 - i;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            C1628bg bgVar3 = (C1628bg) arrayList.get(i6);
            int B2 = mo26064B(bgVar3) + i5;
            if (B2 >= this.f17925e) {
                bgVar3.mo11641c(-(W - B2));
            } else {
                bgVar3.mo11641c(B2);
            }
            this.f17924d.add(s46.m26604N(this.f17924d, B2, W), bgVar3);
        }
    }

    /* renamed from: o0 */
    public final List<C1628bg> mo26131o0(q46 q46, int i) {
        boolean z;
        vx2.m53591g(q46, "table");
        if (this.f17933m > 0) {
            z = true;
        } else {
            z = false;
        }
        ComposerKt.m2006X(z);
        if (i == 0 && this.f17938r == 0 && this.f17921a.mo24938s() == 0) {
            int[] iArr = this.f17922b;
            Object[] objArr = this.f17923c;
            ArrayList<C1628bg> arrayList = this.f17924d;
            int[] r = q46.mo24937r();
            int s = q46.mo24938s();
            Object[] t = q46.mo24939t();
            int u = q46.mo24940u();
            this.f17922b = r;
            this.f17923c = t;
            this.f17924d = q46.mo24936q();
            this.f17925e = s;
            this.f17926f = (r.length / 5) - s;
            this.f17930j = u;
            this.f17931k = t.length - u;
            this.f17932l = s;
            q46.mo24929H(iArr, 0, objArr, 0, arrayList);
            return this.f17924d;
        }
        t46 E = q46.mo24927E();
        try {
            return f17920v.mo26145b(E, i, this, true, true);
        } finally {
            E.mo26072F();
        }
    }

    /* renamed from: p0 */
    public final void mo26132p0(int i) {
        boolean z;
        boolean z2;
        int i2;
        boolean z3;
        if (this.f17933m == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i >= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                ComposerKt.m2032x("Parameter offset is out of bounds".toString());
                throw new KotlinNothingValueException();
            } else if (i != 0) {
                int i3 = this.f17938r;
                int i4 = this.f17939s;
                int i5 = this.f17927g;
                int i6 = i;
                int i7 = i3;
                while (i6 > 0) {
                    i7 += s46.m26597G(this.f17922b, mo26112Z(i7));
                    if (i7 <= i5) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        i6--;
                    } else {
                        ComposerKt.m2032x("Parameter offset is out of bounds".toString());
                        throw new KotlinNothingValueException();
                    }
                }
                int g = s46.m26597G(this.f17922b, mo26112Z(i7));
                int i8 = this.f17928h;
                int K = mo26082K(this.f17922b, mo26112Z(i7));
                int i9 = i7 + g;
                int K2 = mo26082K(this.f17922b, mo26112Z(i9));
                int i10 = K2 - K;
                mo26126i0(i10, Math.max(this.f17938r - 1, 0));
                mo26125h0(g);
                int[] iArr = this.f17922b;
                int Z = mo26112Z(i9) * 5;
                C6706xq.m54493g(iArr, iArr, mo26112Z(i3) * 5, Z, (g * 5) + Z);
                if (i10 > 0) {
                    Object[] objArr = this.f17923c;
                    C6706xq.m54495i(objArr, objArr, i8, mo26084L(K + i10), mo26084L(K2 + i10));
                }
                int i11 = K + i10;
                int i12 = i11 - i8;
                int i13 = this.f17930j;
                int i14 = this.f17931k;
                int length = this.f17923c.length;
                int i15 = this.f17932l;
                int i16 = i3 + g;
                int i17 = i3;
                while (i17 < i16) {
                    int Z2 = mo26112Z(i17);
                    int i18 = i13;
                    int K3 = mo26082K(iArr, Z2) - i12;
                    int i19 = i12;
                    if (i15 < Z2) {
                        i2 = 0;
                    } else {
                        i2 = i18;
                    }
                    mo26117b1(iArr, Z2, mo26086M(K3, i2, i14, length));
                    i17++;
                    i13 = i18;
                    i12 = i19;
                }
                mo26130n0(i9, i3, g);
                if (!mo26071E0(i9, g)) {
                    mo26096R(i4, this.f17927g, i3);
                    if (i10 > 0) {
                        mo26073F0(i11, i10, i9 - 1);
                        return;
                    }
                    return;
                }
                ComposerKt.m2032x("Unexpectedly removed anchors".toString());
                throw new KotlinNothingValueException();
            }
        } else {
            ComposerKt.m2032x("Cannot move a group while inserting".toString());
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: q0 */
    public final void mo26133q0(int i) {
        int i2;
        int i3 = this.f17926f;
        int i4 = this.f17925e;
        if (i4 != i) {
            boolean z = true;
            if (!this.f17924d.isEmpty()) {
                mo26109X0(i4, i);
            }
            if (i3 > 0) {
                int[] iArr = this.f17922b;
                int i5 = i * 5;
                int i6 = i3 * 5;
                int i7 = i4 * 5;
                if (i < i4) {
                    C6706xq.m54493g(iArr, iArr, i6 + i5, i5, i7);
                } else {
                    C6706xq.m54493g(iArr, iArr, i7, i7 + i6, i5 + i6);
                }
            }
            if (i < i4) {
                i4 = i + i3;
            }
            int S = mo26098S();
            if (i2 >= S) {
                z = false;
            }
            ComposerKt.m2006X(z);
            while (i2 < S) {
                int r = s46.m26608R(this.f17922b, i2);
                int A0 = mo26063A0(mo26144z0(r), i);
                if (A0 != r) {
                    s46.m26616Z(this.f17922b, i2, A0);
                }
                i2++;
                if (i2 == i) {
                    i2 += i3;
                }
            }
        }
        this.f17925e = i;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: r0 */
    public final List<C1628bg> mo26134r0(int i, q46 q46, int i2) {
        vx2.m53591g(q46, "table");
        boolean z = true;
        if (this.f17933m > 0 || mo26118c0(this.f17938r + i) != 1) {
            z = false;
        }
        ComposerKt.m2006X(z);
        int i3 = this.f17938r;
        int i4 = this.f17928h;
        int i5 = this.f17929i;
        mo26143z(i);
        mo26099S0();
        mo26068D();
        t46 E = q46.mo24927E();
        try {
            List<C1628bg> a = f17920v.mo26145b(E, i2, this, false, true);
            E.mo26072F();
            mo26090O();
            mo26088N();
            this.f17938r = i3;
            this.f17928h = i4;
            this.f17929i = i5;
            return a;
        } catch (Throwable th) {
            E.mo26072F();
            throw th;
        }
    }

    /* renamed from: s0 */
    public final void mo26135s0(int i, int i2) {
        boolean z;
        boolean z2;
        int i3 = this.f17931k;
        int i4 = this.f17930j;
        int i5 = this.f17932l;
        if (i4 != i) {
            Object[] objArr = this.f17923c;
            if (i < i4) {
                C6706xq.m54495i(objArr, objArr, i + i3, i, i4);
            } else {
                C6706xq.m54495i(objArr, objArr, i4, i4 + i3, i + i3);
            }
            C6706xq.m54503q(objArr, null, i, i + i3);
        }
        int min = Math.min(i2 + 1, mo26106W());
        if (i5 != min) {
            int length = this.f17923c.length - i3;
            if (min < i5) {
                int Z = mo26112Z(min);
                int Z2 = mo26112Z(i5);
                int i6 = this.f17925e;
                while (Z < Z2) {
                    int e = s46.m26595E(this.f17922b, Z);
                    if (e >= 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        s46.m26612V(this.f17922b, Z, -((length - e) + 1));
                        Z++;
                        if (Z == i6) {
                            Z += this.f17926f;
                        }
                    } else {
                        ComposerKt.m2032x("Unexpected anchor value, expected a positive anchor".toString());
                        throw new KotlinNothingValueException();
                    }
                }
            } else {
                int Z3 = mo26112Z(i5);
                int Z4 = mo26112Z(min);
                while (Z3 < Z4) {
                    int e2 = s46.m26595E(this.f17922b, Z3);
                    if (e2 < 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        s46.m26612V(this.f17922b, Z3, e2 + length + 1);
                        Z3++;
                        if (Z3 == this.f17925e) {
                            Z3 += this.f17926f;
                        }
                    } else {
                        ComposerKt.m2032x("Unexpected anchor value, expected a negative anchor".toString());
                        throw new KotlinNothingValueException();
                    }
                }
            }
            this.f17932l = min;
        }
        this.f17930j = i;
    }

    /* renamed from: t0 */
    public final List<C1628bg> mo26136t0(C1628bg bgVar, int i, t46 t46) {
        boolean z;
        boolean z2;
        boolean z3;
        int i2;
        boolean z4;
        vx2.m53591g(bgVar, "anchor");
        vx2.m53591g(t46, "writer");
        boolean z5 = true;
        if (t46.f17933m > 0) {
            z = true;
        } else {
            z = false;
        }
        ComposerKt.m2006X(z);
        if (this.f17933m == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        ComposerKt.m2006X(z2);
        ComposerKt.m2006X(bgVar.mo11640b());
        int B = mo26064B(bgVar) + i;
        int i3 = this.f17938r;
        if (i3 > B || B >= this.f17927g) {
            z3 = false;
        } else {
            z3 = true;
        }
        ComposerKt.m2006X(z3);
        int x0 = mo26141x0(B);
        int c0 = mo26118c0(B);
        if (mo26128k0(B)) {
            i2 = 1;
        } else {
            i2 = mo26139v0(B);
        }
        List<C1628bg> a = f17920v.mo26145b(this, B, t46, false, false);
        mo26113Z0(x0);
        if (i2 > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        while (x0 >= i3) {
            int Z = mo26112Z(x0);
            int[] iArr = this.f17922b;
            s46.m26613W(iArr, Z, s46.m26597G(iArr, Z) - c0);
            if (z4) {
                if (s46.m26602L(this.f17922b, Z)) {
                    z4 = false;
                } else {
                    int[] iArr2 = this.f17922b;
                    s46.m26615Y(iArr2, Z, s46.m26605O(iArr2, Z) - i2);
                }
            }
            x0 = mo26141x0(x0);
        }
        if (z4) {
            if (this.f17934n < i2) {
                z5 = false;
            }
            ComposerKt.m2006X(z5);
            this.f17934n -= i2;
        }
        return a;
    }

    public String toString() {
        return "SlotWriter(current = " + this.f17938r + " end=" + this.f17927g + " size = " + mo26106W() + " gap=" + this.f17925e + '-' + (this.f17925e + this.f17926f) + ')';
    }

    /* renamed from: u0 */
    public final Object mo26138u0(int i) {
        int Z = mo26112Z(i);
        if (s46.m26602L(this.f17922b, Z)) {
            return this.f17923c[mo26084L(mo26140w0(this.f17922b, Z))];
        }
        return null;
    }

    /* renamed from: v0 */
    public final int mo26139v0(int i) {
        return s46.m26605O(this.f17922b, mo26112Z(i));
    }

    /* renamed from: w0 */
    public final int mo26140w0(int[] iArr, int i) {
        return mo26082K(iArr, i);
    }

    /* renamed from: x0 */
    public final int mo26141x0(int i) {
        return mo26142y0(this.f17922b, i);
    }

    /* renamed from: y0 */
    public final int mo26142y0(int[] iArr, int i) {
        return mo26144z0(s46.m26608R(iArr, mo26112Z(i)));
    }

    /* renamed from: z */
    public final void mo26143z(int i) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.f17933m <= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                throw new IllegalStateException("Cannot call seek() while inserting".toString());
            } else if (i != 0) {
                int i2 = this.f17938r + i;
                if (i2 < this.f17939s || i2 > this.f17927g) {
                    z3 = false;
                }
                if (z3) {
                    this.f17938r = i2;
                    int K = mo26082K(this.f17922b, mo26112Z(i2));
                    this.f17928h = K;
                    this.f17929i = K;
                    return;
                }
                ComposerKt.m2032x(("Cannot seek outside the current group (" + this.f17939s + '-' + this.f17927g + ')').toString());
                throw new KotlinNothingValueException();
            }
        } else {
            ComposerKt.m2032x("Cannot seek backwards".toString());
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: z0 */
    public final int mo26144z0(int i) {
        if (i > -2) {
            return i;
        }
        return mo26106W() + i + 2;
    }
}
