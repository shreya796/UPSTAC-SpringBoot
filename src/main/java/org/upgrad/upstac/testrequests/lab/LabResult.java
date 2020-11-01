package org.upgrad.upstac.testrequests.lab;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.ToString;
import org.upgrad.upstac.testrequests.TestRequest;
import org.upgrad.upstac.users.User;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
public class LabResult {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long resultId;

    @OneToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    @ToString.Exclude
    private TestRequest request;

    public void setResultId(Long resultId) {
        this.resultId = resultId;
    }

    public void setRequest(TestRequest request) {
        this.request = request;
    }

    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public void setHeartBeat(String heartBeat) {
        this.heartBeat = heartBeat;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public void setOxygenLevel(String oxygenLevel) {
        this.oxygenLevel = oxygenLevel;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public void setResult(TestStatus result) {
        this.result = result;
    }

    public void setUpdatedOn(LocalDate updatedOn) {
        this.updatedOn = updatedOn;
    }

    public void setTester(User tester) {
        this.tester = tester;
    }

    private String bloodPressure;
    private String heartBeat;
    private String temperature;
    private String oxygenLevel;
    private String comments;
    private TestStatus result;
    private LocalDate updatedOn;

    @ManyToOne
    private User tester;


    public Long getResultId() {
        return resultId;
    }

    public TestRequest getRequest() {
        return request;
    }

    public String getBloodPressure() {
        return bloodPressure;
    }

    public String getHeartBeat() {
        return heartBeat;
    }

    public String getTemperature() {
        return temperature;
    }

    public String getOxygenLevel() {
        return oxygenLevel;
    }

    public String getComments() {
        return comments;
    }

    public TestStatus getResult() {
        return result;
    }

    public LocalDate getUpdatedOn() {
        return updatedOn;
    }

    public User getTester() {
        return tester;
    }
}
