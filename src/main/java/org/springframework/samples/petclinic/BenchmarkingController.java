package org.springframework.samples.petclinic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BenchmarkingController {

    @RequestMapping("/unique-start-id")
    public String uniqueStartId() {
        return System.getenv("UNIQUE_START_ID");
    }

    @RequestMapping("/agent-check")
    public String index() {
        try {
            Class.forName("io.opentelemetry.javaagent.OpenTelemetryAgent");
            return "true";
        } catch (ClassNotFoundException e) {
            return "false";
        }
    }
}
