package androidx.media3.p005ui;

import android.text.Html;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.SparseArray;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: androidx.media3.ui.a */
/* compiled from: SpannedToHtmlConverter */
public final class C1098a {

    /* renamed from: a */
    public static final Pattern f5948a = Pattern.compile("(&#13;)?&#10;");

    /* renamed from: androidx.media3.ui.a$b */
    /* compiled from: SpannedToHtmlConverter */
    public static class C1100b {

        /* renamed from: a */
        public final String f5949a;

        /* renamed from: b */
        public final Map<String, String> f5950b;

        public C1100b(String str, Map<String, String> map) {
            this.f5949a = str;
            this.f5950b = map;
        }
    }

    /* renamed from: androidx.media3.ui.a$c */
    /* compiled from: SpannedToHtmlConverter */
    public static final class C1101c {

        /* renamed from: e */
        public static final Comparator<C1101c> f5951e = new h66();

        /* renamed from: f */
        public static final Comparator<C1101c> f5952f = new i66();

        /* renamed from: a */
        public final int f5953a;

        /* renamed from: b */
        public final int f5954b;

        /* renamed from: c */
        public final String f5955c;

        /* renamed from: d */
        public final String f5956d;

        /* renamed from: e */
        public static /* synthetic */ int m8113e(C1101c cVar, C1101c cVar2) {
            int compare = Integer.compare(cVar2.f5954b, cVar.f5954b);
            if (compare != 0) {
                return compare;
            }
            int compareTo = cVar.f5955c.compareTo(cVar2.f5955c);
            if (compareTo != 0) {
                return compareTo;
            }
            return cVar.f5956d.compareTo(cVar2.f5956d);
        }

        /* renamed from: f */
        public static /* synthetic */ int m8114f(C1101c cVar, C1101c cVar2) {
            int compare = Integer.compare(cVar2.f5953a, cVar.f5953a);
            if (compare != 0) {
                return compare;
            }
            int compareTo = cVar2.f5955c.compareTo(cVar.f5955c);
            if (compareTo != 0) {
                return compareTo;
            }
            return cVar2.f5956d.compareTo(cVar.f5956d);
        }

        public C1101c(int i, int i2, String str, String str2) {
            this.f5953a = i;
            this.f5954b = i2;
            this.f5955c = str;
            this.f5956d = str2;
        }
    }

    /* renamed from: androidx.media3.ui.a$d */
    /* compiled from: SpannedToHtmlConverter */
    public static final class C1102d {

        /* renamed from: a */
        public final List<C1101c> f5957a = new ArrayList();

        /* renamed from: b */
        public final List<C1101c> f5958b = new ArrayList();
    }

    /* renamed from: a */
    public static C1100b m8101a(CharSequence charSequence, float f) {
        if (charSequence == null) {
            return new C1100b("", ImmutableMap.m36661of());
        }
        if (!(charSequence instanceof Spanned)) {
            return new C1100b(m8102b(charSequence), ImmutableMap.m36661of());
        }
        Spanned spanned = (Spanned) charSequence;
        HashSet<Integer> hashSet = new HashSet<>();
        int i = 0;
        for (BackgroundColorSpan backgroundColor : (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class)) {
            hashSet.add(Integer.valueOf(backgroundColor.getBackgroundColor()));
        }
        HashMap hashMap = new HashMap();
        for (Integer intValue : hashSet) {
            int intValue2 = intValue.intValue();
            hashMap.put(an2.m408a("bg_" + intValue2), w67.m29294A("background-color:%s;", an2.m409b(intValue2)));
        }
        SparseArray<C1102d> c = m8103c(spanned, f);
        StringBuilder sb = new StringBuilder(spanned.length());
        int i2 = 0;
        while (i < c.size()) {
            int keyAt = c.keyAt(i);
            sb.append(m8102b(spanned.subSequence(i2, keyAt)));
            C1102d dVar = c.get(keyAt);
            Collections.sort(dVar.f5958b, C1101c.f5952f);
            for (C1101c cVar : dVar.f5958b) {
                sb.append(cVar.f5956d);
            }
            Collections.sort(dVar.f5957a, C1101c.f5951e);
            for (C1101c cVar2 : dVar.f5957a) {
                sb.append(cVar2.f5955c);
            }
            i++;
            i2 = keyAt;
        }
        sb.append(m8102b(spanned.subSequence(i2, spanned.length())));
        return new C1100b(sb.toString(), hashMap);
    }

    /* renamed from: b */
    public static String m8102b(CharSequence charSequence) {
        return f5948a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }

    /* renamed from: c */
    public static SparseArray<C1102d> m8103c(Spanned spanned, float f) {
        SparseArray<C1102d> sparseArray = new SparseArray<>();
        for (Object obj : spanned.getSpans(0, spanned.length(), Object.class)) {
            String e = m8105e(obj, f);
            String d = m8104d(obj);
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            if (e != null) {
                C2725kr.m20985e(d);
                C1101c cVar = new C1101c(spanStart, spanEnd, e, d);
                m8106f(sparseArray, spanStart).f5957a.add(cVar);
                m8106f(sparseArray, spanEnd).f5958b.add(cVar);
            }
        }
        return sparseArray;
    }

    /* renamed from: d */
    public static String m8104d(Object obj) {
        if ((obj instanceof StrikethroughSpan) || (obj instanceof ForegroundColorSpan) || (obj instanceof BackgroundColorSpan) || (obj instanceof vm2) || (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan) || (obj instanceof ln6)) {
            return "</span>";
        }
        if (!(obj instanceof TypefaceSpan)) {
            if (obj instanceof StyleSpan) {
                int style = ((StyleSpan) obj).getStyle();
                if (style == 1) {
                    return "</b>";
                }
                if (style == 2) {
                    return "</i>";
                }
                if (style != 3) {
                    return null;
                }
                return "</i></b>";
            } else if (obj instanceof ji5) {
                return "<rt>" + m8102b(((ji5) obj).f13618a) + "</rt></ruby>";
            } else if (obj instanceof UnderlineSpan) {
                return "</u>";
            }
            return null;
        } else if (((TypefaceSpan) obj).getFamily() != null) {
            return "</span>";
        } else {
            return null;
        }
    }

    /* renamed from: e */
    public static String m8105e(Object obj, float f) {
        float f2;
        if (obj instanceof StrikethroughSpan) {
            return "<span style='text-decoration:line-through;'>";
        }
        if (obj instanceof ForegroundColorSpan) {
            return w67.m29294A("<span style='color:%s;'>", an2.m409b(((ForegroundColorSpan) obj).getForegroundColor()));
        } else if (obj instanceof BackgroundColorSpan) {
            return w67.m29294A("<span class='bg_%s'>", Integer.valueOf(((BackgroundColorSpan) obj).getBackgroundColor()));
        } else if (obj instanceof vm2) {
            return "<span style='text-combine-upright:all;'>";
        } else {
            if (obj instanceof AbsoluteSizeSpan) {
                AbsoluteSizeSpan absoluteSizeSpan = (AbsoluteSizeSpan) obj;
                if (absoluteSizeSpan.getDip()) {
                    f2 = (float) absoluteSizeSpan.getSize();
                } else {
                    f2 = ((float) absoluteSizeSpan.getSize()) / f;
                }
                return w67.m29294A("<span style='font-size:%.2fpx;'>", Float.valueOf(f2));
            } else if (obj instanceof RelativeSizeSpan) {
                return w67.m29294A("<span style='font-size:%.2f%%;'>", Float.valueOf(((RelativeSizeSpan) obj).getSizeChange() * 100.0f));
            } else if (obj instanceof TypefaceSpan) {
                String family = ((TypefaceSpan) obj).getFamily();
                if (family == null) {
                    return null;
                }
                return w67.m29294A("<span style='font-family:\"%s\";'>", family);
            } else if (obj instanceof StyleSpan) {
                int style = ((StyleSpan) obj).getStyle();
                if (style == 1) {
                    return "<b>";
                }
                if (style == 2) {
                    return "<i>";
                }
                if (style != 3) {
                    return null;
                }
                return "<b><i>";
            } else if (obj instanceof ji5) {
                int i = ((ji5) obj).f13619b;
                if (i == -1) {
                    return "<ruby style='ruby-position:unset;'>";
                }
                if (i == 1) {
                    return "<ruby style='ruby-position:over;'>";
                }
                if (i != 2) {
                    return null;
                }
                return "<ruby style='ruby-position:under;'>";
            } else if (obj instanceof UnderlineSpan) {
                return "<u>";
            } else {
                if (!(obj instanceof ln6)) {
                    return null;
                }
                ln6 ln6 = (ln6) obj;
                return w67.m29294A("<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", m8108h(ln6.f14613a, ln6.f14614b), m8107g(ln6.f14615c));
            }
        }
    }

    /* renamed from: f */
    public static C1102d m8106f(SparseArray<C1102d> sparseArray, int i) {
        C1102d dVar = sparseArray.get(i);
        if (dVar != null) {
            return dVar;
        }
        C1102d dVar2 = new C1102d();
        sparseArray.put(i, dVar2);
        return dVar2;
    }

    /* renamed from: g */
    public static String m8107g(int i) {
        return i != 2 ? "over right" : "under left";
    }

    /* renamed from: h */
    public static String m8108h(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        if (i2 == 1) {
            sb.append("filled ");
        } else if (i2 == 2) {
            sb.append("open ");
        }
        if (i == 0) {
            sb.append("none");
        } else if (i == 1) {
            sb.append("circle");
        } else if (i == 2) {
            sb.append("dot");
        } else if (i != 3) {
            sb.append("unset");
        } else {
            sb.append("sesame");
        }
        return sb.toString();
    }
}
