package p000;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Locale;

/* renamed from: f12 */
/* compiled from: FileUtils */
public class f12 {
    /* renamed from: a */
    public static String m44131a(String str) {
        int lastIndexOf;
        if (!kb6.m46949b(str) || (lastIndexOf = str.lastIndexOf(".")) == -1) {
            return "";
        }
        return str.substring(lastIndexOf + 1).toLowerCase(Locale.US).trim();
    }

    /* renamed from: b */
    public static String m44132b(Long l) {
        return m44133c(l, true);
    }

    /* renamed from: c */
    public static String m44133c(Long l, boolean z) {
        int i;
        String str;
        String str2 = "";
        if (l == null || l.longValue() < 0) {
            return str2;
        }
        if (z) {
            i = 1000;
        } else {
            i = RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE;
        }
        if (l.longValue() < ((long) i)) {
            return l + " B";
        }
        double d = (double) i;
        int log = (int) (Math.log((double) l.longValue()) / Math.log(d));
        StringBuilder sb = new StringBuilder();
        if (z) {
            str = "kMGTPE";
        } else {
            str = "KMGTPE";
        }
        sb.append(str.charAt(log - 1));
        if (!z) {
            str2 = "i";
        }
        sb.append(str2);
        String sb2 = sb.toString();
        return String.format(Locale.US, "%.1f %sB", new Object[]{Double.valueOf(((double) l.longValue()) / Math.pow(d, (double) log)), sb2});
    }
}
