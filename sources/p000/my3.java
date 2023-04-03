package p000;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import p000.ly3;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fR+\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028V@VX\u0002¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\r"}, mo44877d2 = {"Lmy3;", "Lly3;", "", "<set-?>", "a", "Lt04;", "getScaleFactor", "()F", "f", "(F)V", "scaleFactor", "<init>", "()V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: my3 */
/* compiled from: WindowRecomposer.android.kt */
public final class my3 implements ly3 {

    /* renamed from: a */
    public final t04 f15279a = l56.m21292b(Float.valueOf(1.0f), (h56) null, 2, (Object) null);

    /* renamed from: f */
    public void mo23421f(float f) {
        this.f15279a.setValue(Float.valueOf(f));
    }

    public <R> R fold(R r, fd2<? super R, ? super CoroutineContext.C6188a, ? extends R> fd2) {
        return ly3.C2791a.m21890a(this, r, fd2);
    }

    public <E extends CoroutineContext.C6188a> E get(CoroutineContext.C6190b<E> bVar) {
        return ly3.C2791a.m21891b(this, bVar);
    }

    public /* synthetic */ CoroutineContext.C6190b getKey() {
        return ky3.m21104a(this);
    }

    public CoroutineContext minusKey(CoroutineContext.C6190b<?> bVar) {
        return ly3.C2791a.m21892c(this, bVar);
    }

    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return ly3.C2791a.m21893d(this, coroutineContext);
    }
}
