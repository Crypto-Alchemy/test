package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0004\b\b\u0010\u0006J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00028\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0003H&¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00008VX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, mo44877d2 = {"Ljs;", "T", "Lgi4;", "", "decision", "e", "(Ljava/lang/Object;)Ljava/lang/Object;", "affected", "g", "failure", "Lr37;", "d", "(Ljava/lang/Object;Ljava/lang/Object;)V", "c", "", "f", "()J", "opSequence", "a", "()Ljs;", "atomicOp", "<init>", "()V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: js */
/* compiled from: Atomic.kt */
public abstract class C7311js<T> extends gi4 {

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f38788a = AtomicReferenceFieldUpdater.newUpdater(C7311js.class, Object.class, "_consensus");
    private volatile /* synthetic */ Object _consensus = C7225is.f38514a;

    /* renamed from: a */
    public C7311js<?> mo51927a() {
        return this;
    }

    /* renamed from: c */
    public final Object mo51929c(Object obj) {
        Object obj2 = this._consensus;
        if (obj2 == C7225is.f38514a) {
            obj2 = mo52781e(mo52783g(obj));
        }
        mo52780d(obj, obj2);
        return obj2;
    }

    /* renamed from: d */
    public abstract void mo52780d(T t, Object obj);

    /* renamed from: e */
    public final Object mo52781e(Object obj) {
        Object obj2 = this._consensus;
        Object obj3 = C7225is.f38514a;
        if (obj2 != obj3) {
            return obj2;
        }
        if (C2265f6.m16607a(f38788a, this, obj3, obj)) {
            return obj;
        }
        return this._consensus;
    }

    /* renamed from: f */
    public long mo52782f() {
        return 0;
    }

    /* renamed from: g */
    public abstract Object mo52783g(T t);
}
