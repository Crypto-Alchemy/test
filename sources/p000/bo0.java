package p000;

import androidx.compose.runtime.ComposableSingletons$CompositionKt;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InvalidationResult;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Recomposer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.web3j.ens.contracts.generated.PublicResolver;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0000\u0018\u00002\u00020\u0001:\u0001>B*\u0012\u0006\u0010H\u001a\u00020F\u0012\n\u0010J\u001a\u0006\u0012\u0002\b\u00030\u0010\u0012\u000b\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010y¢\u0006\u0006\b\u0001\u0010\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u001e\u0010\n\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\bH\u0002J\b\u0010\u000b\u001a\u00020\u0002H\u0002J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0006H\u0002J6\u0010\u0015\u001a\u00020\u00022,\u0010\u0014\u001a(\u0012$\u0012\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00020\u000fj\u0002`\u00130\u000eH\u0002J\b\u0010\u0016\u001a\u00020\u0002H\u0002J\"\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u0006H\u0002J\u001c\u0010 \u001a\u0016\u0012\u0004\u0012\u00020\u0017\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001f0\u001eH\u0002J\u001d\u0010#\u001a\u00020\u00022\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u001d\u0010%\u001a\u00020\u00022\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020!H\u0016¢\u0006\u0004\b%\u0010$J\b\u0010&\u001a\u00020\u0002H\u0016J\u0016\u0010'\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0016\u0010(\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0016\u0010*\u001a\u00020\u00022\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020!H\u0016J\u0010\u0010+\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0006H\u0016J\u0010\u0010,\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0006H\u0016J\b\u0010-\u001a\u00020\bH\u0016J$\u00102\u001a\u00020\u00022\u001a\u00101\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u000200\u0012\u0006\u0012\u0004\u0018\u0001000/0.H\u0016J\u0010\u00105\u001a\u00020\u00022\u0006\u00104\u001a\u000203H\u0016J\b\u00106\u001a\u00020\u0002H\u0016J\b\u00107\u001a\u00020\u0002H\u0016J\b\u00108\u001a\u00020\u0002H\u0016J\b\u00109\u001a\u00020\u0002H\u0016J5\u0010>\u001a\u00028\u0000\"\u0004\b\u0000\u0010:2\b\u0010;\u001a\u0004\u0018\u00010\u00012\u0006\u0010=\u001a\u00020<2\f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000!H\u0016¢\u0006\u0004\b>\u0010?J\u0018\u0010@\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u0006J\u001f\u0010A\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0004\bA\u0010BJ\u001b\u0010D\u001a\u00020\u00022\n\u00104\u001a\u0006\u0012\u0002\b\u00030CH\u0000¢\u0006\u0004\bD\u0010ER\u0014\u0010H\u001a\u00020F8\u0002X\u0004¢\u0006\u0006\n\u0004\b>\u0010GR\u0018\u0010J\u001a\u0006\u0012\u0002\b\u00030\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010IR(\u0010N\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00060Kj\n\u0012\u0006\u0012\u0004\u0018\u00010\u0006`L8\u0002X\u0004¢\u0006\u0006\n\u0004\b2\u0010MR\u0014\u0010P\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b5\u0010OR$\u0010V\u001a\u0012\u0012\u0004\u0012\u00020R0Qj\b\u0012\u0004\u0012\u00020R`S8\u0002X\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u001a\u0010\\\u001a\u00020W8\u0000X\u0004¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R\u001a\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00170]8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010^R$\u0010`\u001a\u0012\u0012\u0004\u0012\u00020\u00170Qj\b\u0012\u0004\u0012\u00020\u0017`S8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010UR\u001e\u0010b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030C0]8\u0002X\u0004¢\u0006\u0006\n\u0004\ba\u0010^R:\u0010\u0014\u001a(\u0012$\u0012\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00020\u000fj\u0002`\u00130\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010cR:\u0010d\u001a(\u0012$\u0012\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00020\u000fj\u0002`\u00130\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010cR\u001a\u0010e\u001a\b\u0012\u0004\u0012\u00020\u00170]8\u0002X\u0004¢\u0006\u0006\n\u0004\bD\u0010^R*\u0010h\u001a\u0016\u0012\u0004\u0012\u00020\u0017\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001f0\u001e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bf\u0010gR\"\u0010o\u001a\u00020\b8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\u0018\u0010r\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bp\u0010qR\u0016\u0010t\u001a\u00020<8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bs\u0010iR\u0014\u0010x\u001a\u00020u8\u0002X\u0004¢\u0006\u0006\n\u0004\bv\u0010wR\u0016\u0010|\u001a\u0004\u0018\u00010y8\u0002X\u0004¢\u0006\u0006\n\u0004\bz\u0010{R\u0017\u0010~\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b}\u0010j\u001a\u0004\b~\u0010lR\u0017\u0010\u0001\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010jR.\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u00020!8\u0006@\u0006X\u000e¢\u0006\u0017\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0005\b\u0001\u0010$R\u0015\u0010\u0001\u001a\u00020\b8BX\u0004¢\u0006\u0006\u001a\u0004\ba\u0010lR\u0015\u0010\u0001\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\bX\u0010lR\u0016\u0010\u0001\u001a\u00020\b8VX\u0004¢\u0006\u0007\u001a\u0005\b\u0001\u0010l¨\u0006\u0001"}, mo44877d2 = {"Lbo0;", "Lkt0;", "Lr37;", "s", "x", "", "", "values", "", "forgetConditionalScopes", "h", "p", "value", "B", "", "Lkotlin/Function3;", "Ltp;", "Lt46;", "Lmc5;", "Landroidx/compose/runtime/Change;", "changes", "l", "f", "Landroidx/compose/runtime/RecomposeScopeImpl;", "scope", "Lbg;", "anchor", "instance", "Landroidx/compose/runtime/InvalidationResult;", "A", "Leq2;", "Lfq2;", "F", "Lkotlin/Function0;", "content", "d", "(Lfd2;)V", "j", "dispose", "o", "m", "block", "u", "n", "t", "i", "", "Lkotlin/Pair;", "Lzy3;", "references", "e", "Lyy3;", "state", "g", "q", "b", "v", "w", "R", "to", "", "groupIndex", "a", "(Lkt0;ILpc2;)Ljava/lang/Object;", "z", "D", "(Ljava/lang/Object;Landroidx/compose/runtime/RecomposeScopeImpl;)V", "Lqc1;", "C", "(Lqc1;)V", "Lwn0;", "Lwn0;", "parent", "Ltp;", "applier", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "pendingModifications", "Ljava/lang/Object;", "lock", "Ljava/util/HashSet;", "Lnc5;", "Lkotlin/collections/HashSet;", "k", "Ljava/util/HashSet;", "abandonSet", "Lq46;", "r", "Lq46;", "getSlotTable$runtime_release", "()Lq46;", "slotTable", "Lgq2;", "Lgq2;", "observations", "conditionallyInvalidatedScopes", "y", "derivedStates", "Ljava/util/List;", "lateChanges", "observationsProcessed", "H", "Leq2;", "invalidations", "I", "Z", "getPendingInvalidScopes$runtime_release", "()Z", "E", "(Z)V", "pendingInvalidScopes", "L", "Lbo0;", "invalidationDelegate", "M", "invalidationDelegateGroup", "Landroidx/compose/runtime/ComposerImpl;", "P", "Landroidx/compose/runtime/ComposerImpl;", "composer", "Lkotlin/coroutines/CoroutineContext;", "Q", "Lkotlin/coroutines/CoroutineContext;", "_recomposeContext", "U", "isRoot", "X", "disposed", "Y", "Lfd2;", "getComposable", "()Lfd2;", "setComposable", "composable", "areChildrenComposing", "isComposing", "c", "isDisposed", "recomposeContext", "<init>", "(Lwn0;Ltp;Lkotlin/coroutines/CoroutineContext;)V", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: bo0 */
/* compiled from: Composition.kt */
public final class bo0 implements kt0 {

    /* renamed from: A */
    public final List<id2<C3379tp<?>, t46, mc5, r37>> f8196A;

    /* renamed from: B */
    public final List<id2<C3379tp<?>, t46, mc5, r37>> f8197B;

    /* renamed from: C */
    public final gq2<RecomposeScopeImpl> f8198C;

    /* renamed from: H */
    public eq2<RecomposeScopeImpl, fq2<Object>> f8199H;

    /* renamed from: I */
    public boolean f8200I;

    /* renamed from: L */
    public bo0 f8201L;

    /* renamed from: M */
    public int f8202M;

    /* renamed from: P */
    public final ComposerImpl f8203P;

    /* renamed from: Q */
    public final CoroutineContext f8204Q;

    /* renamed from: U */
    public final boolean f8205U;

    /* renamed from: X */
    public boolean f8206X;

    /* renamed from: Y */
    public fd2<? super nn0, ? super Integer, r37> f8207Y;

    /* renamed from: a */
    public final wn0 f8208a;

    /* renamed from: d */
    public final C3379tp<?> f8209d;

    /* renamed from: e */
    public final AtomicReference<Object> f8210e;

    /* renamed from: g */
    public final Object f8211g;

    /* renamed from: k */
    public final HashSet<nc5> f8212k;

    /* renamed from: r */
    public final q46 f8213r;

    /* renamed from: s */
    public final gq2<RecomposeScopeImpl> f8214s;

    /* renamed from: x */
    public final HashSet<RecomposeScopeImpl> f8215x;

    /* renamed from: y */
    public final gq2<qc1<?>> f8216y;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\n¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0007\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\u0004R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000eR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000eR \u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00110\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000e¨\u0006\u0015"}, mo44877d2 = {"Lbo0$a;", "Lmc5;", "Lnc5;", "instance", "Lr37;", "a", "b", "d", "e", "c", "", "Ljava/util/Set;", "abandoning", "", "Ljava/util/List;", "remembering", "forgetting", "Lkotlin/Function0;", "sideEffects", "<init>", "(Ljava/util/Set;)V", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: bo0$a */
    /* compiled from: Composition.kt */
    public static final class C1642a implements mc5 {

        /* renamed from: a */
        public final Set<nc5> f8217a;

        /* renamed from: b */
        public final List<nc5> f8218b = new ArrayList();

        /* renamed from: c */
        public final List<nc5> f8219c = new ArrayList();

        /* renamed from: d */
        public final List<pc2<r37>> f8220d = new ArrayList();

        public C1642a(Set<nc5> set) {
            vx2.m53591g(set, "abandoning");
            this.f8217a = set;
        }

        /* renamed from: a */
        public void mo11766a(nc5 nc5) {
            vx2.m53591g(nc5, "instance");
            int lastIndexOf = this.f8219c.lastIndexOf(nc5);
            if (lastIndexOf >= 0) {
                this.f8219c.remove(lastIndexOf);
                this.f8217a.remove(nc5);
                return;
            }
            this.f8218b.add(nc5);
        }

        /* renamed from: b */
        public void mo11767b(nc5 nc5) {
            vx2.m53591g(nc5, "instance");
            int lastIndexOf = this.f8218b.lastIndexOf(nc5);
            if (lastIndexOf >= 0) {
                this.f8218b.remove(lastIndexOf);
                this.f8217a.remove(nc5);
                return;
            }
            this.f8219c.add(nc5);
        }

        /* renamed from: c */
        public final void mo11768c() {
            if (!this.f8217a.isEmpty()) {
                Object a = ms6.f15248a.mo23383a("Compose:abandons");
                try {
                    Iterator<nc5> it = this.f8217a.iterator();
                    while (it.hasNext()) {
                        it.remove();
                        it.next().mo2989b();
                    }
                    r37 r37 = r37.f33317a;
                } finally {
                    ms6.f15248a.mo23384b(a);
                }
            }
        }

        /* renamed from: d */
        public final void mo11769d() {
            if (!this.f8219c.isEmpty()) {
                Object a = ms6.f15248a.mo23383a("Compose:onForgotten");
                try {
                    for (int size = this.f8219c.size() - 1; -1 < size; size--) {
                        nc5 nc5 = this.f8219c.get(size);
                        if (!this.f8217a.contains(nc5)) {
                            nc5.mo2990c();
                        }
                    }
                    r37 r37 = r37.f33317a;
                } finally {
                    ms6.f15248a.mo23384b(a);
                }
            }
            if (!this.f8218b.isEmpty()) {
                Object a2 = ms6.f15248a.mo23383a("Compose:onRemembered");
                try {
                    List<nc5> list = this.f8218b;
                    int size2 = list.size();
                    for (int i = 0; i < size2; i++) {
                        nc5 nc52 = list.get(i);
                        this.f8217a.remove(nc52);
                        nc52.mo2988a();
                    }
                    r37 r372 = r37.f33317a;
                } finally {
                    ms6.f15248a.mo23384b(a2);
                }
            }
        }

        /* renamed from: e */
        public final void mo11770e() {
            if (!this.f8220d.isEmpty()) {
                Object a = ms6.f15248a.mo23383a("Compose:sideeffects");
                try {
                    List<pc2<r37>> list = this.f8220d;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        list.get(i).invoke();
                    }
                    this.f8220d.clear();
                    r37 r37 = r37.f33317a;
                } finally {
                    ms6.f15248a.mo23384b(a);
                }
            }
        }
    }

    public bo0(wn0 wn0, C3379tp<?> tpVar, CoroutineContext coroutineContext) {
        vx2.m53591g(wn0, "parent");
        vx2.m53591g(tpVar, "applier");
        this.f8208a = wn0;
        this.f8209d = tpVar;
        this.f8210e = new AtomicReference<>((Object) null);
        this.f8211g = new Object();
        HashSet<nc5> hashSet = new HashSet<>();
        this.f8212k = hashSet;
        q46 q46 = new q46();
        this.f8213r = q46;
        this.f8214s = new gq2<>();
        this.f8215x = new HashSet<>();
        this.f8216y = new gq2<>();
        ArrayList arrayList = new ArrayList();
        this.f8196A = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f8197B = arrayList2;
        this.f8198C = new gq2<>();
        this.f8199H = new eq2<>(0, 1, (DefaultConstructorMarker) null);
        ComposerImpl composerImpl = new ComposerImpl(tpVar, wn0, q46, hashSet, arrayList, arrayList2, this);
        wn0.mo27562m(composerImpl);
        this.f8203P = composerImpl;
        this.f8204Q = coroutineContext;
        this.f8205U = wn0 instanceof Recomposer;
        this.f8207Y = ComposableSingletons$CompositionKt.f1442a.mo2882a();
    }

    /* renamed from: k */
    public static final void m11490k(bo0 bo0, boolean z, Ref$ObjectRef<HashSet<RecomposeScopeImpl>> ref$ObjectRef, Object obj) {
        gq2<RecomposeScopeImpl> gq2 = bo0.f8214s;
        int a = gq2.mo20799f(obj);
        if (a >= 0) {
            fq2 b = gq2.mo20808o(a);
            int size = b.size();
            for (int i = 0; i < size; i++) {
                RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) b.get(i);
                if (!bo0.f8198C.mo20806m(obj, recomposeScopeImpl) && recomposeScopeImpl.mo3079s(obj) != InvalidationResult.IGNORED) {
                    if (!recomposeScopeImpl.mo3080t() || z) {
                        T t = (HashSet) ref$ObjectRef.element;
                        if (t == null) {
                            t = new HashSet();
                            ref$ObjectRef.element = t;
                        }
                        t.add(recomposeScopeImpl);
                    } else {
                        bo0.f8215x.add(recomposeScopeImpl);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0036, code lost:
        if (r1 == null) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003c, code lost:
        return r1.mo11736A(r6, r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003d, code lost:
        r5.f8208a.mo3109i(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0046, code lost:
        if (mo11757r() == false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return androidx.compose.runtime.InvalidationResult.SCHEDULED;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return androidx.compose.runtime.InvalidationResult.DEFERRED;
     */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.runtime.InvalidationResult mo11736A(androidx.compose.runtime.RecomposeScopeImpl r6, p000.C1628bg r7, java.lang.Object r8) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f8211g
            monitor-enter(r0)
            bo0 r1 = r5.f8201L     // Catch:{ all -> 0x004e }
            r2 = 0
            if (r1 == 0) goto L_0x0013
            q46 r3 = r5.f8213r     // Catch:{ all -> 0x004e }
            int r4 = r5.f8202M     // Catch:{ all -> 0x004e }
            boolean r3 = r3.mo24925B(r4, r7)     // Catch:{ all -> 0x004e }
            if (r3 == 0) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            r1 = r2
        L_0x0014:
            if (r1 != 0) goto L_0x0035
            boolean r3 = r5.mo11757r()     // Catch:{ all -> 0x004e }
            if (r3 == 0) goto L_0x0028
            androidx.compose.runtime.ComposerImpl r3 = r5.f8203P     // Catch:{ all -> 0x004e }
            boolean r3 = r3.mo2958j1(r6, r8)     // Catch:{ all -> 0x004e }
            if (r3 == 0) goto L_0x0028
            androidx.compose.runtime.InvalidationResult r6 = androidx.compose.runtime.InvalidationResult.IMMINENT     // Catch:{ all -> 0x004e }
            monitor-exit(r0)
            return r6
        L_0x0028:
            if (r8 != 0) goto L_0x0030
            eq2<androidx.compose.runtime.RecomposeScopeImpl, fq2<java.lang.Object>> r3 = r5.f8199H     // Catch:{ all -> 0x004e }
            r3.mo19465k(r6, r2)     // Catch:{ all -> 0x004e }
            goto L_0x0035
        L_0x0030:
            eq2<androidx.compose.runtime.RecomposeScopeImpl, fq2<java.lang.Object>> r2 = r5.f8199H     // Catch:{ all -> 0x004e }
            p000.co0.m12007d(r2, r6, r8)     // Catch:{ all -> 0x004e }
        L_0x0035:
            monitor-exit(r0)
            if (r1 == 0) goto L_0x003d
            androidx.compose.runtime.InvalidationResult r6 = r1.mo11736A(r6, r7, r8)
            return r6
        L_0x003d:
            wn0 r6 = r5.f8208a
            r6.mo3109i(r5)
            boolean r6 = r5.mo11757r()
            if (r6 == 0) goto L_0x004b
            androidx.compose.runtime.InvalidationResult r6 = androidx.compose.runtime.InvalidationResult.DEFERRED
            goto L_0x004d
        L_0x004b:
            androidx.compose.runtime.InvalidationResult r6 = androidx.compose.runtime.InvalidationResult.SCHEDULED
        L_0x004d:
            return r6
        L_0x004e:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.bo0.mo11736A(androidx.compose.runtime.RecomposeScopeImpl, bg, java.lang.Object):androidx.compose.runtime.InvalidationResult");
    }

    /* renamed from: B */
    public final void mo11737B(Object obj) {
        gq2<RecomposeScopeImpl> gq2 = this.f8214s;
        int a = gq2.mo20799f(obj);
        if (a >= 0) {
            fq2 b = gq2.mo20808o(a);
            int size = b.size();
            for (int i = 0; i < size; i++) {
                RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) b.get(i);
                if (recomposeScopeImpl.mo3079s(obj) == InvalidationResult.IMMINENT) {
                    this.f8198C.mo20796c(obj, recomposeScopeImpl);
                }
            }
        }
    }

    /* renamed from: C */
    public final void mo11738C(qc1<?> qc1) {
        vx2.m53591g(qc1, "state");
        if (!this.f8214s.mo20798e(qc1)) {
            this.f8216y.mo20807n(qc1);
        }
    }

    /* renamed from: D */
    public final void mo11739D(Object obj, RecomposeScopeImpl recomposeScopeImpl) {
        vx2.m53591g(obj, "instance");
        vx2.m53591g(recomposeScopeImpl, "scope");
        this.f8214s.mo20806m(obj, recomposeScopeImpl);
    }

    /* renamed from: E */
    public final void mo11740E(boolean z) {
        this.f8200I = z;
    }

    /* renamed from: F */
    public final eq2<RecomposeScopeImpl, fq2<Object>> mo11741F() {
        eq2<RecomposeScopeImpl, fq2<Object>> eq2 = this.f8199H;
        this.f8199H = new eq2<>(0, 1, (DefaultConstructorMarker) null);
        return eq2;
    }

    /* renamed from: a */
    public <R> R mo11742a(kt0 kt0, int i, pc2<? extends R> pc2) {
        vx2.m53591g(pc2, "block");
        if (kt0 == null || vx2.m53586b(kt0, this) || i < 0) {
            return pc2.invoke();
        }
        this.f8201L = (bo0) kt0;
        this.f8202M = i;
        try {
            return pc2.invoke();
        } finally {
            this.f8201L = null;
            this.f8202M = 0;
        }
    }

    /* renamed from: b */
    public void mo11743b() {
        synchronized (this.f8211g) {
            try {
                if (!this.f8197B.isEmpty()) {
                    mo11751l(this.f8197B);
                }
                r37 r37 = r37.f33317a;
            } catch (Exception e) {
                mo11746f();
                throw e;
            } catch (Throwable th) {
                if (!this.f8212k.isEmpty()) {
                    new C1642a(this.f8212k).mo11768c();
                }
                throw th;
            }
        }
    }

    /* renamed from: c */
    public boolean mo11744c() {
        return this.f8206X;
    }

    /* renamed from: d */
    public void mo3982d(fd2<? super nn0, ? super Integer, r37> fd2) {
        vx2.m53591g(fd2, PublicResolver.FUNC_CONTENT);
        if (!this.f8206X) {
            this.f8207Y = fd2;
            this.f8208a.mo3097a(this, fd2);
            return;
        }
        throw new IllegalStateException("The composition is disposed".toString());
    }

    /* JADX INFO: finally extract failed */
    public void dispose() {
        boolean z;
        synchronized (this.f8211g) {
            if (!this.f8206X) {
                this.f8206X = true;
                this.f8207Y = ComposableSingletons$CompositionKt.f1442a.mo2883b();
                List<id2<C3379tp<?>, t46, mc5, r37>> g0 = this.f8203P.mo2948g0();
                if (g0 != null) {
                    mo11751l(g0);
                }
                if (this.f8213r.mo24938s() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z || (true ^ this.f8212k.isEmpty())) {
                    C1642a aVar = new C1642a(this.f8212k);
                    if (z) {
                        t46 E = this.f8213r.mo24927E();
                        try {
                            ComposerKt.m2003U(E, aVar);
                            r37 r37 = r37.f33317a;
                            E.mo26072F();
                            this.f8209d.clear();
                            aVar.mo11769d();
                        } catch (Throwable th) {
                            E.mo26072F();
                            throw th;
                        }
                    }
                    aVar.mo11768c();
                }
                this.f8203P.mo2911Q();
            }
            r37 r372 = r37.f33317a;
        }
        this.f8208a.mo3119p(this);
    }

    /* renamed from: e */
    public void mo11745e(List<Pair<zy3, zy3>> list) {
        vx2.m53591g(list, "references");
        int size = list.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                z = true;
                break;
            } else if (!vx2.m53586b(((zy3) list.get(i).getFirst()).mo28673b(), this)) {
                break;
            } else {
                i++;
            }
        }
        ComposerKt.m2006X(z);
        try {
            this.f8203P.mo2966n0(list);
            r37 r37 = r37.f33317a;
        } catch (Exception e) {
            mo11746f();
            throw e;
        } catch (Throwable th) {
            if (!this.f8212k.isEmpty()) {
                new C1642a(this.f8212k).mo11768c();
            }
            throw th;
        }
    }

    /* renamed from: f */
    public final void mo11746f() {
        this.f8210e.set((Object) null);
        this.f8196A.clear();
        this.f8197B.clear();
        this.f8212k.clear();
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: g */
    public void mo11747g(yy3 yy3) {
        vx2.m53591g(yy3, "state");
        C1642a aVar = new C1642a(this.f8212k);
        t46 E = yy3.mo28274a().mo24927E();
        try {
            ComposerKt.m2003U(E, aVar);
            r37 r37 = r37.f33317a;
            E.mo26072F();
            aVar.mo11769d();
        } catch (Throwable th) {
            E.mo26072F();
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x00a8 A[SYNTHETIC] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11748h(java.util.Set<? extends java.lang.Object> r17, boolean r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            kotlin.jvm.internal.Ref$ObjectRef r2 = new kotlin.jvm.internal.Ref$ObjectRef
            r2.<init>()
            java.util.Iterator r3 = r17.iterator()
        L_0x000d:
            boolean r4 = r3.hasNext()
            r5 = 0
            if (r4 == 0) goto L_0x0044
            java.lang.Object r4 = r3.next()
            boolean r7 = r4 instanceof androidx.compose.runtime.RecomposeScopeImpl
            if (r7 == 0) goto L_0x0022
            androidx.compose.runtime.RecomposeScopeImpl r4 = (androidx.compose.runtime.RecomposeScopeImpl) r4
            r4.mo3079s(r5)
            goto L_0x000d
        L_0x0022:
            m11490k(r0, r1, r2, r4)
            gq2<qc1<?>> r5 = r0.f8216y
            int r4 = r5.mo20799f(r4)
            if (r4 < 0) goto L_0x000d
            fq2 r4 = r5.mo20808o(r4)
            int r5 = r4.size()
            r6 = 0
        L_0x0036:
            if (r6 >= r5) goto L_0x000d
            java.lang.Object r7 = r4.get(r6)
            qc1 r7 = (p000.qc1) r7
            m11490k(r0, r1, r2, r7)
            int r6 = r6 + 1
            goto L_0x0036
        L_0x0044:
            java.lang.String r3 = "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet"
            if (r1 == 0) goto L_0x0105
            java.util.HashSet<androidx.compose.runtime.RecomposeScopeImpl> r1 = r0.f8215x
            boolean r1 = r1.isEmpty()
            r4 = 1
            r1 = r1 ^ r4
            if (r1 == 0) goto L_0x0105
            gq2<androidx.compose.runtime.RecomposeScopeImpl> r1 = r0.f8214s
            int r7 = r1.mo20803j()
            r8 = 0
            r9 = 0
        L_0x005a:
            if (r8 >= r7) goto L_0x00e1
            int[] r10 = r1.mo20804k()
            r10 = r10[r8]
            fq2[] r11 = r1.mo20802i()
            r11 = r11[r10]
            p000.vx2.m53588d(r11)
            int r12 = r11.size()
            r13 = 0
            r14 = 0
        L_0x0071:
            if (r13 >= r12) goto L_0x00ac
            java.lang.Object[] r15 = r11.mo20052n()
            r15 = r15[r13]
            p000.vx2.m53589e(r15, r3)
            r6 = r15
            androidx.compose.runtime.RecomposeScopeImpl r6 = (androidx.compose.runtime.RecomposeScopeImpl) r6
            java.util.HashSet<androidx.compose.runtime.RecomposeScopeImpl> r5 = r0.f8215x
            boolean r5 = r5.contains(r6)
            if (r5 != 0) goto L_0x009b
            T r5 = r2.element
            java.util.HashSet r5 = (java.util.HashSet) r5
            if (r5 == 0) goto L_0x0095
            boolean r5 = r5.contains(r6)
            if (r5 != r4) goto L_0x0095
            r5 = r4
            goto L_0x0096
        L_0x0095:
            r5 = 0
        L_0x0096:
            if (r5 == 0) goto L_0x0099
            goto L_0x009b
        L_0x0099:
            r5 = 0
            goto L_0x009c
        L_0x009b:
            r5 = r4
        L_0x009c:
            if (r5 != 0) goto L_0x00a8
            if (r14 == r13) goto L_0x00a6
            java.lang.Object[] r5 = r11.mo20052n()
            r5[r14] = r15
        L_0x00a6:
            int r14 = r14 + 1
        L_0x00a8:
            int r13 = r13 + 1
            r5 = 0
            goto L_0x0071
        L_0x00ac:
            int r5 = r11.size()
            r6 = r14
        L_0x00b1:
            if (r6 >= r5) goto L_0x00bd
            java.lang.Object[] r12 = r11.mo20052n()
            r13 = 0
            r12[r6] = r13
            int r6 = r6 + 1
            goto L_0x00b1
        L_0x00bd:
            r11.mo20054r(r14)
            int r5 = r11.size()
            if (r5 <= 0) goto L_0x00dc
            if (r9 == r8) goto L_0x00da
            int[] r5 = r1.mo20804k()
            r5 = r5[r9]
            int[] r6 = r1.mo20804k()
            r6[r9] = r10
            int[] r6 = r1.mo20804k()
            r6[r8] = r5
        L_0x00da:
            int r9 = r9 + 1
        L_0x00dc:
            int r8 = r8 + 1
            r5 = 0
            goto L_0x005a
        L_0x00e1:
            int r2 = r1.mo20803j()
            r3 = r9
        L_0x00e6:
            if (r3 >= r2) goto L_0x00f8
            java.lang.Object[] r4 = r1.mo20805l()
            int[] r5 = r1.mo20804k()
            r5 = r5[r3]
            r6 = 0
            r4[r5] = r6
            int r3 = r3 + 1
            goto L_0x00e6
        L_0x00f8:
            r1.mo20809p(r9)
            r16.mo11755p()
            java.util.HashSet<androidx.compose.runtime.RecomposeScopeImpl> r1 = r0.f8215x
            r1.clear()
            goto L_0x019b
        L_0x0105:
            T r1 = r2.element
            java.util.HashSet r1 = (java.util.HashSet) r1
            if (r1 == 0) goto L_0x019b
            gq2<androidx.compose.runtime.RecomposeScopeImpl> r2 = r0.f8214s
            int r4 = r2.mo20803j()
            r5 = 0
            r6 = 0
        L_0x0113:
            if (r5 >= r4) goto L_0x017e
            int[] r7 = r2.mo20804k()
            r7 = r7[r5]
            fq2[] r8 = r2.mo20802i()
            r8 = r8[r7]
            p000.vx2.m53588d(r8)
            int r9 = r8.size()
            r10 = 0
            r11 = 0
        L_0x012a:
            if (r10 >= r9) goto L_0x014b
            java.lang.Object[] r12 = r8.mo20052n()
            r12 = r12[r10]
            p000.vx2.m53589e(r12, r3)
            r13 = r12
            androidx.compose.runtime.RecomposeScopeImpl r13 = (androidx.compose.runtime.RecomposeScopeImpl) r13
            boolean r13 = r1.contains(r13)
            if (r13 != 0) goto L_0x0148
            if (r11 == r10) goto L_0x0146
            java.lang.Object[] r13 = r8.mo20052n()
            r13[r11] = r12
        L_0x0146:
            int r11 = r11 + 1
        L_0x0148:
            int r10 = r10 + 1
            goto L_0x012a
        L_0x014b:
            int r9 = r8.size()
            r10 = r11
        L_0x0150:
            if (r10 >= r9) goto L_0x015c
            java.lang.Object[] r12 = r8.mo20052n()
            r13 = 0
            r12[r10] = r13
            int r10 = r10 + 1
            goto L_0x0150
        L_0x015c:
            r8.mo20054r(r11)
            int r8 = r8.size()
            if (r8 <= 0) goto L_0x017b
            if (r6 == r5) goto L_0x0179
            int[] r8 = r2.mo20804k()
            r8 = r8[r6]
            int[] r9 = r2.mo20804k()
            r9[r6] = r7
            int[] r7 = r2.mo20804k()
            r7[r5] = r8
        L_0x0179:
            int r6 = r6 + 1
        L_0x017b:
            int r5 = r5 + 1
            goto L_0x0113
        L_0x017e:
            int r1 = r2.mo20803j()
            r3 = r6
        L_0x0183:
            if (r3 >= r1) goto L_0x0195
            java.lang.Object[] r4 = r2.mo20805l()
            int[] r5 = r2.mo20804k()
            r5 = r5[r3]
            r7 = 0
            r4[r5] = r7
            int r3 = r3 + 1
            goto L_0x0183
        L_0x0195:
            r2.mo20809p(r6)
            r16.mo11755p()
        L_0x019b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.bo0.mo11748h(java.util.Set, boolean):void");
    }

    /* renamed from: i */
    public boolean mo11749i() {
        eq2<RecomposeScopeImpl, fq2<Object>> F;
        boolean B0;
        synchronized (this.f8211g) {
            mo11758s();
            try {
                F = mo11741F();
                B0 = this.f8203P.mo2889B0(F);
                if (!B0) {
                    mo11763x();
                }
            } catch (Exception e) {
                this.f8199H = F;
                throw e;
            } catch (Throwable th) {
                try {
                    if (!this.f8212k.isEmpty()) {
                        new C1642a(this.f8212k).mo11768c();
                    }
                    throw th;
                } catch (Exception e2) {
                    mo11746f();
                    throw e2;
                }
            }
        }
        return B0;
    }

    /* renamed from: j */
    public void mo11750j(fd2<? super nn0, ? super Integer, r37> fd2) {
        vx2.m53591g(fd2, PublicResolver.FUNC_CONTENT);
        try {
            synchronized (this.f8211g) {
                mo11758s();
                eq2<RecomposeScopeImpl, fq2<Object>> F = mo11741F();
                try {
                    this.f8203P.mo2902L(F, fd2);
                    r37 r37 = r37.f33317a;
                } catch (Exception e) {
                    this.f8199H = F;
                    throw e;
                }
            }
        } catch (Throwable th) {
            try {
                if (!this.f8212k.isEmpty()) {
                    new C1642a(this.f8212k).mo11768c();
                }
                throw th;
            } catch (Exception e2) {
                mo11746f();
                throw e2;
            }
        }
    }

    /* renamed from: l */
    public final void mo11751l(List<id2<C3379tp<?>, t46, mc5, r37>> list) {
        t46 E;
        Object a;
        C1642a aVar = new C1642a(this.f8212k);
        try {
            if (!list.isEmpty()) {
                Object a2 = ms6.f15248a.mo23383a("Compose:applyChanges");
                try {
                    this.f8209d.mo25330g();
                    E = this.f8213r.mo24927E();
                    C3379tp<?> tpVar = this.f8209d;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        list.get(i).invoke(tpVar, E, aVar);
                    }
                    list.clear();
                    r37 r37 = r37.f33317a;
                    E.mo26072F();
                    this.f8209d.mo20935d();
                    ms6 ms6 = ms6.f15248a;
                    ms6.mo23384b(a2);
                    aVar.mo11769d();
                    aVar.mo11770e();
                    if (this.f8200I) {
                        a = ms6.mo23383a("Compose:unobserve");
                        this.f8200I = false;
                        gq2<RecomposeScopeImpl> gq2 = this.f8214s;
                        int j = gq2.mo20803j();
                        int i2 = 0;
                        for (int i3 = 0; i3 < j; i3++) {
                            int i4 = gq2.mo20804k()[i3];
                            fq2 fq2 = gq2.mo20802i()[i4];
                            vx2.m53588d(fq2);
                            int size2 = fq2.size();
                            int i5 = 0;
                            for (int i6 = 0; i6 < size2; i6++) {
                                Object obj = fq2.mo20052n()[i6];
                                vx2.m53589e(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                                if (!(!((RecomposeScopeImpl) obj).mo3078r())) {
                                    if (i5 != i6) {
                                        fq2.mo20052n()[i5] = obj;
                                    }
                                    i5++;
                                }
                            }
                            int size3 = fq2.size();
                            for (int i7 = i5; i7 < size3; i7++) {
                                fq2.mo20052n()[i7] = null;
                            }
                            fq2.mo20054r(i5);
                            if (fq2.size() > 0) {
                                if (i2 != i3) {
                                    int i8 = gq2.mo20804k()[i2];
                                    gq2.mo20804k()[i2] = i4;
                                    gq2.mo20804k()[i3] = i8;
                                }
                                i2++;
                            }
                        }
                        int j2 = gq2.mo20803j();
                        for (int i9 = i2; i9 < j2; i9++) {
                            gq2.mo20805l()[gq2.mo20804k()[i9]] = null;
                        }
                        gq2.mo20809p(i2);
                        mo11755p();
                        r37 r372 = r37.f33317a;
                        ms6.f15248a.mo23384b(a);
                    }
                    if (this.f8197B.isEmpty()) {
                        aVar.mo11768c();
                    }
                } catch (Throwable th) {
                    ms6.f15248a.mo23384b(a2);
                    throw th;
                }
            } else if (this.f8197B.isEmpty()) {
                aVar.mo11768c();
            }
        } catch (Throwable th2) {
            if (this.f8197B.isEmpty()) {
                aVar.mo11768c();
            }
            throw th2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x000f  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo11752m(java.util.Set<? extends java.lang.Object> r3) {
        /*
            r2 = this;
            java.lang.String r0 = "values"
            p000.vx2.m53591g(r3, r0)
            java.util.Iterator r3 = r3.iterator()
        L_0x0009:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0025
            java.lang.Object r0 = r3.next()
            gq2<androidx.compose.runtime.RecomposeScopeImpl> r1 = r2.f8214s
            boolean r1 = r1.mo20798e(r0)
            if (r1 != 0) goto L_0x0023
            gq2<qc1<?>> r1 = r2.f8216y
            boolean r0 = r1.mo20798e(r0)
            if (r0 == 0) goto L_0x0009
        L_0x0023:
            r3 = 1
            return r3
        L_0x0025:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.bo0.mo11752m(java.util.Set):boolean");
    }

    /* renamed from: n */
    public void mo11753n(Object obj) {
        RecomposeScopeImpl f0;
        vx2.m53591g(obj, "value");
        if (!mo11764y() && (f0 = this.f8203P.mo2945f0()) != null) {
            f0.mo3063E(true);
            this.f8214s.mo20796c(obj, f0);
            if (obj instanceof qc1) {
                this.f8216y.mo20807n(obj);
                for (Object obj2 : ((qc1) obj).mo25072g()) {
                    if (obj2 == null) {
                        break;
                    }
                    this.f8216y.mo20796c(obj2, obj);
                }
            }
            f0.mo3082v(obj);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.util.Set<? extends java.lang.Object>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.util.Set<? extends java.lang.Object>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.util.Set<? extends java.lang.Object>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: java.util.Set<? extends java.lang.Object>} */
    /* JADX WARNING: type inference failed for: r2v5, types: [java.util.Set[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo11754o(java.util.Set<? extends java.lang.Object> r6) {
        /*
            r5 = this;
            java.lang.String r0 = "values"
            p000.vx2.m53591g(r6, r0)
        L_0x0005:
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r0 = r5.f8210e
            java.lang.Object r0 = r0.get()
            r1 = 1
            if (r0 != 0) goto L_0x0010
            r2 = r1
            goto L_0x0018
        L_0x0010:
            java.lang.Object r2 = p000.co0.f8506a
            boolean r2 = p000.vx2.m53586b(r0, r2)
        L_0x0018:
            if (r2 == 0) goto L_0x001c
            r2 = r6
            goto L_0x003c
        L_0x001c:
            boolean r2 = r0 instanceof java.util.Set
            if (r2 == 0) goto L_0x002c
            r2 = 2
            java.util.Set[] r2 = new java.util.Set[r2]
            r3 = 0
            r4 = r0
            java.util.Set r4 = (java.util.Set) r4
            r2[r3] = r4
            r2[r1] = r6
            goto L_0x003c
        L_0x002c:
            boolean r1 = r0 instanceof java.lang.Object[]
            if (r1 == 0) goto L_0x0054
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>"
            p000.vx2.m53589e(r0, r1)
            r1 = r0
            java.util.Set[] r1 = (java.util.Set[]) r1
            java.lang.Object[] r2 = p000.C6706xq.m54509w(r1, r6)
        L_0x003c:
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r1 = r5.f8210e
            boolean r1 = p000.ao0.m10672a(r1, r0, r2)
            if (r1 == 0) goto L_0x0005
            if (r0 != 0) goto L_0x0053
            java.lang.Object r6 = r5.f8211g
            monitor-enter(r6)
            r5.mo11763x()     // Catch:{ all -> 0x0050 }
            r37 r0 = p000.r37.f33317a     // Catch:{ all -> 0x0050 }
            monitor-exit(r6)
            goto L_0x0053
        L_0x0050:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x0053:
            return
        L_0x0054:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "corrupt pendingModifications: "
            r0.append(r1)
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r1 = r5.f8210e
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.bo0.mo11754o(java.util.Set):void");
    }

    /* renamed from: p */
    public final void mo11755p() {
        gq2<qc1<?>> gq2 = this.f8216y;
        int j = gq2.mo20803j();
        int i = 0;
        for (int i2 = 0; i2 < j; i2++) {
            int i3 = gq2.mo20804k()[i2];
            fq2 fq2 = gq2.mo20802i()[i3];
            vx2.m53588d(fq2);
            int size = fq2.size();
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                Object obj = fq2.mo20052n()[i5];
                vx2.m53589e(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                if (!(!this.f8214s.mo20798e((qc1) obj))) {
                    if (i4 != i5) {
                        fq2.mo20052n()[i4] = obj;
                    }
                    i4++;
                }
            }
            int size2 = fq2.size();
            for (int i6 = i4; i6 < size2; i6++) {
                fq2.mo20052n()[i6] = null;
            }
            fq2.mo20054r(i4);
            if (fq2.size() > 0) {
                if (i != i2) {
                    int i7 = gq2.mo20804k()[i];
                    gq2.mo20804k()[i] = i3;
                    gq2.mo20804k()[i2] = i7;
                }
                i++;
            }
        }
        int j2 = gq2.mo20803j();
        for (int i8 = i; i8 < j2; i8++) {
            gq2.mo20805l()[gq2.mo20804k()[i8]] = null;
        }
        gq2.mo20809p(i);
        Iterator<RecomposeScopeImpl> it = this.f8215x.iterator();
        vx2.m53590f(it, "iterator()");
        while (it.hasNext()) {
            if (!it.next().mo3080t()) {
                it.remove();
            }
        }
    }

    /* renamed from: q */
    public void mo11756q() {
        synchronized (this.f8211g) {
            try {
                mo11751l(this.f8196A);
                mo11763x();
                r37 r37 = r37.f33317a;
            } catch (Exception e) {
                mo11746f();
                throw e;
            } catch (Throwable th) {
                if (!this.f8212k.isEmpty()) {
                    new C1642a(this.f8212k).mo11768c();
                }
                throw th;
            }
        }
    }

    /* renamed from: r */
    public boolean mo11757r() {
        return this.f8203P.mo2975q0();
    }

    /* renamed from: s */
    public final void mo11758s() {
        Object andSet = this.f8210e.getAndSet(co0.f8506a);
        if (andSet == null) {
            return;
        }
        if (vx2.m53586b(andSet, co0.f8506a)) {
            ComposerKt.m2032x("pending composition has not been applied");
            throw new KotlinNothingValueException();
        } else if (andSet instanceof Set) {
            mo11748h((Set) andSet, true);
        } else if (andSet instanceof Object[]) {
            for (Set h : (Set[]) andSet) {
                mo11748h(h, true);
            }
        } else {
            ComposerKt.m2032x("corrupt pendingModifications drain: " + this.f8210e);
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: t */
    public void mo11759t(Object obj) {
        vx2.m53591g(obj, "value");
        synchronized (this.f8211g) {
            mo11737B(obj);
            gq2<qc1<?>> gq2 = this.f8216y;
            int a = gq2.mo20799f(obj);
            if (a >= 0) {
                fq2 b = gq2.mo20808o(a);
                int size = b.size();
                for (int i = 0; i < size; i++) {
                    mo11737B((qc1) b.get(i));
                }
            }
            r37 r37 = r37.f33317a;
        }
    }

    /* renamed from: u */
    public void mo11760u(pc2<r37> pc2) {
        vx2.m53591g(pc2, "block");
        this.f8203P.mo2983u0(pc2);
    }

    /* renamed from: v */
    public void mo11761v() {
        synchronized (this.f8211g) {
            try {
                this.f8203P.mo2896I();
                if (!this.f8212k.isEmpty()) {
                    new C1642a(this.f8212k).mo11768c();
                }
                r37 r37 = r37.f33317a;
            } catch (Exception e) {
                mo11746f();
                throw e;
            } catch (Throwable th) {
                if (!this.f8212k.isEmpty()) {
                    new C1642a(this.f8212k).mo11768c();
                }
                throw th;
            }
        }
    }

    /* renamed from: w */
    public void mo11762w() {
        RecomposeScopeImpl recomposeScopeImpl;
        synchronized (this.f8211g) {
            for (Object obj : this.f8213r.mo24939t()) {
                if (obj instanceof RecomposeScopeImpl) {
                    recomposeScopeImpl = (RecomposeScopeImpl) obj;
                } else {
                    recomposeScopeImpl = null;
                }
                if (recomposeScopeImpl != null) {
                    recomposeScopeImpl.invalidate();
                }
            }
            r37 r37 = r37.f33317a;
        }
    }

    /* renamed from: x */
    public final void mo11763x() {
        Object andSet = this.f8210e.getAndSet((Object) null);
        if (vx2.m53586b(andSet, co0.f8506a)) {
            return;
        }
        if (andSet instanceof Set) {
            mo11748h((Set) andSet, false);
        } else if (andSet instanceof Object[]) {
            for (Set h : (Set[]) andSet) {
                mo11748h(h, false);
            }
        } else if (andSet == null) {
            ComposerKt.m2032x("calling recordModificationsOf and applyChanges concurrently is not supported");
            throw new KotlinNothingValueException();
        } else {
            ComposerKt.m2032x("corrupt pendingModifications drain: " + this.f8210e);
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: y */
    public final boolean mo11764y() {
        return this.f8203P.mo2936c0();
    }

    /* renamed from: z */
    public final InvalidationResult mo11765z(RecomposeScopeImpl recomposeScopeImpl, Object obj) {
        vx2.m53591g(recomposeScopeImpl, "scope");
        if (recomposeScopeImpl.mo3073m()) {
            recomposeScopeImpl.mo3059A(true);
        }
        C1628bg j = recomposeScopeImpl.mo3070j();
        if (j == null || !this.f8213r.mo24928F(j) || !j.mo11640b()) {
            return InvalidationResult.IGNORED;
        }
        if (!j.mo11640b()) {
            return InvalidationResult.IGNORED;
        }
        if (!recomposeScopeImpl.mo3071k()) {
            return InvalidationResult.IGNORED;
        }
        return mo11736A(recomposeScopeImpl, j, obj);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bo0(wn0 wn0, C3379tp tpVar, CoroutineContext coroutineContext, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(wn0, tpVar, (i & 4) != 0 ? null : coroutineContext);
    }
}
