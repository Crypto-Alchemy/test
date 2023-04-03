package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    public int f22164a = 0;

    /* renamed from: a */
    public static Intent m33580a(Context context, PendingIntent pendingIntent, int i, boolean z) {
        Intent intent = new Intent(context, GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntent);
        intent.putExtra("failing_client_id", i);
        intent.putExtra("notify_manager", z);
        return intent;
    }

    /* renamed from: b */
    public final void mo30492b() {
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            finish();
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
        Integer num = (Integer) extras.get("error_code");
        if (pendingIntent == null && num == null) {
            finish();
        } else if (pendingIntent != null) {
            try {
                startIntentSenderForResult(pendingIntent.getIntentSender(), 1, (Intent) null, 0, 0, 0);
                this.f22164a = 1;
            } catch (ActivityNotFoundException unused) {
                if (extras.getBoolean("notify_manager", true)) {
                    bi2.m32559x(this).mo29596G(new ConnectionResult(22, (PendingIntent) null), getIntent().getIntExtra("failing_client_id", -1));
                } else {
                    String str = "Activity not found while launching " + pendingIntent.toString() + ".";
                    if (Build.FINGERPRINT.contains("generic")) {
                        str.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                    }
                }
                this.f22164a = 1;
                finish();
            } catch (IntentSender.SendIntentException unused2) {
                finish();
            }
        } else {
            yh2.m54754p().mo49674q(this, ((Integer) cu4.m43221k(num)).intValue(), 2, this);
            this.f22164a = 1;
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f22164a = 0;
            setResult(i2, intent);
            if (booleanExtra) {
                bi2 x = bi2.m32559x(this);
                if (i2 == -1) {
                    x.mo29597a();
                } else if (i2 == 0) {
                    x.mo29596G(new ConnectionResult(13, (PendingIntent) null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i == 2) {
            this.f22164a = 0;
            setResult(i2, intent);
        }
        finish();
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f22164a = 0;
        setResult(0);
        finish();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f22164a = bundle.getInt("resolution");
        }
        if (this.f22164a != 1) {
            mo30492b();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f22164a);
        super.onSaveInstanceState(bundle);
    }
}
