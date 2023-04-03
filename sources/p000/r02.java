package p000;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: r02 */
/* compiled from: FileDescriptorLocalUriFetcher */
public class r02 extends oj3<ParcelFileDescriptor> {
    public r02(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    /* renamed from: a */
    public Class<ParcelFileDescriptor> mo11939a() {
        return ParcelFileDescriptor.class;
    }

    /* renamed from: g */
    public void mo23315c(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        parcelFileDescriptor.close();
    }

    /* renamed from: h */
    public ParcelFileDescriptor mo23316f(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (openAssetFileDescriptor != null) {
            return openAssetFileDescriptor.getParcelFileDescriptor();
        }
        throw new FileNotFoundException("FileDescriptor is null for: " + uri);
    }
}
