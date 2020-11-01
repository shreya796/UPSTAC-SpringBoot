package org.upgrad.upstac.testrequests.lab;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class CreateLabResult {
    public String getBloodPressure() {
        return bloodPressure;
    }

    public String getHeartBeat() {
        return heartBeat;
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

    @NotNull
    private String bloodPressure;

    @NotNull
    private String heartBeat;
    @NotNull
    private String temperature;
    private String oxygenLevel;
    private String comments;
    @NotNull
    private TestStatus result;
}
