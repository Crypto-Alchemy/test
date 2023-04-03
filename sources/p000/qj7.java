package p000;

import java.lang.ref.WeakReference;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001b\u001a\u00020\n¢\u0006\u0004\b\u001c\u0010\u0019J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0014\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u001a\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u000b\u0010\u0019¨\u0006\u001d"}, mo44877d2 = {"Lqj7;", "", "other", "", "equals", "", "hashCode", "", "toString", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ClassLoader;", "a", "Ljava/lang/ref/WeakReference;", "getRef", "()Ljava/lang/ref/WeakReference;", "ref", "b", "I", "getIdentityHashCode", "()I", "identityHashCode", "c", "Ljava/lang/ClassLoader;", "getTemporaryStrongRef", "()Ljava/lang/ClassLoader;", "(Ljava/lang/ClassLoader;)V", "temporaryStrongRef", "classLoader", "<init>", "kotlin-reflection"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: qj7 */
/* compiled from: moduleByClassLoader.kt */
public final class qj7 {

    /* renamed from: a */
    public final WeakReference<ClassLoader> f44213a;

    /* renamed from: b */
    public final int f44214b;

    /* renamed from: c */
    public ClassLoader f44215c;

    public qj7(ClassLoader classLoader) {
        vx2.m53591g(classLoader, "classLoader");
        this.f44213a = new WeakReference<>(classLoader);
        this.f44214b = System.identityHashCode(classLoader);
        this.f44215c = classLoader;
    }

    /* renamed from: a */
    public final void mo65482a(ClassLoader classLoader) {
        this.f44215c = classLoader;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof qj7) || this.f44213a.get() != ((qj7) obj).f44213a.get()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f44214b;
    }

    public String toString() {
        String obj;
        ClassLoader classLoader = this.f44213a.get();
        if (classLoader == null || (obj = classLoader.toString()) == null) {
            return "<null>";
        }
        return obj;
    }
}
