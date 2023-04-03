package p000;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: z09 */
public final class z09 {

    /* renamed from: a */
    public static SharedPreferences f35978a;

    /* renamed from: a */
    public static SharedPreferences m54937a(Context context) throws Exception {
        SharedPreferences sharedPreferences;
        synchronized (SharedPreferences.class) {
            if (f35978a == null) {
                f35978a = (SharedPreferences) wk8.m53945a(new a49(context));
            }
            sharedPreferences = f35978a;
        }
        return sharedPreferences;
    }
}
