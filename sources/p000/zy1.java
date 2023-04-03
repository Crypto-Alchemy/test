package p000;

import java.util.Random;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, mo44877d2 = {"Lzy1;", "Lu6;", "zy1$a", "d", "Lzy1$a;", "implStorage", "Ljava/util/Random;", "a", "()Ljava/util/Random;", "impl", "<init>", "()V", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: zy1 */
/* compiled from: PlatformRandom.kt */
public final class zy1 extends C6560u6 {

    /* renamed from: d */
    public final C6782a f36304d = new C6782a();

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0014¨\u0006\u0004"}, mo44877d2 = {"zy1$a", "Ljava/lang/ThreadLocal;", "Ljava/util/Random;", "a", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: zy1$a */
    /* compiled from: PlatformRandom.kt */
    public static final class C6782a extends ThreadLocal<Random> {
        /* renamed from: a */
        public Random initialValue() {
            return new Random();
        }
    }

    /* renamed from: a */
    public Random mo47849a() {
        Object obj = this.f36304d.get();
        vx2.m53590f(obj, "implStorage.get()");
        return (Random) obj;
    }
}
