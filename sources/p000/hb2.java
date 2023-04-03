package p000;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@SuppressLint({"UnknownNullness"})
/* renamed from: hb2 */
/* compiled from: FragmentTransitionImpl */
public abstract class hb2 {

    /* renamed from: hb2$a */
    /* compiled from: FragmentTransitionImpl */
    public class C2461a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ int f12802a;

        /* renamed from: d */
        public final /* synthetic */ ArrayList f12803d;

        /* renamed from: e */
        public final /* synthetic */ ArrayList f12804e;

        /* renamed from: g */
        public final /* synthetic */ ArrayList f12805g;

        /* renamed from: k */
        public final /* synthetic */ ArrayList f12806k;

        public C2461a(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f12802a = i;
            this.f12803d = arrayList;
            this.f12804e = arrayList2;
            this.f12805g = arrayList3;
            this.f12806k = arrayList4;
        }

        public void run() {
            for (int i = 0; i < this.f12802a; i++) {
                ga7.m17732J0((View) this.f12803d.get(i), (String) this.f12804e.get(i));
                ga7.m17732J0((View) this.f12805g.get(i), (String) this.f12806k.get(i));
            }
        }
    }

    /* renamed from: d */
    public static void m18741d(List<View> list, View view) {
        int size = list.size();
        if (!m18742g(list, view, size)) {
            if (ga7.m17733K(view) != null) {
                list.add(view);
            }
            for (int i = size; i < list.size(); i++) {
                View view2 = list.get(i);
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int childCount = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (!m18742g(list, childAt, size) && ga7.m17733K(childAt) != null) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: g */
    public static boolean m18742g(List<View> list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public static boolean m18743i(List list) {
        if (list == null || list.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public abstract void mo10579a(Object obj, View view);

    /* renamed from: b */
    public abstract void mo10580b(Object obj, ArrayList<View> arrayList);

    /* renamed from: c */
    public abstract void mo10581c(ViewGroup viewGroup, Object obj);

    /* renamed from: e */
    public abstract boolean mo10582e(Object obj);

    /* renamed from: f */
    public abstract Object mo10583f(Object obj);

    /* renamed from: h */
    public void mo21078h(View view, Rect rect) {
        if (ga7.m17746S(view)) {
            RectF rectF = new RectF();
            rectF.set(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (float) view.getWidth(), (float) view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset((float) view.getLeft(), (float) view.getTop());
            ViewParent parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
                view2.getMatrix().mapRect(rectF);
                rectF.offset((float) view2.getLeft(), (float) view2.getTop());
                parent = view2.getParent();
            }
            int[] iArr = new int[2];
            view.getRootView().getLocationOnScreen(iArr);
            rectF.offset((float) iArr[0], (float) iArr[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    /* renamed from: j */
    public abstract Object mo10584j(Object obj, Object obj2, Object obj3);

    /* renamed from: k */
    public abstract Object mo10585k(Object obj, Object obj2, Object obj3);

    /* renamed from: l */
    public ArrayList<String> mo21079l(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = arrayList.get(i);
            arrayList2.add(ga7.m17733K(view));
            ga7.m17732J0(view, (String) null);
        }
        return arrayList2;
    }

    /* renamed from: m */
    public abstract void mo10586m(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: n */
    public abstract void mo10587n(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    /* renamed from: o */
    public abstract void mo10588o(Object obj, Rect rect);

    /* renamed from: p */
    public abstract void mo10589p(Object obj, View view);

    /* renamed from: q */
    public void mo10590q(Fragment fragment, Object obj, sa0 sa0, Runnable runnable) {
        runnable.run();
    }

    /* renamed from: r */
    public void mo21080r(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view2 = arrayList.get(i);
            String K = ga7.m17733K(view2);
            arrayList4.add(K);
            if (K != null) {
                ga7.m17732J0(view2, (String) null);
                String str = map.get(K);
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    } else if (str.equals(arrayList3.get(i2))) {
                        ga7.m17732J0(arrayList2.get(i2), K);
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        xh4.m30102a(view, new C2461a(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    /* renamed from: s */
    public abstract void mo10591s(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: t */
    public abstract void mo10592t(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: u */
    public abstract Object mo10593u(Object obj);
}
