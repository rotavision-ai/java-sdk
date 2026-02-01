# Rotavision Java SDK

Official Java SDK for [Rotavision](https://rotavision.com) AI Trust Infrastructure.

## Installation

### Maven

```xml
<dependency>
    <groupId>com.rotavision</groupId>
    <artifactId>rotavision-java</artifactId>
    <version>0.1.0</version>
</dependency>
```

### Gradle

```groovy
implementation 'com.rotavision:rotavision-java:0.1.0'
```

## Quick Start

```java
import com.rotavision.Rotavision;
import com.rotavision.Vishwas.AnalyzeResult;

Rotavision client = new Rotavision("rv_...");

// Analyze for bias (Vishwas)
AnalyzeResult result = client.vishwas()
    .analyze()
    .text("Loan application response...")
    .demographics("caste", "gender", "region")
    .execute();

System.out.println(result.getBiasScore());

// Monitor AI output (Guardian)
MonitorResult result = client.guardian()
    .monitor()
    .prompt("What is the RBI repo rate?")
    .response("The RBI repo rate is 6.5%...")
    .checks("hallucination", "factuality")
    .execute();

System.out.println(result.getStatus());

// Extract from documents (Dastavez)
ExtractResult result = client.dastavez()
    .extract()
    .document(documentBytes)
    .documentType("aadhaar")
    .maskPii(true)
    .execute();

System.out.println(result.getFields());
```

## Products

| Product | Description |
|---------|-------------|
| **Vishwas** | Trust, Fairness & Explainability |
| **Guardian** | AI Reliability Monitoring |
| **Dastavez** | Document AI + Browser Agents |
| **Sankalp** | Sovereign AI Gateway |
| **Orchestrate** | Multi-Agent Platform |
| **Gati** | Fleet & Mobility Intelligence |

## Documentation

- [API Reference](https://rotavision.com/docs/api/)
- [SDK Documentation](https://rotavision.com/docs/sdks/)
- [Integration Guides](https://rotavision.com/integrations/)

## Requirements

- Java 17+
- API key from [Rotavision](https://rotavision.com/contact/)

## License

Apache 2.0 - See [LICENSE](LICENSE) for details.
