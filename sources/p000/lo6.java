package p000;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p000.yt4;

/* renamed from: lo6 */
/* compiled from: TextViewCompat */
public final class lo6 {

    /* renamed from: lo6$a */
    /* compiled from: TextViewCompat */
    public static class C2775a {
        /* renamed from: a */
        public static boolean m21665a(TextView textView) {
            return textView.getIncludeFontPadding();
        }

        /* renamed from: b */
        public static int m21666b(TextView textView) {
            return textView.getMaxLines();
        }

        /* renamed from: c */
        public static int m21667c(TextView textView) {
            return textView.getMinLines();
        }
    }

    /* renamed from: lo6$b */
    /* compiled from: TextViewCompat */
    public static class C2776b {
        /* renamed from: a */
        public static Drawable[] m21668a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        /* renamed from: b */
        public static int m21669b(View view) {
            return view.getLayoutDirection();
        }

        /* renamed from: c */
        public static int m21670c(View view) {
            return view.getTextDirection();
        }

        /* renamed from: d */
        public static Locale m21671d(TextView textView) {
            return textView.getTextLocale();
        }

        /* renamed from: e */
        public static void m21672e(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        }

        /* renamed from: f */
        public static void m21673f(TextView textView, int i, int i2, int i3, int i4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        }

        /* renamed from: g */
        public static void m21674g(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        /* renamed from: h */
        public static void m21675h(View view, int i) {
            view.setTextDirection(i);
        }
    }

    /* renamed from: lo6$c */
    /* compiled from: TextViewCompat */
    public static class C2777c {
        /* renamed from: a */
        public static int m21676a(TextView textView) {
            return textView.getBreakStrategy();
        }

        /* renamed from: b */
        public static ColorStateList m21677b(TextView textView) {
            return textView.getCompoundDrawableTintList();
        }

        /* renamed from: c */
        public static PorterDuff.Mode m21678c(TextView textView) {
            return textView.getCompoundDrawableTintMode();
        }

        /* renamed from: d */
        public static int m21679d(TextView textView) {
            return textView.getHyphenationFrequency();
        }

        /* renamed from: e */
        public static void m21680e(TextView textView, int i) {
            textView.setBreakStrategy(i);
        }

        /* renamed from: f */
        public static void m21681f(TextView textView, ColorStateList colorStateList) {
            textView.setCompoundDrawableTintList(colorStateList);
        }

        /* renamed from: g */
        public static void m21682g(TextView textView, PorterDuff.Mode mode) {
            textView.setCompoundDrawableTintMode(mode);
        }

        /* renamed from: h */
        public static void m21683h(TextView textView, int i) {
            textView.setHyphenationFrequency(i);
        }
    }

    /* renamed from: lo6$d */
    /* compiled from: TextViewCompat */
    public static class C2778d {
        /* renamed from: a */
        public static DecimalFormatSymbols m21684a(Locale locale) {
            return DecimalFormatSymbols.getInstance(locale);
        }
    }

    /* renamed from: lo6$e */
    /* compiled from: TextViewCompat */
    public static class C2779e {
        /* renamed from: a */
        public static String[] m21685a(DecimalFormatSymbols decimalFormatSymbols) {
            return decimalFormatSymbols.getDigitStrings();
        }

        /* renamed from: b */
        public static PrecomputedText.Params m21686b(TextView textView) {
            return textView.getTextMetricsParams();
        }

        /* renamed from: c */
        public static void m21687c(TextView textView, int i) {
            textView.setFirstBaselineToTopHeight(i);
        }
    }

    /* renamed from: lo6$f */
    /* compiled from: TextViewCompat */
    public static class C2780f implements ActionMode.Callback {

        /* renamed from: a */
        public final ActionMode.Callback f14621a;

        /* renamed from: b */
        public final TextView f14622b;

        /* renamed from: c */
        public Class<?> f14623c;

        /* renamed from: d */
        public Method f14624d;

        /* renamed from: e */
        public boolean f14625e;

        /* renamed from: f */
        public boolean f14626f = false;

        public C2780f(ActionMode.Callback callback, TextView textView) {
            this.f14621a = callback;
            this.f14622b = textView;
        }

        /* renamed from: a */
        public final Intent mo22895a() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }

        /* renamed from: b */
        public final Intent mo22896b(ResolveInfo resolveInfo, TextView textView) {
            Intent putExtra = mo22895a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !mo22899e(textView));
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            return putExtra.setClassName(activityInfo.packageName, activityInfo.name);
        }

        /* renamed from: c */
        public final List<ResolveInfo> mo22897c(Context context, PackageManager packageManager) {
            ArrayList arrayList = new ArrayList();
            if (!(context instanceof Activity)) {
                return arrayList;
            }
            for (ResolveInfo next : packageManager.queryIntentActivities(mo22895a(), 0)) {
                if (mo22900f(next, context)) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        }

        /* renamed from: d */
        public ActionMode.Callback mo22898d() {
            return this.f14621a;
        }

        /* renamed from: e */
        public final boolean mo22899e(TextView textView) {
            if (!(textView instanceof Editable) || !textView.onCheckIsTextEditor() || !textView.isEnabled()) {
                return false;
            }
            return true;
        }

        /* renamed from: f */
        public final boolean mo22900f(ResolveInfo resolveInfo, Context context) {
            if (context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                return true;
            }
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (!activityInfo.exported) {
                return false;
            }
            String str = activityInfo.permission;
            if (str == null || context.checkSelfPermission(str) == 0) {
                return true;
            }
            return false;
        }

        /* renamed from: g */
        public final void mo22901g(Menu menu) {
            Method method;
            Context context = this.f14622b.getContext();
            PackageManager packageManager = context.getPackageManager();
            if (!this.f14626f) {
                this.f14626f = true;
                try {
                    Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f14623c = cls;
                    this.f14624d = cls.getDeclaredMethod("removeItemAt", new Class[]{Integer.TYPE});
                    this.f14625e = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.f14623c = null;
                    this.f14624d = null;
                    this.f14625e = false;
                }
            }
            try {
                if (!this.f14625e || !this.f14623c.isInstance(menu)) {
                    method = menu.getClass().getDeclaredMethod("removeItemAt", new Class[]{Integer.TYPE});
                } else {
                    method = this.f14624d;
                }
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        method.invoke(menu, new Object[]{Integer.valueOf(size)});
                    }
                }
                List<ResolveInfo> c = mo22897c(context, packageManager);
                for (int i = 0; i < c.size(); i++) {
                    ResolveInfo resolveInfo = c.get(i);
                    menu.add(0, 0, i + 100, resolveInfo.loadLabel(packageManager)).setIntent(mo22896b(resolveInfo, this.f14622b)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f14621a.onActionItemClicked(actionMode, menuItem);
        }

        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f14621a.onCreateActionMode(actionMode, menu);
        }

        public void onDestroyActionMode(ActionMode actionMode) {
            this.f14621a.onDestroyActionMode(actionMode);
        }

        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            mo22901g(menu);
            return this.f14621a.onPrepareActionMode(actionMode, menu);
        }
    }

    /* renamed from: a */
    public static Drawable[] m21647a(TextView textView) {
        return C2776b.m21668a(textView);
    }

    /* renamed from: b */
    public static int m21648b(TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    /* renamed from: c */
    public static int m21649c(TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    /* renamed from: d */
    public static int m21650d(TextView textView) {
        return C2775a.m21666b(textView);
    }

    /* renamed from: e */
    public static int m21651e(TextDirectionHeuristic textDirectionHeuristic) {
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 6;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
            return 7;
        }
        return 1;
    }

    /* renamed from: f */
    public static TextDirectionHeuristic m21652f(TextView textView) {
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        boolean z = false;
        if (Build.VERSION.SDK_INT < 28 || (textView.getInputType() & 15) != 3) {
            if (C2776b.m21669b(textView) == 1) {
                z = true;
            }
            switch (C2776b.m21670c(textView)) {
                case 2:
                    return TextDirectionHeuristics.ANYRTL_LTR;
                case 3:
                    return TextDirectionHeuristics.LTR;
                case 4:
                    return TextDirectionHeuristics.RTL;
                case 5:
                    return TextDirectionHeuristics.LOCALE;
                case 6:
                    return TextDirectionHeuristics.FIRSTSTRONG_LTR;
                case 7:
                    return TextDirectionHeuristics.FIRSTSTRONG_RTL;
                default:
                    if (z) {
                        return TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    }
                    return TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }
        } else {
            byte directionality = Character.getDirectionality(C2779e.m21685a(C2778d.m21684a(C2776b.m21671d(textView)))[0].codePointAt(0));
            if (directionality == 1 || directionality == 2) {
                return TextDirectionHeuristics.RTL;
            }
            return TextDirectionHeuristics.LTR;
        }
    }

    /* renamed from: g */
    public static yt4.C3695a m21653g(TextView textView) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new yt4.C3695a(C2779e.m21686b(textView));
        }
        yt4.C3695a.C3696a aVar = new yt4.C3695a.C3696a(new TextPaint(textView.getPaint()));
        aVar.mo28260b(C2777c.m21676a(textView));
        aVar.mo28261c(C2777c.m21679d(textView));
        aVar.mo28262d(m21652f(textView));
        return aVar.mo28259a();
    }

    /* renamed from: h */
    public static void m21654h(TextView textView, ColorStateList colorStateList) {
        gu4.m18428f(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            C2777c.m21681f(textView, colorStateList);
        } else if (textView instanceof zq6) {
            ((zq6) textView).setSupportCompoundDrawablesTintList(colorStateList);
        }
    }

    /* renamed from: i */
    public static void m21655i(TextView textView, PorterDuff.Mode mode) {
        gu4.m18428f(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            C2777c.m21682g(textView, mode);
        } else if (textView instanceof zq6) {
            ((zq6) textView).setSupportCompoundDrawablesTintMode(mode);
        }
    }

    /* renamed from: j */
    public static void m21656j(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        C2776b.m21672e(textView, drawable, drawable2, drawable3, drawable4);
    }

    /* renamed from: k */
    public static void m21657k(TextView textView, int i) {
        int i2;
        gu4.m18425c(i);
        if (Build.VERSION.SDK_INT >= 28) {
            C2779e.m21687c(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (C2775a.m21665a(textView)) {
            i2 = fontMetricsInt.top;
        } else {
            i2 = fontMetricsInt.ascent;
        }
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* renamed from: l */
    public static void m21658l(TextView textView, int i) {
        int i2;
        gu4.m18425c(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (C2775a.m21665a(textView)) {
            i2 = fontMetricsInt.bottom;
        } else {
            i2 = fontMetricsInt.descent;
        }
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    /* renamed from: m */
    public static void m21659m(TextView textView, int i) {
        gu4.m18425c(i);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt((Paint.FontMetricsInt) null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing((float) (i - fontMetricsInt), 1.0f);
        }
    }

    /* renamed from: n */
    public static void m21660n(TextView textView, yt4 yt4) {
        if (Build.VERSION.SDK_INT >= 29) {
            textView.setText(yt4.mo28239b());
        } else if (m21653g(textView).mo28251a(yt4.mo28238a())) {
            textView.setText(yt4);
        } else {
            throw new IllegalArgumentException("Given text can not be applied to TextView.");
        }
    }

    /* renamed from: o */
    public static void m21661o(TextView textView, int i) {
        textView.setTextAppearance(i);
    }

    /* renamed from: p */
    public static void m21662p(TextView textView, yt4.C3695a aVar) {
        C2776b.m21675h(textView, m21651e(aVar.mo28254d()));
        textView.getPaint().set(aVar.mo28255e());
        C2777c.m21680e(textView, aVar.mo28252b());
        C2777c.m21683h(textView, aVar.mo28253c());
    }

    /* renamed from: q */
    public static ActionMode.Callback m21663q(ActionMode.Callback callback) {
        if (!(callback instanceof C2780f) || Build.VERSION.SDK_INT < 26) {
            return callback;
        }
        return ((C2780f) callback).mo22898d();
    }

    /* renamed from: r */
    public static ActionMode.Callback m21664r(TextView textView, ActionMode.Callback callback) {
        int i = Build.VERSION.SDK_INT;
        if (i < 26 || i > 27 || (callback instanceof C2780f) || callback == null) {
            return callback;
        }
        return new C2780f(callback, textView);
    }
}
