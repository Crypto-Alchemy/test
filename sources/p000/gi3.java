package p000;

import android.widget.ListView;

/* renamed from: gi3 */
/* compiled from: ListViewCompat */
public final class gi3 {

    /* renamed from: gi3$a */
    /* compiled from: ListViewCompat */
    public static class C2386a {
        /* renamed from: a */
        public static boolean m18072a(ListView listView, int i) {
            return listView.canScrollList(i);
        }

        /* renamed from: b */
        public static void m18073b(ListView listView, int i) {
            listView.scrollListBy(i);
        }
    }

    /* renamed from: a */
    public static boolean m18070a(ListView listView, int i) {
        return C2386a.m18072a(listView, i);
    }

    /* renamed from: b */
    public static void m18071b(ListView listView, int i) {
        C2386a.m18073b(listView, i);
    }
}
