package p000;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.C0177g;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: yd6 */
/* compiled from: SupportMenuInflater */
public class yd6 extends MenuInflater {

    /* renamed from: e */
    public static final Class<?>[] f20145e;

    /* renamed from: f */
    public static final Class<?>[] f20146f;

    /* renamed from: a */
    public final Object[] f20147a;

    /* renamed from: b */
    public final Object[] f20148b;

    /* renamed from: c */
    public Context f20149c;

    /* renamed from: d */
    public Object f20150d;

    /* renamed from: yd6$a */
    /* compiled from: SupportMenuInflater */
    public static class C3670a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c */
        public static final Class<?>[] f20151c = {MenuItem.class};

        /* renamed from: a */
        public Object f20152a;

        /* renamed from: b */
        public Method f20153b;

        public C3670a(Object obj, String str) {
            this.f20152a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f20153b = cls.getMethod(str, f20151c);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f20153b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f20153b.invoke(this.f20152a, new Object[]{menuItem})).booleanValue();
                }
                this.f20153b.invoke(this.f20152a, new Object[]{menuItem});
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: yd6$b */
    /* compiled from: SupportMenuInflater */
    public class C3671b {

        /* renamed from: A */
        public C2532i9 f20154A;

        /* renamed from: B */
        public CharSequence f20155B;

        /* renamed from: C */
        public CharSequence f20156C;

        /* renamed from: D */
        public ColorStateList f20157D = null;

        /* renamed from: E */
        public PorterDuff.Mode f20158E = null;

        /* renamed from: a */
        public Menu f20160a;

        /* renamed from: b */
        public int f20161b;

        /* renamed from: c */
        public int f20162c;

        /* renamed from: d */
        public int f20163d;

        /* renamed from: e */
        public int f20164e;

        /* renamed from: f */
        public boolean f20165f;

        /* renamed from: g */
        public boolean f20166g;

        /* renamed from: h */
        public boolean f20167h;

        /* renamed from: i */
        public int f20168i;

        /* renamed from: j */
        public int f20169j;

        /* renamed from: k */
        public CharSequence f20170k;

        /* renamed from: l */
        public CharSequence f20171l;

        /* renamed from: m */
        public int f20172m;

        /* renamed from: n */
        public char f20173n;

        /* renamed from: o */
        public int f20174o;

        /* renamed from: p */
        public char f20175p;

        /* renamed from: q */
        public int f20176q;

        /* renamed from: r */
        public int f20177r;

        /* renamed from: s */
        public boolean f20178s;

        /* renamed from: t */
        public boolean f20179t;

        /* renamed from: u */
        public boolean f20180u;

        /* renamed from: v */
        public int f20181v;

        /* renamed from: w */
        public int f20182w;

        /* renamed from: x */
        public String f20183x;

        /* renamed from: y */
        public String f20184y;

        /* renamed from: z */
        public String f20185z;

        public C3671b(Menu menu) {
            this.f20160a = menu;
            mo28043h();
        }

        /* renamed from: a */
        public void mo28036a() {
            this.f20167h = true;
            mo28044i(this.f20160a.add(this.f20161b, this.f20168i, this.f20169j, this.f20170k));
        }

        /* renamed from: b */
        public SubMenu mo28037b() {
            this.f20167h = true;
            SubMenu addSubMenu = this.f20160a.addSubMenu(this.f20161b, this.f20168i, this.f20169j, this.f20170k);
            mo28044i(addSubMenu.getItem());
            return addSubMenu;
        }

        /* renamed from: c */
        public final char mo28038c(String str) {
            if (str == null) {
                return 0;
            }
            return str.charAt(0);
        }

        /* renamed from: d */
        public boolean mo28039d() {
            return this.f20167h;
        }

        /* renamed from: e */
        public final <T> T mo28040e(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, yd6.this.f20149c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("Cannot instantiate class: ");
                sb.append(str);
                return null;
            }
        }

        /* renamed from: f */
        public void mo28041f(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = yd6.this.f20149c.obtainStyledAttributes(attributeSet, j65.MenuGroup);
            this.f20161b = obtainStyledAttributes.getResourceId(j65.MenuGroup_android_id, 0);
            this.f20162c = obtainStyledAttributes.getInt(j65.MenuGroup_android_menuCategory, 0);
            this.f20163d = obtainStyledAttributes.getInt(j65.MenuGroup_android_orderInCategory, 0);
            this.f20164e = obtainStyledAttributes.getInt(j65.MenuGroup_android_checkableBehavior, 0);
            this.f20165f = obtainStyledAttributes.getBoolean(j65.MenuGroup_android_visible, true);
            this.f20166g = obtainStyledAttributes.getBoolean(j65.MenuGroup_android_enabled, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: g */
        public void mo28042g(AttributeSet attributeSet) {
            boolean z;
            yq6 u = yq6.m30732u(yd6.this.f20149c, attributeSet, j65.MenuItem);
            this.f20168i = u.mo28188n(j65.MenuItem_android_id, 0);
            this.f20169j = (u.mo28185k(j65.MenuItem_android_menuCategory, this.f20162c) & -65536) | (u.mo28185k(j65.MenuItem_android_orderInCategory, this.f20163d) & 65535);
            this.f20170k = u.mo28190p(j65.MenuItem_android_title);
            this.f20171l = u.mo28190p(j65.MenuItem_android_titleCondensed);
            this.f20172m = u.mo28188n(j65.MenuItem_android_icon, 0);
            this.f20173n = mo28038c(u.mo28189o(j65.MenuItem_android_alphabeticShortcut));
            this.f20174o = u.mo28185k(j65.MenuItem_alphabeticModifiers, 4096);
            this.f20175p = mo28038c(u.mo28189o(j65.MenuItem_android_numericShortcut));
            this.f20176q = u.mo28185k(j65.MenuItem_numericModifiers, 4096);
            int i = j65.MenuItem_android_checkable;
            if (u.mo28193s(i)) {
                this.f20177r = u.mo28175a(i, false) ? 1 : 0;
            } else {
                this.f20177r = this.f20164e;
            }
            this.f20178s = u.mo28175a(j65.MenuItem_android_checked, false);
            this.f20179t = u.mo28175a(j65.MenuItem_android_visible, this.f20165f);
            this.f20180u = u.mo28175a(j65.MenuItem_android_enabled, this.f20166g);
            this.f20181v = u.mo28185k(j65.MenuItem_showAsAction, -1);
            this.f20185z = u.mo28189o(j65.MenuItem_android_onClick);
            this.f20182w = u.mo28188n(j65.MenuItem_actionLayout, 0);
            this.f20183x = u.mo28189o(j65.MenuItem_actionViewClass);
            String o = u.mo28189o(j65.MenuItem_actionProviderClass);
            this.f20184y = o;
            if (o != null) {
                z = true;
            } else {
                z = false;
            }
            if (z && this.f20182w == 0 && this.f20183x == null) {
                this.f20154A = (C2532i9) mo28040e(o, yd6.f20146f, yd6.this.f20148b);
            } else {
                this.f20154A = null;
            }
            this.f20155B = u.mo28190p(j65.MenuItem_contentDescription);
            this.f20156C = u.mo28190p(j65.MenuItem_tooltipText);
            int i2 = j65.MenuItem_iconTintMode;
            if (u.mo28193s(i2)) {
                this.f20158E = sj1.m26923e(u.mo28185k(i2, -1), this.f20158E);
            } else {
                this.f20158E = null;
            }
            int i3 = j65.MenuItem_iconTint;
            if (u.mo28193s(i3)) {
                this.f20157D = u.mo28177c(i3);
            } else {
                this.f20157D = null;
            }
            u.mo28194w();
            this.f20167h = false;
        }

        /* renamed from: h */
        public void mo28043h() {
            this.f20161b = 0;
            this.f20162c = 0;
            this.f20163d = 0;
            this.f20164e = 0;
            this.f20165f = true;
            this.f20166g = true;
        }

        /* renamed from: i */
        public final void mo28044i(MenuItem menuItem) {
            boolean z;
            MenuItem enabled = menuItem.setChecked(this.f20178s).setVisible(this.f20179t).setEnabled(this.f20180u);
            boolean z2 = false;
            if (this.f20177r >= 1) {
                z = true;
            } else {
                z = false;
            }
            enabled.setCheckable(z).setTitleCondensed(this.f20171l).setIcon(this.f20172m);
            int i = this.f20181v;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            if (this.f20185z != null) {
                if (!yd6.this.f20149c.isRestricted()) {
                    menuItem.setOnMenuItemClickListener(new C3670a(yd6.this.mo28032b(), this.f20185z));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (this.f20177r >= 2) {
                if (menuItem instanceof C0177g) {
                    ((C0177g) menuItem).mo1537t(true);
                } else if (menuItem instanceof bu3) {
                    ((bu3) menuItem).mo11838h(true);
                }
            }
            String str = this.f20183x;
            if (str != null) {
                menuItem.setActionView((View) mo28040e(str, yd6.f20145e, yd6.this.f20147a));
                z2 = true;
            }
            int i2 = this.f20182w;
            if (i2 > 0 && !z2) {
                menuItem.setActionView(i2);
            }
            C2532i9 i9Var = this.f20154A;
            if (i9Var != null) {
                zt3.m31477a(menuItem, i9Var);
            }
            zt3.m31479c(menuItem, this.f20155B);
            zt3.m31483g(menuItem, this.f20156C);
            zt3.m31478b(menuItem, this.f20173n, this.f20174o);
            zt3.m31482f(menuItem, this.f20175p, this.f20176q);
            PorterDuff.Mode mode = this.f20158E;
            if (mode != null) {
                zt3.m31481e(menuItem, mode);
            }
            ColorStateList colorStateList = this.f20157D;
            if (colorStateList != null) {
                zt3.m31480d(menuItem, colorStateList);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 1
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            f20145e = r0
            f20146f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.yd6.<clinit>():void");
    }

    public yd6(Context context) {
        super(context);
        this.f20149c = context;
        Object[] objArr = {context};
        this.f20147a = objArr;
        this.f20148b = objArr;
    }

    /* renamed from: a */
    public final Object mo28031a(Object obj) {
        if (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) {
            return mo28031a(((ContextWrapper) obj).getBaseContext());
        }
        return obj;
    }

    /* renamed from: b */
    public Object mo28032b() {
        if (this.f20150d == null) {
            this.f20150d = mo28031a(this.f20149c);
        }
        return this.f20150d;
    }

    /* renamed from: c */
    public final void mo28033c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        C3671b bVar = new C3671b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType != 2) {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            } else {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got " + name);
                }
            }
        }
        String str = null;
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            if (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3) {
                        String name2 = xmlPullParser.getName();
                        if (z2 && name2.equals(str)) {
                            str = null;
                            z2 = false;
                        } else if (name2.equals("group")) {
                            bVar.mo28043h();
                        } else if (name2.equals("item")) {
                            if (!bVar.mo28039d()) {
                                C2532i9 i9Var = bVar.f20154A;
                                if (i9Var == null || !i9Var.mo11872a()) {
                                    bVar.mo28036a();
                                } else {
                                    bVar.mo28037b();
                                }
                            }
                        } else if (name2.equals("menu")) {
                            z = true;
                        }
                    }
                } else if (!z2) {
                    String name3 = xmlPullParser.getName();
                    if (name3.equals("group")) {
                        bVar.mo28041f(attributeSet);
                    } else if (name3.equals("item")) {
                        bVar.mo28042g(attributeSet);
                    } else if (name3.equals("menu")) {
                        mo28033c(xmlPullParser, attributeSet, bVar.mo28037b());
                    } else {
                        str = name3;
                        z2 = true;
                    }
                }
                eventType = xmlPullParser.next();
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    public void inflate(int i, Menu menu) {
        if (!(menu instanceof xd6)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = this.f20149c.getResources().getLayout(i);
            mo28033c(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        } catch (XmlPullParserException e) {
            throw new InflateException("Error inflating menu XML", e);
        } catch (IOException e2) {
            throw new InflateException("Error inflating menu XML", e2);
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
