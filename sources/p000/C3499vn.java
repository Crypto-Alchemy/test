package p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.View;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.AppCompatToggleButton;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: vn */
/* compiled from: AppCompatViewInflater */
public class C3499vn {

    /* renamed from: b */
    public static final Class<?>[] f18844b = {Context.class, AttributeSet.class};

    /* renamed from: c */
    public static final int[] f18845c = {16843375};

    /* renamed from: d */
    public static final int[] f18846d = {16844160};

    /* renamed from: e */
    public static final int[] f18847e = {16844156};

    /* renamed from: f */
    public static final int[] f18848f = {16844148};

    /* renamed from: g */
    public static final String[] f18849g = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: h */
    public static final y16<String, Constructor<? extends View>> f18850h = new y16<>();

    /* renamed from: a */
    public final Object[] f18851a = new Object[2];

    /* renamed from: vn$a */
    /* compiled from: AppCompatViewInflater */
    public static class C3500a implements View.OnClickListener {

        /* renamed from: a */
        public final View f18852a;

        /* renamed from: d */
        public final String f18853d;

        /* renamed from: e */
        public Method f18854e;

        /* renamed from: g */
        public Context f18855g;

        public C3500a(View view, String str) {
            this.f18852a = view;
            this.f18853d = str;
        }

        /* renamed from: a */
        public final void mo27237a(Context context) {
            String str;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f18853d, new Class[]{View.class})) != null) {
                        this.f18854e = method;
                        this.f18855g = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                if (context instanceof ContextWrapper) {
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    context = null;
                }
            }
            int id = this.f18852a.getId();
            if (id == -1) {
                str = "";
            } else {
                str = " with id '" + this.f18852a.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f18853d + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f18852a.getClass() + str);
        }

        public void onClick(View view) {
            if (this.f18854e == null) {
                mo27237a(this.f18852a.getContext());
            }
            try {
                this.f18854e.invoke(this.f18855g, new Object[]{view});
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }
    }

    /* renamed from: u */
    public static Context m28896u(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        int i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j65.View, 0, 0);
        if (z) {
            i = obtainStyledAttributes.getResourceId(j65.View_android_theme, 0);
        } else {
            i = 0;
        }
        if (z2 && i == 0) {
            i = obtainStyledAttributes.getResourceId(j65.View_theme, 0);
        }
        obtainStyledAttributes.recycle();
        if (i == 0) {
            return context;
        }
        if (!(context instanceof hs0) || ((hs0) context).mo21372c() != i) {
            return new hs0(context, i);
        }
        return context;
    }

    /* renamed from: a */
    public final void mo27216a(Context context, View view, AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT <= 28) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f18846d);
            if (obtainStyledAttributes.hasValue(0)) {
                ga7.m17787q0(view, obtainStyledAttributes.getBoolean(0, false));
            }
            obtainStyledAttributes.recycle();
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f18847e);
            if (obtainStyledAttributes2.hasValue(0)) {
                ga7.m17791s0(view, obtainStyledAttributes2.getString(0));
            }
            obtainStyledAttributes2.recycle();
            TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f18848f);
            if (obtainStyledAttributes3.hasValue(0)) {
                ga7.m17726G0(view, obtainStyledAttributes3.getBoolean(0, false));
            }
            obtainStyledAttributes3.recycle();
        }
    }

    /* renamed from: b */
    public final void mo27217b(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if ((context instanceof ContextWrapper) && ga7.m17741O(view)) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f18845c);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new C3500a(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: c */
    public AppCompatAutoCompleteTextView mo27218c(Context context, AttributeSet attributeSet) {
        return new AppCompatAutoCompleteTextView(context, attributeSet);
    }

    /* renamed from: d */
    public AppCompatButton mo27219d(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    /* renamed from: e */
    public AppCompatCheckBox mo27220e(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }

    /* renamed from: f */
    public AppCompatCheckedTextView mo27221f(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckedTextView(context, attributeSet);
    }

    /* renamed from: g */
    public AppCompatEditText mo27222g(Context context, AttributeSet attributeSet) {
        return new AppCompatEditText(context, attributeSet);
    }

    /* renamed from: h */
    public AppCompatImageButton mo27223h(Context context, AttributeSet attributeSet) {
        return new AppCompatImageButton(context, attributeSet);
    }

    /* renamed from: i */
    public AppCompatImageView mo27224i(Context context, AttributeSet attributeSet) {
        return new AppCompatImageView(context, attributeSet);
    }

    /* renamed from: j */
    public AppCompatMultiAutoCompleteTextView mo27225j(Context context, AttributeSet attributeSet) {
        return new AppCompatMultiAutoCompleteTextView(context, attributeSet);
    }

    /* renamed from: k */
    public AppCompatRadioButton mo27226k(Context context, AttributeSet attributeSet) {
        return new AppCompatRadioButton(context, attributeSet);
    }

    /* renamed from: l */
    public AppCompatRatingBar mo27227l(Context context, AttributeSet attributeSet) {
        return new AppCompatRatingBar(context, attributeSet);
    }

    /* renamed from: m */
    public AppCompatSeekBar mo27228m(Context context, AttributeSet attributeSet) {
        return new AppCompatSeekBar(context, attributeSet);
    }

    /* renamed from: n */
    public AppCompatSpinner mo27229n(Context context, AttributeSet attributeSet) {
        return new AppCompatSpinner(context, attributeSet);
    }

    /* renamed from: o */
    public AppCompatTextView mo27230o(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    /* renamed from: p */
    public AppCompatToggleButton mo27231p(Context context, AttributeSet attributeSet) {
        return new AppCompatToggleButton(context, attributeSet);
    }

    /* renamed from: q */
    public View mo27232q(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    /* renamed from: r */
    public final View mo27233r(View view, String str, Context context, AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        Context context2;
        View view2;
        if (!z || view == null) {
            context2 = context;
        } else {
            context2 = view.getContext();
        }
        if (z2 || z3) {
            context2 = m28896u(context2, attributeSet, z2, z3);
        }
        if (z4) {
            context2 = vq6.m29075b(context2);
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c = 0;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c = 1;
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c = 2;
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c = 3;
                    break;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c = 4;
                    break;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c = 5;
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c = 6;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c = 7;
                    break;
                }
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    c = 8;
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c = 9;
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c = 10;
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c = 11;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c = 12;
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c = 13;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                view2 = mo27227l(context2, attributeSet);
                mo27236v(view2, str);
                break;
            case 1:
                view2 = mo27221f(context2, attributeSet);
                mo27236v(view2, str);
                break;
            case 2:
                view2 = mo27225j(context2, attributeSet);
                mo27236v(view2, str);
                break;
            case 3:
                view2 = mo27230o(context2, attributeSet);
                mo27236v(view2, str);
                break;
            case 4:
                view2 = mo27223h(context2, attributeSet);
                mo27236v(view2, str);
                break;
            case 5:
                view2 = mo27228m(context2, attributeSet);
                mo27236v(view2, str);
                break;
            case 6:
                view2 = mo27229n(context2, attributeSet);
                mo27236v(view2, str);
                break;
            case 7:
                view2 = mo27226k(context2, attributeSet);
                mo27236v(view2, str);
                break;
            case 8:
                view2 = mo27231p(context2, attributeSet);
                mo27236v(view2, str);
                break;
            case 9:
                view2 = mo27224i(context2, attributeSet);
                mo27236v(view2, str);
                break;
            case 10:
                view2 = mo27218c(context2, attributeSet);
                mo27236v(view2, str);
                break;
            case 11:
                view2 = mo27220e(context2, attributeSet);
                mo27236v(view2, str);
                break;
            case 12:
                view2 = mo27222g(context2, attributeSet);
                mo27236v(view2, str);
                break;
            case 13:
                view2 = mo27219d(context2, attributeSet);
                mo27236v(view2, str);
                break;
            default:
                view2 = mo27232q(context2, str, attributeSet);
                break;
        }
        if (view2 == null && context != context2) {
            view2 = mo27235t(context2, str, attributeSet);
        }
        if (view2 != null) {
            mo27217b(view2, attributeSet);
            mo27216a(context2, view2, attributeSet);
        }
        return view2;
    }

    /* renamed from: s */
    public final View mo27234s(Context context, String str, String str2) throws ClassNotFoundException, InflateException {
        String str3;
        y16<String, Constructor<? extends View>> y16 = f18850h;
        Constructor<? extends U> constructor = y16.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f18844b);
            y16.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f18851a);
    }

    /* renamed from: t */
    public final View mo27235t(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue((String) null, "class");
        }
        try {
            Object[] objArr = this.f18851a;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 == str.indexOf(46)) {
                int i = 0;
                while (true) {
                    String[] strArr = f18849g;
                    if (i < strArr.length) {
                        View s = mo27234s(context, str, strArr[i]);
                        if (s != null) {
                            return s;
                        }
                        i++;
                    } else {
                        Object[] objArr2 = this.f18851a;
                        objArr2[0] = null;
                        objArr2[1] = null;
                        return null;
                    }
                }
            } else {
                View s2 = mo27234s(context, str, (String) null);
                Object[] objArr3 = this.f18851a;
                objArr3[0] = null;
                objArr3[1] = null;
                return s2;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr4 = this.f18851a;
            objArr4[0] = null;
            objArr4[1] = null;
        }
    }

    /* renamed from: v */
    public final void mo27236v(View view, String str) {
        if (view == null) {
            throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
        }
    }
}
