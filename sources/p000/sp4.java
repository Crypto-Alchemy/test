package p000;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u0006H\u0016J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\bH\u0016R\u0014\u0010\r\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, mo44877d2 = {"Lsp4;", "Lu6;", "", "from", "until", "nextInt", "", "nextLong", "", "nextDouble", "Ljava/util/Random;", "a", "()Ljava/util/Random;", "impl", "<init>", "()V", "kotlin-stdlib-jdk8"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: sp4 */
/* compiled from: PlatformThreadLocalRandom.kt */
public final class sp4 extends C6560u6 {
    /* renamed from: a */
    public Random mo47849a() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        vx2.m53590f(current, "current()");
        return current;
    }

    public double nextDouble(double d) {
        return ThreadLocalRandom.current().nextDouble(d);
    }

    public int nextInt(int i, int i2) {
        return ThreadLocalRandom.current().nextInt(i, i2);
    }

    public long nextLong(long j) {
        return ThreadLocalRandom.current().nextLong(j);
    }

    public long nextLong(long j, long j2) {
        return ThreadLocalRandom.current().nextLong(j, j2);
    }
}
