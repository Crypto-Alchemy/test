package p000;

import android.content.Context;
import android.view.SubMenu;
import androidx.appcompat.view.menu.C0173e;
import androidx.appcompat.view.menu.C0177g;

/* renamed from: w44 */
/* compiled from: NavigationMenu */
public class w44 extends C0173e {
    public w44(Context context) {
        super(context);
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0177g gVar = (C0177g) mo1399a(i, i2, i3, charSequence);
        z44 z44 = new z44(mo1454w(), this, gVar);
        gVar.mo1542x(z44);
        return z44;
    }
}
