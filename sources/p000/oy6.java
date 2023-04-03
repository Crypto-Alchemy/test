package p000;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayDeque;
import java.util.Map;

/* renamed from: oy6 */
/* compiled from: TtmlRenderUtil */
public final class oy6 {
    /* renamed from: a */
    public static void m24447a(Spannable spannable, int i, int i2, py6 py6, my6 my6, Map<String, py6> map, int i3) {
        my6 e;
        int i4;
        py6 f;
        int i5;
        if (py6.mo24851l() != -1) {
            spannable.setSpan(new StyleSpan(py6.mo24851l()), i, i2, 33);
        }
        if (py6.mo24858s()) {
            spannable.setSpan(new StrikethroughSpan(), i, i2, 33);
        }
        if (py6.mo24859t()) {
            spannable.setSpan(new UnderlineSpan(), i, i2, 33);
        }
        if (py6.mo24856q()) {
            d66.m14819a(spannable, new ForegroundColorSpan(py6.mo24842c()), i, i2, 33);
        }
        if (py6.mo24855p()) {
            d66.m14819a(spannable, new BackgroundColorSpan(py6.mo24841b()), i, i2, 33);
        }
        if (py6.mo24843d() != null) {
            d66.m14819a(spannable, new TypefaceSpan(py6.mo24843d()), i, i2, 33);
        }
        if (py6.mo24854o() != null) {
            kn6 kn6 = (kn6) C2725kr.m20985e(py6.mo24854o());
            int i6 = kn6.f14228a;
            if (i6 == -1) {
                if (i3 == 2 || i3 == 1) {
                    i6 = 3;
                } else {
                    i6 = 1;
                }
                i5 = 1;
            } else {
                i5 = kn6.f14229b;
            }
            int i7 = kn6.f14230c;
            if (i7 == -2) {
                i7 = 1;
            }
            d66.m14819a(spannable, new ln6(i6, i5, i7), i, i2, 33);
        }
        int j = py6.mo24849j();
        if (j == 2) {
            my6 d = m24450d(my6, map);
            if (!(d == null || (e = m24451e(d, map)) == null)) {
                if (e.mo23425g() != 1 || e.mo23424f(0).f15281b == null) {
                    gk3.m18129f("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                } else {
                    String str = (String) w67.m29360j(e.mo23424f(0).f15281b);
                    py6 f2 = m24452f(e.f15285f, e.mo23429l(), map);
                    if (f2 != null) {
                        i4 = f2.mo24848i();
                    } else {
                        i4 = -1;
                    }
                    if (i4 == -1 && (f = m24452f(d.f15285f, d.mo23429l(), map)) != null) {
                        i4 = f.mo24848i();
                    }
                    spannable.setSpan(new ji5(str, i4), i, i2, 33);
                }
            }
        } else if (j == 3 || j == 4) {
            spannable.setSpan(new zb1(), i, i2, 33);
        }
        if (py6.mo24853n()) {
            d66.m14819a(spannable, new vm2(), i, i2, 33);
        }
        int f3 = py6.mo24845f();
        if (f3 == 1) {
            d66.m14819a(spannable, new AbsoluteSizeSpan((int) py6.mo24844e(), true), i, i2, 33);
        } else if (f3 == 2) {
            d66.m14819a(spannable, new RelativeSizeSpan(py6.mo24844e()), i, i2, 33);
        } else if (f3 == 3) {
            d66.m14819a(spannable, new RelativeSizeSpan(py6.mo24844e() / 100.0f), i, i2, 33);
        }
    }

    /* renamed from: b */
    public static String m24448b(String str) {
        return str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " ");
    }

    /* renamed from: c */
    public static void m24449c(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length >= 0 && spannableStringBuilder.charAt(length) != 10) {
            spannableStringBuilder.append(10);
        }
    }

    /* renamed from: d */
    public static my6 m24450d(my6 my6, Map<String, py6> map) {
        while (my6 != null) {
            py6 f = m24452f(my6.f15285f, my6.mo23429l(), map);
            if (f != null && f.mo24849j() == 1) {
                return my6;
            }
            my6 = my6.f15289j;
        }
        return null;
    }

    /* renamed from: e */
    public static my6 m24451e(my6 my6, Map<String, py6> map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(my6);
        while (!arrayDeque.isEmpty()) {
            my6 my62 = (my6) arrayDeque.pop();
            py6 f = m24452f(my62.f15285f, my62.mo23429l(), map);
            if (f != null && f.mo24849j() == 3) {
                return my62;
            }
            for (int g = my62.mo23425g() - 1; g >= 0; g--) {
                arrayDeque.push(my62.mo23424f(g));
            }
        }
        return null;
    }

    /* renamed from: f */
    public static py6 m24452f(py6 py6, String[] strArr, Map<String, py6> map) {
        int i = 0;
        if (py6 == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                py6 py62 = new py6();
                int length = strArr.length;
                while (i < length) {
                    py62.mo24840a(map.get(strArr[i]));
                    i++;
                }
                return py62;
            }
        } else if (strArr != null && strArr.length == 1) {
            return py6.mo24840a(map.get(strArr[0]));
        } else {
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i < length2) {
                    py6.mo24840a(map.get(strArr[i]));
                    i++;
                }
            }
        }
        return py6;
    }
}
