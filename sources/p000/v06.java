package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import com.onesignal.shortcutbadger.ShortcutBadgeException;
import com.onesignal.shortcutbadger.impl.AdwHomeBadger;
import com.onesignal.shortcutbadger.impl.ApexHomeBadger;
import com.onesignal.shortcutbadger.impl.AsusHomeBadger;
import com.onesignal.shortcutbadger.impl.DefaultBadger;
import com.onesignal.shortcutbadger.impl.EverythingMeHomeBadger;
import com.onesignal.shortcutbadger.impl.HuaweiHomeBadger;
import com.onesignal.shortcutbadger.impl.NewHtcHomeBadger;
import com.onesignal.shortcutbadger.impl.NovaHomeBadger;
import com.onesignal.shortcutbadger.impl.OPPOHomeBader;
import com.onesignal.shortcutbadger.impl.SamsungHomeBadger;
import com.onesignal.shortcutbadger.impl.SonyHomeBadger;
import com.onesignal.shortcutbadger.impl.VivoHomeBadger;
import com.onesignal.shortcutbadger.impl.ZukHomeBadger;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.web3j.ens.contracts.generated.ENS;

/* renamed from: v06 */
/* compiled from: ShortcutBadger */
public final class v06 {

    /* renamed from: a */
    public static final List<Class<? extends C5719cx>> f34807a;

    /* renamed from: b */
    public static final Object f34808b = new Object();

    /* renamed from: c */
    public static C5719cx f34809c;

    /* renamed from: d */
    public static ComponentName f34810d;

    static {
        LinkedList linkedList = new LinkedList();
        f34807a = linkedList;
        linkedList.add(AdwHomeBadger.class);
        linkedList.add(ApexHomeBadger.class);
        linkedList.add(NewHtcHomeBadger.class);
        linkedList.add(NovaHomeBadger.class);
        linkedList.add(SonyHomeBadger.class);
        linkedList.add(AsusHomeBadger.class);
        linkedList.add(HuaweiHomeBadger.class);
        linkedList.add(OPPOHomeBader.class);
        linkedList.add(SamsungHomeBadger.class);
        linkedList.add(ZukHomeBadger.class);
        linkedList.add(VivoHomeBadger.class);
        linkedList.add(EverythingMeHomeBadger.class);
    }

    /* renamed from: a */
    public static void m53172a(Context context, int i) throws ShortcutBadgeException {
        if (f34809c != null || m53173b(context)) {
            try {
                f34809c.mo39107b(context, f34810d, i);
            } catch (Exception e) {
                throw new ShortcutBadgeException("Unable to execute badge", e);
            }
        } else {
            throw new ShortcutBadgeException("No default launcher available");
        }
    }

    /* renamed from: b */
    public static boolean m53173b(Context context) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to find launch intent for package ");
            sb.append(context.getPackageName());
            return false;
        }
        f34810d = launchIntentForPackage.getComponent();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
        if (resolveActivity == null || resolveActivity.activityInfo.name.toLowerCase().contains(ENS.FUNC_RESOLVER)) {
            return false;
        }
        String str = resolveActivity.activityInfo.packageName;
        Iterator<Class<? extends C5719cx>> it = f34807a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C5719cx cxVar = null;
            try {
                cxVar = (C5719cx) it.next().newInstance();
            } catch (Exception unused) {
            }
            if (cxVar != null && cxVar.mo39106a().contains(str)) {
                f34809c = cxVar;
                break;
            }
        }
        if (f34809c != null) {
            return true;
        }
        String str2 = Build.MANUFACTURER;
        if (str2.equalsIgnoreCase("ZUK")) {
            f34809c = new ZukHomeBadger();
            return true;
        } else if (str2.equalsIgnoreCase("OPPO")) {
            f34809c = new OPPOHomeBader();
            return true;
        } else if (str2.equalsIgnoreCase("VIVO")) {
            f34809c = new VivoHomeBadger();
            return true;
        } else {
            f34809c = new DefaultBadger();
            return true;
        }
    }
}
