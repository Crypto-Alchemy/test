package p000;

import com.google.android.gms.internal.vision.zzht;

/* renamed from: g89 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public final class g89 {
    /* renamed from: a */
    public static String m44665a(zzht zzht) {
        m89 m89 = new m89(zzht);
        StringBuilder sb = new StringBuilder(m89.zza());
        for (int i = 0; i < m89.zza(); i++) {
            byte d = m89.mo44703d(i);
            if (d == 34) {
                sb.append("\\\"");
            } else if (d == 39) {
                sb.append("\\'");
            } else if (d != 92) {
                switch (d) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (d >= 32 && d <= 126) {
                            sb.append((char) d);
                            break;
                        } else {
                            sb.append('\\');
                            sb.append((char) (((d >>> 6) & 3) + 48));
                            sb.append((char) (((d >>> 3) & 7) + 48));
                            sb.append((char) ((d & 7) + 48));
                            break;
                        }
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
