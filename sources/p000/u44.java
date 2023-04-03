package p000;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.appcompat.view.menu.C0173e;
import androidx.appcompat.view.menu.C0177g;

/* renamed from: u44 */
/* compiled from: NavigationBarMenu */
public final class u44 extends C0173e {

    /* renamed from: B */
    public final Class<?> f34456B;

    /* renamed from: C */
    public final int f34457C;

    public u44(Context context, Class<?> cls, int i) {
        super(context);
        this.f34456B = cls;
        this.f34457C = i;
    }

    /* renamed from: a */
    public MenuItem mo1399a(int i, int i2, int i3, CharSequence charSequence) {
        if (size() + 1 <= this.f34457C) {
            mo1428h0();
            MenuItem a = super.mo1399a(i, i2, i3, charSequence);
            if (a instanceof C0177g) {
                ((C0177g) a).mo1537t(true);
            }
            mo1425g0();
            return a;
        }
        String simpleName = this.f34456B.getSimpleName();
        throw new IllegalArgumentException("Maximum number of items supported by " + simpleName + " is " + this.f34457C + ". Limit can be checked with " + simpleName + "#getMaxItemCount()");
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        throw new UnsupportedOperationException(this.f34456B.getSimpleName() + " does not support submenus");
    }
}
