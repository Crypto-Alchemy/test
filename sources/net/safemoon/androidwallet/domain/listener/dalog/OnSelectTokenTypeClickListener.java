package net.safemoon.androidwallet.domain.listener.dalog;

import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import android.widget.ListPopupWindow;
import com.google.android.material.button.MaterialButton;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Metadata;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.common.TokenType;
import p000.ft4;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00070\u0017¢\u0006\u0004\b#\u0010$J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0006\u0010\u0006\u001a\u00020\u0004J\b\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00070\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0019R\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006%"}, mo44877d2 = {"Lnet/safemoon/androidwallet/domain/listener/dalog/OnSelectTokenTypeClickListener;", "Landroid/view/View$OnClickListener;", "Landroid/view/View;", "v", "Lr37;", "onClick", "b", "Lnet/safemoon/androidwallet/common/TokenType;", "c", "Lcom/google/android/material/button/MaterialButton;", "btn", "d", "", "drawableId", "e", "Lft4$a;", "a", "Lft4$a;", "onTokenTypeSelectedListener", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "Ljava/lang/ref/WeakReference;", "activity", "", "", "Ljava/util/Map;", "items", "Landroid/content/res/Resources;", "g", "Landroid/content/res/Resources;", "resources", "Landroid/widget/ListPopupWindow;", "k", "Landroid/widget/ListPopupWindow;", "selectTokenTypeDialog", "<init>", "(Lft4$a;Ljava/lang/ref/WeakReference;Ljava/util/Map;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: OnSelectTokenTypeClickListener.kt */
public abstract class OnSelectTokenTypeClickListener implements View.OnClickListener {

    /* renamed from: a */
    public final ft4.C7102a f41845a;

    /* renamed from: d */
    public final WeakReference<Activity> f41846d;

    /* renamed from: e */
    public final Map<String, TokenType> f41847e;

    /* renamed from: g */
    public final Resources f41848g;

    /* renamed from: k */
    public ListPopupWindow f41849k;

    public OnSelectTokenTypeClickListener(ft4.C7102a aVar, WeakReference<Activity> weakReference, Map<String, ? extends TokenType> map) {
        Resources resources;
        vx2.m53591g(aVar, "onTokenTypeSelectedListener");
        vx2.m53591g(weakReference, "activity");
        vx2.m53591g(map, "items");
        this.f41845a = aVar;
        this.f41846d = weakReference;
        this.f41847e = map;
        Activity activity = weakReference.get();
        if (activity != null) {
            resources = activity.getResources();
        } else {
            resources = null;
        }
        this.f41848g = resources;
    }

    /* renamed from: b */
    public final void mo57365b() {
        ListPopupWindow listPopupWindow = this.f41849k;
        if (listPopupWindow != null) {
            listPopupWindow.dismiss();
        }
    }

    /* renamed from: c */
    public abstract TokenType mo57366c();

    /* renamed from: d */
    public final void mo57367d(MaterialButton materialButton) {
        int i;
        ListPopupWindow listPopupWindow = this.f41849k;
        if (listPopupWindow != null) {
            vx2.m53588d(listPopupWindow);
            if (listPopupWindow.isShowing()) {
                ListPopupWindow listPopupWindow2 = this.f41849k;
                if (listPopupWindow2 != null) {
                    listPopupWindow2.dismiss();
                }
                this.f41849k = null;
                return;
            }
        }
        mo57368e(materialButton, R.drawable.ic_baseline_keyboard_arrow_up_24);
        ListPopupWindow c = ft4.f37911a.mo51797c(this.f41846d, materialButton, this.f41847e, mo57366c(), this.f41845a, new OnSelectTokenTypeClickListener$handleClick$1(this, materialButton));
        this.f41849k = c;
        if (c != null) {
            c.setVerticalOffset(materialButton.getHeight() * -1);
        }
        int[] iArr = new int[2];
        materialButton.getLocationOnScreen(iArr);
        ListPopupWindow listPopupWindow3 = this.f41849k;
        if (listPopupWindow3 != null) {
            Activity activity = this.f41846d.get();
            if (activity != null) {
                i = ol0.m70321A(activity);
            } else {
                i = 0;
            }
            ListPopupWindow listPopupWindow4 = this.f41849k;
            vx2.m53588d(listPopupWindow4);
            listPopupWindow3.setHorizontalOffset(((i - listPopupWindow4.getWidth()) / 2) - iArr[0]);
        }
        ListPopupWindow listPopupWindow5 = this.f41849k;
        if (listPopupWindow5 != null) {
            listPopupWindow5.show();
        }
    }

    /* renamed from: e */
    public final void mo57368e(MaterialButton materialButton, int i) {
        Resources resources = this.f41848g;
        vx2.m53588d(resources);
        materialButton.setIcon(uf5.m28223f(resources, i, (Resources.Theme) null));
    }

    public void onClick(View view) {
        if (view instanceof MaterialButton) {
            mo57367d((MaterialButton) view);
            return;
        }
        throw new IllegalArgumentException("Only MaterialButton view is supported");
    }
}
