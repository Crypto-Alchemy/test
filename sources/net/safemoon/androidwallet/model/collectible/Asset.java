package net.safemoon.androidwallet.model.collectible;

import com.google.gson.Gson;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44876d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 @2\u00020\u0001:\u0001@B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010>\u001a\u00020\u0010H\u0016J\u0006\u0010?\u001a\u00020\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u0010\n\u0002\u0010!\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010\"\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0012\"\u0004\b$\u0010\u0014R\u001c\u0010%\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0012\"\u0004\b'\u0010\u0014R\u001c\u0010(\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0012\"\u0004\b*\u0010\u0014R\u001c\u0010+\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0012\"\u0004\b-\u0010\u0014R\u001c\u0010.\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0012\"\u0004\b0\u0010\u0014R\u001c\u00101\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0012\"\u0004\b3\u0010\u0014R\u001c\u00104\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0012\"\u0004\b6\u0010\u0014R \u00107\u001a\b\u0012\u0004\u0012\u00020908X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=¨\u0006A"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/collectible/Asset;", "", "()V", "asset_contract", "Lnet/safemoon/androidwallet/model/collectible/AssetContract;", "getAsset_contract", "()Lnet/safemoon/androidwallet/model/collectible/AssetContract;", "setAsset_contract", "(Lnet/safemoon/androidwallet/model/collectible/AssetContract;)V", "collection", "Lnet/safemoon/androidwallet/model/collectible/Collectible;", "getCollection", "()Lnet/safemoon/androidwallet/model/collectible/Collectible;", "setCollection", "(Lnet/safemoon/androidwallet/model/collectible/Collectible;)V", "description", "", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", "externalLink", "getExternalLink", "setExternalLink", "external_link", "getExternal_link", "setExternal_link", "id", "", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "image_original_url", "getImage_original_url", "setImage_original_url", "image_preview_url", "getImage_preview_url", "setImage_preview_url", "image_thumbnail_url", "getImage_thumbnail_url", "setImage_thumbnail_url", "image_url", "getImage_url", "setImage_url", "name", "getName", "setName", "permalink", "getPermalink", "setPermalink", "token_id", "getToken_id", "setToken_id", "traits", "", "Lnet/safemoon/androidwallet/model/collectible/AssetTrait;", "getTraits", "()Ljava/util/List;", "setTraits", "(Ljava/util/List;)V", "toString", "traitsInString", "Companion", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: Asset.kt */
public final class Asset {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private AssetContract asset_contract;
    private Collectible collection;
    private String description;
    private String externalLink;
    private String external_link;

    /* renamed from: id */
    private Integer f42453id;
    private String image_original_url;
    private String image_preview_url;
    private String image_thumbnail_url;
    private String image_url;
    private String name;
    private String permalink;
    private String token_id;
    private List<AssetTrait> traits = ck0.m33062j();

    @Metadata(mo44876d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, mo44877d2 = {"Lnet/safemoon/androidwallet/model/collectible/Asset$Companion;", "", "()V", "fromString", "Lnet/safemoon/androidwallet/model/collectible/Asset;", "assetString", "", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* compiled from: Asset.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Asset fromString(String str) {
            try {
                return (Asset) new Gson().fromJson(str, Asset.class);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public final AssetContract getAsset_contract() {
        return this.asset_contract;
    }

    public final Collectible getCollection() {
        return this.collection;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getExternalLink() {
        return this.externalLink;
    }

    public final String getExternal_link() {
        return this.external_link;
    }

    public final Integer getId() {
        return this.f42453id;
    }

    public final String getImage_original_url() {
        return this.image_original_url;
    }

    public final String getImage_preview_url() {
        return this.image_preview_url;
    }

    public final String getImage_thumbnail_url() {
        return this.image_thumbnail_url;
    }

    public final String getImage_url() {
        return this.image_url;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPermalink() {
        return this.permalink;
    }

    public final String getToken_id() {
        return this.token_id;
    }

    public final List<AssetTrait> getTraits() {
        return this.traits;
    }

    public final void setAsset_contract(AssetContract assetContract) {
        this.asset_contract = assetContract;
    }

    public final void setCollection(Collectible collectible) {
        this.collection = collectible;
    }

    public final void setDescription(String str) {
        this.description = str;
    }

    public final void setExternalLink(String str) {
        this.externalLink = str;
    }

    public final void setExternal_link(String str) {
        this.external_link = str;
    }

    public final void setId(Integer num) {
        this.f42453id = num;
    }

    public final void setImage_original_url(String str) {
        this.image_original_url = str;
    }

    public final void setImage_preview_url(String str) {
        this.image_preview_url = str;
    }

    public final void setImage_thumbnail_url(String str) {
        this.image_thumbnail_url = str;
    }

    public final void setImage_url(String str) {
        this.image_url = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setPermalink(String str) {
        this.permalink = str;
    }

    public final void setToken_id(String str) {
        this.token_id = str;
    }

    public final void setTraits(List<AssetTrait> list) {
        vx2.m53591g(list, "<set-?>");
        this.traits = list;
    }

    public String toString() {
        String json = new Gson().toJson((Object) this, (Type) Asset.class);
        vx2.m53590f(json, "Gson().toJson(this, Asset::class.java)");
        return json;
    }

    public final String traitsInString() {
        String json = new Gson().toJson((Object) this.traits, new Asset$traitsInString$type$1().getType());
        vx2.m53590f(json, "Gson().toJson(traits, type)");
        return json;
    }
}
