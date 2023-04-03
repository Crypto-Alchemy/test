package p000;

import android.content.res.Resources;
import android.text.TextUtils;
import androidx.media3.common.C0792h;
import java.util.Locale;

/* renamed from: da1 */
/* compiled from: DefaultTrackNameProvider */
public class da1 implements xs6 {

    /* renamed from: a */
    public final Resources f10581a;

    public da1(Resources resources) {
        this.f10581a = (Resources) C2725kr.m20985e(resources);
    }

    /* renamed from: i */
    public static int m14914i(C0792h hVar) {
        int i = vv3.m29135i(hVar.f4175C);
        if (i != -1) {
            return i;
        }
        if (vv3.m29138l(hVar.f4204y) != null) {
            return 2;
        }
        if (vv3.m29128b(hVar.f4204y) != null) {
            return 1;
        }
        if (hVar.f4180P != -1 || hVar.f4181Q != -1) {
            return 2;
        }
        if (hVar.f4202v0 == -1 && hVar.f4187b1 == -1) {
            return -1;
        }
        return 1;
    }

    /* renamed from: a */
    public String mo18635a(C0792h hVar) {
        String str;
        int i = m14914i(hVar);
        if (i == 2) {
            str = mo18643j(mo18642h(hVar), mo18641g(hVar), mo18637c(hVar));
        } else if (i == 1) {
            str = mo18643j(mo18639e(hVar), mo18636b(hVar), mo18637c(hVar));
        } else {
            str = mo18639e(hVar);
        }
        if (str.length() == 0) {
            return this.f10581a.getString(t45.exo_track_unknown);
        }
        return str;
    }

    /* renamed from: b */
    public final String mo18636b(C0792h hVar) {
        int i = hVar.f4202v0;
        if (i == -1 || i < 1) {
            return "";
        }
        if (i == 1) {
            return this.f10581a.getString(t45.exo_track_mono);
        }
        if (i == 2) {
            return this.f10581a.getString(t45.exo_track_stereo);
        }
        if (i == 6 || i == 7) {
            return this.f10581a.getString(t45.exo_track_surround_5_point_1);
        }
        if (i != 8) {
            return this.f10581a.getString(t45.exo_track_surround);
        }
        return this.f10581a.getString(t45.exo_track_surround_7_point_1);
    }

    /* renamed from: c */
    public final String mo18637c(C0792h hVar) {
        int i = hVar.f4203x;
        if (i == -1) {
            return "";
        }
        return this.f10581a.getString(t45.exo_track_bitrate, new Object[]{Float.valueOf(((float) i) / 1000000.0f)});
    }

    /* renamed from: d */
    public final String mo18638d(C0792h hVar) {
        if (TextUtils.isEmpty(hVar.f4188d)) {
            return "";
        }
        return hVar.f4188d;
    }

    /* renamed from: e */
    public final String mo18639e(C0792h hVar) {
        String j = mo18643j(mo18640f(hVar), mo18642h(hVar));
        if (TextUtils.isEmpty(j)) {
            return mo18638d(hVar);
        }
        return j;
    }

    /* renamed from: f */
    public final String mo18640f(C0792h hVar) {
        Locale locale;
        String str = hVar.f4189e;
        if (TextUtils.isEmpty(str) || "und".equals(str)) {
            return "";
        }
        if (w67.f19021a >= 21) {
            locale = Locale.forLanguageTag(str);
        } else {
            locale = new Locale(str);
        }
        Locale N = w67.m29320N();
        String displayName = locale.getDisplayName(N);
        if (TextUtils.isEmpty(displayName)) {
            return "";
        }
        try {
            int offsetByCodePoints = displayName.offsetByCodePoints(0, 1);
            return displayName.substring(0, offsetByCodePoints).toUpperCase(N) + displayName.substring(offsetByCodePoints);
        } catch (IndexOutOfBoundsException unused) {
            return displayName;
        }
    }

    /* renamed from: g */
    public final String mo18641g(C0792h hVar) {
        int i = hVar.f4180P;
        int i2 = hVar.f4181Q;
        if (i == -1 || i2 == -1) {
            return "";
        }
        return this.f10581a.getString(t45.exo_track_resolution, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
    }

    /* renamed from: h */
    public final String mo18642h(C0792h hVar) {
        String str;
        if ((hVar.f4193k & 2) != 0) {
            str = this.f10581a.getString(t45.exo_track_role_alternate);
        } else {
            str = "";
        }
        if ((hVar.f4193k & 4) != 0) {
            str = mo18643j(str, this.f10581a.getString(t45.exo_track_role_supplementary));
        }
        if ((hVar.f4193k & 8) != 0) {
            str = mo18643j(str, this.f10581a.getString(t45.exo_track_role_commentary));
        }
        if ((hVar.f4193k & 1088) == 0) {
            return str;
        }
        return mo18643j(str, this.f10581a.getString(t45.exo_track_role_closed_captions));
    }

    /* renamed from: j */
    public final String mo18643j(String... strArr) {
        String str = "";
        for (String str2 : strArr) {
            if (str2.length() > 0) {
                if (TextUtils.isEmpty(str)) {
                    str = str2;
                } else {
                    str = this.f10581a.getString(t45.exo_item_list, new Object[]{str, str2});
                }
            }
        }
        return str;
    }
}
