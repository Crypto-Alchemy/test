package p000;

import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0001\bB\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0000H&¢\u0006\u0004\b\b\u0010\tJ!\u0010\r\u001a\u00028\u00012\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0010\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, mo44877d2 = {"Lsa;", "I", "O", "", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent;", "", "resultCode", "intent", "c", "(ILandroid/content/Intent;)Ljava/lang/Object;", "Lsa$a;", "b", "(Landroid/content/Context;Ljava/lang/Object;)Lsa$a;", "<init>", "()V", "activity_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: sa */
/* compiled from: ActivityResultContract.kt */
public abstract class C3253sa<I, O> {

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0002\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0006\u001a\u00028\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00028\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, mo44877d2 = {"Lsa$a;", "T", "", "a", "Ljava/lang/Object;", "()Ljava/lang/Object;", "value", "<init>", "(Ljava/lang/Object;)V", "activity_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: sa$a */
    /* compiled from: ActivityResultContract.kt */
    public static final class C3254a<T> {

        /* renamed from: a */
        public final T f17532a;

        public C3254a(T t) {
            this.f17532a = t;
        }

        /* renamed from: a */
        public final T mo25691a() {
            return this.f17532a;
        }
    }

    /* renamed from: a */
    public abstract Intent mo6044a(Context context, I i);

    /* renamed from: b */
    public C3254a<O> mo25690b(Context context, I i) {
        vx2.m53591g(context, "context");
        return null;
    }

    /* renamed from: c */
    public abstract O mo6045c(int i, Intent intent);
}
