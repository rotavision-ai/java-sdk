package com.rotavision;

/**
 * Dastavez - Document AI + Browser Agents API.
 */
public class Dastavez {
    private final Rotavision client;

    Dastavez(Rotavision client) {
        this.client = client;
    }

    public ExtractRequest extract() {
        return new ExtractRequest(this);
    }

    public static class ExtractRequest {
        private final Dastavez dastavez;

        ExtractRequest(Dastavez dastavez) {
            this.dastavez = dastavez;
        }

        public ExtractRequest document(byte[] document) { return this; }
        public ExtractRequest documentType(String type) { return this; }
        public ExtractRequest maskPii(boolean mask) { return this; }

        public ExtractResult execute() {
            throw new UnsupportedOperationException("Coming soon. Contact developers@rotavision.com");
        }
    }

    public static class ExtractResult {
        private String id;
        private String documentType;

        public String getId() { return id; }
        public String getDocumentType() { return documentType; }
    }
}
