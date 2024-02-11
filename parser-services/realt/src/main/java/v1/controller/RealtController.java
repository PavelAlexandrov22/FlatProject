package v1.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import v1.core.ScheduledComponent;


@RestController
@RequestMapping("/start_realt")
public class RealtController {
    private final ScheduledComponent scheduledComponent;
    private final Logger logger = LoggerFactory.getLogger(RealtController.class);

    public RealtController(ScheduledComponent scheduledComponent) {
        this.scheduledComponent = scheduledComponent;
    }

    @GetMapping
    public void startRealtService() {
        scheduledComponent.start();
    }


}
