package p000;

import com.google.android.gms.common.api.C4026c;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.errorprone.annotations.DoNotMock;
import com.google.errorprone.annotations.RestrictedInheritance;

@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms.*", explanation = "Use canonical fakes instead.", link = "go/gmscore-restrictedinheritance")
@DoNotMock("Use canonical fakes instead. go/cheezhead-testing-methodology")
/* renamed from: om6 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public interface om6 extends C4026c<pm6> {
    /* renamed from: a */
    tl6<Void> mo28804a(TelemetryData telemetryData);
}
