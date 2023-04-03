package info.hoang8f.android.segmented.utils;

import android.content.Context;
import info.hoang8f.android.segmented.utils.BootstrapText;

/* renamed from: info.hoang8f.android.segmented.utils.a */
/* compiled from: IconResolver */
public class C5976a {
    /* renamed from: a */
    public static sp2 m45828a(String str) {
        for (sp2 next : r27.m50929a()) {
            if (!next.mo47848b().equals("fontawesome-webfont.ttf") && next.mo47847a(str) != null) {
                return next;
            }
        }
        throw new IllegalArgumentException(String.format("Could not find FontIcon value for '%s', please ensure that it is mapped to a valid font", new Object[]{str}));
    }

    /* renamed from: b */
    public static BootstrapText m45829b(Context context, String str, boolean z) {
        if (str == null) {
            return null;
        }
        BootstrapText.C5975b bVar = new BootstrapText.C5975b(context, z);
        int i = 0;
        int i2 = 0;
        int i3 = -1;
        int i4 = -1;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt == '\\') {
                i += 2;
            } else {
                if (charAt == '{') {
                    i3 = i;
                } else if (charAt == '}') {
                    i4 = i;
                }
                if (!(i3 == -1 || i4 == -1)) {
                    if (i3 >= 0 && i4 < str.length()) {
                        String replaceAll = str.substring(i3 + 1, i4).replaceAll("\\-", "_");
                        bVar.mo43687b(str.substring(i2, i3));
                        if (replaceAll.matches("(fa_|fa-)[a-z_0-9]+")) {
                            if (z) {
                                bVar.mo43687b("?");
                            } else {
                                bVar.mo43686a(replaceAll, r27.m50931c("fontawesome-webfont.ttf", false));
                            }
                        } else if (z) {
                            bVar.mo43687b("?");
                        } else {
                            bVar.mo43686a(replaceAll, m45828a(replaceAll));
                        }
                        i2 = i4 + 1;
                    }
                    i3 = -1;
                    i4 = -1;
                }
            }
            i++;
        }
        return bVar.mo43687b(str.substring(i2, str.length())).mo43688c();
    }
}
