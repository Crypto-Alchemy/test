package android.view.autofill;

import android.annotation.NonNull;
import android.annotation.Nullable;
import android.view.View;

public final /* synthetic */ class AutofillManager {

    public /* synthetic */ class AutofillCallback {
        static {
            throw new NoClassDefFoundError();
        }

        public native /* synthetic */ void onAutofillEvent(@NonNull View view, int i, int i2);
    }

    static {
        throw new NoClassDefFoundError();
    }

    public native /* synthetic */ void registerCallback(@Nullable AutofillCallback autofillCallback);

    public native /* synthetic */ void unregisterCallback(@Nullable AutofillCallback autofillCallback);
}
