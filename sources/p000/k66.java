package p000;

import java.util.Iterator;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002\u001a\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0004"}, mo44877d2 = {"T", "Lj66;", "", "a", "collection-ktx"}, mo44878k = 2, mo44879mv = {1, 4, 0})
/* renamed from: k66 */
/* compiled from: SparseArray.kt */
public final class k66 {

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0019\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00018\u00008\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000f"}, mo44877d2 = {"k66$a", "", "", "hasNext", "kotlin.jvm.PlatformType", "next", "()Ljava/lang/Object;", "", "a", "I", "getIndex", "()I", "setIndex", "(I)V", "index", "collection-ktx"}, mo44878k = 1, mo44879mv = {1, 4, 0})
    /* renamed from: k66$a */
    /* compiled from: SparseArray.kt */
    public static final class C2645a implements Iterator<T>, a93 {

        /* renamed from: a */
        public int f13985a;

        /* renamed from: d */
        public final /* synthetic */ j66 f13986d;

        public C2645a(j66<T> j66) {
            this.f13986d = j66;
        }

        public boolean hasNext() {
            if (this.f13985a < this.f13986d.mo21766v()) {
                return true;
            }
            return false;
        }

        public T next() {
            j66 j66 = this.f13986d;
            int i = this.f13985a;
            this.f13985a = i + 1;
            return j66.mo21767w(i);
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: a */
    public static final <T> Iterator<T> m20549a(j66<T> j66) {
        vx2.m53592h(j66, "receiver$0");
        return new C2645a(j66);
    }
}
