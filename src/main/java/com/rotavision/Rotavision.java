package com.rotavision;

/**
 * Main client for Rotavision AI Trust Infrastructure.
 *
 * <p>Example usage:
 * <pre>{@code
 * Rotavision client = new Rotavision("rv_...");
 *
 * // Analyze for bias
 * AnalyzeResult result = client.vishwas()
 *     .analyze()
 *     .text("Loan application response...")
 *     .demographics("caste", "gender")
 *     .execute();
 *
 * System.out.println(result.getBiasScore());
 * }</pre>
 *
 * @see <a href="https://rotavision.com/docs">Documentation</a>
 */
public class Rotavision {
    private static final String DEFAULT_BASE_URL = "https://api.rotavision.com";

    private final String apiKey;
    private final String baseUrl;
    private final int timeoutMs;

    private Vishwas vishwas;
    private Guardian guardian;
    private Dastavez dastavez;
    private Sankalp sankalp;
    private Orchestrate orchestrate;
    private Gati gati;

    /**
     * Create a new Rotavision client.
     *
     * @param apiKey Your Rotavision API key (rv_live_... or rv_test_...)
     */
    public Rotavision(String apiKey) {
        this(apiKey, DEFAULT_BASE_URL, 30000);
    }

    /**
     * Create a new Rotavision client with custom configuration.
     *
     * @param apiKey Your Rotavision API key
     * @param baseUrl Custom API base URL
     * @param timeoutMs Request timeout in milliseconds
     */
    public Rotavision(String apiKey, String baseUrl, int timeoutMs) {
        this.apiKey = apiKey;
        this.baseUrl = baseUrl;
        this.timeoutMs = timeoutMs;
    }

    /**
     * Get the Vishwas client for trust, fairness, and explainability.
     */
    public Vishwas vishwas() {
        if (vishwas == null) {
            vishwas = new Vishwas(this);
        }
        return vishwas;
    }

    /**
     * Get the Guardian client for AI reliability monitoring.
     */
    public Guardian guardian() {
        if (guardian == null) {
            guardian = new Guardian(this);
        }
        return guardian;
    }

    /**
     * Get the Dastavez client for document AI and browser agents.
     */
    public Dastavez dastavez() {
        if (dastavez == null) {
            dastavez = new Dastavez(this);
        }
        return dastavez;
    }

    /**
     * Get the Sankalp client for sovereign AI gateway.
     */
    public Sankalp sankalp() {
        if (sankalp == null) {
            sankalp = new Sankalp(this);
        }
        return sankalp;
    }

    /**
     * Get the Orchestrate client for multi-agent platform.
     */
    public Orchestrate orchestrate() {
        if (orchestrate == null) {
            orchestrate = new Orchestrate(this);
        }
        return orchestrate;
    }

    /**
     * Get the Gati client for fleet and mobility intelligence.
     */
    public Gati gati() {
        if (gati == null) {
            gati = new Gati(this);
        }
        return gati;
    }

    // Package-private getters for product clients
    String getApiKey() { return apiKey; }
    String getBaseUrl() { return baseUrl; }
    int getTimeoutMs() { return timeoutMs; }
}
