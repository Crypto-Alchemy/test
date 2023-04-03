package zendesk.core;

import java.util.List;

class Attachment {
    private String contentType;
    private String contentUrl;
    private String fileName;

    /* renamed from: id */
    private Long f46788id;
    private String mappedContentUrl;
    private Long size;
    private List<Attachment> thumbnails;
    private String url;

    public String getContentType() {
        return this.contentType;
    }

    public String getContentUrl() {
        return this.contentUrl;
    }

    public String getFileName() {
        return this.fileName;
    }

    public Long getId() {
        return this.f46788id;
    }

    public Long getSize() {
        return this.size;
    }

    public List<Attachment> getThumbnails() {
        return kj0.m47112c(this.thumbnails);
    }

    public String getUrl() {
        return this.url;
    }
}
