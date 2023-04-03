package zendesk.support.request;

import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import zendesk.belvedere.BelvedereUi;
import zendesk.belvedere.MediaResult;

class AttachmentHelper {
    private List<StateRequestAttachment> additionalAttachments;
    private long maxFileSize = -1;
    private List<StateRequestAttachment> selectedAttachments;
    private final int[] touchableItems;

    public AttachmentHelper(int... iArr) {
        this.touchableItems = iArr;
        this.selectedAttachments = new ArrayList();
        this.additionalAttachments = new ArrayList();
    }

    private List<MediaResult> requestAttachmentsToMediaResult(List<StateRequestAttachment> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (StateRequestAttachment convert : list) {
            arrayList.add(StateRequestAttachment.convert(convert));
        }
        return arrayList;
    }

    public List<StateRequestAttachment> getSelectedAttachments() {
        return kj0.m47112c(this.selectedAttachments);
    }

    public void showImagePicker(AppCompatActivity appCompatActivity) {
        BelvedereUi.C9779b i = BelvedereUi.m75342a(appCompatActivity).mo73629g().mo73630h("*/*", true).mo73634l(requestAttachmentsToMediaResult(this.selectedAttachments)).mo73632j(appCompatActivity.getResources().getBoolean(o15.zs_request_image_picker_full_screen)).mo73631i(requestAttachmentsToMediaResult(this.additionalAttachments));
        int[] iArr = this.touchableItems;
        if (iArr != null && iArr.length > 0) {
            i = i.mo73635m(iArr);
        }
        long j = this.maxFileSize;
        if (j > 0) {
            i = i.mo73633k(j);
        }
        i.mo73628f(appCompatActivity);
    }

    public void updateAttachments(Collection<StateRequestAttachment> collection, Collection<StateRequestAttachment> collection2) {
        this.selectedAttachments = kj0.m47112c(new ArrayList(collection));
        this.additionalAttachments = kj0.m47112c(new ArrayList(collection2));
    }

    public void updateMaxFileSize(long j) {
        this.maxFileSize = j;
    }
}
