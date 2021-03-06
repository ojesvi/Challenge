package com.opentext.challenge

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * @author ojesvi
 * @since 16.01.2017
 */
@RestController
@RequestMapping("/health")
class HealthEndpoint {

    @GetMapping
    HealthStatusMessage getStatus() {
        new HealthStatusMessage()
    }

}
