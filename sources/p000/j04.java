package p000;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.zv0;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0001¢\u0006\u0004\b\f\u0010\rJ,\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\t\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000e"}, mo44877d2 = {"Lj04;", "Lzv0;", "T", "Lzv0$b;", "key", "t", "Lr37;", "c", "(Lzv0$b;Ljava/lang/Object;)V", "a", "(Lzv0$b;)Ljava/lang/Object;", "initialExtras", "<init>", "(Lzv0;)V", "lifecycle-viewmodel_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: j04 */
/* compiled from: CreationExtras.kt */
public final class j04 extends zv0 {
    public j04() {
        this((zv0) null, 1, (DefaultConstructorMarker) null);
    }

    public j04(zv0 zv0) {
        vx2.m53591g(zv0, "initialExtras");
        mo28583b().putAll(zv0.mo28583b());
    }

    /* renamed from: a */
    public <T> T mo21703a(zv0.C3765b<T> bVar) {
        vx2.m53591g(bVar, "key");
        return mo28583b().get(bVar);
    }

    /* renamed from: c */
    public final <T> void mo21704c(zv0.C3765b<T> bVar, T t) {
        vx2.m53591g(bVar, "key");
        mo28583b().put(bVar, t);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j04(zv0 zv0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? zv0.C3764a.f20690b : zv0);
    }
}
