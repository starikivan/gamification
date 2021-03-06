package juja.microservices.gamification.entity;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class InterviewRequestTest {

    @Test
    public void shouldReturnInterview() {
        String expectedUserFrom = "sasha";
        String expectedDescription = "Interview report";

        InterviewRequest interviewRequest = new InterviewRequest("sasha", "Interview report");

        assertNotNull(interviewRequest);
        assertEquals(expectedUserFrom, interviewRequest.getFrom());
        assertEquals(expectedDescription, interviewRequest.getDescription());
    }
}
