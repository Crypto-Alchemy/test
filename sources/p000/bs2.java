package p000;

import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004R<\u0010\f\u001a*\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007j\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b`\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000b¨\u0006\u000f"}, mo44877d2 = {"Lbs2;", "", "", "configChanges", "Lr37;", "b", "a", "Ljava/util/HashMap;", "Ljava/lang/ref/WeakReference;", "Lbs2$a;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "map", "<init>", "()V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: bs2 */
/* compiled from: VectorResources.android.kt */
public final class bs2 {

    /* renamed from: a */
    public final HashMap<Object, WeakReference<C1647a>> f8232a = new HashMap<>();

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b¨\u0006\r"}, mo44877d2 = {"Lbs2$a;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "I", "()I", "configFlags", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: bs2$a */
    /* compiled from: VectorResources.android.kt */
    public static final class C1647a {

        /* renamed from: a */
        public final int f8233a;

        /* renamed from: a */
        public final int mo11792a() {
            return this.f8233a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1647a)) {
                return false;
            }
            C1647a aVar = (C1647a) obj;
            aVar.getClass();
            return vx2.m53586b((Object) null, (Object) null) && this.f8233a == aVar.f8233a;
        }

        public int hashCode() {
            throw null;
        }

        public String toString() {
            return "ImageVectorEntry(imageVector=" + null + ", configFlags=" + this.f8233a + ')';
        }
    }

    /* renamed from: a */
    public final void mo11790a() {
        this.f8232a.clear();
    }

    /* renamed from: b */
    public final void mo11791b(int i) {
        Iterator<Map.Entry<Object, WeakReference<C1647a>>> it = this.f8232a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Object, WeakReference<C1647a>> next = it.next();
            vx2.m53590f(next, "it.next()");
            C1647a aVar = (C1647a) ((WeakReference) next.getValue()).get();
            if (aVar == null || Configuration.needNewResources(i, aVar.mo11792a())) {
                it.remove();
            }
        }
    }
}
