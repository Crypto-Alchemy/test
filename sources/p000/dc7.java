package p000;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0002\"\u001b\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, mo44877d2 = {"Landroid/view/ViewGroup;", "", "Landroid/view/View;", "b", "Lhw5;", "a", "(Landroid/view/ViewGroup;)Lhw5;", "children", "core-ktx_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: dc7 */
/* compiled from: ViewGroup.kt */
public final class dc7 {

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0002¨\u0006\u0005"}, mo44877d2 = {"dc7$a", "Lhw5;", "Landroid/view/View;", "", "iterator", "core-ktx_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: dc7$a */
    /* compiled from: ViewGroup.kt */
    public static final class C2146a implements hw5<View> {

        /* renamed from: a */
        public final /* synthetic */ ViewGroup f10626a;

        public C2146a(ViewGroup viewGroup) {
            this.f10626a = viewGroup;
        }

        public Iterator<View> iterator() {
            return dc7.m14988b(this.f10626a);
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000#\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0004\u001a\u00020\u0003H\u0002J\t\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0016\u0010\n\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\t¨\u0006\u000b"}, mo44877d2 = {"dc7$b", "", "Landroid/view/View;", "", "hasNext", "a", "Lr37;", "remove", "", "I", "index", "core-ktx_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: dc7$b */
    /* compiled from: ViewGroup.kt */
    public static final class C2147b implements Iterator<View>, a93 {

        /* renamed from: a */
        public int f10627a;

        /* renamed from: d */
        public final /* synthetic */ ViewGroup f10628d;

        public C2147b(ViewGroup viewGroup) {
            this.f10628d = viewGroup;
        }

        /* renamed from: a */
        public View next() {
            ViewGroup viewGroup = this.f10628d;
            int i = this.f10627a;
            this.f10627a = i + 1;
            View childAt = viewGroup.getChildAt(i);
            if (childAt != null) {
                return childAt;
            }
            throw new IndexOutOfBoundsException();
        }

        public boolean hasNext() {
            if (this.f10627a < this.f10628d.getChildCount()) {
                return true;
            }
            return false;
        }

        public void remove() {
            ViewGroup viewGroup = this.f10628d;
            int i = this.f10627a - 1;
            this.f10627a = i;
            viewGroup.removeViewAt(i);
        }
    }

    /* renamed from: a */
    public static final hw5<View> m14987a(ViewGroup viewGroup) {
        vx2.m53591g(viewGroup, "<this>");
        return new C2146a(viewGroup);
    }

    /* renamed from: b */
    public static final Iterator<View> m14988b(ViewGroup viewGroup) {
        vx2.m53591g(viewGroup, "<this>");
        return new C2147b(viewGroup);
    }
}
