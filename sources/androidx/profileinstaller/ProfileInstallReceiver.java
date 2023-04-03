package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.profileinstaller.C1214b;

public class ProfileInstallReceiver extends BroadcastReceiver {

    /* renamed from: androidx.profileinstaller.ProfileInstallReceiver$a */
    public class C1209a implements C1214b.C1217c {
        public C1209a() {
        }

        /* renamed from: a */
        public void mo8808a(int i, Object obj) {
            C1214b.f6300b.mo8808a(i, obj);
            ProfileInstallReceiver.this.setResultCode(i);
        }
    }

    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
                C1214b.m8646k(context, new ew4(), new C1209a(), true);
            } else if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
                String string = intent.getExtras().getString("EXTRA_SKIP_FILE_OPERATION");
                if ("WRITE_SKIP_FILE".equals(string)) {
                    C1214b.m8647l(context, new ew4(), new C1209a());
                } else if ("DELETE_SKIP_FILE".equals(string)) {
                    C1214b.m8638c(context, new ew4(), new C1209a());
                }
            }
        }
    }
}
