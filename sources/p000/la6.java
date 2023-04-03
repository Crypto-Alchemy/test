package p000;

import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: la6 */
/* compiled from: StreamAssetPathFetcher */
public class la6 extends C3099pr<InputStream> {
    public la6(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    /* renamed from: a */
    public Class<InputStream> mo11939a() {
        return InputStream.class;
    }

    /* renamed from: g */
    public void mo22713c(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    /* renamed from: h */
    public InputStream mo22714f(AssetManager assetManager, String str) throws IOException {
        return assetManager.open(str);
    }
}
