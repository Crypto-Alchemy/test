package kotlinx.coroutines;

import java.io.Closeable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 \u00052\u00020\u00012\u00020\u0002:\u0001\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, mo44877d2 = {"Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Ljava/io/Closeable;", "<init>", "()V", "e", "Key", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* compiled from: Executors.kt */
public abstract class ExecutorCoroutineDispatcher extends CoroutineDispatcher implements Closeable {

    /* renamed from: e */
    public static final Key f40346e = new Key((DefaultConstructorMarker) null);

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo44877d2 = {"Lkotlinx/coroutines/ExecutorCoroutineDispatcher$Key;", "La6;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "<init>", "()V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* compiled from: Executors.kt */
    public static final class Key extends C3800a6<CoroutineDispatcher, ExecutorCoroutineDispatcher> {
        public Key() {
            super(CoroutineDispatcher.f40343d, C77511.INSTANCE);
        }

        public /* synthetic */ Key(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
