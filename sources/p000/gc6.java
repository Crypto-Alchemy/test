package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: gc6 */
/* compiled from: SubMenuWrapperICS */
public class gc6 extends fu3 implements SubMenu {

    /* renamed from: e */
    public final ke6 f12279e;

    public gc6(Context context, ke6 ke6) {
        super(context, ke6);
        this.f12279e = ke6;
    }

    public void clearHeader() {
        this.f12279e.clearHeader();
    }

    public MenuItem getItem() {
        return mo28269c(this.f12279e.getItem());
    }

    public SubMenu setHeaderIcon(int i) {
        this.f12279e.setHeaderIcon(i);
        return this;
    }

    public SubMenu setHeaderTitle(int i) {
        this.f12279e.setHeaderTitle(i);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        this.f12279e.setHeaderView(view);
        return this;
    }

    public SubMenu setIcon(int i) {
        this.f12279e.setIcon(i);
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        this.f12279e.setHeaderIcon(drawable);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f12279e.setHeaderTitle(charSequence);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        this.f12279e.setIcon(drawable);
        return this;
    }
}
