package p000;

import kotlin.Metadata;
import kotlinx.coroutines.flow.SharingCommand;
import kotlinx.coroutines.flow.StartedLazily;
import kotlinx.coroutines.flow.StartedWhileSubscribed;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0001\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¨\u0006\b"}, mo44877d2 = {"Li06;", "", "Lt86;", "", "subscriptionCount", "Lz42;", "Lkotlinx/coroutines/flow/SharingCommand;", "a", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: i06 */
/* compiled from: SharingStarted.kt */
public interface i06 {

    /* renamed from: a */
    public static final C7198a f38305a = C7198a.f38306a;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002R\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\r\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\u0010"}, mo44877d2 = {"Li06$a;", "", "", "stopTimeoutMillis", "replayExpirationMillis", "Li06;", "a", "b", "Li06;", "c", "()Li06;", "Eagerly", "d", "Lazily", "<init>", "()V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: i06$a */
    /* compiled from: SharingStarted.kt */
    public static final class C7198a {

        /* renamed from: a */
        public static final /* synthetic */ C7198a f38306a = new C7198a();

        /* renamed from: b */
        public static final i06 f38307b = new o86();

        /* renamed from: c */
        public static final i06 f38308c = new StartedLazily();

        /* renamed from: b */
        public static /* synthetic */ i06 m58757b(C7198a aVar, long j, long j2, int i, Object obj) {
            if ((i & 1) != 0) {
                j = 0;
            }
            if ((i & 2) != 0) {
                j2 = Long.MAX_VALUE;
            }
            return aVar.mo52357a(j, j2);
        }

        /* renamed from: a */
        public final i06 mo52357a(long j, long j2) {
            return new StartedWhileSubscribed(j, j2);
        }

        /* renamed from: c */
        public final i06 mo52358c() {
            return f38307b;
        }

        /* renamed from: d */
        public final i06 mo52359d() {
            return f38308c;
        }
    }

    /* renamed from: a */
    z42<SharingCommand> mo52356a(t86<Integer> t86);
}
