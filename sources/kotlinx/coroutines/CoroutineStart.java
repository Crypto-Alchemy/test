package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015JE\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u00022\u001c\u0010\u0006\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJY\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\u00022\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\f2\u0006\u0010\r\u001a\u00028\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8FX\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, mo44877d2 = {"Lkotlinx/coroutines/CoroutineStart;", "", "T", "Lkotlin/Function1;", "Lns0;", "", "block", "completion", "Lr37;", "invoke", "(Lrc2;Lns0;)V", "R", "Lkotlin/Function2;", "receiver", "(Lfd2;Ljava/lang/Object;Lns0;)V", "", "isLazy", "()Z", "isLazy$annotations", "()V", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "LAZY", "ATOMIC", "UNDISPATCHED", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* compiled from: CoroutineStart.kt */
public enum CoroutineStart {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    @Metadata(mo44878k = 3, mo44879mv = {1, 6, 0}, mo44881xi = 48)
    /* renamed from: kotlinx.coroutines.CoroutineStart$a */
    /* compiled from: CoroutineStart.kt */
    public /* synthetic */ class C7750a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f40345a = null;

        static {
            int[] iArr = new int[CoroutineStart.values().length];
            iArr[CoroutineStart.DEFAULT.ordinal()] = 1;
            iArr[CoroutineStart.ATOMIC.ordinal()] = 2;
            iArr[CoroutineStart.UNDISPATCHED.ordinal()] = 3;
            iArr[CoroutineStart.LAZY.ordinal()] = 4;
            f40345a = iArr;
        }
    }

    public final <T> void invoke(rc2<? super ns0<? super T>, ? extends Object> rc2, ns0<? super T> ns0) {
        int i = C7750a.f40345a[ordinal()];
        if (i == 1) {
            qa0.m71197c(rc2, ns0);
        } else if (i == 2) {
            qs0.m50852a(rc2, ns0);
        } else if (i == 3) {
            p37.m70905a(rc2, ns0);
        } else if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean isLazy() {
        if (this == LAZY) {
            return true;
        }
        return false;
    }

    public final <R, T> void invoke(fd2<? super R, ? super ns0<? super T>, ? extends Object> fd2, R r, ns0<? super T> ns0) {
        int i = C7750a.f40345a[ordinal()];
        if (i == 1) {
            qa0.m71199e(fd2, r, ns0, (rc2) null, 4, (Object) null);
        } else if (i == 2) {
            qs0.m50853b(fd2, r, ns0);
        } else if (i == 3) {
            p37.m70906b(fd2, r, ns0);
        } else if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
    }
}
