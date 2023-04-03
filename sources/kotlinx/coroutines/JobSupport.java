package kotlinx.coroutines;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import p000.y23;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0005\u0001\u0001kB\u0012\u0012\u0007\u0010¦\u0001\u001a\u00020\u0015¢\u0006\u0006\b§\u0001\u0010¨\u0001J#\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ'\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010!\u001a\u00020\u0010*\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b!\u0010\u001eJ\u0019\u0010#\u001a\u00020\"2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b#\u0010$J1\u0010*\u001a\u00020)2\u0018\u0010'\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00100%j\u0002`&2\u0006\u0010(\u001a\u00020\u0015H\u0002¢\u0006\u0004\b*\u0010+J'\u0010.\u001a\u00020\u00152\u0006\u0010,\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020)H\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u000200H\u0002¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020)H\u0002¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0015H\u0002¢\u0006\u0004\b5\u00106J\u0013\u00107\u001a\u00020\u0010H@ø\u0001\u0000¢\u0006\u0004\b7\u00108J\u001b\u00109\u001a\u0004\u0018\u00010\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b9\u0010:J\u0019\u0010;\u001a\u00020\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b;\u0010<J\u001b\u0010=\u001a\u0004\u0018\u00010\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b=\u0010:J\u0019\u0010>\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0006\u001a\u00020\u0013H\u0002¢\u0006\u0004\b>\u0010?J\u001f\u0010@\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b@\u0010AJ%\u0010B\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\bB\u0010CJ#\u0010D\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00132\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\bD\u0010EJ\u0019\u0010G\u001a\u0004\u0018\u00010F2\u0006\u0010\u0006\u001a\u00020\u0013H\u0002¢\u0006\u0004\bG\u0010HJ*\u0010J\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010I\u001a\u00020F2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0010¢\u0006\u0004\bJ\u0010KJ)\u0010M\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010L\u001a\u00020F2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\bM\u0010NJ\u0015\u0010P\u001a\u0004\u0018\u00010F*\u00020OH\u0002¢\u0006\u0004\bP\u0010QJ\u0019\u0010S\u001a\u00020R2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\bS\u0010TJ\u0015\u0010U\u001a\u0004\u0018\u00010\u0004H@ø\u0001\u0000¢\u0006\u0004\bU\u00108J\u0019\u0010W\u001a\u00020\u00102\b\u0010V\u001a\u0004\u0018\u00010\u0001H\u0004¢\u0006\u0004\bW\u0010XJ\r\u0010Y\u001a\u00020\u0015¢\u0006\u0004\bY\u00106J\u000f\u0010Z\u001a\u00020\u0010H\u0014¢\u0006\u0004\bZ\u0010[J\u0011\u0010^\u001a\u00060\\j\u0002`]¢\u0006\u0004\b^\u0010_J#\u0010a\u001a\u00060\\j\u0002`]*\u00020\u000b2\n\b\u0002\u0010`\u001a\u0004\u0018\u00010RH\u0004¢\u0006\u0004\ba\u0010bJ'\u0010d\u001a\u00020c2\u0018\u0010'\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00100%j\u0002`&¢\u0006\u0004\bd\u0010eJ7\u0010g\u001a\u00020c2\u0006\u0010(\u001a\u00020\u00152\u0006\u0010f\u001a\u00020\u00152\u0018\u0010'\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00100%j\u0002`&¢\u0006\u0004\bg\u0010hJ\u0013\u0010i\u001a\u00020\u0010H@ø\u0001\u0000¢\u0006\u0004\bi\u00108J\u0017\u0010j\u001a\u00020\u00102\u0006\u0010-\u001a\u00020)H\u0000¢\u0006\u0004\bj\u00104J\u001f\u0010k\u001a\u00020\u00102\u000e\u0010\u001c\u001a\n\u0018\u00010\\j\u0004\u0018\u0001`]H\u0016¢\u0006\u0004\bk\u0010lJ\u000f\u0010m\u001a\u00020RH\u0014¢\u0006\u0004\bm\u0010nJ\u0017\u0010o\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u000bH\u0016¢\u0006\u0004\bo\u0010pJ\u0015\u0010r\u001a\u00020\u00102\u0006\u0010q\u001a\u00020\u0003¢\u0006\u0004\br\u0010sJ\u0017\u0010t\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u000bH\u0016¢\u0006\u0004\bt\u0010 J\u0017\u0010u\u001a\u00020\u00152\b\u0010\u001c\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\bu\u0010 J\u0019\u0010v\u001a\u00020\u00152\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\bv\u0010wJ\u0013\u0010x\u001a\u00060\\j\u0002`]H\u0016¢\u0006\u0004\bx\u0010_J\u0019\u0010y\u001a\u00020\u00152\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\by\u0010wJ\u001b\u0010z\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\bz\u0010:J\u0015\u0010|\u001a\u00020{2\u0006\u0010I\u001a\u00020\u0002¢\u0006\u0004\b|\u0010}J\u0017\u0010\u001a\u00020\u00102\u0006\u0010~\u001a\u00020\u000bH\u0010¢\u0006\u0004\b\u0010pJ\u001b\u0010\u0001\u001a\u00020\u00102\b\u0010\u001c\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0005\b\u0001\u0010pJ\u0019\u0010\u0001\u001a\u00020\u00152\u0006\u0010~\u001a\u00020\u000bH\u0014¢\u0006\u0005\b\u0001\u0010 J\u001c\u0010\u0001\u001a\u00020\u00102\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0006\b\u0001\u0010\u0001J\u001c\u0010\u0001\u001a\u00020\u00102\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0006\b\u0001\u0010\u0001J\u0011\u0010\u0001\u001a\u00020RH\u0016¢\u0006\u0005\b\u0001\u0010nJ\u0011\u0010\u0001\u001a\u00020RH\u0007¢\u0006\u0005\b\u0001\u0010nJ\u0011\u0010\u0001\u001a\u00020RH\u0010¢\u0006\u0005\b\u0001\u0010nJ\u0017\u0010\u0001\u001a\u0004\u0018\u00010\u0004H@ø\u0001\u0000¢\u0006\u0005\b\u0001\u00108R\u001e\u0010\u0001\u001a\u0004\u0018\u00010\u000b*\u0004\u0018\u00010\u00048BX\u0004¢\u0006\u0007\u001a\u0005\b\u0001\u0010<R\u0019\u0010\u0001\u001a\u0007\u0012\u0002\b\u00030\u00018F¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001R.\u0010\u0001\u001a\u0004\u0018\u00010{2\t\u0010\u0001\u001a\u0004\u0018\u00010{8@@@X\u000e¢\u0006\u0010\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048@X\u0004¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001R\u0016\u0010\u0001\u001a\u00020\u00158VX\u0004¢\u0006\u0007\u001a\u0005\b\u0001\u00106R\u0013\u0010\u0001\u001a\u00020\u00158F¢\u0006\u0007\u001a\u0005\b\u0001\u00106R\u0013\u0010\u0001\u001a\u00020\u00158F¢\u0006\u0007\u001a\u0005\b\u0001\u00106R\u0016\u0010\u0001\u001a\u00020\u00158PX\u0004¢\u0006\u0007\u001a\u0005\b\u0001\u00106R\u001b\u0010¡\u0001\u001a\t\u0012\u0004\u0012\u00020\u00010\u00018F¢\u0006\b\u001a\u0006\b\u0001\u0010 \u0001R\u0016\u0010£\u0001\u001a\u00020\u00158TX\u0004¢\u0006\u0007\u001a\u0005\b¢\u0001\u00106R\u0016\u0010¥\u0001\u001a\u00020\u00158PX\u0004¢\u0006\u0007\u001a\u0005\b¤\u0001\u00106\u0002\u0004\n\u0002\b\u0019¨\u0006©\u0001"}, mo44877d2 = {"Lkotlinx/coroutines/JobSupport;", "Ly23;", "Lje0;", "Lem4;", "", "Lkotlinx/coroutines/JobSupport$c;", "state", "proposedUpdate", "a0", "(Lkotlinx/coroutines/JobSupport$c;Ljava/lang/Object;)Ljava/lang/Object;", "", "", "exceptions", "d0", "(Lkotlinx/coroutines/JobSupport$c;Ljava/util/List;)Ljava/lang/Throwable;", "rootCause", "Lr37;", "M", "(Ljava/lang/Throwable;Ljava/util/List;)V", "Lmt2;", "update", "", "K0", "(Lmt2;Ljava/lang/Object;)Z", "X", "(Lmt2;Ljava/lang/Object;)V", "Le84;", "list", "cause", "w0", "(Le84;Ljava/lang/Throwable;)V", "U", "(Ljava/lang/Throwable;)Z", "x0", "", "F0", "(Ljava/lang/Object;)I", "Lkotlin/Function1;", "Lkotlinx/coroutines/CompletionHandler;", "handler", "onCancelling", "Lj33;", "t0", "(Lrc2;Z)Lj33;", "expect", "node", "L", "(Ljava/lang/Object;Le84;Lj33;)Z", "Lno1;", "B0", "(Lno1;)V", "C0", "(Lj33;)V", "o0", "()Z", "p0", "(Lns0;)Ljava/lang/Object;", "T", "(Ljava/lang/Object;)Ljava/lang/Object;", "Z", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "q0", "g0", "(Lmt2;)Le84;", "L0", "(Lmt2;Ljava/lang/Throwable;)Z", "M0", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "N0", "(Lmt2;Ljava/lang/Object;)Ljava/lang/Object;", "Lie0;", "b0", "(Lmt2;)Lie0;", "child", "O0", "(Lkotlinx/coroutines/JobSupport$c;Lie0;Ljava/lang/Object;)Z", "lastChild", "Y", "(Lkotlinx/coroutines/JobSupport$c;Lie0;Ljava/lang/Object;)V", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "v0", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Lie0;", "", "G0", "(Ljava/lang/Object;)Ljava/lang/String;", "P", "parent", "l0", "(Ly23;)V", "start", "A0", "()V", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "h", "()Ljava/util/concurrent/CancellationException;", "message", "H0", "(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/concurrent/CancellationException;", "Lzh1;", "p", "(Lrc2;)Lzh1;", "invokeImmediately", "v", "(ZZLrc2;)Lzh1;", "g", "D0", "c", "(Ljava/util/concurrent/CancellationException;)V", "V", "()Ljava/lang/String;", "S", "(Ljava/lang/Throwable;)V", "parentJob", "C", "(Lem4;)V", "W", "Q", "R", "(Ljava/lang/Object;)Z", "n", "r0", "s0", "Lhe0;", "G", "(Lje0;)Lhe0;", "exception", "k0", "y0", "j0", "z0", "(Ljava/lang/Object;)V", "N", "toString", "J0", "u0", "O", "c0", "exceptionOrNull", "Lkotlin/coroutines/CoroutineContext$b;", "getKey", "()Lkotlin/coroutines/CoroutineContext$b;", "key", "value", "h0", "()Lhe0;", "E0", "(Lhe0;)V", "parentHandle", "i0", "()Ljava/lang/Object;", "a", "isActive", "m0", "isCompleted", "isCancelled", "f0", "onCancelComplete", "Lhw5;", "b", "()Lhw5;", "children", "n0", "isScopedCoroutine", "e0", "handlesException", "active", "<init>", "(Z)V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* compiled from: JobSupport.kt */
public class JobSupport implements y23, je0, em4 {

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f40347a = AtomicReferenceFieldUpdater.newUpdater(JobSupport.class, Object.class, "_state");
    private volatile /* synthetic */ Object _parentHandle;
    private volatile /* synthetic */ Object _state;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0014R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0011"}, mo44877d2 = {"Lkotlinx/coroutines/JobSupport$a;", "T", "Lna0;", "Ly23;", "parent", "", "r", "", "G", "Lkotlinx/coroutines/JobSupport;", "y", "Lkotlinx/coroutines/JobSupport;", "job", "Lns0;", "delegate", "<init>", "(Lns0;Lkotlinx/coroutines/JobSupport;)V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.JobSupport$a */
    /* compiled from: JobSupport.kt */
    public static final class C7752a<T> extends na0<T> {

        /* renamed from: y */
        public final JobSupport f40348y;

        public C7752a(ns0<? super T> ns0, JobSupport jobSupport) {
            super(ns0, 1);
            this.f40348y = jobSupport;
        }

        /* renamed from: G */
        public String mo55534G() {
            return "AwaitContinuation";
        }

        /* renamed from: r */
        public Throwable mo55535r(y23 y23) {
            Throwable f;
            Object i0 = this.f40348y.mo55512i0();
            if ((i0 instanceof C7754c) && (f = ((C7754c) i0).mo55539f()) != null) {
                return f;
            }
            if (i0 instanceof lm0) {
                return ((lm0) i0).f40642a;
            }
            return y23.mo55510h();
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, mo44877d2 = {"Lkotlinx/coroutines/JobSupport$b;", "Lj33;", "", "cause", "Lr37;", "A", "Lkotlinx/coroutines/JobSupport;", "k", "Lkotlinx/coroutines/JobSupport;", "parent", "Lkotlinx/coroutines/JobSupport$c;", "r", "Lkotlinx/coroutines/JobSupport$c;", "state", "Lie0;", "s", "Lie0;", "child", "", "x", "Ljava/lang/Object;", "proposedUpdate", "<init>", "(Lkotlinx/coroutines/JobSupport;Lkotlinx/coroutines/JobSupport$c;Lie0;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.JobSupport$b */
    /* compiled from: JobSupport.kt */
    public static final class C7753b extends j33 {

        /* renamed from: k */
        public final JobSupport f40349k;

        /* renamed from: r */
        public final C7754c f40350r;

        /* renamed from: s */
        public final ie0 f40351s;

        /* renamed from: x */
        public final Object f40352x;

        public C7753b(JobSupport jobSupport, C7754c cVar, ie0 ie0, Object obj) {
            this.f40349k = jobSupport;
            this.f40350r = cVar;
            this.f40351s = ie0;
            this.f40352x = obj;
        }

        /* renamed from: A */
        public void mo51481A(Throwable th) {
            this.f40349k.mo55500Y(this.f40350r, this.f40351s, this.f40352x);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo51481A((Throwable) obj);
            return r37.f33317a;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003B!\u0012\u0006\u0010\u0019\u001a\u00020\u0014\u0012\u0006\u0010 \u001a\u00020\u001a\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b/\u00100J\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0010j\b\u0012\u0004\u0012\u00020\u0004`\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0019\u001a\u00020\u00148\u0016X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R$\u0010 \u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a8F@FX\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR(\u0010$\u001a\u0004\u0018\u00010\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u00048F@FX\u000e¢\u0006\f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010\fR\u0011\u0010&\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b%\u0010\u001dR\u0011\u0010(\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b'\u0010\u001dR\u0014\u0010)\u001a\u00020\u001a8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u001dR(\u0010.\u001a\u0004\u0018\u00010\u00012\b\u0010\u001b\u001a\u0004\u0018\u00010\u00018B@BX\u000e¢\u0006\f\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u00061"}, mo44877d2 = {"Lkotlinx/coroutines/JobSupport$c;", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "Lmt2;", "", "proposedException", "", "j", "(Ljava/lang/Throwable;)Ljava/util/List;", "exception", "Lr37;", "b", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "d", "()Ljava/util/ArrayList;", "Le84;", "a", "Le84;", "c", "()Le84;", "list", "", "value", "h", "()Z", "k", "(Z)V", "isCompleting", "f", "()Ljava/lang/Throwable;", "m", "rootCause", "i", "isSealed", "g", "isCancelling", "isActive", "e", "()Ljava/lang/Object;", "l", "(Ljava/lang/Object;)V", "exceptionsHolder", "<init>", "(Le84;ZLjava/lang/Throwable;)V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.JobSupport$c */
    /* compiled from: JobSupport.kt */
    public static final class C7754c implements mt2 {
        private volatile /* synthetic */ Object _exceptionsHolder = null;
        private volatile /* synthetic */ int _isCompleting;
        private volatile /* synthetic */ Object _rootCause;

        /* renamed from: a */
        public final e84 f40353a;

        public C7754c(e84 e84, boolean z, Throwable th) {
            this.f40353a = e84;
            this._isCompleting = z ? 1 : 0;
            this._rootCause = th;
        }

        /* renamed from: a */
        public boolean mo51282a() {
            if (mo55539f() == null) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public final void mo55536b(Throwable th) {
            Throwable f = mo55539f();
            if (f == null) {
                mo55546m(th);
            } else if (th != f) {
                Object e = mo55538e();
                if (e == null) {
                    mo55545l(th);
                } else if (e instanceof Throwable) {
                    if (th != e) {
                        ArrayList<Throwable> d = mo55537d();
                        d.add(e);
                        d.add(th);
                        mo55545l(d);
                    }
                } else if (e instanceof ArrayList) {
                    ((ArrayList) e).add(th);
                } else {
                    throw new IllegalStateException(("State is " + e).toString());
                }
            }
        }

        /* renamed from: c */
        public e84 mo51283c() {
            return this.f40353a;
        }

        /* renamed from: d */
        public final ArrayList<Throwable> mo55537d() {
            return new ArrayList<>(4);
        }

        /* renamed from: e */
        public final Object mo55538e() {
            return this._exceptionsHolder;
        }

        /* renamed from: f */
        public final Throwable mo55539f() {
            return (Throwable) this._rootCause;
        }

        /* renamed from: g */
        public final boolean mo55540g() {
            if (mo55539f() != null) {
                return true;
            }
            return false;
        }

        /* JADX WARNING: type inference failed for: r0v0, types: [int, boolean] */
        /* renamed from: h */
        public final boolean mo55541h() {
            return this._isCompleting;
        }

        /* renamed from: i */
        public final boolean mo55542i() {
            if (mo55538e() == k33.f38854e) {
                return true;
            }
            return false;
        }

        /* renamed from: j */
        public final List<Throwable> mo55543j(Throwable th) {
            ArrayList<Throwable> arrayList;
            Object e = mo55538e();
            if (e == null) {
                arrayList = mo55537d();
            } else if (e instanceof Throwable) {
                ArrayList<Throwable> d = mo55537d();
                d.add(e);
                arrayList = d;
            } else if (e instanceof ArrayList) {
                arrayList = (ArrayList) e;
            } else {
                throw new IllegalStateException(("State is " + e).toString());
            }
            Throwable f = mo55539f();
            if (f != null) {
                arrayList.add(0, f);
            }
            if (th != null && !vx2.m53586b(th, f)) {
                arrayList.add(th);
            }
            mo55545l(k33.f38854e);
            return arrayList;
        }

        /* renamed from: k */
        public final void mo55544k(boolean z) {
            this._isCompleting = z ? 1 : 0;
        }

        /* renamed from: l */
        public final void mo55545l(Object obj) {
            this._exceptionsHolder = obj;
        }

        /* renamed from: m */
        public final void mo55546m(Throwable th) {
            this._rootCause = th;
        }

        public String toString() {
            return "Finishing[cancelling=" + mo55540g() + ", completing=" + mo55541h() + ", rootCause=" + mo55539f() + ", exceptions=" + mo55538e() + ", list=" + mo51283c() + ']';
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¨\u0006\u0007"}, mo44877d2 = {"kotlinx/coroutines/JobSupport$d", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$a;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", "affected", "", "i", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.JobSupport$d */
    /* compiled from: LockFreeLinkedList.kt */
    public static final class C7755d extends LockFreeLinkedListNode.C7796a {

        /* renamed from: d */
        public final /* synthetic */ JobSupport f40354d;

        /* renamed from: e */
        public final /* synthetic */ Object f40355e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7755d(LockFreeLinkedListNode lockFreeLinkedListNode, JobSupport jobSupport, Object obj) {
            super(lockFreeLinkedListNode);
            this.f40354d = jobSupport;
            this.f40355e = obj;
        }

        /* renamed from: i */
        public Object mo52783g(LockFreeLinkedListNode lockFreeLinkedListNode) {
            boolean z;
            if (this.f40354d.mo55512i0() == this.f40355e) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return null;
            }
            return ck3.m56454a();
        }
    }

    public JobSupport(boolean z) {
        no1 no1;
        if (z) {
            no1 = k33.f38856g;
        } else {
            no1 = k33.f38855f;
        }
        this._state = no1;
        this._parentHandle = null;
    }

    /* renamed from: I0 */
    public static /* synthetic */ CancellationException m63145I0(JobSupport jobSupport, Throwable th, String str, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                str = null;
            }
            return jobSupport.mo55483H0(th, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
    }

    /* renamed from: A0 */
    public void mo55475A0() {
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [dt2] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: B0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo55476B0(p000.no1 r3) {
        /*
            r2 = this;
            e84 r0 = new e84
            r0.<init>()
            boolean r1 = r3.mo51282a()
            if (r1 == 0) goto L_0x000c
            goto L_0x0012
        L_0x000c:
            dt2 r1 = new dt2
            r1.<init>(r0)
            r0 = r1
        L_0x0012:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f40347a
            p000.C2265f6.m16607a(r1, r2, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.JobSupport.mo55476B0(no1):void");
    }

    /* renamed from: C */
    public final void mo52673C(em4 em4) {
        mo55495R(em4);
    }

    /* renamed from: C0 */
    public final void mo55477C0(j33 j33) {
        j33.mo55687j(new e84());
        C2265f6.m16607a(f40347a, this, j33, j33.mo55692o());
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: D0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo55478D0(p000.j33 r4) {
        /*
            r3 = this;
        L_0x0000:
            java.lang.Object r0 = r3.mo55512i0()
            boolean r1 = r0 instanceof p000.j33
            if (r1 == 0) goto L_0x0018
            if (r0 == r4) goto L_0x000b
            return
        L_0x000b:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f40347a
            no1 r2 = p000.k33.f38856g
            boolean r0 = p000.C2265f6.m16607a(r1, r3, r0, r2)
            if (r0 == 0) goto L_0x0000
            return
        L_0x0018:
            boolean r1 = r0 instanceof p000.mt2
            if (r1 == 0) goto L_0x0027
            mt2 r0 = (p000.mt2) r0
            e84 r0 = r0.mo51283c()
            if (r0 == 0) goto L_0x0027
            r4.mo50615v()
        L_0x0027:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.JobSupport.mo55478D0(j33):void");
    }

    /* renamed from: E0 */
    public final void mo55479E0(he0 he0) {
        this._parentHandle = he0;
    }

    /* renamed from: F0 */
    public final int mo55480F0(Object obj) {
        if (obj instanceof no1) {
            if (((no1) obj).mo51282a()) {
                return 0;
            }
            if (!C2265f6.m16607a(f40347a, this, obj, k33.f38856g)) {
                return -1;
            }
            mo55475A0();
            return 1;
        } else if (!(obj instanceof dt2)) {
            return 0;
        } else {
            if (!C2265f6.m16607a(f40347a, this, obj, ((dt2) obj).mo51283c())) {
                return -1;
            }
            mo55475A0();
            return 1;
        }
    }

    /* renamed from: G */
    public final he0 mo55481G(je0 je0) {
        return (he0) y23.C9621a.m74229d(this, true, false, new ie0(je0), 2, (Object) null);
    }

    /* renamed from: G0 */
    public final String mo55482G0(Object obj) {
        if (obj instanceof C7754c) {
            C7754c cVar = (C7754c) obj;
            if (cVar.mo55540g()) {
                return "Cancelling";
            }
            if (cVar.mo55541h()) {
                return "Completing";
            }
            return "Active";
        } else if (obj instanceof mt2) {
            if (((mt2) obj).mo51282a()) {
                return "Active";
            }
            return "New";
        } else if (obj instanceof lm0) {
            return "Cancelled";
        } else {
            return "Completed";
        }
    }

    /* renamed from: H0 */
    public final CancellationException mo55483H0(Throwable th, String str) {
        CancellationException cancellationException;
        if (th instanceof CancellationException) {
            cancellationException = (CancellationException) th;
        } else {
            cancellationException = null;
        }
        if (cancellationException == null) {
            if (str == null) {
                str = mo55498V();
            }
            cancellationException = new JobCancellationException(str, th, this);
        }
        return cancellationException;
    }

    /* renamed from: J0 */
    public final String mo55484J0() {
        return mo55527u0() + '{' + mo55482G0(mo55512i0()) + '}';
    }

    /* renamed from: K0 */
    public final boolean mo55485K0(mt2 mt2, Object obj) {
        if (!C2265f6.m16607a(f40347a, this, mt2, k33.m59673g(obj))) {
            return false;
        }
        mo55532y0((Throwable) null);
        mo55533z0(obj);
        mo55499X(mt2, obj);
        return true;
    }

    /* renamed from: L */
    public final boolean mo55486L(Object obj, e84 e84, j33 j33) {
        int z;
        C7755d dVar = new C7755d(j33, this, obj);
        do {
            z = e84.mo55693p().mo55699z(j33, e84, dVar);
            if (z == 1) {
                return true;
            }
        } while (z != 2);
        return false;
    }

    /* renamed from: L0 */
    public final boolean mo55487L0(mt2 mt2, Throwable th) {
        e84 g0 = mo55509g0(mt2);
        if (g0 == null) {
            return false;
        }
        if (!C2265f6.m16607a(f40347a, this, mt2, new C7754c(g0, false, th))) {
            return false;
        }
        mo55530w0(g0, th);
        return true;
    }

    /* renamed from: M */
    public final void mo55488M(Throwable th, List<? extends Throwable> list) {
        if (list.size() > 1) {
            Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
            for (Throwable th2 : list) {
                if (th2 != th && th2 != th && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                    ru1.m51326a(th, th2);
                }
            }
        }
    }

    /* renamed from: M0 */
    public final Object mo55489M0(Object obj, Object obj2) {
        if (!(obj instanceof mt2)) {
            return k33.f38850a;
        }
        if ((!(obj instanceof no1) && !(obj instanceof j33)) || (obj instanceof ie0) || (obj2 instanceof lm0)) {
            return mo55490N0((mt2) obj, obj2);
        }
        if (mo55485K0((mt2) obj, obj2)) {
            return obj2;
        }
        return k33.f38852c;
    }

    /* renamed from: N */
    public void mo52755N(Object obj) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x006e, code lost:
        r3 = (java.lang.Throwable) r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0071, code lost:
        if (r2 == null) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0073, code lost:
        mo55530w0(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0076, code lost:
        r9 = mo55505b0(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x007a, code lost:
        if (r9 == null) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0080, code lost:
        if (mo55492O0(r1, r9, r10) == false) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0084, code lost:
        return p000.k33.f38851b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0089, code lost:
        return mo55503a0(r1, r10);
     */
    /* renamed from: N0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo55490N0(p000.mt2 r9, java.lang.Object r10) {
        /*
            r8 = this;
            e84 r0 = r8.mo55509g0(r9)
            if (r0 != 0) goto L_0x000b
            xj6 r9 = p000.k33.f38852c
            return r9
        L_0x000b:
            boolean r1 = r9 instanceof kotlinx.coroutines.JobSupport.C7754c
            r2 = 0
            if (r1 == 0) goto L_0x0014
            r1 = r9
            kotlinx.coroutines.JobSupport$c r1 = (kotlinx.coroutines.JobSupport.C7754c) r1
            goto L_0x0015
        L_0x0014:
            r1 = r2
        L_0x0015:
            r3 = 0
            if (r1 != 0) goto L_0x001d
            kotlinx.coroutines.JobSupport$c r1 = new kotlinx.coroutines.JobSupport$c
            r1.<init>(r0, r3, r2)
        L_0x001d:
            kotlin.jvm.internal.Ref$ObjectRef r4 = new kotlin.jvm.internal.Ref$ObjectRef
            r4.<init>()
            monitor-enter(r1)
            boolean r5 = r1.mo55541h()     // Catch:{ all -> 0x008a }
            if (r5 == 0) goto L_0x002f
            xj6 r9 = p000.k33.f38850a     // Catch:{ all -> 0x008a }
            monitor-exit(r1)
            return r9
        L_0x002f:
            r5 = 1
            r1.mo55544k(r5)     // Catch:{ all -> 0x008a }
            if (r1 == r9) goto L_0x0043
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = f40347a     // Catch:{ all -> 0x008a }
            boolean r6 = p000.C2265f6.m16607a(r6, r8, r9, r1)     // Catch:{ all -> 0x008a }
            if (r6 != 0) goto L_0x0043
            xj6 r9 = p000.k33.f38852c     // Catch:{ all -> 0x008a }
            monitor-exit(r1)
            return r9
        L_0x0043:
            boolean r6 = r1.mo55540g()     // Catch:{ all -> 0x008a }
            boolean r7 = r10 instanceof p000.lm0     // Catch:{ all -> 0x008a }
            if (r7 == 0) goto L_0x004f
            r7 = r10
            lm0 r7 = (p000.lm0) r7     // Catch:{ all -> 0x008a }
            goto L_0x0050
        L_0x004f:
            r7 = r2
        L_0x0050:
            if (r7 == 0) goto L_0x0057
            java.lang.Throwable r7 = r7.f40642a     // Catch:{ all -> 0x008a }
            r1.mo55536b(r7)     // Catch:{ all -> 0x008a }
        L_0x0057:
            java.lang.Throwable r7 = r1.mo55539f()     // Catch:{ all -> 0x008a }
            if (r6 != 0) goto L_0x005e
            r3 = r5
        L_0x005e:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x008a }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x008a }
            if (r3 == 0) goto L_0x0069
            r2 = r7
        L_0x0069:
            r4.element = r2     // Catch:{ all -> 0x008a }
            r37 r3 = p000.r37.f33317a     // Catch:{ all -> 0x008a }
            monitor-exit(r1)
            r3 = r2
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            if (r2 == 0) goto L_0x0076
            r8.mo55530w0(r0, r2)
        L_0x0076:
            ie0 r9 = r8.mo55505b0(r9)
            if (r9 == 0) goto L_0x0085
            boolean r9 = r8.mo55492O0(r1, r9, r10)
            if (r9 == 0) goto L_0x0085
            xj6 r9 = p000.k33.f38851b
            return r9
        L_0x0085:
            java.lang.Object r9 = r8.mo55503a0(r1, r10)
            return r9
        L_0x008a:
            r9 = move-exception
            monitor-exit(r1)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.JobSupport.mo55490N0(mt2, java.lang.Object):java.lang.Object");
    }

    /* renamed from: O */
    public final Object mo55491O(ns0<Object> ns0) {
        Object i0;
        do {
            i0 = mo55512i0();
            if (!(i0 instanceof mt2)) {
                if (!(i0 instanceof lm0)) {
                    return k33.m59674h(i0);
                }
                throw ((lm0) i0).f40642a;
            }
        } while (mo55480F0(i0) < 0);
        return mo55493P(ns0);
    }

    /* renamed from: O0 */
    public final boolean mo55492O0(C7754c cVar, ie0 ie0, Object obj) {
        while (y23.C9621a.m74229d(ie0.f38376k, false, false, new C7753b(this, cVar, ie0, obj), 1, (Object) null) == j84.f38629a) {
            ie0 = mo55529v0(ie0);
            if (ie0 == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: P */
    public final Object mo55493P(ns0<Object> ns0) {
        C7752a aVar = new C7752a(IntrinsicsKt__IntrinsicsJvmKt.m47425c(ns0), this);
        aVar.mo56425x();
        pa0.m70973a(aVar, mo55519p(new kg5(aVar)));
        Object s = aVar.mo56421s();
        if (s == wx2.m54101d()) {
            a31.m31656c(ns0);
        }
        return s;
    }

    /* renamed from: Q */
    public final boolean mo55494Q(Throwable th) {
        return mo55495R(th);
    }

    /* renamed from: R */
    public final boolean mo55495R(Object obj) {
        Object a = k33.f38850a;
        if (mo50069f0() && (a = mo55496T(obj)) == k33.f38851b) {
            return true;
        }
        if (a == k33.f38850a) {
            a = mo55521q0(obj);
        }
        if (a == k33.f38850a || a == k33.f38851b) {
            return true;
        }
        if (a == k33.f38853d) {
            return false;
        }
        mo52755N(a);
        return true;
    }

    /* renamed from: S */
    public void mo52177S(Throwable th) {
        mo55495R(th);
    }

    /* renamed from: T */
    public final Object mo55496T(Object obj) {
        Object M0;
        do {
            Object i0 = mo55512i0();
            if (!(i0 instanceof mt2) || ((i0 instanceof C7754c) && ((C7754c) i0).mo55541h())) {
                return k33.f38850a;
            }
            M0 = mo55489M0(i0, new lm0(mo55501Z(obj), false, 2, (DefaultConstructorMarker) null));
        } while (M0 == k33.f38852c);
        return M0;
    }

    /* renamed from: U */
    public final boolean mo55497U(Throwable th) {
        if (mo52758n0()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        he0 h0 = mo55511h0();
        if (h0 == null || h0 == j84.f38629a) {
            return z;
        }
        if (h0.mo52184d(th) || z) {
            return true;
        }
        return false;
    }

    /* renamed from: V */
    public String mo55498V() {
        return "Job was cancelled";
    }

    /* renamed from: W */
    public boolean mo50487W(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        if (!mo55495R(th) || !mo50068e0()) {
            return false;
        }
        return true;
    }

    /* renamed from: X */
    public final void mo55499X(mt2 mt2, Object obj) {
        lm0 lm0;
        he0 h0 = mo55511h0();
        if (h0 != null) {
            h0.dispose();
            mo55479E0(j84.f38629a);
        }
        Throwable th = null;
        if (obj instanceof lm0) {
            lm0 = (lm0) obj;
        } else {
            lm0 = null;
        }
        if (lm0 != null) {
            th = lm0.f40642a;
        }
        if (mt2 instanceof j33) {
            try {
                ((j33) mt2).mo51481A(th);
            } catch (Throwable th2) {
                mo55515k0(new CompletionHandlerException("Exception in completion handler " + mt2 + " for " + this, th2));
            }
        } else {
            e84 c = mt2.mo51283c();
            if (c != null) {
                mo55531x0(c, th);
            }
        }
    }

    /* renamed from: Y */
    public final void mo55500Y(C7754c cVar, ie0 ie0, Object obj) {
        ie0 v0 = mo55529v0(ie0);
        if (v0 == null || !mo55492O0(cVar, v0, obj)) {
            mo52755N(mo55503a0(cVar, obj));
        }
    }

    /* renamed from: Z */
    public final Throwable mo55501Z(Object obj) {
        boolean z;
        if (obj == null) {
            z = true;
        } else {
            z = obj instanceof Throwable;
        }
        if (z) {
            Throwable th = (Throwable) obj;
            if (th == null) {
                return new JobCancellationException(mo55498V(), (Throwable) null, this);
            }
            return th;
        } else if (obj != null) {
            return ((em4) obj).mo51513n();
        } else {
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        }
    }

    /* renamed from: a */
    public boolean mo55502a() {
        Object i0 = mo55512i0();
        if (!(i0 instanceof mt2) || !((mt2) i0).mo51282a()) {
            return false;
        }
        return true;
    }

    /* renamed from: a0 */
    public final Object mo55503a0(C7754c cVar, Object obj) {
        lm0 lm0;
        Throwable th;
        boolean g;
        Throwable d0;
        if (obj instanceof lm0) {
            lm0 = (lm0) obj;
        } else {
            lm0 = null;
        }
        if (lm0 != null) {
            th = lm0.f40642a;
        } else {
            th = null;
        }
        synchronized (cVar) {
            g = cVar.mo55540g();
            List<Throwable> j = cVar.mo55543j(th);
            d0 = mo55507d0(cVar, j);
            if (d0 != null) {
                mo55488M(d0, j);
            }
        }
        boolean z = false;
        if (!(d0 == null || d0 == th)) {
            obj = new lm0(d0, false, 2, (DefaultConstructorMarker) null);
        }
        if (d0 != null) {
            if (mo55497U(d0) || mo55514j0(d0)) {
                z = true;
            }
            if (z) {
                if (obj != null) {
                    ((lm0) obj).mo55924b();
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                }
            }
        }
        if (!g) {
            mo55532y0(d0);
        }
        mo55533z0(obj);
        C2265f6.m16607a(f40347a, this, cVar, k33.m59673g(obj));
        mo55499X(cVar, obj);
        return obj;
    }

    /* renamed from: b */
    public final hw5<y23> mo55504b() {
        return kw5.m63631b(new JobSupport$children$1(this, (ns0<? super JobSupport$children$1>) null));
    }

    /* renamed from: b0 */
    public final ie0 mo55505b0(mt2 mt2) {
        ie0 ie0;
        if (mt2 instanceof ie0) {
            ie0 = (ie0) mt2;
        } else {
            ie0 = null;
        }
        if (ie0 != null) {
            return ie0;
        }
        e84 c = mt2.mo51283c();
        if (c != null) {
            return mo55529v0(c);
        }
        return null;
    }

    /* renamed from: c */
    public void mo52179c(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(mo55498V(), (Throwable) null, this);
        }
        mo52177S(cancellationException);
    }

    /* renamed from: c0 */
    public final Throwable mo55506c0(Object obj) {
        lm0 lm0;
        if (obj instanceof lm0) {
            lm0 = (lm0) obj;
        } else {
            lm0 = null;
        }
        if (lm0 != null) {
            return lm0.f40642a;
        }
        return null;
    }

    /* renamed from: d0 */
    public final Throwable mo55507d0(C7754c cVar, List<? extends Throwable> list) {
        T t;
        boolean z;
        T t2 = null;
        if (!list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (!(((Throwable) t) instanceof CancellationException)) {
                    break;
                }
            }
            Throwable th = (Throwable) t;
            if (th != null) {
                return th;
            }
            Throwable th2 = (Throwable) list.get(0);
            if (th2 instanceof TimeoutCancellationException) {
                Iterator<T> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    T next = it2.next();
                    Throwable th3 = (Throwable) next;
                    if (th3 == th2 || !(th3 instanceof TimeoutCancellationException)) {
                        z = false;
                        continue;
                    } else {
                        z = true;
                        continue;
                    }
                    if (z) {
                        t2 = next;
                        break;
                    }
                }
                Throwable th4 = (Throwable) t2;
                if (th4 != null) {
                    return th4;
                }
            }
            return th2;
        } else if (cVar.mo55540g()) {
            return new JobCancellationException(mo55498V(), (Throwable) null, this);
        } else {
            return null;
        }
    }

    /* renamed from: e0 */
    public boolean mo50068e0() {
        return true;
    }

    /* renamed from: f0 */
    public boolean mo50069f0() {
        return false;
    }

    public <R> R fold(R r, fd2<? super R, ? super CoroutineContext.C6188a, ? extends R> fd2) {
        return y23.C9621a.m74227b(this, r, fd2);
    }

    /* renamed from: g */
    public final Object mo55508g(ns0<? super r37> ns0) {
        if (!mo55518o0()) {
            g33.m58014k(ns0.getContext());
            return r37.f33317a;
        }
        Object p0 = mo55520p0(ns0);
        if (p0 == wx2.m54101d()) {
            return p0;
        }
        return r37.f33317a;
    }

    /* renamed from: g0 */
    public final e84 mo55509g0(mt2 mt2) {
        e84 c = mt2.mo51283c();
        if (c != null) {
            return c;
        }
        if (mt2 instanceof no1) {
            return new e84();
        }
        if (mt2 instanceof j33) {
            mo55477C0((j33) mt2);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + mt2).toString());
    }

    public <E extends CoroutineContext.C6188a> E get(CoroutineContext.C6190b<E> bVar) {
        return y23.C9621a.m74228c(this, bVar);
    }

    public final CoroutineContext.C6190b<?> getKey() {
        return y23.f46117l;
    }

    /* renamed from: h */
    public final CancellationException mo55510h() {
        Object i0 = mo55512i0();
        if (i0 instanceof C7754c) {
            Throwable f = ((C7754c) i0).mo55539f();
            if (f != null) {
                CancellationException H0 = mo55483H0(f, b31.m55722a(this) + " is cancelling");
                if (H0 != null) {
                    return H0;
                }
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (i0 instanceof mt2) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (i0 instanceof lm0) {
            return m63145I0(this, ((lm0) i0).f40642a, (String) null, 1, (Object) null);
        } else {
            return new JobCancellationException(b31.m55722a(this) + " has completed normally", (Throwable) null, this);
        }
    }

    /* renamed from: h0 */
    public final he0 mo55511h0() {
        return (he0) this._parentHandle;
    }

    /* renamed from: i0 */
    public final Object mo55512i0() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof gi4)) {
                return obj;
            }
            ((gi4) obj).mo51929c(this);
        }
    }

    public final boolean isCancelled() {
        Object i0 = mo55512i0();
        if ((i0 instanceof lm0) || ((i0 instanceof C7754c) && ((C7754c) i0).mo55540g())) {
            return true;
        }
        return false;
    }

    /* renamed from: j0 */
    public boolean mo55514j0(Throwable th) {
        return false;
    }

    /* renamed from: l0 */
    public final void mo55516l0(y23 y23) {
        if (y23 == null) {
            mo55479E0(j84.f38629a);
            return;
        }
        y23.start();
        he0 G = y23.mo55481G(this);
        mo55479E0(G);
        if (mo55517m0()) {
            G.dispose();
            mo55479E0(j84.f38629a);
        }
    }

    /* renamed from: m0 */
    public final boolean mo55517m0() {
        return !(mo55512i0() instanceof mt2);
    }

    public CoroutineContext minusKey(CoroutineContext.C6190b<?> bVar) {
        return y23.C9621a.m74230e(this, bVar);
    }

    /* renamed from: n */
    public CancellationException mo51513n() {
        Throwable th;
        Object i0 = mo55512i0();
        CancellationException cancellationException = null;
        if (i0 instanceof C7754c) {
            th = ((C7754c) i0).mo55539f();
        } else if (i0 instanceof lm0) {
            th = ((lm0) i0).f40642a;
        } else if (!(i0 instanceof mt2)) {
            th = null;
        } else {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + i0).toString());
        }
        if (th instanceof CancellationException) {
            cancellationException = (CancellationException) th;
        }
        if (cancellationException != null) {
            return cancellationException;
        }
        return new JobCancellationException("Parent job is " + mo55482G0(i0), th, this);
    }

    /* renamed from: n0 */
    public boolean mo52758n0() {
        return false;
    }

    /* renamed from: o0 */
    public final boolean mo55518o0() {
        Object i0;
        do {
            i0 = mo55512i0();
            if (!(i0 instanceof mt2)) {
                return false;
            }
        } while (mo55480F0(i0) < 0);
        return true;
    }

    /* renamed from: p */
    public final zh1 mo55519p(rc2<? super Throwable, r37> rc2) {
        return mo55528v(false, true, rc2);
    }

    /* renamed from: p0 */
    public final Object mo55520p0(ns0<? super r37> ns0) {
        na0 na0 = new na0(IntrinsicsKt__IntrinsicsJvmKt.m47425c(ns0), 1);
        na0.mo56425x();
        pa0.m70973a(na0, mo55519p(new lg5(na0)));
        Object s = na0.mo56421s();
        if (s == wx2.m54101d()) {
            a31.m31656c(ns0);
        }
        if (s == wx2.m54101d()) {
            return s;
        }
        return r37.f33317a;
    }

    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return y23.C9621a.m74231f(this, coroutineContext);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003e, code lost:
        if (r0 == null) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0040, code lost:
        mo55530w0(((kotlinx.coroutines.JobSupport.C7754c) r2).mo51283c(), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004d, code lost:
        return p000.k33.m59667a();
     */
    /* renamed from: q0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo55521q0(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 0
            r1 = r0
        L_0x0002:
            java.lang.Object r2 = r6.mo55512i0()
            boolean r3 = r2 instanceof kotlinx.coroutines.JobSupport.C7754c
            if (r3 == 0) goto L_0x0051
            monitor-enter(r2)
            r3 = r2
            kotlinx.coroutines.JobSupport$c r3 = (kotlinx.coroutines.JobSupport.C7754c) r3     // Catch:{ all -> 0x004e }
            boolean r3 = r3.mo55542i()     // Catch:{ all -> 0x004e }
            if (r3 == 0) goto L_0x001a
            xj6 r7 = p000.k33.f38853d     // Catch:{ all -> 0x004e }
            monitor-exit(r2)
            return r7
        L_0x001a:
            r3 = r2
            kotlinx.coroutines.JobSupport$c r3 = (kotlinx.coroutines.JobSupport.C7754c) r3     // Catch:{ all -> 0x004e }
            boolean r3 = r3.mo55540g()     // Catch:{ all -> 0x004e }
            if (r7 != 0) goto L_0x0025
            if (r3 != 0) goto L_0x0031
        L_0x0025:
            if (r1 != 0) goto L_0x002b
            java.lang.Throwable r1 = r6.mo55501Z(r7)     // Catch:{ all -> 0x004e }
        L_0x002b:
            r7 = r2
            kotlinx.coroutines.JobSupport$c r7 = (kotlinx.coroutines.JobSupport.C7754c) r7     // Catch:{ all -> 0x004e }
            r7.mo55536b(r1)     // Catch:{ all -> 0x004e }
        L_0x0031:
            r7 = r2
            kotlinx.coroutines.JobSupport$c r7 = (kotlinx.coroutines.JobSupport.C7754c) r7     // Catch:{ all -> 0x004e }
            java.lang.Throwable r7 = r7.mo55539f()     // Catch:{ all -> 0x004e }
            r1 = r3 ^ 1
            if (r1 == 0) goto L_0x003d
            r0 = r7
        L_0x003d:
            monitor-exit(r2)
            if (r0 == 0) goto L_0x0049
            kotlinx.coroutines.JobSupport$c r2 = (kotlinx.coroutines.JobSupport.C7754c) r2
            e84 r7 = r2.mo51283c()
            r6.mo55530w0(r7, r0)
        L_0x0049:
            xj6 r7 = p000.k33.f38850a
            return r7
        L_0x004e:
            r7 = move-exception
            monitor-exit(r2)
            throw r7
        L_0x0051:
            boolean r3 = r2 instanceof p000.mt2
            if (r3 == 0) goto L_0x00a2
            if (r1 != 0) goto L_0x005b
            java.lang.Throwable r1 = r6.mo55501Z(r7)
        L_0x005b:
            r3 = r2
            mt2 r3 = (p000.mt2) r3
            boolean r4 = r3.mo51282a()
            if (r4 == 0) goto L_0x006f
            boolean r2 = r6.mo55487L0(r3, r1)
            if (r2 == 0) goto L_0x0002
            xj6 r7 = p000.k33.f38850a
            return r7
        L_0x006f:
            lm0 r3 = new lm0
            r4 = 0
            r5 = 2
            r3.<init>(r1, r4, r5, r0)
            java.lang.Object r3 = r6.mo55489M0(r2, r3)
            xj6 r4 = p000.k33.f38850a
            if (r3 == r4) goto L_0x0087
            xj6 r2 = p000.k33.f38852c
            if (r3 == r2) goto L_0x0002
            return r3
        L_0x0087:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot happen in "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L_0x00a2:
            xj6 r7 = p000.k33.f38853d
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.JobSupport.mo55521q0(java.lang.Object):java.lang.Object");
    }

    /* renamed from: r0 */
    public final boolean mo55522r0(Object obj) {
        Object M0;
        do {
            M0 = mo55489M0(mo55512i0(), obj);
            if (M0 == k33.f38850a) {
                return false;
            }
            if (M0 == k33.f38851b) {
                return true;
            }
        } while (M0 == k33.f38852c);
        mo52755N(M0);
        return true;
    }

    /* renamed from: s0 */
    public final Object mo55523s0(Object obj) {
        Object M0;
        do {
            M0 = mo55489M0(mo55512i0(), obj);
            if (M0 == k33.f38850a) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, mo55506c0(obj));
            }
        } while (M0 == k33.f38852c);
        return M0;
    }

    public final boolean start() {
        int F0;
        do {
            F0 = mo55480F0(mo55512i0());
            if (F0 == 0) {
                return false;
            }
        } while (F0 != 1);
        return true;
    }

    /* renamed from: t0 */
    public final j33 mo55525t0(rc2<? super Throwable, r37> rc2, boolean z) {
        j33 j33 = null;
        if (z) {
            if (rc2 instanceof z23) {
                j33 = (z23) rc2;
            }
            if (j33 == null) {
                j33 = new ky2(rc2);
            }
        } else {
            if (rc2 instanceof j33) {
                j33 = (j33) rc2;
            }
            if (j33 == null) {
                j33 = new ly2(rc2);
            }
        }
        j33.mo52614C(this);
        return j33;
    }

    public String toString() {
        return mo55484J0() + '@' + b31.m55723b(this);
    }

    /* renamed from: u0 */
    public String mo55527u0() {
        return b31.m55722a(this);
    }

    /* renamed from: v */
    public final zh1 mo55528v(boolean z, boolean z2, rc2<? super Throwable, r37> rc2) {
        lm0 lm0;
        j33 t0 = mo55525t0(rc2, z);
        while (true) {
            Object i0 = mo55512i0();
            if (i0 instanceof no1) {
                no1 no1 = (no1) i0;
                if (!no1.mo51282a()) {
                    mo55476B0(no1);
                } else if (C2265f6.m16607a(f40347a, this, i0, t0)) {
                    return t0;
                }
            } else {
                Throwable th = null;
                if (i0 instanceof mt2) {
                    e84 c = ((mt2) i0).mo51283c();
                    if (c != null) {
                        zh1 zh1 = j84.f38629a;
                        if (z && (i0 instanceof C7754c)) {
                            synchronized (i0) {
                                th = ((C7754c) i0).mo55539f();
                                if (th == null || ((rc2 instanceof ie0) && !((C7754c) i0).mo55541h())) {
                                    if (mo55486L(i0, c, t0)) {
                                        if (th == null) {
                                            return t0;
                                        }
                                        zh1 = t0;
                                    }
                                }
                                r37 r37 = r37.f33317a;
                            }
                        }
                        if (th != null) {
                            if (z2) {
                                rc2.invoke(th);
                            }
                            return zh1;
                        } else if (mo55486L(i0, c, t0)) {
                            return t0;
                        }
                    } else if (i0 != null) {
                        mo55477C0((j33) i0);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    }
                } else {
                    if (z2) {
                        if (i0 instanceof lm0) {
                            lm0 = (lm0) i0;
                        } else {
                            lm0 = null;
                        }
                        if (lm0 != null) {
                            th = lm0.f40642a;
                        }
                        rc2.invoke(th);
                    }
                    return j84.f38629a;
                }
            }
        }
    }

    /* renamed from: v0 */
    public final ie0 mo55529v0(LockFreeLinkedListNode lockFreeLinkedListNode) {
        while (lockFreeLinkedListNode.mo50614t()) {
            lockFreeLinkedListNode = lockFreeLinkedListNode.mo55693p();
        }
        while (true) {
            lockFreeLinkedListNode = lockFreeLinkedListNode.mo55692o();
            if (!lockFreeLinkedListNode.mo50614t()) {
                if (lockFreeLinkedListNode instanceof ie0) {
                    return (ie0) lockFreeLinkedListNode;
                }
                if (lockFreeLinkedListNode instanceof e84) {
                    return null;
                }
            }
        }
    }

    /* renamed from: w0 */
    public final void mo55530w0(e84 e84, Throwable th) {
        mo55532y0(th);
        CompletionHandlerException completionHandlerException = null;
        for (LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) e84.mo55691n(); !vx2.m53586b(lockFreeLinkedListNode, e84); lockFreeLinkedListNode = lockFreeLinkedListNode.mo55692o()) {
            if (lockFreeLinkedListNode instanceof z23) {
                j33 j33 = (j33) lockFreeLinkedListNode;
                try {
                    j33.mo51481A(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        ru1.m51326a(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + j33 + " for " + this, th2);
                        r37 r37 = r37.f33317a;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            mo55515k0(completionHandlerException);
        }
        mo55497U(th);
    }

    /* renamed from: x0 */
    public final void mo55531x0(e84 e84, Throwable th) {
        CompletionHandlerException completionHandlerException = null;
        for (LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) e84.mo55691n(); !vx2.m53586b(lockFreeLinkedListNode, e84); lockFreeLinkedListNode = lockFreeLinkedListNode.mo55692o()) {
            if (lockFreeLinkedListNode instanceof j33) {
                j33 j33 = (j33) lockFreeLinkedListNode;
                try {
                    j33.mo51481A(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        ru1.m51326a(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + j33 + " for " + this, th2);
                        r37 r37 = r37.f33317a;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            mo55515k0(completionHandlerException);
        }
    }

    /* renamed from: y0 */
    public void mo55532y0(Throwable th) {
    }

    /* renamed from: z0 */
    public void mo55533z0(Object obj) {
    }

    /* renamed from: k0 */
    public void mo55515k0(Throwable th) {
        throw th;
    }
}
