package p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.view.MenuItem;

/* renamed from: zt3 */
/* compiled from: MenuItemCompat */
public final class zt3 {

    /* renamed from: zt3$a */
    /* compiled from: MenuItemCompat */
    public static class C3760a {
        /* renamed from: a */
        public static int m31484a(MenuItem menuItem) {
            return menuItem.getAlphabeticModifiers();
        }

        /* renamed from: b */
        public static CharSequence m31485b(MenuItem menuItem) {
            return menuItem.getContentDescription();
        }

        /* renamed from: c */
        public static ColorStateList m31486c(MenuItem menuItem) {
            return menuItem.getIconTintList();
        }

        /* renamed from: d */
        public static PorterDuff.Mode m31487d(MenuItem menuItem) {
            return menuItem.getIconTintMode();
        }

        /* renamed from: e */
        public static int m31488e(MenuItem menuItem) {
            return menuItem.getNumericModifiers();
        }

        /* renamed from: f */
        public static CharSequence m31489f(MenuItem menuItem) {
            return menuItem.getTooltipText();
        }

        /* renamed from: g */
        public static MenuItem m31490g(MenuItem menuItem, char c, int i) {
            return menuItem.setAlphabeticShortcut(c, i);
        }

        /* renamed from: h */
        public static MenuItem m31491h(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setContentDescription(charSequence);
        }

        /* renamed from: i */
        public static MenuItem m31492i(MenuItem menuItem, ColorStateList colorStateList) {
            return menuItem.setIconTintList(colorStateList);
        }

        /* renamed from: j */
        public static MenuItem m31493j(MenuItem menuItem, PorterDuff.Mode mode) {
            return menuItem.setIconTintMode(mode);
        }

        /* renamed from: k */
        public static MenuItem m31494k(MenuItem menuItem, char c, int i) {
            return menuItem.setNumericShortcut(c, i);
        }

        /* renamed from: l */
        public static MenuItem m31495l(MenuItem menuItem, char c, char c2, int i, int i2) {
            return menuItem.setShortcut(c, c2, i, i2);
        }

        /* renamed from: m */
        public static MenuItem m31496m(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setTooltipText(charSequence);
        }
    }

    /* renamed from: a */
    public static MenuItem m31477a(MenuItem menuItem, C2532i9 i9Var) {
        if (menuItem instanceof zd6) {
            return ((zd6) menuItem).mo1465a(i9Var);
        }
        return menuItem;
    }

    /* renamed from: b */
    public static void m31478b(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof zd6) {
            ((zd6) menuItem).setAlphabeticShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C3760a.m31490g(menuItem, c, i);
        }
    }

    /* renamed from: c */
    public static void m31479c(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof zd6) {
            ((zd6) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C3760a.m31491h(menuItem, charSequence);
        }
    }

    /* renamed from: d */
    public static void m31480d(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof zd6) {
            ((zd6) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C3760a.m31492i(menuItem, colorStateList);
        }
    }

    /* renamed from: e */
    public static void m31481e(MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof zd6) {
            ((zd6) menuItem).setIconTintMode(mode);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C3760a.m31493j(menuItem, mode);
        }
    }

    /* renamed from: f */
    public static void m31482f(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof zd6) {
            ((zd6) menuItem).setNumericShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C3760a.m31494k(menuItem, c, i);
        }
    }

    /* renamed from: g */
    public static void m31483g(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof zd6) {
            ((zd6) menuItem).setTooltipText(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C3760a.m31496m(menuItem, charSequence);
        }
    }
}
