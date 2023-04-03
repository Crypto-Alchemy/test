package p000;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.provider.ContactsContract;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* renamed from: hj3 */
/* compiled from: LocalContentUriFetchProducer */
public class hj3 extends jj3 {

    /* renamed from: d */
    public static final String[] f12913d = {"_id", "_data"};

    /* renamed from: c */
    public final ContentResolver f12914c;

    public hj3(Executor executor, qs4 qs4, ContentResolver contentResolver) {
        super(executor, qs4);
        this.f12914c = contentResolver;
    }

    /* renamed from: c */
    public gp1 mo19919c(ImageRequest imageRequest) throws IOException {
        gp1 f;
        InputStream inputStream;
        Uri u = imageRequest.mo13458u();
        if (i57.m19425h(u)) {
            if (u.toString().endsWith("/photo")) {
                inputStream = this.f12914c.openInputStream(u);
            } else if (u.toString().endsWith("/display_photo")) {
                try {
                    AssetFileDescriptor openAssetFileDescriptor = this.f12914c.openAssetFileDescriptor(u, "r");
                    au4.m10792g(openAssetFileDescriptor);
                    inputStream = openAssetFileDescriptor.createInputStream();
                } catch (IOException unused) {
                    throw new IOException("Contact photo does not exist: " + u);
                }
            } else {
                InputStream openContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(this.f12914c, u);
                if (openContactPhotoInputStream != null) {
                    inputStream = openContactPhotoInputStream;
                } else {
                    throw new IOException("Contact photo does not exist: " + u);
                }
            }
            au4.m10792g(inputStream);
            return mo21937d(inputStream, -1);
        } else if (!i57.m19424g(u) || (f = mo21200f(u)) == null) {
            return mo21937d((InputStream) au4.m10792g(this.f12914c.openInputStream(u)), -1);
        } else {
            return f;
        }
    }

    /* renamed from: e */
    public String mo19920e() {
        return "LocalContentUriFetchProducer";
    }

    /* renamed from: f */
    public final gp1 mo21200f(Uri uri) throws IOException {
        try {
            ParcelFileDescriptor openFileDescriptor = this.f12914c.openFileDescriptor(uri, "r");
            au4.m10792g(openFileDescriptor);
            return mo21937d(new FileInputStream(openFileDescriptor.getFileDescriptor()), (int) openFileDescriptor.getStatSize());
        } catch (FileNotFoundException unused) {
            return null;
        }
    }
}
