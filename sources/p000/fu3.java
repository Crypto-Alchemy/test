package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* renamed from: fu3 */
/* compiled from: MenuWrapperICS */
public class fu3 extends C3702yy implements Menu {

    /* renamed from: d */
    public final xd6 f12067d;

    public fu3(Context context, xd6 xd6) {
        super(context);
        if (xd6 != null) {
            this.f12067d = xd6;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public MenuItem add(CharSequence charSequence) {
        return mo28269c(this.f12067d.add(charSequence));
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2;
        MenuItem[] menuItemArr3 = menuItemArr;
        if (menuItemArr3 != null) {
            menuItemArr2 = new MenuItem[menuItemArr3.length];
        } else {
            menuItemArr2 = null;
        }
        int addIntentOptions = this.f12067d.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr3[i5] = mo28269c(menuItemArr2[i5]);
            }
        }
        return addIntentOptions;
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return mo28270d(this.f12067d.addSubMenu(charSequence));
    }

    public void clear() {
        mo28271e();
        this.f12067d.clear();
    }

    public void close() {
        this.f12067d.close();
    }

    public MenuItem findItem(int i) {
        return mo28269c(this.f12067d.findItem(i));
    }

    public MenuItem getItem(int i) {
        return mo28269c(this.f12067d.getItem(i));
    }

    public boolean hasVisibleItems() {
        return this.f12067d.hasVisibleItems();
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f12067d.isShortcutKey(i, keyEvent);
    }

    public boolean performIdentifierAction(int i, int i2) {
        return this.f12067d.performIdentifierAction(i, i2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.f12067d.performShortcut(i, keyEvent, i2);
    }

    public void removeGroup(int i) {
        mo28272f(i);
        this.f12067d.removeGroup(i);
    }

    public void removeItem(int i) {
        mo28273g(i);
        this.f12067d.removeItem(i);
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        this.f12067d.setGroupCheckable(i, z, z2);
    }

    public void setGroupEnabled(int i, boolean z) {
        this.f12067d.setGroupEnabled(i, z);
    }

    public void setGroupVisible(int i, boolean z) {
        this.f12067d.setGroupVisible(i, z);
    }

    public void setQwertyMode(boolean z) {
        this.f12067d.setQwertyMode(z);
    }

    public int size() {
        return this.f12067d.size();
    }

    public MenuItem add(int i) {
        return mo28269c(this.f12067d.add(i));
    }

    public SubMenu addSubMenu(int i) {
        return mo28270d(this.f12067d.addSubMenu(i));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo28269c(this.f12067d.add(i, i2, i3, charSequence));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return mo28270d(this.f12067d.addSubMenu(i, i2, i3, charSequence));
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return mo28269c(this.f12067d.add(i, i2, i3, i4));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return mo28270d(this.f12067d.addSubMenu(i, i2, i3, i4));
    }
}
