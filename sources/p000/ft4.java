package p000;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListPopupWindow;
import java.lang.ref.WeakReference;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C6177b;
import kotlin.collections.CollectionsKt___CollectionsKt;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.common.TokenType;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0015\u0016B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014JR\u0010\u0012\u001a\u0004\u0018\u00010\u00112\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0007¨\u0006\u0017"}, mo44877d2 = {"Lft4;", "", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "activityReference", "Landroid/view/View;", "anchorView", "", "", "Lnet/safemoon/androidwallet/common/TokenType;", "_items", "itemSelect", "Lft4$a;", "listener", "Lkotlin/Function0;", "Lr37;", "onClosedListener", "Landroid/widget/ListPopupWindow;", "c", "<init>", "()V", "a", "b", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: ft4 */
/* compiled from: PopListTokenType.kt */
public final class ft4 {

    /* renamed from: a */
    public static final ft4 f37911a = new ft4();

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, mo44877d2 = {"Lft4$a;", "", "Lnet/safemoon/androidwallet/common/TokenType;", "token", "Lr37;", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: ft4$a */
    /* compiled from: PopListTokenType.kt */
    public interface C7102a {
        /* renamed from: a */
        void mo51798a(TokenType tokenType);
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B;\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\n\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0010\u0014\u001a\u00028\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\"\u0010\t\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u0014\u0010\u0014\u001a\u00028\u00008\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u001a"}, mo44877d2 = {"Lft4$b;", "T", "Landroid/widget/ArrayAdapter;", "", "position", "Landroid/view/View;", "convertView", "Landroid/view/ViewGroup;", "parent", "getView", "", "a", "Ljava/util/List;", "getList", "()Ljava/util/List;", "list", "d", "listOfToken", "e", "Ljava/lang/Object;", "itemSelect", "Landroid/content/Context;", "context", "resource", "<init>", "(Landroid/content/Context;ILjava/util/List;Ljava/util/List;Ljava/lang/Object;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: ft4$b */
    /* compiled from: PopListTokenType.kt */
    public static final class C7103b<T> extends ArrayAdapter<T> {

        /* renamed from: a */
        public final List<T> f37912a;

        /* renamed from: d */
        public final List<T> f37913d;

        /* renamed from: e */
        public final T f37914e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7103b(Context context, int i, List<? extends T> list, List<? extends T> list2, T t) {
            super(context, i, R.id.text, list);
            vx2.m53591g(context, "context");
            vx2.m53591g(list, "list");
            vx2.m53591g(list2, "listOfToken");
            this.f37912a = list;
            this.f37913d = list2;
            this.f37914e = t;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            vx2.m53591g(viewGroup, "parent");
            View view2 = super.getView(i, view, viewGroup);
            vx2.m53590f(view2, "super.getView(position, convertView, parent)");
            ImageView imageView = (ImageView) view2.findViewById(R.id.dropDownIcon);
            ImageView imageView2 = (ImageView) view2.findViewById(R.id.iconChainImage);
            int i2 = 0;
            if (i == 0) {
                view2.setBackgroundResource(R.drawable.pop_menu_top_corner);
            } else if (i == this.f37912a.size() - 1) {
                view2.setBackgroundResource(R.drawable.pop_menu_bottom_corner);
            } else {
                view2.setBackgroundResource(0);
            }
            if (i == 0) {
                i2 = R.drawable.ic_baseline_keyboard_arrow_up_24;
            }
            imageView.setImageResource(i2);
            if (this.f37913d.get(i) instanceof TokenType) {
                T t = this.f37913d.get(i);
                vx2.m53589e(t, "null cannot be cast to non-null type net.safemoon.androidwallet.common.TokenType");
                imageView2.setImageResource(((TokenType) t).getIcon());
            }
            Drawable background = view2.getBackground();
            if (background != null) {
                vx2.m53590f(background, "background");
                Drawable r = ij1.m19659r(view2.getBackground());
                vx2.m53590f(r, "wrap(background)");
                if (vx2.m53586b(this.f37914e, this.f37913d.get(i))) {
                    ij1.m19655n(r, zr0.m31440c(view2.getContext(), R.color.dropdown_selected_color));
                } else {
                    ij1.m19655n(r, zr0.m31440c(view2.getContext(), R.color.dropdown_item_color));
                }
            }
            return view2;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo44877d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    /* renamed from: ft4$c */
    /* compiled from: Comparisons.kt */
    public static final class C7104c<T> implements Comparator {

        /* renamed from: a */
        public final /* synthetic */ TokenType f37915a;

        public C7104c(TokenType tokenType) {
            this.f37915a = tokenType;
        }

        public final int compare(T t, T t2) {
            boolean z;
            boolean z2 = true;
            if (((Pair) t2).getSecond() == this.f37915a) {
                z = true;
            } else {
                z = false;
            }
            Boolean valueOf = Boolean.valueOf(z);
            if (((Pair) t).getSecond() != this.f37915a) {
                z2 = false;
            }
            return xl0.m54426a(valueOf, Boolean.valueOf(z2));
        }
    }

    /* renamed from: d */
    public static final void m57927d(C7102a aVar, Map map, List list, ListPopupWindow listPopupWindow, AdapterView adapterView, View view, int i, long j) {
        vx2.m53591g(aVar, "$listener");
        vx2.m53591g(map, "$items");
        vx2.m53591g(list, "$displayNameList");
        vx2.m53591g(listPopupWindow, "$listPopupWindow");
        Object obj = map.get(list.get(i));
        vx2.m53588d(obj);
        aVar.mo51798a((TokenType) obj);
        listPopupWindow.dismiss();
    }

    /* renamed from: e */
    public static final void m57928e(pc2 pc2) {
        vx2.m53591g(pc2, "$onClosedListener");
        pc2.invoke();
    }

    /* renamed from: c */
    public final ListPopupWindow mo51797c(WeakReference<Activity> weakReference, View view, Map<String, ? extends TokenType> map, TokenType tokenType, C7102a aVar, pc2<r37> pc2) {
        vx2.m53591g(weakReference, "activityReference");
        vx2.m53591g(view, "anchorView");
        vx2.m53591g(map, "_items");
        vx2.m53591g(tokenType, "itemSelect");
        vx2.m53591g(aVar, "listener");
        vx2.m53591g(pc2, "onClosedListener");
        Activity activity = weakReference.get();
        if (activity == null) {
            return null;
        }
        ListPopupWindow listPopupWindow = new ListPopupWindow(activity, (AttributeSet) null, R.attr.listPopupWindowStyle);
        listPopupWindow.setContentWidth(activity.getResources().getDimensionPixelSize(R.dimen._150sdp));
        listPopupWindow.setAnchorView(view);
        Map<K, V> q = C6177b.m47369q(CollectionsKt___CollectionsKt.m47304D0(co3.m33134w(map), new C7104c(tokenType)));
        List<T> K0 = CollectionsKt___CollectionsKt.m47311K0(q.keySet());
        listPopupWindow.setAdapter(new C7103b(activity, R.layout.list_popup_token_window_item, K0, CollectionsKt___CollectionsKt.m47311K0(q.values()), tokenType));
        listPopupWindow.setBackgroundDrawable(uf5.m28223f(activity.getResources(), R.drawable.pop_menu_corner, (Resources.Theme) null));
        listPopupWindow.setOnItemClickListener(new dt4(aVar, q, K0, listPopupWindow));
        listPopupWindow.setOnDismissListener(new et4(pc2));
        return listPopupWindow;
    }
}
