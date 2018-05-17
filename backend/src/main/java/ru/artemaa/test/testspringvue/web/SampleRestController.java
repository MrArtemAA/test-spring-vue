package ru.artemaa.test.testspringvue.web;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import static ru.artemaa.test.testspringvue.web.SampleRestController.URL;

@RestController
@RequestMapping(URL)
public class SampleRestController {
    static final String URL = "/api/v1/sample";

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Test> getAll() {
        return Arrays.asList(
                new Test(UUID.randomUUID(), "Test 1"),
                new Test(UUID.randomUUID(), "Test 2")
        );
    }

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    private static class Test {
        private UUID id;
        private String name;
    }
}
