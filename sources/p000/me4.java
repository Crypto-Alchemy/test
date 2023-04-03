package p000;

import com.onesignal.C5305o0;
import com.onesignal.C5323s0;
import java.util.Arrays;
import java.util.HashSet;

/* renamed from: me4 */
/* compiled from: OSTaskRemoteController */
public class me4 extends C5323s0 {

    /* renamed from: f */
    public static final HashSet<String> f31673f = new HashSet<>(Arrays.asList(new String[]{"getTags()", "setSMSNumber()", "setEmail()", "logoutSMSNumber()", "logoutEmail()", "syncHashedEmail()", "setExternalUserId()", "setLanguage()", "setSubscription()", "promptLocation()", "idsAvailable()", "sendTag()", "sendTags()", "setLocationShared()", "setDisableGMSMissingPrompt()", "setRequiresUserPrivacyConsent()", "unsubscribeWhenNotificationsAreDisabled()", "handleNotificationOpen()", "onAppLostFocus()", "sendOutcome()", "sendUniqueOutcome()", "sendOutcomeWithValue()", "removeGroupedNotifications()", "removeNotification()", "clearOneSignalNotifications()"}));

    /* renamed from: e */
    public final C5305o0 f31674e;

    public me4(C5305o0 o0Var, ld4 ld4) {
        super(ld4);
        this.f31674e = o0Var;
    }

    /* renamed from: g */
    public boolean mo45777g(String str) {
        if (this.f31674e.mo39045k() || !f31673f.contains(str)) {
            return false;
        }
        return true;
    }
}
