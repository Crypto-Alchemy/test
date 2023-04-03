package androidx.compose.p004ui.platform;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\n"}, mo44877d2 = {"Landroidx/compose/ui/platform/GlobalSnapshotManager;", "", "Lr37;", "a", "Ljava/util/concurrent/atomic/AtomicBoolean;", "b", "Ljava/util/concurrent/atomic/AtomicBoolean;", "started", "<init>", "()V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.platform.GlobalSnapshotManager */
/* compiled from: GlobalSnapshotManager.android.kt */
public final class GlobalSnapshotManager {

    /* renamed from: a */
    public static final GlobalSnapshotManager f2042a = new GlobalSnapshotManager();

    /* renamed from: b */
    public static final AtomicBoolean f2043b = new AtomicBoolean(false);

    /* renamed from: a */
    public final void mo3927a() {
        if (f2043b.compareAndSet(false, true)) {
            fd0 b = od0.m70236b(-1, (BufferOverflow) null, (rc2) null, 6, (Object) null);
            y23 unused = d50.m56748b(iu0.m59111a(AndroidUiDispatcher.f1997H.mo3898b()), (CoroutineContext) null, (CoroutineStart) null, new GlobalSnapshotManager$ensureStarted$1(b, (ns0<? super GlobalSnapshotManager$ensureStarted$1>) null), 3, (Object) null);
            a56.f41e.mo67f(new GlobalSnapshotManager$ensureStarted$2(b));
        }
    }
}
