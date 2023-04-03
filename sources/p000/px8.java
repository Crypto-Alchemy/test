package p000;

import com.google.android.gms.internal.vision.zzht;
import java.util.Comparator;

/* renamed from: px8 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public final class px8 implements Comparator<zzht> {
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzht zzht = (zzht) obj;
        zzht zzht2 = (zzht) obj2;
        wx8 wx8 = (wx8) zzht.iterator();
        wx8 wx82 = (wx8) zzht2.iterator();
        while (wx8.hasNext() && wx82.hasNext()) {
            int compare = Integer.compare(zzht.m34374e(wx8.zza()), zzht.m34374e(wx82.zza()));
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(zzht.zza(), zzht2.zza());
    }
}
