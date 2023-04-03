package zendesk.messaging;

import java.util.ArrayList;
import java.util.List;
import zendesk.belvedere.MediaResult;

public class BelvedereMediaHolder {
    private List<MediaResult> selectedMedia = new ArrayList();

    public void addAll(List<MediaResult> list) {
        this.selectedMedia.addAll(0, new ArrayList(list));
    }

    public void clear() {
        this.selectedMedia.clear();
    }

    public List<MediaResult> getSelectedMedia() {
        return new ArrayList(this.selectedMedia);
    }

    public int getSelectedMediaCount() {
        return this.selectedMedia.size();
    }

    public void removeAll(List<MediaResult> list) {
        this.selectedMedia.removeAll(new ArrayList(list));
    }
}
