package androidx.room;

import android.os.CancellationSignal;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineStart;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo44877d2 = {"Landroidx/room/CoroutinesRoom;", "", "a", "Companion", "room-ktx_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: CoroutinesRoom.kt */
public final class CoroutinesRoom {

    /* renamed from: a */
    public static final Companion f6865a = new Companion((DefaultConstructorMarker) null);

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J7\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ?\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, mo44877d2 = {"Landroidx/room/CoroutinesRoom$Companion;", "", "R", "Landroidx/room/RoomDatabase;", "db", "", "inTransaction", "Ljava/util/concurrent/Callable;", "callable", "b", "(Landroidx/room/RoomDatabase;ZLjava/util/concurrent/Callable;Lns0;)Ljava/lang/Object;", "Landroid/os/CancellationSignal;", "cancellationSignal", "a", "(Landroidx/room/RoomDatabase;ZLandroid/os/CancellationSignal;Ljava/util/concurrent/Callable;Lns0;)Ljava/lang/Object;", "<init>", "()V", "room-ktx_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* compiled from: CoroutinesRoom.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final <R> Object mo10099a(RoomDatabase roomDatabase, boolean z, CancellationSignal cancellationSignal, Callable<R> callable, ns0<? super R> ns0) {
            CoroutineDispatcher coroutineDispatcher;
            ps0 ps0;
            if (roomDatabase.mo10140z() && roomDatabase.mo10134t()) {
                return callable.call();
            }
            ut6 ut6 = (ut6) ns0.getContext().get(ut6.f18578d);
            if (ut6 == null || (ps0 = ut6.mo26870f()) == null) {
                if (z) {
                    coroutineDispatcher = ku0.m21081b(roomDatabase);
                } else {
                    coroutineDispatcher = ku0.m21080a(roomDatabase);
                }
                ps0 = coroutineDispatcher;
            }
            ps0 ps02 = ps0;
            na0 na0 = new na0(IntrinsicsKt__IntrinsicsJvmKt.m47425c(ns0), 1);
            na0.mo56425x();
            na0.mo56166t(new CoroutinesRoom$Companion$execute$4$1(cancellationSignal, d50.m56748b(ih2.f38385a, ps02, (CoroutineStart) null, new CoroutinesRoom$Companion$execute$4$job$1(callable, na0, (ns0<? super CoroutinesRoom$Companion$execute$4$job$1>) null), 2, (Object) null)));
            Object s = na0.mo56421s();
            if (s == wx2.m54101d()) {
                a31.m31656c(ns0);
            }
            return s;
        }

        /* renamed from: b */
        public final <R> Object mo10100b(RoomDatabase roomDatabase, boolean z, Callable<R> callable, ns0<? super R> ns0) {
            ps0 ps0;
            CoroutineDispatcher coroutineDispatcher;
            if (roomDatabase.mo10140z() && roomDatabase.mo10134t()) {
                return callable.call();
            }
            ut6 ut6 = (ut6) ns0.getContext().get(ut6.f18578d);
            if (ut6 == null || (ps0 = ut6.mo26870f()) == null) {
                if (z) {
                    coroutineDispatcher = ku0.m21081b(roomDatabase);
                } else {
                    coroutineDispatcher = ku0.m21080a(roomDatabase);
                }
                ps0 = coroutineDispatcher;
            }
            return b50.m55768e(ps0, new CoroutinesRoom$Companion$execute$2(callable, (ns0<? super CoroutinesRoom$Companion$execute$2>) null), ns0);
        }
    }

    /* renamed from: a */
    public static final <R> Object m9773a(RoomDatabase roomDatabase, boolean z, CancellationSignal cancellationSignal, Callable<R> callable, ns0<? super R> ns0) {
        return f6865a.mo10099a(roomDatabase, z, cancellationSignal, callable, ns0);
    }

    /* renamed from: b */
    public static final <R> Object m9774b(RoomDatabase roomDatabase, boolean z, Callable<R> callable, ns0<? super R> ns0) {
        return f6865a.mo10100b(roomDatabase, z, callable, ns0);
    }
}
