package p000;

import com.github.mikephil.charting.utils.Utils;
import com.google.android.gms.internal.measurement.zzep;
import com.google.android.gms.internal.measurement.zzew;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* renamed from: tj9 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public abstract class tj9 {

    /* renamed from: a */
    public final String f34290a;

    /* renamed from: b */
    public final int f34291b;

    /* renamed from: c */
    public Boolean f34292c;

    /* renamed from: d */
    public Boolean f34293d;

    /* renamed from: e */
    public Long f34294e;

    /* renamed from: f */
    public Long f34295f;

    public tj9(String str, int i) {
        this.f34290a = str;
        this.f34291b = i;
    }

    /* renamed from: d */
    public static Boolean m52332d(String str, zzew zzew, boolean z, String str2, List<String> list, String str3, bn8 bn8) {
        int i;
        if (zzew == zzew.IN_LIST) {
            if (list == null || list.size() == 0) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z && zzew != zzew.REGEXP) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        zzep zzep = zzep.UNKNOWN_COMPARISON_TYPE;
        switch (zzew.ordinal()) {
            case 1:
                if (str3 == null) {
                    return null;
                }
                if (true != z) {
                    i = 66;
                } else {
                    i = 0;
                }
                try {
                    return Boolean.valueOf(Pattern.compile(str3, i).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    if (bn8 != null) {
                        bn8.mo29673o().mo48770b("Invalid regular expression in REGEXP audience filter. expression", str3);
                    }
                    return null;
                }
            case 2:
                return Boolean.valueOf(str.startsWith(str2));
            case 3:
                return Boolean.valueOf(str.endsWith(str2));
            case 4:
                return Boolean.valueOf(str.contains(str2));
            case 5:
                return Boolean.valueOf(str.equals(str2));
            case 6:
                if (list == null) {
                    return null;
                }
                return Boolean.valueOf(list.contains(str));
            default:
                return null;
        }
    }

    /* renamed from: e */
    public static Boolean m52333e(Boolean bool, boolean z) {
        boolean z2;
        if (bool == null) {
            return null;
        }
        if (bool.booleanValue() != z) {
            z2 = true;
        } else {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }

    /* renamed from: f */
    public static Boolean m52334f(String str, eo8 eo8, bn8 bn8) {
        String str2;
        List<String> list;
        String str3;
        cu4.m43221k(eo8);
        if (str == null || !eo8.mo42341x() || eo8.mo42342y() == zzew.UNKNOWN_MATCH_TYPE) {
            return null;
        }
        zzew y = eo8.mo42342y();
        zzew zzew = zzew.IN_LIST;
        if (y == zzew) {
            if (eo8.mo42340F() == 0) {
                return null;
            }
        } else if (!eo8.mo42343z()) {
            return null;
        }
        zzew y2 = eo8.mo42342y();
        boolean D = eo8.mo42338D();
        if (D || y2 == zzew.REGEXP || y2 == zzew) {
            str2 = eo8.mo42336B();
        } else {
            str2 = eo8.mo42336B().toUpperCase(Locale.ENGLISH);
        }
        String str4 = str2;
        if (eo8.mo42340F() == 0) {
            list = null;
        } else {
            List<String> E = eo8.mo42339E();
            if (!D) {
                ArrayList arrayList = new ArrayList(E.size());
                for (String upperCase : E) {
                    arrayList.add(upperCase.toUpperCase(Locale.ENGLISH));
                }
                E = Collections.unmodifiableList(arrayList);
            }
            list = E;
        }
        if (y2 == zzew.REGEXP) {
            str3 = str4;
        } else {
            str3 = null;
        }
        return m52332d(str, y2, D, str4, list, str3, bn8);
    }

    /* renamed from: g */
    public static Boolean m52335g(long j, ln8 ln8) {
        try {
            return m52338j(new BigDecimal(j), ln8, Utils.DOUBLE_EPSILON);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: h */
    public static Boolean m52336h(double d, ln8 ln8) {
        try {
            return m52338j(new BigDecimal(d), ln8, Math.ulp(d));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: i */
    public static Boolean m52337i(String str, ln8 ln8) {
        if (!w59.m53709C(str)) {
            return null;
        }
        try {
            return m52338j(new BigDecimal(str), ln8, Utils.DOUBLE_EPSILON);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: j */
    public static Boolean m52338j(BigDecimal bigDecimal, ln8 ln8, double d) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        cu4.m43221k(ln8);
        if (ln8.mo45471x() && ln8.mo45472y() != zzep.UNKNOWN_COMPARISON_TYPE) {
            zzep y = ln8.mo45472y();
            zzep zzep = zzep.BETWEEN;
            if (y == zzep) {
                if (!ln8.mo45467E() || !ln8.mo45469G()) {
                    return null;
                }
            } else if (!ln8.mo45465C()) {
                return null;
            }
            zzep y2 = ln8.mo45472y();
            if (ln8.mo45472y() == zzep) {
                if (w59.m53709C(ln8.mo45468F()) && w59.m53709C(ln8.mo45470H())) {
                    try {
                        BigDecimal bigDecimal5 = new BigDecimal(ln8.mo45468F());
                        bigDecimal3 = new BigDecimal(ln8.mo45470H());
                        bigDecimal2 = bigDecimal5;
                        bigDecimal4 = null;
                    } catch (NumberFormatException unused) {
                    }
                }
                return null;
            } else if (!w59.m53709C(ln8.mo45466D())) {
                return null;
            } else {
                try {
                    bigDecimal4 = new BigDecimal(ln8.mo45466D());
                    bigDecimal2 = null;
                    bigDecimal3 = null;
                } catch (NumberFormatException unused2) {
                }
            }
            if (y2 == zzep) {
                if (bigDecimal2 == null) {
                    return null;
                }
            } else if (bigDecimal4 == null) {
                return null;
            }
            zzew zzew = zzew.UNKNOWN_MATCH_TYPE;
            int ordinal = y2.ordinal();
            boolean z = true;
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4 || bigDecimal2 == null) {
                            return null;
                        }
                        if (bigDecimal.compareTo(bigDecimal2) < 0 || bigDecimal.compareTo(bigDecimal3) > 0) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    } else if (bigDecimal4 == null) {
                        return null;
                    } else {
                        if (d != Utils.DOUBLE_EPSILON) {
                            if (bigDecimal.compareTo(bigDecimal4.subtract(new BigDecimal(d).multiply(new BigDecimal(2)))) <= 0 || bigDecimal.compareTo(bigDecimal4.add(new BigDecimal(d).multiply(new BigDecimal(2)))) >= 0) {
                                z = false;
                            }
                            return Boolean.valueOf(z);
                        }
                        if (bigDecimal.compareTo(bigDecimal4) != 0) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    }
                } else if (bigDecimal4 == null) {
                    return null;
                } else {
                    if (bigDecimal.compareTo(bigDecimal4) <= 0) {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                }
            } else if (bigDecimal4 == null) {
                return null;
            } else {
                if (bigDecimal.compareTo(bigDecimal4) >= 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }
        return null;
    }

    /* renamed from: a */
    public abstract int mo30028a();

    /* renamed from: b */
    public abstract boolean mo30029b();

    /* renamed from: c */
    public abstract boolean mo30030c();
}
