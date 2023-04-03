package p000;

import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest;
import java.util.Comparator;

/* renamed from: az7 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final /* synthetic */ class az7 implements Comparator {

    /* renamed from: a */
    public static final /* synthetic */ az7 f21101a = new az7();

    public final int compare(Object obj, Object obj2) {
        Feature feature = (Feature) obj;
        Feature feature2 = (Feature) obj2;
        Parcelable.Creator<ApiFeatureRequest> creator = ApiFeatureRequest.CREATOR;
        if (!feature.mo30469r1().equals(feature2.mo30469r1())) {
            return feature.mo30469r1().compareTo(feature2.mo30469r1());
        }
        return (feature.mo30470s1() > feature2.mo30470s1() ? 1 : (feature.mo30470s1() == feature2.mo30470s1() ? 0 : -1));
    }
}
