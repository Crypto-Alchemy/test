package p000;

import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;
import org.web3j.ens.contracts.generated.PublicResolver;

/* renamed from: ld6 */
/* compiled from: SuggestionsAdapter */
public class ld6 extends ff5 implements View.OnClickListener {

    /* renamed from: C */
    public final SearchView f14489C;

    /* renamed from: H */
    public final SearchableInfo f14490H;

    /* renamed from: I */
    public final Context f14491I;

    /* renamed from: L */
    public final WeakHashMap<String, Drawable.ConstantState> f14492L;

    /* renamed from: M */
    public final int f14493M;

    /* renamed from: P */
    public boolean f14494P = false;

    /* renamed from: Q */
    public int f14495Q = 1;

    /* renamed from: U */
    public ColorStateList f14496U;

    /* renamed from: X */
    public int f14497X = -1;

    /* renamed from: Y */
    public int f14498Y = -1;

    /* renamed from: Z */
    public int f14499Z = -1;

    /* renamed from: e0 */
    public int f14500e0 = -1;

    /* renamed from: k0 */
    public int f14501k0 = -1;

    /* renamed from: v0 */
    public int f14502v0 = -1;

    /* renamed from: ld6$a */
    /* compiled from: SuggestionsAdapter */
    public static final class C2757a {

        /* renamed from: a */
        public final TextView f14503a;

        /* renamed from: b */
        public final TextView f14504b;

        /* renamed from: c */
        public final ImageView f14505c;

        /* renamed from: d */
        public final ImageView f14506d;

        /* renamed from: e */
        public final ImageView f14507e;

        public C2757a(View view) {
            this.f14503a = (TextView) view.findViewById(16908308);
            this.f14504b = (TextView) view.findViewById(16908309);
            this.f14505c = (ImageView) view.findViewById(16908295);
            this.f14506d = (ImageView) view.findViewById(16908296);
            this.f14507e = (ImageView) view.findViewById(j35.edit_query);
        }
    }

    public ld6(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), (Cursor) null, true);
        this.f14489C = searchView;
        this.f14490H = searchableInfo;
        this.f14493M = searchView.getSuggestionCommitIconResId();
        this.f14491I = context;
        this.f14492L = weakHashMap;
    }

    /* renamed from: n */
    public static String m21404n(Cursor cursor, String str) {
        return m21405v(cursor, cursor.getColumnIndex(str));
    }

    /* renamed from: v */
    public static String m21405v(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: A */
    public final void mo22721A(Cursor cursor) {
        Bundle bundle;
        if (cursor != null) {
            bundle = cursor.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            bundle.getBoolean("in_progress");
        }
    }

    /* renamed from: a */
    public void mo22722a(Cursor cursor) {
        if (!this.f14494P) {
            try {
                super.mo22722a(cursor);
                if (cursor != null) {
                    this.f14497X = cursor.getColumnIndex("suggest_text_1");
                    this.f14498Y = cursor.getColumnIndex("suggest_text_2");
                    this.f14499Z = cursor.getColumnIndex("suggest_text_2_url");
                    this.f14500e0 = cursor.getColumnIndex("suggest_icon_1");
                    this.f14501k0 = cursor.getColumnIndex("suggest_icon_2");
                    this.f14502v0 = cursor.getColumnIndex("suggest_flags");
                }
            } catch (Exception unused) {
            }
        } else if (cursor != null) {
            cursor.close();
        }
    }

    /* renamed from: b */
    public Cursor mo22723b(CharSequence charSequence) {
        String str;
        if (charSequence == null) {
            str = "";
        } else {
            str = charSequence.toString();
        }
        if (this.f14489C.getVisibility() == 0 && this.f14489C.getWindowVisibility() == 0) {
            try {
                Cursor u = mo22742u(this.f14490H, str, 50);
                if (u != null) {
                    u.getCount();
                    return u;
                }
            } catch (RuntimeException unused) {
            }
        }
        return null;
    }

    public CharSequence convertToString(Cursor cursor) {
        String n;
        String n2;
        if (cursor == null) {
            return null;
        }
        String n3 = m21404n(cursor, "suggest_intent_query");
        if (n3 != null) {
            return n3;
        }
        if (this.f14490H.shouldRewriteQueryFromData() && (n2 = m21404n(cursor, "suggest_intent_data")) != null) {
            return n2;
        }
        if (!this.f14490H.shouldRewriteQueryFromText() || (n = m21404n(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return n;
    }

    /* renamed from: d */
    public void mo22725d(View view, Context context, Cursor cursor) {
        int i;
        CharSequence charSequence;
        C2757a aVar = (C2757a) view.getTag();
        int i2 = this.f14502v0;
        if (i2 != -1) {
            i = cursor.getInt(i2);
        } else {
            i = 0;
        }
        if (aVar.f14503a != null) {
            mo22745y(aVar.f14503a, m21405v(cursor, this.f14497X));
        }
        if (aVar.f14504b != null) {
            String v = m21405v(cursor, this.f14499Z);
            if (v != null) {
                charSequence = mo22730k(v);
            } else {
                charSequence = m21405v(cursor, this.f14498Y);
            }
            if (TextUtils.isEmpty(charSequence)) {
                TextView textView = aVar.f14503a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.f14503a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.f14503a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.f14503a.setMaxLines(1);
                }
            }
            mo22745y(aVar.f14504b, charSequence);
        }
        ImageView imageView = aVar.f14505c;
        if (imageView != null) {
            mo22744x(imageView, mo22740s(cursor), 4);
        }
        ImageView imageView2 = aVar.f14506d;
        if (imageView2 != null) {
            mo22744x(imageView2, mo22741t(cursor), 8);
        }
        int i3 = this.f14495Q;
        if (i3 == 2 || (i3 == 1 && (i & 1) != 0)) {
            aVar.f14507e.setVisibility(0);
            aVar.f14507e.setTag(aVar.f14503a.getText());
            aVar.f14507e.setOnClickListener(this);
            return;
        }
        aVar.f14507e.setVisibility(8);
    }

    /* renamed from: g */
    public View mo19895g(Context context, Cursor cursor, ViewGroup viewGroup) {
        View g = super.mo19895g(context, cursor, viewGroup);
        g.setTag(new C2757a(g));
        ((ImageView) g.findViewById(j35.edit_query)).setImageResource(this.f14493M);
        return g;
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            View f = mo19894f(this.f14491I, mo23813c(), viewGroup);
            if (f != null) {
                ((C2757a) f.getTag()).f14503a.setText(e.toString());
            }
            return f;
        }
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            View g = mo19895g(this.f14491I, mo23813c(), viewGroup);
            if (g != null) {
                ((C2757a) g.getTag()).f14503a.setText(e.toString());
            }
            return g;
        }
    }

    public boolean hasStableIds() {
        return false;
    }

    /* renamed from: j */
    public final Drawable mo22729j(String str) {
        Drawable.ConstantState constantState = this.f14492L.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    /* renamed from: k */
    public final CharSequence mo22730k(CharSequence charSequence) {
        if (this.f14496U == null) {
            TypedValue typedValue = new TypedValue();
            this.f14491I.getTheme().resolveAttribute(m15.textColorSearchUrl, typedValue, true);
            this.f14496U = this.f14491I.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan((String) null, 0, 0, this.f14496U, (ColorStateList) null), 0, charSequence.length(), 33);
        return spannableString;
    }

    /* renamed from: l */
    public final Drawable mo22731l(ComponentName componentName) {
        PackageManager packageManager = this.f14491I.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid icon resource ");
            sb.append(iconResource);
            sb.append(" for ");
            sb.append(componentName.flattenToShortString());
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            e.toString();
            return null;
        }
    }

    /* renamed from: m */
    public final Drawable mo22732m(ComponentName componentName) {
        String flattenToShortString = componentName.flattenToShortString();
        Drawable.ConstantState constantState = null;
        if (this.f14492L.containsKey(flattenToShortString)) {
            Drawable.ConstantState constantState2 = this.f14492L.get(flattenToShortString);
            if (constantState2 == null) {
                return null;
            }
            return constantState2.newDrawable(this.f14491I.getResources());
        }
        Drawable l = mo22731l(componentName);
        if (l != null) {
            constantState = l.getConstantState();
        }
        this.f14492L.put(flattenToShortString, constantState);
        return l;
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        mo22721A(mo23813c());
    }

    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        mo22721A(mo23813c());
    }

    /* renamed from: o */
    public final Drawable mo22735o() {
        Drawable m = mo22732m(this.f14490H.getSearchActivity());
        if (m != null) {
            return m;
        }
        return this.f14491I.getPackageManager().getDefaultActivityIcon();
    }

    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f14489C.onQueryRefine((CharSequence) tag);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:7|8|9) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:19|20|21|22|23|24) */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:12|13|14|15|16|17|18) */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002a, code lost:
        throw new java.io.FileNotFoundException("Resource does not exist: " + r5);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x003f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0050 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0014 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:22:0x0050=Splitter:B:22:0x0050, B:4:0x000f=Splitter:B:4:0x000f, B:16:0x003f=Splitter:B:16:0x003f} */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable mo22737p(android.net.Uri r5) {
        /*
            r4 = this;
            java.lang.String r0 = "Error closing icon stream for "
            r1 = 0
            java.lang.String r2 = r5.getScheme()     // Catch:{ FileNotFoundException -> 0x0073 }
            java.lang.String r3 = "android.resource"
            boolean r2 = r3.equals(r2)     // Catch:{ FileNotFoundException -> 0x0073 }
            if (r2 == 0) goto L_0x002b
            android.graphics.drawable.Drawable r5 = r4.mo22738q(r5)     // Catch:{ NotFoundException -> 0x0014 }
            return r5
        L_0x0014:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x0073 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0073 }
            r2.<init>()     // Catch:{ FileNotFoundException -> 0x0073 }
            java.lang.String r3 = "Resource does not exist: "
            r2.append(r3)     // Catch:{ FileNotFoundException -> 0x0073 }
            r2.append(r5)     // Catch:{ FileNotFoundException -> 0x0073 }
            java.lang.String r2 = r2.toString()     // Catch:{ FileNotFoundException -> 0x0073 }
            r0.<init>(r2)     // Catch:{ FileNotFoundException -> 0x0073 }
            throw r0     // Catch:{ FileNotFoundException -> 0x0073 }
        L_0x002b:
            android.content.Context r2 = r4.f14491I     // Catch:{ FileNotFoundException -> 0x0073 }
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch:{ FileNotFoundException -> 0x0073 }
            java.io.InputStream r2 = r2.openInputStream(r5)     // Catch:{ FileNotFoundException -> 0x0073 }
            if (r2 == 0) goto L_0x005c
            android.graphics.drawable.Drawable r3 = android.graphics.drawable.Drawable.createFromStream(r2, r1)     // Catch:{ all -> 0x004b }
            r2.close()     // Catch:{ IOException -> 0x003f }
            goto L_0x004a
        L_0x003f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0073 }
            r2.<init>()     // Catch:{ FileNotFoundException -> 0x0073 }
            r2.append(r0)     // Catch:{ FileNotFoundException -> 0x0073 }
            r2.append(r5)     // Catch:{ FileNotFoundException -> 0x0073 }
        L_0x004a:
            return r3
        L_0x004b:
            r3 = move-exception
            r2.close()     // Catch:{ IOException -> 0x0050 }
            goto L_0x005b
        L_0x0050:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0073 }
            r2.<init>()     // Catch:{ FileNotFoundException -> 0x0073 }
            r2.append(r0)     // Catch:{ FileNotFoundException -> 0x0073 }
            r2.append(r5)     // Catch:{ FileNotFoundException -> 0x0073 }
        L_0x005b:
            throw r3     // Catch:{ FileNotFoundException -> 0x0073 }
        L_0x005c:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x0073 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0073 }
            r2.<init>()     // Catch:{ FileNotFoundException -> 0x0073 }
            java.lang.String r3 = "Failed to open "
            r2.append(r3)     // Catch:{ FileNotFoundException -> 0x0073 }
            r2.append(r5)     // Catch:{ FileNotFoundException -> 0x0073 }
            java.lang.String r2 = r2.toString()     // Catch:{ FileNotFoundException -> 0x0073 }
            r0.<init>(r2)     // Catch:{ FileNotFoundException -> 0x0073 }
            throw r0     // Catch:{ FileNotFoundException -> 0x0073 }
        L_0x0073:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Icon not found: "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r5 = ", "
            r2.append(r5)
            java.lang.String r5 = r0.getMessage()
            r2.append(r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ld6.mo22737p(android.net.Uri):android.graphics.drawable.Drawable");
    }

    /* renamed from: q */
    public Drawable mo22738q(Uri uri) throws FileNotFoundException {
        int i;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.f14491I.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            i = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                        }
                    } else if (size == 2) {
                        i = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + uri);
                    }
                    if (i != 0) {
                        return resourcesForApplication.getDrawable(i);
                    }
                    throw new FileNotFoundException("No resource found for: " + uri);
                }
                throw new FileNotFoundException("No path: " + uri);
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException("No package found for authority: " + uri);
            }
        } else {
            throw new FileNotFoundException("No authority: " + uri);
        }
    }

    /* renamed from: r */
    public final Drawable mo22739r(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f14491I.getPackageName() + "/" + parseInt;
            Drawable j = mo22729j(str2);
            if (j != null) {
                return j;
            }
            Drawable e = zr0.m31442e(this.f14491I, parseInt);
            mo22746z(str2, e);
            return e;
        } catch (NumberFormatException unused) {
            Drawable j2 = mo22729j(str);
            if (j2 != null) {
                return j2;
            }
            Drawable p = mo22737p(Uri.parse(str));
            mo22746z(str, p);
            return p;
        } catch (Resources.NotFoundException unused2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Icon resource not found: ");
            sb.append(str);
            return null;
        }
    }

    /* renamed from: s */
    public final Drawable mo22740s(Cursor cursor) {
        int i = this.f14500e0;
        if (i == -1) {
            return null;
        }
        Drawable r = mo22739r(cursor.getString(i));
        if (r != null) {
            return r;
        }
        return mo22735o();
    }

    /* renamed from: t */
    public final Drawable mo22741t(Cursor cursor) {
        int i = this.f14501k0;
        if (i == -1) {
            return null;
        }
        return mo22739r(cursor.getString(i));
    }

    /* renamed from: u */
    public Cursor mo22742u(SearchableInfo searchableInfo, String str, int i) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme(PublicResolver.FUNC_CONTENT).authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i));
        }
        return this.f14491I.getContentResolver().query(fragment.build(), (String[]) null, suggestSelection, strArr2, (String) null);
    }

    /* renamed from: w */
    public void mo22743w(int i) {
        this.f14495Q = i;
    }

    /* renamed from: x */
    public final void mo22744x(ImageView imageView, Drawable drawable, int i) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    /* renamed from: y */
    public final void mo22745y(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    /* renamed from: z */
    public final void mo22746z(String str, Drawable drawable) {
        if (drawable != null) {
            this.f14492L.put(str, drawable.getConstantState());
        }
    }
}
