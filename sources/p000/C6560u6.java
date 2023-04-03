package p000;

import kotlin.Metadata;
import kotlin.random.Random;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016R\u0014\u0010\u0015\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, mo44877d2 = {"Lu6;", "Lkotlin/random/Random;", "", "bitCount", "nextBits", "nextInt", "until", "", "nextLong", "", "nextBoolean", "", "nextDouble", "", "nextFloat", "", "array", "nextBytes", "Ljava/util/Random;", "a", "()Ljava/util/Random;", "impl", "<init>", "()V", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: u6 */
/* compiled from: PlatformRandom.kt */
public abstract class C6560u6 extends Random {
    /* renamed from: a */
    public abstract java.util.Random mo47849a();

    public int nextBits(int i) {
        return a75.m31741g(mo47849a().nextInt(), i);
    }

    public boolean nextBoolean() {
        return mo47849a().nextBoolean();
    }

    public byte[] nextBytes(byte[] bArr) {
        vx2.m53591g(bArr, "array");
        mo47849a().nextBytes(bArr);
        return bArr;
    }

    public double nextDouble() {
        return mo47849a().nextDouble();
    }

    public float nextFloat() {
        return mo47849a().nextFloat();
    }

    public int nextInt() {
        return mo47849a().nextInt();
    }

    public long nextLong() {
        return mo47849a().nextLong();
    }

    public int nextInt(int i) {
        return mo47849a().nextInt(i);
    }
}
