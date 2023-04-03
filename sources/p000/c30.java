package p000;

import android.graphics.BitmapFactory;
import android.util.Pair;
import java.io.File;

/* renamed from: c30 */
/* compiled from: BitmapUtils */
public class c30 {
    /* renamed from: a */
    public static Pair<Integer, Integer> m75268a(File file) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        return Pair.create(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
    }
}
