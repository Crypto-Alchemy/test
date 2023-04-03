package p000;

import com.google.android.gms.phenotype.zzi;
import java.util.Comparator;

/* renamed from: f19 */
public final class f19 implements Comparator<zzi> {
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzi zzi = (zzi) obj;
        zzi zzi2 = (zzi) obj2;
        int i = zzi.f23133x;
        int i2 = zzi2.f23133x;
        return i == i2 ? zzi.f23126a.compareTo(zzi2.f23126a) : i - i2;
    }
}
