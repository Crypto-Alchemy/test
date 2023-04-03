package p000;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: mr */
/* compiled from: AssetFileDescriptorLocalUriFetcher */
public final class C2847mr extends oj3<AssetFileDescriptor> {
    public C2847mr(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    /* renamed from: a */
    public Class<AssetFileDescriptor> mo11939a() {
        return AssetFileDescriptor.class;
    }

    /* renamed from: g */
    public void mo23315c(AssetFileDescriptor assetFileDescriptor) throws IOException {
        assetFileDescriptor.close();
    }

    /* renamed from: h */
    public AssetFileDescriptor mo23316f(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (openAssetFileDescriptor != null) {
            return openAssetFileDescriptor;
        }
        throw new FileNotFoundException("FileDescriptor is null for: " + uri);
    }
}
