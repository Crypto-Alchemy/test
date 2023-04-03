package zendesk.support.request;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.squareup.picasso.C5453l;
import com.squareup.picasso.C5457o;
import com.squareup.picasso.Picasso;
import com.zendesk.logger.Logger;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import zendesk.support.PicassoTransformations;

class CellAttachmentLoadingUtil {
    private static final String LOG_TAG = "AttachmentLoadingUtil";
    /* access modifiers changed from: private */
    public final ImageLoadingLogic imageLoadingLogic;
    private final ImageSizingLogic imageSizingLogic;

    public static class ImageLoadingLogic {
        private static final int IMAGE_DOWNSCALE_FACTOR = 2;
        private final Picasso picasso;

        public static class DefaultDisplayStrategy implements LoadingStrategy {
            private DefaultDisplayStrategy() {
            }

            public void load(ImageView imageView, ImageSizingLogic.ImageDimensions imageDimensions) {
            }
        }

        public static class DisplayImageFromLocalSource implements LoadingStrategy {
            private final C5453l requestCreator;

            public void load(ImageView imageView, ImageSizingLogic.ImageDimensions imageDimensions) {
                ImageLoadingLogic.loadImage(imageView, this.requestCreator.mo39589j().mo39588i(), imageDimensions, (q90) null);
            }

            private DisplayImageFromLocalSource(C5453l lVar) {
                this.requestCreator = lVar;
            }
        }

        public static class DisplayImageFromWeb implements LoadingStrategy {
            public final Picasso picasso;
            public final String thumbnailUrl;
            public final String url;

            public void load(final ImageView imageView, final ImageSizingLogic.ImageDimensions imageDimensions) {
                ImageLoadingLogic.loadImage(imageView, this.picasso.mo39469l(this.thumbnailUrl).mo39591l(PicassoTransformations.getBlurTransformation(imageView.getContext().getApplicationContext())), imageDimensions, new q90() {
                    public void onError(Exception exc) {
                        Logger.m43078b(RequestActivity.LOG_TAG, "Unable to load thumbnail. Url: '%s'", DisplayImageFromWeb.this.thumbnailUrl, exc);
                        ImageView imageView = imageView;
                        DisplayImageFromWeb displayImageFromWeb = DisplayImageFromWeb.this;
                        ImageLoadingLogic.loadImage(imageView, displayImageFromWeb.picasso.mo39469l(displayImageFromWeb.url).mo39589j(), imageDimensions, (q90) null);
                    }

                    public void onSuccess() {
                        ImageView imageView = imageView;
                        DisplayImageFromWeb displayImageFromWeb = DisplayImageFromWeb.this;
                        ImageLoadingLogic.loadImage(imageView, displayImageFromWeb.picasso.mo39469l(displayImageFromWeb.url).mo39589j(), imageDimensions, (q90) null);
                    }
                });
            }

            private DisplayImageFromWeb(Picasso picasso2, String str, String str2) {
                this.picasso = picasso2;
                this.url = str;
                this.thumbnailUrl = str2;
            }
        }

        public interface LoadingStrategy {
            void load(ImageView imageView, ImageSizingLogic.ImageDimensions imageDimensions);
        }

        public ImageLoadingLogic(Picasso picasso2) {
            this.picasso = picasso2;
        }

        private LoadingStrategy getLoadingStrategy(StateRequestAttachment stateRequestAttachment) {
            if (stateRequestAttachment.getLocalFile() != null && stateRequestAttachment.getLocalFile().exists() && stateRequestAttachment.getLocalFile().length() > 0) {
                return new DisplayImageFromLocalSource(this.picasso.mo39468k(stateRequestAttachment.getLocalFile()));
            }
            if (kb6.m46949b(stateRequestAttachment.getLocalUri()) && Uri.parse(stateRequestAttachment.getLocalUri()) != null) {
                return new DisplayImageFromLocalSource(this.picasso.mo39467j(stateRequestAttachment.getParsedLocalUri()));
            }
            if (kb6.m46949b(stateRequestAttachment.getUrl()) && kb6.m46949b(stateRequestAttachment.getThumbnailUrl())) {
                return new DisplayImageFromWeb(this.picasso, stateRequestAttachment.getUrl(), stateRequestAttachment.getThumbnailUrl());
            }
            Logger.m43078b(RequestActivity.LOG_TAG, "Can't load image. Id: %s", Long.valueOf(stateRequestAttachment.getId()));
            return new DefaultDisplayStrategy();
        }

        /* access modifiers changed from: private */
        public static void loadImage(ImageView imageView, C5453l lVar, ImageSizingLogic.ImageDimensions imageDimensions, q90 q90) {
            lVar.mo39591l(PicassoTransformations.getRoundedTransformation(imageView.getContext().getResources().getDimensionPixelOffset(m25.zs_request_attachment_corner_radius) / 2)).mo39590k(imageDimensions.getImageWidth() / 2, imageDimensions.getImageHeight() / 2).mo39580a().mo39586g(imageView, q90);
        }

        public void initImageView(ImageView imageView) {
            this.picasso.mo39460b(imageView);
            imageView.setImageResource(y15.zs_color_transparent);
        }

        public boolean isImageLoading(ImageView imageView, StateRequestAttachment stateRequestAttachment) {
            Object tag = imageView.getTag();
            if (!(tag instanceof StateRequestAttachment) || ((StateRequestAttachment) tag).getId() != stateRequestAttachment.getId()) {
                return false;
            }
            return true;
        }

        public void loadAttachment(ImageView imageView, StateRequestAttachment stateRequestAttachment, ImageSizingLogic.ImageDimensions imageDimensions) {
            getLoadingStrategy(stateRequestAttachment).load(imageView, imageDimensions);
        }

        public void setImageViewLoading(ImageView imageView, StateRequestAttachment stateRequestAttachment) {
            imageView.setTag(stateRequestAttachment);
        }
    }

    public static class ImageSizingLogic {
        private static final double ASPECT_RATIO = 1.7777777777777777d;
        /* access modifiers changed from: private */
        public final Map<String, ImageDimensions> cachedDimensions = new HashMap();
        private final ImageDimensions maxSize;
        private final Picasso picasso;

        public static class DefaultStrategy implements DimensionStrategy {
            private DefaultStrategy() {
            }

            public void findDimensions(op7<ImageDimensions> op7) {
                op7.onSuccess(new ImageDimensions());
            }
        }

        public interface DimensionStrategy {
            void findDimensions(op7<ImageDimensions> op7);
        }

        public static class ExistingDimensions implements DimensionStrategy {
            private final int height;
            private final ImageDimensions maxSize;
            private final int width;

            public ExistingDimensions(int i, int i2, ImageDimensions imageDimensions) {
                this.width = i;
                this.height = i2;
                this.maxSize = imageDimensions;
            }

            public void findDimensions(op7<ImageDimensions> op7) {
                op7.onSuccess(ImageSizingLogic.determineTargetDimensions(this.width, this.height, this.maxSize.getImageWidth(), this.maxSize.getImageHeight()));
            }
        }

        public static class ReadFromBitmap implements DimensionStrategy {
            public final File file;
            private final ImageDimensions maxSize;

            public ReadFromBitmap(File file2, ImageDimensions imageDimensions) {
                this.maxSize = imageDimensions;
                this.file = file2;
            }

            private ImageDimensions loadImageDimensions(File file2) {
                ImageDimensions imageDimensions = new ImageDimensions();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(file2.getAbsolutePath(), options);
                imageDimensions.setDimensions(options.outWidth, options.outHeight);
                return imageDimensions;
            }

            public void findDimensions(op7<ImageDimensions> op7) {
                ImageDimensions loadImageDimensions = loadImageDimensions(this.file);
                op7.onSuccess(ImageSizingLogic.determineTargetDimensions(loadImageDimensions.getImageWidth(), loadImageDimensions.getImageHeight(), this.maxSize.getImageWidth(), this.maxSize.getImageHeight()));
            }
        }

        public static class ReadFromPicasso implements DimensionStrategy {
            /* access modifiers changed from: private */
            public static final List<C5457o> TARGET_REFERENCE_TRAP = new ArrayList();
            /* access modifiers changed from: private */
            public final ImageDimensions maxSize;
            private final C5453l requestCreator;

            public void findDimensions(final op7<ImageDimensions> op7) {
                C100831 r0 = new C5457o() {
                    public void onBitmapFailed(Exception exc, Drawable drawable) {
                        Logger.m43078b(RequestActivity.LOG_TAG, "Unable to load image.", new Object[0]);
                        op7.onSuccess(new ImageDimensions());
                        ReadFromPicasso.TARGET_REFERENCE_TRAP.remove(this);
                    }

                    public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
                        op7.onSuccess(ImageSizingLogic.determineTargetDimensions(bitmap.getWidth(), bitmap.getHeight(), ReadFromPicasso.this.maxSize.getImageWidth(), ReadFromPicasso.this.maxSize.getImageHeight()));
                        ReadFromPicasso.TARGET_REFERENCE_TRAP.remove(this);
                    }

                    public void onPrepareLoad(Drawable drawable) {
                    }
                };
                TARGET_REFERENCE_TRAP.add(r0);
                this.requestCreator.mo39587h(r0);
            }

            private ReadFromPicasso(C5453l lVar, ImageDimensions imageDimensions) {
                this.requestCreator = lVar;
                this.maxSize = imageDimensions;
            }
        }

        public ImageSizingLogic(Picasso picasso2, Context context) {
            this.picasso = picasso2;
            this.maxSize = getMaxSize(context);
        }

        private int calculateMaxWidth(Context context) {
            Resources resources = context.getResources();
            return (resources.getDisplayMetrics().widthPixels - resources.getDimensionPixelSize(m25.zs_request_message_composer_expanded_side_margin)) - resources.getDimensionPixelSize(m25.zs_request_message_margin_side);
        }

        public static ImageDimensions determineTargetDimensions(int i, int i2, int i3, int i4) {
            ImageDimensions imageDimensions = new ImageDimensions();
            int i5 = (int) (((double) i3) / ((((double) i) * 1.0d) / ((double) i2)));
            if (i > i2) {
                if (i > i3) {
                    i = i3;
                }
                imageDimensions.setDimensions(i, Math.max(Math.min(i4, i2), 0));
                return imageDimensions;
            }
            if (i2 > i5) {
                i = Math.min(i3, i);
            }
            imageDimensions.setDimensions(i, Math.max(Math.min(i4, i2), 0));
            return imageDimensions;
            i2 = i5;
            imageDimensions.setDimensions(i, Math.max(Math.min(i4, i2), 0));
            return imageDimensions;
        }

        private DimensionStrategy getDimensionStrategy(StateRequestAttachment stateRequestAttachment, ImageDimensions imageDimensions) {
            if (stateRequestAttachment.getHeight() > 0 && stateRequestAttachment.getWidth() > 0) {
                return new ExistingDimensions(stateRequestAttachment.getWidth(), stateRequestAttachment.getHeight(), imageDimensions);
            }
            if (kb6.m46949b(stateRequestAttachment.getLocalUri()) && this.cachedDimensions.containsKey(stateRequestAttachment.getLocalUri())) {
                ImageDimensions imageDimensions2 = this.cachedDimensions.get(stateRequestAttachment.getLocalUri());
                return new ExistingDimensions(imageDimensions2.getImageWidth(), imageDimensions2.getImageHeight(), imageDimensions);
            } else if (stateRequestAttachment.getLocalFile() != null && stateRequestAttachment.getLocalFile().exists() && stateRequestAttachment.getLocalFile().length() > 0) {
                return new ReadFromBitmap(stateRequestAttachment.getLocalFile(), imageDimensions);
            } else {
                if (kb6.m46949b(stateRequestAttachment.getLocalUri()) && Uri.parse(stateRequestAttachment.getLocalUri()) != null) {
                    return new ReadFromPicasso(this.picasso.mo39467j(Uri.parse(stateRequestAttachment.getLocalUri())), imageDimensions);
                } else if (kb6.m46949b(stateRequestAttachment.getUrl())) {
                    return new ReadFromPicasso(this.picasso.mo39469l(stateRequestAttachment.getUrl()), imageDimensions);
                } else {
                    Logger.m43078b(RequestActivity.LOG_TAG, "Can't load dimensions. Id: %s", Long.valueOf(stateRequestAttachment.getId()));
                    return new DefaultStrategy();
                }
            }
        }

        public ImageDimensions getMaxSize() {
            return this.maxSize;
        }

        public void loadDimensionsForAttachment(final StateRequestAttachment stateRequestAttachment, final op7<ImageDimensions> op7) {
            getDimensionStrategy(stateRequestAttachment, this.maxSize).findDimensions(new op7<ImageDimensions>() {
                public void onError(hr1 hr1) {
                }

                public void onSuccess(ImageDimensions imageDimensions) {
                    if (kb6.m46949b(stateRequestAttachment.getLocalUri()) && imageDimensions.areKnown()) {
                        ImageSizingLogic.this.cachedDimensions.put(stateRequestAttachment.getLocalUri(), imageDimensions);
                    }
                    op7.onSuccess(imageDimensions);
                }
            });
        }

        private ImageDimensions getMaxSize(Context context) {
            int calculateMaxWidth = calculateMaxWidth(context);
            return new ImageDimensions(calculateMaxWidth, (int) (((double) calculateMaxWidth) / ASPECT_RATIO));
        }

        public static class ImageDimensions {
            private static final int UNKNOWN_DIMENSION = -1;
            private int imageHeight;
            private int imageWidth;

            public ImageDimensions(int i, int i2) {
                this.imageWidth = i;
                this.imageHeight = i2;
            }

            public boolean areKnown() {
                if (this.imageWidth == -1 || this.imageHeight == -1) {
                    return false;
                }
                return true;
            }

            public int getImageHeight() {
                return this.imageHeight;
            }

            public int getImageWidth() {
                return this.imageWidth;
            }

            public void setDimensions(int i, int i2) {
                this.imageWidth = i;
                this.imageHeight = i2;
            }

            public String toString() {
                return "ImageDimensions{width=" + this.imageWidth + ", height=" + this.imageHeight + '}';
            }

            public ImageDimensions() {
                this.imageWidth = -1;
                this.imageHeight = -1;
            }
        }
    }

    public CellAttachmentLoadingUtil(Picasso picasso, Context context) {
        this.imageSizingLogic = new ImageSizingLogic(picasso, context);
        this.imageLoadingLogic = new ImageLoadingLogic(picasso);
    }

    /* access modifiers changed from: private */
    public void adjustImageViewDimensions(ImageView imageView, ImageSizingLogic.ImageDimensions imageDimensions) {
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.width = imageDimensions.getImageWidth();
        layoutParams.height = imageDimensions.getImageHeight();
        imageView.setLayoutParams(layoutParams);
    }

    public void bindImage(final ImageView imageView, final StateRequestAttachment stateRequestAttachment) {
        if (!this.imageLoadingLogic.isImageLoading(imageView, stateRequestAttachment)) {
            this.imageLoadingLogic.setImageViewLoading(imageView, stateRequestAttachment);
            adjustImageViewDimensions(imageView, this.imageSizingLogic.getMaxSize());
            this.imageLoadingLogic.initImageView(imageView);
            this.imageSizingLogic.loadDimensionsForAttachment(stateRequestAttachment, new op7<ImageSizingLogic.ImageDimensions>() {
                public void onError(hr1 hr1) {
                }

                public void onSuccess(ImageSizingLogic.ImageDimensions imageDimensions) {
                    if (imageDimensions.areKnown()) {
                        CellAttachmentLoadingUtil.this.adjustImageViewDimensions(imageView, imageDimensions);
                        CellAttachmentLoadingUtil.this.imageLoadingLogic.loadAttachment(imageView, stateRequestAttachment, imageDimensions);
                        return;
                    }
                    Logger.m43078b(RequestActivity.LOG_TAG, "Unable retrieve image size. Id: %s", Long.valueOf(stateRequestAttachment.getId()));
                }
            });
        }
    }
}
