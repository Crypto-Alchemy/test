package p000;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \f2\u00020\u0001:\u0001\u0003R\u001a\u0010\u0007\u001a\u00020\u00028\u0000X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\r"}, mo44877d2 = {"Lut6;", "Lkotlin/coroutines/CoroutineContext$a;", "Lps0;", "a", "Lps0;", "f", "()Lps0;", "transactionDispatcher", "Lkotlin/coroutines/CoroutineContext$b;", "getKey", "()Lkotlin/coroutines/CoroutineContext$b;", "key", "d", "room-ktx_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: ut6 */
/* compiled from: RoomDatabaseExt.kt */
public final class ut6 implements CoroutineContext.C6188a {

    /* renamed from: d */
    public static final C3432a f18578d = new C3432a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final ps0 f18579a;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo44877d2 = {"Lut6$a;", "Lkotlin/coroutines/CoroutineContext$b;", "Lut6;", "<init>", "()V", "room-ktx_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: ut6$a */
    /* compiled from: RoomDatabaseExt.kt */
    public static final class C3432a implements CoroutineContext.C6190b<ut6> {
        public C3432a() {
        }

        public /* synthetic */ C3432a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: f */
    public final ps0 mo26870f() {
        return this.f18579a;
    }

    public <R> R fold(R r, fd2<? super R, ? super CoroutineContext.C6188a, ? extends R> fd2) {
        return CoroutineContext.C6188a.C6189a.m47418a(this, r, fd2);
    }

    public <E extends CoroutineContext.C6188a> E get(CoroutineContext.C6190b<E> bVar) {
        return CoroutineContext.C6188a.C6189a.m47419b(this, bVar);
    }

    public CoroutineContext.C6190b<ut6> getKey() {
        return f18578d;
    }

    public CoroutineContext minusKey(CoroutineContext.C6190b<?> bVar) {
        return CoroutineContext.C6188a.C6189a.m47420c(this, bVar);
    }

    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return CoroutineContext.C6188a.C6189a.m47421d(this, coroutineContext);
    }
}
